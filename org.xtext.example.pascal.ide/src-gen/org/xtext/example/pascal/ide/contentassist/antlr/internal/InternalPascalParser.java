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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_SIGNED_INTEGER_NUMBER", "RULE_INTEGER_NUMBER", "RULE_RELATIONAL_OP", "RULE_ADDITION_OP", "RULE_MULTIPLICATION_OP", "RULE_STRING", "RULE_NUMERIC_SUBRANGE", "RULE_SIGNED_REAL_NUMBER", "RULE_REAL_NUMBER", "RULE_PARENTHESES_COMMENT", "RULE_CURLY_BRACKETS_COMMENT", "RULE_DIGIT_SEQUENCE", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'program'", "';'", "'begin'", "'end'", "':'", "':='", "'['", "']'", "'^'", "','", "'('", "')'", "'not'", "'procedure'", "'var'", "'label'", "'const'", "'='", "'type'", "'..'", "'case'", "'of'", "'in'", "'or'", "'div'", "'mod'", "'and'", "'nil'", "'true'", "'false'", "'packed'", "'record'"
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


    // $ANTLR start "entryRuleassignment_statement"
    // InternalPascal.g:254:1: entryRuleassignment_statement : ruleassignment_statement EOF ;
    public final void entryRuleassignment_statement() throws RecognitionException {
        try {
            // InternalPascal.g:255:1: ( ruleassignment_statement EOF )
            // InternalPascal.g:256:1: ruleassignment_statement EOF
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
    // InternalPascal.g:263:1: ruleassignment_statement : ( ( rule__Assignment_statement__Group__0 ) ) ;
    public final void ruleassignment_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:267:2: ( ( ( rule__Assignment_statement__Group__0 ) ) )
            // InternalPascal.g:268:2: ( ( rule__Assignment_statement__Group__0 ) )
            {
            // InternalPascal.g:268:2: ( ( rule__Assignment_statement__Group__0 ) )
            // InternalPascal.g:269:3: ( rule__Assignment_statement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignment_statementAccess().getGroup()); 
            }
            // InternalPascal.g:270:3: ( rule__Assignment_statement__Group__0 )
            // InternalPascal.g:270:4: rule__Assignment_statement__Group__0
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
    // InternalPascal.g:279:1: entryRulelabel : rulelabel EOF ;
    public final void entryRulelabel() throws RecognitionException {
        try {
            // InternalPascal.g:280:1: ( rulelabel EOF )
            // InternalPascal.g:281:1: rulelabel EOF
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
    // InternalPascal.g:288:1: rulelabel : ( ( rule__Label__Alternatives ) ) ;
    public final void rulelabel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:292:2: ( ( ( rule__Label__Alternatives ) ) )
            // InternalPascal.g:293:2: ( ( rule__Label__Alternatives ) )
            {
            // InternalPascal.g:293:2: ( ( rule__Label__Alternatives ) )
            // InternalPascal.g:294:3: ( rule__Label__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabelAccess().getAlternatives()); 
            }
            // InternalPascal.g:295:3: ( rule__Label__Alternatives )
            // InternalPascal.g:295:4: rule__Label__Alternatives
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
    // InternalPascal.g:304:1: entryRulevariable : rulevariable EOF ;
    public final void entryRulevariable() throws RecognitionException {
        try {
            // InternalPascal.g:305:1: ( rulevariable EOF )
            // InternalPascal.g:306:1: rulevariable EOF
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
    // InternalPascal.g:313:1: rulevariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void rulevariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:317:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalPascal.g:318:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalPascal.g:318:2: ( ( rule__Variable__Group__0 ) )
            // InternalPascal.g:319:3: ( rule__Variable__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getGroup()); 
            }
            // InternalPascal.g:320:3: ( rule__Variable__Group__0 )
            // InternalPascal.g:320:4: rule__Variable__Group__0
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
    // InternalPascal.g:329:1: entryRulevar_ : rulevar_ EOF ;
    public final void entryRulevar_() throws RecognitionException {
        try {
            // InternalPascal.g:330:1: ( rulevar_ EOF )
            // InternalPascal.g:331:1: rulevar_ EOF
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
    // InternalPascal.g:338:1: rulevar_ : ( ( rule__Var___Alternatives )? ) ;
    public final void rulevar_() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:342:2: ( ( ( rule__Var___Alternatives )? ) )
            // InternalPascal.g:343:2: ( ( rule__Var___Alternatives )? )
            {
            // InternalPascal.g:343:2: ( ( rule__Var___Alternatives )? )
            // InternalPascal.g:344:3: ( rule__Var___Alternatives )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_Access().getAlternatives()); 
            }
            // InternalPascal.g:345:3: ( rule__Var___Alternatives )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==22||LA2_0==29||LA2_0==31) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalPascal.g:345:4: rule__Var___Alternatives
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
    // InternalPascal.g:354:1: entryRuleexpression_list : ruleexpression_list EOF ;
    public final void entryRuleexpression_list() throws RecognitionException {
        try {
            // InternalPascal.g:355:1: ( ruleexpression_list EOF )
            // InternalPascal.g:356:1: ruleexpression_list EOF
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
    // InternalPascal.g:363:1: ruleexpression_list : ( ( rule__Expression_list__Group__0 ) ) ;
    public final void ruleexpression_list() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:367:2: ( ( ( rule__Expression_list__Group__0 ) ) )
            // InternalPascal.g:368:2: ( ( rule__Expression_list__Group__0 ) )
            {
            // InternalPascal.g:368:2: ( ( rule__Expression_list__Group__0 ) )
            // InternalPascal.g:369:3: ( rule__Expression_list__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression_listAccess().getGroup()); 
            }
            // InternalPascal.g:370:3: ( rule__Expression_list__Group__0 )
            // InternalPascal.g:370:4: rule__Expression_list__Group__0
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
    // InternalPascal.g:379:1: entryRuleexpression : ruleexpression EOF ;
    public final void entryRuleexpression() throws RecognitionException {
        try {
            // InternalPascal.g:380:1: ( ruleexpression EOF )
            // InternalPascal.g:381:1: ruleexpression EOF
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
    // InternalPascal.g:388:1: ruleexpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleexpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:392:2: ( ( ( rule__Expression__Group__0 ) ) )
            // InternalPascal.g:393:2: ( ( rule__Expression__Group__0 ) )
            {
            // InternalPascal.g:393:2: ( ( rule__Expression__Group__0 ) )
            // InternalPascal.g:394:3: ( rule__Expression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getGroup()); 
            }
            // InternalPascal.g:395:3: ( rule__Expression__Group__0 )
            // InternalPascal.g:395:4: rule__Expression__Group__0
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
    // InternalPascal.g:404:1: entryRulesimple_expression : rulesimple_expression EOF ;
    public final void entryRulesimple_expression() throws RecognitionException {
        try {
            // InternalPascal.g:405:1: ( rulesimple_expression EOF )
            // InternalPascal.g:406:1: rulesimple_expression EOF
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
    // InternalPascal.g:413:1: rulesimple_expression : ( ( rule__Simple_expression__Group__0 ) ) ;
    public final void rulesimple_expression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:417:2: ( ( ( rule__Simple_expression__Group__0 ) ) )
            // InternalPascal.g:418:2: ( ( rule__Simple_expression__Group__0 ) )
            {
            // InternalPascal.g:418:2: ( ( rule__Simple_expression__Group__0 ) )
            // InternalPascal.g:419:3: ( rule__Simple_expression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimple_expressionAccess().getGroup()); 
            }
            // InternalPascal.g:420:3: ( rule__Simple_expression__Group__0 )
            // InternalPascal.g:420:4: rule__Simple_expression__Group__0
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
    // InternalPascal.g:429:1: entryRuleterm : ruleterm EOF ;
    public final void entryRuleterm() throws RecognitionException {
        try {
            // InternalPascal.g:430:1: ( ruleterm EOF )
            // InternalPascal.g:431:1: ruleterm EOF
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
    // InternalPascal.g:438:1: ruleterm : ( ( rule__Term__Group__0 ) ) ;
    public final void ruleterm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:442:2: ( ( ( rule__Term__Group__0 ) ) )
            // InternalPascal.g:443:2: ( ( rule__Term__Group__0 ) )
            {
            // InternalPascal.g:443:2: ( ( rule__Term__Group__0 ) )
            // InternalPascal.g:444:3: ( rule__Term__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getGroup()); 
            }
            // InternalPascal.g:445:3: ( rule__Term__Group__0 )
            // InternalPascal.g:445:4: rule__Term__Group__0
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
    // InternalPascal.g:454:1: entryRulefactor : rulefactor EOF ;
    public final void entryRulefactor() throws RecognitionException {
        try {
            // InternalPascal.g:455:1: ( rulefactor EOF )
            // InternalPascal.g:456:1: rulefactor EOF
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
    // InternalPascal.g:463:1: rulefactor : ( ( rule__Factor__Alternatives ) ) ;
    public final void rulefactor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:467:2: ( ( ( rule__Factor__Alternatives ) ) )
            // InternalPascal.g:468:2: ( ( rule__Factor__Alternatives ) )
            {
            // InternalPascal.g:468:2: ( ( rule__Factor__Alternatives ) )
            // InternalPascal.g:469:3: ( rule__Factor__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getAlternatives()); 
            }
            // InternalPascal.g:470:3: ( rule__Factor__Alternatives )
            // InternalPascal.g:470:4: rule__Factor__Alternatives
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
    // InternalPascal.g:479:1: entryRulefunction_designator : rulefunction_designator EOF ;
    public final void entryRulefunction_designator() throws RecognitionException {
        try {
            // InternalPascal.g:480:1: ( rulefunction_designator EOF )
            // InternalPascal.g:481:1: rulefunction_designator EOF
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
    // InternalPascal.g:488:1: rulefunction_designator : ( ( rule__Function_designator__Group__0 ) ) ;
    public final void rulefunction_designator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:492:2: ( ( ( rule__Function_designator__Group__0 ) ) )
            // InternalPascal.g:493:2: ( ( rule__Function_designator__Group__0 ) )
            {
            // InternalPascal.g:493:2: ( ( rule__Function_designator__Group__0 ) )
            // InternalPascal.g:494:3: ( rule__Function_designator__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_designatorAccess().getGroup()); 
            }
            // InternalPascal.g:495:3: ( rule__Function_designator__Group__0 )
            // InternalPascal.g:495:4: rule__Function_designator__Group__0
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
    // InternalPascal.g:504:1: entryRulefunction_procedure_declaration : rulefunction_procedure_declaration EOF ;
    public final void entryRulefunction_procedure_declaration() throws RecognitionException {
        try {
            // InternalPascal.g:505:1: ( rulefunction_procedure_declaration EOF )
            // InternalPascal.g:506:1: rulefunction_procedure_declaration EOF
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
    // InternalPascal.g:513:1: rulefunction_procedure_declaration : ( ( ( rule__Function_procedure_declaration__Group__0 ) ) ( ( rule__Function_procedure_declaration__Group__0 )* ) ) ;
    public final void rulefunction_procedure_declaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:517:2: ( ( ( ( rule__Function_procedure_declaration__Group__0 ) ) ( ( rule__Function_procedure_declaration__Group__0 )* ) ) )
            // InternalPascal.g:518:2: ( ( ( rule__Function_procedure_declaration__Group__0 ) ) ( ( rule__Function_procedure_declaration__Group__0 )* ) )
            {
            // InternalPascal.g:518:2: ( ( ( rule__Function_procedure_declaration__Group__0 ) ) ( ( rule__Function_procedure_declaration__Group__0 )* ) )
            // InternalPascal.g:519:3: ( ( rule__Function_procedure_declaration__Group__0 ) ) ( ( rule__Function_procedure_declaration__Group__0 )* )
            {
            // InternalPascal.g:519:3: ( ( rule__Function_procedure_declaration__Group__0 ) )
            // InternalPascal.g:520:4: ( rule__Function_procedure_declaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_procedure_declarationAccess().getGroup()); 
            }
            // InternalPascal.g:521:4: ( rule__Function_procedure_declaration__Group__0 )
            // InternalPascal.g:521:5: rule__Function_procedure_declaration__Group__0
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

            // InternalPascal.g:524:3: ( ( rule__Function_procedure_declaration__Group__0 )* )
            // InternalPascal.g:525:4: ( rule__Function_procedure_declaration__Group__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_procedure_declarationAccess().getGroup()); 
            }
            // InternalPascal.g:526:4: ( rule__Function_procedure_declaration__Group__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==36) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPascal.g:526:5: rule__Function_procedure_declaration__Group__0
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


    // $ANTLR start "entryRuleprocedure_declaration"
    // InternalPascal.g:536:1: entryRuleprocedure_declaration : ruleprocedure_declaration EOF ;
    public final void entryRuleprocedure_declaration() throws RecognitionException {
        try {
            // InternalPascal.g:537:1: ( ruleprocedure_declaration EOF )
            // InternalPascal.g:538:1: ruleprocedure_declaration EOF
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
    // InternalPascal.g:545:1: ruleprocedure_declaration : ( ( rule__Procedure_declaration__Group__0 ) ) ;
    public final void ruleprocedure_declaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:549:2: ( ( ( rule__Procedure_declaration__Group__0 ) ) )
            // InternalPascal.g:550:2: ( ( rule__Procedure_declaration__Group__0 ) )
            {
            // InternalPascal.g:550:2: ( ( rule__Procedure_declaration__Group__0 ) )
            // InternalPascal.g:551:3: ( rule__Procedure_declaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcedure_declarationAccess().getGroup()); 
            }
            // InternalPascal.g:552:3: ( rule__Procedure_declaration__Group__0 )
            // InternalPascal.g:552:4: rule__Procedure_declaration__Group__0
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
    // InternalPascal.g:561:1: entryRuleprocedure_heading : ruleprocedure_heading EOF ;
    public final void entryRuleprocedure_heading() throws RecognitionException {
        try {
            // InternalPascal.g:562:1: ( ruleprocedure_heading EOF )
            // InternalPascal.g:563:1: ruleprocedure_heading EOF
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
    // InternalPascal.g:570:1: ruleprocedure_heading : ( ( rule__Procedure_heading__Group__0 ) ) ;
    public final void ruleprocedure_heading() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:574:2: ( ( ( rule__Procedure_heading__Group__0 ) ) )
            // InternalPascal.g:575:2: ( ( rule__Procedure_heading__Group__0 ) )
            {
            // InternalPascal.g:575:2: ( ( rule__Procedure_heading__Group__0 ) )
            // InternalPascal.g:576:3: ( rule__Procedure_heading__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcedure_headingAccess().getGroup()); 
            }
            // InternalPascal.g:577:3: ( rule__Procedure_heading__Group__0 )
            // InternalPascal.g:577:4: rule__Procedure_heading__Group__0
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


    // $ANTLR start "entryRuleformal_parameter_list"
    // InternalPascal.g:586:1: entryRuleformal_parameter_list : ruleformal_parameter_list EOF ;
    public final void entryRuleformal_parameter_list() throws RecognitionException {
        try {
            // InternalPascal.g:587:1: ( ruleformal_parameter_list EOF )
            // InternalPascal.g:588:1: ruleformal_parameter_list EOF
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
    // InternalPascal.g:595:1: ruleformal_parameter_list : ( ( rule__Formal_parameter_list__Group__0 ) ) ;
    public final void ruleformal_parameter_list() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:599:2: ( ( ( rule__Formal_parameter_list__Group__0 ) ) )
            // InternalPascal.g:600:2: ( ( rule__Formal_parameter_list__Group__0 ) )
            {
            // InternalPascal.g:600:2: ( ( rule__Formal_parameter_list__Group__0 ) )
            // InternalPascal.g:601:3: ( rule__Formal_parameter_list__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormal_parameter_listAccess().getGroup()); 
            }
            // InternalPascal.g:602:3: ( rule__Formal_parameter_list__Group__0 )
            // InternalPascal.g:602:4: rule__Formal_parameter_list__Group__0
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
    // InternalPascal.g:611:1: entryRuleformal_parameter_section : ruleformal_parameter_section EOF ;
    public final void entryRuleformal_parameter_section() throws RecognitionException {
        try {
            // InternalPascal.g:612:1: ( ruleformal_parameter_section EOF )
            // InternalPascal.g:613:1: ruleformal_parameter_section EOF
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
    // InternalPascal.g:620:1: ruleformal_parameter_section : ( ( rule__Formal_parameter_section__Alternatives ) ) ;
    public final void ruleformal_parameter_section() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:624:2: ( ( ( rule__Formal_parameter_section__Alternatives ) ) )
            // InternalPascal.g:625:2: ( ( rule__Formal_parameter_section__Alternatives ) )
            {
            // InternalPascal.g:625:2: ( ( rule__Formal_parameter_section__Alternatives ) )
            // InternalPascal.g:626:3: ( rule__Formal_parameter_section__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormal_parameter_sectionAccess().getAlternatives()); 
            }
            // InternalPascal.g:627:3: ( rule__Formal_parameter_section__Alternatives )
            // InternalPascal.g:627:4: rule__Formal_parameter_section__Alternatives
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
    // InternalPascal.g:636:1: entryRulevalue_parameter_section : rulevalue_parameter_section EOF ;
    public final void entryRulevalue_parameter_section() throws RecognitionException {
        try {
            // InternalPascal.g:637:1: ( rulevalue_parameter_section EOF )
            // InternalPascal.g:638:1: rulevalue_parameter_section EOF
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
    // InternalPascal.g:645:1: rulevalue_parameter_section : ( ( rule__Value_parameter_section__Group__0 ) ) ;
    public final void rulevalue_parameter_section() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:649:2: ( ( ( rule__Value_parameter_section__Group__0 ) ) )
            // InternalPascal.g:650:2: ( ( rule__Value_parameter_section__Group__0 ) )
            {
            // InternalPascal.g:650:2: ( ( rule__Value_parameter_section__Group__0 ) )
            // InternalPascal.g:651:3: ( rule__Value_parameter_section__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValue_parameter_sectionAccess().getGroup()); 
            }
            // InternalPascal.g:652:3: ( rule__Value_parameter_section__Group__0 )
            // InternalPascal.g:652:4: rule__Value_parameter_section__Group__0
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
    // InternalPascal.g:661:1: entryRuleidentifier_list : ruleidentifier_list EOF ;
    public final void entryRuleidentifier_list() throws RecognitionException {
        try {
            // InternalPascal.g:662:1: ( ruleidentifier_list EOF )
            // InternalPascal.g:663:1: ruleidentifier_list EOF
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
    // InternalPascal.g:670:1: ruleidentifier_list : ( ( rule__Identifier_list__Group__0 ) ) ;
    public final void ruleidentifier_list() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:674:2: ( ( ( rule__Identifier_list__Group__0 ) ) )
            // InternalPascal.g:675:2: ( ( rule__Identifier_list__Group__0 ) )
            {
            // InternalPascal.g:675:2: ( ( rule__Identifier_list__Group__0 ) )
            // InternalPascal.g:676:3: ( rule__Identifier_list__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifier_listAccess().getGroup()); 
            }
            // InternalPascal.g:677:3: ( rule__Identifier_list__Group__0 )
            // InternalPascal.g:677:4: rule__Identifier_list__Group__0
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
    // InternalPascal.g:686:1: entryRuleparameter_type : ruleparameter_type EOF ;
    public final void entryRuleparameter_type() throws RecognitionException {
        try {
            // InternalPascal.g:687:1: ( ruleparameter_type EOF )
            // InternalPascal.g:688:1: ruleparameter_type EOF
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
    // InternalPascal.g:695:1: ruleparameter_type : ( ( rule__Parameter_type__NameAssignment ) ) ;
    public final void ruleparameter_type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:699:2: ( ( ( rule__Parameter_type__NameAssignment ) ) )
            // InternalPascal.g:700:2: ( ( rule__Parameter_type__NameAssignment ) )
            {
            // InternalPascal.g:700:2: ( ( rule__Parameter_type__NameAssignment ) )
            // InternalPascal.g:701:3: ( rule__Parameter_type__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameter_typeAccess().getNameAssignment()); 
            }
            // InternalPascal.g:702:3: ( rule__Parameter_type__NameAssignment )
            // InternalPascal.g:702:4: rule__Parameter_type__NameAssignment
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
    // InternalPascal.g:711:1: entryRulevariable_parameter_section : rulevariable_parameter_section EOF ;
    public final void entryRulevariable_parameter_section() throws RecognitionException {
        try {
            // InternalPascal.g:712:1: ( rulevariable_parameter_section EOF )
            // InternalPascal.g:713:1: rulevariable_parameter_section EOF
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
    // InternalPascal.g:720:1: rulevariable_parameter_section : ( ( rule__Variable_parameter_section__Group__0 ) ) ;
    public final void rulevariable_parameter_section() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:724:2: ( ( ( rule__Variable_parameter_section__Group__0 ) ) )
            // InternalPascal.g:725:2: ( ( rule__Variable_parameter_section__Group__0 ) )
            {
            // InternalPascal.g:725:2: ( ( rule__Variable_parameter_section__Group__0 ) )
            // InternalPascal.g:726:3: ( rule__Variable_parameter_section__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_parameter_sectionAccess().getGroup()); 
            }
            // InternalPascal.g:727:3: ( rule__Variable_parameter_section__Group__0 )
            // InternalPascal.g:727:4: rule__Variable_parameter_section__Group__0
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


    // $ANTLR start "entryRuleset"
    // InternalPascal.g:736:1: entryRuleset : ruleset EOF ;
    public final void entryRuleset() throws RecognitionException {
        try {
            // InternalPascal.g:737:1: ( ruleset EOF )
            // InternalPascal.g:738:1: ruleset EOF
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
    // InternalPascal.g:745:1: ruleset : ( ( rule__Set__Group__0 ) ) ;
    public final void ruleset() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:749:2: ( ( ( rule__Set__Group__0 ) ) )
            // InternalPascal.g:750:2: ( ( rule__Set__Group__0 ) )
            {
            // InternalPascal.g:750:2: ( ( rule__Set__Group__0 ) )
            // InternalPascal.g:751:3: ( rule__Set__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetAccess().getGroup()); 
            }
            // InternalPascal.g:752:3: ( rule__Set__Group__0 )
            // InternalPascal.g:752:4: rule__Set__Group__0
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
    // InternalPascal.g:761:1: entryRulenumber : rulenumber EOF ;
    public final void entryRulenumber() throws RecognitionException {
        try {
            // InternalPascal.g:762:1: ( rulenumber EOF )
            // InternalPascal.g:763:1: rulenumber EOF
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
    // InternalPascal.g:770:1: rulenumber : ( ( rule__Number__NumberAssignment ) ) ;
    public final void rulenumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:774:2: ( ( ( rule__Number__NumberAssignment ) ) )
            // InternalPascal.g:775:2: ( ( rule__Number__NumberAssignment ) )
            {
            // InternalPascal.g:775:2: ( ( rule__Number__NumberAssignment ) )
            // InternalPascal.g:776:3: ( rule__Number__NumberAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberAccess().getNumberAssignment()); 
            }
            // InternalPascal.g:777:3: ( rule__Number__NumberAssignment )
            // InternalPascal.g:777:4: rule__Number__NumberAssignment
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
    // InternalPascal.g:786:1: entryRuleany_number : ruleany_number EOF ;
    public final void entryRuleany_number() throws RecognitionException {
        try {
            // InternalPascal.g:787:1: ( ruleany_number EOF )
            // InternalPascal.g:788:1: ruleany_number EOF
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
    // InternalPascal.g:795:1: ruleany_number : ( ( rule__Any_number__Alternatives ) ) ;
    public final void ruleany_number() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:799:2: ( ( ( rule__Any_number__Alternatives ) ) )
            // InternalPascal.g:800:2: ( ( rule__Any_number__Alternatives ) )
            {
            // InternalPascal.g:800:2: ( ( rule__Any_number__Alternatives ) )
            // InternalPascal.g:801:3: ( rule__Any_number__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAny_numberAccess().getAlternatives()); 
            }
            // InternalPascal.g:802:3: ( rule__Any_number__Alternatives )
            // InternalPascal.g:802:4: rule__Any_number__Alternatives
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
    // InternalPascal.g:811:1: entryRulelabel_declaration : rulelabel_declaration EOF ;
    public final void entryRulelabel_declaration() throws RecognitionException {
        try {
            // InternalPascal.g:812:1: ( rulelabel_declaration EOF )
            // InternalPascal.g:813:1: rulelabel_declaration EOF
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
    // InternalPascal.g:820:1: rulelabel_declaration : ( ( rule__Label_declaration__Group__0 ) ) ;
    public final void rulelabel_declaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:824:2: ( ( ( rule__Label_declaration__Group__0 ) ) )
            // InternalPascal.g:825:2: ( ( rule__Label_declaration__Group__0 ) )
            {
            // InternalPascal.g:825:2: ( ( rule__Label_declaration__Group__0 ) )
            // InternalPascal.g:826:3: ( rule__Label_declaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabel_declarationAccess().getGroup()); 
            }
            // InternalPascal.g:827:3: ( rule__Label_declaration__Group__0 )
            // InternalPascal.g:827:4: rule__Label_declaration__Group__0
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
    // InternalPascal.g:836:1: entryRuleconstant : ruleconstant EOF ;
    public final void entryRuleconstant() throws RecognitionException {
        try {
            // InternalPascal.g:837:1: ( ruleconstant EOF )
            // InternalPascal.g:838:1: ruleconstant EOF
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
    // InternalPascal.g:845:1: ruleconstant : ( ( rule__Constant__Alternatives ) ) ;
    public final void ruleconstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:849:2: ( ( ( rule__Constant__Alternatives ) ) )
            // InternalPascal.g:850:2: ( ( rule__Constant__Alternatives ) )
            {
            // InternalPascal.g:850:2: ( ( rule__Constant__Alternatives ) )
            // InternalPascal.g:851:3: ( rule__Constant__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getAlternatives()); 
            }
            // InternalPascal.g:852:3: ( rule__Constant__Alternatives )
            // InternalPascal.g:852:4: rule__Constant__Alternatives
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
    // InternalPascal.g:861:1: entryRuleconstant_definition_part : ruleconstant_definition_part EOF ;
    public final void entryRuleconstant_definition_part() throws RecognitionException {
        try {
            // InternalPascal.g:862:1: ( ruleconstant_definition_part EOF )
            // InternalPascal.g:863:1: ruleconstant_definition_part EOF
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
    // InternalPascal.g:870:1: ruleconstant_definition_part : ( ( rule__Constant_definition_part__Group__0 ) ) ;
    public final void ruleconstant_definition_part() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:874:2: ( ( ( rule__Constant_definition_part__Group__0 ) ) )
            // InternalPascal.g:875:2: ( ( rule__Constant_definition_part__Group__0 ) )
            {
            // InternalPascal.g:875:2: ( ( rule__Constant_definition_part__Group__0 ) )
            // InternalPascal.g:876:3: ( rule__Constant_definition_part__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstant_definition_partAccess().getGroup()); 
            }
            // InternalPascal.g:877:3: ( rule__Constant_definition_part__Group__0 )
            // InternalPascal.g:877:4: rule__Constant_definition_part__Group__0
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
    // InternalPascal.g:886:1: entryRuleconstant_definition : ruleconstant_definition EOF ;
    public final void entryRuleconstant_definition() throws RecognitionException {
        try {
            // InternalPascal.g:887:1: ( ruleconstant_definition EOF )
            // InternalPascal.g:888:1: ruleconstant_definition EOF
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
    // InternalPascal.g:895:1: ruleconstant_definition : ( ( rule__Constant_definition__Group__0 ) ) ;
    public final void ruleconstant_definition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:899:2: ( ( ( rule__Constant_definition__Group__0 ) ) )
            // InternalPascal.g:900:2: ( ( rule__Constant_definition__Group__0 ) )
            {
            // InternalPascal.g:900:2: ( ( rule__Constant_definition__Group__0 ) )
            // InternalPascal.g:901:3: ( rule__Constant_definition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstant_definitionAccess().getGroup()); 
            }
            // InternalPascal.g:902:3: ( rule__Constant_definition__Group__0 )
            // InternalPascal.g:902:4: rule__Constant_definition__Group__0
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
    // InternalPascal.g:911:1: entryRuletype_definition_part : ruletype_definition_part EOF ;
    public final void entryRuletype_definition_part() throws RecognitionException {
        try {
            // InternalPascal.g:912:1: ( ruletype_definition_part EOF )
            // InternalPascal.g:913:1: ruletype_definition_part EOF
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
    // InternalPascal.g:920:1: ruletype_definition_part : ( ( rule__Type_definition_part__Group__0 ) ) ;
    public final void ruletype_definition_part() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:924:2: ( ( ( rule__Type_definition_part__Group__0 ) ) )
            // InternalPascal.g:925:2: ( ( rule__Type_definition_part__Group__0 ) )
            {
            // InternalPascal.g:925:2: ( ( rule__Type_definition_part__Group__0 ) )
            // InternalPascal.g:926:3: ( rule__Type_definition_part__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_definition_partAccess().getGroup()); 
            }
            // InternalPascal.g:927:3: ( rule__Type_definition_part__Group__0 )
            // InternalPascal.g:927:4: rule__Type_definition_part__Group__0
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
    // InternalPascal.g:936:1: entryRuletype_definition : ruletype_definition EOF ;
    public final void entryRuletype_definition() throws RecognitionException {
        try {
            // InternalPascal.g:937:1: ( ruletype_definition EOF )
            // InternalPascal.g:938:1: ruletype_definition EOF
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
    // InternalPascal.g:945:1: ruletype_definition : ( ( rule__Type_definition__Group__0 ) ) ;
    public final void ruletype_definition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:949:2: ( ( ( rule__Type_definition__Group__0 ) ) )
            // InternalPascal.g:950:2: ( ( rule__Type_definition__Group__0 ) )
            {
            // InternalPascal.g:950:2: ( ( rule__Type_definition__Group__0 ) )
            // InternalPascal.g:951:3: ( rule__Type_definition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_definitionAccess().getGroup()); 
            }
            // InternalPascal.g:952:3: ( rule__Type_definition__Group__0 )
            // InternalPascal.g:952:4: rule__Type_definition__Group__0
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
    // InternalPascal.g:961:1: entryRuletype : ruletype EOF ;
    public final void entryRuletype() throws RecognitionException {
        try {
            // InternalPascal.g:962:1: ( ruletype EOF )
            // InternalPascal.g:963:1: ruletype EOF
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
    // InternalPascal.g:970:1: ruletype : ( ( rule__Type__Alternatives ) ) ;
    public final void ruletype() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:974:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalPascal.g:975:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalPascal.g:975:2: ( ( rule__Type__Alternatives ) )
            // InternalPascal.g:976:3: ( rule__Type__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getAlternatives()); 
            }
            // InternalPascal.g:977:3: ( rule__Type__Alternatives )
            // InternalPascal.g:977:4: rule__Type__Alternatives
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
    // InternalPascal.g:986:1: entryRulesimple_type : rulesimple_type EOF ;
    public final void entryRulesimple_type() throws RecognitionException {
        try {
            // InternalPascal.g:987:1: ( rulesimple_type EOF )
            // InternalPascal.g:988:1: rulesimple_type EOF
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
    // InternalPascal.g:995:1: rulesimple_type : ( ( rule__Simple_type__Alternatives ) ) ;
    public final void rulesimple_type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:999:2: ( ( ( rule__Simple_type__Alternatives ) ) )
            // InternalPascal.g:1000:2: ( ( rule__Simple_type__Alternatives ) )
            {
            // InternalPascal.g:1000:2: ( ( rule__Simple_type__Alternatives ) )
            // InternalPascal.g:1001:3: ( rule__Simple_type__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimple_typeAccess().getAlternatives()); 
            }
            // InternalPascal.g:1002:3: ( rule__Simple_type__Alternatives )
            // InternalPascal.g:1002:4: rule__Simple_type__Alternatives
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
    // InternalPascal.g:1011:1: entryRulesubrange_type : rulesubrange_type EOF ;
    public final void entryRulesubrange_type() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalPascal.g:1015:1: ( rulesubrange_type EOF )
            // InternalPascal.g:1016:1: rulesubrange_type EOF
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
    // InternalPascal.g:1026:1: rulesubrange_type : ( ( rule__Subrange_type__Alternatives ) ) ;
    public final void rulesubrange_type() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1031:2: ( ( ( rule__Subrange_type__Alternatives ) ) )
            // InternalPascal.g:1032:2: ( ( rule__Subrange_type__Alternatives ) )
            {
            // InternalPascal.g:1032:2: ( ( rule__Subrange_type__Alternatives ) )
            // InternalPascal.g:1033:3: ( rule__Subrange_type__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubrange_typeAccess().getAlternatives()); 
            }
            // InternalPascal.g:1034:3: ( rule__Subrange_type__Alternatives )
            // InternalPascal.g:1034:4: rule__Subrange_type__Alternatives
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
    // InternalPascal.g:1044:1: entryRuleenumerated_type : ruleenumerated_type EOF ;
    public final void entryRuleenumerated_type() throws RecognitionException {
        try {
            // InternalPascal.g:1045:1: ( ruleenumerated_type EOF )
            // InternalPascal.g:1046:1: ruleenumerated_type EOF
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
    // InternalPascal.g:1053:1: ruleenumerated_type : ( ( rule__Enumerated_type__Group__0 ) ) ;
    public final void ruleenumerated_type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1057:2: ( ( ( rule__Enumerated_type__Group__0 ) ) )
            // InternalPascal.g:1058:2: ( ( rule__Enumerated_type__Group__0 ) )
            {
            // InternalPascal.g:1058:2: ( ( rule__Enumerated_type__Group__0 ) )
            // InternalPascal.g:1059:3: ( rule__Enumerated_type__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerated_typeAccess().getGroup()); 
            }
            // InternalPascal.g:1060:3: ( rule__Enumerated_type__Group__0 )
            // InternalPascal.g:1060:4: rule__Enumerated_type__Group__0
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
    // InternalPascal.g:1069:1: entryRulestructured_type : rulestructured_type EOF ;
    public final void entryRulestructured_type() throws RecognitionException {
        try {
            // InternalPascal.g:1070:1: ( rulestructured_type EOF )
            // InternalPascal.g:1071:1: rulestructured_type EOF
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
    // InternalPascal.g:1078:1: rulestructured_type : ( ( rule__Structured_type__Group__0 ) ) ;
    public final void rulestructured_type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1082:2: ( ( ( rule__Structured_type__Group__0 ) ) )
            // InternalPascal.g:1083:2: ( ( rule__Structured_type__Group__0 ) )
            {
            // InternalPascal.g:1083:2: ( ( rule__Structured_type__Group__0 ) )
            // InternalPascal.g:1084:3: ( rule__Structured_type__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStructured_typeAccess().getGroup()); 
            }
            // InternalPascal.g:1085:3: ( rule__Structured_type__Group__0 )
            // InternalPascal.g:1085:4: rule__Structured_type__Group__0
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
    // InternalPascal.g:1094:1: entryRuleunpacked_structured_type : ruleunpacked_structured_type EOF ;
    public final void entryRuleunpacked_structured_type() throws RecognitionException {
        try {
            // InternalPascal.g:1095:1: ( ruleunpacked_structured_type EOF )
            // InternalPascal.g:1096:1: ruleunpacked_structured_type EOF
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
    // InternalPascal.g:1103:1: ruleunpacked_structured_type : ( ( rule__Unpacked_structured_type__RecordAssignment ) ) ;
    public final void ruleunpacked_structured_type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1107:2: ( ( ( rule__Unpacked_structured_type__RecordAssignment ) ) )
            // InternalPascal.g:1108:2: ( ( rule__Unpacked_structured_type__RecordAssignment ) )
            {
            // InternalPascal.g:1108:2: ( ( rule__Unpacked_structured_type__RecordAssignment ) )
            // InternalPascal.g:1109:3: ( rule__Unpacked_structured_type__RecordAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnpacked_structured_typeAccess().getRecordAssignment()); 
            }
            // InternalPascal.g:1110:3: ( rule__Unpacked_structured_type__RecordAssignment )
            // InternalPascal.g:1110:4: rule__Unpacked_structured_type__RecordAssignment
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
    // InternalPascal.g:1119:1: entryRulerecord_type : rulerecord_type EOF ;
    public final void entryRulerecord_type() throws RecognitionException {
        try {
            // InternalPascal.g:1120:1: ( rulerecord_type EOF )
            // InternalPascal.g:1121:1: rulerecord_type EOF
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
    // InternalPascal.g:1128:1: rulerecord_type : ( ( rule__Record_type__Group__0 ) ) ;
    public final void rulerecord_type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1132:2: ( ( ( rule__Record_type__Group__0 ) ) )
            // InternalPascal.g:1133:2: ( ( rule__Record_type__Group__0 ) )
            {
            // InternalPascal.g:1133:2: ( ( rule__Record_type__Group__0 ) )
            // InternalPascal.g:1134:3: ( rule__Record_type__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecord_typeAccess().getGroup()); 
            }
            // InternalPascal.g:1135:3: ( rule__Record_type__Group__0 )
            // InternalPascal.g:1135:4: rule__Record_type__Group__0
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
    // InternalPascal.g:1144:1: entryRulefield_list : rulefield_list EOF ;
    public final void entryRulefield_list() throws RecognitionException {
        try {
            // InternalPascal.g:1145:1: ( rulefield_list EOF )
            // InternalPascal.g:1146:1: rulefield_list EOF
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
    // InternalPascal.g:1153:1: rulefield_list : ( ( rule__Field_list__Group__0 ) ) ;
    public final void rulefield_list() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1157:2: ( ( ( rule__Field_list__Group__0 ) ) )
            // InternalPascal.g:1158:2: ( ( rule__Field_list__Group__0 ) )
            {
            // InternalPascal.g:1158:2: ( ( rule__Field_list__Group__0 ) )
            // InternalPascal.g:1159:3: ( rule__Field_list__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_listAccess().getGroup()); 
            }
            // InternalPascal.g:1160:3: ( rule__Field_list__Group__0 )
            // InternalPascal.g:1160:4: rule__Field_list__Group__0
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
    // InternalPascal.g:1169:1: entryRulefixed_part : rulefixed_part EOF ;
    public final void entryRulefixed_part() throws RecognitionException {
        try {
            // InternalPascal.g:1170:1: ( rulefixed_part EOF )
            // InternalPascal.g:1171:1: rulefixed_part EOF
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
    // InternalPascal.g:1178:1: rulefixed_part : ( ( rule__Fixed_part__Group__0 ) ) ;
    public final void rulefixed_part() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1182:2: ( ( ( rule__Fixed_part__Group__0 ) ) )
            // InternalPascal.g:1183:2: ( ( rule__Fixed_part__Group__0 ) )
            {
            // InternalPascal.g:1183:2: ( ( rule__Fixed_part__Group__0 ) )
            // InternalPascal.g:1184:3: ( rule__Fixed_part__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFixed_partAccess().getGroup()); 
            }
            // InternalPascal.g:1185:3: ( rule__Fixed_part__Group__0 )
            // InternalPascal.g:1185:4: rule__Fixed_part__Group__0
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
    // InternalPascal.g:1194:1: entryRulerecord_section : rulerecord_section EOF ;
    public final void entryRulerecord_section() throws RecognitionException {
        try {
            // InternalPascal.g:1195:1: ( rulerecord_section EOF )
            // InternalPascal.g:1196:1: rulerecord_section EOF
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
    // InternalPascal.g:1203:1: rulerecord_section : ( ( rule__Record_section__Group__0 ) ) ;
    public final void rulerecord_section() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1207:2: ( ( ( rule__Record_section__Group__0 ) ) )
            // InternalPascal.g:1208:2: ( ( rule__Record_section__Group__0 ) )
            {
            // InternalPascal.g:1208:2: ( ( rule__Record_section__Group__0 ) )
            // InternalPascal.g:1209:3: ( rule__Record_section__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecord_sectionAccess().getGroup()); 
            }
            // InternalPascal.g:1210:3: ( rule__Record_section__Group__0 )
            // InternalPascal.g:1210:4: rule__Record_section__Group__0
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
    // InternalPascal.g:1219:1: entryRulevariant_part : rulevariant_part EOF ;
    public final void entryRulevariant_part() throws RecognitionException {
        try {
            // InternalPascal.g:1220:1: ( rulevariant_part EOF )
            // InternalPascal.g:1221:1: rulevariant_part EOF
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
    // InternalPascal.g:1228:1: rulevariant_part : ( ( rule__Variant_part__Group__0 ) ) ;
    public final void rulevariant_part() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1232:2: ( ( ( rule__Variant_part__Group__0 ) ) )
            // InternalPascal.g:1233:2: ( ( rule__Variant_part__Group__0 ) )
            {
            // InternalPascal.g:1233:2: ( ( rule__Variant_part__Group__0 ) )
            // InternalPascal.g:1234:3: ( rule__Variant_part__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariant_partAccess().getGroup()); 
            }
            // InternalPascal.g:1235:3: ( rule__Variant_part__Group__0 )
            // InternalPascal.g:1235:4: rule__Variant_part__Group__0
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
    // InternalPascal.g:1244:1: entryRuletag_field : ruletag_field EOF ;
    public final void entryRuletag_field() throws RecognitionException {
        try {
            // InternalPascal.g:1245:1: ( ruletag_field EOF )
            // InternalPascal.g:1246:1: ruletag_field EOF
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
    // InternalPascal.g:1253:1: ruletag_field : ( ( rule__Tag_field__Group__0 ) ) ;
    public final void ruletag_field() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1257:2: ( ( ( rule__Tag_field__Group__0 ) ) )
            // InternalPascal.g:1258:2: ( ( rule__Tag_field__Group__0 ) )
            {
            // InternalPascal.g:1258:2: ( ( rule__Tag_field__Group__0 ) )
            // InternalPascal.g:1259:3: ( rule__Tag_field__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTag_fieldAccess().getGroup()); 
            }
            // InternalPascal.g:1260:3: ( rule__Tag_field__Group__0 )
            // InternalPascal.g:1260:4: rule__Tag_field__Group__0
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
    // InternalPascal.g:1269:1: entryRulevariant : rulevariant EOF ;
    public final void entryRulevariant() throws RecognitionException {
        try {
            // InternalPascal.g:1270:1: ( rulevariant EOF )
            // InternalPascal.g:1271:1: rulevariant EOF
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
    // InternalPascal.g:1278:1: rulevariant : ( ( rule__Variant__Group__0 ) ) ;
    public final void rulevariant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1282:2: ( ( ( rule__Variant__Group__0 ) ) )
            // InternalPascal.g:1283:2: ( ( rule__Variant__Group__0 ) )
            {
            // InternalPascal.g:1283:2: ( ( rule__Variant__Group__0 ) )
            // InternalPascal.g:1284:3: ( rule__Variant__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariantAccess().getGroup()); 
            }
            // InternalPascal.g:1285:3: ( rule__Variant__Group__0 )
            // InternalPascal.g:1285:4: rule__Variant__Group__0
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
    // InternalPascal.g:1294:1: entryRulecase_label_list : rulecase_label_list EOF ;
    public final void entryRulecase_label_list() throws RecognitionException {
        try {
            // InternalPascal.g:1295:1: ( rulecase_label_list EOF )
            // InternalPascal.g:1296:1: rulecase_label_list EOF
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
    // InternalPascal.g:1303:1: rulecase_label_list : ( ( rule__Case_label_list__Group__0 ) ) ;
    public final void rulecase_label_list() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1307:2: ( ( ( rule__Case_label_list__Group__0 ) ) )
            // InternalPascal.g:1308:2: ( ( rule__Case_label_list__Group__0 ) )
            {
            // InternalPascal.g:1308:2: ( ( rule__Case_label_list__Group__0 ) )
            // InternalPascal.g:1309:3: ( rule__Case_label_list__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCase_label_listAccess().getGroup()); 
            }
            // InternalPascal.g:1310:3: ( rule__Case_label_list__Group__0 )
            // InternalPascal.g:1310:4: rule__Case_label_list__Group__0
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
    // InternalPascal.g:1319:1: entryRulepointer_type : rulepointer_type EOF ;
    public final void entryRulepointer_type() throws RecognitionException {
        try {
            // InternalPascal.g:1320:1: ( rulepointer_type EOF )
            // InternalPascal.g:1321:1: rulepointer_type EOF
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
    // InternalPascal.g:1328:1: rulepointer_type : ( ( rule__Pointer_type__Group__0 ) ) ;
    public final void rulepointer_type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1332:2: ( ( ( rule__Pointer_type__Group__0 ) ) )
            // InternalPascal.g:1333:2: ( ( rule__Pointer_type__Group__0 ) )
            {
            // InternalPascal.g:1333:2: ( ( rule__Pointer_type__Group__0 ) )
            // InternalPascal.g:1334:3: ( rule__Pointer_type__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointer_typeAccess().getGroup()); 
            }
            // InternalPascal.g:1335:3: ( rule__Pointer_type__Group__0 )
            // InternalPascal.g:1335:4: rule__Pointer_type__Group__0
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
    // InternalPascal.g:1344:1: entryRulesigned_number : rulesigned_number EOF ;
    public final void entryRulesigned_number() throws RecognitionException {
        try {
            // InternalPascal.g:1345:1: ( rulesigned_number EOF )
            // InternalPascal.g:1346:1: rulesigned_number EOF
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
    // InternalPascal.g:1353:1: rulesigned_number : ( ( rule__Signed_number__Alternatives ) ) ;
    public final void rulesigned_number() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1357:2: ( ( ( rule__Signed_number__Alternatives ) ) )
            // InternalPascal.g:1358:2: ( ( rule__Signed_number__Alternatives ) )
            {
            // InternalPascal.g:1358:2: ( ( rule__Signed_number__Alternatives ) )
            // InternalPascal.g:1359:3: ( rule__Signed_number__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSigned_numberAccess().getAlternatives()); 
            }
            // InternalPascal.g:1360:3: ( rule__Signed_number__Alternatives )
            // InternalPascal.g:1360:4: rule__Signed_number__Alternatives
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
    // InternalPascal.g:1369:1: entryRuleunsigned_number : ruleunsigned_number EOF ;
    public final void entryRuleunsigned_number() throws RecognitionException {
        try {
            // InternalPascal.g:1370:1: ( ruleunsigned_number EOF )
            // InternalPascal.g:1371:1: ruleunsigned_number EOF
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
    // InternalPascal.g:1378:1: ruleunsigned_number : ( ( rule__Unsigned_number__Alternatives ) ) ;
    public final void ruleunsigned_number() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1382:2: ( ( ( rule__Unsigned_number__Alternatives ) ) )
            // InternalPascal.g:1383:2: ( ( rule__Unsigned_number__Alternatives ) )
            {
            // InternalPascal.g:1383:2: ( ( rule__Unsigned_number__Alternatives ) )
            // InternalPascal.g:1384:3: ( rule__Unsigned_number__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnsigned_numberAccess().getAlternatives()); 
            }
            // InternalPascal.g:1385:3: ( rule__Unsigned_number__Alternatives )
            // InternalPascal.g:1385:4: rule__Unsigned_number__Alternatives
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
    // InternalPascal.g:1394:1: entryRulevariable_declaration_part : rulevariable_declaration_part EOF ;
    public final void entryRulevariable_declaration_part() throws RecognitionException {
        try {
            // InternalPascal.g:1395:1: ( rulevariable_declaration_part EOF )
            // InternalPascal.g:1396:1: rulevariable_declaration_part EOF
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
    // InternalPascal.g:1403:1: rulevariable_declaration_part : ( ( rule__Variable_declaration_part__Group__0 ) ) ;
    public final void rulevariable_declaration_part() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1407:2: ( ( ( rule__Variable_declaration_part__Group__0 ) ) )
            // InternalPascal.g:1408:2: ( ( rule__Variable_declaration_part__Group__0 ) )
            {
            // InternalPascal.g:1408:2: ( ( rule__Variable_declaration_part__Group__0 ) )
            // InternalPascal.g:1409:3: ( rule__Variable_declaration_part__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declaration_partAccess().getGroup()); 
            }
            // InternalPascal.g:1410:3: ( rule__Variable_declaration_part__Group__0 )
            // InternalPascal.g:1410:4: rule__Variable_declaration_part__Group__0
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
    // InternalPascal.g:1419:1: entryRulevariable_section : rulevariable_section EOF ;
    public final void entryRulevariable_section() throws RecognitionException {
        try {
            // InternalPascal.g:1420:1: ( rulevariable_section EOF )
            // InternalPascal.g:1421:1: rulevariable_section EOF
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
    // InternalPascal.g:1428:1: rulevariable_section : ( ( rule__Variable_section__Group__0 ) ) ;
    public final void rulevariable_section() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1432:2: ( ( ( rule__Variable_section__Group__0 ) ) )
            // InternalPascal.g:1433:2: ( ( rule__Variable_section__Group__0 ) )
            {
            // InternalPascal.g:1433:2: ( ( rule__Variable_section__Group__0 ) )
            // InternalPascal.g:1434:3: ( rule__Variable_section__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_sectionAccess().getGroup()); 
            }
            // InternalPascal.g:1435:3: ( rule__Variable_section__Group__0 )
            // InternalPascal.g:1435:4: rule__Variable_section__Group__0
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
    // InternalPascal.g:1444:1: entryRulevariable_identifier_list : rulevariable_identifier_list EOF ;
    public final void entryRulevariable_identifier_list() throws RecognitionException {
        try {
            // InternalPascal.g:1445:1: ( rulevariable_identifier_list EOF )
            // InternalPascal.g:1446:1: rulevariable_identifier_list EOF
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
    // InternalPascal.g:1453:1: rulevariable_identifier_list : ( ( rule__Variable_identifier_list__Group__0 ) ) ;
    public final void rulevariable_identifier_list() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1457:2: ( ( ( rule__Variable_identifier_list__Group__0 ) ) )
            // InternalPascal.g:1458:2: ( ( rule__Variable_identifier_list__Group__0 ) )
            {
            // InternalPascal.g:1458:2: ( ( rule__Variable_identifier_list__Group__0 ) )
            // InternalPascal.g:1459:3: ( rule__Variable_identifier_list__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_identifier_listAccess().getGroup()); 
            }
            // InternalPascal.g:1460:3: ( rule__Variable_identifier_list__Group__0 )
            // InternalPascal.g:1460:4: rule__Variable_identifier_list__Group__0
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


    // $ANTLR start "rule__Simple_statement__Alternatives"
    // InternalPascal.g:1468:1: rule__Simple_statement__Alternatives : ( ( ( rule__Simple_statement__AssignmentAssignment_0 ) ) | ( ( rule__Simple_statement__FunctionAssignment_1 ) ) | ( ( rule__Simple_statement__Function_noargsAssignment_2 ) ) );
    public final void rule__Simple_statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1472:1: ( ( ( rule__Simple_statement__AssignmentAssignment_0 ) ) | ( ( rule__Simple_statement__FunctionAssignment_1 ) ) | ( ( rule__Simple_statement__Function_noargsAssignment_2 ) ) )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
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
                case 22:
                case 28:
                case 29:
                case 31:
                    {
                    alt4=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalPascal.g:1473:2: ( ( rule__Simple_statement__AssignmentAssignment_0 ) )
                    {
                    // InternalPascal.g:1473:2: ( ( rule__Simple_statement__AssignmentAssignment_0 ) )
                    // InternalPascal.g:1474:3: ( rule__Simple_statement__AssignmentAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimple_statementAccess().getAssignmentAssignment_0()); 
                    }
                    // InternalPascal.g:1475:3: ( rule__Simple_statement__AssignmentAssignment_0 )
                    // InternalPascal.g:1475:4: rule__Simple_statement__AssignmentAssignment_0
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
                    // InternalPascal.g:1479:2: ( ( rule__Simple_statement__FunctionAssignment_1 ) )
                    {
                    // InternalPascal.g:1479:2: ( ( rule__Simple_statement__FunctionAssignment_1 ) )
                    // InternalPascal.g:1480:3: ( rule__Simple_statement__FunctionAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimple_statementAccess().getFunctionAssignment_1()); 
                    }
                    // InternalPascal.g:1481:3: ( rule__Simple_statement__FunctionAssignment_1 )
                    // InternalPascal.g:1481:4: rule__Simple_statement__FunctionAssignment_1
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
                    // InternalPascal.g:1485:2: ( ( rule__Simple_statement__Function_noargsAssignment_2 ) )
                    {
                    // InternalPascal.g:1485:2: ( ( rule__Simple_statement__Function_noargsAssignment_2 ) )
                    // InternalPascal.g:1486:3: ( rule__Simple_statement__Function_noargsAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimple_statementAccess().getFunction_noargsAssignment_2()); 
                    }
                    // InternalPascal.g:1487:3: ( rule__Simple_statement__Function_noargsAssignment_2 )
                    // InternalPascal.g:1487:4: rule__Simple_statement__Function_noargsAssignment_2
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


    // $ANTLR start "rule__Label__Alternatives"
    // InternalPascal.g:1495:1: rule__Label__Alternatives : ( ( ( rule__Label__NumberAssignment_0 ) ) | ( ( rule__Label__NumberAssignment_1 ) ) );
    public final void rule__Label__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1499:1: ( ( ( rule__Label__NumberAssignment_0 ) ) | ( ( rule__Label__NumberAssignment_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_SIGNED_INTEGER_NUMBER) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_INTEGER_NUMBER) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalPascal.g:1500:2: ( ( rule__Label__NumberAssignment_0 ) )
                    {
                    // InternalPascal.g:1500:2: ( ( rule__Label__NumberAssignment_0 ) )
                    // InternalPascal.g:1501:3: ( rule__Label__NumberAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLabelAccess().getNumberAssignment_0()); 
                    }
                    // InternalPascal.g:1502:3: ( rule__Label__NumberAssignment_0 )
                    // InternalPascal.g:1502:4: rule__Label__NumberAssignment_0
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
                    // InternalPascal.g:1506:2: ( ( rule__Label__NumberAssignment_1 ) )
                    {
                    // InternalPascal.g:1506:2: ( ( rule__Label__NumberAssignment_1 ) )
                    // InternalPascal.g:1507:3: ( rule__Label__NumberAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLabelAccess().getNumberAssignment_1()); 
                    }
                    // InternalPascal.g:1508:3: ( rule__Label__NumberAssignment_1 )
                    // InternalPascal.g:1508:4: rule__Label__NumberAssignment_1
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
    // InternalPascal.g:1516:1: rule__Var___Alternatives : ( ( ( rule__Var___Group_0__0 ) ) | ( ( rule__Var___Group_1__0 ) ) | ( ( rule__Var___Group_2__0 ) ) );
    public final void rule__Var___Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1520:1: ( ( ( rule__Var___Group_0__0 ) ) | ( ( rule__Var___Group_1__0 ) ) | ( ( rule__Var___Group_2__0 ) ) )
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
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalPascal.g:1521:2: ( ( rule__Var___Group_0__0 ) )
                    {
                    // InternalPascal.g:1521:2: ( ( rule__Var___Group_0__0 ) )
                    // InternalPascal.g:1522:3: ( rule__Var___Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVar_Access().getGroup_0()); 
                    }
                    // InternalPascal.g:1523:3: ( rule__Var___Group_0__0 )
                    // InternalPascal.g:1523:4: rule__Var___Group_0__0
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
                    // InternalPascal.g:1527:2: ( ( rule__Var___Group_1__0 ) )
                    {
                    // InternalPascal.g:1527:2: ( ( rule__Var___Group_1__0 ) )
                    // InternalPascal.g:1528:3: ( rule__Var___Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVar_Access().getGroup_1()); 
                    }
                    // InternalPascal.g:1529:3: ( rule__Var___Group_1__0 )
                    // InternalPascal.g:1529:4: rule__Var___Group_1__0
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
                    // InternalPascal.g:1533:2: ( ( rule__Var___Group_2__0 ) )
                    {
                    // InternalPascal.g:1533:2: ( ( rule__Var___Group_2__0 ) )
                    // InternalPascal.g:1534:3: ( rule__Var___Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVar_Access().getGroup_2()); 
                    }
                    // InternalPascal.g:1535:3: ( rule__Var___Group_2__0 )
                    // InternalPascal.g:1535:4: rule__Var___Group_2__0
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
    // InternalPascal.g:1543:1: rule__Expression__Alternatives_1_0 : ( ( ( rule__Expression__OperatorsAssignment_1_0_0 ) ) | ( ( rule__Expression__OperatorsAssignment_1_0_1 ) ) | ( ( rule__Expression__OperatorsAssignment_1_0_2 ) ) );
    public final void rule__Expression__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1547:1: ( ( ( rule__Expression__OperatorsAssignment_1_0_0 ) ) | ( ( rule__Expression__OperatorsAssignment_1_0_1 ) ) | ( ( rule__Expression__OperatorsAssignment_1_0_2 ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_RELATIONAL_OP:
                {
                alt7=1;
                }
                break;
            case 45:
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
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalPascal.g:1548:2: ( ( rule__Expression__OperatorsAssignment_1_0_0 ) )
                    {
                    // InternalPascal.g:1548:2: ( ( rule__Expression__OperatorsAssignment_1_0_0 ) )
                    // InternalPascal.g:1549:3: ( rule__Expression__OperatorsAssignment_1_0_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getOperatorsAssignment_1_0_0()); 
                    }
                    // InternalPascal.g:1550:3: ( rule__Expression__OperatorsAssignment_1_0_0 )
                    // InternalPascal.g:1550:4: rule__Expression__OperatorsAssignment_1_0_0
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
                    // InternalPascal.g:1554:2: ( ( rule__Expression__OperatorsAssignment_1_0_1 ) )
                    {
                    // InternalPascal.g:1554:2: ( ( rule__Expression__OperatorsAssignment_1_0_1 ) )
                    // InternalPascal.g:1555:3: ( rule__Expression__OperatorsAssignment_1_0_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getOperatorsAssignment_1_0_1()); 
                    }
                    // InternalPascal.g:1556:3: ( rule__Expression__OperatorsAssignment_1_0_1 )
                    // InternalPascal.g:1556:4: rule__Expression__OperatorsAssignment_1_0_1
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
                    // InternalPascal.g:1560:2: ( ( rule__Expression__OperatorsAssignment_1_0_2 ) )
                    {
                    // InternalPascal.g:1560:2: ( ( rule__Expression__OperatorsAssignment_1_0_2 ) )
                    // InternalPascal.g:1561:3: ( rule__Expression__OperatorsAssignment_1_0_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getOperatorsAssignment_1_0_2()); 
                    }
                    // InternalPascal.g:1562:3: ( rule__Expression__OperatorsAssignment_1_0_2 )
                    // InternalPascal.g:1562:4: rule__Expression__OperatorsAssignment_1_0_2
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
    // InternalPascal.g:1570:1: rule__Simple_expression__Alternatives_2 : ( ( ( rule__Simple_expression__Group_2_0__0 ) ) | ( ( rule__Simple_expression__TermsAssignment_2_1 ) ) );
    public final void rule__Simple_expression__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1574:1: ( ( ( rule__Simple_expression__Group_2_0__0 ) ) | ( ( rule__Simple_expression__TermsAssignment_2_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ADDITION_OP||LA8_0==46) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_INTEGER_NUMBER||LA8_0==RULE_REAL_NUMBER) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalPascal.g:1575:2: ( ( rule__Simple_expression__Group_2_0__0 ) )
                    {
                    // InternalPascal.g:1575:2: ( ( rule__Simple_expression__Group_2_0__0 ) )
                    // InternalPascal.g:1576:3: ( rule__Simple_expression__Group_2_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimple_expressionAccess().getGroup_2_0()); 
                    }
                    // InternalPascal.g:1577:3: ( rule__Simple_expression__Group_2_0__0 )
                    // InternalPascal.g:1577:4: rule__Simple_expression__Group_2_0__0
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
                    // InternalPascal.g:1581:2: ( ( rule__Simple_expression__TermsAssignment_2_1 ) )
                    {
                    // InternalPascal.g:1581:2: ( ( rule__Simple_expression__TermsAssignment_2_1 ) )
                    // InternalPascal.g:1582:3: ( rule__Simple_expression__TermsAssignment_2_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimple_expressionAccess().getTermsAssignment_2_1()); 
                    }
                    // InternalPascal.g:1583:3: ( rule__Simple_expression__TermsAssignment_2_1 )
                    // InternalPascal.g:1583:4: rule__Simple_expression__TermsAssignment_2_1
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
    // InternalPascal.g:1591:1: rule__Simple_expression__Alternatives_2_0_0 : ( ( ( rule__Simple_expression__OperatorsAssignment_2_0_0_0 ) ) | ( ( rule__Simple_expression__OperatorsAssignment_2_0_0_1 ) ) );
    public final void rule__Simple_expression__Alternatives_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1595:1: ( ( ( rule__Simple_expression__OperatorsAssignment_2_0_0_0 ) ) | ( ( rule__Simple_expression__OperatorsAssignment_2_0_0_1 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ADDITION_OP) ) {
                alt9=1;
            }
            else if ( (LA9_0==46) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalPascal.g:1596:2: ( ( rule__Simple_expression__OperatorsAssignment_2_0_0_0 ) )
                    {
                    // InternalPascal.g:1596:2: ( ( rule__Simple_expression__OperatorsAssignment_2_0_0_0 ) )
                    // InternalPascal.g:1597:3: ( rule__Simple_expression__OperatorsAssignment_2_0_0_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimple_expressionAccess().getOperatorsAssignment_2_0_0_0()); 
                    }
                    // InternalPascal.g:1598:3: ( rule__Simple_expression__OperatorsAssignment_2_0_0_0 )
                    // InternalPascal.g:1598:4: rule__Simple_expression__OperatorsAssignment_2_0_0_0
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
                    // InternalPascal.g:1602:2: ( ( rule__Simple_expression__OperatorsAssignment_2_0_0_1 ) )
                    {
                    // InternalPascal.g:1602:2: ( ( rule__Simple_expression__OperatorsAssignment_2_0_0_1 ) )
                    // InternalPascal.g:1603:3: ( rule__Simple_expression__OperatorsAssignment_2_0_0_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimple_expressionAccess().getOperatorsAssignment_2_0_0_1()); 
                    }
                    // InternalPascal.g:1604:3: ( rule__Simple_expression__OperatorsAssignment_2_0_0_1 )
                    // InternalPascal.g:1604:4: rule__Simple_expression__OperatorsAssignment_2_0_0_1
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
    // InternalPascal.g:1612:1: rule__Term__Alternatives_1_0 : ( ( ( rule__Term__OperatorsAssignment_1_0_0 ) ) | ( ( rule__Term__OperatorsAssignment_1_0_1 ) ) | ( ( rule__Term__OperatorsAssignment_1_0_2 ) ) | ( ( rule__Term__OperatorsAssignment_1_0_3 ) ) );
    public final void rule__Term__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1616:1: ( ( ( rule__Term__OperatorsAssignment_1_0_0 ) ) | ( ( rule__Term__OperatorsAssignment_1_0_1 ) ) | ( ( rule__Term__OperatorsAssignment_1_0_2 ) ) | ( ( rule__Term__OperatorsAssignment_1_0_3 ) ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case RULE_MULTIPLICATION_OP:
                {
                alt10=1;
                }
                break;
            case 47:
                {
                alt10=2;
                }
                break;
            case 48:
                {
                alt10=3;
                }
                break;
            case 49:
                {
                alt10=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalPascal.g:1617:2: ( ( rule__Term__OperatorsAssignment_1_0_0 ) )
                    {
                    // InternalPascal.g:1617:2: ( ( rule__Term__OperatorsAssignment_1_0_0 ) )
                    // InternalPascal.g:1618:3: ( rule__Term__OperatorsAssignment_1_0_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTermAccess().getOperatorsAssignment_1_0_0()); 
                    }
                    // InternalPascal.g:1619:3: ( rule__Term__OperatorsAssignment_1_0_0 )
                    // InternalPascal.g:1619:4: rule__Term__OperatorsAssignment_1_0_0
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
                    // InternalPascal.g:1623:2: ( ( rule__Term__OperatorsAssignment_1_0_1 ) )
                    {
                    // InternalPascal.g:1623:2: ( ( rule__Term__OperatorsAssignment_1_0_1 ) )
                    // InternalPascal.g:1624:3: ( rule__Term__OperatorsAssignment_1_0_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTermAccess().getOperatorsAssignment_1_0_1()); 
                    }
                    // InternalPascal.g:1625:3: ( rule__Term__OperatorsAssignment_1_0_1 )
                    // InternalPascal.g:1625:4: rule__Term__OperatorsAssignment_1_0_1
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
                    // InternalPascal.g:1629:2: ( ( rule__Term__OperatorsAssignment_1_0_2 ) )
                    {
                    // InternalPascal.g:1629:2: ( ( rule__Term__OperatorsAssignment_1_0_2 ) )
                    // InternalPascal.g:1630:3: ( rule__Term__OperatorsAssignment_1_0_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTermAccess().getOperatorsAssignment_1_0_2()); 
                    }
                    // InternalPascal.g:1631:3: ( rule__Term__OperatorsAssignment_1_0_2 )
                    // InternalPascal.g:1631:4: rule__Term__OperatorsAssignment_1_0_2
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
                    // InternalPascal.g:1635:2: ( ( rule__Term__OperatorsAssignment_1_0_3 ) )
                    {
                    // InternalPascal.g:1635:2: ( ( rule__Term__OperatorsAssignment_1_0_3 ) )
                    // InternalPascal.g:1636:3: ( rule__Term__OperatorsAssignment_1_0_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTermAccess().getOperatorsAssignment_1_0_3()); 
                    }
                    // InternalPascal.g:1637:3: ( rule__Term__OperatorsAssignment_1_0_3 )
                    // InternalPascal.g:1637:4: rule__Term__OperatorsAssignment_1_0_3
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
    // InternalPascal.g:1645:1: rule__Factor__Alternatives : ( ( ( rule__Factor__VariableAssignment_0 ) ) | ( ( rule__Factor__NumberAssignment_1 ) ) | ( ( rule__Factor__StringAssignment_2 ) ) | ( ( rule__Factor__SetAssignment_3 ) ) | ( ( rule__Factor__NilAssignment_4 ) ) | ( ( rule__Factor__BooleanAssignment_5 ) ) | ( ( rule__Factor__BooleanAssignment_6 ) ) | ( ( rule__Factor__Group_7__0 ) ) | ( ( rule__Factor__Group_8__0 ) ) );
    public final void rule__Factor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1649:1: ( ( ( rule__Factor__VariableAssignment_0 ) ) | ( ( rule__Factor__NumberAssignment_1 ) ) | ( ( rule__Factor__StringAssignment_2 ) ) | ( ( rule__Factor__SetAssignment_3 ) ) | ( ( rule__Factor__NilAssignment_4 ) ) | ( ( rule__Factor__BooleanAssignment_5 ) ) | ( ( rule__Factor__BooleanAssignment_6 ) ) | ( ( rule__Factor__Group_7__0 ) ) | ( ( rule__Factor__Group_8__0 ) ) )
            int alt11=9;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt11=1;
                }
                break;
            case RULE_SIGNED_INTEGER_NUMBER:
            case RULE_INTEGER_NUMBER:
            case RULE_SIGNED_REAL_NUMBER:
            case RULE_REAL_NUMBER:
                {
                alt11=2;
                }
                break;
            case RULE_STRING:
                {
                alt11=3;
                }
                break;
            case 29:
                {
                alt11=4;
                }
                break;
            case 50:
                {
                alt11=5;
                }
                break;
            case 51:
                {
                alt11=6;
                }
                break;
            case 52:
                {
                alt11=7;
                }
                break;
            case 33:
                {
                alt11=8;
                }
                break;
            case 35:
                {
                alt11=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalPascal.g:1650:2: ( ( rule__Factor__VariableAssignment_0 ) )
                    {
                    // InternalPascal.g:1650:2: ( ( rule__Factor__VariableAssignment_0 ) )
                    // InternalPascal.g:1651:3: ( rule__Factor__VariableAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFactorAccess().getVariableAssignment_0()); 
                    }
                    // InternalPascal.g:1652:3: ( rule__Factor__VariableAssignment_0 )
                    // InternalPascal.g:1652:4: rule__Factor__VariableAssignment_0
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
                    // InternalPascal.g:1656:2: ( ( rule__Factor__NumberAssignment_1 ) )
                    {
                    // InternalPascal.g:1656:2: ( ( rule__Factor__NumberAssignment_1 ) )
                    // InternalPascal.g:1657:3: ( rule__Factor__NumberAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFactorAccess().getNumberAssignment_1()); 
                    }
                    // InternalPascal.g:1658:3: ( rule__Factor__NumberAssignment_1 )
                    // InternalPascal.g:1658:4: rule__Factor__NumberAssignment_1
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
                    // InternalPascal.g:1662:2: ( ( rule__Factor__StringAssignment_2 ) )
                    {
                    // InternalPascal.g:1662:2: ( ( rule__Factor__StringAssignment_2 ) )
                    // InternalPascal.g:1663:3: ( rule__Factor__StringAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFactorAccess().getStringAssignment_2()); 
                    }
                    // InternalPascal.g:1664:3: ( rule__Factor__StringAssignment_2 )
                    // InternalPascal.g:1664:4: rule__Factor__StringAssignment_2
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
                    // InternalPascal.g:1668:2: ( ( rule__Factor__SetAssignment_3 ) )
                    {
                    // InternalPascal.g:1668:2: ( ( rule__Factor__SetAssignment_3 ) )
                    // InternalPascal.g:1669:3: ( rule__Factor__SetAssignment_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFactorAccess().getSetAssignment_3()); 
                    }
                    // InternalPascal.g:1670:3: ( rule__Factor__SetAssignment_3 )
                    // InternalPascal.g:1670:4: rule__Factor__SetAssignment_3
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
                    // InternalPascal.g:1674:2: ( ( rule__Factor__NilAssignment_4 ) )
                    {
                    // InternalPascal.g:1674:2: ( ( rule__Factor__NilAssignment_4 ) )
                    // InternalPascal.g:1675:3: ( rule__Factor__NilAssignment_4 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFactorAccess().getNilAssignment_4()); 
                    }
                    // InternalPascal.g:1676:3: ( rule__Factor__NilAssignment_4 )
                    // InternalPascal.g:1676:4: rule__Factor__NilAssignment_4
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
                    // InternalPascal.g:1680:2: ( ( rule__Factor__BooleanAssignment_5 ) )
                    {
                    // InternalPascal.g:1680:2: ( ( rule__Factor__BooleanAssignment_5 ) )
                    // InternalPascal.g:1681:3: ( rule__Factor__BooleanAssignment_5 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFactorAccess().getBooleanAssignment_5()); 
                    }
                    // InternalPascal.g:1682:3: ( rule__Factor__BooleanAssignment_5 )
                    // InternalPascal.g:1682:4: rule__Factor__BooleanAssignment_5
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
                    // InternalPascal.g:1686:2: ( ( rule__Factor__BooleanAssignment_6 ) )
                    {
                    // InternalPascal.g:1686:2: ( ( rule__Factor__BooleanAssignment_6 ) )
                    // InternalPascal.g:1687:3: ( rule__Factor__BooleanAssignment_6 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFactorAccess().getBooleanAssignment_6()); 
                    }
                    // InternalPascal.g:1688:3: ( rule__Factor__BooleanAssignment_6 )
                    // InternalPascal.g:1688:4: rule__Factor__BooleanAssignment_6
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
                    // InternalPascal.g:1692:2: ( ( rule__Factor__Group_7__0 ) )
                    {
                    // InternalPascal.g:1692:2: ( ( rule__Factor__Group_7__0 ) )
                    // InternalPascal.g:1693:3: ( rule__Factor__Group_7__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFactorAccess().getGroup_7()); 
                    }
                    // InternalPascal.g:1694:3: ( rule__Factor__Group_7__0 )
                    // InternalPascal.g:1694:4: rule__Factor__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__Group_7__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFactorAccess().getGroup_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalPascal.g:1698:2: ( ( rule__Factor__Group_8__0 ) )
                    {
                    // InternalPascal.g:1698:2: ( ( rule__Factor__Group_8__0 ) )
                    // InternalPascal.g:1699:3: ( rule__Factor__Group_8__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFactorAccess().getGroup_8()); 
                    }
                    // InternalPascal.g:1700:3: ( rule__Factor__Group_8__0 )
                    // InternalPascal.g:1700:4: rule__Factor__Group_8__0
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

            }
        }
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


    // $ANTLR start "rule__Formal_parameter_section__Alternatives"
    // InternalPascal.g:1708:1: rule__Formal_parameter_section__Alternatives : ( ( ( rule__Formal_parameter_section__ValueAssignment_0 ) ) | ( ( rule__Formal_parameter_section__VariableAssignment_1 ) ) | ( ( rule__Formal_parameter_section__ProcedureAssignment_2 ) ) );
    public final void rule__Formal_parameter_section__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1712:1: ( ( ( rule__Formal_parameter_section__ValueAssignment_0 ) ) | ( ( rule__Formal_parameter_section__VariableAssignment_1 ) ) | ( ( rule__Formal_parameter_section__ProcedureAssignment_2 ) ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt12=1;
                }
                break;
            case 37:
                {
                alt12=2;
                }
                break;
            case 36:
                {
                alt12=3;
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
                    // InternalPascal.g:1713:2: ( ( rule__Formal_parameter_section__ValueAssignment_0 ) )
                    {
                    // InternalPascal.g:1713:2: ( ( rule__Formal_parameter_section__ValueAssignment_0 ) )
                    // InternalPascal.g:1714:3: ( rule__Formal_parameter_section__ValueAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFormal_parameter_sectionAccess().getValueAssignment_0()); 
                    }
                    // InternalPascal.g:1715:3: ( rule__Formal_parameter_section__ValueAssignment_0 )
                    // InternalPascal.g:1715:4: rule__Formal_parameter_section__ValueAssignment_0
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
                    // InternalPascal.g:1719:2: ( ( rule__Formal_parameter_section__VariableAssignment_1 ) )
                    {
                    // InternalPascal.g:1719:2: ( ( rule__Formal_parameter_section__VariableAssignment_1 ) )
                    // InternalPascal.g:1720:3: ( rule__Formal_parameter_section__VariableAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFormal_parameter_sectionAccess().getVariableAssignment_1()); 
                    }
                    // InternalPascal.g:1721:3: ( rule__Formal_parameter_section__VariableAssignment_1 )
                    // InternalPascal.g:1721:4: rule__Formal_parameter_section__VariableAssignment_1
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
                    // InternalPascal.g:1725:2: ( ( rule__Formal_parameter_section__ProcedureAssignment_2 ) )
                    {
                    // InternalPascal.g:1725:2: ( ( rule__Formal_parameter_section__ProcedureAssignment_2 ) )
                    // InternalPascal.g:1726:3: ( rule__Formal_parameter_section__ProcedureAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFormal_parameter_sectionAccess().getProcedureAssignment_2()); 
                    }
                    // InternalPascal.g:1727:3: ( rule__Formal_parameter_section__ProcedureAssignment_2 )
                    // InternalPascal.g:1727:4: rule__Formal_parameter_section__ProcedureAssignment_2
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

            }
        }
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
    // InternalPascal.g:1735:1: rule__Any_number__Alternatives : ( ( ruleunsigned_number ) | ( rulesigned_number ) );
    public final void rule__Any_number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1739:1: ( ( ruleunsigned_number ) | ( rulesigned_number ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INTEGER_NUMBER||LA13_0==RULE_REAL_NUMBER) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_SIGNED_INTEGER_NUMBER||LA13_0==RULE_SIGNED_REAL_NUMBER) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalPascal.g:1740:2: ( ruleunsigned_number )
                    {
                    // InternalPascal.g:1740:2: ( ruleunsigned_number )
                    // InternalPascal.g:1741:3: ruleunsigned_number
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
                    // InternalPascal.g:1746:2: ( rulesigned_number )
                    {
                    // InternalPascal.g:1746:2: ( rulesigned_number )
                    // InternalPascal.g:1747:3: rulesigned_number
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
    // InternalPascal.g:1756:1: rule__Constant__Alternatives : ( ( ( rule__Constant__Group_0__0 ) ) | ( ( rule__Constant__StringAssignment_1 ) ) | ( ( rule__Constant__BoolLiteralAssignment_2 ) ) | ( ( rule__Constant__BoolLiteralAssignment_3 ) ) );
    public final void rule__Constant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1760:1: ( ( ( rule__Constant__Group_0__0 ) ) | ( ( rule__Constant__StringAssignment_1 ) ) | ( ( rule__Constant__BoolLiteralAssignment_2 ) ) | ( ( rule__Constant__BoolLiteralAssignment_3 ) ) )
            int alt14=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_SIGNED_INTEGER_NUMBER:
            case RULE_INTEGER_NUMBER:
            case RULE_ADDITION_OP:
            case RULE_SIGNED_REAL_NUMBER:
            case RULE_REAL_NUMBER:
                {
                alt14=1;
                }
                break;
            case RULE_STRING:
                {
                alt14=2;
                }
                break;
            case 51:
                {
                alt14=3;
                }
                break;
            case 52:
                {
                alt14=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalPascal.g:1761:2: ( ( rule__Constant__Group_0__0 ) )
                    {
                    // InternalPascal.g:1761:2: ( ( rule__Constant__Group_0__0 ) )
                    // InternalPascal.g:1762:3: ( rule__Constant__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConstantAccess().getGroup_0()); 
                    }
                    // InternalPascal.g:1763:3: ( rule__Constant__Group_0__0 )
                    // InternalPascal.g:1763:4: rule__Constant__Group_0__0
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
                    // InternalPascal.g:1767:2: ( ( rule__Constant__StringAssignment_1 ) )
                    {
                    // InternalPascal.g:1767:2: ( ( rule__Constant__StringAssignment_1 ) )
                    // InternalPascal.g:1768:3: ( rule__Constant__StringAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConstantAccess().getStringAssignment_1()); 
                    }
                    // InternalPascal.g:1769:3: ( rule__Constant__StringAssignment_1 )
                    // InternalPascal.g:1769:4: rule__Constant__StringAssignment_1
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
                    // InternalPascal.g:1773:2: ( ( rule__Constant__BoolLiteralAssignment_2 ) )
                    {
                    // InternalPascal.g:1773:2: ( ( rule__Constant__BoolLiteralAssignment_2 ) )
                    // InternalPascal.g:1774:3: ( rule__Constant__BoolLiteralAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConstantAccess().getBoolLiteralAssignment_2()); 
                    }
                    // InternalPascal.g:1775:3: ( rule__Constant__BoolLiteralAssignment_2 )
                    // InternalPascal.g:1775:4: rule__Constant__BoolLiteralAssignment_2
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
                    // InternalPascal.g:1779:2: ( ( rule__Constant__BoolLiteralAssignment_3 ) )
                    {
                    // InternalPascal.g:1779:2: ( ( rule__Constant__BoolLiteralAssignment_3 ) )
                    // InternalPascal.g:1780:3: ( rule__Constant__BoolLiteralAssignment_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConstantAccess().getBoolLiteralAssignment_3()); 
                    }
                    // InternalPascal.g:1781:3: ( rule__Constant__BoolLiteralAssignment_3 )
                    // InternalPascal.g:1781:4: rule__Constant__BoolLiteralAssignment_3
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
    // InternalPascal.g:1789:1: rule__Constant__Alternatives_0_1 : ( ( ( rule__Constant__NameAssignment_0_1_0 ) ) | ( ( rule__Constant__NumberAssignment_0_1_1 ) ) );
    public final void rule__Constant__Alternatives_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1793:1: ( ( ( rule__Constant__NameAssignment_0_1_0 ) ) | ( ( rule__Constant__NumberAssignment_0_1_1 ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            else if ( ((LA15_0>=RULE_SIGNED_INTEGER_NUMBER && LA15_0<=RULE_INTEGER_NUMBER)||(LA15_0>=RULE_SIGNED_REAL_NUMBER && LA15_0<=RULE_REAL_NUMBER)) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalPascal.g:1794:2: ( ( rule__Constant__NameAssignment_0_1_0 ) )
                    {
                    // InternalPascal.g:1794:2: ( ( rule__Constant__NameAssignment_0_1_0 ) )
                    // InternalPascal.g:1795:3: ( rule__Constant__NameAssignment_0_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConstantAccess().getNameAssignment_0_1_0()); 
                    }
                    // InternalPascal.g:1796:3: ( rule__Constant__NameAssignment_0_1_0 )
                    // InternalPascal.g:1796:4: rule__Constant__NameAssignment_0_1_0
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
                    // InternalPascal.g:1800:2: ( ( rule__Constant__NumberAssignment_0_1_1 ) )
                    {
                    // InternalPascal.g:1800:2: ( ( rule__Constant__NumberAssignment_0_1_1 ) )
                    // InternalPascal.g:1801:3: ( rule__Constant__NumberAssignment_0_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConstantAccess().getNumberAssignment_0_1_1()); 
                    }
                    // InternalPascal.g:1802:3: ( rule__Constant__NumberAssignment_0_1_1 )
                    // InternalPascal.g:1802:4: rule__Constant__NumberAssignment_0_1_1
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
    // InternalPascal.g:1810:1: rule__Type__Alternatives : ( ( ( rule__Type__SimpleAssignment_0 ) ) | ( ( rule__Type__StructuredAssignment_1 ) ) | ( ( rule__Type__PointerAssignment_2 ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1814:1: ( ( ( rule__Type__SimpleAssignment_0 ) ) | ( ( rule__Type__StructuredAssignment_1 ) ) | ( ( rule__Type__PointerAssignment_2 ) ) )
            int alt16=3;
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
            case 51:
            case 52:
                {
                alt16=1;
                }
                break;
            case 53:
            case 54:
                {
                alt16=2;
                }
                break;
            case 31:
                {
                alt16=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalPascal.g:1815:2: ( ( rule__Type__SimpleAssignment_0 ) )
                    {
                    // InternalPascal.g:1815:2: ( ( rule__Type__SimpleAssignment_0 ) )
                    // InternalPascal.g:1816:3: ( rule__Type__SimpleAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getSimpleAssignment_0()); 
                    }
                    // InternalPascal.g:1817:3: ( rule__Type__SimpleAssignment_0 )
                    // InternalPascal.g:1817:4: rule__Type__SimpleAssignment_0
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
                    // InternalPascal.g:1821:2: ( ( rule__Type__StructuredAssignment_1 ) )
                    {
                    // InternalPascal.g:1821:2: ( ( rule__Type__StructuredAssignment_1 ) )
                    // InternalPascal.g:1822:3: ( rule__Type__StructuredAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getStructuredAssignment_1()); 
                    }
                    // InternalPascal.g:1823:3: ( rule__Type__StructuredAssignment_1 )
                    // InternalPascal.g:1823:4: rule__Type__StructuredAssignment_1
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
                    // InternalPascal.g:1827:2: ( ( rule__Type__PointerAssignment_2 ) )
                    {
                    // InternalPascal.g:1827:2: ( ( rule__Type__PointerAssignment_2 ) )
                    // InternalPascal.g:1828:3: ( rule__Type__PointerAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getPointerAssignment_2()); 
                    }
                    // InternalPascal.g:1829:3: ( rule__Type__PointerAssignment_2 )
                    // InternalPascal.g:1829:4: rule__Type__PointerAssignment_2
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
    // InternalPascal.g:1837:1: rule__Simple_type__Alternatives : ( ( ( rule__Simple_type__SubrangeAssignment_0 ) ) | ( ( rule__Simple_type__EnumeratedAssignment_1 ) ) | ( ( rule__Simple_type__NameAssignment_2 ) ) );
    public final void rule__Simple_type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1841:1: ( ( ( rule__Simple_type__SubrangeAssignment_0 ) ) | ( ( rule__Simple_type__EnumeratedAssignment_1 ) ) | ( ( rule__Simple_type__NameAssignment_2 ) ) )
            int alt17=3;
            switch ( input.LA(1) ) {
            case RULE_SIGNED_INTEGER_NUMBER:
            case RULE_INTEGER_NUMBER:
            case RULE_ADDITION_OP:
            case RULE_STRING:
            case RULE_NUMERIC_SUBRANGE:
            case RULE_SIGNED_REAL_NUMBER:
            case RULE_REAL_NUMBER:
            case 51:
            case 52:
                {
                alt17=1;
                }
                break;
            case RULE_ID:
                {
                int LA17_2 = input.LA(2);

                if ( (LA17_2==EOF||LA17_2==24||LA17_2==26||LA17_2==34) ) {
                    alt17=3;
                }
                else if ( (LA17_2==42) ) {
                    alt17=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 2, input);

                    throw nvae;
                }
                }
                break;
            case 33:
                {
                alt17=2;
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
                    // InternalPascal.g:1842:2: ( ( rule__Simple_type__SubrangeAssignment_0 ) )
                    {
                    // InternalPascal.g:1842:2: ( ( rule__Simple_type__SubrangeAssignment_0 ) )
                    // InternalPascal.g:1843:3: ( rule__Simple_type__SubrangeAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimple_typeAccess().getSubrangeAssignment_0()); 
                    }
                    // InternalPascal.g:1844:3: ( rule__Simple_type__SubrangeAssignment_0 )
                    // InternalPascal.g:1844:4: rule__Simple_type__SubrangeAssignment_0
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
                    // InternalPascal.g:1848:2: ( ( rule__Simple_type__EnumeratedAssignment_1 ) )
                    {
                    // InternalPascal.g:1848:2: ( ( rule__Simple_type__EnumeratedAssignment_1 ) )
                    // InternalPascal.g:1849:3: ( rule__Simple_type__EnumeratedAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimple_typeAccess().getEnumeratedAssignment_1()); 
                    }
                    // InternalPascal.g:1850:3: ( rule__Simple_type__EnumeratedAssignment_1 )
                    // InternalPascal.g:1850:4: rule__Simple_type__EnumeratedAssignment_1
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
                    // InternalPascal.g:1854:2: ( ( rule__Simple_type__NameAssignment_2 ) )
                    {
                    // InternalPascal.g:1854:2: ( ( rule__Simple_type__NameAssignment_2 ) )
                    // InternalPascal.g:1855:3: ( rule__Simple_type__NameAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimple_typeAccess().getNameAssignment_2()); 
                    }
                    // InternalPascal.g:1856:3: ( rule__Simple_type__NameAssignment_2 )
                    // InternalPascal.g:1856:4: rule__Simple_type__NameAssignment_2
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
    // InternalPascal.g:1864:1: rule__Subrange_type__Alternatives : ( ( ( rule__Subrange_type__Group_0__0 ) ) | ( ( rule__Subrange_type__Group_1__0 ) ) );
    public final void rule__Subrange_type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1868:1: ( ( ( rule__Subrange_type__Group_0__0 ) ) | ( ( rule__Subrange_type__Group_1__0 ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_ID && LA18_0<=RULE_INTEGER_NUMBER)||LA18_0==RULE_ADDITION_OP||LA18_0==RULE_STRING||(LA18_0>=RULE_SIGNED_REAL_NUMBER && LA18_0<=RULE_REAL_NUMBER)||(LA18_0>=51 && LA18_0<=52)) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_NUMERIC_SUBRANGE) ) {
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
                    // InternalPascal.g:1869:2: ( ( rule__Subrange_type__Group_0__0 ) )
                    {
                    // InternalPascal.g:1869:2: ( ( rule__Subrange_type__Group_0__0 ) )
                    // InternalPascal.g:1870:3: ( rule__Subrange_type__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSubrange_typeAccess().getGroup_0()); 
                    }
                    // InternalPascal.g:1871:3: ( rule__Subrange_type__Group_0__0 )
                    // InternalPascal.g:1871:4: rule__Subrange_type__Group_0__0
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
                    // InternalPascal.g:1875:2: ( ( rule__Subrange_type__Group_1__0 ) )
                    {
                    // InternalPascal.g:1875:2: ( ( rule__Subrange_type__Group_1__0 ) )
                    // InternalPascal.g:1876:3: ( rule__Subrange_type__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSubrange_typeAccess().getGroup_1()); 
                    }
                    // InternalPascal.g:1877:3: ( rule__Subrange_type__Group_1__0 )
                    // InternalPascal.g:1877:4: rule__Subrange_type__Group_1__0
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
    // InternalPascal.g:1885:1: rule__Field_list__Alternatives_0 : ( ( ( rule__Field_list__Group_0_0__0 ) ) | ( ( rule__Field_list__VariantsAssignment_0_1 ) ) );
    public final void rule__Field_list__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1889:1: ( ( ( rule__Field_list__Group_0_0__0 ) ) | ( ( rule__Field_list__VariantsAssignment_0_1 ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            else if ( (LA19_0==43) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalPascal.g:1890:2: ( ( rule__Field_list__Group_0_0__0 ) )
                    {
                    // InternalPascal.g:1890:2: ( ( rule__Field_list__Group_0_0__0 ) )
                    // InternalPascal.g:1891:3: ( rule__Field_list__Group_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getField_listAccess().getGroup_0_0()); 
                    }
                    // InternalPascal.g:1892:3: ( rule__Field_list__Group_0_0__0 )
                    // InternalPascal.g:1892:4: rule__Field_list__Group_0_0__0
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
                    // InternalPascal.g:1896:2: ( ( rule__Field_list__VariantsAssignment_0_1 ) )
                    {
                    // InternalPascal.g:1896:2: ( ( rule__Field_list__VariantsAssignment_0_1 ) )
                    // InternalPascal.g:1897:3: ( rule__Field_list__VariantsAssignment_0_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getField_listAccess().getVariantsAssignment_0_1()); 
                    }
                    // InternalPascal.g:1898:3: ( rule__Field_list__VariantsAssignment_0_1 )
                    // InternalPascal.g:1898:4: rule__Field_list__VariantsAssignment_0_1
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
    // InternalPascal.g:1906:1: rule__Signed_number__Alternatives : ( ( ( rule__Signed_number__IntegerAssignment_0 ) ) | ( ( rule__Signed_number__RealAssignment_1 ) ) );
    public final void rule__Signed_number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1910:1: ( ( ( rule__Signed_number__IntegerAssignment_0 ) ) | ( ( rule__Signed_number__RealAssignment_1 ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_SIGNED_INTEGER_NUMBER) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_SIGNED_REAL_NUMBER) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalPascal.g:1911:2: ( ( rule__Signed_number__IntegerAssignment_0 ) )
                    {
                    // InternalPascal.g:1911:2: ( ( rule__Signed_number__IntegerAssignment_0 ) )
                    // InternalPascal.g:1912:3: ( rule__Signed_number__IntegerAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSigned_numberAccess().getIntegerAssignment_0()); 
                    }
                    // InternalPascal.g:1913:3: ( rule__Signed_number__IntegerAssignment_0 )
                    // InternalPascal.g:1913:4: rule__Signed_number__IntegerAssignment_0
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
                    // InternalPascal.g:1917:2: ( ( rule__Signed_number__RealAssignment_1 ) )
                    {
                    // InternalPascal.g:1917:2: ( ( rule__Signed_number__RealAssignment_1 ) )
                    // InternalPascal.g:1918:3: ( rule__Signed_number__RealAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSigned_numberAccess().getRealAssignment_1()); 
                    }
                    // InternalPascal.g:1919:3: ( rule__Signed_number__RealAssignment_1 )
                    // InternalPascal.g:1919:4: rule__Signed_number__RealAssignment_1
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
    // InternalPascal.g:1927:1: rule__Unsigned_number__Alternatives : ( ( ( rule__Unsigned_number__IntegerAssignment_0 ) ) | ( ( rule__Unsigned_number__RealAssignment_1 ) ) );
    public final void rule__Unsigned_number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1931:1: ( ( ( rule__Unsigned_number__IntegerAssignment_0 ) ) | ( ( rule__Unsigned_number__RealAssignment_1 ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_INTEGER_NUMBER) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_REAL_NUMBER) ) {
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
                    // InternalPascal.g:1932:2: ( ( rule__Unsigned_number__IntegerAssignment_0 ) )
                    {
                    // InternalPascal.g:1932:2: ( ( rule__Unsigned_number__IntegerAssignment_0 ) )
                    // InternalPascal.g:1933:3: ( rule__Unsigned_number__IntegerAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnsigned_numberAccess().getIntegerAssignment_0()); 
                    }
                    // InternalPascal.g:1934:3: ( rule__Unsigned_number__IntegerAssignment_0 )
                    // InternalPascal.g:1934:4: rule__Unsigned_number__IntegerAssignment_0
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
                    // InternalPascal.g:1938:2: ( ( rule__Unsigned_number__RealAssignment_1 ) )
                    {
                    // InternalPascal.g:1938:2: ( ( rule__Unsigned_number__RealAssignment_1 ) )
                    // InternalPascal.g:1939:3: ( rule__Unsigned_number__RealAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnsigned_numberAccess().getRealAssignment_1()); 
                    }
                    // InternalPascal.g:1940:3: ( rule__Unsigned_number__RealAssignment_1 )
                    // InternalPascal.g:1940:4: rule__Unsigned_number__RealAssignment_1
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
    // InternalPascal.g:1948:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1952:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalPascal.g:1953:2: rule__Program__Group__0__Impl rule__Program__Group__1
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
    // InternalPascal.g:1960:1: rule__Program__Group__0__Impl : ( ( rule__Program__HeadingAssignment_0 ) ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1964:1: ( ( ( rule__Program__HeadingAssignment_0 ) ) )
            // InternalPascal.g:1965:1: ( ( rule__Program__HeadingAssignment_0 ) )
            {
            // InternalPascal.g:1965:1: ( ( rule__Program__HeadingAssignment_0 ) )
            // InternalPascal.g:1966:2: ( rule__Program__HeadingAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getHeadingAssignment_0()); 
            }
            // InternalPascal.g:1967:2: ( rule__Program__HeadingAssignment_0 )
            // InternalPascal.g:1967:3: rule__Program__HeadingAssignment_0
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
    // InternalPascal.g:1975:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1979:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // InternalPascal.g:1980:2: rule__Program__Group__1__Impl rule__Program__Group__2
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
    // InternalPascal.g:1987:1: rule__Program__Group__1__Impl : ( ( rule__Program__BlockAssignment_1 ) ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1991:1: ( ( ( rule__Program__BlockAssignment_1 ) ) )
            // InternalPascal.g:1992:1: ( ( rule__Program__BlockAssignment_1 ) )
            {
            // InternalPascal.g:1992:1: ( ( rule__Program__BlockAssignment_1 ) )
            // InternalPascal.g:1993:2: ( rule__Program__BlockAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getBlockAssignment_1()); 
            }
            // InternalPascal.g:1994:2: ( rule__Program__BlockAssignment_1 )
            // InternalPascal.g:1994:3: rule__Program__BlockAssignment_1
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
    // InternalPascal.g:2002:1: rule__Program__Group__2 : rule__Program__Group__2__Impl ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2006:1: ( rule__Program__Group__2__Impl )
            // InternalPascal.g:2007:2: rule__Program__Group__2__Impl
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
    // InternalPascal.g:2013:1: rule__Program__Group__2__Impl : ( '.' ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2017:1: ( ( '.' ) )
            // InternalPascal.g:2018:1: ( '.' )
            {
            // InternalPascal.g:2018:1: ( '.' )
            // InternalPascal.g:2019:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getFullStopKeyword_2()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:2029:1: rule__Program_heading_block__Group__0 : rule__Program_heading_block__Group__0__Impl rule__Program_heading_block__Group__1 ;
    public final void rule__Program_heading_block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2033:1: ( rule__Program_heading_block__Group__0__Impl rule__Program_heading_block__Group__1 )
            // InternalPascal.g:2034:2: rule__Program_heading_block__Group__0__Impl rule__Program_heading_block__Group__1
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
    // InternalPascal.g:2041:1: rule__Program_heading_block__Group__0__Impl : ( 'program' ) ;
    public final void rule__Program_heading_block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2045:1: ( ( 'program' ) )
            // InternalPascal.g:2046:1: ( 'program' )
            {
            // InternalPascal.g:2046:1: ( 'program' )
            // InternalPascal.g:2047:2: 'program'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgram_heading_blockAccess().getProgramKeyword_0()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:2056:1: rule__Program_heading_block__Group__1 : rule__Program_heading_block__Group__1__Impl rule__Program_heading_block__Group__2 ;
    public final void rule__Program_heading_block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2060:1: ( rule__Program_heading_block__Group__1__Impl rule__Program_heading_block__Group__2 )
            // InternalPascal.g:2061:2: rule__Program_heading_block__Group__1__Impl rule__Program_heading_block__Group__2
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
    // InternalPascal.g:2068:1: rule__Program_heading_block__Group__1__Impl : ( ( rule__Program_heading_block__NameAssignment_1 ) ) ;
    public final void rule__Program_heading_block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2072:1: ( ( ( rule__Program_heading_block__NameAssignment_1 ) ) )
            // InternalPascal.g:2073:1: ( ( rule__Program_heading_block__NameAssignment_1 ) )
            {
            // InternalPascal.g:2073:1: ( ( rule__Program_heading_block__NameAssignment_1 ) )
            // InternalPascal.g:2074:2: ( rule__Program_heading_block__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgram_heading_blockAccess().getNameAssignment_1()); 
            }
            // InternalPascal.g:2075:2: ( rule__Program_heading_block__NameAssignment_1 )
            // InternalPascal.g:2075:3: rule__Program_heading_block__NameAssignment_1
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
    // InternalPascal.g:2083:1: rule__Program_heading_block__Group__2 : rule__Program_heading_block__Group__2__Impl ;
    public final void rule__Program_heading_block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2087:1: ( rule__Program_heading_block__Group__2__Impl )
            // InternalPascal.g:2088:2: rule__Program_heading_block__Group__2__Impl
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
    // InternalPascal.g:2094:1: rule__Program_heading_block__Group__2__Impl : ( ';' ) ;
    public final void rule__Program_heading_block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2098:1: ( ( ';' ) )
            // InternalPascal.g:2099:1: ( ';' )
            {
            // InternalPascal.g:2099:1: ( ';' )
            // InternalPascal.g:2100:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgram_heading_blockAccess().getSemicolonKeyword_2()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:2110:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2114:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // InternalPascal.g:2115:2: rule__Block__Group__0__Impl rule__Block__Group__1
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
    // InternalPascal.g:2122:1: rule__Block__Group__0__Impl : ( ( rule__Block__LabelAssignment_0 )? ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2126:1: ( ( ( rule__Block__LabelAssignment_0 )? ) )
            // InternalPascal.g:2127:1: ( ( rule__Block__LabelAssignment_0 )? )
            {
            // InternalPascal.g:2127:1: ( ( rule__Block__LabelAssignment_0 )? )
            // InternalPascal.g:2128:2: ( rule__Block__LabelAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getLabelAssignment_0()); 
            }
            // InternalPascal.g:2129:2: ( rule__Block__LabelAssignment_0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==38) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalPascal.g:2129:3: rule__Block__LabelAssignment_0
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
    // InternalPascal.g:2137:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2141:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // InternalPascal.g:2142:2: rule__Block__Group__1__Impl rule__Block__Group__2
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
    // InternalPascal.g:2149:1: rule__Block__Group__1__Impl : ( ( rule__Block__TypeAssignment_1 )? ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2153:1: ( ( ( rule__Block__TypeAssignment_1 )? ) )
            // InternalPascal.g:2154:1: ( ( rule__Block__TypeAssignment_1 )? )
            {
            // InternalPascal.g:2154:1: ( ( rule__Block__TypeAssignment_1 )? )
            // InternalPascal.g:2155:2: ( rule__Block__TypeAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getTypeAssignment_1()); 
            }
            // InternalPascal.g:2156:2: ( rule__Block__TypeAssignment_1 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==41) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalPascal.g:2156:3: rule__Block__TypeAssignment_1
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
    // InternalPascal.g:2164:1: rule__Block__Group__2 : rule__Block__Group__2__Impl rule__Block__Group__3 ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2168:1: ( rule__Block__Group__2__Impl rule__Block__Group__3 )
            // InternalPascal.g:2169:2: rule__Block__Group__2__Impl rule__Block__Group__3
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
    // InternalPascal.g:2176:1: rule__Block__Group__2__Impl : ( ( rule__Block__VariableAssignment_2 )? ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2180:1: ( ( ( rule__Block__VariableAssignment_2 )? ) )
            // InternalPascal.g:2181:1: ( ( rule__Block__VariableAssignment_2 )? )
            {
            // InternalPascal.g:2181:1: ( ( rule__Block__VariableAssignment_2 )? )
            // InternalPascal.g:2182:2: ( rule__Block__VariableAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getVariableAssignment_2()); 
            }
            // InternalPascal.g:2183:2: ( rule__Block__VariableAssignment_2 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==37) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalPascal.g:2183:3: rule__Block__VariableAssignment_2
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
    // InternalPascal.g:2191:1: rule__Block__Group__3 : rule__Block__Group__3__Impl rule__Block__Group__4 ;
    public final void rule__Block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2195:1: ( rule__Block__Group__3__Impl rule__Block__Group__4 )
            // InternalPascal.g:2196:2: rule__Block__Group__3__Impl rule__Block__Group__4
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
    // InternalPascal.g:2203:1: rule__Block__Group__3__Impl : ( ( rule__Block__ConstantAssignment_3 )? ) ;
    public final void rule__Block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2207:1: ( ( ( rule__Block__ConstantAssignment_3 )? ) )
            // InternalPascal.g:2208:1: ( ( rule__Block__ConstantAssignment_3 )? )
            {
            // InternalPascal.g:2208:1: ( ( rule__Block__ConstantAssignment_3 )? )
            // InternalPascal.g:2209:2: ( rule__Block__ConstantAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getConstantAssignment_3()); 
            }
            // InternalPascal.g:2210:2: ( rule__Block__ConstantAssignment_3 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==39) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalPascal.g:2210:3: rule__Block__ConstantAssignment_3
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
    // InternalPascal.g:2218:1: rule__Block__Group__4 : rule__Block__Group__4__Impl rule__Block__Group__5 ;
    public final void rule__Block__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2222:1: ( rule__Block__Group__4__Impl rule__Block__Group__5 )
            // InternalPascal.g:2223:2: rule__Block__Group__4__Impl rule__Block__Group__5
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
    // InternalPascal.g:2230:1: rule__Block__Group__4__Impl : ( ( rule__Block__AbstractionAssignment_4 )? ) ;
    public final void rule__Block__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2234:1: ( ( ( rule__Block__AbstractionAssignment_4 )? ) )
            // InternalPascal.g:2235:1: ( ( rule__Block__AbstractionAssignment_4 )? )
            {
            // InternalPascal.g:2235:1: ( ( rule__Block__AbstractionAssignment_4 )? )
            // InternalPascal.g:2236:2: ( rule__Block__AbstractionAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getAbstractionAssignment_4()); 
            }
            // InternalPascal.g:2237:2: ( rule__Block__AbstractionAssignment_4 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==36) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalPascal.g:2237:3: rule__Block__AbstractionAssignment_4
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
    // InternalPascal.g:2245:1: rule__Block__Group__5 : rule__Block__Group__5__Impl ;
    public final void rule__Block__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2249:1: ( rule__Block__Group__5__Impl )
            // InternalPascal.g:2250:2: rule__Block__Group__5__Impl
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
    // InternalPascal.g:2256:1: rule__Block__Group__5__Impl : ( ( rule__Block__StatementAssignment_5 ) ) ;
    public final void rule__Block__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2260:1: ( ( ( rule__Block__StatementAssignment_5 ) ) )
            // InternalPascal.g:2261:1: ( ( rule__Block__StatementAssignment_5 ) )
            {
            // InternalPascal.g:2261:1: ( ( rule__Block__StatementAssignment_5 ) )
            // InternalPascal.g:2262:2: ( rule__Block__StatementAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getStatementAssignment_5()); 
            }
            // InternalPascal.g:2263:2: ( rule__Block__StatementAssignment_5 )
            // InternalPascal.g:2263:3: rule__Block__StatementAssignment_5
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
    // InternalPascal.g:2272:1: rule__Statement_part__Group__0 : rule__Statement_part__Group__0__Impl rule__Statement_part__Group__1 ;
    public final void rule__Statement_part__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2276:1: ( rule__Statement_part__Group__0__Impl rule__Statement_part__Group__1 )
            // InternalPascal.g:2277:2: rule__Statement_part__Group__0__Impl rule__Statement_part__Group__1
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
    // InternalPascal.g:2284:1: rule__Statement_part__Group__0__Impl : ( 'begin' ) ;
    public final void rule__Statement_part__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2288:1: ( ( 'begin' ) )
            // InternalPascal.g:2289:1: ( 'begin' )
            {
            // InternalPascal.g:2289:1: ( 'begin' )
            // InternalPascal.g:2290:2: 'begin'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatement_partAccess().getBeginKeyword_0()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:2299:1: rule__Statement_part__Group__1 : rule__Statement_part__Group__1__Impl rule__Statement_part__Group__2 ;
    public final void rule__Statement_part__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2303:1: ( rule__Statement_part__Group__1__Impl rule__Statement_part__Group__2 )
            // InternalPascal.g:2304:2: rule__Statement_part__Group__1__Impl rule__Statement_part__Group__2
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
    // InternalPascal.g:2311:1: rule__Statement_part__Group__1__Impl : ( ( rule__Statement_part__SequenceAssignment_1 ) ) ;
    public final void rule__Statement_part__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2315:1: ( ( ( rule__Statement_part__SequenceAssignment_1 ) ) )
            // InternalPascal.g:2316:1: ( ( rule__Statement_part__SequenceAssignment_1 ) )
            {
            // InternalPascal.g:2316:1: ( ( rule__Statement_part__SequenceAssignment_1 ) )
            // InternalPascal.g:2317:2: ( rule__Statement_part__SequenceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatement_partAccess().getSequenceAssignment_1()); 
            }
            // InternalPascal.g:2318:2: ( rule__Statement_part__SequenceAssignment_1 )
            // InternalPascal.g:2318:3: rule__Statement_part__SequenceAssignment_1
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
    // InternalPascal.g:2326:1: rule__Statement_part__Group__2 : rule__Statement_part__Group__2__Impl ;
    public final void rule__Statement_part__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2330:1: ( rule__Statement_part__Group__2__Impl )
            // InternalPascal.g:2331:2: rule__Statement_part__Group__2__Impl
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
    // InternalPascal.g:2337:1: rule__Statement_part__Group__2__Impl : ( 'end' ) ;
    public final void rule__Statement_part__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2341:1: ( ( 'end' ) )
            // InternalPascal.g:2342:1: ( 'end' )
            {
            // InternalPascal.g:2342:1: ( 'end' )
            // InternalPascal.g:2343:2: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatement_partAccess().getEndKeyword_2()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:2353:1: rule__Statement_sequence__Group__0 : rule__Statement_sequence__Group__0__Impl rule__Statement_sequence__Group__1 ;
    public final void rule__Statement_sequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2357:1: ( rule__Statement_sequence__Group__0__Impl rule__Statement_sequence__Group__1 )
            // InternalPascal.g:2358:2: rule__Statement_sequence__Group__0__Impl rule__Statement_sequence__Group__1
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
    // InternalPascal.g:2365:1: rule__Statement_sequence__Group__0__Impl : ( ( rule__Statement_sequence__StatementsAssignment_0 ) ) ;
    public final void rule__Statement_sequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2369:1: ( ( ( rule__Statement_sequence__StatementsAssignment_0 ) ) )
            // InternalPascal.g:2370:1: ( ( rule__Statement_sequence__StatementsAssignment_0 ) )
            {
            // InternalPascal.g:2370:1: ( ( rule__Statement_sequence__StatementsAssignment_0 ) )
            // InternalPascal.g:2371:2: ( rule__Statement_sequence__StatementsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatement_sequenceAccess().getStatementsAssignment_0()); 
            }
            // InternalPascal.g:2372:2: ( rule__Statement_sequence__StatementsAssignment_0 )
            // InternalPascal.g:2372:3: rule__Statement_sequence__StatementsAssignment_0
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
    // InternalPascal.g:2380:1: rule__Statement_sequence__Group__1 : rule__Statement_sequence__Group__1__Impl ;
    public final void rule__Statement_sequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2384:1: ( rule__Statement_sequence__Group__1__Impl )
            // InternalPascal.g:2385:2: rule__Statement_sequence__Group__1__Impl
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
    // InternalPascal.g:2391:1: rule__Statement_sequence__Group__1__Impl : ( ( rule__Statement_sequence__Group_1__0 )* ) ;
    public final void rule__Statement_sequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2395:1: ( ( ( rule__Statement_sequence__Group_1__0 )* ) )
            // InternalPascal.g:2396:1: ( ( rule__Statement_sequence__Group_1__0 )* )
            {
            // InternalPascal.g:2396:1: ( ( rule__Statement_sequence__Group_1__0 )* )
            // InternalPascal.g:2397:2: ( rule__Statement_sequence__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatement_sequenceAccess().getGroup_1()); 
            }
            // InternalPascal.g:2398:2: ( rule__Statement_sequence__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==24) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalPascal.g:2398:3: rule__Statement_sequence__Group_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Statement_sequence__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalPascal.g:2407:1: rule__Statement_sequence__Group_1__0 : rule__Statement_sequence__Group_1__0__Impl rule__Statement_sequence__Group_1__1 ;
    public final void rule__Statement_sequence__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2411:1: ( rule__Statement_sequence__Group_1__0__Impl rule__Statement_sequence__Group_1__1 )
            // InternalPascal.g:2412:2: rule__Statement_sequence__Group_1__0__Impl rule__Statement_sequence__Group_1__1
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
    // InternalPascal.g:2419:1: rule__Statement_sequence__Group_1__0__Impl : ( ';' ) ;
    public final void rule__Statement_sequence__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2423:1: ( ( ';' ) )
            // InternalPascal.g:2424:1: ( ';' )
            {
            // InternalPascal.g:2424:1: ( ';' )
            // InternalPascal.g:2425:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatement_sequenceAccess().getSemicolonKeyword_1_0()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:2434:1: rule__Statement_sequence__Group_1__1 : rule__Statement_sequence__Group_1__1__Impl ;
    public final void rule__Statement_sequence__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2438:1: ( rule__Statement_sequence__Group_1__1__Impl )
            // InternalPascal.g:2439:2: rule__Statement_sequence__Group_1__1__Impl
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
    // InternalPascal.g:2445:1: rule__Statement_sequence__Group_1__1__Impl : ( ( rule__Statement_sequence__StatementsAssignment_1_1 ) ) ;
    public final void rule__Statement_sequence__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2449:1: ( ( ( rule__Statement_sequence__StatementsAssignment_1_1 ) ) )
            // InternalPascal.g:2450:1: ( ( rule__Statement_sequence__StatementsAssignment_1_1 ) )
            {
            // InternalPascal.g:2450:1: ( ( rule__Statement_sequence__StatementsAssignment_1_1 ) )
            // InternalPascal.g:2451:2: ( rule__Statement_sequence__StatementsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatement_sequenceAccess().getStatementsAssignment_1_1()); 
            }
            // InternalPascal.g:2452:2: ( rule__Statement_sequence__StatementsAssignment_1_1 )
            // InternalPascal.g:2452:3: rule__Statement_sequence__StatementsAssignment_1_1
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
    // InternalPascal.g:2461:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2465:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // InternalPascal.g:2466:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
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
    // InternalPascal.g:2473:1: rule__Statement__Group__0__Impl : ( ( rule__Statement__Group_0__0 )? ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2477:1: ( ( ( rule__Statement__Group_0__0 )? ) )
            // InternalPascal.g:2478:1: ( ( rule__Statement__Group_0__0 )? )
            {
            // InternalPascal.g:2478:1: ( ( rule__Statement__Group_0__0 )? )
            // InternalPascal.g:2479:2: ( rule__Statement__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getGroup_0()); 
            }
            // InternalPascal.g:2480:2: ( rule__Statement__Group_0__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=RULE_SIGNED_INTEGER_NUMBER && LA28_0<=RULE_INTEGER_NUMBER)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalPascal.g:2480:3: rule__Statement__Group_0__0
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
    // InternalPascal.g:2488:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2492:1: ( rule__Statement__Group__1__Impl )
            // InternalPascal.g:2493:2: rule__Statement__Group__1__Impl
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
    // InternalPascal.g:2499:1: rule__Statement__Group__1__Impl : ( ( rule__Statement__SimpleAssignment_1 ) ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2503:1: ( ( ( rule__Statement__SimpleAssignment_1 ) ) )
            // InternalPascal.g:2504:1: ( ( rule__Statement__SimpleAssignment_1 ) )
            {
            // InternalPascal.g:2504:1: ( ( rule__Statement__SimpleAssignment_1 ) )
            // InternalPascal.g:2505:2: ( rule__Statement__SimpleAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getSimpleAssignment_1()); 
            }
            // InternalPascal.g:2506:2: ( rule__Statement__SimpleAssignment_1 )
            // InternalPascal.g:2506:3: rule__Statement__SimpleAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Statement__SimpleAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getSimpleAssignment_1()); 
            }

            }


            }

        }
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
    // InternalPascal.g:2515:1: rule__Statement__Group_0__0 : rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 ;
    public final void rule__Statement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2519:1: ( rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 )
            // InternalPascal.g:2520:2: rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1
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
    // InternalPascal.g:2527:1: rule__Statement__Group_0__0__Impl : ( ( rule__Statement__LabelAssignment_0_0 ) ) ;
    public final void rule__Statement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2531:1: ( ( ( rule__Statement__LabelAssignment_0_0 ) ) )
            // InternalPascal.g:2532:1: ( ( rule__Statement__LabelAssignment_0_0 ) )
            {
            // InternalPascal.g:2532:1: ( ( rule__Statement__LabelAssignment_0_0 ) )
            // InternalPascal.g:2533:2: ( rule__Statement__LabelAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getLabelAssignment_0_0()); 
            }
            // InternalPascal.g:2534:2: ( rule__Statement__LabelAssignment_0_0 )
            // InternalPascal.g:2534:3: rule__Statement__LabelAssignment_0_0
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
    // InternalPascal.g:2542:1: rule__Statement__Group_0__1 : rule__Statement__Group_0__1__Impl ;
    public final void rule__Statement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2546:1: ( rule__Statement__Group_0__1__Impl )
            // InternalPascal.g:2547:2: rule__Statement__Group_0__1__Impl
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
    // InternalPascal.g:2553:1: rule__Statement__Group_0__1__Impl : ( ':' ) ;
    public final void rule__Statement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2557:1: ( ( ':' ) )
            // InternalPascal.g:2558:1: ( ':' )
            {
            // InternalPascal.g:2558:1: ( ':' )
            // InternalPascal.g:2559:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getColonKeyword_0_1()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__Assignment_statement__Group__0"
    // InternalPascal.g:2569:1: rule__Assignment_statement__Group__0 : rule__Assignment_statement__Group__0__Impl rule__Assignment_statement__Group__1 ;
    public final void rule__Assignment_statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2573:1: ( rule__Assignment_statement__Group__0__Impl rule__Assignment_statement__Group__1 )
            // InternalPascal.g:2574:2: rule__Assignment_statement__Group__0__Impl rule__Assignment_statement__Group__1
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
    // InternalPascal.g:2581:1: rule__Assignment_statement__Group__0__Impl : ( ( rule__Assignment_statement__VariableAssignment_0 ) ) ;
    public final void rule__Assignment_statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2585:1: ( ( ( rule__Assignment_statement__VariableAssignment_0 ) ) )
            // InternalPascal.g:2586:1: ( ( rule__Assignment_statement__VariableAssignment_0 ) )
            {
            // InternalPascal.g:2586:1: ( ( rule__Assignment_statement__VariableAssignment_0 ) )
            // InternalPascal.g:2587:2: ( rule__Assignment_statement__VariableAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignment_statementAccess().getVariableAssignment_0()); 
            }
            // InternalPascal.g:2588:2: ( rule__Assignment_statement__VariableAssignment_0 )
            // InternalPascal.g:2588:3: rule__Assignment_statement__VariableAssignment_0
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
    // InternalPascal.g:2596:1: rule__Assignment_statement__Group__1 : rule__Assignment_statement__Group__1__Impl rule__Assignment_statement__Group__2 ;
    public final void rule__Assignment_statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2600:1: ( rule__Assignment_statement__Group__1__Impl rule__Assignment_statement__Group__2 )
            // InternalPascal.g:2601:2: rule__Assignment_statement__Group__1__Impl rule__Assignment_statement__Group__2
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
    // InternalPascal.g:2608:1: rule__Assignment_statement__Group__1__Impl : ( ':=' ) ;
    public final void rule__Assignment_statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2612:1: ( ( ':=' ) )
            // InternalPascal.g:2613:1: ( ':=' )
            {
            // InternalPascal.g:2613:1: ( ':=' )
            // InternalPascal.g:2614:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignment_statementAccess().getColonEqualsSignKeyword_1()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:2623:1: rule__Assignment_statement__Group__2 : rule__Assignment_statement__Group__2__Impl ;
    public final void rule__Assignment_statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2627:1: ( rule__Assignment_statement__Group__2__Impl )
            // InternalPascal.g:2628:2: rule__Assignment_statement__Group__2__Impl
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
    // InternalPascal.g:2634:1: rule__Assignment_statement__Group__2__Impl : ( ( rule__Assignment_statement__ExpressionAssignment_2 ) ) ;
    public final void rule__Assignment_statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2638:1: ( ( ( rule__Assignment_statement__ExpressionAssignment_2 ) ) )
            // InternalPascal.g:2639:1: ( ( rule__Assignment_statement__ExpressionAssignment_2 ) )
            {
            // InternalPascal.g:2639:1: ( ( rule__Assignment_statement__ExpressionAssignment_2 ) )
            // InternalPascal.g:2640:2: ( rule__Assignment_statement__ExpressionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignment_statementAccess().getExpressionAssignment_2()); 
            }
            // InternalPascal.g:2641:2: ( rule__Assignment_statement__ExpressionAssignment_2 )
            // InternalPascal.g:2641:3: rule__Assignment_statement__ExpressionAssignment_2
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
    // InternalPascal.g:2650:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2654:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalPascal.g:2655:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
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
    // InternalPascal.g:2662:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__NameAssignment_0 ) ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2666:1: ( ( ( rule__Variable__NameAssignment_0 ) ) )
            // InternalPascal.g:2667:1: ( ( rule__Variable__NameAssignment_0 ) )
            {
            // InternalPascal.g:2667:1: ( ( rule__Variable__NameAssignment_0 ) )
            // InternalPascal.g:2668:2: ( rule__Variable__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getNameAssignment_0()); 
            }
            // InternalPascal.g:2669:2: ( rule__Variable__NameAssignment_0 )
            // InternalPascal.g:2669:3: rule__Variable__NameAssignment_0
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
    // InternalPascal.g:2677:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2681:1: ( rule__Variable__Group__1__Impl )
            // InternalPascal.g:2682:2: rule__Variable__Group__1__Impl
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
    // InternalPascal.g:2688:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__VariableAssignment_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2692:1: ( ( ( rule__Variable__VariableAssignment_1 ) ) )
            // InternalPascal.g:2693:1: ( ( rule__Variable__VariableAssignment_1 ) )
            {
            // InternalPascal.g:2693:1: ( ( rule__Variable__VariableAssignment_1 ) )
            // InternalPascal.g:2694:2: ( rule__Variable__VariableAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getVariableAssignment_1()); 
            }
            // InternalPascal.g:2695:2: ( rule__Variable__VariableAssignment_1 )
            // InternalPascal.g:2695:3: rule__Variable__VariableAssignment_1
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
    // InternalPascal.g:2704:1: rule__Var___Group_0__0 : rule__Var___Group_0__0__Impl rule__Var___Group_0__1 ;
    public final void rule__Var___Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2708:1: ( rule__Var___Group_0__0__Impl rule__Var___Group_0__1 )
            // InternalPascal.g:2709:2: rule__Var___Group_0__0__Impl rule__Var___Group_0__1
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
    // InternalPascal.g:2716:1: rule__Var___Group_0__0__Impl : ( '[' ) ;
    public final void rule__Var___Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2720:1: ( ( '[' ) )
            // InternalPascal.g:2721:1: ( '[' )
            {
            // InternalPascal.g:2721:1: ( '[' )
            // InternalPascal.g:2722:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_Access().getLeftSquareBracketKeyword_0_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:2731:1: rule__Var___Group_0__1 : rule__Var___Group_0__1__Impl rule__Var___Group_0__2 ;
    public final void rule__Var___Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2735:1: ( rule__Var___Group_0__1__Impl rule__Var___Group_0__2 )
            // InternalPascal.g:2736:2: rule__Var___Group_0__1__Impl rule__Var___Group_0__2
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
    // InternalPascal.g:2743:1: rule__Var___Group_0__1__Impl : ( ( rule__Var___ExpressionsAssignment_0_1 ) ) ;
    public final void rule__Var___Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2747:1: ( ( ( rule__Var___ExpressionsAssignment_0_1 ) ) )
            // InternalPascal.g:2748:1: ( ( rule__Var___ExpressionsAssignment_0_1 ) )
            {
            // InternalPascal.g:2748:1: ( ( rule__Var___ExpressionsAssignment_0_1 ) )
            // InternalPascal.g:2749:2: ( rule__Var___ExpressionsAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_Access().getExpressionsAssignment_0_1()); 
            }
            // InternalPascal.g:2750:2: ( rule__Var___ExpressionsAssignment_0_1 )
            // InternalPascal.g:2750:3: rule__Var___ExpressionsAssignment_0_1
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
    // InternalPascal.g:2758:1: rule__Var___Group_0__2 : rule__Var___Group_0__2__Impl rule__Var___Group_0__3 ;
    public final void rule__Var___Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2762:1: ( rule__Var___Group_0__2__Impl rule__Var___Group_0__3 )
            // InternalPascal.g:2763:2: rule__Var___Group_0__2__Impl rule__Var___Group_0__3
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
    // InternalPascal.g:2770:1: rule__Var___Group_0__2__Impl : ( ']' ) ;
    public final void rule__Var___Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2774:1: ( ( ']' ) )
            // InternalPascal.g:2775:1: ( ']' )
            {
            // InternalPascal.g:2775:1: ( ']' )
            // InternalPascal.g:2776:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_Access().getRightSquareBracketKeyword_0_2()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:2785:1: rule__Var___Group_0__3 : rule__Var___Group_0__3__Impl ;
    public final void rule__Var___Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2789:1: ( rule__Var___Group_0__3__Impl )
            // InternalPascal.g:2790:2: rule__Var___Group_0__3__Impl
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
    // InternalPascal.g:2796:1: rule__Var___Group_0__3__Impl : ( ( rule__Var___ArrayAssignment_0_3 ) ) ;
    public final void rule__Var___Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2800:1: ( ( ( rule__Var___ArrayAssignment_0_3 ) ) )
            // InternalPascal.g:2801:1: ( ( rule__Var___ArrayAssignment_0_3 ) )
            {
            // InternalPascal.g:2801:1: ( ( rule__Var___ArrayAssignment_0_3 ) )
            // InternalPascal.g:2802:2: ( rule__Var___ArrayAssignment_0_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_Access().getArrayAssignment_0_3()); 
            }
            // InternalPascal.g:2803:2: ( rule__Var___ArrayAssignment_0_3 )
            // InternalPascal.g:2803:3: rule__Var___ArrayAssignment_0_3
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
    // InternalPascal.g:2812:1: rule__Var___Group_1__0 : rule__Var___Group_1__0__Impl rule__Var___Group_1__1 ;
    public final void rule__Var___Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2816:1: ( rule__Var___Group_1__0__Impl rule__Var___Group_1__1 )
            // InternalPascal.g:2817:2: rule__Var___Group_1__0__Impl rule__Var___Group_1__1
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
    // InternalPascal.g:2824:1: rule__Var___Group_1__0__Impl : ( ( rule__Var___AccessorAssignment_1_0 ) ) ;
    public final void rule__Var___Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2828:1: ( ( ( rule__Var___AccessorAssignment_1_0 ) ) )
            // InternalPascal.g:2829:1: ( ( rule__Var___AccessorAssignment_1_0 ) )
            {
            // InternalPascal.g:2829:1: ( ( rule__Var___AccessorAssignment_1_0 ) )
            // InternalPascal.g:2830:2: ( rule__Var___AccessorAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_Access().getAccessorAssignment_1_0()); 
            }
            // InternalPascal.g:2831:2: ( rule__Var___AccessorAssignment_1_0 )
            // InternalPascal.g:2831:3: rule__Var___AccessorAssignment_1_0
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
    // InternalPascal.g:2839:1: rule__Var___Group_1__1 : rule__Var___Group_1__1__Impl rule__Var___Group_1__2 ;
    public final void rule__Var___Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2843:1: ( rule__Var___Group_1__1__Impl rule__Var___Group_1__2 )
            // InternalPascal.g:2844:2: rule__Var___Group_1__1__Impl rule__Var___Group_1__2
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
    // InternalPascal.g:2851:1: rule__Var___Group_1__1__Impl : ( ( rule__Var___NameAssignment_1_1 ) ) ;
    public final void rule__Var___Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2855:1: ( ( ( rule__Var___NameAssignment_1_1 ) ) )
            // InternalPascal.g:2856:1: ( ( rule__Var___NameAssignment_1_1 ) )
            {
            // InternalPascal.g:2856:1: ( ( rule__Var___NameAssignment_1_1 ) )
            // InternalPascal.g:2857:2: ( rule__Var___NameAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_Access().getNameAssignment_1_1()); 
            }
            // InternalPascal.g:2858:2: ( rule__Var___NameAssignment_1_1 )
            // InternalPascal.g:2858:3: rule__Var___NameAssignment_1_1
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
    // InternalPascal.g:2866:1: rule__Var___Group_1__2 : rule__Var___Group_1__2__Impl ;
    public final void rule__Var___Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2870:1: ( rule__Var___Group_1__2__Impl )
            // InternalPascal.g:2871:2: rule__Var___Group_1__2__Impl
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
    // InternalPascal.g:2877:1: rule__Var___Group_1__2__Impl : ( ( rule__Var___VariableAssignment_1_2 ) ) ;
    public final void rule__Var___Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2881:1: ( ( ( rule__Var___VariableAssignment_1_2 ) ) )
            // InternalPascal.g:2882:1: ( ( rule__Var___VariableAssignment_1_2 ) )
            {
            // InternalPascal.g:2882:1: ( ( rule__Var___VariableAssignment_1_2 ) )
            // InternalPascal.g:2883:2: ( rule__Var___VariableAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_Access().getVariableAssignment_1_2()); 
            }
            // InternalPascal.g:2884:2: ( rule__Var___VariableAssignment_1_2 )
            // InternalPascal.g:2884:3: rule__Var___VariableAssignment_1_2
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
    // InternalPascal.g:2893:1: rule__Var___Group_2__0 : rule__Var___Group_2__0__Impl rule__Var___Group_2__1 ;
    public final void rule__Var___Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2897:1: ( rule__Var___Group_2__0__Impl rule__Var___Group_2__1 )
            // InternalPascal.g:2898:2: rule__Var___Group_2__0__Impl rule__Var___Group_2__1
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
    // InternalPascal.g:2905:1: rule__Var___Group_2__0__Impl : ( '^' ) ;
    public final void rule__Var___Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2909:1: ( ( '^' ) )
            // InternalPascal.g:2910:1: ( '^' )
            {
            // InternalPascal.g:2910:1: ( '^' )
            // InternalPascal.g:2911:2: '^'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_Access().getCircumflexAccentKeyword_2_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:2920:1: rule__Var___Group_2__1 : rule__Var___Group_2__1__Impl ;
    public final void rule__Var___Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2924:1: ( rule__Var___Group_2__1__Impl )
            // InternalPascal.g:2925:2: rule__Var___Group_2__1__Impl
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
    // InternalPascal.g:2931:1: rule__Var___Group_2__1__Impl : ( ( rule__Var___PointerAssignment_2_1 ) ) ;
    public final void rule__Var___Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2935:1: ( ( ( rule__Var___PointerAssignment_2_1 ) ) )
            // InternalPascal.g:2936:1: ( ( rule__Var___PointerAssignment_2_1 ) )
            {
            // InternalPascal.g:2936:1: ( ( rule__Var___PointerAssignment_2_1 ) )
            // InternalPascal.g:2937:2: ( rule__Var___PointerAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_Access().getPointerAssignment_2_1()); 
            }
            // InternalPascal.g:2938:2: ( rule__Var___PointerAssignment_2_1 )
            // InternalPascal.g:2938:3: rule__Var___PointerAssignment_2_1
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
    // InternalPascal.g:2947:1: rule__Expression_list__Group__0 : rule__Expression_list__Group__0__Impl rule__Expression_list__Group__1 ;
    public final void rule__Expression_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2951:1: ( rule__Expression_list__Group__0__Impl rule__Expression_list__Group__1 )
            // InternalPascal.g:2952:2: rule__Expression_list__Group__0__Impl rule__Expression_list__Group__1
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
    // InternalPascal.g:2959:1: rule__Expression_list__Group__0__Impl : ( ( rule__Expression_list__ExpressionsAssignment_0 ) ) ;
    public final void rule__Expression_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2963:1: ( ( ( rule__Expression_list__ExpressionsAssignment_0 ) ) )
            // InternalPascal.g:2964:1: ( ( rule__Expression_list__ExpressionsAssignment_0 ) )
            {
            // InternalPascal.g:2964:1: ( ( rule__Expression_list__ExpressionsAssignment_0 ) )
            // InternalPascal.g:2965:2: ( rule__Expression_list__ExpressionsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression_listAccess().getExpressionsAssignment_0()); 
            }
            // InternalPascal.g:2966:2: ( rule__Expression_list__ExpressionsAssignment_0 )
            // InternalPascal.g:2966:3: rule__Expression_list__ExpressionsAssignment_0
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
    // InternalPascal.g:2974:1: rule__Expression_list__Group__1 : rule__Expression_list__Group__1__Impl ;
    public final void rule__Expression_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2978:1: ( rule__Expression_list__Group__1__Impl )
            // InternalPascal.g:2979:2: rule__Expression_list__Group__1__Impl
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
    // InternalPascal.g:2985:1: rule__Expression_list__Group__1__Impl : ( ( rule__Expression_list__Group_1__0 )* ) ;
    public final void rule__Expression_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2989:1: ( ( ( rule__Expression_list__Group_1__0 )* ) )
            // InternalPascal.g:2990:1: ( ( rule__Expression_list__Group_1__0 )* )
            {
            // InternalPascal.g:2990:1: ( ( rule__Expression_list__Group_1__0 )* )
            // InternalPascal.g:2991:2: ( rule__Expression_list__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression_listAccess().getGroup_1()); 
            }
            // InternalPascal.g:2992:2: ( rule__Expression_list__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==32) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalPascal.g:2992:3: rule__Expression_list__Group_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Expression_list__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalPascal.g:3001:1: rule__Expression_list__Group_1__0 : rule__Expression_list__Group_1__0__Impl rule__Expression_list__Group_1__1 ;
    public final void rule__Expression_list__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3005:1: ( rule__Expression_list__Group_1__0__Impl rule__Expression_list__Group_1__1 )
            // InternalPascal.g:3006:2: rule__Expression_list__Group_1__0__Impl rule__Expression_list__Group_1__1
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
    // InternalPascal.g:3013:1: rule__Expression_list__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Expression_list__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3017:1: ( ( ',' ) )
            // InternalPascal.g:3018:1: ( ',' )
            {
            // InternalPascal.g:3018:1: ( ',' )
            // InternalPascal.g:3019:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression_listAccess().getCommaKeyword_1_0()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:3028:1: rule__Expression_list__Group_1__1 : rule__Expression_list__Group_1__1__Impl ;
    public final void rule__Expression_list__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3032:1: ( rule__Expression_list__Group_1__1__Impl )
            // InternalPascal.g:3033:2: rule__Expression_list__Group_1__1__Impl
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
    // InternalPascal.g:3039:1: rule__Expression_list__Group_1__1__Impl : ( ( rule__Expression_list__ExpressionsAssignment_1_1 ) ) ;
    public final void rule__Expression_list__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3043:1: ( ( ( rule__Expression_list__ExpressionsAssignment_1_1 ) ) )
            // InternalPascal.g:3044:1: ( ( rule__Expression_list__ExpressionsAssignment_1_1 ) )
            {
            // InternalPascal.g:3044:1: ( ( rule__Expression_list__ExpressionsAssignment_1_1 ) )
            // InternalPascal.g:3045:2: ( rule__Expression_list__ExpressionsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression_listAccess().getExpressionsAssignment_1_1()); 
            }
            // InternalPascal.g:3046:2: ( rule__Expression_list__ExpressionsAssignment_1_1 )
            // InternalPascal.g:3046:3: rule__Expression_list__ExpressionsAssignment_1_1
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
    // InternalPascal.g:3055:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3059:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // InternalPascal.g:3060:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
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
    // InternalPascal.g:3067:1: rule__Expression__Group__0__Impl : ( ( rule__Expression__ExpressionsAssignment_0 ) ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3071:1: ( ( ( rule__Expression__ExpressionsAssignment_0 ) ) )
            // InternalPascal.g:3072:1: ( ( rule__Expression__ExpressionsAssignment_0 ) )
            {
            // InternalPascal.g:3072:1: ( ( rule__Expression__ExpressionsAssignment_0 ) )
            // InternalPascal.g:3073:2: ( rule__Expression__ExpressionsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getExpressionsAssignment_0()); 
            }
            // InternalPascal.g:3074:2: ( rule__Expression__ExpressionsAssignment_0 )
            // InternalPascal.g:3074:3: rule__Expression__ExpressionsAssignment_0
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
    // InternalPascal.g:3082:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3086:1: ( rule__Expression__Group__1__Impl )
            // InternalPascal.g:3087:2: rule__Expression__Group__1__Impl
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
    // InternalPascal.g:3093:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )? ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3097:1: ( ( ( rule__Expression__Group_1__0 )? ) )
            // InternalPascal.g:3098:1: ( ( rule__Expression__Group_1__0 )? )
            {
            // InternalPascal.g:3098:1: ( ( rule__Expression__Group_1__0 )? )
            // InternalPascal.g:3099:2: ( rule__Expression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getGroup_1()); 
            }
            // InternalPascal.g:3100:2: ( rule__Expression__Group_1__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_RELATIONAL_OP||LA30_0==40||LA30_0==45) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalPascal.g:3100:3: rule__Expression__Group_1__0
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
    // InternalPascal.g:3109:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3113:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // InternalPascal.g:3114:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
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
    // InternalPascal.g:3121:1: rule__Expression__Group_1__0__Impl : ( ( rule__Expression__Alternatives_1_0 ) ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3125:1: ( ( ( rule__Expression__Alternatives_1_0 ) ) )
            // InternalPascal.g:3126:1: ( ( rule__Expression__Alternatives_1_0 ) )
            {
            // InternalPascal.g:3126:1: ( ( rule__Expression__Alternatives_1_0 ) )
            // InternalPascal.g:3127:2: ( rule__Expression__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getAlternatives_1_0()); 
            }
            // InternalPascal.g:3128:2: ( rule__Expression__Alternatives_1_0 )
            // InternalPascal.g:3128:3: rule__Expression__Alternatives_1_0
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
    // InternalPascal.g:3136:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3140:1: ( rule__Expression__Group_1__1__Impl )
            // InternalPascal.g:3141:2: rule__Expression__Group_1__1__Impl
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
    // InternalPascal.g:3147:1: rule__Expression__Group_1__1__Impl : ( ( rule__Expression__ExpressionsAssignment_1_1 ) ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3151:1: ( ( ( rule__Expression__ExpressionsAssignment_1_1 ) ) )
            // InternalPascal.g:3152:1: ( ( rule__Expression__ExpressionsAssignment_1_1 ) )
            {
            // InternalPascal.g:3152:1: ( ( rule__Expression__ExpressionsAssignment_1_1 ) )
            // InternalPascal.g:3153:2: ( rule__Expression__ExpressionsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getExpressionsAssignment_1_1()); 
            }
            // InternalPascal.g:3154:2: ( rule__Expression__ExpressionsAssignment_1_1 )
            // InternalPascal.g:3154:3: rule__Expression__ExpressionsAssignment_1_1
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
    // InternalPascal.g:3163:1: rule__Simple_expression__Group__0 : rule__Simple_expression__Group__0__Impl rule__Simple_expression__Group__1 ;
    public final void rule__Simple_expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3167:1: ( rule__Simple_expression__Group__0__Impl rule__Simple_expression__Group__1 )
            // InternalPascal.g:3168:2: rule__Simple_expression__Group__0__Impl rule__Simple_expression__Group__1
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
    // InternalPascal.g:3175:1: rule__Simple_expression__Group__0__Impl : ( ( rule__Simple_expression__PrefixOperatorAssignment_0 )? ) ;
    public final void rule__Simple_expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3179:1: ( ( ( rule__Simple_expression__PrefixOperatorAssignment_0 )? ) )
            // InternalPascal.g:3180:1: ( ( rule__Simple_expression__PrefixOperatorAssignment_0 )? )
            {
            // InternalPascal.g:3180:1: ( ( rule__Simple_expression__PrefixOperatorAssignment_0 )? )
            // InternalPascal.g:3181:2: ( rule__Simple_expression__PrefixOperatorAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimple_expressionAccess().getPrefixOperatorAssignment_0()); 
            }
            // InternalPascal.g:3182:2: ( rule__Simple_expression__PrefixOperatorAssignment_0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ADDITION_OP) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalPascal.g:3182:3: rule__Simple_expression__PrefixOperatorAssignment_0
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
    // InternalPascal.g:3190:1: rule__Simple_expression__Group__1 : rule__Simple_expression__Group__1__Impl rule__Simple_expression__Group__2 ;
    public final void rule__Simple_expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3194:1: ( rule__Simple_expression__Group__1__Impl rule__Simple_expression__Group__2 )
            // InternalPascal.g:3195:2: rule__Simple_expression__Group__1__Impl rule__Simple_expression__Group__2
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
    // InternalPascal.g:3202:1: rule__Simple_expression__Group__1__Impl : ( ( rule__Simple_expression__TermsAssignment_1 ) ) ;
    public final void rule__Simple_expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3206:1: ( ( ( rule__Simple_expression__TermsAssignment_1 ) ) )
            // InternalPascal.g:3207:1: ( ( rule__Simple_expression__TermsAssignment_1 ) )
            {
            // InternalPascal.g:3207:1: ( ( rule__Simple_expression__TermsAssignment_1 ) )
            // InternalPascal.g:3208:2: ( rule__Simple_expression__TermsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimple_expressionAccess().getTermsAssignment_1()); 
            }
            // InternalPascal.g:3209:2: ( rule__Simple_expression__TermsAssignment_1 )
            // InternalPascal.g:3209:3: rule__Simple_expression__TermsAssignment_1
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
    // InternalPascal.g:3217:1: rule__Simple_expression__Group__2 : rule__Simple_expression__Group__2__Impl ;
    public final void rule__Simple_expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3221:1: ( rule__Simple_expression__Group__2__Impl )
            // InternalPascal.g:3222:2: rule__Simple_expression__Group__2__Impl
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
    // InternalPascal.g:3228:1: rule__Simple_expression__Group__2__Impl : ( ( rule__Simple_expression__Alternatives_2 )* ) ;
    public final void rule__Simple_expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3232:1: ( ( ( rule__Simple_expression__Alternatives_2 )* ) )
            // InternalPascal.g:3233:1: ( ( rule__Simple_expression__Alternatives_2 )* )
            {
            // InternalPascal.g:3233:1: ( ( rule__Simple_expression__Alternatives_2 )* )
            // InternalPascal.g:3234:2: ( rule__Simple_expression__Alternatives_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimple_expressionAccess().getAlternatives_2()); 
            }
            // InternalPascal.g:3235:2: ( rule__Simple_expression__Alternatives_2 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_INTEGER_NUMBER||LA32_0==RULE_ADDITION_OP||LA32_0==RULE_REAL_NUMBER||LA32_0==46) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalPascal.g:3235:3: rule__Simple_expression__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Simple_expression__Alternatives_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalPascal.g:3244:1: rule__Simple_expression__Group_2_0__0 : rule__Simple_expression__Group_2_0__0__Impl rule__Simple_expression__Group_2_0__1 ;
    public final void rule__Simple_expression__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3248:1: ( rule__Simple_expression__Group_2_0__0__Impl rule__Simple_expression__Group_2_0__1 )
            // InternalPascal.g:3249:2: rule__Simple_expression__Group_2_0__0__Impl rule__Simple_expression__Group_2_0__1
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
    // InternalPascal.g:3256:1: rule__Simple_expression__Group_2_0__0__Impl : ( ( rule__Simple_expression__Alternatives_2_0_0 ) ) ;
    public final void rule__Simple_expression__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3260:1: ( ( ( rule__Simple_expression__Alternatives_2_0_0 ) ) )
            // InternalPascal.g:3261:1: ( ( rule__Simple_expression__Alternatives_2_0_0 ) )
            {
            // InternalPascal.g:3261:1: ( ( rule__Simple_expression__Alternatives_2_0_0 ) )
            // InternalPascal.g:3262:2: ( rule__Simple_expression__Alternatives_2_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimple_expressionAccess().getAlternatives_2_0_0()); 
            }
            // InternalPascal.g:3263:2: ( rule__Simple_expression__Alternatives_2_0_0 )
            // InternalPascal.g:3263:3: rule__Simple_expression__Alternatives_2_0_0
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
    // InternalPascal.g:3271:1: rule__Simple_expression__Group_2_0__1 : rule__Simple_expression__Group_2_0__1__Impl ;
    public final void rule__Simple_expression__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3275:1: ( rule__Simple_expression__Group_2_0__1__Impl )
            // InternalPascal.g:3276:2: rule__Simple_expression__Group_2_0__1__Impl
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
    // InternalPascal.g:3282:1: rule__Simple_expression__Group_2_0__1__Impl : ( ( rule__Simple_expression__TermsAssignment_2_0_1 ) ) ;
    public final void rule__Simple_expression__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3286:1: ( ( ( rule__Simple_expression__TermsAssignment_2_0_1 ) ) )
            // InternalPascal.g:3287:1: ( ( rule__Simple_expression__TermsAssignment_2_0_1 ) )
            {
            // InternalPascal.g:3287:1: ( ( rule__Simple_expression__TermsAssignment_2_0_1 ) )
            // InternalPascal.g:3288:2: ( rule__Simple_expression__TermsAssignment_2_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimple_expressionAccess().getTermsAssignment_2_0_1()); 
            }
            // InternalPascal.g:3289:2: ( rule__Simple_expression__TermsAssignment_2_0_1 )
            // InternalPascal.g:3289:3: rule__Simple_expression__TermsAssignment_2_0_1
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
    // InternalPascal.g:3298:1: rule__Term__Group__0 : rule__Term__Group__0__Impl rule__Term__Group__1 ;
    public final void rule__Term__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3302:1: ( rule__Term__Group__0__Impl rule__Term__Group__1 )
            // InternalPascal.g:3303:2: rule__Term__Group__0__Impl rule__Term__Group__1
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
    // InternalPascal.g:3310:1: rule__Term__Group__0__Impl : ( ( rule__Term__FactorsAssignment_0 ) ) ;
    public final void rule__Term__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3314:1: ( ( ( rule__Term__FactorsAssignment_0 ) ) )
            // InternalPascal.g:3315:1: ( ( rule__Term__FactorsAssignment_0 ) )
            {
            // InternalPascal.g:3315:1: ( ( rule__Term__FactorsAssignment_0 ) )
            // InternalPascal.g:3316:2: ( rule__Term__FactorsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getFactorsAssignment_0()); 
            }
            // InternalPascal.g:3317:2: ( rule__Term__FactorsAssignment_0 )
            // InternalPascal.g:3317:3: rule__Term__FactorsAssignment_0
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
    // InternalPascal.g:3325:1: rule__Term__Group__1 : rule__Term__Group__1__Impl ;
    public final void rule__Term__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3329:1: ( rule__Term__Group__1__Impl )
            // InternalPascal.g:3330:2: rule__Term__Group__1__Impl
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
    // InternalPascal.g:3336:1: rule__Term__Group__1__Impl : ( ( rule__Term__Group_1__0 )* ) ;
    public final void rule__Term__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3340:1: ( ( ( rule__Term__Group_1__0 )* ) )
            // InternalPascal.g:3341:1: ( ( rule__Term__Group_1__0 )* )
            {
            // InternalPascal.g:3341:1: ( ( rule__Term__Group_1__0 )* )
            // InternalPascal.g:3342:2: ( rule__Term__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getGroup_1()); 
            }
            // InternalPascal.g:3343:2: ( rule__Term__Group_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_MULTIPLICATION_OP||(LA33_0>=47 && LA33_0<=49)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalPascal.g:3343:3: rule__Term__Group_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Term__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalPascal.g:3352:1: rule__Term__Group_1__0 : rule__Term__Group_1__0__Impl rule__Term__Group_1__1 ;
    public final void rule__Term__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3356:1: ( rule__Term__Group_1__0__Impl rule__Term__Group_1__1 )
            // InternalPascal.g:3357:2: rule__Term__Group_1__0__Impl rule__Term__Group_1__1
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
    // InternalPascal.g:3364:1: rule__Term__Group_1__0__Impl : ( ( rule__Term__Alternatives_1_0 ) ) ;
    public final void rule__Term__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3368:1: ( ( ( rule__Term__Alternatives_1_0 ) ) )
            // InternalPascal.g:3369:1: ( ( rule__Term__Alternatives_1_0 ) )
            {
            // InternalPascal.g:3369:1: ( ( rule__Term__Alternatives_1_0 ) )
            // InternalPascal.g:3370:2: ( rule__Term__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getAlternatives_1_0()); 
            }
            // InternalPascal.g:3371:2: ( rule__Term__Alternatives_1_0 )
            // InternalPascal.g:3371:3: rule__Term__Alternatives_1_0
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
    // InternalPascal.g:3379:1: rule__Term__Group_1__1 : rule__Term__Group_1__1__Impl ;
    public final void rule__Term__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3383:1: ( rule__Term__Group_1__1__Impl )
            // InternalPascal.g:3384:2: rule__Term__Group_1__1__Impl
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
    // InternalPascal.g:3390:1: rule__Term__Group_1__1__Impl : ( ( rule__Term__FactorsAssignment_1_1 ) ) ;
    public final void rule__Term__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3394:1: ( ( ( rule__Term__FactorsAssignment_1_1 ) ) )
            // InternalPascal.g:3395:1: ( ( rule__Term__FactorsAssignment_1_1 ) )
            {
            // InternalPascal.g:3395:1: ( ( rule__Term__FactorsAssignment_1_1 ) )
            // InternalPascal.g:3396:2: ( rule__Term__FactorsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getFactorsAssignment_1_1()); 
            }
            // InternalPascal.g:3397:2: ( rule__Term__FactorsAssignment_1_1 )
            // InternalPascal.g:3397:3: rule__Term__FactorsAssignment_1_1
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


    // $ANTLR start "rule__Factor__Group_7__0"
    // InternalPascal.g:3406:1: rule__Factor__Group_7__0 : rule__Factor__Group_7__0__Impl rule__Factor__Group_7__1 ;
    public final void rule__Factor__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3410:1: ( rule__Factor__Group_7__0__Impl rule__Factor__Group_7__1 )
            // InternalPascal.g:3411:2: rule__Factor__Group_7__0__Impl rule__Factor__Group_7__1
            {
            pushFollow(FOLLOW_13);
            rule__Factor__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Factor__Group_7__1();

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
    // $ANTLR end "rule__Factor__Group_7__0"


    // $ANTLR start "rule__Factor__Group_7__0__Impl"
    // InternalPascal.g:3418:1: rule__Factor__Group_7__0__Impl : ( '(' ) ;
    public final void rule__Factor__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3422:1: ( ( '(' ) )
            // InternalPascal.g:3423:1: ( '(' )
            {
            // InternalPascal.g:3423:1: ( '(' )
            // InternalPascal.g:3424:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getLeftParenthesisKeyword_7_0()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorAccess().getLeftParenthesisKeyword_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_7__0__Impl"


    // $ANTLR start "rule__Factor__Group_7__1"
    // InternalPascal.g:3433:1: rule__Factor__Group_7__1 : rule__Factor__Group_7__1__Impl rule__Factor__Group_7__2 ;
    public final void rule__Factor__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3437:1: ( rule__Factor__Group_7__1__Impl rule__Factor__Group_7__2 )
            // InternalPascal.g:3438:2: rule__Factor__Group_7__1__Impl rule__Factor__Group_7__2
            {
            pushFollow(FOLLOW_23);
            rule__Factor__Group_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Factor__Group_7__2();

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
    // $ANTLR end "rule__Factor__Group_7__1"


    // $ANTLR start "rule__Factor__Group_7__1__Impl"
    // InternalPascal.g:3445:1: rule__Factor__Group_7__1__Impl : ( ( rule__Factor__ExpressionAssignment_7_1 ) ) ;
    public final void rule__Factor__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3449:1: ( ( ( rule__Factor__ExpressionAssignment_7_1 ) ) )
            // InternalPascal.g:3450:1: ( ( rule__Factor__ExpressionAssignment_7_1 ) )
            {
            // InternalPascal.g:3450:1: ( ( rule__Factor__ExpressionAssignment_7_1 ) )
            // InternalPascal.g:3451:2: ( rule__Factor__ExpressionAssignment_7_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getExpressionAssignment_7_1()); 
            }
            // InternalPascal.g:3452:2: ( rule__Factor__ExpressionAssignment_7_1 )
            // InternalPascal.g:3452:3: rule__Factor__ExpressionAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Factor__ExpressionAssignment_7_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorAccess().getExpressionAssignment_7_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_7__1__Impl"


    // $ANTLR start "rule__Factor__Group_7__2"
    // InternalPascal.g:3460:1: rule__Factor__Group_7__2 : rule__Factor__Group_7__2__Impl ;
    public final void rule__Factor__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3464:1: ( rule__Factor__Group_7__2__Impl )
            // InternalPascal.g:3465:2: rule__Factor__Group_7__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Group_7__2__Impl();

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
    // $ANTLR end "rule__Factor__Group_7__2"


    // $ANTLR start "rule__Factor__Group_7__2__Impl"
    // InternalPascal.g:3471:1: rule__Factor__Group_7__2__Impl : ( ')' ) ;
    public final void rule__Factor__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3475:1: ( ( ')' ) )
            // InternalPascal.g:3476:1: ( ')' )
            {
            // InternalPascal.g:3476:1: ( ')' )
            // InternalPascal.g:3477:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getRightParenthesisKeyword_7_2()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorAccess().getRightParenthesisKeyword_7_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_7__2__Impl"


    // $ANTLR start "rule__Factor__Group_8__0"
    // InternalPascal.g:3487:1: rule__Factor__Group_8__0 : rule__Factor__Group_8__0__Impl rule__Factor__Group_8__1 ;
    public final void rule__Factor__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3491:1: ( rule__Factor__Group_8__0__Impl rule__Factor__Group_8__1 )
            // InternalPascal.g:3492:2: rule__Factor__Group_8__0__Impl rule__Factor__Group_8__1
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
    // InternalPascal.g:3499:1: rule__Factor__Group_8__0__Impl : ( 'not' ) ;
    public final void rule__Factor__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3503:1: ( ( 'not' ) )
            // InternalPascal.g:3504:1: ( 'not' )
            {
            // InternalPascal.g:3504:1: ( 'not' )
            // InternalPascal.g:3505:2: 'not'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getNotKeyword_8_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorAccess().getNotKeyword_8_0()); 
            }

            }


            }

        }
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
    // InternalPascal.g:3514:1: rule__Factor__Group_8__1 : rule__Factor__Group_8__1__Impl ;
    public final void rule__Factor__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3518:1: ( rule__Factor__Group_8__1__Impl )
            // InternalPascal.g:3519:2: rule__Factor__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Group_8__1__Impl();

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
    // InternalPascal.g:3525:1: rule__Factor__Group_8__1__Impl : ( ( rule__Factor__NotAssignment_8_1 ) ) ;
    public final void rule__Factor__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3529:1: ( ( ( rule__Factor__NotAssignment_8_1 ) ) )
            // InternalPascal.g:3530:1: ( ( rule__Factor__NotAssignment_8_1 ) )
            {
            // InternalPascal.g:3530:1: ( ( rule__Factor__NotAssignment_8_1 ) )
            // InternalPascal.g:3531:2: ( rule__Factor__NotAssignment_8_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getNotAssignment_8_1()); 
            }
            // InternalPascal.g:3532:2: ( rule__Factor__NotAssignment_8_1 )
            // InternalPascal.g:3532:3: rule__Factor__NotAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Factor__NotAssignment_8_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorAccess().getNotAssignment_8_1()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Function_designator__Group__0"
    // InternalPascal.g:3541:1: rule__Function_designator__Group__0 : rule__Function_designator__Group__0__Impl rule__Function_designator__Group__1 ;
    public final void rule__Function_designator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3545:1: ( rule__Function_designator__Group__0__Impl rule__Function_designator__Group__1 )
            // InternalPascal.g:3546:2: rule__Function_designator__Group__0__Impl rule__Function_designator__Group__1
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
    // InternalPascal.g:3553:1: rule__Function_designator__Group__0__Impl : ( ( rule__Function_designator__NameAssignment_0 ) ) ;
    public final void rule__Function_designator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3557:1: ( ( ( rule__Function_designator__NameAssignment_0 ) ) )
            // InternalPascal.g:3558:1: ( ( rule__Function_designator__NameAssignment_0 ) )
            {
            // InternalPascal.g:3558:1: ( ( rule__Function_designator__NameAssignment_0 ) )
            // InternalPascal.g:3559:2: ( rule__Function_designator__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_designatorAccess().getNameAssignment_0()); 
            }
            // InternalPascal.g:3560:2: ( rule__Function_designator__NameAssignment_0 )
            // InternalPascal.g:3560:3: rule__Function_designator__NameAssignment_0
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
    // InternalPascal.g:3568:1: rule__Function_designator__Group__1 : rule__Function_designator__Group__1__Impl rule__Function_designator__Group__2 ;
    public final void rule__Function_designator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3572:1: ( rule__Function_designator__Group__1__Impl rule__Function_designator__Group__2 )
            // InternalPascal.g:3573:2: rule__Function_designator__Group__1__Impl rule__Function_designator__Group__2
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
    // InternalPascal.g:3580:1: rule__Function_designator__Group__1__Impl : ( '(' ) ;
    public final void rule__Function_designator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3584:1: ( ( '(' ) )
            // InternalPascal.g:3585:1: ( '(' )
            {
            // InternalPascal.g:3585:1: ( '(' )
            // InternalPascal.g:3586:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_designatorAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:3595:1: rule__Function_designator__Group__2 : rule__Function_designator__Group__2__Impl rule__Function_designator__Group__3 ;
    public final void rule__Function_designator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3599:1: ( rule__Function_designator__Group__2__Impl rule__Function_designator__Group__3 )
            // InternalPascal.g:3600:2: rule__Function_designator__Group__2__Impl rule__Function_designator__Group__3
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
    // InternalPascal.g:3607:1: rule__Function_designator__Group__2__Impl : ( ( rule__Function_designator__ExpressionsAssignment_2 )? ) ;
    public final void rule__Function_designator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3611:1: ( ( ( rule__Function_designator__ExpressionsAssignment_2 )? ) )
            // InternalPascal.g:3612:1: ( ( rule__Function_designator__ExpressionsAssignment_2 )? )
            {
            // InternalPascal.g:3612:1: ( ( rule__Function_designator__ExpressionsAssignment_2 )? )
            // InternalPascal.g:3613:2: ( rule__Function_designator__ExpressionsAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_designatorAccess().getExpressionsAssignment_2()); 
            }
            // InternalPascal.g:3614:2: ( rule__Function_designator__ExpressionsAssignment_2 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=RULE_ID && LA34_0<=RULE_INTEGER_NUMBER)||LA34_0==RULE_ADDITION_OP||LA34_0==RULE_STRING||(LA34_0>=RULE_SIGNED_REAL_NUMBER && LA34_0<=RULE_REAL_NUMBER)||LA34_0==29||LA34_0==33||LA34_0==35||(LA34_0>=50 && LA34_0<=52)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalPascal.g:3614:3: rule__Function_designator__ExpressionsAssignment_2
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
    // InternalPascal.g:3622:1: rule__Function_designator__Group__3 : rule__Function_designator__Group__3__Impl ;
    public final void rule__Function_designator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3626:1: ( rule__Function_designator__Group__3__Impl )
            // InternalPascal.g:3627:2: rule__Function_designator__Group__3__Impl
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
    // InternalPascal.g:3633:1: rule__Function_designator__Group__3__Impl : ( ')' ) ;
    public final void rule__Function_designator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3637:1: ( ( ')' ) )
            // InternalPascal.g:3638:1: ( ')' )
            {
            // InternalPascal.g:3638:1: ( ')' )
            // InternalPascal.g:3639:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_designatorAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:3649:1: rule__Function_procedure_declaration__Group__0 : rule__Function_procedure_declaration__Group__0__Impl rule__Function_procedure_declaration__Group__1 ;
    public final void rule__Function_procedure_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3653:1: ( rule__Function_procedure_declaration__Group__0__Impl rule__Function_procedure_declaration__Group__1 )
            // InternalPascal.g:3654:2: rule__Function_procedure_declaration__Group__0__Impl rule__Function_procedure_declaration__Group__1
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
    // InternalPascal.g:3661:1: rule__Function_procedure_declaration__Group__0__Impl : ( ( rule__Function_procedure_declaration__ProceduresAssignment_0 ) ) ;
    public final void rule__Function_procedure_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3665:1: ( ( ( rule__Function_procedure_declaration__ProceduresAssignment_0 ) ) )
            // InternalPascal.g:3666:1: ( ( rule__Function_procedure_declaration__ProceduresAssignment_0 ) )
            {
            // InternalPascal.g:3666:1: ( ( rule__Function_procedure_declaration__ProceduresAssignment_0 ) )
            // InternalPascal.g:3667:2: ( rule__Function_procedure_declaration__ProceduresAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_procedure_declarationAccess().getProceduresAssignment_0()); 
            }
            // InternalPascal.g:3668:2: ( rule__Function_procedure_declaration__ProceduresAssignment_0 )
            // InternalPascal.g:3668:3: rule__Function_procedure_declaration__ProceduresAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Function_procedure_declaration__ProceduresAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunction_procedure_declarationAccess().getProceduresAssignment_0()); 
            }

            }


            }

        }
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
    // InternalPascal.g:3676:1: rule__Function_procedure_declaration__Group__1 : rule__Function_procedure_declaration__Group__1__Impl ;
    public final void rule__Function_procedure_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3680:1: ( rule__Function_procedure_declaration__Group__1__Impl )
            // InternalPascal.g:3681:2: rule__Function_procedure_declaration__Group__1__Impl
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
    // InternalPascal.g:3687:1: rule__Function_procedure_declaration__Group__1__Impl : ( ';' ) ;
    public final void rule__Function_procedure_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3691:1: ( ( ';' ) )
            // InternalPascal.g:3692:1: ( ';' )
            {
            // InternalPascal.g:3692:1: ( ';' )
            // InternalPascal.g:3693:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_procedure_declarationAccess().getSemicolonKeyword_1()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__Procedure_declaration__Group__0"
    // InternalPascal.g:3703:1: rule__Procedure_declaration__Group__0 : rule__Procedure_declaration__Group__0__Impl rule__Procedure_declaration__Group__1 ;
    public final void rule__Procedure_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3707:1: ( rule__Procedure_declaration__Group__0__Impl rule__Procedure_declaration__Group__1 )
            // InternalPascal.g:3708:2: rule__Procedure_declaration__Group__0__Impl rule__Procedure_declaration__Group__1
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
    // InternalPascal.g:3715:1: rule__Procedure_declaration__Group__0__Impl : ( ( rule__Procedure_declaration__HeadingAssignment_0 ) ) ;
    public final void rule__Procedure_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3719:1: ( ( ( rule__Procedure_declaration__HeadingAssignment_0 ) ) )
            // InternalPascal.g:3720:1: ( ( rule__Procedure_declaration__HeadingAssignment_0 ) )
            {
            // InternalPascal.g:3720:1: ( ( rule__Procedure_declaration__HeadingAssignment_0 ) )
            // InternalPascal.g:3721:2: ( rule__Procedure_declaration__HeadingAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcedure_declarationAccess().getHeadingAssignment_0()); 
            }
            // InternalPascal.g:3722:2: ( rule__Procedure_declaration__HeadingAssignment_0 )
            // InternalPascal.g:3722:3: rule__Procedure_declaration__HeadingAssignment_0
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
    // InternalPascal.g:3730:1: rule__Procedure_declaration__Group__1 : rule__Procedure_declaration__Group__1__Impl rule__Procedure_declaration__Group__2 ;
    public final void rule__Procedure_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3734:1: ( rule__Procedure_declaration__Group__1__Impl rule__Procedure_declaration__Group__2 )
            // InternalPascal.g:3735:2: rule__Procedure_declaration__Group__1__Impl rule__Procedure_declaration__Group__2
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
    // InternalPascal.g:3742:1: rule__Procedure_declaration__Group__1__Impl : ( ';' ) ;
    public final void rule__Procedure_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3746:1: ( ( ';' ) )
            // InternalPascal.g:3747:1: ( ';' )
            {
            // InternalPascal.g:3747:1: ( ';' )
            // InternalPascal.g:3748:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcedure_declarationAccess().getSemicolonKeyword_1()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:3757:1: rule__Procedure_declaration__Group__2 : rule__Procedure_declaration__Group__2__Impl ;
    public final void rule__Procedure_declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3761:1: ( rule__Procedure_declaration__Group__2__Impl )
            // InternalPascal.g:3762:2: rule__Procedure_declaration__Group__2__Impl
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
    // InternalPascal.g:3768:1: rule__Procedure_declaration__Group__2__Impl : ( ( rule__Procedure_declaration__BlockAssignment_2 ) ) ;
    public final void rule__Procedure_declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3772:1: ( ( ( rule__Procedure_declaration__BlockAssignment_2 ) ) )
            // InternalPascal.g:3773:1: ( ( rule__Procedure_declaration__BlockAssignment_2 ) )
            {
            // InternalPascal.g:3773:1: ( ( rule__Procedure_declaration__BlockAssignment_2 ) )
            // InternalPascal.g:3774:2: ( rule__Procedure_declaration__BlockAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcedure_declarationAccess().getBlockAssignment_2()); 
            }
            // InternalPascal.g:3775:2: ( rule__Procedure_declaration__BlockAssignment_2 )
            // InternalPascal.g:3775:3: rule__Procedure_declaration__BlockAssignment_2
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
    // InternalPascal.g:3784:1: rule__Procedure_heading__Group__0 : rule__Procedure_heading__Group__0__Impl rule__Procedure_heading__Group__1 ;
    public final void rule__Procedure_heading__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3788:1: ( rule__Procedure_heading__Group__0__Impl rule__Procedure_heading__Group__1 )
            // InternalPascal.g:3789:2: rule__Procedure_heading__Group__0__Impl rule__Procedure_heading__Group__1
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
    // InternalPascal.g:3796:1: rule__Procedure_heading__Group__0__Impl : ( 'procedure' ) ;
    public final void rule__Procedure_heading__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3800:1: ( ( 'procedure' ) )
            // InternalPascal.g:3801:1: ( 'procedure' )
            {
            // InternalPascal.g:3801:1: ( 'procedure' )
            // InternalPascal.g:3802:2: 'procedure'
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
    // InternalPascal.g:3811:1: rule__Procedure_heading__Group__1 : rule__Procedure_heading__Group__1__Impl rule__Procedure_heading__Group__2 ;
    public final void rule__Procedure_heading__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3815:1: ( rule__Procedure_heading__Group__1__Impl rule__Procedure_heading__Group__2 )
            // InternalPascal.g:3816:2: rule__Procedure_heading__Group__1__Impl rule__Procedure_heading__Group__2
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
    // InternalPascal.g:3823:1: rule__Procedure_heading__Group__1__Impl : ( ( rule__Procedure_heading__NameAssignment_1 ) ) ;
    public final void rule__Procedure_heading__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3827:1: ( ( ( rule__Procedure_heading__NameAssignment_1 ) ) )
            // InternalPascal.g:3828:1: ( ( rule__Procedure_heading__NameAssignment_1 ) )
            {
            // InternalPascal.g:3828:1: ( ( rule__Procedure_heading__NameAssignment_1 ) )
            // InternalPascal.g:3829:2: ( rule__Procedure_heading__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcedure_headingAccess().getNameAssignment_1()); 
            }
            // InternalPascal.g:3830:2: ( rule__Procedure_heading__NameAssignment_1 )
            // InternalPascal.g:3830:3: rule__Procedure_heading__NameAssignment_1
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
    // InternalPascal.g:3838:1: rule__Procedure_heading__Group__2 : rule__Procedure_heading__Group__2__Impl ;
    public final void rule__Procedure_heading__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3842:1: ( rule__Procedure_heading__Group__2__Impl )
            // InternalPascal.g:3843:2: rule__Procedure_heading__Group__2__Impl
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
    // InternalPascal.g:3849:1: rule__Procedure_heading__Group__2__Impl : ( ( rule__Procedure_heading__ParametersAssignment_2 )? ) ;
    public final void rule__Procedure_heading__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3853:1: ( ( ( rule__Procedure_heading__ParametersAssignment_2 )? ) )
            // InternalPascal.g:3854:1: ( ( rule__Procedure_heading__ParametersAssignment_2 )? )
            {
            // InternalPascal.g:3854:1: ( ( rule__Procedure_heading__ParametersAssignment_2 )? )
            // InternalPascal.g:3855:2: ( rule__Procedure_heading__ParametersAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcedure_headingAccess().getParametersAssignment_2()); 
            }
            // InternalPascal.g:3856:2: ( rule__Procedure_heading__ParametersAssignment_2 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==33) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalPascal.g:3856:3: rule__Procedure_heading__ParametersAssignment_2
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


    // $ANTLR start "rule__Formal_parameter_list__Group__0"
    // InternalPascal.g:3865:1: rule__Formal_parameter_list__Group__0 : rule__Formal_parameter_list__Group__0__Impl rule__Formal_parameter_list__Group__1 ;
    public final void rule__Formal_parameter_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3869:1: ( rule__Formal_parameter_list__Group__0__Impl rule__Formal_parameter_list__Group__1 )
            // InternalPascal.g:3870:2: rule__Formal_parameter_list__Group__0__Impl rule__Formal_parameter_list__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalPascal.g:3877:1: rule__Formal_parameter_list__Group__0__Impl : ( '(' ) ;
    public final void rule__Formal_parameter_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3881:1: ( ( '(' ) )
            // InternalPascal.g:3882:1: ( '(' )
            {
            // InternalPascal.g:3882:1: ( '(' )
            // InternalPascal.g:3883:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormal_parameter_listAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:3892:1: rule__Formal_parameter_list__Group__1 : rule__Formal_parameter_list__Group__1__Impl rule__Formal_parameter_list__Group__2 ;
    public final void rule__Formal_parameter_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3896:1: ( rule__Formal_parameter_list__Group__1__Impl rule__Formal_parameter_list__Group__2 )
            // InternalPascal.g:3897:2: rule__Formal_parameter_list__Group__1__Impl rule__Formal_parameter_list__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalPascal.g:3904:1: rule__Formal_parameter_list__Group__1__Impl : ( ( rule__Formal_parameter_list__ParametersAssignment_1 ) ) ;
    public final void rule__Formal_parameter_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3908:1: ( ( ( rule__Formal_parameter_list__ParametersAssignment_1 ) ) )
            // InternalPascal.g:3909:1: ( ( rule__Formal_parameter_list__ParametersAssignment_1 ) )
            {
            // InternalPascal.g:3909:1: ( ( rule__Formal_parameter_list__ParametersAssignment_1 ) )
            // InternalPascal.g:3910:2: ( rule__Formal_parameter_list__ParametersAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormal_parameter_listAccess().getParametersAssignment_1()); 
            }
            // InternalPascal.g:3911:2: ( rule__Formal_parameter_list__ParametersAssignment_1 )
            // InternalPascal.g:3911:3: rule__Formal_parameter_list__ParametersAssignment_1
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
    // InternalPascal.g:3919:1: rule__Formal_parameter_list__Group__2 : rule__Formal_parameter_list__Group__2__Impl rule__Formal_parameter_list__Group__3 ;
    public final void rule__Formal_parameter_list__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3923:1: ( rule__Formal_parameter_list__Group__2__Impl rule__Formal_parameter_list__Group__3 )
            // InternalPascal.g:3924:2: rule__Formal_parameter_list__Group__2__Impl rule__Formal_parameter_list__Group__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalPascal.g:3931:1: rule__Formal_parameter_list__Group__2__Impl : ( ( rule__Formal_parameter_list__Group_2__0 )* ) ;
    public final void rule__Formal_parameter_list__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3935:1: ( ( ( rule__Formal_parameter_list__Group_2__0 )* ) )
            // InternalPascal.g:3936:1: ( ( rule__Formal_parameter_list__Group_2__0 )* )
            {
            // InternalPascal.g:3936:1: ( ( rule__Formal_parameter_list__Group_2__0 )* )
            // InternalPascal.g:3937:2: ( rule__Formal_parameter_list__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormal_parameter_listAccess().getGroup_2()); 
            }
            // InternalPascal.g:3938:2: ( rule__Formal_parameter_list__Group_2__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==24) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalPascal.g:3938:3: rule__Formal_parameter_list__Group_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Formal_parameter_list__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
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
    // InternalPascal.g:3946:1: rule__Formal_parameter_list__Group__3 : rule__Formal_parameter_list__Group__3__Impl ;
    public final void rule__Formal_parameter_list__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3950:1: ( rule__Formal_parameter_list__Group__3__Impl )
            // InternalPascal.g:3951:2: rule__Formal_parameter_list__Group__3__Impl
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
    // InternalPascal.g:3957:1: rule__Formal_parameter_list__Group__3__Impl : ( ')' ) ;
    public final void rule__Formal_parameter_list__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3961:1: ( ( ')' ) )
            // InternalPascal.g:3962:1: ( ')' )
            {
            // InternalPascal.g:3962:1: ( ')' )
            // InternalPascal.g:3963:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormal_parameter_listAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:3973:1: rule__Formal_parameter_list__Group_2__0 : rule__Formal_parameter_list__Group_2__0__Impl rule__Formal_parameter_list__Group_2__1 ;
    public final void rule__Formal_parameter_list__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3977:1: ( rule__Formal_parameter_list__Group_2__0__Impl rule__Formal_parameter_list__Group_2__1 )
            // InternalPascal.g:3978:2: rule__Formal_parameter_list__Group_2__0__Impl rule__Formal_parameter_list__Group_2__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalPascal.g:3985:1: rule__Formal_parameter_list__Group_2__0__Impl : ( ';' ) ;
    public final void rule__Formal_parameter_list__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3989:1: ( ( ';' ) )
            // InternalPascal.g:3990:1: ( ';' )
            {
            // InternalPascal.g:3990:1: ( ';' )
            // InternalPascal.g:3991:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormal_parameter_listAccess().getSemicolonKeyword_2_0()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:4000:1: rule__Formal_parameter_list__Group_2__1 : rule__Formal_parameter_list__Group_2__1__Impl ;
    public final void rule__Formal_parameter_list__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4004:1: ( rule__Formal_parameter_list__Group_2__1__Impl )
            // InternalPascal.g:4005:2: rule__Formal_parameter_list__Group_2__1__Impl
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
    // InternalPascal.g:4011:1: rule__Formal_parameter_list__Group_2__1__Impl : ( ( rule__Formal_parameter_list__ParametersAssignment_2_1 ) ) ;
    public final void rule__Formal_parameter_list__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4015:1: ( ( ( rule__Formal_parameter_list__ParametersAssignment_2_1 ) ) )
            // InternalPascal.g:4016:1: ( ( rule__Formal_parameter_list__ParametersAssignment_2_1 ) )
            {
            // InternalPascal.g:4016:1: ( ( rule__Formal_parameter_list__ParametersAssignment_2_1 ) )
            // InternalPascal.g:4017:2: ( rule__Formal_parameter_list__ParametersAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormal_parameter_listAccess().getParametersAssignment_2_1()); 
            }
            // InternalPascal.g:4018:2: ( rule__Formal_parameter_list__ParametersAssignment_2_1 )
            // InternalPascal.g:4018:3: rule__Formal_parameter_list__ParametersAssignment_2_1
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
    // InternalPascal.g:4027:1: rule__Value_parameter_section__Group__0 : rule__Value_parameter_section__Group__0__Impl rule__Value_parameter_section__Group__1 ;
    public final void rule__Value_parameter_section__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4031:1: ( rule__Value_parameter_section__Group__0__Impl rule__Value_parameter_section__Group__1 )
            // InternalPascal.g:4032:2: rule__Value_parameter_section__Group__0__Impl rule__Value_parameter_section__Group__1
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
    // InternalPascal.g:4039:1: rule__Value_parameter_section__Group__0__Impl : ( ( rule__Value_parameter_section__IdentifiersAssignment_0 ) ) ;
    public final void rule__Value_parameter_section__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4043:1: ( ( ( rule__Value_parameter_section__IdentifiersAssignment_0 ) ) )
            // InternalPascal.g:4044:1: ( ( rule__Value_parameter_section__IdentifiersAssignment_0 ) )
            {
            // InternalPascal.g:4044:1: ( ( rule__Value_parameter_section__IdentifiersAssignment_0 ) )
            // InternalPascal.g:4045:2: ( rule__Value_parameter_section__IdentifiersAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValue_parameter_sectionAccess().getIdentifiersAssignment_0()); 
            }
            // InternalPascal.g:4046:2: ( rule__Value_parameter_section__IdentifiersAssignment_0 )
            // InternalPascal.g:4046:3: rule__Value_parameter_section__IdentifiersAssignment_0
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
    // InternalPascal.g:4054:1: rule__Value_parameter_section__Group__1 : rule__Value_parameter_section__Group__1__Impl rule__Value_parameter_section__Group__2 ;
    public final void rule__Value_parameter_section__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4058:1: ( rule__Value_parameter_section__Group__1__Impl rule__Value_parameter_section__Group__2 )
            // InternalPascal.g:4059:2: rule__Value_parameter_section__Group__1__Impl rule__Value_parameter_section__Group__2
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
    // InternalPascal.g:4066:1: rule__Value_parameter_section__Group__1__Impl : ( ':' ) ;
    public final void rule__Value_parameter_section__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4070:1: ( ( ':' ) )
            // InternalPascal.g:4071:1: ( ':' )
            {
            // InternalPascal.g:4071:1: ( ':' )
            // InternalPascal.g:4072:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValue_parameter_sectionAccess().getColonKeyword_1()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:4081:1: rule__Value_parameter_section__Group__2 : rule__Value_parameter_section__Group__2__Impl ;
    public final void rule__Value_parameter_section__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4085:1: ( rule__Value_parameter_section__Group__2__Impl )
            // InternalPascal.g:4086:2: rule__Value_parameter_section__Group__2__Impl
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
    // InternalPascal.g:4092:1: rule__Value_parameter_section__Group__2__Impl : ( ( rule__Value_parameter_section__TypeAssignment_2 ) ) ;
    public final void rule__Value_parameter_section__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4096:1: ( ( ( rule__Value_parameter_section__TypeAssignment_2 ) ) )
            // InternalPascal.g:4097:1: ( ( rule__Value_parameter_section__TypeAssignment_2 ) )
            {
            // InternalPascal.g:4097:1: ( ( rule__Value_parameter_section__TypeAssignment_2 ) )
            // InternalPascal.g:4098:2: ( rule__Value_parameter_section__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValue_parameter_sectionAccess().getTypeAssignment_2()); 
            }
            // InternalPascal.g:4099:2: ( rule__Value_parameter_section__TypeAssignment_2 )
            // InternalPascal.g:4099:3: rule__Value_parameter_section__TypeAssignment_2
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
    // InternalPascal.g:4108:1: rule__Identifier_list__Group__0 : rule__Identifier_list__Group__0__Impl rule__Identifier_list__Group__1 ;
    public final void rule__Identifier_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4112:1: ( rule__Identifier_list__Group__0__Impl rule__Identifier_list__Group__1 )
            // InternalPascal.g:4113:2: rule__Identifier_list__Group__0__Impl rule__Identifier_list__Group__1
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
    // InternalPascal.g:4120:1: rule__Identifier_list__Group__0__Impl : ( ( rule__Identifier_list__NamesAssignment_0 ) ) ;
    public final void rule__Identifier_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4124:1: ( ( ( rule__Identifier_list__NamesAssignment_0 ) ) )
            // InternalPascal.g:4125:1: ( ( rule__Identifier_list__NamesAssignment_0 ) )
            {
            // InternalPascal.g:4125:1: ( ( rule__Identifier_list__NamesAssignment_0 ) )
            // InternalPascal.g:4126:2: ( rule__Identifier_list__NamesAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifier_listAccess().getNamesAssignment_0()); 
            }
            // InternalPascal.g:4127:2: ( rule__Identifier_list__NamesAssignment_0 )
            // InternalPascal.g:4127:3: rule__Identifier_list__NamesAssignment_0
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
    // InternalPascal.g:4135:1: rule__Identifier_list__Group__1 : rule__Identifier_list__Group__1__Impl ;
    public final void rule__Identifier_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4139:1: ( rule__Identifier_list__Group__1__Impl )
            // InternalPascal.g:4140:2: rule__Identifier_list__Group__1__Impl
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
    // InternalPascal.g:4146:1: rule__Identifier_list__Group__1__Impl : ( ( rule__Identifier_list__Group_1__0 )* ) ;
    public final void rule__Identifier_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4150:1: ( ( ( rule__Identifier_list__Group_1__0 )* ) )
            // InternalPascal.g:4151:1: ( ( rule__Identifier_list__Group_1__0 )* )
            {
            // InternalPascal.g:4151:1: ( ( rule__Identifier_list__Group_1__0 )* )
            // InternalPascal.g:4152:2: ( rule__Identifier_list__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifier_listAccess().getGroup_1()); 
            }
            // InternalPascal.g:4153:2: ( rule__Identifier_list__Group_1__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==32) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalPascal.g:4153:3: rule__Identifier_list__Group_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Identifier_list__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop37;
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
    // InternalPascal.g:4162:1: rule__Identifier_list__Group_1__0 : rule__Identifier_list__Group_1__0__Impl rule__Identifier_list__Group_1__1 ;
    public final void rule__Identifier_list__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4166:1: ( rule__Identifier_list__Group_1__0__Impl rule__Identifier_list__Group_1__1 )
            // InternalPascal.g:4167:2: rule__Identifier_list__Group_1__0__Impl rule__Identifier_list__Group_1__1
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
    // InternalPascal.g:4174:1: rule__Identifier_list__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Identifier_list__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4178:1: ( ( ',' ) )
            // InternalPascal.g:4179:1: ( ',' )
            {
            // InternalPascal.g:4179:1: ( ',' )
            // InternalPascal.g:4180:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifier_listAccess().getCommaKeyword_1_0()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:4189:1: rule__Identifier_list__Group_1__1 : rule__Identifier_list__Group_1__1__Impl ;
    public final void rule__Identifier_list__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4193:1: ( rule__Identifier_list__Group_1__1__Impl )
            // InternalPascal.g:4194:2: rule__Identifier_list__Group_1__1__Impl
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
    // InternalPascal.g:4200:1: rule__Identifier_list__Group_1__1__Impl : ( ( rule__Identifier_list__NamesAssignment_1_1 ) ) ;
    public final void rule__Identifier_list__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4204:1: ( ( ( rule__Identifier_list__NamesAssignment_1_1 ) ) )
            // InternalPascal.g:4205:1: ( ( rule__Identifier_list__NamesAssignment_1_1 ) )
            {
            // InternalPascal.g:4205:1: ( ( rule__Identifier_list__NamesAssignment_1_1 ) )
            // InternalPascal.g:4206:2: ( rule__Identifier_list__NamesAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifier_listAccess().getNamesAssignment_1_1()); 
            }
            // InternalPascal.g:4207:2: ( rule__Identifier_list__NamesAssignment_1_1 )
            // InternalPascal.g:4207:3: rule__Identifier_list__NamesAssignment_1_1
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
    // InternalPascal.g:4216:1: rule__Variable_parameter_section__Group__0 : rule__Variable_parameter_section__Group__0__Impl rule__Variable_parameter_section__Group__1 ;
    public final void rule__Variable_parameter_section__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4220:1: ( rule__Variable_parameter_section__Group__0__Impl rule__Variable_parameter_section__Group__1 )
            // InternalPascal.g:4221:2: rule__Variable_parameter_section__Group__0__Impl rule__Variable_parameter_section__Group__1
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
    // InternalPascal.g:4228:1: rule__Variable_parameter_section__Group__0__Impl : ( 'var' ) ;
    public final void rule__Variable_parameter_section__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4232:1: ( ( 'var' ) )
            // InternalPascal.g:4233:1: ( 'var' )
            {
            // InternalPascal.g:4233:1: ( 'var' )
            // InternalPascal.g:4234:2: 'var'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_parameter_sectionAccess().getVarKeyword_0()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:4243:1: rule__Variable_parameter_section__Group__1 : rule__Variable_parameter_section__Group__1__Impl rule__Variable_parameter_section__Group__2 ;
    public final void rule__Variable_parameter_section__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4247:1: ( rule__Variable_parameter_section__Group__1__Impl rule__Variable_parameter_section__Group__2 )
            // InternalPascal.g:4248:2: rule__Variable_parameter_section__Group__1__Impl rule__Variable_parameter_section__Group__2
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
    // InternalPascal.g:4255:1: rule__Variable_parameter_section__Group__1__Impl : ( ( rule__Variable_parameter_section__IndentifiersAssignment_1 ) ) ;
    public final void rule__Variable_parameter_section__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4259:1: ( ( ( rule__Variable_parameter_section__IndentifiersAssignment_1 ) ) )
            // InternalPascal.g:4260:1: ( ( rule__Variable_parameter_section__IndentifiersAssignment_1 ) )
            {
            // InternalPascal.g:4260:1: ( ( rule__Variable_parameter_section__IndentifiersAssignment_1 ) )
            // InternalPascal.g:4261:2: ( rule__Variable_parameter_section__IndentifiersAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_parameter_sectionAccess().getIndentifiersAssignment_1()); 
            }
            // InternalPascal.g:4262:2: ( rule__Variable_parameter_section__IndentifiersAssignment_1 )
            // InternalPascal.g:4262:3: rule__Variable_parameter_section__IndentifiersAssignment_1
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
    // InternalPascal.g:4270:1: rule__Variable_parameter_section__Group__2 : rule__Variable_parameter_section__Group__2__Impl rule__Variable_parameter_section__Group__3 ;
    public final void rule__Variable_parameter_section__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4274:1: ( rule__Variable_parameter_section__Group__2__Impl rule__Variable_parameter_section__Group__3 )
            // InternalPascal.g:4275:2: rule__Variable_parameter_section__Group__2__Impl rule__Variable_parameter_section__Group__3
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
    // InternalPascal.g:4282:1: rule__Variable_parameter_section__Group__2__Impl : ( ':' ) ;
    public final void rule__Variable_parameter_section__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4286:1: ( ( ':' ) )
            // InternalPascal.g:4287:1: ( ':' )
            {
            // InternalPascal.g:4287:1: ( ':' )
            // InternalPascal.g:4288:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_parameter_sectionAccess().getColonKeyword_2()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:4297:1: rule__Variable_parameter_section__Group__3 : rule__Variable_parameter_section__Group__3__Impl ;
    public final void rule__Variable_parameter_section__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4301:1: ( rule__Variable_parameter_section__Group__3__Impl )
            // InternalPascal.g:4302:2: rule__Variable_parameter_section__Group__3__Impl
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
    // InternalPascal.g:4308:1: rule__Variable_parameter_section__Group__3__Impl : ( ( rule__Variable_parameter_section__TypeAssignment_3 ) ) ;
    public final void rule__Variable_parameter_section__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4312:1: ( ( ( rule__Variable_parameter_section__TypeAssignment_3 ) ) )
            // InternalPascal.g:4313:1: ( ( rule__Variable_parameter_section__TypeAssignment_3 ) )
            {
            // InternalPascal.g:4313:1: ( ( rule__Variable_parameter_section__TypeAssignment_3 ) )
            // InternalPascal.g:4314:2: ( rule__Variable_parameter_section__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_parameter_sectionAccess().getTypeAssignment_3()); 
            }
            // InternalPascal.g:4315:2: ( rule__Variable_parameter_section__TypeAssignment_3 )
            // InternalPascal.g:4315:3: rule__Variable_parameter_section__TypeAssignment_3
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


    // $ANTLR start "rule__Set__Group__0"
    // InternalPascal.g:4324:1: rule__Set__Group__0 : rule__Set__Group__0__Impl rule__Set__Group__1 ;
    public final void rule__Set__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4328:1: ( rule__Set__Group__0__Impl rule__Set__Group__1 )
            // InternalPascal.g:4329:2: rule__Set__Group__0__Impl rule__Set__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalPascal.g:4336:1: rule__Set__Group__0__Impl : ( ( rule__Set__BracketsAssignment_0 ) ) ;
    public final void rule__Set__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4340:1: ( ( ( rule__Set__BracketsAssignment_0 ) ) )
            // InternalPascal.g:4341:1: ( ( rule__Set__BracketsAssignment_0 ) )
            {
            // InternalPascal.g:4341:1: ( ( rule__Set__BracketsAssignment_0 ) )
            // InternalPascal.g:4342:2: ( rule__Set__BracketsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetAccess().getBracketsAssignment_0()); 
            }
            // InternalPascal.g:4343:2: ( rule__Set__BracketsAssignment_0 )
            // InternalPascal.g:4343:3: rule__Set__BracketsAssignment_0
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
    // InternalPascal.g:4351:1: rule__Set__Group__1 : rule__Set__Group__1__Impl rule__Set__Group__2 ;
    public final void rule__Set__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4355:1: ( rule__Set__Group__1__Impl rule__Set__Group__2 )
            // InternalPascal.g:4356:2: rule__Set__Group__1__Impl rule__Set__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalPascal.g:4363:1: rule__Set__Group__1__Impl : ( ( rule__Set__ExpressionsAssignment_1 )? ) ;
    public final void rule__Set__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4367:1: ( ( ( rule__Set__ExpressionsAssignment_1 )? ) )
            // InternalPascal.g:4368:1: ( ( rule__Set__ExpressionsAssignment_1 )? )
            {
            // InternalPascal.g:4368:1: ( ( rule__Set__ExpressionsAssignment_1 )? )
            // InternalPascal.g:4369:2: ( rule__Set__ExpressionsAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetAccess().getExpressionsAssignment_1()); 
            }
            // InternalPascal.g:4370:2: ( rule__Set__ExpressionsAssignment_1 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=RULE_ID && LA38_0<=RULE_INTEGER_NUMBER)||LA38_0==RULE_ADDITION_OP||LA38_0==RULE_STRING||(LA38_0>=RULE_SIGNED_REAL_NUMBER && LA38_0<=RULE_REAL_NUMBER)||LA38_0==29||LA38_0==33||LA38_0==35||(LA38_0>=50 && LA38_0<=52)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalPascal.g:4370:3: rule__Set__ExpressionsAssignment_1
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
    // InternalPascal.g:4378:1: rule__Set__Group__2 : rule__Set__Group__2__Impl ;
    public final void rule__Set__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4382:1: ( rule__Set__Group__2__Impl )
            // InternalPascal.g:4383:2: rule__Set__Group__2__Impl
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
    // InternalPascal.g:4389:1: rule__Set__Group__2__Impl : ( ( rule__Set__BracketsAssignment_2 ) ) ;
    public final void rule__Set__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4393:1: ( ( ( rule__Set__BracketsAssignment_2 ) ) )
            // InternalPascal.g:4394:1: ( ( rule__Set__BracketsAssignment_2 ) )
            {
            // InternalPascal.g:4394:1: ( ( rule__Set__BracketsAssignment_2 ) )
            // InternalPascal.g:4395:2: ( rule__Set__BracketsAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetAccess().getBracketsAssignment_2()); 
            }
            // InternalPascal.g:4396:2: ( rule__Set__BracketsAssignment_2 )
            // InternalPascal.g:4396:3: rule__Set__BracketsAssignment_2
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
    // InternalPascal.g:4405:1: rule__Label_declaration__Group__0 : rule__Label_declaration__Group__0__Impl rule__Label_declaration__Group__1 ;
    public final void rule__Label_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4409:1: ( rule__Label_declaration__Group__0__Impl rule__Label_declaration__Group__1 )
            // InternalPascal.g:4410:2: rule__Label_declaration__Group__0__Impl rule__Label_declaration__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalPascal.g:4417:1: rule__Label_declaration__Group__0__Impl : ( 'label' ) ;
    public final void rule__Label_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4421:1: ( ( 'label' ) )
            // InternalPascal.g:4422:1: ( 'label' )
            {
            // InternalPascal.g:4422:1: ( 'label' )
            // InternalPascal.g:4423:2: 'label'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabel_declarationAccess().getLabelKeyword_0()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:4432:1: rule__Label_declaration__Group__1 : rule__Label_declaration__Group__1__Impl rule__Label_declaration__Group__2 ;
    public final void rule__Label_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4436:1: ( rule__Label_declaration__Group__1__Impl rule__Label_declaration__Group__2 )
            // InternalPascal.g:4437:2: rule__Label_declaration__Group__1__Impl rule__Label_declaration__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalPascal.g:4444:1: rule__Label_declaration__Group__1__Impl : ( ( rule__Label_declaration__LabelsAssignment_1 ) ) ;
    public final void rule__Label_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4448:1: ( ( ( rule__Label_declaration__LabelsAssignment_1 ) ) )
            // InternalPascal.g:4449:1: ( ( rule__Label_declaration__LabelsAssignment_1 ) )
            {
            // InternalPascal.g:4449:1: ( ( rule__Label_declaration__LabelsAssignment_1 ) )
            // InternalPascal.g:4450:2: ( rule__Label_declaration__LabelsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabel_declarationAccess().getLabelsAssignment_1()); 
            }
            // InternalPascal.g:4451:2: ( rule__Label_declaration__LabelsAssignment_1 )
            // InternalPascal.g:4451:3: rule__Label_declaration__LabelsAssignment_1
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
    // InternalPascal.g:4459:1: rule__Label_declaration__Group__2 : rule__Label_declaration__Group__2__Impl rule__Label_declaration__Group__3 ;
    public final void rule__Label_declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4463:1: ( rule__Label_declaration__Group__2__Impl rule__Label_declaration__Group__3 )
            // InternalPascal.g:4464:2: rule__Label_declaration__Group__2__Impl rule__Label_declaration__Group__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalPascal.g:4471:1: rule__Label_declaration__Group__2__Impl : ( ( rule__Label_declaration__Group_2__0 )* ) ;
    public final void rule__Label_declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4475:1: ( ( ( rule__Label_declaration__Group_2__0 )* ) )
            // InternalPascal.g:4476:1: ( ( rule__Label_declaration__Group_2__0 )* )
            {
            // InternalPascal.g:4476:1: ( ( rule__Label_declaration__Group_2__0 )* )
            // InternalPascal.g:4477:2: ( rule__Label_declaration__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabel_declarationAccess().getGroup_2()); 
            }
            // InternalPascal.g:4478:2: ( rule__Label_declaration__Group_2__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==32) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalPascal.g:4478:3: rule__Label_declaration__Group_2__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Label_declaration__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop39;
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
    // InternalPascal.g:4486:1: rule__Label_declaration__Group__3 : rule__Label_declaration__Group__3__Impl ;
    public final void rule__Label_declaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4490:1: ( rule__Label_declaration__Group__3__Impl )
            // InternalPascal.g:4491:2: rule__Label_declaration__Group__3__Impl
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
    // InternalPascal.g:4497:1: rule__Label_declaration__Group__3__Impl : ( ';' ) ;
    public final void rule__Label_declaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4501:1: ( ( ';' ) )
            // InternalPascal.g:4502:1: ( ';' )
            {
            // InternalPascal.g:4502:1: ( ';' )
            // InternalPascal.g:4503:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabel_declarationAccess().getSemicolonKeyword_3()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:4513:1: rule__Label_declaration__Group_2__0 : rule__Label_declaration__Group_2__0__Impl rule__Label_declaration__Group_2__1 ;
    public final void rule__Label_declaration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4517:1: ( rule__Label_declaration__Group_2__0__Impl rule__Label_declaration__Group_2__1 )
            // InternalPascal.g:4518:2: rule__Label_declaration__Group_2__0__Impl rule__Label_declaration__Group_2__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalPascal.g:4525:1: rule__Label_declaration__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Label_declaration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4529:1: ( ( ',' ) )
            // InternalPascal.g:4530:1: ( ',' )
            {
            // InternalPascal.g:4530:1: ( ',' )
            // InternalPascal.g:4531:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabel_declarationAccess().getCommaKeyword_2_0()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:4540:1: rule__Label_declaration__Group_2__1 : rule__Label_declaration__Group_2__1__Impl ;
    public final void rule__Label_declaration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4544:1: ( rule__Label_declaration__Group_2__1__Impl )
            // InternalPascal.g:4545:2: rule__Label_declaration__Group_2__1__Impl
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
    // InternalPascal.g:4551:1: rule__Label_declaration__Group_2__1__Impl : ( ( rule__Label_declaration__LabelsAssignment_2_1 ) ) ;
    public final void rule__Label_declaration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4555:1: ( ( ( rule__Label_declaration__LabelsAssignment_2_1 ) ) )
            // InternalPascal.g:4556:1: ( ( rule__Label_declaration__LabelsAssignment_2_1 ) )
            {
            // InternalPascal.g:4556:1: ( ( rule__Label_declaration__LabelsAssignment_2_1 ) )
            // InternalPascal.g:4557:2: ( rule__Label_declaration__LabelsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabel_declarationAccess().getLabelsAssignment_2_1()); 
            }
            // InternalPascal.g:4558:2: ( rule__Label_declaration__LabelsAssignment_2_1 )
            // InternalPascal.g:4558:3: rule__Label_declaration__LabelsAssignment_2_1
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
    // InternalPascal.g:4567:1: rule__Constant__Group_0__0 : rule__Constant__Group_0__0__Impl rule__Constant__Group_0__1 ;
    public final void rule__Constant__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4571:1: ( rule__Constant__Group_0__0__Impl rule__Constant__Group_0__1 )
            // InternalPascal.g:4572:2: rule__Constant__Group_0__0__Impl rule__Constant__Group_0__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalPascal.g:4579:1: rule__Constant__Group_0__0__Impl : ( ( rule__Constant__OpteratorAssignment_0_0 )? ) ;
    public final void rule__Constant__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4583:1: ( ( ( rule__Constant__OpteratorAssignment_0_0 )? ) )
            // InternalPascal.g:4584:1: ( ( rule__Constant__OpteratorAssignment_0_0 )? )
            {
            // InternalPascal.g:4584:1: ( ( rule__Constant__OpteratorAssignment_0_0 )? )
            // InternalPascal.g:4585:2: ( rule__Constant__OpteratorAssignment_0_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getOpteratorAssignment_0_0()); 
            }
            // InternalPascal.g:4586:2: ( rule__Constant__OpteratorAssignment_0_0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ADDITION_OP) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalPascal.g:4586:3: rule__Constant__OpteratorAssignment_0_0
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
    // InternalPascal.g:4594:1: rule__Constant__Group_0__1 : rule__Constant__Group_0__1__Impl ;
    public final void rule__Constant__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4598:1: ( rule__Constant__Group_0__1__Impl )
            // InternalPascal.g:4599:2: rule__Constant__Group_0__1__Impl
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
    // InternalPascal.g:4605:1: rule__Constant__Group_0__1__Impl : ( ( rule__Constant__Alternatives_0_1 ) ) ;
    public final void rule__Constant__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4609:1: ( ( ( rule__Constant__Alternatives_0_1 ) ) )
            // InternalPascal.g:4610:1: ( ( rule__Constant__Alternatives_0_1 ) )
            {
            // InternalPascal.g:4610:1: ( ( rule__Constant__Alternatives_0_1 ) )
            // InternalPascal.g:4611:2: ( rule__Constant__Alternatives_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getAlternatives_0_1()); 
            }
            // InternalPascal.g:4612:2: ( rule__Constant__Alternatives_0_1 )
            // InternalPascal.g:4612:3: rule__Constant__Alternatives_0_1
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
    // InternalPascal.g:4621:1: rule__Constant_definition_part__Group__0 : rule__Constant_definition_part__Group__0__Impl rule__Constant_definition_part__Group__1 ;
    public final void rule__Constant_definition_part__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4625:1: ( rule__Constant_definition_part__Group__0__Impl rule__Constant_definition_part__Group__1 )
            // InternalPascal.g:4626:2: rule__Constant_definition_part__Group__0__Impl rule__Constant_definition_part__Group__1
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
    // InternalPascal.g:4633:1: rule__Constant_definition_part__Group__0__Impl : ( 'const' ) ;
    public final void rule__Constant_definition_part__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4637:1: ( ( 'const' ) )
            // InternalPascal.g:4638:1: ( 'const' )
            {
            // InternalPascal.g:4638:1: ( 'const' )
            // InternalPascal.g:4639:2: 'const'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstant_definition_partAccess().getConstKeyword_0()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:4648:1: rule__Constant_definition_part__Group__1 : rule__Constant_definition_part__Group__1__Impl ;
    public final void rule__Constant_definition_part__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4652:1: ( rule__Constant_definition_part__Group__1__Impl )
            // InternalPascal.g:4653:2: rule__Constant_definition_part__Group__1__Impl
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
    // InternalPascal.g:4659:1: rule__Constant_definition_part__Group__1__Impl : ( ( ( rule__Constant_definition_part__Group_1__0 ) ) ( ( rule__Constant_definition_part__Group_1__0 )* ) ) ;
    public final void rule__Constant_definition_part__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4663:1: ( ( ( ( rule__Constant_definition_part__Group_1__0 ) ) ( ( rule__Constant_definition_part__Group_1__0 )* ) ) )
            // InternalPascal.g:4664:1: ( ( ( rule__Constant_definition_part__Group_1__0 ) ) ( ( rule__Constant_definition_part__Group_1__0 )* ) )
            {
            // InternalPascal.g:4664:1: ( ( ( rule__Constant_definition_part__Group_1__0 ) ) ( ( rule__Constant_definition_part__Group_1__0 )* ) )
            // InternalPascal.g:4665:2: ( ( rule__Constant_definition_part__Group_1__0 ) ) ( ( rule__Constant_definition_part__Group_1__0 )* )
            {
            // InternalPascal.g:4665:2: ( ( rule__Constant_definition_part__Group_1__0 ) )
            // InternalPascal.g:4666:3: ( rule__Constant_definition_part__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstant_definition_partAccess().getGroup_1()); 
            }
            // InternalPascal.g:4667:3: ( rule__Constant_definition_part__Group_1__0 )
            // InternalPascal.g:4667:4: rule__Constant_definition_part__Group_1__0
            {
            pushFollow(FOLLOW_32);
            rule__Constant_definition_part__Group_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstant_definition_partAccess().getGroup_1()); 
            }

            }

            // InternalPascal.g:4670:2: ( ( rule__Constant_definition_part__Group_1__0 )* )
            // InternalPascal.g:4671:3: ( rule__Constant_definition_part__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstant_definition_partAccess().getGroup_1()); 
            }
            // InternalPascal.g:4672:3: ( rule__Constant_definition_part__Group_1__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_ID) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalPascal.g:4672:4: rule__Constant_definition_part__Group_1__0
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__Constant_definition_part__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop41;
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
    // InternalPascal.g:4682:1: rule__Constant_definition_part__Group_1__0 : rule__Constant_definition_part__Group_1__0__Impl rule__Constant_definition_part__Group_1__1 ;
    public final void rule__Constant_definition_part__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4686:1: ( rule__Constant_definition_part__Group_1__0__Impl rule__Constant_definition_part__Group_1__1 )
            // InternalPascal.g:4687:2: rule__Constant_definition_part__Group_1__0__Impl rule__Constant_definition_part__Group_1__1
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
    // InternalPascal.g:4694:1: rule__Constant_definition_part__Group_1__0__Impl : ( ( rule__Constant_definition_part__ConstsAssignment_1_0 ) ) ;
    public final void rule__Constant_definition_part__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4698:1: ( ( ( rule__Constant_definition_part__ConstsAssignment_1_0 ) ) )
            // InternalPascal.g:4699:1: ( ( rule__Constant_definition_part__ConstsAssignment_1_0 ) )
            {
            // InternalPascal.g:4699:1: ( ( rule__Constant_definition_part__ConstsAssignment_1_0 ) )
            // InternalPascal.g:4700:2: ( rule__Constant_definition_part__ConstsAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstant_definition_partAccess().getConstsAssignment_1_0()); 
            }
            // InternalPascal.g:4701:2: ( rule__Constant_definition_part__ConstsAssignment_1_0 )
            // InternalPascal.g:4701:3: rule__Constant_definition_part__ConstsAssignment_1_0
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
    // InternalPascal.g:4709:1: rule__Constant_definition_part__Group_1__1 : rule__Constant_definition_part__Group_1__1__Impl ;
    public final void rule__Constant_definition_part__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4713:1: ( rule__Constant_definition_part__Group_1__1__Impl )
            // InternalPascal.g:4714:2: rule__Constant_definition_part__Group_1__1__Impl
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
    // InternalPascal.g:4720:1: rule__Constant_definition_part__Group_1__1__Impl : ( ';' ) ;
    public final void rule__Constant_definition_part__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4724:1: ( ( ';' ) )
            // InternalPascal.g:4725:1: ( ';' )
            {
            // InternalPascal.g:4725:1: ( ';' )
            // InternalPascal.g:4726:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstant_definition_partAccess().getSemicolonKeyword_1_1()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:4736:1: rule__Constant_definition__Group__0 : rule__Constant_definition__Group__0__Impl rule__Constant_definition__Group__1 ;
    public final void rule__Constant_definition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4740:1: ( rule__Constant_definition__Group__0__Impl rule__Constant_definition__Group__1 )
            // InternalPascal.g:4741:2: rule__Constant_definition__Group__0__Impl rule__Constant_definition__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalPascal.g:4748:1: rule__Constant_definition__Group__0__Impl : ( ( rule__Constant_definition__NameAssignment_0 ) ) ;
    public final void rule__Constant_definition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4752:1: ( ( ( rule__Constant_definition__NameAssignment_0 ) ) )
            // InternalPascal.g:4753:1: ( ( rule__Constant_definition__NameAssignment_0 ) )
            {
            // InternalPascal.g:4753:1: ( ( rule__Constant_definition__NameAssignment_0 ) )
            // InternalPascal.g:4754:2: ( rule__Constant_definition__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstant_definitionAccess().getNameAssignment_0()); 
            }
            // InternalPascal.g:4755:2: ( rule__Constant_definition__NameAssignment_0 )
            // InternalPascal.g:4755:3: rule__Constant_definition__NameAssignment_0
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
    // InternalPascal.g:4763:1: rule__Constant_definition__Group__1 : rule__Constant_definition__Group__1__Impl rule__Constant_definition__Group__2 ;
    public final void rule__Constant_definition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4767:1: ( rule__Constant_definition__Group__1__Impl rule__Constant_definition__Group__2 )
            // InternalPascal.g:4768:2: rule__Constant_definition__Group__1__Impl rule__Constant_definition__Group__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalPascal.g:4775:1: rule__Constant_definition__Group__1__Impl : ( '=' ) ;
    public final void rule__Constant_definition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4779:1: ( ( '=' ) )
            // InternalPascal.g:4780:1: ( '=' )
            {
            // InternalPascal.g:4780:1: ( '=' )
            // InternalPascal.g:4781:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstant_definitionAccess().getEqualsSignKeyword_1()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:4790:1: rule__Constant_definition__Group__2 : rule__Constant_definition__Group__2__Impl ;
    public final void rule__Constant_definition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4794:1: ( rule__Constant_definition__Group__2__Impl )
            // InternalPascal.g:4795:2: rule__Constant_definition__Group__2__Impl
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
    // InternalPascal.g:4801:1: rule__Constant_definition__Group__2__Impl : ( ( rule__Constant_definition__ConstAssignment_2 ) ) ;
    public final void rule__Constant_definition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4805:1: ( ( ( rule__Constant_definition__ConstAssignment_2 ) ) )
            // InternalPascal.g:4806:1: ( ( rule__Constant_definition__ConstAssignment_2 ) )
            {
            // InternalPascal.g:4806:1: ( ( rule__Constant_definition__ConstAssignment_2 ) )
            // InternalPascal.g:4807:2: ( rule__Constant_definition__ConstAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstant_definitionAccess().getConstAssignment_2()); 
            }
            // InternalPascal.g:4808:2: ( rule__Constant_definition__ConstAssignment_2 )
            // InternalPascal.g:4808:3: rule__Constant_definition__ConstAssignment_2
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
    // InternalPascal.g:4817:1: rule__Type_definition_part__Group__0 : rule__Type_definition_part__Group__0__Impl rule__Type_definition_part__Group__1 ;
    public final void rule__Type_definition_part__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4821:1: ( rule__Type_definition_part__Group__0__Impl rule__Type_definition_part__Group__1 )
            // InternalPascal.g:4822:2: rule__Type_definition_part__Group__0__Impl rule__Type_definition_part__Group__1
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
    // InternalPascal.g:4829:1: rule__Type_definition_part__Group__0__Impl : ( 'type' ) ;
    public final void rule__Type_definition_part__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4833:1: ( ( 'type' ) )
            // InternalPascal.g:4834:1: ( 'type' )
            {
            // InternalPascal.g:4834:1: ( 'type' )
            // InternalPascal.g:4835:2: 'type'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_definition_partAccess().getTypeKeyword_0()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:4844:1: rule__Type_definition_part__Group__1 : rule__Type_definition_part__Group__1__Impl ;
    public final void rule__Type_definition_part__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4848:1: ( rule__Type_definition_part__Group__1__Impl )
            // InternalPascal.g:4849:2: rule__Type_definition_part__Group__1__Impl
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
    // InternalPascal.g:4855:1: rule__Type_definition_part__Group__1__Impl : ( ( ( rule__Type_definition_part__Group_1__0 ) ) ( ( rule__Type_definition_part__Group_1__0 )* ) ) ;
    public final void rule__Type_definition_part__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4859:1: ( ( ( ( rule__Type_definition_part__Group_1__0 ) ) ( ( rule__Type_definition_part__Group_1__0 )* ) ) )
            // InternalPascal.g:4860:1: ( ( ( rule__Type_definition_part__Group_1__0 ) ) ( ( rule__Type_definition_part__Group_1__0 )* ) )
            {
            // InternalPascal.g:4860:1: ( ( ( rule__Type_definition_part__Group_1__0 ) ) ( ( rule__Type_definition_part__Group_1__0 )* ) )
            // InternalPascal.g:4861:2: ( ( rule__Type_definition_part__Group_1__0 ) ) ( ( rule__Type_definition_part__Group_1__0 )* )
            {
            // InternalPascal.g:4861:2: ( ( rule__Type_definition_part__Group_1__0 ) )
            // InternalPascal.g:4862:3: ( rule__Type_definition_part__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_definition_partAccess().getGroup_1()); 
            }
            // InternalPascal.g:4863:3: ( rule__Type_definition_part__Group_1__0 )
            // InternalPascal.g:4863:4: rule__Type_definition_part__Group_1__0
            {
            pushFollow(FOLLOW_32);
            rule__Type_definition_part__Group_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getType_definition_partAccess().getGroup_1()); 
            }

            }

            // InternalPascal.g:4866:2: ( ( rule__Type_definition_part__Group_1__0 )* )
            // InternalPascal.g:4867:3: ( rule__Type_definition_part__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_definition_partAccess().getGroup_1()); 
            }
            // InternalPascal.g:4868:3: ( rule__Type_definition_part__Group_1__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_ID) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalPascal.g:4868:4: rule__Type_definition_part__Group_1__0
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__Type_definition_part__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop42;
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
    // InternalPascal.g:4878:1: rule__Type_definition_part__Group_1__0 : rule__Type_definition_part__Group_1__0__Impl rule__Type_definition_part__Group_1__1 ;
    public final void rule__Type_definition_part__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4882:1: ( rule__Type_definition_part__Group_1__0__Impl rule__Type_definition_part__Group_1__1 )
            // InternalPascal.g:4883:2: rule__Type_definition_part__Group_1__0__Impl rule__Type_definition_part__Group_1__1
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
    // InternalPascal.g:4890:1: rule__Type_definition_part__Group_1__0__Impl : ( ( rule__Type_definition_part__TypesAssignment_1_0 ) ) ;
    public final void rule__Type_definition_part__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4894:1: ( ( ( rule__Type_definition_part__TypesAssignment_1_0 ) ) )
            // InternalPascal.g:4895:1: ( ( rule__Type_definition_part__TypesAssignment_1_0 ) )
            {
            // InternalPascal.g:4895:1: ( ( rule__Type_definition_part__TypesAssignment_1_0 ) )
            // InternalPascal.g:4896:2: ( rule__Type_definition_part__TypesAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_definition_partAccess().getTypesAssignment_1_0()); 
            }
            // InternalPascal.g:4897:2: ( rule__Type_definition_part__TypesAssignment_1_0 )
            // InternalPascal.g:4897:3: rule__Type_definition_part__TypesAssignment_1_0
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
    // InternalPascal.g:4905:1: rule__Type_definition_part__Group_1__1 : rule__Type_definition_part__Group_1__1__Impl ;
    public final void rule__Type_definition_part__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4909:1: ( rule__Type_definition_part__Group_1__1__Impl )
            // InternalPascal.g:4910:2: rule__Type_definition_part__Group_1__1__Impl
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
    // InternalPascal.g:4916:1: rule__Type_definition_part__Group_1__1__Impl : ( ';' ) ;
    public final void rule__Type_definition_part__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4920:1: ( ( ';' ) )
            // InternalPascal.g:4921:1: ( ';' )
            {
            // InternalPascal.g:4921:1: ( ';' )
            // InternalPascal.g:4922:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_definition_partAccess().getSemicolonKeyword_1_1()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:4932:1: rule__Type_definition__Group__0 : rule__Type_definition__Group__0__Impl rule__Type_definition__Group__1 ;
    public final void rule__Type_definition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4936:1: ( rule__Type_definition__Group__0__Impl rule__Type_definition__Group__1 )
            // InternalPascal.g:4937:2: rule__Type_definition__Group__0__Impl rule__Type_definition__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalPascal.g:4944:1: rule__Type_definition__Group__0__Impl : ( ( rule__Type_definition__NameAssignment_0 ) ) ;
    public final void rule__Type_definition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4948:1: ( ( ( rule__Type_definition__NameAssignment_0 ) ) )
            // InternalPascal.g:4949:1: ( ( rule__Type_definition__NameAssignment_0 ) )
            {
            // InternalPascal.g:4949:1: ( ( rule__Type_definition__NameAssignment_0 ) )
            // InternalPascal.g:4950:2: ( rule__Type_definition__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_definitionAccess().getNameAssignment_0()); 
            }
            // InternalPascal.g:4951:2: ( rule__Type_definition__NameAssignment_0 )
            // InternalPascal.g:4951:3: rule__Type_definition__NameAssignment_0
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
    // InternalPascal.g:4959:1: rule__Type_definition__Group__1 : rule__Type_definition__Group__1__Impl rule__Type_definition__Group__2 ;
    public final void rule__Type_definition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4963:1: ( rule__Type_definition__Group__1__Impl rule__Type_definition__Group__2 )
            // InternalPascal.g:4964:2: rule__Type_definition__Group__1__Impl rule__Type_definition__Group__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalPascal.g:4971:1: rule__Type_definition__Group__1__Impl : ( '=' ) ;
    public final void rule__Type_definition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4975:1: ( ( '=' ) )
            // InternalPascal.g:4976:1: ( '=' )
            {
            // InternalPascal.g:4976:1: ( '=' )
            // InternalPascal.g:4977:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_definitionAccess().getEqualsSignKeyword_1()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:4986:1: rule__Type_definition__Group__2 : rule__Type_definition__Group__2__Impl ;
    public final void rule__Type_definition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4990:1: ( rule__Type_definition__Group__2__Impl )
            // InternalPascal.g:4991:2: rule__Type_definition__Group__2__Impl
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
    // InternalPascal.g:4997:1: rule__Type_definition__Group__2__Impl : ( ( rule__Type_definition__TypeAssignment_2 ) ) ;
    public final void rule__Type_definition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5001:1: ( ( ( rule__Type_definition__TypeAssignment_2 ) ) )
            // InternalPascal.g:5002:1: ( ( rule__Type_definition__TypeAssignment_2 ) )
            {
            // InternalPascal.g:5002:1: ( ( rule__Type_definition__TypeAssignment_2 ) )
            // InternalPascal.g:5003:2: ( rule__Type_definition__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_definitionAccess().getTypeAssignment_2()); 
            }
            // InternalPascal.g:5004:2: ( rule__Type_definition__TypeAssignment_2 )
            // InternalPascal.g:5004:3: rule__Type_definition__TypeAssignment_2
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
    // InternalPascal.g:5013:1: rule__Subrange_type__Group_0__0 : rule__Subrange_type__Group_0__0__Impl rule__Subrange_type__Group_0__1 ;
    public final void rule__Subrange_type__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5017:1: ( rule__Subrange_type__Group_0__0__Impl rule__Subrange_type__Group_0__1 )
            // InternalPascal.g:5018:2: rule__Subrange_type__Group_0__0__Impl rule__Subrange_type__Group_0__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalPascal.g:5025:1: rule__Subrange_type__Group_0__0__Impl : ( ( rule__Subrange_type__InitialConstAssignment_0_0 ) ) ;
    public final void rule__Subrange_type__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5029:1: ( ( ( rule__Subrange_type__InitialConstAssignment_0_0 ) ) )
            // InternalPascal.g:5030:1: ( ( rule__Subrange_type__InitialConstAssignment_0_0 ) )
            {
            // InternalPascal.g:5030:1: ( ( rule__Subrange_type__InitialConstAssignment_0_0 ) )
            // InternalPascal.g:5031:2: ( rule__Subrange_type__InitialConstAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubrange_typeAccess().getInitialConstAssignment_0_0()); 
            }
            // InternalPascal.g:5032:2: ( rule__Subrange_type__InitialConstAssignment_0_0 )
            // InternalPascal.g:5032:3: rule__Subrange_type__InitialConstAssignment_0_0
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
    // InternalPascal.g:5040:1: rule__Subrange_type__Group_0__1 : rule__Subrange_type__Group_0__1__Impl rule__Subrange_type__Group_0__2 ;
    public final void rule__Subrange_type__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5044:1: ( rule__Subrange_type__Group_0__1__Impl rule__Subrange_type__Group_0__2 )
            // InternalPascal.g:5045:2: rule__Subrange_type__Group_0__1__Impl rule__Subrange_type__Group_0__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalPascal.g:5052:1: rule__Subrange_type__Group_0__1__Impl : ( '..' ) ;
    public final void rule__Subrange_type__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5056:1: ( ( '..' ) )
            // InternalPascal.g:5057:1: ( '..' )
            {
            // InternalPascal.g:5057:1: ( '..' )
            // InternalPascal.g:5058:2: '..'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubrange_typeAccess().getFullStopFullStopKeyword_0_1()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:5067:1: rule__Subrange_type__Group_0__2 : rule__Subrange_type__Group_0__2__Impl ;
    public final void rule__Subrange_type__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5071:1: ( rule__Subrange_type__Group_0__2__Impl )
            // InternalPascal.g:5072:2: rule__Subrange_type__Group_0__2__Impl
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
    // InternalPascal.g:5078:1: rule__Subrange_type__Group_0__2__Impl : ( ( rule__Subrange_type__FinalConstAssignment_0_2 ) ) ;
    public final void rule__Subrange_type__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5082:1: ( ( ( rule__Subrange_type__FinalConstAssignment_0_2 ) ) )
            // InternalPascal.g:5083:1: ( ( rule__Subrange_type__FinalConstAssignment_0_2 ) )
            {
            // InternalPascal.g:5083:1: ( ( rule__Subrange_type__FinalConstAssignment_0_2 ) )
            // InternalPascal.g:5084:2: ( rule__Subrange_type__FinalConstAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubrange_typeAccess().getFinalConstAssignment_0_2()); 
            }
            // InternalPascal.g:5085:2: ( rule__Subrange_type__FinalConstAssignment_0_2 )
            // InternalPascal.g:5085:3: rule__Subrange_type__FinalConstAssignment_0_2
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
    // InternalPascal.g:5094:1: rule__Subrange_type__Group_1__0 : rule__Subrange_type__Group_1__0__Impl rule__Subrange_type__Group_1__1 ;
    public final void rule__Subrange_type__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5098:1: ( rule__Subrange_type__Group_1__0__Impl rule__Subrange_type__Group_1__1 )
            // InternalPascal.g:5099:2: rule__Subrange_type__Group_1__0__Impl rule__Subrange_type__Group_1__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalPascal.g:5106:1: rule__Subrange_type__Group_1__0__Impl : ( ( rule__Subrange_type__SubrangeAssignment_1_0 ) ) ;
    public final void rule__Subrange_type__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5110:1: ( ( ( rule__Subrange_type__SubrangeAssignment_1_0 ) ) )
            // InternalPascal.g:5111:1: ( ( rule__Subrange_type__SubrangeAssignment_1_0 ) )
            {
            // InternalPascal.g:5111:1: ( ( rule__Subrange_type__SubrangeAssignment_1_0 ) )
            // InternalPascal.g:5112:2: ( rule__Subrange_type__SubrangeAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubrange_typeAccess().getSubrangeAssignment_1_0()); 
            }
            // InternalPascal.g:5113:2: ( rule__Subrange_type__SubrangeAssignment_1_0 )
            // InternalPascal.g:5113:3: rule__Subrange_type__SubrangeAssignment_1_0
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
    // InternalPascal.g:5121:1: rule__Subrange_type__Group_1__1 : rule__Subrange_type__Group_1__1__Impl ;
    public final void rule__Subrange_type__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5125:1: ( rule__Subrange_type__Group_1__1__Impl )
            // InternalPascal.g:5126:2: rule__Subrange_type__Group_1__1__Impl
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
    // InternalPascal.g:5132:1: rule__Subrange_type__Group_1__1__Impl : ( ( rule__Subrange_type__ConstAssignment_1_1 ) ) ;
    public final void rule__Subrange_type__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5136:1: ( ( ( rule__Subrange_type__ConstAssignment_1_1 ) ) )
            // InternalPascal.g:5137:1: ( ( rule__Subrange_type__ConstAssignment_1_1 ) )
            {
            // InternalPascal.g:5137:1: ( ( rule__Subrange_type__ConstAssignment_1_1 ) )
            // InternalPascal.g:5138:2: ( rule__Subrange_type__ConstAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubrange_typeAccess().getConstAssignment_1_1()); 
            }
            // InternalPascal.g:5139:2: ( rule__Subrange_type__ConstAssignment_1_1 )
            // InternalPascal.g:5139:3: rule__Subrange_type__ConstAssignment_1_1
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
    // InternalPascal.g:5148:1: rule__Enumerated_type__Group__0 : rule__Enumerated_type__Group__0__Impl rule__Enumerated_type__Group__1 ;
    public final void rule__Enumerated_type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5152:1: ( rule__Enumerated_type__Group__0__Impl rule__Enumerated_type__Group__1 )
            // InternalPascal.g:5153:2: rule__Enumerated_type__Group__0__Impl rule__Enumerated_type__Group__1
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
    // InternalPascal.g:5160:1: rule__Enumerated_type__Group__0__Impl : ( '(' ) ;
    public final void rule__Enumerated_type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5164:1: ( ( '(' ) )
            // InternalPascal.g:5165:1: ( '(' )
            {
            // InternalPascal.g:5165:1: ( '(' )
            // InternalPascal.g:5166:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerated_typeAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:5175:1: rule__Enumerated_type__Group__1 : rule__Enumerated_type__Group__1__Impl rule__Enumerated_type__Group__2 ;
    public final void rule__Enumerated_type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5179:1: ( rule__Enumerated_type__Group__1__Impl rule__Enumerated_type__Group__2 )
            // InternalPascal.g:5180:2: rule__Enumerated_type__Group__1__Impl rule__Enumerated_type__Group__2
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
    // InternalPascal.g:5187:1: rule__Enumerated_type__Group__1__Impl : ( ( rule__Enumerated_type__IdentifiersAssignment_1 ) ) ;
    public final void rule__Enumerated_type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5191:1: ( ( ( rule__Enumerated_type__IdentifiersAssignment_1 ) ) )
            // InternalPascal.g:5192:1: ( ( rule__Enumerated_type__IdentifiersAssignment_1 ) )
            {
            // InternalPascal.g:5192:1: ( ( rule__Enumerated_type__IdentifiersAssignment_1 ) )
            // InternalPascal.g:5193:2: ( rule__Enumerated_type__IdentifiersAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerated_typeAccess().getIdentifiersAssignment_1()); 
            }
            // InternalPascal.g:5194:2: ( rule__Enumerated_type__IdentifiersAssignment_1 )
            // InternalPascal.g:5194:3: rule__Enumerated_type__IdentifiersAssignment_1
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
    // InternalPascal.g:5202:1: rule__Enumerated_type__Group__2 : rule__Enumerated_type__Group__2__Impl ;
    public final void rule__Enumerated_type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5206:1: ( rule__Enumerated_type__Group__2__Impl )
            // InternalPascal.g:5207:2: rule__Enumerated_type__Group__2__Impl
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
    // InternalPascal.g:5213:1: rule__Enumerated_type__Group__2__Impl : ( ')' ) ;
    public final void rule__Enumerated_type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5217:1: ( ( ')' ) )
            // InternalPascal.g:5218:1: ( ')' )
            {
            // InternalPascal.g:5218:1: ( ')' )
            // InternalPascal.g:5219:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerated_typeAccess().getRightParenthesisKeyword_2()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:5229:1: rule__Structured_type__Group__0 : rule__Structured_type__Group__0__Impl rule__Structured_type__Group__1 ;
    public final void rule__Structured_type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5233:1: ( rule__Structured_type__Group__0__Impl rule__Structured_type__Group__1 )
            // InternalPascal.g:5234:2: rule__Structured_type__Group__0__Impl rule__Structured_type__Group__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalPascal.g:5241:1: rule__Structured_type__Group__0__Impl : ( ( rule__Structured_type__PackedAssignment_0 )? ) ;
    public final void rule__Structured_type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5245:1: ( ( ( rule__Structured_type__PackedAssignment_0 )? ) )
            // InternalPascal.g:5246:1: ( ( rule__Structured_type__PackedAssignment_0 )? )
            {
            // InternalPascal.g:5246:1: ( ( rule__Structured_type__PackedAssignment_0 )? )
            // InternalPascal.g:5247:2: ( rule__Structured_type__PackedAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStructured_typeAccess().getPackedAssignment_0()); 
            }
            // InternalPascal.g:5248:2: ( rule__Structured_type__PackedAssignment_0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==53) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalPascal.g:5248:3: rule__Structured_type__PackedAssignment_0
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
    // InternalPascal.g:5256:1: rule__Structured_type__Group__1 : rule__Structured_type__Group__1__Impl ;
    public final void rule__Structured_type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5260:1: ( rule__Structured_type__Group__1__Impl )
            // InternalPascal.g:5261:2: rule__Structured_type__Group__1__Impl
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
    // InternalPascal.g:5267:1: rule__Structured_type__Group__1__Impl : ( ( rule__Structured_type__TypeAssignment_1 ) ) ;
    public final void rule__Structured_type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5271:1: ( ( ( rule__Structured_type__TypeAssignment_1 ) ) )
            // InternalPascal.g:5272:1: ( ( rule__Structured_type__TypeAssignment_1 ) )
            {
            // InternalPascal.g:5272:1: ( ( rule__Structured_type__TypeAssignment_1 ) )
            // InternalPascal.g:5273:2: ( rule__Structured_type__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStructured_typeAccess().getTypeAssignment_1()); 
            }
            // InternalPascal.g:5274:2: ( rule__Structured_type__TypeAssignment_1 )
            // InternalPascal.g:5274:3: rule__Structured_type__TypeAssignment_1
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
    // InternalPascal.g:5283:1: rule__Record_type__Group__0 : rule__Record_type__Group__0__Impl rule__Record_type__Group__1 ;
    public final void rule__Record_type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5287:1: ( rule__Record_type__Group__0__Impl rule__Record_type__Group__1 )
            // InternalPascal.g:5288:2: rule__Record_type__Group__0__Impl rule__Record_type__Group__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalPascal.g:5295:1: rule__Record_type__Group__0__Impl : ( ( rule__Record_type__RecordKeywordAssignment_0 ) ) ;
    public final void rule__Record_type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5299:1: ( ( ( rule__Record_type__RecordKeywordAssignment_0 ) ) )
            // InternalPascal.g:5300:1: ( ( rule__Record_type__RecordKeywordAssignment_0 ) )
            {
            // InternalPascal.g:5300:1: ( ( rule__Record_type__RecordKeywordAssignment_0 ) )
            // InternalPascal.g:5301:2: ( rule__Record_type__RecordKeywordAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecord_typeAccess().getRecordKeywordAssignment_0()); 
            }
            // InternalPascal.g:5302:2: ( rule__Record_type__RecordKeywordAssignment_0 )
            // InternalPascal.g:5302:3: rule__Record_type__RecordKeywordAssignment_0
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
    // InternalPascal.g:5310:1: rule__Record_type__Group__1 : rule__Record_type__Group__1__Impl rule__Record_type__Group__2 ;
    public final void rule__Record_type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5314:1: ( rule__Record_type__Group__1__Impl rule__Record_type__Group__2 )
            // InternalPascal.g:5315:2: rule__Record_type__Group__1__Impl rule__Record_type__Group__2
            {
            pushFollow(FOLLOW_38);
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
    // InternalPascal.g:5322:1: rule__Record_type__Group__1__Impl : ( ( rule__Record_type__FieldsAssignment_1 )? ) ;
    public final void rule__Record_type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5326:1: ( ( ( rule__Record_type__FieldsAssignment_1 )? ) )
            // InternalPascal.g:5327:1: ( ( rule__Record_type__FieldsAssignment_1 )? )
            {
            // InternalPascal.g:5327:1: ( ( rule__Record_type__FieldsAssignment_1 )? )
            // InternalPascal.g:5328:2: ( rule__Record_type__FieldsAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecord_typeAccess().getFieldsAssignment_1()); 
            }
            // InternalPascal.g:5329:2: ( rule__Record_type__FieldsAssignment_1 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID||LA44_0==43) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalPascal.g:5329:3: rule__Record_type__FieldsAssignment_1
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
    // InternalPascal.g:5337:1: rule__Record_type__Group__2 : rule__Record_type__Group__2__Impl ;
    public final void rule__Record_type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5341:1: ( rule__Record_type__Group__2__Impl )
            // InternalPascal.g:5342:2: rule__Record_type__Group__2__Impl
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
    // InternalPascal.g:5348:1: rule__Record_type__Group__2__Impl : ( ( rule__Record_type__EndKeywordAssignment_2 ) ) ;
    public final void rule__Record_type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5352:1: ( ( ( rule__Record_type__EndKeywordAssignment_2 ) ) )
            // InternalPascal.g:5353:1: ( ( rule__Record_type__EndKeywordAssignment_2 ) )
            {
            // InternalPascal.g:5353:1: ( ( rule__Record_type__EndKeywordAssignment_2 ) )
            // InternalPascal.g:5354:2: ( rule__Record_type__EndKeywordAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecord_typeAccess().getEndKeywordAssignment_2()); 
            }
            // InternalPascal.g:5355:2: ( rule__Record_type__EndKeywordAssignment_2 )
            // InternalPascal.g:5355:3: rule__Record_type__EndKeywordAssignment_2
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
    // InternalPascal.g:5364:1: rule__Field_list__Group__0 : rule__Field_list__Group__0__Impl rule__Field_list__Group__1 ;
    public final void rule__Field_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5368:1: ( rule__Field_list__Group__0__Impl rule__Field_list__Group__1 )
            // InternalPascal.g:5369:2: rule__Field_list__Group__0__Impl rule__Field_list__Group__1
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
    // InternalPascal.g:5376:1: rule__Field_list__Group__0__Impl : ( ( rule__Field_list__Alternatives_0 ) ) ;
    public final void rule__Field_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5380:1: ( ( ( rule__Field_list__Alternatives_0 ) ) )
            // InternalPascal.g:5381:1: ( ( rule__Field_list__Alternatives_0 ) )
            {
            // InternalPascal.g:5381:1: ( ( rule__Field_list__Alternatives_0 ) )
            // InternalPascal.g:5382:2: ( rule__Field_list__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_listAccess().getAlternatives_0()); 
            }
            // InternalPascal.g:5383:2: ( rule__Field_list__Alternatives_0 )
            // InternalPascal.g:5383:3: rule__Field_list__Alternatives_0
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
    // InternalPascal.g:5391:1: rule__Field_list__Group__1 : rule__Field_list__Group__1__Impl ;
    public final void rule__Field_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5395:1: ( rule__Field_list__Group__1__Impl )
            // InternalPascal.g:5396:2: rule__Field_list__Group__1__Impl
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
    // InternalPascal.g:5402:1: rule__Field_list__Group__1__Impl : ( ( ';' )? ) ;
    public final void rule__Field_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5406:1: ( ( ( ';' )? ) )
            // InternalPascal.g:5407:1: ( ( ';' )? )
            {
            // InternalPascal.g:5407:1: ( ( ';' )? )
            // InternalPascal.g:5408:2: ( ';' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_listAccess().getSemicolonKeyword_1()); 
            }
            // InternalPascal.g:5409:2: ( ';' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==24) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalPascal.g:5409:3: ';'
                    {
                    match(input,24,FOLLOW_2); if (state.failed) return ;

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
    // InternalPascal.g:5418:1: rule__Field_list__Group_0_0__0 : rule__Field_list__Group_0_0__0__Impl rule__Field_list__Group_0_0__1 ;
    public final void rule__Field_list__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5422:1: ( rule__Field_list__Group_0_0__0__Impl rule__Field_list__Group_0_0__1 )
            // InternalPascal.g:5423:2: rule__Field_list__Group_0_0__0__Impl rule__Field_list__Group_0_0__1
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
    // InternalPascal.g:5430:1: rule__Field_list__Group_0_0__0__Impl : ( ( rule__Field_list__FixedAssignment_0_0_0 ) ) ;
    public final void rule__Field_list__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5434:1: ( ( ( rule__Field_list__FixedAssignment_0_0_0 ) ) )
            // InternalPascal.g:5435:1: ( ( rule__Field_list__FixedAssignment_0_0_0 ) )
            {
            // InternalPascal.g:5435:1: ( ( rule__Field_list__FixedAssignment_0_0_0 ) )
            // InternalPascal.g:5436:2: ( rule__Field_list__FixedAssignment_0_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_listAccess().getFixedAssignment_0_0_0()); 
            }
            // InternalPascal.g:5437:2: ( rule__Field_list__FixedAssignment_0_0_0 )
            // InternalPascal.g:5437:3: rule__Field_list__FixedAssignment_0_0_0
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
    // InternalPascal.g:5445:1: rule__Field_list__Group_0_0__1 : rule__Field_list__Group_0_0__1__Impl ;
    public final void rule__Field_list__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5449:1: ( rule__Field_list__Group_0_0__1__Impl )
            // InternalPascal.g:5450:2: rule__Field_list__Group_0_0__1__Impl
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
    // InternalPascal.g:5456:1: rule__Field_list__Group_0_0__1__Impl : ( ( rule__Field_list__Group_0_0_1__0 )? ) ;
    public final void rule__Field_list__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5460:1: ( ( ( rule__Field_list__Group_0_0_1__0 )? ) )
            // InternalPascal.g:5461:1: ( ( rule__Field_list__Group_0_0_1__0 )? )
            {
            // InternalPascal.g:5461:1: ( ( rule__Field_list__Group_0_0_1__0 )? )
            // InternalPascal.g:5462:2: ( rule__Field_list__Group_0_0_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_listAccess().getGroup_0_0_1()); 
            }
            // InternalPascal.g:5463:2: ( rule__Field_list__Group_0_0_1__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==24) ) {
                int LA46_1 = input.LA(2);

                if ( (LA46_1==43) ) {
                    alt46=1;
                }
            }
            switch (alt46) {
                case 1 :
                    // InternalPascal.g:5463:3: rule__Field_list__Group_0_0_1__0
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
    // InternalPascal.g:5472:1: rule__Field_list__Group_0_0_1__0 : rule__Field_list__Group_0_0_1__0__Impl rule__Field_list__Group_0_0_1__1 ;
    public final void rule__Field_list__Group_0_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5476:1: ( rule__Field_list__Group_0_0_1__0__Impl rule__Field_list__Group_0_0_1__1 )
            // InternalPascal.g:5477:2: rule__Field_list__Group_0_0_1__0__Impl rule__Field_list__Group_0_0_1__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalPascal.g:5484:1: rule__Field_list__Group_0_0_1__0__Impl : ( ';' ) ;
    public final void rule__Field_list__Group_0_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5488:1: ( ( ';' ) )
            // InternalPascal.g:5489:1: ( ';' )
            {
            // InternalPascal.g:5489:1: ( ';' )
            // InternalPascal.g:5490:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_listAccess().getSemicolonKeyword_0_0_1_0()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:5499:1: rule__Field_list__Group_0_0_1__1 : rule__Field_list__Group_0_0_1__1__Impl ;
    public final void rule__Field_list__Group_0_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5503:1: ( rule__Field_list__Group_0_0_1__1__Impl )
            // InternalPascal.g:5504:2: rule__Field_list__Group_0_0_1__1__Impl
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
    // InternalPascal.g:5510:1: rule__Field_list__Group_0_0_1__1__Impl : ( ( rule__Field_list__VariantsAssignment_0_0_1_1 ) ) ;
    public final void rule__Field_list__Group_0_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5514:1: ( ( ( rule__Field_list__VariantsAssignment_0_0_1_1 ) ) )
            // InternalPascal.g:5515:1: ( ( rule__Field_list__VariantsAssignment_0_0_1_1 ) )
            {
            // InternalPascal.g:5515:1: ( ( rule__Field_list__VariantsAssignment_0_0_1_1 ) )
            // InternalPascal.g:5516:2: ( rule__Field_list__VariantsAssignment_0_0_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_listAccess().getVariantsAssignment_0_0_1_1()); 
            }
            // InternalPascal.g:5517:2: ( rule__Field_list__VariantsAssignment_0_0_1_1 )
            // InternalPascal.g:5517:3: rule__Field_list__VariantsAssignment_0_0_1_1
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
    // InternalPascal.g:5526:1: rule__Fixed_part__Group__0 : rule__Fixed_part__Group__0__Impl rule__Fixed_part__Group__1 ;
    public final void rule__Fixed_part__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5530:1: ( rule__Fixed_part__Group__0__Impl rule__Fixed_part__Group__1 )
            // InternalPascal.g:5531:2: rule__Fixed_part__Group__0__Impl rule__Fixed_part__Group__1
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
    // InternalPascal.g:5538:1: rule__Fixed_part__Group__0__Impl : ( ( rule__Fixed_part__SectionsAssignment_0 ) ) ;
    public final void rule__Fixed_part__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5542:1: ( ( ( rule__Fixed_part__SectionsAssignment_0 ) ) )
            // InternalPascal.g:5543:1: ( ( rule__Fixed_part__SectionsAssignment_0 ) )
            {
            // InternalPascal.g:5543:1: ( ( rule__Fixed_part__SectionsAssignment_0 ) )
            // InternalPascal.g:5544:2: ( rule__Fixed_part__SectionsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFixed_partAccess().getSectionsAssignment_0()); 
            }
            // InternalPascal.g:5545:2: ( rule__Fixed_part__SectionsAssignment_0 )
            // InternalPascal.g:5545:3: rule__Fixed_part__SectionsAssignment_0
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
    // InternalPascal.g:5553:1: rule__Fixed_part__Group__1 : rule__Fixed_part__Group__1__Impl ;
    public final void rule__Fixed_part__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5557:1: ( rule__Fixed_part__Group__1__Impl )
            // InternalPascal.g:5558:2: rule__Fixed_part__Group__1__Impl
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
    // InternalPascal.g:5564:1: rule__Fixed_part__Group__1__Impl : ( ( rule__Fixed_part__Group_1__0 )* ) ;
    public final void rule__Fixed_part__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5568:1: ( ( ( rule__Fixed_part__Group_1__0 )* ) )
            // InternalPascal.g:5569:1: ( ( rule__Fixed_part__Group_1__0 )* )
            {
            // InternalPascal.g:5569:1: ( ( rule__Fixed_part__Group_1__0 )* )
            // InternalPascal.g:5570:2: ( rule__Fixed_part__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFixed_partAccess().getGroup_1()); 
            }
            // InternalPascal.g:5571:2: ( rule__Fixed_part__Group_1__0 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==24) ) {
                    int LA47_2 = input.LA(2);

                    if ( (LA47_2==RULE_ID) ) {
                        alt47=1;
                    }


                }


                switch (alt47) {
            	case 1 :
            	    // InternalPascal.g:5571:3: rule__Fixed_part__Group_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Fixed_part__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop47;
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
    // InternalPascal.g:5580:1: rule__Fixed_part__Group_1__0 : rule__Fixed_part__Group_1__0__Impl rule__Fixed_part__Group_1__1 ;
    public final void rule__Fixed_part__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5584:1: ( rule__Fixed_part__Group_1__0__Impl rule__Fixed_part__Group_1__1 )
            // InternalPascal.g:5585:2: rule__Fixed_part__Group_1__0__Impl rule__Fixed_part__Group_1__1
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
    // InternalPascal.g:5592:1: rule__Fixed_part__Group_1__0__Impl : ( ';' ) ;
    public final void rule__Fixed_part__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5596:1: ( ( ';' ) )
            // InternalPascal.g:5597:1: ( ';' )
            {
            // InternalPascal.g:5597:1: ( ';' )
            // InternalPascal.g:5598:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFixed_partAccess().getSemicolonKeyword_1_0()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:5607:1: rule__Fixed_part__Group_1__1 : rule__Fixed_part__Group_1__1__Impl ;
    public final void rule__Fixed_part__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5611:1: ( rule__Fixed_part__Group_1__1__Impl )
            // InternalPascal.g:5612:2: rule__Fixed_part__Group_1__1__Impl
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
    // InternalPascal.g:5618:1: rule__Fixed_part__Group_1__1__Impl : ( ( rule__Fixed_part__SectionsAssignment_1_1 ) ) ;
    public final void rule__Fixed_part__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5622:1: ( ( ( rule__Fixed_part__SectionsAssignment_1_1 ) ) )
            // InternalPascal.g:5623:1: ( ( rule__Fixed_part__SectionsAssignment_1_1 ) )
            {
            // InternalPascal.g:5623:1: ( ( rule__Fixed_part__SectionsAssignment_1_1 ) )
            // InternalPascal.g:5624:2: ( rule__Fixed_part__SectionsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFixed_partAccess().getSectionsAssignment_1_1()); 
            }
            // InternalPascal.g:5625:2: ( rule__Fixed_part__SectionsAssignment_1_1 )
            // InternalPascal.g:5625:3: rule__Fixed_part__SectionsAssignment_1_1
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
    // InternalPascal.g:5634:1: rule__Record_section__Group__0 : rule__Record_section__Group__0__Impl rule__Record_section__Group__1 ;
    public final void rule__Record_section__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5638:1: ( rule__Record_section__Group__0__Impl rule__Record_section__Group__1 )
            // InternalPascal.g:5639:2: rule__Record_section__Group__0__Impl rule__Record_section__Group__1
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
    // InternalPascal.g:5646:1: rule__Record_section__Group__0__Impl : ( ( rule__Record_section__IdentifiersAssignment_0 ) ) ;
    public final void rule__Record_section__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5650:1: ( ( ( rule__Record_section__IdentifiersAssignment_0 ) ) )
            // InternalPascal.g:5651:1: ( ( rule__Record_section__IdentifiersAssignment_0 ) )
            {
            // InternalPascal.g:5651:1: ( ( rule__Record_section__IdentifiersAssignment_0 ) )
            // InternalPascal.g:5652:2: ( rule__Record_section__IdentifiersAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecord_sectionAccess().getIdentifiersAssignment_0()); 
            }
            // InternalPascal.g:5653:2: ( rule__Record_section__IdentifiersAssignment_0 )
            // InternalPascal.g:5653:3: rule__Record_section__IdentifiersAssignment_0
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
    // InternalPascal.g:5661:1: rule__Record_section__Group__1 : rule__Record_section__Group__1__Impl rule__Record_section__Group__2 ;
    public final void rule__Record_section__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5665:1: ( rule__Record_section__Group__1__Impl rule__Record_section__Group__2 )
            // InternalPascal.g:5666:2: rule__Record_section__Group__1__Impl rule__Record_section__Group__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalPascal.g:5673:1: rule__Record_section__Group__1__Impl : ( ':' ) ;
    public final void rule__Record_section__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5677:1: ( ( ':' ) )
            // InternalPascal.g:5678:1: ( ':' )
            {
            // InternalPascal.g:5678:1: ( ':' )
            // InternalPascal.g:5679:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecord_sectionAccess().getColonKeyword_1()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:5688:1: rule__Record_section__Group__2 : rule__Record_section__Group__2__Impl ;
    public final void rule__Record_section__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5692:1: ( rule__Record_section__Group__2__Impl )
            // InternalPascal.g:5693:2: rule__Record_section__Group__2__Impl
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
    // InternalPascal.g:5699:1: rule__Record_section__Group__2__Impl : ( ( rule__Record_section__TypeAssignment_2 ) ) ;
    public final void rule__Record_section__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5703:1: ( ( ( rule__Record_section__TypeAssignment_2 ) ) )
            // InternalPascal.g:5704:1: ( ( rule__Record_section__TypeAssignment_2 ) )
            {
            // InternalPascal.g:5704:1: ( ( rule__Record_section__TypeAssignment_2 ) )
            // InternalPascal.g:5705:2: ( rule__Record_section__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecord_sectionAccess().getTypeAssignment_2()); 
            }
            // InternalPascal.g:5706:2: ( rule__Record_section__TypeAssignment_2 )
            // InternalPascal.g:5706:3: rule__Record_section__TypeAssignment_2
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
    // InternalPascal.g:5715:1: rule__Variant_part__Group__0 : rule__Variant_part__Group__0__Impl rule__Variant_part__Group__1 ;
    public final void rule__Variant_part__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5719:1: ( rule__Variant_part__Group__0__Impl rule__Variant_part__Group__1 )
            // InternalPascal.g:5720:2: rule__Variant_part__Group__0__Impl rule__Variant_part__Group__1
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
    // InternalPascal.g:5727:1: rule__Variant_part__Group__0__Impl : ( 'case' ) ;
    public final void rule__Variant_part__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5731:1: ( ( 'case' ) )
            // InternalPascal.g:5732:1: ( 'case' )
            {
            // InternalPascal.g:5732:1: ( 'case' )
            // InternalPascal.g:5733:2: 'case'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariant_partAccess().getCaseKeyword_0()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:5742:1: rule__Variant_part__Group__1 : rule__Variant_part__Group__1__Impl rule__Variant_part__Group__2 ;
    public final void rule__Variant_part__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5746:1: ( rule__Variant_part__Group__1__Impl rule__Variant_part__Group__2 )
            // InternalPascal.g:5747:2: rule__Variant_part__Group__1__Impl rule__Variant_part__Group__2
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
    // InternalPascal.g:5754:1: rule__Variant_part__Group__1__Impl : ( ( rule__Variant_part__TagAssignment_1 )? ) ;
    public final void rule__Variant_part__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5758:1: ( ( ( rule__Variant_part__TagAssignment_1 )? ) )
            // InternalPascal.g:5759:1: ( ( rule__Variant_part__TagAssignment_1 )? )
            {
            // InternalPascal.g:5759:1: ( ( rule__Variant_part__TagAssignment_1 )? )
            // InternalPascal.g:5760:2: ( rule__Variant_part__TagAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariant_partAccess().getTagAssignment_1()); 
            }
            // InternalPascal.g:5761:2: ( rule__Variant_part__TagAssignment_1 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_ID) ) {
                int LA48_1 = input.LA(2);

                if ( (LA48_1==27) ) {
                    alt48=1;
                }
            }
            switch (alt48) {
                case 1 :
                    // InternalPascal.g:5761:3: rule__Variant_part__TagAssignment_1
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
    // InternalPascal.g:5769:1: rule__Variant_part__Group__2 : rule__Variant_part__Group__2__Impl rule__Variant_part__Group__3 ;
    public final void rule__Variant_part__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5773:1: ( rule__Variant_part__Group__2__Impl rule__Variant_part__Group__3 )
            // InternalPascal.g:5774:2: rule__Variant_part__Group__2__Impl rule__Variant_part__Group__3
            {
            pushFollow(FOLLOW_40);
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
    // InternalPascal.g:5781:1: rule__Variant_part__Group__2__Impl : ( ( rule__Variant_part__NameAssignment_2 ) ) ;
    public final void rule__Variant_part__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5785:1: ( ( ( rule__Variant_part__NameAssignment_2 ) ) )
            // InternalPascal.g:5786:1: ( ( rule__Variant_part__NameAssignment_2 ) )
            {
            // InternalPascal.g:5786:1: ( ( rule__Variant_part__NameAssignment_2 ) )
            // InternalPascal.g:5787:2: ( rule__Variant_part__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariant_partAccess().getNameAssignment_2()); 
            }
            // InternalPascal.g:5788:2: ( rule__Variant_part__NameAssignment_2 )
            // InternalPascal.g:5788:3: rule__Variant_part__NameAssignment_2
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
    // InternalPascal.g:5796:1: rule__Variant_part__Group__3 : rule__Variant_part__Group__3__Impl rule__Variant_part__Group__4 ;
    public final void rule__Variant_part__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5800:1: ( rule__Variant_part__Group__3__Impl rule__Variant_part__Group__4 )
            // InternalPascal.g:5801:2: rule__Variant_part__Group__3__Impl rule__Variant_part__Group__4
            {
            pushFollow(FOLLOW_34);
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
    // InternalPascal.g:5808:1: rule__Variant_part__Group__3__Impl : ( 'of' ) ;
    public final void rule__Variant_part__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5812:1: ( ( 'of' ) )
            // InternalPascal.g:5813:1: ( 'of' )
            {
            // InternalPascal.g:5813:1: ( 'of' )
            // InternalPascal.g:5814:2: 'of'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariant_partAccess().getOfKeyword_3()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:5823:1: rule__Variant_part__Group__4 : rule__Variant_part__Group__4__Impl rule__Variant_part__Group__5 ;
    public final void rule__Variant_part__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5827:1: ( rule__Variant_part__Group__4__Impl rule__Variant_part__Group__5 )
            // InternalPascal.g:5828:2: rule__Variant_part__Group__4__Impl rule__Variant_part__Group__5
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
    // InternalPascal.g:5835:1: rule__Variant_part__Group__4__Impl : ( ( rule__Variant_part__VariantsAssignment_4 ) ) ;
    public final void rule__Variant_part__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5839:1: ( ( ( rule__Variant_part__VariantsAssignment_4 ) ) )
            // InternalPascal.g:5840:1: ( ( rule__Variant_part__VariantsAssignment_4 ) )
            {
            // InternalPascal.g:5840:1: ( ( rule__Variant_part__VariantsAssignment_4 ) )
            // InternalPascal.g:5841:2: ( rule__Variant_part__VariantsAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariant_partAccess().getVariantsAssignment_4()); 
            }
            // InternalPascal.g:5842:2: ( rule__Variant_part__VariantsAssignment_4 )
            // InternalPascal.g:5842:3: rule__Variant_part__VariantsAssignment_4
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
    // InternalPascal.g:5850:1: rule__Variant_part__Group__5 : rule__Variant_part__Group__5__Impl ;
    public final void rule__Variant_part__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5854:1: ( rule__Variant_part__Group__5__Impl )
            // InternalPascal.g:5855:2: rule__Variant_part__Group__5__Impl
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
    // InternalPascal.g:5861:1: rule__Variant_part__Group__5__Impl : ( ( rule__Variant_part__Group_5__0 )* ) ;
    public final void rule__Variant_part__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5865:1: ( ( ( rule__Variant_part__Group_5__0 )* ) )
            // InternalPascal.g:5866:1: ( ( rule__Variant_part__Group_5__0 )* )
            {
            // InternalPascal.g:5866:1: ( ( rule__Variant_part__Group_5__0 )* )
            // InternalPascal.g:5867:2: ( rule__Variant_part__Group_5__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariant_partAccess().getGroup_5()); 
            }
            // InternalPascal.g:5868:2: ( rule__Variant_part__Group_5__0 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==24) ) {
                    int LA49_2 = input.LA(2);

                    if ( ((LA49_2>=RULE_ID && LA49_2<=RULE_INTEGER_NUMBER)||LA49_2==RULE_ADDITION_OP||LA49_2==RULE_STRING||(LA49_2>=RULE_SIGNED_REAL_NUMBER && LA49_2<=RULE_REAL_NUMBER)||(LA49_2>=51 && LA49_2<=52)) ) {
                        alt49=1;
                    }


                }


                switch (alt49) {
            	case 1 :
            	    // InternalPascal.g:5868:3: rule__Variant_part__Group_5__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Variant_part__Group_5__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop49;
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
    // InternalPascal.g:5877:1: rule__Variant_part__Group_5__0 : rule__Variant_part__Group_5__0__Impl rule__Variant_part__Group_5__1 ;
    public final void rule__Variant_part__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5881:1: ( rule__Variant_part__Group_5__0__Impl rule__Variant_part__Group_5__1 )
            // InternalPascal.g:5882:2: rule__Variant_part__Group_5__0__Impl rule__Variant_part__Group_5__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalPascal.g:5889:1: rule__Variant_part__Group_5__0__Impl : ( ';' ) ;
    public final void rule__Variant_part__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5893:1: ( ( ';' ) )
            // InternalPascal.g:5894:1: ( ';' )
            {
            // InternalPascal.g:5894:1: ( ';' )
            // InternalPascal.g:5895:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariant_partAccess().getSemicolonKeyword_5_0()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:5904:1: rule__Variant_part__Group_5__1 : rule__Variant_part__Group_5__1__Impl ;
    public final void rule__Variant_part__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5908:1: ( rule__Variant_part__Group_5__1__Impl )
            // InternalPascal.g:5909:2: rule__Variant_part__Group_5__1__Impl
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
    // InternalPascal.g:5915:1: rule__Variant_part__Group_5__1__Impl : ( ( rule__Variant_part__VariantsAssignment_5_1 ) ) ;
    public final void rule__Variant_part__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5919:1: ( ( ( rule__Variant_part__VariantsAssignment_5_1 ) ) )
            // InternalPascal.g:5920:1: ( ( rule__Variant_part__VariantsAssignment_5_1 ) )
            {
            // InternalPascal.g:5920:1: ( ( rule__Variant_part__VariantsAssignment_5_1 ) )
            // InternalPascal.g:5921:2: ( rule__Variant_part__VariantsAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariant_partAccess().getVariantsAssignment_5_1()); 
            }
            // InternalPascal.g:5922:2: ( rule__Variant_part__VariantsAssignment_5_1 )
            // InternalPascal.g:5922:3: rule__Variant_part__VariantsAssignment_5_1
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
    // InternalPascal.g:5931:1: rule__Tag_field__Group__0 : rule__Tag_field__Group__0__Impl rule__Tag_field__Group__1 ;
    public final void rule__Tag_field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5935:1: ( rule__Tag_field__Group__0__Impl rule__Tag_field__Group__1 )
            // InternalPascal.g:5936:2: rule__Tag_field__Group__0__Impl rule__Tag_field__Group__1
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
    // InternalPascal.g:5943:1: rule__Tag_field__Group__0__Impl : ( ( rule__Tag_field__NameAssignment_0 ) ) ;
    public final void rule__Tag_field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5947:1: ( ( ( rule__Tag_field__NameAssignment_0 ) ) )
            // InternalPascal.g:5948:1: ( ( rule__Tag_field__NameAssignment_0 ) )
            {
            // InternalPascal.g:5948:1: ( ( rule__Tag_field__NameAssignment_0 ) )
            // InternalPascal.g:5949:2: ( rule__Tag_field__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTag_fieldAccess().getNameAssignment_0()); 
            }
            // InternalPascal.g:5950:2: ( rule__Tag_field__NameAssignment_0 )
            // InternalPascal.g:5950:3: rule__Tag_field__NameAssignment_0
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
    // InternalPascal.g:5958:1: rule__Tag_field__Group__1 : rule__Tag_field__Group__1__Impl ;
    public final void rule__Tag_field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5962:1: ( rule__Tag_field__Group__1__Impl )
            // InternalPascal.g:5963:2: rule__Tag_field__Group__1__Impl
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
    // InternalPascal.g:5969:1: rule__Tag_field__Group__1__Impl : ( ':' ) ;
    public final void rule__Tag_field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5973:1: ( ( ':' ) )
            // InternalPascal.g:5974:1: ( ':' )
            {
            // InternalPascal.g:5974:1: ( ':' )
            // InternalPascal.g:5975:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTag_fieldAccess().getColonKeyword_1()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:5985:1: rule__Variant__Group__0 : rule__Variant__Group__0__Impl rule__Variant__Group__1 ;
    public final void rule__Variant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5989:1: ( rule__Variant__Group__0__Impl rule__Variant__Group__1 )
            // InternalPascal.g:5990:2: rule__Variant__Group__0__Impl rule__Variant__Group__1
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
    // InternalPascal.g:5997:1: rule__Variant__Group__0__Impl : ( ( rule__Variant__LabelsAssignment_0 ) ) ;
    public final void rule__Variant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6001:1: ( ( ( rule__Variant__LabelsAssignment_0 ) ) )
            // InternalPascal.g:6002:1: ( ( rule__Variant__LabelsAssignment_0 ) )
            {
            // InternalPascal.g:6002:1: ( ( rule__Variant__LabelsAssignment_0 ) )
            // InternalPascal.g:6003:2: ( rule__Variant__LabelsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariantAccess().getLabelsAssignment_0()); 
            }
            // InternalPascal.g:6004:2: ( rule__Variant__LabelsAssignment_0 )
            // InternalPascal.g:6004:3: rule__Variant__LabelsAssignment_0
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
    // InternalPascal.g:6012:1: rule__Variant__Group__1 : rule__Variant__Group__1__Impl rule__Variant__Group__2 ;
    public final void rule__Variant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6016:1: ( rule__Variant__Group__1__Impl rule__Variant__Group__2 )
            // InternalPascal.g:6017:2: rule__Variant__Group__1__Impl rule__Variant__Group__2
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
    // InternalPascal.g:6024:1: rule__Variant__Group__1__Impl : ( ':' ) ;
    public final void rule__Variant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6028:1: ( ( ':' ) )
            // InternalPascal.g:6029:1: ( ':' )
            {
            // InternalPascal.g:6029:1: ( ':' )
            // InternalPascal.g:6030:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariantAccess().getColonKeyword_1()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:6039:1: rule__Variant__Group__2 : rule__Variant__Group__2__Impl rule__Variant__Group__3 ;
    public final void rule__Variant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6043:1: ( rule__Variant__Group__2__Impl rule__Variant__Group__3 )
            // InternalPascal.g:6044:2: rule__Variant__Group__2__Impl rule__Variant__Group__3
            {
            pushFollow(FOLLOW_41);
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
    // InternalPascal.g:6051:1: rule__Variant__Group__2__Impl : ( '(' ) ;
    public final void rule__Variant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6055:1: ( ( '(' ) )
            // InternalPascal.g:6056:1: ( '(' )
            {
            // InternalPascal.g:6056:1: ( '(' )
            // InternalPascal.g:6057:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariantAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:6066:1: rule__Variant__Group__3 : rule__Variant__Group__3__Impl rule__Variant__Group__4 ;
    public final void rule__Variant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6070:1: ( rule__Variant__Group__3__Impl rule__Variant__Group__4 )
            // InternalPascal.g:6071:2: rule__Variant__Group__3__Impl rule__Variant__Group__4
            {
            pushFollow(FOLLOW_41);
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
    // InternalPascal.g:6078:1: rule__Variant__Group__3__Impl : ( ( rule__Variant__FieldsAssignment_3 )? ) ;
    public final void rule__Variant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6082:1: ( ( ( rule__Variant__FieldsAssignment_3 )? ) )
            // InternalPascal.g:6083:1: ( ( rule__Variant__FieldsAssignment_3 )? )
            {
            // InternalPascal.g:6083:1: ( ( rule__Variant__FieldsAssignment_3 )? )
            // InternalPascal.g:6084:2: ( rule__Variant__FieldsAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariantAccess().getFieldsAssignment_3()); 
            }
            // InternalPascal.g:6085:2: ( rule__Variant__FieldsAssignment_3 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_ID||LA50_0==43) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalPascal.g:6085:3: rule__Variant__FieldsAssignment_3
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
    // InternalPascal.g:6093:1: rule__Variant__Group__4 : rule__Variant__Group__4__Impl ;
    public final void rule__Variant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6097:1: ( rule__Variant__Group__4__Impl )
            // InternalPascal.g:6098:2: rule__Variant__Group__4__Impl
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
    // InternalPascal.g:6104:1: rule__Variant__Group__4__Impl : ( ')' ) ;
    public final void rule__Variant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6108:1: ( ( ')' ) )
            // InternalPascal.g:6109:1: ( ')' )
            {
            // InternalPascal.g:6109:1: ( ')' )
            // InternalPascal.g:6110:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariantAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:6120:1: rule__Case_label_list__Group__0 : rule__Case_label_list__Group__0__Impl rule__Case_label_list__Group__1 ;
    public final void rule__Case_label_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6124:1: ( rule__Case_label_list__Group__0__Impl rule__Case_label_list__Group__1 )
            // InternalPascal.g:6125:2: rule__Case_label_list__Group__0__Impl rule__Case_label_list__Group__1
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
    // InternalPascal.g:6132:1: rule__Case_label_list__Group__0__Impl : ( ( rule__Case_label_list__ConstantsAssignment_0 ) ) ;
    public final void rule__Case_label_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6136:1: ( ( ( rule__Case_label_list__ConstantsAssignment_0 ) ) )
            // InternalPascal.g:6137:1: ( ( rule__Case_label_list__ConstantsAssignment_0 ) )
            {
            // InternalPascal.g:6137:1: ( ( rule__Case_label_list__ConstantsAssignment_0 ) )
            // InternalPascal.g:6138:2: ( rule__Case_label_list__ConstantsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCase_label_listAccess().getConstantsAssignment_0()); 
            }
            // InternalPascal.g:6139:2: ( rule__Case_label_list__ConstantsAssignment_0 )
            // InternalPascal.g:6139:3: rule__Case_label_list__ConstantsAssignment_0
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
    // InternalPascal.g:6147:1: rule__Case_label_list__Group__1 : rule__Case_label_list__Group__1__Impl ;
    public final void rule__Case_label_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6151:1: ( rule__Case_label_list__Group__1__Impl )
            // InternalPascal.g:6152:2: rule__Case_label_list__Group__1__Impl
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
    // InternalPascal.g:6158:1: rule__Case_label_list__Group__1__Impl : ( ( rule__Case_label_list__Group_1__0 )* ) ;
    public final void rule__Case_label_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6162:1: ( ( ( rule__Case_label_list__Group_1__0 )* ) )
            // InternalPascal.g:6163:1: ( ( rule__Case_label_list__Group_1__0 )* )
            {
            // InternalPascal.g:6163:1: ( ( rule__Case_label_list__Group_1__0 )* )
            // InternalPascal.g:6164:2: ( rule__Case_label_list__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCase_label_listAccess().getGroup_1()); 
            }
            // InternalPascal.g:6165:2: ( rule__Case_label_list__Group_1__0 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==32) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalPascal.g:6165:3: rule__Case_label_list__Group_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Case_label_list__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop51;
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
    // InternalPascal.g:6174:1: rule__Case_label_list__Group_1__0 : rule__Case_label_list__Group_1__0__Impl rule__Case_label_list__Group_1__1 ;
    public final void rule__Case_label_list__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6178:1: ( rule__Case_label_list__Group_1__0__Impl rule__Case_label_list__Group_1__1 )
            // InternalPascal.g:6179:2: rule__Case_label_list__Group_1__0__Impl rule__Case_label_list__Group_1__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalPascal.g:6186:1: rule__Case_label_list__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Case_label_list__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6190:1: ( ( ',' ) )
            // InternalPascal.g:6191:1: ( ',' )
            {
            // InternalPascal.g:6191:1: ( ',' )
            // InternalPascal.g:6192:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCase_label_listAccess().getCommaKeyword_1_0()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:6201:1: rule__Case_label_list__Group_1__1 : rule__Case_label_list__Group_1__1__Impl ;
    public final void rule__Case_label_list__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6205:1: ( rule__Case_label_list__Group_1__1__Impl )
            // InternalPascal.g:6206:2: rule__Case_label_list__Group_1__1__Impl
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
    // InternalPascal.g:6212:1: rule__Case_label_list__Group_1__1__Impl : ( ( rule__Case_label_list__ConstantsAssignment_1_1 ) ) ;
    public final void rule__Case_label_list__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6216:1: ( ( ( rule__Case_label_list__ConstantsAssignment_1_1 ) ) )
            // InternalPascal.g:6217:1: ( ( rule__Case_label_list__ConstantsAssignment_1_1 ) )
            {
            // InternalPascal.g:6217:1: ( ( rule__Case_label_list__ConstantsAssignment_1_1 ) )
            // InternalPascal.g:6218:2: ( rule__Case_label_list__ConstantsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCase_label_listAccess().getConstantsAssignment_1_1()); 
            }
            // InternalPascal.g:6219:2: ( rule__Case_label_list__ConstantsAssignment_1_1 )
            // InternalPascal.g:6219:3: rule__Case_label_list__ConstantsAssignment_1_1
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
    // InternalPascal.g:6228:1: rule__Pointer_type__Group__0 : rule__Pointer_type__Group__0__Impl rule__Pointer_type__Group__1 ;
    public final void rule__Pointer_type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6232:1: ( rule__Pointer_type__Group__0__Impl rule__Pointer_type__Group__1 )
            // InternalPascal.g:6233:2: rule__Pointer_type__Group__0__Impl rule__Pointer_type__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalPascal.g:6240:1: rule__Pointer_type__Group__0__Impl : ( '^' ) ;
    public final void rule__Pointer_type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6244:1: ( ( '^' ) )
            // InternalPascal.g:6245:1: ( '^' )
            {
            // InternalPascal.g:6245:1: ( '^' )
            // InternalPascal.g:6246:2: '^'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointer_typeAccess().getCircumflexAccentKeyword_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:6255:1: rule__Pointer_type__Group__1 : rule__Pointer_type__Group__1__Impl ;
    public final void rule__Pointer_type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6259:1: ( rule__Pointer_type__Group__1__Impl )
            // InternalPascal.g:6260:2: rule__Pointer_type__Group__1__Impl
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
    // InternalPascal.g:6266:1: rule__Pointer_type__Group__1__Impl : ( ( rule__Pointer_type__TypeAssignment_1 ) ) ;
    public final void rule__Pointer_type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6270:1: ( ( ( rule__Pointer_type__TypeAssignment_1 ) ) )
            // InternalPascal.g:6271:1: ( ( rule__Pointer_type__TypeAssignment_1 ) )
            {
            // InternalPascal.g:6271:1: ( ( rule__Pointer_type__TypeAssignment_1 ) )
            // InternalPascal.g:6272:2: ( rule__Pointer_type__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointer_typeAccess().getTypeAssignment_1()); 
            }
            // InternalPascal.g:6273:2: ( rule__Pointer_type__TypeAssignment_1 )
            // InternalPascal.g:6273:3: rule__Pointer_type__TypeAssignment_1
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
    // InternalPascal.g:6282:1: rule__Variable_declaration_part__Group__0 : rule__Variable_declaration_part__Group__0__Impl rule__Variable_declaration_part__Group__1 ;
    public final void rule__Variable_declaration_part__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6286:1: ( rule__Variable_declaration_part__Group__0__Impl rule__Variable_declaration_part__Group__1 )
            // InternalPascal.g:6287:2: rule__Variable_declaration_part__Group__0__Impl rule__Variable_declaration_part__Group__1
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
    // InternalPascal.g:6294:1: rule__Variable_declaration_part__Group__0__Impl : ( 'var' ) ;
    public final void rule__Variable_declaration_part__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6298:1: ( ( 'var' ) )
            // InternalPascal.g:6299:1: ( 'var' )
            {
            // InternalPascal.g:6299:1: ( 'var' )
            // InternalPascal.g:6300:2: 'var'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declaration_partAccess().getVarKeyword_0()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:6309:1: rule__Variable_declaration_part__Group__1 : rule__Variable_declaration_part__Group__1__Impl rule__Variable_declaration_part__Group__2 ;
    public final void rule__Variable_declaration_part__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6313:1: ( rule__Variable_declaration_part__Group__1__Impl rule__Variable_declaration_part__Group__2 )
            // InternalPascal.g:6314:2: rule__Variable_declaration_part__Group__1__Impl rule__Variable_declaration_part__Group__2
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
    // InternalPascal.g:6321:1: rule__Variable_declaration_part__Group__1__Impl : ( ( rule__Variable_declaration_part__SectionsAssignment_1 ) ) ;
    public final void rule__Variable_declaration_part__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6325:1: ( ( ( rule__Variable_declaration_part__SectionsAssignment_1 ) ) )
            // InternalPascal.g:6326:1: ( ( rule__Variable_declaration_part__SectionsAssignment_1 ) )
            {
            // InternalPascal.g:6326:1: ( ( rule__Variable_declaration_part__SectionsAssignment_1 ) )
            // InternalPascal.g:6327:2: ( rule__Variable_declaration_part__SectionsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declaration_partAccess().getSectionsAssignment_1()); 
            }
            // InternalPascal.g:6328:2: ( rule__Variable_declaration_part__SectionsAssignment_1 )
            // InternalPascal.g:6328:3: rule__Variable_declaration_part__SectionsAssignment_1
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
    // InternalPascal.g:6336:1: rule__Variable_declaration_part__Group__2 : rule__Variable_declaration_part__Group__2__Impl rule__Variable_declaration_part__Group__3 ;
    public final void rule__Variable_declaration_part__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6340:1: ( rule__Variable_declaration_part__Group__2__Impl rule__Variable_declaration_part__Group__3 )
            // InternalPascal.g:6341:2: rule__Variable_declaration_part__Group__2__Impl rule__Variable_declaration_part__Group__3
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
    // InternalPascal.g:6348:1: rule__Variable_declaration_part__Group__2__Impl : ( ';' ) ;
    public final void rule__Variable_declaration_part__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6352:1: ( ( ';' ) )
            // InternalPascal.g:6353:1: ( ';' )
            {
            // InternalPascal.g:6353:1: ( ';' )
            // InternalPascal.g:6354:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declaration_partAccess().getSemicolonKeyword_2()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:6363:1: rule__Variable_declaration_part__Group__3 : rule__Variable_declaration_part__Group__3__Impl ;
    public final void rule__Variable_declaration_part__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6367:1: ( rule__Variable_declaration_part__Group__3__Impl )
            // InternalPascal.g:6368:2: rule__Variable_declaration_part__Group__3__Impl
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
    // InternalPascal.g:6374:1: rule__Variable_declaration_part__Group__3__Impl : ( ( rule__Variable_declaration_part__Group_3__0 )* ) ;
    public final void rule__Variable_declaration_part__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6378:1: ( ( ( rule__Variable_declaration_part__Group_3__0 )* ) )
            // InternalPascal.g:6379:1: ( ( rule__Variable_declaration_part__Group_3__0 )* )
            {
            // InternalPascal.g:6379:1: ( ( rule__Variable_declaration_part__Group_3__0 )* )
            // InternalPascal.g:6380:2: ( rule__Variable_declaration_part__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declaration_partAccess().getGroup_3()); 
            }
            // InternalPascal.g:6381:2: ( rule__Variable_declaration_part__Group_3__0 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==RULE_ID) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalPascal.g:6381:3: rule__Variable_declaration_part__Group_3__0
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__Variable_declaration_part__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop52;
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
    // InternalPascal.g:6390:1: rule__Variable_declaration_part__Group_3__0 : rule__Variable_declaration_part__Group_3__0__Impl rule__Variable_declaration_part__Group_3__1 ;
    public final void rule__Variable_declaration_part__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6394:1: ( rule__Variable_declaration_part__Group_3__0__Impl rule__Variable_declaration_part__Group_3__1 )
            // InternalPascal.g:6395:2: rule__Variable_declaration_part__Group_3__0__Impl rule__Variable_declaration_part__Group_3__1
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
    // InternalPascal.g:6402:1: rule__Variable_declaration_part__Group_3__0__Impl : ( ( rule__Variable_declaration_part__SectionsAssignment_3_0 ) ) ;
    public final void rule__Variable_declaration_part__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6406:1: ( ( ( rule__Variable_declaration_part__SectionsAssignment_3_0 ) ) )
            // InternalPascal.g:6407:1: ( ( rule__Variable_declaration_part__SectionsAssignment_3_0 ) )
            {
            // InternalPascal.g:6407:1: ( ( rule__Variable_declaration_part__SectionsAssignment_3_0 ) )
            // InternalPascal.g:6408:2: ( rule__Variable_declaration_part__SectionsAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declaration_partAccess().getSectionsAssignment_3_0()); 
            }
            // InternalPascal.g:6409:2: ( rule__Variable_declaration_part__SectionsAssignment_3_0 )
            // InternalPascal.g:6409:3: rule__Variable_declaration_part__SectionsAssignment_3_0
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
    // InternalPascal.g:6417:1: rule__Variable_declaration_part__Group_3__1 : rule__Variable_declaration_part__Group_3__1__Impl ;
    public final void rule__Variable_declaration_part__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6421:1: ( rule__Variable_declaration_part__Group_3__1__Impl )
            // InternalPascal.g:6422:2: rule__Variable_declaration_part__Group_3__1__Impl
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
    // InternalPascal.g:6428:1: rule__Variable_declaration_part__Group_3__1__Impl : ( ';' ) ;
    public final void rule__Variable_declaration_part__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6432:1: ( ( ';' ) )
            // InternalPascal.g:6433:1: ( ';' )
            {
            // InternalPascal.g:6433:1: ( ';' )
            // InternalPascal.g:6434:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declaration_partAccess().getSemicolonKeyword_3_1()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:6444:1: rule__Variable_section__Group__0 : rule__Variable_section__Group__0__Impl rule__Variable_section__Group__1 ;
    public final void rule__Variable_section__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6448:1: ( rule__Variable_section__Group__0__Impl rule__Variable_section__Group__1 )
            // InternalPascal.g:6449:2: rule__Variable_section__Group__0__Impl rule__Variable_section__Group__1
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
    // InternalPascal.g:6456:1: rule__Variable_section__Group__0__Impl : ( ( rule__Variable_section__IdentifiersAssignment_0 ) ) ;
    public final void rule__Variable_section__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6460:1: ( ( ( rule__Variable_section__IdentifiersAssignment_0 ) ) )
            // InternalPascal.g:6461:1: ( ( rule__Variable_section__IdentifiersAssignment_0 ) )
            {
            // InternalPascal.g:6461:1: ( ( rule__Variable_section__IdentifiersAssignment_0 ) )
            // InternalPascal.g:6462:2: ( rule__Variable_section__IdentifiersAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_sectionAccess().getIdentifiersAssignment_0()); 
            }
            // InternalPascal.g:6463:2: ( rule__Variable_section__IdentifiersAssignment_0 )
            // InternalPascal.g:6463:3: rule__Variable_section__IdentifiersAssignment_0
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
    // InternalPascal.g:6471:1: rule__Variable_section__Group__1 : rule__Variable_section__Group__1__Impl rule__Variable_section__Group__2 ;
    public final void rule__Variable_section__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6475:1: ( rule__Variable_section__Group__1__Impl rule__Variable_section__Group__2 )
            // InternalPascal.g:6476:2: rule__Variable_section__Group__1__Impl rule__Variable_section__Group__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalPascal.g:6483:1: rule__Variable_section__Group__1__Impl : ( ':' ) ;
    public final void rule__Variable_section__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6487:1: ( ( ':' ) )
            // InternalPascal.g:6488:1: ( ':' )
            {
            // InternalPascal.g:6488:1: ( ':' )
            // InternalPascal.g:6489:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_sectionAccess().getColonKeyword_1()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:6498:1: rule__Variable_section__Group__2 : rule__Variable_section__Group__2__Impl ;
    public final void rule__Variable_section__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6502:1: ( rule__Variable_section__Group__2__Impl )
            // InternalPascal.g:6503:2: rule__Variable_section__Group__2__Impl
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
    // InternalPascal.g:6509:1: rule__Variable_section__Group__2__Impl : ( ( rule__Variable_section__TypeAssignment_2 ) ) ;
    public final void rule__Variable_section__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6513:1: ( ( ( rule__Variable_section__TypeAssignment_2 ) ) )
            // InternalPascal.g:6514:1: ( ( rule__Variable_section__TypeAssignment_2 ) )
            {
            // InternalPascal.g:6514:1: ( ( rule__Variable_section__TypeAssignment_2 ) )
            // InternalPascal.g:6515:2: ( rule__Variable_section__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_sectionAccess().getTypeAssignment_2()); 
            }
            // InternalPascal.g:6516:2: ( rule__Variable_section__TypeAssignment_2 )
            // InternalPascal.g:6516:3: rule__Variable_section__TypeAssignment_2
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
    // InternalPascal.g:6525:1: rule__Variable_identifier_list__Group__0 : rule__Variable_identifier_list__Group__0__Impl rule__Variable_identifier_list__Group__1 ;
    public final void rule__Variable_identifier_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6529:1: ( rule__Variable_identifier_list__Group__0__Impl rule__Variable_identifier_list__Group__1 )
            // InternalPascal.g:6530:2: rule__Variable_identifier_list__Group__0__Impl rule__Variable_identifier_list__Group__1
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
    // InternalPascal.g:6537:1: rule__Variable_identifier_list__Group__0__Impl : ( ( rule__Variable_identifier_list__NamesAssignment_0 ) ) ;
    public final void rule__Variable_identifier_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6541:1: ( ( ( rule__Variable_identifier_list__NamesAssignment_0 ) ) )
            // InternalPascal.g:6542:1: ( ( rule__Variable_identifier_list__NamesAssignment_0 ) )
            {
            // InternalPascal.g:6542:1: ( ( rule__Variable_identifier_list__NamesAssignment_0 ) )
            // InternalPascal.g:6543:2: ( rule__Variable_identifier_list__NamesAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_identifier_listAccess().getNamesAssignment_0()); 
            }
            // InternalPascal.g:6544:2: ( rule__Variable_identifier_list__NamesAssignment_0 )
            // InternalPascal.g:6544:3: rule__Variable_identifier_list__NamesAssignment_0
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
    // InternalPascal.g:6552:1: rule__Variable_identifier_list__Group__1 : rule__Variable_identifier_list__Group__1__Impl ;
    public final void rule__Variable_identifier_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6556:1: ( rule__Variable_identifier_list__Group__1__Impl )
            // InternalPascal.g:6557:2: rule__Variable_identifier_list__Group__1__Impl
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
    // InternalPascal.g:6563:1: rule__Variable_identifier_list__Group__1__Impl : ( ( rule__Variable_identifier_list__Group_1__0 )* ) ;
    public final void rule__Variable_identifier_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6567:1: ( ( ( rule__Variable_identifier_list__Group_1__0 )* ) )
            // InternalPascal.g:6568:1: ( ( rule__Variable_identifier_list__Group_1__0 )* )
            {
            // InternalPascal.g:6568:1: ( ( rule__Variable_identifier_list__Group_1__0 )* )
            // InternalPascal.g:6569:2: ( rule__Variable_identifier_list__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_identifier_listAccess().getGroup_1()); 
            }
            // InternalPascal.g:6570:2: ( rule__Variable_identifier_list__Group_1__0 )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==32) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalPascal.g:6570:3: rule__Variable_identifier_list__Group_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Variable_identifier_list__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop53;
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
    // InternalPascal.g:6579:1: rule__Variable_identifier_list__Group_1__0 : rule__Variable_identifier_list__Group_1__0__Impl rule__Variable_identifier_list__Group_1__1 ;
    public final void rule__Variable_identifier_list__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6583:1: ( rule__Variable_identifier_list__Group_1__0__Impl rule__Variable_identifier_list__Group_1__1 )
            // InternalPascal.g:6584:2: rule__Variable_identifier_list__Group_1__0__Impl rule__Variable_identifier_list__Group_1__1
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
    // InternalPascal.g:6591:1: rule__Variable_identifier_list__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Variable_identifier_list__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6595:1: ( ( ',' ) )
            // InternalPascal.g:6596:1: ( ',' )
            {
            // InternalPascal.g:6596:1: ( ',' )
            // InternalPascal.g:6597:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_identifier_listAccess().getCommaKeyword_1_0()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:6606:1: rule__Variable_identifier_list__Group_1__1 : rule__Variable_identifier_list__Group_1__1__Impl ;
    public final void rule__Variable_identifier_list__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6610:1: ( rule__Variable_identifier_list__Group_1__1__Impl )
            // InternalPascal.g:6611:2: rule__Variable_identifier_list__Group_1__1__Impl
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
    // InternalPascal.g:6617:1: rule__Variable_identifier_list__Group_1__1__Impl : ( ( rule__Variable_identifier_list__NamesAssignment_1_1 ) ) ;
    public final void rule__Variable_identifier_list__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6621:1: ( ( ( rule__Variable_identifier_list__NamesAssignment_1_1 ) ) )
            // InternalPascal.g:6622:1: ( ( rule__Variable_identifier_list__NamesAssignment_1_1 ) )
            {
            // InternalPascal.g:6622:1: ( ( rule__Variable_identifier_list__NamesAssignment_1_1 ) )
            // InternalPascal.g:6623:2: ( rule__Variable_identifier_list__NamesAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_identifier_listAccess().getNamesAssignment_1_1()); 
            }
            // InternalPascal.g:6624:2: ( rule__Variable_identifier_list__NamesAssignment_1_1 )
            // InternalPascal.g:6624:3: rule__Variable_identifier_list__NamesAssignment_1_1
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


    // $ANTLR start "rule__Pascal__ProgramAssignment"
    // InternalPascal.g:6633:1: rule__Pascal__ProgramAssignment : ( ruleprogram ) ;
    public final void rule__Pascal__ProgramAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6637:1: ( ( ruleprogram ) )
            // InternalPascal.g:6638:2: ( ruleprogram )
            {
            // InternalPascal.g:6638:2: ( ruleprogram )
            // InternalPascal.g:6639:3: ruleprogram
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
    // InternalPascal.g:6648:1: rule__Program__HeadingAssignment_0 : ( ruleprogram_heading_block ) ;
    public final void rule__Program__HeadingAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6652:1: ( ( ruleprogram_heading_block ) )
            // InternalPascal.g:6653:2: ( ruleprogram_heading_block )
            {
            // InternalPascal.g:6653:2: ( ruleprogram_heading_block )
            // InternalPascal.g:6654:3: ruleprogram_heading_block
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
    // InternalPascal.g:6663:1: rule__Program__BlockAssignment_1 : ( ruleblock ) ;
    public final void rule__Program__BlockAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6667:1: ( ( ruleblock ) )
            // InternalPascal.g:6668:2: ( ruleblock )
            {
            // InternalPascal.g:6668:2: ( ruleblock )
            // InternalPascal.g:6669:3: ruleblock
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
    // InternalPascal.g:6678:1: rule__Program_heading_block__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Program_heading_block__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6682:1: ( ( RULE_ID ) )
            // InternalPascal.g:6683:2: ( RULE_ID )
            {
            // InternalPascal.g:6683:2: ( RULE_ID )
            // InternalPascal.g:6684:3: RULE_ID
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
    // InternalPascal.g:6693:1: rule__Block__LabelAssignment_0 : ( rulelabel_declaration ) ;
    public final void rule__Block__LabelAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6697:1: ( ( rulelabel_declaration ) )
            // InternalPascal.g:6698:2: ( rulelabel_declaration )
            {
            // InternalPascal.g:6698:2: ( rulelabel_declaration )
            // InternalPascal.g:6699:3: rulelabel_declaration
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
    // InternalPascal.g:6708:1: rule__Block__TypeAssignment_1 : ( ruletype_definition_part ) ;
    public final void rule__Block__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6712:1: ( ( ruletype_definition_part ) )
            // InternalPascal.g:6713:2: ( ruletype_definition_part )
            {
            // InternalPascal.g:6713:2: ( ruletype_definition_part )
            // InternalPascal.g:6714:3: ruletype_definition_part
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
    // InternalPascal.g:6723:1: rule__Block__VariableAssignment_2 : ( rulevariable_declaration_part ) ;
    public final void rule__Block__VariableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6727:1: ( ( rulevariable_declaration_part ) )
            // InternalPascal.g:6728:2: ( rulevariable_declaration_part )
            {
            // InternalPascal.g:6728:2: ( rulevariable_declaration_part )
            // InternalPascal.g:6729:3: rulevariable_declaration_part
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
    // InternalPascal.g:6738:1: rule__Block__ConstantAssignment_3 : ( ruleconstant_definition_part ) ;
    public final void rule__Block__ConstantAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6742:1: ( ( ruleconstant_definition_part ) )
            // InternalPascal.g:6743:2: ( ruleconstant_definition_part )
            {
            // InternalPascal.g:6743:2: ( ruleconstant_definition_part )
            // InternalPascal.g:6744:3: ruleconstant_definition_part
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
    // InternalPascal.g:6753:1: rule__Block__AbstractionAssignment_4 : ( rulefunction_procedure_declaration ) ;
    public final void rule__Block__AbstractionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6757:1: ( ( rulefunction_procedure_declaration ) )
            // InternalPascal.g:6758:2: ( rulefunction_procedure_declaration )
            {
            // InternalPascal.g:6758:2: ( rulefunction_procedure_declaration )
            // InternalPascal.g:6759:3: rulefunction_procedure_declaration
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
    // InternalPascal.g:6768:1: rule__Block__StatementAssignment_5 : ( rulestatement_part ) ;
    public final void rule__Block__StatementAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6772:1: ( ( rulestatement_part ) )
            // InternalPascal.g:6773:2: ( rulestatement_part )
            {
            // InternalPascal.g:6773:2: ( rulestatement_part )
            // InternalPascal.g:6774:3: rulestatement_part
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
    // InternalPascal.g:6783:1: rule__Statement_part__SequenceAssignment_1 : ( rulestatement_sequence ) ;
    public final void rule__Statement_part__SequenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6787:1: ( ( rulestatement_sequence ) )
            // InternalPascal.g:6788:2: ( rulestatement_sequence )
            {
            // InternalPascal.g:6788:2: ( rulestatement_sequence )
            // InternalPascal.g:6789:3: rulestatement_sequence
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
    // InternalPascal.g:6798:1: rule__Statement_sequence__StatementsAssignment_0 : ( rulestatement ) ;
    public final void rule__Statement_sequence__StatementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6802:1: ( ( rulestatement ) )
            // InternalPascal.g:6803:2: ( rulestatement )
            {
            // InternalPascal.g:6803:2: ( rulestatement )
            // InternalPascal.g:6804:3: rulestatement
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
    // InternalPascal.g:6813:1: rule__Statement_sequence__StatementsAssignment_1_1 : ( rulestatement ) ;
    public final void rule__Statement_sequence__StatementsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6817:1: ( ( rulestatement ) )
            // InternalPascal.g:6818:2: ( rulestatement )
            {
            // InternalPascal.g:6818:2: ( rulestatement )
            // InternalPascal.g:6819:3: rulestatement
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
    // InternalPascal.g:6828:1: rule__Statement__LabelAssignment_0_0 : ( rulelabel ) ;
    public final void rule__Statement__LabelAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6832:1: ( ( rulelabel ) )
            // InternalPascal.g:6833:2: ( rulelabel )
            {
            // InternalPascal.g:6833:2: ( rulelabel )
            // InternalPascal.g:6834:3: rulelabel
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


    // $ANTLR start "rule__Statement__SimpleAssignment_1"
    // InternalPascal.g:6843:1: rule__Statement__SimpleAssignment_1 : ( rulesimple_statement ) ;
    public final void rule__Statement__SimpleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6847:1: ( ( rulesimple_statement ) )
            // InternalPascal.g:6848:2: ( rulesimple_statement )
            {
            // InternalPascal.g:6848:2: ( rulesimple_statement )
            // InternalPascal.g:6849:3: rulesimple_statement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getSimpleSimple_statementParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulesimple_statement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getSimpleSimple_statementParserRuleCall_1_0()); 
            }

            }


            }

        }
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
    // InternalPascal.g:6858:1: rule__Simple_statement__AssignmentAssignment_0 : ( ruleassignment_statement ) ;
    public final void rule__Simple_statement__AssignmentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6862:1: ( ( ruleassignment_statement ) )
            // InternalPascal.g:6863:2: ( ruleassignment_statement )
            {
            // InternalPascal.g:6863:2: ( ruleassignment_statement )
            // InternalPascal.g:6864:3: ruleassignment_statement
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
    // InternalPascal.g:6873:1: rule__Simple_statement__FunctionAssignment_1 : ( rulefunction_designator ) ;
    public final void rule__Simple_statement__FunctionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6877:1: ( ( rulefunction_designator ) )
            // InternalPascal.g:6878:2: ( rulefunction_designator )
            {
            // InternalPascal.g:6878:2: ( rulefunction_designator )
            // InternalPascal.g:6879:3: rulefunction_designator
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
    // InternalPascal.g:6888:1: rule__Simple_statement__Function_noargsAssignment_2 : ( RULE_ID ) ;
    public final void rule__Simple_statement__Function_noargsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6892:1: ( ( RULE_ID ) )
            // InternalPascal.g:6893:2: ( RULE_ID )
            {
            // InternalPascal.g:6893:2: ( RULE_ID )
            // InternalPascal.g:6894:3: RULE_ID
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


    // $ANTLR start "rule__Assignment_statement__VariableAssignment_0"
    // InternalPascal.g:6903:1: rule__Assignment_statement__VariableAssignment_0 : ( rulevariable ) ;
    public final void rule__Assignment_statement__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6907:1: ( ( rulevariable ) )
            // InternalPascal.g:6908:2: ( rulevariable )
            {
            // InternalPascal.g:6908:2: ( rulevariable )
            // InternalPascal.g:6909:3: rulevariable
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
    // InternalPascal.g:6918:1: rule__Assignment_statement__ExpressionAssignment_2 : ( ruleexpression ) ;
    public final void rule__Assignment_statement__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6922:1: ( ( ruleexpression ) )
            // InternalPascal.g:6923:2: ( ruleexpression )
            {
            // InternalPascal.g:6923:2: ( ruleexpression )
            // InternalPascal.g:6924:3: ruleexpression
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
    // InternalPascal.g:6933:1: rule__Label__NumberAssignment_0 : ( RULE_SIGNED_INTEGER_NUMBER ) ;
    public final void rule__Label__NumberAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6937:1: ( ( RULE_SIGNED_INTEGER_NUMBER ) )
            // InternalPascal.g:6938:2: ( RULE_SIGNED_INTEGER_NUMBER )
            {
            // InternalPascal.g:6938:2: ( RULE_SIGNED_INTEGER_NUMBER )
            // InternalPascal.g:6939:3: RULE_SIGNED_INTEGER_NUMBER
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
    // InternalPascal.g:6948:1: rule__Label__NumberAssignment_1 : ( RULE_INTEGER_NUMBER ) ;
    public final void rule__Label__NumberAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6952:1: ( ( RULE_INTEGER_NUMBER ) )
            // InternalPascal.g:6953:2: ( RULE_INTEGER_NUMBER )
            {
            // InternalPascal.g:6953:2: ( RULE_INTEGER_NUMBER )
            // InternalPascal.g:6954:3: RULE_INTEGER_NUMBER
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
    // InternalPascal.g:6963:1: rule__Variable__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6967:1: ( ( RULE_ID ) )
            // InternalPascal.g:6968:2: ( RULE_ID )
            {
            // InternalPascal.g:6968:2: ( RULE_ID )
            // InternalPascal.g:6969:3: RULE_ID
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
    // InternalPascal.g:6978:1: rule__Variable__VariableAssignment_1 : ( rulevar_ ) ;
    public final void rule__Variable__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6982:1: ( ( rulevar_ ) )
            // InternalPascal.g:6983:2: ( rulevar_ )
            {
            // InternalPascal.g:6983:2: ( rulevar_ )
            // InternalPascal.g:6984:3: rulevar_
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
    // InternalPascal.g:6993:1: rule__Var___ExpressionsAssignment_0_1 : ( ruleexpression_list ) ;
    public final void rule__Var___ExpressionsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6997:1: ( ( ruleexpression_list ) )
            // InternalPascal.g:6998:2: ( ruleexpression_list )
            {
            // InternalPascal.g:6998:2: ( ruleexpression_list )
            // InternalPascal.g:6999:3: ruleexpression_list
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
    // InternalPascal.g:7008:1: rule__Var___ArrayAssignment_0_3 : ( rulevar_ ) ;
    public final void rule__Var___ArrayAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7012:1: ( ( rulevar_ ) )
            // InternalPascal.g:7013:2: ( rulevar_ )
            {
            // InternalPascal.g:7013:2: ( rulevar_ )
            // InternalPascal.g:7014:3: rulevar_
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
    // InternalPascal.g:7023:1: rule__Var___AccessorAssignment_1_0 : ( ( '.' ) ) ;
    public final void rule__Var___AccessorAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7027:1: ( ( ( '.' ) ) )
            // InternalPascal.g:7028:2: ( ( '.' ) )
            {
            // InternalPascal.g:7028:2: ( ( '.' ) )
            // InternalPascal.g:7029:3: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_Access().getAccessorFullStopKeyword_1_0_0()); 
            }
            // InternalPascal.g:7030:3: ( '.' )
            // InternalPascal.g:7031:4: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_Access().getAccessorFullStopKeyword_1_0_0()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:7042:1: rule__Var___NameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Var___NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7046:1: ( ( RULE_ID ) )
            // InternalPascal.g:7047:2: ( RULE_ID )
            {
            // InternalPascal.g:7047:2: ( RULE_ID )
            // InternalPascal.g:7048:3: RULE_ID
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
    // InternalPascal.g:7057:1: rule__Var___VariableAssignment_1_2 : ( rulevar_ ) ;
    public final void rule__Var___VariableAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7061:1: ( ( rulevar_ ) )
            // InternalPascal.g:7062:2: ( rulevar_ )
            {
            // InternalPascal.g:7062:2: ( rulevar_ )
            // InternalPascal.g:7063:3: rulevar_
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
    // InternalPascal.g:7072:1: rule__Var___PointerAssignment_2_1 : ( rulevar_ ) ;
    public final void rule__Var___PointerAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7076:1: ( ( rulevar_ ) )
            // InternalPascal.g:7077:2: ( rulevar_ )
            {
            // InternalPascal.g:7077:2: ( rulevar_ )
            // InternalPascal.g:7078:3: rulevar_
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
    // InternalPascal.g:7087:1: rule__Expression_list__ExpressionsAssignment_0 : ( ruleexpression ) ;
    public final void rule__Expression_list__ExpressionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7091:1: ( ( ruleexpression ) )
            // InternalPascal.g:7092:2: ( ruleexpression )
            {
            // InternalPascal.g:7092:2: ( ruleexpression )
            // InternalPascal.g:7093:3: ruleexpression
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
    // InternalPascal.g:7102:1: rule__Expression_list__ExpressionsAssignment_1_1 : ( ruleexpression ) ;
    public final void rule__Expression_list__ExpressionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7106:1: ( ( ruleexpression ) )
            // InternalPascal.g:7107:2: ( ruleexpression )
            {
            // InternalPascal.g:7107:2: ( ruleexpression )
            // InternalPascal.g:7108:3: ruleexpression
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
    // InternalPascal.g:7117:1: rule__Expression__ExpressionsAssignment_0 : ( rulesimple_expression ) ;
    public final void rule__Expression__ExpressionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7121:1: ( ( rulesimple_expression ) )
            // InternalPascal.g:7122:2: ( rulesimple_expression )
            {
            // InternalPascal.g:7122:2: ( rulesimple_expression )
            // InternalPascal.g:7123:3: rulesimple_expression
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
    // InternalPascal.g:7132:1: rule__Expression__OperatorsAssignment_1_0_0 : ( RULE_RELATIONAL_OP ) ;
    public final void rule__Expression__OperatorsAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7136:1: ( ( RULE_RELATIONAL_OP ) )
            // InternalPascal.g:7137:2: ( RULE_RELATIONAL_OP )
            {
            // InternalPascal.g:7137:2: ( RULE_RELATIONAL_OP )
            // InternalPascal.g:7138:3: RULE_RELATIONAL_OP
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
    // InternalPascal.g:7147:1: rule__Expression__OperatorsAssignment_1_0_1 : ( ( 'in' ) ) ;
    public final void rule__Expression__OperatorsAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7151:1: ( ( ( 'in' ) ) )
            // InternalPascal.g:7152:2: ( ( 'in' ) )
            {
            // InternalPascal.g:7152:2: ( ( 'in' ) )
            // InternalPascal.g:7153:3: ( 'in' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getOperatorsInKeyword_1_0_1_0()); 
            }
            // InternalPascal.g:7154:3: ( 'in' )
            // InternalPascal.g:7155:4: 'in'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getOperatorsInKeyword_1_0_1_0()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:7166:1: rule__Expression__OperatorsAssignment_1_0_2 : ( ( '=' ) ) ;
    public final void rule__Expression__OperatorsAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7170:1: ( ( ( '=' ) ) )
            // InternalPascal.g:7171:2: ( ( '=' ) )
            {
            // InternalPascal.g:7171:2: ( ( '=' ) )
            // InternalPascal.g:7172:3: ( '=' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getOperatorsEqualsSignKeyword_1_0_2_0()); 
            }
            // InternalPascal.g:7173:3: ( '=' )
            // InternalPascal.g:7174:4: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getOperatorsEqualsSignKeyword_1_0_2_0()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:7185:1: rule__Expression__ExpressionsAssignment_1_1 : ( rulesimple_expression ) ;
    public final void rule__Expression__ExpressionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7189:1: ( ( rulesimple_expression ) )
            // InternalPascal.g:7190:2: ( rulesimple_expression )
            {
            // InternalPascal.g:7190:2: ( rulesimple_expression )
            // InternalPascal.g:7191:3: rulesimple_expression
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
    // InternalPascal.g:7200:1: rule__Simple_expression__PrefixOperatorAssignment_0 : ( RULE_ADDITION_OP ) ;
    public final void rule__Simple_expression__PrefixOperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7204:1: ( ( RULE_ADDITION_OP ) )
            // InternalPascal.g:7205:2: ( RULE_ADDITION_OP )
            {
            // InternalPascal.g:7205:2: ( RULE_ADDITION_OP )
            // InternalPascal.g:7206:3: RULE_ADDITION_OP
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
    // InternalPascal.g:7215:1: rule__Simple_expression__TermsAssignment_1 : ( ruleterm ) ;
    public final void rule__Simple_expression__TermsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7219:1: ( ( ruleterm ) )
            // InternalPascal.g:7220:2: ( ruleterm )
            {
            // InternalPascal.g:7220:2: ( ruleterm )
            // InternalPascal.g:7221:3: ruleterm
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
    // InternalPascal.g:7230:1: rule__Simple_expression__OperatorsAssignment_2_0_0_0 : ( RULE_ADDITION_OP ) ;
    public final void rule__Simple_expression__OperatorsAssignment_2_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7234:1: ( ( RULE_ADDITION_OP ) )
            // InternalPascal.g:7235:2: ( RULE_ADDITION_OP )
            {
            // InternalPascal.g:7235:2: ( RULE_ADDITION_OP )
            // InternalPascal.g:7236:3: RULE_ADDITION_OP
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
    // InternalPascal.g:7245:1: rule__Simple_expression__OperatorsAssignment_2_0_0_1 : ( ( 'or' ) ) ;
    public final void rule__Simple_expression__OperatorsAssignment_2_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7249:1: ( ( ( 'or' ) ) )
            // InternalPascal.g:7250:2: ( ( 'or' ) )
            {
            // InternalPascal.g:7250:2: ( ( 'or' ) )
            // InternalPascal.g:7251:3: ( 'or' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimple_expressionAccess().getOperatorsOrKeyword_2_0_0_1_0()); 
            }
            // InternalPascal.g:7252:3: ( 'or' )
            // InternalPascal.g:7253:4: 'or'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimple_expressionAccess().getOperatorsOrKeyword_2_0_0_1_0()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:7264:1: rule__Simple_expression__TermsAssignment_2_0_1 : ( ruleterm ) ;
    public final void rule__Simple_expression__TermsAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7268:1: ( ( ruleterm ) )
            // InternalPascal.g:7269:2: ( ruleterm )
            {
            // InternalPascal.g:7269:2: ( ruleterm )
            // InternalPascal.g:7270:3: ruleterm
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
    // InternalPascal.g:7279:1: rule__Simple_expression__TermsAssignment_2_1 : ( ruleunsigned_number ) ;
    public final void rule__Simple_expression__TermsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7283:1: ( ( ruleunsigned_number ) )
            // InternalPascal.g:7284:2: ( ruleunsigned_number )
            {
            // InternalPascal.g:7284:2: ( ruleunsigned_number )
            // InternalPascal.g:7285:3: ruleunsigned_number
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
    // InternalPascal.g:7294:1: rule__Term__FactorsAssignment_0 : ( rulefactor ) ;
    public final void rule__Term__FactorsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7298:1: ( ( rulefactor ) )
            // InternalPascal.g:7299:2: ( rulefactor )
            {
            // InternalPascal.g:7299:2: ( rulefactor )
            // InternalPascal.g:7300:3: rulefactor
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
    // InternalPascal.g:7309:1: rule__Term__OperatorsAssignment_1_0_0 : ( RULE_MULTIPLICATION_OP ) ;
    public final void rule__Term__OperatorsAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7313:1: ( ( RULE_MULTIPLICATION_OP ) )
            // InternalPascal.g:7314:2: ( RULE_MULTIPLICATION_OP )
            {
            // InternalPascal.g:7314:2: ( RULE_MULTIPLICATION_OP )
            // InternalPascal.g:7315:3: RULE_MULTIPLICATION_OP
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
    // InternalPascal.g:7324:1: rule__Term__OperatorsAssignment_1_0_1 : ( ( 'div' ) ) ;
    public final void rule__Term__OperatorsAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7328:1: ( ( ( 'div' ) ) )
            // InternalPascal.g:7329:2: ( ( 'div' ) )
            {
            // InternalPascal.g:7329:2: ( ( 'div' ) )
            // InternalPascal.g:7330:3: ( 'div' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getOperatorsDivKeyword_1_0_1_0()); 
            }
            // InternalPascal.g:7331:3: ( 'div' )
            // InternalPascal.g:7332:4: 'div'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getOperatorsDivKeyword_1_0_1_0()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:7343:1: rule__Term__OperatorsAssignment_1_0_2 : ( ( 'mod' ) ) ;
    public final void rule__Term__OperatorsAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7347:1: ( ( ( 'mod' ) ) )
            // InternalPascal.g:7348:2: ( ( 'mod' ) )
            {
            // InternalPascal.g:7348:2: ( ( 'mod' ) )
            // InternalPascal.g:7349:3: ( 'mod' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getOperatorsModKeyword_1_0_2_0()); 
            }
            // InternalPascal.g:7350:3: ( 'mod' )
            // InternalPascal.g:7351:4: 'mod'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getOperatorsModKeyword_1_0_2_0()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:7362:1: rule__Term__OperatorsAssignment_1_0_3 : ( ( 'and' ) ) ;
    public final void rule__Term__OperatorsAssignment_1_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7366:1: ( ( ( 'and' ) ) )
            // InternalPascal.g:7367:2: ( ( 'and' ) )
            {
            // InternalPascal.g:7367:2: ( ( 'and' ) )
            // InternalPascal.g:7368:3: ( 'and' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getOperatorsAndKeyword_1_0_3_0()); 
            }
            // InternalPascal.g:7369:3: ( 'and' )
            // InternalPascal.g:7370:4: 'and'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getOperatorsAndKeyword_1_0_3_0()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:7381:1: rule__Term__FactorsAssignment_1_1 : ( rulefactor ) ;
    public final void rule__Term__FactorsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7385:1: ( ( rulefactor ) )
            // InternalPascal.g:7386:2: ( rulefactor )
            {
            // InternalPascal.g:7386:2: ( rulefactor )
            // InternalPascal.g:7387:3: rulefactor
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
    // InternalPascal.g:7396:1: rule__Factor__VariableAssignment_0 : ( rulevariable ) ;
    public final void rule__Factor__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7400:1: ( ( rulevariable ) )
            // InternalPascal.g:7401:2: ( rulevariable )
            {
            // InternalPascal.g:7401:2: ( rulevariable )
            // InternalPascal.g:7402:3: rulevariable
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
    // InternalPascal.g:7411:1: rule__Factor__NumberAssignment_1 : ( rulenumber ) ;
    public final void rule__Factor__NumberAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7415:1: ( ( rulenumber ) )
            // InternalPascal.g:7416:2: ( rulenumber )
            {
            // InternalPascal.g:7416:2: ( rulenumber )
            // InternalPascal.g:7417:3: rulenumber
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
    // InternalPascal.g:7426:1: rule__Factor__StringAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Factor__StringAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7430:1: ( ( RULE_STRING ) )
            // InternalPascal.g:7431:2: ( RULE_STRING )
            {
            // InternalPascal.g:7431:2: ( RULE_STRING )
            // InternalPascal.g:7432:3: RULE_STRING
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
    // InternalPascal.g:7441:1: rule__Factor__SetAssignment_3 : ( ruleset ) ;
    public final void rule__Factor__SetAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7445:1: ( ( ruleset ) )
            // InternalPascal.g:7446:2: ( ruleset )
            {
            // InternalPascal.g:7446:2: ( ruleset )
            // InternalPascal.g:7447:3: ruleset
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
    // InternalPascal.g:7456:1: rule__Factor__NilAssignment_4 : ( ( 'nil' ) ) ;
    public final void rule__Factor__NilAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7460:1: ( ( ( 'nil' ) ) )
            // InternalPascal.g:7461:2: ( ( 'nil' ) )
            {
            // InternalPascal.g:7461:2: ( ( 'nil' ) )
            // InternalPascal.g:7462:3: ( 'nil' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getNilNilKeyword_4_0()); 
            }
            // InternalPascal.g:7463:3: ( 'nil' )
            // InternalPascal.g:7464:4: 'nil'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getNilNilKeyword_4_0()); 
            }
            match(input,50,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:7475:1: rule__Factor__BooleanAssignment_5 : ( ( 'true' ) ) ;
    public final void rule__Factor__BooleanAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7479:1: ( ( ( 'true' ) ) )
            // InternalPascal.g:7480:2: ( ( 'true' ) )
            {
            // InternalPascal.g:7480:2: ( ( 'true' ) )
            // InternalPascal.g:7481:3: ( 'true' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getBooleanTrueKeyword_5_0()); 
            }
            // InternalPascal.g:7482:3: ( 'true' )
            // InternalPascal.g:7483:4: 'true'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getBooleanTrueKeyword_5_0()); 
            }
            match(input,51,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:7494:1: rule__Factor__BooleanAssignment_6 : ( ( 'false' ) ) ;
    public final void rule__Factor__BooleanAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7498:1: ( ( ( 'false' ) ) )
            // InternalPascal.g:7499:2: ( ( 'false' ) )
            {
            // InternalPascal.g:7499:2: ( ( 'false' ) )
            // InternalPascal.g:7500:3: ( 'false' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getBooleanFalseKeyword_6_0()); 
            }
            // InternalPascal.g:7501:3: ( 'false' )
            // InternalPascal.g:7502:4: 'false'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getBooleanFalseKeyword_6_0()); 
            }
            match(input,52,FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__Factor__ExpressionAssignment_7_1"
    // InternalPascal.g:7513:1: rule__Factor__ExpressionAssignment_7_1 : ( ruleexpression ) ;
    public final void rule__Factor__ExpressionAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7517:1: ( ( ruleexpression ) )
            // InternalPascal.g:7518:2: ( ruleexpression )
            {
            // InternalPascal.g:7518:2: ( ruleexpression )
            // InternalPascal.g:7519:3: ruleexpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getExpressionExpressionParserRuleCall_7_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleexpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorAccess().getExpressionExpressionParserRuleCall_7_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__ExpressionAssignment_7_1"


    // $ANTLR start "rule__Factor__NotAssignment_8_1"
    // InternalPascal.g:7528:1: rule__Factor__NotAssignment_8_1 : ( rulefactor ) ;
    public final void rule__Factor__NotAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7532:1: ( ( rulefactor ) )
            // InternalPascal.g:7533:2: ( rulefactor )
            {
            // InternalPascal.g:7533:2: ( rulefactor )
            // InternalPascal.g:7534:3: rulefactor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getNotFactorParserRuleCall_8_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulefactor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorAccess().getNotFactorParserRuleCall_8_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__NotAssignment_8_1"


    // $ANTLR start "rule__Function_designator__NameAssignment_0"
    // InternalPascal.g:7543:1: rule__Function_designator__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Function_designator__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7547:1: ( ( RULE_ID ) )
            // InternalPascal.g:7548:2: ( RULE_ID )
            {
            // InternalPascal.g:7548:2: ( RULE_ID )
            // InternalPascal.g:7549:3: RULE_ID
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
    // InternalPascal.g:7558:1: rule__Function_designator__ExpressionsAssignment_2 : ( ruleexpression_list ) ;
    public final void rule__Function_designator__ExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7562:1: ( ( ruleexpression_list ) )
            // InternalPascal.g:7563:2: ( ruleexpression_list )
            {
            // InternalPascal.g:7563:2: ( ruleexpression_list )
            // InternalPascal.g:7564:3: ruleexpression_list
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


    // $ANTLR start "rule__Function_procedure_declaration__ProceduresAssignment_0"
    // InternalPascal.g:7573:1: rule__Function_procedure_declaration__ProceduresAssignment_0 : ( ruleprocedure_declaration ) ;
    public final void rule__Function_procedure_declaration__ProceduresAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7577:1: ( ( ruleprocedure_declaration ) )
            // InternalPascal.g:7578:2: ( ruleprocedure_declaration )
            {
            // InternalPascal.g:7578:2: ( ruleprocedure_declaration )
            // InternalPascal.g:7579:3: ruleprocedure_declaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_procedure_declarationAccess().getProceduresProcedure_declarationParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleprocedure_declaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunction_procedure_declarationAccess().getProceduresProcedure_declarationParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_procedure_declaration__ProceduresAssignment_0"


    // $ANTLR start "rule__Procedure_declaration__HeadingAssignment_0"
    // InternalPascal.g:7588:1: rule__Procedure_declaration__HeadingAssignment_0 : ( ruleprocedure_heading ) ;
    public final void rule__Procedure_declaration__HeadingAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7592:1: ( ( ruleprocedure_heading ) )
            // InternalPascal.g:7593:2: ( ruleprocedure_heading )
            {
            // InternalPascal.g:7593:2: ( ruleprocedure_heading )
            // InternalPascal.g:7594:3: ruleprocedure_heading
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
    // InternalPascal.g:7603:1: rule__Procedure_declaration__BlockAssignment_2 : ( ruleblock ) ;
    public final void rule__Procedure_declaration__BlockAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7607:1: ( ( ruleblock ) )
            // InternalPascal.g:7608:2: ( ruleblock )
            {
            // InternalPascal.g:7608:2: ( ruleblock )
            // InternalPascal.g:7609:3: ruleblock
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
    // InternalPascal.g:7618:1: rule__Procedure_heading__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Procedure_heading__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7622:1: ( ( RULE_ID ) )
            // InternalPascal.g:7623:2: ( RULE_ID )
            {
            // InternalPascal.g:7623:2: ( RULE_ID )
            // InternalPascal.g:7624:3: RULE_ID
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
    // InternalPascal.g:7633:1: rule__Procedure_heading__ParametersAssignment_2 : ( ruleformal_parameter_list ) ;
    public final void rule__Procedure_heading__ParametersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7637:1: ( ( ruleformal_parameter_list ) )
            // InternalPascal.g:7638:2: ( ruleformal_parameter_list )
            {
            // InternalPascal.g:7638:2: ( ruleformal_parameter_list )
            // InternalPascal.g:7639:3: ruleformal_parameter_list
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


    // $ANTLR start "rule__Formal_parameter_list__ParametersAssignment_1"
    // InternalPascal.g:7648:1: rule__Formal_parameter_list__ParametersAssignment_1 : ( ruleformal_parameter_section ) ;
    public final void rule__Formal_parameter_list__ParametersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7652:1: ( ( ruleformal_parameter_section ) )
            // InternalPascal.g:7653:2: ( ruleformal_parameter_section )
            {
            // InternalPascal.g:7653:2: ( ruleformal_parameter_section )
            // InternalPascal.g:7654:3: ruleformal_parameter_section
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
    // InternalPascal.g:7663:1: rule__Formal_parameter_list__ParametersAssignment_2_1 : ( ruleformal_parameter_section ) ;
    public final void rule__Formal_parameter_list__ParametersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7667:1: ( ( ruleformal_parameter_section ) )
            // InternalPascal.g:7668:2: ( ruleformal_parameter_section )
            {
            // InternalPascal.g:7668:2: ( ruleformal_parameter_section )
            // InternalPascal.g:7669:3: ruleformal_parameter_section
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
    // InternalPascal.g:7678:1: rule__Formal_parameter_section__ValueAssignment_0 : ( rulevalue_parameter_section ) ;
    public final void rule__Formal_parameter_section__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7682:1: ( ( rulevalue_parameter_section ) )
            // InternalPascal.g:7683:2: ( rulevalue_parameter_section )
            {
            // InternalPascal.g:7683:2: ( rulevalue_parameter_section )
            // InternalPascal.g:7684:3: rulevalue_parameter_section
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
    // InternalPascal.g:7693:1: rule__Formal_parameter_section__VariableAssignment_1 : ( rulevariable_parameter_section ) ;
    public final void rule__Formal_parameter_section__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7697:1: ( ( rulevariable_parameter_section ) )
            // InternalPascal.g:7698:2: ( rulevariable_parameter_section )
            {
            // InternalPascal.g:7698:2: ( rulevariable_parameter_section )
            // InternalPascal.g:7699:3: rulevariable_parameter_section
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
    // InternalPascal.g:7708:1: rule__Formal_parameter_section__ProcedureAssignment_2 : ( ruleprocedure_heading ) ;
    public final void rule__Formal_parameter_section__ProcedureAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7712:1: ( ( ruleprocedure_heading ) )
            // InternalPascal.g:7713:2: ( ruleprocedure_heading )
            {
            // InternalPascal.g:7713:2: ( ruleprocedure_heading )
            // InternalPascal.g:7714:3: ruleprocedure_heading
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


    // $ANTLR start "rule__Value_parameter_section__IdentifiersAssignment_0"
    // InternalPascal.g:7723:1: rule__Value_parameter_section__IdentifiersAssignment_0 : ( ruleidentifier_list ) ;
    public final void rule__Value_parameter_section__IdentifiersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7727:1: ( ( ruleidentifier_list ) )
            // InternalPascal.g:7728:2: ( ruleidentifier_list )
            {
            // InternalPascal.g:7728:2: ( ruleidentifier_list )
            // InternalPascal.g:7729:3: ruleidentifier_list
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
    // InternalPascal.g:7738:1: rule__Value_parameter_section__TypeAssignment_2 : ( ruleparameter_type ) ;
    public final void rule__Value_parameter_section__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7742:1: ( ( ruleparameter_type ) )
            // InternalPascal.g:7743:2: ( ruleparameter_type )
            {
            // InternalPascal.g:7743:2: ( ruleparameter_type )
            // InternalPascal.g:7744:3: ruleparameter_type
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
    // InternalPascal.g:7753:1: rule__Identifier_list__NamesAssignment_0 : ( RULE_ID ) ;
    public final void rule__Identifier_list__NamesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7757:1: ( ( RULE_ID ) )
            // InternalPascal.g:7758:2: ( RULE_ID )
            {
            // InternalPascal.g:7758:2: ( RULE_ID )
            // InternalPascal.g:7759:3: RULE_ID
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
    // InternalPascal.g:7768:1: rule__Identifier_list__NamesAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Identifier_list__NamesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7772:1: ( ( RULE_ID ) )
            // InternalPascal.g:7773:2: ( RULE_ID )
            {
            // InternalPascal.g:7773:2: ( RULE_ID )
            // InternalPascal.g:7774:3: RULE_ID
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
    // InternalPascal.g:7783:1: rule__Parameter_type__NameAssignment : ( RULE_ID ) ;
    public final void rule__Parameter_type__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7787:1: ( ( RULE_ID ) )
            // InternalPascal.g:7788:2: ( RULE_ID )
            {
            // InternalPascal.g:7788:2: ( RULE_ID )
            // InternalPascal.g:7789:3: RULE_ID
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
    // InternalPascal.g:7798:1: rule__Variable_parameter_section__IndentifiersAssignment_1 : ( ruleidentifier_list ) ;
    public final void rule__Variable_parameter_section__IndentifiersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7802:1: ( ( ruleidentifier_list ) )
            // InternalPascal.g:7803:2: ( ruleidentifier_list )
            {
            // InternalPascal.g:7803:2: ( ruleidentifier_list )
            // InternalPascal.g:7804:3: ruleidentifier_list
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
    // InternalPascal.g:7813:1: rule__Variable_parameter_section__TypeAssignment_3 : ( ruleparameter_type ) ;
    public final void rule__Variable_parameter_section__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7817:1: ( ( ruleparameter_type ) )
            // InternalPascal.g:7818:2: ( ruleparameter_type )
            {
            // InternalPascal.g:7818:2: ( ruleparameter_type )
            // InternalPascal.g:7819:3: ruleparameter_type
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


    // $ANTLR start "rule__Set__BracketsAssignment_0"
    // InternalPascal.g:7828:1: rule__Set__BracketsAssignment_0 : ( ( '[' ) ) ;
    public final void rule__Set__BracketsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7832:1: ( ( ( '[' ) ) )
            // InternalPascal.g:7833:2: ( ( '[' ) )
            {
            // InternalPascal.g:7833:2: ( ( '[' ) )
            // InternalPascal.g:7834:3: ( '[' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetAccess().getBracketsLeftSquareBracketKeyword_0_0()); 
            }
            // InternalPascal.g:7835:3: ( '[' )
            // InternalPascal.g:7836:4: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetAccess().getBracketsLeftSquareBracketKeyword_0_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:7847:1: rule__Set__ExpressionsAssignment_1 : ( ruleexpression_list ) ;
    public final void rule__Set__ExpressionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7851:1: ( ( ruleexpression_list ) )
            // InternalPascal.g:7852:2: ( ruleexpression_list )
            {
            // InternalPascal.g:7852:2: ( ruleexpression_list )
            // InternalPascal.g:7853:3: ruleexpression_list
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
    // InternalPascal.g:7862:1: rule__Set__BracketsAssignment_2 : ( ( ']' ) ) ;
    public final void rule__Set__BracketsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7866:1: ( ( ( ']' ) ) )
            // InternalPascal.g:7867:2: ( ( ']' ) )
            {
            // InternalPascal.g:7867:2: ( ( ']' ) )
            // InternalPascal.g:7868:3: ( ']' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetAccess().getBracketsRightSquareBracketKeyword_2_0()); 
            }
            // InternalPascal.g:7869:3: ( ']' )
            // InternalPascal.g:7870:4: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetAccess().getBracketsRightSquareBracketKeyword_2_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:7881:1: rule__Number__NumberAssignment : ( ruleany_number ) ;
    public final void rule__Number__NumberAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7885:1: ( ( ruleany_number ) )
            // InternalPascal.g:7886:2: ( ruleany_number )
            {
            // InternalPascal.g:7886:2: ( ruleany_number )
            // InternalPascal.g:7887:3: ruleany_number
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
    // InternalPascal.g:7896:1: rule__Label_declaration__LabelsAssignment_1 : ( rulelabel ) ;
    public final void rule__Label_declaration__LabelsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7900:1: ( ( rulelabel ) )
            // InternalPascal.g:7901:2: ( rulelabel )
            {
            // InternalPascal.g:7901:2: ( rulelabel )
            // InternalPascal.g:7902:3: rulelabel
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
    // InternalPascal.g:7911:1: rule__Label_declaration__LabelsAssignment_2_1 : ( rulelabel ) ;
    public final void rule__Label_declaration__LabelsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7915:1: ( ( rulelabel ) )
            // InternalPascal.g:7916:2: ( rulelabel )
            {
            // InternalPascal.g:7916:2: ( rulelabel )
            // InternalPascal.g:7917:3: rulelabel
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
    // InternalPascal.g:7926:1: rule__Constant__OpteratorAssignment_0_0 : ( RULE_ADDITION_OP ) ;
    public final void rule__Constant__OpteratorAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7930:1: ( ( RULE_ADDITION_OP ) )
            // InternalPascal.g:7931:2: ( RULE_ADDITION_OP )
            {
            // InternalPascal.g:7931:2: ( RULE_ADDITION_OP )
            // InternalPascal.g:7932:3: RULE_ADDITION_OP
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
    // InternalPascal.g:7941:1: rule__Constant__NameAssignment_0_1_0 : ( RULE_ID ) ;
    public final void rule__Constant__NameAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7945:1: ( ( RULE_ID ) )
            // InternalPascal.g:7946:2: ( RULE_ID )
            {
            // InternalPascal.g:7946:2: ( RULE_ID )
            // InternalPascal.g:7947:3: RULE_ID
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
    // InternalPascal.g:7956:1: rule__Constant__NumberAssignment_0_1_1 : ( rulenumber ) ;
    public final void rule__Constant__NumberAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7960:1: ( ( rulenumber ) )
            // InternalPascal.g:7961:2: ( rulenumber )
            {
            // InternalPascal.g:7961:2: ( rulenumber )
            // InternalPascal.g:7962:3: rulenumber
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
    // InternalPascal.g:7971:1: rule__Constant__StringAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Constant__StringAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7975:1: ( ( RULE_STRING ) )
            // InternalPascal.g:7976:2: ( RULE_STRING )
            {
            // InternalPascal.g:7976:2: ( RULE_STRING )
            // InternalPascal.g:7977:3: RULE_STRING
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
    // InternalPascal.g:7986:1: rule__Constant__BoolLiteralAssignment_2 : ( ( 'true' ) ) ;
    public final void rule__Constant__BoolLiteralAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7990:1: ( ( ( 'true' ) ) )
            // InternalPascal.g:7991:2: ( ( 'true' ) )
            {
            // InternalPascal.g:7991:2: ( ( 'true' ) )
            // InternalPascal.g:7992:3: ( 'true' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getBoolLiteralTrueKeyword_2_0()); 
            }
            // InternalPascal.g:7993:3: ( 'true' )
            // InternalPascal.g:7994:4: 'true'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getBoolLiteralTrueKeyword_2_0()); 
            }
            match(input,51,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:8005:1: rule__Constant__BoolLiteralAssignment_3 : ( ( 'false' ) ) ;
    public final void rule__Constant__BoolLiteralAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8009:1: ( ( ( 'false' ) ) )
            // InternalPascal.g:8010:2: ( ( 'false' ) )
            {
            // InternalPascal.g:8010:2: ( ( 'false' ) )
            // InternalPascal.g:8011:3: ( 'false' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getBoolLiteralFalseKeyword_3_0()); 
            }
            // InternalPascal.g:8012:3: ( 'false' )
            // InternalPascal.g:8013:4: 'false'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getBoolLiteralFalseKeyword_3_0()); 
            }
            match(input,52,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:8024:1: rule__Constant_definition_part__ConstsAssignment_1_0 : ( ruleconstant_definition ) ;
    public final void rule__Constant_definition_part__ConstsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8028:1: ( ( ruleconstant_definition ) )
            // InternalPascal.g:8029:2: ( ruleconstant_definition )
            {
            // InternalPascal.g:8029:2: ( ruleconstant_definition )
            // InternalPascal.g:8030:3: ruleconstant_definition
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
    // InternalPascal.g:8039:1: rule__Constant_definition__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Constant_definition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8043:1: ( ( RULE_ID ) )
            // InternalPascal.g:8044:2: ( RULE_ID )
            {
            // InternalPascal.g:8044:2: ( RULE_ID )
            // InternalPascal.g:8045:3: RULE_ID
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
    // InternalPascal.g:8054:1: rule__Constant_definition__ConstAssignment_2 : ( ruleconstant ) ;
    public final void rule__Constant_definition__ConstAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8058:1: ( ( ruleconstant ) )
            // InternalPascal.g:8059:2: ( ruleconstant )
            {
            // InternalPascal.g:8059:2: ( ruleconstant )
            // InternalPascal.g:8060:3: ruleconstant
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
    // InternalPascal.g:8069:1: rule__Type_definition_part__TypesAssignment_1_0 : ( ruletype_definition ) ;
    public final void rule__Type_definition_part__TypesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8073:1: ( ( ruletype_definition ) )
            // InternalPascal.g:8074:2: ( ruletype_definition )
            {
            // InternalPascal.g:8074:2: ( ruletype_definition )
            // InternalPascal.g:8075:3: ruletype_definition
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
    // InternalPascal.g:8084:1: rule__Type_definition__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Type_definition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8088:1: ( ( RULE_ID ) )
            // InternalPascal.g:8089:2: ( RULE_ID )
            {
            // InternalPascal.g:8089:2: ( RULE_ID )
            // InternalPascal.g:8090:3: RULE_ID
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
    // InternalPascal.g:8099:1: rule__Type_definition__TypeAssignment_2 : ( ruletype ) ;
    public final void rule__Type_definition__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8103:1: ( ( ruletype ) )
            // InternalPascal.g:8104:2: ( ruletype )
            {
            // InternalPascal.g:8104:2: ( ruletype )
            // InternalPascal.g:8105:3: ruletype
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
    // InternalPascal.g:8114:1: rule__Type__SimpleAssignment_0 : ( rulesimple_type ) ;
    public final void rule__Type__SimpleAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8118:1: ( ( rulesimple_type ) )
            // InternalPascal.g:8119:2: ( rulesimple_type )
            {
            // InternalPascal.g:8119:2: ( rulesimple_type )
            // InternalPascal.g:8120:3: rulesimple_type
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
    // InternalPascal.g:8129:1: rule__Type__StructuredAssignment_1 : ( rulestructured_type ) ;
    public final void rule__Type__StructuredAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8133:1: ( ( rulestructured_type ) )
            // InternalPascal.g:8134:2: ( rulestructured_type )
            {
            // InternalPascal.g:8134:2: ( rulestructured_type )
            // InternalPascal.g:8135:3: rulestructured_type
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
    // InternalPascal.g:8144:1: rule__Type__PointerAssignment_2 : ( rulepointer_type ) ;
    public final void rule__Type__PointerAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8148:1: ( ( rulepointer_type ) )
            // InternalPascal.g:8149:2: ( rulepointer_type )
            {
            // InternalPascal.g:8149:2: ( rulepointer_type )
            // InternalPascal.g:8150:3: rulepointer_type
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
    // InternalPascal.g:8159:1: rule__Simple_type__SubrangeAssignment_0 : ( rulesubrange_type ) ;
    public final void rule__Simple_type__SubrangeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8163:1: ( ( rulesubrange_type ) )
            // InternalPascal.g:8164:2: ( rulesubrange_type )
            {
            // InternalPascal.g:8164:2: ( rulesubrange_type )
            // InternalPascal.g:8165:3: rulesubrange_type
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
    // InternalPascal.g:8174:1: rule__Simple_type__EnumeratedAssignment_1 : ( ruleenumerated_type ) ;
    public final void rule__Simple_type__EnumeratedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8178:1: ( ( ruleenumerated_type ) )
            // InternalPascal.g:8179:2: ( ruleenumerated_type )
            {
            // InternalPascal.g:8179:2: ( ruleenumerated_type )
            // InternalPascal.g:8180:3: ruleenumerated_type
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
    // InternalPascal.g:8189:1: rule__Simple_type__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Simple_type__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8193:1: ( ( RULE_ID ) )
            // InternalPascal.g:8194:2: ( RULE_ID )
            {
            // InternalPascal.g:8194:2: ( RULE_ID )
            // InternalPascal.g:8195:3: RULE_ID
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
    // InternalPascal.g:8204:1: rule__Subrange_type__InitialConstAssignment_0_0 : ( ruleconstant ) ;
    public final void rule__Subrange_type__InitialConstAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8208:1: ( ( ruleconstant ) )
            // InternalPascal.g:8209:2: ( ruleconstant )
            {
            // InternalPascal.g:8209:2: ( ruleconstant )
            // InternalPascal.g:8210:3: ruleconstant
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
    // InternalPascal.g:8219:1: rule__Subrange_type__FinalConstAssignment_0_2 : ( ruleconstant ) ;
    public final void rule__Subrange_type__FinalConstAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8223:1: ( ( ruleconstant ) )
            // InternalPascal.g:8224:2: ( ruleconstant )
            {
            // InternalPascal.g:8224:2: ( ruleconstant )
            // InternalPascal.g:8225:3: ruleconstant
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
    // InternalPascal.g:8234:1: rule__Subrange_type__SubrangeAssignment_1_0 : ( RULE_NUMERIC_SUBRANGE ) ;
    public final void rule__Subrange_type__SubrangeAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8238:1: ( ( RULE_NUMERIC_SUBRANGE ) )
            // InternalPascal.g:8239:2: ( RULE_NUMERIC_SUBRANGE )
            {
            // InternalPascal.g:8239:2: ( RULE_NUMERIC_SUBRANGE )
            // InternalPascal.g:8240:3: RULE_NUMERIC_SUBRANGE
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
    // InternalPascal.g:8249:1: rule__Subrange_type__ConstAssignment_1_1 : ( ruleconstant ) ;
    public final void rule__Subrange_type__ConstAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8253:1: ( ( ruleconstant ) )
            // InternalPascal.g:8254:2: ( ruleconstant )
            {
            // InternalPascal.g:8254:2: ( ruleconstant )
            // InternalPascal.g:8255:3: ruleconstant
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
    // InternalPascal.g:8264:1: rule__Enumerated_type__IdentifiersAssignment_1 : ( ruleidentifier_list ) ;
    public final void rule__Enumerated_type__IdentifiersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8268:1: ( ( ruleidentifier_list ) )
            // InternalPascal.g:8269:2: ( ruleidentifier_list )
            {
            // InternalPascal.g:8269:2: ( ruleidentifier_list )
            // InternalPascal.g:8270:3: ruleidentifier_list
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
    // InternalPascal.g:8279:1: rule__Structured_type__PackedAssignment_0 : ( ( 'packed' ) ) ;
    public final void rule__Structured_type__PackedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8283:1: ( ( ( 'packed' ) ) )
            // InternalPascal.g:8284:2: ( ( 'packed' ) )
            {
            // InternalPascal.g:8284:2: ( ( 'packed' ) )
            // InternalPascal.g:8285:3: ( 'packed' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStructured_typeAccess().getPackedPackedKeyword_0_0()); 
            }
            // InternalPascal.g:8286:3: ( 'packed' )
            // InternalPascal.g:8287:4: 'packed'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStructured_typeAccess().getPackedPackedKeyword_0_0()); 
            }
            match(input,53,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:8298:1: rule__Structured_type__TypeAssignment_1 : ( ruleunpacked_structured_type ) ;
    public final void rule__Structured_type__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8302:1: ( ( ruleunpacked_structured_type ) )
            // InternalPascal.g:8303:2: ( ruleunpacked_structured_type )
            {
            // InternalPascal.g:8303:2: ( ruleunpacked_structured_type )
            // InternalPascal.g:8304:3: ruleunpacked_structured_type
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
    // InternalPascal.g:8313:1: rule__Unpacked_structured_type__RecordAssignment : ( rulerecord_type ) ;
    public final void rule__Unpacked_structured_type__RecordAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8317:1: ( ( rulerecord_type ) )
            // InternalPascal.g:8318:2: ( rulerecord_type )
            {
            // InternalPascal.g:8318:2: ( rulerecord_type )
            // InternalPascal.g:8319:3: rulerecord_type
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
    // InternalPascal.g:8328:1: rule__Record_type__RecordKeywordAssignment_0 : ( ( 'record' ) ) ;
    public final void rule__Record_type__RecordKeywordAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8332:1: ( ( ( 'record' ) ) )
            // InternalPascal.g:8333:2: ( ( 'record' ) )
            {
            // InternalPascal.g:8333:2: ( ( 'record' ) )
            // InternalPascal.g:8334:3: ( 'record' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecord_typeAccess().getRecordKeywordRecordKeyword_0_0()); 
            }
            // InternalPascal.g:8335:3: ( 'record' )
            // InternalPascal.g:8336:4: 'record'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecord_typeAccess().getRecordKeywordRecordKeyword_0_0()); 
            }
            match(input,54,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:8347:1: rule__Record_type__FieldsAssignment_1 : ( rulefield_list ) ;
    public final void rule__Record_type__FieldsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8351:1: ( ( rulefield_list ) )
            // InternalPascal.g:8352:2: ( rulefield_list )
            {
            // InternalPascal.g:8352:2: ( rulefield_list )
            // InternalPascal.g:8353:3: rulefield_list
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
    // InternalPascal.g:8362:1: rule__Record_type__EndKeywordAssignment_2 : ( ( 'end' ) ) ;
    public final void rule__Record_type__EndKeywordAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8366:1: ( ( ( 'end' ) ) )
            // InternalPascal.g:8367:2: ( ( 'end' ) )
            {
            // InternalPascal.g:8367:2: ( ( 'end' ) )
            // InternalPascal.g:8368:3: ( 'end' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecord_typeAccess().getEndKeywordEndKeyword_2_0()); 
            }
            // InternalPascal.g:8369:3: ( 'end' )
            // InternalPascal.g:8370:4: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecord_typeAccess().getEndKeywordEndKeyword_2_0()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:8381:1: rule__Field_list__FixedAssignment_0_0_0 : ( rulefixed_part ) ;
    public final void rule__Field_list__FixedAssignment_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8385:1: ( ( rulefixed_part ) )
            // InternalPascal.g:8386:2: ( rulefixed_part )
            {
            // InternalPascal.g:8386:2: ( rulefixed_part )
            // InternalPascal.g:8387:3: rulefixed_part
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
    // InternalPascal.g:8396:1: rule__Field_list__VariantsAssignment_0_0_1_1 : ( rulevariant_part ) ;
    public final void rule__Field_list__VariantsAssignment_0_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8400:1: ( ( rulevariant_part ) )
            // InternalPascal.g:8401:2: ( rulevariant_part )
            {
            // InternalPascal.g:8401:2: ( rulevariant_part )
            // InternalPascal.g:8402:3: rulevariant_part
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
    // InternalPascal.g:8411:1: rule__Field_list__VariantsAssignment_0_1 : ( rulevariant_part ) ;
    public final void rule__Field_list__VariantsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8415:1: ( ( rulevariant_part ) )
            // InternalPascal.g:8416:2: ( rulevariant_part )
            {
            // InternalPascal.g:8416:2: ( rulevariant_part )
            // InternalPascal.g:8417:3: rulevariant_part
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
    // InternalPascal.g:8426:1: rule__Fixed_part__SectionsAssignment_0 : ( rulerecord_section ) ;
    public final void rule__Fixed_part__SectionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8430:1: ( ( rulerecord_section ) )
            // InternalPascal.g:8431:2: ( rulerecord_section )
            {
            // InternalPascal.g:8431:2: ( rulerecord_section )
            // InternalPascal.g:8432:3: rulerecord_section
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
    // InternalPascal.g:8441:1: rule__Fixed_part__SectionsAssignment_1_1 : ( rulerecord_section ) ;
    public final void rule__Fixed_part__SectionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8445:1: ( ( rulerecord_section ) )
            // InternalPascal.g:8446:2: ( rulerecord_section )
            {
            // InternalPascal.g:8446:2: ( rulerecord_section )
            // InternalPascal.g:8447:3: rulerecord_section
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
    // InternalPascal.g:8456:1: rule__Record_section__IdentifiersAssignment_0 : ( ruleidentifier_list ) ;
    public final void rule__Record_section__IdentifiersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8460:1: ( ( ruleidentifier_list ) )
            // InternalPascal.g:8461:2: ( ruleidentifier_list )
            {
            // InternalPascal.g:8461:2: ( ruleidentifier_list )
            // InternalPascal.g:8462:3: ruleidentifier_list
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
    // InternalPascal.g:8471:1: rule__Record_section__TypeAssignment_2 : ( ruletype ) ;
    public final void rule__Record_section__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8475:1: ( ( ruletype ) )
            // InternalPascal.g:8476:2: ( ruletype )
            {
            // InternalPascal.g:8476:2: ( ruletype )
            // InternalPascal.g:8477:3: ruletype
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
    // InternalPascal.g:8486:1: rule__Variant_part__TagAssignment_1 : ( ruletag_field ) ;
    public final void rule__Variant_part__TagAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8490:1: ( ( ruletag_field ) )
            // InternalPascal.g:8491:2: ( ruletag_field )
            {
            // InternalPascal.g:8491:2: ( ruletag_field )
            // InternalPascal.g:8492:3: ruletag_field
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
    // InternalPascal.g:8501:1: rule__Variant_part__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Variant_part__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8505:1: ( ( RULE_ID ) )
            // InternalPascal.g:8506:2: ( RULE_ID )
            {
            // InternalPascal.g:8506:2: ( RULE_ID )
            // InternalPascal.g:8507:3: RULE_ID
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
    // InternalPascal.g:8516:1: rule__Variant_part__VariantsAssignment_4 : ( rulevariant ) ;
    public final void rule__Variant_part__VariantsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8520:1: ( ( rulevariant ) )
            // InternalPascal.g:8521:2: ( rulevariant )
            {
            // InternalPascal.g:8521:2: ( rulevariant )
            // InternalPascal.g:8522:3: rulevariant
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
    // InternalPascal.g:8531:1: rule__Variant_part__VariantsAssignment_5_1 : ( rulevariant ) ;
    public final void rule__Variant_part__VariantsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8535:1: ( ( rulevariant ) )
            // InternalPascal.g:8536:2: ( rulevariant )
            {
            // InternalPascal.g:8536:2: ( rulevariant )
            // InternalPascal.g:8537:3: rulevariant
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
    // InternalPascal.g:8546:1: rule__Tag_field__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Tag_field__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8550:1: ( ( RULE_ID ) )
            // InternalPascal.g:8551:2: ( RULE_ID )
            {
            // InternalPascal.g:8551:2: ( RULE_ID )
            // InternalPascal.g:8552:3: RULE_ID
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
    // InternalPascal.g:8561:1: rule__Variant__LabelsAssignment_0 : ( rulecase_label_list ) ;
    public final void rule__Variant__LabelsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8565:1: ( ( rulecase_label_list ) )
            // InternalPascal.g:8566:2: ( rulecase_label_list )
            {
            // InternalPascal.g:8566:2: ( rulecase_label_list )
            // InternalPascal.g:8567:3: rulecase_label_list
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
    // InternalPascal.g:8576:1: rule__Variant__FieldsAssignment_3 : ( rulefield_list ) ;
    public final void rule__Variant__FieldsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8580:1: ( ( rulefield_list ) )
            // InternalPascal.g:8581:2: ( rulefield_list )
            {
            // InternalPascal.g:8581:2: ( rulefield_list )
            // InternalPascal.g:8582:3: rulefield_list
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
    // InternalPascal.g:8591:1: rule__Case_label_list__ConstantsAssignment_0 : ( ruleconstant ) ;
    public final void rule__Case_label_list__ConstantsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8595:1: ( ( ruleconstant ) )
            // InternalPascal.g:8596:2: ( ruleconstant )
            {
            // InternalPascal.g:8596:2: ( ruleconstant )
            // InternalPascal.g:8597:3: ruleconstant
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
    // InternalPascal.g:8606:1: rule__Case_label_list__ConstantsAssignment_1_1 : ( ruleconstant ) ;
    public final void rule__Case_label_list__ConstantsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8610:1: ( ( ruleconstant ) )
            // InternalPascal.g:8611:2: ( ruleconstant )
            {
            // InternalPascal.g:8611:2: ( ruleconstant )
            // InternalPascal.g:8612:3: ruleconstant
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
    // InternalPascal.g:8621:1: rule__Pointer_type__TypeAssignment_1 : ( ruletype ) ;
    public final void rule__Pointer_type__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8625:1: ( ( ruletype ) )
            // InternalPascal.g:8626:2: ( ruletype )
            {
            // InternalPascal.g:8626:2: ( ruletype )
            // InternalPascal.g:8627:3: ruletype
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
    // InternalPascal.g:8636:1: rule__Signed_number__IntegerAssignment_0 : ( RULE_SIGNED_INTEGER_NUMBER ) ;
    public final void rule__Signed_number__IntegerAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8640:1: ( ( RULE_SIGNED_INTEGER_NUMBER ) )
            // InternalPascal.g:8641:2: ( RULE_SIGNED_INTEGER_NUMBER )
            {
            // InternalPascal.g:8641:2: ( RULE_SIGNED_INTEGER_NUMBER )
            // InternalPascal.g:8642:3: RULE_SIGNED_INTEGER_NUMBER
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
    // InternalPascal.g:8651:1: rule__Signed_number__RealAssignment_1 : ( RULE_SIGNED_REAL_NUMBER ) ;
    public final void rule__Signed_number__RealAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8655:1: ( ( RULE_SIGNED_REAL_NUMBER ) )
            // InternalPascal.g:8656:2: ( RULE_SIGNED_REAL_NUMBER )
            {
            // InternalPascal.g:8656:2: ( RULE_SIGNED_REAL_NUMBER )
            // InternalPascal.g:8657:3: RULE_SIGNED_REAL_NUMBER
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
    // InternalPascal.g:8666:1: rule__Unsigned_number__IntegerAssignment_0 : ( RULE_INTEGER_NUMBER ) ;
    public final void rule__Unsigned_number__IntegerAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8670:1: ( ( RULE_INTEGER_NUMBER ) )
            // InternalPascal.g:8671:2: ( RULE_INTEGER_NUMBER )
            {
            // InternalPascal.g:8671:2: ( RULE_INTEGER_NUMBER )
            // InternalPascal.g:8672:3: RULE_INTEGER_NUMBER
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
    // InternalPascal.g:8681:1: rule__Unsigned_number__RealAssignment_1 : ( RULE_REAL_NUMBER ) ;
    public final void rule__Unsigned_number__RealAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8685:1: ( ( RULE_REAL_NUMBER ) )
            // InternalPascal.g:8686:2: ( RULE_REAL_NUMBER )
            {
            // InternalPascal.g:8686:2: ( RULE_REAL_NUMBER )
            // InternalPascal.g:8687:3: RULE_REAL_NUMBER
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
    // InternalPascal.g:8696:1: rule__Variable_declaration_part__SectionsAssignment_1 : ( rulevariable_section ) ;
    public final void rule__Variable_declaration_part__SectionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8700:1: ( ( rulevariable_section ) )
            // InternalPascal.g:8701:2: ( rulevariable_section )
            {
            // InternalPascal.g:8701:2: ( rulevariable_section )
            // InternalPascal.g:8702:3: rulevariable_section
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
    // InternalPascal.g:8711:1: rule__Variable_declaration_part__SectionsAssignment_3_0 : ( rulevariable_section ) ;
    public final void rule__Variable_declaration_part__SectionsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8715:1: ( ( rulevariable_section ) )
            // InternalPascal.g:8716:2: ( rulevariable_section )
            {
            // InternalPascal.g:8716:2: ( rulevariable_section )
            // InternalPascal.g:8717:3: rulevariable_section
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
    // InternalPascal.g:8726:1: rule__Variable_section__IdentifiersAssignment_0 : ( rulevariable_identifier_list ) ;
    public final void rule__Variable_section__IdentifiersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8730:1: ( ( rulevariable_identifier_list ) )
            // InternalPascal.g:8731:2: ( rulevariable_identifier_list )
            {
            // InternalPascal.g:8731:2: ( rulevariable_identifier_list )
            // InternalPascal.g:8732:3: rulevariable_identifier_list
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
    // InternalPascal.g:8741:1: rule__Variable_section__TypeAssignment_2 : ( ruletype ) ;
    public final void rule__Variable_section__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8745:1: ( ( ruletype ) )
            // InternalPascal.g:8746:2: ( ruletype )
            {
            // InternalPascal.g:8746:2: ( ruletype )
            // InternalPascal.g:8747:3: ruletype
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
    // InternalPascal.g:8756:1: rule__Variable_identifier_list__NamesAssignment_0 : ( RULE_ID ) ;
    public final void rule__Variable_identifier_list__NamesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8760:1: ( ( RULE_ID ) )
            // InternalPascal.g:8761:2: ( RULE_ID )
            {
            // InternalPascal.g:8761:2: ( RULE_ID )
            // InternalPascal.g:8762:3: RULE_ID
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
    // InternalPascal.g:8771:1: rule__Variable_identifier_list__NamesAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Variable_identifier_list__NamesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8775:1: ( ( RULE_ID ) )
            // InternalPascal.g:8776:2: ( RULE_ID )
            {
            // InternalPascal.g:8776:2: ( RULE_ID )
            // InternalPascal.g:8777:3: RULE_ID
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000002F002000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x001C000A20003570L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000A0400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000210000000080L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000400000002140L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000400000002142L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0003800000000200L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0003800000000202L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x001C000E20003570L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000003000000010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000401000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x001C000A60003570L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000101000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000003070L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0018000000003570L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0078000280003D70L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0060000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000080004000010L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000080000000010L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000080400000010L});

}