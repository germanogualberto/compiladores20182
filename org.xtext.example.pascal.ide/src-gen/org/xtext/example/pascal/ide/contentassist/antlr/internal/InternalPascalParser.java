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
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalPascalParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_SIGNED_INTEGER_NUMBER", "RULE_INTEGER_NUMBER", "RULE_RELATIONAL_OP", "RULE_ADDITION_OP", "RULE_MULTIPLICATION_OP", "RULE_STRING", "RULE_NUMERIC_SUBRANGE", "RULE_SIGNED_REAL_NUMBER", "RULE_REAL_NUMBER", "RULE_DIGIT_SEQUENCE", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'program'", "';'", "'begin'", "'end'", "':'", "':='", "'['", "']'", "'^'", "','", "'('", "')'", "'not'", "'function'", "'var'", "'procedure'", "'label'", "'const'", "'='", "'type'", "'..'", "'case'", "'of'", "'while'", "'do'", "'in'", "'or'", "'div'", "'mod'", "'and'", "'nil'", "'true'", "'false'", "'packed'", "'record'"
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
    // InternalPascal.g:54:1: entryRulepascal : rulepascal EOF ;
    public final void entryRulepascal() throws RecognitionException {
        try {
            // InternalPascal.g:55:1: ( rulepascal EOF )
            // InternalPascal.g:56:1: rulepascal EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPascalRule()); 
            }
            pushFollow(FOLLOW_1);
            rulepascal();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPascalRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalPascal.g:63:1: rulepascal : ( ( rule__Pascal__ProgramAssignment ) ) ;
    public final void rulepascal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:67:2: ( ( ( rule__Pascal__ProgramAssignment ) ) )
            // InternalPascal.g:68:2: ( ( rule__Pascal__ProgramAssignment ) )
            {
            // InternalPascal.g:68:2: ( ( rule__Pascal__ProgramAssignment ) )
            // InternalPascal.g:69:3: ( rule__Pascal__ProgramAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPascalAccess().getProgramAssignment()); 
            }
            // InternalPascal.g:70:3: ( rule__Pascal__ProgramAssignment )
            // InternalPascal.g:70:4: rule__Pascal__ProgramAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Pascal__ProgramAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPascalAccess().getProgramAssignment()); 
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
    // $ANTLR end "rulepascal"


    // $ANTLR start "entryRuleprogram"
    // InternalPascal.g:79:1: entryRuleprogram : ruleprogram EOF ;
    public final void entryRuleprogram() throws RecognitionException {
        try {
            // InternalPascal.g:80:1: ( ruleprogram EOF )
            // InternalPascal.g:81:1: ruleprogram EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleprogram();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalPascal.g:88:1: ruleprogram : ( ( rule__Program__Group__0 ) ) ;
    public final void ruleprogram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:92:2: ( ( ( rule__Program__Group__0 ) ) )
            // InternalPascal.g:93:2: ( ( rule__Program__Group__0 ) )
            {
            // InternalPascal.g:93:2: ( ( rule__Program__Group__0 ) )
            // InternalPascal.g:94:3: ( rule__Program__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getGroup()); 
            }
            // InternalPascal.g:95:3: ( rule__Program__Group__0 )
            // InternalPascal.g:95:4: rule__Program__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getGroup()); 
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
    // $ANTLR end "ruleprogram"


    // $ANTLR start "entryRuleprogram_heading_block"
    // InternalPascal.g:104:1: entryRuleprogram_heading_block : ruleprogram_heading_block EOF ;
    public final void entryRuleprogram_heading_block() throws RecognitionException {
        try {
            // InternalPascal.g:105:1: ( ruleprogram_heading_block EOF )
            // InternalPascal.g:106:1: ruleprogram_heading_block EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgram_heading_blockRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleprogram_heading_block();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgram_heading_blockRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalPascal.g:113:1: ruleprogram_heading_block : ( ( rule__Program_heading_block__Group__0 ) ) ;
    public final void ruleprogram_heading_block() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:117:2: ( ( ( rule__Program_heading_block__Group__0 ) ) )
            // InternalPascal.g:118:2: ( ( rule__Program_heading_block__Group__0 ) )
            {
            // InternalPascal.g:118:2: ( ( rule__Program_heading_block__Group__0 ) )
            // InternalPascal.g:119:3: ( rule__Program_heading_block__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgram_heading_blockAccess().getGroup()); 
            }
            // InternalPascal.g:120:3: ( rule__Program_heading_block__Group__0 )
            // InternalPascal.g:120:4: rule__Program_heading_block__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Program_heading_block__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgram_heading_blockAccess().getGroup()); 
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
    // $ANTLR end "ruleprogram_heading_block"


    // $ANTLR start "entryRuleblock"
    // InternalPascal.g:129:1: entryRuleblock : ruleblock EOF ;
    public final void entryRuleblock() throws RecognitionException {
        try {
            // InternalPascal.g:130:1: ( ruleblock EOF )
            // InternalPascal.g:131:1: ruleblock EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleblock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalPascal.g:138:1: ruleblock : ( ( rule__Block__Group__0 ) ) ;
    public final void ruleblock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:142:2: ( ( ( rule__Block__Group__0 ) ) )
            // InternalPascal.g:143:2: ( ( rule__Block__Group__0 ) )
            {
            // InternalPascal.g:143:2: ( ( rule__Block__Group__0 ) )
            // InternalPascal.g:144:3: ( rule__Block__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getGroup()); 
            }
            // InternalPascal.g:145:3: ( rule__Block__Group__0 )
            // InternalPascal.g:145:4: rule__Block__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Block__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getGroup()); 
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
    // $ANTLR end "ruleblock"


    // $ANTLR start "entryRulestatement_part"
    // InternalPascal.g:154:1: entryRulestatement_part : rulestatement_part EOF ;
    public final void entryRulestatement_part() throws RecognitionException {
        try {
            // InternalPascal.g:155:1: ( rulestatement_part EOF )
            // InternalPascal.g:156:1: rulestatement_part EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatement_partRule()); 
            }
            pushFollow(FOLLOW_1);
            rulestatement_part();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatement_partRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalPascal.g:163:1: rulestatement_part : ( ( rule__Statement_part__Group__0 ) ) ;
    public final void rulestatement_part() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:167:2: ( ( ( rule__Statement_part__Group__0 ) ) )
            // InternalPascal.g:168:2: ( ( rule__Statement_part__Group__0 ) )
            {
            // InternalPascal.g:168:2: ( ( rule__Statement_part__Group__0 ) )
            // InternalPascal.g:169:3: ( rule__Statement_part__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatement_partAccess().getGroup()); 
            }
            // InternalPascal.g:170:3: ( rule__Statement_part__Group__0 )
            // InternalPascal.g:170:4: rule__Statement_part__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Statement_part__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatement_partAccess().getGroup()); 
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
    // $ANTLR end "rulestatement_part"


    // $ANTLR start "entryRulestatement_sequence"
    // InternalPascal.g:179:1: entryRulestatement_sequence : rulestatement_sequence EOF ;
    public final void entryRulestatement_sequence() throws RecognitionException {
        try {
            // InternalPascal.g:180:1: ( rulestatement_sequence EOF )
            // InternalPascal.g:181:1: rulestatement_sequence EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatement_sequenceRule()); 
            }
            pushFollow(FOLLOW_1);
            rulestatement_sequence();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatement_sequenceRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalPascal.g:188:1: rulestatement_sequence : ( ( rule__Statement_sequence__Group__0 ) ) ;
    public final void rulestatement_sequence() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:192:2: ( ( ( rule__Statement_sequence__Group__0 ) ) )
            // InternalPascal.g:193:2: ( ( rule__Statement_sequence__Group__0 ) )
            {
            // InternalPascal.g:193:2: ( ( rule__Statement_sequence__Group__0 ) )
            // InternalPascal.g:194:3: ( rule__Statement_sequence__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatement_sequenceAccess().getGroup()); 
            }
            // InternalPascal.g:195:3: ( rule__Statement_sequence__Group__0 )
            // InternalPascal.g:195:4: rule__Statement_sequence__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Statement_sequence__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatement_sequenceAccess().getGroup()); 
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
    // $ANTLR end "rulestatement_sequence"


    // $ANTLR start "entryRulestatement"
    // InternalPascal.g:204:1: entryRulestatement : rulestatement EOF ;
    public final void entryRulestatement() throws RecognitionException {
        try {
            // InternalPascal.g:205:1: ( rulestatement EOF )
            // InternalPascal.g:206:1: rulestatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            rulestatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalPascal.g:213:1: rulestatement : ( ( rule__Statement__Group__0 ) ) ;
    public final void rulestatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:217:2: ( ( ( rule__Statement__Group__0 ) ) )
            // InternalPascal.g:218:2: ( ( rule__Statement__Group__0 ) )
            {
            // InternalPascal.g:218:2: ( ( rule__Statement__Group__0 ) )
            // InternalPascal.g:219:3: ( rule__Statement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getGroup()); 
            }
            // InternalPascal.g:220:3: ( rule__Statement__Group__0 )
            // InternalPascal.g:220:4: rule__Statement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getGroup()); 
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
    // $ANTLR end "rulestatement"


    // $ANTLR start "entryRulesimple_statement"
    // InternalPascal.g:229:1: entryRulesimple_statement : rulesimple_statement EOF ;
    public final void entryRulesimple_statement() throws RecognitionException {
        try {
            // InternalPascal.g:230:1: ( rulesimple_statement EOF )
            // InternalPascal.g:231:1: rulesimple_statement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimple_statementRule()); 
            }
            pushFollow(FOLLOW_1);
            rulesimple_statement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimple_statementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalPascal.g:238:1: rulesimple_statement : ( ( rule__Simple_statement__Alternatives )? ) ;
    public final void rulesimple_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:242:2: ( ( ( rule__Simple_statement__Alternatives )? ) )
            // InternalPascal.g:243:2: ( ( rule__Simple_statement__Alternatives )? )
            {
            // InternalPascal.g:243:2: ( ( rule__Simple_statement__Alternatives )? )
            // InternalPascal.g:244:3: ( rule__Simple_statement__Alternatives )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimple_statementAccess().getAlternatives()); 
            }
            // InternalPascal.g:245:3: ( rule__Simple_statement__Alternatives )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalPascal.g:245:4: rule__Simple_statement__Alternatives
                    {
                    pushFollow(FOLLOW_2);
                    rule__Simple_statement__Alternatives();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimple_statementAccess().getAlternatives()); 
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
    // $ANTLR end "rulesimple_statement"


    // $ANTLR start "entryRulestructured_statement"
    // InternalPascal.g:254:1: entryRulestructured_statement : rulestructured_statement EOF ;
    public final void entryRulestructured_statement() throws RecognitionException {
        try {
            // InternalPascal.g:255:1: ( rulestructured_statement EOF )
            // InternalPascal.g:256:1: rulestructured_statement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStructured_statementRule()); 
            }
            pushFollow(FOLLOW_1);
            rulestructured_statement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStructured_statementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRulestructured_statement"


    // $ANTLR start "rulestructured_statement"
    // InternalPascal.g:263:1: rulestructured_statement : ( ( rule__Structured_statement__Alternatives ) ) ;
    public final void rulestructured_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:267:2: ( ( ( rule__Structured_statement__Alternatives ) ) )
            // InternalPascal.g:268:2: ( ( rule__Structured_statement__Alternatives ) )
            {
            // InternalPascal.g:268:2: ( ( rule__Structured_statement__Alternatives ) )
            // InternalPascal.g:269:3: ( rule__Structured_statement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStructured_statementAccess().getAlternatives()); 
            }
            // InternalPascal.g:270:3: ( rule__Structured_statement__Alternatives )
            // InternalPascal.g:270:4: rule__Structured_statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Structured_statement__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStructured_statementAccess().getAlternatives()); 
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
    // $ANTLR end "rulestructured_statement"


    // $ANTLR start "entryRulecompound_statement"
    // InternalPascal.g:279:1: entryRulecompound_statement : rulecompound_statement EOF ;
    public final void entryRulecompound_statement() throws RecognitionException {
        try {
            // InternalPascal.g:280:1: ( rulecompound_statement EOF )
            // InternalPascal.g:281:1: rulecompound_statement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompound_statementRule()); 
            }
            pushFollow(FOLLOW_1);
            rulecompound_statement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompound_statementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRulecompound_statement"


    // $ANTLR start "rulecompound_statement"
    // InternalPascal.g:288:1: rulecompound_statement : ( ( rule__Compound_statement__Group__0 ) ) ;
    public final void rulecompound_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:292:2: ( ( ( rule__Compound_statement__Group__0 ) ) )
            // InternalPascal.g:293:2: ( ( rule__Compound_statement__Group__0 ) )
            {
            // InternalPascal.g:293:2: ( ( rule__Compound_statement__Group__0 ) )
            // InternalPascal.g:294:3: ( rule__Compound_statement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompound_statementAccess().getGroup()); 
            }
            // InternalPascal.g:295:3: ( rule__Compound_statement__Group__0 )
            // InternalPascal.g:295:4: rule__Compound_statement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Compound_statement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompound_statementAccess().getGroup()); 
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
    // $ANTLR end "rulecompound_statement"


    // $ANTLR start "entryRuleassignment_statement"
    // InternalPascal.g:304:1: entryRuleassignment_statement : ruleassignment_statement EOF ;
    public final void entryRuleassignment_statement() throws RecognitionException {
        try {
            // InternalPascal.g:305:1: ( ruleassignment_statement EOF )
            // InternalPascal.g:306:1: ruleassignment_statement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignment_statementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleassignment_statement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignment_statementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalPascal.g:313:1: ruleassignment_statement : ( ( rule__Assignment_statement__Group__0 ) ) ;
    public final void ruleassignment_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:317:2: ( ( ( rule__Assignment_statement__Group__0 ) ) )
            // InternalPascal.g:318:2: ( ( rule__Assignment_statement__Group__0 ) )
            {
            // InternalPascal.g:318:2: ( ( rule__Assignment_statement__Group__0 ) )
            // InternalPascal.g:319:3: ( rule__Assignment_statement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignment_statementAccess().getGroup()); 
            }
            // InternalPascal.g:320:3: ( rule__Assignment_statement__Group__0 )
            // InternalPascal.g:320:4: rule__Assignment_statement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Assignment_statement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignment_statementAccess().getGroup()); 
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
    // $ANTLR end "ruleassignment_statement"


    // $ANTLR start "entryRulelabel"
    // InternalPascal.g:329:1: entryRulelabel : rulelabel EOF ;
    public final void entryRulelabel() throws RecognitionException {
        try {
            // InternalPascal.g:330:1: ( rulelabel EOF )
            // InternalPascal.g:331:1: rulelabel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabelRule()); 
            }
            pushFollow(FOLLOW_1);
            rulelabel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLabelRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalPascal.g:338:1: rulelabel : ( ( rule__Label__Alternatives ) ) ;
    public final void rulelabel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:342:2: ( ( ( rule__Label__Alternatives ) ) )
            // InternalPascal.g:343:2: ( ( rule__Label__Alternatives ) )
            {
            // InternalPascal.g:343:2: ( ( rule__Label__Alternatives ) )
            // InternalPascal.g:344:3: ( rule__Label__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabelAccess().getAlternatives()); 
            }
            // InternalPascal.g:345:3: ( rule__Label__Alternatives )
            // InternalPascal.g:345:4: rule__Label__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Label__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLabelAccess().getAlternatives()); 
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
    // $ANTLR end "rulelabel"


    // $ANTLR start "entryRulevariable"
    // InternalPascal.g:354:1: entryRulevariable : rulevariable EOF ;
    public final void entryRulevariable() throws RecognitionException {
        try {
            // InternalPascal.g:355:1: ( rulevariable EOF )
            // InternalPascal.g:356:1: rulevariable EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableRule()); 
            }
            pushFollow(FOLLOW_1);
            rulevariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalPascal.g:363:1: rulevariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void rulevariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:367:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalPascal.g:368:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalPascal.g:368:2: ( ( rule__Variable__Group__0 ) )
            // InternalPascal.g:369:3: ( rule__Variable__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getGroup()); 
            }
            // InternalPascal.g:370:3: ( rule__Variable__Group__0 )
            // InternalPascal.g:370:4: rule__Variable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getGroup()); 
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
    // $ANTLR end "rulevariable"


    // $ANTLR start "entryRulevar_"
    // InternalPascal.g:379:1: entryRulevar_ : rulevar_ EOF ;
    public final void entryRulevar_() throws RecognitionException {
        try {
            // InternalPascal.g:380:1: ( rulevar_ EOF )
            // InternalPascal.g:381:1: rulevar_ EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_Rule()); 
            }
            pushFollow(FOLLOW_1);
            rulevar_();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_Rule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalPascal.g:388:1: rulevar_ : ( ( rule__Var___Alternatives )? ) ;
    public final void rulevar_() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:392:2: ( ( ( rule__Var___Alternatives )? ) )
            // InternalPascal.g:393:2: ( ( rule__Var___Alternatives )? )
            {
            // InternalPascal.g:393:2: ( ( rule__Var___Alternatives )? )
            // InternalPascal.g:394:3: ( rule__Var___Alternatives )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_Access().getAlternatives()); 
            }
            // InternalPascal.g:395:3: ( rule__Var___Alternatives )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==20||LA2_0==27||LA2_0==29) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalPascal.g:395:4: rule__Var___Alternatives
                    {
                    pushFollow(FOLLOW_2);
                    rule__Var___Alternatives();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_Access().getAlternatives()); 
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
    // $ANTLR end "rulevar_"


    // $ANTLR start "entryRuleexpression_list"
    // InternalPascal.g:404:1: entryRuleexpression_list : ruleexpression_list EOF ;
    public final void entryRuleexpression_list() throws RecognitionException {
        try {
            // InternalPascal.g:405:1: ( ruleexpression_list EOF )
            // InternalPascal.g:406:1: ruleexpression_list EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression_listRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleexpression_list();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression_listRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalPascal.g:413:1: ruleexpression_list : ( ( rule__Expression_list__Group__0 ) ) ;
    public final void ruleexpression_list() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:417:2: ( ( ( rule__Expression_list__Group__0 ) ) )
            // InternalPascal.g:418:2: ( ( rule__Expression_list__Group__0 ) )
            {
            // InternalPascal.g:418:2: ( ( rule__Expression_list__Group__0 ) )
            // InternalPascal.g:419:3: ( rule__Expression_list__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression_listAccess().getGroup()); 
            }
            // InternalPascal.g:420:3: ( rule__Expression_list__Group__0 )
            // InternalPascal.g:420:4: rule__Expression_list__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression_list__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression_listAccess().getGroup()); 
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
    // $ANTLR end "ruleexpression_list"


    // $ANTLR start "entryRuleexpression"
    // InternalPascal.g:429:1: entryRuleexpression : ruleexpression EOF ;
    public final void entryRuleexpression() throws RecognitionException {
        try {
            // InternalPascal.g:430:1: ( ruleexpression EOF )
            // InternalPascal.g:431:1: ruleexpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleexpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalPascal.g:438:1: ruleexpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleexpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:442:2: ( ( ( rule__Expression__Group__0 ) ) )
            // InternalPascal.g:443:2: ( ( rule__Expression__Group__0 ) )
            {
            // InternalPascal.g:443:2: ( ( rule__Expression__Group__0 ) )
            // InternalPascal.g:444:3: ( rule__Expression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getGroup()); 
            }
            // InternalPascal.g:445:3: ( rule__Expression__Group__0 )
            // InternalPascal.g:445:4: rule__Expression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleexpression"


    // $ANTLR start "entryRulesimple_expression"
    // InternalPascal.g:454:1: entryRulesimple_expression : rulesimple_expression EOF ;
    public final void entryRulesimple_expression() throws RecognitionException {
        try {
            // InternalPascal.g:455:1: ( rulesimple_expression EOF )
            // InternalPascal.g:456:1: rulesimple_expression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimple_expressionRule()); 
            }
            pushFollow(FOLLOW_1);
            rulesimple_expression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimple_expressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalPascal.g:463:1: rulesimple_expression : ( ( rule__Simple_expression__Group__0 ) ) ;
    public final void rulesimple_expression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:467:2: ( ( ( rule__Simple_expression__Group__0 ) ) )
            // InternalPascal.g:468:2: ( ( rule__Simple_expression__Group__0 ) )
            {
            // InternalPascal.g:468:2: ( ( rule__Simple_expression__Group__0 ) )
            // InternalPascal.g:469:3: ( rule__Simple_expression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimple_expressionAccess().getGroup()); 
            }
            // InternalPascal.g:470:3: ( rule__Simple_expression__Group__0 )
            // InternalPascal.g:470:4: rule__Simple_expression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Simple_expression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimple_expressionAccess().getGroup()); 
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
    // $ANTLR end "rulesimple_expression"


    // $ANTLR start "entryRuleterm"
    // InternalPascal.g:479:1: entryRuleterm : ruleterm EOF ;
    public final void entryRuleterm() throws RecognitionException {
        try {
            // InternalPascal.g:480:1: ( ruleterm EOF )
            // InternalPascal.g:481:1: ruleterm EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleterm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalPascal.g:488:1: ruleterm : ( ( rule__Term__Group__0 ) ) ;
    public final void ruleterm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:492:2: ( ( ( rule__Term__Group__0 ) ) )
            // InternalPascal.g:493:2: ( ( rule__Term__Group__0 ) )
            {
            // InternalPascal.g:493:2: ( ( rule__Term__Group__0 ) )
            // InternalPascal.g:494:3: ( rule__Term__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getGroup()); 
            }
            // InternalPascal.g:495:3: ( rule__Term__Group__0 )
            // InternalPascal.g:495:4: rule__Term__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Term__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getGroup()); 
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
    // $ANTLR end "ruleterm"


    // $ANTLR start "entryRulefactor"
    // InternalPascal.g:504:1: entryRulefactor : rulefactor EOF ;
    public final void entryRulefactor() throws RecognitionException {
        try {
            // InternalPascal.g:505:1: ( rulefactor EOF )
            // InternalPascal.g:506:1: rulefactor EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorRule()); 
            }
            pushFollow(FOLLOW_1);
            rulefactor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalPascal.g:513:1: rulefactor : ( ( rule__Factor__Alternatives ) ) ;
    public final void rulefactor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:517:2: ( ( ( rule__Factor__Alternatives ) ) )
            // InternalPascal.g:518:2: ( ( rule__Factor__Alternatives ) )
            {
            // InternalPascal.g:518:2: ( ( rule__Factor__Alternatives ) )
            // InternalPascal.g:519:3: ( rule__Factor__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getAlternatives()); 
            }
            // InternalPascal.g:520:3: ( rule__Factor__Alternatives )
            // InternalPascal.g:520:4: rule__Factor__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorAccess().getAlternatives()); 
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
    // $ANTLR end "rulefactor"


    // $ANTLR start "entryRulefunction_designator"
    // InternalPascal.g:529:1: entryRulefunction_designator : rulefunction_designator EOF ;
    public final void entryRulefunction_designator() throws RecognitionException {
        try {
            // InternalPascal.g:530:1: ( rulefunction_designator EOF )
            // InternalPascal.g:531:1: rulefunction_designator EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_designatorRule()); 
            }
            pushFollow(FOLLOW_1);
            rulefunction_designator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunction_designatorRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalPascal.g:538:1: rulefunction_designator : ( ( rule__Function_designator__Group__0 ) ) ;
    public final void rulefunction_designator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:542:2: ( ( ( rule__Function_designator__Group__0 ) ) )
            // InternalPascal.g:543:2: ( ( rule__Function_designator__Group__0 ) )
            {
            // InternalPascal.g:543:2: ( ( rule__Function_designator__Group__0 ) )
            // InternalPascal.g:544:3: ( rule__Function_designator__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_designatorAccess().getGroup()); 
            }
            // InternalPascal.g:545:3: ( rule__Function_designator__Group__0 )
            // InternalPascal.g:545:4: rule__Function_designator__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Function_designator__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunction_designatorAccess().getGroup()); 
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
    // $ANTLR end "rulefunction_designator"


    // $ANTLR start "entryRulefunction_procedure_declaration"
    // InternalPascal.g:554:1: entryRulefunction_procedure_declaration : rulefunction_procedure_declaration EOF ;
    public final void entryRulefunction_procedure_declaration() throws RecognitionException {
        try {
            // InternalPascal.g:555:1: ( rulefunction_procedure_declaration EOF )
            // InternalPascal.g:556:1: rulefunction_procedure_declaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_procedure_declarationRule()); 
            }
            pushFollow(FOLLOW_1);
            rulefunction_procedure_declaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunction_procedure_declarationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalPascal.g:563:1: rulefunction_procedure_declaration : ( ( ( rule__Function_procedure_declaration__Group__0 ) ) ( ( rule__Function_procedure_declaration__Group__0 )* ) ) ;
    public final void rulefunction_procedure_declaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:567:2: ( ( ( ( rule__Function_procedure_declaration__Group__0 ) ) ( ( rule__Function_procedure_declaration__Group__0 )* ) ) )
            // InternalPascal.g:568:2: ( ( ( rule__Function_procedure_declaration__Group__0 ) ) ( ( rule__Function_procedure_declaration__Group__0 )* ) )
            {
            // InternalPascal.g:568:2: ( ( ( rule__Function_procedure_declaration__Group__0 ) ) ( ( rule__Function_procedure_declaration__Group__0 )* ) )
            // InternalPascal.g:569:3: ( ( rule__Function_procedure_declaration__Group__0 ) ) ( ( rule__Function_procedure_declaration__Group__0 )* )
            {
            // InternalPascal.g:569:3: ( ( rule__Function_procedure_declaration__Group__0 ) )
            // InternalPascal.g:570:4: ( rule__Function_procedure_declaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_procedure_declarationAccess().getGroup()); 
            }
            // InternalPascal.g:571:4: ( rule__Function_procedure_declaration__Group__0 )
            // InternalPascal.g:571:5: rule__Function_procedure_declaration__Group__0
            {
            pushFollow(FOLLOW_3);
            rule__Function_procedure_declaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunction_procedure_declarationAccess().getGroup()); 
            }

            }

            // InternalPascal.g:574:3: ( ( rule__Function_procedure_declaration__Group__0 )* )
            // InternalPascal.g:575:4: ( rule__Function_procedure_declaration__Group__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_procedure_declarationAccess().getGroup()); 
            }
            // InternalPascal.g:576:4: ( rule__Function_procedure_declaration__Group__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==34||LA3_0==36) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPascal.g:576:5: rule__Function_procedure_declaration__Group__0
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Function_procedure_declaration__Group__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunction_procedure_declarationAccess().getGroup()); 
            }

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
    // InternalPascal.g:586:1: entryRulefunction_heading : rulefunction_heading EOF ;
    public final void entryRulefunction_heading() throws RecognitionException {
        try {
            // InternalPascal.g:587:1: ( rulefunction_heading EOF )
            // InternalPascal.g:588:1: rulefunction_heading EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_headingRule()); 
            }
            pushFollow(FOLLOW_1);
            rulefunction_heading();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunction_headingRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalPascal.g:595:1: rulefunction_heading : ( ( rule__Function_heading__Group__0 ) ) ;
    public final void rulefunction_heading() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:599:2: ( ( ( rule__Function_heading__Group__0 ) ) )
            // InternalPascal.g:600:2: ( ( rule__Function_heading__Group__0 ) )
            {
            // InternalPascal.g:600:2: ( ( rule__Function_heading__Group__0 ) )
            // InternalPascal.g:601:3: ( rule__Function_heading__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_headingAccess().getGroup()); 
            }
            // InternalPascal.g:602:3: ( rule__Function_heading__Group__0 )
            // InternalPascal.g:602:4: rule__Function_heading__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Function_heading__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunction_headingAccess().getGroup()); 
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
    // $ANTLR end "rulefunction_heading"


    // $ANTLR start "entryRulefunction_declaration"
    // InternalPascal.g:611:1: entryRulefunction_declaration : rulefunction_declaration EOF ;
    public final void entryRulefunction_declaration() throws RecognitionException {
        try {
            // InternalPascal.g:612:1: ( rulefunction_declaration EOF )
            // InternalPascal.g:613:1: rulefunction_declaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_declarationRule()); 
            }
            pushFollow(FOLLOW_1);
            rulefunction_declaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunction_declarationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalPascal.g:620:1: rulefunction_declaration : ( ( rule__Function_declaration__Group__0 ) ) ;
    public final void rulefunction_declaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:624:2: ( ( ( rule__Function_declaration__Group__0 ) ) )
            // InternalPascal.g:625:2: ( ( rule__Function_declaration__Group__0 ) )
            {
            // InternalPascal.g:625:2: ( ( rule__Function_declaration__Group__0 ) )
            // InternalPascal.g:626:3: ( rule__Function_declaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_declarationAccess().getGroup()); 
            }
            // InternalPascal.g:627:3: ( rule__Function_declaration__Group__0 )
            // InternalPascal.g:627:4: rule__Function_declaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Function_declaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunction_declarationAccess().getGroup()); 
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
    // $ANTLR end "rulefunction_declaration"


    // $ANTLR start "entryRuleformal_parameter_list"
    // InternalPascal.g:636:1: entryRuleformal_parameter_list : ruleformal_parameter_list EOF ;
    public final void entryRuleformal_parameter_list() throws RecognitionException {
        try {
            // InternalPascal.g:637:1: ( ruleformal_parameter_list EOF )
            // InternalPascal.g:638:1: ruleformal_parameter_list EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormal_parameter_listRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleformal_parameter_list();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormal_parameter_listRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalPascal.g:645:1: ruleformal_parameter_list : ( ( rule__Formal_parameter_list__Group__0 ) ) ;
    public final void ruleformal_parameter_list() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:649:2: ( ( ( rule__Formal_parameter_list__Group__0 ) ) )
            // InternalPascal.g:650:2: ( ( rule__Formal_parameter_list__Group__0 ) )
            {
            // InternalPascal.g:650:2: ( ( rule__Formal_parameter_list__Group__0 ) )
            // InternalPascal.g:651:3: ( rule__Formal_parameter_list__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormal_parameter_listAccess().getGroup()); 
            }
            // InternalPascal.g:652:3: ( rule__Formal_parameter_list__Group__0 )
            // InternalPascal.g:652:4: rule__Formal_parameter_list__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Formal_parameter_list__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormal_parameter_listAccess().getGroup()); 
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
    // $ANTLR end "ruleformal_parameter_list"


    // $ANTLR start "entryRuleformal_parameter_section"
    // InternalPascal.g:661:1: entryRuleformal_parameter_section : ruleformal_parameter_section EOF ;
    public final void entryRuleformal_parameter_section() throws RecognitionException {
        try {
            // InternalPascal.g:662:1: ( ruleformal_parameter_section EOF )
            // InternalPascal.g:663:1: ruleformal_parameter_section EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormal_parameter_sectionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleformal_parameter_section();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormal_parameter_sectionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalPascal.g:670:1: ruleformal_parameter_section : ( ( rule__Formal_parameter_section__Alternatives ) ) ;
    public final void ruleformal_parameter_section() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:674:2: ( ( ( rule__Formal_parameter_section__Alternatives ) ) )
            // InternalPascal.g:675:2: ( ( rule__Formal_parameter_section__Alternatives ) )
            {
            // InternalPascal.g:675:2: ( ( rule__Formal_parameter_section__Alternatives ) )
            // InternalPascal.g:676:3: ( rule__Formal_parameter_section__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormal_parameter_sectionAccess().getAlternatives()); 
            }
            // InternalPascal.g:677:3: ( rule__Formal_parameter_section__Alternatives )
            // InternalPascal.g:677:4: rule__Formal_parameter_section__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Formal_parameter_section__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormal_parameter_sectionAccess().getAlternatives()); 
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
    // $ANTLR end "ruleformal_parameter_section"


    // $ANTLR start "entryRulevalue_parameter_section"
    // InternalPascal.g:686:1: entryRulevalue_parameter_section : rulevalue_parameter_section EOF ;
    public final void entryRulevalue_parameter_section() throws RecognitionException {
        try {
            // InternalPascal.g:687:1: ( rulevalue_parameter_section EOF )
            // InternalPascal.g:688:1: rulevalue_parameter_section EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValue_parameter_sectionRule()); 
            }
            pushFollow(FOLLOW_1);
            rulevalue_parameter_section();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValue_parameter_sectionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalPascal.g:695:1: rulevalue_parameter_section : ( ( rule__Value_parameter_section__Group__0 ) ) ;
    public final void rulevalue_parameter_section() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:699:2: ( ( ( rule__Value_parameter_section__Group__0 ) ) )
            // InternalPascal.g:700:2: ( ( rule__Value_parameter_section__Group__0 ) )
            {
            // InternalPascal.g:700:2: ( ( rule__Value_parameter_section__Group__0 ) )
            // InternalPascal.g:701:3: ( rule__Value_parameter_section__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValue_parameter_sectionAccess().getGroup()); 
            }
            // InternalPascal.g:702:3: ( rule__Value_parameter_section__Group__0 )
            // InternalPascal.g:702:4: rule__Value_parameter_section__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Value_parameter_section__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValue_parameter_sectionAccess().getGroup()); 
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
    // $ANTLR end "rulevalue_parameter_section"


    // $ANTLR start "entryRuleidentifier_list"
    // InternalPascal.g:711:1: entryRuleidentifier_list : ruleidentifier_list EOF ;
    public final void entryRuleidentifier_list() throws RecognitionException {
        try {
            // InternalPascal.g:712:1: ( ruleidentifier_list EOF )
            // InternalPascal.g:713:1: ruleidentifier_list EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifier_listRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleidentifier_list();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentifier_listRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalPascal.g:720:1: ruleidentifier_list : ( ( rule__Identifier_list__Group__0 ) ) ;
    public final void ruleidentifier_list() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:724:2: ( ( ( rule__Identifier_list__Group__0 ) ) )
            // InternalPascal.g:725:2: ( ( rule__Identifier_list__Group__0 ) )
            {
            // InternalPascal.g:725:2: ( ( rule__Identifier_list__Group__0 ) )
            // InternalPascal.g:726:3: ( rule__Identifier_list__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifier_listAccess().getGroup()); 
            }
            // InternalPascal.g:727:3: ( rule__Identifier_list__Group__0 )
            // InternalPascal.g:727:4: rule__Identifier_list__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Identifier_list__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentifier_listAccess().getGroup()); 
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
    // $ANTLR end "ruleidentifier_list"


    // $ANTLR start "entryRuleparameter_type"
    // InternalPascal.g:736:1: entryRuleparameter_type : ruleparameter_type EOF ;
    public final void entryRuleparameter_type() throws RecognitionException {
        try {
            // InternalPascal.g:737:1: ( ruleparameter_type EOF )
            // InternalPascal.g:738:1: ruleparameter_type EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameter_typeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleparameter_type();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameter_typeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalPascal.g:745:1: ruleparameter_type : ( ( rule__Parameter_type__NameAssignment ) ) ;
    public final void ruleparameter_type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:749:2: ( ( ( rule__Parameter_type__NameAssignment ) ) )
            // InternalPascal.g:750:2: ( ( rule__Parameter_type__NameAssignment ) )
            {
            // InternalPascal.g:750:2: ( ( rule__Parameter_type__NameAssignment ) )
            // InternalPascal.g:751:3: ( rule__Parameter_type__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameter_typeAccess().getNameAssignment()); 
            }
            // InternalPascal.g:752:3: ( rule__Parameter_type__NameAssignment )
            // InternalPascal.g:752:4: rule__Parameter_type__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Parameter_type__NameAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameter_typeAccess().getNameAssignment()); 
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
    // $ANTLR end "ruleparameter_type"


    // $ANTLR start "entryRulevariable_parameter_section"
    // InternalPascal.g:761:1: entryRulevariable_parameter_section : rulevariable_parameter_section EOF ;
    public final void entryRulevariable_parameter_section() throws RecognitionException {
        try {
            // InternalPascal.g:762:1: ( rulevariable_parameter_section EOF )
            // InternalPascal.g:763:1: rulevariable_parameter_section EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_parameter_sectionRule()); 
            }
            pushFollow(FOLLOW_1);
            rulevariable_parameter_section();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_parameter_sectionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalPascal.g:770:1: rulevariable_parameter_section : ( ( rule__Variable_parameter_section__Group__0 ) ) ;
    public final void rulevariable_parameter_section() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:774:2: ( ( ( rule__Variable_parameter_section__Group__0 ) ) )
            // InternalPascal.g:775:2: ( ( rule__Variable_parameter_section__Group__0 ) )
            {
            // InternalPascal.g:775:2: ( ( rule__Variable_parameter_section__Group__0 ) )
            // InternalPascal.g:776:3: ( rule__Variable_parameter_section__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_parameter_sectionAccess().getGroup()); 
            }
            // InternalPascal.g:777:3: ( rule__Variable_parameter_section__Group__0 )
            // InternalPascal.g:777:4: rule__Variable_parameter_section__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variable_parameter_section__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_parameter_sectionAccess().getGroup()); 
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
    // $ANTLR end "rulevariable_parameter_section"


    // $ANTLR start "entryRuleprocedure_declaration"
    // InternalPascal.g:786:1: entryRuleprocedure_declaration : ruleprocedure_declaration EOF ;
    public final void entryRuleprocedure_declaration() throws RecognitionException {
        try {
            // InternalPascal.g:787:1: ( ruleprocedure_declaration EOF )
            // InternalPascal.g:788:1: ruleprocedure_declaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcedure_declarationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleprocedure_declaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcedure_declarationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalPascal.g:795:1: ruleprocedure_declaration : ( ( rule__Procedure_declaration__Group__0 ) ) ;
    public final void ruleprocedure_declaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:799:2: ( ( ( rule__Procedure_declaration__Group__0 ) ) )
            // InternalPascal.g:800:2: ( ( rule__Procedure_declaration__Group__0 ) )
            {
            // InternalPascal.g:800:2: ( ( rule__Procedure_declaration__Group__0 ) )
            // InternalPascal.g:801:3: ( rule__Procedure_declaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcedure_declarationAccess().getGroup()); 
            }
            // InternalPascal.g:802:3: ( rule__Procedure_declaration__Group__0 )
            // InternalPascal.g:802:4: rule__Procedure_declaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Procedure_declaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcedure_declarationAccess().getGroup()); 
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
    // $ANTLR end "ruleprocedure_declaration"


    // $ANTLR start "entryRuleprocedure_heading"
    // InternalPascal.g:811:1: entryRuleprocedure_heading : ruleprocedure_heading EOF ;
    public final void entryRuleprocedure_heading() throws RecognitionException {
        try {
            // InternalPascal.g:812:1: ( ruleprocedure_heading EOF )
            // InternalPascal.g:813:1: ruleprocedure_heading EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcedure_headingRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleprocedure_heading();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcedure_headingRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalPascal.g:820:1: ruleprocedure_heading : ( ( rule__Procedure_heading__Group__0 ) ) ;
    public final void ruleprocedure_heading() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:824:2: ( ( ( rule__Procedure_heading__Group__0 ) ) )
            // InternalPascal.g:825:2: ( ( rule__Procedure_heading__Group__0 ) )
            {
            // InternalPascal.g:825:2: ( ( rule__Procedure_heading__Group__0 ) )
            // InternalPascal.g:826:3: ( rule__Procedure_heading__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcedure_headingAccess().getGroup()); 
            }
            // InternalPascal.g:827:3: ( rule__Procedure_heading__Group__0 )
            // InternalPascal.g:827:4: rule__Procedure_heading__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Procedure_heading__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcedure_headingAccess().getGroup()); 
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
    // $ANTLR end "ruleprocedure_heading"


    // $ANTLR start "entryRuleset"
    // InternalPascal.g:836:1: entryRuleset : ruleset EOF ;
    public final void entryRuleset() throws RecognitionException {
        try {
            // InternalPascal.g:837:1: ( ruleset EOF )
            // InternalPascal.g:838:1: ruleset EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleset();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalPascal.g:845:1: ruleset : ( ( rule__Set__Group__0 ) ) ;
    public final void ruleset() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:849:2: ( ( ( rule__Set__Group__0 ) ) )
            // InternalPascal.g:850:2: ( ( rule__Set__Group__0 ) )
            {
            // InternalPascal.g:850:2: ( ( rule__Set__Group__0 ) )
            // InternalPascal.g:851:3: ( rule__Set__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetAccess().getGroup()); 
            }
            // InternalPascal.g:852:3: ( rule__Set__Group__0 )
            // InternalPascal.g:852:4: rule__Set__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Set__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetAccess().getGroup()); 
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
    // $ANTLR end "ruleset"


    // $ANTLR start "entryRulenumber"
    // InternalPascal.g:861:1: entryRulenumber : rulenumber EOF ;
    public final void entryRulenumber() throws RecognitionException {
        try {
            // InternalPascal.g:862:1: ( rulenumber EOF )
            // InternalPascal.g:863:1: rulenumber EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_1);
            rulenumber();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalPascal.g:870:1: rulenumber : ( ( rule__Number__NumberAssignment ) ) ;
    public final void rulenumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:874:2: ( ( ( rule__Number__NumberAssignment ) ) )
            // InternalPascal.g:875:2: ( ( rule__Number__NumberAssignment ) )
            {
            // InternalPascal.g:875:2: ( ( rule__Number__NumberAssignment ) )
            // InternalPascal.g:876:3: ( rule__Number__NumberAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberAccess().getNumberAssignment()); 
            }
            // InternalPascal.g:877:3: ( rule__Number__NumberAssignment )
            // InternalPascal.g:877:4: rule__Number__NumberAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Number__NumberAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberAccess().getNumberAssignment()); 
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
    // $ANTLR end "rulenumber"


    // $ANTLR start "entryRuleany_number"
    // InternalPascal.g:886:1: entryRuleany_number : ruleany_number EOF ;
    public final void entryRuleany_number() throws RecognitionException {
        try {
            // InternalPascal.g:887:1: ( ruleany_number EOF )
            // InternalPascal.g:888:1: ruleany_number EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAny_numberRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleany_number();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAny_numberRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalPascal.g:895:1: ruleany_number : ( ( rule__Any_number__Alternatives ) ) ;
    public final void ruleany_number() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:899:2: ( ( ( rule__Any_number__Alternatives ) ) )
            // InternalPascal.g:900:2: ( ( rule__Any_number__Alternatives ) )
            {
            // InternalPascal.g:900:2: ( ( rule__Any_number__Alternatives ) )
            // InternalPascal.g:901:3: ( rule__Any_number__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAny_numberAccess().getAlternatives()); 
            }
            // InternalPascal.g:902:3: ( rule__Any_number__Alternatives )
            // InternalPascal.g:902:4: rule__Any_number__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Any_number__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAny_numberAccess().getAlternatives()); 
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
    // $ANTLR end "ruleany_number"


    // $ANTLR start "entryRulelabel_declaration"
    // InternalPascal.g:911:1: entryRulelabel_declaration : rulelabel_declaration EOF ;
    public final void entryRulelabel_declaration() throws RecognitionException {
        try {
            // InternalPascal.g:912:1: ( rulelabel_declaration EOF )
            // InternalPascal.g:913:1: rulelabel_declaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabel_declarationRule()); 
            }
            pushFollow(FOLLOW_1);
            rulelabel_declaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLabel_declarationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalPascal.g:920:1: rulelabel_declaration : ( ( rule__Label_declaration__Group__0 ) ) ;
    public final void rulelabel_declaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:924:2: ( ( ( rule__Label_declaration__Group__0 ) ) )
            // InternalPascal.g:925:2: ( ( rule__Label_declaration__Group__0 ) )
            {
            // InternalPascal.g:925:2: ( ( rule__Label_declaration__Group__0 ) )
            // InternalPascal.g:926:3: ( rule__Label_declaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabel_declarationAccess().getGroup()); 
            }
            // InternalPascal.g:927:3: ( rule__Label_declaration__Group__0 )
            // InternalPascal.g:927:4: rule__Label_declaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Label_declaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLabel_declarationAccess().getGroup()); 
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
    // $ANTLR end "rulelabel_declaration"


    // $ANTLR start "entryRuleconstant"
    // InternalPascal.g:936:1: entryRuleconstant : ruleconstant EOF ;
    public final void entryRuleconstant() throws RecognitionException {
        try {
            // InternalPascal.g:937:1: ( ruleconstant EOF )
            // InternalPascal.g:938:1: ruleconstant EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleconstant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalPascal.g:945:1: ruleconstant : ( ( rule__Constant__Alternatives ) ) ;
    public final void ruleconstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:949:2: ( ( ( rule__Constant__Alternatives ) ) )
            // InternalPascal.g:950:2: ( ( rule__Constant__Alternatives ) )
            {
            // InternalPascal.g:950:2: ( ( rule__Constant__Alternatives ) )
            // InternalPascal.g:951:3: ( rule__Constant__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getAlternatives()); 
            }
            // InternalPascal.g:952:3: ( rule__Constant__Alternatives )
            // InternalPascal.g:952:4: rule__Constant__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Constant__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getAlternatives()); 
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
    // $ANTLR end "ruleconstant"


    // $ANTLR start "entryRuleconstant_definition_part"
    // InternalPascal.g:961:1: entryRuleconstant_definition_part : ruleconstant_definition_part EOF ;
    public final void entryRuleconstant_definition_part() throws RecognitionException {
        try {
            // InternalPascal.g:962:1: ( ruleconstant_definition_part EOF )
            // InternalPascal.g:963:1: ruleconstant_definition_part EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstant_definition_partRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleconstant_definition_part();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstant_definition_partRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalPascal.g:970:1: ruleconstant_definition_part : ( ( rule__Constant_definition_part__Group__0 ) ) ;
    public final void ruleconstant_definition_part() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:974:2: ( ( ( rule__Constant_definition_part__Group__0 ) ) )
            // InternalPascal.g:975:2: ( ( rule__Constant_definition_part__Group__0 ) )
            {
            // InternalPascal.g:975:2: ( ( rule__Constant_definition_part__Group__0 ) )
            // InternalPascal.g:976:3: ( rule__Constant_definition_part__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstant_definition_partAccess().getGroup()); 
            }
            // InternalPascal.g:977:3: ( rule__Constant_definition_part__Group__0 )
            // InternalPascal.g:977:4: rule__Constant_definition_part__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Constant_definition_part__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstant_definition_partAccess().getGroup()); 
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
    // $ANTLR end "ruleconstant_definition_part"


    // $ANTLR start "entryRuleconstant_definition"
    // InternalPascal.g:986:1: entryRuleconstant_definition : ruleconstant_definition EOF ;
    public final void entryRuleconstant_definition() throws RecognitionException {
        try {
            // InternalPascal.g:987:1: ( ruleconstant_definition EOF )
            // InternalPascal.g:988:1: ruleconstant_definition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstant_definitionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleconstant_definition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstant_definitionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalPascal.g:995:1: ruleconstant_definition : ( ( rule__Constant_definition__Group__0 ) ) ;
    public final void ruleconstant_definition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:999:2: ( ( ( rule__Constant_definition__Group__0 ) ) )
            // InternalPascal.g:1000:2: ( ( rule__Constant_definition__Group__0 ) )
            {
            // InternalPascal.g:1000:2: ( ( rule__Constant_definition__Group__0 ) )
            // InternalPascal.g:1001:3: ( rule__Constant_definition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstant_definitionAccess().getGroup()); 
            }
            // InternalPascal.g:1002:3: ( rule__Constant_definition__Group__0 )
            // InternalPascal.g:1002:4: rule__Constant_definition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Constant_definition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstant_definitionAccess().getGroup()); 
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
    // $ANTLR end "ruleconstant_definition"


    // $ANTLR start "entryRuletype_definition_part"
    // InternalPascal.g:1011:1: entryRuletype_definition_part : ruletype_definition_part EOF ;
    public final void entryRuletype_definition_part() throws RecognitionException {
        try {
            // InternalPascal.g:1012:1: ( ruletype_definition_part EOF )
            // InternalPascal.g:1013:1: ruletype_definition_part EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_definition_partRule()); 
            }
            pushFollow(FOLLOW_1);
            ruletype_definition_part();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getType_definition_partRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalPascal.g:1020:1: ruletype_definition_part : ( ( rule__Type_definition_part__Group__0 ) ) ;
    public final void ruletype_definition_part() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1024:2: ( ( ( rule__Type_definition_part__Group__0 ) ) )
            // InternalPascal.g:1025:2: ( ( rule__Type_definition_part__Group__0 ) )
            {
            // InternalPascal.g:1025:2: ( ( rule__Type_definition_part__Group__0 ) )
            // InternalPascal.g:1026:3: ( rule__Type_definition_part__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_definition_partAccess().getGroup()); 
            }
            // InternalPascal.g:1027:3: ( rule__Type_definition_part__Group__0 )
            // InternalPascal.g:1027:4: rule__Type_definition_part__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Type_definition_part__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getType_definition_partAccess().getGroup()); 
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
    // $ANTLR end "ruletype_definition_part"


    // $ANTLR start "entryRuletype_definition"
    // InternalPascal.g:1036:1: entryRuletype_definition : ruletype_definition EOF ;
    public final void entryRuletype_definition() throws RecognitionException {
        try {
            // InternalPascal.g:1037:1: ( ruletype_definition EOF )
            // InternalPascal.g:1038:1: ruletype_definition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_definitionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruletype_definition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getType_definitionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalPascal.g:1045:1: ruletype_definition : ( ( rule__Type_definition__Group__0 ) ) ;
    public final void ruletype_definition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1049:2: ( ( ( rule__Type_definition__Group__0 ) ) )
            // InternalPascal.g:1050:2: ( ( rule__Type_definition__Group__0 ) )
            {
            // InternalPascal.g:1050:2: ( ( rule__Type_definition__Group__0 ) )
            // InternalPascal.g:1051:3: ( rule__Type_definition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_definitionAccess().getGroup()); 
            }
            // InternalPascal.g:1052:3: ( rule__Type_definition__Group__0 )
            // InternalPascal.g:1052:4: rule__Type_definition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Type_definition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getType_definitionAccess().getGroup()); 
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
    // $ANTLR end "ruletype_definition"


    // $ANTLR start "entryRuletype"
    // InternalPascal.g:1061:1: entryRuletype : ruletype EOF ;
    public final void entryRuletype() throws RecognitionException {
        try {
            // InternalPascal.g:1062:1: ( ruletype EOF )
            // InternalPascal.g:1063:1: ruletype EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruletype();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalPascal.g:1070:1: ruletype : ( ( rule__Type__Alternatives ) ) ;
    public final void ruletype() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1074:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalPascal.g:1075:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalPascal.g:1075:2: ( ( rule__Type__Alternatives ) )
            // InternalPascal.g:1076:3: ( rule__Type__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getAlternatives()); 
            }
            // InternalPascal.g:1077:3: ( rule__Type__Alternatives )
            // InternalPascal.g:1077:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getAlternatives()); 
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
    // $ANTLR end "ruletype"


    // $ANTLR start "entryRulesimple_type"
    // InternalPascal.g:1086:1: entryRulesimple_type : rulesimple_type EOF ;
    public final void entryRulesimple_type() throws RecognitionException {
        try {
            // InternalPascal.g:1087:1: ( rulesimple_type EOF )
            // InternalPascal.g:1088:1: rulesimple_type EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimple_typeRule()); 
            }
            pushFollow(FOLLOW_1);
            rulesimple_type();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimple_typeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalPascal.g:1095:1: rulesimple_type : ( ( rule__Simple_type__Alternatives ) ) ;
    public final void rulesimple_type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1099:2: ( ( ( rule__Simple_type__Alternatives ) ) )
            // InternalPascal.g:1100:2: ( ( rule__Simple_type__Alternatives ) )
            {
            // InternalPascal.g:1100:2: ( ( rule__Simple_type__Alternatives ) )
            // InternalPascal.g:1101:3: ( rule__Simple_type__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimple_typeAccess().getAlternatives()); 
            }
            // InternalPascal.g:1102:3: ( rule__Simple_type__Alternatives )
            // InternalPascal.g:1102:4: rule__Simple_type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Simple_type__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimple_typeAccess().getAlternatives()); 
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
    // $ANTLR end "rulesimple_type"


    // $ANTLR start "entryRulesubrange_type"
    // InternalPascal.g:1111:1: entryRulesubrange_type : rulesubrange_type EOF ;
    public final void entryRulesubrange_type() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalPascal.g:1115:1: ( rulesubrange_type EOF )
            // InternalPascal.g:1116:1: rulesubrange_type EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubrange_typeRule()); 
            }
            pushFollow(FOLLOW_1);
            rulesubrange_type();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubrange_typeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalPascal.g:1126:1: rulesubrange_type : ( ( rule__Subrange_type__Alternatives ) ) ;
    public final void rulesubrange_type() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1131:2: ( ( ( rule__Subrange_type__Alternatives ) ) )
            // InternalPascal.g:1132:2: ( ( rule__Subrange_type__Alternatives ) )
            {
            // InternalPascal.g:1132:2: ( ( rule__Subrange_type__Alternatives ) )
            // InternalPascal.g:1133:3: ( rule__Subrange_type__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubrange_typeAccess().getAlternatives()); 
            }
            // InternalPascal.g:1134:3: ( rule__Subrange_type__Alternatives )
            // InternalPascal.g:1134:4: rule__Subrange_type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Subrange_type__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubrange_typeAccess().getAlternatives()); 
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
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "rulesubrange_type"


    // $ANTLR start "entryRuleenumerated_type"
    // InternalPascal.g:1144:1: entryRuleenumerated_type : ruleenumerated_type EOF ;
    public final void entryRuleenumerated_type() throws RecognitionException {
        try {
            // InternalPascal.g:1145:1: ( ruleenumerated_type EOF )
            // InternalPascal.g:1146:1: ruleenumerated_type EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerated_typeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleenumerated_type();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerated_typeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalPascal.g:1153:1: ruleenumerated_type : ( ( rule__Enumerated_type__Group__0 ) ) ;
    public final void ruleenumerated_type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1157:2: ( ( ( rule__Enumerated_type__Group__0 ) ) )
            // InternalPascal.g:1158:2: ( ( rule__Enumerated_type__Group__0 ) )
            {
            // InternalPascal.g:1158:2: ( ( rule__Enumerated_type__Group__0 ) )
            // InternalPascal.g:1159:3: ( rule__Enumerated_type__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerated_typeAccess().getGroup()); 
            }
            // InternalPascal.g:1160:3: ( rule__Enumerated_type__Group__0 )
            // InternalPascal.g:1160:4: rule__Enumerated_type__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Enumerated_type__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerated_typeAccess().getGroup()); 
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
    // $ANTLR end "ruleenumerated_type"


    // $ANTLR start "entryRulestructured_type"
    // InternalPascal.g:1169:1: entryRulestructured_type : rulestructured_type EOF ;
    public final void entryRulestructured_type() throws RecognitionException {
        try {
            // InternalPascal.g:1170:1: ( rulestructured_type EOF )
            // InternalPascal.g:1171:1: rulestructured_type EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStructured_typeRule()); 
            }
            pushFollow(FOLLOW_1);
            rulestructured_type();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStructured_typeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRulestructured_type"


    // $ANTLR start "rulestructured_type"
    // InternalPascal.g:1178:1: rulestructured_type : ( ( rule__Structured_type__Group__0 ) ) ;
    public final void rulestructured_type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1182:2: ( ( ( rule__Structured_type__Group__0 ) ) )
            // InternalPascal.g:1183:2: ( ( rule__Structured_type__Group__0 ) )
            {
            // InternalPascal.g:1183:2: ( ( rule__Structured_type__Group__0 ) )
            // InternalPascal.g:1184:3: ( rule__Structured_type__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStructured_typeAccess().getGroup()); 
            }
            // InternalPascal.g:1185:3: ( rule__Structured_type__Group__0 )
            // InternalPascal.g:1185:4: rule__Structured_type__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Structured_type__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStructured_typeAccess().getGroup()); 
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
    // $ANTLR end "rulestructured_type"


    // $ANTLR start "entryRuleunpacked_structured_type"
    // InternalPascal.g:1194:1: entryRuleunpacked_structured_type : ruleunpacked_structured_type EOF ;
    public final void entryRuleunpacked_structured_type() throws RecognitionException {
        try {
            // InternalPascal.g:1195:1: ( ruleunpacked_structured_type EOF )
            // InternalPascal.g:1196:1: ruleunpacked_structured_type EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnpacked_structured_typeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleunpacked_structured_type();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnpacked_structured_typeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleunpacked_structured_type"


    // $ANTLR start "ruleunpacked_structured_type"
    // InternalPascal.g:1203:1: ruleunpacked_structured_type : ( ( rule__Unpacked_structured_type__RecordAssignment ) ) ;
    public final void ruleunpacked_structured_type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1207:2: ( ( ( rule__Unpacked_structured_type__RecordAssignment ) ) )
            // InternalPascal.g:1208:2: ( ( rule__Unpacked_structured_type__RecordAssignment ) )
            {
            // InternalPascal.g:1208:2: ( ( rule__Unpacked_structured_type__RecordAssignment ) )
            // InternalPascal.g:1209:3: ( rule__Unpacked_structured_type__RecordAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnpacked_structured_typeAccess().getRecordAssignment()); 
            }
            // InternalPascal.g:1210:3: ( rule__Unpacked_structured_type__RecordAssignment )
            // InternalPascal.g:1210:4: rule__Unpacked_structured_type__RecordAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Unpacked_structured_type__RecordAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnpacked_structured_typeAccess().getRecordAssignment()); 
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
    // $ANTLR end "ruleunpacked_structured_type"


    // $ANTLR start "entryRulerecord_type"
    // InternalPascal.g:1219:1: entryRulerecord_type : rulerecord_type EOF ;
    public final void entryRulerecord_type() throws RecognitionException {
        try {
            // InternalPascal.g:1220:1: ( rulerecord_type EOF )
            // InternalPascal.g:1221:1: rulerecord_type EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecord_typeRule()); 
            }
            pushFollow(FOLLOW_1);
            rulerecord_type();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecord_typeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRulerecord_type"


    // $ANTLR start "rulerecord_type"
    // InternalPascal.g:1228:1: rulerecord_type : ( ( rule__Record_type__Group__0 ) ) ;
    public final void rulerecord_type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1232:2: ( ( ( rule__Record_type__Group__0 ) ) )
            // InternalPascal.g:1233:2: ( ( rule__Record_type__Group__0 ) )
            {
            // InternalPascal.g:1233:2: ( ( rule__Record_type__Group__0 ) )
            // InternalPascal.g:1234:3: ( rule__Record_type__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecord_typeAccess().getGroup()); 
            }
            // InternalPascal.g:1235:3: ( rule__Record_type__Group__0 )
            // InternalPascal.g:1235:4: rule__Record_type__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Record_type__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecord_typeAccess().getGroup()); 
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
    // $ANTLR end "rulerecord_type"


    // $ANTLR start "entryRulefield_list"
    // InternalPascal.g:1244:1: entryRulefield_list : rulefield_list EOF ;
    public final void entryRulefield_list() throws RecognitionException {
        try {
            // InternalPascal.g:1245:1: ( rulefield_list EOF )
            // InternalPascal.g:1246:1: rulefield_list EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_listRule()); 
            }
            pushFollow(FOLLOW_1);
            rulefield_list();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getField_listRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRulefield_list"


    // $ANTLR start "rulefield_list"
    // InternalPascal.g:1253:1: rulefield_list : ( ( rule__Field_list__Group__0 ) ) ;
    public final void rulefield_list() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1257:2: ( ( ( rule__Field_list__Group__0 ) ) )
            // InternalPascal.g:1258:2: ( ( rule__Field_list__Group__0 ) )
            {
            // InternalPascal.g:1258:2: ( ( rule__Field_list__Group__0 ) )
            // InternalPascal.g:1259:3: ( rule__Field_list__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_listAccess().getGroup()); 
            }
            // InternalPascal.g:1260:3: ( rule__Field_list__Group__0 )
            // InternalPascal.g:1260:4: rule__Field_list__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Field_list__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getField_listAccess().getGroup()); 
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
    // $ANTLR end "rulefield_list"


    // $ANTLR start "entryRulefixed_part"
    // InternalPascal.g:1269:1: entryRulefixed_part : rulefixed_part EOF ;
    public final void entryRulefixed_part() throws RecognitionException {
        try {
            // InternalPascal.g:1270:1: ( rulefixed_part EOF )
            // InternalPascal.g:1271:1: rulefixed_part EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFixed_partRule()); 
            }
            pushFollow(FOLLOW_1);
            rulefixed_part();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFixed_partRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRulefixed_part"


    // $ANTLR start "rulefixed_part"
    // InternalPascal.g:1278:1: rulefixed_part : ( ( rule__Fixed_part__Group__0 ) ) ;
    public final void rulefixed_part() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1282:2: ( ( ( rule__Fixed_part__Group__0 ) ) )
            // InternalPascal.g:1283:2: ( ( rule__Fixed_part__Group__0 ) )
            {
            // InternalPascal.g:1283:2: ( ( rule__Fixed_part__Group__0 ) )
            // InternalPascal.g:1284:3: ( rule__Fixed_part__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFixed_partAccess().getGroup()); 
            }
            // InternalPascal.g:1285:3: ( rule__Fixed_part__Group__0 )
            // InternalPascal.g:1285:4: rule__Fixed_part__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Fixed_part__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFixed_partAccess().getGroup()); 
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
    // $ANTLR end "rulefixed_part"


    // $ANTLR start "entryRulerecord_section"
    // InternalPascal.g:1294:1: entryRulerecord_section : rulerecord_section EOF ;
    public final void entryRulerecord_section() throws RecognitionException {
        try {
            // InternalPascal.g:1295:1: ( rulerecord_section EOF )
            // InternalPascal.g:1296:1: rulerecord_section EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecord_sectionRule()); 
            }
            pushFollow(FOLLOW_1);
            rulerecord_section();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecord_sectionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRulerecord_section"


    // $ANTLR start "rulerecord_section"
    // InternalPascal.g:1303:1: rulerecord_section : ( ( rule__Record_section__Group__0 ) ) ;
    public final void rulerecord_section() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1307:2: ( ( ( rule__Record_section__Group__0 ) ) )
            // InternalPascal.g:1308:2: ( ( rule__Record_section__Group__0 ) )
            {
            // InternalPascal.g:1308:2: ( ( rule__Record_section__Group__0 ) )
            // InternalPascal.g:1309:3: ( rule__Record_section__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecord_sectionAccess().getGroup()); 
            }
            // InternalPascal.g:1310:3: ( rule__Record_section__Group__0 )
            // InternalPascal.g:1310:4: rule__Record_section__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Record_section__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecord_sectionAccess().getGroup()); 
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
    // $ANTLR end "rulerecord_section"


    // $ANTLR start "entryRulevariant_part"
    // InternalPascal.g:1319:1: entryRulevariant_part : rulevariant_part EOF ;
    public final void entryRulevariant_part() throws RecognitionException {
        try {
            // InternalPascal.g:1320:1: ( rulevariant_part EOF )
            // InternalPascal.g:1321:1: rulevariant_part EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariant_partRule()); 
            }
            pushFollow(FOLLOW_1);
            rulevariant_part();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariant_partRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRulevariant_part"


    // $ANTLR start "rulevariant_part"
    // InternalPascal.g:1328:1: rulevariant_part : ( ( rule__Variant_part__Group__0 ) ) ;
    public final void rulevariant_part() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1332:2: ( ( ( rule__Variant_part__Group__0 ) ) )
            // InternalPascal.g:1333:2: ( ( rule__Variant_part__Group__0 ) )
            {
            // InternalPascal.g:1333:2: ( ( rule__Variant_part__Group__0 ) )
            // InternalPascal.g:1334:3: ( rule__Variant_part__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariant_partAccess().getGroup()); 
            }
            // InternalPascal.g:1335:3: ( rule__Variant_part__Group__0 )
            // InternalPascal.g:1335:4: rule__Variant_part__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variant_part__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariant_partAccess().getGroup()); 
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
    // $ANTLR end "rulevariant_part"


    // $ANTLR start "entryRuletag_field"
    // InternalPascal.g:1344:1: entryRuletag_field : ruletag_field EOF ;
    public final void entryRuletag_field() throws RecognitionException {
        try {
            // InternalPascal.g:1345:1: ( ruletag_field EOF )
            // InternalPascal.g:1346:1: ruletag_field EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTag_fieldRule()); 
            }
            pushFollow(FOLLOW_1);
            ruletag_field();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTag_fieldRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuletag_field"


    // $ANTLR start "ruletag_field"
    // InternalPascal.g:1353:1: ruletag_field : ( ( rule__Tag_field__Group__0 ) ) ;
    public final void ruletag_field() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1357:2: ( ( ( rule__Tag_field__Group__0 ) ) )
            // InternalPascal.g:1358:2: ( ( rule__Tag_field__Group__0 ) )
            {
            // InternalPascal.g:1358:2: ( ( rule__Tag_field__Group__0 ) )
            // InternalPascal.g:1359:3: ( rule__Tag_field__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTag_fieldAccess().getGroup()); 
            }
            // InternalPascal.g:1360:3: ( rule__Tag_field__Group__0 )
            // InternalPascal.g:1360:4: rule__Tag_field__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Tag_field__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTag_fieldAccess().getGroup()); 
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
    // $ANTLR end "ruletag_field"


    // $ANTLR start "entryRulevariant"
    // InternalPascal.g:1369:1: entryRulevariant : rulevariant EOF ;
    public final void entryRulevariant() throws RecognitionException {
        try {
            // InternalPascal.g:1370:1: ( rulevariant EOF )
            // InternalPascal.g:1371:1: rulevariant EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariantRule()); 
            }
            pushFollow(FOLLOW_1);
            rulevariant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariantRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRulevariant"


    // $ANTLR start "rulevariant"
    // InternalPascal.g:1378:1: rulevariant : ( ( rule__Variant__Group__0 ) ) ;
    public final void rulevariant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1382:2: ( ( ( rule__Variant__Group__0 ) ) )
            // InternalPascal.g:1383:2: ( ( rule__Variant__Group__0 ) )
            {
            // InternalPascal.g:1383:2: ( ( rule__Variant__Group__0 ) )
            // InternalPascal.g:1384:3: ( rule__Variant__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariantAccess().getGroup()); 
            }
            // InternalPascal.g:1385:3: ( rule__Variant__Group__0 )
            // InternalPascal.g:1385:4: rule__Variant__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variant__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariantAccess().getGroup()); 
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
    // $ANTLR end "rulevariant"


    // $ANTLR start "entryRulecase_label_list"
    // InternalPascal.g:1394:1: entryRulecase_label_list : rulecase_label_list EOF ;
    public final void entryRulecase_label_list() throws RecognitionException {
        try {
            // InternalPascal.g:1395:1: ( rulecase_label_list EOF )
            // InternalPascal.g:1396:1: rulecase_label_list EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCase_label_listRule()); 
            }
            pushFollow(FOLLOW_1);
            rulecase_label_list();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCase_label_listRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRulecase_label_list"


    // $ANTLR start "rulecase_label_list"
    // InternalPascal.g:1403:1: rulecase_label_list : ( ( rule__Case_label_list__Group__0 ) ) ;
    public final void rulecase_label_list() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1407:2: ( ( ( rule__Case_label_list__Group__0 ) ) )
            // InternalPascal.g:1408:2: ( ( rule__Case_label_list__Group__0 ) )
            {
            // InternalPascal.g:1408:2: ( ( rule__Case_label_list__Group__0 ) )
            // InternalPascal.g:1409:3: ( rule__Case_label_list__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCase_label_listAccess().getGroup()); 
            }
            // InternalPascal.g:1410:3: ( rule__Case_label_list__Group__0 )
            // InternalPascal.g:1410:4: rule__Case_label_list__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Case_label_list__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCase_label_listAccess().getGroup()); 
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
    // $ANTLR end "rulecase_label_list"


    // $ANTLR start "entryRulepointer_type"
    // InternalPascal.g:1419:1: entryRulepointer_type : rulepointer_type EOF ;
    public final void entryRulepointer_type() throws RecognitionException {
        try {
            // InternalPascal.g:1420:1: ( rulepointer_type EOF )
            // InternalPascal.g:1421:1: rulepointer_type EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointer_typeRule()); 
            }
            pushFollow(FOLLOW_1);
            rulepointer_type();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPointer_typeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalPascal.g:1428:1: rulepointer_type : ( ( rule__Pointer_type__Group__0 ) ) ;
    public final void rulepointer_type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1432:2: ( ( ( rule__Pointer_type__Group__0 ) ) )
            // InternalPascal.g:1433:2: ( ( rule__Pointer_type__Group__0 ) )
            {
            // InternalPascal.g:1433:2: ( ( rule__Pointer_type__Group__0 ) )
            // InternalPascal.g:1434:3: ( rule__Pointer_type__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointer_typeAccess().getGroup()); 
            }
            // InternalPascal.g:1435:3: ( rule__Pointer_type__Group__0 )
            // InternalPascal.g:1435:4: rule__Pointer_type__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Pointer_type__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPointer_typeAccess().getGroup()); 
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
    // $ANTLR end "rulepointer_type"


    // $ANTLR start "entryRulesigned_number"
    // InternalPascal.g:1444:1: entryRulesigned_number : rulesigned_number EOF ;
    public final void entryRulesigned_number() throws RecognitionException {
        try {
            // InternalPascal.g:1445:1: ( rulesigned_number EOF )
            // InternalPascal.g:1446:1: rulesigned_number EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSigned_numberRule()); 
            }
            pushFollow(FOLLOW_1);
            rulesigned_number();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSigned_numberRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalPascal.g:1453:1: rulesigned_number : ( ( rule__Signed_number__Alternatives ) ) ;
    public final void rulesigned_number() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1457:2: ( ( ( rule__Signed_number__Alternatives ) ) )
            // InternalPascal.g:1458:2: ( ( rule__Signed_number__Alternatives ) )
            {
            // InternalPascal.g:1458:2: ( ( rule__Signed_number__Alternatives ) )
            // InternalPascal.g:1459:3: ( rule__Signed_number__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSigned_numberAccess().getAlternatives()); 
            }
            // InternalPascal.g:1460:3: ( rule__Signed_number__Alternatives )
            // InternalPascal.g:1460:4: rule__Signed_number__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Signed_number__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSigned_numberAccess().getAlternatives()); 
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
    // $ANTLR end "rulesigned_number"


    // $ANTLR start "entryRuleunsigned_number"
    // InternalPascal.g:1469:1: entryRuleunsigned_number : ruleunsigned_number EOF ;
    public final void entryRuleunsigned_number() throws RecognitionException {
        try {
            // InternalPascal.g:1470:1: ( ruleunsigned_number EOF )
            // InternalPascal.g:1471:1: ruleunsigned_number EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnsigned_numberRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleunsigned_number();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnsigned_numberRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalPascal.g:1478:1: ruleunsigned_number : ( ( rule__Unsigned_number__Alternatives ) ) ;
    public final void ruleunsigned_number() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1482:2: ( ( ( rule__Unsigned_number__Alternatives ) ) )
            // InternalPascal.g:1483:2: ( ( rule__Unsigned_number__Alternatives ) )
            {
            // InternalPascal.g:1483:2: ( ( rule__Unsigned_number__Alternatives ) )
            // InternalPascal.g:1484:3: ( rule__Unsigned_number__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnsigned_numberAccess().getAlternatives()); 
            }
            // InternalPascal.g:1485:3: ( rule__Unsigned_number__Alternatives )
            // InternalPascal.g:1485:4: rule__Unsigned_number__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Unsigned_number__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnsigned_numberAccess().getAlternatives()); 
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
    // $ANTLR end "ruleunsigned_number"


    // $ANTLR start "entryRulevariable_declaration_part"
    // InternalPascal.g:1494:1: entryRulevariable_declaration_part : rulevariable_declaration_part EOF ;
    public final void entryRulevariable_declaration_part() throws RecognitionException {
        try {
            // InternalPascal.g:1495:1: ( rulevariable_declaration_part EOF )
            // InternalPascal.g:1496:1: rulevariable_declaration_part EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declaration_partRule()); 
            }
            pushFollow(FOLLOW_1);
            rulevariable_declaration_part();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_declaration_partRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalPascal.g:1503:1: rulevariable_declaration_part : ( ( rule__Variable_declaration_part__Group__0 ) ) ;
    public final void rulevariable_declaration_part() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1507:2: ( ( ( rule__Variable_declaration_part__Group__0 ) ) )
            // InternalPascal.g:1508:2: ( ( rule__Variable_declaration_part__Group__0 ) )
            {
            // InternalPascal.g:1508:2: ( ( rule__Variable_declaration_part__Group__0 ) )
            // InternalPascal.g:1509:3: ( rule__Variable_declaration_part__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declaration_partAccess().getGroup()); 
            }
            // InternalPascal.g:1510:3: ( rule__Variable_declaration_part__Group__0 )
            // InternalPascal.g:1510:4: rule__Variable_declaration_part__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variable_declaration_part__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_declaration_partAccess().getGroup()); 
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
    // $ANTLR end "rulevariable_declaration_part"


    // $ANTLR start "entryRulevariable_section"
    // InternalPascal.g:1519:1: entryRulevariable_section : rulevariable_section EOF ;
    public final void entryRulevariable_section() throws RecognitionException {
        try {
            // InternalPascal.g:1520:1: ( rulevariable_section EOF )
            // InternalPascal.g:1521:1: rulevariable_section EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_sectionRule()); 
            }
            pushFollow(FOLLOW_1);
            rulevariable_section();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_sectionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalPascal.g:1528:1: rulevariable_section : ( ( rule__Variable_section__Group__0 ) ) ;
    public final void rulevariable_section() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1532:2: ( ( ( rule__Variable_section__Group__0 ) ) )
            // InternalPascal.g:1533:2: ( ( rule__Variable_section__Group__0 ) )
            {
            // InternalPascal.g:1533:2: ( ( rule__Variable_section__Group__0 ) )
            // InternalPascal.g:1534:3: ( rule__Variable_section__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_sectionAccess().getGroup()); 
            }
            // InternalPascal.g:1535:3: ( rule__Variable_section__Group__0 )
            // InternalPascal.g:1535:4: rule__Variable_section__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variable_section__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_sectionAccess().getGroup()); 
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
    // $ANTLR end "rulevariable_section"


    // $ANTLR start "entryRulevariable_identifier_list"
    // InternalPascal.g:1544:1: entryRulevariable_identifier_list : rulevariable_identifier_list EOF ;
    public final void entryRulevariable_identifier_list() throws RecognitionException {
        try {
            // InternalPascal.g:1545:1: ( rulevariable_identifier_list EOF )
            // InternalPascal.g:1546:1: rulevariable_identifier_list EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_identifier_listRule()); 
            }
            pushFollow(FOLLOW_1);
            rulevariable_identifier_list();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_identifier_listRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalPascal.g:1553:1: rulevariable_identifier_list : ( ( rule__Variable_identifier_list__Group__0 ) ) ;
    public final void rulevariable_identifier_list() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1557:2: ( ( ( rule__Variable_identifier_list__Group__0 ) ) )
            // InternalPascal.g:1558:2: ( ( rule__Variable_identifier_list__Group__0 ) )
            {
            // InternalPascal.g:1558:2: ( ( rule__Variable_identifier_list__Group__0 ) )
            // InternalPascal.g:1559:3: ( rule__Variable_identifier_list__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_identifier_listAccess().getGroup()); 
            }
            // InternalPascal.g:1560:3: ( rule__Variable_identifier_list__Group__0 )
            // InternalPascal.g:1560:4: rule__Variable_identifier_list__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variable_identifier_list__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_identifier_listAccess().getGroup()); 
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
    // $ANTLR end "rulevariable_identifier_list"


    // $ANTLR start "entryRulewhile_statement"
    // InternalPascal.g:1569:1: entryRulewhile_statement : rulewhile_statement EOF ;
    public final void entryRulewhile_statement() throws RecognitionException {
        try {
            // InternalPascal.g:1570:1: ( rulewhile_statement EOF )
            // InternalPascal.g:1571:1: rulewhile_statement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhile_statementRule()); 
            }
            pushFollow(FOLLOW_1);
            rulewhile_statement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhile_statementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRulewhile_statement"


    // $ANTLR start "rulewhile_statement"
    // InternalPascal.g:1578:1: rulewhile_statement : ( ( rule__While_statement__Group__0 ) ) ;
    public final void rulewhile_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1582:2: ( ( ( rule__While_statement__Group__0 ) ) )
            // InternalPascal.g:1583:2: ( ( rule__While_statement__Group__0 ) )
            {
            // InternalPascal.g:1583:2: ( ( rule__While_statement__Group__0 ) )
            // InternalPascal.g:1584:3: ( rule__While_statement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhile_statementAccess().getGroup()); 
            }
            // InternalPascal.g:1585:3: ( rule__While_statement__Group__0 )
            // InternalPascal.g:1585:4: rule__While_statement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__While_statement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhile_statementAccess().getGroup()); 
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
    // $ANTLR end "rulewhile_statement"


    // $ANTLR start "rule__Statement__Alternatives_1"
    // InternalPascal.g:1593:1: rule__Statement__Alternatives_1 : ( ( ( rule__Statement__SimpleAssignment_1_0 ) ) | ( ( rule__Statement__StructuredAssignment_1_1 ) ) );
    public final void rule__Statement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1597:1: ( ( ( rule__Statement__SimpleAssignment_1_0 ) ) | ( ( rule__Statement__StructuredAssignment_1_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==EOF||LA4_0==RULE_ID||LA4_0==22||LA4_0==24) ) {
                alt4=1;
            }
            else if ( (LA4_0==23||LA4_0==44) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalPascal.g:1598:2: ( ( rule__Statement__SimpleAssignment_1_0 ) )
                    {
                    // InternalPascal.g:1598:2: ( ( rule__Statement__SimpleAssignment_1_0 ) )
                    // InternalPascal.g:1599:3: ( rule__Statement__SimpleAssignment_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getSimpleAssignment_1_0()); 
                    }
                    // InternalPascal.g:1600:3: ( rule__Statement__SimpleAssignment_1_0 )
                    // InternalPascal.g:1600:4: rule__Statement__SimpleAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__SimpleAssignment_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getSimpleAssignment_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1604:2: ( ( rule__Statement__StructuredAssignment_1_1 ) )
                    {
                    // InternalPascal.g:1604:2: ( ( rule__Statement__StructuredAssignment_1_1 ) )
                    // InternalPascal.g:1605:3: ( rule__Statement__StructuredAssignment_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getStructuredAssignment_1_1()); 
                    }
                    // InternalPascal.g:1606:3: ( rule__Statement__StructuredAssignment_1_1 )
                    // InternalPascal.g:1606:4: rule__Statement__StructuredAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__StructuredAssignment_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getStructuredAssignment_1_1()); 
                    }

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
    // $ANTLR end "rule__Statement__Alternatives_1"


    // $ANTLR start "rule__Simple_statement__Alternatives"
    // InternalPascal.g:1614:1: rule__Simple_statement__Alternatives : ( ( ( rule__Simple_statement__AssignmentAssignment_0 ) ) | ( ( rule__Simple_statement__FunctionAssignment_1 ) ) | ( ( rule__Simple_statement__Function_noargsAssignment_2 ) ) );
    public final void rule__Simple_statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1618:1: ( ( ( rule__Simple_statement__AssignmentAssignment_0 ) ) | ( ( rule__Simple_statement__FunctionAssignment_1 ) ) | ( ( rule__Simple_statement__Function_noargsAssignment_2 ) ) )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case EOF:
                case 22:
                case 24:
                    {
                    alt5=3;
                    }
                    break;
                case 31:
                    {
                    alt5=2;
                    }
                    break;
                case 20:
                case 26:
                case 27:
                case 29:
                    {
                    alt5=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalPascal.g:1619:2: ( ( rule__Simple_statement__AssignmentAssignment_0 ) )
                    {
                    // InternalPascal.g:1619:2: ( ( rule__Simple_statement__AssignmentAssignment_0 ) )
                    // InternalPascal.g:1620:3: ( rule__Simple_statement__AssignmentAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimple_statementAccess().getAssignmentAssignment_0()); 
                    }
                    // InternalPascal.g:1621:3: ( rule__Simple_statement__AssignmentAssignment_0 )
                    // InternalPascal.g:1621:4: rule__Simple_statement__AssignmentAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Simple_statement__AssignmentAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSimple_statementAccess().getAssignmentAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1625:2: ( ( rule__Simple_statement__FunctionAssignment_1 ) )
                    {
                    // InternalPascal.g:1625:2: ( ( rule__Simple_statement__FunctionAssignment_1 ) )
                    // InternalPascal.g:1626:3: ( rule__Simple_statement__FunctionAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimple_statementAccess().getFunctionAssignment_1()); 
                    }
                    // InternalPascal.g:1627:3: ( rule__Simple_statement__FunctionAssignment_1 )
                    // InternalPascal.g:1627:4: rule__Simple_statement__FunctionAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Simple_statement__FunctionAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSimple_statementAccess().getFunctionAssignment_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:1631:2: ( ( rule__Simple_statement__Function_noargsAssignment_2 ) )
                    {
                    // InternalPascal.g:1631:2: ( ( rule__Simple_statement__Function_noargsAssignment_2 ) )
                    // InternalPascal.g:1632:3: ( rule__Simple_statement__Function_noargsAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimple_statementAccess().getFunction_noargsAssignment_2()); 
                    }
                    // InternalPascal.g:1633:3: ( rule__Simple_statement__Function_noargsAssignment_2 )
                    // InternalPascal.g:1633:4: rule__Simple_statement__Function_noargsAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Simple_statement__Function_noargsAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSimple_statementAccess().getFunction_noargsAssignment_2()); 
                    }

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


    // $ANTLR start "rule__Structured_statement__Alternatives"
    // InternalPascal.g:1641:1: rule__Structured_statement__Alternatives : ( ( ( rule__Structured_statement__CompoundAssignment_0 ) ) | ( ( rule__Structured_statement__While_stmtAssignment_1 ) ) );
    public final void rule__Structured_statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1645:1: ( ( ( rule__Structured_statement__CompoundAssignment_0 ) ) | ( ( rule__Structured_statement__While_stmtAssignment_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            else if ( (LA6_0==44) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalPascal.g:1646:2: ( ( rule__Structured_statement__CompoundAssignment_0 ) )
                    {
                    // InternalPascal.g:1646:2: ( ( rule__Structured_statement__CompoundAssignment_0 ) )
                    // InternalPascal.g:1647:3: ( rule__Structured_statement__CompoundAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStructured_statementAccess().getCompoundAssignment_0()); 
                    }
                    // InternalPascal.g:1648:3: ( rule__Structured_statement__CompoundAssignment_0 )
                    // InternalPascal.g:1648:4: rule__Structured_statement__CompoundAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Structured_statement__CompoundAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStructured_statementAccess().getCompoundAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1652:2: ( ( rule__Structured_statement__While_stmtAssignment_1 ) )
                    {
                    // InternalPascal.g:1652:2: ( ( rule__Structured_statement__While_stmtAssignment_1 ) )
                    // InternalPascal.g:1653:3: ( rule__Structured_statement__While_stmtAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStructured_statementAccess().getWhile_stmtAssignment_1()); 
                    }
                    // InternalPascal.g:1654:3: ( rule__Structured_statement__While_stmtAssignment_1 )
                    // InternalPascal.g:1654:4: rule__Structured_statement__While_stmtAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Structured_statement__While_stmtAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStructured_statementAccess().getWhile_stmtAssignment_1()); 
                    }

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
    // $ANTLR end "rule__Structured_statement__Alternatives"


    // $ANTLR start "rule__Label__Alternatives"
    // InternalPascal.g:1662:1: rule__Label__Alternatives : ( ( ( rule__Label__NumberAssignment_0 ) ) | ( ( rule__Label__NumberAssignment_1 ) ) );
    public final void rule__Label__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1666:1: ( ( ( rule__Label__NumberAssignment_0 ) ) | ( ( rule__Label__NumberAssignment_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_SIGNED_INTEGER_NUMBER) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_INTEGER_NUMBER) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalPascal.g:1667:2: ( ( rule__Label__NumberAssignment_0 ) )
                    {
                    // InternalPascal.g:1667:2: ( ( rule__Label__NumberAssignment_0 ) )
                    // InternalPascal.g:1668:3: ( rule__Label__NumberAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLabelAccess().getNumberAssignment_0()); 
                    }
                    // InternalPascal.g:1669:3: ( rule__Label__NumberAssignment_0 )
                    // InternalPascal.g:1669:4: rule__Label__NumberAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Label__NumberAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLabelAccess().getNumberAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1673:2: ( ( rule__Label__NumberAssignment_1 ) )
                    {
                    // InternalPascal.g:1673:2: ( ( rule__Label__NumberAssignment_1 ) )
                    // InternalPascal.g:1674:3: ( rule__Label__NumberAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLabelAccess().getNumberAssignment_1()); 
                    }
                    // InternalPascal.g:1675:3: ( rule__Label__NumberAssignment_1 )
                    // InternalPascal.g:1675:4: rule__Label__NumberAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Label__NumberAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLabelAccess().getNumberAssignment_1()); 
                    }

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
    // InternalPascal.g:1683:1: rule__Var___Alternatives : ( ( ( rule__Var___Group_0__0 ) ) | ( ( rule__Var___Group_1__0 ) ) | ( ( rule__Var___Group_2__0 ) ) );
    public final void rule__Var___Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1687:1: ( ( ( rule__Var___Group_0__0 ) ) | ( ( rule__Var___Group_1__0 ) ) | ( ( rule__Var___Group_2__0 ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt8=1;
                }
                break;
            case 20:
                {
                alt8=2;
                }
                break;
            case 29:
                {
                alt8=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalPascal.g:1688:2: ( ( rule__Var___Group_0__0 ) )
                    {
                    // InternalPascal.g:1688:2: ( ( rule__Var___Group_0__0 ) )
                    // InternalPascal.g:1689:3: ( rule__Var___Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVar_Access().getGroup_0()); 
                    }
                    // InternalPascal.g:1690:3: ( rule__Var___Group_0__0 )
                    // InternalPascal.g:1690:4: rule__Var___Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Var___Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVar_Access().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1694:2: ( ( rule__Var___Group_1__0 ) )
                    {
                    // InternalPascal.g:1694:2: ( ( rule__Var___Group_1__0 ) )
                    // InternalPascal.g:1695:3: ( rule__Var___Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVar_Access().getGroup_1()); 
                    }
                    // InternalPascal.g:1696:3: ( rule__Var___Group_1__0 )
                    // InternalPascal.g:1696:4: rule__Var___Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Var___Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVar_Access().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:1700:2: ( ( rule__Var___Group_2__0 ) )
                    {
                    // InternalPascal.g:1700:2: ( ( rule__Var___Group_2__0 ) )
                    // InternalPascal.g:1701:3: ( rule__Var___Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVar_Access().getGroup_2()); 
                    }
                    // InternalPascal.g:1702:3: ( rule__Var___Group_2__0 )
                    // InternalPascal.g:1702:4: rule__Var___Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Var___Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVar_Access().getGroup_2()); 
                    }

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
    // InternalPascal.g:1710:1: rule__Expression__Alternatives_1_0 : ( ( ( rule__Expression__OperatorsAssignment_1_0_0 ) ) | ( ( rule__Expression__OperatorsAssignment_1_0_1 ) ) | ( ( rule__Expression__OperatorsAssignment_1_0_2 ) ) );
    public final void rule__Expression__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1714:1: ( ( ( rule__Expression__OperatorsAssignment_1_0_0 ) ) | ( ( rule__Expression__OperatorsAssignment_1_0_1 ) ) | ( ( rule__Expression__OperatorsAssignment_1_0_2 ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case RULE_RELATIONAL_OP:
                {
                alt9=1;
                }
                break;
            case 46:
                {
                alt9=2;
                }
                break;
            case 39:
                {
                alt9=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalPascal.g:1715:2: ( ( rule__Expression__OperatorsAssignment_1_0_0 ) )
                    {
                    // InternalPascal.g:1715:2: ( ( rule__Expression__OperatorsAssignment_1_0_0 ) )
                    // InternalPascal.g:1716:3: ( rule__Expression__OperatorsAssignment_1_0_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getOperatorsAssignment_1_0_0()); 
                    }
                    // InternalPascal.g:1717:3: ( rule__Expression__OperatorsAssignment_1_0_0 )
                    // InternalPascal.g:1717:4: rule__Expression__OperatorsAssignment_1_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__OperatorsAssignment_1_0_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getOperatorsAssignment_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1721:2: ( ( rule__Expression__OperatorsAssignment_1_0_1 ) )
                    {
                    // InternalPascal.g:1721:2: ( ( rule__Expression__OperatorsAssignment_1_0_1 ) )
                    // InternalPascal.g:1722:3: ( rule__Expression__OperatorsAssignment_1_0_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getOperatorsAssignment_1_0_1()); 
                    }
                    // InternalPascal.g:1723:3: ( rule__Expression__OperatorsAssignment_1_0_1 )
                    // InternalPascal.g:1723:4: rule__Expression__OperatorsAssignment_1_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__OperatorsAssignment_1_0_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getOperatorsAssignment_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:1727:2: ( ( rule__Expression__OperatorsAssignment_1_0_2 ) )
                    {
                    // InternalPascal.g:1727:2: ( ( rule__Expression__OperatorsAssignment_1_0_2 ) )
                    // InternalPascal.g:1728:3: ( rule__Expression__OperatorsAssignment_1_0_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getOperatorsAssignment_1_0_2()); 
                    }
                    // InternalPascal.g:1729:3: ( rule__Expression__OperatorsAssignment_1_0_2 )
                    // InternalPascal.g:1729:4: rule__Expression__OperatorsAssignment_1_0_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__OperatorsAssignment_1_0_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getOperatorsAssignment_1_0_2()); 
                    }

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
    // InternalPascal.g:1737:1: rule__Simple_expression__Alternatives_2 : ( ( ( rule__Simple_expression__Group_2_0__0 ) ) | ( ( rule__Simple_expression__TermsAssignment_2_1 ) ) );
    public final void rule__Simple_expression__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1741:1: ( ( ( rule__Simple_expression__Group_2_0__0 ) ) | ( ( rule__Simple_expression__TermsAssignment_2_1 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ADDITION_OP||LA10_0==47) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_INTEGER_NUMBER||LA10_0==RULE_REAL_NUMBER) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalPascal.g:1742:2: ( ( rule__Simple_expression__Group_2_0__0 ) )
                    {
                    // InternalPascal.g:1742:2: ( ( rule__Simple_expression__Group_2_0__0 ) )
                    // InternalPascal.g:1743:3: ( rule__Simple_expression__Group_2_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimple_expressionAccess().getGroup_2_0()); 
                    }
                    // InternalPascal.g:1744:3: ( rule__Simple_expression__Group_2_0__0 )
                    // InternalPascal.g:1744:4: rule__Simple_expression__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Simple_expression__Group_2_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSimple_expressionAccess().getGroup_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1748:2: ( ( rule__Simple_expression__TermsAssignment_2_1 ) )
                    {
                    // InternalPascal.g:1748:2: ( ( rule__Simple_expression__TermsAssignment_2_1 ) )
                    // InternalPascal.g:1749:3: ( rule__Simple_expression__TermsAssignment_2_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimple_expressionAccess().getTermsAssignment_2_1()); 
                    }
                    // InternalPascal.g:1750:3: ( rule__Simple_expression__TermsAssignment_2_1 )
                    // InternalPascal.g:1750:4: rule__Simple_expression__TermsAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Simple_expression__TermsAssignment_2_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSimple_expressionAccess().getTermsAssignment_2_1()); 
                    }

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
    // InternalPascal.g:1758:1: rule__Simple_expression__Alternatives_2_0_0 : ( ( ( rule__Simple_expression__OperatorsAssignment_2_0_0_0 ) ) | ( ( rule__Simple_expression__OperatorsAssignment_2_0_0_1 ) ) );
    public final void rule__Simple_expression__Alternatives_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1762:1: ( ( ( rule__Simple_expression__OperatorsAssignment_2_0_0_0 ) ) | ( ( rule__Simple_expression__OperatorsAssignment_2_0_0_1 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ADDITION_OP) ) {
                alt11=1;
            }
            else if ( (LA11_0==47) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalPascal.g:1763:2: ( ( rule__Simple_expression__OperatorsAssignment_2_0_0_0 ) )
                    {
                    // InternalPascal.g:1763:2: ( ( rule__Simple_expression__OperatorsAssignment_2_0_0_0 ) )
                    // InternalPascal.g:1764:3: ( rule__Simple_expression__OperatorsAssignment_2_0_0_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimple_expressionAccess().getOperatorsAssignment_2_0_0_0()); 
                    }
                    // InternalPascal.g:1765:3: ( rule__Simple_expression__OperatorsAssignment_2_0_0_0 )
                    // InternalPascal.g:1765:4: rule__Simple_expression__OperatorsAssignment_2_0_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Simple_expression__OperatorsAssignment_2_0_0_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSimple_expressionAccess().getOperatorsAssignment_2_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1769:2: ( ( rule__Simple_expression__OperatorsAssignment_2_0_0_1 ) )
                    {
                    // InternalPascal.g:1769:2: ( ( rule__Simple_expression__OperatorsAssignment_2_0_0_1 ) )
                    // InternalPascal.g:1770:3: ( rule__Simple_expression__OperatorsAssignment_2_0_0_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimple_expressionAccess().getOperatorsAssignment_2_0_0_1()); 
                    }
                    // InternalPascal.g:1771:3: ( rule__Simple_expression__OperatorsAssignment_2_0_0_1 )
                    // InternalPascal.g:1771:4: rule__Simple_expression__OperatorsAssignment_2_0_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Simple_expression__OperatorsAssignment_2_0_0_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSimple_expressionAccess().getOperatorsAssignment_2_0_0_1()); 
                    }

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
    // InternalPascal.g:1779:1: rule__Term__Alternatives_1_0 : ( ( ( rule__Term__OperatorsAssignment_1_0_0 ) ) | ( ( rule__Term__OperatorsAssignment_1_0_1 ) ) | ( ( rule__Term__OperatorsAssignment_1_0_2 ) ) | ( ( rule__Term__OperatorsAssignment_1_0_3 ) ) );
    public final void rule__Term__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1783:1: ( ( ( rule__Term__OperatorsAssignment_1_0_0 ) ) | ( ( rule__Term__OperatorsAssignment_1_0_1 ) ) | ( ( rule__Term__OperatorsAssignment_1_0_2 ) ) | ( ( rule__Term__OperatorsAssignment_1_0_3 ) ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case RULE_MULTIPLICATION_OP:
                {
                alt12=1;
                }
                break;
            case 48:
                {
                alt12=2;
                }
                break;
            case 49:
                {
                alt12=3;
                }
                break;
            case 50:
                {
                alt12=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalPascal.g:1784:2: ( ( rule__Term__OperatorsAssignment_1_0_0 ) )
                    {
                    // InternalPascal.g:1784:2: ( ( rule__Term__OperatorsAssignment_1_0_0 ) )
                    // InternalPascal.g:1785:3: ( rule__Term__OperatorsAssignment_1_0_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTermAccess().getOperatorsAssignment_1_0_0()); 
                    }
                    // InternalPascal.g:1786:3: ( rule__Term__OperatorsAssignment_1_0_0 )
                    // InternalPascal.g:1786:4: rule__Term__OperatorsAssignment_1_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Term__OperatorsAssignment_1_0_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTermAccess().getOperatorsAssignment_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1790:2: ( ( rule__Term__OperatorsAssignment_1_0_1 ) )
                    {
                    // InternalPascal.g:1790:2: ( ( rule__Term__OperatorsAssignment_1_0_1 ) )
                    // InternalPascal.g:1791:3: ( rule__Term__OperatorsAssignment_1_0_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTermAccess().getOperatorsAssignment_1_0_1()); 
                    }
                    // InternalPascal.g:1792:3: ( rule__Term__OperatorsAssignment_1_0_1 )
                    // InternalPascal.g:1792:4: rule__Term__OperatorsAssignment_1_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Term__OperatorsAssignment_1_0_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTermAccess().getOperatorsAssignment_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:1796:2: ( ( rule__Term__OperatorsAssignment_1_0_2 ) )
                    {
                    // InternalPascal.g:1796:2: ( ( rule__Term__OperatorsAssignment_1_0_2 ) )
                    // InternalPascal.g:1797:3: ( rule__Term__OperatorsAssignment_1_0_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTermAccess().getOperatorsAssignment_1_0_2()); 
                    }
                    // InternalPascal.g:1798:3: ( rule__Term__OperatorsAssignment_1_0_2 )
                    // InternalPascal.g:1798:4: rule__Term__OperatorsAssignment_1_0_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Term__OperatorsAssignment_1_0_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTermAccess().getOperatorsAssignment_1_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalPascal.g:1802:2: ( ( rule__Term__OperatorsAssignment_1_0_3 ) )
                    {
                    // InternalPascal.g:1802:2: ( ( rule__Term__OperatorsAssignment_1_0_3 ) )
                    // InternalPascal.g:1803:3: ( rule__Term__OperatorsAssignment_1_0_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTermAccess().getOperatorsAssignment_1_0_3()); 
                    }
                    // InternalPascal.g:1804:3: ( rule__Term__OperatorsAssignment_1_0_3 )
                    // InternalPascal.g:1804:4: rule__Term__OperatorsAssignment_1_0_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Term__OperatorsAssignment_1_0_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTermAccess().getOperatorsAssignment_1_0_3()); 
                    }

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
    // InternalPascal.g:1812:1: rule__Factor__Alternatives : ( ( ( rule__Factor__VariableAssignment_0 ) ) | ( ( rule__Factor__NumberAssignment_1 ) ) | ( ( rule__Factor__StringAssignment_2 ) ) | ( ( rule__Factor__SetAssignment_3 ) ) | ( ( rule__Factor__NilAssignment_4 ) ) | ( ( rule__Factor__BooleanAssignment_5 ) ) | ( ( rule__Factor__BooleanAssignment_6 ) ) | ( ( rule__Factor__FunctionAssignment_7 ) ) | ( ( rule__Factor__Group_8__0 ) ) | ( ( rule__Factor__Group_9__0 ) ) );
    public final void rule__Factor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1816:1: ( ( ( rule__Factor__VariableAssignment_0 ) ) | ( ( rule__Factor__NumberAssignment_1 ) ) | ( ( rule__Factor__StringAssignment_2 ) ) | ( ( rule__Factor__SetAssignment_3 ) ) | ( ( rule__Factor__NilAssignment_4 ) ) | ( ( rule__Factor__BooleanAssignment_5 ) ) | ( ( rule__Factor__BooleanAssignment_6 ) ) | ( ( rule__Factor__FunctionAssignment_7 ) ) | ( ( rule__Factor__Group_8__0 ) ) | ( ( rule__Factor__Group_9__0 ) ) )
            int alt13=10;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // InternalPascal.g:1817:2: ( ( rule__Factor__VariableAssignment_0 ) )
                    {
                    // InternalPascal.g:1817:2: ( ( rule__Factor__VariableAssignment_0 ) )
                    // InternalPascal.g:1818:3: ( rule__Factor__VariableAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFactorAccess().getVariableAssignment_0()); 
                    }
                    // InternalPascal.g:1819:3: ( rule__Factor__VariableAssignment_0 )
                    // InternalPascal.g:1819:4: rule__Factor__VariableAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__VariableAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFactorAccess().getVariableAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1823:2: ( ( rule__Factor__NumberAssignment_1 ) )
                    {
                    // InternalPascal.g:1823:2: ( ( rule__Factor__NumberAssignment_1 ) )
                    // InternalPascal.g:1824:3: ( rule__Factor__NumberAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFactorAccess().getNumberAssignment_1()); 
                    }
                    // InternalPascal.g:1825:3: ( rule__Factor__NumberAssignment_1 )
                    // InternalPascal.g:1825:4: rule__Factor__NumberAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__NumberAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFactorAccess().getNumberAssignment_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:1829:2: ( ( rule__Factor__StringAssignment_2 ) )
                    {
                    // InternalPascal.g:1829:2: ( ( rule__Factor__StringAssignment_2 ) )
                    // InternalPascal.g:1830:3: ( rule__Factor__StringAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFactorAccess().getStringAssignment_2()); 
                    }
                    // InternalPascal.g:1831:3: ( rule__Factor__StringAssignment_2 )
                    // InternalPascal.g:1831:4: rule__Factor__StringAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__StringAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFactorAccess().getStringAssignment_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalPascal.g:1835:2: ( ( rule__Factor__SetAssignment_3 ) )
                    {
                    // InternalPascal.g:1835:2: ( ( rule__Factor__SetAssignment_3 ) )
                    // InternalPascal.g:1836:3: ( rule__Factor__SetAssignment_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFactorAccess().getSetAssignment_3()); 
                    }
                    // InternalPascal.g:1837:3: ( rule__Factor__SetAssignment_3 )
                    // InternalPascal.g:1837:4: rule__Factor__SetAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__SetAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFactorAccess().getSetAssignment_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalPascal.g:1841:2: ( ( rule__Factor__NilAssignment_4 ) )
                    {
                    // InternalPascal.g:1841:2: ( ( rule__Factor__NilAssignment_4 ) )
                    // InternalPascal.g:1842:3: ( rule__Factor__NilAssignment_4 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFactorAccess().getNilAssignment_4()); 
                    }
                    // InternalPascal.g:1843:3: ( rule__Factor__NilAssignment_4 )
                    // InternalPascal.g:1843:4: rule__Factor__NilAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__NilAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFactorAccess().getNilAssignment_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalPascal.g:1847:2: ( ( rule__Factor__BooleanAssignment_5 ) )
                    {
                    // InternalPascal.g:1847:2: ( ( rule__Factor__BooleanAssignment_5 ) )
                    // InternalPascal.g:1848:3: ( rule__Factor__BooleanAssignment_5 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFactorAccess().getBooleanAssignment_5()); 
                    }
                    // InternalPascal.g:1849:3: ( rule__Factor__BooleanAssignment_5 )
                    // InternalPascal.g:1849:4: rule__Factor__BooleanAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__BooleanAssignment_5();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFactorAccess().getBooleanAssignment_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalPascal.g:1853:2: ( ( rule__Factor__BooleanAssignment_6 ) )
                    {
                    // InternalPascal.g:1853:2: ( ( rule__Factor__BooleanAssignment_6 ) )
                    // InternalPascal.g:1854:3: ( rule__Factor__BooleanAssignment_6 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFactorAccess().getBooleanAssignment_6()); 
                    }
                    // InternalPascal.g:1855:3: ( rule__Factor__BooleanAssignment_6 )
                    // InternalPascal.g:1855:4: rule__Factor__BooleanAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__BooleanAssignment_6();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFactorAccess().getBooleanAssignment_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalPascal.g:1859:2: ( ( rule__Factor__FunctionAssignment_7 ) )
                    {
                    // InternalPascal.g:1859:2: ( ( rule__Factor__FunctionAssignment_7 ) )
                    // InternalPascal.g:1860:3: ( rule__Factor__FunctionAssignment_7 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFactorAccess().getFunctionAssignment_7()); 
                    }
                    // InternalPascal.g:1861:3: ( rule__Factor__FunctionAssignment_7 )
                    // InternalPascal.g:1861:4: rule__Factor__FunctionAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__FunctionAssignment_7();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFactorAccess().getFunctionAssignment_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalPascal.g:1865:2: ( ( rule__Factor__Group_8__0 ) )
                    {
                    // InternalPascal.g:1865:2: ( ( rule__Factor__Group_8__0 ) )
                    // InternalPascal.g:1866:3: ( rule__Factor__Group_8__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFactorAccess().getGroup_8()); 
                    }
                    // InternalPascal.g:1867:3: ( rule__Factor__Group_8__0 )
                    // InternalPascal.g:1867:4: rule__Factor__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__Group_8__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFactorAccess().getGroup_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalPascal.g:1871:2: ( ( rule__Factor__Group_9__0 ) )
                    {
                    // InternalPascal.g:1871:2: ( ( rule__Factor__Group_9__0 ) )
                    // InternalPascal.g:1872:3: ( rule__Factor__Group_9__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFactorAccess().getGroup_9()); 
                    }
                    // InternalPascal.g:1873:3: ( rule__Factor__Group_9__0 )
                    // InternalPascal.g:1873:4: rule__Factor__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__Group_9__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFactorAccess().getGroup_9()); 
                    }

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
    // InternalPascal.g:1881:1: rule__Function_procedure_declaration__Alternatives_0 : ( ( ( rule__Function_procedure_declaration__ProceduresAssignment_0_0 ) ) | ( ( rule__Function_procedure_declaration__FunctionsAssignment_0_1 ) ) );
    public final void rule__Function_procedure_declaration__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1885:1: ( ( ( rule__Function_procedure_declaration__ProceduresAssignment_0_0 ) ) | ( ( rule__Function_procedure_declaration__FunctionsAssignment_0_1 ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==34) ) {
                alt14=1;
            }
            else if ( (LA14_0==36) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalPascal.g:1886:2: ( ( rule__Function_procedure_declaration__ProceduresAssignment_0_0 ) )
                    {
                    // InternalPascal.g:1886:2: ( ( rule__Function_procedure_declaration__ProceduresAssignment_0_0 ) )
                    // InternalPascal.g:1887:3: ( rule__Function_procedure_declaration__ProceduresAssignment_0_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFunction_procedure_declarationAccess().getProceduresAssignment_0_0()); 
                    }
                    // InternalPascal.g:1888:3: ( rule__Function_procedure_declaration__ProceduresAssignment_0_0 )
                    // InternalPascal.g:1888:4: rule__Function_procedure_declaration__ProceduresAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Function_procedure_declaration__ProceduresAssignment_0_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFunction_procedure_declarationAccess().getProceduresAssignment_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1892:2: ( ( rule__Function_procedure_declaration__FunctionsAssignment_0_1 ) )
                    {
                    // InternalPascal.g:1892:2: ( ( rule__Function_procedure_declaration__FunctionsAssignment_0_1 ) )
                    // InternalPascal.g:1893:3: ( rule__Function_procedure_declaration__FunctionsAssignment_0_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFunction_procedure_declarationAccess().getFunctionsAssignment_0_1()); 
                    }
                    // InternalPascal.g:1894:3: ( rule__Function_procedure_declaration__FunctionsAssignment_0_1 )
                    // InternalPascal.g:1894:4: rule__Function_procedure_declaration__FunctionsAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Function_procedure_declaration__FunctionsAssignment_0_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFunction_procedure_declarationAccess().getFunctionsAssignment_0_1()); 
                    }

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
    // InternalPascal.g:1902:1: rule__Formal_parameter_section__Alternatives : ( ( ( rule__Formal_parameter_section__ValueAssignment_0 ) ) | ( ( rule__Formal_parameter_section__VariableAssignment_1 ) ) | ( ( rule__Formal_parameter_section__ProcedureAssignment_2 ) ) | ( ( rule__Formal_parameter_section__FunctionAssignment_3 ) ) );
    public final void rule__Formal_parameter_section__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1906:1: ( ( ( rule__Formal_parameter_section__ValueAssignment_0 ) ) | ( ( rule__Formal_parameter_section__VariableAssignment_1 ) ) | ( ( rule__Formal_parameter_section__ProcedureAssignment_2 ) ) | ( ( rule__Formal_parameter_section__FunctionAssignment_3 ) ) )
            int alt15=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt15=1;
                }
                break;
            case 35:
                {
                alt15=2;
                }
                break;
            case 36:
                {
                alt15=3;
                }
                break;
            case 34:
                {
                alt15=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalPascal.g:1907:2: ( ( rule__Formal_parameter_section__ValueAssignment_0 ) )
                    {
                    // InternalPascal.g:1907:2: ( ( rule__Formal_parameter_section__ValueAssignment_0 ) )
                    // InternalPascal.g:1908:3: ( rule__Formal_parameter_section__ValueAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFormal_parameter_sectionAccess().getValueAssignment_0()); 
                    }
                    // InternalPascal.g:1909:3: ( rule__Formal_parameter_section__ValueAssignment_0 )
                    // InternalPascal.g:1909:4: rule__Formal_parameter_section__ValueAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Formal_parameter_section__ValueAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFormal_parameter_sectionAccess().getValueAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1913:2: ( ( rule__Formal_parameter_section__VariableAssignment_1 ) )
                    {
                    // InternalPascal.g:1913:2: ( ( rule__Formal_parameter_section__VariableAssignment_1 ) )
                    // InternalPascal.g:1914:3: ( rule__Formal_parameter_section__VariableAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFormal_parameter_sectionAccess().getVariableAssignment_1()); 
                    }
                    // InternalPascal.g:1915:3: ( rule__Formal_parameter_section__VariableAssignment_1 )
                    // InternalPascal.g:1915:4: rule__Formal_parameter_section__VariableAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Formal_parameter_section__VariableAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFormal_parameter_sectionAccess().getVariableAssignment_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:1919:2: ( ( rule__Formal_parameter_section__ProcedureAssignment_2 ) )
                    {
                    // InternalPascal.g:1919:2: ( ( rule__Formal_parameter_section__ProcedureAssignment_2 ) )
                    // InternalPascal.g:1920:3: ( rule__Formal_parameter_section__ProcedureAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFormal_parameter_sectionAccess().getProcedureAssignment_2()); 
                    }
                    // InternalPascal.g:1921:3: ( rule__Formal_parameter_section__ProcedureAssignment_2 )
                    // InternalPascal.g:1921:4: rule__Formal_parameter_section__ProcedureAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Formal_parameter_section__ProcedureAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFormal_parameter_sectionAccess().getProcedureAssignment_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalPascal.g:1925:2: ( ( rule__Formal_parameter_section__FunctionAssignment_3 ) )
                    {
                    // InternalPascal.g:1925:2: ( ( rule__Formal_parameter_section__FunctionAssignment_3 ) )
                    // InternalPascal.g:1926:3: ( rule__Formal_parameter_section__FunctionAssignment_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFormal_parameter_sectionAccess().getFunctionAssignment_3()); 
                    }
                    // InternalPascal.g:1927:3: ( rule__Formal_parameter_section__FunctionAssignment_3 )
                    // InternalPascal.g:1927:4: rule__Formal_parameter_section__FunctionAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Formal_parameter_section__FunctionAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFormal_parameter_sectionAccess().getFunctionAssignment_3()); 
                    }

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
    // InternalPascal.g:1935:1: rule__Any_number__Alternatives : ( ( ruleunsigned_number ) | ( rulesigned_number ) );
    public final void rule__Any_number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1939:1: ( ( ruleunsigned_number ) | ( rulesigned_number ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_INTEGER_NUMBER||LA16_0==RULE_REAL_NUMBER) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_SIGNED_INTEGER_NUMBER||LA16_0==RULE_SIGNED_REAL_NUMBER) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalPascal.g:1940:2: ( ruleunsigned_number )
                    {
                    // InternalPascal.g:1940:2: ( ruleunsigned_number )
                    // InternalPascal.g:1941:3: ruleunsigned_number
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAny_numberAccess().getUnsigned_numberParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleunsigned_number();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAny_numberAccess().getUnsigned_numberParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1946:2: ( rulesigned_number )
                    {
                    // InternalPascal.g:1946:2: ( rulesigned_number )
                    // InternalPascal.g:1947:3: rulesigned_number
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAny_numberAccess().getSigned_numberParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulesigned_number();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAny_numberAccess().getSigned_numberParserRuleCall_1()); 
                    }

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
    // InternalPascal.g:1956:1: rule__Constant__Alternatives : ( ( ( rule__Constant__Group_0__0 ) ) | ( ( rule__Constant__StringAssignment_1 ) ) | ( ( rule__Constant__BoolLiteralAssignment_2 ) ) | ( ( rule__Constant__BoolLiteralAssignment_3 ) ) );
    public final void rule__Constant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1960:1: ( ( ( rule__Constant__Group_0__0 ) ) | ( ( rule__Constant__StringAssignment_1 ) ) | ( ( rule__Constant__BoolLiteralAssignment_2 ) ) | ( ( rule__Constant__BoolLiteralAssignment_3 ) ) )
            int alt17=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_SIGNED_INTEGER_NUMBER:
            case RULE_INTEGER_NUMBER:
            case RULE_ADDITION_OP:
            case RULE_SIGNED_REAL_NUMBER:
            case RULE_REAL_NUMBER:
                {
                alt17=1;
                }
                break;
            case RULE_STRING:
                {
                alt17=2;
                }
                break;
            case 52:
                {
                alt17=3;
                }
                break;
            case 53:
                {
                alt17=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalPascal.g:1961:2: ( ( rule__Constant__Group_0__0 ) )
                    {
                    // InternalPascal.g:1961:2: ( ( rule__Constant__Group_0__0 ) )
                    // InternalPascal.g:1962:3: ( rule__Constant__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConstantAccess().getGroup_0()); 
                    }
                    // InternalPascal.g:1963:3: ( rule__Constant__Group_0__0 )
                    // InternalPascal.g:1963:4: rule__Constant__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constant__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConstantAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1967:2: ( ( rule__Constant__StringAssignment_1 ) )
                    {
                    // InternalPascal.g:1967:2: ( ( rule__Constant__StringAssignment_1 ) )
                    // InternalPascal.g:1968:3: ( rule__Constant__StringAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConstantAccess().getStringAssignment_1()); 
                    }
                    // InternalPascal.g:1969:3: ( rule__Constant__StringAssignment_1 )
                    // InternalPascal.g:1969:4: rule__Constant__StringAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constant__StringAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConstantAccess().getStringAssignment_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:1973:2: ( ( rule__Constant__BoolLiteralAssignment_2 ) )
                    {
                    // InternalPascal.g:1973:2: ( ( rule__Constant__BoolLiteralAssignment_2 ) )
                    // InternalPascal.g:1974:3: ( rule__Constant__BoolLiteralAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConstantAccess().getBoolLiteralAssignment_2()); 
                    }
                    // InternalPascal.g:1975:3: ( rule__Constant__BoolLiteralAssignment_2 )
                    // InternalPascal.g:1975:4: rule__Constant__BoolLiteralAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constant__BoolLiteralAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConstantAccess().getBoolLiteralAssignment_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalPascal.g:1979:2: ( ( rule__Constant__BoolLiteralAssignment_3 ) )
                    {
                    // InternalPascal.g:1979:2: ( ( rule__Constant__BoolLiteralAssignment_3 ) )
                    // InternalPascal.g:1980:3: ( rule__Constant__BoolLiteralAssignment_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConstantAccess().getBoolLiteralAssignment_3()); 
                    }
                    // InternalPascal.g:1981:3: ( rule__Constant__BoolLiteralAssignment_3 )
                    // InternalPascal.g:1981:4: rule__Constant__BoolLiteralAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constant__BoolLiteralAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConstantAccess().getBoolLiteralAssignment_3()); 
                    }

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
    // InternalPascal.g:1989:1: rule__Constant__Alternatives_0_1 : ( ( ( rule__Constant__NameAssignment_0_1_0 ) ) | ( ( rule__Constant__NumberAssignment_0_1_1 ) ) );
    public final void rule__Constant__Alternatives_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1993:1: ( ( ( rule__Constant__NameAssignment_0_1_0 ) ) | ( ( rule__Constant__NumberAssignment_0_1_1 ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            else if ( ((LA18_0>=RULE_SIGNED_INTEGER_NUMBER && LA18_0<=RULE_INTEGER_NUMBER)||(LA18_0>=RULE_SIGNED_REAL_NUMBER && LA18_0<=RULE_REAL_NUMBER)) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalPascal.g:1994:2: ( ( rule__Constant__NameAssignment_0_1_0 ) )
                    {
                    // InternalPascal.g:1994:2: ( ( rule__Constant__NameAssignment_0_1_0 ) )
                    // InternalPascal.g:1995:3: ( rule__Constant__NameAssignment_0_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConstantAccess().getNameAssignment_0_1_0()); 
                    }
                    // InternalPascal.g:1996:3: ( rule__Constant__NameAssignment_0_1_0 )
                    // InternalPascal.g:1996:4: rule__Constant__NameAssignment_0_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constant__NameAssignment_0_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConstantAccess().getNameAssignment_0_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:2000:2: ( ( rule__Constant__NumberAssignment_0_1_1 ) )
                    {
                    // InternalPascal.g:2000:2: ( ( rule__Constant__NumberAssignment_0_1_1 ) )
                    // InternalPascal.g:2001:3: ( rule__Constant__NumberAssignment_0_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConstantAccess().getNumberAssignment_0_1_1()); 
                    }
                    // InternalPascal.g:2002:3: ( rule__Constant__NumberAssignment_0_1_1 )
                    // InternalPascal.g:2002:4: rule__Constant__NumberAssignment_0_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constant__NumberAssignment_0_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConstantAccess().getNumberAssignment_0_1_1()); 
                    }

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
    // InternalPascal.g:2010:1: rule__Type__Alternatives : ( ( ( rule__Type__SimpleAssignment_0 ) ) | ( ( rule__Type__StructuredAssignment_1 ) ) | ( ( rule__Type__PointerAssignment_2 ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2014:1: ( ( ( rule__Type__SimpleAssignment_0 ) ) | ( ( rule__Type__StructuredAssignment_1 ) ) | ( ( rule__Type__PointerAssignment_2 ) ) )
            int alt19=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_SIGNED_INTEGER_NUMBER:
            case RULE_INTEGER_NUMBER:
            case RULE_ADDITION_OP:
            case RULE_STRING:
            case RULE_NUMERIC_SUBRANGE:
            case RULE_SIGNED_REAL_NUMBER:
            case RULE_REAL_NUMBER:
            case 31:
            case 52:
            case 53:
                {
                alt19=1;
                }
                break;
            case 54:
            case 55:
                {
                alt19=2;
                }
                break;
            case 29:
                {
                alt19=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalPascal.g:2015:2: ( ( rule__Type__SimpleAssignment_0 ) )
                    {
                    // InternalPascal.g:2015:2: ( ( rule__Type__SimpleAssignment_0 ) )
                    // InternalPascal.g:2016:3: ( rule__Type__SimpleAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getSimpleAssignment_0()); 
                    }
                    // InternalPascal.g:2017:3: ( rule__Type__SimpleAssignment_0 )
                    // InternalPascal.g:2017:4: rule__Type__SimpleAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__SimpleAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getSimpleAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:2021:2: ( ( rule__Type__StructuredAssignment_1 ) )
                    {
                    // InternalPascal.g:2021:2: ( ( rule__Type__StructuredAssignment_1 ) )
                    // InternalPascal.g:2022:3: ( rule__Type__StructuredAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getStructuredAssignment_1()); 
                    }
                    // InternalPascal.g:2023:3: ( rule__Type__StructuredAssignment_1 )
                    // InternalPascal.g:2023:4: rule__Type__StructuredAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__StructuredAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getStructuredAssignment_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:2027:2: ( ( rule__Type__PointerAssignment_2 ) )
                    {
                    // InternalPascal.g:2027:2: ( ( rule__Type__PointerAssignment_2 ) )
                    // InternalPascal.g:2028:3: ( rule__Type__PointerAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getPointerAssignment_2()); 
                    }
                    // InternalPascal.g:2029:3: ( rule__Type__PointerAssignment_2 )
                    // InternalPascal.g:2029:4: rule__Type__PointerAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__PointerAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getPointerAssignment_2()); 
                    }

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
    // InternalPascal.g:2037:1: rule__Simple_type__Alternatives : ( ( ( rule__Simple_type__SubrangeAssignment_0 ) ) | ( ( rule__Simple_type__EnumeratedAssignment_1 ) ) | ( ( rule__Simple_type__NameAssignment_2 ) ) );
    public final void rule__Simple_type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2041:1: ( ( ( rule__Simple_type__SubrangeAssignment_0 ) ) | ( ( rule__Simple_type__EnumeratedAssignment_1 ) ) | ( ( rule__Simple_type__NameAssignment_2 ) ) )
            int alt20=3;
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
                alt20=1;
                }
                break;
            case RULE_ID:
                {
                int LA20_2 = input.LA(2);

                if ( (LA20_2==EOF||LA20_2==22||LA20_2==24||LA20_2==32) ) {
                    alt20=3;
                }
                else if ( (LA20_2==41) ) {
                    alt20=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 2, input);

                    throw nvae;
                }
                }
                break;
            case 31:
                {
                alt20=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalPascal.g:2042:2: ( ( rule__Simple_type__SubrangeAssignment_0 ) )
                    {
                    // InternalPascal.g:2042:2: ( ( rule__Simple_type__SubrangeAssignment_0 ) )
                    // InternalPascal.g:2043:3: ( rule__Simple_type__SubrangeAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimple_typeAccess().getSubrangeAssignment_0()); 
                    }
                    // InternalPascal.g:2044:3: ( rule__Simple_type__SubrangeAssignment_0 )
                    // InternalPascal.g:2044:4: rule__Simple_type__SubrangeAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Simple_type__SubrangeAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSimple_typeAccess().getSubrangeAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:2048:2: ( ( rule__Simple_type__EnumeratedAssignment_1 ) )
                    {
                    // InternalPascal.g:2048:2: ( ( rule__Simple_type__EnumeratedAssignment_1 ) )
                    // InternalPascal.g:2049:3: ( rule__Simple_type__EnumeratedAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimple_typeAccess().getEnumeratedAssignment_1()); 
                    }
                    // InternalPascal.g:2050:3: ( rule__Simple_type__EnumeratedAssignment_1 )
                    // InternalPascal.g:2050:4: rule__Simple_type__EnumeratedAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Simple_type__EnumeratedAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSimple_typeAccess().getEnumeratedAssignment_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:2054:2: ( ( rule__Simple_type__NameAssignment_2 ) )
                    {
                    // InternalPascal.g:2054:2: ( ( rule__Simple_type__NameAssignment_2 ) )
                    // InternalPascal.g:2055:3: ( rule__Simple_type__NameAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimple_typeAccess().getNameAssignment_2()); 
                    }
                    // InternalPascal.g:2056:3: ( rule__Simple_type__NameAssignment_2 )
                    // InternalPascal.g:2056:4: rule__Simple_type__NameAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Simple_type__NameAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSimple_typeAccess().getNameAssignment_2()); 
                    }

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
    // InternalPascal.g:2064:1: rule__Subrange_type__Alternatives : ( ( ( rule__Subrange_type__Group_0__0 ) ) | ( ( rule__Subrange_type__Group_1__0 ) ) );
    public final void rule__Subrange_type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2068:1: ( ( ( rule__Subrange_type__Group_0__0 ) ) | ( ( rule__Subrange_type__Group_1__0 ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_ID && LA21_0<=RULE_INTEGER_NUMBER)||LA21_0==RULE_ADDITION_OP||LA21_0==RULE_STRING||(LA21_0>=RULE_SIGNED_REAL_NUMBER && LA21_0<=RULE_REAL_NUMBER)||(LA21_0>=52 && LA21_0<=53)) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_NUMERIC_SUBRANGE) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalPascal.g:2069:2: ( ( rule__Subrange_type__Group_0__0 ) )
                    {
                    // InternalPascal.g:2069:2: ( ( rule__Subrange_type__Group_0__0 ) )
                    // InternalPascal.g:2070:3: ( rule__Subrange_type__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSubrange_typeAccess().getGroup_0()); 
                    }
                    // InternalPascal.g:2071:3: ( rule__Subrange_type__Group_0__0 )
                    // InternalPascal.g:2071:4: rule__Subrange_type__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Subrange_type__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSubrange_typeAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:2075:2: ( ( rule__Subrange_type__Group_1__0 ) )
                    {
                    // InternalPascal.g:2075:2: ( ( rule__Subrange_type__Group_1__0 ) )
                    // InternalPascal.g:2076:3: ( rule__Subrange_type__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSubrange_typeAccess().getGroup_1()); 
                    }
                    // InternalPascal.g:2077:3: ( rule__Subrange_type__Group_1__0 )
                    // InternalPascal.g:2077:4: rule__Subrange_type__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Subrange_type__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSubrange_typeAccess().getGroup_1()); 
                    }

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


    // $ANTLR start "rule__Field_list__Alternatives_0"
    // InternalPascal.g:2085:1: rule__Field_list__Alternatives_0 : ( ( ( rule__Field_list__Group_0_0__0 ) ) | ( ( rule__Field_list__VariantsAssignment_0_1 ) ) );
    public final void rule__Field_list__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2089:1: ( ( ( rule__Field_list__Group_0_0__0 ) ) | ( ( rule__Field_list__VariantsAssignment_0_1 ) ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                alt22=1;
            }
            else if ( (LA22_0==42) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalPascal.g:2090:2: ( ( rule__Field_list__Group_0_0__0 ) )
                    {
                    // InternalPascal.g:2090:2: ( ( rule__Field_list__Group_0_0__0 ) )
                    // InternalPascal.g:2091:3: ( rule__Field_list__Group_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getField_listAccess().getGroup_0_0()); 
                    }
                    // InternalPascal.g:2092:3: ( rule__Field_list__Group_0_0__0 )
                    // InternalPascal.g:2092:4: rule__Field_list__Group_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Field_list__Group_0_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getField_listAccess().getGroup_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:2096:2: ( ( rule__Field_list__VariantsAssignment_0_1 ) )
                    {
                    // InternalPascal.g:2096:2: ( ( rule__Field_list__VariantsAssignment_0_1 ) )
                    // InternalPascal.g:2097:3: ( rule__Field_list__VariantsAssignment_0_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getField_listAccess().getVariantsAssignment_0_1()); 
                    }
                    // InternalPascal.g:2098:3: ( rule__Field_list__VariantsAssignment_0_1 )
                    // InternalPascal.g:2098:4: rule__Field_list__VariantsAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Field_list__VariantsAssignment_0_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getField_listAccess().getVariantsAssignment_0_1()); 
                    }

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
    // $ANTLR end "rule__Field_list__Alternatives_0"


    // $ANTLR start "rule__Signed_number__Alternatives"
    // InternalPascal.g:2106:1: rule__Signed_number__Alternatives : ( ( ( rule__Signed_number__IntegerAssignment_0 ) ) | ( ( rule__Signed_number__RealAssignment_1 ) ) );
    public final void rule__Signed_number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2110:1: ( ( ( rule__Signed_number__IntegerAssignment_0 ) ) | ( ( rule__Signed_number__RealAssignment_1 ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_SIGNED_INTEGER_NUMBER) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_SIGNED_REAL_NUMBER) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalPascal.g:2111:2: ( ( rule__Signed_number__IntegerAssignment_0 ) )
                    {
                    // InternalPascal.g:2111:2: ( ( rule__Signed_number__IntegerAssignment_0 ) )
                    // InternalPascal.g:2112:3: ( rule__Signed_number__IntegerAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSigned_numberAccess().getIntegerAssignment_0()); 
                    }
                    // InternalPascal.g:2113:3: ( rule__Signed_number__IntegerAssignment_0 )
                    // InternalPascal.g:2113:4: rule__Signed_number__IntegerAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Signed_number__IntegerAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSigned_numberAccess().getIntegerAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:2117:2: ( ( rule__Signed_number__RealAssignment_1 ) )
                    {
                    // InternalPascal.g:2117:2: ( ( rule__Signed_number__RealAssignment_1 ) )
                    // InternalPascal.g:2118:3: ( rule__Signed_number__RealAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSigned_numberAccess().getRealAssignment_1()); 
                    }
                    // InternalPascal.g:2119:3: ( rule__Signed_number__RealAssignment_1 )
                    // InternalPascal.g:2119:4: rule__Signed_number__RealAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Signed_number__RealAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSigned_numberAccess().getRealAssignment_1()); 
                    }

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
    // InternalPascal.g:2127:1: rule__Unsigned_number__Alternatives : ( ( ( rule__Unsigned_number__IntegerAssignment_0 ) ) | ( ( rule__Unsigned_number__RealAssignment_1 ) ) );
    public final void rule__Unsigned_number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2131:1: ( ( ( rule__Unsigned_number__IntegerAssignment_0 ) ) | ( ( rule__Unsigned_number__RealAssignment_1 ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_INTEGER_NUMBER) ) {
                alt24=1;
            }
            else if ( (LA24_0==RULE_REAL_NUMBER) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalPascal.g:2132:2: ( ( rule__Unsigned_number__IntegerAssignment_0 ) )
                    {
                    // InternalPascal.g:2132:2: ( ( rule__Unsigned_number__IntegerAssignment_0 ) )
                    // InternalPascal.g:2133:3: ( rule__Unsigned_number__IntegerAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnsigned_numberAccess().getIntegerAssignment_0()); 
                    }
                    // InternalPascal.g:2134:3: ( rule__Unsigned_number__IntegerAssignment_0 )
                    // InternalPascal.g:2134:4: rule__Unsigned_number__IntegerAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Unsigned_number__IntegerAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnsigned_numberAccess().getIntegerAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:2138:2: ( ( rule__Unsigned_number__RealAssignment_1 ) )
                    {
                    // InternalPascal.g:2138:2: ( ( rule__Unsigned_number__RealAssignment_1 ) )
                    // InternalPascal.g:2139:3: ( rule__Unsigned_number__RealAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnsigned_numberAccess().getRealAssignment_1()); 
                    }
                    // InternalPascal.g:2140:3: ( rule__Unsigned_number__RealAssignment_1 )
                    // InternalPascal.g:2140:4: rule__Unsigned_number__RealAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Unsigned_number__RealAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnsigned_numberAccess().getRealAssignment_1()); 
                    }

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
    // InternalPascal.g:2148:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2152:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalPascal.g:2153:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Program__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Program__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:2160:1: rule__Program__Group__0__Impl : ( ( rule__Program__HeadingAssignment_0 ) ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2164:1: ( ( ( rule__Program__HeadingAssignment_0 ) ) )
            // InternalPascal.g:2165:1: ( ( rule__Program__HeadingAssignment_0 ) )
            {
            // InternalPascal.g:2165:1: ( ( rule__Program__HeadingAssignment_0 ) )
            // InternalPascal.g:2166:2: ( rule__Program__HeadingAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getHeadingAssignment_0()); 
            }
            // InternalPascal.g:2167:2: ( rule__Program__HeadingAssignment_0 )
            // InternalPascal.g:2167:3: rule__Program__HeadingAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Program__HeadingAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getHeadingAssignment_0()); 
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
    // $ANTLR end "rule__Program__Group__0__Impl"


    // $ANTLR start "rule__Program__Group__1"
    // InternalPascal.g:2175:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2179:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // InternalPascal.g:2180:2: rule__Program__Group__1__Impl rule__Program__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Program__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Program__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:2187:1: rule__Program__Group__1__Impl : ( ( rule__Program__BlockAssignment_1 ) ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2191:1: ( ( ( rule__Program__BlockAssignment_1 ) ) )
            // InternalPascal.g:2192:1: ( ( rule__Program__BlockAssignment_1 ) )
            {
            // InternalPascal.g:2192:1: ( ( rule__Program__BlockAssignment_1 ) )
            // InternalPascal.g:2193:2: ( rule__Program__BlockAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getBlockAssignment_1()); 
            }
            // InternalPascal.g:2194:2: ( rule__Program__BlockAssignment_1 )
            // InternalPascal.g:2194:3: rule__Program__BlockAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Program__BlockAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getBlockAssignment_1()); 
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
    // $ANTLR end "rule__Program__Group__1__Impl"


    // $ANTLR start "rule__Program__Group__2"
    // InternalPascal.g:2202:1: rule__Program__Group__2 : rule__Program__Group__2__Impl ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2206:1: ( rule__Program__Group__2__Impl )
            // InternalPascal.g:2207:2: rule__Program__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:2213:1: rule__Program__Group__2__Impl : ( '.' ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2217:1: ( ( '.' ) )
            // InternalPascal.g:2218:1: ( '.' )
            {
            // InternalPascal.g:2218:1: ( '.' )
            // InternalPascal.g:2219:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getFullStopKeyword_2()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getFullStopKeyword_2()); 
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
    // $ANTLR end "rule__Program__Group__2__Impl"


    // $ANTLR start "rule__Program_heading_block__Group__0"
    // InternalPascal.g:2229:1: rule__Program_heading_block__Group__0 : rule__Program_heading_block__Group__0__Impl rule__Program_heading_block__Group__1 ;
    public final void rule__Program_heading_block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2233:1: ( rule__Program_heading_block__Group__0__Impl rule__Program_heading_block__Group__1 )
            // InternalPascal.g:2234:2: rule__Program_heading_block__Group__0__Impl rule__Program_heading_block__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Program_heading_block__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Program_heading_block__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:2241:1: rule__Program_heading_block__Group__0__Impl : ( 'program' ) ;
    public final void rule__Program_heading_block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2245:1: ( ( 'program' ) )
            // InternalPascal.g:2246:1: ( 'program' )
            {
            // InternalPascal.g:2246:1: ( 'program' )
            // InternalPascal.g:2247:2: 'program'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgram_heading_blockAccess().getProgramKeyword_0()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgram_heading_blockAccess().getProgramKeyword_0()); 
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
    // $ANTLR end "rule__Program_heading_block__Group__0__Impl"


    // $ANTLR start "rule__Program_heading_block__Group__1"
    // InternalPascal.g:2256:1: rule__Program_heading_block__Group__1 : rule__Program_heading_block__Group__1__Impl rule__Program_heading_block__Group__2 ;
    public final void rule__Program_heading_block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2260:1: ( rule__Program_heading_block__Group__1__Impl rule__Program_heading_block__Group__2 )
            // InternalPascal.g:2261:2: rule__Program_heading_block__Group__1__Impl rule__Program_heading_block__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Program_heading_block__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Program_heading_block__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:2268:1: rule__Program_heading_block__Group__1__Impl : ( ( rule__Program_heading_block__NameAssignment_1 ) ) ;
    public final void rule__Program_heading_block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2272:1: ( ( ( rule__Program_heading_block__NameAssignment_1 ) ) )
            // InternalPascal.g:2273:1: ( ( rule__Program_heading_block__NameAssignment_1 ) )
            {
            // InternalPascal.g:2273:1: ( ( rule__Program_heading_block__NameAssignment_1 ) )
            // InternalPascal.g:2274:2: ( rule__Program_heading_block__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgram_heading_blockAccess().getNameAssignment_1()); 
            }
            // InternalPascal.g:2275:2: ( rule__Program_heading_block__NameAssignment_1 )
            // InternalPascal.g:2275:3: rule__Program_heading_block__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Program_heading_block__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgram_heading_blockAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__Program_heading_block__Group__1__Impl"


    // $ANTLR start "rule__Program_heading_block__Group__2"
    // InternalPascal.g:2283:1: rule__Program_heading_block__Group__2 : rule__Program_heading_block__Group__2__Impl ;
    public final void rule__Program_heading_block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2287:1: ( rule__Program_heading_block__Group__2__Impl )
            // InternalPascal.g:2288:2: rule__Program_heading_block__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program_heading_block__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:2294:1: rule__Program_heading_block__Group__2__Impl : ( ';' ) ;
    public final void rule__Program_heading_block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2298:1: ( ( ';' ) )
            // InternalPascal.g:2299:1: ( ';' )
            {
            // InternalPascal.g:2299:1: ( ';' )
            // InternalPascal.g:2300:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgram_heading_blockAccess().getSemicolonKeyword_2()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgram_heading_blockAccess().getSemicolonKeyword_2()); 
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
    // $ANTLR end "rule__Program_heading_block__Group__2__Impl"


    // $ANTLR start "rule__Block__Group__0"
    // InternalPascal.g:2310:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2314:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // InternalPascal.g:2315:2: rule__Block__Group__0__Impl rule__Block__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Block__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Block__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:2322:1: rule__Block__Group__0__Impl : ( ( rule__Block__LabelAssignment_0 )? ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2326:1: ( ( ( rule__Block__LabelAssignment_0 )? ) )
            // InternalPascal.g:2327:1: ( ( rule__Block__LabelAssignment_0 )? )
            {
            // InternalPascal.g:2327:1: ( ( rule__Block__LabelAssignment_0 )? )
            // InternalPascal.g:2328:2: ( rule__Block__LabelAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getLabelAssignment_0()); 
            }
            // InternalPascal.g:2329:2: ( rule__Block__LabelAssignment_0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==37) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalPascal.g:2329:3: rule__Block__LabelAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Block__LabelAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getLabelAssignment_0()); 
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
    // $ANTLR end "rule__Block__Group__0__Impl"


    // $ANTLR start "rule__Block__Group__1"
    // InternalPascal.g:2337:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2341:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // InternalPascal.g:2342:2: rule__Block__Group__1__Impl rule__Block__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Block__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Block__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:2349:1: rule__Block__Group__1__Impl : ( ( rule__Block__TypeAssignment_1 )? ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2353:1: ( ( ( rule__Block__TypeAssignment_1 )? ) )
            // InternalPascal.g:2354:1: ( ( rule__Block__TypeAssignment_1 )? )
            {
            // InternalPascal.g:2354:1: ( ( rule__Block__TypeAssignment_1 )? )
            // InternalPascal.g:2355:2: ( rule__Block__TypeAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getTypeAssignment_1()); 
            }
            // InternalPascal.g:2356:2: ( rule__Block__TypeAssignment_1 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==40) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalPascal.g:2356:3: rule__Block__TypeAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Block__TypeAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getTypeAssignment_1()); 
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
    // $ANTLR end "rule__Block__Group__1__Impl"


    // $ANTLR start "rule__Block__Group__2"
    // InternalPascal.g:2364:1: rule__Block__Group__2 : rule__Block__Group__2__Impl rule__Block__Group__3 ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2368:1: ( rule__Block__Group__2__Impl rule__Block__Group__3 )
            // InternalPascal.g:2369:2: rule__Block__Group__2__Impl rule__Block__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Block__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Block__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:2376:1: rule__Block__Group__2__Impl : ( ( rule__Block__VariableAssignment_2 )? ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2380:1: ( ( ( rule__Block__VariableAssignment_2 )? ) )
            // InternalPascal.g:2381:1: ( ( rule__Block__VariableAssignment_2 )? )
            {
            // InternalPascal.g:2381:1: ( ( rule__Block__VariableAssignment_2 )? )
            // InternalPascal.g:2382:2: ( rule__Block__VariableAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getVariableAssignment_2()); 
            }
            // InternalPascal.g:2383:2: ( rule__Block__VariableAssignment_2 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==35) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalPascal.g:2383:3: rule__Block__VariableAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Block__VariableAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getVariableAssignment_2()); 
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
    // $ANTLR end "rule__Block__Group__2__Impl"


    // $ANTLR start "rule__Block__Group__3"
    // InternalPascal.g:2391:1: rule__Block__Group__3 : rule__Block__Group__3__Impl rule__Block__Group__4 ;
    public final void rule__Block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2395:1: ( rule__Block__Group__3__Impl rule__Block__Group__4 )
            // InternalPascal.g:2396:2: rule__Block__Group__3__Impl rule__Block__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Block__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Block__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:2403:1: rule__Block__Group__3__Impl : ( ( rule__Block__ConstantAssignment_3 )? ) ;
    public final void rule__Block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2407:1: ( ( ( rule__Block__ConstantAssignment_3 )? ) )
            // InternalPascal.g:2408:1: ( ( rule__Block__ConstantAssignment_3 )? )
            {
            // InternalPascal.g:2408:1: ( ( rule__Block__ConstantAssignment_3 )? )
            // InternalPascal.g:2409:2: ( rule__Block__ConstantAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getConstantAssignment_3()); 
            }
            // InternalPascal.g:2410:2: ( rule__Block__ConstantAssignment_3 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==38) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalPascal.g:2410:3: rule__Block__ConstantAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Block__ConstantAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getConstantAssignment_3()); 
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
    // $ANTLR end "rule__Block__Group__3__Impl"


    // $ANTLR start "rule__Block__Group__4"
    // InternalPascal.g:2418:1: rule__Block__Group__4 : rule__Block__Group__4__Impl rule__Block__Group__5 ;
    public final void rule__Block__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2422:1: ( rule__Block__Group__4__Impl rule__Block__Group__5 )
            // InternalPascal.g:2423:2: rule__Block__Group__4__Impl rule__Block__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Block__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Block__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:2430:1: rule__Block__Group__4__Impl : ( ( rule__Block__AbstractionAssignment_4 )? ) ;
    public final void rule__Block__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2434:1: ( ( ( rule__Block__AbstractionAssignment_4 )? ) )
            // InternalPascal.g:2435:1: ( ( rule__Block__AbstractionAssignment_4 )? )
            {
            // InternalPascal.g:2435:1: ( ( rule__Block__AbstractionAssignment_4 )? )
            // InternalPascal.g:2436:2: ( rule__Block__AbstractionAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getAbstractionAssignment_4()); 
            }
            // InternalPascal.g:2437:2: ( rule__Block__AbstractionAssignment_4 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==34||LA29_0==36) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalPascal.g:2437:3: rule__Block__AbstractionAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Block__AbstractionAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getAbstractionAssignment_4()); 
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
    // $ANTLR end "rule__Block__Group__4__Impl"


    // $ANTLR start "rule__Block__Group__5"
    // InternalPascal.g:2445:1: rule__Block__Group__5 : rule__Block__Group__5__Impl ;
    public final void rule__Block__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2449:1: ( rule__Block__Group__5__Impl )
            // InternalPascal.g:2450:2: rule__Block__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Block__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:2456:1: rule__Block__Group__5__Impl : ( ( rule__Block__StatementAssignment_5 ) ) ;
    public final void rule__Block__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2460:1: ( ( ( rule__Block__StatementAssignment_5 ) ) )
            // InternalPascal.g:2461:1: ( ( rule__Block__StatementAssignment_5 ) )
            {
            // InternalPascal.g:2461:1: ( ( rule__Block__StatementAssignment_5 ) )
            // InternalPascal.g:2462:2: ( rule__Block__StatementAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getStatementAssignment_5()); 
            }
            // InternalPascal.g:2463:2: ( rule__Block__StatementAssignment_5 )
            // InternalPascal.g:2463:3: rule__Block__StatementAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Block__StatementAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getStatementAssignment_5()); 
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
    // $ANTLR end "rule__Block__Group__5__Impl"


    // $ANTLR start "rule__Statement_part__Group__0"
    // InternalPascal.g:2472:1: rule__Statement_part__Group__0 : rule__Statement_part__Group__0__Impl rule__Statement_part__Group__1 ;
    public final void rule__Statement_part__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2476:1: ( rule__Statement_part__Group__0__Impl rule__Statement_part__Group__1 )
            // InternalPascal.g:2477:2: rule__Statement_part__Group__0__Impl rule__Statement_part__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Statement_part__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Statement_part__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:2484:1: rule__Statement_part__Group__0__Impl : ( 'begin' ) ;
    public final void rule__Statement_part__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2488:1: ( ( 'begin' ) )
            // InternalPascal.g:2489:1: ( 'begin' )
            {
            // InternalPascal.g:2489:1: ( 'begin' )
            // InternalPascal.g:2490:2: 'begin'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatement_partAccess().getBeginKeyword_0()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatement_partAccess().getBeginKeyword_0()); 
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
    // $ANTLR end "rule__Statement_part__Group__0__Impl"


    // $ANTLR start "rule__Statement_part__Group__1"
    // InternalPascal.g:2499:1: rule__Statement_part__Group__1 : rule__Statement_part__Group__1__Impl rule__Statement_part__Group__2 ;
    public final void rule__Statement_part__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2503:1: ( rule__Statement_part__Group__1__Impl rule__Statement_part__Group__2 )
            // InternalPascal.g:2504:2: rule__Statement_part__Group__1__Impl rule__Statement_part__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Statement_part__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Statement_part__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:2511:1: rule__Statement_part__Group__1__Impl : ( ( rule__Statement_part__SequenceAssignment_1 ) ) ;
    public final void rule__Statement_part__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2515:1: ( ( ( rule__Statement_part__SequenceAssignment_1 ) ) )
            // InternalPascal.g:2516:1: ( ( rule__Statement_part__SequenceAssignment_1 ) )
            {
            // InternalPascal.g:2516:1: ( ( rule__Statement_part__SequenceAssignment_1 ) )
            // InternalPascal.g:2517:2: ( rule__Statement_part__SequenceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatement_partAccess().getSequenceAssignment_1()); 
            }
            // InternalPascal.g:2518:2: ( rule__Statement_part__SequenceAssignment_1 )
            // InternalPascal.g:2518:3: rule__Statement_part__SequenceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Statement_part__SequenceAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatement_partAccess().getSequenceAssignment_1()); 
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
    // $ANTLR end "rule__Statement_part__Group__1__Impl"


    // $ANTLR start "rule__Statement_part__Group__2"
    // InternalPascal.g:2526:1: rule__Statement_part__Group__2 : rule__Statement_part__Group__2__Impl ;
    public final void rule__Statement_part__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2530:1: ( rule__Statement_part__Group__2__Impl )
            // InternalPascal.g:2531:2: rule__Statement_part__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement_part__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:2537:1: rule__Statement_part__Group__2__Impl : ( 'end' ) ;
    public final void rule__Statement_part__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2541:1: ( ( 'end' ) )
            // InternalPascal.g:2542:1: ( 'end' )
            {
            // InternalPascal.g:2542:1: ( 'end' )
            // InternalPascal.g:2543:2: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatement_partAccess().getEndKeyword_2()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatement_partAccess().getEndKeyword_2()); 
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
    // $ANTLR end "rule__Statement_part__Group__2__Impl"


    // $ANTLR start "rule__Statement_sequence__Group__0"
    // InternalPascal.g:2553:1: rule__Statement_sequence__Group__0 : rule__Statement_sequence__Group__0__Impl rule__Statement_sequence__Group__1 ;
    public final void rule__Statement_sequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2557:1: ( rule__Statement_sequence__Group__0__Impl rule__Statement_sequence__Group__1 )
            // InternalPascal.g:2558:2: rule__Statement_sequence__Group__0__Impl rule__Statement_sequence__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Statement_sequence__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Statement_sequence__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:2565:1: rule__Statement_sequence__Group__0__Impl : ( ( rule__Statement_sequence__StatementsAssignment_0 ) ) ;
    public final void rule__Statement_sequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2569:1: ( ( ( rule__Statement_sequence__StatementsAssignment_0 ) ) )
            // InternalPascal.g:2570:1: ( ( rule__Statement_sequence__StatementsAssignment_0 ) )
            {
            // InternalPascal.g:2570:1: ( ( rule__Statement_sequence__StatementsAssignment_0 ) )
            // InternalPascal.g:2571:2: ( rule__Statement_sequence__StatementsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatement_sequenceAccess().getStatementsAssignment_0()); 
            }
            // InternalPascal.g:2572:2: ( rule__Statement_sequence__StatementsAssignment_0 )
            // InternalPascal.g:2572:3: rule__Statement_sequence__StatementsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Statement_sequence__StatementsAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatement_sequenceAccess().getStatementsAssignment_0()); 
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
    // $ANTLR end "rule__Statement_sequence__Group__0__Impl"


    // $ANTLR start "rule__Statement_sequence__Group__1"
    // InternalPascal.g:2580:1: rule__Statement_sequence__Group__1 : rule__Statement_sequence__Group__1__Impl ;
    public final void rule__Statement_sequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2584:1: ( rule__Statement_sequence__Group__1__Impl )
            // InternalPascal.g:2585:2: rule__Statement_sequence__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement_sequence__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:2591:1: rule__Statement_sequence__Group__1__Impl : ( ( rule__Statement_sequence__Group_1__0 )* ) ;
    public final void rule__Statement_sequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2595:1: ( ( ( rule__Statement_sequence__Group_1__0 )* ) )
            // InternalPascal.g:2596:1: ( ( rule__Statement_sequence__Group_1__0 )* )
            {
            // InternalPascal.g:2596:1: ( ( rule__Statement_sequence__Group_1__0 )* )
            // InternalPascal.g:2597:2: ( rule__Statement_sequence__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatement_sequenceAccess().getGroup_1()); 
            }
            // InternalPascal.g:2598:2: ( rule__Statement_sequence__Group_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==22) ) {
                    int LA30_2 = input.LA(2);

                    if ( (synpred49_InternalPascal()) ) {
                        alt30=1;
                    }


                }


                switch (alt30) {
            	case 1 :
            	    // InternalPascal.g:2598:3: rule__Statement_sequence__Group_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Statement_sequence__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatement_sequenceAccess().getGroup_1()); 
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
    // $ANTLR end "rule__Statement_sequence__Group__1__Impl"


    // $ANTLR start "rule__Statement_sequence__Group_1__0"
    // InternalPascal.g:2607:1: rule__Statement_sequence__Group_1__0 : rule__Statement_sequence__Group_1__0__Impl rule__Statement_sequence__Group_1__1 ;
    public final void rule__Statement_sequence__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2611:1: ( rule__Statement_sequence__Group_1__0__Impl rule__Statement_sequence__Group_1__1 )
            // InternalPascal.g:2612:2: rule__Statement_sequence__Group_1__0__Impl rule__Statement_sequence__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Statement_sequence__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Statement_sequence__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:2619:1: rule__Statement_sequence__Group_1__0__Impl : ( ';' ) ;
    public final void rule__Statement_sequence__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2623:1: ( ( ';' ) )
            // InternalPascal.g:2624:1: ( ';' )
            {
            // InternalPascal.g:2624:1: ( ';' )
            // InternalPascal.g:2625:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatement_sequenceAccess().getSemicolonKeyword_1_0()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatement_sequenceAccess().getSemicolonKeyword_1_0()); 
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
    // $ANTLR end "rule__Statement_sequence__Group_1__0__Impl"


    // $ANTLR start "rule__Statement_sequence__Group_1__1"
    // InternalPascal.g:2634:1: rule__Statement_sequence__Group_1__1 : rule__Statement_sequence__Group_1__1__Impl ;
    public final void rule__Statement_sequence__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2638:1: ( rule__Statement_sequence__Group_1__1__Impl )
            // InternalPascal.g:2639:2: rule__Statement_sequence__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement_sequence__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:2645:1: rule__Statement_sequence__Group_1__1__Impl : ( ( rule__Statement_sequence__StatementsAssignment_1_1 ) ) ;
    public final void rule__Statement_sequence__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2649:1: ( ( ( rule__Statement_sequence__StatementsAssignment_1_1 ) ) )
            // InternalPascal.g:2650:1: ( ( rule__Statement_sequence__StatementsAssignment_1_1 ) )
            {
            // InternalPascal.g:2650:1: ( ( rule__Statement_sequence__StatementsAssignment_1_1 ) )
            // InternalPascal.g:2651:2: ( rule__Statement_sequence__StatementsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatement_sequenceAccess().getStatementsAssignment_1_1()); 
            }
            // InternalPascal.g:2652:2: ( rule__Statement_sequence__StatementsAssignment_1_1 )
            // InternalPascal.g:2652:3: rule__Statement_sequence__StatementsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Statement_sequence__StatementsAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatement_sequenceAccess().getStatementsAssignment_1_1()); 
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
    // $ANTLR end "rule__Statement_sequence__Group_1__1__Impl"


    // $ANTLR start "rule__Statement__Group__0"
    // InternalPascal.g:2661:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2665:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // InternalPascal.g:2666:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Statement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Statement__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:2673:1: rule__Statement__Group__0__Impl : ( ( rule__Statement__Group_0__0 )? ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2677:1: ( ( ( rule__Statement__Group_0__0 )? ) )
            // InternalPascal.g:2678:1: ( ( rule__Statement__Group_0__0 )? )
            {
            // InternalPascal.g:2678:1: ( ( rule__Statement__Group_0__0 )? )
            // InternalPascal.g:2679:2: ( rule__Statement__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getGroup_0()); 
            }
            // InternalPascal.g:2680:2: ( rule__Statement__Group_0__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=RULE_SIGNED_INTEGER_NUMBER && LA31_0<=RULE_INTEGER_NUMBER)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalPascal.g:2680:3: rule__Statement__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getGroup_0()); 
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
    // $ANTLR end "rule__Statement__Group__0__Impl"


    // $ANTLR start "rule__Statement__Group__1"
    // InternalPascal.g:2688:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2692:1: ( rule__Statement__Group__1__Impl )
            // InternalPascal.g:2693:2: rule__Statement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:2699:1: rule__Statement__Group__1__Impl : ( ( rule__Statement__Alternatives_1 ) ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2703:1: ( ( ( rule__Statement__Alternatives_1 ) ) )
            // InternalPascal.g:2704:1: ( ( rule__Statement__Alternatives_1 ) )
            {
            // InternalPascal.g:2704:1: ( ( rule__Statement__Alternatives_1 ) )
            // InternalPascal.g:2705:2: ( rule__Statement__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getAlternatives_1()); 
            }
            // InternalPascal.g:2706:2: ( rule__Statement__Alternatives_1 )
            // InternalPascal.g:2706:3: rule__Statement__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getAlternatives_1()); 
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
    // $ANTLR end "rule__Statement__Group__1__Impl"


    // $ANTLR start "rule__Statement__Group_0__0"
    // InternalPascal.g:2715:1: rule__Statement__Group_0__0 : rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 ;
    public final void rule__Statement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2719:1: ( rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 )
            // InternalPascal.g:2720:2: rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1
            {
            pushFollow(FOLLOW_11);
            rule__Statement__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Statement__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:2727:1: rule__Statement__Group_0__0__Impl : ( ( rule__Statement__LabelAssignment_0_0 ) ) ;
    public final void rule__Statement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2731:1: ( ( ( rule__Statement__LabelAssignment_0_0 ) ) )
            // InternalPascal.g:2732:1: ( ( rule__Statement__LabelAssignment_0_0 ) )
            {
            // InternalPascal.g:2732:1: ( ( rule__Statement__LabelAssignment_0_0 ) )
            // InternalPascal.g:2733:2: ( rule__Statement__LabelAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getLabelAssignment_0_0()); 
            }
            // InternalPascal.g:2734:2: ( rule__Statement__LabelAssignment_0_0 )
            // InternalPascal.g:2734:3: rule__Statement__LabelAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Statement__LabelAssignment_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getLabelAssignment_0_0()); 
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
    // $ANTLR end "rule__Statement__Group_0__0__Impl"


    // $ANTLR start "rule__Statement__Group_0__1"
    // InternalPascal.g:2742:1: rule__Statement__Group_0__1 : rule__Statement__Group_0__1__Impl ;
    public final void rule__Statement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2746:1: ( rule__Statement__Group_0__1__Impl )
            // InternalPascal.g:2747:2: rule__Statement__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:2753:1: rule__Statement__Group_0__1__Impl : ( ':' ) ;
    public final void rule__Statement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2757:1: ( ( ':' ) )
            // InternalPascal.g:2758:1: ( ':' )
            {
            // InternalPascal.g:2758:1: ( ':' )
            // InternalPascal.g:2759:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getColonKeyword_0_1()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getColonKeyword_0_1()); 
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
    // $ANTLR end "rule__Statement__Group_0__1__Impl"


    // $ANTLR start "rule__Compound_statement__Group__0"
    // InternalPascal.g:2769:1: rule__Compound_statement__Group__0 : rule__Compound_statement__Group__0__Impl rule__Compound_statement__Group__1 ;
    public final void rule__Compound_statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2773:1: ( rule__Compound_statement__Group__0__Impl rule__Compound_statement__Group__1 )
            // InternalPascal.g:2774:2: rule__Compound_statement__Group__0__Impl rule__Compound_statement__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Compound_statement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Compound_statement__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compound_statement__Group__0"


    // $ANTLR start "rule__Compound_statement__Group__0__Impl"
    // InternalPascal.g:2781:1: rule__Compound_statement__Group__0__Impl : ( 'begin' ) ;
    public final void rule__Compound_statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2785:1: ( ( 'begin' ) )
            // InternalPascal.g:2786:1: ( 'begin' )
            {
            // InternalPascal.g:2786:1: ( 'begin' )
            // InternalPascal.g:2787:2: 'begin'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompound_statementAccess().getBeginKeyword_0()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompound_statementAccess().getBeginKeyword_0()); 
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
    // $ANTLR end "rule__Compound_statement__Group__0__Impl"


    // $ANTLR start "rule__Compound_statement__Group__1"
    // InternalPascal.g:2796:1: rule__Compound_statement__Group__1 : rule__Compound_statement__Group__1__Impl rule__Compound_statement__Group__2 ;
    public final void rule__Compound_statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2800:1: ( rule__Compound_statement__Group__1__Impl rule__Compound_statement__Group__2 )
            // InternalPascal.g:2801:2: rule__Compound_statement__Group__1__Impl rule__Compound_statement__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Compound_statement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Compound_statement__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compound_statement__Group__1"


    // $ANTLR start "rule__Compound_statement__Group__1__Impl"
    // InternalPascal.g:2808:1: rule__Compound_statement__Group__1__Impl : ( ( rule__Compound_statement__SequenceAssignment_1 ) ) ;
    public final void rule__Compound_statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2812:1: ( ( ( rule__Compound_statement__SequenceAssignment_1 ) ) )
            // InternalPascal.g:2813:1: ( ( rule__Compound_statement__SequenceAssignment_1 ) )
            {
            // InternalPascal.g:2813:1: ( ( rule__Compound_statement__SequenceAssignment_1 ) )
            // InternalPascal.g:2814:2: ( rule__Compound_statement__SequenceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompound_statementAccess().getSequenceAssignment_1()); 
            }
            // InternalPascal.g:2815:2: ( rule__Compound_statement__SequenceAssignment_1 )
            // InternalPascal.g:2815:3: rule__Compound_statement__SequenceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Compound_statement__SequenceAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompound_statementAccess().getSequenceAssignment_1()); 
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
    // $ANTLR end "rule__Compound_statement__Group__1__Impl"


    // $ANTLR start "rule__Compound_statement__Group__2"
    // InternalPascal.g:2823:1: rule__Compound_statement__Group__2 : rule__Compound_statement__Group__2__Impl ;
    public final void rule__Compound_statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2827:1: ( rule__Compound_statement__Group__2__Impl )
            // InternalPascal.g:2828:2: rule__Compound_statement__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Compound_statement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compound_statement__Group__2"


    // $ANTLR start "rule__Compound_statement__Group__2__Impl"
    // InternalPascal.g:2834:1: rule__Compound_statement__Group__2__Impl : ( 'end' ) ;
    public final void rule__Compound_statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2838:1: ( ( 'end' ) )
            // InternalPascal.g:2839:1: ( 'end' )
            {
            // InternalPascal.g:2839:1: ( 'end' )
            // InternalPascal.g:2840:2: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompound_statementAccess().getEndKeyword_2()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompound_statementAccess().getEndKeyword_2()); 
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
    // $ANTLR end "rule__Compound_statement__Group__2__Impl"


    // $ANTLR start "rule__Assignment_statement__Group__0"
    // InternalPascal.g:2850:1: rule__Assignment_statement__Group__0 : rule__Assignment_statement__Group__0__Impl rule__Assignment_statement__Group__1 ;
    public final void rule__Assignment_statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2854:1: ( rule__Assignment_statement__Group__0__Impl rule__Assignment_statement__Group__1 )
            // InternalPascal.g:2855:2: rule__Assignment_statement__Group__0__Impl rule__Assignment_statement__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Assignment_statement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Assignment_statement__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:2862:1: rule__Assignment_statement__Group__0__Impl : ( ( rule__Assignment_statement__VariableAssignment_0 ) ) ;
    public final void rule__Assignment_statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2866:1: ( ( ( rule__Assignment_statement__VariableAssignment_0 ) ) )
            // InternalPascal.g:2867:1: ( ( rule__Assignment_statement__VariableAssignment_0 ) )
            {
            // InternalPascal.g:2867:1: ( ( rule__Assignment_statement__VariableAssignment_0 ) )
            // InternalPascal.g:2868:2: ( rule__Assignment_statement__VariableAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignment_statementAccess().getVariableAssignment_0()); 
            }
            // InternalPascal.g:2869:2: ( rule__Assignment_statement__VariableAssignment_0 )
            // InternalPascal.g:2869:3: rule__Assignment_statement__VariableAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Assignment_statement__VariableAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignment_statementAccess().getVariableAssignment_0()); 
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
    // $ANTLR end "rule__Assignment_statement__Group__0__Impl"


    // $ANTLR start "rule__Assignment_statement__Group__1"
    // InternalPascal.g:2877:1: rule__Assignment_statement__Group__1 : rule__Assignment_statement__Group__1__Impl rule__Assignment_statement__Group__2 ;
    public final void rule__Assignment_statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2881:1: ( rule__Assignment_statement__Group__1__Impl rule__Assignment_statement__Group__2 )
            // InternalPascal.g:2882:2: rule__Assignment_statement__Group__1__Impl rule__Assignment_statement__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Assignment_statement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Assignment_statement__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:2889:1: rule__Assignment_statement__Group__1__Impl : ( ':=' ) ;
    public final void rule__Assignment_statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2893:1: ( ( ':=' ) )
            // InternalPascal.g:2894:1: ( ':=' )
            {
            // InternalPascal.g:2894:1: ( ':=' )
            // InternalPascal.g:2895:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignment_statementAccess().getColonEqualsSignKeyword_1()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignment_statementAccess().getColonEqualsSignKeyword_1()); 
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
    // $ANTLR end "rule__Assignment_statement__Group__1__Impl"


    // $ANTLR start "rule__Assignment_statement__Group__2"
    // InternalPascal.g:2904:1: rule__Assignment_statement__Group__2 : rule__Assignment_statement__Group__2__Impl ;
    public final void rule__Assignment_statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2908:1: ( rule__Assignment_statement__Group__2__Impl )
            // InternalPascal.g:2909:2: rule__Assignment_statement__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assignment_statement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:2915:1: rule__Assignment_statement__Group__2__Impl : ( ( rule__Assignment_statement__ExpressionAssignment_2 ) ) ;
    public final void rule__Assignment_statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2919:1: ( ( ( rule__Assignment_statement__ExpressionAssignment_2 ) ) )
            // InternalPascal.g:2920:1: ( ( rule__Assignment_statement__ExpressionAssignment_2 ) )
            {
            // InternalPascal.g:2920:1: ( ( rule__Assignment_statement__ExpressionAssignment_2 ) )
            // InternalPascal.g:2921:2: ( rule__Assignment_statement__ExpressionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignment_statementAccess().getExpressionAssignment_2()); 
            }
            // InternalPascal.g:2922:2: ( rule__Assignment_statement__ExpressionAssignment_2 )
            // InternalPascal.g:2922:3: rule__Assignment_statement__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Assignment_statement__ExpressionAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignment_statementAccess().getExpressionAssignment_2()); 
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
    // $ANTLR end "rule__Assignment_statement__Group__2__Impl"


    // $ANTLR start "rule__Variable__Group__0"
    // InternalPascal.g:2931:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2935:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalPascal.g:2936:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Variable__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Variable__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:2943:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__NameAssignment_0 ) ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2947:1: ( ( ( rule__Variable__NameAssignment_0 ) ) )
            // InternalPascal.g:2948:1: ( ( rule__Variable__NameAssignment_0 ) )
            {
            // InternalPascal.g:2948:1: ( ( rule__Variable__NameAssignment_0 ) )
            // InternalPascal.g:2949:2: ( rule__Variable__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getNameAssignment_0()); 
            }
            // InternalPascal.g:2950:2: ( rule__Variable__NameAssignment_0 )
            // InternalPascal.g:2950:3: rule__Variable__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getNameAssignment_0()); 
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
    // $ANTLR end "rule__Variable__Group__0__Impl"


    // $ANTLR start "rule__Variable__Group__1"
    // InternalPascal.g:2958:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2962:1: ( rule__Variable__Group__1__Impl )
            // InternalPascal.g:2963:2: rule__Variable__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:2969:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__VariableAssignment_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2973:1: ( ( ( rule__Variable__VariableAssignment_1 ) ) )
            // InternalPascal.g:2974:1: ( ( rule__Variable__VariableAssignment_1 ) )
            {
            // InternalPascal.g:2974:1: ( ( rule__Variable__VariableAssignment_1 ) )
            // InternalPascal.g:2975:2: ( rule__Variable__VariableAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getVariableAssignment_1()); 
            }
            // InternalPascal.g:2976:2: ( rule__Variable__VariableAssignment_1 )
            // InternalPascal.g:2976:3: rule__Variable__VariableAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Variable__VariableAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getVariableAssignment_1()); 
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
    // $ANTLR end "rule__Variable__Group__1__Impl"


    // $ANTLR start "rule__Var___Group_0__0"
    // InternalPascal.g:2985:1: rule__Var___Group_0__0 : rule__Var___Group_0__0__Impl rule__Var___Group_0__1 ;
    public final void rule__Var___Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2989:1: ( rule__Var___Group_0__0__Impl rule__Var___Group_0__1 )
            // InternalPascal.g:2990:2: rule__Var___Group_0__0__Impl rule__Var___Group_0__1
            {
            pushFollow(FOLLOW_13);
            rule__Var___Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Var___Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:2997:1: rule__Var___Group_0__0__Impl : ( '[' ) ;
    public final void rule__Var___Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3001:1: ( ( '[' ) )
            // InternalPascal.g:3002:1: ( '[' )
            {
            // InternalPascal.g:3002:1: ( '[' )
            // InternalPascal.g:3003:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_Access().getLeftSquareBracketKeyword_0_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_Access().getLeftSquareBracketKeyword_0_0()); 
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
    // $ANTLR end "rule__Var___Group_0__0__Impl"


    // $ANTLR start "rule__Var___Group_0__1"
    // InternalPascal.g:3012:1: rule__Var___Group_0__1 : rule__Var___Group_0__1__Impl rule__Var___Group_0__2 ;
    public final void rule__Var___Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3016:1: ( rule__Var___Group_0__1__Impl rule__Var___Group_0__2 )
            // InternalPascal.g:3017:2: rule__Var___Group_0__1__Impl rule__Var___Group_0__2
            {
            pushFollow(FOLLOW_15);
            rule__Var___Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Var___Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:3024:1: rule__Var___Group_0__1__Impl : ( ( rule__Var___ExpressionsAssignment_0_1 ) ) ;
    public final void rule__Var___Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3028:1: ( ( ( rule__Var___ExpressionsAssignment_0_1 ) ) )
            // InternalPascal.g:3029:1: ( ( rule__Var___ExpressionsAssignment_0_1 ) )
            {
            // InternalPascal.g:3029:1: ( ( rule__Var___ExpressionsAssignment_0_1 ) )
            // InternalPascal.g:3030:2: ( rule__Var___ExpressionsAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_Access().getExpressionsAssignment_0_1()); 
            }
            // InternalPascal.g:3031:2: ( rule__Var___ExpressionsAssignment_0_1 )
            // InternalPascal.g:3031:3: rule__Var___ExpressionsAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Var___ExpressionsAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_Access().getExpressionsAssignment_0_1()); 
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
    // $ANTLR end "rule__Var___Group_0__1__Impl"


    // $ANTLR start "rule__Var___Group_0__2"
    // InternalPascal.g:3039:1: rule__Var___Group_0__2 : rule__Var___Group_0__2__Impl rule__Var___Group_0__3 ;
    public final void rule__Var___Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3043:1: ( rule__Var___Group_0__2__Impl rule__Var___Group_0__3 )
            // InternalPascal.g:3044:2: rule__Var___Group_0__2__Impl rule__Var___Group_0__3
            {
            pushFollow(FOLLOW_14);
            rule__Var___Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Var___Group_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:3051:1: rule__Var___Group_0__2__Impl : ( ']' ) ;
    public final void rule__Var___Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3055:1: ( ( ']' ) )
            // InternalPascal.g:3056:1: ( ']' )
            {
            // InternalPascal.g:3056:1: ( ']' )
            // InternalPascal.g:3057:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_Access().getRightSquareBracketKeyword_0_2()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_Access().getRightSquareBracketKeyword_0_2()); 
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
    // $ANTLR end "rule__Var___Group_0__2__Impl"


    // $ANTLR start "rule__Var___Group_0__3"
    // InternalPascal.g:3066:1: rule__Var___Group_0__3 : rule__Var___Group_0__3__Impl ;
    public final void rule__Var___Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3070:1: ( rule__Var___Group_0__3__Impl )
            // InternalPascal.g:3071:2: rule__Var___Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Var___Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:3077:1: rule__Var___Group_0__3__Impl : ( ( rule__Var___ArrayAssignment_0_3 ) ) ;
    public final void rule__Var___Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3081:1: ( ( ( rule__Var___ArrayAssignment_0_3 ) ) )
            // InternalPascal.g:3082:1: ( ( rule__Var___ArrayAssignment_0_3 ) )
            {
            // InternalPascal.g:3082:1: ( ( rule__Var___ArrayAssignment_0_3 ) )
            // InternalPascal.g:3083:2: ( rule__Var___ArrayAssignment_0_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_Access().getArrayAssignment_0_3()); 
            }
            // InternalPascal.g:3084:2: ( rule__Var___ArrayAssignment_0_3 )
            // InternalPascal.g:3084:3: rule__Var___ArrayAssignment_0_3
            {
            pushFollow(FOLLOW_2);
            rule__Var___ArrayAssignment_0_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_Access().getArrayAssignment_0_3()); 
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
    // $ANTLR end "rule__Var___Group_0__3__Impl"


    // $ANTLR start "rule__Var___Group_1__0"
    // InternalPascal.g:3093:1: rule__Var___Group_1__0 : rule__Var___Group_1__0__Impl rule__Var___Group_1__1 ;
    public final void rule__Var___Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3097:1: ( rule__Var___Group_1__0__Impl rule__Var___Group_1__1 )
            // InternalPascal.g:3098:2: rule__Var___Group_1__0__Impl rule__Var___Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__Var___Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Var___Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:3105:1: rule__Var___Group_1__0__Impl : ( ( rule__Var___AccessorAssignment_1_0 ) ) ;
    public final void rule__Var___Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3109:1: ( ( ( rule__Var___AccessorAssignment_1_0 ) ) )
            // InternalPascal.g:3110:1: ( ( rule__Var___AccessorAssignment_1_0 ) )
            {
            // InternalPascal.g:3110:1: ( ( rule__Var___AccessorAssignment_1_0 ) )
            // InternalPascal.g:3111:2: ( rule__Var___AccessorAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_Access().getAccessorAssignment_1_0()); 
            }
            // InternalPascal.g:3112:2: ( rule__Var___AccessorAssignment_1_0 )
            // InternalPascal.g:3112:3: rule__Var___AccessorAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Var___AccessorAssignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_Access().getAccessorAssignment_1_0()); 
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
    // $ANTLR end "rule__Var___Group_1__0__Impl"


    // $ANTLR start "rule__Var___Group_1__1"
    // InternalPascal.g:3120:1: rule__Var___Group_1__1 : rule__Var___Group_1__1__Impl rule__Var___Group_1__2 ;
    public final void rule__Var___Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3124:1: ( rule__Var___Group_1__1__Impl rule__Var___Group_1__2 )
            // InternalPascal.g:3125:2: rule__Var___Group_1__1__Impl rule__Var___Group_1__2
            {
            pushFollow(FOLLOW_14);
            rule__Var___Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Var___Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:3132:1: rule__Var___Group_1__1__Impl : ( ( rule__Var___NameAssignment_1_1 ) ) ;
    public final void rule__Var___Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3136:1: ( ( ( rule__Var___NameAssignment_1_1 ) ) )
            // InternalPascal.g:3137:1: ( ( rule__Var___NameAssignment_1_1 ) )
            {
            // InternalPascal.g:3137:1: ( ( rule__Var___NameAssignment_1_1 ) )
            // InternalPascal.g:3138:2: ( rule__Var___NameAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_Access().getNameAssignment_1_1()); 
            }
            // InternalPascal.g:3139:2: ( rule__Var___NameAssignment_1_1 )
            // InternalPascal.g:3139:3: rule__Var___NameAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Var___NameAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_Access().getNameAssignment_1_1()); 
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
    // $ANTLR end "rule__Var___Group_1__1__Impl"


    // $ANTLR start "rule__Var___Group_1__2"
    // InternalPascal.g:3147:1: rule__Var___Group_1__2 : rule__Var___Group_1__2__Impl ;
    public final void rule__Var___Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3151:1: ( rule__Var___Group_1__2__Impl )
            // InternalPascal.g:3152:2: rule__Var___Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Var___Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:3158:1: rule__Var___Group_1__2__Impl : ( ( rule__Var___VariableAssignment_1_2 ) ) ;
    public final void rule__Var___Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3162:1: ( ( ( rule__Var___VariableAssignment_1_2 ) ) )
            // InternalPascal.g:3163:1: ( ( rule__Var___VariableAssignment_1_2 ) )
            {
            // InternalPascal.g:3163:1: ( ( rule__Var___VariableAssignment_1_2 ) )
            // InternalPascal.g:3164:2: ( rule__Var___VariableAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_Access().getVariableAssignment_1_2()); 
            }
            // InternalPascal.g:3165:2: ( rule__Var___VariableAssignment_1_2 )
            // InternalPascal.g:3165:3: rule__Var___VariableAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Var___VariableAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_Access().getVariableAssignment_1_2()); 
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
    // $ANTLR end "rule__Var___Group_1__2__Impl"


    // $ANTLR start "rule__Var___Group_2__0"
    // InternalPascal.g:3174:1: rule__Var___Group_2__0 : rule__Var___Group_2__0__Impl rule__Var___Group_2__1 ;
    public final void rule__Var___Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3178:1: ( rule__Var___Group_2__0__Impl rule__Var___Group_2__1 )
            // InternalPascal.g:3179:2: rule__Var___Group_2__0__Impl rule__Var___Group_2__1
            {
            pushFollow(FOLLOW_14);
            rule__Var___Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Var___Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:3186:1: rule__Var___Group_2__0__Impl : ( '^' ) ;
    public final void rule__Var___Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3190:1: ( ( '^' ) )
            // InternalPascal.g:3191:1: ( '^' )
            {
            // InternalPascal.g:3191:1: ( '^' )
            // InternalPascal.g:3192:2: '^'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_Access().getCircumflexAccentKeyword_2_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_Access().getCircumflexAccentKeyword_2_0()); 
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
    // $ANTLR end "rule__Var___Group_2__0__Impl"


    // $ANTLR start "rule__Var___Group_2__1"
    // InternalPascal.g:3201:1: rule__Var___Group_2__1 : rule__Var___Group_2__1__Impl ;
    public final void rule__Var___Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3205:1: ( rule__Var___Group_2__1__Impl )
            // InternalPascal.g:3206:2: rule__Var___Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Var___Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:3212:1: rule__Var___Group_2__1__Impl : ( ( rule__Var___PointerAssignment_2_1 ) ) ;
    public final void rule__Var___Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3216:1: ( ( ( rule__Var___PointerAssignment_2_1 ) ) )
            // InternalPascal.g:3217:1: ( ( rule__Var___PointerAssignment_2_1 ) )
            {
            // InternalPascal.g:3217:1: ( ( rule__Var___PointerAssignment_2_1 ) )
            // InternalPascal.g:3218:2: ( rule__Var___PointerAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_Access().getPointerAssignment_2_1()); 
            }
            // InternalPascal.g:3219:2: ( rule__Var___PointerAssignment_2_1 )
            // InternalPascal.g:3219:3: rule__Var___PointerAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Var___PointerAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_Access().getPointerAssignment_2_1()); 
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
    // $ANTLR end "rule__Var___Group_2__1__Impl"


    // $ANTLR start "rule__Expression_list__Group__0"
    // InternalPascal.g:3228:1: rule__Expression_list__Group__0 : rule__Expression_list__Group__0__Impl rule__Expression_list__Group__1 ;
    public final void rule__Expression_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3232:1: ( rule__Expression_list__Group__0__Impl rule__Expression_list__Group__1 )
            // InternalPascal.g:3233:2: rule__Expression_list__Group__0__Impl rule__Expression_list__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Expression_list__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Expression_list__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:3240:1: rule__Expression_list__Group__0__Impl : ( ( rule__Expression_list__ExpressionsAssignment_0 ) ) ;
    public final void rule__Expression_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3244:1: ( ( ( rule__Expression_list__ExpressionsAssignment_0 ) ) )
            // InternalPascal.g:3245:1: ( ( rule__Expression_list__ExpressionsAssignment_0 ) )
            {
            // InternalPascal.g:3245:1: ( ( rule__Expression_list__ExpressionsAssignment_0 ) )
            // InternalPascal.g:3246:2: ( rule__Expression_list__ExpressionsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression_listAccess().getExpressionsAssignment_0()); 
            }
            // InternalPascal.g:3247:2: ( rule__Expression_list__ExpressionsAssignment_0 )
            // InternalPascal.g:3247:3: rule__Expression_list__ExpressionsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Expression_list__ExpressionsAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression_listAccess().getExpressionsAssignment_0()); 
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
    // $ANTLR end "rule__Expression_list__Group__0__Impl"


    // $ANTLR start "rule__Expression_list__Group__1"
    // InternalPascal.g:3255:1: rule__Expression_list__Group__1 : rule__Expression_list__Group__1__Impl ;
    public final void rule__Expression_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3259:1: ( rule__Expression_list__Group__1__Impl )
            // InternalPascal.g:3260:2: rule__Expression_list__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression_list__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:3266:1: rule__Expression_list__Group__1__Impl : ( ( rule__Expression_list__Group_1__0 )* ) ;
    public final void rule__Expression_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3270:1: ( ( ( rule__Expression_list__Group_1__0 )* ) )
            // InternalPascal.g:3271:1: ( ( rule__Expression_list__Group_1__0 )* )
            {
            // InternalPascal.g:3271:1: ( ( rule__Expression_list__Group_1__0 )* )
            // InternalPascal.g:3272:2: ( rule__Expression_list__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression_listAccess().getGroup_1()); 
            }
            // InternalPascal.g:3273:2: ( rule__Expression_list__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==30) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalPascal.g:3273:3: rule__Expression_list__Group_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Expression_list__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression_listAccess().getGroup_1()); 
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
    // $ANTLR end "rule__Expression_list__Group__1__Impl"


    // $ANTLR start "rule__Expression_list__Group_1__0"
    // InternalPascal.g:3282:1: rule__Expression_list__Group_1__0 : rule__Expression_list__Group_1__0__Impl rule__Expression_list__Group_1__1 ;
    public final void rule__Expression_list__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3286:1: ( rule__Expression_list__Group_1__0__Impl rule__Expression_list__Group_1__1 )
            // InternalPascal.g:3287:2: rule__Expression_list__Group_1__0__Impl rule__Expression_list__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__Expression_list__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Expression_list__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:3294:1: rule__Expression_list__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Expression_list__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3298:1: ( ( ',' ) )
            // InternalPascal.g:3299:1: ( ',' )
            {
            // InternalPascal.g:3299:1: ( ',' )
            // InternalPascal.g:3300:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression_listAccess().getCommaKeyword_1_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression_listAccess().getCommaKeyword_1_0()); 
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
    // $ANTLR end "rule__Expression_list__Group_1__0__Impl"


    // $ANTLR start "rule__Expression_list__Group_1__1"
    // InternalPascal.g:3309:1: rule__Expression_list__Group_1__1 : rule__Expression_list__Group_1__1__Impl ;
    public final void rule__Expression_list__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3313:1: ( rule__Expression_list__Group_1__1__Impl )
            // InternalPascal.g:3314:2: rule__Expression_list__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression_list__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:3320:1: rule__Expression_list__Group_1__1__Impl : ( ( rule__Expression_list__ExpressionsAssignment_1_1 ) ) ;
    public final void rule__Expression_list__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3324:1: ( ( ( rule__Expression_list__ExpressionsAssignment_1_1 ) ) )
            // InternalPascal.g:3325:1: ( ( rule__Expression_list__ExpressionsAssignment_1_1 ) )
            {
            // InternalPascal.g:3325:1: ( ( rule__Expression_list__ExpressionsAssignment_1_1 ) )
            // InternalPascal.g:3326:2: ( rule__Expression_list__ExpressionsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression_listAccess().getExpressionsAssignment_1_1()); 
            }
            // InternalPascal.g:3327:2: ( rule__Expression_list__ExpressionsAssignment_1_1 )
            // InternalPascal.g:3327:3: rule__Expression_list__ExpressionsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Expression_list__ExpressionsAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression_listAccess().getExpressionsAssignment_1_1()); 
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
    // $ANTLR end "rule__Expression_list__Group_1__1__Impl"


    // $ANTLR start "rule__Expression__Group__0"
    // InternalPascal.g:3336:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3340:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // InternalPascal.g:3341:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Expression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Expression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:3348:1: rule__Expression__Group__0__Impl : ( ( rule__Expression__ExpressionsAssignment_0 ) ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3352:1: ( ( ( rule__Expression__ExpressionsAssignment_0 ) ) )
            // InternalPascal.g:3353:1: ( ( rule__Expression__ExpressionsAssignment_0 ) )
            {
            // InternalPascal.g:3353:1: ( ( rule__Expression__ExpressionsAssignment_0 ) )
            // InternalPascal.g:3354:2: ( rule__Expression__ExpressionsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getExpressionsAssignment_0()); 
            }
            // InternalPascal.g:3355:2: ( rule__Expression__ExpressionsAssignment_0 )
            // InternalPascal.g:3355:3: rule__Expression__ExpressionsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__ExpressionsAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getExpressionsAssignment_0()); 
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
    // $ANTLR end "rule__Expression__Group__0__Impl"


    // $ANTLR start "rule__Expression__Group__1"
    // InternalPascal.g:3363:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3367:1: ( rule__Expression__Group__1__Impl )
            // InternalPascal.g:3368:2: rule__Expression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:3374:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )? ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3378:1: ( ( ( rule__Expression__Group_1__0 )? ) )
            // InternalPascal.g:3379:1: ( ( rule__Expression__Group_1__0 )? )
            {
            // InternalPascal.g:3379:1: ( ( rule__Expression__Group_1__0 )? )
            // InternalPascal.g:3380:2: ( rule__Expression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getGroup_1()); 
            }
            // InternalPascal.g:3381:2: ( rule__Expression__Group_1__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_RELATIONAL_OP||LA33_0==39||LA33_0==46) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalPascal.g:3381:3: rule__Expression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getGroup_1()); 
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
    // $ANTLR end "rule__Expression__Group__1__Impl"


    // $ANTLR start "rule__Expression__Group_1__0"
    // InternalPascal.g:3390:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3394:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // InternalPascal.g:3395:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__Expression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:3402:1: rule__Expression__Group_1__0__Impl : ( ( rule__Expression__Alternatives_1_0 ) ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3406:1: ( ( ( rule__Expression__Alternatives_1_0 ) ) )
            // InternalPascal.g:3407:1: ( ( rule__Expression__Alternatives_1_0 ) )
            {
            // InternalPascal.g:3407:1: ( ( rule__Expression__Alternatives_1_0 ) )
            // InternalPascal.g:3408:2: ( rule__Expression__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getAlternatives_1_0()); 
            }
            // InternalPascal.g:3409:2: ( rule__Expression__Alternatives_1_0 )
            // InternalPascal.g:3409:3: rule__Expression__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Alternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getAlternatives_1_0()); 
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
    // $ANTLR end "rule__Expression__Group_1__0__Impl"


    // $ANTLR start "rule__Expression__Group_1__1"
    // InternalPascal.g:3417:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3421:1: ( rule__Expression__Group_1__1__Impl )
            // InternalPascal.g:3422:2: rule__Expression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:3428:1: rule__Expression__Group_1__1__Impl : ( ( rule__Expression__ExpressionsAssignment_1_1 ) ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3432:1: ( ( ( rule__Expression__ExpressionsAssignment_1_1 ) ) )
            // InternalPascal.g:3433:1: ( ( rule__Expression__ExpressionsAssignment_1_1 ) )
            {
            // InternalPascal.g:3433:1: ( ( rule__Expression__ExpressionsAssignment_1_1 ) )
            // InternalPascal.g:3434:2: ( rule__Expression__ExpressionsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getExpressionsAssignment_1_1()); 
            }
            // InternalPascal.g:3435:2: ( rule__Expression__ExpressionsAssignment_1_1 )
            // InternalPascal.g:3435:3: rule__Expression__ExpressionsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Expression__ExpressionsAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getExpressionsAssignment_1_1()); 
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
    // $ANTLR end "rule__Expression__Group_1__1__Impl"


    // $ANTLR start "rule__Simple_expression__Group__0"
    // InternalPascal.g:3444:1: rule__Simple_expression__Group__0 : rule__Simple_expression__Group__0__Impl rule__Simple_expression__Group__1 ;
    public final void rule__Simple_expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3448:1: ( rule__Simple_expression__Group__0__Impl rule__Simple_expression__Group__1 )
            // InternalPascal.g:3449:2: rule__Simple_expression__Group__0__Impl rule__Simple_expression__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Simple_expression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Simple_expression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:3456:1: rule__Simple_expression__Group__0__Impl : ( ( rule__Simple_expression__PrefixOperatorAssignment_0 )? ) ;
    public final void rule__Simple_expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3460:1: ( ( ( rule__Simple_expression__PrefixOperatorAssignment_0 )? ) )
            // InternalPascal.g:3461:1: ( ( rule__Simple_expression__PrefixOperatorAssignment_0 )? )
            {
            // InternalPascal.g:3461:1: ( ( rule__Simple_expression__PrefixOperatorAssignment_0 )? )
            // InternalPascal.g:3462:2: ( rule__Simple_expression__PrefixOperatorAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimple_expressionAccess().getPrefixOperatorAssignment_0()); 
            }
            // InternalPascal.g:3463:2: ( rule__Simple_expression__PrefixOperatorAssignment_0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ADDITION_OP) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalPascal.g:3463:3: rule__Simple_expression__PrefixOperatorAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Simple_expression__PrefixOperatorAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimple_expressionAccess().getPrefixOperatorAssignment_0()); 
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
    // $ANTLR end "rule__Simple_expression__Group__0__Impl"


    // $ANTLR start "rule__Simple_expression__Group__1"
    // InternalPascal.g:3471:1: rule__Simple_expression__Group__1 : rule__Simple_expression__Group__1__Impl rule__Simple_expression__Group__2 ;
    public final void rule__Simple_expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3475:1: ( rule__Simple_expression__Group__1__Impl rule__Simple_expression__Group__2 )
            // InternalPascal.g:3476:2: rule__Simple_expression__Group__1__Impl rule__Simple_expression__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__Simple_expression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Simple_expression__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:3483:1: rule__Simple_expression__Group__1__Impl : ( ( rule__Simple_expression__TermsAssignment_1 ) ) ;
    public final void rule__Simple_expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3487:1: ( ( ( rule__Simple_expression__TermsAssignment_1 ) ) )
            // InternalPascal.g:3488:1: ( ( rule__Simple_expression__TermsAssignment_1 ) )
            {
            // InternalPascal.g:3488:1: ( ( rule__Simple_expression__TermsAssignment_1 ) )
            // InternalPascal.g:3489:2: ( rule__Simple_expression__TermsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimple_expressionAccess().getTermsAssignment_1()); 
            }
            // InternalPascal.g:3490:2: ( rule__Simple_expression__TermsAssignment_1 )
            // InternalPascal.g:3490:3: rule__Simple_expression__TermsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Simple_expression__TermsAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimple_expressionAccess().getTermsAssignment_1()); 
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
    // $ANTLR end "rule__Simple_expression__Group__1__Impl"


    // $ANTLR start "rule__Simple_expression__Group__2"
    // InternalPascal.g:3498:1: rule__Simple_expression__Group__2 : rule__Simple_expression__Group__2__Impl ;
    public final void rule__Simple_expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3502:1: ( rule__Simple_expression__Group__2__Impl )
            // InternalPascal.g:3503:2: rule__Simple_expression__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Simple_expression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:3509:1: rule__Simple_expression__Group__2__Impl : ( ( rule__Simple_expression__Alternatives_2 )* ) ;
    public final void rule__Simple_expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3513:1: ( ( ( rule__Simple_expression__Alternatives_2 )* ) )
            // InternalPascal.g:3514:1: ( ( rule__Simple_expression__Alternatives_2 )* )
            {
            // InternalPascal.g:3514:1: ( ( rule__Simple_expression__Alternatives_2 )* )
            // InternalPascal.g:3515:2: ( rule__Simple_expression__Alternatives_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimple_expressionAccess().getAlternatives_2()); 
            }
            // InternalPascal.g:3516:2: ( rule__Simple_expression__Alternatives_2 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_INTEGER_NUMBER||LA35_0==RULE_ADDITION_OP||LA35_0==RULE_REAL_NUMBER||LA35_0==47) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalPascal.g:3516:3: rule__Simple_expression__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Simple_expression__Alternatives_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimple_expressionAccess().getAlternatives_2()); 
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
    // $ANTLR end "rule__Simple_expression__Group__2__Impl"


    // $ANTLR start "rule__Simple_expression__Group_2_0__0"
    // InternalPascal.g:3525:1: rule__Simple_expression__Group_2_0__0 : rule__Simple_expression__Group_2_0__0__Impl rule__Simple_expression__Group_2_0__1 ;
    public final void rule__Simple_expression__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3529:1: ( rule__Simple_expression__Group_2_0__0__Impl rule__Simple_expression__Group_2_0__1 )
            // InternalPascal.g:3530:2: rule__Simple_expression__Group_2_0__0__Impl rule__Simple_expression__Group_2_0__1
            {
            pushFollow(FOLLOW_13);
            rule__Simple_expression__Group_2_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Simple_expression__Group_2_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:3537:1: rule__Simple_expression__Group_2_0__0__Impl : ( ( rule__Simple_expression__Alternatives_2_0_0 ) ) ;
    public final void rule__Simple_expression__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3541:1: ( ( ( rule__Simple_expression__Alternatives_2_0_0 ) ) )
            // InternalPascal.g:3542:1: ( ( rule__Simple_expression__Alternatives_2_0_0 ) )
            {
            // InternalPascal.g:3542:1: ( ( rule__Simple_expression__Alternatives_2_0_0 ) )
            // InternalPascal.g:3543:2: ( rule__Simple_expression__Alternatives_2_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimple_expressionAccess().getAlternatives_2_0_0()); 
            }
            // InternalPascal.g:3544:2: ( rule__Simple_expression__Alternatives_2_0_0 )
            // InternalPascal.g:3544:3: rule__Simple_expression__Alternatives_2_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Simple_expression__Alternatives_2_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimple_expressionAccess().getAlternatives_2_0_0()); 
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
    // $ANTLR end "rule__Simple_expression__Group_2_0__0__Impl"


    // $ANTLR start "rule__Simple_expression__Group_2_0__1"
    // InternalPascal.g:3552:1: rule__Simple_expression__Group_2_0__1 : rule__Simple_expression__Group_2_0__1__Impl ;
    public final void rule__Simple_expression__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3556:1: ( rule__Simple_expression__Group_2_0__1__Impl )
            // InternalPascal.g:3557:2: rule__Simple_expression__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Simple_expression__Group_2_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:3563:1: rule__Simple_expression__Group_2_0__1__Impl : ( ( rule__Simple_expression__TermsAssignment_2_0_1 ) ) ;
    public final void rule__Simple_expression__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3567:1: ( ( ( rule__Simple_expression__TermsAssignment_2_0_1 ) ) )
            // InternalPascal.g:3568:1: ( ( rule__Simple_expression__TermsAssignment_2_0_1 ) )
            {
            // InternalPascal.g:3568:1: ( ( rule__Simple_expression__TermsAssignment_2_0_1 ) )
            // InternalPascal.g:3569:2: ( rule__Simple_expression__TermsAssignment_2_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimple_expressionAccess().getTermsAssignment_2_0_1()); 
            }
            // InternalPascal.g:3570:2: ( rule__Simple_expression__TermsAssignment_2_0_1 )
            // InternalPascal.g:3570:3: rule__Simple_expression__TermsAssignment_2_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Simple_expression__TermsAssignment_2_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimple_expressionAccess().getTermsAssignment_2_0_1()); 
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
    // $ANTLR end "rule__Simple_expression__Group_2_0__1__Impl"


    // $ANTLR start "rule__Term__Group__0"
    // InternalPascal.g:3579:1: rule__Term__Group__0 : rule__Term__Group__0__Impl rule__Term__Group__1 ;
    public final void rule__Term__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3583:1: ( rule__Term__Group__0__Impl rule__Term__Group__1 )
            // InternalPascal.g:3584:2: rule__Term__Group__0__Impl rule__Term__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Term__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Term__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:3591:1: rule__Term__Group__0__Impl : ( ( rule__Term__FactorsAssignment_0 ) ) ;
    public final void rule__Term__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3595:1: ( ( ( rule__Term__FactorsAssignment_0 ) ) )
            // InternalPascal.g:3596:1: ( ( rule__Term__FactorsAssignment_0 ) )
            {
            // InternalPascal.g:3596:1: ( ( rule__Term__FactorsAssignment_0 ) )
            // InternalPascal.g:3597:2: ( rule__Term__FactorsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getFactorsAssignment_0()); 
            }
            // InternalPascal.g:3598:2: ( rule__Term__FactorsAssignment_0 )
            // InternalPascal.g:3598:3: rule__Term__FactorsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Term__FactorsAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getFactorsAssignment_0()); 
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
    // $ANTLR end "rule__Term__Group__0__Impl"


    // $ANTLR start "rule__Term__Group__1"
    // InternalPascal.g:3606:1: rule__Term__Group__1 : rule__Term__Group__1__Impl ;
    public final void rule__Term__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3610:1: ( rule__Term__Group__1__Impl )
            // InternalPascal.g:3611:2: rule__Term__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Term__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:3617:1: rule__Term__Group__1__Impl : ( ( rule__Term__Group_1__0 )* ) ;
    public final void rule__Term__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3621:1: ( ( ( rule__Term__Group_1__0 )* ) )
            // InternalPascal.g:3622:1: ( ( rule__Term__Group_1__0 )* )
            {
            // InternalPascal.g:3622:1: ( ( rule__Term__Group_1__0 )* )
            // InternalPascal.g:3623:2: ( rule__Term__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getGroup_1()); 
            }
            // InternalPascal.g:3624:2: ( rule__Term__Group_1__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_MULTIPLICATION_OP||(LA36_0>=48 && LA36_0<=50)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalPascal.g:3624:3: rule__Term__Group_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Term__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getGroup_1()); 
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
    // $ANTLR end "rule__Term__Group__1__Impl"


    // $ANTLR start "rule__Term__Group_1__0"
    // InternalPascal.g:3633:1: rule__Term__Group_1__0 : rule__Term__Group_1__0__Impl rule__Term__Group_1__1 ;
    public final void rule__Term__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3637:1: ( rule__Term__Group_1__0__Impl rule__Term__Group_1__1 )
            // InternalPascal.g:3638:2: rule__Term__Group_1__0__Impl rule__Term__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__Term__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Term__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:3645:1: rule__Term__Group_1__0__Impl : ( ( rule__Term__Alternatives_1_0 ) ) ;
    public final void rule__Term__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3649:1: ( ( ( rule__Term__Alternatives_1_0 ) ) )
            // InternalPascal.g:3650:1: ( ( rule__Term__Alternatives_1_0 ) )
            {
            // InternalPascal.g:3650:1: ( ( rule__Term__Alternatives_1_0 ) )
            // InternalPascal.g:3651:2: ( rule__Term__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getAlternatives_1_0()); 
            }
            // InternalPascal.g:3652:2: ( rule__Term__Alternatives_1_0 )
            // InternalPascal.g:3652:3: rule__Term__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Term__Alternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getAlternatives_1_0()); 
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
    // $ANTLR end "rule__Term__Group_1__0__Impl"


    // $ANTLR start "rule__Term__Group_1__1"
    // InternalPascal.g:3660:1: rule__Term__Group_1__1 : rule__Term__Group_1__1__Impl ;
    public final void rule__Term__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3664:1: ( rule__Term__Group_1__1__Impl )
            // InternalPascal.g:3665:2: rule__Term__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Term__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:3671:1: rule__Term__Group_1__1__Impl : ( ( rule__Term__FactorsAssignment_1_1 ) ) ;
    public final void rule__Term__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3675:1: ( ( ( rule__Term__FactorsAssignment_1_1 ) ) )
            // InternalPascal.g:3676:1: ( ( rule__Term__FactorsAssignment_1_1 ) )
            {
            // InternalPascal.g:3676:1: ( ( rule__Term__FactorsAssignment_1_1 ) )
            // InternalPascal.g:3677:2: ( rule__Term__FactorsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getFactorsAssignment_1_1()); 
            }
            // InternalPascal.g:3678:2: ( rule__Term__FactorsAssignment_1_1 )
            // InternalPascal.g:3678:3: rule__Term__FactorsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Term__FactorsAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getFactorsAssignment_1_1()); 
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
    // $ANTLR end "rule__Term__Group_1__1__Impl"


    // $ANTLR start "rule__Factor__Group_8__0"
    // InternalPascal.g:3687:1: rule__Factor__Group_8__0 : rule__Factor__Group_8__0__Impl rule__Factor__Group_8__1 ;
    public final void rule__Factor__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3691:1: ( rule__Factor__Group_8__0__Impl rule__Factor__Group_8__1 )
            // InternalPascal.g:3692:2: rule__Factor__Group_8__0__Impl rule__Factor__Group_8__1
            {
            pushFollow(FOLLOW_13);
            rule__Factor__Group_8__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Factor__Group_8__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:3699:1: rule__Factor__Group_8__0__Impl : ( '(' ) ;
    public final void rule__Factor__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3703:1: ( ( '(' ) )
            // InternalPascal.g:3704:1: ( '(' )
            {
            // InternalPascal.g:3704:1: ( '(' )
            // InternalPascal.g:3705:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getLeftParenthesisKeyword_8_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorAccess().getLeftParenthesisKeyword_8_0()); 
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
    // $ANTLR end "rule__Factor__Group_8__0__Impl"


    // $ANTLR start "rule__Factor__Group_8__1"
    // InternalPascal.g:3714:1: rule__Factor__Group_8__1 : rule__Factor__Group_8__1__Impl rule__Factor__Group_8__2 ;
    public final void rule__Factor__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3718:1: ( rule__Factor__Group_8__1__Impl rule__Factor__Group_8__2 )
            // InternalPascal.g:3719:2: rule__Factor__Group_8__1__Impl rule__Factor__Group_8__2
            {
            pushFollow(FOLLOW_23);
            rule__Factor__Group_8__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Factor__Group_8__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:3726:1: rule__Factor__Group_8__1__Impl : ( ( rule__Factor__ExpressionAssignment_8_1 ) ) ;
    public final void rule__Factor__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3730:1: ( ( ( rule__Factor__ExpressionAssignment_8_1 ) ) )
            // InternalPascal.g:3731:1: ( ( rule__Factor__ExpressionAssignment_8_1 ) )
            {
            // InternalPascal.g:3731:1: ( ( rule__Factor__ExpressionAssignment_8_1 ) )
            // InternalPascal.g:3732:2: ( rule__Factor__ExpressionAssignment_8_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getExpressionAssignment_8_1()); 
            }
            // InternalPascal.g:3733:2: ( rule__Factor__ExpressionAssignment_8_1 )
            // InternalPascal.g:3733:3: rule__Factor__ExpressionAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Factor__ExpressionAssignment_8_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorAccess().getExpressionAssignment_8_1()); 
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
    // $ANTLR end "rule__Factor__Group_8__1__Impl"


    // $ANTLR start "rule__Factor__Group_8__2"
    // InternalPascal.g:3741:1: rule__Factor__Group_8__2 : rule__Factor__Group_8__2__Impl ;
    public final void rule__Factor__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3745:1: ( rule__Factor__Group_8__2__Impl )
            // InternalPascal.g:3746:2: rule__Factor__Group_8__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Group_8__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:3752:1: rule__Factor__Group_8__2__Impl : ( ')' ) ;
    public final void rule__Factor__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3756:1: ( ( ')' ) )
            // InternalPascal.g:3757:1: ( ')' )
            {
            // InternalPascal.g:3757:1: ( ')' )
            // InternalPascal.g:3758:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getRightParenthesisKeyword_8_2()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorAccess().getRightParenthesisKeyword_8_2()); 
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
    // $ANTLR end "rule__Factor__Group_8__2__Impl"


    // $ANTLR start "rule__Factor__Group_9__0"
    // InternalPascal.g:3768:1: rule__Factor__Group_9__0 : rule__Factor__Group_9__0__Impl rule__Factor__Group_9__1 ;
    public final void rule__Factor__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3772:1: ( rule__Factor__Group_9__0__Impl rule__Factor__Group_9__1 )
            // InternalPascal.g:3773:2: rule__Factor__Group_9__0__Impl rule__Factor__Group_9__1
            {
            pushFollow(FOLLOW_13);
            rule__Factor__Group_9__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Factor__Group_9__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:3780:1: rule__Factor__Group_9__0__Impl : ( 'not' ) ;
    public final void rule__Factor__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3784:1: ( ( 'not' ) )
            // InternalPascal.g:3785:1: ( 'not' )
            {
            // InternalPascal.g:3785:1: ( 'not' )
            // InternalPascal.g:3786:2: 'not'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getNotKeyword_9_0()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorAccess().getNotKeyword_9_0()); 
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
    // $ANTLR end "rule__Factor__Group_9__0__Impl"


    // $ANTLR start "rule__Factor__Group_9__1"
    // InternalPascal.g:3795:1: rule__Factor__Group_9__1 : rule__Factor__Group_9__1__Impl ;
    public final void rule__Factor__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3799:1: ( rule__Factor__Group_9__1__Impl )
            // InternalPascal.g:3800:2: rule__Factor__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Group_9__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:3806:1: rule__Factor__Group_9__1__Impl : ( ( rule__Factor__NotAssignment_9_1 ) ) ;
    public final void rule__Factor__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3810:1: ( ( ( rule__Factor__NotAssignment_9_1 ) ) )
            // InternalPascal.g:3811:1: ( ( rule__Factor__NotAssignment_9_1 ) )
            {
            // InternalPascal.g:3811:1: ( ( rule__Factor__NotAssignment_9_1 ) )
            // InternalPascal.g:3812:2: ( rule__Factor__NotAssignment_9_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getNotAssignment_9_1()); 
            }
            // InternalPascal.g:3813:2: ( rule__Factor__NotAssignment_9_1 )
            // InternalPascal.g:3813:3: rule__Factor__NotAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__Factor__NotAssignment_9_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorAccess().getNotAssignment_9_1()); 
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
    // $ANTLR end "rule__Factor__Group_9__1__Impl"


    // $ANTLR start "rule__Function_designator__Group__0"
    // InternalPascal.g:3822:1: rule__Function_designator__Group__0 : rule__Function_designator__Group__0__Impl rule__Function_designator__Group__1 ;
    public final void rule__Function_designator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3826:1: ( rule__Function_designator__Group__0__Impl rule__Function_designator__Group__1 )
            // InternalPascal.g:3827:2: rule__Function_designator__Group__0__Impl rule__Function_designator__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Function_designator__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Function_designator__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:3834:1: rule__Function_designator__Group__0__Impl : ( ( rule__Function_designator__NameAssignment_0 ) ) ;
    public final void rule__Function_designator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3838:1: ( ( ( rule__Function_designator__NameAssignment_0 ) ) )
            // InternalPascal.g:3839:1: ( ( rule__Function_designator__NameAssignment_0 ) )
            {
            // InternalPascal.g:3839:1: ( ( rule__Function_designator__NameAssignment_0 ) )
            // InternalPascal.g:3840:2: ( rule__Function_designator__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_designatorAccess().getNameAssignment_0()); 
            }
            // InternalPascal.g:3841:2: ( rule__Function_designator__NameAssignment_0 )
            // InternalPascal.g:3841:3: rule__Function_designator__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Function_designator__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunction_designatorAccess().getNameAssignment_0()); 
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
    // $ANTLR end "rule__Function_designator__Group__0__Impl"


    // $ANTLR start "rule__Function_designator__Group__1"
    // InternalPascal.g:3849:1: rule__Function_designator__Group__1 : rule__Function_designator__Group__1__Impl rule__Function_designator__Group__2 ;
    public final void rule__Function_designator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3853:1: ( rule__Function_designator__Group__1__Impl rule__Function_designator__Group__2 )
            // InternalPascal.g:3854:2: rule__Function_designator__Group__1__Impl rule__Function_designator__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__Function_designator__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Function_designator__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:3861:1: rule__Function_designator__Group__1__Impl : ( '(' ) ;
    public final void rule__Function_designator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3865:1: ( ( '(' ) )
            // InternalPascal.g:3866:1: ( '(' )
            {
            // InternalPascal.g:3866:1: ( '(' )
            // InternalPascal.g:3867:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_designatorAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunction_designatorAccess().getLeftParenthesisKeyword_1()); 
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
    // $ANTLR end "rule__Function_designator__Group__1__Impl"


    // $ANTLR start "rule__Function_designator__Group__2"
    // InternalPascal.g:3876:1: rule__Function_designator__Group__2 : rule__Function_designator__Group__2__Impl rule__Function_designator__Group__3 ;
    public final void rule__Function_designator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3880:1: ( rule__Function_designator__Group__2__Impl rule__Function_designator__Group__3 )
            // InternalPascal.g:3881:2: rule__Function_designator__Group__2__Impl rule__Function_designator__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__Function_designator__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Function_designator__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:3888:1: rule__Function_designator__Group__2__Impl : ( ( rule__Function_designator__ExpressionsAssignment_2 )? ) ;
    public final void rule__Function_designator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3892:1: ( ( ( rule__Function_designator__ExpressionsAssignment_2 )? ) )
            // InternalPascal.g:3893:1: ( ( rule__Function_designator__ExpressionsAssignment_2 )? )
            {
            // InternalPascal.g:3893:1: ( ( rule__Function_designator__ExpressionsAssignment_2 )? )
            // InternalPascal.g:3894:2: ( rule__Function_designator__ExpressionsAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_designatorAccess().getExpressionsAssignment_2()); 
            }
            // InternalPascal.g:3895:2: ( rule__Function_designator__ExpressionsAssignment_2 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=RULE_ID && LA37_0<=RULE_INTEGER_NUMBER)||LA37_0==RULE_ADDITION_OP||LA37_0==RULE_STRING||(LA37_0>=RULE_SIGNED_REAL_NUMBER && LA37_0<=RULE_REAL_NUMBER)||LA37_0==27||LA37_0==31||LA37_0==33||(LA37_0>=51 && LA37_0<=53)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalPascal.g:3895:3: rule__Function_designator__ExpressionsAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Function_designator__ExpressionsAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunction_designatorAccess().getExpressionsAssignment_2()); 
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
    // $ANTLR end "rule__Function_designator__Group__2__Impl"


    // $ANTLR start "rule__Function_designator__Group__3"
    // InternalPascal.g:3903:1: rule__Function_designator__Group__3 : rule__Function_designator__Group__3__Impl ;
    public final void rule__Function_designator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3907:1: ( rule__Function_designator__Group__3__Impl )
            // InternalPascal.g:3908:2: rule__Function_designator__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function_designator__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:3914:1: rule__Function_designator__Group__3__Impl : ( ')' ) ;
    public final void rule__Function_designator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3918:1: ( ( ')' ) )
            // InternalPascal.g:3919:1: ( ')' )
            {
            // InternalPascal.g:3919:1: ( ')' )
            // InternalPascal.g:3920:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_designatorAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunction_designatorAccess().getRightParenthesisKeyword_3()); 
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
    // $ANTLR end "rule__Function_designator__Group__3__Impl"


    // $ANTLR start "rule__Function_procedure_declaration__Group__0"
    // InternalPascal.g:3930:1: rule__Function_procedure_declaration__Group__0 : rule__Function_procedure_declaration__Group__0__Impl rule__Function_procedure_declaration__Group__1 ;
    public final void rule__Function_procedure_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3934:1: ( rule__Function_procedure_declaration__Group__0__Impl rule__Function_procedure_declaration__Group__1 )
            // InternalPascal.g:3935:2: rule__Function_procedure_declaration__Group__0__Impl rule__Function_procedure_declaration__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Function_procedure_declaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Function_procedure_declaration__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:3942:1: rule__Function_procedure_declaration__Group__0__Impl : ( ( rule__Function_procedure_declaration__Alternatives_0 ) ) ;
    public final void rule__Function_procedure_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3946:1: ( ( ( rule__Function_procedure_declaration__Alternatives_0 ) ) )
            // InternalPascal.g:3947:1: ( ( rule__Function_procedure_declaration__Alternatives_0 ) )
            {
            // InternalPascal.g:3947:1: ( ( rule__Function_procedure_declaration__Alternatives_0 ) )
            // InternalPascal.g:3948:2: ( rule__Function_procedure_declaration__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_procedure_declarationAccess().getAlternatives_0()); 
            }
            // InternalPascal.g:3949:2: ( rule__Function_procedure_declaration__Alternatives_0 )
            // InternalPascal.g:3949:3: rule__Function_procedure_declaration__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Function_procedure_declaration__Alternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunction_procedure_declarationAccess().getAlternatives_0()); 
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
    // $ANTLR end "rule__Function_procedure_declaration__Group__0__Impl"


    // $ANTLR start "rule__Function_procedure_declaration__Group__1"
    // InternalPascal.g:3957:1: rule__Function_procedure_declaration__Group__1 : rule__Function_procedure_declaration__Group__1__Impl ;
    public final void rule__Function_procedure_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3961:1: ( rule__Function_procedure_declaration__Group__1__Impl )
            // InternalPascal.g:3962:2: rule__Function_procedure_declaration__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function_procedure_declaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:3968:1: rule__Function_procedure_declaration__Group__1__Impl : ( ';' ) ;
    public final void rule__Function_procedure_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3972:1: ( ( ';' ) )
            // InternalPascal.g:3973:1: ( ';' )
            {
            // InternalPascal.g:3973:1: ( ';' )
            // InternalPascal.g:3974:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_procedure_declarationAccess().getSemicolonKeyword_1()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunction_procedure_declarationAccess().getSemicolonKeyword_1()); 
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
    // $ANTLR end "rule__Function_procedure_declaration__Group__1__Impl"


    // $ANTLR start "rule__Function_heading__Group__0"
    // InternalPascal.g:3984:1: rule__Function_heading__Group__0 : rule__Function_heading__Group__0__Impl rule__Function_heading__Group__1 ;
    public final void rule__Function_heading__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3988:1: ( rule__Function_heading__Group__0__Impl rule__Function_heading__Group__1 )
            // InternalPascal.g:3989:2: rule__Function_heading__Group__0__Impl rule__Function_heading__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Function_heading__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Function_heading__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:3996:1: rule__Function_heading__Group__0__Impl : ( 'function' ) ;
    public final void rule__Function_heading__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4000:1: ( ( 'function' ) )
            // InternalPascal.g:4001:1: ( 'function' )
            {
            // InternalPascal.g:4001:1: ( 'function' )
            // InternalPascal.g:4002:2: 'function'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_headingAccess().getFunctionKeyword_0()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunction_headingAccess().getFunctionKeyword_0()); 
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
    // $ANTLR end "rule__Function_heading__Group__0__Impl"


    // $ANTLR start "rule__Function_heading__Group__1"
    // InternalPascal.g:4011:1: rule__Function_heading__Group__1 : rule__Function_heading__Group__1__Impl rule__Function_heading__Group__2 ;
    public final void rule__Function_heading__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4015:1: ( rule__Function_heading__Group__1__Impl rule__Function_heading__Group__2 )
            // InternalPascal.g:4016:2: rule__Function_heading__Group__1__Impl rule__Function_heading__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__Function_heading__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Function_heading__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:4023:1: rule__Function_heading__Group__1__Impl : ( ( rule__Function_heading__NameAssignment_1 ) ) ;
    public final void rule__Function_heading__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4027:1: ( ( ( rule__Function_heading__NameAssignment_1 ) ) )
            // InternalPascal.g:4028:1: ( ( rule__Function_heading__NameAssignment_1 ) )
            {
            // InternalPascal.g:4028:1: ( ( rule__Function_heading__NameAssignment_1 ) )
            // InternalPascal.g:4029:2: ( rule__Function_heading__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_headingAccess().getNameAssignment_1()); 
            }
            // InternalPascal.g:4030:2: ( rule__Function_heading__NameAssignment_1 )
            // InternalPascal.g:4030:3: rule__Function_heading__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Function_heading__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunction_headingAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__Function_heading__Group__1__Impl"


    // $ANTLR start "rule__Function_heading__Group__2"
    // InternalPascal.g:4038:1: rule__Function_heading__Group__2 : rule__Function_heading__Group__2__Impl rule__Function_heading__Group__3 ;
    public final void rule__Function_heading__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4042:1: ( rule__Function_heading__Group__2__Impl rule__Function_heading__Group__3 )
            // InternalPascal.g:4043:2: rule__Function_heading__Group__2__Impl rule__Function_heading__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__Function_heading__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Function_heading__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:4050:1: rule__Function_heading__Group__2__Impl : ( ( rule__Function_heading__ParametersAssignment_2 )? ) ;
    public final void rule__Function_heading__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4054:1: ( ( ( rule__Function_heading__ParametersAssignment_2 )? ) )
            // InternalPascal.g:4055:1: ( ( rule__Function_heading__ParametersAssignment_2 )? )
            {
            // InternalPascal.g:4055:1: ( ( rule__Function_heading__ParametersAssignment_2 )? )
            // InternalPascal.g:4056:2: ( rule__Function_heading__ParametersAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_headingAccess().getParametersAssignment_2()); 
            }
            // InternalPascal.g:4057:2: ( rule__Function_heading__ParametersAssignment_2 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==31) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalPascal.g:4057:3: rule__Function_heading__ParametersAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Function_heading__ParametersAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunction_headingAccess().getParametersAssignment_2()); 
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
    // $ANTLR end "rule__Function_heading__Group__2__Impl"


    // $ANTLR start "rule__Function_heading__Group__3"
    // InternalPascal.g:4065:1: rule__Function_heading__Group__3 : rule__Function_heading__Group__3__Impl rule__Function_heading__Group__4 ;
    public final void rule__Function_heading__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4069:1: ( rule__Function_heading__Group__3__Impl rule__Function_heading__Group__4 )
            // InternalPascal.g:4070:2: rule__Function_heading__Group__3__Impl rule__Function_heading__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Function_heading__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Function_heading__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:4077:1: rule__Function_heading__Group__3__Impl : ( ':' ) ;
    public final void rule__Function_heading__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4081:1: ( ( ':' ) )
            // InternalPascal.g:4082:1: ( ':' )
            {
            // InternalPascal.g:4082:1: ( ':' )
            // InternalPascal.g:4083:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_headingAccess().getColonKeyword_3()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunction_headingAccess().getColonKeyword_3()); 
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
    // $ANTLR end "rule__Function_heading__Group__3__Impl"


    // $ANTLR start "rule__Function_heading__Group__4"
    // InternalPascal.g:4092:1: rule__Function_heading__Group__4 : rule__Function_heading__Group__4__Impl ;
    public final void rule__Function_heading__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4096:1: ( rule__Function_heading__Group__4__Impl )
            // InternalPascal.g:4097:2: rule__Function_heading__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function_heading__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:4103:1: rule__Function_heading__Group__4__Impl : ( ( rule__Function_heading__ReturnTypeAssignment_4 ) ) ;
    public final void rule__Function_heading__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4107:1: ( ( ( rule__Function_heading__ReturnTypeAssignment_4 ) ) )
            // InternalPascal.g:4108:1: ( ( rule__Function_heading__ReturnTypeAssignment_4 ) )
            {
            // InternalPascal.g:4108:1: ( ( rule__Function_heading__ReturnTypeAssignment_4 ) )
            // InternalPascal.g:4109:2: ( rule__Function_heading__ReturnTypeAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_headingAccess().getReturnTypeAssignment_4()); 
            }
            // InternalPascal.g:4110:2: ( rule__Function_heading__ReturnTypeAssignment_4 )
            // InternalPascal.g:4110:3: rule__Function_heading__ReturnTypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Function_heading__ReturnTypeAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunction_headingAccess().getReturnTypeAssignment_4()); 
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
    // $ANTLR end "rule__Function_heading__Group__4__Impl"


    // $ANTLR start "rule__Function_declaration__Group__0"
    // InternalPascal.g:4119:1: rule__Function_declaration__Group__0 : rule__Function_declaration__Group__0__Impl rule__Function_declaration__Group__1 ;
    public final void rule__Function_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4123:1: ( rule__Function_declaration__Group__0__Impl rule__Function_declaration__Group__1 )
            // InternalPascal.g:4124:2: rule__Function_declaration__Group__0__Impl rule__Function_declaration__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Function_declaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Function_declaration__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:4131:1: rule__Function_declaration__Group__0__Impl : ( ( rule__Function_declaration__HeadingAssignment_0 ) ) ;
    public final void rule__Function_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4135:1: ( ( ( rule__Function_declaration__HeadingAssignment_0 ) ) )
            // InternalPascal.g:4136:1: ( ( rule__Function_declaration__HeadingAssignment_0 ) )
            {
            // InternalPascal.g:4136:1: ( ( rule__Function_declaration__HeadingAssignment_0 ) )
            // InternalPascal.g:4137:2: ( rule__Function_declaration__HeadingAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_declarationAccess().getHeadingAssignment_0()); 
            }
            // InternalPascal.g:4138:2: ( rule__Function_declaration__HeadingAssignment_0 )
            // InternalPascal.g:4138:3: rule__Function_declaration__HeadingAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Function_declaration__HeadingAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunction_declarationAccess().getHeadingAssignment_0()); 
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
    // $ANTLR end "rule__Function_declaration__Group__0__Impl"


    // $ANTLR start "rule__Function_declaration__Group__1"
    // InternalPascal.g:4146:1: rule__Function_declaration__Group__1 : rule__Function_declaration__Group__1__Impl rule__Function_declaration__Group__2 ;
    public final void rule__Function_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4150:1: ( rule__Function_declaration__Group__1__Impl rule__Function_declaration__Group__2 )
            // InternalPascal.g:4151:2: rule__Function_declaration__Group__1__Impl rule__Function_declaration__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Function_declaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Function_declaration__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:4158:1: rule__Function_declaration__Group__1__Impl : ( ';' ) ;
    public final void rule__Function_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4162:1: ( ( ';' ) )
            // InternalPascal.g:4163:1: ( ';' )
            {
            // InternalPascal.g:4163:1: ( ';' )
            // InternalPascal.g:4164:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_declarationAccess().getSemicolonKeyword_1()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunction_declarationAccess().getSemicolonKeyword_1()); 
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
    // $ANTLR end "rule__Function_declaration__Group__1__Impl"


    // $ANTLR start "rule__Function_declaration__Group__2"
    // InternalPascal.g:4173:1: rule__Function_declaration__Group__2 : rule__Function_declaration__Group__2__Impl ;
    public final void rule__Function_declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4177:1: ( rule__Function_declaration__Group__2__Impl )
            // InternalPascal.g:4178:2: rule__Function_declaration__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function_declaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:4184:1: rule__Function_declaration__Group__2__Impl : ( ( rule__Function_declaration__BlockAssignment_2 ) ) ;
    public final void rule__Function_declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4188:1: ( ( ( rule__Function_declaration__BlockAssignment_2 ) ) )
            // InternalPascal.g:4189:1: ( ( rule__Function_declaration__BlockAssignment_2 ) )
            {
            // InternalPascal.g:4189:1: ( ( rule__Function_declaration__BlockAssignment_2 ) )
            // InternalPascal.g:4190:2: ( rule__Function_declaration__BlockAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_declarationAccess().getBlockAssignment_2()); 
            }
            // InternalPascal.g:4191:2: ( rule__Function_declaration__BlockAssignment_2 )
            // InternalPascal.g:4191:3: rule__Function_declaration__BlockAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Function_declaration__BlockAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunction_declarationAccess().getBlockAssignment_2()); 
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
    // $ANTLR end "rule__Function_declaration__Group__2__Impl"


    // $ANTLR start "rule__Formal_parameter_list__Group__0"
    // InternalPascal.g:4200:1: rule__Formal_parameter_list__Group__0 : rule__Formal_parameter_list__Group__0__Impl rule__Formal_parameter_list__Group__1 ;
    public final void rule__Formal_parameter_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4204:1: ( rule__Formal_parameter_list__Group__0__Impl rule__Formal_parameter_list__Group__1 )
            // InternalPascal.g:4205:2: rule__Formal_parameter_list__Group__0__Impl rule__Formal_parameter_list__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__Formal_parameter_list__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Formal_parameter_list__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:4212:1: rule__Formal_parameter_list__Group__0__Impl : ( '(' ) ;
    public final void rule__Formal_parameter_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4216:1: ( ( '(' ) )
            // InternalPascal.g:4217:1: ( '(' )
            {
            // InternalPascal.g:4217:1: ( '(' )
            // InternalPascal.g:4218:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormal_parameter_listAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormal_parameter_listAccess().getLeftParenthesisKeyword_0()); 
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
    // $ANTLR end "rule__Formal_parameter_list__Group__0__Impl"


    // $ANTLR start "rule__Formal_parameter_list__Group__1"
    // InternalPascal.g:4227:1: rule__Formal_parameter_list__Group__1 : rule__Formal_parameter_list__Group__1__Impl rule__Formal_parameter_list__Group__2 ;
    public final void rule__Formal_parameter_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4231:1: ( rule__Formal_parameter_list__Group__1__Impl rule__Formal_parameter_list__Group__2 )
            // InternalPascal.g:4232:2: rule__Formal_parameter_list__Group__1__Impl rule__Formal_parameter_list__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__Formal_parameter_list__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Formal_parameter_list__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:4239:1: rule__Formal_parameter_list__Group__1__Impl : ( ( rule__Formal_parameter_list__ParametersAssignment_1 ) ) ;
    public final void rule__Formal_parameter_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4243:1: ( ( ( rule__Formal_parameter_list__ParametersAssignment_1 ) ) )
            // InternalPascal.g:4244:1: ( ( rule__Formal_parameter_list__ParametersAssignment_1 ) )
            {
            // InternalPascal.g:4244:1: ( ( rule__Formal_parameter_list__ParametersAssignment_1 ) )
            // InternalPascal.g:4245:2: ( rule__Formal_parameter_list__ParametersAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormal_parameter_listAccess().getParametersAssignment_1()); 
            }
            // InternalPascal.g:4246:2: ( rule__Formal_parameter_list__ParametersAssignment_1 )
            // InternalPascal.g:4246:3: rule__Formal_parameter_list__ParametersAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Formal_parameter_list__ParametersAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormal_parameter_listAccess().getParametersAssignment_1()); 
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
    // $ANTLR end "rule__Formal_parameter_list__Group__1__Impl"


    // $ANTLR start "rule__Formal_parameter_list__Group__2"
    // InternalPascal.g:4254:1: rule__Formal_parameter_list__Group__2 : rule__Formal_parameter_list__Group__2__Impl rule__Formal_parameter_list__Group__3 ;
    public final void rule__Formal_parameter_list__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4258:1: ( rule__Formal_parameter_list__Group__2__Impl rule__Formal_parameter_list__Group__3 )
            // InternalPascal.g:4259:2: rule__Formal_parameter_list__Group__2__Impl rule__Formal_parameter_list__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__Formal_parameter_list__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Formal_parameter_list__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:4266:1: rule__Formal_parameter_list__Group__2__Impl : ( ( rule__Formal_parameter_list__Group_2__0 )* ) ;
    public final void rule__Formal_parameter_list__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4270:1: ( ( ( rule__Formal_parameter_list__Group_2__0 )* ) )
            // InternalPascal.g:4271:1: ( ( rule__Formal_parameter_list__Group_2__0 )* )
            {
            // InternalPascal.g:4271:1: ( ( rule__Formal_parameter_list__Group_2__0 )* )
            // InternalPascal.g:4272:2: ( rule__Formal_parameter_list__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormal_parameter_listAccess().getGroup_2()); 
            }
            // InternalPascal.g:4273:2: ( rule__Formal_parameter_list__Group_2__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==22) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalPascal.g:4273:3: rule__Formal_parameter_list__Group_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Formal_parameter_list__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormal_parameter_listAccess().getGroup_2()); 
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
    // $ANTLR end "rule__Formal_parameter_list__Group__2__Impl"


    // $ANTLR start "rule__Formal_parameter_list__Group__3"
    // InternalPascal.g:4281:1: rule__Formal_parameter_list__Group__3 : rule__Formal_parameter_list__Group__3__Impl ;
    public final void rule__Formal_parameter_list__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4285:1: ( rule__Formal_parameter_list__Group__3__Impl )
            // InternalPascal.g:4286:2: rule__Formal_parameter_list__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Formal_parameter_list__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:4292:1: rule__Formal_parameter_list__Group__3__Impl : ( ')' ) ;
    public final void rule__Formal_parameter_list__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4296:1: ( ( ')' ) )
            // InternalPascal.g:4297:1: ( ')' )
            {
            // InternalPascal.g:4297:1: ( ')' )
            // InternalPascal.g:4298:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormal_parameter_listAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormal_parameter_listAccess().getRightParenthesisKeyword_3()); 
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
    // $ANTLR end "rule__Formal_parameter_list__Group__3__Impl"


    // $ANTLR start "rule__Formal_parameter_list__Group_2__0"
    // InternalPascal.g:4308:1: rule__Formal_parameter_list__Group_2__0 : rule__Formal_parameter_list__Group_2__0__Impl rule__Formal_parameter_list__Group_2__1 ;
    public final void rule__Formal_parameter_list__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4312:1: ( rule__Formal_parameter_list__Group_2__0__Impl rule__Formal_parameter_list__Group_2__1 )
            // InternalPascal.g:4313:2: rule__Formal_parameter_list__Group_2__0__Impl rule__Formal_parameter_list__Group_2__1
            {
            pushFollow(FOLLOW_27);
            rule__Formal_parameter_list__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Formal_parameter_list__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:4320:1: rule__Formal_parameter_list__Group_2__0__Impl : ( ';' ) ;
    public final void rule__Formal_parameter_list__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4324:1: ( ( ';' ) )
            // InternalPascal.g:4325:1: ( ';' )
            {
            // InternalPascal.g:4325:1: ( ';' )
            // InternalPascal.g:4326:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormal_parameter_listAccess().getSemicolonKeyword_2_0()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormal_parameter_listAccess().getSemicolonKeyword_2_0()); 
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
    // $ANTLR end "rule__Formal_parameter_list__Group_2__0__Impl"


    // $ANTLR start "rule__Formal_parameter_list__Group_2__1"
    // InternalPascal.g:4335:1: rule__Formal_parameter_list__Group_2__1 : rule__Formal_parameter_list__Group_2__1__Impl ;
    public final void rule__Formal_parameter_list__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4339:1: ( rule__Formal_parameter_list__Group_2__1__Impl )
            // InternalPascal.g:4340:2: rule__Formal_parameter_list__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Formal_parameter_list__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:4346:1: rule__Formal_parameter_list__Group_2__1__Impl : ( ( rule__Formal_parameter_list__ParametersAssignment_2_1 ) ) ;
    public final void rule__Formal_parameter_list__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4350:1: ( ( ( rule__Formal_parameter_list__ParametersAssignment_2_1 ) ) )
            // InternalPascal.g:4351:1: ( ( rule__Formal_parameter_list__ParametersAssignment_2_1 ) )
            {
            // InternalPascal.g:4351:1: ( ( rule__Formal_parameter_list__ParametersAssignment_2_1 ) )
            // InternalPascal.g:4352:2: ( rule__Formal_parameter_list__ParametersAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormal_parameter_listAccess().getParametersAssignment_2_1()); 
            }
            // InternalPascal.g:4353:2: ( rule__Formal_parameter_list__ParametersAssignment_2_1 )
            // InternalPascal.g:4353:3: rule__Formal_parameter_list__ParametersAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Formal_parameter_list__ParametersAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormal_parameter_listAccess().getParametersAssignment_2_1()); 
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
    // $ANTLR end "rule__Formal_parameter_list__Group_2__1__Impl"


    // $ANTLR start "rule__Value_parameter_section__Group__0"
    // InternalPascal.g:4362:1: rule__Value_parameter_section__Group__0 : rule__Value_parameter_section__Group__0__Impl rule__Value_parameter_section__Group__1 ;
    public final void rule__Value_parameter_section__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4366:1: ( rule__Value_parameter_section__Group__0__Impl rule__Value_parameter_section__Group__1 )
            // InternalPascal.g:4367:2: rule__Value_parameter_section__Group__0__Impl rule__Value_parameter_section__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Value_parameter_section__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Value_parameter_section__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:4374:1: rule__Value_parameter_section__Group__0__Impl : ( ( rule__Value_parameter_section__IdentifiersAssignment_0 ) ) ;
    public final void rule__Value_parameter_section__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4378:1: ( ( ( rule__Value_parameter_section__IdentifiersAssignment_0 ) ) )
            // InternalPascal.g:4379:1: ( ( rule__Value_parameter_section__IdentifiersAssignment_0 ) )
            {
            // InternalPascal.g:4379:1: ( ( rule__Value_parameter_section__IdentifiersAssignment_0 ) )
            // InternalPascal.g:4380:2: ( rule__Value_parameter_section__IdentifiersAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValue_parameter_sectionAccess().getIdentifiersAssignment_0()); 
            }
            // InternalPascal.g:4381:2: ( rule__Value_parameter_section__IdentifiersAssignment_0 )
            // InternalPascal.g:4381:3: rule__Value_parameter_section__IdentifiersAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Value_parameter_section__IdentifiersAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValue_parameter_sectionAccess().getIdentifiersAssignment_0()); 
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
    // $ANTLR end "rule__Value_parameter_section__Group__0__Impl"


    // $ANTLR start "rule__Value_parameter_section__Group__1"
    // InternalPascal.g:4389:1: rule__Value_parameter_section__Group__1 : rule__Value_parameter_section__Group__1__Impl rule__Value_parameter_section__Group__2 ;
    public final void rule__Value_parameter_section__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4393:1: ( rule__Value_parameter_section__Group__1__Impl rule__Value_parameter_section__Group__2 )
            // InternalPascal.g:4394:2: rule__Value_parameter_section__Group__1__Impl rule__Value_parameter_section__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Value_parameter_section__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Value_parameter_section__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:4401:1: rule__Value_parameter_section__Group__1__Impl : ( ':' ) ;
    public final void rule__Value_parameter_section__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4405:1: ( ( ':' ) )
            // InternalPascal.g:4406:1: ( ':' )
            {
            // InternalPascal.g:4406:1: ( ':' )
            // InternalPascal.g:4407:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValue_parameter_sectionAccess().getColonKeyword_1()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValue_parameter_sectionAccess().getColonKeyword_1()); 
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
    // $ANTLR end "rule__Value_parameter_section__Group__1__Impl"


    // $ANTLR start "rule__Value_parameter_section__Group__2"
    // InternalPascal.g:4416:1: rule__Value_parameter_section__Group__2 : rule__Value_parameter_section__Group__2__Impl ;
    public final void rule__Value_parameter_section__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4420:1: ( rule__Value_parameter_section__Group__2__Impl )
            // InternalPascal.g:4421:2: rule__Value_parameter_section__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Value_parameter_section__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:4427:1: rule__Value_parameter_section__Group__2__Impl : ( ( rule__Value_parameter_section__TypeAssignment_2 ) ) ;
    public final void rule__Value_parameter_section__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4431:1: ( ( ( rule__Value_parameter_section__TypeAssignment_2 ) ) )
            // InternalPascal.g:4432:1: ( ( rule__Value_parameter_section__TypeAssignment_2 ) )
            {
            // InternalPascal.g:4432:1: ( ( rule__Value_parameter_section__TypeAssignment_2 ) )
            // InternalPascal.g:4433:2: ( rule__Value_parameter_section__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValue_parameter_sectionAccess().getTypeAssignment_2()); 
            }
            // InternalPascal.g:4434:2: ( rule__Value_parameter_section__TypeAssignment_2 )
            // InternalPascal.g:4434:3: rule__Value_parameter_section__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Value_parameter_section__TypeAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValue_parameter_sectionAccess().getTypeAssignment_2()); 
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
    // $ANTLR end "rule__Value_parameter_section__Group__2__Impl"


    // $ANTLR start "rule__Identifier_list__Group__0"
    // InternalPascal.g:4443:1: rule__Identifier_list__Group__0 : rule__Identifier_list__Group__0__Impl rule__Identifier_list__Group__1 ;
    public final void rule__Identifier_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4447:1: ( rule__Identifier_list__Group__0__Impl rule__Identifier_list__Group__1 )
            // InternalPascal.g:4448:2: rule__Identifier_list__Group__0__Impl rule__Identifier_list__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Identifier_list__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Identifier_list__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:4455:1: rule__Identifier_list__Group__0__Impl : ( ( rule__Identifier_list__NamesAssignment_0 ) ) ;
    public final void rule__Identifier_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4459:1: ( ( ( rule__Identifier_list__NamesAssignment_0 ) ) )
            // InternalPascal.g:4460:1: ( ( rule__Identifier_list__NamesAssignment_0 ) )
            {
            // InternalPascal.g:4460:1: ( ( rule__Identifier_list__NamesAssignment_0 ) )
            // InternalPascal.g:4461:2: ( rule__Identifier_list__NamesAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifier_listAccess().getNamesAssignment_0()); 
            }
            // InternalPascal.g:4462:2: ( rule__Identifier_list__NamesAssignment_0 )
            // InternalPascal.g:4462:3: rule__Identifier_list__NamesAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Identifier_list__NamesAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentifier_listAccess().getNamesAssignment_0()); 
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
    // $ANTLR end "rule__Identifier_list__Group__0__Impl"


    // $ANTLR start "rule__Identifier_list__Group__1"
    // InternalPascal.g:4470:1: rule__Identifier_list__Group__1 : rule__Identifier_list__Group__1__Impl ;
    public final void rule__Identifier_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4474:1: ( rule__Identifier_list__Group__1__Impl )
            // InternalPascal.g:4475:2: rule__Identifier_list__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Identifier_list__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:4481:1: rule__Identifier_list__Group__1__Impl : ( ( rule__Identifier_list__Group_1__0 )* ) ;
    public final void rule__Identifier_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4485:1: ( ( ( rule__Identifier_list__Group_1__0 )* ) )
            // InternalPascal.g:4486:1: ( ( rule__Identifier_list__Group_1__0 )* )
            {
            // InternalPascal.g:4486:1: ( ( rule__Identifier_list__Group_1__0 )* )
            // InternalPascal.g:4487:2: ( rule__Identifier_list__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifier_listAccess().getGroup_1()); 
            }
            // InternalPascal.g:4488:2: ( rule__Identifier_list__Group_1__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==30) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalPascal.g:4488:3: rule__Identifier_list__Group_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Identifier_list__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentifier_listAccess().getGroup_1()); 
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
    // $ANTLR end "rule__Identifier_list__Group__1__Impl"


    // $ANTLR start "rule__Identifier_list__Group_1__0"
    // InternalPascal.g:4497:1: rule__Identifier_list__Group_1__0 : rule__Identifier_list__Group_1__0__Impl rule__Identifier_list__Group_1__1 ;
    public final void rule__Identifier_list__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4501:1: ( rule__Identifier_list__Group_1__0__Impl rule__Identifier_list__Group_1__1 )
            // InternalPascal.g:4502:2: rule__Identifier_list__Group_1__0__Impl rule__Identifier_list__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__Identifier_list__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Identifier_list__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:4509:1: rule__Identifier_list__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Identifier_list__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4513:1: ( ( ',' ) )
            // InternalPascal.g:4514:1: ( ',' )
            {
            // InternalPascal.g:4514:1: ( ',' )
            // InternalPascal.g:4515:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifier_listAccess().getCommaKeyword_1_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentifier_listAccess().getCommaKeyword_1_0()); 
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
    // $ANTLR end "rule__Identifier_list__Group_1__0__Impl"


    // $ANTLR start "rule__Identifier_list__Group_1__1"
    // InternalPascal.g:4524:1: rule__Identifier_list__Group_1__1 : rule__Identifier_list__Group_1__1__Impl ;
    public final void rule__Identifier_list__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4528:1: ( rule__Identifier_list__Group_1__1__Impl )
            // InternalPascal.g:4529:2: rule__Identifier_list__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Identifier_list__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:4535:1: rule__Identifier_list__Group_1__1__Impl : ( ( rule__Identifier_list__NamesAssignment_1_1 ) ) ;
    public final void rule__Identifier_list__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4539:1: ( ( ( rule__Identifier_list__NamesAssignment_1_1 ) ) )
            // InternalPascal.g:4540:1: ( ( rule__Identifier_list__NamesAssignment_1_1 ) )
            {
            // InternalPascal.g:4540:1: ( ( rule__Identifier_list__NamesAssignment_1_1 ) )
            // InternalPascal.g:4541:2: ( rule__Identifier_list__NamesAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifier_listAccess().getNamesAssignment_1_1()); 
            }
            // InternalPascal.g:4542:2: ( rule__Identifier_list__NamesAssignment_1_1 )
            // InternalPascal.g:4542:3: rule__Identifier_list__NamesAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Identifier_list__NamesAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentifier_listAccess().getNamesAssignment_1_1()); 
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
    // $ANTLR end "rule__Identifier_list__Group_1__1__Impl"


    // $ANTLR start "rule__Variable_parameter_section__Group__0"
    // InternalPascal.g:4551:1: rule__Variable_parameter_section__Group__0 : rule__Variable_parameter_section__Group__0__Impl rule__Variable_parameter_section__Group__1 ;
    public final void rule__Variable_parameter_section__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4555:1: ( rule__Variable_parameter_section__Group__0__Impl rule__Variable_parameter_section__Group__1 )
            // InternalPascal.g:4556:2: rule__Variable_parameter_section__Group__0__Impl rule__Variable_parameter_section__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Variable_parameter_section__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Variable_parameter_section__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:4563:1: rule__Variable_parameter_section__Group__0__Impl : ( 'var' ) ;
    public final void rule__Variable_parameter_section__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4567:1: ( ( 'var' ) )
            // InternalPascal.g:4568:1: ( 'var' )
            {
            // InternalPascal.g:4568:1: ( 'var' )
            // InternalPascal.g:4569:2: 'var'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_parameter_sectionAccess().getVarKeyword_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_parameter_sectionAccess().getVarKeyword_0()); 
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
    // $ANTLR end "rule__Variable_parameter_section__Group__0__Impl"


    // $ANTLR start "rule__Variable_parameter_section__Group__1"
    // InternalPascal.g:4578:1: rule__Variable_parameter_section__Group__1 : rule__Variable_parameter_section__Group__1__Impl rule__Variable_parameter_section__Group__2 ;
    public final void rule__Variable_parameter_section__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4582:1: ( rule__Variable_parameter_section__Group__1__Impl rule__Variable_parameter_section__Group__2 )
            // InternalPascal.g:4583:2: rule__Variable_parameter_section__Group__1__Impl rule__Variable_parameter_section__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Variable_parameter_section__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Variable_parameter_section__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:4590:1: rule__Variable_parameter_section__Group__1__Impl : ( ( rule__Variable_parameter_section__IndentifiersAssignment_1 ) ) ;
    public final void rule__Variable_parameter_section__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4594:1: ( ( ( rule__Variable_parameter_section__IndentifiersAssignment_1 ) ) )
            // InternalPascal.g:4595:1: ( ( rule__Variable_parameter_section__IndentifiersAssignment_1 ) )
            {
            // InternalPascal.g:4595:1: ( ( rule__Variable_parameter_section__IndentifiersAssignment_1 ) )
            // InternalPascal.g:4596:2: ( rule__Variable_parameter_section__IndentifiersAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_parameter_sectionAccess().getIndentifiersAssignment_1()); 
            }
            // InternalPascal.g:4597:2: ( rule__Variable_parameter_section__IndentifiersAssignment_1 )
            // InternalPascal.g:4597:3: rule__Variable_parameter_section__IndentifiersAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Variable_parameter_section__IndentifiersAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_parameter_sectionAccess().getIndentifiersAssignment_1()); 
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
    // $ANTLR end "rule__Variable_parameter_section__Group__1__Impl"


    // $ANTLR start "rule__Variable_parameter_section__Group__2"
    // InternalPascal.g:4605:1: rule__Variable_parameter_section__Group__2 : rule__Variable_parameter_section__Group__2__Impl rule__Variable_parameter_section__Group__3 ;
    public final void rule__Variable_parameter_section__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4609:1: ( rule__Variable_parameter_section__Group__2__Impl rule__Variable_parameter_section__Group__3 )
            // InternalPascal.g:4610:2: rule__Variable_parameter_section__Group__2__Impl rule__Variable_parameter_section__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Variable_parameter_section__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Variable_parameter_section__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:4617:1: rule__Variable_parameter_section__Group__2__Impl : ( ':' ) ;
    public final void rule__Variable_parameter_section__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4621:1: ( ( ':' ) )
            // InternalPascal.g:4622:1: ( ':' )
            {
            // InternalPascal.g:4622:1: ( ':' )
            // InternalPascal.g:4623:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_parameter_sectionAccess().getColonKeyword_2()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_parameter_sectionAccess().getColonKeyword_2()); 
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
    // $ANTLR end "rule__Variable_parameter_section__Group__2__Impl"


    // $ANTLR start "rule__Variable_parameter_section__Group__3"
    // InternalPascal.g:4632:1: rule__Variable_parameter_section__Group__3 : rule__Variable_parameter_section__Group__3__Impl ;
    public final void rule__Variable_parameter_section__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4636:1: ( rule__Variable_parameter_section__Group__3__Impl )
            // InternalPascal.g:4637:2: rule__Variable_parameter_section__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable_parameter_section__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:4643:1: rule__Variable_parameter_section__Group__3__Impl : ( ( rule__Variable_parameter_section__TypeAssignment_3 ) ) ;
    public final void rule__Variable_parameter_section__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4647:1: ( ( ( rule__Variable_parameter_section__TypeAssignment_3 ) ) )
            // InternalPascal.g:4648:1: ( ( rule__Variable_parameter_section__TypeAssignment_3 ) )
            {
            // InternalPascal.g:4648:1: ( ( rule__Variable_parameter_section__TypeAssignment_3 ) )
            // InternalPascal.g:4649:2: ( rule__Variable_parameter_section__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_parameter_sectionAccess().getTypeAssignment_3()); 
            }
            // InternalPascal.g:4650:2: ( rule__Variable_parameter_section__TypeAssignment_3 )
            // InternalPascal.g:4650:3: rule__Variable_parameter_section__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Variable_parameter_section__TypeAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_parameter_sectionAccess().getTypeAssignment_3()); 
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
    // $ANTLR end "rule__Variable_parameter_section__Group__3__Impl"


    // $ANTLR start "rule__Procedure_declaration__Group__0"
    // InternalPascal.g:4659:1: rule__Procedure_declaration__Group__0 : rule__Procedure_declaration__Group__0__Impl rule__Procedure_declaration__Group__1 ;
    public final void rule__Procedure_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4663:1: ( rule__Procedure_declaration__Group__0__Impl rule__Procedure_declaration__Group__1 )
            // InternalPascal.g:4664:2: rule__Procedure_declaration__Group__0__Impl rule__Procedure_declaration__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Procedure_declaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Procedure_declaration__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:4671:1: rule__Procedure_declaration__Group__0__Impl : ( ( rule__Procedure_declaration__HeadingAssignment_0 ) ) ;
    public final void rule__Procedure_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4675:1: ( ( ( rule__Procedure_declaration__HeadingAssignment_0 ) ) )
            // InternalPascal.g:4676:1: ( ( rule__Procedure_declaration__HeadingAssignment_0 ) )
            {
            // InternalPascal.g:4676:1: ( ( rule__Procedure_declaration__HeadingAssignment_0 ) )
            // InternalPascal.g:4677:2: ( rule__Procedure_declaration__HeadingAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcedure_declarationAccess().getHeadingAssignment_0()); 
            }
            // InternalPascal.g:4678:2: ( rule__Procedure_declaration__HeadingAssignment_0 )
            // InternalPascal.g:4678:3: rule__Procedure_declaration__HeadingAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Procedure_declaration__HeadingAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcedure_declarationAccess().getHeadingAssignment_0()); 
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
    // $ANTLR end "rule__Procedure_declaration__Group__0__Impl"


    // $ANTLR start "rule__Procedure_declaration__Group__1"
    // InternalPascal.g:4686:1: rule__Procedure_declaration__Group__1 : rule__Procedure_declaration__Group__1__Impl rule__Procedure_declaration__Group__2 ;
    public final void rule__Procedure_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4690:1: ( rule__Procedure_declaration__Group__1__Impl rule__Procedure_declaration__Group__2 )
            // InternalPascal.g:4691:2: rule__Procedure_declaration__Group__1__Impl rule__Procedure_declaration__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Procedure_declaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Procedure_declaration__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:4698:1: rule__Procedure_declaration__Group__1__Impl : ( ';' ) ;
    public final void rule__Procedure_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4702:1: ( ( ';' ) )
            // InternalPascal.g:4703:1: ( ';' )
            {
            // InternalPascal.g:4703:1: ( ';' )
            // InternalPascal.g:4704:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcedure_declarationAccess().getSemicolonKeyword_1()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcedure_declarationAccess().getSemicolonKeyword_1()); 
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
    // $ANTLR end "rule__Procedure_declaration__Group__1__Impl"


    // $ANTLR start "rule__Procedure_declaration__Group__2"
    // InternalPascal.g:4713:1: rule__Procedure_declaration__Group__2 : rule__Procedure_declaration__Group__2__Impl ;
    public final void rule__Procedure_declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4717:1: ( rule__Procedure_declaration__Group__2__Impl )
            // InternalPascal.g:4718:2: rule__Procedure_declaration__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Procedure_declaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:4724:1: rule__Procedure_declaration__Group__2__Impl : ( ( rule__Procedure_declaration__BlockAssignment_2 ) ) ;
    public final void rule__Procedure_declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4728:1: ( ( ( rule__Procedure_declaration__BlockAssignment_2 ) ) )
            // InternalPascal.g:4729:1: ( ( rule__Procedure_declaration__BlockAssignment_2 ) )
            {
            // InternalPascal.g:4729:1: ( ( rule__Procedure_declaration__BlockAssignment_2 ) )
            // InternalPascal.g:4730:2: ( rule__Procedure_declaration__BlockAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcedure_declarationAccess().getBlockAssignment_2()); 
            }
            // InternalPascal.g:4731:2: ( rule__Procedure_declaration__BlockAssignment_2 )
            // InternalPascal.g:4731:3: rule__Procedure_declaration__BlockAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Procedure_declaration__BlockAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcedure_declarationAccess().getBlockAssignment_2()); 
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
    // $ANTLR end "rule__Procedure_declaration__Group__2__Impl"


    // $ANTLR start "rule__Procedure_heading__Group__0"
    // InternalPascal.g:4740:1: rule__Procedure_heading__Group__0 : rule__Procedure_heading__Group__0__Impl rule__Procedure_heading__Group__1 ;
    public final void rule__Procedure_heading__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4744:1: ( rule__Procedure_heading__Group__0__Impl rule__Procedure_heading__Group__1 )
            // InternalPascal.g:4745:2: rule__Procedure_heading__Group__0__Impl rule__Procedure_heading__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Procedure_heading__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Procedure_heading__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:4752:1: rule__Procedure_heading__Group__0__Impl : ( 'procedure' ) ;
    public final void rule__Procedure_heading__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4756:1: ( ( 'procedure' ) )
            // InternalPascal.g:4757:1: ( 'procedure' )
            {
            // InternalPascal.g:4757:1: ( 'procedure' )
            // InternalPascal.g:4758:2: 'procedure'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcedure_headingAccess().getProcedureKeyword_0()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcedure_headingAccess().getProcedureKeyword_0()); 
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
    // $ANTLR end "rule__Procedure_heading__Group__0__Impl"


    // $ANTLR start "rule__Procedure_heading__Group__1"
    // InternalPascal.g:4767:1: rule__Procedure_heading__Group__1 : rule__Procedure_heading__Group__1__Impl rule__Procedure_heading__Group__2 ;
    public final void rule__Procedure_heading__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4771:1: ( rule__Procedure_heading__Group__1__Impl rule__Procedure_heading__Group__2 )
            // InternalPascal.g:4772:2: rule__Procedure_heading__Group__1__Impl rule__Procedure_heading__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__Procedure_heading__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Procedure_heading__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:4779:1: rule__Procedure_heading__Group__1__Impl : ( ( rule__Procedure_heading__NameAssignment_1 ) ) ;
    public final void rule__Procedure_heading__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4783:1: ( ( ( rule__Procedure_heading__NameAssignment_1 ) ) )
            // InternalPascal.g:4784:1: ( ( rule__Procedure_heading__NameAssignment_1 ) )
            {
            // InternalPascal.g:4784:1: ( ( rule__Procedure_heading__NameAssignment_1 ) )
            // InternalPascal.g:4785:2: ( rule__Procedure_heading__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcedure_headingAccess().getNameAssignment_1()); 
            }
            // InternalPascal.g:4786:2: ( rule__Procedure_heading__NameAssignment_1 )
            // InternalPascal.g:4786:3: rule__Procedure_heading__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Procedure_heading__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcedure_headingAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__Procedure_heading__Group__1__Impl"


    // $ANTLR start "rule__Procedure_heading__Group__2"
    // InternalPascal.g:4794:1: rule__Procedure_heading__Group__2 : rule__Procedure_heading__Group__2__Impl ;
    public final void rule__Procedure_heading__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4798:1: ( rule__Procedure_heading__Group__2__Impl )
            // InternalPascal.g:4799:2: rule__Procedure_heading__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Procedure_heading__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:4805:1: rule__Procedure_heading__Group__2__Impl : ( ( rule__Procedure_heading__ParametersAssignment_2 )? ) ;
    public final void rule__Procedure_heading__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4809:1: ( ( ( rule__Procedure_heading__ParametersAssignment_2 )? ) )
            // InternalPascal.g:4810:1: ( ( rule__Procedure_heading__ParametersAssignment_2 )? )
            {
            // InternalPascal.g:4810:1: ( ( rule__Procedure_heading__ParametersAssignment_2 )? )
            // InternalPascal.g:4811:2: ( rule__Procedure_heading__ParametersAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcedure_headingAccess().getParametersAssignment_2()); 
            }
            // InternalPascal.g:4812:2: ( rule__Procedure_heading__ParametersAssignment_2 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==31) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalPascal.g:4812:3: rule__Procedure_heading__ParametersAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Procedure_heading__ParametersAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcedure_headingAccess().getParametersAssignment_2()); 
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
    // $ANTLR end "rule__Procedure_heading__Group__2__Impl"


    // $ANTLR start "rule__Set__Group__0"
    // InternalPascal.g:4821:1: rule__Set__Group__0 : rule__Set__Group__0__Impl rule__Set__Group__1 ;
    public final void rule__Set__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4825:1: ( rule__Set__Group__0__Impl rule__Set__Group__1 )
            // InternalPascal.g:4826:2: rule__Set__Group__0__Impl rule__Set__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__Set__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Set__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:4833:1: rule__Set__Group__0__Impl : ( ( rule__Set__BracketsAssignment_0 ) ) ;
    public final void rule__Set__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4837:1: ( ( ( rule__Set__BracketsAssignment_0 ) ) )
            // InternalPascal.g:4838:1: ( ( rule__Set__BracketsAssignment_0 ) )
            {
            // InternalPascal.g:4838:1: ( ( rule__Set__BracketsAssignment_0 ) )
            // InternalPascal.g:4839:2: ( rule__Set__BracketsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetAccess().getBracketsAssignment_0()); 
            }
            // InternalPascal.g:4840:2: ( rule__Set__BracketsAssignment_0 )
            // InternalPascal.g:4840:3: rule__Set__BracketsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Set__BracketsAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetAccess().getBracketsAssignment_0()); 
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
    // $ANTLR end "rule__Set__Group__0__Impl"


    // $ANTLR start "rule__Set__Group__1"
    // InternalPascal.g:4848:1: rule__Set__Group__1 : rule__Set__Group__1__Impl rule__Set__Group__2 ;
    public final void rule__Set__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4852:1: ( rule__Set__Group__1__Impl rule__Set__Group__2 )
            // InternalPascal.g:4853:2: rule__Set__Group__1__Impl rule__Set__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__Set__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Set__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:4860:1: rule__Set__Group__1__Impl : ( ( rule__Set__ExpressionsAssignment_1 )? ) ;
    public final void rule__Set__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4864:1: ( ( ( rule__Set__ExpressionsAssignment_1 )? ) )
            // InternalPascal.g:4865:1: ( ( rule__Set__ExpressionsAssignment_1 )? )
            {
            // InternalPascal.g:4865:1: ( ( rule__Set__ExpressionsAssignment_1 )? )
            // InternalPascal.g:4866:2: ( rule__Set__ExpressionsAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetAccess().getExpressionsAssignment_1()); 
            }
            // InternalPascal.g:4867:2: ( rule__Set__ExpressionsAssignment_1 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=RULE_ID && LA42_0<=RULE_INTEGER_NUMBER)||LA42_0==RULE_ADDITION_OP||LA42_0==RULE_STRING||(LA42_0>=RULE_SIGNED_REAL_NUMBER && LA42_0<=RULE_REAL_NUMBER)||LA42_0==27||LA42_0==31||LA42_0==33||(LA42_0>=51 && LA42_0<=53)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalPascal.g:4867:3: rule__Set__ExpressionsAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Set__ExpressionsAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetAccess().getExpressionsAssignment_1()); 
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
    // $ANTLR end "rule__Set__Group__1__Impl"


    // $ANTLR start "rule__Set__Group__2"
    // InternalPascal.g:4875:1: rule__Set__Group__2 : rule__Set__Group__2__Impl ;
    public final void rule__Set__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4879:1: ( rule__Set__Group__2__Impl )
            // InternalPascal.g:4880:2: rule__Set__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Set__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:4886:1: rule__Set__Group__2__Impl : ( ( rule__Set__BracketsAssignment_2 ) ) ;
    public final void rule__Set__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4890:1: ( ( ( rule__Set__BracketsAssignment_2 ) ) )
            // InternalPascal.g:4891:1: ( ( rule__Set__BracketsAssignment_2 ) )
            {
            // InternalPascal.g:4891:1: ( ( rule__Set__BracketsAssignment_2 ) )
            // InternalPascal.g:4892:2: ( rule__Set__BracketsAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetAccess().getBracketsAssignment_2()); 
            }
            // InternalPascal.g:4893:2: ( rule__Set__BracketsAssignment_2 )
            // InternalPascal.g:4893:3: rule__Set__BracketsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Set__BracketsAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetAccess().getBracketsAssignment_2()); 
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
    // $ANTLR end "rule__Set__Group__2__Impl"


    // $ANTLR start "rule__Label_declaration__Group__0"
    // InternalPascal.g:4902:1: rule__Label_declaration__Group__0 : rule__Label_declaration__Group__0__Impl rule__Label_declaration__Group__1 ;
    public final void rule__Label_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4906:1: ( rule__Label_declaration__Group__0__Impl rule__Label_declaration__Group__1 )
            // InternalPascal.g:4907:2: rule__Label_declaration__Group__0__Impl rule__Label_declaration__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__Label_declaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Label_declaration__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:4914:1: rule__Label_declaration__Group__0__Impl : ( 'label' ) ;
    public final void rule__Label_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4918:1: ( ( 'label' ) )
            // InternalPascal.g:4919:1: ( 'label' )
            {
            // InternalPascal.g:4919:1: ( 'label' )
            // InternalPascal.g:4920:2: 'label'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabel_declarationAccess().getLabelKeyword_0()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLabel_declarationAccess().getLabelKeyword_0()); 
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
    // $ANTLR end "rule__Label_declaration__Group__0__Impl"


    // $ANTLR start "rule__Label_declaration__Group__1"
    // InternalPascal.g:4929:1: rule__Label_declaration__Group__1 : rule__Label_declaration__Group__1__Impl rule__Label_declaration__Group__2 ;
    public final void rule__Label_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4933:1: ( rule__Label_declaration__Group__1__Impl rule__Label_declaration__Group__2 )
            // InternalPascal.g:4934:2: rule__Label_declaration__Group__1__Impl rule__Label_declaration__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__Label_declaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Label_declaration__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:4941:1: rule__Label_declaration__Group__1__Impl : ( ( rule__Label_declaration__LabelsAssignment_1 ) ) ;
    public final void rule__Label_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4945:1: ( ( ( rule__Label_declaration__LabelsAssignment_1 ) ) )
            // InternalPascal.g:4946:1: ( ( rule__Label_declaration__LabelsAssignment_1 ) )
            {
            // InternalPascal.g:4946:1: ( ( rule__Label_declaration__LabelsAssignment_1 ) )
            // InternalPascal.g:4947:2: ( rule__Label_declaration__LabelsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabel_declarationAccess().getLabelsAssignment_1()); 
            }
            // InternalPascal.g:4948:2: ( rule__Label_declaration__LabelsAssignment_1 )
            // InternalPascal.g:4948:3: rule__Label_declaration__LabelsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Label_declaration__LabelsAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLabel_declarationAccess().getLabelsAssignment_1()); 
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
    // $ANTLR end "rule__Label_declaration__Group__1__Impl"


    // $ANTLR start "rule__Label_declaration__Group__2"
    // InternalPascal.g:4956:1: rule__Label_declaration__Group__2 : rule__Label_declaration__Group__2__Impl rule__Label_declaration__Group__3 ;
    public final void rule__Label_declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4960:1: ( rule__Label_declaration__Group__2__Impl rule__Label_declaration__Group__3 )
            // InternalPascal.g:4961:2: rule__Label_declaration__Group__2__Impl rule__Label_declaration__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__Label_declaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Label_declaration__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:4968:1: rule__Label_declaration__Group__2__Impl : ( ( rule__Label_declaration__Group_2__0 )* ) ;
    public final void rule__Label_declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4972:1: ( ( ( rule__Label_declaration__Group_2__0 )* ) )
            // InternalPascal.g:4973:1: ( ( rule__Label_declaration__Group_2__0 )* )
            {
            // InternalPascal.g:4973:1: ( ( rule__Label_declaration__Group_2__0 )* )
            // InternalPascal.g:4974:2: ( rule__Label_declaration__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabel_declarationAccess().getGroup_2()); 
            }
            // InternalPascal.g:4975:2: ( rule__Label_declaration__Group_2__0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==30) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalPascal.g:4975:3: rule__Label_declaration__Group_2__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Label_declaration__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLabel_declarationAccess().getGroup_2()); 
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
    // $ANTLR end "rule__Label_declaration__Group__2__Impl"


    // $ANTLR start "rule__Label_declaration__Group__3"
    // InternalPascal.g:4983:1: rule__Label_declaration__Group__3 : rule__Label_declaration__Group__3__Impl ;
    public final void rule__Label_declaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4987:1: ( rule__Label_declaration__Group__3__Impl )
            // InternalPascal.g:4988:2: rule__Label_declaration__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Label_declaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:4994:1: rule__Label_declaration__Group__3__Impl : ( ';' ) ;
    public final void rule__Label_declaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4998:1: ( ( ';' ) )
            // InternalPascal.g:4999:1: ( ';' )
            {
            // InternalPascal.g:4999:1: ( ';' )
            // InternalPascal.g:5000:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabel_declarationAccess().getSemicolonKeyword_3()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLabel_declarationAccess().getSemicolonKeyword_3()); 
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
    // $ANTLR end "rule__Label_declaration__Group__3__Impl"


    // $ANTLR start "rule__Label_declaration__Group_2__0"
    // InternalPascal.g:5010:1: rule__Label_declaration__Group_2__0 : rule__Label_declaration__Group_2__0__Impl rule__Label_declaration__Group_2__1 ;
    public final void rule__Label_declaration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5014:1: ( rule__Label_declaration__Group_2__0__Impl rule__Label_declaration__Group_2__1 )
            // InternalPascal.g:5015:2: rule__Label_declaration__Group_2__0__Impl rule__Label_declaration__Group_2__1
            {
            pushFollow(FOLLOW_30);
            rule__Label_declaration__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Label_declaration__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:5022:1: rule__Label_declaration__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Label_declaration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5026:1: ( ( ',' ) )
            // InternalPascal.g:5027:1: ( ',' )
            {
            // InternalPascal.g:5027:1: ( ',' )
            // InternalPascal.g:5028:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabel_declarationAccess().getCommaKeyword_2_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLabel_declarationAccess().getCommaKeyword_2_0()); 
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
    // $ANTLR end "rule__Label_declaration__Group_2__0__Impl"


    // $ANTLR start "rule__Label_declaration__Group_2__1"
    // InternalPascal.g:5037:1: rule__Label_declaration__Group_2__1 : rule__Label_declaration__Group_2__1__Impl ;
    public final void rule__Label_declaration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5041:1: ( rule__Label_declaration__Group_2__1__Impl )
            // InternalPascal.g:5042:2: rule__Label_declaration__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Label_declaration__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:5048:1: rule__Label_declaration__Group_2__1__Impl : ( ( rule__Label_declaration__LabelsAssignment_2_1 ) ) ;
    public final void rule__Label_declaration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5052:1: ( ( ( rule__Label_declaration__LabelsAssignment_2_1 ) ) )
            // InternalPascal.g:5053:1: ( ( rule__Label_declaration__LabelsAssignment_2_1 ) )
            {
            // InternalPascal.g:5053:1: ( ( rule__Label_declaration__LabelsAssignment_2_1 ) )
            // InternalPascal.g:5054:2: ( rule__Label_declaration__LabelsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabel_declarationAccess().getLabelsAssignment_2_1()); 
            }
            // InternalPascal.g:5055:2: ( rule__Label_declaration__LabelsAssignment_2_1 )
            // InternalPascal.g:5055:3: rule__Label_declaration__LabelsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Label_declaration__LabelsAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLabel_declarationAccess().getLabelsAssignment_2_1()); 
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
    // $ANTLR end "rule__Label_declaration__Group_2__1__Impl"


    // $ANTLR start "rule__Constant__Group_0__0"
    // InternalPascal.g:5064:1: rule__Constant__Group_0__0 : rule__Constant__Group_0__0__Impl rule__Constant__Group_0__1 ;
    public final void rule__Constant__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5068:1: ( rule__Constant__Group_0__0__Impl rule__Constant__Group_0__1 )
            // InternalPascal.g:5069:2: rule__Constant__Group_0__0__Impl rule__Constant__Group_0__1
            {
            pushFollow(FOLLOW_32);
            rule__Constant__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Constant__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:5076:1: rule__Constant__Group_0__0__Impl : ( ( rule__Constant__OpteratorAssignment_0_0 )? ) ;
    public final void rule__Constant__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5080:1: ( ( ( rule__Constant__OpteratorAssignment_0_0 )? ) )
            // InternalPascal.g:5081:1: ( ( rule__Constant__OpteratorAssignment_0_0 )? )
            {
            // InternalPascal.g:5081:1: ( ( rule__Constant__OpteratorAssignment_0_0 )? )
            // InternalPascal.g:5082:2: ( rule__Constant__OpteratorAssignment_0_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getOpteratorAssignment_0_0()); 
            }
            // InternalPascal.g:5083:2: ( rule__Constant__OpteratorAssignment_0_0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ADDITION_OP) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalPascal.g:5083:3: rule__Constant__OpteratorAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constant__OpteratorAssignment_0_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getOpteratorAssignment_0_0()); 
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
    // $ANTLR end "rule__Constant__Group_0__0__Impl"


    // $ANTLR start "rule__Constant__Group_0__1"
    // InternalPascal.g:5091:1: rule__Constant__Group_0__1 : rule__Constant__Group_0__1__Impl ;
    public final void rule__Constant__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5095:1: ( rule__Constant__Group_0__1__Impl )
            // InternalPascal.g:5096:2: rule__Constant__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constant__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:5102:1: rule__Constant__Group_0__1__Impl : ( ( rule__Constant__Alternatives_0_1 ) ) ;
    public final void rule__Constant__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5106:1: ( ( ( rule__Constant__Alternatives_0_1 ) ) )
            // InternalPascal.g:5107:1: ( ( rule__Constant__Alternatives_0_1 ) )
            {
            // InternalPascal.g:5107:1: ( ( rule__Constant__Alternatives_0_1 ) )
            // InternalPascal.g:5108:2: ( rule__Constant__Alternatives_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getAlternatives_0_1()); 
            }
            // InternalPascal.g:5109:2: ( rule__Constant__Alternatives_0_1 )
            // InternalPascal.g:5109:3: rule__Constant__Alternatives_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Constant__Alternatives_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getAlternatives_0_1()); 
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
    // $ANTLR end "rule__Constant__Group_0__1__Impl"


    // $ANTLR start "rule__Constant_definition_part__Group__0"
    // InternalPascal.g:5118:1: rule__Constant_definition_part__Group__0 : rule__Constant_definition_part__Group__0__Impl rule__Constant_definition_part__Group__1 ;
    public final void rule__Constant_definition_part__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5122:1: ( rule__Constant_definition_part__Group__0__Impl rule__Constant_definition_part__Group__1 )
            // InternalPascal.g:5123:2: rule__Constant_definition_part__Group__0__Impl rule__Constant_definition_part__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Constant_definition_part__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Constant_definition_part__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:5130:1: rule__Constant_definition_part__Group__0__Impl : ( 'const' ) ;
    public final void rule__Constant_definition_part__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5134:1: ( ( 'const' ) )
            // InternalPascal.g:5135:1: ( 'const' )
            {
            // InternalPascal.g:5135:1: ( 'const' )
            // InternalPascal.g:5136:2: 'const'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstant_definition_partAccess().getConstKeyword_0()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstant_definition_partAccess().getConstKeyword_0()); 
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
    // $ANTLR end "rule__Constant_definition_part__Group__0__Impl"


    // $ANTLR start "rule__Constant_definition_part__Group__1"
    // InternalPascal.g:5145:1: rule__Constant_definition_part__Group__1 : rule__Constant_definition_part__Group__1__Impl ;
    public final void rule__Constant_definition_part__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5149:1: ( rule__Constant_definition_part__Group__1__Impl )
            // InternalPascal.g:5150:2: rule__Constant_definition_part__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constant_definition_part__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:5156:1: rule__Constant_definition_part__Group__1__Impl : ( ( ( rule__Constant_definition_part__Group_1__0 ) ) ( ( rule__Constant_definition_part__Group_1__0 )* ) ) ;
    public final void rule__Constant_definition_part__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5160:1: ( ( ( ( rule__Constant_definition_part__Group_1__0 ) ) ( ( rule__Constant_definition_part__Group_1__0 )* ) ) )
            // InternalPascal.g:5161:1: ( ( ( rule__Constant_definition_part__Group_1__0 ) ) ( ( rule__Constant_definition_part__Group_1__0 )* ) )
            {
            // InternalPascal.g:5161:1: ( ( ( rule__Constant_definition_part__Group_1__0 ) ) ( ( rule__Constant_definition_part__Group_1__0 )* ) )
            // InternalPascal.g:5162:2: ( ( rule__Constant_definition_part__Group_1__0 ) ) ( ( rule__Constant_definition_part__Group_1__0 )* )
            {
            // InternalPascal.g:5162:2: ( ( rule__Constant_definition_part__Group_1__0 ) )
            // InternalPascal.g:5163:3: ( rule__Constant_definition_part__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstant_definition_partAccess().getGroup_1()); 
            }
            // InternalPascal.g:5164:3: ( rule__Constant_definition_part__Group_1__0 )
            // InternalPascal.g:5164:4: rule__Constant_definition_part__Group_1__0
            {
            pushFollow(FOLLOW_33);
            rule__Constant_definition_part__Group_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstant_definition_partAccess().getGroup_1()); 
            }

            }

            // InternalPascal.g:5167:2: ( ( rule__Constant_definition_part__Group_1__0 )* )
            // InternalPascal.g:5168:3: ( rule__Constant_definition_part__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstant_definition_partAccess().getGroup_1()); 
            }
            // InternalPascal.g:5169:3: ( rule__Constant_definition_part__Group_1__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==RULE_ID) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalPascal.g:5169:4: rule__Constant_definition_part__Group_1__0
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__Constant_definition_part__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstant_definition_partAccess().getGroup_1()); 
            }

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
    // InternalPascal.g:5179:1: rule__Constant_definition_part__Group_1__0 : rule__Constant_definition_part__Group_1__0__Impl rule__Constant_definition_part__Group_1__1 ;
    public final void rule__Constant_definition_part__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5183:1: ( rule__Constant_definition_part__Group_1__0__Impl rule__Constant_definition_part__Group_1__1 )
            // InternalPascal.g:5184:2: rule__Constant_definition_part__Group_1__0__Impl rule__Constant_definition_part__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__Constant_definition_part__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Constant_definition_part__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:5191:1: rule__Constant_definition_part__Group_1__0__Impl : ( ( rule__Constant_definition_part__ConstsAssignment_1_0 ) ) ;
    public final void rule__Constant_definition_part__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5195:1: ( ( ( rule__Constant_definition_part__ConstsAssignment_1_0 ) ) )
            // InternalPascal.g:5196:1: ( ( rule__Constant_definition_part__ConstsAssignment_1_0 ) )
            {
            // InternalPascal.g:5196:1: ( ( rule__Constant_definition_part__ConstsAssignment_1_0 ) )
            // InternalPascal.g:5197:2: ( rule__Constant_definition_part__ConstsAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstant_definition_partAccess().getConstsAssignment_1_0()); 
            }
            // InternalPascal.g:5198:2: ( rule__Constant_definition_part__ConstsAssignment_1_0 )
            // InternalPascal.g:5198:3: rule__Constant_definition_part__ConstsAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Constant_definition_part__ConstsAssignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstant_definition_partAccess().getConstsAssignment_1_0()); 
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
    // $ANTLR end "rule__Constant_definition_part__Group_1__0__Impl"


    // $ANTLR start "rule__Constant_definition_part__Group_1__1"
    // InternalPascal.g:5206:1: rule__Constant_definition_part__Group_1__1 : rule__Constant_definition_part__Group_1__1__Impl ;
    public final void rule__Constant_definition_part__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5210:1: ( rule__Constant_definition_part__Group_1__1__Impl )
            // InternalPascal.g:5211:2: rule__Constant_definition_part__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constant_definition_part__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:5217:1: rule__Constant_definition_part__Group_1__1__Impl : ( ';' ) ;
    public final void rule__Constant_definition_part__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5221:1: ( ( ';' ) )
            // InternalPascal.g:5222:1: ( ';' )
            {
            // InternalPascal.g:5222:1: ( ';' )
            // InternalPascal.g:5223:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstant_definition_partAccess().getSemicolonKeyword_1_1()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstant_definition_partAccess().getSemicolonKeyword_1_1()); 
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
    // $ANTLR end "rule__Constant_definition_part__Group_1__1__Impl"


    // $ANTLR start "rule__Constant_definition__Group__0"
    // InternalPascal.g:5233:1: rule__Constant_definition__Group__0 : rule__Constant_definition__Group__0__Impl rule__Constant_definition__Group__1 ;
    public final void rule__Constant_definition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5237:1: ( rule__Constant_definition__Group__0__Impl rule__Constant_definition__Group__1 )
            // InternalPascal.g:5238:2: rule__Constant_definition__Group__0__Impl rule__Constant_definition__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__Constant_definition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Constant_definition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:5245:1: rule__Constant_definition__Group__0__Impl : ( ( rule__Constant_definition__NameAssignment_0 ) ) ;
    public final void rule__Constant_definition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5249:1: ( ( ( rule__Constant_definition__NameAssignment_0 ) ) )
            // InternalPascal.g:5250:1: ( ( rule__Constant_definition__NameAssignment_0 ) )
            {
            // InternalPascal.g:5250:1: ( ( rule__Constant_definition__NameAssignment_0 ) )
            // InternalPascal.g:5251:2: ( rule__Constant_definition__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstant_definitionAccess().getNameAssignment_0()); 
            }
            // InternalPascal.g:5252:2: ( rule__Constant_definition__NameAssignment_0 )
            // InternalPascal.g:5252:3: rule__Constant_definition__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Constant_definition__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstant_definitionAccess().getNameAssignment_0()); 
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
    // $ANTLR end "rule__Constant_definition__Group__0__Impl"


    // $ANTLR start "rule__Constant_definition__Group__1"
    // InternalPascal.g:5260:1: rule__Constant_definition__Group__1 : rule__Constant_definition__Group__1__Impl rule__Constant_definition__Group__2 ;
    public final void rule__Constant_definition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5264:1: ( rule__Constant_definition__Group__1__Impl rule__Constant_definition__Group__2 )
            // InternalPascal.g:5265:2: rule__Constant_definition__Group__1__Impl rule__Constant_definition__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__Constant_definition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Constant_definition__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:5272:1: rule__Constant_definition__Group__1__Impl : ( '=' ) ;
    public final void rule__Constant_definition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5276:1: ( ( '=' ) )
            // InternalPascal.g:5277:1: ( '=' )
            {
            // InternalPascal.g:5277:1: ( '=' )
            // InternalPascal.g:5278:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstant_definitionAccess().getEqualsSignKeyword_1()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstant_definitionAccess().getEqualsSignKeyword_1()); 
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
    // $ANTLR end "rule__Constant_definition__Group__1__Impl"


    // $ANTLR start "rule__Constant_definition__Group__2"
    // InternalPascal.g:5287:1: rule__Constant_definition__Group__2 : rule__Constant_definition__Group__2__Impl ;
    public final void rule__Constant_definition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5291:1: ( rule__Constant_definition__Group__2__Impl )
            // InternalPascal.g:5292:2: rule__Constant_definition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constant_definition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:5298:1: rule__Constant_definition__Group__2__Impl : ( ( rule__Constant_definition__ConstAssignment_2 ) ) ;
    public final void rule__Constant_definition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5302:1: ( ( ( rule__Constant_definition__ConstAssignment_2 ) ) )
            // InternalPascal.g:5303:1: ( ( rule__Constant_definition__ConstAssignment_2 ) )
            {
            // InternalPascal.g:5303:1: ( ( rule__Constant_definition__ConstAssignment_2 ) )
            // InternalPascal.g:5304:2: ( rule__Constant_definition__ConstAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstant_definitionAccess().getConstAssignment_2()); 
            }
            // InternalPascal.g:5305:2: ( rule__Constant_definition__ConstAssignment_2 )
            // InternalPascal.g:5305:3: rule__Constant_definition__ConstAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Constant_definition__ConstAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstant_definitionAccess().getConstAssignment_2()); 
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
    // $ANTLR end "rule__Constant_definition__Group__2__Impl"


    // $ANTLR start "rule__Type_definition_part__Group__0"
    // InternalPascal.g:5314:1: rule__Type_definition_part__Group__0 : rule__Type_definition_part__Group__0__Impl rule__Type_definition_part__Group__1 ;
    public final void rule__Type_definition_part__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5318:1: ( rule__Type_definition_part__Group__0__Impl rule__Type_definition_part__Group__1 )
            // InternalPascal.g:5319:2: rule__Type_definition_part__Group__0__Impl rule__Type_definition_part__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Type_definition_part__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Type_definition_part__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:5326:1: rule__Type_definition_part__Group__0__Impl : ( 'type' ) ;
    public final void rule__Type_definition_part__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5330:1: ( ( 'type' ) )
            // InternalPascal.g:5331:1: ( 'type' )
            {
            // InternalPascal.g:5331:1: ( 'type' )
            // InternalPascal.g:5332:2: 'type'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_definition_partAccess().getTypeKeyword_0()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getType_definition_partAccess().getTypeKeyword_0()); 
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
    // $ANTLR end "rule__Type_definition_part__Group__0__Impl"


    // $ANTLR start "rule__Type_definition_part__Group__1"
    // InternalPascal.g:5341:1: rule__Type_definition_part__Group__1 : rule__Type_definition_part__Group__1__Impl ;
    public final void rule__Type_definition_part__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5345:1: ( rule__Type_definition_part__Group__1__Impl )
            // InternalPascal.g:5346:2: rule__Type_definition_part__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type_definition_part__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:5352:1: rule__Type_definition_part__Group__1__Impl : ( ( ( rule__Type_definition_part__Group_1__0 ) ) ( ( rule__Type_definition_part__Group_1__0 )* ) ) ;
    public final void rule__Type_definition_part__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5356:1: ( ( ( ( rule__Type_definition_part__Group_1__0 ) ) ( ( rule__Type_definition_part__Group_1__0 )* ) ) )
            // InternalPascal.g:5357:1: ( ( ( rule__Type_definition_part__Group_1__0 ) ) ( ( rule__Type_definition_part__Group_1__0 )* ) )
            {
            // InternalPascal.g:5357:1: ( ( ( rule__Type_definition_part__Group_1__0 ) ) ( ( rule__Type_definition_part__Group_1__0 )* ) )
            // InternalPascal.g:5358:2: ( ( rule__Type_definition_part__Group_1__0 ) ) ( ( rule__Type_definition_part__Group_1__0 )* )
            {
            // InternalPascal.g:5358:2: ( ( rule__Type_definition_part__Group_1__0 ) )
            // InternalPascal.g:5359:3: ( rule__Type_definition_part__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_definition_partAccess().getGroup_1()); 
            }
            // InternalPascal.g:5360:3: ( rule__Type_definition_part__Group_1__0 )
            // InternalPascal.g:5360:4: rule__Type_definition_part__Group_1__0
            {
            pushFollow(FOLLOW_33);
            rule__Type_definition_part__Group_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getType_definition_partAccess().getGroup_1()); 
            }

            }

            // InternalPascal.g:5363:2: ( ( rule__Type_definition_part__Group_1__0 )* )
            // InternalPascal.g:5364:3: ( rule__Type_definition_part__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_definition_partAccess().getGroup_1()); 
            }
            // InternalPascal.g:5365:3: ( rule__Type_definition_part__Group_1__0 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==RULE_ID) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalPascal.g:5365:4: rule__Type_definition_part__Group_1__0
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__Type_definition_part__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getType_definition_partAccess().getGroup_1()); 
            }

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
    // InternalPascal.g:5375:1: rule__Type_definition_part__Group_1__0 : rule__Type_definition_part__Group_1__0__Impl rule__Type_definition_part__Group_1__1 ;
    public final void rule__Type_definition_part__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5379:1: ( rule__Type_definition_part__Group_1__0__Impl rule__Type_definition_part__Group_1__1 )
            // InternalPascal.g:5380:2: rule__Type_definition_part__Group_1__0__Impl rule__Type_definition_part__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__Type_definition_part__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Type_definition_part__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:5387:1: rule__Type_definition_part__Group_1__0__Impl : ( ( rule__Type_definition_part__TypesAssignment_1_0 ) ) ;
    public final void rule__Type_definition_part__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5391:1: ( ( ( rule__Type_definition_part__TypesAssignment_1_0 ) ) )
            // InternalPascal.g:5392:1: ( ( rule__Type_definition_part__TypesAssignment_1_0 ) )
            {
            // InternalPascal.g:5392:1: ( ( rule__Type_definition_part__TypesAssignment_1_0 ) )
            // InternalPascal.g:5393:2: ( rule__Type_definition_part__TypesAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_definition_partAccess().getTypesAssignment_1_0()); 
            }
            // InternalPascal.g:5394:2: ( rule__Type_definition_part__TypesAssignment_1_0 )
            // InternalPascal.g:5394:3: rule__Type_definition_part__TypesAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Type_definition_part__TypesAssignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getType_definition_partAccess().getTypesAssignment_1_0()); 
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
    // $ANTLR end "rule__Type_definition_part__Group_1__0__Impl"


    // $ANTLR start "rule__Type_definition_part__Group_1__1"
    // InternalPascal.g:5402:1: rule__Type_definition_part__Group_1__1 : rule__Type_definition_part__Group_1__1__Impl ;
    public final void rule__Type_definition_part__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5406:1: ( rule__Type_definition_part__Group_1__1__Impl )
            // InternalPascal.g:5407:2: rule__Type_definition_part__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type_definition_part__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:5413:1: rule__Type_definition_part__Group_1__1__Impl : ( ';' ) ;
    public final void rule__Type_definition_part__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5417:1: ( ( ';' ) )
            // InternalPascal.g:5418:1: ( ';' )
            {
            // InternalPascal.g:5418:1: ( ';' )
            // InternalPascal.g:5419:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_definition_partAccess().getSemicolonKeyword_1_1()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getType_definition_partAccess().getSemicolonKeyword_1_1()); 
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
    // $ANTLR end "rule__Type_definition_part__Group_1__1__Impl"


    // $ANTLR start "rule__Type_definition__Group__0"
    // InternalPascal.g:5429:1: rule__Type_definition__Group__0 : rule__Type_definition__Group__0__Impl rule__Type_definition__Group__1 ;
    public final void rule__Type_definition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5433:1: ( rule__Type_definition__Group__0__Impl rule__Type_definition__Group__1 )
            // InternalPascal.g:5434:2: rule__Type_definition__Group__0__Impl rule__Type_definition__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__Type_definition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Type_definition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:5441:1: rule__Type_definition__Group__0__Impl : ( ( rule__Type_definition__NameAssignment_0 ) ) ;
    public final void rule__Type_definition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5445:1: ( ( ( rule__Type_definition__NameAssignment_0 ) ) )
            // InternalPascal.g:5446:1: ( ( rule__Type_definition__NameAssignment_0 ) )
            {
            // InternalPascal.g:5446:1: ( ( rule__Type_definition__NameAssignment_0 ) )
            // InternalPascal.g:5447:2: ( rule__Type_definition__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_definitionAccess().getNameAssignment_0()); 
            }
            // InternalPascal.g:5448:2: ( rule__Type_definition__NameAssignment_0 )
            // InternalPascal.g:5448:3: rule__Type_definition__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Type_definition__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getType_definitionAccess().getNameAssignment_0()); 
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
    // $ANTLR end "rule__Type_definition__Group__0__Impl"


    // $ANTLR start "rule__Type_definition__Group__1"
    // InternalPascal.g:5456:1: rule__Type_definition__Group__1 : rule__Type_definition__Group__1__Impl rule__Type_definition__Group__2 ;
    public final void rule__Type_definition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5460:1: ( rule__Type_definition__Group__1__Impl rule__Type_definition__Group__2 )
            // InternalPascal.g:5461:2: rule__Type_definition__Group__1__Impl rule__Type_definition__Group__2
            {
            pushFollow(FOLLOW_36);
            rule__Type_definition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Type_definition__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:5468:1: rule__Type_definition__Group__1__Impl : ( '=' ) ;
    public final void rule__Type_definition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5472:1: ( ( '=' ) )
            // InternalPascal.g:5473:1: ( '=' )
            {
            // InternalPascal.g:5473:1: ( '=' )
            // InternalPascal.g:5474:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_definitionAccess().getEqualsSignKeyword_1()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getType_definitionAccess().getEqualsSignKeyword_1()); 
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
    // $ANTLR end "rule__Type_definition__Group__1__Impl"


    // $ANTLR start "rule__Type_definition__Group__2"
    // InternalPascal.g:5483:1: rule__Type_definition__Group__2 : rule__Type_definition__Group__2__Impl ;
    public final void rule__Type_definition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5487:1: ( rule__Type_definition__Group__2__Impl )
            // InternalPascal.g:5488:2: rule__Type_definition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type_definition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:5494:1: rule__Type_definition__Group__2__Impl : ( ( rule__Type_definition__TypeAssignment_2 ) ) ;
    public final void rule__Type_definition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5498:1: ( ( ( rule__Type_definition__TypeAssignment_2 ) ) )
            // InternalPascal.g:5499:1: ( ( rule__Type_definition__TypeAssignment_2 ) )
            {
            // InternalPascal.g:5499:1: ( ( rule__Type_definition__TypeAssignment_2 ) )
            // InternalPascal.g:5500:2: ( rule__Type_definition__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_definitionAccess().getTypeAssignment_2()); 
            }
            // InternalPascal.g:5501:2: ( rule__Type_definition__TypeAssignment_2 )
            // InternalPascal.g:5501:3: rule__Type_definition__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Type_definition__TypeAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getType_definitionAccess().getTypeAssignment_2()); 
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
    // $ANTLR end "rule__Type_definition__Group__2__Impl"


    // $ANTLR start "rule__Subrange_type__Group_0__0"
    // InternalPascal.g:5510:1: rule__Subrange_type__Group_0__0 : rule__Subrange_type__Group_0__0__Impl rule__Subrange_type__Group_0__1 ;
    public final void rule__Subrange_type__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5514:1: ( rule__Subrange_type__Group_0__0__Impl rule__Subrange_type__Group_0__1 )
            // InternalPascal.g:5515:2: rule__Subrange_type__Group_0__0__Impl rule__Subrange_type__Group_0__1
            {
            pushFollow(FOLLOW_37);
            rule__Subrange_type__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Subrange_type__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:5522:1: rule__Subrange_type__Group_0__0__Impl : ( ( rule__Subrange_type__InitialConstAssignment_0_0 ) ) ;
    public final void rule__Subrange_type__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5526:1: ( ( ( rule__Subrange_type__InitialConstAssignment_0_0 ) ) )
            // InternalPascal.g:5527:1: ( ( rule__Subrange_type__InitialConstAssignment_0_0 ) )
            {
            // InternalPascal.g:5527:1: ( ( rule__Subrange_type__InitialConstAssignment_0_0 ) )
            // InternalPascal.g:5528:2: ( rule__Subrange_type__InitialConstAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubrange_typeAccess().getInitialConstAssignment_0_0()); 
            }
            // InternalPascal.g:5529:2: ( rule__Subrange_type__InitialConstAssignment_0_0 )
            // InternalPascal.g:5529:3: rule__Subrange_type__InitialConstAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Subrange_type__InitialConstAssignment_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubrange_typeAccess().getInitialConstAssignment_0_0()); 
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
    // $ANTLR end "rule__Subrange_type__Group_0__0__Impl"


    // $ANTLR start "rule__Subrange_type__Group_0__1"
    // InternalPascal.g:5537:1: rule__Subrange_type__Group_0__1 : rule__Subrange_type__Group_0__1__Impl rule__Subrange_type__Group_0__2 ;
    public final void rule__Subrange_type__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5541:1: ( rule__Subrange_type__Group_0__1__Impl rule__Subrange_type__Group_0__2 )
            // InternalPascal.g:5542:2: rule__Subrange_type__Group_0__1__Impl rule__Subrange_type__Group_0__2
            {
            pushFollow(FOLLOW_35);
            rule__Subrange_type__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Subrange_type__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:5549:1: rule__Subrange_type__Group_0__1__Impl : ( '..' ) ;
    public final void rule__Subrange_type__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5553:1: ( ( '..' ) )
            // InternalPascal.g:5554:1: ( '..' )
            {
            // InternalPascal.g:5554:1: ( '..' )
            // InternalPascal.g:5555:2: '..'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubrange_typeAccess().getFullStopFullStopKeyword_0_1()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubrange_typeAccess().getFullStopFullStopKeyword_0_1()); 
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
    // $ANTLR end "rule__Subrange_type__Group_0__1__Impl"


    // $ANTLR start "rule__Subrange_type__Group_0__2"
    // InternalPascal.g:5564:1: rule__Subrange_type__Group_0__2 : rule__Subrange_type__Group_0__2__Impl ;
    public final void rule__Subrange_type__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5568:1: ( rule__Subrange_type__Group_0__2__Impl )
            // InternalPascal.g:5569:2: rule__Subrange_type__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subrange_type__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:5575:1: rule__Subrange_type__Group_0__2__Impl : ( ( rule__Subrange_type__FinalConstAssignment_0_2 ) ) ;
    public final void rule__Subrange_type__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5579:1: ( ( ( rule__Subrange_type__FinalConstAssignment_0_2 ) ) )
            // InternalPascal.g:5580:1: ( ( rule__Subrange_type__FinalConstAssignment_0_2 ) )
            {
            // InternalPascal.g:5580:1: ( ( rule__Subrange_type__FinalConstAssignment_0_2 ) )
            // InternalPascal.g:5581:2: ( rule__Subrange_type__FinalConstAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubrange_typeAccess().getFinalConstAssignment_0_2()); 
            }
            // InternalPascal.g:5582:2: ( rule__Subrange_type__FinalConstAssignment_0_2 )
            // InternalPascal.g:5582:3: rule__Subrange_type__FinalConstAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Subrange_type__FinalConstAssignment_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubrange_typeAccess().getFinalConstAssignment_0_2()); 
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
    // $ANTLR end "rule__Subrange_type__Group_0__2__Impl"


    // $ANTLR start "rule__Subrange_type__Group_1__0"
    // InternalPascal.g:5591:1: rule__Subrange_type__Group_1__0 : rule__Subrange_type__Group_1__0__Impl rule__Subrange_type__Group_1__1 ;
    public final void rule__Subrange_type__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5595:1: ( rule__Subrange_type__Group_1__0__Impl rule__Subrange_type__Group_1__1 )
            // InternalPascal.g:5596:2: rule__Subrange_type__Group_1__0__Impl rule__Subrange_type__Group_1__1
            {
            pushFollow(FOLLOW_35);
            rule__Subrange_type__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Subrange_type__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:5603:1: rule__Subrange_type__Group_1__0__Impl : ( ( rule__Subrange_type__SubrangeAssignment_1_0 ) ) ;
    public final void rule__Subrange_type__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5607:1: ( ( ( rule__Subrange_type__SubrangeAssignment_1_0 ) ) )
            // InternalPascal.g:5608:1: ( ( rule__Subrange_type__SubrangeAssignment_1_0 ) )
            {
            // InternalPascal.g:5608:1: ( ( rule__Subrange_type__SubrangeAssignment_1_0 ) )
            // InternalPascal.g:5609:2: ( rule__Subrange_type__SubrangeAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubrange_typeAccess().getSubrangeAssignment_1_0()); 
            }
            // InternalPascal.g:5610:2: ( rule__Subrange_type__SubrangeAssignment_1_0 )
            // InternalPascal.g:5610:3: rule__Subrange_type__SubrangeAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Subrange_type__SubrangeAssignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubrange_typeAccess().getSubrangeAssignment_1_0()); 
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
    // $ANTLR end "rule__Subrange_type__Group_1__0__Impl"


    // $ANTLR start "rule__Subrange_type__Group_1__1"
    // InternalPascal.g:5618:1: rule__Subrange_type__Group_1__1 : rule__Subrange_type__Group_1__1__Impl ;
    public final void rule__Subrange_type__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5622:1: ( rule__Subrange_type__Group_1__1__Impl )
            // InternalPascal.g:5623:2: rule__Subrange_type__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subrange_type__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:5629:1: rule__Subrange_type__Group_1__1__Impl : ( ( rule__Subrange_type__ConstAssignment_1_1 ) ) ;
    public final void rule__Subrange_type__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5633:1: ( ( ( rule__Subrange_type__ConstAssignment_1_1 ) ) )
            // InternalPascal.g:5634:1: ( ( rule__Subrange_type__ConstAssignment_1_1 ) )
            {
            // InternalPascal.g:5634:1: ( ( rule__Subrange_type__ConstAssignment_1_1 ) )
            // InternalPascal.g:5635:2: ( rule__Subrange_type__ConstAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubrange_typeAccess().getConstAssignment_1_1()); 
            }
            // InternalPascal.g:5636:2: ( rule__Subrange_type__ConstAssignment_1_1 )
            // InternalPascal.g:5636:3: rule__Subrange_type__ConstAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Subrange_type__ConstAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubrange_typeAccess().getConstAssignment_1_1()); 
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
    // $ANTLR end "rule__Subrange_type__Group_1__1__Impl"


    // $ANTLR start "rule__Enumerated_type__Group__0"
    // InternalPascal.g:5645:1: rule__Enumerated_type__Group__0 : rule__Enumerated_type__Group__0__Impl rule__Enumerated_type__Group__1 ;
    public final void rule__Enumerated_type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5649:1: ( rule__Enumerated_type__Group__0__Impl rule__Enumerated_type__Group__1 )
            // InternalPascal.g:5650:2: rule__Enumerated_type__Group__0__Impl rule__Enumerated_type__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Enumerated_type__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Enumerated_type__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:5657:1: rule__Enumerated_type__Group__0__Impl : ( '(' ) ;
    public final void rule__Enumerated_type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5661:1: ( ( '(' ) )
            // InternalPascal.g:5662:1: ( '(' )
            {
            // InternalPascal.g:5662:1: ( '(' )
            // InternalPascal.g:5663:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerated_typeAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerated_typeAccess().getLeftParenthesisKeyword_0()); 
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
    // $ANTLR end "rule__Enumerated_type__Group__0__Impl"


    // $ANTLR start "rule__Enumerated_type__Group__1"
    // InternalPascal.g:5672:1: rule__Enumerated_type__Group__1 : rule__Enumerated_type__Group__1__Impl rule__Enumerated_type__Group__2 ;
    public final void rule__Enumerated_type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5676:1: ( rule__Enumerated_type__Group__1__Impl rule__Enumerated_type__Group__2 )
            // InternalPascal.g:5677:2: rule__Enumerated_type__Group__1__Impl rule__Enumerated_type__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__Enumerated_type__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Enumerated_type__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:5684:1: rule__Enumerated_type__Group__1__Impl : ( ( rule__Enumerated_type__IdentifiersAssignment_1 ) ) ;
    public final void rule__Enumerated_type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5688:1: ( ( ( rule__Enumerated_type__IdentifiersAssignment_1 ) ) )
            // InternalPascal.g:5689:1: ( ( rule__Enumerated_type__IdentifiersAssignment_1 ) )
            {
            // InternalPascal.g:5689:1: ( ( rule__Enumerated_type__IdentifiersAssignment_1 ) )
            // InternalPascal.g:5690:2: ( rule__Enumerated_type__IdentifiersAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerated_typeAccess().getIdentifiersAssignment_1()); 
            }
            // InternalPascal.g:5691:2: ( rule__Enumerated_type__IdentifiersAssignment_1 )
            // InternalPascal.g:5691:3: rule__Enumerated_type__IdentifiersAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Enumerated_type__IdentifiersAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerated_typeAccess().getIdentifiersAssignment_1()); 
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
    // $ANTLR end "rule__Enumerated_type__Group__1__Impl"


    // $ANTLR start "rule__Enumerated_type__Group__2"
    // InternalPascal.g:5699:1: rule__Enumerated_type__Group__2 : rule__Enumerated_type__Group__2__Impl ;
    public final void rule__Enumerated_type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5703:1: ( rule__Enumerated_type__Group__2__Impl )
            // InternalPascal.g:5704:2: rule__Enumerated_type__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Enumerated_type__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:5710:1: rule__Enumerated_type__Group__2__Impl : ( ')' ) ;
    public final void rule__Enumerated_type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5714:1: ( ( ')' ) )
            // InternalPascal.g:5715:1: ( ')' )
            {
            // InternalPascal.g:5715:1: ( ')' )
            // InternalPascal.g:5716:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerated_typeAccess().getRightParenthesisKeyword_2()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerated_typeAccess().getRightParenthesisKeyword_2()); 
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
    // $ANTLR end "rule__Enumerated_type__Group__2__Impl"


    // $ANTLR start "rule__Structured_type__Group__0"
    // InternalPascal.g:5726:1: rule__Structured_type__Group__0 : rule__Structured_type__Group__0__Impl rule__Structured_type__Group__1 ;
    public final void rule__Structured_type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5730:1: ( rule__Structured_type__Group__0__Impl rule__Structured_type__Group__1 )
            // InternalPascal.g:5731:2: rule__Structured_type__Group__0__Impl rule__Structured_type__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__Structured_type__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Structured_type__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structured_type__Group__0"


    // $ANTLR start "rule__Structured_type__Group__0__Impl"
    // InternalPascal.g:5738:1: rule__Structured_type__Group__0__Impl : ( ( rule__Structured_type__PackedAssignment_0 )? ) ;
    public final void rule__Structured_type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5742:1: ( ( ( rule__Structured_type__PackedAssignment_0 )? ) )
            // InternalPascal.g:5743:1: ( ( rule__Structured_type__PackedAssignment_0 )? )
            {
            // InternalPascal.g:5743:1: ( ( rule__Structured_type__PackedAssignment_0 )? )
            // InternalPascal.g:5744:2: ( rule__Structured_type__PackedAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStructured_typeAccess().getPackedAssignment_0()); 
            }
            // InternalPascal.g:5745:2: ( rule__Structured_type__PackedAssignment_0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==54) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalPascal.g:5745:3: rule__Structured_type__PackedAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Structured_type__PackedAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStructured_typeAccess().getPackedAssignment_0()); 
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
    // $ANTLR end "rule__Structured_type__Group__0__Impl"


    // $ANTLR start "rule__Structured_type__Group__1"
    // InternalPascal.g:5753:1: rule__Structured_type__Group__1 : rule__Structured_type__Group__1__Impl ;
    public final void rule__Structured_type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5757:1: ( rule__Structured_type__Group__1__Impl )
            // InternalPascal.g:5758:2: rule__Structured_type__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Structured_type__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structured_type__Group__1"


    // $ANTLR start "rule__Structured_type__Group__1__Impl"
    // InternalPascal.g:5764:1: rule__Structured_type__Group__1__Impl : ( ( rule__Structured_type__TypeAssignment_1 ) ) ;
    public final void rule__Structured_type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5768:1: ( ( ( rule__Structured_type__TypeAssignment_1 ) ) )
            // InternalPascal.g:5769:1: ( ( rule__Structured_type__TypeAssignment_1 ) )
            {
            // InternalPascal.g:5769:1: ( ( rule__Structured_type__TypeAssignment_1 ) )
            // InternalPascal.g:5770:2: ( rule__Structured_type__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStructured_typeAccess().getTypeAssignment_1()); 
            }
            // InternalPascal.g:5771:2: ( rule__Structured_type__TypeAssignment_1 )
            // InternalPascal.g:5771:3: rule__Structured_type__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Structured_type__TypeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStructured_typeAccess().getTypeAssignment_1()); 
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
    // $ANTLR end "rule__Structured_type__Group__1__Impl"


    // $ANTLR start "rule__Record_type__Group__0"
    // InternalPascal.g:5780:1: rule__Record_type__Group__0 : rule__Record_type__Group__0__Impl rule__Record_type__Group__1 ;
    public final void rule__Record_type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5784:1: ( rule__Record_type__Group__0__Impl rule__Record_type__Group__1 )
            // InternalPascal.g:5785:2: rule__Record_type__Group__0__Impl rule__Record_type__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__Record_type__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Record_type__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record_type__Group__0"


    // $ANTLR start "rule__Record_type__Group__0__Impl"
    // InternalPascal.g:5792:1: rule__Record_type__Group__0__Impl : ( ( rule__Record_type__RecordKeywordAssignment_0 ) ) ;
    public final void rule__Record_type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5796:1: ( ( ( rule__Record_type__RecordKeywordAssignment_0 ) ) )
            // InternalPascal.g:5797:1: ( ( rule__Record_type__RecordKeywordAssignment_0 ) )
            {
            // InternalPascal.g:5797:1: ( ( rule__Record_type__RecordKeywordAssignment_0 ) )
            // InternalPascal.g:5798:2: ( rule__Record_type__RecordKeywordAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecord_typeAccess().getRecordKeywordAssignment_0()); 
            }
            // InternalPascal.g:5799:2: ( rule__Record_type__RecordKeywordAssignment_0 )
            // InternalPascal.g:5799:3: rule__Record_type__RecordKeywordAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Record_type__RecordKeywordAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecord_typeAccess().getRecordKeywordAssignment_0()); 
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
    // $ANTLR end "rule__Record_type__Group__0__Impl"


    // $ANTLR start "rule__Record_type__Group__1"
    // InternalPascal.g:5807:1: rule__Record_type__Group__1 : rule__Record_type__Group__1__Impl rule__Record_type__Group__2 ;
    public final void rule__Record_type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5811:1: ( rule__Record_type__Group__1__Impl rule__Record_type__Group__2 )
            // InternalPascal.g:5812:2: rule__Record_type__Group__1__Impl rule__Record_type__Group__2
            {
            pushFollow(FOLLOW_39);
            rule__Record_type__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Record_type__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record_type__Group__1"


    // $ANTLR start "rule__Record_type__Group__1__Impl"
    // InternalPascal.g:5819:1: rule__Record_type__Group__1__Impl : ( ( rule__Record_type__FieldsAssignment_1 )? ) ;
    public final void rule__Record_type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5823:1: ( ( ( rule__Record_type__FieldsAssignment_1 )? ) )
            // InternalPascal.g:5824:1: ( ( rule__Record_type__FieldsAssignment_1 )? )
            {
            // InternalPascal.g:5824:1: ( ( rule__Record_type__FieldsAssignment_1 )? )
            // InternalPascal.g:5825:2: ( rule__Record_type__FieldsAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecord_typeAccess().getFieldsAssignment_1()); 
            }
            // InternalPascal.g:5826:2: ( rule__Record_type__FieldsAssignment_1 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_ID||LA48_0==42) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalPascal.g:5826:3: rule__Record_type__FieldsAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Record_type__FieldsAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecord_typeAccess().getFieldsAssignment_1()); 
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
    // $ANTLR end "rule__Record_type__Group__1__Impl"


    // $ANTLR start "rule__Record_type__Group__2"
    // InternalPascal.g:5834:1: rule__Record_type__Group__2 : rule__Record_type__Group__2__Impl ;
    public final void rule__Record_type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5838:1: ( rule__Record_type__Group__2__Impl )
            // InternalPascal.g:5839:2: rule__Record_type__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Record_type__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record_type__Group__2"


    // $ANTLR start "rule__Record_type__Group__2__Impl"
    // InternalPascal.g:5845:1: rule__Record_type__Group__2__Impl : ( ( rule__Record_type__EndKeywordAssignment_2 ) ) ;
    public final void rule__Record_type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5849:1: ( ( ( rule__Record_type__EndKeywordAssignment_2 ) ) )
            // InternalPascal.g:5850:1: ( ( rule__Record_type__EndKeywordAssignment_2 ) )
            {
            // InternalPascal.g:5850:1: ( ( rule__Record_type__EndKeywordAssignment_2 ) )
            // InternalPascal.g:5851:2: ( rule__Record_type__EndKeywordAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecord_typeAccess().getEndKeywordAssignment_2()); 
            }
            // InternalPascal.g:5852:2: ( rule__Record_type__EndKeywordAssignment_2 )
            // InternalPascal.g:5852:3: rule__Record_type__EndKeywordAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Record_type__EndKeywordAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecord_typeAccess().getEndKeywordAssignment_2()); 
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
    // $ANTLR end "rule__Record_type__Group__2__Impl"


    // $ANTLR start "rule__Field_list__Group__0"
    // InternalPascal.g:5861:1: rule__Field_list__Group__0 : rule__Field_list__Group__0__Impl rule__Field_list__Group__1 ;
    public final void rule__Field_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5865:1: ( rule__Field_list__Group__0__Impl rule__Field_list__Group__1 )
            // InternalPascal.g:5866:2: rule__Field_list__Group__0__Impl rule__Field_list__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Field_list__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Field_list__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field_list__Group__0"


    // $ANTLR start "rule__Field_list__Group__0__Impl"
    // InternalPascal.g:5873:1: rule__Field_list__Group__0__Impl : ( ( rule__Field_list__Alternatives_0 ) ) ;
    public final void rule__Field_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5877:1: ( ( ( rule__Field_list__Alternatives_0 ) ) )
            // InternalPascal.g:5878:1: ( ( rule__Field_list__Alternatives_0 ) )
            {
            // InternalPascal.g:5878:1: ( ( rule__Field_list__Alternatives_0 ) )
            // InternalPascal.g:5879:2: ( rule__Field_list__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_listAccess().getAlternatives_0()); 
            }
            // InternalPascal.g:5880:2: ( rule__Field_list__Alternatives_0 )
            // InternalPascal.g:5880:3: rule__Field_list__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Field_list__Alternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getField_listAccess().getAlternatives_0()); 
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
    // $ANTLR end "rule__Field_list__Group__0__Impl"


    // $ANTLR start "rule__Field_list__Group__1"
    // InternalPascal.g:5888:1: rule__Field_list__Group__1 : rule__Field_list__Group__1__Impl ;
    public final void rule__Field_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5892:1: ( rule__Field_list__Group__1__Impl )
            // InternalPascal.g:5893:2: rule__Field_list__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Field_list__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field_list__Group__1"


    // $ANTLR start "rule__Field_list__Group__1__Impl"
    // InternalPascal.g:5899:1: rule__Field_list__Group__1__Impl : ( ( ';' )? ) ;
    public final void rule__Field_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5903:1: ( ( ( ';' )? ) )
            // InternalPascal.g:5904:1: ( ( ';' )? )
            {
            // InternalPascal.g:5904:1: ( ( ';' )? )
            // InternalPascal.g:5905:2: ( ';' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_listAccess().getSemicolonKeyword_1()); 
            }
            // InternalPascal.g:5906:2: ( ';' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==22) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalPascal.g:5906:3: ';'
                    {
                    match(input,22,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getField_listAccess().getSemicolonKeyword_1()); 
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
    // $ANTLR end "rule__Field_list__Group__1__Impl"


    // $ANTLR start "rule__Field_list__Group_0_0__0"
    // InternalPascal.g:5915:1: rule__Field_list__Group_0_0__0 : rule__Field_list__Group_0_0__0__Impl rule__Field_list__Group_0_0__1 ;
    public final void rule__Field_list__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5919:1: ( rule__Field_list__Group_0_0__0__Impl rule__Field_list__Group_0_0__1 )
            // InternalPascal.g:5920:2: rule__Field_list__Group_0_0__0__Impl rule__Field_list__Group_0_0__1
            {
            pushFollow(FOLLOW_7);
            rule__Field_list__Group_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Field_list__Group_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field_list__Group_0_0__0"


    // $ANTLR start "rule__Field_list__Group_0_0__0__Impl"
    // InternalPascal.g:5927:1: rule__Field_list__Group_0_0__0__Impl : ( ( rule__Field_list__FixedAssignment_0_0_0 ) ) ;
    public final void rule__Field_list__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5931:1: ( ( ( rule__Field_list__FixedAssignment_0_0_0 ) ) )
            // InternalPascal.g:5932:1: ( ( rule__Field_list__FixedAssignment_0_0_0 ) )
            {
            // InternalPascal.g:5932:1: ( ( rule__Field_list__FixedAssignment_0_0_0 ) )
            // InternalPascal.g:5933:2: ( rule__Field_list__FixedAssignment_0_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_listAccess().getFixedAssignment_0_0_0()); 
            }
            // InternalPascal.g:5934:2: ( rule__Field_list__FixedAssignment_0_0_0 )
            // InternalPascal.g:5934:3: rule__Field_list__FixedAssignment_0_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Field_list__FixedAssignment_0_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getField_listAccess().getFixedAssignment_0_0_0()); 
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
    // $ANTLR end "rule__Field_list__Group_0_0__0__Impl"


    // $ANTLR start "rule__Field_list__Group_0_0__1"
    // InternalPascal.g:5942:1: rule__Field_list__Group_0_0__1 : rule__Field_list__Group_0_0__1__Impl ;
    public final void rule__Field_list__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5946:1: ( rule__Field_list__Group_0_0__1__Impl )
            // InternalPascal.g:5947:2: rule__Field_list__Group_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Field_list__Group_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field_list__Group_0_0__1"


    // $ANTLR start "rule__Field_list__Group_0_0__1__Impl"
    // InternalPascal.g:5953:1: rule__Field_list__Group_0_0__1__Impl : ( ( rule__Field_list__Group_0_0_1__0 )? ) ;
    public final void rule__Field_list__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5957:1: ( ( ( rule__Field_list__Group_0_0_1__0 )? ) )
            // InternalPascal.g:5958:1: ( ( rule__Field_list__Group_0_0_1__0 )? )
            {
            // InternalPascal.g:5958:1: ( ( rule__Field_list__Group_0_0_1__0 )? )
            // InternalPascal.g:5959:2: ( rule__Field_list__Group_0_0_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_listAccess().getGroup_0_0_1()); 
            }
            // InternalPascal.g:5960:2: ( rule__Field_list__Group_0_0_1__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==22) ) {
                int LA50_1 = input.LA(2);

                if ( (LA50_1==42) ) {
                    alt50=1;
                }
            }
            switch (alt50) {
                case 1 :
                    // InternalPascal.g:5960:3: rule__Field_list__Group_0_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Field_list__Group_0_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getField_listAccess().getGroup_0_0_1()); 
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
    // $ANTLR end "rule__Field_list__Group_0_0__1__Impl"


    // $ANTLR start "rule__Field_list__Group_0_0_1__0"
    // InternalPascal.g:5969:1: rule__Field_list__Group_0_0_1__0 : rule__Field_list__Group_0_0_1__0__Impl rule__Field_list__Group_0_0_1__1 ;
    public final void rule__Field_list__Group_0_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5973:1: ( rule__Field_list__Group_0_0_1__0__Impl rule__Field_list__Group_0_0_1__1 )
            // InternalPascal.g:5974:2: rule__Field_list__Group_0_0_1__0__Impl rule__Field_list__Group_0_0_1__1
            {
            pushFollow(FOLLOW_40);
            rule__Field_list__Group_0_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Field_list__Group_0_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field_list__Group_0_0_1__0"


    // $ANTLR start "rule__Field_list__Group_0_0_1__0__Impl"
    // InternalPascal.g:5981:1: rule__Field_list__Group_0_0_1__0__Impl : ( ';' ) ;
    public final void rule__Field_list__Group_0_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5985:1: ( ( ';' ) )
            // InternalPascal.g:5986:1: ( ';' )
            {
            // InternalPascal.g:5986:1: ( ';' )
            // InternalPascal.g:5987:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_listAccess().getSemicolonKeyword_0_0_1_0()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getField_listAccess().getSemicolonKeyword_0_0_1_0()); 
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
    // $ANTLR end "rule__Field_list__Group_0_0_1__0__Impl"


    // $ANTLR start "rule__Field_list__Group_0_0_1__1"
    // InternalPascal.g:5996:1: rule__Field_list__Group_0_0_1__1 : rule__Field_list__Group_0_0_1__1__Impl ;
    public final void rule__Field_list__Group_0_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6000:1: ( rule__Field_list__Group_0_0_1__1__Impl )
            // InternalPascal.g:6001:2: rule__Field_list__Group_0_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Field_list__Group_0_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field_list__Group_0_0_1__1"


    // $ANTLR start "rule__Field_list__Group_0_0_1__1__Impl"
    // InternalPascal.g:6007:1: rule__Field_list__Group_0_0_1__1__Impl : ( ( rule__Field_list__VariantsAssignment_0_0_1_1 ) ) ;
    public final void rule__Field_list__Group_0_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6011:1: ( ( ( rule__Field_list__VariantsAssignment_0_0_1_1 ) ) )
            // InternalPascal.g:6012:1: ( ( rule__Field_list__VariantsAssignment_0_0_1_1 ) )
            {
            // InternalPascal.g:6012:1: ( ( rule__Field_list__VariantsAssignment_0_0_1_1 ) )
            // InternalPascal.g:6013:2: ( rule__Field_list__VariantsAssignment_0_0_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_listAccess().getVariantsAssignment_0_0_1_1()); 
            }
            // InternalPascal.g:6014:2: ( rule__Field_list__VariantsAssignment_0_0_1_1 )
            // InternalPascal.g:6014:3: rule__Field_list__VariantsAssignment_0_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Field_list__VariantsAssignment_0_0_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getField_listAccess().getVariantsAssignment_0_0_1_1()); 
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
    // $ANTLR end "rule__Field_list__Group_0_0_1__1__Impl"


    // $ANTLR start "rule__Fixed_part__Group__0"
    // InternalPascal.g:6023:1: rule__Fixed_part__Group__0 : rule__Fixed_part__Group__0__Impl rule__Fixed_part__Group__1 ;
    public final void rule__Fixed_part__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6027:1: ( rule__Fixed_part__Group__0__Impl rule__Fixed_part__Group__1 )
            // InternalPascal.g:6028:2: rule__Fixed_part__Group__0__Impl rule__Fixed_part__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Fixed_part__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Fixed_part__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fixed_part__Group__0"


    // $ANTLR start "rule__Fixed_part__Group__0__Impl"
    // InternalPascal.g:6035:1: rule__Fixed_part__Group__0__Impl : ( ( rule__Fixed_part__SectionsAssignment_0 ) ) ;
    public final void rule__Fixed_part__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6039:1: ( ( ( rule__Fixed_part__SectionsAssignment_0 ) ) )
            // InternalPascal.g:6040:1: ( ( rule__Fixed_part__SectionsAssignment_0 ) )
            {
            // InternalPascal.g:6040:1: ( ( rule__Fixed_part__SectionsAssignment_0 ) )
            // InternalPascal.g:6041:2: ( rule__Fixed_part__SectionsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFixed_partAccess().getSectionsAssignment_0()); 
            }
            // InternalPascal.g:6042:2: ( rule__Fixed_part__SectionsAssignment_0 )
            // InternalPascal.g:6042:3: rule__Fixed_part__SectionsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Fixed_part__SectionsAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFixed_partAccess().getSectionsAssignment_0()); 
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
    // $ANTLR end "rule__Fixed_part__Group__0__Impl"


    // $ANTLR start "rule__Fixed_part__Group__1"
    // InternalPascal.g:6050:1: rule__Fixed_part__Group__1 : rule__Fixed_part__Group__1__Impl ;
    public final void rule__Fixed_part__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6054:1: ( rule__Fixed_part__Group__1__Impl )
            // InternalPascal.g:6055:2: rule__Fixed_part__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Fixed_part__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fixed_part__Group__1"


    // $ANTLR start "rule__Fixed_part__Group__1__Impl"
    // InternalPascal.g:6061:1: rule__Fixed_part__Group__1__Impl : ( ( rule__Fixed_part__Group_1__0 )* ) ;
    public final void rule__Fixed_part__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6065:1: ( ( ( rule__Fixed_part__Group_1__0 )* ) )
            // InternalPascal.g:6066:1: ( ( rule__Fixed_part__Group_1__0 )* )
            {
            // InternalPascal.g:6066:1: ( ( rule__Fixed_part__Group_1__0 )* )
            // InternalPascal.g:6067:2: ( rule__Fixed_part__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFixed_partAccess().getGroup_1()); 
            }
            // InternalPascal.g:6068:2: ( rule__Fixed_part__Group_1__0 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==22) ) {
                    int LA51_2 = input.LA(2);

                    if ( (LA51_2==RULE_ID) ) {
                        alt51=1;
                    }


                }


                switch (alt51) {
            	case 1 :
            	    // InternalPascal.g:6068:3: rule__Fixed_part__Group_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Fixed_part__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFixed_partAccess().getGroup_1()); 
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
    // $ANTLR end "rule__Fixed_part__Group__1__Impl"


    // $ANTLR start "rule__Fixed_part__Group_1__0"
    // InternalPascal.g:6077:1: rule__Fixed_part__Group_1__0 : rule__Fixed_part__Group_1__0__Impl rule__Fixed_part__Group_1__1 ;
    public final void rule__Fixed_part__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6081:1: ( rule__Fixed_part__Group_1__0__Impl rule__Fixed_part__Group_1__1 )
            // InternalPascal.g:6082:2: rule__Fixed_part__Group_1__0__Impl rule__Fixed_part__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__Fixed_part__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Fixed_part__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fixed_part__Group_1__0"


    // $ANTLR start "rule__Fixed_part__Group_1__0__Impl"
    // InternalPascal.g:6089:1: rule__Fixed_part__Group_1__0__Impl : ( ';' ) ;
    public final void rule__Fixed_part__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6093:1: ( ( ';' ) )
            // InternalPascal.g:6094:1: ( ';' )
            {
            // InternalPascal.g:6094:1: ( ';' )
            // InternalPascal.g:6095:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFixed_partAccess().getSemicolonKeyword_1_0()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFixed_partAccess().getSemicolonKeyword_1_0()); 
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
    // $ANTLR end "rule__Fixed_part__Group_1__0__Impl"


    // $ANTLR start "rule__Fixed_part__Group_1__1"
    // InternalPascal.g:6104:1: rule__Fixed_part__Group_1__1 : rule__Fixed_part__Group_1__1__Impl ;
    public final void rule__Fixed_part__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6108:1: ( rule__Fixed_part__Group_1__1__Impl )
            // InternalPascal.g:6109:2: rule__Fixed_part__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Fixed_part__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fixed_part__Group_1__1"


    // $ANTLR start "rule__Fixed_part__Group_1__1__Impl"
    // InternalPascal.g:6115:1: rule__Fixed_part__Group_1__1__Impl : ( ( rule__Fixed_part__SectionsAssignment_1_1 ) ) ;
    public final void rule__Fixed_part__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6119:1: ( ( ( rule__Fixed_part__SectionsAssignment_1_1 ) ) )
            // InternalPascal.g:6120:1: ( ( rule__Fixed_part__SectionsAssignment_1_1 ) )
            {
            // InternalPascal.g:6120:1: ( ( rule__Fixed_part__SectionsAssignment_1_1 ) )
            // InternalPascal.g:6121:2: ( rule__Fixed_part__SectionsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFixed_partAccess().getSectionsAssignment_1_1()); 
            }
            // InternalPascal.g:6122:2: ( rule__Fixed_part__SectionsAssignment_1_1 )
            // InternalPascal.g:6122:3: rule__Fixed_part__SectionsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Fixed_part__SectionsAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFixed_partAccess().getSectionsAssignment_1_1()); 
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
    // $ANTLR end "rule__Fixed_part__Group_1__1__Impl"


    // $ANTLR start "rule__Record_section__Group__0"
    // InternalPascal.g:6131:1: rule__Record_section__Group__0 : rule__Record_section__Group__0__Impl rule__Record_section__Group__1 ;
    public final void rule__Record_section__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6135:1: ( rule__Record_section__Group__0__Impl rule__Record_section__Group__1 )
            // InternalPascal.g:6136:2: rule__Record_section__Group__0__Impl rule__Record_section__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Record_section__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Record_section__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record_section__Group__0"


    // $ANTLR start "rule__Record_section__Group__0__Impl"
    // InternalPascal.g:6143:1: rule__Record_section__Group__0__Impl : ( ( rule__Record_section__IdentifiersAssignment_0 ) ) ;
    public final void rule__Record_section__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6147:1: ( ( ( rule__Record_section__IdentifiersAssignment_0 ) ) )
            // InternalPascal.g:6148:1: ( ( rule__Record_section__IdentifiersAssignment_0 ) )
            {
            // InternalPascal.g:6148:1: ( ( rule__Record_section__IdentifiersAssignment_0 ) )
            // InternalPascal.g:6149:2: ( rule__Record_section__IdentifiersAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecord_sectionAccess().getIdentifiersAssignment_0()); 
            }
            // InternalPascal.g:6150:2: ( rule__Record_section__IdentifiersAssignment_0 )
            // InternalPascal.g:6150:3: rule__Record_section__IdentifiersAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Record_section__IdentifiersAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecord_sectionAccess().getIdentifiersAssignment_0()); 
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
    // $ANTLR end "rule__Record_section__Group__0__Impl"


    // $ANTLR start "rule__Record_section__Group__1"
    // InternalPascal.g:6158:1: rule__Record_section__Group__1 : rule__Record_section__Group__1__Impl rule__Record_section__Group__2 ;
    public final void rule__Record_section__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6162:1: ( rule__Record_section__Group__1__Impl rule__Record_section__Group__2 )
            // InternalPascal.g:6163:2: rule__Record_section__Group__1__Impl rule__Record_section__Group__2
            {
            pushFollow(FOLLOW_36);
            rule__Record_section__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Record_section__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record_section__Group__1"


    // $ANTLR start "rule__Record_section__Group__1__Impl"
    // InternalPascal.g:6170:1: rule__Record_section__Group__1__Impl : ( ':' ) ;
    public final void rule__Record_section__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6174:1: ( ( ':' ) )
            // InternalPascal.g:6175:1: ( ':' )
            {
            // InternalPascal.g:6175:1: ( ':' )
            // InternalPascal.g:6176:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecord_sectionAccess().getColonKeyword_1()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecord_sectionAccess().getColonKeyword_1()); 
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
    // $ANTLR end "rule__Record_section__Group__1__Impl"


    // $ANTLR start "rule__Record_section__Group__2"
    // InternalPascal.g:6185:1: rule__Record_section__Group__2 : rule__Record_section__Group__2__Impl ;
    public final void rule__Record_section__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6189:1: ( rule__Record_section__Group__2__Impl )
            // InternalPascal.g:6190:2: rule__Record_section__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Record_section__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record_section__Group__2"


    // $ANTLR start "rule__Record_section__Group__2__Impl"
    // InternalPascal.g:6196:1: rule__Record_section__Group__2__Impl : ( ( rule__Record_section__TypeAssignment_2 ) ) ;
    public final void rule__Record_section__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6200:1: ( ( ( rule__Record_section__TypeAssignment_2 ) ) )
            // InternalPascal.g:6201:1: ( ( rule__Record_section__TypeAssignment_2 ) )
            {
            // InternalPascal.g:6201:1: ( ( rule__Record_section__TypeAssignment_2 ) )
            // InternalPascal.g:6202:2: ( rule__Record_section__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecord_sectionAccess().getTypeAssignment_2()); 
            }
            // InternalPascal.g:6203:2: ( rule__Record_section__TypeAssignment_2 )
            // InternalPascal.g:6203:3: rule__Record_section__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Record_section__TypeAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecord_sectionAccess().getTypeAssignment_2()); 
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
    // $ANTLR end "rule__Record_section__Group__2__Impl"


    // $ANTLR start "rule__Variant_part__Group__0"
    // InternalPascal.g:6212:1: rule__Variant_part__Group__0 : rule__Variant_part__Group__0__Impl rule__Variant_part__Group__1 ;
    public final void rule__Variant_part__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6216:1: ( rule__Variant_part__Group__0__Impl rule__Variant_part__Group__1 )
            // InternalPascal.g:6217:2: rule__Variant_part__Group__0__Impl rule__Variant_part__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Variant_part__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Variant_part__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variant_part__Group__0"


    // $ANTLR start "rule__Variant_part__Group__0__Impl"
    // InternalPascal.g:6224:1: rule__Variant_part__Group__0__Impl : ( 'case' ) ;
    public final void rule__Variant_part__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6228:1: ( ( 'case' ) )
            // InternalPascal.g:6229:1: ( 'case' )
            {
            // InternalPascal.g:6229:1: ( 'case' )
            // InternalPascal.g:6230:2: 'case'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariant_partAccess().getCaseKeyword_0()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariant_partAccess().getCaseKeyword_0()); 
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
    // $ANTLR end "rule__Variant_part__Group__0__Impl"


    // $ANTLR start "rule__Variant_part__Group__1"
    // InternalPascal.g:6239:1: rule__Variant_part__Group__1 : rule__Variant_part__Group__1__Impl rule__Variant_part__Group__2 ;
    public final void rule__Variant_part__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6243:1: ( rule__Variant_part__Group__1__Impl rule__Variant_part__Group__2 )
            // InternalPascal.g:6244:2: rule__Variant_part__Group__1__Impl rule__Variant_part__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Variant_part__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Variant_part__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variant_part__Group__1"


    // $ANTLR start "rule__Variant_part__Group__1__Impl"
    // InternalPascal.g:6251:1: rule__Variant_part__Group__1__Impl : ( ( rule__Variant_part__TagAssignment_1 )? ) ;
    public final void rule__Variant_part__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6255:1: ( ( ( rule__Variant_part__TagAssignment_1 )? ) )
            // InternalPascal.g:6256:1: ( ( rule__Variant_part__TagAssignment_1 )? )
            {
            // InternalPascal.g:6256:1: ( ( rule__Variant_part__TagAssignment_1 )? )
            // InternalPascal.g:6257:2: ( rule__Variant_part__TagAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariant_partAccess().getTagAssignment_1()); 
            }
            // InternalPascal.g:6258:2: ( rule__Variant_part__TagAssignment_1 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_ID) ) {
                int LA52_1 = input.LA(2);

                if ( (LA52_1==25) ) {
                    alt52=1;
                }
            }
            switch (alt52) {
                case 1 :
                    // InternalPascal.g:6258:3: rule__Variant_part__TagAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Variant_part__TagAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariant_partAccess().getTagAssignment_1()); 
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
    // $ANTLR end "rule__Variant_part__Group__1__Impl"


    // $ANTLR start "rule__Variant_part__Group__2"
    // InternalPascal.g:6266:1: rule__Variant_part__Group__2 : rule__Variant_part__Group__2__Impl rule__Variant_part__Group__3 ;
    public final void rule__Variant_part__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6270:1: ( rule__Variant_part__Group__2__Impl rule__Variant_part__Group__3 )
            // InternalPascal.g:6271:2: rule__Variant_part__Group__2__Impl rule__Variant_part__Group__3
            {
            pushFollow(FOLLOW_41);
            rule__Variant_part__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Variant_part__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variant_part__Group__2"


    // $ANTLR start "rule__Variant_part__Group__2__Impl"
    // InternalPascal.g:6278:1: rule__Variant_part__Group__2__Impl : ( ( rule__Variant_part__NameAssignment_2 ) ) ;
    public final void rule__Variant_part__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6282:1: ( ( ( rule__Variant_part__NameAssignment_2 ) ) )
            // InternalPascal.g:6283:1: ( ( rule__Variant_part__NameAssignment_2 ) )
            {
            // InternalPascal.g:6283:1: ( ( rule__Variant_part__NameAssignment_2 ) )
            // InternalPascal.g:6284:2: ( rule__Variant_part__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariant_partAccess().getNameAssignment_2()); 
            }
            // InternalPascal.g:6285:2: ( rule__Variant_part__NameAssignment_2 )
            // InternalPascal.g:6285:3: rule__Variant_part__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Variant_part__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariant_partAccess().getNameAssignment_2()); 
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
    // $ANTLR end "rule__Variant_part__Group__2__Impl"


    // $ANTLR start "rule__Variant_part__Group__3"
    // InternalPascal.g:6293:1: rule__Variant_part__Group__3 : rule__Variant_part__Group__3__Impl rule__Variant_part__Group__4 ;
    public final void rule__Variant_part__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6297:1: ( rule__Variant_part__Group__3__Impl rule__Variant_part__Group__4 )
            // InternalPascal.g:6298:2: rule__Variant_part__Group__3__Impl rule__Variant_part__Group__4
            {
            pushFollow(FOLLOW_35);
            rule__Variant_part__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Variant_part__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variant_part__Group__3"


    // $ANTLR start "rule__Variant_part__Group__3__Impl"
    // InternalPascal.g:6305:1: rule__Variant_part__Group__3__Impl : ( 'of' ) ;
    public final void rule__Variant_part__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6309:1: ( ( 'of' ) )
            // InternalPascal.g:6310:1: ( 'of' )
            {
            // InternalPascal.g:6310:1: ( 'of' )
            // InternalPascal.g:6311:2: 'of'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariant_partAccess().getOfKeyword_3()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariant_partAccess().getOfKeyword_3()); 
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
    // $ANTLR end "rule__Variant_part__Group__3__Impl"


    // $ANTLR start "rule__Variant_part__Group__4"
    // InternalPascal.g:6320:1: rule__Variant_part__Group__4 : rule__Variant_part__Group__4__Impl rule__Variant_part__Group__5 ;
    public final void rule__Variant_part__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6324:1: ( rule__Variant_part__Group__4__Impl rule__Variant_part__Group__5 )
            // InternalPascal.g:6325:2: rule__Variant_part__Group__4__Impl rule__Variant_part__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Variant_part__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Variant_part__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variant_part__Group__4"


    // $ANTLR start "rule__Variant_part__Group__4__Impl"
    // InternalPascal.g:6332:1: rule__Variant_part__Group__4__Impl : ( ( rule__Variant_part__VariantsAssignment_4 ) ) ;
    public final void rule__Variant_part__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6336:1: ( ( ( rule__Variant_part__VariantsAssignment_4 ) ) )
            // InternalPascal.g:6337:1: ( ( rule__Variant_part__VariantsAssignment_4 ) )
            {
            // InternalPascal.g:6337:1: ( ( rule__Variant_part__VariantsAssignment_4 ) )
            // InternalPascal.g:6338:2: ( rule__Variant_part__VariantsAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariant_partAccess().getVariantsAssignment_4()); 
            }
            // InternalPascal.g:6339:2: ( rule__Variant_part__VariantsAssignment_4 )
            // InternalPascal.g:6339:3: rule__Variant_part__VariantsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Variant_part__VariantsAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariant_partAccess().getVariantsAssignment_4()); 
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
    // $ANTLR end "rule__Variant_part__Group__4__Impl"


    // $ANTLR start "rule__Variant_part__Group__5"
    // InternalPascal.g:6347:1: rule__Variant_part__Group__5 : rule__Variant_part__Group__5__Impl ;
    public final void rule__Variant_part__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6351:1: ( rule__Variant_part__Group__5__Impl )
            // InternalPascal.g:6352:2: rule__Variant_part__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variant_part__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variant_part__Group__5"


    // $ANTLR start "rule__Variant_part__Group__5__Impl"
    // InternalPascal.g:6358:1: rule__Variant_part__Group__5__Impl : ( ( rule__Variant_part__Group_5__0 )* ) ;
    public final void rule__Variant_part__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6362:1: ( ( ( rule__Variant_part__Group_5__0 )* ) )
            // InternalPascal.g:6363:1: ( ( rule__Variant_part__Group_5__0 )* )
            {
            // InternalPascal.g:6363:1: ( ( rule__Variant_part__Group_5__0 )* )
            // InternalPascal.g:6364:2: ( rule__Variant_part__Group_5__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariant_partAccess().getGroup_5()); 
            }
            // InternalPascal.g:6365:2: ( rule__Variant_part__Group_5__0 )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==22) ) {
                    int LA53_2 = input.LA(2);

                    if ( ((LA53_2>=RULE_ID && LA53_2<=RULE_INTEGER_NUMBER)||LA53_2==RULE_ADDITION_OP||LA53_2==RULE_STRING||(LA53_2>=RULE_SIGNED_REAL_NUMBER && LA53_2<=RULE_REAL_NUMBER)||(LA53_2>=52 && LA53_2<=53)) ) {
                        alt53=1;
                    }


                }


                switch (alt53) {
            	case 1 :
            	    // InternalPascal.g:6365:3: rule__Variant_part__Group_5__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Variant_part__Group_5__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariant_partAccess().getGroup_5()); 
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
    // $ANTLR end "rule__Variant_part__Group__5__Impl"


    // $ANTLR start "rule__Variant_part__Group_5__0"
    // InternalPascal.g:6374:1: rule__Variant_part__Group_5__0 : rule__Variant_part__Group_5__0__Impl rule__Variant_part__Group_5__1 ;
    public final void rule__Variant_part__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6378:1: ( rule__Variant_part__Group_5__0__Impl rule__Variant_part__Group_5__1 )
            // InternalPascal.g:6379:2: rule__Variant_part__Group_5__0__Impl rule__Variant_part__Group_5__1
            {
            pushFollow(FOLLOW_35);
            rule__Variant_part__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Variant_part__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variant_part__Group_5__0"


    // $ANTLR start "rule__Variant_part__Group_5__0__Impl"
    // InternalPascal.g:6386:1: rule__Variant_part__Group_5__0__Impl : ( ';' ) ;
    public final void rule__Variant_part__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6390:1: ( ( ';' ) )
            // InternalPascal.g:6391:1: ( ';' )
            {
            // InternalPascal.g:6391:1: ( ';' )
            // InternalPascal.g:6392:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariant_partAccess().getSemicolonKeyword_5_0()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariant_partAccess().getSemicolonKeyword_5_0()); 
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
    // $ANTLR end "rule__Variant_part__Group_5__0__Impl"


    // $ANTLR start "rule__Variant_part__Group_5__1"
    // InternalPascal.g:6401:1: rule__Variant_part__Group_5__1 : rule__Variant_part__Group_5__1__Impl ;
    public final void rule__Variant_part__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6405:1: ( rule__Variant_part__Group_5__1__Impl )
            // InternalPascal.g:6406:2: rule__Variant_part__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variant_part__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variant_part__Group_5__1"


    // $ANTLR start "rule__Variant_part__Group_5__1__Impl"
    // InternalPascal.g:6412:1: rule__Variant_part__Group_5__1__Impl : ( ( rule__Variant_part__VariantsAssignment_5_1 ) ) ;
    public final void rule__Variant_part__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6416:1: ( ( ( rule__Variant_part__VariantsAssignment_5_1 ) ) )
            // InternalPascal.g:6417:1: ( ( rule__Variant_part__VariantsAssignment_5_1 ) )
            {
            // InternalPascal.g:6417:1: ( ( rule__Variant_part__VariantsAssignment_5_1 ) )
            // InternalPascal.g:6418:2: ( rule__Variant_part__VariantsAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariant_partAccess().getVariantsAssignment_5_1()); 
            }
            // InternalPascal.g:6419:2: ( rule__Variant_part__VariantsAssignment_5_1 )
            // InternalPascal.g:6419:3: rule__Variant_part__VariantsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Variant_part__VariantsAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariant_partAccess().getVariantsAssignment_5_1()); 
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
    // $ANTLR end "rule__Variant_part__Group_5__1__Impl"


    // $ANTLR start "rule__Tag_field__Group__0"
    // InternalPascal.g:6428:1: rule__Tag_field__Group__0 : rule__Tag_field__Group__0__Impl rule__Tag_field__Group__1 ;
    public final void rule__Tag_field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6432:1: ( rule__Tag_field__Group__0__Impl rule__Tag_field__Group__1 )
            // InternalPascal.g:6433:2: rule__Tag_field__Group__0__Impl rule__Tag_field__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Tag_field__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Tag_field__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag_field__Group__0"


    // $ANTLR start "rule__Tag_field__Group__0__Impl"
    // InternalPascal.g:6440:1: rule__Tag_field__Group__0__Impl : ( ( rule__Tag_field__NameAssignment_0 ) ) ;
    public final void rule__Tag_field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6444:1: ( ( ( rule__Tag_field__NameAssignment_0 ) ) )
            // InternalPascal.g:6445:1: ( ( rule__Tag_field__NameAssignment_0 ) )
            {
            // InternalPascal.g:6445:1: ( ( rule__Tag_field__NameAssignment_0 ) )
            // InternalPascal.g:6446:2: ( rule__Tag_field__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTag_fieldAccess().getNameAssignment_0()); 
            }
            // InternalPascal.g:6447:2: ( rule__Tag_field__NameAssignment_0 )
            // InternalPascal.g:6447:3: rule__Tag_field__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Tag_field__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTag_fieldAccess().getNameAssignment_0()); 
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
    // $ANTLR end "rule__Tag_field__Group__0__Impl"


    // $ANTLR start "rule__Tag_field__Group__1"
    // InternalPascal.g:6455:1: rule__Tag_field__Group__1 : rule__Tag_field__Group__1__Impl ;
    public final void rule__Tag_field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6459:1: ( rule__Tag_field__Group__1__Impl )
            // InternalPascal.g:6460:2: rule__Tag_field__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tag_field__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag_field__Group__1"


    // $ANTLR start "rule__Tag_field__Group__1__Impl"
    // InternalPascal.g:6466:1: rule__Tag_field__Group__1__Impl : ( ':' ) ;
    public final void rule__Tag_field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6470:1: ( ( ':' ) )
            // InternalPascal.g:6471:1: ( ':' )
            {
            // InternalPascal.g:6471:1: ( ':' )
            // InternalPascal.g:6472:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTag_fieldAccess().getColonKeyword_1()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTag_fieldAccess().getColonKeyword_1()); 
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
    // $ANTLR end "rule__Tag_field__Group__1__Impl"


    // $ANTLR start "rule__Variant__Group__0"
    // InternalPascal.g:6482:1: rule__Variant__Group__0 : rule__Variant__Group__0__Impl rule__Variant__Group__1 ;
    public final void rule__Variant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6486:1: ( rule__Variant__Group__0__Impl rule__Variant__Group__1 )
            // InternalPascal.g:6487:2: rule__Variant__Group__0__Impl rule__Variant__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Variant__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Variant__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variant__Group__0"


    // $ANTLR start "rule__Variant__Group__0__Impl"
    // InternalPascal.g:6494:1: rule__Variant__Group__0__Impl : ( ( rule__Variant__LabelsAssignment_0 ) ) ;
    public final void rule__Variant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6498:1: ( ( ( rule__Variant__LabelsAssignment_0 ) ) )
            // InternalPascal.g:6499:1: ( ( rule__Variant__LabelsAssignment_0 ) )
            {
            // InternalPascal.g:6499:1: ( ( rule__Variant__LabelsAssignment_0 ) )
            // InternalPascal.g:6500:2: ( rule__Variant__LabelsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariantAccess().getLabelsAssignment_0()); 
            }
            // InternalPascal.g:6501:2: ( rule__Variant__LabelsAssignment_0 )
            // InternalPascal.g:6501:3: rule__Variant__LabelsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Variant__LabelsAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariantAccess().getLabelsAssignment_0()); 
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
    // $ANTLR end "rule__Variant__Group__0__Impl"


    // $ANTLR start "rule__Variant__Group__1"
    // InternalPascal.g:6509:1: rule__Variant__Group__1 : rule__Variant__Group__1__Impl rule__Variant__Group__2 ;
    public final void rule__Variant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6513:1: ( rule__Variant__Group__1__Impl rule__Variant__Group__2 )
            // InternalPascal.g:6514:2: rule__Variant__Group__1__Impl rule__Variant__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__Variant__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Variant__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variant__Group__1"


    // $ANTLR start "rule__Variant__Group__1__Impl"
    // InternalPascal.g:6521:1: rule__Variant__Group__1__Impl : ( ':' ) ;
    public final void rule__Variant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6525:1: ( ( ':' ) )
            // InternalPascal.g:6526:1: ( ':' )
            {
            // InternalPascal.g:6526:1: ( ':' )
            // InternalPascal.g:6527:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariantAccess().getColonKeyword_1()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariantAccess().getColonKeyword_1()); 
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
    // $ANTLR end "rule__Variant__Group__1__Impl"


    // $ANTLR start "rule__Variant__Group__2"
    // InternalPascal.g:6536:1: rule__Variant__Group__2 : rule__Variant__Group__2__Impl rule__Variant__Group__3 ;
    public final void rule__Variant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6540:1: ( rule__Variant__Group__2__Impl rule__Variant__Group__3 )
            // InternalPascal.g:6541:2: rule__Variant__Group__2__Impl rule__Variant__Group__3
            {
            pushFollow(FOLLOW_42);
            rule__Variant__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Variant__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variant__Group__2"


    // $ANTLR start "rule__Variant__Group__2__Impl"
    // InternalPascal.g:6548:1: rule__Variant__Group__2__Impl : ( '(' ) ;
    public final void rule__Variant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6552:1: ( ( '(' ) )
            // InternalPascal.g:6553:1: ( '(' )
            {
            // InternalPascal.g:6553:1: ( '(' )
            // InternalPascal.g:6554:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariantAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariantAccess().getLeftParenthesisKeyword_2()); 
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
    // $ANTLR end "rule__Variant__Group__2__Impl"


    // $ANTLR start "rule__Variant__Group__3"
    // InternalPascal.g:6563:1: rule__Variant__Group__3 : rule__Variant__Group__3__Impl rule__Variant__Group__4 ;
    public final void rule__Variant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6567:1: ( rule__Variant__Group__3__Impl rule__Variant__Group__4 )
            // InternalPascal.g:6568:2: rule__Variant__Group__3__Impl rule__Variant__Group__4
            {
            pushFollow(FOLLOW_42);
            rule__Variant__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Variant__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variant__Group__3"


    // $ANTLR start "rule__Variant__Group__3__Impl"
    // InternalPascal.g:6575:1: rule__Variant__Group__3__Impl : ( ( rule__Variant__FieldsAssignment_3 )? ) ;
    public final void rule__Variant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6579:1: ( ( ( rule__Variant__FieldsAssignment_3 )? ) )
            // InternalPascal.g:6580:1: ( ( rule__Variant__FieldsAssignment_3 )? )
            {
            // InternalPascal.g:6580:1: ( ( rule__Variant__FieldsAssignment_3 )? )
            // InternalPascal.g:6581:2: ( rule__Variant__FieldsAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariantAccess().getFieldsAssignment_3()); 
            }
            // InternalPascal.g:6582:2: ( rule__Variant__FieldsAssignment_3 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ID||LA54_0==42) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalPascal.g:6582:3: rule__Variant__FieldsAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Variant__FieldsAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariantAccess().getFieldsAssignment_3()); 
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
    // $ANTLR end "rule__Variant__Group__3__Impl"


    // $ANTLR start "rule__Variant__Group__4"
    // InternalPascal.g:6590:1: rule__Variant__Group__4 : rule__Variant__Group__4__Impl ;
    public final void rule__Variant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6594:1: ( rule__Variant__Group__4__Impl )
            // InternalPascal.g:6595:2: rule__Variant__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variant__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variant__Group__4"


    // $ANTLR start "rule__Variant__Group__4__Impl"
    // InternalPascal.g:6601:1: rule__Variant__Group__4__Impl : ( ')' ) ;
    public final void rule__Variant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6605:1: ( ( ')' ) )
            // InternalPascal.g:6606:1: ( ')' )
            {
            // InternalPascal.g:6606:1: ( ')' )
            // InternalPascal.g:6607:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariantAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariantAccess().getRightParenthesisKeyword_4()); 
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
    // $ANTLR end "rule__Variant__Group__4__Impl"


    // $ANTLR start "rule__Case_label_list__Group__0"
    // InternalPascal.g:6617:1: rule__Case_label_list__Group__0 : rule__Case_label_list__Group__0__Impl rule__Case_label_list__Group__1 ;
    public final void rule__Case_label_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6621:1: ( rule__Case_label_list__Group__0__Impl rule__Case_label_list__Group__1 )
            // InternalPascal.g:6622:2: rule__Case_label_list__Group__0__Impl rule__Case_label_list__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Case_label_list__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Case_label_list__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case_label_list__Group__0"


    // $ANTLR start "rule__Case_label_list__Group__0__Impl"
    // InternalPascal.g:6629:1: rule__Case_label_list__Group__0__Impl : ( ( rule__Case_label_list__ConstantsAssignment_0 ) ) ;
    public final void rule__Case_label_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6633:1: ( ( ( rule__Case_label_list__ConstantsAssignment_0 ) ) )
            // InternalPascal.g:6634:1: ( ( rule__Case_label_list__ConstantsAssignment_0 ) )
            {
            // InternalPascal.g:6634:1: ( ( rule__Case_label_list__ConstantsAssignment_0 ) )
            // InternalPascal.g:6635:2: ( rule__Case_label_list__ConstantsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCase_label_listAccess().getConstantsAssignment_0()); 
            }
            // InternalPascal.g:6636:2: ( rule__Case_label_list__ConstantsAssignment_0 )
            // InternalPascal.g:6636:3: rule__Case_label_list__ConstantsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Case_label_list__ConstantsAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCase_label_listAccess().getConstantsAssignment_0()); 
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
    // $ANTLR end "rule__Case_label_list__Group__0__Impl"


    // $ANTLR start "rule__Case_label_list__Group__1"
    // InternalPascal.g:6644:1: rule__Case_label_list__Group__1 : rule__Case_label_list__Group__1__Impl ;
    public final void rule__Case_label_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6648:1: ( rule__Case_label_list__Group__1__Impl )
            // InternalPascal.g:6649:2: rule__Case_label_list__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Case_label_list__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case_label_list__Group__1"


    // $ANTLR start "rule__Case_label_list__Group__1__Impl"
    // InternalPascal.g:6655:1: rule__Case_label_list__Group__1__Impl : ( ( rule__Case_label_list__Group_1__0 )* ) ;
    public final void rule__Case_label_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6659:1: ( ( ( rule__Case_label_list__Group_1__0 )* ) )
            // InternalPascal.g:6660:1: ( ( rule__Case_label_list__Group_1__0 )* )
            {
            // InternalPascal.g:6660:1: ( ( rule__Case_label_list__Group_1__0 )* )
            // InternalPascal.g:6661:2: ( rule__Case_label_list__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCase_label_listAccess().getGroup_1()); 
            }
            // InternalPascal.g:6662:2: ( rule__Case_label_list__Group_1__0 )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==30) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalPascal.g:6662:3: rule__Case_label_list__Group_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Case_label_list__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCase_label_listAccess().getGroup_1()); 
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
    // $ANTLR end "rule__Case_label_list__Group__1__Impl"


    // $ANTLR start "rule__Case_label_list__Group_1__0"
    // InternalPascal.g:6671:1: rule__Case_label_list__Group_1__0 : rule__Case_label_list__Group_1__0__Impl rule__Case_label_list__Group_1__1 ;
    public final void rule__Case_label_list__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6675:1: ( rule__Case_label_list__Group_1__0__Impl rule__Case_label_list__Group_1__1 )
            // InternalPascal.g:6676:2: rule__Case_label_list__Group_1__0__Impl rule__Case_label_list__Group_1__1
            {
            pushFollow(FOLLOW_35);
            rule__Case_label_list__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Case_label_list__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case_label_list__Group_1__0"


    // $ANTLR start "rule__Case_label_list__Group_1__0__Impl"
    // InternalPascal.g:6683:1: rule__Case_label_list__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Case_label_list__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6687:1: ( ( ',' ) )
            // InternalPascal.g:6688:1: ( ',' )
            {
            // InternalPascal.g:6688:1: ( ',' )
            // InternalPascal.g:6689:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCase_label_listAccess().getCommaKeyword_1_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCase_label_listAccess().getCommaKeyword_1_0()); 
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
    // $ANTLR end "rule__Case_label_list__Group_1__0__Impl"


    // $ANTLR start "rule__Case_label_list__Group_1__1"
    // InternalPascal.g:6698:1: rule__Case_label_list__Group_1__1 : rule__Case_label_list__Group_1__1__Impl ;
    public final void rule__Case_label_list__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6702:1: ( rule__Case_label_list__Group_1__1__Impl )
            // InternalPascal.g:6703:2: rule__Case_label_list__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Case_label_list__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case_label_list__Group_1__1"


    // $ANTLR start "rule__Case_label_list__Group_1__1__Impl"
    // InternalPascal.g:6709:1: rule__Case_label_list__Group_1__1__Impl : ( ( rule__Case_label_list__ConstantsAssignment_1_1 ) ) ;
    public final void rule__Case_label_list__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6713:1: ( ( ( rule__Case_label_list__ConstantsAssignment_1_1 ) ) )
            // InternalPascal.g:6714:1: ( ( rule__Case_label_list__ConstantsAssignment_1_1 ) )
            {
            // InternalPascal.g:6714:1: ( ( rule__Case_label_list__ConstantsAssignment_1_1 ) )
            // InternalPascal.g:6715:2: ( rule__Case_label_list__ConstantsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCase_label_listAccess().getConstantsAssignment_1_1()); 
            }
            // InternalPascal.g:6716:2: ( rule__Case_label_list__ConstantsAssignment_1_1 )
            // InternalPascal.g:6716:3: rule__Case_label_list__ConstantsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Case_label_list__ConstantsAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCase_label_listAccess().getConstantsAssignment_1_1()); 
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
    // $ANTLR end "rule__Case_label_list__Group_1__1__Impl"


    // $ANTLR start "rule__Pointer_type__Group__0"
    // InternalPascal.g:6725:1: rule__Pointer_type__Group__0 : rule__Pointer_type__Group__0__Impl rule__Pointer_type__Group__1 ;
    public final void rule__Pointer_type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6729:1: ( rule__Pointer_type__Group__0__Impl rule__Pointer_type__Group__1 )
            // InternalPascal.g:6730:2: rule__Pointer_type__Group__0__Impl rule__Pointer_type__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__Pointer_type__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Pointer_type__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:6737:1: rule__Pointer_type__Group__0__Impl : ( '^' ) ;
    public final void rule__Pointer_type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6741:1: ( ( '^' ) )
            // InternalPascal.g:6742:1: ( '^' )
            {
            // InternalPascal.g:6742:1: ( '^' )
            // InternalPascal.g:6743:2: '^'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointer_typeAccess().getCircumflexAccentKeyword_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPointer_typeAccess().getCircumflexAccentKeyword_0()); 
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
    // $ANTLR end "rule__Pointer_type__Group__0__Impl"


    // $ANTLR start "rule__Pointer_type__Group__1"
    // InternalPascal.g:6752:1: rule__Pointer_type__Group__1 : rule__Pointer_type__Group__1__Impl ;
    public final void rule__Pointer_type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6756:1: ( rule__Pointer_type__Group__1__Impl )
            // InternalPascal.g:6757:2: rule__Pointer_type__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pointer_type__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:6763:1: rule__Pointer_type__Group__1__Impl : ( ( rule__Pointer_type__TypeAssignment_1 ) ) ;
    public final void rule__Pointer_type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6767:1: ( ( ( rule__Pointer_type__TypeAssignment_1 ) ) )
            // InternalPascal.g:6768:1: ( ( rule__Pointer_type__TypeAssignment_1 ) )
            {
            // InternalPascal.g:6768:1: ( ( rule__Pointer_type__TypeAssignment_1 ) )
            // InternalPascal.g:6769:2: ( rule__Pointer_type__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointer_typeAccess().getTypeAssignment_1()); 
            }
            // InternalPascal.g:6770:2: ( rule__Pointer_type__TypeAssignment_1 )
            // InternalPascal.g:6770:3: rule__Pointer_type__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Pointer_type__TypeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPointer_typeAccess().getTypeAssignment_1()); 
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
    // $ANTLR end "rule__Pointer_type__Group__1__Impl"


    // $ANTLR start "rule__Variable_declaration_part__Group__0"
    // InternalPascal.g:6779:1: rule__Variable_declaration_part__Group__0 : rule__Variable_declaration_part__Group__0__Impl rule__Variable_declaration_part__Group__1 ;
    public final void rule__Variable_declaration_part__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6783:1: ( rule__Variable_declaration_part__Group__0__Impl rule__Variable_declaration_part__Group__1 )
            // InternalPascal.g:6784:2: rule__Variable_declaration_part__Group__0__Impl rule__Variable_declaration_part__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Variable_declaration_part__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Variable_declaration_part__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:6791:1: rule__Variable_declaration_part__Group__0__Impl : ( 'var' ) ;
    public final void rule__Variable_declaration_part__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6795:1: ( ( 'var' ) )
            // InternalPascal.g:6796:1: ( 'var' )
            {
            // InternalPascal.g:6796:1: ( 'var' )
            // InternalPascal.g:6797:2: 'var'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declaration_partAccess().getVarKeyword_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_declaration_partAccess().getVarKeyword_0()); 
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
    // $ANTLR end "rule__Variable_declaration_part__Group__0__Impl"


    // $ANTLR start "rule__Variable_declaration_part__Group__1"
    // InternalPascal.g:6806:1: rule__Variable_declaration_part__Group__1 : rule__Variable_declaration_part__Group__1__Impl rule__Variable_declaration_part__Group__2 ;
    public final void rule__Variable_declaration_part__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6810:1: ( rule__Variable_declaration_part__Group__1__Impl rule__Variable_declaration_part__Group__2 )
            // InternalPascal.g:6811:2: rule__Variable_declaration_part__Group__1__Impl rule__Variable_declaration_part__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Variable_declaration_part__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Variable_declaration_part__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:6818:1: rule__Variable_declaration_part__Group__1__Impl : ( ( rule__Variable_declaration_part__SectionsAssignment_1 ) ) ;
    public final void rule__Variable_declaration_part__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6822:1: ( ( ( rule__Variable_declaration_part__SectionsAssignment_1 ) ) )
            // InternalPascal.g:6823:1: ( ( rule__Variable_declaration_part__SectionsAssignment_1 ) )
            {
            // InternalPascal.g:6823:1: ( ( rule__Variable_declaration_part__SectionsAssignment_1 ) )
            // InternalPascal.g:6824:2: ( rule__Variable_declaration_part__SectionsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declaration_partAccess().getSectionsAssignment_1()); 
            }
            // InternalPascal.g:6825:2: ( rule__Variable_declaration_part__SectionsAssignment_1 )
            // InternalPascal.g:6825:3: rule__Variable_declaration_part__SectionsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Variable_declaration_part__SectionsAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_declaration_partAccess().getSectionsAssignment_1()); 
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
    // $ANTLR end "rule__Variable_declaration_part__Group__1__Impl"


    // $ANTLR start "rule__Variable_declaration_part__Group__2"
    // InternalPascal.g:6833:1: rule__Variable_declaration_part__Group__2 : rule__Variable_declaration_part__Group__2__Impl rule__Variable_declaration_part__Group__3 ;
    public final void rule__Variable_declaration_part__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6837:1: ( rule__Variable_declaration_part__Group__2__Impl rule__Variable_declaration_part__Group__3 )
            // InternalPascal.g:6838:2: rule__Variable_declaration_part__Group__2__Impl rule__Variable_declaration_part__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Variable_declaration_part__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Variable_declaration_part__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:6845:1: rule__Variable_declaration_part__Group__2__Impl : ( ';' ) ;
    public final void rule__Variable_declaration_part__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6849:1: ( ( ';' ) )
            // InternalPascal.g:6850:1: ( ';' )
            {
            // InternalPascal.g:6850:1: ( ';' )
            // InternalPascal.g:6851:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declaration_partAccess().getSemicolonKeyword_2()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_declaration_partAccess().getSemicolonKeyword_2()); 
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
    // $ANTLR end "rule__Variable_declaration_part__Group__2__Impl"


    // $ANTLR start "rule__Variable_declaration_part__Group__3"
    // InternalPascal.g:6860:1: rule__Variable_declaration_part__Group__3 : rule__Variable_declaration_part__Group__3__Impl ;
    public final void rule__Variable_declaration_part__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6864:1: ( rule__Variable_declaration_part__Group__3__Impl )
            // InternalPascal.g:6865:2: rule__Variable_declaration_part__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable_declaration_part__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:6871:1: rule__Variable_declaration_part__Group__3__Impl : ( ( rule__Variable_declaration_part__Group_3__0 )* ) ;
    public final void rule__Variable_declaration_part__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6875:1: ( ( ( rule__Variable_declaration_part__Group_3__0 )* ) )
            // InternalPascal.g:6876:1: ( ( rule__Variable_declaration_part__Group_3__0 )* )
            {
            // InternalPascal.g:6876:1: ( ( rule__Variable_declaration_part__Group_3__0 )* )
            // InternalPascal.g:6877:2: ( rule__Variable_declaration_part__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declaration_partAccess().getGroup_3()); 
            }
            // InternalPascal.g:6878:2: ( rule__Variable_declaration_part__Group_3__0 )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==RULE_ID) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalPascal.g:6878:3: rule__Variable_declaration_part__Group_3__0
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__Variable_declaration_part__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_declaration_partAccess().getGroup_3()); 
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
    // $ANTLR end "rule__Variable_declaration_part__Group__3__Impl"


    // $ANTLR start "rule__Variable_declaration_part__Group_3__0"
    // InternalPascal.g:6887:1: rule__Variable_declaration_part__Group_3__0 : rule__Variable_declaration_part__Group_3__0__Impl rule__Variable_declaration_part__Group_3__1 ;
    public final void rule__Variable_declaration_part__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6891:1: ( rule__Variable_declaration_part__Group_3__0__Impl rule__Variable_declaration_part__Group_3__1 )
            // InternalPascal.g:6892:2: rule__Variable_declaration_part__Group_3__0__Impl rule__Variable_declaration_part__Group_3__1
            {
            pushFollow(FOLLOW_7);
            rule__Variable_declaration_part__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Variable_declaration_part__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:6899:1: rule__Variable_declaration_part__Group_3__0__Impl : ( ( rule__Variable_declaration_part__SectionsAssignment_3_0 ) ) ;
    public final void rule__Variable_declaration_part__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6903:1: ( ( ( rule__Variable_declaration_part__SectionsAssignment_3_0 ) ) )
            // InternalPascal.g:6904:1: ( ( rule__Variable_declaration_part__SectionsAssignment_3_0 ) )
            {
            // InternalPascal.g:6904:1: ( ( rule__Variable_declaration_part__SectionsAssignment_3_0 ) )
            // InternalPascal.g:6905:2: ( rule__Variable_declaration_part__SectionsAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declaration_partAccess().getSectionsAssignment_3_0()); 
            }
            // InternalPascal.g:6906:2: ( rule__Variable_declaration_part__SectionsAssignment_3_0 )
            // InternalPascal.g:6906:3: rule__Variable_declaration_part__SectionsAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Variable_declaration_part__SectionsAssignment_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_declaration_partAccess().getSectionsAssignment_3_0()); 
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
    // $ANTLR end "rule__Variable_declaration_part__Group_3__0__Impl"


    // $ANTLR start "rule__Variable_declaration_part__Group_3__1"
    // InternalPascal.g:6914:1: rule__Variable_declaration_part__Group_3__1 : rule__Variable_declaration_part__Group_3__1__Impl ;
    public final void rule__Variable_declaration_part__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6918:1: ( rule__Variable_declaration_part__Group_3__1__Impl )
            // InternalPascal.g:6919:2: rule__Variable_declaration_part__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable_declaration_part__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:6925:1: rule__Variable_declaration_part__Group_3__1__Impl : ( ';' ) ;
    public final void rule__Variable_declaration_part__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6929:1: ( ( ';' ) )
            // InternalPascal.g:6930:1: ( ';' )
            {
            // InternalPascal.g:6930:1: ( ';' )
            // InternalPascal.g:6931:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declaration_partAccess().getSemicolonKeyword_3_1()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_declaration_partAccess().getSemicolonKeyword_3_1()); 
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
    // $ANTLR end "rule__Variable_declaration_part__Group_3__1__Impl"


    // $ANTLR start "rule__Variable_section__Group__0"
    // InternalPascal.g:6941:1: rule__Variable_section__Group__0 : rule__Variable_section__Group__0__Impl rule__Variable_section__Group__1 ;
    public final void rule__Variable_section__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6945:1: ( rule__Variable_section__Group__0__Impl rule__Variable_section__Group__1 )
            // InternalPascal.g:6946:2: rule__Variable_section__Group__0__Impl rule__Variable_section__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Variable_section__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Variable_section__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:6953:1: rule__Variable_section__Group__0__Impl : ( ( rule__Variable_section__IdentifiersAssignment_0 ) ) ;
    public final void rule__Variable_section__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6957:1: ( ( ( rule__Variable_section__IdentifiersAssignment_0 ) ) )
            // InternalPascal.g:6958:1: ( ( rule__Variable_section__IdentifiersAssignment_0 ) )
            {
            // InternalPascal.g:6958:1: ( ( rule__Variable_section__IdentifiersAssignment_0 ) )
            // InternalPascal.g:6959:2: ( rule__Variable_section__IdentifiersAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_sectionAccess().getIdentifiersAssignment_0()); 
            }
            // InternalPascal.g:6960:2: ( rule__Variable_section__IdentifiersAssignment_0 )
            // InternalPascal.g:6960:3: rule__Variable_section__IdentifiersAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Variable_section__IdentifiersAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_sectionAccess().getIdentifiersAssignment_0()); 
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
    // $ANTLR end "rule__Variable_section__Group__0__Impl"


    // $ANTLR start "rule__Variable_section__Group__1"
    // InternalPascal.g:6968:1: rule__Variable_section__Group__1 : rule__Variable_section__Group__1__Impl rule__Variable_section__Group__2 ;
    public final void rule__Variable_section__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6972:1: ( rule__Variable_section__Group__1__Impl rule__Variable_section__Group__2 )
            // InternalPascal.g:6973:2: rule__Variable_section__Group__1__Impl rule__Variable_section__Group__2
            {
            pushFollow(FOLLOW_36);
            rule__Variable_section__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Variable_section__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:6980:1: rule__Variable_section__Group__1__Impl : ( ':' ) ;
    public final void rule__Variable_section__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6984:1: ( ( ':' ) )
            // InternalPascal.g:6985:1: ( ':' )
            {
            // InternalPascal.g:6985:1: ( ':' )
            // InternalPascal.g:6986:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_sectionAccess().getColonKeyword_1()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_sectionAccess().getColonKeyword_1()); 
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
    // $ANTLR end "rule__Variable_section__Group__1__Impl"


    // $ANTLR start "rule__Variable_section__Group__2"
    // InternalPascal.g:6995:1: rule__Variable_section__Group__2 : rule__Variable_section__Group__2__Impl ;
    public final void rule__Variable_section__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6999:1: ( rule__Variable_section__Group__2__Impl )
            // InternalPascal.g:7000:2: rule__Variable_section__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable_section__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:7006:1: rule__Variable_section__Group__2__Impl : ( ( rule__Variable_section__TypeAssignment_2 ) ) ;
    public final void rule__Variable_section__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7010:1: ( ( ( rule__Variable_section__TypeAssignment_2 ) ) )
            // InternalPascal.g:7011:1: ( ( rule__Variable_section__TypeAssignment_2 ) )
            {
            // InternalPascal.g:7011:1: ( ( rule__Variable_section__TypeAssignment_2 ) )
            // InternalPascal.g:7012:2: ( rule__Variable_section__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_sectionAccess().getTypeAssignment_2()); 
            }
            // InternalPascal.g:7013:2: ( rule__Variable_section__TypeAssignment_2 )
            // InternalPascal.g:7013:3: rule__Variable_section__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Variable_section__TypeAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_sectionAccess().getTypeAssignment_2()); 
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
    // $ANTLR end "rule__Variable_section__Group__2__Impl"


    // $ANTLR start "rule__Variable_identifier_list__Group__0"
    // InternalPascal.g:7022:1: rule__Variable_identifier_list__Group__0 : rule__Variable_identifier_list__Group__0__Impl rule__Variable_identifier_list__Group__1 ;
    public final void rule__Variable_identifier_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7026:1: ( rule__Variable_identifier_list__Group__0__Impl rule__Variable_identifier_list__Group__1 )
            // InternalPascal.g:7027:2: rule__Variable_identifier_list__Group__0__Impl rule__Variable_identifier_list__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Variable_identifier_list__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Variable_identifier_list__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:7034:1: rule__Variable_identifier_list__Group__0__Impl : ( ( rule__Variable_identifier_list__NamesAssignment_0 ) ) ;
    public final void rule__Variable_identifier_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7038:1: ( ( ( rule__Variable_identifier_list__NamesAssignment_0 ) ) )
            // InternalPascal.g:7039:1: ( ( rule__Variable_identifier_list__NamesAssignment_0 ) )
            {
            // InternalPascal.g:7039:1: ( ( rule__Variable_identifier_list__NamesAssignment_0 ) )
            // InternalPascal.g:7040:2: ( rule__Variable_identifier_list__NamesAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_identifier_listAccess().getNamesAssignment_0()); 
            }
            // InternalPascal.g:7041:2: ( rule__Variable_identifier_list__NamesAssignment_0 )
            // InternalPascal.g:7041:3: rule__Variable_identifier_list__NamesAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Variable_identifier_list__NamesAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_identifier_listAccess().getNamesAssignment_0()); 
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
    // $ANTLR end "rule__Variable_identifier_list__Group__0__Impl"


    // $ANTLR start "rule__Variable_identifier_list__Group__1"
    // InternalPascal.g:7049:1: rule__Variable_identifier_list__Group__1 : rule__Variable_identifier_list__Group__1__Impl ;
    public final void rule__Variable_identifier_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7053:1: ( rule__Variable_identifier_list__Group__1__Impl )
            // InternalPascal.g:7054:2: rule__Variable_identifier_list__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable_identifier_list__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:7060:1: rule__Variable_identifier_list__Group__1__Impl : ( ( rule__Variable_identifier_list__Group_1__0 )* ) ;
    public final void rule__Variable_identifier_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7064:1: ( ( ( rule__Variable_identifier_list__Group_1__0 )* ) )
            // InternalPascal.g:7065:1: ( ( rule__Variable_identifier_list__Group_1__0 )* )
            {
            // InternalPascal.g:7065:1: ( ( rule__Variable_identifier_list__Group_1__0 )* )
            // InternalPascal.g:7066:2: ( rule__Variable_identifier_list__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_identifier_listAccess().getGroup_1()); 
            }
            // InternalPascal.g:7067:2: ( rule__Variable_identifier_list__Group_1__0 )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==30) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalPascal.g:7067:3: rule__Variable_identifier_list__Group_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Variable_identifier_list__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_identifier_listAccess().getGroup_1()); 
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
    // $ANTLR end "rule__Variable_identifier_list__Group__1__Impl"


    // $ANTLR start "rule__Variable_identifier_list__Group_1__0"
    // InternalPascal.g:7076:1: rule__Variable_identifier_list__Group_1__0 : rule__Variable_identifier_list__Group_1__0__Impl rule__Variable_identifier_list__Group_1__1 ;
    public final void rule__Variable_identifier_list__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7080:1: ( rule__Variable_identifier_list__Group_1__0__Impl rule__Variable_identifier_list__Group_1__1 )
            // InternalPascal.g:7081:2: rule__Variable_identifier_list__Group_1__0__Impl rule__Variable_identifier_list__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__Variable_identifier_list__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Variable_identifier_list__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:7088:1: rule__Variable_identifier_list__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Variable_identifier_list__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7092:1: ( ( ',' ) )
            // InternalPascal.g:7093:1: ( ',' )
            {
            // InternalPascal.g:7093:1: ( ',' )
            // InternalPascal.g:7094:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_identifier_listAccess().getCommaKeyword_1_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_identifier_listAccess().getCommaKeyword_1_0()); 
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
    // $ANTLR end "rule__Variable_identifier_list__Group_1__0__Impl"


    // $ANTLR start "rule__Variable_identifier_list__Group_1__1"
    // InternalPascal.g:7103:1: rule__Variable_identifier_list__Group_1__1 : rule__Variable_identifier_list__Group_1__1__Impl ;
    public final void rule__Variable_identifier_list__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7107:1: ( rule__Variable_identifier_list__Group_1__1__Impl )
            // InternalPascal.g:7108:2: rule__Variable_identifier_list__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable_identifier_list__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:7114:1: rule__Variable_identifier_list__Group_1__1__Impl : ( ( rule__Variable_identifier_list__NamesAssignment_1_1 ) ) ;
    public final void rule__Variable_identifier_list__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7118:1: ( ( ( rule__Variable_identifier_list__NamesAssignment_1_1 ) ) )
            // InternalPascal.g:7119:1: ( ( rule__Variable_identifier_list__NamesAssignment_1_1 ) )
            {
            // InternalPascal.g:7119:1: ( ( rule__Variable_identifier_list__NamesAssignment_1_1 ) )
            // InternalPascal.g:7120:2: ( rule__Variable_identifier_list__NamesAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_identifier_listAccess().getNamesAssignment_1_1()); 
            }
            // InternalPascal.g:7121:2: ( rule__Variable_identifier_list__NamesAssignment_1_1 )
            // InternalPascal.g:7121:3: rule__Variable_identifier_list__NamesAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Variable_identifier_list__NamesAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_identifier_listAccess().getNamesAssignment_1_1()); 
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
    // $ANTLR end "rule__Variable_identifier_list__Group_1__1__Impl"


    // $ANTLR start "rule__While_statement__Group__0"
    // InternalPascal.g:7130:1: rule__While_statement__Group__0 : rule__While_statement__Group__0__Impl rule__While_statement__Group__1 ;
    public final void rule__While_statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7134:1: ( rule__While_statement__Group__0__Impl rule__While_statement__Group__1 )
            // InternalPascal.g:7135:2: rule__While_statement__Group__0__Impl rule__While_statement__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__While_statement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__While_statement__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While_statement__Group__0"


    // $ANTLR start "rule__While_statement__Group__0__Impl"
    // InternalPascal.g:7142:1: rule__While_statement__Group__0__Impl : ( 'while' ) ;
    public final void rule__While_statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7146:1: ( ( 'while' ) )
            // InternalPascal.g:7147:1: ( 'while' )
            {
            // InternalPascal.g:7147:1: ( 'while' )
            // InternalPascal.g:7148:2: 'while'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhile_statementAccess().getWhileKeyword_0()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhile_statementAccess().getWhileKeyword_0()); 
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
    // $ANTLR end "rule__While_statement__Group__0__Impl"


    // $ANTLR start "rule__While_statement__Group__1"
    // InternalPascal.g:7157:1: rule__While_statement__Group__1 : rule__While_statement__Group__1__Impl rule__While_statement__Group__2 ;
    public final void rule__While_statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7161:1: ( rule__While_statement__Group__1__Impl rule__While_statement__Group__2 )
            // InternalPascal.g:7162:2: rule__While_statement__Group__1__Impl rule__While_statement__Group__2
            {
            pushFollow(FOLLOW_43);
            rule__While_statement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__While_statement__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While_statement__Group__1"


    // $ANTLR start "rule__While_statement__Group__1__Impl"
    // InternalPascal.g:7169:1: rule__While_statement__Group__1__Impl : ( ( rule__While_statement__ExpressionAssignment_1 ) ) ;
    public final void rule__While_statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7173:1: ( ( ( rule__While_statement__ExpressionAssignment_1 ) ) )
            // InternalPascal.g:7174:1: ( ( rule__While_statement__ExpressionAssignment_1 ) )
            {
            // InternalPascal.g:7174:1: ( ( rule__While_statement__ExpressionAssignment_1 ) )
            // InternalPascal.g:7175:2: ( rule__While_statement__ExpressionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhile_statementAccess().getExpressionAssignment_1()); 
            }
            // InternalPascal.g:7176:2: ( rule__While_statement__ExpressionAssignment_1 )
            // InternalPascal.g:7176:3: rule__While_statement__ExpressionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__While_statement__ExpressionAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhile_statementAccess().getExpressionAssignment_1()); 
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
    // $ANTLR end "rule__While_statement__Group__1__Impl"


    // $ANTLR start "rule__While_statement__Group__2"
    // InternalPascal.g:7184:1: rule__While_statement__Group__2 : rule__While_statement__Group__2__Impl rule__While_statement__Group__3 ;
    public final void rule__While_statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7188:1: ( rule__While_statement__Group__2__Impl rule__While_statement__Group__3 )
            // InternalPascal.g:7189:2: rule__While_statement__Group__2__Impl rule__While_statement__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__While_statement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__While_statement__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While_statement__Group__2"


    // $ANTLR start "rule__While_statement__Group__2__Impl"
    // InternalPascal.g:7196:1: rule__While_statement__Group__2__Impl : ( 'do' ) ;
    public final void rule__While_statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7200:1: ( ( 'do' ) )
            // InternalPascal.g:7201:1: ( 'do' )
            {
            // InternalPascal.g:7201:1: ( 'do' )
            // InternalPascal.g:7202:2: 'do'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhile_statementAccess().getDoKeyword_2()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhile_statementAccess().getDoKeyword_2()); 
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
    // $ANTLR end "rule__While_statement__Group__2__Impl"


    // $ANTLR start "rule__While_statement__Group__3"
    // InternalPascal.g:7211:1: rule__While_statement__Group__3 : rule__While_statement__Group__3__Impl ;
    public final void rule__While_statement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7215:1: ( rule__While_statement__Group__3__Impl )
            // InternalPascal.g:7216:2: rule__While_statement__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__While_statement__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While_statement__Group__3"


    // $ANTLR start "rule__While_statement__Group__3__Impl"
    // InternalPascal.g:7222:1: rule__While_statement__Group__3__Impl : ( ( rule__While_statement__StatementAssignment_3 ) ) ;
    public final void rule__While_statement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7226:1: ( ( ( rule__While_statement__StatementAssignment_3 ) ) )
            // InternalPascal.g:7227:1: ( ( rule__While_statement__StatementAssignment_3 ) )
            {
            // InternalPascal.g:7227:1: ( ( rule__While_statement__StatementAssignment_3 ) )
            // InternalPascal.g:7228:2: ( rule__While_statement__StatementAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhile_statementAccess().getStatementAssignment_3()); 
            }
            // InternalPascal.g:7229:2: ( rule__While_statement__StatementAssignment_3 )
            // InternalPascal.g:7229:3: rule__While_statement__StatementAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__While_statement__StatementAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhile_statementAccess().getStatementAssignment_3()); 
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
    // $ANTLR end "rule__While_statement__Group__3__Impl"


    // $ANTLR start "rule__Pascal__ProgramAssignment"
    // InternalPascal.g:7238:1: rule__Pascal__ProgramAssignment : ( ruleprogram ) ;
    public final void rule__Pascal__ProgramAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7242:1: ( ( ruleprogram ) )
            // InternalPascal.g:7243:2: ( ruleprogram )
            {
            // InternalPascal.g:7243:2: ( ruleprogram )
            // InternalPascal.g:7244:3: ruleprogram
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPascalAccess().getProgramProgramParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleprogram();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPascalAccess().getProgramProgramParserRuleCall_0()); 
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
    // $ANTLR end "rule__Pascal__ProgramAssignment"


    // $ANTLR start "rule__Program__HeadingAssignment_0"
    // InternalPascal.g:7253:1: rule__Program__HeadingAssignment_0 : ( ruleprogram_heading_block ) ;
    public final void rule__Program__HeadingAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7257:1: ( ( ruleprogram_heading_block ) )
            // InternalPascal.g:7258:2: ( ruleprogram_heading_block )
            {
            // InternalPascal.g:7258:2: ( ruleprogram_heading_block )
            // InternalPascal.g:7259:3: ruleprogram_heading_block
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getHeadingProgram_heading_blockParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleprogram_heading_block();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getHeadingProgram_heading_blockParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Program__HeadingAssignment_0"


    // $ANTLR start "rule__Program__BlockAssignment_1"
    // InternalPascal.g:7268:1: rule__Program__BlockAssignment_1 : ( ruleblock ) ;
    public final void rule__Program__BlockAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7272:1: ( ( ruleblock ) )
            // InternalPascal.g:7273:2: ( ruleblock )
            {
            // InternalPascal.g:7273:2: ( ruleblock )
            // InternalPascal.g:7274:3: ruleblock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getBlockBlockParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleblock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getBlockBlockParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Program__BlockAssignment_1"


    // $ANTLR start "rule__Program_heading_block__NameAssignment_1"
    // InternalPascal.g:7283:1: rule__Program_heading_block__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Program_heading_block__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7287:1: ( ( RULE_ID ) )
            // InternalPascal.g:7288:2: ( RULE_ID )
            {
            // InternalPascal.g:7288:2: ( RULE_ID )
            // InternalPascal.g:7289:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgram_heading_blockAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgram_heading_blockAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Program_heading_block__NameAssignment_1"


    // $ANTLR start "rule__Block__LabelAssignment_0"
    // InternalPascal.g:7298:1: rule__Block__LabelAssignment_0 : ( rulelabel_declaration ) ;
    public final void rule__Block__LabelAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7302:1: ( ( rulelabel_declaration ) )
            // InternalPascal.g:7303:2: ( rulelabel_declaration )
            {
            // InternalPascal.g:7303:2: ( rulelabel_declaration )
            // InternalPascal.g:7304:3: rulelabel_declaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getLabelLabel_declarationParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            rulelabel_declaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getLabelLabel_declarationParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Block__LabelAssignment_0"


    // $ANTLR start "rule__Block__TypeAssignment_1"
    // InternalPascal.g:7313:1: rule__Block__TypeAssignment_1 : ( ruletype_definition_part ) ;
    public final void rule__Block__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7317:1: ( ( ruletype_definition_part ) )
            // InternalPascal.g:7318:2: ( ruletype_definition_part )
            {
            // InternalPascal.g:7318:2: ( ruletype_definition_part )
            // InternalPascal.g:7319:3: ruletype_definition_part
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getTypeType_definition_partParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruletype_definition_part();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getTypeType_definition_partParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Block__TypeAssignment_1"


    // $ANTLR start "rule__Block__VariableAssignment_2"
    // InternalPascal.g:7328:1: rule__Block__VariableAssignment_2 : ( rulevariable_declaration_part ) ;
    public final void rule__Block__VariableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7332:1: ( ( rulevariable_declaration_part ) )
            // InternalPascal.g:7333:2: ( rulevariable_declaration_part )
            {
            // InternalPascal.g:7333:2: ( rulevariable_declaration_part )
            // InternalPascal.g:7334:3: rulevariable_declaration_part
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getVariableVariable_declaration_partParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            rulevariable_declaration_part();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getVariableVariable_declaration_partParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Block__VariableAssignment_2"


    // $ANTLR start "rule__Block__ConstantAssignment_3"
    // InternalPascal.g:7343:1: rule__Block__ConstantAssignment_3 : ( ruleconstant_definition_part ) ;
    public final void rule__Block__ConstantAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7347:1: ( ( ruleconstant_definition_part ) )
            // InternalPascal.g:7348:2: ( ruleconstant_definition_part )
            {
            // InternalPascal.g:7348:2: ( ruleconstant_definition_part )
            // InternalPascal.g:7349:3: ruleconstant_definition_part
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getConstantConstant_definition_partParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleconstant_definition_part();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getConstantConstant_definition_partParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__Block__ConstantAssignment_3"


    // $ANTLR start "rule__Block__AbstractionAssignment_4"
    // InternalPascal.g:7358:1: rule__Block__AbstractionAssignment_4 : ( rulefunction_procedure_declaration ) ;
    public final void rule__Block__AbstractionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7362:1: ( ( rulefunction_procedure_declaration ) )
            // InternalPascal.g:7363:2: ( rulefunction_procedure_declaration )
            {
            // InternalPascal.g:7363:2: ( rulefunction_procedure_declaration )
            // InternalPascal.g:7364:3: rulefunction_procedure_declaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getAbstractionFunction_procedure_declarationParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            rulefunction_procedure_declaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getAbstractionFunction_procedure_declarationParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__Block__AbstractionAssignment_4"


    // $ANTLR start "rule__Block__StatementAssignment_5"
    // InternalPascal.g:7373:1: rule__Block__StatementAssignment_5 : ( rulestatement_part ) ;
    public final void rule__Block__StatementAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7377:1: ( ( rulestatement_part ) )
            // InternalPascal.g:7378:2: ( rulestatement_part )
            {
            // InternalPascal.g:7378:2: ( rulestatement_part )
            // InternalPascal.g:7379:3: rulestatement_part
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getStatementStatement_partParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            rulestatement_part();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getStatementStatement_partParserRuleCall_5_0()); 
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
    // $ANTLR end "rule__Block__StatementAssignment_5"


    // $ANTLR start "rule__Statement_part__SequenceAssignment_1"
    // InternalPascal.g:7388:1: rule__Statement_part__SequenceAssignment_1 : ( rulestatement_sequence ) ;
    public final void rule__Statement_part__SequenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7392:1: ( ( rulestatement_sequence ) )
            // InternalPascal.g:7393:2: ( rulestatement_sequence )
            {
            // InternalPascal.g:7393:2: ( rulestatement_sequence )
            // InternalPascal.g:7394:3: rulestatement_sequence
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatement_partAccess().getSequenceStatement_sequenceParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulestatement_sequence();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatement_partAccess().getSequenceStatement_sequenceParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Statement_part__SequenceAssignment_1"


    // $ANTLR start "rule__Statement_sequence__StatementsAssignment_0"
    // InternalPascal.g:7403:1: rule__Statement_sequence__StatementsAssignment_0 : ( rulestatement ) ;
    public final void rule__Statement_sequence__StatementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7407:1: ( ( rulestatement ) )
            // InternalPascal.g:7408:2: ( rulestatement )
            {
            // InternalPascal.g:7408:2: ( rulestatement )
            // InternalPascal.g:7409:3: rulestatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatement_sequenceAccess().getStatementsStatementParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            rulestatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatement_sequenceAccess().getStatementsStatementParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Statement_sequence__StatementsAssignment_0"


    // $ANTLR start "rule__Statement_sequence__StatementsAssignment_1_1"
    // InternalPascal.g:7418:1: rule__Statement_sequence__StatementsAssignment_1_1 : ( rulestatement ) ;
    public final void rule__Statement_sequence__StatementsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7422:1: ( ( rulestatement ) )
            // InternalPascal.g:7423:2: ( rulestatement )
            {
            // InternalPascal.g:7423:2: ( rulestatement )
            // InternalPascal.g:7424:3: rulestatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatement_sequenceAccess().getStatementsStatementParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulestatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatement_sequenceAccess().getStatementsStatementParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__Statement_sequence__StatementsAssignment_1_1"


    // $ANTLR start "rule__Statement__LabelAssignment_0_0"
    // InternalPascal.g:7433:1: rule__Statement__LabelAssignment_0_0 : ( rulelabel ) ;
    public final void rule__Statement__LabelAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7437:1: ( ( rulelabel ) )
            // InternalPascal.g:7438:2: ( rulelabel )
            {
            // InternalPascal.g:7438:2: ( rulelabel )
            // InternalPascal.g:7439:3: rulelabel
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getLabelLabelParserRuleCall_0_0_0()); 
            }
            pushFollow(FOLLOW_2);
            rulelabel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getLabelLabelParserRuleCall_0_0_0()); 
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
    // $ANTLR end "rule__Statement__LabelAssignment_0_0"


    // $ANTLR start "rule__Statement__SimpleAssignment_1_0"
    // InternalPascal.g:7448:1: rule__Statement__SimpleAssignment_1_0 : ( rulesimple_statement ) ;
    public final void rule__Statement__SimpleAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7452:1: ( ( rulesimple_statement ) )
            // InternalPascal.g:7453:2: ( rulesimple_statement )
            {
            // InternalPascal.g:7453:2: ( rulesimple_statement )
            // InternalPascal.g:7454:3: rulesimple_statement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getSimpleSimple_statementParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            rulesimple_statement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getSimpleSimple_statementParserRuleCall_1_0_0()); 
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
    // $ANTLR end "rule__Statement__SimpleAssignment_1_0"


    // $ANTLR start "rule__Statement__StructuredAssignment_1_1"
    // InternalPascal.g:7463:1: rule__Statement__StructuredAssignment_1_1 : ( rulestructured_statement ) ;
    public final void rule__Statement__StructuredAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7467:1: ( ( rulestructured_statement ) )
            // InternalPascal.g:7468:2: ( rulestructured_statement )
            {
            // InternalPascal.g:7468:2: ( rulestructured_statement )
            // InternalPascal.g:7469:3: rulestructured_statement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getStructuredStructured_statementParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulestructured_statement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getStructuredStructured_statementParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__Statement__StructuredAssignment_1_1"


    // $ANTLR start "rule__Simple_statement__AssignmentAssignment_0"
    // InternalPascal.g:7478:1: rule__Simple_statement__AssignmentAssignment_0 : ( ruleassignment_statement ) ;
    public final void rule__Simple_statement__AssignmentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7482:1: ( ( ruleassignment_statement ) )
            // InternalPascal.g:7483:2: ( ruleassignment_statement )
            {
            // InternalPascal.g:7483:2: ( ruleassignment_statement )
            // InternalPascal.g:7484:3: ruleassignment_statement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimple_statementAccess().getAssignmentAssignment_statementParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleassignment_statement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimple_statementAccess().getAssignmentAssignment_statementParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Simple_statement__AssignmentAssignment_0"


    // $ANTLR start "rule__Simple_statement__FunctionAssignment_1"
    // InternalPascal.g:7493:1: rule__Simple_statement__FunctionAssignment_1 : ( rulefunction_designator ) ;
    public final void rule__Simple_statement__FunctionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7497:1: ( ( rulefunction_designator ) )
            // InternalPascal.g:7498:2: ( rulefunction_designator )
            {
            // InternalPascal.g:7498:2: ( rulefunction_designator )
            // InternalPascal.g:7499:3: rulefunction_designator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimple_statementAccess().getFunctionFunction_designatorParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulefunction_designator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimple_statementAccess().getFunctionFunction_designatorParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Simple_statement__FunctionAssignment_1"


    // $ANTLR start "rule__Simple_statement__Function_noargsAssignment_2"
    // InternalPascal.g:7508:1: rule__Simple_statement__Function_noargsAssignment_2 : ( RULE_ID ) ;
    public final void rule__Simple_statement__Function_noargsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7512:1: ( ( RULE_ID ) )
            // InternalPascal.g:7513:2: ( RULE_ID )
            {
            // InternalPascal.g:7513:2: ( RULE_ID )
            // InternalPascal.g:7514:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimple_statementAccess().getFunction_noargsIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimple_statementAccess().getFunction_noargsIDTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__Simple_statement__Function_noargsAssignment_2"


    // $ANTLR start "rule__Structured_statement__CompoundAssignment_0"
    // InternalPascal.g:7523:1: rule__Structured_statement__CompoundAssignment_0 : ( rulecompound_statement ) ;
    public final void rule__Structured_statement__CompoundAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7527:1: ( ( rulecompound_statement ) )
            // InternalPascal.g:7528:2: ( rulecompound_statement )
            {
            // InternalPascal.g:7528:2: ( rulecompound_statement )
            // InternalPascal.g:7529:3: rulecompound_statement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStructured_statementAccess().getCompoundCompound_statementParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            rulecompound_statement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStructured_statementAccess().getCompoundCompound_statementParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Structured_statement__CompoundAssignment_0"


    // $ANTLR start "rule__Structured_statement__While_stmtAssignment_1"
    // InternalPascal.g:7538:1: rule__Structured_statement__While_stmtAssignment_1 : ( rulewhile_statement ) ;
    public final void rule__Structured_statement__While_stmtAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7542:1: ( ( rulewhile_statement ) )
            // InternalPascal.g:7543:2: ( rulewhile_statement )
            {
            // InternalPascal.g:7543:2: ( rulewhile_statement )
            // InternalPascal.g:7544:3: rulewhile_statement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStructured_statementAccess().getWhile_stmtWhile_statementParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulewhile_statement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStructured_statementAccess().getWhile_stmtWhile_statementParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Structured_statement__While_stmtAssignment_1"


    // $ANTLR start "rule__Compound_statement__SequenceAssignment_1"
    // InternalPascal.g:7553:1: rule__Compound_statement__SequenceAssignment_1 : ( rulestatement_sequence ) ;
    public final void rule__Compound_statement__SequenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7557:1: ( ( rulestatement_sequence ) )
            // InternalPascal.g:7558:2: ( rulestatement_sequence )
            {
            // InternalPascal.g:7558:2: ( rulestatement_sequence )
            // InternalPascal.g:7559:3: rulestatement_sequence
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompound_statementAccess().getSequenceStatement_sequenceParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulestatement_sequence();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompound_statementAccess().getSequenceStatement_sequenceParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Compound_statement__SequenceAssignment_1"


    // $ANTLR start "rule__Assignment_statement__VariableAssignment_0"
    // InternalPascal.g:7568:1: rule__Assignment_statement__VariableAssignment_0 : ( rulevariable ) ;
    public final void rule__Assignment_statement__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7572:1: ( ( rulevariable ) )
            // InternalPascal.g:7573:2: ( rulevariable )
            {
            // InternalPascal.g:7573:2: ( rulevariable )
            // InternalPascal.g:7574:3: rulevariable
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignment_statementAccess().getVariableVariableParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            rulevariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignment_statementAccess().getVariableVariableParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Assignment_statement__VariableAssignment_0"


    // $ANTLR start "rule__Assignment_statement__ExpressionAssignment_2"
    // InternalPascal.g:7583:1: rule__Assignment_statement__ExpressionAssignment_2 : ( ruleexpression ) ;
    public final void rule__Assignment_statement__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7587:1: ( ( ruleexpression ) )
            // InternalPascal.g:7588:2: ( ruleexpression )
            {
            // InternalPascal.g:7588:2: ( ruleexpression )
            // InternalPascal.g:7589:3: ruleexpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignment_statementAccess().getExpressionExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleexpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignment_statementAccess().getExpressionExpressionParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Assignment_statement__ExpressionAssignment_2"


    // $ANTLR start "rule__Label__NumberAssignment_0"
    // InternalPascal.g:7598:1: rule__Label__NumberAssignment_0 : ( RULE_SIGNED_INTEGER_NUMBER ) ;
    public final void rule__Label__NumberAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7602:1: ( ( RULE_SIGNED_INTEGER_NUMBER ) )
            // InternalPascal.g:7603:2: ( RULE_SIGNED_INTEGER_NUMBER )
            {
            // InternalPascal.g:7603:2: ( RULE_SIGNED_INTEGER_NUMBER )
            // InternalPascal.g:7604:3: RULE_SIGNED_INTEGER_NUMBER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabelAccess().getNumberSIGNED_INTEGER_NUMBERTerminalRuleCall_0_0()); 
            }
            match(input,RULE_SIGNED_INTEGER_NUMBER,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLabelAccess().getNumberSIGNED_INTEGER_NUMBERTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__Label__NumberAssignment_0"


    // $ANTLR start "rule__Label__NumberAssignment_1"
    // InternalPascal.g:7613:1: rule__Label__NumberAssignment_1 : ( RULE_INTEGER_NUMBER ) ;
    public final void rule__Label__NumberAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7617:1: ( ( RULE_INTEGER_NUMBER ) )
            // InternalPascal.g:7618:2: ( RULE_INTEGER_NUMBER )
            {
            // InternalPascal.g:7618:2: ( RULE_INTEGER_NUMBER )
            // InternalPascal.g:7619:3: RULE_INTEGER_NUMBER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabelAccess().getNumberINTEGER_NUMBERTerminalRuleCall_1_0()); 
            }
            match(input,RULE_INTEGER_NUMBER,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLabelAccess().getNumberINTEGER_NUMBERTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Label__NumberAssignment_1"


    // $ANTLR start "rule__Variable__NameAssignment_0"
    // InternalPascal.g:7628:1: rule__Variable__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7632:1: ( ( RULE_ID ) )
            // InternalPascal.g:7633:2: ( RULE_ID )
            {
            // InternalPascal.g:7633:2: ( RULE_ID )
            // InternalPascal.g:7634:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__Variable__NameAssignment_0"


    // $ANTLR start "rule__Variable__VariableAssignment_1"
    // InternalPascal.g:7643:1: rule__Variable__VariableAssignment_1 : ( rulevar_ ) ;
    public final void rule__Variable__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7647:1: ( ( rulevar_ ) )
            // InternalPascal.g:7648:2: ( rulevar_ )
            {
            // InternalPascal.g:7648:2: ( rulevar_ )
            // InternalPascal.g:7649:3: rulevar_
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getVariableVar_ParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulevar_();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getVariableVar_ParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Variable__VariableAssignment_1"


    // $ANTLR start "rule__Var___ExpressionsAssignment_0_1"
    // InternalPascal.g:7658:1: rule__Var___ExpressionsAssignment_0_1 : ( ruleexpression_list ) ;
    public final void rule__Var___ExpressionsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7662:1: ( ( ruleexpression_list ) )
            // InternalPascal.g:7663:2: ( ruleexpression_list )
            {
            // InternalPascal.g:7663:2: ( ruleexpression_list )
            // InternalPascal.g:7664:3: ruleexpression_list
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_Access().getExpressionsExpression_listParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleexpression_list();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_Access().getExpressionsExpression_listParserRuleCall_0_1_0()); 
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
    // $ANTLR end "rule__Var___ExpressionsAssignment_0_1"


    // $ANTLR start "rule__Var___ArrayAssignment_0_3"
    // InternalPascal.g:7673:1: rule__Var___ArrayAssignment_0_3 : ( rulevar_ ) ;
    public final void rule__Var___ArrayAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7677:1: ( ( rulevar_ ) )
            // InternalPascal.g:7678:2: ( rulevar_ )
            {
            // InternalPascal.g:7678:2: ( rulevar_ )
            // InternalPascal.g:7679:3: rulevar_
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_Access().getArrayVar_ParserRuleCall_0_3_0()); 
            }
            pushFollow(FOLLOW_2);
            rulevar_();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_Access().getArrayVar_ParserRuleCall_0_3_0()); 
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
    // $ANTLR end "rule__Var___ArrayAssignment_0_3"


    // $ANTLR start "rule__Var___AccessorAssignment_1_0"
    // InternalPascal.g:7688:1: rule__Var___AccessorAssignment_1_0 : ( ( '.' ) ) ;
    public final void rule__Var___AccessorAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7692:1: ( ( ( '.' ) ) )
            // InternalPascal.g:7693:2: ( ( '.' ) )
            {
            // InternalPascal.g:7693:2: ( ( '.' ) )
            // InternalPascal.g:7694:3: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_Access().getAccessorFullStopKeyword_1_0_0()); 
            }
            // InternalPascal.g:7695:3: ( '.' )
            // InternalPascal.g:7696:4: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_Access().getAccessorFullStopKeyword_1_0_0()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_Access().getAccessorFullStopKeyword_1_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_Access().getAccessorFullStopKeyword_1_0_0()); 
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
    // $ANTLR end "rule__Var___AccessorAssignment_1_0"


    // $ANTLR start "rule__Var___NameAssignment_1_1"
    // InternalPascal.g:7707:1: rule__Var___NameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Var___NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7711:1: ( ( RULE_ID ) )
            // InternalPascal.g:7712:2: ( RULE_ID )
            {
            // InternalPascal.g:7712:2: ( RULE_ID )
            // InternalPascal.g:7713:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_Access().getNameIDTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_Access().getNameIDTerminalRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__Var___NameAssignment_1_1"


    // $ANTLR start "rule__Var___VariableAssignment_1_2"
    // InternalPascal.g:7722:1: rule__Var___VariableAssignment_1_2 : ( rulevar_ ) ;
    public final void rule__Var___VariableAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7726:1: ( ( rulevar_ ) )
            // InternalPascal.g:7727:2: ( rulevar_ )
            {
            // InternalPascal.g:7727:2: ( rulevar_ )
            // InternalPascal.g:7728:3: rulevar_
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_Access().getVariableVar_ParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            rulevar_();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_Access().getVariableVar_ParserRuleCall_1_2_0()); 
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
    // $ANTLR end "rule__Var___VariableAssignment_1_2"


    // $ANTLR start "rule__Var___PointerAssignment_2_1"
    // InternalPascal.g:7737:1: rule__Var___PointerAssignment_2_1 : ( rulevar_ ) ;
    public final void rule__Var___PointerAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7741:1: ( ( rulevar_ ) )
            // InternalPascal.g:7742:2: ( rulevar_ )
            {
            // InternalPascal.g:7742:2: ( rulevar_ )
            // InternalPascal.g:7743:3: rulevar_
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_Access().getPointerVar_ParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulevar_();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVar_Access().getPointerVar_ParserRuleCall_2_1_0()); 
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
    // $ANTLR end "rule__Var___PointerAssignment_2_1"


    // $ANTLR start "rule__Expression_list__ExpressionsAssignment_0"
    // InternalPascal.g:7752:1: rule__Expression_list__ExpressionsAssignment_0 : ( ruleexpression ) ;
    public final void rule__Expression_list__ExpressionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7756:1: ( ( ruleexpression ) )
            // InternalPascal.g:7757:2: ( ruleexpression )
            {
            // InternalPascal.g:7757:2: ( ruleexpression )
            // InternalPascal.g:7758:3: ruleexpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression_listAccess().getExpressionsExpressionParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleexpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression_listAccess().getExpressionsExpressionParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Expression_list__ExpressionsAssignment_0"


    // $ANTLR start "rule__Expression_list__ExpressionsAssignment_1_1"
    // InternalPascal.g:7767:1: rule__Expression_list__ExpressionsAssignment_1_1 : ( ruleexpression ) ;
    public final void rule__Expression_list__ExpressionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7771:1: ( ( ruleexpression ) )
            // InternalPascal.g:7772:2: ( ruleexpression )
            {
            // InternalPascal.g:7772:2: ( ruleexpression )
            // InternalPascal.g:7773:3: ruleexpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression_listAccess().getExpressionsExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleexpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpression_listAccess().getExpressionsExpressionParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__Expression_list__ExpressionsAssignment_1_1"


    // $ANTLR start "rule__Expression__ExpressionsAssignment_0"
    // InternalPascal.g:7782:1: rule__Expression__ExpressionsAssignment_0 : ( rulesimple_expression ) ;
    public final void rule__Expression__ExpressionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7786:1: ( ( rulesimple_expression ) )
            // InternalPascal.g:7787:2: ( rulesimple_expression )
            {
            // InternalPascal.g:7787:2: ( rulesimple_expression )
            // InternalPascal.g:7788:3: rulesimple_expression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getExpressionsSimple_expressionParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            rulesimple_expression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getExpressionsSimple_expressionParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Expression__ExpressionsAssignment_0"


    // $ANTLR start "rule__Expression__OperatorsAssignment_1_0_0"
    // InternalPascal.g:7797:1: rule__Expression__OperatorsAssignment_1_0_0 : ( RULE_RELATIONAL_OP ) ;
    public final void rule__Expression__OperatorsAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7801:1: ( ( RULE_RELATIONAL_OP ) )
            // InternalPascal.g:7802:2: ( RULE_RELATIONAL_OP )
            {
            // InternalPascal.g:7802:2: ( RULE_RELATIONAL_OP )
            // InternalPascal.g:7803:3: RULE_RELATIONAL_OP
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getOperatorsRELATIONAL_OPTerminalRuleCall_1_0_0_0()); 
            }
            match(input,RULE_RELATIONAL_OP,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getOperatorsRELATIONAL_OPTerminalRuleCall_1_0_0_0()); 
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
    // $ANTLR end "rule__Expression__OperatorsAssignment_1_0_0"


    // $ANTLR start "rule__Expression__OperatorsAssignment_1_0_1"
    // InternalPascal.g:7812:1: rule__Expression__OperatorsAssignment_1_0_1 : ( ( 'in' ) ) ;
    public final void rule__Expression__OperatorsAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7816:1: ( ( ( 'in' ) ) )
            // InternalPascal.g:7817:2: ( ( 'in' ) )
            {
            // InternalPascal.g:7817:2: ( ( 'in' ) )
            // InternalPascal.g:7818:3: ( 'in' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getOperatorsInKeyword_1_0_1_0()); 
            }
            // InternalPascal.g:7819:3: ( 'in' )
            // InternalPascal.g:7820:4: 'in'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getOperatorsInKeyword_1_0_1_0()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getOperatorsInKeyword_1_0_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getOperatorsInKeyword_1_0_1_0()); 
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
    // $ANTLR end "rule__Expression__OperatorsAssignment_1_0_1"


    // $ANTLR start "rule__Expression__OperatorsAssignment_1_0_2"
    // InternalPascal.g:7831:1: rule__Expression__OperatorsAssignment_1_0_2 : ( ( '=' ) ) ;
    public final void rule__Expression__OperatorsAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7835:1: ( ( ( '=' ) ) )
            // InternalPascal.g:7836:2: ( ( '=' ) )
            {
            // InternalPascal.g:7836:2: ( ( '=' ) )
            // InternalPascal.g:7837:3: ( '=' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getOperatorsEqualsSignKeyword_1_0_2_0()); 
            }
            // InternalPascal.g:7838:3: ( '=' )
            // InternalPascal.g:7839:4: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getOperatorsEqualsSignKeyword_1_0_2_0()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getOperatorsEqualsSignKeyword_1_0_2_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getOperatorsEqualsSignKeyword_1_0_2_0()); 
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
    // $ANTLR end "rule__Expression__OperatorsAssignment_1_0_2"


    // $ANTLR start "rule__Expression__ExpressionsAssignment_1_1"
    // InternalPascal.g:7850:1: rule__Expression__ExpressionsAssignment_1_1 : ( rulesimple_expression ) ;
    public final void rule__Expression__ExpressionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7854:1: ( ( rulesimple_expression ) )
            // InternalPascal.g:7855:2: ( rulesimple_expression )
            {
            // InternalPascal.g:7855:2: ( rulesimple_expression )
            // InternalPascal.g:7856:3: rulesimple_expression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getExpressionsSimple_expressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulesimple_expression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getExpressionsSimple_expressionParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__Expression__ExpressionsAssignment_1_1"


    // $ANTLR start "rule__Simple_expression__PrefixOperatorAssignment_0"
    // InternalPascal.g:7865:1: rule__Simple_expression__PrefixOperatorAssignment_0 : ( RULE_ADDITION_OP ) ;
    public final void rule__Simple_expression__PrefixOperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7869:1: ( ( RULE_ADDITION_OP ) )
            // InternalPascal.g:7870:2: ( RULE_ADDITION_OP )
            {
            // InternalPascal.g:7870:2: ( RULE_ADDITION_OP )
            // InternalPascal.g:7871:3: RULE_ADDITION_OP
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimple_expressionAccess().getPrefixOperatorADDITION_OPTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ADDITION_OP,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimple_expressionAccess().getPrefixOperatorADDITION_OPTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__Simple_expression__PrefixOperatorAssignment_0"


    // $ANTLR start "rule__Simple_expression__TermsAssignment_1"
    // InternalPascal.g:7880:1: rule__Simple_expression__TermsAssignment_1 : ( ruleterm ) ;
    public final void rule__Simple_expression__TermsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7884:1: ( ( ruleterm ) )
            // InternalPascal.g:7885:2: ( ruleterm )
            {
            // InternalPascal.g:7885:2: ( ruleterm )
            // InternalPascal.g:7886:3: ruleterm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimple_expressionAccess().getTermsTermParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleterm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimple_expressionAccess().getTermsTermParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Simple_expression__TermsAssignment_1"


    // $ANTLR start "rule__Simple_expression__OperatorsAssignment_2_0_0_0"
    // InternalPascal.g:7895:1: rule__Simple_expression__OperatorsAssignment_2_0_0_0 : ( RULE_ADDITION_OP ) ;
    public final void rule__Simple_expression__OperatorsAssignment_2_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7899:1: ( ( RULE_ADDITION_OP ) )
            // InternalPascal.g:7900:2: ( RULE_ADDITION_OP )
            {
            // InternalPascal.g:7900:2: ( RULE_ADDITION_OP )
            // InternalPascal.g:7901:3: RULE_ADDITION_OP
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimple_expressionAccess().getOperatorsADDITION_OPTerminalRuleCall_2_0_0_0_0()); 
            }
            match(input,RULE_ADDITION_OP,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimple_expressionAccess().getOperatorsADDITION_OPTerminalRuleCall_2_0_0_0_0()); 
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
    // $ANTLR end "rule__Simple_expression__OperatorsAssignment_2_0_0_0"


    // $ANTLR start "rule__Simple_expression__OperatorsAssignment_2_0_0_1"
    // InternalPascal.g:7910:1: rule__Simple_expression__OperatorsAssignment_2_0_0_1 : ( ( 'or' ) ) ;
    public final void rule__Simple_expression__OperatorsAssignment_2_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7914:1: ( ( ( 'or' ) ) )
            // InternalPascal.g:7915:2: ( ( 'or' ) )
            {
            // InternalPascal.g:7915:2: ( ( 'or' ) )
            // InternalPascal.g:7916:3: ( 'or' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimple_expressionAccess().getOperatorsOrKeyword_2_0_0_1_0()); 
            }
            // InternalPascal.g:7917:3: ( 'or' )
            // InternalPascal.g:7918:4: 'or'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimple_expressionAccess().getOperatorsOrKeyword_2_0_0_1_0()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimple_expressionAccess().getOperatorsOrKeyword_2_0_0_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimple_expressionAccess().getOperatorsOrKeyword_2_0_0_1_0()); 
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
    // $ANTLR end "rule__Simple_expression__OperatorsAssignment_2_0_0_1"


    // $ANTLR start "rule__Simple_expression__TermsAssignment_2_0_1"
    // InternalPascal.g:7929:1: rule__Simple_expression__TermsAssignment_2_0_1 : ( ruleterm ) ;
    public final void rule__Simple_expression__TermsAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7933:1: ( ( ruleterm ) )
            // InternalPascal.g:7934:2: ( ruleterm )
            {
            // InternalPascal.g:7934:2: ( ruleterm )
            // InternalPascal.g:7935:3: ruleterm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimple_expressionAccess().getTermsTermParserRuleCall_2_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleterm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimple_expressionAccess().getTermsTermParserRuleCall_2_0_1_0()); 
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
    // $ANTLR end "rule__Simple_expression__TermsAssignment_2_0_1"


    // $ANTLR start "rule__Simple_expression__TermsAssignment_2_1"
    // InternalPascal.g:7944:1: rule__Simple_expression__TermsAssignment_2_1 : ( ruleunsigned_number ) ;
    public final void rule__Simple_expression__TermsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7948:1: ( ( ruleunsigned_number ) )
            // InternalPascal.g:7949:2: ( ruleunsigned_number )
            {
            // InternalPascal.g:7949:2: ( ruleunsigned_number )
            // InternalPascal.g:7950:3: ruleunsigned_number
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimple_expressionAccess().getTermsUnsigned_numberParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleunsigned_number();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimple_expressionAccess().getTermsUnsigned_numberParserRuleCall_2_1_0()); 
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
    // $ANTLR end "rule__Simple_expression__TermsAssignment_2_1"


    // $ANTLR start "rule__Term__FactorsAssignment_0"
    // InternalPascal.g:7959:1: rule__Term__FactorsAssignment_0 : ( rulefactor ) ;
    public final void rule__Term__FactorsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7963:1: ( ( rulefactor ) )
            // InternalPascal.g:7964:2: ( rulefactor )
            {
            // InternalPascal.g:7964:2: ( rulefactor )
            // InternalPascal.g:7965:3: rulefactor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getFactorsFactorParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            rulefactor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getFactorsFactorParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Term__FactorsAssignment_0"


    // $ANTLR start "rule__Term__OperatorsAssignment_1_0_0"
    // InternalPascal.g:7974:1: rule__Term__OperatorsAssignment_1_0_0 : ( RULE_MULTIPLICATION_OP ) ;
    public final void rule__Term__OperatorsAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7978:1: ( ( RULE_MULTIPLICATION_OP ) )
            // InternalPascal.g:7979:2: ( RULE_MULTIPLICATION_OP )
            {
            // InternalPascal.g:7979:2: ( RULE_MULTIPLICATION_OP )
            // InternalPascal.g:7980:3: RULE_MULTIPLICATION_OP
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getOperatorsMULTIPLICATION_OPTerminalRuleCall_1_0_0_0()); 
            }
            match(input,RULE_MULTIPLICATION_OP,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getOperatorsMULTIPLICATION_OPTerminalRuleCall_1_0_0_0()); 
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
    // $ANTLR end "rule__Term__OperatorsAssignment_1_0_0"


    // $ANTLR start "rule__Term__OperatorsAssignment_1_0_1"
    // InternalPascal.g:7989:1: rule__Term__OperatorsAssignment_1_0_1 : ( ( 'div' ) ) ;
    public final void rule__Term__OperatorsAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7993:1: ( ( ( 'div' ) ) )
            // InternalPascal.g:7994:2: ( ( 'div' ) )
            {
            // InternalPascal.g:7994:2: ( ( 'div' ) )
            // InternalPascal.g:7995:3: ( 'div' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getOperatorsDivKeyword_1_0_1_0()); 
            }
            // InternalPascal.g:7996:3: ( 'div' )
            // InternalPascal.g:7997:4: 'div'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getOperatorsDivKeyword_1_0_1_0()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getOperatorsDivKeyword_1_0_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getOperatorsDivKeyword_1_0_1_0()); 
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
    // $ANTLR end "rule__Term__OperatorsAssignment_1_0_1"


    // $ANTLR start "rule__Term__OperatorsAssignment_1_0_2"
    // InternalPascal.g:8008:1: rule__Term__OperatorsAssignment_1_0_2 : ( ( 'mod' ) ) ;
    public final void rule__Term__OperatorsAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8012:1: ( ( ( 'mod' ) ) )
            // InternalPascal.g:8013:2: ( ( 'mod' ) )
            {
            // InternalPascal.g:8013:2: ( ( 'mod' ) )
            // InternalPascal.g:8014:3: ( 'mod' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getOperatorsModKeyword_1_0_2_0()); 
            }
            // InternalPascal.g:8015:3: ( 'mod' )
            // InternalPascal.g:8016:4: 'mod'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getOperatorsModKeyword_1_0_2_0()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getOperatorsModKeyword_1_0_2_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getOperatorsModKeyword_1_0_2_0()); 
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
    // $ANTLR end "rule__Term__OperatorsAssignment_1_0_2"


    // $ANTLR start "rule__Term__OperatorsAssignment_1_0_3"
    // InternalPascal.g:8027:1: rule__Term__OperatorsAssignment_1_0_3 : ( ( 'and' ) ) ;
    public final void rule__Term__OperatorsAssignment_1_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8031:1: ( ( ( 'and' ) ) )
            // InternalPascal.g:8032:2: ( ( 'and' ) )
            {
            // InternalPascal.g:8032:2: ( ( 'and' ) )
            // InternalPascal.g:8033:3: ( 'and' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getOperatorsAndKeyword_1_0_3_0()); 
            }
            // InternalPascal.g:8034:3: ( 'and' )
            // InternalPascal.g:8035:4: 'and'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getOperatorsAndKeyword_1_0_3_0()); 
            }
            match(input,50,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getOperatorsAndKeyword_1_0_3_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getOperatorsAndKeyword_1_0_3_0()); 
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
    // $ANTLR end "rule__Term__OperatorsAssignment_1_0_3"


    // $ANTLR start "rule__Term__FactorsAssignment_1_1"
    // InternalPascal.g:8046:1: rule__Term__FactorsAssignment_1_1 : ( rulefactor ) ;
    public final void rule__Term__FactorsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8050:1: ( ( rulefactor ) )
            // InternalPascal.g:8051:2: ( rulefactor )
            {
            // InternalPascal.g:8051:2: ( rulefactor )
            // InternalPascal.g:8052:3: rulefactor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getFactorsFactorParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulefactor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getFactorsFactorParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__Term__FactorsAssignment_1_1"


    // $ANTLR start "rule__Factor__VariableAssignment_0"
    // InternalPascal.g:8061:1: rule__Factor__VariableAssignment_0 : ( rulevariable ) ;
    public final void rule__Factor__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8065:1: ( ( rulevariable ) )
            // InternalPascal.g:8066:2: ( rulevariable )
            {
            // InternalPascal.g:8066:2: ( rulevariable )
            // InternalPascal.g:8067:3: rulevariable
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getVariableVariableParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            rulevariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorAccess().getVariableVariableParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Factor__VariableAssignment_0"


    // $ANTLR start "rule__Factor__NumberAssignment_1"
    // InternalPascal.g:8076:1: rule__Factor__NumberAssignment_1 : ( rulenumber ) ;
    public final void rule__Factor__NumberAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8080:1: ( ( rulenumber ) )
            // InternalPascal.g:8081:2: ( rulenumber )
            {
            // InternalPascal.g:8081:2: ( rulenumber )
            // InternalPascal.g:8082:3: rulenumber
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getNumberNumberParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulenumber();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorAccess().getNumberNumberParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Factor__NumberAssignment_1"


    // $ANTLR start "rule__Factor__StringAssignment_2"
    // InternalPascal.g:8091:1: rule__Factor__StringAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Factor__StringAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8095:1: ( ( RULE_STRING ) )
            // InternalPascal.g:8096:2: ( RULE_STRING )
            {
            // InternalPascal.g:8096:2: ( RULE_STRING )
            // InternalPascal.g:8097:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getStringSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorAccess().getStringSTRINGTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__Factor__StringAssignment_2"


    // $ANTLR start "rule__Factor__SetAssignment_3"
    // InternalPascal.g:8106:1: rule__Factor__SetAssignment_3 : ( ruleset ) ;
    public final void rule__Factor__SetAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8110:1: ( ( ruleset ) )
            // InternalPascal.g:8111:2: ( ruleset )
            {
            // InternalPascal.g:8111:2: ( ruleset )
            // InternalPascal.g:8112:3: ruleset
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getSetSetParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleset();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorAccess().getSetSetParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__Factor__SetAssignment_3"


    // $ANTLR start "rule__Factor__NilAssignment_4"
    // InternalPascal.g:8121:1: rule__Factor__NilAssignment_4 : ( ( 'nil' ) ) ;
    public final void rule__Factor__NilAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8125:1: ( ( ( 'nil' ) ) )
            // InternalPascal.g:8126:2: ( ( 'nil' ) )
            {
            // InternalPascal.g:8126:2: ( ( 'nil' ) )
            // InternalPascal.g:8127:3: ( 'nil' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getNilNilKeyword_4_0()); 
            }
            // InternalPascal.g:8128:3: ( 'nil' )
            // InternalPascal.g:8129:4: 'nil'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getNilNilKeyword_4_0()); 
            }
            match(input,51,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorAccess().getNilNilKeyword_4_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorAccess().getNilNilKeyword_4_0()); 
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
    // $ANTLR end "rule__Factor__NilAssignment_4"


    // $ANTLR start "rule__Factor__BooleanAssignment_5"
    // InternalPascal.g:8140:1: rule__Factor__BooleanAssignment_5 : ( ( 'true' ) ) ;
    public final void rule__Factor__BooleanAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8144:1: ( ( ( 'true' ) ) )
            // InternalPascal.g:8145:2: ( ( 'true' ) )
            {
            // InternalPascal.g:8145:2: ( ( 'true' ) )
            // InternalPascal.g:8146:3: ( 'true' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getBooleanTrueKeyword_5_0()); 
            }
            // InternalPascal.g:8147:3: ( 'true' )
            // InternalPascal.g:8148:4: 'true'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getBooleanTrueKeyword_5_0()); 
            }
            match(input,52,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorAccess().getBooleanTrueKeyword_5_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorAccess().getBooleanTrueKeyword_5_0()); 
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
    // $ANTLR end "rule__Factor__BooleanAssignment_5"


    // $ANTLR start "rule__Factor__BooleanAssignment_6"
    // InternalPascal.g:8159:1: rule__Factor__BooleanAssignment_6 : ( ( 'false' ) ) ;
    public final void rule__Factor__BooleanAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8163:1: ( ( ( 'false' ) ) )
            // InternalPascal.g:8164:2: ( ( 'false' ) )
            {
            // InternalPascal.g:8164:2: ( ( 'false' ) )
            // InternalPascal.g:8165:3: ( 'false' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getBooleanFalseKeyword_6_0()); 
            }
            // InternalPascal.g:8166:3: ( 'false' )
            // InternalPascal.g:8167:4: 'false'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getBooleanFalseKeyword_6_0()); 
            }
            match(input,53,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorAccess().getBooleanFalseKeyword_6_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorAccess().getBooleanFalseKeyword_6_0()); 
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
    // $ANTLR end "rule__Factor__BooleanAssignment_6"


    // $ANTLR start "rule__Factor__FunctionAssignment_7"
    // InternalPascal.g:8178:1: rule__Factor__FunctionAssignment_7 : ( rulefunction_designator ) ;
    public final void rule__Factor__FunctionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8182:1: ( ( rulefunction_designator ) )
            // InternalPascal.g:8183:2: ( rulefunction_designator )
            {
            // InternalPascal.g:8183:2: ( rulefunction_designator )
            // InternalPascal.g:8184:3: rulefunction_designator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getFunctionFunction_designatorParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_2);
            rulefunction_designator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorAccess().getFunctionFunction_designatorParserRuleCall_7_0()); 
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
    // $ANTLR end "rule__Factor__FunctionAssignment_7"


    // $ANTLR start "rule__Factor__ExpressionAssignment_8_1"
    // InternalPascal.g:8193:1: rule__Factor__ExpressionAssignment_8_1 : ( ruleexpression ) ;
    public final void rule__Factor__ExpressionAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8197:1: ( ( ruleexpression ) )
            // InternalPascal.g:8198:2: ( ruleexpression )
            {
            // InternalPascal.g:8198:2: ( ruleexpression )
            // InternalPascal.g:8199:3: ruleexpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getExpressionExpressionParserRuleCall_8_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleexpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorAccess().getExpressionExpressionParserRuleCall_8_1_0()); 
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
    // $ANTLR end "rule__Factor__ExpressionAssignment_8_1"


    // $ANTLR start "rule__Factor__NotAssignment_9_1"
    // InternalPascal.g:8208:1: rule__Factor__NotAssignment_9_1 : ( rulefactor ) ;
    public final void rule__Factor__NotAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8212:1: ( ( rulefactor ) )
            // InternalPascal.g:8213:2: ( rulefactor )
            {
            // InternalPascal.g:8213:2: ( rulefactor )
            // InternalPascal.g:8214:3: rulefactor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getNotFactorParserRuleCall_9_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulefactor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorAccess().getNotFactorParserRuleCall_9_1_0()); 
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
    // $ANTLR end "rule__Factor__NotAssignment_9_1"


    // $ANTLR start "rule__Function_designator__NameAssignment_0"
    // InternalPascal.g:8223:1: rule__Function_designator__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Function_designator__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8227:1: ( ( RULE_ID ) )
            // InternalPascal.g:8228:2: ( RULE_ID )
            {
            // InternalPascal.g:8228:2: ( RULE_ID )
            // InternalPascal.g:8229:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_designatorAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunction_designatorAccess().getNameIDTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__Function_designator__NameAssignment_0"


    // $ANTLR start "rule__Function_designator__ExpressionsAssignment_2"
    // InternalPascal.g:8238:1: rule__Function_designator__ExpressionsAssignment_2 : ( ruleexpression_list ) ;
    public final void rule__Function_designator__ExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8242:1: ( ( ruleexpression_list ) )
            // InternalPascal.g:8243:2: ( ruleexpression_list )
            {
            // InternalPascal.g:8243:2: ( ruleexpression_list )
            // InternalPascal.g:8244:3: ruleexpression_list
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_designatorAccess().getExpressionsExpression_listParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleexpression_list();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunction_designatorAccess().getExpressionsExpression_listParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Function_designator__ExpressionsAssignment_2"


    // $ANTLR start "rule__Function_procedure_declaration__ProceduresAssignment_0_0"
    // InternalPascal.g:8253:1: rule__Function_procedure_declaration__ProceduresAssignment_0_0 : ( rulefunction_declaration ) ;
    public final void rule__Function_procedure_declaration__ProceduresAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8257:1: ( ( rulefunction_declaration ) )
            // InternalPascal.g:8258:2: ( rulefunction_declaration )
            {
            // InternalPascal.g:8258:2: ( rulefunction_declaration )
            // InternalPascal.g:8259:3: rulefunction_declaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_procedure_declarationAccess().getProceduresFunction_declarationParserRuleCall_0_0_0()); 
            }
            pushFollow(FOLLOW_2);
            rulefunction_declaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunction_procedure_declarationAccess().getProceduresFunction_declarationParserRuleCall_0_0_0()); 
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
    // $ANTLR end "rule__Function_procedure_declaration__ProceduresAssignment_0_0"


    // $ANTLR start "rule__Function_procedure_declaration__FunctionsAssignment_0_1"
    // InternalPascal.g:8268:1: rule__Function_procedure_declaration__FunctionsAssignment_0_1 : ( ruleprocedure_declaration ) ;
    public final void rule__Function_procedure_declaration__FunctionsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8272:1: ( ( ruleprocedure_declaration ) )
            // InternalPascal.g:8273:2: ( ruleprocedure_declaration )
            {
            // InternalPascal.g:8273:2: ( ruleprocedure_declaration )
            // InternalPascal.g:8274:3: ruleprocedure_declaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_procedure_declarationAccess().getFunctionsProcedure_declarationParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleprocedure_declaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunction_procedure_declarationAccess().getFunctionsProcedure_declarationParserRuleCall_0_1_0()); 
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
    // $ANTLR end "rule__Function_procedure_declaration__FunctionsAssignment_0_1"


    // $ANTLR start "rule__Function_heading__NameAssignment_1"
    // InternalPascal.g:8283:1: rule__Function_heading__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Function_heading__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8287:1: ( ( RULE_ID ) )
            // InternalPascal.g:8288:2: ( RULE_ID )
            {
            // InternalPascal.g:8288:2: ( RULE_ID )
            // InternalPascal.g:8289:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_headingAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunction_headingAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Function_heading__NameAssignment_1"


    // $ANTLR start "rule__Function_heading__ParametersAssignment_2"
    // InternalPascal.g:8298:1: rule__Function_heading__ParametersAssignment_2 : ( ruleformal_parameter_list ) ;
    public final void rule__Function_heading__ParametersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8302:1: ( ( ruleformal_parameter_list ) )
            // InternalPascal.g:8303:2: ( ruleformal_parameter_list )
            {
            // InternalPascal.g:8303:2: ( ruleformal_parameter_list )
            // InternalPascal.g:8304:3: ruleformal_parameter_list
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_headingAccess().getParametersFormal_parameter_listParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleformal_parameter_list();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunction_headingAccess().getParametersFormal_parameter_listParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Function_heading__ParametersAssignment_2"


    // $ANTLR start "rule__Function_heading__ReturnTypeAssignment_4"
    // InternalPascal.g:8313:1: rule__Function_heading__ReturnTypeAssignment_4 : ( RULE_ID ) ;
    public final void rule__Function_heading__ReturnTypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8317:1: ( ( RULE_ID ) )
            // InternalPascal.g:8318:2: ( RULE_ID )
            {
            // InternalPascal.g:8318:2: ( RULE_ID )
            // InternalPascal.g:8319:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_headingAccess().getReturnTypeIDTerminalRuleCall_4_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunction_headingAccess().getReturnTypeIDTerminalRuleCall_4_0()); 
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
    // $ANTLR end "rule__Function_heading__ReturnTypeAssignment_4"


    // $ANTLR start "rule__Function_declaration__HeadingAssignment_0"
    // InternalPascal.g:8328:1: rule__Function_declaration__HeadingAssignment_0 : ( rulefunction_heading ) ;
    public final void rule__Function_declaration__HeadingAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8332:1: ( ( rulefunction_heading ) )
            // InternalPascal.g:8333:2: ( rulefunction_heading )
            {
            // InternalPascal.g:8333:2: ( rulefunction_heading )
            // InternalPascal.g:8334:3: rulefunction_heading
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_declarationAccess().getHeadingFunction_headingParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            rulefunction_heading();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunction_declarationAccess().getHeadingFunction_headingParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Function_declaration__HeadingAssignment_0"


    // $ANTLR start "rule__Function_declaration__BlockAssignment_2"
    // InternalPascal.g:8343:1: rule__Function_declaration__BlockAssignment_2 : ( ruleblock ) ;
    public final void rule__Function_declaration__BlockAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8347:1: ( ( ruleblock ) )
            // InternalPascal.g:8348:2: ( ruleblock )
            {
            // InternalPascal.g:8348:2: ( ruleblock )
            // InternalPascal.g:8349:3: ruleblock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_declarationAccess().getBlockBlockParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleblock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunction_declarationAccess().getBlockBlockParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Function_declaration__BlockAssignment_2"


    // $ANTLR start "rule__Formal_parameter_list__ParametersAssignment_1"
    // InternalPascal.g:8358:1: rule__Formal_parameter_list__ParametersAssignment_1 : ( ruleformal_parameter_section ) ;
    public final void rule__Formal_parameter_list__ParametersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8362:1: ( ( ruleformal_parameter_section ) )
            // InternalPascal.g:8363:2: ( ruleformal_parameter_section )
            {
            // InternalPascal.g:8363:2: ( ruleformal_parameter_section )
            // InternalPascal.g:8364:3: ruleformal_parameter_section
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormal_parameter_listAccess().getParametersFormal_parameter_sectionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleformal_parameter_section();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormal_parameter_listAccess().getParametersFormal_parameter_sectionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Formal_parameter_list__ParametersAssignment_1"


    // $ANTLR start "rule__Formal_parameter_list__ParametersAssignment_2_1"
    // InternalPascal.g:8373:1: rule__Formal_parameter_list__ParametersAssignment_2_1 : ( ruleformal_parameter_section ) ;
    public final void rule__Formal_parameter_list__ParametersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8377:1: ( ( ruleformal_parameter_section ) )
            // InternalPascal.g:8378:2: ( ruleformal_parameter_section )
            {
            // InternalPascal.g:8378:2: ( ruleformal_parameter_section )
            // InternalPascal.g:8379:3: ruleformal_parameter_section
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormal_parameter_listAccess().getParametersFormal_parameter_sectionParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleformal_parameter_section();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormal_parameter_listAccess().getParametersFormal_parameter_sectionParserRuleCall_2_1_0()); 
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
    // $ANTLR end "rule__Formal_parameter_list__ParametersAssignment_2_1"


    // $ANTLR start "rule__Formal_parameter_section__ValueAssignment_0"
    // InternalPascal.g:8388:1: rule__Formal_parameter_section__ValueAssignment_0 : ( rulevalue_parameter_section ) ;
    public final void rule__Formal_parameter_section__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8392:1: ( ( rulevalue_parameter_section ) )
            // InternalPascal.g:8393:2: ( rulevalue_parameter_section )
            {
            // InternalPascal.g:8393:2: ( rulevalue_parameter_section )
            // InternalPascal.g:8394:3: rulevalue_parameter_section
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormal_parameter_sectionAccess().getValueValue_parameter_sectionParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            rulevalue_parameter_section();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormal_parameter_sectionAccess().getValueValue_parameter_sectionParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Formal_parameter_section__ValueAssignment_0"


    // $ANTLR start "rule__Formal_parameter_section__VariableAssignment_1"
    // InternalPascal.g:8403:1: rule__Formal_parameter_section__VariableAssignment_1 : ( rulevariable_parameter_section ) ;
    public final void rule__Formal_parameter_section__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8407:1: ( ( rulevariable_parameter_section ) )
            // InternalPascal.g:8408:2: ( rulevariable_parameter_section )
            {
            // InternalPascal.g:8408:2: ( rulevariable_parameter_section )
            // InternalPascal.g:8409:3: rulevariable_parameter_section
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormal_parameter_sectionAccess().getVariableVariable_parameter_sectionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulevariable_parameter_section();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormal_parameter_sectionAccess().getVariableVariable_parameter_sectionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Formal_parameter_section__VariableAssignment_1"


    // $ANTLR start "rule__Formal_parameter_section__ProcedureAssignment_2"
    // InternalPascal.g:8418:1: rule__Formal_parameter_section__ProcedureAssignment_2 : ( ruleprocedure_heading ) ;
    public final void rule__Formal_parameter_section__ProcedureAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8422:1: ( ( ruleprocedure_heading ) )
            // InternalPascal.g:8423:2: ( ruleprocedure_heading )
            {
            // InternalPascal.g:8423:2: ( ruleprocedure_heading )
            // InternalPascal.g:8424:3: ruleprocedure_heading
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormal_parameter_sectionAccess().getProcedureProcedure_headingParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleprocedure_heading();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormal_parameter_sectionAccess().getProcedureProcedure_headingParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Formal_parameter_section__ProcedureAssignment_2"


    // $ANTLR start "rule__Formal_parameter_section__FunctionAssignment_3"
    // InternalPascal.g:8433:1: rule__Formal_parameter_section__FunctionAssignment_3 : ( rulefunction_heading ) ;
    public final void rule__Formal_parameter_section__FunctionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8437:1: ( ( rulefunction_heading ) )
            // InternalPascal.g:8438:2: ( rulefunction_heading )
            {
            // InternalPascal.g:8438:2: ( rulefunction_heading )
            // InternalPascal.g:8439:3: rulefunction_heading
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormal_parameter_sectionAccess().getFunctionFunction_headingParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            rulefunction_heading();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormal_parameter_sectionAccess().getFunctionFunction_headingParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__Formal_parameter_section__FunctionAssignment_3"


    // $ANTLR start "rule__Value_parameter_section__IdentifiersAssignment_0"
    // InternalPascal.g:8448:1: rule__Value_parameter_section__IdentifiersAssignment_0 : ( ruleidentifier_list ) ;
    public final void rule__Value_parameter_section__IdentifiersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8452:1: ( ( ruleidentifier_list ) )
            // InternalPascal.g:8453:2: ( ruleidentifier_list )
            {
            // InternalPascal.g:8453:2: ( ruleidentifier_list )
            // InternalPascal.g:8454:3: ruleidentifier_list
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValue_parameter_sectionAccess().getIdentifiersIdentifier_listParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleidentifier_list();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValue_parameter_sectionAccess().getIdentifiersIdentifier_listParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Value_parameter_section__IdentifiersAssignment_0"


    // $ANTLR start "rule__Value_parameter_section__TypeAssignment_2"
    // InternalPascal.g:8463:1: rule__Value_parameter_section__TypeAssignment_2 : ( ruleparameter_type ) ;
    public final void rule__Value_parameter_section__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8467:1: ( ( ruleparameter_type ) )
            // InternalPascal.g:8468:2: ( ruleparameter_type )
            {
            // InternalPascal.g:8468:2: ( ruleparameter_type )
            // InternalPascal.g:8469:3: ruleparameter_type
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValue_parameter_sectionAccess().getTypeParameter_typeParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleparameter_type();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValue_parameter_sectionAccess().getTypeParameter_typeParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Value_parameter_section__TypeAssignment_2"


    // $ANTLR start "rule__Identifier_list__NamesAssignment_0"
    // InternalPascal.g:8478:1: rule__Identifier_list__NamesAssignment_0 : ( RULE_ID ) ;
    public final void rule__Identifier_list__NamesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8482:1: ( ( RULE_ID ) )
            // InternalPascal.g:8483:2: ( RULE_ID )
            {
            // InternalPascal.g:8483:2: ( RULE_ID )
            // InternalPascal.g:8484:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifier_listAccess().getNamesIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentifier_listAccess().getNamesIDTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__Identifier_list__NamesAssignment_0"


    // $ANTLR start "rule__Identifier_list__NamesAssignment_1_1"
    // InternalPascal.g:8493:1: rule__Identifier_list__NamesAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Identifier_list__NamesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8497:1: ( ( RULE_ID ) )
            // InternalPascal.g:8498:2: ( RULE_ID )
            {
            // InternalPascal.g:8498:2: ( RULE_ID )
            // InternalPascal.g:8499:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifier_listAccess().getNamesIDTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentifier_listAccess().getNamesIDTerminalRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__Identifier_list__NamesAssignment_1_1"


    // $ANTLR start "rule__Parameter_type__NameAssignment"
    // InternalPascal.g:8508:1: rule__Parameter_type__NameAssignment : ( RULE_ID ) ;
    public final void rule__Parameter_type__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8512:1: ( ( RULE_ID ) )
            // InternalPascal.g:8513:2: ( RULE_ID )
            {
            // InternalPascal.g:8513:2: ( RULE_ID )
            // InternalPascal.g:8514:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameter_typeAccess().getNameIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameter_typeAccess().getNameIDTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__Parameter_type__NameAssignment"


    // $ANTLR start "rule__Variable_parameter_section__IndentifiersAssignment_1"
    // InternalPascal.g:8523:1: rule__Variable_parameter_section__IndentifiersAssignment_1 : ( ruleidentifier_list ) ;
    public final void rule__Variable_parameter_section__IndentifiersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8527:1: ( ( ruleidentifier_list ) )
            // InternalPascal.g:8528:2: ( ruleidentifier_list )
            {
            // InternalPascal.g:8528:2: ( ruleidentifier_list )
            // InternalPascal.g:8529:3: ruleidentifier_list
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_parameter_sectionAccess().getIndentifiersIdentifier_listParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleidentifier_list();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_parameter_sectionAccess().getIndentifiersIdentifier_listParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Variable_parameter_section__IndentifiersAssignment_1"


    // $ANTLR start "rule__Variable_parameter_section__TypeAssignment_3"
    // InternalPascal.g:8538:1: rule__Variable_parameter_section__TypeAssignment_3 : ( ruleparameter_type ) ;
    public final void rule__Variable_parameter_section__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8542:1: ( ( ruleparameter_type ) )
            // InternalPascal.g:8543:2: ( ruleparameter_type )
            {
            // InternalPascal.g:8543:2: ( ruleparameter_type )
            // InternalPascal.g:8544:3: ruleparameter_type
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_parameter_sectionAccess().getTypeParameter_typeParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleparameter_type();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_parameter_sectionAccess().getTypeParameter_typeParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__Variable_parameter_section__TypeAssignment_3"


    // $ANTLR start "rule__Procedure_declaration__HeadingAssignment_0"
    // InternalPascal.g:8553:1: rule__Procedure_declaration__HeadingAssignment_0 : ( ruleprocedure_heading ) ;
    public final void rule__Procedure_declaration__HeadingAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8557:1: ( ( ruleprocedure_heading ) )
            // InternalPascal.g:8558:2: ( ruleprocedure_heading )
            {
            // InternalPascal.g:8558:2: ( ruleprocedure_heading )
            // InternalPascal.g:8559:3: ruleprocedure_heading
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcedure_declarationAccess().getHeadingProcedure_headingParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleprocedure_heading();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcedure_declarationAccess().getHeadingProcedure_headingParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Procedure_declaration__HeadingAssignment_0"


    // $ANTLR start "rule__Procedure_declaration__BlockAssignment_2"
    // InternalPascal.g:8568:1: rule__Procedure_declaration__BlockAssignment_2 : ( ruleblock ) ;
    public final void rule__Procedure_declaration__BlockAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8572:1: ( ( ruleblock ) )
            // InternalPascal.g:8573:2: ( ruleblock )
            {
            // InternalPascal.g:8573:2: ( ruleblock )
            // InternalPascal.g:8574:3: ruleblock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcedure_declarationAccess().getBlockBlockParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleblock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcedure_declarationAccess().getBlockBlockParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Procedure_declaration__BlockAssignment_2"


    // $ANTLR start "rule__Procedure_heading__NameAssignment_1"
    // InternalPascal.g:8583:1: rule__Procedure_heading__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Procedure_heading__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8587:1: ( ( RULE_ID ) )
            // InternalPascal.g:8588:2: ( RULE_ID )
            {
            // InternalPascal.g:8588:2: ( RULE_ID )
            // InternalPascal.g:8589:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcedure_headingAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcedure_headingAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Procedure_heading__NameAssignment_1"


    // $ANTLR start "rule__Procedure_heading__ParametersAssignment_2"
    // InternalPascal.g:8598:1: rule__Procedure_heading__ParametersAssignment_2 : ( ruleformal_parameter_list ) ;
    public final void rule__Procedure_heading__ParametersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8602:1: ( ( ruleformal_parameter_list ) )
            // InternalPascal.g:8603:2: ( ruleformal_parameter_list )
            {
            // InternalPascal.g:8603:2: ( ruleformal_parameter_list )
            // InternalPascal.g:8604:3: ruleformal_parameter_list
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcedure_headingAccess().getParametersFormal_parameter_listParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleformal_parameter_list();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcedure_headingAccess().getParametersFormal_parameter_listParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Procedure_heading__ParametersAssignment_2"


    // $ANTLR start "rule__Set__BracketsAssignment_0"
    // InternalPascal.g:8613:1: rule__Set__BracketsAssignment_0 : ( ( '[' ) ) ;
    public final void rule__Set__BracketsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8617:1: ( ( ( '[' ) ) )
            // InternalPascal.g:8618:2: ( ( '[' ) )
            {
            // InternalPascal.g:8618:2: ( ( '[' ) )
            // InternalPascal.g:8619:3: ( '[' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetAccess().getBracketsLeftSquareBracketKeyword_0_0()); 
            }
            // InternalPascal.g:8620:3: ( '[' )
            // InternalPascal.g:8621:4: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetAccess().getBracketsLeftSquareBracketKeyword_0_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetAccess().getBracketsLeftSquareBracketKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetAccess().getBracketsLeftSquareBracketKeyword_0_0()); 
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
    // $ANTLR end "rule__Set__BracketsAssignment_0"


    // $ANTLR start "rule__Set__ExpressionsAssignment_1"
    // InternalPascal.g:8632:1: rule__Set__ExpressionsAssignment_1 : ( ruleexpression_list ) ;
    public final void rule__Set__ExpressionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8636:1: ( ( ruleexpression_list ) )
            // InternalPascal.g:8637:2: ( ruleexpression_list )
            {
            // InternalPascal.g:8637:2: ( ruleexpression_list )
            // InternalPascal.g:8638:3: ruleexpression_list
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetAccess().getExpressionsExpression_listParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleexpression_list();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetAccess().getExpressionsExpression_listParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Set__ExpressionsAssignment_1"


    // $ANTLR start "rule__Set__BracketsAssignment_2"
    // InternalPascal.g:8647:1: rule__Set__BracketsAssignment_2 : ( ( ']' ) ) ;
    public final void rule__Set__BracketsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8651:1: ( ( ( ']' ) ) )
            // InternalPascal.g:8652:2: ( ( ']' ) )
            {
            // InternalPascal.g:8652:2: ( ( ']' ) )
            // InternalPascal.g:8653:3: ( ']' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetAccess().getBracketsRightSquareBracketKeyword_2_0()); 
            }
            // InternalPascal.g:8654:3: ( ']' )
            // InternalPascal.g:8655:4: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetAccess().getBracketsRightSquareBracketKeyword_2_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetAccess().getBracketsRightSquareBracketKeyword_2_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetAccess().getBracketsRightSquareBracketKeyword_2_0()); 
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
    // $ANTLR end "rule__Set__BracketsAssignment_2"


    // $ANTLR start "rule__Number__NumberAssignment"
    // InternalPascal.g:8666:1: rule__Number__NumberAssignment : ( ruleany_number ) ;
    public final void rule__Number__NumberAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8670:1: ( ( ruleany_number ) )
            // InternalPascal.g:8671:2: ( ruleany_number )
            {
            // InternalPascal.g:8671:2: ( ruleany_number )
            // InternalPascal.g:8672:3: ruleany_number
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberAccess().getNumberAny_numberParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleany_number();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberAccess().getNumberAny_numberParserRuleCall_0()); 
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
    // $ANTLR end "rule__Number__NumberAssignment"


    // $ANTLR start "rule__Label_declaration__LabelsAssignment_1"
    // InternalPascal.g:8681:1: rule__Label_declaration__LabelsAssignment_1 : ( rulelabel ) ;
    public final void rule__Label_declaration__LabelsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8685:1: ( ( rulelabel ) )
            // InternalPascal.g:8686:2: ( rulelabel )
            {
            // InternalPascal.g:8686:2: ( rulelabel )
            // InternalPascal.g:8687:3: rulelabel
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabel_declarationAccess().getLabelsLabelParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulelabel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLabel_declarationAccess().getLabelsLabelParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Label_declaration__LabelsAssignment_1"


    // $ANTLR start "rule__Label_declaration__LabelsAssignment_2_1"
    // InternalPascal.g:8696:1: rule__Label_declaration__LabelsAssignment_2_1 : ( rulelabel ) ;
    public final void rule__Label_declaration__LabelsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8700:1: ( ( rulelabel ) )
            // InternalPascal.g:8701:2: ( rulelabel )
            {
            // InternalPascal.g:8701:2: ( rulelabel )
            // InternalPascal.g:8702:3: rulelabel
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabel_declarationAccess().getLabelsLabelParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulelabel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLabel_declarationAccess().getLabelsLabelParserRuleCall_2_1_0()); 
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
    // $ANTLR end "rule__Label_declaration__LabelsAssignment_2_1"


    // $ANTLR start "rule__Constant__OpteratorAssignment_0_0"
    // InternalPascal.g:8711:1: rule__Constant__OpteratorAssignment_0_0 : ( RULE_ADDITION_OP ) ;
    public final void rule__Constant__OpteratorAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8715:1: ( ( RULE_ADDITION_OP ) )
            // InternalPascal.g:8716:2: ( RULE_ADDITION_OP )
            {
            // InternalPascal.g:8716:2: ( RULE_ADDITION_OP )
            // InternalPascal.g:8717:3: RULE_ADDITION_OP
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getOpteratorADDITION_OPTerminalRuleCall_0_0_0()); 
            }
            match(input,RULE_ADDITION_OP,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getOpteratorADDITION_OPTerminalRuleCall_0_0_0()); 
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
    // $ANTLR end "rule__Constant__OpteratorAssignment_0_0"


    // $ANTLR start "rule__Constant__NameAssignment_0_1_0"
    // InternalPascal.g:8726:1: rule__Constant__NameAssignment_0_1_0 : ( RULE_ID ) ;
    public final void rule__Constant__NameAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8730:1: ( ( RULE_ID ) )
            // InternalPascal.g:8731:2: ( RULE_ID )
            {
            // InternalPascal.g:8731:2: ( RULE_ID )
            // InternalPascal.g:8732:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_0_1_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_0_1_0_0()); 
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
    // $ANTLR end "rule__Constant__NameAssignment_0_1_0"


    // $ANTLR start "rule__Constant__NumberAssignment_0_1_1"
    // InternalPascal.g:8741:1: rule__Constant__NumberAssignment_0_1_1 : ( rulenumber ) ;
    public final void rule__Constant__NumberAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8745:1: ( ( rulenumber ) )
            // InternalPascal.g:8746:2: ( rulenumber )
            {
            // InternalPascal.g:8746:2: ( rulenumber )
            // InternalPascal.g:8747:3: rulenumber
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getNumberNumberParserRuleCall_0_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulenumber();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getNumberNumberParserRuleCall_0_1_1_0()); 
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
    // $ANTLR end "rule__Constant__NumberAssignment_0_1_1"


    // $ANTLR start "rule__Constant__StringAssignment_1"
    // InternalPascal.g:8756:1: rule__Constant__StringAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Constant__StringAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8760:1: ( ( RULE_STRING ) )
            // InternalPascal.g:8761:2: ( RULE_STRING )
            {
            // InternalPascal.g:8761:2: ( RULE_STRING )
            // InternalPascal.g:8762:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getStringSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getStringSTRINGTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Constant__StringAssignment_1"


    // $ANTLR start "rule__Constant__BoolLiteralAssignment_2"
    // InternalPascal.g:8771:1: rule__Constant__BoolLiteralAssignment_2 : ( ( 'true' ) ) ;
    public final void rule__Constant__BoolLiteralAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8775:1: ( ( ( 'true' ) ) )
            // InternalPascal.g:8776:2: ( ( 'true' ) )
            {
            // InternalPascal.g:8776:2: ( ( 'true' ) )
            // InternalPascal.g:8777:3: ( 'true' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getBoolLiteralTrueKeyword_2_0()); 
            }
            // InternalPascal.g:8778:3: ( 'true' )
            // InternalPascal.g:8779:4: 'true'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getBoolLiteralTrueKeyword_2_0()); 
            }
            match(input,52,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getBoolLiteralTrueKeyword_2_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getBoolLiteralTrueKeyword_2_0()); 
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
    // $ANTLR end "rule__Constant__BoolLiteralAssignment_2"


    // $ANTLR start "rule__Constant__BoolLiteralAssignment_3"
    // InternalPascal.g:8790:1: rule__Constant__BoolLiteralAssignment_3 : ( ( 'false' ) ) ;
    public final void rule__Constant__BoolLiteralAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8794:1: ( ( ( 'false' ) ) )
            // InternalPascal.g:8795:2: ( ( 'false' ) )
            {
            // InternalPascal.g:8795:2: ( ( 'false' ) )
            // InternalPascal.g:8796:3: ( 'false' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getBoolLiteralFalseKeyword_3_0()); 
            }
            // InternalPascal.g:8797:3: ( 'false' )
            // InternalPascal.g:8798:4: 'false'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getBoolLiteralFalseKeyword_3_0()); 
            }
            match(input,53,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getBoolLiteralFalseKeyword_3_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getBoolLiteralFalseKeyword_3_0()); 
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
    // $ANTLR end "rule__Constant__BoolLiteralAssignment_3"


    // $ANTLR start "rule__Constant_definition_part__ConstsAssignment_1_0"
    // InternalPascal.g:8809:1: rule__Constant_definition_part__ConstsAssignment_1_0 : ( ruleconstant_definition ) ;
    public final void rule__Constant_definition_part__ConstsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8813:1: ( ( ruleconstant_definition ) )
            // InternalPascal.g:8814:2: ( ruleconstant_definition )
            {
            // InternalPascal.g:8814:2: ( ruleconstant_definition )
            // InternalPascal.g:8815:3: ruleconstant_definition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstant_definition_partAccess().getConstsConstant_definitionParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleconstant_definition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstant_definition_partAccess().getConstsConstant_definitionParserRuleCall_1_0_0()); 
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
    // $ANTLR end "rule__Constant_definition_part__ConstsAssignment_1_0"


    // $ANTLR start "rule__Constant_definition__NameAssignment_0"
    // InternalPascal.g:8824:1: rule__Constant_definition__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Constant_definition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8828:1: ( ( RULE_ID ) )
            // InternalPascal.g:8829:2: ( RULE_ID )
            {
            // InternalPascal.g:8829:2: ( RULE_ID )
            // InternalPascal.g:8830:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstant_definitionAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstant_definitionAccess().getNameIDTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__Constant_definition__NameAssignment_0"


    // $ANTLR start "rule__Constant_definition__ConstAssignment_2"
    // InternalPascal.g:8839:1: rule__Constant_definition__ConstAssignment_2 : ( ruleconstant ) ;
    public final void rule__Constant_definition__ConstAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8843:1: ( ( ruleconstant ) )
            // InternalPascal.g:8844:2: ( ruleconstant )
            {
            // InternalPascal.g:8844:2: ( ruleconstant )
            // InternalPascal.g:8845:3: ruleconstant
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstant_definitionAccess().getConstConstantParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleconstant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstant_definitionAccess().getConstConstantParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Constant_definition__ConstAssignment_2"


    // $ANTLR start "rule__Type_definition_part__TypesAssignment_1_0"
    // InternalPascal.g:8854:1: rule__Type_definition_part__TypesAssignment_1_0 : ( ruletype_definition ) ;
    public final void rule__Type_definition_part__TypesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8858:1: ( ( ruletype_definition ) )
            // InternalPascal.g:8859:2: ( ruletype_definition )
            {
            // InternalPascal.g:8859:2: ( ruletype_definition )
            // InternalPascal.g:8860:3: ruletype_definition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_definition_partAccess().getTypesType_definitionParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruletype_definition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getType_definition_partAccess().getTypesType_definitionParserRuleCall_1_0_0()); 
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
    // $ANTLR end "rule__Type_definition_part__TypesAssignment_1_0"


    // $ANTLR start "rule__Type_definition__NameAssignment_0"
    // InternalPascal.g:8869:1: rule__Type_definition__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Type_definition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8873:1: ( ( RULE_ID ) )
            // InternalPascal.g:8874:2: ( RULE_ID )
            {
            // InternalPascal.g:8874:2: ( RULE_ID )
            // InternalPascal.g:8875:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_definitionAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getType_definitionAccess().getNameIDTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__Type_definition__NameAssignment_0"


    // $ANTLR start "rule__Type_definition__TypeAssignment_2"
    // InternalPascal.g:8884:1: rule__Type_definition__TypeAssignment_2 : ( ruletype ) ;
    public final void rule__Type_definition__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8888:1: ( ( ruletype ) )
            // InternalPascal.g:8889:2: ( ruletype )
            {
            // InternalPascal.g:8889:2: ( ruletype )
            // InternalPascal.g:8890:3: ruletype
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_definitionAccess().getTypeTypeParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruletype();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getType_definitionAccess().getTypeTypeParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Type_definition__TypeAssignment_2"


    // $ANTLR start "rule__Type__SimpleAssignment_0"
    // InternalPascal.g:8899:1: rule__Type__SimpleAssignment_0 : ( rulesimple_type ) ;
    public final void rule__Type__SimpleAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8903:1: ( ( rulesimple_type ) )
            // InternalPascal.g:8904:2: ( rulesimple_type )
            {
            // InternalPascal.g:8904:2: ( rulesimple_type )
            // InternalPascal.g:8905:3: rulesimple_type
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getSimpleSimple_typeParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            rulesimple_type();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getSimpleSimple_typeParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Type__SimpleAssignment_0"


    // $ANTLR start "rule__Type__StructuredAssignment_1"
    // InternalPascal.g:8914:1: rule__Type__StructuredAssignment_1 : ( rulestructured_type ) ;
    public final void rule__Type__StructuredAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8918:1: ( ( rulestructured_type ) )
            // InternalPascal.g:8919:2: ( rulestructured_type )
            {
            // InternalPascal.g:8919:2: ( rulestructured_type )
            // InternalPascal.g:8920:3: rulestructured_type
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getStructuredStructured_typeParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulestructured_type();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getStructuredStructured_typeParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Type__StructuredAssignment_1"


    // $ANTLR start "rule__Type__PointerAssignment_2"
    // InternalPascal.g:8929:1: rule__Type__PointerAssignment_2 : ( rulepointer_type ) ;
    public final void rule__Type__PointerAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8933:1: ( ( rulepointer_type ) )
            // InternalPascal.g:8934:2: ( rulepointer_type )
            {
            // InternalPascal.g:8934:2: ( rulepointer_type )
            // InternalPascal.g:8935:3: rulepointer_type
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getPointerPointer_typeParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            rulepointer_type();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getPointerPointer_typeParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Type__PointerAssignment_2"


    // $ANTLR start "rule__Simple_type__SubrangeAssignment_0"
    // InternalPascal.g:8944:1: rule__Simple_type__SubrangeAssignment_0 : ( rulesubrange_type ) ;
    public final void rule__Simple_type__SubrangeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8948:1: ( ( rulesubrange_type ) )
            // InternalPascal.g:8949:2: ( rulesubrange_type )
            {
            // InternalPascal.g:8949:2: ( rulesubrange_type )
            // InternalPascal.g:8950:3: rulesubrange_type
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimple_typeAccess().getSubrangeSubrange_typeParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            rulesubrange_type();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimple_typeAccess().getSubrangeSubrange_typeParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Simple_type__SubrangeAssignment_0"


    // $ANTLR start "rule__Simple_type__EnumeratedAssignment_1"
    // InternalPascal.g:8959:1: rule__Simple_type__EnumeratedAssignment_1 : ( ruleenumerated_type ) ;
    public final void rule__Simple_type__EnumeratedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8963:1: ( ( ruleenumerated_type ) )
            // InternalPascal.g:8964:2: ( ruleenumerated_type )
            {
            // InternalPascal.g:8964:2: ( ruleenumerated_type )
            // InternalPascal.g:8965:3: ruleenumerated_type
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimple_typeAccess().getEnumeratedEnumerated_typeParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleenumerated_type();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimple_typeAccess().getEnumeratedEnumerated_typeParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Simple_type__EnumeratedAssignment_1"


    // $ANTLR start "rule__Simple_type__NameAssignment_2"
    // InternalPascal.g:8974:1: rule__Simple_type__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Simple_type__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8978:1: ( ( RULE_ID ) )
            // InternalPascal.g:8979:2: ( RULE_ID )
            {
            // InternalPascal.g:8979:2: ( RULE_ID )
            // InternalPascal.g:8980:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimple_typeAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimple_typeAccess().getNameIDTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__Simple_type__NameAssignment_2"


    // $ANTLR start "rule__Subrange_type__InitialConstAssignment_0_0"
    // InternalPascal.g:8989:1: rule__Subrange_type__InitialConstAssignment_0_0 : ( ruleconstant ) ;
    public final void rule__Subrange_type__InitialConstAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8993:1: ( ( ruleconstant ) )
            // InternalPascal.g:8994:2: ( ruleconstant )
            {
            // InternalPascal.g:8994:2: ( ruleconstant )
            // InternalPascal.g:8995:3: ruleconstant
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubrange_typeAccess().getInitialConstConstantParserRuleCall_0_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleconstant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubrange_typeAccess().getInitialConstConstantParserRuleCall_0_0_0()); 
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
    // $ANTLR end "rule__Subrange_type__InitialConstAssignment_0_0"


    // $ANTLR start "rule__Subrange_type__FinalConstAssignment_0_2"
    // InternalPascal.g:9004:1: rule__Subrange_type__FinalConstAssignment_0_2 : ( ruleconstant ) ;
    public final void rule__Subrange_type__FinalConstAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9008:1: ( ( ruleconstant ) )
            // InternalPascal.g:9009:2: ( ruleconstant )
            {
            // InternalPascal.g:9009:2: ( ruleconstant )
            // InternalPascal.g:9010:3: ruleconstant
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubrange_typeAccess().getFinalConstConstantParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleconstant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubrange_typeAccess().getFinalConstConstantParserRuleCall_0_2_0()); 
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
    // $ANTLR end "rule__Subrange_type__FinalConstAssignment_0_2"


    // $ANTLR start "rule__Subrange_type__SubrangeAssignment_1_0"
    // InternalPascal.g:9019:1: rule__Subrange_type__SubrangeAssignment_1_0 : ( RULE_NUMERIC_SUBRANGE ) ;
    public final void rule__Subrange_type__SubrangeAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9023:1: ( ( RULE_NUMERIC_SUBRANGE ) )
            // InternalPascal.g:9024:2: ( RULE_NUMERIC_SUBRANGE )
            {
            // InternalPascal.g:9024:2: ( RULE_NUMERIC_SUBRANGE )
            // InternalPascal.g:9025:3: RULE_NUMERIC_SUBRANGE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubrange_typeAccess().getSubrangeNUMERIC_SUBRANGETerminalRuleCall_1_0_0()); 
            }
            match(input,RULE_NUMERIC_SUBRANGE,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubrange_typeAccess().getSubrangeNUMERIC_SUBRANGETerminalRuleCall_1_0_0()); 
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
    // $ANTLR end "rule__Subrange_type__SubrangeAssignment_1_0"


    // $ANTLR start "rule__Subrange_type__ConstAssignment_1_1"
    // InternalPascal.g:9034:1: rule__Subrange_type__ConstAssignment_1_1 : ( ruleconstant ) ;
    public final void rule__Subrange_type__ConstAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9038:1: ( ( ruleconstant ) )
            // InternalPascal.g:9039:2: ( ruleconstant )
            {
            // InternalPascal.g:9039:2: ( ruleconstant )
            // InternalPascal.g:9040:3: ruleconstant
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubrange_typeAccess().getConstConstantParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleconstant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubrange_typeAccess().getConstConstantParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__Subrange_type__ConstAssignment_1_1"


    // $ANTLR start "rule__Enumerated_type__IdentifiersAssignment_1"
    // InternalPascal.g:9049:1: rule__Enumerated_type__IdentifiersAssignment_1 : ( ruleidentifier_list ) ;
    public final void rule__Enumerated_type__IdentifiersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9053:1: ( ( ruleidentifier_list ) )
            // InternalPascal.g:9054:2: ( ruleidentifier_list )
            {
            // InternalPascal.g:9054:2: ( ruleidentifier_list )
            // InternalPascal.g:9055:3: ruleidentifier_list
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerated_typeAccess().getIdentifiersIdentifier_listParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleidentifier_list();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerated_typeAccess().getIdentifiersIdentifier_listParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Enumerated_type__IdentifiersAssignment_1"


    // $ANTLR start "rule__Structured_type__PackedAssignment_0"
    // InternalPascal.g:9064:1: rule__Structured_type__PackedAssignment_0 : ( ( 'packed' ) ) ;
    public final void rule__Structured_type__PackedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9068:1: ( ( ( 'packed' ) ) )
            // InternalPascal.g:9069:2: ( ( 'packed' ) )
            {
            // InternalPascal.g:9069:2: ( ( 'packed' ) )
            // InternalPascal.g:9070:3: ( 'packed' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStructured_typeAccess().getPackedPackedKeyword_0_0()); 
            }
            // InternalPascal.g:9071:3: ( 'packed' )
            // InternalPascal.g:9072:4: 'packed'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStructured_typeAccess().getPackedPackedKeyword_0_0()); 
            }
            match(input,54,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStructured_typeAccess().getPackedPackedKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStructured_typeAccess().getPackedPackedKeyword_0_0()); 
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
    // $ANTLR end "rule__Structured_type__PackedAssignment_0"


    // $ANTLR start "rule__Structured_type__TypeAssignment_1"
    // InternalPascal.g:9083:1: rule__Structured_type__TypeAssignment_1 : ( ruleunpacked_structured_type ) ;
    public final void rule__Structured_type__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9087:1: ( ( ruleunpacked_structured_type ) )
            // InternalPascal.g:9088:2: ( ruleunpacked_structured_type )
            {
            // InternalPascal.g:9088:2: ( ruleunpacked_structured_type )
            // InternalPascal.g:9089:3: ruleunpacked_structured_type
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStructured_typeAccess().getTypeUnpacked_structured_typeParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleunpacked_structured_type();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStructured_typeAccess().getTypeUnpacked_structured_typeParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Structured_type__TypeAssignment_1"


    // $ANTLR start "rule__Unpacked_structured_type__RecordAssignment"
    // InternalPascal.g:9098:1: rule__Unpacked_structured_type__RecordAssignment : ( rulerecord_type ) ;
    public final void rule__Unpacked_structured_type__RecordAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9102:1: ( ( rulerecord_type ) )
            // InternalPascal.g:9103:2: ( rulerecord_type )
            {
            // InternalPascal.g:9103:2: ( rulerecord_type )
            // InternalPascal.g:9104:3: rulerecord_type
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnpacked_structured_typeAccess().getRecordRecord_typeParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            rulerecord_type();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnpacked_structured_typeAccess().getRecordRecord_typeParserRuleCall_0()); 
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
    // $ANTLR end "rule__Unpacked_structured_type__RecordAssignment"


    // $ANTLR start "rule__Record_type__RecordKeywordAssignment_0"
    // InternalPascal.g:9113:1: rule__Record_type__RecordKeywordAssignment_0 : ( ( 'record' ) ) ;
    public final void rule__Record_type__RecordKeywordAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9117:1: ( ( ( 'record' ) ) )
            // InternalPascal.g:9118:2: ( ( 'record' ) )
            {
            // InternalPascal.g:9118:2: ( ( 'record' ) )
            // InternalPascal.g:9119:3: ( 'record' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecord_typeAccess().getRecordKeywordRecordKeyword_0_0()); 
            }
            // InternalPascal.g:9120:3: ( 'record' )
            // InternalPascal.g:9121:4: 'record'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecord_typeAccess().getRecordKeywordRecordKeyword_0_0()); 
            }
            match(input,55,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecord_typeAccess().getRecordKeywordRecordKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecord_typeAccess().getRecordKeywordRecordKeyword_0_0()); 
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
    // $ANTLR end "rule__Record_type__RecordKeywordAssignment_0"


    // $ANTLR start "rule__Record_type__FieldsAssignment_1"
    // InternalPascal.g:9132:1: rule__Record_type__FieldsAssignment_1 : ( rulefield_list ) ;
    public final void rule__Record_type__FieldsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9136:1: ( ( rulefield_list ) )
            // InternalPascal.g:9137:2: ( rulefield_list )
            {
            // InternalPascal.g:9137:2: ( rulefield_list )
            // InternalPascal.g:9138:3: rulefield_list
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecord_typeAccess().getFieldsField_listParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulefield_list();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecord_typeAccess().getFieldsField_listParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Record_type__FieldsAssignment_1"


    // $ANTLR start "rule__Record_type__EndKeywordAssignment_2"
    // InternalPascal.g:9147:1: rule__Record_type__EndKeywordAssignment_2 : ( ( 'end' ) ) ;
    public final void rule__Record_type__EndKeywordAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9151:1: ( ( ( 'end' ) ) )
            // InternalPascal.g:9152:2: ( ( 'end' ) )
            {
            // InternalPascal.g:9152:2: ( ( 'end' ) )
            // InternalPascal.g:9153:3: ( 'end' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecord_typeAccess().getEndKeywordEndKeyword_2_0()); 
            }
            // InternalPascal.g:9154:3: ( 'end' )
            // InternalPascal.g:9155:4: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecord_typeAccess().getEndKeywordEndKeyword_2_0()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecord_typeAccess().getEndKeywordEndKeyword_2_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecord_typeAccess().getEndKeywordEndKeyword_2_0()); 
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
    // $ANTLR end "rule__Record_type__EndKeywordAssignment_2"


    // $ANTLR start "rule__Field_list__FixedAssignment_0_0_0"
    // InternalPascal.g:9166:1: rule__Field_list__FixedAssignment_0_0_0 : ( rulefixed_part ) ;
    public final void rule__Field_list__FixedAssignment_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9170:1: ( ( rulefixed_part ) )
            // InternalPascal.g:9171:2: ( rulefixed_part )
            {
            // InternalPascal.g:9171:2: ( rulefixed_part )
            // InternalPascal.g:9172:3: rulefixed_part
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_listAccess().getFixedFixed_partParserRuleCall_0_0_0_0()); 
            }
            pushFollow(FOLLOW_2);
            rulefixed_part();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getField_listAccess().getFixedFixed_partParserRuleCall_0_0_0_0()); 
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
    // $ANTLR end "rule__Field_list__FixedAssignment_0_0_0"


    // $ANTLR start "rule__Field_list__VariantsAssignment_0_0_1_1"
    // InternalPascal.g:9181:1: rule__Field_list__VariantsAssignment_0_0_1_1 : ( rulevariant_part ) ;
    public final void rule__Field_list__VariantsAssignment_0_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9185:1: ( ( rulevariant_part ) )
            // InternalPascal.g:9186:2: ( rulevariant_part )
            {
            // InternalPascal.g:9186:2: ( rulevariant_part )
            // InternalPascal.g:9187:3: rulevariant_part
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_listAccess().getVariantsVariant_partParserRuleCall_0_0_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulevariant_part();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getField_listAccess().getVariantsVariant_partParserRuleCall_0_0_1_1_0()); 
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
    // $ANTLR end "rule__Field_list__VariantsAssignment_0_0_1_1"


    // $ANTLR start "rule__Field_list__VariantsAssignment_0_1"
    // InternalPascal.g:9196:1: rule__Field_list__VariantsAssignment_0_1 : ( rulevariant_part ) ;
    public final void rule__Field_list__VariantsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9200:1: ( ( rulevariant_part ) )
            // InternalPascal.g:9201:2: ( rulevariant_part )
            {
            // InternalPascal.g:9201:2: ( rulevariant_part )
            // InternalPascal.g:9202:3: rulevariant_part
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_listAccess().getVariantsVariant_partParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulevariant_part();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getField_listAccess().getVariantsVariant_partParserRuleCall_0_1_0()); 
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
    // $ANTLR end "rule__Field_list__VariantsAssignment_0_1"


    // $ANTLR start "rule__Fixed_part__SectionsAssignment_0"
    // InternalPascal.g:9211:1: rule__Fixed_part__SectionsAssignment_0 : ( rulerecord_section ) ;
    public final void rule__Fixed_part__SectionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9215:1: ( ( rulerecord_section ) )
            // InternalPascal.g:9216:2: ( rulerecord_section )
            {
            // InternalPascal.g:9216:2: ( rulerecord_section )
            // InternalPascal.g:9217:3: rulerecord_section
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFixed_partAccess().getSectionsRecord_sectionParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            rulerecord_section();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFixed_partAccess().getSectionsRecord_sectionParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Fixed_part__SectionsAssignment_0"


    // $ANTLR start "rule__Fixed_part__SectionsAssignment_1_1"
    // InternalPascal.g:9226:1: rule__Fixed_part__SectionsAssignment_1_1 : ( rulerecord_section ) ;
    public final void rule__Fixed_part__SectionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9230:1: ( ( rulerecord_section ) )
            // InternalPascal.g:9231:2: ( rulerecord_section )
            {
            // InternalPascal.g:9231:2: ( rulerecord_section )
            // InternalPascal.g:9232:3: rulerecord_section
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFixed_partAccess().getSectionsRecord_sectionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulerecord_section();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFixed_partAccess().getSectionsRecord_sectionParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__Fixed_part__SectionsAssignment_1_1"


    // $ANTLR start "rule__Record_section__IdentifiersAssignment_0"
    // InternalPascal.g:9241:1: rule__Record_section__IdentifiersAssignment_0 : ( ruleidentifier_list ) ;
    public final void rule__Record_section__IdentifiersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9245:1: ( ( ruleidentifier_list ) )
            // InternalPascal.g:9246:2: ( ruleidentifier_list )
            {
            // InternalPascal.g:9246:2: ( ruleidentifier_list )
            // InternalPascal.g:9247:3: ruleidentifier_list
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecord_sectionAccess().getIdentifiersIdentifier_listParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleidentifier_list();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecord_sectionAccess().getIdentifiersIdentifier_listParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Record_section__IdentifiersAssignment_0"


    // $ANTLR start "rule__Record_section__TypeAssignment_2"
    // InternalPascal.g:9256:1: rule__Record_section__TypeAssignment_2 : ( ruletype ) ;
    public final void rule__Record_section__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9260:1: ( ( ruletype ) )
            // InternalPascal.g:9261:2: ( ruletype )
            {
            // InternalPascal.g:9261:2: ( ruletype )
            // InternalPascal.g:9262:3: ruletype
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecord_sectionAccess().getTypeTypeParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruletype();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecord_sectionAccess().getTypeTypeParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Record_section__TypeAssignment_2"


    // $ANTLR start "rule__Variant_part__TagAssignment_1"
    // InternalPascal.g:9271:1: rule__Variant_part__TagAssignment_1 : ( ruletag_field ) ;
    public final void rule__Variant_part__TagAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9275:1: ( ( ruletag_field ) )
            // InternalPascal.g:9276:2: ( ruletag_field )
            {
            // InternalPascal.g:9276:2: ( ruletag_field )
            // InternalPascal.g:9277:3: ruletag_field
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariant_partAccess().getTagTag_fieldParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruletag_field();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariant_partAccess().getTagTag_fieldParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Variant_part__TagAssignment_1"


    // $ANTLR start "rule__Variant_part__NameAssignment_2"
    // InternalPascal.g:9286:1: rule__Variant_part__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Variant_part__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9290:1: ( ( RULE_ID ) )
            // InternalPascal.g:9291:2: ( RULE_ID )
            {
            // InternalPascal.g:9291:2: ( RULE_ID )
            // InternalPascal.g:9292:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariant_partAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariant_partAccess().getNameIDTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__Variant_part__NameAssignment_2"


    // $ANTLR start "rule__Variant_part__VariantsAssignment_4"
    // InternalPascal.g:9301:1: rule__Variant_part__VariantsAssignment_4 : ( rulevariant ) ;
    public final void rule__Variant_part__VariantsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9305:1: ( ( rulevariant ) )
            // InternalPascal.g:9306:2: ( rulevariant )
            {
            // InternalPascal.g:9306:2: ( rulevariant )
            // InternalPascal.g:9307:3: rulevariant
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariant_partAccess().getVariantsVariantParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            rulevariant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariant_partAccess().getVariantsVariantParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__Variant_part__VariantsAssignment_4"


    // $ANTLR start "rule__Variant_part__VariantsAssignment_5_1"
    // InternalPascal.g:9316:1: rule__Variant_part__VariantsAssignment_5_1 : ( rulevariant ) ;
    public final void rule__Variant_part__VariantsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9320:1: ( ( rulevariant ) )
            // InternalPascal.g:9321:2: ( rulevariant )
            {
            // InternalPascal.g:9321:2: ( rulevariant )
            // InternalPascal.g:9322:3: rulevariant
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariant_partAccess().getVariantsVariantParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulevariant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariant_partAccess().getVariantsVariantParserRuleCall_5_1_0()); 
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
    // $ANTLR end "rule__Variant_part__VariantsAssignment_5_1"


    // $ANTLR start "rule__Tag_field__NameAssignment_0"
    // InternalPascal.g:9331:1: rule__Tag_field__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Tag_field__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9335:1: ( ( RULE_ID ) )
            // InternalPascal.g:9336:2: ( RULE_ID )
            {
            // InternalPascal.g:9336:2: ( RULE_ID )
            // InternalPascal.g:9337:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTag_fieldAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTag_fieldAccess().getNameIDTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__Tag_field__NameAssignment_0"


    // $ANTLR start "rule__Variant__LabelsAssignment_0"
    // InternalPascal.g:9346:1: rule__Variant__LabelsAssignment_0 : ( rulecase_label_list ) ;
    public final void rule__Variant__LabelsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9350:1: ( ( rulecase_label_list ) )
            // InternalPascal.g:9351:2: ( rulecase_label_list )
            {
            // InternalPascal.g:9351:2: ( rulecase_label_list )
            // InternalPascal.g:9352:3: rulecase_label_list
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariantAccess().getLabelsCase_label_listParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            rulecase_label_list();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariantAccess().getLabelsCase_label_listParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Variant__LabelsAssignment_0"


    // $ANTLR start "rule__Variant__FieldsAssignment_3"
    // InternalPascal.g:9361:1: rule__Variant__FieldsAssignment_3 : ( rulefield_list ) ;
    public final void rule__Variant__FieldsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9365:1: ( ( rulefield_list ) )
            // InternalPascal.g:9366:2: ( rulefield_list )
            {
            // InternalPascal.g:9366:2: ( rulefield_list )
            // InternalPascal.g:9367:3: rulefield_list
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariantAccess().getFieldsField_listParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            rulefield_list();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariantAccess().getFieldsField_listParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__Variant__FieldsAssignment_3"


    // $ANTLR start "rule__Case_label_list__ConstantsAssignment_0"
    // InternalPascal.g:9376:1: rule__Case_label_list__ConstantsAssignment_0 : ( ruleconstant ) ;
    public final void rule__Case_label_list__ConstantsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9380:1: ( ( ruleconstant ) )
            // InternalPascal.g:9381:2: ( ruleconstant )
            {
            // InternalPascal.g:9381:2: ( ruleconstant )
            // InternalPascal.g:9382:3: ruleconstant
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCase_label_listAccess().getConstantsConstantParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleconstant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCase_label_listAccess().getConstantsConstantParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Case_label_list__ConstantsAssignment_0"


    // $ANTLR start "rule__Case_label_list__ConstantsAssignment_1_1"
    // InternalPascal.g:9391:1: rule__Case_label_list__ConstantsAssignment_1_1 : ( ruleconstant ) ;
    public final void rule__Case_label_list__ConstantsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9395:1: ( ( ruleconstant ) )
            // InternalPascal.g:9396:2: ( ruleconstant )
            {
            // InternalPascal.g:9396:2: ( ruleconstant )
            // InternalPascal.g:9397:3: ruleconstant
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCase_label_listAccess().getConstantsConstantParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleconstant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCase_label_listAccess().getConstantsConstantParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__Case_label_list__ConstantsAssignment_1_1"


    // $ANTLR start "rule__Pointer_type__TypeAssignment_1"
    // InternalPascal.g:9406:1: rule__Pointer_type__TypeAssignment_1 : ( ruletype ) ;
    public final void rule__Pointer_type__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9410:1: ( ( ruletype ) )
            // InternalPascal.g:9411:2: ( ruletype )
            {
            // InternalPascal.g:9411:2: ( ruletype )
            // InternalPascal.g:9412:3: ruletype
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointer_typeAccess().getTypeTypeParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruletype();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPointer_typeAccess().getTypeTypeParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Pointer_type__TypeAssignment_1"


    // $ANTLR start "rule__Signed_number__IntegerAssignment_0"
    // InternalPascal.g:9421:1: rule__Signed_number__IntegerAssignment_0 : ( RULE_SIGNED_INTEGER_NUMBER ) ;
    public final void rule__Signed_number__IntegerAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9425:1: ( ( RULE_SIGNED_INTEGER_NUMBER ) )
            // InternalPascal.g:9426:2: ( RULE_SIGNED_INTEGER_NUMBER )
            {
            // InternalPascal.g:9426:2: ( RULE_SIGNED_INTEGER_NUMBER )
            // InternalPascal.g:9427:3: RULE_SIGNED_INTEGER_NUMBER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSigned_numberAccess().getIntegerSIGNED_INTEGER_NUMBERTerminalRuleCall_0_0()); 
            }
            match(input,RULE_SIGNED_INTEGER_NUMBER,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSigned_numberAccess().getIntegerSIGNED_INTEGER_NUMBERTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__Signed_number__IntegerAssignment_0"


    // $ANTLR start "rule__Signed_number__RealAssignment_1"
    // InternalPascal.g:9436:1: rule__Signed_number__RealAssignment_1 : ( RULE_SIGNED_REAL_NUMBER ) ;
    public final void rule__Signed_number__RealAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9440:1: ( ( RULE_SIGNED_REAL_NUMBER ) )
            // InternalPascal.g:9441:2: ( RULE_SIGNED_REAL_NUMBER )
            {
            // InternalPascal.g:9441:2: ( RULE_SIGNED_REAL_NUMBER )
            // InternalPascal.g:9442:3: RULE_SIGNED_REAL_NUMBER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSigned_numberAccess().getRealSIGNED_REAL_NUMBERTerminalRuleCall_1_0()); 
            }
            match(input,RULE_SIGNED_REAL_NUMBER,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSigned_numberAccess().getRealSIGNED_REAL_NUMBERTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Signed_number__RealAssignment_1"


    // $ANTLR start "rule__Unsigned_number__IntegerAssignment_0"
    // InternalPascal.g:9451:1: rule__Unsigned_number__IntegerAssignment_0 : ( RULE_INTEGER_NUMBER ) ;
    public final void rule__Unsigned_number__IntegerAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9455:1: ( ( RULE_INTEGER_NUMBER ) )
            // InternalPascal.g:9456:2: ( RULE_INTEGER_NUMBER )
            {
            // InternalPascal.g:9456:2: ( RULE_INTEGER_NUMBER )
            // InternalPascal.g:9457:3: RULE_INTEGER_NUMBER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnsigned_numberAccess().getIntegerINTEGER_NUMBERTerminalRuleCall_0_0()); 
            }
            match(input,RULE_INTEGER_NUMBER,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnsigned_numberAccess().getIntegerINTEGER_NUMBERTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__Unsigned_number__IntegerAssignment_0"


    // $ANTLR start "rule__Unsigned_number__RealAssignment_1"
    // InternalPascal.g:9466:1: rule__Unsigned_number__RealAssignment_1 : ( RULE_REAL_NUMBER ) ;
    public final void rule__Unsigned_number__RealAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9470:1: ( ( RULE_REAL_NUMBER ) )
            // InternalPascal.g:9471:2: ( RULE_REAL_NUMBER )
            {
            // InternalPascal.g:9471:2: ( RULE_REAL_NUMBER )
            // InternalPascal.g:9472:3: RULE_REAL_NUMBER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnsigned_numberAccess().getRealREAL_NUMBERTerminalRuleCall_1_0()); 
            }
            match(input,RULE_REAL_NUMBER,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnsigned_numberAccess().getRealREAL_NUMBERTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Unsigned_number__RealAssignment_1"


    // $ANTLR start "rule__Variable_declaration_part__SectionsAssignment_1"
    // InternalPascal.g:9481:1: rule__Variable_declaration_part__SectionsAssignment_1 : ( rulevariable_section ) ;
    public final void rule__Variable_declaration_part__SectionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9485:1: ( ( rulevariable_section ) )
            // InternalPascal.g:9486:2: ( rulevariable_section )
            {
            // InternalPascal.g:9486:2: ( rulevariable_section )
            // InternalPascal.g:9487:3: rulevariable_section
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declaration_partAccess().getSectionsVariable_sectionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulevariable_section();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_declaration_partAccess().getSectionsVariable_sectionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Variable_declaration_part__SectionsAssignment_1"


    // $ANTLR start "rule__Variable_declaration_part__SectionsAssignment_3_0"
    // InternalPascal.g:9496:1: rule__Variable_declaration_part__SectionsAssignment_3_0 : ( rulevariable_section ) ;
    public final void rule__Variable_declaration_part__SectionsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9500:1: ( ( rulevariable_section ) )
            // InternalPascal.g:9501:2: ( rulevariable_section )
            {
            // InternalPascal.g:9501:2: ( rulevariable_section )
            // InternalPascal.g:9502:3: rulevariable_section
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declaration_partAccess().getSectionsVariable_sectionParserRuleCall_3_0_0()); 
            }
            pushFollow(FOLLOW_2);
            rulevariable_section();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_declaration_partAccess().getSectionsVariable_sectionParserRuleCall_3_0_0()); 
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
    // $ANTLR end "rule__Variable_declaration_part__SectionsAssignment_3_0"


    // $ANTLR start "rule__Variable_section__IdentifiersAssignment_0"
    // InternalPascal.g:9511:1: rule__Variable_section__IdentifiersAssignment_0 : ( rulevariable_identifier_list ) ;
    public final void rule__Variable_section__IdentifiersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9515:1: ( ( rulevariable_identifier_list ) )
            // InternalPascal.g:9516:2: ( rulevariable_identifier_list )
            {
            // InternalPascal.g:9516:2: ( rulevariable_identifier_list )
            // InternalPascal.g:9517:3: rulevariable_identifier_list
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_sectionAccess().getIdentifiersVariable_identifier_listParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            rulevariable_identifier_list();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_sectionAccess().getIdentifiersVariable_identifier_listParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Variable_section__IdentifiersAssignment_0"


    // $ANTLR start "rule__Variable_section__TypeAssignment_2"
    // InternalPascal.g:9526:1: rule__Variable_section__TypeAssignment_2 : ( ruletype ) ;
    public final void rule__Variable_section__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9530:1: ( ( ruletype ) )
            // InternalPascal.g:9531:2: ( ruletype )
            {
            // InternalPascal.g:9531:2: ( ruletype )
            // InternalPascal.g:9532:3: ruletype
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_sectionAccess().getTypeTypeParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruletype();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_sectionAccess().getTypeTypeParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Variable_section__TypeAssignment_2"


    // $ANTLR start "rule__Variable_identifier_list__NamesAssignment_0"
    // InternalPascal.g:9541:1: rule__Variable_identifier_list__NamesAssignment_0 : ( RULE_ID ) ;
    public final void rule__Variable_identifier_list__NamesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9545:1: ( ( RULE_ID ) )
            // InternalPascal.g:9546:2: ( RULE_ID )
            {
            // InternalPascal.g:9546:2: ( RULE_ID )
            // InternalPascal.g:9547:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_identifier_listAccess().getNamesIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_identifier_listAccess().getNamesIDTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__Variable_identifier_list__NamesAssignment_0"


    // $ANTLR start "rule__Variable_identifier_list__NamesAssignment_1_1"
    // InternalPascal.g:9556:1: rule__Variable_identifier_list__NamesAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Variable_identifier_list__NamesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9560:1: ( ( RULE_ID ) )
            // InternalPascal.g:9561:2: ( RULE_ID )
            {
            // InternalPascal.g:9561:2: ( RULE_ID )
            // InternalPascal.g:9562:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_identifier_listAccess().getNamesIDTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariable_identifier_listAccess().getNamesIDTerminalRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__Variable_identifier_list__NamesAssignment_1_1"


    // $ANTLR start "rule__While_statement__ExpressionAssignment_1"
    // InternalPascal.g:9571:1: rule__While_statement__ExpressionAssignment_1 : ( ruleexpression ) ;
    public final void rule__While_statement__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9575:1: ( ( ruleexpression ) )
            // InternalPascal.g:9576:2: ( ruleexpression )
            {
            // InternalPascal.g:9576:2: ( ruleexpression )
            // InternalPascal.g:9577:3: ruleexpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhile_statementAccess().getExpressionExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleexpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhile_statementAccess().getExpressionExpressionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__While_statement__ExpressionAssignment_1"


    // $ANTLR start "rule__While_statement__StatementAssignment_3"
    // InternalPascal.g:9586:1: rule__While_statement__StatementAssignment_3 : ( rulestatement_sequence ) ;
    public final void rule__While_statement__StatementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9590:1: ( ( rulestatement_sequence ) )
            // InternalPascal.g:9591:2: ( rulestatement_sequence )
            {
            // InternalPascal.g:9591:2: ( rulestatement_sequence )
            // InternalPascal.g:9592:3: rulestatement_sequence
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhile_statementAccess().getStatementStatement_sequenceParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            rulestatement_sequence();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhile_statementAccess().getStatementStatement_sequenceParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__While_statement__StatementAssignment_3"

    // $ANTLR start synpred49_InternalPascal
    public final void synpred49_InternalPascal_fragment() throws RecognitionException {   
        // InternalPascal.g:2598:3: ( rule__Statement_sequence__Group_1__0 )
        // InternalPascal.g:2598:3: rule__Statement_sequence__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__Statement_sequence__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred49_InternalPascal

    // Delegated rules

    public final boolean synpred49_InternalPascal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred49_InternalPascal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\uffff\1\13\12\uffff";
    static final String dfa_3s = "\1\4\1\6\12\uffff";
    static final String dfa_4s = "\1\65\1\62\12\uffff";
    static final String dfa_5s = "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\11\1\12\1\10\1\1";
    static final String dfa_6s = "\14\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\2\2\3\uffff\1\3\1\uffff\2\2\15\uffff\1\4\3\uffff\1\10\1\uffff\1\11\21\uffff\1\5\1\6\1\7",
            "\4\13\3\uffff\1\13\6\uffff\1\13\1\uffff\1\13\1\uffff\1\13\2\uffff\4\13\1\12\1\13\6\uffff\1\13\5\uffff\6\13",
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

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1812:1: rule__Factor__Alternatives : ( ( ( rule__Factor__VariableAssignment_0 ) ) | ( ( rule__Factor__NumberAssignment_1 ) ) | ( ( rule__Factor__StringAssignment_2 ) ) | ( ( rule__Factor__SetAssignment_3 ) ) | ( ( rule__Factor__NilAssignment_4 ) ) | ( ( rule__Factor__BooleanAssignment_5 ) ) | ( ( rule__Factor__BooleanAssignment_6 ) ) | ( ( rule__Factor__FunctionAssignment_7 ) ) | ( ( rule__Factor__Group_8__0 ) ) | ( ( rule__Factor__Group_9__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000001400000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000017C00800000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000100000800070L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0038000288003570L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000028100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000408000000080L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000800000002140L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000800000002142L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0007000000000200L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0007000000000202L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0038000388003570L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000082000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001C00000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100400000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0038000298003570L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000040400000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000003070L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0030000000003570L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00F00000A0003D70L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x00C0000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000040001000010L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000040000000010L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000040100000010L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000200000000000L});

}