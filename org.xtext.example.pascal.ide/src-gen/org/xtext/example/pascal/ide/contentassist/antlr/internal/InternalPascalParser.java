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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_SIGNED_INTEGER_NUMBER", "RULE_INTEGER_NUMBER", "RULE_RELATIONAL_OP", "RULE_ADDITION_OP", "RULE_MULTIPLICATION_OP", "RULE_STRING", "RULE_NUMERIC_SUBRANGE", "RULE_SIGNED_REAL_NUMBER", "RULE_REAL_NUMBER", "RULE_PARENTHESES_COMMENT", "RULE_CURLY_BRACKETS_COMMENT", "RULE_DIGIT_SEQUENCE", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'program'", "';'", "'begin'", "'end'", "':'", "':='", "'['", "']'", "'^'", "','", "'('", "')'", "'not'", "'function'", "'var'", "'procedure'", "'label'", "'const'", "'='", "'type'", "'..'", "'case'", "'of'", "'in'", "'or'", "'div'", "'mod'", "'and'", "'nil'", "'true'", "'false'", "'packed'", "'record'"
    };
    public static final int RULE_PARENTHESES_COMMENT=14;
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

                if ( (LA3_0==36||LA3_0==38) ) {
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


    // $ANTLR start "entryRulefunction_heading"
    // InternalPascal.g:536:1: entryRulefunction_heading : rulefunction_heading EOF ;
    public final void entryRulefunction_heading() throws RecognitionException {
        try {
            // InternalPascal.g:537:1: ( rulefunction_heading EOF )
            // InternalPascal.g:538:1: rulefunction_heading EOF
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
    // InternalPascal.g:545:1: rulefunction_heading : ( ( rule__Function_heading__Group__0 ) ) ;
    public final void rulefunction_heading() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:549:2: ( ( ( rule__Function_heading__Group__0 ) ) )
            // InternalPascal.g:550:2: ( ( rule__Function_heading__Group__0 ) )
            {
            // InternalPascal.g:550:2: ( ( rule__Function_heading__Group__0 ) )
            // InternalPascal.g:551:3: ( rule__Function_heading__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_headingAccess().getGroup()); 
            }
            // InternalPascal.g:552:3: ( rule__Function_heading__Group__0 )
            // InternalPascal.g:552:4: rule__Function_heading__Group__0
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
    // InternalPascal.g:561:1: entryRulefunction_declaration : rulefunction_declaration EOF ;
    public final void entryRulefunction_declaration() throws RecognitionException {
        try {
            // InternalPascal.g:562:1: ( rulefunction_declaration EOF )
            // InternalPascal.g:563:1: rulefunction_declaration EOF
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
    // InternalPascal.g:570:1: rulefunction_declaration : ( ( rule__Function_declaration__Group__0 ) ) ;
    public final void rulefunction_declaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:574:2: ( ( ( rule__Function_declaration__Group__0 ) ) )
            // InternalPascal.g:575:2: ( ( rule__Function_declaration__Group__0 ) )
            {
            // InternalPascal.g:575:2: ( ( rule__Function_declaration__Group__0 ) )
            // InternalPascal.g:576:3: ( rule__Function_declaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_declarationAccess().getGroup()); 
            }
            // InternalPascal.g:577:3: ( rule__Function_declaration__Group__0 )
            // InternalPascal.g:577:4: rule__Function_declaration__Group__0
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


    // $ANTLR start "entryRuleprocedure_declaration"
    // InternalPascal.g:736:1: entryRuleprocedure_declaration : ruleprocedure_declaration EOF ;
    public final void entryRuleprocedure_declaration() throws RecognitionException {
        try {
            // InternalPascal.g:737:1: ( ruleprocedure_declaration EOF )
            // InternalPascal.g:738:1: ruleprocedure_declaration EOF
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
    // InternalPascal.g:745:1: ruleprocedure_declaration : ( ( rule__Procedure_declaration__Group__0 ) ) ;
    public final void ruleprocedure_declaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:749:2: ( ( ( rule__Procedure_declaration__Group__0 ) ) )
            // InternalPascal.g:750:2: ( ( rule__Procedure_declaration__Group__0 ) )
            {
            // InternalPascal.g:750:2: ( ( rule__Procedure_declaration__Group__0 ) )
            // InternalPascal.g:751:3: ( rule__Procedure_declaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcedure_declarationAccess().getGroup()); 
            }
            // InternalPascal.g:752:3: ( rule__Procedure_declaration__Group__0 )
            // InternalPascal.g:752:4: rule__Procedure_declaration__Group__0
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
    // InternalPascal.g:761:1: entryRuleprocedure_heading : ruleprocedure_heading EOF ;
    public final void entryRuleprocedure_heading() throws RecognitionException {
        try {
            // InternalPascal.g:762:1: ( ruleprocedure_heading EOF )
            // InternalPascal.g:763:1: ruleprocedure_heading EOF
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
    // InternalPascal.g:770:1: ruleprocedure_heading : ( ( rule__Procedure_heading__Group__0 ) ) ;
    public final void ruleprocedure_heading() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:774:2: ( ( ( rule__Procedure_heading__Group__0 ) ) )
            // InternalPascal.g:775:2: ( ( rule__Procedure_heading__Group__0 ) )
            {
            // InternalPascal.g:775:2: ( ( rule__Procedure_heading__Group__0 ) )
            // InternalPascal.g:776:3: ( rule__Procedure_heading__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcedure_headingAccess().getGroup()); 
            }
            // InternalPascal.g:777:3: ( rule__Procedure_heading__Group__0 )
            // InternalPascal.g:777:4: rule__Procedure_heading__Group__0
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
    // InternalPascal.g:786:1: entryRuleset : ruleset EOF ;
    public final void entryRuleset() throws RecognitionException {
        try {
            // InternalPascal.g:787:1: ( ruleset EOF )
            // InternalPascal.g:788:1: ruleset EOF
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
    // InternalPascal.g:795:1: ruleset : ( ( rule__Set__Group__0 ) ) ;
    public final void ruleset() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:799:2: ( ( ( rule__Set__Group__0 ) ) )
            // InternalPascal.g:800:2: ( ( rule__Set__Group__0 ) )
            {
            // InternalPascal.g:800:2: ( ( rule__Set__Group__0 ) )
            // InternalPascal.g:801:3: ( rule__Set__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetAccess().getGroup()); 
            }
            // InternalPascal.g:802:3: ( rule__Set__Group__0 )
            // InternalPascal.g:802:4: rule__Set__Group__0
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
    // InternalPascal.g:811:1: entryRulenumber : rulenumber EOF ;
    public final void entryRulenumber() throws RecognitionException {
        try {
            // InternalPascal.g:812:1: ( rulenumber EOF )
            // InternalPascal.g:813:1: rulenumber EOF
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
    // InternalPascal.g:820:1: rulenumber : ( ( rule__Number__NumberAssignment ) ) ;
    public final void rulenumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:824:2: ( ( ( rule__Number__NumberAssignment ) ) )
            // InternalPascal.g:825:2: ( ( rule__Number__NumberAssignment ) )
            {
            // InternalPascal.g:825:2: ( ( rule__Number__NumberAssignment ) )
            // InternalPascal.g:826:3: ( rule__Number__NumberAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberAccess().getNumberAssignment()); 
            }
            // InternalPascal.g:827:3: ( rule__Number__NumberAssignment )
            // InternalPascal.g:827:4: rule__Number__NumberAssignment
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
    // InternalPascal.g:836:1: entryRuleany_number : ruleany_number EOF ;
    public final void entryRuleany_number() throws RecognitionException {
        try {
            // InternalPascal.g:837:1: ( ruleany_number EOF )
            // InternalPascal.g:838:1: ruleany_number EOF
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
    // InternalPascal.g:845:1: ruleany_number : ( ( rule__Any_number__Alternatives ) ) ;
    public final void ruleany_number() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:849:2: ( ( ( rule__Any_number__Alternatives ) ) )
            // InternalPascal.g:850:2: ( ( rule__Any_number__Alternatives ) )
            {
            // InternalPascal.g:850:2: ( ( rule__Any_number__Alternatives ) )
            // InternalPascal.g:851:3: ( rule__Any_number__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAny_numberAccess().getAlternatives()); 
            }
            // InternalPascal.g:852:3: ( rule__Any_number__Alternatives )
            // InternalPascal.g:852:4: rule__Any_number__Alternatives
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
    // InternalPascal.g:861:1: entryRulelabel_declaration : rulelabel_declaration EOF ;
    public final void entryRulelabel_declaration() throws RecognitionException {
        try {
            // InternalPascal.g:862:1: ( rulelabel_declaration EOF )
            // InternalPascal.g:863:1: rulelabel_declaration EOF
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
    // InternalPascal.g:870:1: rulelabel_declaration : ( ( rule__Label_declaration__Group__0 ) ) ;
    public final void rulelabel_declaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:874:2: ( ( ( rule__Label_declaration__Group__0 ) ) )
            // InternalPascal.g:875:2: ( ( rule__Label_declaration__Group__0 ) )
            {
            // InternalPascal.g:875:2: ( ( rule__Label_declaration__Group__0 ) )
            // InternalPascal.g:876:3: ( rule__Label_declaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabel_declarationAccess().getGroup()); 
            }
            // InternalPascal.g:877:3: ( rule__Label_declaration__Group__0 )
            // InternalPascal.g:877:4: rule__Label_declaration__Group__0
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
    // InternalPascal.g:886:1: entryRuleconstant : ruleconstant EOF ;
    public final void entryRuleconstant() throws RecognitionException {
        try {
            // InternalPascal.g:887:1: ( ruleconstant EOF )
            // InternalPascal.g:888:1: ruleconstant EOF
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
    // InternalPascal.g:895:1: ruleconstant : ( ( rule__Constant__Alternatives ) ) ;
    public final void ruleconstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:899:2: ( ( ( rule__Constant__Alternatives ) ) )
            // InternalPascal.g:900:2: ( ( rule__Constant__Alternatives ) )
            {
            // InternalPascal.g:900:2: ( ( rule__Constant__Alternatives ) )
            // InternalPascal.g:901:3: ( rule__Constant__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getAlternatives()); 
            }
            // InternalPascal.g:902:3: ( rule__Constant__Alternatives )
            // InternalPascal.g:902:4: rule__Constant__Alternatives
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
    // InternalPascal.g:911:1: entryRuleconstant_definition_part : ruleconstant_definition_part EOF ;
    public final void entryRuleconstant_definition_part() throws RecognitionException {
        try {
            // InternalPascal.g:912:1: ( ruleconstant_definition_part EOF )
            // InternalPascal.g:913:1: ruleconstant_definition_part EOF
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
    // InternalPascal.g:920:1: ruleconstant_definition_part : ( ( rule__Constant_definition_part__Group__0 ) ) ;
    public final void ruleconstant_definition_part() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:924:2: ( ( ( rule__Constant_definition_part__Group__0 ) ) )
            // InternalPascal.g:925:2: ( ( rule__Constant_definition_part__Group__0 ) )
            {
            // InternalPascal.g:925:2: ( ( rule__Constant_definition_part__Group__0 ) )
            // InternalPascal.g:926:3: ( rule__Constant_definition_part__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstant_definition_partAccess().getGroup()); 
            }
            // InternalPascal.g:927:3: ( rule__Constant_definition_part__Group__0 )
            // InternalPascal.g:927:4: rule__Constant_definition_part__Group__0
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
    // InternalPascal.g:936:1: entryRuleconstant_definition : ruleconstant_definition EOF ;
    public final void entryRuleconstant_definition() throws RecognitionException {
        try {
            // InternalPascal.g:937:1: ( ruleconstant_definition EOF )
            // InternalPascal.g:938:1: ruleconstant_definition EOF
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
    // InternalPascal.g:945:1: ruleconstant_definition : ( ( rule__Constant_definition__Group__0 ) ) ;
    public final void ruleconstant_definition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:949:2: ( ( ( rule__Constant_definition__Group__0 ) ) )
            // InternalPascal.g:950:2: ( ( rule__Constant_definition__Group__0 ) )
            {
            // InternalPascal.g:950:2: ( ( rule__Constant_definition__Group__0 ) )
            // InternalPascal.g:951:3: ( rule__Constant_definition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstant_definitionAccess().getGroup()); 
            }
            // InternalPascal.g:952:3: ( rule__Constant_definition__Group__0 )
            // InternalPascal.g:952:4: rule__Constant_definition__Group__0
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
    // InternalPascal.g:961:1: entryRuletype_definition_part : ruletype_definition_part EOF ;
    public final void entryRuletype_definition_part() throws RecognitionException {
        try {
            // InternalPascal.g:962:1: ( ruletype_definition_part EOF )
            // InternalPascal.g:963:1: ruletype_definition_part EOF
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
    // InternalPascal.g:970:1: ruletype_definition_part : ( ( rule__Type_definition_part__Group__0 ) ) ;
    public final void ruletype_definition_part() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:974:2: ( ( ( rule__Type_definition_part__Group__0 ) ) )
            // InternalPascal.g:975:2: ( ( rule__Type_definition_part__Group__0 ) )
            {
            // InternalPascal.g:975:2: ( ( rule__Type_definition_part__Group__0 ) )
            // InternalPascal.g:976:3: ( rule__Type_definition_part__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_definition_partAccess().getGroup()); 
            }
            // InternalPascal.g:977:3: ( rule__Type_definition_part__Group__0 )
            // InternalPascal.g:977:4: rule__Type_definition_part__Group__0
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
    // InternalPascal.g:986:1: entryRuletype_definition : ruletype_definition EOF ;
    public final void entryRuletype_definition() throws RecognitionException {
        try {
            // InternalPascal.g:987:1: ( ruletype_definition EOF )
            // InternalPascal.g:988:1: ruletype_definition EOF
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
    // InternalPascal.g:995:1: ruletype_definition : ( ( rule__Type_definition__Group__0 ) ) ;
    public final void ruletype_definition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:999:2: ( ( ( rule__Type_definition__Group__0 ) ) )
            // InternalPascal.g:1000:2: ( ( rule__Type_definition__Group__0 ) )
            {
            // InternalPascal.g:1000:2: ( ( rule__Type_definition__Group__0 ) )
            // InternalPascal.g:1001:3: ( rule__Type_definition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_definitionAccess().getGroup()); 
            }
            // InternalPascal.g:1002:3: ( rule__Type_definition__Group__0 )
            // InternalPascal.g:1002:4: rule__Type_definition__Group__0
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
    // InternalPascal.g:1011:1: entryRuletype : ruletype EOF ;
    public final void entryRuletype() throws RecognitionException {
        try {
            // InternalPascal.g:1012:1: ( ruletype EOF )
            // InternalPascal.g:1013:1: ruletype EOF
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
    // InternalPascal.g:1020:1: ruletype : ( ( rule__Type__Alternatives ) ) ;
    public final void ruletype() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1024:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalPascal.g:1025:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalPascal.g:1025:2: ( ( rule__Type__Alternatives ) )
            // InternalPascal.g:1026:3: ( rule__Type__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getAlternatives()); 
            }
            // InternalPascal.g:1027:3: ( rule__Type__Alternatives )
            // InternalPascal.g:1027:4: rule__Type__Alternatives
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
    // InternalPascal.g:1036:1: entryRulesimple_type : rulesimple_type EOF ;
    public final void entryRulesimple_type() throws RecognitionException {
        try {
            // InternalPascal.g:1037:1: ( rulesimple_type EOF )
            // InternalPascal.g:1038:1: rulesimple_type EOF
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
    // InternalPascal.g:1045:1: rulesimple_type : ( ( rule__Simple_type__Alternatives ) ) ;
    public final void rulesimple_type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1049:2: ( ( ( rule__Simple_type__Alternatives ) ) )
            // InternalPascal.g:1050:2: ( ( rule__Simple_type__Alternatives ) )
            {
            // InternalPascal.g:1050:2: ( ( rule__Simple_type__Alternatives ) )
            // InternalPascal.g:1051:3: ( rule__Simple_type__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimple_typeAccess().getAlternatives()); 
            }
            // InternalPascal.g:1052:3: ( rule__Simple_type__Alternatives )
            // InternalPascal.g:1052:4: rule__Simple_type__Alternatives
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
    // InternalPascal.g:1061:1: entryRulesubrange_type : rulesubrange_type EOF ;
    public final void entryRulesubrange_type() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalPascal.g:1065:1: ( rulesubrange_type EOF )
            // InternalPascal.g:1066:1: rulesubrange_type EOF
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
    // InternalPascal.g:1076:1: rulesubrange_type : ( ( rule__Subrange_type__Alternatives ) ) ;
    public final void rulesubrange_type() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1081:2: ( ( ( rule__Subrange_type__Alternatives ) ) )
            // InternalPascal.g:1082:2: ( ( rule__Subrange_type__Alternatives ) )
            {
            // InternalPascal.g:1082:2: ( ( rule__Subrange_type__Alternatives ) )
            // InternalPascal.g:1083:3: ( rule__Subrange_type__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubrange_typeAccess().getAlternatives()); 
            }
            // InternalPascal.g:1084:3: ( rule__Subrange_type__Alternatives )
            // InternalPascal.g:1084:4: rule__Subrange_type__Alternatives
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
    // InternalPascal.g:1094:1: entryRuleenumerated_type : ruleenumerated_type EOF ;
    public final void entryRuleenumerated_type() throws RecognitionException {
        try {
            // InternalPascal.g:1095:1: ( ruleenumerated_type EOF )
            // InternalPascal.g:1096:1: ruleenumerated_type EOF
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
    // InternalPascal.g:1103:1: ruleenumerated_type : ( ( rule__Enumerated_type__Group__0 ) ) ;
    public final void ruleenumerated_type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1107:2: ( ( ( rule__Enumerated_type__Group__0 ) ) )
            // InternalPascal.g:1108:2: ( ( rule__Enumerated_type__Group__0 ) )
            {
            // InternalPascal.g:1108:2: ( ( rule__Enumerated_type__Group__0 ) )
            // InternalPascal.g:1109:3: ( rule__Enumerated_type__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerated_typeAccess().getGroup()); 
            }
            // InternalPascal.g:1110:3: ( rule__Enumerated_type__Group__0 )
            // InternalPascal.g:1110:4: rule__Enumerated_type__Group__0
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
    // InternalPascal.g:1119:1: entryRulestructured_type : rulestructured_type EOF ;
    public final void entryRulestructured_type() throws RecognitionException {
        try {
            // InternalPascal.g:1120:1: ( rulestructured_type EOF )
            // InternalPascal.g:1121:1: rulestructured_type EOF
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
    // InternalPascal.g:1128:1: rulestructured_type : ( ( rule__Structured_type__Group__0 ) ) ;
    public final void rulestructured_type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1132:2: ( ( ( rule__Structured_type__Group__0 ) ) )
            // InternalPascal.g:1133:2: ( ( rule__Structured_type__Group__0 ) )
            {
            // InternalPascal.g:1133:2: ( ( rule__Structured_type__Group__0 ) )
            // InternalPascal.g:1134:3: ( rule__Structured_type__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStructured_typeAccess().getGroup()); 
            }
            // InternalPascal.g:1135:3: ( rule__Structured_type__Group__0 )
            // InternalPascal.g:1135:4: rule__Structured_type__Group__0
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
    // InternalPascal.g:1144:1: entryRuleunpacked_structured_type : ruleunpacked_structured_type EOF ;
    public final void entryRuleunpacked_structured_type() throws RecognitionException {
        try {
            // InternalPascal.g:1145:1: ( ruleunpacked_structured_type EOF )
            // InternalPascal.g:1146:1: ruleunpacked_structured_type EOF
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
    // InternalPascal.g:1153:1: ruleunpacked_structured_type : ( ( rule__Unpacked_structured_type__RecordAssignment ) ) ;
    public final void ruleunpacked_structured_type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1157:2: ( ( ( rule__Unpacked_structured_type__RecordAssignment ) ) )
            // InternalPascal.g:1158:2: ( ( rule__Unpacked_structured_type__RecordAssignment ) )
            {
            // InternalPascal.g:1158:2: ( ( rule__Unpacked_structured_type__RecordAssignment ) )
            // InternalPascal.g:1159:3: ( rule__Unpacked_structured_type__RecordAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnpacked_structured_typeAccess().getRecordAssignment()); 
            }
            // InternalPascal.g:1160:3: ( rule__Unpacked_structured_type__RecordAssignment )
            // InternalPascal.g:1160:4: rule__Unpacked_structured_type__RecordAssignment
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
    // InternalPascal.g:1169:1: entryRulerecord_type : rulerecord_type EOF ;
    public final void entryRulerecord_type() throws RecognitionException {
        try {
            // InternalPascal.g:1170:1: ( rulerecord_type EOF )
            // InternalPascal.g:1171:1: rulerecord_type EOF
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
    // InternalPascal.g:1178:1: rulerecord_type : ( ( rule__Record_type__Group__0 ) ) ;
    public final void rulerecord_type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1182:2: ( ( ( rule__Record_type__Group__0 ) ) )
            // InternalPascal.g:1183:2: ( ( rule__Record_type__Group__0 ) )
            {
            // InternalPascal.g:1183:2: ( ( rule__Record_type__Group__0 ) )
            // InternalPascal.g:1184:3: ( rule__Record_type__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecord_typeAccess().getGroup()); 
            }
            // InternalPascal.g:1185:3: ( rule__Record_type__Group__0 )
            // InternalPascal.g:1185:4: rule__Record_type__Group__0
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
    // InternalPascal.g:1194:1: entryRulefield_list : rulefield_list EOF ;
    public final void entryRulefield_list() throws RecognitionException {
        try {
            // InternalPascal.g:1195:1: ( rulefield_list EOF )
            // InternalPascal.g:1196:1: rulefield_list EOF
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
    // InternalPascal.g:1203:1: rulefield_list : ( ( rule__Field_list__Group__0 ) ) ;
    public final void rulefield_list() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1207:2: ( ( ( rule__Field_list__Group__0 ) ) )
            // InternalPascal.g:1208:2: ( ( rule__Field_list__Group__0 ) )
            {
            // InternalPascal.g:1208:2: ( ( rule__Field_list__Group__0 ) )
            // InternalPascal.g:1209:3: ( rule__Field_list__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_listAccess().getGroup()); 
            }
            // InternalPascal.g:1210:3: ( rule__Field_list__Group__0 )
            // InternalPascal.g:1210:4: rule__Field_list__Group__0
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
    // InternalPascal.g:1219:1: entryRulefixed_part : rulefixed_part EOF ;
    public final void entryRulefixed_part() throws RecognitionException {
        try {
            // InternalPascal.g:1220:1: ( rulefixed_part EOF )
            // InternalPascal.g:1221:1: rulefixed_part EOF
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
    // InternalPascal.g:1228:1: rulefixed_part : ( ( rule__Fixed_part__Group__0 ) ) ;
    public final void rulefixed_part() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1232:2: ( ( ( rule__Fixed_part__Group__0 ) ) )
            // InternalPascal.g:1233:2: ( ( rule__Fixed_part__Group__0 ) )
            {
            // InternalPascal.g:1233:2: ( ( rule__Fixed_part__Group__0 ) )
            // InternalPascal.g:1234:3: ( rule__Fixed_part__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFixed_partAccess().getGroup()); 
            }
            // InternalPascal.g:1235:3: ( rule__Fixed_part__Group__0 )
            // InternalPascal.g:1235:4: rule__Fixed_part__Group__0
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
    // InternalPascal.g:1244:1: entryRulerecord_section : rulerecord_section EOF ;
    public final void entryRulerecord_section() throws RecognitionException {
        try {
            // InternalPascal.g:1245:1: ( rulerecord_section EOF )
            // InternalPascal.g:1246:1: rulerecord_section EOF
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
    // InternalPascal.g:1253:1: rulerecord_section : ( ( rule__Record_section__Group__0 ) ) ;
    public final void rulerecord_section() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1257:2: ( ( ( rule__Record_section__Group__0 ) ) )
            // InternalPascal.g:1258:2: ( ( rule__Record_section__Group__0 ) )
            {
            // InternalPascal.g:1258:2: ( ( rule__Record_section__Group__0 ) )
            // InternalPascal.g:1259:3: ( rule__Record_section__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecord_sectionAccess().getGroup()); 
            }
            // InternalPascal.g:1260:3: ( rule__Record_section__Group__0 )
            // InternalPascal.g:1260:4: rule__Record_section__Group__0
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
    // InternalPascal.g:1269:1: entryRulevariant_part : rulevariant_part EOF ;
    public final void entryRulevariant_part() throws RecognitionException {
        try {
            // InternalPascal.g:1270:1: ( rulevariant_part EOF )
            // InternalPascal.g:1271:1: rulevariant_part EOF
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
    // InternalPascal.g:1278:1: rulevariant_part : ( ( rule__Variant_part__Group__0 ) ) ;
    public final void rulevariant_part() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1282:2: ( ( ( rule__Variant_part__Group__0 ) ) )
            // InternalPascal.g:1283:2: ( ( rule__Variant_part__Group__0 ) )
            {
            // InternalPascal.g:1283:2: ( ( rule__Variant_part__Group__0 ) )
            // InternalPascal.g:1284:3: ( rule__Variant_part__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariant_partAccess().getGroup()); 
            }
            // InternalPascal.g:1285:3: ( rule__Variant_part__Group__0 )
            // InternalPascal.g:1285:4: rule__Variant_part__Group__0
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
    // InternalPascal.g:1294:1: entryRuletag_field : ruletag_field EOF ;
    public final void entryRuletag_field() throws RecognitionException {
        try {
            // InternalPascal.g:1295:1: ( ruletag_field EOF )
            // InternalPascal.g:1296:1: ruletag_field EOF
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
    // InternalPascal.g:1303:1: ruletag_field : ( ( rule__Tag_field__Group__0 ) ) ;
    public final void ruletag_field() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1307:2: ( ( ( rule__Tag_field__Group__0 ) ) )
            // InternalPascal.g:1308:2: ( ( rule__Tag_field__Group__0 ) )
            {
            // InternalPascal.g:1308:2: ( ( rule__Tag_field__Group__0 ) )
            // InternalPascal.g:1309:3: ( rule__Tag_field__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTag_fieldAccess().getGroup()); 
            }
            // InternalPascal.g:1310:3: ( rule__Tag_field__Group__0 )
            // InternalPascal.g:1310:4: rule__Tag_field__Group__0
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
    // InternalPascal.g:1319:1: entryRulevariant : rulevariant EOF ;
    public final void entryRulevariant() throws RecognitionException {
        try {
            // InternalPascal.g:1320:1: ( rulevariant EOF )
            // InternalPascal.g:1321:1: rulevariant EOF
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
    // InternalPascal.g:1328:1: rulevariant : ( ( rule__Variant__Group__0 ) ) ;
    public final void rulevariant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1332:2: ( ( ( rule__Variant__Group__0 ) ) )
            // InternalPascal.g:1333:2: ( ( rule__Variant__Group__0 ) )
            {
            // InternalPascal.g:1333:2: ( ( rule__Variant__Group__0 ) )
            // InternalPascal.g:1334:3: ( rule__Variant__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariantAccess().getGroup()); 
            }
            // InternalPascal.g:1335:3: ( rule__Variant__Group__0 )
            // InternalPascal.g:1335:4: rule__Variant__Group__0
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
    // InternalPascal.g:1344:1: entryRulecase_label_list : rulecase_label_list EOF ;
    public final void entryRulecase_label_list() throws RecognitionException {
        try {
            // InternalPascal.g:1345:1: ( rulecase_label_list EOF )
            // InternalPascal.g:1346:1: rulecase_label_list EOF
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
    // InternalPascal.g:1353:1: rulecase_label_list : ( ( rule__Case_label_list__Group__0 ) ) ;
    public final void rulecase_label_list() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1357:2: ( ( ( rule__Case_label_list__Group__0 ) ) )
            // InternalPascal.g:1358:2: ( ( rule__Case_label_list__Group__0 ) )
            {
            // InternalPascal.g:1358:2: ( ( rule__Case_label_list__Group__0 ) )
            // InternalPascal.g:1359:3: ( rule__Case_label_list__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCase_label_listAccess().getGroup()); 
            }
            // InternalPascal.g:1360:3: ( rule__Case_label_list__Group__0 )
            // InternalPascal.g:1360:4: rule__Case_label_list__Group__0
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
    // InternalPascal.g:1369:1: entryRulepointer_type : rulepointer_type EOF ;
    public final void entryRulepointer_type() throws RecognitionException {
        try {
            // InternalPascal.g:1370:1: ( rulepointer_type EOF )
            // InternalPascal.g:1371:1: rulepointer_type EOF
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
    // InternalPascal.g:1378:1: rulepointer_type : ( ( rule__Pointer_type__Group__0 ) ) ;
    public final void rulepointer_type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1382:2: ( ( ( rule__Pointer_type__Group__0 ) ) )
            // InternalPascal.g:1383:2: ( ( rule__Pointer_type__Group__0 ) )
            {
            // InternalPascal.g:1383:2: ( ( rule__Pointer_type__Group__0 ) )
            // InternalPascal.g:1384:3: ( rule__Pointer_type__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointer_typeAccess().getGroup()); 
            }
            // InternalPascal.g:1385:3: ( rule__Pointer_type__Group__0 )
            // InternalPascal.g:1385:4: rule__Pointer_type__Group__0
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
    // InternalPascal.g:1394:1: entryRulesigned_number : rulesigned_number EOF ;
    public final void entryRulesigned_number() throws RecognitionException {
        try {
            // InternalPascal.g:1395:1: ( rulesigned_number EOF )
            // InternalPascal.g:1396:1: rulesigned_number EOF
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
    // InternalPascal.g:1403:1: rulesigned_number : ( ( rule__Signed_number__Alternatives ) ) ;
    public final void rulesigned_number() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1407:2: ( ( ( rule__Signed_number__Alternatives ) ) )
            // InternalPascal.g:1408:2: ( ( rule__Signed_number__Alternatives ) )
            {
            // InternalPascal.g:1408:2: ( ( rule__Signed_number__Alternatives ) )
            // InternalPascal.g:1409:3: ( rule__Signed_number__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSigned_numberAccess().getAlternatives()); 
            }
            // InternalPascal.g:1410:3: ( rule__Signed_number__Alternatives )
            // InternalPascal.g:1410:4: rule__Signed_number__Alternatives
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
    // InternalPascal.g:1419:1: entryRuleunsigned_number : ruleunsigned_number EOF ;
    public final void entryRuleunsigned_number() throws RecognitionException {
        try {
            // InternalPascal.g:1420:1: ( ruleunsigned_number EOF )
            // InternalPascal.g:1421:1: ruleunsigned_number EOF
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
    // InternalPascal.g:1428:1: ruleunsigned_number : ( ( rule__Unsigned_number__Alternatives ) ) ;
    public final void ruleunsigned_number() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1432:2: ( ( ( rule__Unsigned_number__Alternatives ) ) )
            // InternalPascal.g:1433:2: ( ( rule__Unsigned_number__Alternatives ) )
            {
            // InternalPascal.g:1433:2: ( ( rule__Unsigned_number__Alternatives ) )
            // InternalPascal.g:1434:3: ( rule__Unsigned_number__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnsigned_numberAccess().getAlternatives()); 
            }
            // InternalPascal.g:1435:3: ( rule__Unsigned_number__Alternatives )
            // InternalPascal.g:1435:4: rule__Unsigned_number__Alternatives
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
    // InternalPascal.g:1444:1: entryRulevariable_declaration_part : rulevariable_declaration_part EOF ;
    public final void entryRulevariable_declaration_part() throws RecognitionException {
        try {
            // InternalPascal.g:1445:1: ( rulevariable_declaration_part EOF )
            // InternalPascal.g:1446:1: rulevariable_declaration_part EOF
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
    // InternalPascal.g:1453:1: rulevariable_declaration_part : ( ( rule__Variable_declaration_part__Group__0 ) ) ;
    public final void rulevariable_declaration_part() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1457:2: ( ( ( rule__Variable_declaration_part__Group__0 ) ) )
            // InternalPascal.g:1458:2: ( ( rule__Variable_declaration_part__Group__0 ) )
            {
            // InternalPascal.g:1458:2: ( ( rule__Variable_declaration_part__Group__0 ) )
            // InternalPascal.g:1459:3: ( rule__Variable_declaration_part__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declaration_partAccess().getGroup()); 
            }
            // InternalPascal.g:1460:3: ( rule__Variable_declaration_part__Group__0 )
            // InternalPascal.g:1460:4: rule__Variable_declaration_part__Group__0
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
    // InternalPascal.g:1469:1: entryRulevariable_section : rulevariable_section EOF ;
    public final void entryRulevariable_section() throws RecognitionException {
        try {
            // InternalPascal.g:1470:1: ( rulevariable_section EOF )
            // InternalPascal.g:1471:1: rulevariable_section EOF
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
    // InternalPascal.g:1478:1: rulevariable_section : ( ( rule__Variable_section__Group__0 ) ) ;
    public final void rulevariable_section() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1482:2: ( ( ( rule__Variable_section__Group__0 ) ) )
            // InternalPascal.g:1483:2: ( ( rule__Variable_section__Group__0 ) )
            {
            // InternalPascal.g:1483:2: ( ( rule__Variable_section__Group__0 ) )
            // InternalPascal.g:1484:3: ( rule__Variable_section__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_sectionAccess().getGroup()); 
            }
            // InternalPascal.g:1485:3: ( rule__Variable_section__Group__0 )
            // InternalPascal.g:1485:4: rule__Variable_section__Group__0
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
    // InternalPascal.g:1494:1: entryRulevariable_identifier_list : rulevariable_identifier_list EOF ;
    public final void entryRulevariable_identifier_list() throws RecognitionException {
        try {
            // InternalPascal.g:1495:1: ( rulevariable_identifier_list EOF )
            // InternalPascal.g:1496:1: rulevariable_identifier_list EOF
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
    // InternalPascal.g:1503:1: rulevariable_identifier_list : ( ( rule__Variable_identifier_list__Group__0 ) ) ;
    public final void rulevariable_identifier_list() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1507:2: ( ( ( rule__Variable_identifier_list__Group__0 ) ) )
            // InternalPascal.g:1508:2: ( ( rule__Variable_identifier_list__Group__0 ) )
            {
            // InternalPascal.g:1508:2: ( ( rule__Variable_identifier_list__Group__0 ) )
            // InternalPascal.g:1509:3: ( rule__Variable_identifier_list__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_identifier_listAccess().getGroup()); 
            }
            // InternalPascal.g:1510:3: ( rule__Variable_identifier_list__Group__0 )
            // InternalPascal.g:1510:4: rule__Variable_identifier_list__Group__0
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
    // InternalPascal.g:1518:1: rule__Simple_statement__Alternatives : ( ( ( rule__Simple_statement__AssignmentAssignment_0 ) ) | ( ( rule__Simple_statement__FunctionAssignment_1 ) ) | ( ( rule__Simple_statement__Function_noargsAssignment_2 ) ) );
    public final void rule__Simple_statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1522:1: ( ( ( rule__Simple_statement__AssignmentAssignment_0 ) ) | ( ( rule__Simple_statement__FunctionAssignment_1 ) ) | ( ( rule__Simple_statement__Function_noargsAssignment_2 ) ) )
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
                case EOF:
                case 24:
                case 26:
                    {
                    alt4=3;
                    }
                    break;
                case 33:
                    {
                    alt4=2;
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
                    // InternalPascal.g:1523:2: ( ( rule__Simple_statement__AssignmentAssignment_0 ) )
                    {
                    // InternalPascal.g:1523:2: ( ( rule__Simple_statement__AssignmentAssignment_0 ) )
                    // InternalPascal.g:1524:3: ( rule__Simple_statement__AssignmentAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimple_statementAccess().getAssignmentAssignment_0()); 
                    }
                    // InternalPascal.g:1525:3: ( rule__Simple_statement__AssignmentAssignment_0 )
                    // InternalPascal.g:1525:4: rule__Simple_statement__AssignmentAssignment_0
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
                    // InternalPascal.g:1529:2: ( ( rule__Simple_statement__FunctionAssignment_1 ) )
                    {
                    // InternalPascal.g:1529:2: ( ( rule__Simple_statement__FunctionAssignment_1 ) )
                    // InternalPascal.g:1530:3: ( rule__Simple_statement__FunctionAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimple_statementAccess().getFunctionAssignment_1()); 
                    }
                    // InternalPascal.g:1531:3: ( rule__Simple_statement__FunctionAssignment_1 )
                    // InternalPascal.g:1531:4: rule__Simple_statement__FunctionAssignment_1
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
                    // InternalPascal.g:1535:2: ( ( rule__Simple_statement__Function_noargsAssignment_2 ) )
                    {
                    // InternalPascal.g:1535:2: ( ( rule__Simple_statement__Function_noargsAssignment_2 ) )
                    // InternalPascal.g:1536:3: ( rule__Simple_statement__Function_noargsAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimple_statementAccess().getFunction_noargsAssignment_2()); 
                    }
                    // InternalPascal.g:1537:3: ( rule__Simple_statement__Function_noargsAssignment_2 )
                    // InternalPascal.g:1537:4: rule__Simple_statement__Function_noargsAssignment_2
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
    // InternalPascal.g:1545:1: rule__Label__Alternatives : ( ( ( rule__Label__NumberAssignment_0 ) ) | ( ( rule__Label__NumberAssignment_1 ) ) );
    public final void rule__Label__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1549:1: ( ( ( rule__Label__NumberAssignment_0 ) ) | ( ( rule__Label__NumberAssignment_1 ) ) )
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
                    // InternalPascal.g:1550:2: ( ( rule__Label__NumberAssignment_0 ) )
                    {
                    // InternalPascal.g:1550:2: ( ( rule__Label__NumberAssignment_0 ) )
                    // InternalPascal.g:1551:3: ( rule__Label__NumberAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLabelAccess().getNumberAssignment_0()); 
                    }
                    // InternalPascal.g:1552:3: ( rule__Label__NumberAssignment_0 )
                    // InternalPascal.g:1552:4: rule__Label__NumberAssignment_0
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
                    // InternalPascal.g:1556:2: ( ( rule__Label__NumberAssignment_1 ) )
                    {
                    // InternalPascal.g:1556:2: ( ( rule__Label__NumberAssignment_1 ) )
                    // InternalPascal.g:1557:3: ( rule__Label__NumberAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLabelAccess().getNumberAssignment_1()); 
                    }
                    // InternalPascal.g:1558:3: ( rule__Label__NumberAssignment_1 )
                    // InternalPascal.g:1558:4: rule__Label__NumberAssignment_1
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
    // InternalPascal.g:1566:1: rule__Var___Alternatives : ( ( ( rule__Var___Group_0__0 ) ) | ( ( rule__Var___Group_1__0 ) ) | ( ( rule__Var___Group_2__0 ) ) );
    public final void rule__Var___Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1570:1: ( ( ( rule__Var___Group_0__0 ) ) | ( ( rule__Var___Group_1__0 ) ) | ( ( rule__Var___Group_2__0 ) ) )
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
                    // InternalPascal.g:1571:2: ( ( rule__Var___Group_0__0 ) )
                    {
                    // InternalPascal.g:1571:2: ( ( rule__Var___Group_0__0 ) )
                    // InternalPascal.g:1572:3: ( rule__Var___Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVar_Access().getGroup_0()); 
                    }
                    // InternalPascal.g:1573:3: ( rule__Var___Group_0__0 )
                    // InternalPascal.g:1573:4: rule__Var___Group_0__0
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
                    // InternalPascal.g:1577:2: ( ( rule__Var___Group_1__0 ) )
                    {
                    // InternalPascal.g:1577:2: ( ( rule__Var___Group_1__0 ) )
                    // InternalPascal.g:1578:3: ( rule__Var___Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVar_Access().getGroup_1()); 
                    }
                    // InternalPascal.g:1579:3: ( rule__Var___Group_1__0 )
                    // InternalPascal.g:1579:4: rule__Var___Group_1__0
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
                    // InternalPascal.g:1583:2: ( ( rule__Var___Group_2__0 ) )
                    {
                    // InternalPascal.g:1583:2: ( ( rule__Var___Group_2__0 ) )
                    // InternalPascal.g:1584:3: ( rule__Var___Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVar_Access().getGroup_2()); 
                    }
                    // InternalPascal.g:1585:3: ( rule__Var___Group_2__0 )
                    // InternalPascal.g:1585:4: rule__Var___Group_2__0
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
    // InternalPascal.g:1593:1: rule__Expression__Alternatives_1_0 : ( ( ( rule__Expression__OperatorsAssignment_1_0_0 ) ) | ( ( rule__Expression__OperatorsAssignment_1_0_1 ) ) | ( ( rule__Expression__OperatorsAssignment_1_0_2 ) ) );
    public final void rule__Expression__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1597:1: ( ( ( rule__Expression__OperatorsAssignment_1_0_0 ) ) | ( ( rule__Expression__OperatorsAssignment_1_0_1 ) ) | ( ( rule__Expression__OperatorsAssignment_1_0_2 ) ) )
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
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalPascal.g:1598:2: ( ( rule__Expression__OperatorsAssignment_1_0_0 ) )
                    {
                    // InternalPascal.g:1598:2: ( ( rule__Expression__OperatorsAssignment_1_0_0 ) )
                    // InternalPascal.g:1599:3: ( rule__Expression__OperatorsAssignment_1_0_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getOperatorsAssignment_1_0_0()); 
                    }
                    // InternalPascal.g:1600:3: ( rule__Expression__OperatorsAssignment_1_0_0 )
                    // InternalPascal.g:1600:4: rule__Expression__OperatorsAssignment_1_0_0
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
                    // InternalPascal.g:1604:2: ( ( rule__Expression__OperatorsAssignment_1_0_1 ) )
                    {
                    // InternalPascal.g:1604:2: ( ( rule__Expression__OperatorsAssignment_1_0_1 ) )
                    // InternalPascal.g:1605:3: ( rule__Expression__OperatorsAssignment_1_0_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getOperatorsAssignment_1_0_1()); 
                    }
                    // InternalPascal.g:1606:3: ( rule__Expression__OperatorsAssignment_1_0_1 )
                    // InternalPascal.g:1606:4: rule__Expression__OperatorsAssignment_1_0_1
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
                    // InternalPascal.g:1610:2: ( ( rule__Expression__OperatorsAssignment_1_0_2 ) )
                    {
                    // InternalPascal.g:1610:2: ( ( rule__Expression__OperatorsAssignment_1_0_2 ) )
                    // InternalPascal.g:1611:3: ( rule__Expression__OperatorsAssignment_1_0_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getOperatorsAssignment_1_0_2()); 
                    }
                    // InternalPascal.g:1612:3: ( rule__Expression__OperatorsAssignment_1_0_2 )
                    // InternalPascal.g:1612:4: rule__Expression__OperatorsAssignment_1_0_2
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
    // InternalPascal.g:1620:1: rule__Simple_expression__Alternatives_2 : ( ( ( rule__Simple_expression__Group_2_0__0 ) ) | ( ( rule__Simple_expression__TermsAssignment_2_1 ) ) );
    public final void rule__Simple_expression__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1624:1: ( ( ( rule__Simple_expression__Group_2_0__0 ) ) | ( ( rule__Simple_expression__TermsAssignment_2_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ADDITION_OP||LA8_0==47) ) {
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
                    // InternalPascal.g:1625:2: ( ( rule__Simple_expression__Group_2_0__0 ) )
                    {
                    // InternalPascal.g:1625:2: ( ( rule__Simple_expression__Group_2_0__0 ) )
                    // InternalPascal.g:1626:3: ( rule__Simple_expression__Group_2_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimple_expressionAccess().getGroup_2_0()); 
                    }
                    // InternalPascal.g:1627:3: ( rule__Simple_expression__Group_2_0__0 )
                    // InternalPascal.g:1627:4: rule__Simple_expression__Group_2_0__0
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
                    // InternalPascal.g:1631:2: ( ( rule__Simple_expression__TermsAssignment_2_1 ) )
                    {
                    // InternalPascal.g:1631:2: ( ( rule__Simple_expression__TermsAssignment_2_1 ) )
                    // InternalPascal.g:1632:3: ( rule__Simple_expression__TermsAssignment_2_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimple_expressionAccess().getTermsAssignment_2_1()); 
                    }
                    // InternalPascal.g:1633:3: ( rule__Simple_expression__TermsAssignment_2_1 )
                    // InternalPascal.g:1633:4: rule__Simple_expression__TermsAssignment_2_1
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
    // InternalPascal.g:1641:1: rule__Simple_expression__Alternatives_2_0_0 : ( ( ( rule__Simple_expression__OperatorsAssignment_2_0_0_0 ) ) | ( ( rule__Simple_expression__OperatorsAssignment_2_0_0_1 ) ) );
    public final void rule__Simple_expression__Alternatives_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1645:1: ( ( ( rule__Simple_expression__OperatorsAssignment_2_0_0_0 ) ) | ( ( rule__Simple_expression__OperatorsAssignment_2_0_0_1 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ADDITION_OP) ) {
                alt9=1;
            }
            else if ( (LA9_0==47) ) {
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
                    // InternalPascal.g:1646:2: ( ( rule__Simple_expression__OperatorsAssignment_2_0_0_0 ) )
                    {
                    // InternalPascal.g:1646:2: ( ( rule__Simple_expression__OperatorsAssignment_2_0_0_0 ) )
                    // InternalPascal.g:1647:3: ( rule__Simple_expression__OperatorsAssignment_2_0_0_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimple_expressionAccess().getOperatorsAssignment_2_0_0_0()); 
                    }
                    // InternalPascal.g:1648:3: ( rule__Simple_expression__OperatorsAssignment_2_0_0_0 )
                    // InternalPascal.g:1648:4: rule__Simple_expression__OperatorsAssignment_2_0_0_0
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
                    // InternalPascal.g:1652:2: ( ( rule__Simple_expression__OperatorsAssignment_2_0_0_1 ) )
                    {
                    // InternalPascal.g:1652:2: ( ( rule__Simple_expression__OperatorsAssignment_2_0_0_1 ) )
                    // InternalPascal.g:1653:3: ( rule__Simple_expression__OperatorsAssignment_2_0_0_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimple_expressionAccess().getOperatorsAssignment_2_0_0_1()); 
                    }
                    // InternalPascal.g:1654:3: ( rule__Simple_expression__OperatorsAssignment_2_0_0_1 )
                    // InternalPascal.g:1654:4: rule__Simple_expression__OperatorsAssignment_2_0_0_1
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
    // InternalPascal.g:1662:1: rule__Term__Alternatives_1_0 : ( ( ( rule__Term__OperatorsAssignment_1_0_0 ) ) | ( ( rule__Term__OperatorsAssignment_1_0_1 ) ) | ( ( rule__Term__OperatorsAssignment_1_0_2 ) ) | ( ( rule__Term__OperatorsAssignment_1_0_3 ) ) );
    public final void rule__Term__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1666:1: ( ( ( rule__Term__OperatorsAssignment_1_0_0 ) ) | ( ( rule__Term__OperatorsAssignment_1_0_1 ) ) | ( ( rule__Term__OperatorsAssignment_1_0_2 ) ) | ( ( rule__Term__OperatorsAssignment_1_0_3 ) ) )
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
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalPascal.g:1667:2: ( ( rule__Term__OperatorsAssignment_1_0_0 ) )
                    {
                    // InternalPascal.g:1667:2: ( ( rule__Term__OperatorsAssignment_1_0_0 ) )
                    // InternalPascal.g:1668:3: ( rule__Term__OperatorsAssignment_1_0_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTermAccess().getOperatorsAssignment_1_0_0()); 
                    }
                    // InternalPascal.g:1669:3: ( rule__Term__OperatorsAssignment_1_0_0 )
                    // InternalPascal.g:1669:4: rule__Term__OperatorsAssignment_1_0_0
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
                    // InternalPascal.g:1673:2: ( ( rule__Term__OperatorsAssignment_1_0_1 ) )
                    {
                    // InternalPascal.g:1673:2: ( ( rule__Term__OperatorsAssignment_1_0_1 ) )
                    // InternalPascal.g:1674:3: ( rule__Term__OperatorsAssignment_1_0_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTermAccess().getOperatorsAssignment_1_0_1()); 
                    }
                    // InternalPascal.g:1675:3: ( rule__Term__OperatorsAssignment_1_0_1 )
                    // InternalPascal.g:1675:4: rule__Term__OperatorsAssignment_1_0_1
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
                    // InternalPascal.g:1679:2: ( ( rule__Term__OperatorsAssignment_1_0_2 ) )
                    {
                    // InternalPascal.g:1679:2: ( ( rule__Term__OperatorsAssignment_1_0_2 ) )
                    // InternalPascal.g:1680:3: ( rule__Term__OperatorsAssignment_1_0_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTermAccess().getOperatorsAssignment_1_0_2()); 
                    }
                    // InternalPascal.g:1681:3: ( rule__Term__OperatorsAssignment_1_0_2 )
                    // InternalPascal.g:1681:4: rule__Term__OperatorsAssignment_1_0_2
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
                    // InternalPascal.g:1685:2: ( ( rule__Term__OperatorsAssignment_1_0_3 ) )
                    {
                    // InternalPascal.g:1685:2: ( ( rule__Term__OperatorsAssignment_1_0_3 ) )
                    // InternalPascal.g:1686:3: ( rule__Term__OperatorsAssignment_1_0_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTermAccess().getOperatorsAssignment_1_0_3()); 
                    }
                    // InternalPascal.g:1687:3: ( rule__Term__OperatorsAssignment_1_0_3 )
                    // InternalPascal.g:1687:4: rule__Term__OperatorsAssignment_1_0_3
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
    // InternalPascal.g:1695:1: rule__Factor__Alternatives : ( ( ( rule__Factor__VariableAssignment_0 ) ) | ( ( rule__Factor__NumberAssignment_1 ) ) | ( ( rule__Factor__StringAssignment_2 ) ) | ( ( rule__Factor__SetAssignment_3 ) ) | ( ( rule__Factor__NilAssignment_4 ) ) | ( ( rule__Factor__BooleanAssignment_5 ) ) | ( ( rule__Factor__BooleanAssignment_6 ) ) | ( ( rule__Factor__FunctionAssignment_7 ) ) | ( ( rule__Factor__Group_8__0 ) ) | ( ( rule__Factor__Group_9__0 ) ) );
    public final void rule__Factor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1699:1: ( ( ( rule__Factor__VariableAssignment_0 ) ) | ( ( rule__Factor__NumberAssignment_1 ) ) | ( ( rule__Factor__StringAssignment_2 ) ) | ( ( rule__Factor__SetAssignment_3 ) ) | ( ( rule__Factor__NilAssignment_4 ) ) | ( ( rule__Factor__BooleanAssignment_5 ) ) | ( ( rule__Factor__BooleanAssignment_6 ) ) | ( ( rule__Factor__FunctionAssignment_7 ) ) | ( ( rule__Factor__Group_8__0 ) ) | ( ( rule__Factor__Group_9__0 ) ) )
            int alt11=10;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalPascal.g:1700:2: ( ( rule__Factor__VariableAssignment_0 ) )
                    {
                    // InternalPascal.g:1700:2: ( ( rule__Factor__VariableAssignment_0 ) )
                    // InternalPascal.g:1701:3: ( rule__Factor__VariableAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFactorAccess().getVariableAssignment_0()); 
                    }
                    // InternalPascal.g:1702:3: ( rule__Factor__VariableAssignment_0 )
                    // InternalPascal.g:1702:4: rule__Factor__VariableAssignment_0
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
                    // InternalPascal.g:1706:2: ( ( rule__Factor__NumberAssignment_1 ) )
                    {
                    // InternalPascal.g:1706:2: ( ( rule__Factor__NumberAssignment_1 ) )
                    // InternalPascal.g:1707:3: ( rule__Factor__NumberAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFactorAccess().getNumberAssignment_1()); 
                    }
                    // InternalPascal.g:1708:3: ( rule__Factor__NumberAssignment_1 )
                    // InternalPascal.g:1708:4: rule__Factor__NumberAssignment_1
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
                    // InternalPascal.g:1712:2: ( ( rule__Factor__StringAssignment_2 ) )
                    {
                    // InternalPascal.g:1712:2: ( ( rule__Factor__StringAssignment_2 ) )
                    // InternalPascal.g:1713:3: ( rule__Factor__StringAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFactorAccess().getStringAssignment_2()); 
                    }
                    // InternalPascal.g:1714:3: ( rule__Factor__StringAssignment_2 )
                    // InternalPascal.g:1714:4: rule__Factor__StringAssignment_2
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
                    // InternalPascal.g:1718:2: ( ( rule__Factor__SetAssignment_3 ) )
                    {
                    // InternalPascal.g:1718:2: ( ( rule__Factor__SetAssignment_3 ) )
                    // InternalPascal.g:1719:3: ( rule__Factor__SetAssignment_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFactorAccess().getSetAssignment_3()); 
                    }
                    // InternalPascal.g:1720:3: ( rule__Factor__SetAssignment_3 )
                    // InternalPascal.g:1720:4: rule__Factor__SetAssignment_3
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
                    // InternalPascal.g:1724:2: ( ( rule__Factor__NilAssignment_4 ) )
                    {
                    // InternalPascal.g:1724:2: ( ( rule__Factor__NilAssignment_4 ) )
                    // InternalPascal.g:1725:3: ( rule__Factor__NilAssignment_4 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFactorAccess().getNilAssignment_4()); 
                    }
                    // InternalPascal.g:1726:3: ( rule__Factor__NilAssignment_4 )
                    // InternalPascal.g:1726:4: rule__Factor__NilAssignment_4
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
                    // InternalPascal.g:1730:2: ( ( rule__Factor__BooleanAssignment_5 ) )
                    {
                    // InternalPascal.g:1730:2: ( ( rule__Factor__BooleanAssignment_5 ) )
                    // InternalPascal.g:1731:3: ( rule__Factor__BooleanAssignment_5 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFactorAccess().getBooleanAssignment_5()); 
                    }
                    // InternalPascal.g:1732:3: ( rule__Factor__BooleanAssignment_5 )
                    // InternalPascal.g:1732:4: rule__Factor__BooleanAssignment_5
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
                    // InternalPascal.g:1736:2: ( ( rule__Factor__BooleanAssignment_6 ) )
                    {
                    // InternalPascal.g:1736:2: ( ( rule__Factor__BooleanAssignment_6 ) )
                    // InternalPascal.g:1737:3: ( rule__Factor__BooleanAssignment_6 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFactorAccess().getBooleanAssignment_6()); 
                    }
                    // InternalPascal.g:1738:3: ( rule__Factor__BooleanAssignment_6 )
                    // InternalPascal.g:1738:4: rule__Factor__BooleanAssignment_6
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
                    // InternalPascal.g:1742:2: ( ( rule__Factor__FunctionAssignment_7 ) )
                    {
                    // InternalPascal.g:1742:2: ( ( rule__Factor__FunctionAssignment_7 ) )
                    // InternalPascal.g:1743:3: ( rule__Factor__FunctionAssignment_7 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFactorAccess().getFunctionAssignment_7()); 
                    }
                    // InternalPascal.g:1744:3: ( rule__Factor__FunctionAssignment_7 )
                    // InternalPascal.g:1744:4: rule__Factor__FunctionAssignment_7
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
                    // InternalPascal.g:1748:2: ( ( rule__Factor__Group_8__0 ) )
                    {
                    // InternalPascal.g:1748:2: ( ( rule__Factor__Group_8__0 ) )
                    // InternalPascal.g:1749:3: ( rule__Factor__Group_8__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFactorAccess().getGroup_8()); 
                    }
                    // InternalPascal.g:1750:3: ( rule__Factor__Group_8__0 )
                    // InternalPascal.g:1750:4: rule__Factor__Group_8__0
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
                    // InternalPascal.g:1754:2: ( ( rule__Factor__Group_9__0 ) )
                    {
                    // InternalPascal.g:1754:2: ( ( rule__Factor__Group_9__0 ) )
                    // InternalPascal.g:1755:3: ( rule__Factor__Group_9__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFactorAccess().getGroup_9()); 
                    }
                    // InternalPascal.g:1756:3: ( rule__Factor__Group_9__0 )
                    // InternalPascal.g:1756:4: rule__Factor__Group_9__0
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
    // InternalPascal.g:1764:1: rule__Function_procedure_declaration__Alternatives_0 : ( ( ( rule__Function_procedure_declaration__ProceduresAssignment_0_0 ) ) | ( ( rule__Function_procedure_declaration__FunctionsAssignment_0_1 ) ) );
    public final void rule__Function_procedure_declaration__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1768:1: ( ( ( rule__Function_procedure_declaration__ProceduresAssignment_0_0 ) ) | ( ( rule__Function_procedure_declaration__FunctionsAssignment_0_1 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==36) ) {
                alt12=1;
            }
            else if ( (LA12_0==38) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalPascal.g:1769:2: ( ( rule__Function_procedure_declaration__ProceduresAssignment_0_0 ) )
                    {
                    // InternalPascal.g:1769:2: ( ( rule__Function_procedure_declaration__ProceduresAssignment_0_0 ) )
                    // InternalPascal.g:1770:3: ( rule__Function_procedure_declaration__ProceduresAssignment_0_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFunction_procedure_declarationAccess().getProceduresAssignment_0_0()); 
                    }
                    // InternalPascal.g:1771:3: ( rule__Function_procedure_declaration__ProceduresAssignment_0_0 )
                    // InternalPascal.g:1771:4: rule__Function_procedure_declaration__ProceduresAssignment_0_0
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
                    // InternalPascal.g:1775:2: ( ( rule__Function_procedure_declaration__FunctionsAssignment_0_1 ) )
                    {
                    // InternalPascal.g:1775:2: ( ( rule__Function_procedure_declaration__FunctionsAssignment_0_1 ) )
                    // InternalPascal.g:1776:3: ( rule__Function_procedure_declaration__FunctionsAssignment_0_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFunction_procedure_declarationAccess().getFunctionsAssignment_0_1()); 
                    }
                    // InternalPascal.g:1777:3: ( rule__Function_procedure_declaration__FunctionsAssignment_0_1 )
                    // InternalPascal.g:1777:4: rule__Function_procedure_declaration__FunctionsAssignment_0_1
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
    // InternalPascal.g:1785:1: rule__Formal_parameter_section__Alternatives : ( ( ( rule__Formal_parameter_section__ValueAssignment_0 ) ) | ( ( rule__Formal_parameter_section__VariableAssignment_1 ) ) | ( ( rule__Formal_parameter_section__ProcedureAssignment_2 ) ) | ( ( rule__Formal_parameter_section__FunctionAssignment_3 ) ) );
    public final void rule__Formal_parameter_section__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1789:1: ( ( ( rule__Formal_parameter_section__ValueAssignment_0 ) ) | ( ( rule__Formal_parameter_section__VariableAssignment_1 ) ) | ( ( rule__Formal_parameter_section__ProcedureAssignment_2 ) ) | ( ( rule__Formal_parameter_section__FunctionAssignment_3 ) ) )
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
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalPascal.g:1790:2: ( ( rule__Formal_parameter_section__ValueAssignment_0 ) )
                    {
                    // InternalPascal.g:1790:2: ( ( rule__Formal_parameter_section__ValueAssignment_0 ) )
                    // InternalPascal.g:1791:3: ( rule__Formal_parameter_section__ValueAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFormal_parameter_sectionAccess().getValueAssignment_0()); 
                    }
                    // InternalPascal.g:1792:3: ( rule__Formal_parameter_section__ValueAssignment_0 )
                    // InternalPascal.g:1792:4: rule__Formal_parameter_section__ValueAssignment_0
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
                    // InternalPascal.g:1796:2: ( ( rule__Formal_parameter_section__VariableAssignment_1 ) )
                    {
                    // InternalPascal.g:1796:2: ( ( rule__Formal_parameter_section__VariableAssignment_1 ) )
                    // InternalPascal.g:1797:3: ( rule__Formal_parameter_section__VariableAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFormal_parameter_sectionAccess().getVariableAssignment_1()); 
                    }
                    // InternalPascal.g:1798:3: ( rule__Formal_parameter_section__VariableAssignment_1 )
                    // InternalPascal.g:1798:4: rule__Formal_parameter_section__VariableAssignment_1
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
                    // InternalPascal.g:1802:2: ( ( rule__Formal_parameter_section__ProcedureAssignment_2 ) )
                    {
                    // InternalPascal.g:1802:2: ( ( rule__Formal_parameter_section__ProcedureAssignment_2 ) )
                    // InternalPascal.g:1803:3: ( rule__Formal_parameter_section__ProcedureAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFormal_parameter_sectionAccess().getProcedureAssignment_2()); 
                    }
                    // InternalPascal.g:1804:3: ( rule__Formal_parameter_section__ProcedureAssignment_2 )
                    // InternalPascal.g:1804:4: rule__Formal_parameter_section__ProcedureAssignment_2
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
                    // InternalPascal.g:1808:2: ( ( rule__Formal_parameter_section__FunctionAssignment_3 ) )
                    {
                    // InternalPascal.g:1808:2: ( ( rule__Formal_parameter_section__FunctionAssignment_3 ) )
                    // InternalPascal.g:1809:3: ( rule__Formal_parameter_section__FunctionAssignment_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFormal_parameter_sectionAccess().getFunctionAssignment_3()); 
                    }
                    // InternalPascal.g:1810:3: ( rule__Formal_parameter_section__FunctionAssignment_3 )
                    // InternalPascal.g:1810:4: rule__Formal_parameter_section__FunctionAssignment_3
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
    // InternalPascal.g:1818:1: rule__Any_number__Alternatives : ( ( ruleunsigned_number ) | ( rulesigned_number ) );
    public final void rule__Any_number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1822:1: ( ( ruleunsigned_number ) | ( rulesigned_number ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INTEGER_NUMBER||LA14_0==RULE_REAL_NUMBER) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_SIGNED_INTEGER_NUMBER||LA14_0==RULE_SIGNED_REAL_NUMBER) ) {
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
                    // InternalPascal.g:1823:2: ( ruleunsigned_number )
                    {
                    // InternalPascal.g:1823:2: ( ruleunsigned_number )
                    // InternalPascal.g:1824:3: ruleunsigned_number
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
                    // InternalPascal.g:1829:2: ( rulesigned_number )
                    {
                    // InternalPascal.g:1829:2: ( rulesigned_number )
                    // InternalPascal.g:1830:3: rulesigned_number
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
    // InternalPascal.g:1839:1: rule__Constant__Alternatives : ( ( ( rule__Constant__Group_0__0 ) ) | ( ( rule__Constant__StringAssignment_1 ) ) | ( ( rule__Constant__BoolLiteralAssignment_2 ) ) | ( ( rule__Constant__BoolLiteralAssignment_3 ) ) );
    public final void rule__Constant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1843:1: ( ( ( rule__Constant__Group_0__0 ) ) | ( ( rule__Constant__StringAssignment_1 ) ) | ( ( rule__Constant__BoolLiteralAssignment_2 ) ) | ( ( rule__Constant__BoolLiteralAssignment_3 ) ) )
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
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalPascal.g:1844:2: ( ( rule__Constant__Group_0__0 ) )
                    {
                    // InternalPascal.g:1844:2: ( ( rule__Constant__Group_0__0 ) )
                    // InternalPascal.g:1845:3: ( rule__Constant__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConstantAccess().getGroup_0()); 
                    }
                    // InternalPascal.g:1846:3: ( rule__Constant__Group_0__0 )
                    // InternalPascal.g:1846:4: rule__Constant__Group_0__0
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
                    // InternalPascal.g:1850:2: ( ( rule__Constant__StringAssignment_1 ) )
                    {
                    // InternalPascal.g:1850:2: ( ( rule__Constant__StringAssignment_1 ) )
                    // InternalPascal.g:1851:3: ( rule__Constant__StringAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConstantAccess().getStringAssignment_1()); 
                    }
                    // InternalPascal.g:1852:3: ( rule__Constant__StringAssignment_1 )
                    // InternalPascal.g:1852:4: rule__Constant__StringAssignment_1
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
                    // InternalPascal.g:1856:2: ( ( rule__Constant__BoolLiteralAssignment_2 ) )
                    {
                    // InternalPascal.g:1856:2: ( ( rule__Constant__BoolLiteralAssignment_2 ) )
                    // InternalPascal.g:1857:3: ( rule__Constant__BoolLiteralAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConstantAccess().getBoolLiteralAssignment_2()); 
                    }
                    // InternalPascal.g:1858:3: ( rule__Constant__BoolLiteralAssignment_2 )
                    // InternalPascal.g:1858:4: rule__Constant__BoolLiteralAssignment_2
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
                    // InternalPascal.g:1862:2: ( ( rule__Constant__BoolLiteralAssignment_3 ) )
                    {
                    // InternalPascal.g:1862:2: ( ( rule__Constant__BoolLiteralAssignment_3 ) )
                    // InternalPascal.g:1863:3: ( rule__Constant__BoolLiteralAssignment_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConstantAccess().getBoolLiteralAssignment_3()); 
                    }
                    // InternalPascal.g:1864:3: ( rule__Constant__BoolLiteralAssignment_3 )
                    // InternalPascal.g:1864:4: rule__Constant__BoolLiteralAssignment_3
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
    // InternalPascal.g:1872:1: rule__Constant__Alternatives_0_1 : ( ( ( rule__Constant__NameAssignment_0_1_0 ) ) | ( ( rule__Constant__NumberAssignment_0_1_1 ) ) );
    public final void rule__Constant__Alternatives_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1876:1: ( ( ( rule__Constant__NameAssignment_0_1_0 ) ) | ( ( rule__Constant__NumberAssignment_0_1_1 ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            else if ( ((LA16_0>=RULE_SIGNED_INTEGER_NUMBER && LA16_0<=RULE_INTEGER_NUMBER)||(LA16_0>=RULE_SIGNED_REAL_NUMBER && LA16_0<=RULE_REAL_NUMBER)) ) {
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
                    // InternalPascal.g:1877:2: ( ( rule__Constant__NameAssignment_0_1_0 ) )
                    {
                    // InternalPascal.g:1877:2: ( ( rule__Constant__NameAssignment_0_1_0 ) )
                    // InternalPascal.g:1878:3: ( rule__Constant__NameAssignment_0_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConstantAccess().getNameAssignment_0_1_0()); 
                    }
                    // InternalPascal.g:1879:3: ( rule__Constant__NameAssignment_0_1_0 )
                    // InternalPascal.g:1879:4: rule__Constant__NameAssignment_0_1_0
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
                    // InternalPascal.g:1883:2: ( ( rule__Constant__NumberAssignment_0_1_1 ) )
                    {
                    // InternalPascal.g:1883:2: ( ( rule__Constant__NumberAssignment_0_1_1 ) )
                    // InternalPascal.g:1884:3: ( rule__Constant__NumberAssignment_0_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConstantAccess().getNumberAssignment_0_1_1()); 
                    }
                    // InternalPascal.g:1885:3: ( rule__Constant__NumberAssignment_0_1_1 )
                    // InternalPascal.g:1885:4: rule__Constant__NumberAssignment_0_1_1
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
    // InternalPascal.g:1893:1: rule__Type__Alternatives : ( ( ( rule__Type__SimpleAssignment_0 ) ) | ( ( rule__Type__StructuredAssignment_1 ) ) | ( ( rule__Type__PointerAssignment_2 ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1897:1: ( ( ( rule__Type__SimpleAssignment_0 ) ) | ( ( rule__Type__StructuredAssignment_1 ) ) | ( ( rule__Type__PointerAssignment_2 ) ) )
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
            case 54:
            case 55:
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
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalPascal.g:1898:2: ( ( rule__Type__SimpleAssignment_0 ) )
                    {
                    // InternalPascal.g:1898:2: ( ( rule__Type__SimpleAssignment_0 ) )
                    // InternalPascal.g:1899:3: ( rule__Type__SimpleAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getSimpleAssignment_0()); 
                    }
                    // InternalPascal.g:1900:3: ( rule__Type__SimpleAssignment_0 )
                    // InternalPascal.g:1900:4: rule__Type__SimpleAssignment_0
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
                    // InternalPascal.g:1904:2: ( ( rule__Type__StructuredAssignment_1 ) )
                    {
                    // InternalPascal.g:1904:2: ( ( rule__Type__StructuredAssignment_1 ) )
                    // InternalPascal.g:1905:3: ( rule__Type__StructuredAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getStructuredAssignment_1()); 
                    }
                    // InternalPascal.g:1906:3: ( rule__Type__StructuredAssignment_1 )
                    // InternalPascal.g:1906:4: rule__Type__StructuredAssignment_1
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
                    // InternalPascal.g:1910:2: ( ( rule__Type__PointerAssignment_2 ) )
                    {
                    // InternalPascal.g:1910:2: ( ( rule__Type__PointerAssignment_2 ) )
                    // InternalPascal.g:1911:3: ( rule__Type__PointerAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getPointerAssignment_2()); 
                    }
                    // InternalPascal.g:1912:3: ( rule__Type__PointerAssignment_2 )
                    // InternalPascal.g:1912:4: rule__Type__PointerAssignment_2
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
    // InternalPascal.g:1920:1: rule__Simple_type__Alternatives : ( ( ( rule__Simple_type__SubrangeAssignment_0 ) ) | ( ( rule__Simple_type__EnumeratedAssignment_1 ) ) | ( ( rule__Simple_type__NameAssignment_2 ) ) );
    public final void rule__Simple_type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1924:1: ( ( ( rule__Simple_type__SubrangeAssignment_0 ) ) | ( ( rule__Simple_type__EnumeratedAssignment_1 ) ) | ( ( rule__Simple_type__NameAssignment_2 ) ) )
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

                if ( (LA18_2==43) ) {
                    alt18=1;
                }
                else if ( (LA18_2==EOF||LA18_2==24||LA18_2==26||LA18_2==34) ) {
                    alt18=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
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
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalPascal.g:1925:2: ( ( rule__Simple_type__SubrangeAssignment_0 ) )
                    {
                    // InternalPascal.g:1925:2: ( ( rule__Simple_type__SubrangeAssignment_0 ) )
                    // InternalPascal.g:1926:3: ( rule__Simple_type__SubrangeAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimple_typeAccess().getSubrangeAssignment_0()); 
                    }
                    // InternalPascal.g:1927:3: ( rule__Simple_type__SubrangeAssignment_0 )
                    // InternalPascal.g:1927:4: rule__Simple_type__SubrangeAssignment_0
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
                    // InternalPascal.g:1931:2: ( ( rule__Simple_type__EnumeratedAssignment_1 ) )
                    {
                    // InternalPascal.g:1931:2: ( ( rule__Simple_type__EnumeratedAssignment_1 ) )
                    // InternalPascal.g:1932:3: ( rule__Simple_type__EnumeratedAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimple_typeAccess().getEnumeratedAssignment_1()); 
                    }
                    // InternalPascal.g:1933:3: ( rule__Simple_type__EnumeratedAssignment_1 )
                    // InternalPascal.g:1933:4: rule__Simple_type__EnumeratedAssignment_1
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
                    // InternalPascal.g:1937:2: ( ( rule__Simple_type__NameAssignment_2 ) )
                    {
                    // InternalPascal.g:1937:2: ( ( rule__Simple_type__NameAssignment_2 ) )
                    // InternalPascal.g:1938:3: ( rule__Simple_type__NameAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimple_typeAccess().getNameAssignment_2()); 
                    }
                    // InternalPascal.g:1939:3: ( rule__Simple_type__NameAssignment_2 )
                    // InternalPascal.g:1939:4: rule__Simple_type__NameAssignment_2
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
    // InternalPascal.g:1947:1: rule__Subrange_type__Alternatives : ( ( ( rule__Subrange_type__Group_0__0 ) ) | ( ( rule__Subrange_type__Group_1__0 ) ) );
    public final void rule__Subrange_type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1951:1: ( ( ( rule__Subrange_type__Group_0__0 ) ) | ( ( rule__Subrange_type__Group_1__0 ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=RULE_ID && LA19_0<=RULE_INTEGER_NUMBER)||LA19_0==RULE_ADDITION_OP||LA19_0==RULE_STRING||(LA19_0>=RULE_SIGNED_REAL_NUMBER && LA19_0<=RULE_REAL_NUMBER)||(LA19_0>=52 && LA19_0<=53)) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_NUMERIC_SUBRANGE) ) {
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
                    // InternalPascal.g:1952:2: ( ( rule__Subrange_type__Group_0__0 ) )
                    {
                    // InternalPascal.g:1952:2: ( ( rule__Subrange_type__Group_0__0 ) )
                    // InternalPascal.g:1953:3: ( rule__Subrange_type__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSubrange_typeAccess().getGroup_0()); 
                    }
                    // InternalPascal.g:1954:3: ( rule__Subrange_type__Group_0__0 )
                    // InternalPascal.g:1954:4: rule__Subrange_type__Group_0__0
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
                    // InternalPascal.g:1958:2: ( ( rule__Subrange_type__Group_1__0 ) )
                    {
                    // InternalPascal.g:1958:2: ( ( rule__Subrange_type__Group_1__0 ) )
                    // InternalPascal.g:1959:3: ( rule__Subrange_type__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSubrange_typeAccess().getGroup_1()); 
                    }
                    // InternalPascal.g:1960:3: ( rule__Subrange_type__Group_1__0 )
                    // InternalPascal.g:1960:4: rule__Subrange_type__Group_1__0
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
    // InternalPascal.g:1968:1: rule__Field_list__Alternatives_0 : ( ( ( rule__Field_list__Group_0_0__0 ) ) | ( ( rule__Field_list__VariantsAssignment_0_1 ) ) );
    public final void rule__Field_list__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1972:1: ( ( ( rule__Field_list__Group_0_0__0 ) ) | ( ( rule__Field_list__VariantsAssignment_0_1 ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                alt20=1;
            }
            else if ( (LA20_0==44) ) {
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
                    // InternalPascal.g:1973:2: ( ( rule__Field_list__Group_0_0__0 ) )
                    {
                    // InternalPascal.g:1973:2: ( ( rule__Field_list__Group_0_0__0 ) )
                    // InternalPascal.g:1974:3: ( rule__Field_list__Group_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getField_listAccess().getGroup_0_0()); 
                    }
                    // InternalPascal.g:1975:3: ( rule__Field_list__Group_0_0__0 )
                    // InternalPascal.g:1975:4: rule__Field_list__Group_0_0__0
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
                    // InternalPascal.g:1979:2: ( ( rule__Field_list__VariantsAssignment_0_1 ) )
                    {
                    // InternalPascal.g:1979:2: ( ( rule__Field_list__VariantsAssignment_0_1 ) )
                    // InternalPascal.g:1980:3: ( rule__Field_list__VariantsAssignment_0_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getField_listAccess().getVariantsAssignment_0_1()); 
                    }
                    // InternalPascal.g:1981:3: ( rule__Field_list__VariantsAssignment_0_1 )
                    // InternalPascal.g:1981:4: rule__Field_list__VariantsAssignment_0_1
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
    // InternalPascal.g:1989:1: rule__Signed_number__Alternatives : ( ( ( rule__Signed_number__IntegerAssignment_0 ) ) | ( ( rule__Signed_number__RealAssignment_1 ) ) );
    public final void rule__Signed_number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1993:1: ( ( ( rule__Signed_number__IntegerAssignment_0 ) ) | ( ( rule__Signed_number__RealAssignment_1 ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_SIGNED_INTEGER_NUMBER) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_SIGNED_REAL_NUMBER) ) {
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
                    // InternalPascal.g:1994:2: ( ( rule__Signed_number__IntegerAssignment_0 ) )
                    {
                    // InternalPascal.g:1994:2: ( ( rule__Signed_number__IntegerAssignment_0 ) )
                    // InternalPascal.g:1995:3: ( rule__Signed_number__IntegerAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSigned_numberAccess().getIntegerAssignment_0()); 
                    }
                    // InternalPascal.g:1996:3: ( rule__Signed_number__IntegerAssignment_0 )
                    // InternalPascal.g:1996:4: rule__Signed_number__IntegerAssignment_0
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
                    // InternalPascal.g:2000:2: ( ( rule__Signed_number__RealAssignment_1 ) )
                    {
                    // InternalPascal.g:2000:2: ( ( rule__Signed_number__RealAssignment_1 ) )
                    // InternalPascal.g:2001:3: ( rule__Signed_number__RealAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSigned_numberAccess().getRealAssignment_1()); 
                    }
                    // InternalPascal.g:2002:3: ( rule__Signed_number__RealAssignment_1 )
                    // InternalPascal.g:2002:4: rule__Signed_number__RealAssignment_1
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
    // InternalPascal.g:2010:1: rule__Unsigned_number__Alternatives : ( ( ( rule__Unsigned_number__IntegerAssignment_0 ) ) | ( ( rule__Unsigned_number__RealAssignment_1 ) ) );
    public final void rule__Unsigned_number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2014:1: ( ( ( rule__Unsigned_number__IntegerAssignment_0 ) ) | ( ( rule__Unsigned_number__RealAssignment_1 ) ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_INTEGER_NUMBER) ) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_REAL_NUMBER) ) {
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
                    // InternalPascal.g:2015:2: ( ( rule__Unsigned_number__IntegerAssignment_0 ) )
                    {
                    // InternalPascal.g:2015:2: ( ( rule__Unsigned_number__IntegerAssignment_0 ) )
                    // InternalPascal.g:2016:3: ( rule__Unsigned_number__IntegerAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnsigned_numberAccess().getIntegerAssignment_0()); 
                    }
                    // InternalPascal.g:2017:3: ( rule__Unsigned_number__IntegerAssignment_0 )
                    // InternalPascal.g:2017:4: rule__Unsigned_number__IntegerAssignment_0
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
                    // InternalPascal.g:2021:2: ( ( rule__Unsigned_number__RealAssignment_1 ) )
                    {
                    // InternalPascal.g:2021:2: ( ( rule__Unsigned_number__RealAssignment_1 ) )
                    // InternalPascal.g:2022:3: ( rule__Unsigned_number__RealAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnsigned_numberAccess().getRealAssignment_1()); 
                    }
                    // InternalPascal.g:2023:3: ( rule__Unsigned_number__RealAssignment_1 )
                    // InternalPascal.g:2023:4: rule__Unsigned_number__RealAssignment_1
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
    // InternalPascal.g:2031:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2035:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalPascal.g:2036:2: rule__Program__Group__0__Impl rule__Program__Group__1
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
    // InternalPascal.g:2043:1: rule__Program__Group__0__Impl : ( ( rule__Program__HeadingAssignment_0 ) ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2047:1: ( ( ( rule__Program__HeadingAssignment_0 ) ) )
            // InternalPascal.g:2048:1: ( ( rule__Program__HeadingAssignment_0 ) )
            {
            // InternalPascal.g:2048:1: ( ( rule__Program__HeadingAssignment_0 ) )
            // InternalPascal.g:2049:2: ( rule__Program__HeadingAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getHeadingAssignment_0()); 
            }
            // InternalPascal.g:2050:2: ( rule__Program__HeadingAssignment_0 )
            // InternalPascal.g:2050:3: rule__Program__HeadingAssignment_0
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
    // InternalPascal.g:2058:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2062:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // InternalPascal.g:2063:2: rule__Program__Group__1__Impl rule__Program__Group__2
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
    // InternalPascal.g:2070:1: rule__Program__Group__1__Impl : ( ( rule__Program__BlockAssignment_1 ) ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2074:1: ( ( ( rule__Program__BlockAssignment_1 ) ) )
            // InternalPascal.g:2075:1: ( ( rule__Program__BlockAssignment_1 ) )
            {
            // InternalPascal.g:2075:1: ( ( rule__Program__BlockAssignment_1 ) )
            // InternalPascal.g:2076:2: ( rule__Program__BlockAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getBlockAssignment_1()); 
            }
            // InternalPascal.g:2077:2: ( rule__Program__BlockAssignment_1 )
            // InternalPascal.g:2077:3: rule__Program__BlockAssignment_1
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
    // InternalPascal.g:2085:1: rule__Program__Group__2 : rule__Program__Group__2__Impl ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2089:1: ( rule__Program__Group__2__Impl )
            // InternalPascal.g:2090:2: rule__Program__Group__2__Impl
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
    // InternalPascal.g:2096:1: rule__Program__Group__2__Impl : ( '.' ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2100:1: ( ( '.' ) )
            // InternalPascal.g:2101:1: ( '.' )
            {
            // InternalPascal.g:2101:1: ( '.' )
            // InternalPascal.g:2102:2: '.'
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
    // InternalPascal.g:2112:1: rule__Program_heading_block__Group__0 : rule__Program_heading_block__Group__0__Impl rule__Program_heading_block__Group__1 ;
    public final void rule__Program_heading_block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2116:1: ( rule__Program_heading_block__Group__0__Impl rule__Program_heading_block__Group__1 )
            // InternalPascal.g:2117:2: rule__Program_heading_block__Group__0__Impl rule__Program_heading_block__Group__1
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
    // InternalPascal.g:2124:1: rule__Program_heading_block__Group__0__Impl : ( 'program' ) ;
    public final void rule__Program_heading_block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2128:1: ( ( 'program' ) )
            // InternalPascal.g:2129:1: ( 'program' )
            {
            // InternalPascal.g:2129:1: ( 'program' )
            // InternalPascal.g:2130:2: 'program'
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
    // InternalPascal.g:2139:1: rule__Program_heading_block__Group__1 : rule__Program_heading_block__Group__1__Impl rule__Program_heading_block__Group__2 ;
    public final void rule__Program_heading_block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2143:1: ( rule__Program_heading_block__Group__1__Impl rule__Program_heading_block__Group__2 )
            // InternalPascal.g:2144:2: rule__Program_heading_block__Group__1__Impl rule__Program_heading_block__Group__2
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
    // InternalPascal.g:2151:1: rule__Program_heading_block__Group__1__Impl : ( ( rule__Program_heading_block__NameAssignment_1 ) ) ;
    public final void rule__Program_heading_block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2155:1: ( ( ( rule__Program_heading_block__NameAssignment_1 ) ) )
            // InternalPascal.g:2156:1: ( ( rule__Program_heading_block__NameAssignment_1 ) )
            {
            // InternalPascal.g:2156:1: ( ( rule__Program_heading_block__NameAssignment_1 ) )
            // InternalPascal.g:2157:2: ( rule__Program_heading_block__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgram_heading_blockAccess().getNameAssignment_1()); 
            }
            // InternalPascal.g:2158:2: ( rule__Program_heading_block__NameAssignment_1 )
            // InternalPascal.g:2158:3: rule__Program_heading_block__NameAssignment_1
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
    // InternalPascal.g:2166:1: rule__Program_heading_block__Group__2 : rule__Program_heading_block__Group__2__Impl ;
    public final void rule__Program_heading_block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2170:1: ( rule__Program_heading_block__Group__2__Impl )
            // InternalPascal.g:2171:2: rule__Program_heading_block__Group__2__Impl
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
    // InternalPascal.g:2177:1: rule__Program_heading_block__Group__2__Impl : ( ';' ) ;
    public final void rule__Program_heading_block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2181:1: ( ( ';' ) )
            // InternalPascal.g:2182:1: ( ';' )
            {
            // InternalPascal.g:2182:1: ( ';' )
            // InternalPascal.g:2183:2: ';'
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
    // InternalPascal.g:2193:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2197:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // InternalPascal.g:2198:2: rule__Block__Group__0__Impl rule__Block__Group__1
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
    // InternalPascal.g:2205:1: rule__Block__Group__0__Impl : ( ( rule__Block__LabelAssignment_0 )? ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2209:1: ( ( ( rule__Block__LabelAssignment_0 )? ) )
            // InternalPascal.g:2210:1: ( ( rule__Block__LabelAssignment_0 )? )
            {
            // InternalPascal.g:2210:1: ( ( rule__Block__LabelAssignment_0 )? )
            // InternalPascal.g:2211:2: ( rule__Block__LabelAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getLabelAssignment_0()); 
            }
            // InternalPascal.g:2212:2: ( rule__Block__LabelAssignment_0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==39) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalPascal.g:2212:3: rule__Block__LabelAssignment_0
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
    // InternalPascal.g:2220:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2224:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // InternalPascal.g:2225:2: rule__Block__Group__1__Impl rule__Block__Group__2
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
    // InternalPascal.g:2232:1: rule__Block__Group__1__Impl : ( ( rule__Block__TypeAssignment_1 )? ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2236:1: ( ( ( rule__Block__TypeAssignment_1 )? ) )
            // InternalPascal.g:2237:1: ( ( rule__Block__TypeAssignment_1 )? )
            {
            // InternalPascal.g:2237:1: ( ( rule__Block__TypeAssignment_1 )? )
            // InternalPascal.g:2238:2: ( rule__Block__TypeAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getTypeAssignment_1()); 
            }
            // InternalPascal.g:2239:2: ( rule__Block__TypeAssignment_1 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==42) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalPascal.g:2239:3: rule__Block__TypeAssignment_1
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
    // InternalPascal.g:2247:1: rule__Block__Group__2 : rule__Block__Group__2__Impl rule__Block__Group__3 ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2251:1: ( rule__Block__Group__2__Impl rule__Block__Group__3 )
            // InternalPascal.g:2252:2: rule__Block__Group__2__Impl rule__Block__Group__3
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
    // InternalPascal.g:2259:1: rule__Block__Group__2__Impl : ( ( rule__Block__VariableAssignment_2 )? ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2263:1: ( ( ( rule__Block__VariableAssignment_2 )? ) )
            // InternalPascal.g:2264:1: ( ( rule__Block__VariableAssignment_2 )? )
            {
            // InternalPascal.g:2264:1: ( ( rule__Block__VariableAssignment_2 )? )
            // InternalPascal.g:2265:2: ( rule__Block__VariableAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getVariableAssignment_2()); 
            }
            // InternalPascal.g:2266:2: ( rule__Block__VariableAssignment_2 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==37) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalPascal.g:2266:3: rule__Block__VariableAssignment_2
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
    // InternalPascal.g:2274:1: rule__Block__Group__3 : rule__Block__Group__3__Impl rule__Block__Group__4 ;
    public final void rule__Block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2278:1: ( rule__Block__Group__3__Impl rule__Block__Group__4 )
            // InternalPascal.g:2279:2: rule__Block__Group__3__Impl rule__Block__Group__4
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
    // InternalPascal.g:2286:1: rule__Block__Group__3__Impl : ( ( rule__Block__ConstantAssignment_3 )? ) ;
    public final void rule__Block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2290:1: ( ( ( rule__Block__ConstantAssignment_3 )? ) )
            // InternalPascal.g:2291:1: ( ( rule__Block__ConstantAssignment_3 )? )
            {
            // InternalPascal.g:2291:1: ( ( rule__Block__ConstantAssignment_3 )? )
            // InternalPascal.g:2292:2: ( rule__Block__ConstantAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getConstantAssignment_3()); 
            }
            // InternalPascal.g:2293:2: ( rule__Block__ConstantAssignment_3 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==40) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalPascal.g:2293:3: rule__Block__ConstantAssignment_3
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
    // InternalPascal.g:2301:1: rule__Block__Group__4 : rule__Block__Group__4__Impl rule__Block__Group__5 ;
    public final void rule__Block__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2305:1: ( rule__Block__Group__4__Impl rule__Block__Group__5 )
            // InternalPascal.g:2306:2: rule__Block__Group__4__Impl rule__Block__Group__5
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
    // InternalPascal.g:2313:1: rule__Block__Group__4__Impl : ( ( rule__Block__AbstractionAssignment_4 )? ) ;
    public final void rule__Block__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2317:1: ( ( ( rule__Block__AbstractionAssignment_4 )? ) )
            // InternalPascal.g:2318:1: ( ( rule__Block__AbstractionAssignment_4 )? )
            {
            // InternalPascal.g:2318:1: ( ( rule__Block__AbstractionAssignment_4 )? )
            // InternalPascal.g:2319:2: ( rule__Block__AbstractionAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getAbstractionAssignment_4()); 
            }
            // InternalPascal.g:2320:2: ( rule__Block__AbstractionAssignment_4 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==36||LA27_0==38) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalPascal.g:2320:3: rule__Block__AbstractionAssignment_4
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
    // InternalPascal.g:2328:1: rule__Block__Group__5 : rule__Block__Group__5__Impl ;
    public final void rule__Block__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2332:1: ( rule__Block__Group__5__Impl )
            // InternalPascal.g:2333:2: rule__Block__Group__5__Impl
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
    // InternalPascal.g:2339:1: rule__Block__Group__5__Impl : ( ( rule__Block__StatementAssignment_5 ) ) ;
    public final void rule__Block__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2343:1: ( ( ( rule__Block__StatementAssignment_5 ) ) )
            // InternalPascal.g:2344:1: ( ( rule__Block__StatementAssignment_5 ) )
            {
            // InternalPascal.g:2344:1: ( ( rule__Block__StatementAssignment_5 ) )
            // InternalPascal.g:2345:2: ( rule__Block__StatementAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getStatementAssignment_5()); 
            }
            // InternalPascal.g:2346:2: ( rule__Block__StatementAssignment_5 )
            // InternalPascal.g:2346:3: rule__Block__StatementAssignment_5
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
    // InternalPascal.g:2355:1: rule__Statement_part__Group__0 : rule__Statement_part__Group__0__Impl rule__Statement_part__Group__1 ;
    public final void rule__Statement_part__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2359:1: ( rule__Statement_part__Group__0__Impl rule__Statement_part__Group__1 )
            // InternalPascal.g:2360:2: rule__Statement_part__Group__0__Impl rule__Statement_part__Group__1
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
    // InternalPascal.g:2367:1: rule__Statement_part__Group__0__Impl : ( 'begin' ) ;
    public final void rule__Statement_part__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2371:1: ( ( 'begin' ) )
            // InternalPascal.g:2372:1: ( 'begin' )
            {
            // InternalPascal.g:2372:1: ( 'begin' )
            // InternalPascal.g:2373:2: 'begin'
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
    // InternalPascal.g:2382:1: rule__Statement_part__Group__1 : rule__Statement_part__Group__1__Impl rule__Statement_part__Group__2 ;
    public final void rule__Statement_part__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2386:1: ( rule__Statement_part__Group__1__Impl rule__Statement_part__Group__2 )
            // InternalPascal.g:2387:2: rule__Statement_part__Group__1__Impl rule__Statement_part__Group__2
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
    // InternalPascal.g:2394:1: rule__Statement_part__Group__1__Impl : ( ( rule__Statement_part__SequenceAssignment_1 ) ) ;
    public final void rule__Statement_part__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2398:1: ( ( ( rule__Statement_part__SequenceAssignment_1 ) ) )
            // InternalPascal.g:2399:1: ( ( rule__Statement_part__SequenceAssignment_1 ) )
            {
            // InternalPascal.g:2399:1: ( ( rule__Statement_part__SequenceAssignment_1 ) )
            // InternalPascal.g:2400:2: ( rule__Statement_part__SequenceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatement_partAccess().getSequenceAssignment_1()); 
            }
            // InternalPascal.g:2401:2: ( rule__Statement_part__SequenceAssignment_1 )
            // InternalPascal.g:2401:3: rule__Statement_part__SequenceAssignment_1
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
    // InternalPascal.g:2409:1: rule__Statement_part__Group__2 : rule__Statement_part__Group__2__Impl ;
    public final void rule__Statement_part__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2413:1: ( rule__Statement_part__Group__2__Impl )
            // InternalPascal.g:2414:2: rule__Statement_part__Group__2__Impl
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
    // InternalPascal.g:2420:1: rule__Statement_part__Group__2__Impl : ( 'end' ) ;
    public final void rule__Statement_part__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2424:1: ( ( 'end' ) )
            // InternalPascal.g:2425:1: ( 'end' )
            {
            // InternalPascal.g:2425:1: ( 'end' )
            // InternalPascal.g:2426:2: 'end'
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
    // InternalPascal.g:2436:1: rule__Statement_sequence__Group__0 : rule__Statement_sequence__Group__0__Impl rule__Statement_sequence__Group__1 ;
    public final void rule__Statement_sequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2440:1: ( rule__Statement_sequence__Group__0__Impl rule__Statement_sequence__Group__1 )
            // InternalPascal.g:2441:2: rule__Statement_sequence__Group__0__Impl rule__Statement_sequence__Group__1
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
    // InternalPascal.g:2448:1: rule__Statement_sequence__Group__0__Impl : ( ( rule__Statement_sequence__StatementsAssignment_0 ) ) ;
    public final void rule__Statement_sequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2452:1: ( ( ( rule__Statement_sequence__StatementsAssignment_0 ) ) )
            // InternalPascal.g:2453:1: ( ( rule__Statement_sequence__StatementsAssignment_0 ) )
            {
            // InternalPascal.g:2453:1: ( ( rule__Statement_sequence__StatementsAssignment_0 ) )
            // InternalPascal.g:2454:2: ( rule__Statement_sequence__StatementsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatement_sequenceAccess().getStatementsAssignment_0()); 
            }
            // InternalPascal.g:2455:2: ( rule__Statement_sequence__StatementsAssignment_0 )
            // InternalPascal.g:2455:3: rule__Statement_sequence__StatementsAssignment_0
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
    // InternalPascal.g:2463:1: rule__Statement_sequence__Group__1 : rule__Statement_sequence__Group__1__Impl ;
    public final void rule__Statement_sequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2467:1: ( rule__Statement_sequence__Group__1__Impl )
            // InternalPascal.g:2468:2: rule__Statement_sequence__Group__1__Impl
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
    // InternalPascal.g:2474:1: rule__Statement_sequence__Group__1__Impl : ( ( rule__Statement_sequence__Group_1__0 )* ) ;
    public final void rule__Statement_sequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2478:1: ( ( ( rule__Statement_sequence__Group_1__0 )* ) )
            // InternalPascal.g:2479:1: ( ( rule__Statement_sequence__Group_1__0 )* )
            {
            // InternalPascal.g:2479:1: ( ( rule__Statement_sequence__Group_1__0 )* )
            // InternalPascal.g:2480:2: ( rule__Statement_sequence__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatement_sequenceAccess().getGroup_1()); 
            }
            // InternalPascal.g:2481:2: ( rule__Statement_sequence__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==24) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalPascal.g:2481:3: rule__Statement_sequence__Group_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Statement_sequence__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalPascal.g:2490:1: rule__Statement_sequence__Group_1__0 : rule__Statement_sequence__Group_1__0__Impl rule__Statement_sequence__Group_1__1 ;
    public final void rule__Statement_sequence__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2494:1: ( rule__Statement_sequence__Group_1__0__Impl rule__Statement_sequence__Group_1__1 )
            // InternalPascal.g:2495:2: rule__Statement_sequence__Group_1__0__Impl rule__Statement_sequence__Group_1__1
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
    // InternalPascal.g:2502:1: rule__Statement_sequence__Group_1__0__Impl : ( ';' ) ;
    public final void rule__Statement_sequence__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2506:1: ( ( ';' ) )
            // InternalPascal.g:2507:1: ( ';' )
            {
            // InternalPascal.g:2507:1: ( ';' )
            // InternalPascal.g:2508:2: ';'
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
    // InternalPascal.g:2517:1: rule__Statement_sequence__Group_1__1 : rule__Statement_sequence__Group_1__1__Impl ;
    public final void rule__Statement_sequence__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2521:1: ( rule__Statement_sequence__Group_1__1__Impl )
            // InternalPascal.g:2522:2: rule__Statement_sequence__Group_1__1__Impl
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
    // InternalPascal.g:2528:1: rule__Statement_sequence__Group_1__1__Impl : ( ( rule__Statement_sequence__StatementsAssignment_1_1 ) ) ;
    public final void rule__Statement_sequence__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2532:1: ( ( ( rule__Statement_sequence__StatementsAssignment_1_1 ) ) )
            // InternalPascal.g:2533:1: ( ( rule__Statement_sequence__StatementsAssignment_1_1 ) )
            {
            // InternalPascal.g:2533:1: ( ( rule__Statement_sequence__StatementsAssignment_1_1 ) )
            // InternalPascal.g:2534:2: ( rule__Statement_sequence__StatementsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatement_sequenceAccess().getStatementsAssignment_1_1()); 
            }
            // InternalPascal.g:2535:2: ( rule__Statement_sequence__StatementsAssignment_1_1 )
            // InternalPascal.g:2535:3: rule__Statement_sequence__StatementsAssignment_1_1
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
    // InternalPascal.g:2544:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2548:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // InternalPascal.g:2549:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
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
    // InternalPascal.g:2556:1: rule__Statement__Group__0__Impl : ( ( rule__Statement__Group_0__0 )? ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2560:1: ( ( ( rule__Statement__Group_0__0 )? ) )
            // InternalPascal.g:2561:1: ( ( rule__Statement__Group_0__0 )? )
            {
            // InternalPascal.g:2561:1: ( ( rule__Statement__Group_0__0 )? )
            // InternalPascal.g:2562:2: ( rule__Statement__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getGroup_0()); 
            }
            // InternalPascal.g:2563:2: ( rule__Statement__Group_0__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=RULE_SIGNED_INTEGER_NUMBER && LA29_0<=RULE_INTEGER_NUMBER)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalPascal.g:2563:3: rule__Statement__Group_0__0
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
    // InternalPascal.g:2571:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2575:1: ( rule__Statement__Group__1__Impl )
            // InternalPascal.g:2576:2: rule__Statement__Group__1__Impl
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
    // InternalPascal.g:2582:1: rule__Statement__Group__1__Impl : ( ( rule__Statement__SimpleAssignment_1 ) ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2586:1: ( ( ( rule__Statement__SimpleAssignment_1 ) ) )
            // InternalPascal.g:2587:1: ( ( rule__Statement__SimpleAssignment_1 ) )
            {
            // InternalPascal.g:2587:1: ( ( rule__Statement__SimpleAssignment_1 ) )
            // InternalPascal.g:2588:2: ( rule__Statement__SimpleAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getSimpleAssignment_1()); 
            }
            // InternalPascal.g:2589:2: ( rule__Statement__SimpleAssignment_1 )
            // InternalPascal.g:2589:3: rule__Statement__SimpleAssignment_1
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
    // InternalPascal.g:2598:1: rule__Statement__Group_0__0 : rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 ;
    public final void rule__Statement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2602:1: ( rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 )
            // InternalPascal.g:2603:2: rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1
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
    // InternalPascal.g:2610:1: rule__Statement__Group_0__0__Impl : ( ( rule__Statement__LabelAssignment_0_0 ) ) ;
    public final void rule__Statement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2614:1: ( ( ( rule__Statement__LabelAssignment_0_0 ) ) )
            // InternalPascal.g:2615:1: ( ( rule__Statement__LabelAssignment_0_0 ) )
            {
            // InternalPascal.g:2615:1: ( ( rule__Statement__LabelAssignment_0_0 ) )
            // InternalPascal.g:2616:2: ( rule__Statement__LabelAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getLabelAssignment_0_0()); 
            }
            // InternalPascal.g:2617:2: ( rule__Statement__LabelAssignment_0_0 )
            // InternalPascal.g:2617:3: rule__Statement__LabelAssignment_0_0
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
    // InternalPascal.g:2625:1: rule__Statement__Group_0__1 : rule__Statement__Group_0__1__Impl ;
    public final void rule__Statement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2629:1: ( rule__Statement__Group_0__1__Impl )
            // InternalPascal.g:2630:2: rule__Statement__Group_0__1__Impl
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
    // InternalPascal.g:2636:1: rule__Statement__Group_0__1__Impl : ( ':' ) ;
    public final void rule__Statement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2640:1: ( ( ':' ) )
            // InternalPascal.g:2641:1: ( ':' )
            {
            // InternalPascal.g:2641:1: ( ':' )
            // InternalPascal.g:2642:2: ':'
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
    // InternalPascal.g:2652:1: rule__Assignment_statement__Group__0 : rule__Assignment_statement__Group__0__Impl rule__Assignment_statement__Group__1 ;
    public final void rule__Assignment_statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2656:1: ( rule__Assignment_statement__Group__0__Impl rule__Assignment_statement__Group__1 )
            // InternalPascal.g:2657:2: rule__Assignment_statement__Group__0__Impl rule__Assignment_statement__Group__1
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
    // InternalPascal.g:2664:1: rule__Assignment_statement__Group__0__Impl : ( ( rule__Assignment_statement__VariableAssignment_0 ) ) ;
    public final void rule__Assignment_statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2668:1: ( ( ( rule__Assignment_statement__VariableAssignment_0 ) ) )
            // InternalPascal.g:2669:1: ( ( rule__Assignment_statement__VariableAssignment_0 ) )
            {
            // InternalPascal.g:2669:1: ( ( rule__Assignment_statement__VariableAssignment_0 ) )
            // InternalPascal.g:2670:2: ( rule__Assignment_statement__VariableAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignment_statementAccess().getVariableAssignment_0()); 
            }
            // InternalPascal.g:2671:2: ( rule__Assignment_statement__VariableAssignment_0 )
            // InternalPascal.g:2671:3: rule__Assignment_statement__VariableAssignment_0
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
    // InternalPascal.g:2679:1: rule__Assignment_statement__Group__1 : rule__Assignment_statement__Group__1__Impl rule__Assignment_statement__Group__2 ;
    public final void rule__Assignment_statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2683:1: ( rule__Assignment_statement__Group__1__Impl rule__Assignment_statement__Group__2 )
            // InternalPascal.g:2684:2: rule__Assignment_statement__Group__1__Impl rule__Assignment_statement__Group__2
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
    // InternalPascal.g:2691:1: rule__Assignment_statement__Group__1__Impl : ( ':=' ) ;
    public final void rule__Assignment_statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2695:1: ( ( ':=' ) )
            // InternalPascal.g:2696:1: ( ':=' )
            {
            // InternalPascal.g:2696:1: ( ':=' )
            // InternalPascal.g:2697:2: ':='
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
    // InternalPascal.g:2706:1: rule__Assignment_statement__Group__2 : rule__Assignment_statement__Group__2__Impl ;
    public final void rule__Assignment_statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2710:1: ( rule__Assignment_statement__Group__2__Impl )
            // InternalPascal.g:2711:2: rule__Assignment_statement__Group__2__Impl
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
    // InternalPascal.g:2717:1: rule__Assignment_statement__Group__2__Impl : ( ( rule__Assignment_statement__ExpressionAssignment_2 ) ) ;
    public final void rule__Assignment_statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2721:1: ( ( ( rule__Assignment_statement__ExpressionAssignment_2 ) ) )
            // InternalPascal.g:2722:1: ( ( rule__Assignment_statement__ExpressionAssignment_2 ) )
            {
            // InternalPascal.g:2722:1: ( ( rule__Assignment_statement__ExpressionAssignment_2 ) )
            // InternalPascal.g:2723:2: ( rule__Assignment_statement__ExpressionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignment_statementAccess().getExpressionAssignment_2()); 
            }
            // InternalPascal.g:2724:2: ( rule__Assignment_statement__ExpressionAssignment_2 )
            // InternalPascal.g:2724:3: rule__Assignment_statement__ExpressionAssignment_2
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
    // InternalPascal.g:2733:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2737:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalPascal.g:2738:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
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
    // InternalPascal.g:2745:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__NameAssignment_0 ) ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2749:1: ( ( ( rule__Variable__NameAssignment_0 ) ) )
            // InternalPascal.g:2750:1: ( ( rule__Variable__NameAssignment_0 ) )
            {
            // InternalPascal.g:2750:1: ( ( rule__Variable__NameAssignment_0 ) )
            // InternalPascal.g:2751:2: ( rule__Variable__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getNameAssignment_0()); 
            }
            // InternalPascal.g:2752:2: ( rule__Variable__NameAssignment_0 )
            // InternalPascal.g:2752:3: rule__Variable__NameAssignment_0
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
    // InternalPascal.g:2760:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2764:1: ( rule__Variable__Group__1__Impl )
            // InternalPascal.g:2765:2: rule__Variable__Group__1__Impl
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
    // InternalPascal.g:2771:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__VariableAssignment_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2775:1: ( ( ( rule__Variable__VariableAssignment_1 ) ) )
            // InternalPascal.g:2776:1: ( ( rule__Variable__VariableAssignment_1 ) )
            {
            // InternalPascal.g:2776:1: ( ( rule__Variable__VariableAssignment_1 ) )
            // InternalPascal.g:2777:2: ( rule__Variable__VariableAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getVariableAssignment_1()); 
            }
            // InternalPascal.g:2778:2: ( rule__Variable__VariableAssignment_1 )
            // InternalPascal.g:2778:3: rule__Variable__VariableAssignment_1
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
    // InternalPascal.g:2787:1: rule__Var___Group_0__0 : rule__Var___Group_0__0__Impl rule__Var___Group_0__1 ;
    public final void rule__Var___Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2791:1: ( rule__Var___Group_0__0__Impl rule__Var___Group_0__1 )
            // InternalPascal.g:2792:2: rule__Var___Group_0__0__Impl rule__Var___Group_0__1
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
    // InternalPascal.g:2799:1: rule__Var___Group_0__0__Impl : ( '[' ) ;
    public final void rule__Var___Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2803:1: ( ( '[' ) )
            // InternalPascal.g:2804:1: ( '[' )
            {
            // InternalPascal.g:2804:1: ( '[' )
            // InternalPascal.g:2805:2: '['
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
    // InternalPascal.g:2814:1: rule__Var___Group_0__1 : rule__Var___Group_0__1__Impl rule__Var___Group_0__2 ;
    public final void rule__Var___Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2818:1: ( rule__Var___Group_0__1__Impl rule__Var___Group_0__2 )
            // InternalPascal.g:2819:2: rule__Var___Group_0__1__Impl rule__Var___Group_0__2
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
    // InternalPascal.g:2826:1: rule__Var___Group_0__1__Impl : ( ( rule__Var___ExpressionsAssignment_0_1 ) ) ;
    public final void rule__Var___Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2830:1: ( ( ( rule__Var___ExpressionsAssignment_0_1 ) ) )
            // InternalPascal.g:2831:1: ( ( rule__Var___ExpressionsAssignment_0_1 ) )
            {
            // InternalPascal.g:2831:1: ( ( rule__Var___ExpressionsAssignment_0_1 ) )
            // InternalPascal.g:2832:2: ( rule__Var___ExpressionsAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_Access().getExpressionsAssignment_0_1()); 
            }
            // InternalPascal.g:2833:2: ( rule__Var___ExpressionsAssignment_0_1 )
            // InternalPascal.g:2833:3: rule__Var___ExpressionsAssignment_0_1
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
    // InternalPascal.g:2841:1: rule__Var___Group_0__2 : rule__Var___Group_0__2__Impl rule__Var___Group_0__3 ;
    public final void rule__Var___Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2845:1: ( rule__Var___Group_0__2__Impl rule__Var___Group_0__3 )
            // InternalPascal.g:2846:2: rule__Var___Group_0__2__Impl rule__Var___Group_0__3
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
    // InternalPascal.g:2853:1: rule__Var___Group_0__2__Impl : ( ']' ) ;
    public final void rule__Var___Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2857:1: ( ( ']' ) )
            // InternalPascal.g:2858:1: ( ']' )
            {
            // InternalPascal.g:2858:1: ( ']' )
            // InternalPascal.g:2859:2: ']'
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
    // InternalPascal.g:2868:1: rule__Var___Group_0__3 : rule__Var___Group_0__3__Impl ;
    public final void rule__Var___Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2872:1: ( rule__Var___Group_0__3__Impl )
            // InternalPascal.g:2873:2: rule__Var___Group_0__3__Impl
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
    // InternalPascal.g:2879:1: rule__Var___Group_0__3__Impl : ( ( rule__Var___ArrayAssignment_0_3 ) ) ;
    public final void rule__Var___Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2883:1: ( ( ( rule__Var___ArrayAssignment_0_3 ) ) )
            // InternalPascal.g:2884:1: ( ( rule__Var___ArrayAssignment_0_3 ) )
            {
            // InternalPascal.g:2884:1: ( ( rule__Var___ArrayAssignment_0_3 ) )
            // InternalPascal.g:2885:2: ( rule__Var___ArrayAssignment_0_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_Access().getArrayAssignment_0_3()); 
            }
            // InternalPascal.g:2886:2: ( rule__Var___ArrayAssignment_0_3 )
            // InternalPascal.g:2886:3: rule__Var___ArrayAssignment_0_3
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
    // InternalPascal.g:2895:1: rule__Var___Group_1__0 : rule__Var___Group_1__0__Impl rule__Var___Group_1__1 ;
    public final void rule__Var___Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2899:1: ( rule__Var___Group_1__0__Impl rule__Var___Group_1__1 )
            // InternalPascal.g:2900:2: rule__Var___Group_1__0__Impl rule__Var___Group_1__1
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
    // InternalPascal.g:2907:1: rule__Var___Group_1__0__Impl : ( ( rule__Var___AccessorAssignment_1_0 ) ) ;
    public final void rule__Var___Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2911:1: ( ( ( rule__Var___AccessorAssignment_1_0 ) ) )
            // InternalPascal.g:2912:1: ( ( rule__Var___AccessorAssignment_1_0 ) )
            {
            // InternalPascal.g:2912:1: ( ( rule__Var___AccessorAssignment_1_0 ) )
            // InternalPascal.g:2913:2: ( rule__Var___AccessorAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_Access().getAccessorAssignment_1_0()); 
            }
            // InternalPascal.g:2914:2: ( rule__Var___AccessorAssignment_1_0 )
            // InternalPascal.g:2914:3: rule__Var___AccessorAssignment_1_0
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
    // InternalPascal.g:2922:1: rule__Var___Group_1__1 : rule__Var___Group_1__1__Impl rule__Var___Group_1__2 ;
    public final void rule__Var___Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2926:1: ( rule__Var___Group_1__1__Impl rule__Var___Group_1__2 )
            // InternalPascal.g:2927:2: rule__Var___Group_1__1__Impl rule__Var___Group_1__2
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
    // InternalPascal.g:2934:1: rule__Var___Group_1__1__Impl : ( ( rule__Var___NameAssignment_1_1 ) ) ;
    public final void rule__Var___Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2938:1: ( ( ( rule__Var___NameAssignment_1_1 ) ) )
            // InternalPascal.g:2939:1: ( ( rule__Var___NameAssignment_1_1 ) )
            {
            // InternalPascal.g:2939:1: ( ( rule__Var___NameAssignment_1_1 ) )
            // InternalPascal.g:2940:2: ( rule__Var___NameAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_Access().getNameAssignment_1_1()); 
            }
            // InternalPascal.g:2941:2: ( rule__Var___NameAssignment_1_1 )
            // InternalPascal.g:2941:3: rule__Var___NameAssignment_1_1
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
    // InternalPascal.g:2949:1: rule__Var___Group_1__2 : rule__Var___Group_1__2__Impl ;
    public final void rule__Var___Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2953:1: ( rule__Var___Group_1__2__Impl )
            // InternalPascal.g:2954:2: rule__Var___Group_1__2__Impl
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
    // InternalPascal.g:2960:1: rule__Var___Group_1__2__Impl : ( ( rule__Var___VariableAssignment_1_2 ) ) ;
    public final void rule__Var___Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2964:1: ( ( ( rule__Var___VariableAssignment_1_2 ) ) )
            // InternalPascal.g:2965:1: ( ( rule__Var___VariableAssignment_1_2 ) )
            {
            // InternalPascal.g:2965:1: ( ( rule__Var___VariableAssignment_1_2 ) )
            // InternalPascal.g:2966:2: ( rule__Var___VariableAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_Access().getVariableAssignment_1_2()); 
            }
            // InternalPascal.g:2967:2: ( rule__Var___VariableAssignment_1_2 )
            // InternalPascal.g:2967:3: rule__Var___VariableAssignment_1_2
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
    // InternalPascal.g:2976:1: rule__Var___Group_2__0 : rule__Var___Group_2__0__Impl rule__Var___Group_2__1 ;
    public final void rule__Var___Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2980:1: ( rule__Var___Group_2__0__Impl rule__Var___Group_2__1 )
            // InternalPascal.g:2981:2: rule__Var___Group_2__0__Impl rule__Var___Group_2__1
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
    // InternalPascal.g:2988:1: rule__Var___Group_2__0__Impl : ( '^' ) ;
    public final void rule__Var___Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2992:1: ( ( '^' ) )
            // InternalPascal.g:2993:1: ( '^' )
            {
            // InternalPascal.g:2993:1: ( '^' )
            // InternalPascal.g:2994:2: '^'
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
    // InternalPascal.g:3003:1: rule__Var___Group_2__1 : rule__Var___Group_2__1__Impl ;
    public final void rule__Var___Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3007:1: ( rule__Var___Group_2__1__Impl )
            // InternalPascal.g:3008:2: rule__Var___Group_2__1__Impl
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
    // InternalPascal.g:3014:1: rule__Var___Group_2__1__Impl : ( ( rule__Var___PointerAssignment_2_1 ) ) ;
    public final void rule__Var___Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3018:1: ( ( ( rule__Var___PointerAssignment_2_1 ) ) )
            // InternalPascal.g:3019:1: ( ( rule__Var___PointerAssignment_2_1 ) )
            {
            // InternalPascal.g:3019:1: ( ( rule__Var___PointerAssignment_2_1 ) )
            // InternalPascal.g:3020:2: ( rule__Var___PointerAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_Access().getPointerAssignment_2_1()); 
            }
            // InternalPascal.g:3021:2: ( rule__Var___PointerAssignment_2_1 )
            // InternalPascal.g:3021:3: rule__Var___PointerAssignment_2_1
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
    // InternalPascal.g:3030:1: rule__Expression_list__Group__0 : rule__Expression_list__Group__0__Impl rule__Expression_list__Group__1 ;
    public final void rule__Expression_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3034:1: ( rule__Expression_list__Group__0__Impl rule__Expression_list__Group__1 )
            // InternalPascal.g:3035:2: rule__Expression_list__Group__0__Impl rule__Expression_list__Group__1
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
    // InternalPascal.g:3042:1: rule__Expression_list__Group__0__Impl : ( ( rule__Expression_list__ExpressionsAssignment_0 ) ) ;
    public final void rule__Expression_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3046:1: ( ( ( rule__Expression_list__ExpressionsAssignment_0 ) ) )
            // InternalPascal.g:3047:1: ( ( rule__Expression_list__ExpressionsAssignment_0 ) )
            {
            // InternalPascal.g:3047:1: ( ( rule__Expression_list__ExpressionsAssignment_0 ) )
            // InternalPascal.g:3048:2: ( rule__Expression_list__ExpressionsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression_listAccess().getExpressionsAssignment_0()); 
            }
            // InternalPascal.g:3049:2: ( rule__Expression_list__ExpressionsAssignment_0 )
            // InternalPascal.g:3049:3: rule__Expression_list__ExpressionsAssignment_0
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
    // InternalPascal.g:3057:1: rule__Expression_list__Group__1 : rule__Expression_list__Group__1__Impl ;
    public final void rule__Expression_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3061:1: ( rule__Expression_list__Group__1__Impl )
            // InternalPascal.g:3062:2: rule__Expression_list__Group__1__Impl
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
    // InternalPascal.g:3068:1: rule__Expression_list__Group__1__Impl : ( ( rule__Expression_list__Group_1__0 )* ) ;
    public final void rule__Expression_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3072:1: ( ( ( rule__Expression_list__Group_1__0 )* ) )
            // InternalPascal.g:3073:1: ( ( rule__Expression_list__Group_1__0 )* )
            {
            // InternalPascal.g:3073:1: ( ( rule__Expression_list__Group_1__0 )* )
            // InternalPascal.g:3074:2: ( rule__Expression_list__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression_listAccess().getGroup_1()); 
            }
            // InternalPascal.g:3075:2: ( rule__Expression_list__Group_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==32) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalPascal.g:3075:3: rule__Expression_list__Group_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Expression_list__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalPascal.g:3084:1: rule__Expression_list__Group_1__0 : rule__Expression_list__Group_1__0__Impl rule__Expression_list__Group_1__1 ;
    public final void rule__Expression_list__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3088:1: ( rule__Expression_list__Group_1__0__Impl rule__Expression_list__Group_1__1 )
            // InternalPascal.g:3089:2: rule__Expression_list__Group_1__0__Impl rule__Expression_list__Group_1__1
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
    // InternalPascal.g:3096:1: rule__Expression_list__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Expression_list__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3100:1: ( ( ',' ) )
            // InternalPascal.g:3101:1: ( ',' )
            {
            // InternalPascal.g:3101:1: ( ',' )
            // InternalPascal.g:3102:2: ','
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
    // InternalPascal.g:3111:1: rule__Expression_list__Group_1__1 : rule__Expression_list__Group_1__1__Impl ;
    public final void rule__Expression_list__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3115:1: ( rule__Expression_list__Group_1__1__Impl )
            // InternalPascal.g:3116:2: rule__Expression_list__Group_1__1__Impl
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
    // InternalPascal.g:3122:1: rule__Expression_list__Group_1__1__Impl : ( ( rule__Expression_list__ExpressionsAssignment_1_1 ) ) ;
    public final void rule__Expression_list__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3126:1: ( ( ( rule__Expression_list__ExpressionsAssignment_1_1 ) ) )
            // InternalPascal.g:3127:1: ( ( rule__Expression_list__ExpressionsAssignment_1_1 ) )
            {
            // InternalPascal.g:3127:1: ( ( rule__Expression_list__ExpressionsAssignment_1_1 ) )
            // InternalPascal.g:3128:2: ( rule__Expression_list__ExpressionsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression_listAccess().getExpressionsAssignment_1_1()); 
            }
            // InternalPascal.g:3129:2: ( rule__Expression_list__ExpressionsAssignment_1_1 )
            // InternalPascal.g:3129:3: rule__Expression_list__ExpressionsAssignment_1_1
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
    // InternalPascal.g:3138:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3142:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // InternalPascal.g:3143:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
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
    // InternalPascal.g:3150:1: rule__Expression__Group__0__Impl : ( ( rule__Expression__ExpressionsAssignment_0 ) ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3154:1: ( ( ( rule__Expression__ExpressionsAssignment_0 ) ) )
            // InternalPascal.g:3155:1: ( ( rule__Expression__ExpressionsAssignment_0 ) )
            {
            // InternalPascal.g:3155:1: ( ( rule__Expression__ExpressionsAssignment_0 ) )
            // InternalPascal.g:3156:2: ( rule__Expression__ExpressionsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getExpressionsAssignment_0()); 
            }
            // InternalPascal.g:3157:2: ( rule__Expression__ExpressionsAssignment_0 )
            // InternalPascal.g:3157:3: rule__Expression__ExpressionsAssignment_0
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
    // InternalPascal.g:3165:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3169:1: ( rule__Expression__Group__1__Impl )
            // InternalPascal.g:3170:2: rule__Expression__Group__1__Impl
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
    // InternalPascal.g:3176:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )? ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3180:1: ( ( ( rule__Expression__Group_1__0 )? ) )
            // InternalPascal.g:3181:1: ( ( rule__Expression__Group_1__0 )? )
            {
            // InternalPascal.g:3181:1: ( ( rule__Expression__Group_1__0 )? )
            // InternalPascal.g:3182:2: ( rule__Expression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getGroup_1()); 
            }
            // InternalPascal.g:3183:2: ( rule__Expression__Group_1__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_RELATIONAL_OP||LA31_0==41||LA31_0==46) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalPascal.g:3183:3: rule__Expression__Group_1__0
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
    // InternalPascal.g:3192:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3196:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // InternalPascal.g:3197:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
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
    // InternalPascal.g:3204:1: rule__Expression__Group_1__0__Impl : ( ( rule__Expression__Alternatives_1_0 ) ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3208:1: ( ( ( rule__Expression__Alternatives_1_0 ) ) )
            // InternalPascal.g:3209:1: ( ( rule__Expression__Alternatives_1_0 ) )
            {
            // InternalPascal.g:3209:1: ( ( rule__Expression__Alternatives_1_0 ) )
            // InternalPascal.g:3210:2: ( rule__Expression__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getAlternatives_1_0()); 
            }
            // InternalPascal.g:3211:2: ( rule__Expression__Alternatives_1_0 )
            // InternalPascal.g:3211:3: rule__Expression__Alternatives_1_0
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
    // InternalPascal.g:3219:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3223:1: ( rule__Expression__Group_1__1__Impl )
            // InternalPascal.g:3224:2: rule__Expression__Group_1__1__Impl
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
    // InternalPascal.g:3230:1: rule__Expression__Group_1__1__Impl : ( ( rule__Expression__ExpressionsAssignment_1_1 ) ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3234:1: ( ( ( rule__Expression__ExpressionsAssignment_1_1 ) ) )
            // InternalPascal.g:3235:1: ( ( rule__Expression__ExpressionsAssignment_1_1 ) )
            {
            // InternalPascal.g:3235:1: ( ( rule__Expression__ExpressionsAssignment_1_1 ) )
            // InternalPascal.g:3236:2: ( rule__Expression__ExpressionsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getExpressionsAssignment_1_1()); 
            }
            // InternalPascal.g:3237:2: ( rule__Expression__ExpressionsAssignment_1_1 )
            // InternalPascal.g:3237:3: rule__Expression__ExpressionsAssignment_1_1
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
    // InternalPascal.g:3246:1: rule__Simple_expression__Group__0 : rule__Simple_expression__Group__0__Impl rule__Simple_expression__Group__1 ;
    public final void rule__Simple_expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3250:1: ( rule__Simple_expression__Group__0__Impl rule__Simple_expression__Group__1 )
            // InternalPascal.g:3251:2: rule__Simple_expression__Group__0__Impl rule__Simple_expression__Group__1
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
    // InternalPascal.g:3258:1: rule__Simple_expression__Group__0__Impl : ( ( rule__Simple_expression__PrefixOperatorAssignment_0 )? ) ;
    public final void rule__Simple_expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3262:1: ( ( ( rule__Simple_expression__PrefixOperatorAssignment_0 )? ) )
            // InternalPascal.g:3263:1: ( ( rule__Simple_expression__PrefixOperatorAssignment_0 )? )
            {
            // InternalPascal.g:3263:1: ( ( rule__Simple_expression__PrefixOperatorAssignment_0 )? )
            // InternalPascal.g:3264:2: ( rule__Simple_expression__PrefixOperatorAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimple_expressionAccess().getPrefixOperatorAssignment_0()); 
            }
            // InternalPascal.g:3265:2: ( rule__Simple_expression__PrefixOperatorAssignment_0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ADDITION_OP) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalPascal.g:3265:3: rule__Simple_expression__PrefixOperatorAssignment_0
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
    // InternalPascal.g:3273:1: rule__Simple_expression__Group__1 : rule__Simple_expression__Group__1__Impl rule__Simple_expression__Group__2 ;
    public final void rule__Simple_expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3277:1: ( rule__Simple_expression__Group__1__Impl rule__Simple_expression__Group__2 )
            // InternalPascal.g:3278:2: rule__Simple_expression__Group__1__Impl rule__Simple_expression__Group__2
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
    // InternalPascal.g:3285:1: rule__Simple_expression__Group__1__Impl : ( ( rule__Simple_expression__TermsAssignment_1 ) ) ;
    public final void rule__Simple_expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3289:1: ( ( ( rule__Simple_expression__TermsAssignment_1 ) ) )
            // InternalPascal.g:3290:1: ( ( rule__Simple_expression__TermsAssignment_1 ) )
            {
            // InternalPascal.g:3290:1: ( ( rule__Simple_expression__TermsAssignment_1 ) )
            // InternalPascal.g:3291:2: ( rule__Simple_expression__TermsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimple_expressionAccess().getTermsAssignment_1()); 
            }
            // InternalPascal.g:3292:2: ( rule__Simple_expression__TermsAssignment_1 )
            // InternalPascal.g:3292:3: rule__Simple_expression__TermsAssignment_1
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
    // InternalPascal.g:3300:1: rule__Simple_expression__Group__2 : rule__Simple_expression__Group__2__Impl ;
    public final void rule__Simple_expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3304:1: ( rule__Simple_expression__Group__2__Impl )
            // InternalPascal.g:3305:2: rule__Simple_expression__Group__2__Impl
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
    // InternalPascal.g:3311:1: rule__Simple_expression__Group__2__Impl : ( ( rule__Simple_expression__Alternatives_2 )* ) ;
    public final void rule__Simple_expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3315:1: ( ( ( rule__Simple_expression__Alternatives_2 )* ) )
            // InternalPascal.g:3316:1: ( ( rule__Simple_expression__Alternatives_2 )* )
            {
            // InternalPascal.g:3316:1: ( ( rule__Simple_expression__Alternatives_2 )* )
            // InternalPascal.g:3317:2: ( rule__Simple_expression__Alternatives_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimple_expressionAccess().getAlternatives_2()); 
            }
            // InternalPascal.g:3318:2: ( rule__Simple_expression__Alternatives_2 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_INTEGER_NUMBER||LA33_0==RULE_ADDITION_OP||LA33_0==RULE_REAL_NUMBER||LA33_0==47) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalPascal.g:3318:3: rule__Simple_expression__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Simple_expression__Alternatives_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalPascal.g:3327:1: rule__Simple_expression__Group_2_0__0 : rule__Simple_expression__Group_2_0__0__Impl rule__Simple_expression__Group_2_0__1 ;
    public final void rule__Simple_expression__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3331:1: ( rule__Simple_expression__Group_2_0__0__Impl rule__Simple_expression__Group_2_0__1 )
            // InternalPascal.g:3332:2: rule__Simple_expression__Group_2_0__0__Impl rule__Simple_expression__Group_2_0__1
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
    // InternalPascal.g:3339:1: rule__Simple_expression__Group_2_0__0__Impl : ( ( rule__Simple_expression__Alternatives_2_0_0 ) ) ;
    public final void rule__Simple_expression__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3343:1: ( ( ( rule__Simple_expression__Alternatives_2_0_0 ) ) )
            // InternalPascal.g:3344:1: ( ( rule__Simple_expression__Alternatives_2_0_0 ) )
            {
            // InternalPascal.g:3344:1: ( ( rule__Simple_expression__Alternatives_2_0_0 ) )
            // InternalPascal.g:3345:2: ( rule__Simple_expression__Alternatives_2_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimple_expressionAccess().getAlternatives_2_0_0()); 
            }
            // InternalPascal.g:3346:2: ( rule__Simple_expression__Alternatives_2_0_0 )
            // InternalPascal.g:3346:3: rule__Simple_expression__Alternatives_2_0_0
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
    // InternalPascal.g:3354:1: rule__Simple_expression__Group_2_0__1 : rule__Simple_expression__Group_2_0__1__Impl ;
    public final void rule__Simple_expression__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3358:1: ( rule__Simple_expression__Group_2_0__1__Impl )
            // InternalPascal.g:3359:2: rule__Simple_expression__Group_2_0__1__Impl
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
    // InternalPascal.g:3365:1: rule__Simple_expression__Group_2_0__1__Impl : ( ( rule__Simple_expression__TermsAssignment_2_0_1 ) ) ;
    public final void rule__Simple_expression__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3369:1: ( ( ( rule__Simple_expression__TermsAssignment_2_0_1 ) ) )
            // InternalPascal.g:3370:1: ( ( rule__Simple_expression__TermsAssignment_2_0_1 ) )
            {
            // InternalPascal.g:3370:1: ( ( rule__Simple_expression__TermsAssignment_2_0_1 ) )
            // InternalPascal.g:3371:2: ( rule__Simple_expression__TermsAssignment_2_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimple_expressionAccess().getTermsAssignment_2_0_1()); 
            }
            // InternalPascal.g:3372:2: ( rule__Simple_expression__TermsAssignment_2_0_1 )
            // InternalPascal.g:3372:3: rule__Simple_expression__TermsAssignment_2_0_1
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
    // InternalPascal.g:3381:1: rule__Term__Group__0 : rule__Term__Group__0__Impl rule__Term__Group__1 ;
    public final void rule__Term__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3385:1: ( rule__Term__Group__0__Impl rule__Term__Group__1 )
            // InternalPascal.g:3386:2: rule__Term__Group__0__Impl rule__Term__Group__1
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
    // InternalPascal.g:3393:1: rule__Term__Group__0__Impl : ( ( rule__Term__FactorsAssignment_0 ) ) ;
    public final void rule__Term__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3397:1: ( ( ( rule__Term__FactorsAssignment_0 ) ) )
            // InternalPascal.g:3398:1: ( ( rule__Term__FactorsAssignment_0 ) )
            {
            // InternalPascal.g:3398:1: ( ( rule__Term__FactorsAssignment_0 ) )
            // InternalPascal.g:3399:2: ( rule__Term__FactorsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getFactorsAssignment_0()); 
            }
            // InternalPascal.g:3400:2: ( rule__Term__FactorsAssignment_0 )
            // InternalPascal.g:3400:3: rule__Term__FactorsAssignment_0
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
    // InternalPascal.g:3408:1: rule__Term__Group__1 : rule__Term__Group__1__Impl ;
    public final void rule__Term__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3412:1: ( rule__Term__Group__1__Impl )
            // InternalPascal.g:3413:2: rule__Term__Group__1__Impl
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
    // InternalPascal.g:3419:1: rule__Term__Group__1__Impl : ( ( rule__Term__Group_1__0 )* ) ;
    public final void rule__Term__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3423:1: ( ( ( rule__Term__Group_1__0 )* ) )
            // InternalPascal.g:3424:1: ( ( rule__Term__Group_1__0 )* )
            {
            // InternalPascal.g:3424:1: ( ( rule__Term__Group_1__0 )* )
            // InternalPascal.g:3425:2: ( rule__Term__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getGroup_1()); 
            }
            // InternalPascal.g:3426:2: ( rule__Term__Group_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_MULTIPLICATION_OP||(LA34_0>=48 && LA34_0<=50)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalPascal.g:3426:3: rule__Term__Group_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Term__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
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
    // InternalPascal.g:3435:1: rule__Term__Group_1__0 : rule__Term__Group_1__0__Impl rule__Term__Group_1__1 ;
    public final void rule__Term__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3439:1: ( rule__Term__Group_1__0__Impl rule__Term__Group_1__1 )
            // InternalPascal.g:3440:2: rule__Term__Group_1__0__Impl rule__Term__Group_1__1
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
    // InternalPascal.g:3447:1: rule__Term__Group_1__0__Impl : ( ( rule__Term__Alternatives_1_0 ) ) ;
    public final void rule__Term__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3451:1: ( ( ( rule__Term__Alternatives_1_0 ) ) )
            // InternalPascal.g:3452:1: ( ( rule__Term__Alternatives_1_0 ) )
            {
            // InternalPascal.g:3452:1: ( ( rule__Term__Alternatives_1_0 ) )
            // InternalPascal.g:3453:2: ( rule__Term__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getAlternatives_1_0()); 
            }
            // InternalPascal.g:3454:2: ( rule__Term__Alternatives_1_0 )
            // InternalPascal.g:3454:3: rule__Term__Alternatives_1_0
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
    // InternalPascal.g:3462:1: rule__Term__Group_1__1 : rule__Term__Group_1__1__Impl ;
    public final void rule__Term__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3466:1: ( rule__Term__Group_1__1__Impl )
            // InternalPascal.g:3467:2: rule__Term__Group_1__1__Impl
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
    // InternalPascal.g:3473:1: rule__Term__Group_1__1__Impl : ( ( rule__Term__FactorsAssignment_1_1 ) ) ;
    public final void rule__Term__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3477:1: ( ( ( rule__Term__FactorsAssignment_1_1 ) ) )
            // InternalPascal.g:3478:1: ( ( rule__Term__FactorsAssignment_1_1 ) )
            {
            // InternalPascal.g:3478:1: ( ( rule__Term__FactorsAssignment_1_1 ) )
            // InternalPascal.g:3479:2: ( rule__Term__FactorsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getFactorsAssignment_1_1()); 
            }
            // InternalPascal.g:3480:2: ( rule__Term__FactorsAssignment_1_1 )
            // InternalPascal.g:3480:3: rule__Term__FactorsAssignment_1_1
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
    // InternalPascal.g:3489:1: rule__Factor__Group_8__0 : rule__Factor__Group_8__0__Impl rule__Factor__Group_8__1 ;
    public final void rule__Factor__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3493:1: ( rule__Factor__Group_8__0__Impl rule__Factor__Group_8__1 )
            // InternalPascal.g:3494:2: rule__Factor__Group_8__0__Impl rule__Factor__Group_8__1
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
    // InternalPascal.g:3501:1: rule__Factor__Group_8__0__Impl : ( '(' ) ;
    public final void rule__Factor__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3505:1: ( ( '(' ) )
            // InternalPascal.g:3506:1: ( '(' )
            {
            // InternalPascal.g:3506:1: ( '(' )
            // InternalPascal.g:3507:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getLeftParenthesisKeyword_8_0()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:3516:1: rule__Factor__Group_8__1 : rule__Factor__Group_8__1__Impl rule__Factor__Group_8__2 ;
    public final void rule__Factor__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3520:1: ( rule__Factor__Group_8__1__Impl rule__Factor__Group_8__2 )
            // InternalPascal.g:3521:2: rule__Factor__Group_8__1__Impl rule__Factor__Group_8__2
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
    // InternalPascal.g:3528:1: rule__Factor__Group_8__1__Impl : ( ( rule__Factor__ExpressionAssignment_8_1 ) ) ;
    public final void rule__Factor__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3532:1: ( ( ( rule__Factor__ExpressionAssignment_8_1 ) ) )
            // InternalPascal.g:3533:1: ( ( rule__Factor__ExpressionAssignment_8_1 ) )
            {
            // InternalPascal.g:3533:1: ( ( rule__Factor__ExpressionAssignment_8_1 ) )
            // InternalPascal.g:3534:2: ( rule__Factor__ExpressionAssignment_8_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getExpressionAssignment_8_1()); 
            }
            // InternalPascal.g:3535:2: ( rule__Factor__ExpressionAssignment_8_1 )
            // InternalPascal.g:3535:3: rule__Factor__ExpressionAssignment_8_1
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
    // InternalPascal.g:3543:1: rule__Factor__Group_8__2 : rule__Factor__Group_8__2__Impl ;
    public final void rule__Factor__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3547:1: ( rule__Factor__Group_8__2__Impl )
            // InternalPascal.g:3548:2: rule__Factor__Group_8__2__Impl
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
    // InternalPascal.g:3554:1: rule__Factor__Group_8__2__Impl : ( ')' ) ;
    public final void rule__Factor__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3558:1: ( ( ')' ) )
            // InternalPascal.g:3559:1: ( ')' )
            {
            // InternalPascal.g:3559:1: ( ')' )
            // InternalPascal.g:3560:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getRightParenthesisKeyword_8_2()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:3570:1: rule__Factor__Group_9__0 : rule__Factor__Group_9__0__Impl rule__Factor__Group_9__1 ;
    public final void rule__Factor__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3574:1: ( rule__Factor__Group_9__0__Impl rule__Factor__Group_9__1 )
            // InternalPascal.g:3575:2: rule__Factor__Group_9__0__Impl rule__Factor__Group_9__1
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
    // InternalPascal.g:3582:1: rule__Factor__Group_9__0__Impl : ( 'not' ) ;
    public final void rule__Factor__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3586:1: ( ( 'not' ) )
            // InternalPascal.g:3587:1: ( 'not' )
            {
            // InternalPascal.g:3587:1: ( 'not' )
            // InternalPascal.g:3588:2: 'not'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getNotKeyword_9_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:3597:1: rule__Factor__Group_9__1 : rule__Factor__Group_9__1__Impl ;
    public final void rule__Factor__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3601:1: ( rule__Factor__Group_9__1__Impl )
            // InternalPascal.g:3602:2: rule__Factor__Group_9__1__Impl
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
    // InternalPascal.g:3608:1: rule__Factor__Group_9__1__Impl : ( ( rule__Factor__NotAssignment_9_1 ) ) ;
    public final void rule__Factor__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3612:1: ( ( ( rule__Factor__NotAssignment_9_1 ) ) )
            // InternalPascal.g:3613:1: ( ( rule__Factor__NotAssignment_9_1 ) )
            {
            // InternalPascal.g:3613:1: ( ( rule__Factor__NotAssignment_9_1 ) )
            // InternalPascal.g:3614:2: ( rule__Factor__NotAssignment_9_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getNotAssignment_9_1()); 
            }
            // InternalPascal.g:3615:2: ( rule__Factor__NotAssignment_9_1 )
            // InternalPascal.g:3615:3: rule__Factor__NotAssignment_9_1
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
    // InternalPascal.g:3624:1: rule__Function_designator__Group__0 : rule__Function_designator__Group__0__Impl rule__Function_designator__Group__1 ;
    public final void rule__Function_designator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3628:1: ( rule__Function_designator__Group__0__Impl rule__Function_designator__Group__1 )
            // InternalPascal.g:3629:2: rule__Function_designator__Group__0__Impl rule__Function_designator__Group__1
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
    // InternalPascal.g:3636:1: rule__Function_designator__Group__0__Impl : ( ( rule__Function_designator__NameAssignment_0 ) ) ;
    public final void rule__Function_designator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3640:1: ( ( ( rule__Function_designator__NameAssignment_0 ) ) )
            // InternalPascal.g:3641:1: ( ( rule__Function_designator__NameAssignment_0 ) )
            {
            // InternalPascal.g:3641:1: ( ( rule__Function_designator__NameAssignment_0 ) )
            // InternalPascal.g:3642:2: ( rule__Function_designator__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_designatorAccess().getNameAssignment_0()); 
            }
            // InternalPascal.g:3643:2: ( rule__Function_designator__NameAssignment_0 )
            // InternalPascal.g:3643:3: rule__Function_designator__NameAssignment_0
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
    // InternalPascal.g:3651:1: rule__Function_designator__Group__1 : rule__Function_designator__Group__1__Impl rule__Function_designator__Group__2 ;
    public final void rule__Function_designator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3655:1: ( rule__Function_designator__Group__1__Impl rule__Function_designator__Group__2 )
            // InternalPascal.g:3656:2: rule__Function_designator__Group__1__Impl rule__Function_designator__Group__2
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
    // InternalPascal.g:3663:1: rule__Function_designator__Group__1__Impl : ( '(' ) ;
    public final void rule__Function_designator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3667:1: ( ( '(' ) )
            // InternalPascal.g:3668:1: ( '(' )
            {
            // InternalPascal.g:3668:1: ( '(' )
            // InternalPascal.g:3669:2: '('
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
    // InternalPascal.g:3678:1: rule__Function_designator__Group__2 : rule__Function_designator__Group__2__Impl rule__Function_designator__Group__3 ;
    public final void rule__Function_designator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3682:1: ( rule__Function_designator__Group__2__Impl rule__Function_designator__Group__3 )
            // InternalPascal.g:3683:2: rule__Function_designator__Group__2__Impl rule__Function_designator__Group__3
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
    // InternalPascal.g:3690:1: rule__Function_designator__Group__2__Impl : ( ( rule__Function_designator__ExpressionsAssignment_2 )? ) ;
    public final void rule__Function_designator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3694:1: ( ( ( rule__Function_designator__ExpressionsAssignment_2 )? ) )
            // InternalPascal.g:3695:1: ( ( rule__Function_designator__ExpressionsAssignment_2 )? )
            {
            // InternalPascal.g:3695:1: ( ( rule__Function_designator__ExpressionsAssignment_2 )? )
            // InternalPascal.g:3696:2: ( rule__Function_designator__ExpressionsAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_designatorAccess().getExpressionsAssignment_2()); 
            }
            // InternalPascal.g:3697:2: ( rule__Function_designator__ExpressionsAssignment_2 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=RULE_ID && LA35_0<=RULE_INTEGER_NUMBER)||LA35_0==RULE_ADDITION_OP||LA35_0==RULE_STRING||(LA35_0>=RULE_SIGNED_REAL_NUMBER && LA35_0<=RULE_REAL_NUMBER)||LA35_0==29||LA35_0==33||LA35_0==35||(LA35_0>=51 && LA35_0<=53)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalPascal.g:3697:3: rule__Function_designator__ExpressionsAssignment_2
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
    // InternalPascal.g:3705:1: rule__Function_designator__Group__3 : rule__Function_designator__Group__3__Impl ;
    public final void rule__Function_designator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3709:1: ( rule__Function_designator__Group__3__Impl )
            // InternalPascal.g:3710:2: rule__Function_designator__Group__3__Impl
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
    // InternalPascal.g:3716:1: rule__Function_designator__Group__3__Impl : ( ')' ) ;
    public final void rule__Function_designator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3720:1: ( ( ')' ) )
            // InternalPascal.g:3721:1: ( ')' )
            {
            // InternalPascal.g:3721:1: ( ')' )
            // InternalPascal.g:3722:2: ')'
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
    // InternalPascal.g:3732:1: rule__Function_procedure_declaration__Group__0 : rule__Function_procedure_declaration__Group__0__Impl rule__Function_procedure_declaration__Group__1 ;
    public final void rule__Function_procedure_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3736:1: ( rule__Function_procedure_declaration__Group__0__Impl rule__Function_procedure_declaration__Group__1 )
            // InternalPascal.g:3737:2: rule__Function_procedure_declaration__Group__0__Impl rule__Function_procedure_declaration__Group__1
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
    // InternalPascal.g:3744:1: rule__Function_procedure_declaration__Group__0__Impl : ( ( rule__Function_procedure_declaration__Alternatives_0 ) ) ;
    public final void rule__Function_procedure_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3748:1: ( ( ( rule__Function_procedure_declaration__Alternatives_0 ) ) )
            // InternalPascal.g:3749:1: ( ( rule__Function_procedure_declaration__Alternatives_0 ) )
            {
            // InternalPascal.g:3749:1: ( ( rule__Function_procedure_declaration__Alternatives_0 ) )
            // InternalPascal.g:3750:2: ( rule__Function_procedure_declaration__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_procedure_declarationAccess().getAlternatives_0()); 
            }
            // InternalPascal.g:3751:2: ( rule__Function_procedure_declaration__Alternatives_0 )
            // InternalPascal.g:3751:3: rule__Function_procedure_declaration__Alternatives_0
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
    // InternalPascal.g:3759:1: rule__Function_procedure_declaration__Group__1 : rule__Function_procedure_declaration__Group__1__Impl ;
    public final void rule__Function_procedure_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3763:1: ( rule__Function_procedure_declaration__Group__1__Impl )
            // InternalPascal.g:3764:2: rule__Function_procedure_declaration__Group__1__Impl
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
    // InternalPascal.g:3770:1: rule__Function_procedure_declaration__Group__1__Impl : ( ';' ) ;
    public final void rule__Function_procedure_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3774:1: ( ( ';' ) )
            // InternalPascal.g:3775:1: ( ';' )
            {
            // InternalPascal.g:3775:1: ( ';' )
            // InternalPascal.g:3776:2: ';'
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


    // $ANTLR start "rule__Function_heading__Group__0"
    // InternalPascal.g:3786:1: rule__Function_heading__Group__0 : rule__Function_heading__Group__0__Impl rule__Function_heading__Group__1 ;
    public final void rule__Function_heading__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3790:1: ( rule__Function_heading__Group__0__Impl rule__Function_heading__Group__1 )
            // InternalPascal.g:3791:2: rule__Function_heading__Group__0__Impl rule__Function_heading__Group__1
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
    // InternalPascal.g:3798:1: rule__Function_heading__Group__0__Impl : ( 'function' ) ;
    public final void rule__Function_heading__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3802:1: ( ( 'function' ) )
            // InternalPascal.g:3803:1: ( 'function' )
            {
            // InternalPascal.g:3803:1: ( 'function' )
            // InternalPascal.g:3804:2: 'function'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_headingAccess().getFunctionKeyword_0()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:3813:1: rule__Function_heading__Group__1 : rule__Function_heading__Group__1__Impl rule__Function_heading__Group__2 ;
    public final void rule__Function_heading__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3817:1: ( rule__Function_heading__Group__1__Impl rule__Function_heading__Group__2 )
            // InternalPascal.g:3818:2: rule__Function_heading__Group__1__Impl rule__Function_heading__Group__2
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
    // InternalPascal.g:3825:1: rule__Function_heading__Group__1__Impl : ( ( rule__Function_heading__NameAssignment_1 ) ) ;
    public final void rule__Function_heading__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3829:1: ( ( ( rule__Function_heading__NameAssignment_1 ) ) )
            // InternalPascal.g:3830:1: ( ( rule__Function_heading__NameAssignment_1 ) )
            {
            // InternalPascal.g:3830:1: ( ( rule__Function_heading__NameAssignment_1 ) )
            // InternalPascal.g:3831:2: ( rule__Function_heading__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_headingAccess().getNameAssignment_1()); 
            }
            // InternalPascal.g:3832:2: ( rule__Function_heading__NameAssignment_1 )
            // InternalPascal.g:3832:3: rule__Function_heading__NameAssignment_1
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
    // InternalPascal.g:3840:1: rule__Function_heading__Group__2 : rule__Function_heading__Group__2__Impl rule__Function_heading__Group__3 ;
    public final void rule__Function_heading__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3844:1: ( rule__Function_heading__Group__2__Impl rule__Function_heading__Group__3 )
            // InternalPascal.g:3845:2: rule__Function_heading__Group__2__Impl rule__Function_heading__Group__3
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
    // InternalPascal.g:3852:1: rule__Function_heading__Group__2__Impl : ( ( rule__Function_heading__ParametersAssignment_2 )? ) ;
    public final void rule__Function_heading__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3856:1: ( ( ( rule__Function_heading__ParametersAssignment_2 )? ) )
            // InternalPascal.g:3857:1: ( ( rule__Function_heading__ParametersAssignment_2 )? )
            {
            // InternalPascal.g:3857:1: ( ( rule__Function_heading__ParametersAssignment_2 )? )
            // InternalPascal.g:3858:2: ( rule__Function_heading__ParametersAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_headingAccess().getParametersAssignment_2()); 
            }
            // InternalPascal.g:3859:2: ( rule__Function_heading__ParametersAssignment_2 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==33) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalPascal.g:3859:3: rule__Function_heading__ParametersAssignment_2
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
    // InternalPascal.g:3867:1: rule__Function_heading__Group__3 : rule__Function_heading__Group__3__Impl rule__Function_heading__Group__4 ;
    public final void rule__Function_heading__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3871:1: ( rule__Function_heading__Group__3__Impl rule__Function_heading__Group__4 )
            // InternalPascal.g:3872:2: rule__Function_heading__Group__3__Impl rule__Function_heading__Group__4
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
    // InternalPascal.g:3879:1: rule__Function_heading__Group__3__Impl : ( ':' ) ;
    public final void rule__Function_heading__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3883:1: ( ( ':' ) )
            // InternalPascal.g:3884:1: ( ':' )
            {
            // InternalPascal.g:3884:1: ( ':' )
            // InternalPascal.g:3885:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_headingAccess().getColonKeyword_3()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:3894:1: rule__Function_heading__Group__4 : rule__Function_heading__Group__4__Impl ;
    public final void rule__Function_heading__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3898:1: ( rule__Function_heading__Group__4__Impl )
            // InternalPascal.g:3899:2: rule__Function_heading__Group__4__Impl
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
    // InternalPascal.g:3905:1: rule__Function_heading__Group__4__Impl : ( ( rule__Function_heading__ReturnTypeAssignment_4 ) ) ;
    public final void rule__Function_heading__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3909:1: ( ( ( rule__Function_heading__ReturnTypeAssignment_4 ) ) )
            // InternalPascal.g:3910:1: ( ( rule__Function_heading__ReturnTypeAssignment_4 ) )
            {
            // InternalPascal.g:3910:1: ( ( rule__Function_heading__ReturnTypeAssignment_4 ) )
            // InternalPascal.g:3911:2: ( rule__Function_heading__ReturnTypeAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_headingAccess().getReturnTypeAssignment_4()); 
            }
            // InternalPascal.g:3912:2: ( rule__Function_heading__ReturnTypeAssignment_4 )
            // InternalPascal.g:3912:3: rule__Function_heading__ReturnTypeAssignment_4
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
    // InternalPascal.g:3921:1: rule__Function_declaration__Group__0 : rule__Function_declaration__Group__0__Impl rule__Function_declaration__Group__1 ;
    public final void rule__Function_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3925:1: ( rule__Function_declaration__Group__0__Impl rule__Function_declaration__Group__1 )
            // InternalPascal.g:3926:2: rule__Function_declaration__Group__0__Impl rule__Function_declaration__Group__1
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
    // InternalPascal.g:3933:1: rule__Function_declaration__Group__0__Impl : ( ( rule__Function_declaration__HeadingAssignment_0 ) ) ;
    public final void rule__Function_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3937:1: ( ( ( rule__Function_declaration__HeadingAssignment_0 ) ) )
            // InternalPascal.g:3938:1: ( ( rule__Function_declaration__HeadingAssignment_0 ) )
            {
            // InternalPascal.g:3938:1: ( ( rule__Function_declaration__HeadingAssignment_0 ) )
            // InternalPascal.g:3939:2: ( rule__Function_declaration__HeadingAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_declarationAccess().getHeadingAssignment_0()); 
            }
            // InternalPascal.g:3940:2: ( rule__Function_declaration__HeadingAssignment_0 )
            // InternalPascal.g:3940:3: rule__Function_declaration__HeadingAssignment_0
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
    // InternalPascal.g:3948:1: rule__Function_declaration__Group__1 : rule__Function_declaration__Group__1__Impl rule__Function_declaration__Group__2 ;
    public final void rule__Function_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3952:1: ( rule__Function_declaration__Group__1__Impl rule__Function_declaration__Group__2 )
            // InternalPascal.g:3953:2: rule__Function_declaration__Group__1__Impl rule__Function_declaration__Group__2
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
    // InternalPascal.g:3960:1: rule__Function_declaration__Group__1__Impl : ( ';' ) ;
    public final void rule__Function_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3964:1: ( ( ';' ) )
            // InternalPascal.g:3965:1: ( ';' )
            {
            // InternalPascal.g:3965:1: ( ';' )
            // InternalPascal.g:3966:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_declarationAccess().getSemicolonKeyword_1()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:3975:1: rule__Function_declaration__Group__2 : rule__Function_declaration__Group__2__Impl ;
    public final void rule__Function_declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3979:1: ( rule__Function_declaration__Group__2__Impl )
            // InternalPascal.g:3980:2: rule__Function_declaration__Group__2__Impl
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
    // InternalPascal.g:3986:1: rule__Function_declaration__Group__2__Impl : ( ( rule__Function_declaration__BlockAssignment_2 ) ) ;
    public final void rule__Function_declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3990:1: ( ( ( rule__Function_declaration__BlockAssignment_2 ) ) )
            // InternalPascal.g:3991:1: ( ( rule__Function_declaration__BlockAssignment_2 ) )
            {
            // InternalPascal.g:3991:1: ( ( rule__Function_declaration__BlockAssignment_2 ) )
            // InternalPascal.g:3992:2: ( rule__Function_declaration__BlockAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_declarationAccess().getBlockAssignment_2()); 
            }
            // InternalPascal.g:3993:2: ( rule__Function_declaration__BlockAssignment_2 )
            // InternalPascal.g:3993:3: rule__Function_declaration__BlockAssignment_2
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
    // InternalPascal.g:4002:1: rule__Formal_parameter_list__Group__0 : rule__Formal_parameter_list__Group__0__Impl rule__Formal_parameter_list__Group__1 ;
    public final void rule__Formal_parameter_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4006:1: ( rule__Formal_parameter_list__Group__0__Impl rule__Formal_parameter_list__Group__1 )
            // InternalPascal.g:4007:2: rule__Formal_parameter_list__Group__0__Impl rule__Formal_parameter_list__Group__1
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
    // InternalPascal.g:4014:1: rule__Formal_parameter_list__Group__0__Impl : ( '(' ) ;
    public final void rule__Formal_parameter_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4018:1: ( ( '(' ) )
            // InternalPascal.g:4019:1: ( '(' )
            {
            // InternalPascal.g:4019:1: ( '(' )
            // InternalPascal.g:4020:2: '('
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
    // InternalPascal.g:4029:1: rule__Formal_parameter_list__Group__1 : rule__Formal_parameter_list__Group__1__Impl rule__Formal_parameter_list__Group__2 ;
    public final void rule__Formal_parameter_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4033:1: ( rule__Formal_parameter_list__Group__1__Impl rule__Formal_parameter_list__Group__2 )
            // InternalPascal.g:4034:2: rule__Formal_parameter_list__Group__1__Impl rule__Formal_parameter_list__Group__2
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
    // InternalPascal.g:4041:1: rule__Formal_parameter_list__Group__1__Impl : ( ( rule__Formal_parameter_list__ParametersAssignment_1 ) ) ;
    public final void rule__Formal_parameter_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4045:1: ( ( ( rule__Formal_parameter_list__ParametersAssignment_1 ) ) )
            // InternalPascal.g:4046:1: ( ( rule__Formal_parameter_list__ParametersAssignment_1 ) )
            {
            // InternalPascal.g:4046:1: ( ( rule__Formal_parameter_list__ParametersAssignment_1 ) )
            // InternalPascal.g:4047:2: ( rule__Formal_parameter_list__ParametersAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormal_parameter_listAccess().getParametersAssignment_1()); 
            }
            // InternalPascal.g:4048:2: ( rule__Formal_parameter_list__ParametersAssignment_1 )
            // InternalPascal.g:4048:3: rule__Formal_parameter_list__ParametersAssignment_1
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
    // InternalPascal.g:4056:1: rule__Formal_parameter_list__Group__2 : rule__Formal_parameter_list__Group__2__Impl rule__Formal_parameter_list__Group__3 ;
    public final void rule__Formal_parameter_list__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4060:1: ( rule__Formal_parameter_list__Group__2__Impl rule__Formal_parameter_list__Group__3 )
            // InternalPascal.g:4061:2: rule__Formal_parameter_list__Group__2__Impl rule__Formal_parameter_list__Group__3
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
    // InternalPascal.g:4068:1: rule__Formal_parameter_list__Group__2__Impl : ( ( rule__Formal_parameter_list__Group_2__0 )* ) ;
    public final void rule__Formal_parameter_list__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4072:1: ( ( ( rule__Formal_parameter_list__Group_2__0 )* ) )
            // InternalPascal.g:4073:1: ( ( rule__Formal_parameter_list__Group_2__0 )* )
            {
            // InternalPascal.g:4073:1: ( ( rule__Formal_parameter_list__Group_2__0 )* )
            // InternalPascal.g:4074:2: ( rule__Formal_parameter_list__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormal_parameter_listAccess().getGroup_2()); 
            }
            // InternalPascal.g:4075:2: ( rule__Formal_parameter_list__Group_2__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==24) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalPascal.g:4075:3: rule__Formal_parameter_list__Group_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Formal_parameter_list__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop37;
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
    // InternalPascal.g:4083:1: rule__Formal_parameter_list__Group__3 : rule__Formal_parameter_list__Group__3__Impl ;
    public final void rule__Formal_parameter_list__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4087:1: ( rule__Formal_parameter_list__Group__3__Impl )
            // InternalPascal.g:4088:2: rule__Formal_parameter_list__Group__3__Impl
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
    // InternalPascal.g:4094:1: rule__Formal_parameter_list__Group__3__Impl : ( ')' ) ;
    public final void rule__Formal_parameter_list__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4098:1: ( ( ')' ) )
            // InternalPascal.g:4099:1: ( ')' )
            {
            // InternalPascal.g:4099:1: ( ')' )
            // InternalPascal.g:4100:2: ')'
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
    // InternalPascal.g:4110:1: rule__Formal_parameter_list__Group_2__0 : rule__Formal_parameter_list__Group_2__0__Impl rule__Formal_parameter_list__Group_2__1 ;
    public final void rule__Formal_parameter_list__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4114:1: ( rule__Formal_parameter_list__Group_2__0__Impl rule__Formal_parameter_list__Group_2__1 )
            // InternalPascal.g:4115:2: rule__Formal_parameter_list__Group_2__0__Impl rule__Formal_parameter_list__Group_2__1
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
    // InternalPascal.g:4122:1: rule__Formal_parameter_list__Group_2__0__Impl : ( ';' ) ;
    public final void rule__Formal_parameter_list__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4126:1: ( ( ';' ) )
            // InternalPascal.g:4127:1: ( ';' )
            {
            // InternalPascal.g:4127:1: ( ';' )
            // InternalPascal.g:4128:2: ';'
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
    // InternalPascal.g:4137:1: rule__Formal_parameter_list__Group_2__1 : rule__Formal_parameter_list__Group_2__1__Impl ;
    public final void rule__Formal_parameter_list__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4141:1: ( rule__Formal_parameter_list__Group_2__1__Impl )
            // InternalPascal.g:4142:2: rule__Formal_parameter_list__Group_2__1__Impl
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
    // InternalPascal.g:4148:1: rule__Formal_parameter_list__Group_2__1__Impl : ( ( rule__Formal_parameter_list__ParametersAssignment_2_1 ) ) ;
    public final void rule__Formal_parameter_list__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4152:1: ( ( ( rule__Formal_parameter_list__ParametersAssignment_2_1 ) ) )
            // InternalPascal.g:4153:1: ( ( rule__Formal_parameter_list__ParametersAssignment_2_1 ) )
            {
            // InternalPascal.g:4153:1: ( ( rule__Formal_parameter_list__ParametersAssignment_2_1 ) )
            // InternalPascal.g:4154:2: ( rule__Formal_parameter_list__ParametersAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormal_parameter_listAccess().getParametersAssignment_2_1()); 
            }
            // InternalPascal.g:4155:2: ( rule__Formal_parameter_list__ParametersAssignment_2_1 )
            // InternalPascal.g:4155:3: rule__Formal_parameter_list__ParametersAssignment_2_1
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
    // InternalPascal.g:4164:1: rule__Value_parameter_section__Group__0 : rule__Value_parameter_section__Group__0__Impl rule__Value_parameter_section__Group__1 ;
    public final void rule__Value_parameter_section__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4168:1: ( rule__Value_parameter_section__Group__0__Impl rule__Value_parameter_section__Group__1 )
            // InternalPascal.g:4169:2: rule__Value_parameter_section__Group__0__Impl rule__Value_parameter_section__Group__1
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
    // InternalPascal.g:4176:1: rule__Value_parameter_section__Group__0__Impl : ( ( rule__Value_parameter_section__IdentifiersAssignment_0 ) ) ;
    public final void rule__Value_parameter_section__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4180:1: ( ( ( rule__Value_parameter_section__IdentifiersAssignment_0 ) ) )
            // InternalPascal.g:4181:1: ( ( rule__Value_parameter_section__IdentifiersAssignment_0 ) )
            {
            // InternalPascal.g:4181:1: ( ( rule__Value_parameter_section__IdentifiersAssignment_0 ) )
            // InternalPascal.g:4182:2: ( rule__Value_parameter_section__IdentifiersAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValue_parameter_sectionAccess().getIdentifiersAssignment_0()); 
            }
            // InternalPascal.g:4183:2: ( rule__Value_parameter_section__IdentifiersAssignment_0 )
            // InternalPascal.g:4183:3: rule__Value_parameter_section__IdentifiersAssignment_0
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
    // InternalPascal.g:4191:1: rule__Value_parameter_section__Group__1 : rule__Value_parameter_section__Group__1__Impl rule__Value_parameter_section__Group__2 ;
    public final void rule__Value_parameter_section__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4195:1: ( rule__Value_parameter_section__Group__1__Impl rule__Value_parameter_section__Group__2 )
            // InternalPascal.g:4196:2: rule__Value_parameter_section__Group__1__Impl rule__Value_parameter_section__Group__2
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
    // InternalPascal.g:4203:1: rule__Value_parameter_section__Group__1__Impl : ( ':' ) ;
    public final void rule__Value_parameter_section__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4207:1: ( ( ':' ) )
            // InternalPascal.g:4208:1: ( ':' )
            {
            // InternalPascal.g:4208:1: ( ':' )
            // InternalPascal.g:4209:2: ':'
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
    // InternalPascal.g:4218:1: rule__Value_parameter_section__Group__2 : rule__Value_parameter_section__Group__2__Impl ;
    public final void rule__Value_parameter_section__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4222:1: ( rule__Value_parameter_section__Group__2__Impl )
            // InternalPascal.g:4223:2: rule__Value_parameter_section__Group__2__Impl
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
    // InternalPascal.g:4229:1: rule__Value_parameter_section__Group__2__Impl : ( ( rule__Value_parameter_section__TypeAssignment_2 ) ) ;
    public final void rule__Value_parameter_section__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4233:1: ( ( ( rule__Value_parameter_section__TypeAssignment_2 ) ) )
            // InternalPascal.g:4234:1: ( ( rule__Value_parameter_section__TypeAssignment_2 ) )
            {
            // InternalPascal.g:4234:1: ( ( rule__Value_parameter_section__TypeAssignment_2 ) )
            // InternalPascal.g:4235:2: ( rule__Value_parameter_section__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValue_parameter_sectionAccess().getTypeAssignment_2()); 
            }
            // InternalPascal.g:4236:2: ( rule__Value_parameter_section__TypeAssignment_2 )
            // InternalPascal.g:4236:3: rule__Value_parameter_section__TypeAssignment_2
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
    // InternalPascal.g:4245:1: rule__Identifier_list__Group__0 : rule__Identifier_list__Group__0__Impl rule__Identifier_list__Group__1 ;
    public final void rule__Identifier_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4249:1: ( rule__Identifier_list__Group__0__Impl rule__Identifier_list__Group__1 )
            // InternalPascal.g:4250:2: rule__Identifier_list__Group__0__Impl rule__Identifier_list__Group__1
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
    // InternalPascal.g:4257:1: rule__Identifier_list__Group__0__Impl : ( ( rule__Identifier_list__NamesAssignment_0 ) ) ;
    public final void rule__Identifier_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4261:1: ( ( ( rule__Identifier_list__NamesAssignment_0 ) ) )
            // InternalPascal.g:4262:1: ( ( rule__Identifier_list__NamesAssignment_0 ) )
            {
            // InternalPascal.g:4262:1: ( ( rule__Identifier_list__NamesAssignment_0 ) )
            // InternalPascal.g:4263:2: ( rule__Identifier_list__NamesAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifier_listAccess().getNamesAssignment_0()); 
            }
            // InternalPascal.g:4264:2: ( rule__Identifier_list__NamesAssignment_0 )
            // InternalPascal.g:4264:3: rule__Identifier_list__NamesAssignment_0
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
    // InternalPascal.g:4272:1: rule__Identifier_list__Group__1 : rule__Identifier_list__Group__1__Impl ;
    public final void rule__Identifier_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4276:1: ( rule__Identifier_list__Group__1__Impl )
            // InternalPascal.g:4277:2: rule__Identifier_list__Group__1__Impl
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
    // InternalPascal.g:4283:1: rule__Identifier_list__Group__1__Impl : ( ( rule__Identifier_list__Group_1__0 )* ) ;
    public final void rule__Identifier_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4287:1: ( ( ( rule__Identifier_list__Group_1__0 )* ) )
            // InternalPascal.g:4288:1: ( ( rule__Identifier_list__Group_1__0 )* )
            {
            // InternalPascal.g:4288:1: ( ( rule__Identifier_list__Group_1__0 )* )
            // InternalPascal.g:4289:2: ( rule__Identifier_list__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifier_listAccess().getGroup_1()); 
            }
            // InternalPascal.g:4290:2: ( rule__Identifier_list__Group_1__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==32) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalPascal.g:4290:3: rule__Identifier_list__Group_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Identifier_list__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop38;
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
    // InternalPascal.g:4299:1: rule__Identifier_list__Group_1__0 : rule__Identifier_list__Group_1__0__Impl rule__Identifier_list__Group_1__1 ;
    public final void rule__Identifier_list__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4303:1: ( rule__Identifier_list__Group_1__0__Impl rule__Identifier_list__Group_1__1 )
            // InternalPascal.g:4304:2: rule__Identifier_list__Group_1__0__Impl rule__Identifier_list__Group_1__1
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
    // InternalPascal.g:4311:1: rule__Identifier_list__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Identifier_list__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4315:1: ( ( ',' ) )
            // InternalPascal.g:4316:1: ( ',' )
            {
            // InternalPascal.g:4316:1: ( ',' )
            // InternalPascal.g:4317:2: ','
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
    // InternalPascal.g:4326:1: rule__Identifier_list__Group_1__1 : rule__Identifier_list__Group_1__1__Impl ;
    public final void rule__Identifier_list__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4330:1: ( rule__Identifier_list__Group_1__1__Impl )
            // InternalPascal.g:4331:2: rule__Identifier_list__Group_1__1__Impl
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
    // InternalPascal.g:4337:1: rule__Identifier_list__Group_1__1__Impl : ( ( rule__Identifier_list__NamesAssignment_1_1 ) ) ;
    public final void rule__Identifier_list__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4341:1: ( ( ( rule__Identifier_list__NamesAssignment_1_1 ) ) )
            // InternalPascal.g:4342:1: ( ( rule__Identifier_list__NamesAssignment_1_1 ) )
            {
            // InternalPascal.g:4342:1: ( ( rule__Identifier_list__NamesAssignment_1_1 ) )
            // InternalPascal.g:4343:2: ( rule__Identifier_list__NamesAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifier_listAccess().getNamesAssignment_1_1()); 
            }
            // InternalPascal.g:4344:2: ( rule__Identifier_list__NamesAssignment_1_1 )
            // InternalPascal.g:4344:3: rule__Identifier_list__NamesAssignment_1_1
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
    // InternalPascal.g:4353:1: rule__Variable_parameter_section__Group__0 : rule__Variable_parameter_section__Group__0__Impl rule__Variable_parameter_section__Group__1 ;
    public final void rule__Variable_parameter_section__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4357:1: ( rule__Variable_parameter_section__Group__0__Impl rule__Variable_parameter_section__Group__1 )
            // InternalPascal.g:4358:2: rule__Variable_parameter_section__Group__0__Impl rule__Variable_parameter_section__Group__1
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
    // InternalPascal.g:4365:1: rule__Variable_parameter_section__Group__0__Impl : ( 'var' ) ;
    public final void rule__Variable_parameter_section__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4369:1: ( ( 'var' ) )
            // InternalPascal.g:4370:1: ( 'var' )
            {
            // InternalPascal.g:4370:1: ( 'var' )
            // InternalPascal.g:4371:2: 'var'
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
    // InternalPascal.g:4380:1: rule__Variable_parameter_section__Group__1 : rule__Variable_parameter_section__Group__1__Impl rule__Variable_parameter_section__Group__2 ;
    public final void rule__Variable_parameter_section__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4384:1: ( rule__Variable_parameter_section__Group__1__Impl rule__Variable_parameter_section__Group__2 )
            // InternalPascal.g:4385:2: rule__Variable_parameter_section__Group__1__Impl rule__Variable_parameter_section__Group__2
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
    // InternalPascal.g:4392:1: rule__Variable_parameter_section__Group__1__Impl : ( ( rule__Variable_parameter_section__IndentifiersAssignment_1 ) ) ;
    public final void rule__Variable_parameter_section__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4396:1: ( ( ( rule__Variable_parameter_section__IndentifiersAssignment_1 ) ) )
            // InternalPascal.g:4397:1: ( ( rule__Variable_parameter_section__IndentifiersAssignment_1 ) )
            {
            // InternalPascal.g:4397:1: ( ( rule__Variable_parameter_section__IndentifiersAssignment_1 ) )
            // InternalPascal.g:4398:2: ( rule__Variable_parameter_section__IndentifiersAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_parameter_sectionAccess().getIndentifiersAssignment_1()); 
            }
            // InternalPascal.g:4399:2: ( rule__Variable_parameter_section__IndentifiersAssignment_1 )
            // InternalPascal.g:4399:3: rule__Variable_parameter_section__IndentifiersAssignment_1
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
    // InternalPascal.g:4407:1: rule__Variable_parameter_section__Group__2 : rule__Variable_parameter_section__Group__2__Impl rule__Variable_parameter_section__Group__3 ;
    public final void rule__Variable_parameter_section__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4411:1: ( rule__Variable_parameter_section__Group__2__Impl rule__Variable_parameter_section__Group__3 )
            // InternalPascal.g:4412:2: rule__Variable_parameter_section__Group__2__Impl rule__Variable_parameter_section__Group__3
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
    // InternalPascal.g:4419:1: rule__Variable_parameter_section__Group__2__Impl : ( ':' ) ;
    public final void rule__Variable_parameter_section__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4423:1: ( ( ':' ) )
            // InternalPascal.g:4424:1: ( ':' )
            {
            // InternalPascal.g:4424:1: ( ':' )
            // InternalPascal.g:4425:2: ':'
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
    // InternalPascal.g:4434:1: rule__Variable_parameter_section__Group__3 : rule__Variable_parameter_section__Group__3__Impl ;
    public final void rule__Variable_parameter_section__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4438:1: ( rule__Variable_parameter_section__Group__3__Impl )
            // InternalPascal.g:4439:2: rule__Variable_parameter_section__Group__3__Impl
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
    // InternalPascal.g:4445:1: rule__Variable_parameter_section__Group__3__Impl : ( ( rule__Variable_parameter_section__TypeAssignment_3 ) ) ;
    public final void rule__Variable_parameter_section__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4449:1: ( ( ( rule__Variable_parameter_section__TypeAssignment_3 ) ) )
            // InternalPascal.g:4450:1: ( ( rule__Variable_parameter_section__TypeAssignment_3 ) )
            {
            // InternalPascal.g:4450:1: ( ( rule__Variable_parameter_section__TypeAssignment_3 ) )
            // InternalPascal.g:4451:2: ( rule__Variable_parameter_section__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_parameter_sectionAccess().getTypeAssignment_3()); 
            }
            // InternalPascal.g:4452:2: ( rule__Variable_parameter_section__TypeAssignment_3 )
            // InternalPascal.g:4452:3: rule__Variable_parameter_section__TypeAssignment_3
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
    // InternalPascal.g:4461:1: rule__Procedure_declaration__Group__0 : rule__Procedure_declaration__Group__0__Impl rule__Procedure_declaration__Group__1 ;
    public final void rule__Procedure_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4465:1: ( rule__Procedure_declaration__Group__0__Impl rule__Procedure_declaration__Group__1 )
            // InternalPascal.g:4466:2: rule__Procedure_declaration__Group__0__Impl rule__Procedure_declaration__Group__1
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
    // InternalPascal.g:4473:1: rule__Procedure_declaration__Group__0__Impl : ( ( rule__Procedure_declaration__HeadingAssignment_0 ) ) ;
    public final void rule__Procedure_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4477:1: ( ( ( rule__Procedure_declaration__HeadingAssignment_0 ) ) )
            // InternalPascal.g:4478:1: ( ( rule__Procedure_declaration__HeadingAssignment_0 ) )
            {
            // InternalPascal.g:4478:1: ( ( rule__Procedure_declaration__HeadingAssignment_0 ) )
            // InternalPascal.g:4479:2: ( rule__Procedure_declaration__HeadingAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcedure_declarationAccess().getHeadingAssignment_0()); 
            }
            // InternalPascal.g:4480:2: ( rule__Procedure_declaration__HeadingAssignment_0 )
            // InternalPascal.g:4480:3: rule__Procedure_declaration__HeadingAssignment_0
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
    // InternalPascal.g:4488:1: rule__Procedure_declaration__Group__1 : rule__Procedure_declaration__Group__1__Impl rule__Procedure_declaration__Group__2 ;
    public final void rule__Procedure_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4492:1: ( rule__Procedure_declaration__Group__1__Impl rule__Procedure_declaration__Group__2 )
            // InternalPascal.g:4493:2: rule__Procedure_declaration__Group__1__Impl rule__Procedure_declaration__Group__2
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
    // InternalPascal.g:4500:1: rule__Procedure_declaration__Group__1__Impl : ( ';' ) ;
    public final void rule__Procedure_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4504:1: ( ( ';' ) )
            // InternalPascal.g:4505:1: ( ';' )
            {
            // InternalPascal.g:4505:1: ( ';' )
            // InternalPascal.g:4506:2: ';'
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
    // InternalPascal.g:4515:1: rule__Procedure_declaration__Group__2 : rule__Procedure_declaration__Group__2__Impl ;
    public final void rule__Procedure_declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4519:1: ( rule__Procedure_declaration__Group__2__Impl )
            // InternalPascal.g:4520:2: rule__Procedure_declaration__Group__2__Impl
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
    // InternalPascal.g:4526:1: rule__Procedure_declaration__Group__2__Impl : ( ( rule__Procedure_declaration__BlockAssignment_2 ) ) ;
    public final void rule__Procedure_declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4530:1: ( ( ( rule__Procedure_declaration__BlockAssignment_2 ) ) )
            // InternalPascal.g:4531:1: ( ( rule__Procedure_declaration__BlockAssignment_2 ) )
            {
            // InternalPascal.g:4531:1: ( ( rule__Procedure_declaration__BlockAssignment_2 ) )
            // InternalPascal.g:4532:2: ( rule__Procedure_declaration__BlockAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcedure_declarationAccess().getBlockAssignment_2()); 
            }
            // InternalPascal.g:4533:2: ( rule__Procedure_declaration__BlockAssignment_2 )
            // InternalPascal.g:4533:3: rule__Procedure_declaration__BlockAssignment_2
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
    // InternalPascal.g:4542:1: rule__Procedure_heading__Group__0 : rule__Procedure_heading__Group__0__Impl rule__Procedure_heading__Group__1 ;
    public final void rule__Procedure_heading__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4546:1: ( rule__Procedure_heading__Group__0__Impl rule__Procedure_heading__Group__1 )
            // InternalPascal.g:4547:2: rule__Procedure_heading__Group__0__Impl rule__Procedure_heading__Group__1
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
    // InternalPascal.g:4554:1: rule__Procedure_heading__Group__0__Impl : ( 'procedure' ) ;
    public final void rule__Procedure_heading__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4558:1: ( ( 'procedure' ) )
            // InternalPascal.g:4559:1: ( 'procedure' )
            {
            // InternalPascal.g:4559:1: ( 'procedure' )
            // InternalPascal.g:4560:2: 'procedure'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcedure_headingAccess().getProcedureKeyword_0()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:4569:1: rule__Procedure_heading__Group__1 : rule__Procedure_heading__Group__1__Impl rule__Procedure_heading__Group__2 ;
    public final void rule__Procedure_heading__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4573:1: ( rule__Procedure_heading__Group__1__Impl rule__Procedure_heading__Group__2 )
            // InternalPascal.g:4574:2: rule__Procedure_heading__Group__1__Impl rule__Procedure_heading__Group__2
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
    // InternalPascal.g:4581:1: rule__Procedure_heading__Group__1__Impl : ( ( rule__Procedure_heading__NameAssignment_1 ) ) ;
    public final void rule__Procedure_heading__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4585:1: ( ( ( rule__Procedure_heading__NameAssignment_1 ) ) )
            // InternalPascal.g:4586:1: ( ( rule__Procedure_heading__NameAssignment_1 ) )
            {
            // InternalPascal.g:4586:1: ( ( rule__Procedure_heading__NameAssignment_1 ) )
            // InternalPascal.g:4587:2: ( rule__Procedure_heading__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcedure_headingAccess().getNameAssignment_1()); 
            }
            // InternalPascal.g:4588:2: ( rule__Procedure_heading__NameAssignment_1 )
            // InternalPascal.g:4588:3: rule__Procedure_heading__NameAssignment_1
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
    // InternalPascal.g:4596:1: rule__Procedure_heading__Group__2 : rule__Procedure_heading__Group__2__Impl ;
    public final void rule__Procedure_heading__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4600:1: ( rule__Procedure_heading__Group__2__Impl )
            // InternalPascal.g:4601:2: rule__Procedure_heading__Group__2__Impl
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
    // InternalPascal.g:4607:1: rule__Procedure_heading__Group__2__Impl : ( ( rule__Procedure_heading__ParametersAssignment_2 )? ) ;
    public final void rule__Procedure_heading__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4611:1: ( ( ( rule__Procedure_heading__ParametersAssignment_2 )? ) )
            // InternalPascal.g:4612:1: ( ( rule__Procedure_heading__ParametersAssignment_2 )? )
            {
            // InternalPascal.g:4612:1: ( ( rule__Procedure_heading__ParametersAssignment_2 )? )
            // InternalPascal.g:4613:2: ( rule__Procedure_heading__ParametersAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcedure_headingAccess().getParametersAssignment_2()); 
            }
            // InternalPascal.g:4614:2: ( rule__Procedure_heading__ParametersAssignment_2 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==33) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalPascal.g:4614:3: rule__Procedure_heading__ParametersAssignment_2
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
    // InternalPascal.g:4623:1: rule__Set__Group__0 : rule__Set__Group__0__Impl rule__Set__Group__1 ;
    public final void rule__Set__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4627:1: ( rule__Set__Group__0__Impl rule__Set__Group__1 )
            // InternalPascal.g:4628:2: rule__Set__Group__0__Impl rule__Set__Group__1
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
    // InternalPascal.g:4635:1: rule__Set__Group__0__Impl : ( ( rule__Set__BracketsAssignment_0 ) ) ;
    public final void rule__Set__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4639:1: ( ( ( rule__Set__BracketsAssignment_0 ) ) )
            // InternalPascal.g:4640:1: ( ( rule__Set__BracketsAssignment_0 ) )
            {
            // InternalPascal.g:4640:1: ( ( rule__Set__BracketsAssignment_0 ) )
            // InternalPascal.g:4641:2: ( rule__Set__BracketsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetAccess().getBracketsAssignment_0()); 
            }
            // InternalPascal.g:4642:2: ( rule__Set__BracketsAssignment_0 )
            // InternalPascal.g:4642:3: rule__Set__BracketsAssignment_0
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
    // InternalPascal.g:4650:1: rule__Set__Group__1 : rule__Set__Group__1__Impl rule__Set__Group__2 ;
    public final void rule__Set__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4654:1: ( rule__Set__Group__1__Impl rule__Set__Group__2 )
            // InternalPascal.g:4655:2: rule__Set__Group__1__Impl rule__Set__Group__2
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
    // InternalPascal.g:4662:1: rule__Set__Group__1__Impl : ( ( rule__Set__ExpressionsAssignment_1 )? ) ;
    public final void rule__Set__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4666:1: ( ( ( rule__Set__ExpressionsAssignment_1 )? ) )
            // InternalPascal.g:4667:1: ( ( rule__Set__ExpressionsAssignment_1 )? )
            {
            // InternalPascal.g:4667:1: ( ( rule__Set__ExpressionsAssignment_1 )? )
            // InternalPascal.g:4668:2: ( rule__Set__ExpressionsAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetAccess().getExpressionsAssignment_1()); 
            }
            // InternalPascal.g:4669:2: ( rule__Set__ExpressionsAssignment_1 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=RULE_ID && LA40_0<=RULE_INTEGER_NUMBER)||LA40_0==RULE_ADDITION_OP||LA40_0==RULE_STRING||(LA40_0>=RULE_SIGNED_REAL_NUMBER && LA40_0<=RULE_REAL_NUMBER)||LA40_0==29||LA40_0==33||LA40_0==35||(LA40_0>=51 && LA40_0<=53)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalPascal.g:4669:3: rule__Set__ExpressionsAssignment_1
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
    // InternalPascal.g:4677:1: rule__Set__Group__2 : rule__Set__Group__2__Impl ;
    public final void rule__Set__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4681:1: ( rule__Set__Group__2__Impl )
            // InternalPascal.g:4682:2: rule__Set__Group__2__Impl
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
    // InternalPascal.g:4688:1: rule__Set__Group__2__Impl : ( ( rule__Set__BracketsAssignment_2 ) ) ;
    public final void rule__Set__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4692:1: ( ( ( rule__Set__BracketsAssignment_2 ) ) )
            // InternalPascal.g:4693:1: ( ( rule__Set__BracketsAssignment_2 ) )
            {
            // InternalPascal.g:4693:1: ( ( rule__Set__BracketsAssignment_2 ) )
            // InternalPascal.g:4694:2: ( rule__Set__BracketsAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetAccess().getBracketsAssignment_2()); 
            }
            // InternalPascal.g:4695:2: ( rule__Set__BracketsAssignment_2 )
            // InternalPascal.g:4695:3: rule__Set__BracketsAssignment_2
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
    // InternalPascal.g:4704:1: rule__Label_declaration__Group__0 : rule__Label_declaration__Group__0__Impl rule__Label_declaration__Group__1 ;
    public final void rule__Label_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4708:1: ( rule__Label_declaration__Group__0__Impl rule__Label_declaration__Group__1 )
            // InternalPascal.g:4709:2: rule__Label_declaration__Group__0__Impl rule__Label_declaration__Group__1
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
    // InternalPascal.g:4716:1: rule__Label_declaration__Group__0__Impl : ( 'label' ) ;
    public final void rule__Label_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4720:1: ( ( 'label' ) )
            // InternalPascal.g:4721:1: ( 'label' )
            {
            // InternalPascal.g:4721:1: ( 'label' )
            // InternalPascal.g:4722:2: 'label'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabel_declarationAccess().getLabelKeyword_0()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:4731:1: rule__Label_declaration__Group__1 : rule__Label_declaration__Group__1__Impl rule__Label_declaration__Group__2 ;
    public final void rule__Label_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4735:1: ( rule__Label_declaration__Group__1__Impl rule__Label_declaration__Group__2 )
            // InternalPascal.g:4736:2: rule__Label_declaration__Group__1__Impl rule__Label_declaration__Group__2
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
    // InternalPascal.g:4743:1: rule__Label_declaration__Group__1__Impl : ( ( rule__Label_declaration__LabelsAssignment_1 ) ) ;
    public final void rule__Label_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4747:1: ( ( ( rule__Label_declaration__LabelsAssignment_1 ) ) )
            // InternalPascal.g:4748:1: ( ( rule__Label_declaration__LabelsAssignment_1 ) )
            {
            // InternalPascal.g:4748:1: ( ( rule__Label_declaration__LabelsAssignment_1 ) )
            // InternalPascal.g:4749:2: ( rule__Label_declaration__LabelsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabel_declarationAccess().getLabelsAssignment_1()); 
            }
            // InternalPascal.g:4750:2: ( rule__Label_declaration__LabelsAssignment_1 )
            // InternalPascal.g:4750:3: rule__Label_declaration__LabelsAssignment_1
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
    // InternalPascal.g:4758:1: rule__Label_declaration__Group__2 : rule__Label_declaration__Group__2__Impl rule__Label_declaration__Group__3 ;
    public final void rule__Label_declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4762:1: ( rule__Label_declaration__Group__2__Impl rule__Label_declaration__Group__3 )
            // InternalPascal.g:4763:2: rule__Label_declaration__Group__2__Impl rule__Label_declaration__Group__3
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
    // InternalPascal.g:4770:1: rule__Label_declaration__Group__2__Impl : ( ( rule__Label_declaration__Group_2__0 )* ) ;
    public final void rule__Label_declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4774:1: ( ( ( rule__Label_declaration__Group_2__0 )* ) )
            // InternalPascal.g:4775:1: ( ( rule__Label_declaration__Group_2__0 )* )
            {
            // InternalPascal.g:4775:1: ( ( rule__Label_declaration__Group_2__0 )* )
            // InternalPascal.g:4776:2: ( rule__Label_declaration__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabel_declarationAccess().getGroup_2()); 
            }
            // InternalPascal.g:4777:2: ( rule__Label_declaration__Group_2__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==32) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalPascal.g:4777:3: rule__Label_declaration__Group_2__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Label_declaration__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop41;
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
    // InternalPascal.g:4785:1: rule__Label_declaration__Group__3 : rule__Label_declaration__Group__3__Impl ;
    public final void rule__Label_declaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4789:1: ( rule__Label_declaration__Group__3__Impl )
            // InternalPascal.g:4790:2: rule__Label_declaration__Group__3__Impl
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
    // InternalPascal.g:4796:1: rule__Label_declaration__Group__3__Impl : ( ';' ) ;
    public final void rule__Label_declaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4800:1: ( ( ';' ) )
            // InternalPascal.g:4801:1: ( ';' )
            {
            // InternalPascal.g:4801:1: ( ';' )
            // InternalPascal.g:4802:2: ';'
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
    // InternalPascal.g:4812:1: rule__Label_declaration__Group_2__0 : rule__Label_declaration__Group_2__0__Impl rule__Label_declaration__Group_2__1 ;
    public final void rule__Label_declaration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4816:1: ( rule__Label_declaration__Group_2__0__Impl rule__Label_declaration__Group_2__1 )
            // InternalPascal.g:4817:2: rule__Label_declaration__Group_2__0__Impl rule__Label_declaration__Group_2__1
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
    // InternalPascal.g:4824:1: rule__Label_declaration__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Label_declaration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4828:1: ( ( ',' ) )
            // InternalPascal.g:4829:1: ( ',' )
            {
            // InternalPascal.g:4829:1: ( ',' )
            // InternalPascal.g:4830:2: ','
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
    // InternalPascal.g:4839:1: rule__Label_declaration__Group_2__1 : rule__Label_declaration__Group_2__1__Impl ;
    public final void rule__Label_declaration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4843:1: ( rule__Label_declaration__Group_2__1__Impl )
            // InternalPascal.g:4844:2: rule__Label_declaration__Group_2__1__Impl
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
    // InternalPascal.g:4850:1: rule__Label_declaration__Group_2__1__Impl : ( ( rule__Label_declaration__LabelsAssignment_2_1 ) ) ;
    public final void rule__Label_declaration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4854:1: ( ( ( rule__Label_declaration__LabelsAssignment_2_1 ) ) )
            // InternalPascal.g:4855:1: ( ( rule__Label_declaration__LabelsAssignment_2_1 ) )
            {
            // InternalPascal.g:4855:1: ( ( rule__Label_declaration__LabelsAssignment_2_1 ) )
            // InternalPascal.g:4856:2: ( rule__Label_declaration__LabelsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabel_declarationAccess().getLabelsAssignment_2_1()); 
            }
            // InternalPascal.g:4857:2: ( rule__Label_declaration__LabelsAssignment_2_1 )
            // InternalPascal.g:4857:3: rule__Label_declaration__LabelsAssignment_2_1
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
    // InternalPascal.g:4866:1: rule__Constant__Group_0__0 : rule__Constant__Group_0__0__Impl rule__Constant__Group_0__1 ;
    public final void rule__Constant__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4870:1: ( rule__Constant__Group_0__0__Impl rule__Constant__Group_0__1 )
            // InternalPascal.g:4871:2: rule__Constant__Group_0__0__Impl rule__Constant__Group_0__1
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
    // InternalPascal.g:4878:1: rule__Constant__Group_0__0__Impl : ( ( rule__Constant__OpteratorAssignment_0_0 )? ) ;
    public final void rule__Constant__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4882:1: ( ( ( rule__Constant__OpteratorAssignment_0_0 )? ) )
            // InternalPascal.g:4883:1: ( ( rule__Constant__OpteratorAssignment_0_0 )? )
            {
            // InternalPascal.g:4883:1: ( ( rule__Constant__OpteratorAssignment_0_0 )? )
            // InternalPascal.g:4884:2: ( rule__Constant__OpteratorAssignment_0_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getOpteratorAssignment_0_0()); 
            }
            // InternalPascal.g:4885:2: ( rule__Constant__OpteratorAssignment_0_0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_ADDITION_OP) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalPascal.g:4885:3: rule__Constant__OpteratorAssignment_0_0
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
    // InternalPascal.g:4893:1: rule__Constant__Group_0__1 : rule__Constant__Group_0__1__Impl ;
    public final void rule__Constant__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4897:1: ( rule__Constant__Group_0__1__Impl )
            // InternalPascal.g:4898:2: rule__Constant__Group_0__1__Impl
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
    // InternalPascal.g:4904:1: rule__Constant__Group_0__1__Impl : ( ( rule__Constant__Alternatives_0_1 ) ) ;
    public final void rule__Constant__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4908:1: ( ( ( rule__Constant__Alternatives_0_1 ) ) )
            // InternalPascal.g:4909:1: ( ( rule__Constant__Alternatives_0_1 ) )
            {
            // InternalPascal.g:4909:1: ( ( rule__Constant__Alternatives_0_1 ) )
            // InternalPascal.g:4910:2: ( rule__Constant__Alternatives_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getAlternatives_0_1()); 
            }
            // InternalPascal.g:4911:2: ( rule__Constant__Alternatives_0_1 )
            // InternalPascal.g:4911:3: rule__Constant__Alternatives_0_1
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
    // InternalPascal.g:4920:1: rule__Constant_definition_part__Group__0 : rule__Constant_definition_part__Group__0__Impl rule__Constant_definition_part__Group__1 ;
    public final void rule__Constant_definition_part__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4924:1: ( rule__Constant_definition_part__Group__0__Impl rule__Constant_definition_part__Group__1 )
            // InternalPascal.g:4925:2: rule__Constant_definition_part__Group__0__Impl rule__Constant_definition_part__Group__1
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
    // InternalPascal.g:4932:1: rule__Constant_definition_part__Group__0__Impl : ( 'const' ) ;
    public final void rule__Constant_definition_part__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4936:1: ( ( 'const' ) )
            // InternalPascal.g:4937:1: ( 'const' )
            {
            // InternalPascal.g:4937:1: ( 'const' )
            // InternalPascal.g:4938:2: 'const'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstant_definition_partAccess().getConstKeyword_0()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:4947:1: rule__Constant_definition_part__Group__1 : rule__Constant_definition_part__Group__1__Impl ;
    public final void rule__Constant_definition_part__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4951:1: ( rule__Constant_definition_part__Group__1__Impl )
            // InternalPascal.g:4952:2: rule__Constant_definition_part__Group__1__Impl
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
    // InternalPascal.g:4958:1: rule__Constant_definition_part__Group__1__Impl : ( ( ( rule__Constant_definition_part__Group_1__0 ) ) ( ( rule__Constant_definition_part__Group_1__0 )* ) ) ;
    public final void rule__Constant_definition_part__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4962:1: ( ( ( ( rule__Constant_definition_part__Group_1__0 ) ) ( ( rule__Constant_definition_part__Group_1__0 )* ) ) )
            // InternalPascal.g:4963:1: ( ( ( rule__Constant_definition_part__Group_1__0 ) ) ( ( rule__Constant_definition_part__Group_1__0 )* ) )
            {
            // InternalPascal.g:4963:1: ( ( ( rule__Constant_definition_part__Group_1__0 ) ) ( ( rule__Constant_definition_part__Group_1__0 )* ) )
            // InternalPascal.g:4964:2: ( ( rule__Constant_definition_part__Group_1__0 ) ) ( ( rule__Constant_definition_part__Group_1__0 )* )
            {
            // InternalPascal.g:4964:2: ( ( rule__Constant_definition_part__Group_1__0 ) )
            // InternalPascal.g:4965:3: ( rule__Constant_definition_part__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstant_definition_partAccess().getGroup_1()); 
            }
            // InternalPascal.g:4966:3: ( rule__Constant_definition_part__Group_1__0 )
            // InternalPascal.g:4966:4: rule__Constant_definition_part__Group_1__0
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

            // InternalPascal.g:4969:2: ( ( rule__Constant_definition_part__Group_1__0 )* )
            // InternalPascal.g:4970:3: ( rule__Constant_definition_part__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstant_definition_partAccess().getGroup_1()); 
            }
            // InternalPascal.g:4971:3: ( rule__Constant_definition_part__Group_1__0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_ID) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalPascal.g:4971:4: rule__Constant_definition_part__Group_1__0
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__Constant_definition_part__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop43;
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
    // InternalPascal.g:4981:1: rule__Constant_definition_part__Group_1__0 : rule__Constant_definition_part__Group_1__0__Impl rule__Constant_definition_part__Group_1__1 ;
    public final void rule__Constant_definition_part__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4985:1: ( rule__Constant_definition_part__Group_1__0__Impl rule__Constant_definition_part__Group_1__1 )
            // InternalPascal.g:4986:2: rule__Constant_definition_part__Group_1__0__Impl rule__Constant_definition_part__Group_1__1
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
    // InternalPascal.g:4993:1: rule__Constant_definition_part__Group_1__0__Impl : ( ( rule__Constant_definition_part__ConstsAssignment_1_0 ) ) ;
    public final void rule__Constant_definition_part__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4997:1: ( ( ( rule__Constant_definition_part__ConstsAssignment_1_0 ) ) )
            // InternalPascal.g:4998:1: ( ( rule__Constant_definition_part__ConstsAssignment_1_0 ) )
            {
            // InternalPascal.g:4998:1: ( ( rule__Constant_definition_part__ConstsAssignment_1_0 ) )
            // InternalPascal.g:4999:2: ( rule__Constant_definition_part__ConstsAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstant_definition_partAccess().getConstsAssignment_1_0()); 
            }
            // InternalPascal.g:5000:2: ( rule__Constant_definition_part__ConstsAssignment_1_0 )
            // InternalPascal.g:5000:3: rule__Constant_definition_part__ConstsAssignment_1_0
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
    // InternalPascal.g:5008:1: rule__Constant_definition_part__Group_1__1 : rule__Constant_definition_part__Group_1__1__Impl ;
    public final void rule__Constant_definition_part__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5012:1: ( rule__Constant_definition_part__Group_1__1__Impl )
            // InternalPascal.g:5013:2: rule__Constant_definition_part__Group_1__1__Impl
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
    // InternalPascal.g:5019:1: rule__Constant_definition_part__Group_1__1__Impl : ( ';' ) ;
    public final void rule__Constant_definition_part__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5023:1: ( ( ';' ) )
            // InternalPascal.g:5024:1: ( ';' )
            {
            // InternalPascal.g:5024:1: ( ';' )
            // InternalPascal.g:5025:2: ';'
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
    // InternalPascal.g:5035:1: rule__Constant_definition__Group__0 : rule__Constant_definition__Group__0__Impl rule__Constant_definition__Group__1 ;
    public final void rule__Constant_definition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5039:1: ( rule__Constant_definition__Group__0__Impl rule__Constant_definition__Group__1 )
            // InternalPascal.g:5040:2: rule__Constant_definition__Group__0__Impl rule__Constant_definition__Group__1
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
    // InternalPascal.g:5047:1: rule__Constant_definition__Group__0__Impl : ( ( rule__Constant_definition__NameAssignment_0 ) ) ;
    public final void rule__Constant_definition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5051:1: ( ( ( rule__Constant_definition__NameAssignment_0 ) ) )
            // InternalPascal.g:5052:1: ( ( rule__Constant_definition__NameAssignment_0 ) )
            {
            // InternalPascal.g:5052:1: ( ( rule__Constant_definition__NameAssignment_0 ) )
            // InternalPascal.g:5053:2: ( rule__Constant_definition__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstant_definitionAccess().getNameAssignment_0()); 
            }
            // InternalPascal.g:5054:2: ( rule__Constant_definition__NameAssignment_0 )
            // InternalPascal.g:5054:3: rule__Constant_definition__NameAssignment_0
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
    // InternalPascal.g:5062:1: rule__Constant_definition__Group__1 : rule__Constant_definition__Group__1__Impl rule__Constant_definition__Group__2 ;
    public final void rule__Constant_definition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5066:1: ( rule__Constant_definition__Group__1__Impl rule__Constant_definition__Group__2 )
            // InternalPascal.g:5067:2: rule__Constant_definition__Group__1__Impl rule__Constant_definition__Group__2
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
    // InternalPascal.g:5074:1: rule__Constant_definition__Group__1__Impl : ( '=' ) ;
    public final void rule__Constant_definition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5078:1: ( ( '=' ) )
            // InternalPascal.g:5079:1: ( '=' )
            {
            // InternalPascal.g:5079:1: ( '=' )
            // InternalPascal.g:5080:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstant_definitionAccess().getEqualsSignKeyword_1()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:5089:1: rule__Constant_definition__Group__2 : rule__Constant_definition__Group__2__Impl ;
    public final void rule__Constant_definition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5093:1: ( rule__Constant_definition__Group__2__Impl )
            // InternalPascal.g:5094:2: rule__Constant_definition__Group__2__Impl
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
    // InternalPascal.g:5100:1: rule__Constant_definition__Group__2__Impl : ( ( rule__Constant_definition__ConstAssignment_2 ) ) ;
    public final void rule__Constant_definition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5104:1: ( ( ( rule__Constant_definition__ConstAssignment_2 ) ) )
            // InternalPascal.g:5105:1: ( ( rule__Constant_definition__ConstAssignment_2 ) )
            {
            // InternalPascal.g:5105:1: ( ( rule__Constant_definition__ConstAssignment_2 ) )
            // InternalPascal.g:5106:2: ( rule__Constant_definition__ConstAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstant_definitionAccess().getConstAssignment_2()); 
            }
            // InternalPascal.g:5107:2: ( rule__Constant_definition__ConstAssignment_2 )
            // InternalPascal.g:5107:3: rule__Constant_definition__ConstAssignment_2
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
    // InternalPascal.g:5116:1: rule__Type_definition_part__Group__0 : rule__Type_definition_part__Group__0__Impl rule__Type_definition_part__Group__1 ;
    public final void rule__Type_definition_part__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5120:1: ( rule__Type_definition_part__Group__0__Impl rule__Type_definition_part__Group__1 )
            // InternalPascal.g:5121:2: rule__Type_definition_part__Group__0__Impl rule__Type_definition_part__Group__1
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
    // InternalPascal.g:5128:1: rule__Type_definition_part__Group__0__Impl : ( 'type' ) ;
    public final void rule__Type_definition_part__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5132:1: ( ( 'type' ) )
            // InternalPascal.g:5133:1: ( 'type' )
            {
            // InternalPascal.g:5133:1: ( 'type' )
            // InternalPascal.g:5134:2: 'type'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_definition_partAccess().getTypeKeyword_0()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:5143:1: rule__Type_definition_part__Group__1 : rule__Type_definition_part__Group__1__Impl ;
    public final void rule__Type_definition_part__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5147:1: ( rule__Type_definition_part__Group__1__Impl )
            // InternalPascal.g:5148:2: rule__Type_definition_part__Group__1__Impl
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
    // InternalPascal.g:5154:1: rule__Type_definition_part__Group__1__Impl : ( ( ( rule__Type_definition_part__Group_1__0 ) ) ( ( rule__Type_definition_part__Group_1__0 )* ) ) ;
    public final void rule__Type_definition_part__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5158:1: ( ( ( ( rule__Type_definition_part__Group_1__0 ) ) ( ( rule__Type_definition_part__Group_1__0 )* ) ) )
            // InternalPascal.g:5159:1: ( ( ( rule__Type_definition_part__Group_1__0 ) ) ( ( rule__Type_definition_part__Group_1__0 )* ) )
            {
            // InternalPascal.g:5159:1: ( ( ( rule__Type_definition_part__Group_1__0 ) ) ( ( rule__Type_definition_part__Group_1__0 )* ) )
            // InternalPascal.g:5160:2: ( ( rule__Type_definition_part__Group_1__0 ) ) ( ( rule__Type_definition_part__Group_1__0 )* )
            {
            // InternalPascal.g:5160:2: ( ( rule__Type_definition_part__Group_1__0 ) )
            // InternalPascal.g:5161:3: ( rule__Type_definition_part__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_definition_partAccess().getGroup_1()); 
            }
            // InternalPascal.g:5162:3: ( rule__Type_definition_part__Group_1__0 )
            // InternalPascal.g:5162:4: rule__Type_definition_part__Group_1__0
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

            // InternalPascal.g:5165:2: ( ( rule__Type_definition_part__Group_1__0 )* )
            // InternalPascal.g:5166:3: ( rule__Type_definition_part__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_definition_partAccess().getGroup_1()); 
            }
            // InternalPascal.g:5167:3: ( rule__Type_definition_part__Group_1__0 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==RULE_ID) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalPascal.g:5167:4: rule__Type_definition_part__Group_1__0
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__Type_definition_part__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop44;
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
    // InternalPascal.g:5177:1: rule__Type_definition_part__Group_1__0 : rule__Type_definition_part__Group_1__0__Impl rule__Type_definition_part__Group_1__1 ;
    public final void rule__Type_definition_part__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5181:1: ( rule__Type_definition_part__Group_1__0__Impl rule__Type_definition_part__Group_1__1 )
            // InternalPascal.g:5182:2: rule__Type_definition_part__Group_1__0__Impl rule__Type_definition_part__Group_1__1
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
    // InternalPascal.g:5189:1: rule__Type_definition_part__Group_1__0__Impl : ( ( rule__Type_definition_part__TypesAssignment_1_0 ) ) ;
    public final void rule__Type_definition_part__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5193:1: ( ( ( rule__Type_definition_part__TypesAssignment_1_0 ) ) )
            // InternalPascal.g:5194:1: ( ( rule__Type_definition_part__TypesAssignment_1_0 ) )
            {
            // InternalPascal.g:5194:1: ( ( rule__Type_definition_part__TypesAssignment_1_0 ) )
            // InternalPascal.g:5195:2: ( rule__Type_definition_part__TypesAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_definition_partAccess().getTypesAssignment_1_0()); 
            }
            // InternalPascal.g:5196:2: ( rule__Type_definition_part__TypesAssignment_1_0 )
            // InternalPascal.g:5196:3: rule__Type_definition_part__TypesAssignment_1_0
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
    // InternalPascal.g:5204:1: rule__Type_definition_part__Group_1__1 : rule__Type_definition_part__Group_1__1__Impl ;
    public final void rule__Type_definition_part__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5208:1: ( rule__Type_definition_part__Group_1__1__Impl )
            // InternalPascal.g:5209:2: rule__Type_definition_part__Group_1__1__Impl
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
    // InternalPascal.g:5215:1: rule__Type_definition_part__Group_1__1__Impl : ( ';' ) ;
    public final void rule__Type_definition_part__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5219:1: ( ( ';' ) )
            // InternalPascal.g:5220:1: ( ';' )
            {
            // InternalPascal.g:5220:1: ( ';' )
            // InternalPascal.g:5221:2: ';'
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
    // InternalPascal.g:5231:1: rule__Type_definition__Group__0 : rule__Type_definition__Group__0__Impl rule__Type_definition__Group__1 ;
    public final void rule__Type_definition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5235:1: ( rule__Type_definition__Group__0__Impl rule__Type_definition__Group__1 )
            // InternalPascal.g:5236:2: rule__Type_definition__Group__0__Impl rule__Type_definition__Group__1
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
    // InternalPascal.g:5243:1: rule__Type_definition__Group__0__Impl : ( ( rule__Type_definition__NameAssignment_0 ) ) ;
    public final void rule__Type_definition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5247:1: ( ( ( rule__Type_definition__NameAssignment_0 ) ) )
            // InternalPascal.g:5248:1: ( ( rule__Type_definition__NameAssignment_0 ) )
            {
            // InternalPascal.g:5248:1: ( ( rule__Type_definition__NameAssignment_0 ) )
            // InternalPascal.g:5249:2: ( rule__Type_definition__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_definitionAccess().getNameAssignment_0()); 
            }
            // InternalPascal.g:5250:2: ( rule__Type_definition__NameAssignment_0 )
            // InternalPascal.g:5250:3: rule__Type_definition__NameAssignment_0
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
    // InternalPascal.g:5258:1: rule__Type_definition__Group__1 : rule__Type_definition__Group__1__Impl rule__Type_definition__Group__2 ;
    public final void rule__Type_definition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5262:1: ( rule__Type_definition__Group__1__Impl rule__Type_definition__Group__2 )
            // InternalPascal.g:5263:2: rule__Type_definition__Group__1__Impl rule__Type_definition__Group__2
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
    // InternalPascal.g:5270:1: rule__Type_definition__Group__1__Impl : ( '=' ) ;
    public final void rule__Type_definition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5274:1: ( ( '=' ) )
            // InternalPascal.g:5275:1: ( '=' )
            {
            // InternalPascal.g:5275:1: ( '=' )
            // InternalPascal.g:5276:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_definitionAccess().getEqualsSignKeyword_1()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:5285:1: rule__Type_definition__Group__2 : rule__Type_definition__Group__2__Impl ;
    public final void rule__Type_definition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5289:1: ( rule__Type_definition__Group__2__Impl )
            // InternalPascal.g:5290:2: rule__Type_definition__Group__2__Impl
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
    // InternalPascal.g:5296:1: rule__Type_definition__Group__2__Impl : ( ( rule__Type_definition__TypeAssignment_2 ) ) ;
    public final void rule__Type_definition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5300:1: ( ( ( rule__Type_definition__TypeAssignment_2 ) ) )
            // InternalPascal.g:5301:1: ( ( rule__Type_definition__TypeAssignment_2 ) )
            {
            // InternalPascal.g:5301:1: ( ( rule__Type_definition__TypeAssignment_2 ) )
            // InternalPascal.g:5302:2: ( rule__Type_definition__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_definitionAccess().getTypeAssignment_2()); 
            }
            // InternalPascal.g:5303:2: ( rule__Type_definition__TypeAssignment_2 )
            // InternalPascal.g:5303:3: rule__Type_definition__TypeAssignment_2
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
    // InternalPascal.g:5312:1: rule__Subrange_type__Group_0__0 : rule__Subrange_type__Group_0__0__Impl rule__Subrange_type__Group_0__1 ;
    public final void rule__Subrange_type__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5316:1: ( rule__Subrange_type__Group_0__0__Impl rule__Subrange_type__Group_0__1 )
            // InternalPascal.g:5317:2: rule__Subrange_type__Group_0__0__Impl rule__Subrange_type__Group_0__1
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
    // InternalPascal.g:5324:1: rule__Subrange_type__Group_0__0__Impl : ( ( rule__Subrange_type__InitialConstAssignment_0_0 ) ) ;
    public final void rule__Subrange_type__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5328:1: ( ( ( rule__Subrange_type__InitialConstAssignment_0_0 ) ) )
            // InternalPascal.g:5329:1: ( ( rule__Subrange_type__InitialConstAssignment_0_0 ) )
            {
            // InternalPascal.g:5329:1: ( ( rule__Subrange_type__InitialConstAssignment_0_0 ) )
            // InternalPascal.g:5330:2: ( rule__Subrange_type__InitialConstAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubrange_typeAccess().getInitialConstAssignment_0_0()); 
            }
            // InternalPascal.g:5331:2: ( rule__Subrange_type__InitialConstAssignment_0_0 )
            // InternalPascal.g:5331:3: rule__Subrange_type__InitialConstAssignment_0_0
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
    // InternalPascal.g:5339:1: rule__Subrange_type__Group_0__1 : rule__Subrange_type__Group_0__1__Impl rule__Subrange_type__Group_0__2 ;
    public final void rule__Subrange_type__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5343:1: ( rule__Subrange_type__Group_0__1__Impl rule__Subrange_type__Group_0__2 )
            // InternalPascal.g:5344:2: rule__Subrange_type__Group_0__1__Impl rule__Subrange_type__Group_0__2
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
    // InternalPascal.g:5351:1: rule__Subrange_type__Group_0__1__Impl : ( '..' ) ;
    public final void rule__Subrange_type__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5355:1: ( ( '..' ) )
            // InternalPascal.g:5356:1: ( '..' )
            {
            // InternalPascal.g:5356:1: ( '..' )
            // InternalPascal.g:5357:2: '..'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubrange_typeAccess().getFullStopFullStopKeyword_0_1()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:5366:1: rule__Subrange_type__Group_0__2 : rule__Subrange_type__Group_0__2__Impl ;
    public final void rule__Subrange_type__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5370:1: ( rule__Subrange_type__Group_0__2__Impl )
            // InternalPascal.g:5371:2: rule__Subrange_type__Group_0__2__Impl
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
    // InternalPascal.g:5377:1: rule__Subrange_type__Group_0__2__Impl : ( ( rule__Subrange_type__FinalConstAssignment_0_2 ) ) ;
    public final void rule__Subrange_type__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5381:1: ( ( ( rule__Subrange_type__FinalConstAssignment_0_2 ) ) )
            // InternalPascal.g:5382:1: ( ( rule__Subrange_type__FinalConstAssignment_0_2 ) )
            {
            // InternalPascal.g:5382:1: ( ( rule__Subrange_type__FinalConstAssignment_0_2 ) )
            // InternalPascal.g:5383:2: ( rule__Subrange_type__FinalConstAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubrange_typeAccess().getFinalConstAssignment_0_2()); 
            }
            // InternalPascal.g:5384:2: ( rule__Subrange_type__FinalConstAssignment_0_2 )
            // InternalPascal.g:5384:3: rule__Subrange_type__FinalConstAssignment_0_2
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
    // InternalPascal.g:5393:1: rule__Subrange_type__Group_1__0 : rule__Subrange_type__Group_1__0__Impl rule__Subrange_type__Group_1__1 ;
    public final void rule__Subrange_type__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5397:1: ( rule__Subrange_type__Group_1__0__Impl rule__Subrange_type__Group_1__1 )
            // InternalPascal.g:5398:2: rule__Subrange_type__Group_1__0__Impl rule__Subrange_type__Group_1__1
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
    // InternalPascal.g:5405:1: rule__Subrange_type__Group_1__0__Impl : ( ( rule__Subrange_type__SubrangeAssignment_1_0 ) ) ;
    public final void rule__Subrange_type__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5409:1: ( ( ( rule__Subrange_type__SubrangeAssignment_1_0 ) ) )
            // InternalPascal.g:5410:1: ( ( rule__Subrange_type__SubrangeAssignment_1_0 ) )
            {
            // InternalPascal.g:5410:1: ( ( rule__Subrange_type__SubrangeAssignment_1_0 ) )
            // InternalPascal.g:5411:2: ( rule__Subrange_type__SubrangeAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubrange_typeAccess().getSubrangeAssignment_1_0()); 
            }
            // InternalPascal.g:5412:2: ( rule__Subrange_type__SubrangeAssignment_1_0 )
            // InternalPascal.g:5412:3: rule__Subrange_type__SubrangeAssignment_1_0
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
    // InternalPascal.g:5420:1: rule__Subrange_type__Group_1__1 : rule__Subrange_type__Group_1__1__Impl ;
    public final void rule__Subrange_type__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5424:1: ( rule__Subrange_type__Group_1__1__Impl )
            // InternalPascal.g:5425:2: rule__Subrange_type__Group_1__1__Impl
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
    // InternalPascal.g:5431:1: rule__Subrange_type__Group_1__1__Impl : ( ( rule__Subrange_type__ConstAssignment_1_1 ) ) ;
    public final void rule__Subrange_type__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5435:1: ( ( ( rule__Subrange_type__ConstAssignment_1_1 ) ) )
            // InternalPascal.g:5436:1: ( ( rule__Subrange_type__ConstAssignment_1_1 ) )
            {
            // InternalPascal.g:5436:1: ( ( rule__Subrange_type__ConstAssignment_1_1 ) )
            // InternalPascal.g:5437:2: ( rule__Subrange_type__ConstAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubrange_typeAccess().getConstAssignment_1_1()); 
            }
            // InternalPascal.g:5438:2: ( rule__Subrange_type__ConstAssignment_1_1 )
            // InternalPascal.g:5438:3: rule__Subrange_type__ConstAssignment_1_1
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
    // InternalPascal.g:5447:1: rule__Enumerated_type__Group__0 : rule__Enumerated_type__Group__0__Impl rule__Enumerated_type__Group__1 ;
    public final void rule__Enumerated_type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5451:1: ( rule__Enumerated_type__Group__0__Impl rule__Enumerated_type__Group__1 )
            // InternalPascal.g:5452:2: rule__Enumerated_type__Group__0__Impl rule__Enumerated_type__Group__1
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
    // InternalPascal.g:5459:1: rule__Enumerated_type__Group__0__Impl : ( '(' ) ;
    public final void rule__Enumerated_type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5463:1: ( ( '(' ) )
            // InternalPascal.g:5464:1: ( '(' )
            {
            // InternalPascal.g:5464:1: ( '(' )
            // InternalPascal.g:5465:2: '('
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
    // InternalPascal.g:5474:1: rule__Enumerated_type__Group__1 : rule__Enumerated_type__Group__1__Impl rule__Enumerated_type__Group__2 ;
    public final void rule__Enumerated_type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5478:1: ( rule__Enumerated_type__Group__1__Impl rule__Enumerated_type__Group__2 )
            // InternalPascal.g:5479:2: rule__Enumerated_type__Group__1__Impl rule__Enumerated_type__Group__2
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
    // InternalPascal.g:5486:1: rule__Enumerated_type__Group__1__Impl : ( ( rule__Enumerated_type__IdentifiersAssignment_1 ) ) ;
    public final void rule__Enumerated_type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5490:1: ( ( ( rule__Enumerated_type__IdentifiersAssignment_1 ) ) )
            // InternalPascal.g:5491:1: ( ( rule__Enumerated_type__IdentifiersAssignment_1 ) )
            {
            // InternalPascal.g:5491:1: ( ( rule__Enumerated_type__IdentifiersAssignment_1 ) )
            // InternalPascal.g:5492:2: ( rule__Enumerated_type__IdentifiersAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerated_typeAccess().getIdentifiersAssignment_1()); 
            }
            // InternalPascal.g:5493:2: ( rule__Enumerated_type__IdentifiersAssignment_1 )
            // InternalPascal.g:5493:3: rule__Enumerated_type__IdentifiersAssignment_1
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
    // InternalPascal.g:5501:1: rule__Enumerated_type__Group__2 : rule__Enumerated_type__Group__2__Impl ;
    public final void rule__Enumerated_type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5505:1: ( rule__Enumerated_type__Group__2__Impl )
            // InternalPascal.g:5506:2: rule__Enumerated_type__Group__2__Impl
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
    // InternalPascal.g:5512:1: rule__Enumerated_type__Group__2__Impl : ( ')' ) ;
    public final void rule__Enumerated_type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5516:1: ( ( ')' ) )
            // InternalPascal.g:5517:1: ( ')' )
            {
            // InternalPascal.g:5517:1: ( ')' )
            // InternalPascal.g:5518:2: ')'
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
    // InternalPascal.g:5528:1: rule__Structured_type__Group__0 : rule__Structured_type__Group__0__Impl rule__Structured_type__Group__1 ;
    public final void rule__Structured_type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5532:1: ( rule__Structured_type__Group__0__Impl rule__Structured_type__Group__1 )
            // InternalPascal.g:5533:2: rule__Structured_type__Group__0__Impl rule__Structured_type__Group__1
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
    // InternalPascal.g:5540:1: rule__Structured_type__Group__0__Impl : ( ( rule__Structured_type__PackedAssignment_0 )? ) ;
    public final void rule__Structured_type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5544:1: ( ( ( rule__Structured_type__PackedAssignment_0 )? ) )
            // InternalPascal.g:5545:1: ( ( rule__Structured_type__PackedAssignment_0 )? )
            {
            // InternalPascal.g:5545:1: ( ( rule__Structured_type__PackedAssignment_0 )? )
            // InternalPascal.g:5546:2: ( rule__Structured_type__PackedAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStructured_typeAccess().getPackedAssignment_0()); 
            }
            // InternalPascal.g:5547:2: ( rule__Structured_type__PackedAssignment_0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==54) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalPascal.g:5547:3: rule__Structured_type__PackedAssignment_0
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
    // InternalPascal.g:5555:1: rule__Structured_type__Group__1 : rule__Structured_type__Group__1__Impl ;
    public final void rule__Structured_type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5559:1: ( rule__Structured_type__Group__1__Impl )
            // InternalPascal.g:5560:2: rule__Structured_type__Group__1__Impl
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
    // InternalPascal.g:5566:1: rule__Structured_type__Group__1__Impl : ( ( rule__Structured_type__TypeAssignment_1 ) ) ;
    public final void rule__Structured_type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5570:1: ( ( ( rule__Structured_type__TypeAssignment_1 ) ) )
            // InternalPascal.g:5571:1: ( ( rule__Structured_type__TypeAssignment_1 ) )
            {
            // InternalPascal.g:5571:1: ( ( rule__Structured_type__TypeAssignment_1 ) )
            // InternalPascal.g:5572:2: ( rule__Structured_type__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStructured_typeAccess().getTypeAssignment_1()); 
            }
            // InternalPascal.g:5573:2: ( rule__Structured_type__TypeAssignment_1 )
            // InternalPascal.g:5573:3: rule__Structured_type__TypeAssignment_1
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
    // InternalPascal.g:5582:1: rule__Record_type__Group__0 : rule__Record_type__Group__0__Impl rule__Record_type__Group__1 ;
    public final void rule__Record_type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5586:1: ( rule__Record_type__Group__0__Impl rule__Record_type__Group__1 )
            // InternalPascal.g:5587:2: rule__Record_type__Group__0__Impl rule__Record_type__Group__1
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
    // InternalPascal.g:5594:1: rule__Record_type__Group__0__Impl : ( ( rule__Record_type__RecordKeywordAssignment_0 ) ) ;
    public final void rule__Record_type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5598:1: ( ( ( rule__Record_type__RecordKeywordAssignment_0 ) ) )
            // InternalPascal.g:5599:1: ( ( rule__Record_type__RecordKeywordAssignment_0 ) )
            {
            // InternalPascal.g:5599:1: ( ( rule__Record_type__RecordKeywordAssignment_0 ) )
            // InternalPascal.g:5600:2: ( rule__Record_type__RecordKeywordAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecord_typeAccess().getRecordKeywordAssignment_0()); 
            }
            // InternalPascal.g:5601:2: ( rule__Record_type__RecordKeywordAssignment_0 )
            // InternalPascal.g:5601:3: rule__Record_type__RecordKeywordAssignment_0
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
    // InternalPascal.g:5609:1: rule__Record_type__Group__1 : rule__Record_type__Group__1__Impl rule__Record_type__Group__2 ;
    public final void rule__Record_type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5613:1: ( rule__Record_type__Group__1__Impl rule__Record_type__Group__2 )
            // InternalPascal.g:5614:2: rule__Record_type__Group__1__Impl rule__Record_type__Group__2
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
    // InternalPascal.g:5621:1: rule__Record_type__Group__1__Impl : ( ( rule__Record_type__FieldsAssignment_1 )? ) ;
    public final void rule__Record_type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5625:1: ( ( ( rule__Record_type__FieldsAssignment_1 )? ) )
            // InternalPascal.g:5626:1: ( ( rule__Record_type__FieldsAssignment_1 )? )
            {
            // InternalPascal.g:5626:1: ( ( rule__Record_type__FieldsAssignment_1 )? )
            // InternalPascal.g:5627:2: ( rule__Record_type__FieldsAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecord_typeAccess().getFieldsAssignment_1()); 
            }
            // InternalPascal.g:5628:2: ( rule__Record_type__FieldsAssignment_1 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_ID||LA46_0==44) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalPascal.g:5628:3: rule__Record_type__FieldsAssignment_1
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
    // InternalPascal.g:5636:1: rule__Record_type__Group__2 : rule__Record_type__Group__2__Impl ;
    public final void rule__Record_type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5640:1: ( rule__Record_type__Group__2__Impl )
            // InternalPascal.g:5641:2: rule__Record_type__Group__2__Impl
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
    // InternalPascal.g:5647:1: rule__Record_type__Group__2__Impl : ( ( rule__Record_type__EndKeywordAssignment_2 ) ) ;
    public final void rule__Record_type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5651:1: ( ( ( rule__Record_type__EndKeywordAssignment_2 ) ) )
            // InternalPascal.g:5652:1: ( ( rule__Record_type__EndKeywordAssignment_2 ) )
            {
            // InternalPascal.g:5652:1: ( ( rule__Record_type__EndKeywordAssignment_2 ) )
            // InternalPascal.g:5653:2: ( rule__Record_type__EndKeywordAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecord_typeAccess().getEndKeywordAssignment_2()); 
            }
            // InternalPascal.g:5654:2: ( rule__Record_type__EndKeywordAssignment_2 )
            // InternalPascal.g:5654:3: rule__Record_type__EndKeywordAssignment_2
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
    // InternalPascal.g:5663:1: rule__Field_list__Group__0 : rule__Field_list__Group__0__Impl rule__Field_list__Group__1 ;
    public final void rule__Field_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5667:1: ( rule__Field_list__Group__0__Impl rule__Field_list__Group__1 )
            // InternalPascal.g:5668:2: rule__Field_list__Group__0__Impl rule__Field_list__Group__1
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
    // InternalPascal.g:5675:1: rule__Field_list__Group__0__Impl : ( ( rule__Field_list__Alternatives_0 ) ) ;
    public final void rule__Field_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5679:1: ( ( ( rule__Field_list__Alternatives_0 ) ) )
            // InternalPascal.g:5680:1: ( ( rule__Field_list__Alternatives_0 ) )
            {
            // InternalPascal.g:5680:1: ( ( rule__Field_list__Alternatives_0 ) )
            // InternalPascal.g:5681:2: ( rule__Field_list__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_listAccess().getAlternatives_0()); 
            }
            // InternalPascal.g:5682:2: ( rule__Field_list__Alternatives_0 )
            // InternalPascal.g:5682:3: rule__Field_list__Alternatives_0
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
    // InternalPascal.g:5690:1: rule__Field_list__Group__1 : rule__Field_list__Group__1__Impl ;
    public final void rule__Field_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5694:1: ( rule__Field_list__Group__1__Impl )
            // InternalPascal.g:5695:2: rule__Field_list__Group__1__Impl
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
    // InternalPascal.g:5701:1: rule__Field_list__Group__1__Impl : ( ( ';' )? ) ;
    public final void rule__Field_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5705:1: ( ( ( ';' )? ) )
            // InternalPascal.g:5706:1: ( ( ';' )? )
            {
            // InternalPascal.g:5706:1: ( ( ';' )? )
            // InternalPascal.g:5707:2: ( ';' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_listAccess().getSemicolonKeyword_1()); 
            }
            // InternalPascal.g:5708:2: ( ';' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==24) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalPascal.g:5708:3: ';'
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
    // InternalPascal.g:5717:1: rule__Field_list__Group_0_0__0 : rule__Field_list__Group_0_0__0__Impl rule__Field_list__Group_0_0__1 ;
    public final void rule__Field_list__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5721:1: ( rule__Field_list__Group_0_0__0__Impl rule__Field_list__Group_0_0__1 )
            // InternalPascal.g:5722:2: rule__Field_list__Group_0_0__0__Impl rule__Field_list__Group_0_0__1
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
    // InternalPascal.g:5729:1: rule__Field_list__Group_0_0__0__Impl : ( ( rule__Field_list__FixedAssignment_0_0_0 ) ) ;
    public final void rule__Field_list__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5733:1: ( ( ( rule__Field_list__FixedAssignment_0_0_0 ) ) )
            // InternalPascal.g:5734:1: ( ( rule__Field_list__FixedAssignment_0_0_0 ) )
            {
            // InternalPascal.g:5734:1: ( ( rule__Field_list__FixedAssignment_0_0_0 ) )
            // InternalPascal.g:5735:2: ( rule__Field_list__FixedAssignment_0_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_listAccess().getFixedAssignment_0_0_0()); 
            }
            // InternalPascal.g:5736:2: ( rule__Field_list__FixedAssignment_0_0_0 )
            // InternalPascal.g:5736:3: rule__Field_list__FixedAssignment_0_0_0
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
    // InternalPascal.g:5744:1: rule__Field_list__Group_0_0__1 : rule__Field_list__Group_0_0__1__Impl ;
    public final void rule__Field_list__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5748:1: ( rule__Field_list__Group_0_0__1__Impl )
            // InternalPascal.g:5749:2: rule__Field_list__Group_0_0__1__Impl
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
    // InternalPascal.g:5755:1: rule__Field_list__Group_0_0__1__Impl : ( ( rule__Field_list__Group_0_0_1__0 )? ) ;
    public final void rule__Field_list__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5759:1: ( ( ( rule__Field_list__Group_0_0_1__0 )? ) )
            // InternalPascal.g:5760:1: ( ( rule__Field_list__Group_0_0_1__0 )? )
            {
            // InternalPascal.g:5760:1: ( ( rule__Field_list__Group_0_0_1__0 )? )
            // InternalPascal.g:5761:2: ( rule__Field_list__Group_0_0_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_listAccess().getGroup_0_0_1()); 
            }
            // InternalPascal.g:5762:2: ( rule__Field_list__Group_0_0_1__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==24) ) {
                int LA48_1 = input.LA(2);

                if ( (LA48_1==44) ) {
                    alt48=1;
                }
            }
            switch (alt48) {
                case 1 :
                    // InternalPascal.g:5762:3: rule__Field_list__Group_0_0_1__0
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
    // InternalPascal.g:5771:1: rule__Field_list__Group_0_0_1__0 : rule__Field_list__Group_0_0_1__0__Impl rule__Field_list__Group_0_0_1__1 ;
    public final void rule__Field_list__Group_0_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5775:1: ( rule__Field_list__Group_0_0_1__0__Impl rule__Field_list__Group_0_0_1__1 )
            // InternalPascal.g:5776:2: rule__Field_list__Group_0_0_1__0__Impl rule__Field_list__Group_0_0_1__1
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
    // InternalPascal.g:5783:1: rule__Field_list__Group_0_0_1__0__Impl : ( ';' ) ;
    public final void rule__Field_list__Group_0_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5787:1: ( ( ';' ) )
            // InternalPascal.g:5788:1: ( ';' )
            {
            // InternalPascal.g:5788:1: ( ';' )
            // InternalPascal.g:5789:2: ';'
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
    // InternalPascal.g:5798:1: rule__Field_list__Group_0_0_1__1 : rule__Field_list__Group_0_0_1__1__Impl ;
    public final void rule__Field_list__Group_0_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5802:1: ( rule__Field_list__Group_0_0_1__1__Impl )
            // InternalPascal.g:5803:2: rule__Field_list__Group_0_0_1__1__Impl
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
    // InternalPascal.g:5809:1: rule__Field_list__Group_0_0_1__1__Impl : ( ( rule__Field_list__VariantsAssignment_0_0_1_1 ) ) ;
    public final void rule__Field_list__Group_0_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5813:1: ( ( ( rule__Field_list__VariantsAssignment_0_0_1_1 ) ) )
            // InternalPascal.g:5814:1: ( ( rule__Field_list__VariantsAssignment_0_0_1_1 ) )
            {
            // InternalPascal.g:5814:1: ( ( rule__Field_list__VariantsAssignment_0_0_1_1 ) )
            // InternalPascal.g:5815:2: ( rule__Field_list__VariantsAssignment_0_0_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_listAccess().getVariantsAssignment_0_0_1_1()); 
            }
            // InternalPascal.g:5816:2: ( rule__Field_list__VariantsAssignment_0_0_1_1 )
            // InternalPascal.g:5816:3: rule__Field_list__VariantsAssignment_0_0_1_1
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
    // InternalPascal.g:5825:1: rule__Fixed_part__Group__0 : rule__Fixed_part__Group__0__Impl rule__Fixed_part__Group__1 ;
    public final void rule__Fixed_part__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5829:1: ( rule__Fixed_part__Group__0__Impl rule__Fixed_part__Group__1 )
            // InternalPascal.g:5830:2: rule__Fixed_part__Group__0__Impl rule__Fixed_part__Group__1
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
    // InternalPascal.g:5837:1: rule__Fixed_part__Group__0__Impl : ( ( rule__Fixed_part__SectionsAssignment_0 ) ) ;
    public final void rule__Fixed_part__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5841:1: ( ( ( rule__Fixed_part__SectionsAssignment_0 ) ) )
            // InternalPascal.g:5842:1: ( ( rule__Fixed_part__SectionsAssignment_0 ) )
            {
            // InternalPascal.g:5842:1: ( ( rule__Fixed_part__SectionsAssignment_0 ) )
            // InternalPascal.g:5843:2: ( rule__Fixed_part__SectionsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFixed_partAccess().getSectionsAssignment_0()); 
            }
            // InternalPascal.g:5844:2: ( rule__Fixed_part__SectionsAssignment_0 )
            // InternalPascal.g:5844:3: rule__Fixed_part__SectionsAssignment_0
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
    // InternalPascal.g:5852:1: rule__Fixed_part__Group__1 : rule__Fixed_part__Group__1__Impl ;
    public final void rule__Fixed_part__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5856:1: ( rule__Fixed_part__Group__1__Impl )
            // InternalPascal.g:5857:2: rule__Fixed_part__Group__1__Impl
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
    // InternalPascal.g:5863:1: rule__Fixed_part__Group__1__Impl : ( ( rule__Fixed_part__Group_1__0 )* ) ;
    public final void rule__Fixed_part__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5867:1: ( ( ( rule__Fixed_part__Group_1__0 )* ) )
            // InternalPascal.g:5868:1: ( ( rule__Fixed_part__Group_1__0 )* )
            {
            // InternalPascal.g:5868:1: ( ( rule__Fixed_part__Group_1__0 )* )
            // InternalPascal.g:5869:2: ( rule__Fixed_part__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFixed_partAccess().getGroup_1()); 
            }
            // InternalPascal.g:5870:2: ( rule__Fixed_part__Group_1__0 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==24) ) {
                    int LA49_2 = input.LA(2);

                    if ( (LA49_2==RULE_ID) ) {
                        alt49=1;
                    }


                }


                switch (alt49) {
            	case 1 :
            	    // InternalPascal.g:5870:3: rule__Fixed_part__Group_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Fixed_part__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop49;
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
    // InternalPascal.g:5879:1: rule__Fixed_part__Group_1__0 : rule__Fixed_part__Group_1__0__Impl rule__Fixed_part__Group_1__1 ;
    public final void rule__Fixed_part__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5883:1: ( rule__Fixed_part__Group_1__0__Impl rule__Fixed_part__Group_1__1 )
            // InternalPascal.g:5884:2: rule__Fixed_part__Group_1__0__Impl rule__Fixed_part__Group_1__1
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
    // InternalPascal.g:5891:1: rule__Fixed_part__Group_1__0__Impl : ( ';' ) ;
    public final void rule__Fixed_part__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5895:1: ( ( ';' ) )
            // InternalPascal.g:5896:1: ( ';' )
            {
            // InternalPascal.g:5896:1: ( ';' )
            // InternalPascal.g:5897:2: ';'
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
    // InternalPascal.g:5906:1: rule__Fixed_part__Group_1__1 : rule__Fixed_part__Group_1__1__Impl ;
    public final void rule__Fixed_part__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5910:1: ( rule__Fixed_part__Group_1__1__Impl )
            // InternalPascal.g:5911:2: rule__Fixed_part__Group_1__1__Impl
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
    // InternalPascal.g:5917:1: rule__Fixed_part__Group_1__1__Impl : ( ( rule__Fixed_part__SectionsAssignment_1_1 ) ) ;
    public final void rule__Fixed_part__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5921:1: ( ( ( rule__Fixed_part__SectionsAssignment_1_1 ) ) )
            // InternalPascal.g:5922:1: ( ( rule__Fixed_part__SectionsAssignment_1_1 ) )
            {
            // InternalPascal.g:5922:1: ( ( rule__Fixed_part__SectionsAssignment_1_1 ) )
            // InternalPascal.g:5923:2: ( rule__Fixed_part__SectionsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFixed_partAccess().getSectionsAssignment_1_1()); 
            }
            // InternalPascal.g:5924:2: ( rule__Fixed_part__SectionsAssignment_1_1 )
            // InternalPascal.g:5924:3: rule__Fixed_part__SectionsAssignment_1_1
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
    // InternalPascal.g:5933:1: rule__Record_section__Group__0 : rule__Record_section__Group__0__Impl rule__Record_section__Group__1 ;
    public final void rule__Record_section__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5937:1: ( rule__Record_section__Group__0__Impl rule__Record_section__Group__1 )
            // InternalPascal.g:5938:2: rule__Record_section__Group__0__Impl rule__Record_section__Group__1
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
    // InternalPascal.g:5945:1: rule__Record_section__Group__0__Impl : ( ( rule__Record_section__IdentifiersAssignment_0 ) ) ;
    public final void rule__Record_section__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5949:1: ( ( ( rule__Record_section__IdentifiersAssignment_0 ) ) )
            // InternalPascal.g:5950:1: ( ( rule__Record_section__IdentifiersAssignment_0 ) )
            {
            // InternalPascal.g:5950:1: ( ( rule__Record_section__IdentifiersAssignment_0 ) )
            // InternalPascal.g:5951:2: ( rule__Record_section__IdentifiersAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecord_sectionAccess().getIdentifiersAssignment_0()); 
            }
            // InternalPascal.g:5952:2: ( rule__Record_section__IdentifiersAssignment_0 )
            // InternalPascal.g:5952:3: rule__Record_section__IdentifiersAssignment_0
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
    // InternalPascal.g:5960:1: rule__Record_section__Group__1 : rule__Record_section__Group__1__Impl rule__Record_section__Group__2 ;
    public final void rule__Record_section__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5964:1: ( rule__Record_section__Group__1__Impl rule__Record_section__Group__2 )
            // InternalPascal.g:5965:2: rule__Record_section__Group__1__Impl rule__Record_section__Group__2
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
    // InternalPascal.g:5972:1: rule__Record_section__Group__1__Impl : ( ':' ) ;
    public final void rule__Record_section__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5976:1: ( ( ':' ) )
            // InternalPascal.g:5977:1: ( ':' )
            {
            // InternalPascal.g:5977:1: ( ':' )
            // InternalPascal.g:5978:2: ':'
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
    // InternalPascal.g:5987:1: rule__Record_section__Group__2 : rule__Record_section__Group__2__Impl ;
    public final void rule__Record_section__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5991:1: ( rule__Record_section__Group__2__Impl )
            // InternalPascal.g:5992:2: rule__Record_section__Group__2__Impl
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
    // InternalPascal.g:5998:1: rule__Record_section__Group__2__Impl : ( ( rule__Record_section__TypeAssignment_2 ) ) ;
    public final void rule__Record_section__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6002:1: ( ( ( rule__Record_section__TypeAssignment_2 ) ) )
            // InternalPascal.g:6003:1: ( ( rule__Record_section__TypeAssignment_2 ) )
            {
            // InternalPascal.g:6003:1: ( ( rule__Record_section__TypeAssignment_2 ) )
            // InternalPascal.g:6004:2: ( rule__Record_section__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecord_sectionAccess().getTypeAssignment_2()); 
            }
            // InternalPascal.g:6005:2: ( rule__Record_section__TypeAssignment_2 )
            // InternalPascal.g:6005:3: rule__Record_section__TypeAssignment_2
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
    // InternalPascal.g:6014:1: rule__Variant_part__Group__0 : rule__Variant_part__Group__0__Impl rule__Variant_part__Group__1 ;
    public final void rule__Variant_part__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6018:1: ( rule__Variant_part__Group__0__Impl rule__Variant_part__Group__1 )
            // InternalPascal.g:6019:2: rule__Variant_part__Group__0__Impl rule__Variant_part__Group__1
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
    // InternalPascal.g:6026:1: rule__Variant_part__Group__0__Impl : ( 'case' ) ;
    public final void rule__Variant_part__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6030:1: ( ( 'case' ) )
            // InternalPascal.g:6031:1: ( 'case' )
            {
            // InternalPascal.g:6031:1: ( 'case' )
            // InternalPascal.g:6032:2: 'case'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariant_partAccess().getCaseKeyword_0()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:6041:1: rule__Variant_part__Group__1 : rule__Variant_part__Group__1__Impl rule__Variant_part__Group__2 ;
    public final void rule__Variant_part__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6045:1: ( rule__Variant_part__Group__1__Impl rule__Variant_part__Group__2 )
            // InternalPascal.g:6046:2: rule__Variant_part__Group__1__Impl rule__Variant_part__Group__2
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
    // InternalPascal.g:6053:1: rule__Variant_part__Group__1__Impl : ( ( rule__Variant_part__TagAssignment_1 )? ) ;
    public final void rule__Variant_part__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6057:1: ( ( ( rule__Variant_part__TagAssignment_1 )? ) )
            // InternalPascal.g:6058:1: ( ( rule__Variant_part__TagAssignment_1 )? )
            {
            // InternalPascal.g:6058:1: ( ( rule__Variant_part__TagAssignment_1 )? )
            // InternalPascal.g:6059:2: ( rule__Variant_part__TagAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariant_partAccess().getTagAssignment_1()); 
            }
            // InternalPascal.g:6060:2: ( rule__Variant_part__TagAssignment_1 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_ID) ) {
                int LA50_1 = input.LA(2);

                if ( (LA50_1==27) ) {
                    alt50=1;
                }
            }
            switch (alt50) {
                case 1 :
                    // InternalPascal.g:6060:3: rule__Variant_part__TagAssignment_1
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
    // InternalPascal.g:6068:1: rule__Variant_part__Group__2 : rule__Variant_part__Group__2__Impl rule__Variant_part__Group__3 ;
    public final void rule__Variant_part__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6072:1: ( rule__Variant_part__Group__2__Impl rule__Variant_part__Group__3 )
            // InternalPascal.g:6073:2: rule__Variant_part__Group__2__Impl rule__Variant_part__Group__3
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
    // InternalPascal.g:6080:1: rule__Variant_part__Group__2__Impl : ( ( rule__Variant_part__NameAssignment_2 ) ) ;
    public final void rule__Variant_part__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6084:1: ( ( ( rule__Variant_part__NameAssignment_2 ) ) )
            // InternalPascal.g:6085:1: ( ( rule__Variant_part__NameAssignment_2 ) )
            {
            // InternalPascal.g:6085:1: ( ( rule__Variant_part__NameAssignment_2 ) )
            // InternalPascal.g:6086:2: ( rule__Variant_part__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariant_partAccess().getNameAssignment_2()); 
            }
            // InternalPascal.g:6087:2: ( rule__Variant_part__NameAssignment_2 )
            // InternalPascal.g:6087:3: rule__Variant_part__NameAssignment_2
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
    // InternalPascal.g:6095:1: rule__Variant_part__Group__3 : rule__Variant_part__Group__3__Impl rule__Variant_part__Group__4 ;
    public final void rule__Variant_part__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6099:1: ( rule__Variant_part__Group__3__Impl rule__Variant_part__Group__4 )
            // InternalPascal.g:6100:2: rule__Variant_part__Group__3__Impl rule__Variant_part__Group__4
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
    // InternalPascal.g:6107:1: rule__Variant_part__Group__3__Impl : ( 'of' ) ;
    public final void rule__Variant_part__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6111:1: ( ( 'of' ) )
            // InternalPascal.g:6112:1: ( 'of' )
            {
            // InternalPascal.g:6112:1: ( 'of' )
            // InternalPascal.g:6113:2: 'of'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariant_partAccess().getOfKeyword_3()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:6122:1: rule__Variant_part__Group__4 : rule__Variant_part__Group__4__Impl rule__Variant_part__Group__5 ;
    public final void rule__Variant_part__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6126:1: ( rule__Variant_part__Group__4__Impl rule__Variant_part__Group__5 )
            // InternalPascal.g:6127:2: rule__Variant_part__Group__4__Impl rule__Variant_part__Group__5
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
    // InternalPascal.g:6134:1: rule__Variant_part__Group__4__Impl : ( ( rule__Variant_part__VariantsAssignment_4 ) ) ;
    public final void rule__Variant_part__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6138:1: ( ( ( rule__Variant_part__VariantsAssignment_4 ) ) )
            // InternalPascal.g:6139:1: ( ( rule__Variant_part__VariantsAssignment_4 ) )
            {
            // InternalPascal.g:6139:1: ( ( rule__Variant_part__VariantsAssignment_4 ) )
            // InternalPascal.g:6140:2: ( rule__Variant_part__VariantsAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariant_partAccess().getVariantsAssignment_4()); 
            }
            // InternalPascal.g:6141:2: ( rule__Variant_part__VariantsAssignment_4 )
            // InternalPascal.g:6141:3: rule__Variant_part__VariantsAssignment_4
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
    // InternalPascal.g:6149:1: rule__Variant_part__Group__5 : rule__Variant_part__Group__5__Impl ;
    public final void rule__Variant_part__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6153:1: ( rule__Variant_part__Group__5__Impl )
            // InternalPascal.g:6154:2: rule__Variant_part__Group__5__Impl
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
    // InternalPascal.g:6160:1: rule__Variant_part__Group__5__Impl : ( ( rule__Variant_part__Group_5__0 )* ) ;
    public final void rule__Variant_part__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6164:1: ( ( ( rule__Variant_part__Group_5__0 )* ) )
            // InternalPascal.g:6165:1: ( ( rule__Variant_part__Group_5__0 )* )
            {
            // InternalPascal.g:6165:1: ( ( rule__Variant_part__Group_5__0 )* )
            // InternalPascal.g:6166:2: ( rule__Variant_part__Group_5__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariant_partAccess().getGroup_5()); 
            }
            // InternalPascal.g:6167:2: ( rule__Variant_part__Group_5__0 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==24) ) {
                    int LA51_2 = input.LA(2);

                    if ( ((LA51_2>=RULE_ID && LA51_2<=RULE_INTEGER_NUMBER)||LA51_2==RULE_ADDITION_OP||LA51_2==RULE_STRING||(LA51_2>=RULE_SIGNED_REAL_NUMBER && LA51_2<=RULE_REAL_NUMBER)||(LA51_2>=52 && LA51_2<=53)) ) {
                        alt51=1;
                    }


                }


                switch (alt51) {
            	case 1 :
            	    // InternalPascal.g:6167:3: rule__Variant_part__Group_5__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Variant_part__Group_5__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop51;
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
    // InternalPascal.g:6176:1: rule__Variant_part__Group_5__0 : rule__Variant_part__Group_5__0__Impl rule__Variant_part__Group_5__1 ;
    public final void rule__Variant_part__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6180:1: ( rule__Variant_part__Group_5__0__Impl rule__Variant_part__Group_5__1 )
            // InternalPascal.g:6181:2: rule__Variant_part__Group_5__0__Impl rule__Variant_part__Group_5__1
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
    // InternalPascal.g:6188:1: rule__Variant_part__Group_5__0__Impl : ( ';' ) ;
    public final void rule__Variant_part__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6192:1: ( ( ';' ) )
            // InternalPascal.g:6193:1: ( ';' )
            {
            // InternalPascal.g:6193:1: ( ';' )
            // InternalPascal.g:6194:2: ';'
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
    // InternalPascal.g:6203:1: rule__Variant_part__Group_5__1 : rule__Variant_part__Group_5__1__Impl ;
    public final void rule__Variant_part__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6207:1: ( rule__Variant_part__Group_5__1__Impl )
            // InternalPascal.g:6208:2: rule__Variant_part__Group_5__1__Impl
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
    // InternalPascal.g:6214:1: rule__Variant_part__Group_5__1__Impl : ( ( rule__Variant_part__VariantsAssignment_5_1 ) ) ;
    public final void rule__Variant_part__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6218:1: ( ( ( rule__Variant_part__VariantsAssignment_5_1 ) ) )
            // InternalPascal.g:6219:1: ( ( rule__Variant_part__VariantsAssignment_5_1 ) )
            {
            // InternalPascal.g:6219:1: ( ( rule__Variant_part__VariantsAssignment_5_1 ) )
            // InternalPascal.g:6220:2: ( rule__Variant_part__VariantsAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariant_partAccess().getVariantsAssignment_5_1()); 
            }
            // InternalPascal.g:6221:2: ( rule__Variant_part__VariantsAssignment_5_1 )
            // InternalPascal.g:6221:3: rule__Variant_part__VariantsAssignment_5_1
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
    // InternalPascal.g:6230:1: rule__Tag_field__Group__0 : rule__Tag_field__Group__0__Impl rule__Tag_field__Group__1 ;
    public final void rule__Tag_field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6234:1: ( rule__Tag_field__Group__0__Impl rule__Tag_field__Group__1 )
            // InternalPascal.g:6235:2: rule__Tag_field__Group__0__Impl rule__Tag_field__Group__1
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
    // InternalPascal.g:6242:1: rule__Tag_field__Group__0__Impl : ( ( rule__Tag_field__NameAssignment_0 ) ) ;
    public final void rule__Tag_field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6246:1: ( ( ( rule__Tag_field__NameAssignment_0 ) ) )
            // InternalPascal.g:6247:1: ( ( rule__Tag_field__NameAssignment_0 ) )
            {
            // InternalPascal.g:6247:1: ( ( rule__Tag_field__NameAssignment_0 ) )
            // InternalPascal.g:6248:2: ( rule__Tag_field__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTag_fieldAccess().getNameAssignment_0()); 
            }
            // InternalPascal.g:6249:2: ( rule__Tag_field__NameAssignment_0 )
            // InternalPascal.g:6249:3: rule__Tag_field__NameAssignment_0
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
    // InternalPascal.g:6257:1: rule__Tag_field__Group__1 : rule__Tag_field__Group__1__Impl ;
    public final void rule__Tag_field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6261:1: ( rule__Tag_field__Group__1__Impl )
            // InternalPascal.g:6262:2: rule__Tag_field__Group__1__Impl
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
    // InternalPascal.g:6268:1: rule__Tag_field__Group__1__Impl : ( ':' ) ;
    public final void rule__Tag_field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6272:1: ( ( ':' ) )
            // InternalPascal.g:6273:1: ( ':' )
            {
            // InternalPascal.g:6273:1: ( ':' )
            // InternalPascal.g:6274:2: ':'
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
    // InternalPascal.g:6284:1: rule__Variant__Group__0 : rule__Variant__Group__0__Impl rule__Variant__Group__1 ;
    public final void rule__Variant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6288:1: ( rule__Variant__Group__0__Impl rule__Variant__Group__1 )
            // InternalPascal.g:6289:2: rule__Variant__Group__0__Impl rule__Variant__Group__1
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
    // InternalPascal.g:6296:1: rule__Variant__Group__0__Impl : ( ( rule__Variant__LabelsAssignment_0 ) ) ;
    public final void rule__Variant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6300:1: ( ( ( rule__Variant__LabelsAssignment_0 ) ) )
            // InternalPascal.g:6301:1: ( ( rule__Variant__LabelsAssignment_0 ) )
            {
            // InternalPascal.g:6301:1: ( ( rule__Variant__LabelsAssignment_0 ) )
            // InternalPascal.g:6302:2: ( rule__Variant__LabelsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariantAccess().getLabelsAssignment_0()); 
            }
            // InternalPascal.g:6303:2: ( rule__Variant__LabelsAssignment_0 )
            // InternalPascal.g:6303:3: rule__Variant__LabelsAssignment_0
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
    // InternalPascal.g:6311:1: rule__Variant__Group__1 : rule__Variant__Group__1__Impl rule__Variant__Group__2 ;
    public final void rule__Variant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6315:1: ( rule__Variant__Group__1__Impl rule__Variant__Group__2 )
            // InternalPascal.g:6316:2: rule__Variant__Group__1__Impl rule__Variant__Group__2
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
    // InternalPascal.g:6323:1: rule__Variant__Group__1__Impl : ( ':' ) ;
    public final void rule__Variant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6327:1: ( ( ':' ) )
            // InternalPascal.g:6328:1: ( ':' )
            {
            // InternalPascal.g:6328:1: ( ':' )
            // InternalPascal.g:6329:2: ':'
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
    // InternalPascal.g:6338:1: rule__Variant__Group__2 : rule__Variant__Group__2__Impl rule__Variant__Group__3 ;
    public final void rule__Variant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6342:1: ( rule__Variant__Group__2__Impl rule__Variant__Group__3 )
            // InternalPascal.g:6343:2: rule__Variant__Group__2__Impl rule__Variant__Group__3
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
    // InternalPascal.g:6350:1: rule__Variant__Group__2__Impl : ( '(' ) ;
    public final void rule__Variant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6354:1: ( ( '(' ) )
            // InternalPascal.g:6355:1: ( '(' )
            {
            // InternalPascal.g:6355:1: ( '(' )
            // InternalPascal.g:6356:2: '('
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
    // InternalPascal.g:6365:1: rule__Variant__Group__3 : rule__Variant__Group__3__Impl rule__Variant__Group__4 ;
    public final void rule__Variant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6369:1: ( rule__Variant__Group__3__Impl rule__Variant__Group__4 )
            // InternalPascal.g:6370:2: rule__Variant__Group__3__Impl rule__Variant__Group__4
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
    // InternalPascal.g:6377:1: rule__Variant__Group__3__Impl : ( ( rule__Variant__FieldsAssignment_3 )? ) ;
    public final void rule__Variant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6381:1: ( ( ( rule__Variant__FieldsAssignment_3 )? ) )
            // InternalPascal.g:6382:1: ( ( rule__Variant__FieldsAssignment_3 )? )
            {
            // InternalPascal.g:6382:1: ( ( rule__Variant__FieldsAssignment_3 )? )
            // InternalPascal.g:6383:2: ( rule__Variant__FieldsAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariantAccess().getFieldsAssignment_3()); 
            }
            // InternalPascal.g:6384:2: ( rule__Variant__FieldsAssignment_3 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_ID||LA52_0==44) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalPascal.g:6384:3: rule__Variant__FieldsAssignment_3
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
    // InternalPascal.g:6392:1: rule__Variant__Group__4 : rule__Variant__Group__4__Impl ;
    public final void rule__Variant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6396:1: ( rule__Variant__Group__4__Impl )
            // InternalPascal.g:6397:2: rule__Variant__Group__4__Impl
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
    // InternalPascal.g:6403:1: rule__Variant__Group__4__Impl : ( ')' ) ;
    public final void rule__Variant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6407:1: ( ( ')' ) )
            // InternalPascal.g:6408:1: ( ')' )
            {
            // InternalPascal.g:6408:1: ( ')' )
            // InternalPascal.g:6409:2: ')'
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
    // InternalPascal.g:6419:1: rule__Case_label_list__Group__0 : rule__Case_label_list__Group__0__Impl rule__Case_label_list__Group__1 ;
    public final void rule__Case_label_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6423:1: ( rule__Case_label_list__Group__0__Impl rule__Case_label_list__Group__1 )
            // InternalPascal.g:6424:2: rule__Case_label_list__Group__0__Impl rule__Case_label_list__Group__1
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
    // InternalPascal.g:6431:1: rule__Case_label_list__Group__0__Impl : ( ( rule__Case_label_list__ConstantsAssignment_0 ) ) ;
    public final void rule__Case_label_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6435:1: ( ( ( rule__Case_label_list__ConstantsAssignment_0 ) ) )
            // InternalPascal.g:6436:1: ( ( rule__Case_label_list__ConstantsAssignment_0 ) )
            {
            // InternalPascal.g:6436:1: ( ( rule__Case_label_list__ConstantsAssignment_0 ) )
            // InternalPascal.g:6437:2: ( rule__Case_label_list__ConstantsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCase_label_listAccess().getConstantsAssignment_0()); 
            }
            // InternalPascal.g:6438:2: ( rule__Case_label_list__ConstantsAssignment_0 )
            // InternalPascal.g:6438:3: rule__Case_label_list__ConstantsAssignment_0
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
    // InternalPascal.g:6446:1: rule__Case_label_list__Group__1 : rule__Case_label_list__Group__1__Impl ;
    public final void rule__Case_label_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6450:1: ( rule__Case_label_list__Group__1__Impl )
            // InternalPascal.g:6451:2: rule__Case_label_list__Group__1__Impl
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
    // InternalPascal.g:6457:1: rule__Case_label_list__Group__1__Impl : ( ( rule__Case_label_list__Group_1__0 )* ) ;
    public final void rule__Case_label_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6461:1: ( ( ( rule__Case_label_list__Group_1__0 )* ) )
            // InternalPascal.g:6462:1: ( ( rule__Case_label_list__Group_1__0 )* )
            {
            // InternalPascal.g:6462:1: ( ( rule__Case_label_list__Group_1__0 )* )
            // InternalPascal.g:6463:2: ( rule__Case_label_list__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCase_label_listAccess().getGroup_1()); 
            }
            // InternalPascal.g:6464:2: ( rule__Case_label_list__Group_1__0 )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==32) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalPascal.g:6464:3: rule__Case_label_list__Group_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Case_label_list__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop53;
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
    // InternalPascal.g:6473:1: rule__Case_label_list__Group_1__0 : rule__Case_label_list__Group_1__0__Impl rule__Case_label_list__Group_1__1 ;
    public final void rule__Case_label_list__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6477:1: ( rule__Case_label_list__Group_1__0__Impl rule__Case_label_list__Group_1__1 )
            // InternalPascal.g:6478:2: rule__Case_label_list__Group_1__0__Impl rule__Case_label_list__Group_1__1
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
    // InternalPascal.g:6485:1: rule__Case_label_list__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Case_label_list__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6489:1: ( ( ',' ) )
            // InternalPascal.g:6490:1: ( ',' )
            {
            // InternalPascal.g:6490:1: ( ',' )
            // InternalPascal.g:6491:2: ','
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
    // InternalPascal.g:6500:1: rule__Case_label_list__Group_1__1 : rule__Case_label_list__Group_1__1__Impl ;
    public final void rule__Case_label_list__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6504:1: ( rule__Case_label_list__Group_1__1__Impl )
            // InternalPascal.g:6505:2: rule__Case_label_list__Group_1__1__Impl
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
    // InternalPascal.g:6511:1: rule__Case_label_list__Group_1__1__Impl : ( ( rule__Case_label_list__ConstantsAssignment_1_1 ) ) ;
    public final void rule__Case_label_list__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6515:1: ( ( ( rule__Case_label_list__ConstantsAssignment_1_1 ) ) )
            // InternalPascal.g:6516:1: ( ( rule__Case_label_list__ConstantsAssignment_1_1 ) )
            {
            // InternalPascal.g:6516:1: ( ( rule__Case_label_list__ConstantsAssignment_1_1 ) )
            // InternalPascal.g:6517:2: ( rule__Case_label_list__ConstantsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCase_label_listAccess().getConstantsAssignment_1_1()); 
            }
            // InternalPascal.g:6518:2: ( rule__Case_label_list__ConstantsAssignment_1_1 )
            // InternalPascal.g:6518:3: rule__Case_label_list__ConstantsAssignment_1_1
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
    // InternalPascal.g:6527:1: rule__Pointer_type__Group__0 : rule__Pointer_type__Group__0__Impl rule__Pointer_type__Group__1 ;
    public final void rule__Pointer_type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6531:1: ( rule__Pointer_type__Group__0__Impl rule__Pointer_type__Group__1 )
            // InternalPascal.g:6532:2: rule__Pointer_type__Group__0__Impl rule__Pointer_type__Group__1
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
    // InternalPascal.g:6539:1: rule__Pointer_type__Group__0__Impl : ( '^' ) ;
    public final void rule__Pointer_type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6543:1: ( ( '^' ) )
            // InternalPascal.g:6544:1: ( '^' )
            {
            // InternalPascal.g:6544:1: ( '^' )
            // InternalPascal.g:6545:2: '^'
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
    // InternalPascal.g:6554:1: rule__Pointer_type__Group__1 : rule__Pointer_type__Group__1__Impl ;
    public final void rule__Pointer_type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6558:1: ( rule__Pointer_type__Group__1__Impl )
            // InternalPascal.g:6559:2: rule__Pointer_type__Group__1__Impl
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
    // InternalPascal.g:6565:1: rule__Pointer_type__Group__1__Impl : ( ( rule__Pointer_type__TypeAssignment_1 ) ) ;
    public final void rule__Pointer_type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6569:1: ( ( ( rule__Pointer_type__TypeAssignment_1 ) ) )
            // InternalPascal.g:6570:1: ( ( rule__Pointer_type__TypeAssignment_1 ) )
            {
            // InternalPascal.g:6570:1: ( ( rule__Pointer_type__TypeAssignment_1 ) )
            // InternalPascal.g:6571:2: ( rule__Pointer_type__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointer_typeAccess().getTypeAssignment_1()); 
            }
            // InternalPascal.g:6572:2: ( rule__Pointer_type__TypeAssignment_1 )
            // InternalPascal.g:6572:3: rule__Pointer_type__TypeAssignment_1
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
    // InternalPascal.g:6581:1: rule__Variable_declaration_part__Group__0 : rule__Variable_declaration_part__Group__0__Impl rule__Variable_declaration_part__Group__1 ;
    public final void rule__Variable_declaration_part__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6585:1: ( rule__Variable_declaration_part__Group__0__Impl rule__Variable_declaration_part__Group__1 )
            // InternalPascal.g:6586:2: rule__Variable_declaration_part__Group__0__Impl rule__Variable_declaration_part__Group__1
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
    // InternalPascal.g:6593:1: rule__Variable_declaration_part__Group__0__Impl : ( 'var' ) ;
    public final void rule__Variable_declaration_part__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6597:1: ( ( 'var' ) )
            // InternalPascal.g:6598:1: ( 'var' )
            {
            // InternalPascal.g:6598:1: ( 'var' )
            // InternalPascal.g:6599:2: 'var'
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
    // InternalPascal.g:6608:1: rule__Variable_declaration_part__Group__1 : rule__Variable_declaration_part__Group__1__Impl rule__Variable_declaration_part__Group__2 ;
    public final void rule__Variable_declaration_part__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6612:1: ( rule__Variable_declaration_part__Group__1__Impl rule__Variable_declaration_part__Group__2 )
            // InternalPascal.g:6613:2: rule__Variable_declaration_part__Group__1__Impl rule__Variable_declaration_part__Group__2
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
    // InternalPascal.g:6620:1: rule__Variable_declaration_part__Group__1__Impl : ( ( rule__Variable_declaration_part__SectionsAssignment_1 ) ) ;
    public final void rule__Variable_declaration_part__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6624:1: ( ( ( rule__Variable_declaration_part__SectionsAssignment_1 ) ) )
            // InternalPascal.g:6625:1: ( ( rule__Variable_declaration_part__SectionsAssignment_1 ) )
            {
            // InternalPascal.g:6625:1: ( ( rule__Variable_declaration_part__SectionsAssignment_1 ) )
            // InternalPascal.g:6626:2: ( rule__Variable_declaration_part__SectionsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declaration_partAccess().getSectionsAssignment_1()); 
            }
            // InternalPascal.g:6627:2: ( rule__Variable_declaration_part__SectionsAssignment_1 )
            // InternalPascal.g:6627:3: rule__Variable_declaration_part__SectionsAssignment_1
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
    // InternalPascal.g:6635:1: rule__Variable_declaration_part__Group__2 : rule__Variable_declaration_part__Group__2__Impl rule__Variable_declaration_part__Group__3 ;
    public final void rule__Variable_declaration_part__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6639:1: ( rule__Variable_declaration_part__Group__2__Impl rule__Variable_declaration_part__Group__3 )
            // InternalPascal.g:6640:2: rule__Variable_declaration_part__Group__2__Impl rule__Variable_declaration_part__Group__3
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
    // InternalPascal.g:6647:1: rule__Variable_declaration_part__Group__2__Impl : ( ';' ) ;
    public final void rule__Variable_declaration_part__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6651:1: ( ( ';' ) )
            // InternalPascal.g:6652:1: ( ';' )
            {
            // InternalPascal.g:6652:1: ( ';' )
            // InternalPascal.g:6653:2: ';'
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
    // InternalPascal.g:6662:1: rule__Variable_declaration_part__Group__3 : rule__Variable_declaration_part__Group__3__Impl ;
    public final void rule__Variable_declaration_part__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6666:1: ( rule__Variable_declaration_part__Group__3__Impl )
            // InternalPascal.g:6667:2: rule__Variable_declaration_part__Group__3__Impl
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
    // InternalPascal.g:6673:1: rule__Variable_declaration_part__Group__3__Impl : ( ( rule__Variable_declaration_part__Group_3__0 )* ) ;
    public final void rule__Variable_declaration_part__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6677:1: ( ( ( rule__Variable_declaration_part__Group_3__0 )* ) )
            // InternalPascal.g:6678:1: ( ( rule__Variable_declaration_part__Group_3__0 )* )
            {
            // InternalPascal.g:6678:1: ( ( rule__Variable_declaration_part__Group_3__0 )* )
            // InternalPascal.g:6679:2: ( rule__Variable_declaration_part__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declaration_partAccess().getGroup_3()); 
            }
            // InternalPascal.g:6680:2: ( rule__Variable_declaration_part__Group_3__0 )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==RULE_ID) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalPascal.g:6680:3: rule__Variable_declaration_part__Group_3__0
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__Variable_declaration_part__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop54;
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
    // InternalPascal.g:6689:1: rule__Variable_declaration_part__Group_3__0 : rule__Variable_declaration_part__Group_3__0__Impl rule__Variable_declaration_part__Group_3__1 ;
    public final void rule__Variable_declaration_part__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6693:1: ( rule__Variable_declaration_part__Group_3__0__Impl rule__Variable_declaration_part__Group_3__1 )
            // InternalPascal.g:6694:2: rule__Variable_declaration_part__Group_3__0__Impl rule__Variable_declaration_part__Group_3__1
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
    // InternalPascal.g:6701:1: rule__Variable_declaration_part__Group_3__0__Impl : ( ( rule__Variable_declaration_part__SectionsAssignment_3_0 ) ) ;
    public final void rule__Variable_declaration_part__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6705:1: ( ( ( rule__Variable_declaration_part__SectionsAssignment_3_0 ) ) )
            // InternalPascal.g:6706:1: ( ( rule__Variable_declaration_part__SectionsAssignment_3_0 ) )
            {
            // InternalPascal.g:6706:1: ( ( rule__Variable_declaration_part__SectionsAssignment_3_0 ) )
            // InternalPascal.g:6707:2: ( rule__Variable_declaration_part__SectionsAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declaration_partAccess().getSectionsAssignment_3_0()); 
            }
            // InternalPascal.g:6708:2: ( rule__Variable_declaration_part__SectionsAssignment_3_0 )
            // InternalPascal.g:6708:3: rule__Variable_declaration_part__SectionsAssignment_3_0
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
    // InternalPascal.g:6716:1: rule__Variable_declaration_part__Group_3__1 : rule__Variable_declaration_part__Group_3__1__Impl ;
    public final void rule__Variable_declaration_part__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6720:1: ( rule__Variable_declaration_part__Group_3__1__Impl )
            // InternalPascal.g:6721:2: rule__Variable_declaration_part__Group_3__1__Impl
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
    // InternalPascal.g:6727:1: rule__Variable_declaration_part__Group_3__1__Impl : ( ';' ) ;
    public final void rule__Variable_declaration_part__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6731:1: ( ( ';' ) )
            // InternalPascal.g:6732:1: ( ';' )
            {
            // InternalPascal.g:6732:1: ( ';' )
            // InternalPascal.g:6733:2: ';'
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
    // InternalPascal.g:6743:1: rule__Variable_section__Group__0 : rule__Variable_section__Group__0__Impl rule__Variable_section__Group__1 ;
    public final void rule__Variable_section__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6747:1: ( rule__Variable_section__Group__0__Impl rule__Variable_section__Group__1 )
            // InternalPascal.g:6748:2: rule__Variable_section__Group__0__Impl rule__Variable_section__Group__1
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
    // InternalPascal.g:6755:1: rule__Variable_section__Group__0__Impl : ( ( rule__Variable_section__IdentifiersAssignment_0 ) ) ;
    public final void rule__Variable_section__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6759:1: ( ( ( rule__Variable_section__IdentifiersAssignment_0 ) ) )
            // InternalPascal.g:6760:1: ( ( rule__Variable_section__IdentifiersAssignment_0 ) )
            {
            // InternalPascal.g:6760:1: ( ( rule__Variable_section__IdentifiersAssignment_0 ) )
            // InternalPascal.g:6761:2: ( rule__Variable_section__IdentifiersAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_sectionAccess().getIdentifiersAssignment_0()); 
            }
            // InternalPascal.g:6762:2: ( rule__Variable_section__IdentifiersAssignment_0 )
            // InternalPascal.g:6762:3: rule__Variable_section__IdentifiersAssignment_0
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
    // InternalPascal.g:6770:1: rule__Variable_section__Group__1 : rule__Variable_section__Group__1__Impl rule__Variable_section__Group__2 ;
    public final void rule__Variable_section__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6774:1: ( rule__Variable_section__Group__1__Impl rule__Variable_section__Group__2 )
            // InternalPascal.g:6775:2: rule__Variable_section__Group__1__Impl rule__Variable_section__Group__2
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
    // InternalPascal.g:6782:1: rule__Variable_section__Group__1__Impl : ( ':' ) ;
    public final void rule__Variable_section__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6786:1: ( ( ':' ) )
            // InternalPascal.g:6787:1: ( ':' )
            {
            // InternalPascal.g:6787:1: ( ':' )
            // InternalPascal.g:6788:2: ':'
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
    // InternalPascal.g:6797:1: rule__Variable_section__Group__2 : rule__Variable_section__Group__2__Impl ;
    public final void rule__Variable_section__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6801:1: ( rule__Variable_section__Group__2__Impl )
            // InternalPascal.g:6802:2: rule__Variable_section__Group__2__Impl
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
    // InternalPascal.g:6808:1: rule__Variable_section__Group__2__Impl : ( ( rule__Variable_section__TypeAssignment_2 ) ) ;
    public final void rule__Variable_section__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6812:1: ( ( ( rule__Variable_section__TypeAssignment_2 ) ) )
            // InternalPascal.g:6813:1: ( ( rule__Variable_section__TypeAssignment_2 ) )
            {
            // InternalPascal.g:6813:1: ( ( rule__Variable_section__TypeAssignment_2 ) )
            // InternalPascal.g:6814:2: ( rule__Variable_section__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_sectionAccess().getTypeAssignment_2()); 
            }
            // InternalPascal.g:6815:2: ( rule__Variable_section__TypeAssignment_2 )
            // InternalPascal.g:6815:3: rule__Variable_section__TypeAssignment_2
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
    // InternalPascal.g:6824:1: rule__Variable_identifier_list__Group__0 : rule__Variable_identifier_list__Group__0__Impl rule__Variable_identifier_list__Group__1 ;
    public final void rule__Variable_identifier_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6828:1: ( rule__Variable_identifier_list__Group__0__Impl rule__Variable_identifier_list__Group__1 )
            // InternalPascal.g:6829:2: rule__Variable_identifier_list__Group__0__Impl rule__Variable_identifier_list__Group__1
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
    // InternalPascal.g:6836:1: rule__Variable_identifier_list__Group__0__Impl : ( ( rule__Variable_identifier_list__NamesAssignment_0 ) ) ;
    public final void rule__Variable_identifier_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6840:1: ( ( ( rule__Variable_identifier_list__NamesAssignment_0 ) ) )
            // InternalPascal.g:6841:1: ( ( rule__Variable_identifier_list__NamesAssignment_0 ) )
            {
            // InternalPascal.g:6841:1: ( ( rule__Variable_identifier_list__NamesAssignment_0 ) )
            // InternalPascal.g:6842:2: ( rule__Variable_identifier_list__NamesAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_identifier_listAccess().getNamesAssignment_0()); 
            }
            // InternalPascal.g:6843:2: ( rule__Variable_identifier_list__NamesAssignment_0 )
            // InternalPascal.g:6843:3: rule__Variable_identifier_list__NamesAssignment_0
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
    // InternalPascal.g:6851:1: rule__Variable_identifier_list__Group__1 : rule__Variable_identifier_list__Group__1__Impl ;
    public final void rule__Variable_identifier_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6855:1: ( rule__Variable_identifier_list__Group__1__Impl )
            // InternalPascal.g:6856:2: rule__Variable_identifier_list__Group__1__Impl
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
    // InternalPascal.g:6862:1: rule__Variable_identifier_list__Group__1__Impl : ( ( rule__Variable_identifier_list__Group_1__0 )* ) ;
    public final void rule__Variable_identifier_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6866:1: ( ( ( rule__Variable_identifier_list__Group_1__0 )* ) )
            // InternalPascal.g:6867:1: ( ( rule__Variable_identifier_list__Group_1__0 )* )
            {
            // InternalPascal.g:6867:1: ( ( rule__Variable_identifier_list__Group_1__0 )* )
            // InternalPascal.g:6868:2: ( rule__Variable_identifier_list__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_identifier_listAccess().getGroup_1()); 
            }
            // InternalPascal.g:6869:2: ( rule__Variable_identifier_list__Group_1__0 )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==32) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalPascal.g:6869:3: rule__Variable_identifier_list__Group_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Variable_identifier_list__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop55;
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
    // InternalPascal.g:6878:1: rule__Variable_identifier_list__Group_1__0 : rule__Variable_identifier_list__Group_1__0__Impl rule__Variable_identifier_list__Group_1__1 ;
    public final void rule__Variable_identifier_list__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6882:1: ( rule__Variable_identifier_list__Group_1__0__Impl rule__Variable_identifier_list__Group_1__1 )
            // InternalPascal.g:6883:2: rule__Variable_identifier_list__Group_1__0__Impl rule__Variable_identifier_list__Group_1__1
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
    // InternalPascal.g:6890:1: rule__Variable_identifier_list__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Variable_identifier_list__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6894:1: ( ( ',' ) )
            // InternalPascal.g:6895:1: ( ',' )
            {
            // InternalPascal.g:6895:1: ( ',' )
            // InternalPascal.g:6896:2: ','
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
    // InternalPascal.g:6905:1: rule__Variable_identifier_list__Group_1__1 : rule__Variable_identifier_list__Group_1__1__Impl ;
    public final void rule__Variable_identifier_list__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6909:1: ( rule__Variable_identifier_list__Group_1__1__Impl )
            // InternalPascal.g:6910:2: rule__Variable_identifier_list__Group_1__1__Impl
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
    // InternalPascal.g:6916:1: rule__Variable_identifier_list__Group_1__1__Impl : ( ( rule__Variable_identifier_list__NamesAssignment_1_1 ) ) ;
    public final void rule__Variable_identifier_list__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6920:1: ( ( ( rule__Variable_identifier_list__NamesAssignment_1_1 ) ) )
            // InternalPascal.g:6921:1: ( ( rule__Variable_identifier_list__NamesAssignment_1_1 ) )
            {
            // InternalPascal.g:6921:1: ( ( rule__Variable_identifier_list__NamesAssignment_1_1 ) )
            // InternalPascal.g:6922:2: ( rule__Variable_identifier_list__NamesAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_identifier_listAccess().getNamesAssignment_1_1()); 
            }
            // InternalPascal.g:6923:2: ( rule__Variable_identifier_list__NamesAssignment_1_1 )
            // InternalPascal.g:6923:3: rule__Variable_identifier_list__NamesAssignment_1_1
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
    // InternalPascal.g:6932:1: rule__Pascal__ProgramAssignment : ( ruleprogram ) ;
    public final void rule__Pascal__ProgramAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6936:1: ( ( ruleprogram ) )
            // InternalPascal.g:6937:2: ( ruleprogram )
            {
            // InternalPascal.g:6937:2: ( ruleprogram )
            // InternalPascal.g:6938:3: ruleprogram
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
    // InternalPascal.g:6947:1: rule__Program__HeadingAssignment_0 : ( ruleprogram_heading_block ) ;
    public final void rule__Program__HeadingAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6951:1: ( ( ruleprogram_heading_block ) )
            // InternalPascal.g:6952:2: ( ruleprogram_heading_block )
            {
            // InternalPascal.g:6952:2: ( ruleprogram_heading_block )
            // InternalPascal.g:6953:3: ruleprogram_heading_block
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
    // InternalPascal.g:6962:1: rule__Program__BlockAssignment_1 : ( ruleblock ) ;
    public final void rule__Program__BlockAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6966:1: ( ( ruleblock ) )
            // InternalPascal.g:6967:2: ( ruleblock )
            {
            // InternalPascal.g:6967:2: ( ruleblock )
            // InternalPascal.g:6968:3: ruleblock
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
    // InternalPascal.g:6977:1: rule__Program_heading_block__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Program_heading_block__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6981:1: ( ( RULE_ID ) )
            // InternalPascal.g:6982:2: ( RULE_ID )
            {
            // InternalPascal.g:6982:2: ( RULE_ID )
            // InternalPascal.g:6983:3: RULE_ID
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
    // InternalPascal.g:6992:1: rule__Block__LabelAssignment_0 : ( rulelabel_declaration ) ;
    public final void rule__Block__LabelAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6996:1: ( ( rulelabel_declaration ) )
            // InternalPascal.g:6997:2: ( rulelabel_declaration )
            {
            // InternalPascal.g:6997:2: ( rulelabel_declaration )
            // InternalPascal.g:6998:3: rulelabel_declaration
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
    // InternalPascal.g:7007:1: rule__Block__TypeAssignment_1 : ( ruletype_definition_part ) ;
    public final void rule__Block__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7011:1: ( ( ruletype_definition_part ) )
            // InternalPascal.g:7012:2: ( ruletype_definition_part )
            {
            // InternalPascal.g:7012:2: ( ruletype_definition_part )
            // InternalPascal.g:7013:3: ruletype_definition_part
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
    // InternalPascal.g:7022:1: rule__Block__VariableAssignment_2 : ( rulevariable_declaration_part ) ;
    public final void rule__Block__VariableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7026:1: ( ( rulevariable_declaration_part ) )
            // InternalPascal.g:7027:2: ( rulevariable_declaration_part )
            {
            // InternalPascal.g:7027:2: ( rulevariable_declaration_part )
            // InternalPascal.g:7028:3: rulevariable_declaration_part
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
    // InternalPascal.g:7037:1: rule__Block__ConstantAssignment_3 : ( ruleconstant_definition_part ) ;
    public final void rule__Block__ConstantAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7041:1: ( ( ruleconstant_definition_part ) )
            // InternalPascal.g:7042:2: ( ruleconstant_definition_part )
            {
            // InternalPascal.g:7042:2: ( ruleconstant_definition_part )
            // InternalPascal.g:7043:3: ruleconstant_definition_part
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
    // InternalPascal.g:7052:1: rule__Block__AbstractionAssignment_4 : ( rulefunction_procedure_declaration ) ;
    public final void rule__Block__AbstractionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7056:1: ( ( rulefunction_procedure_declaration ) )
            // InternalPascal.g:7057:2: ( rulefunction_procedure_declaration )
            {
            // InternalPascal.g:7057:2: ( rulefunction_procedure_declaration )
            // InternalPascal.g:7058:3: rulefunction_procedure_declaration
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
    // InternalPascal.g:7067:1: rule__Block__StatementAssignment_5 : ( rulestatement_part ) ;
    public final void rule__Block__StatementAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7071:1: ( ( rulestatement_part ) )
            // InternalPascal.g:7072:2: ( rulestatement_part )
            {
            // InternalPascal.g:7072:2: ( rulestatement_part )
            // InternalPascal.g:7073:3: rulestatement_part
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
    // InternalPascal.g:7082:1: rule__Statement_part__SequenceAssignment_1 : ( rulestatement_sequence ) ;
    public final void rule__Statement_part__SequenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7086:1: ( ( rulestatement_sequence ) )
            // InternalPascal.g:7087:2: ( rulestatement_sequence )
            {
            // InternalPascal.g:7087:2: ( rulestatement_sequence )
            // InternalPascal.g:7088:3: rulestatement_sequence
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
    // InternalPascal.g:7097:1: rule__Statement_sequence__StatementsAssignment_0 : ( rulestatement ) ;
    public final void rule__Statement_sequence__StatementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7101:1: ( ( rulestatement ) )
            // InternalPascal.g:7102:2: ( rulestatement )
            {
            // InternalPascal.g:7102:2: ( rulestatement )
            // InternalPascal.g:7103:3: rulestatement
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
    // InternalPascal.g:7112:1: rule__Statement_sequence__StatementsAssignment_1_1 : ( rulestatement ) ;
    public final void rule__Statement_sequence__StatementsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7116:1: ( ( rulestatement ) )
            // InternalPascal.g:7117:2: ( rulestatement )
            {
            // InternalPascal.g:7117:2: ( rulestatement )
            // InternalPascal.g:7118:3: rulestatement
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
    // InternalPascal.g:7127:1: rule__Statement__LabelAssignment_0_0 : ( rulelabel ) ;
    public final void rule__Statement__LabelAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7131:1: ( ( rulelabel ) )
            // InternalPascal.g:7132:2: ( rulelabel )
            {
            // InternalPascal.g:7132:2: ( rulelabel )
            // InternalPascal.g:7133:3: rulelabel
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
    // InternalPascal.g:7142:1: rule__Statement__SimpleAssignment_1 : ( rulesimple_statement ) ;
    public final void rule__Statement__SimpleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7146:1: ( ( rulesimple_statement ) )
            // InternalPascal.g:7147:2: ( rulesimple_statement )
            {
            // InternalPascal.g:7147:2: ( rulesimple_statement )
            // InternalPascal.g:7148:3: rulesimple_statement
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
    // InternalPascal.g:7157:1: rule__Simple_statement__AssignmentAssignment_0 : ( ruleassignment_statement ) ;
    public final void rule__Simple_statement__AssignmentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7161:1: ( ( ruleassignment_statement ) )
            // InternalPascal.g:7162:2: ( ruleassignment_statement )
            {
            // InternalPascal.g:7162:2: ( ruleassignment_statement )
            // InternalPascal.g:7163:3: ruleassignment_statement
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
    // InternalPascal.g:7172:1: rule__Simple_statement__FunctionAssignment_1 : ( rulefunction_designator ) ;
    public final void rule__Simple_statement__FunctionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7176:1: ( ( rulefunction_designator ) )
            // InternalPascal.g:7177:2: ( rulefunction_designator )
            {
            // InternalPascal.g:7177:2: ( rulefunction_designator )
            // InternalPascal.g:7178:3: rulefunction_designator
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
    // InternalPascal.g:7187:1: rule__Simple_statement__Function_noargsAssignment_2 : ( RULE_ID ) ;
    public final void rule__Simple_statement__Function_noargsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7191:1: ( ( RULE_ID ) )
            // InternalPascal.g:7192:2: ( RULE_ID )
            {
            // InternalPascal.g:7192:2: ( RULE_ID )
            // InternalPascal.g:7193:3: RULE_ID
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
    // InternalPascal.g:7202:1: rule__Assignment_statement__VariableAssignment_0 : ( rulevariable ) ;
    public final void rule__Assignment_statement__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7206:1: ( ( rulevariable ) )
            // InternalPascal.g:7207:2: ( rulevariable )
            {
            // InternalPascal.g:7207:2: ( rulevariable )
            // InternalPascal.g:7208:3: rulevariable
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
    // InternalPascal.g:7217:1: rule__Assignment_statement__ExpressionAssignment_2 : ( ruleexpression ) ;
    public final void rule__Assignment_statement__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7221:1: ( ( ruleexpression ) )
            // InternalPascal.g:7222:2: ( ruleexpression )
            {
            // InternalPascal.g:7222:2: ( ruleexpression )
            // InternalPascal.g:7223:3: ruleexpression
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
    // InternalPascal.g:7232:1: rule__Label__NumberAssignment_0 : ( RULE_SIGNED_INTEGER_NUMBER ) ;
    public final void rule__Label__NumberAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7236:1: ( ( RULE_SIGNED_INTEGER_NUMBER ) )
            // InternalPascal.g:7237:2: ( RULE_SIGNED_INTEGER_NUMBER )
            {
            // InternalPascal.g:7237:2: ( RULE_SIGNED_INTEGER_NUMBER )
            // InternalPascal.g:7238:3: RULE_SIGNED_INTEGER_NUMBER
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
    // InternalPascal.g:7247:1: rule__Label__NumberAssignment_1 : ( RULE_INTEGER_NUMBER ) ;
    public final void rule__Label__NumberAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7251:1: ( ( RULE_INTEGER_NUMBER ) )
            // InternalPascal.g:7252:2: ( RULE_INTEGER_NUMBER )
            {
            // InternalPascal.g:7252:2: ( RULE_INTEGER_NUMBER )
            // InternalPascal.g:7253:3: RULE_INTEGER_NUMBER
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
    // InternalPascal.g:7262:1: rule__Variable__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7266:1: ( ( RULE_ID ) )
            // InternalPascal.g:7267:2: ( RULE_ID )
            {
            // InternalPascal.g:7267:2: ( RULE_ID )
            // InternalPascal.g:7268:3: RULE_ID
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
    // InternalPascal.g:7277:1: rule__Variable__VariableAssignment_1 : ( rulevar_ ) ;
    public final void rule__Variable__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7281:1: ( ( rulevar_ ) )
            // InternalPascal.g:7282:2: ( rulevar_ )
            {
            // InternalPascal.g:7282:2: ( rulevar_ )
            // InternalPascal.g:7283:3: rulevar_
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
    // InternalPascal.g:7292:1: rule__Var___ExpressionsAssignment_0_1 : ( ruleexpression_list ) ;
    public final void rule__Var___ExpressionsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7296:1: ( ( ruleexpression_list ) )
            // InternalPascal.g:7297:2: ( ruleexpression_list )
            {
            // InternalPascal.g:7297:2: ( ruleexpression_list )
            // InternalPascal.g:7298:3: ruleexpression_list
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
    // InternalPascal.g:7307:1: rule__Var___ArrayAssignment_0_3 : ( rulevar_ ) ;
    public final void rule__Var___ArrayAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7311:1: ( ( rulevar_ ) )
            // InternalPascal.g:7312:2: ( rulevar_ )
            {
            // InternalPascal.g:7312:2: ( rulevar_ )
            // InternalPascal.g:7313:3: rulevar_
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
    // InternalPascal.g:7322:1: rule__Var___AccessorAssignment_1_0 : ( ( '.' ) ) ;
    public final void rule__Var___AccessorAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7326:1: ( ( ( '.' ) ) )
            // InternalPascal.g:7327:2: ( ( '.' ) )
            {
            // InternalPascal.g:7327:2: ( ( '.' ) )
            // InternalPascal.g:7328:3: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVar_Access().getAccessorFullStopKeyword_1_0_0()); 
            }
            // InternalPascal.g:7329:3: ( '.' )
            // InternalPascal.g:7330:4: '.'
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
    // InternalPascal.g:7341:1: rule__Var___NameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Var___NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7345:1: ( ( RULE_ID ) )
            // InternalPascal.g:7346:2: ( RULE_ID )
            {
            // InternalPascal.g:7346:2: ( RULE_ID )
            // InternalPascal.g:7347:3: RULE_ID
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
    // InternalPascal.g:7356:1: rule__Var___VariableAssignment_1_2 : ( rulevar_ ) ;
    public final void rule__Var___VariableAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7360:1: ( ( rulevar_ ) )
            // InternalPascal.g:7361:2: ( rulevar_ )
            {
            // InternalPascal.g:7361:2: ( rulevar_ )
            // InternalPascal.g:7362:3: rulevar_
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
    // InternalPascal.g:7371:1: rule__Var___PointerAssignment_2_1 : ( rulevar_ ) ;
    public final void rule__Var___PointerAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7375:1: ( ( rulevar_ ) )
            // InternalPascal.g:7376:2: ( rulevar_ )
            {
            // InternalPascal.g:7376:2: ( rulevar_ )
            // InternalPascal.g:7377:3: rulevar_
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
    // InternalPascal.g:7386:1: rule__Expression_list__ExpressionsAssignment_0 : ( ruleexpression ) ;
    public final void rule__Expression_list__ExpressionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7390:1: ( ( ruleexpression ) )
            // InternalPascal.g:7391:2: ( ruleexpression )
            {
            // InternalPascal.g:7391:2: ( ruleexpression )
            // InternalPascal.g:7392:3: ruleexpression
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
    // InternalPascal.g:7401:1: rule__Expression_list__ExpressionsAssignment_1_1 : ( ruleexpression ) ;
    public final void rule__Expression_list__ExpressionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7405:1: ( ( ruleexpression ) )
            // InternalPascal.g:7406:2: ( ruleexpression )
            {
            // InternalPascal.g:7406:2: ( ruleexpression )
            // InternalPascal.g:7407:3: ruleexpression
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
    // InternalPascal.g:7416:1: rule__Expression__ExpressionsAssignment_0 : ( rulesimple_expression ) ;
    public final void rule__Expression__ExpressionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7420:1: ( ( rulesimple_expression ) )
            // InternalPascal.g:7421:2: ( rulesimple_expression )
            {
            // InternalPascal.g:7421:2: ( rulesimple_expression )
            // InternalPascal.g:7422:3: rulesimple_expression
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
    // InternalPascal.g:7431:1: rule__Expression__OperatorsAssignment_1_0_0 : ( RULE_RELATIONAL_OP ) ;
    public final void rule__Expression__OperatorsAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7435:1: ( ( RULE_RELATIONAL_OP ) )
            // InternalPascal.g:7436:2: ( RULE_RELATIONAL_OP )
            {
            // InternalPascal.g:7436:2: ( RULE_RELATIONAL_OP )
            // InternalPascal.g:7437:3: RULE_RELATIONAL_OP
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
    // InternalPascal.g:7446:1: rule__Expression__OperatorsAssignment_1_0_1 : ( ( 'in' ) ) ;
    public final void rule__Expression__OperatorsAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7450:1: ( ( ( 'in' ) ) )
            // InternalPascal.g:7451:2: ( ( 'in' ) )
            {
            // InternalPascal.g:7451:2: ( ( 'in' ) )
            // InternalPascal.g:7452:3: ( 'in' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getOperatorsInKeyword_1_0_1_0()); 
            }
            // InternalPascal.g:7453:3: ( 'in' )
            // InternalPascal.g:7454:4: 'in'
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
    // InternalPascal.g:7465:1: rule__Expression__OperatorsAssignment_1_0_2 : ( ( '=' ) ) ;
    public final void rule__Expression__OperatorsAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7469:1: ( ( ( '=' ) ) )
            // InternalPascal.g:7470:2: ( ( '=' ) )
            {
            // InternalPascal.g:7470:2: ( ( '=' ) )
            // InternalPascal.g:7471:3: ( '=' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getOperatorsEqualsSignKeyword_1_0_2_0()); 
            }
            // InternalPascal.g:7472:3: ( '=' )
            // InternalPascal.g:7473:4: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getOperatorsEqualsSignKeyword_1_0_2_0()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:7484:1: rule__Expression__ExpressionsAssignment_1_1 : ( rulesimple_expression ) ;
    public final void rule__Expression__ExpressionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7488:1: ( ( rulesimple_expression ) )
            // InternalPascal.g:7489:2: ( rulesimple_expression )
            {
            // InternalPascal.g:7489:2: ( rulesimple_expression )
            // InternalPascal.g:7490:3: rulesimple_expression
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
    // InternalPascal.g:7499:1: rule__Simple_expression__PrefixOperatorAssignment_0 : ( RULE_ADDITION_OP ) ;
    public final void rule__Simple_expression__PrefixOperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7503:1: ( ( RULE_ADDITION_OP ) )
            // InternalPascal.g:7504:2: ( RULE_ADDITION_OP )
            {
            // InternalPascal.g:7504:2: ( RULE_ADDITION_OP )
            // InternalPascal.g:7505:3: RULE_ADDITION_OP
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
    // InternalPascal.g:7514:1: rule__Simple_expression__TermsAssignment_1 : ( ruleterm ) ;
    public final void rule__Simple_expression__TermsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7518:1: ( ( ruleterm ) )
            // InternalPascal.g:7519:2: ( ruleterm )
            {
            // InternalPascal.g:7519:2: ( ruleterm )
            // InternalPascal.g:7520:3: ruleterm
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
    // InternalPascal.g:7529:1: rule__Simple_expression__OperatorsAssignment_2_0_0_0 : ( RULE_ADDITION_OP ) ;
    public final void rule__Simple_expression__OperatorsAssignment_2_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7533:1: ( ( RULE_ADDITION_OP ) )
            // InternalPascal.g:7534:2: ( RULE_ADDITION_OP )
            {
            // InternalPascal.g:7534:2: ( RULE_ADDITION_OP )
            // InternalPascal.g:7535:3: RULE_ADDITION_OP
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
    // InternalPascal.g:7544:1: rule__Simple_expression__OperatorsAssignment_2_0_0_1 : ( ( 'or' ) ) ;
    public final void rule__Simple_expression__OperatorsAssignment_2_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7548:1: ( ( ( 'or' ) ) )
            // InternalPascal.g:7549:2: ( ( 'or' ) )
            {
            // InternalPascal.g:7549:2: ( ( 'or' ) )
            // InternalPascal.g:7550:3: ( 'or' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimple_expressionAccess().getOperatorsOrKeyword_2_0_0_1_0()); 
            }
            // InternalPascal.g:7551:3: ( 'or' )
            // InternalPascal.g:7552:4: 'or'
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
    // InternalPascal.g:7563:1: rule__Simple_expression__TermsAssignment_2_0_1 : ( ruleterm ) ;
    public final void rule__Simple_expression__TermsAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7567:1: ( ( ruleterm ) )
            // InternalPascal.g:7568:2: ( ruleterm )
            {
            // InternalPascal.g:7568:2: ( ruleterm )
            // InternalPascal.g:7569:3: ruleterm
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
    // InternalPascal.g:7578:1: rule__Simple_expression__TermsAssignment_2_1 : ( ruleunsigned_number ) ;
    public final void rule__Simple_expression__TermsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7582:1: ( ( ruleunsigned_number ) )
            // InternalPascal.g:7583:2: ( ruleunsigned_number )
            {
            // InternalPascal.g:7583:2: ( ruleunsigned_number )
            // InternalPascal.g:7584:3: ruleunsigned_number
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
    // InternalPascal.g:7593:1: rule__Term__FactorsAssignment_0 : ( rulefactor ) ;
    public final void rule__Term__FactorsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7597:1: ( ( rulefactor ) )
            // InternalPascal.g:7598:2: ( rulefactor )
            {
            // InternalPascal.g:7598:2: ( rulefactor )
            // InternalPascal.g:7599:3: rulefactor
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
    // InternalPascal.g:7608:1: rule__Term__OperatorsAssignment_1_0_0 : ( RULE_MULTIPLICATION_OP ) ;
    public final void rule__Term__OperatorsAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7612:1: ( ( RULE_MULTIPLICATION_OP ) )
            // InternalPascal.g:7613:2: ( RULE_MULTIPLICATION_OP )
            {
            // InternalPascal.g:7613:2: ( RULE_MULTIPLICATION_OP )
            // InternalPascal.g:7614:3: RULE_MULTIPLICATION_OP
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
    // InternalPascal.g:7623:1: rule__Term__OperatorsAssignment_1_0_1 : ( ( 'div' ) ) ;
    public final void rule__Term__OperatorsAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7627:1: ( ( ( 'div' ) ) )
            // InternalPascal.g:7628:2: ( ( 'div' ) )
            {
            // InternalPascal.g:7628:2: ( ( 'div' ) )
            // InternalPascal.g:7629:3: ( 'div' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getOperatorsDivKeyword_1_0_1_0()); 
            }
            // InternalPascal.g:7630:3: ( 'div' )
            // InternalPascal.g:7631:4: 'div'
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
    // InternalPascal.g:7642:1: rule__Term__OperatorsAssignment_1_0_2 : ( ( 'mod' ) ) ;
    public final void rule__Term__OperatorsAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7646:1: ( ( ( 'mod' ) ) )
            // InternalPascal.g:7647:2: ( ( 'mod' ) )
            {
            // InternalPascal.g:7647:2: ( ( 'mod' ) )
            // InternalPascal.g:7648:3: ( 'mod' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getOperatorsModKeyword_1_0_2_0()); 
            }
            // InternalPascal.g:7649:3: ( 'mod' )
            // InternalPascal.g:7650:4: 'mod'
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
    // InternalPascal.g:7661:1: rule__Term__OperatorsAssignment_1_0_3 : ( ( 'and' ) ) ;
    public final void rule__Term__OperatorsAssignment_1_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7665:1: ( ( ( 'and' ) ) )
            // InternalPascal.g:7666:2: ( ( 'and' ) )
            {
            // InternalPascal.g:7666:2: ( ( 'and' ) )
            // InternalPascal.g:7667:3: ( 'and' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getOperatorsAndKeyword_1_0_3_0()); 
            }
            // InternalPascal.g:7668:3: ( 'and' )
            // InternalPascal.g:7669:4: 'and'
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
    // InternalPascal.g:7680:1: rule__Term__FactorsAssignment_1_1 : ( rulefactor ) ;
    public final void rule__Term__FactorsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7684:1: ( ( rulefactor ) )
            // InternalPascal.g:7685:2: ( rulefactor )
            {
            // InternalPascal.g:7685:2: ( rulefactor )
            // InternalPascal.g:7686:3: rulefactor
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
    // InternalPascal.g:7695:1: rule__Factor__VariableAssignment_0 : ( rulevariable ) ;
    public final void rule__Factor__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7699:1: ( ( rulevariable ) )
            // InternalPascal.g:7700:2: ( rulevariable )
            {
            // InternalPascal.g:7700:2: ( rulevariable )
            // InternalPascal.g:7701:3: rulevariable
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
    // InternalPascal.g:7710:1: rule__Factor__NumberAssignment_1 : ( rulenumber ) ;
    public final void rule__Factor__NumberAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7714:1: ( ( rulenumber ) )
            // InternalPascal.g:7715:2: ( rulenumber )
            {
            // InternalPascal.g:7715:2: ( rulenumber )
            // InternalPascal.g:7716:3: rulenumber
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
    // InternalPascal.g:7725:1: rule__Factor__StringAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Factor__StringAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7729:1: ( ( RULE_STRING ) )
            // InternalPascal.g:7730:2: ( RULE_STRING )
            {
            // InternalPascal.g:7730:2: ( RULE_STRING )
            // InternalPascal.g:7731:3: RULE_STRING
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
    // InternalPascal.g:7740:1: rule__Factor__SetAssignment_3 : ( ruleset ) ;
    public final void rule__Factor__SetAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7744:1: ( ( ruleset ) )
            // InternalPascal.g:7745:2: ( ruleset )
            {
            // InternalPascal.g:7745:2: ( ruleset )
            // InternalPascal.g:7746:3: ruleset
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
    // InternalPascal.g:7755:1: rule__Factor__NilAssignment_4 : ( ( 'nil' ) ) ;
    public final void rule__Factor__NilAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7759:1: ( ( ( 'nil' ) ) )
            // InternalPascal.g:7760:2: ( ( 'nil' ) )
            {
            // InternalPascal.g:7760:2: ( ( 'nil' ) )
            // InternalPascal.g:7761:3: ( 'nil' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getNilNilKeyword_4_0()); 
            }
            // InternalPascal.g:7762:3: ( 'nil' )
            // InternalPascal.g:7763:4: 'nil'
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
    // InternalPascal.g:7774:1: rule__Factor__BooleanAssignment_5 : ( ( 'true' ) ) ;
    public final void rule__Factor__BooleanAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7778:1: ( ( ( 'true' ) ) )
            // InternalPascal.g:7779:2: ( ( 'true' ) )
            {
            // InternalPascal.g:7779:2: ( ( 'true' ) )
            // InternalPascal.g:7780:3: ( 'true' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getBooleanTrueKeyword_5_0()); 
            }
            // InternalPascal.g:7781:3: ( 'true' )
            // InternalPascal.g:7782:4: 'true'
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
    // InternalPascal.g:7793:1: rule__Factor__BooleanAssignment_6 : ( ( 'false' ) ) ;
    public final void rule__Factor__BooleanAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7797:1: ( ( ( 'false' ) ) )
            // InternalPascal.g:7798:2: ( ( 'false' ) )
            {
            // InternalPascal.g:7798:2: ( ( 'false' ) )
            // InternalPascal.g:7799:3: ( 'false' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getBooleanFalseKeyword_6_0()); 
            }
            // InternalPascal.g:7800:3: ( 'false' )
            // InternalPascal.g:7801:4: 'false'
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
    // InternalPascal.g:7812:1: rule__Factor__FunctionAssignment_7 : ( rulefunction_designator ) ;
    public final void rule__Factor__FunctionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7816:1: ( ( rulefunction_designator ) )
            // InternalPascal.g:7817:2: ( rulefunction_designator )
            {
            // InternalPascal.g:7817:2: ( rulefunction_designator )
            // InternalPascal.g:7818:3: rulefunction_designator
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
    // InternalPascal.g:7827:1: rule__Factor__ExpressionAssignment_8_1 : ( ruleexpression ) ;
    public final void rule__Factor__ExpressionAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7831:1: ( ( ruleexpression ) )
            // InternalPascal.g:7832:2: ( ruleexpression )
            {
            // InternalPascal.g:7832:2: ( ruleexpression )
            // InternalPascal.g:7833:3: ruleexpression
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
    // InternalPascal.g:7842:1: rule__Factor__NotAssignment_9_1 : ( rulefactor ) ;
    public final void rule__Factor__NotAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7846:1: ( ( rulefactor ) )
            // InternalPascal.g:7847:2: ( rulefactor )
            {
            // InternalPascal.g:7847:2: ( rulefactor )
            // InternalPascal.g:7848:3: rulefactor
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
    // InternalPascal.g:7857:1: rule__Function_designator__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Function_designator__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7861:1: ( ( RULE_ID ) )
            // InternalPascal.g:7862:2: ( RULE_ID )
            {
            // InternalPascal.g:7862:2: ( RULE_ID )
            // InternalPascal.g:7863:3: RULE_ID
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
    // InternalPascal.g:7872:1: rule__Function_designator__ExpressionsAssignment_2 : ( ruleexpression_list ) ;
    public final void rule__Function_designator__ExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7876:1: ( ( ruleexpression_list ) )
            // InternalPascal.g:7877:2: ( ruleexpression_list )
            {
            // InternalPascal.g:7877:2: ( ruleexpression_list )
            // InternalPascal.g:7878:3: ruleexpression_list
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
    // InternalPascal.g:7887:1: rule__Function_procedure_declaration__ProceduresAssignment_0_0 : ( rulefunction_declaration ) ;
    public final void rule__Function_procedure_declaration__ProceduresAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7891:1: ( ( rulefunction_declaration ) )
            // InternalPascal.g:7892:2: ( rulefunction_declaration )
            {
            // InternalPascal.g:7892:2: ( rulefunction_declaration )
            // InternalPascal.g:7893:3: rulefunction_declaration
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
    // InternalPascal.g:7902:1: rule__Function_procedure_declaration__FunctionsAssignment_0_1 : ( ruleprocedure_declaration ) ;
    public final void rule__Function_procedure_declaration__FunctionsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7906:1: ( ( ruleprocedure_declaration ) )
            // InternalPascal.g:7907:2: ( ruleprocedure_declaration )
            {
            // InternalPascal.g:7907:2: ( ruleprocedure_declaration )
            // InternalPascal.g:7908:3: ruleprocedure_declaration
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
    // InternalPascal.g:7917:1: rule__Function_heading__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Function_heading__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7921:1: ( ( RULE_ID ) )
            // InternalPascal.g:7922:2: ( RULE_ID )
            {
            // InternalPascal.g:7922:2: ( RULE_ID )
            // InternalPascal.g:7923:3: RULE_ID
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
    // InternalPascal.g:7932:1: rule__Function_heading__ParametersAssignment_2 : ( ruleformal_parameter_list ) ;
    public final void rule__Function_heading__ParametersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7936:1: ( ( ruleformal_parameter_list ) )
            // InternalPascal.g:7937:2: ( ruleformal_parameter_list )
            {
            // InternalPascal.g:7937:2: ( ruleformal_parameter_list )
            // InternalPascal.g:7938:3: ruleformal_parameter_list
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
    // InternalPascal.g:7947:1: rule__Function_heading__ReturnTypeAssignment_4 : ( RULE_ID ) ;
    public final void rule__Function_heading__ReturnTypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7951:1: ( ( RULE_ID ) )
            // InternalPascal.g:7952:2: ( RULE_ID )
            {
            // InternalPascal.g:7952:2: ( RULE_ID )
            // InternalPascal.g:7953:3: RULE_ID
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
    // InternalPascal.g:7962:1: rule__Function_declaration__HeadingAssignment_0 : ( rulefunction_heading ) ;
    public final void rule__Function_declaration__HeadingAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7966:1: ( ( rulefunction_heading ) )
            // InternalPascal.g:7967:2: ( rulefunction_heading )
            {
            // InternalPascal.g:7967:2: ( rulefunction_heading )
            // InternalPascal.g:7968:3: rulefunction_heading
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
    // InternalPascal.g:7977:1: rule__Function_declaration__BlockAssignment_2 : ( ruleblock ) ;
    public final void rule__Function_declaration__BlockAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7981:1: ( ( ruleblock ) )
            // InternalPascal.g:7982:2: ( ruleblock )
            {
            // InternalPascal.g:7982:2: ( ruleblock )
            // InternalPascal.g:7983:3: ruleblock
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
    // InternalPascal.g:7992:1: rule__Formal_parameter_list__ParametersAssignment_1 : ( ruleformal_parameter_section ) ;
    public final void rule__Formal_parameter_list__ParametersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7996:1: ( ( ruleformal_parameter_section ) )
            // InternalPascal.g:7997:2: ( ruleformal_parameter_section )
            {
            // InternalPascal.g:7997:2: ( ruleformal_parameter_section )
            // InternalPascal.g:7998:3: ruleformal_parameter_section
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
    // InternalPascal.g:8007:1: rule__Formal_parameter_list__ParametersAssignment_2_1 : ( ruleformal_parameter_section ) ;
    public final void rule__Formal_parameter_list__ParametersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8011:1: ( ( ruleformal_parameter_section ) )
            // InternalPascal.g:8012:2: ( ruleformal_parameter_section )
            {
            // InternalPascal.g:8012:2: ( ruleformal_parameter_section )
            // InternalPascal.g:8013:3: ruleformal_parameter_section
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
    // InternalPascal.g:8022:1: rule__Formal_parameter_section__ValueAssignment_0 : ( rulevalue_parameter_section ) ;
    public final void rule__Formal_parameter_section__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8026:1: ( ( rulevalue_parameter_section ) )
            // InternalPascal.g:8027:2: ( rulevalue_parameter_section )
            {
            // InternalPascal.g:8027:2: ( rulevalue_parameter_section )
            // InternalPascal.g:8028:3: rulevalue_parameter_section
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
    // InternalPascal.g:8037:1: rule__Formal_parameter_section__VariableAssignment_1 : ( rulevariable_parameter_section ) ;
    public final void rule__Formal_parameter_section__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8041:1: ( ( rulevariable_parameter_section ) )
            // InternalPascal.g:8042:2: ( rulevariable_parameter_section )
            {
            // InternalPascal.g:8042:2: ( rulevariable_parameter_section )
            // InternalPascal.g:8043:3: rulevariable_parameter_section
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
    // InternalPascal.g:8052:1: rule__Formal_parameter_section__ProcedureAssignment_2 : ( ruleprocedure_heading ) ;
    public final void rule__Formal_parameter_section__ProcedureAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8056:1: ( ( ruleprocedure_heading ) )
            // InternalPascal.g:8057:2: ( ruleprocedure_heading )
            {
            // InternalPascal.g:8057:2: ( ruleprocedure_heading )
            // InternalPascal.g:8058:3: ruleprocedure_heading
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
    // InternalPascal.g:8067:1: rule__Formal_parameter_section__FunctionAssignment_3 : ( rulefunction_heading ) ;
    public final void rule__Formal_parameter_section__FunctionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8071:1: ( ( rulefunction_heading ) )
            // InternalPascal.g:8072:2: ( rulefunction_heading )
            {
            // InternalPascal.g:8072:2: ( rulefunction_heading )
            // InternalPascal.g:8073:3: rulefunction_heading
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
    // InternalPascal.g:8082:1: rule__Value_parameter_section__IdentifiersAssignment_0 : ( ruleidentifier_list ) ;
    public final void rule__Value_parameter_section__IdentifiersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8086:1: ( ( ruleidentifier_list ) )
            // InternalPascal.g:8087:2: ( ruleidentifier_list )
            {
            // InternalPascal.g:8087:2: ( ruleidentifier_list )
            // InternalPascal.g:8088:3: ruleidentifier_list
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
    // InternalPascal.g:8097:1: rule__Value_parameter_section__TypeAssignment_2 : ( ruleparameter_type ) ;
    public final void rule__Value_parameter_section__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8101:1: ( ( ruleparameter_type ) )
            // InternalPascal.g:8102:2: ( ruleparameter_type )
            {
            // InternalPascal.g:8102:2: ( ruleparameter_type )
            // InternalPascal.g:8103:3: ruleparameter_type
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
    // InternalPascal.g:8112:1: rule__Identifier_list__NamesAssignment_0 : ( RULE_ID ) ;
    public final void rule__Identifier_list__NamesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8116:1: ( ( RULE_ID ) )
            // InternalPascal.g:8117:2: ( RULE_ID )
            {
            // InternalPascal.g:8117:2: ( RULE_ID )
            // InternalPascal.g:8118:3: RULE_ID
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
    // InternalPascal.g:8127:1: rule__Identifier_list__NamesAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Identifier_list__NamesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8131:1: ( ( RULE_ID ) )
            // InternalPascal.g:8132:2: ( RULE_ID )
            {
            // InternalPascal.g:8132:2: ( RULE_ID )
            // InternalPascal.g:8133:3: RULE_ID
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
    // InternalPascal.g:8142:1: rule__Parameter_type__NameAssignment : ( RULE_ID ) ;
    public final void rule__Parameter_type__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8146:1: ( ( RULE_ID ) )
            // InternalPascal.g:8147:2: ( RULE_ID )
            {
            // InternalPascal.g:8147:2: ( RULE_ID )
            // InternalPascal.g:8148:3: RULE_ID
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
    // InternalPascal.g:8157:1: rule__Variable_parameter_section__IndentifiersAssignment_1 : ( ruleidentifier_list ) ;
    public final void rule__Variable_parameter_section__IndentifiersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8161:1: ( ( ruleidentifier_list ) )
            // InternalPascal.g:8162:2: ( ruleidentifier_list )
            {
            // InternalPascal.g:8162:2: ( ruleidentifier_list )
            // InternalPascal.g:8163:3: ruleidentifier_list
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
    // InternalPascal.g:8172:1: rule__Variable_parameter_section__TypeAssignment_3 : ( ruleparameter_type ) ;
    public final void rule__Variable_parameter_section__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8176:1: ( ( ruleparameter_type ) )
            // InternalPascal.g:8177:2: ( ruleparameter_type )
            {
            // InternalPascal.g:8177:2: ( ruleparameter_type )
            // InternalPascal.g:8178:3: ruleparameter_type
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
    // InternalPascal.g:8187:1: rule__Procedure_declaration__HeadingAssignment_0 : ( ruleprocedure_heading ) ;
    public final void rule__Procedure_declaration__HeadingAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8191:1: ( ( ruleprocedure_heading ) )
            // InternalPascal.g:8192:2: ( ruleprocedure_heading )
            {
            // InternalPascal.g:8192:2: ( ruleprocedure_heading )
            // InternalPascal.g:8193:3: ruleprocedure_heading
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
    // InternalPascal.g:8202:1: rule__Procedure_declaration__BlockAssignment_2 : ( ruleblock ) ;
    public final void rule__Procedure_declaration__BlockAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8206:1: ( ( ruleblock ) )
            // InternalPascal.g:8207:2: ( ruleblock )
            {
            // InternalPascal.g:8207:2: ( ruleblock )
            // InternalPascal.g:8208:3: ruleblock
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
    // InternalPascal.g:8217:1: rule__Procedure_heading__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Procedure_heading__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8221:1: ( ( RULE_ID ) )
            // InternalPascal.g:8222:2: ( RULE_ID )
            {
            // InternalPascal.g:8222:2: ( RULE_ID )
            // InternalPascal.g:8223:3: RULE_ID
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
    // InternalPascal.g:8232:1: rule__Procedure_heading__ParametersAssignment_2 : ( ruleformal_parameter_list ) ;
    public final void rule__Procedure_heading__ParametersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8236:1: ( ( ruleformal_parameter_list ) )
            // InternalPascal.g:8237:2: ( ruleformal_parameter_list )
            {
            // InternalPascal.g:8237:2: ( ruleformal_parameter_list )
            // InternalPascal.g:8238:3: ruleformal_parameter_list
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
    // InternalPascal.g:8247:1: rule__Set__BracketsAssignment_0 : ( ( '[' ) ) ;
    public final void rule__Set__BracketsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8251:1: ( ( ( '[' ) ) )
            // InternalPascal.g:8252:2: ( ( '[' ) )
            {
            // InternalPascal.g:8252:2: ( ( '[' ) )
            // InternalPascal.g:8253:3: ( '[' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetAccess().getBracketsLeftSquareBracketKeyword_0_0()); 
            }
            // InternalPascal.g:8254:3: ( '[' )
            // InternalPascal.g:8255:4: '['
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
    // InternalPascal.g:8266:1: rule__Set__ExpressionsAssignment_1 : ( ruleexpression_list ) ;
    public final void rule__Set__ExpressionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8270:1: ( ( ruleexpression_list ) )
            // InternalPascal.g:8271:2: ( ruleexpression_list )
            {
            // InternalPascal.g:8271:2: ( ruleexpression_list )
            // InternalPascal.g:8272:3: ruleexpression_list
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
    // InternalPascal.g:8281:1: rule__Set__BracketsAssignment_2 : ( ( ']' ) ) ;
    public final void rule__Set__BracketsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8285:1: ( ( ( ']' ) ) )
            // InternalPascal.g:8286:2: ( ( ']' ) )
            {
            // InternalPascal.g:8286:2: ( ( ']' ) )
            // InternalPascal.g:8287:3: ( ']' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetAccess().getBracketsRightSquareBracketKeyword_2_0()); 
            }
            // InternalPascal.g:8288:3: ( ']' )
            // InternalPascal.g:8289:4: ']'
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
    // InternalPascal.g:8300:1: rule__Number__NumberAssignment : ( ruleany_number ) ;
    public final void rule__Number__NumberAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8304:1: ( ( ruleany_number ) )
            // InternalPascal.g:8305:2: ( ruleany_number )
            {
            // InternalPascal.g:8305:2: ( ruleany_number )
            // InternalPascal.g:8306:3: ruleany_number
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
    // InternalPascal.g:8315:1: rule__Label_declaration__LabelsAssignment_1 : ( rulelabel ) ;
    public final void rule__Label_declaration__LabelsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8319:1: ( ( rulelabel ) )
            // InternalPascal.g:8320:2: ( rulelabel )
            {
            // InternalPascal.g:8320:2: ( rulelabel )
            // InternalPascal.g:8321:3: rulelabel
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
    // InternalPascal.g:8330:1: rule__Label_declaration__LabelsAssignment_2_1 : ( rulelabel ) ;
    public final void rule__Label_declaration__LabelsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8334:1: ( ( rulelabel ) )
            // InternalPascal.g:8335:2: ( rulelabel )
            {
            // InternalPascal.g:8335:2: ( rulelabel )
            // InternalPascal.g:8336:3: rulelabel
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
    // InternalPascal.g:8345:1: rule__Constant__OpteratorAssignment_0_0 : ( RULE_ADDITION_OP ) ;
    public final void rule__Constant__OpteratorAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8349:1: ( ( RULE_ADDITION_OP ) )
            // InternalPascal.g:8350:2: ( RULE_ADDITION_OP )
            {
            // InternalPascal.g:8350:2: ( RULE_ADDITION_OP )
            // InternalPascal.g:8351:3: RULE_ADDITION_OP
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
    // InternalPascal.g:8360:1: rule__Constant__NameAssignment_0_1_0 : ( RULE_ID ) ;
    public final void rule__Constant__NameAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8364:1: ( ( RULE_ID ) )
            // InternalPascal.g:8365:2: ( RULE_ID )
            {
            // InternalPascal.g:8365:2: ( RULE_ID )
            // InternalPascal.g:8366:3: RULE_ID
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
    // InternalPascal.g:8375:1: rule__Constant__NumberAssignment_0_1_1 : ( rulenumber ) ;
    public final void rule__Constant__NumberAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8379:1: ( ( rulenumber ) )
            // InternalPascal.g:8380:2: ( rulenumber )
            {
            // InternalPascal.g:8380:2: ( rulenumber )
            // InternalPascal.g:8381:3: rulenumber
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
    // InternalPascal.g:8390:1: rule__Constant__StringAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Constant__StringAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8394:1: ( ( RULE_STRING ) )
            // InternalPascal.g:8395:2: ( RULE_STRING )
            {
            // InternalPascal.g:8395:2: ( RULE_STRING )
            // InternalPascal.g:8396:3: RULE_STRING
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
    // InternalPascal.g:8405:1: rule__Constant__BoolLiteralAssignment_2 : ( ( 'true' ) ) ;
    public final void rule__Constant__BoolLiteralAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8409:1: ( ( ( 'true' ) ) )
            // InternalPascal.g:8410:2: ( ( 'true' ) )
            {
            // InternalPascal.g:8410:2: ( ( 'true' ) )
            // InternalPascal.g:8411:3: ( 'true' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getBoolLiteralTrueKeyword_2_0()); 
            }
            // InternalPascal.g:8412:3: ( 'true' )
            // InternalPascal.g:8413:4: 'true'
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
    // InternalPascal.g:8424:1: rule__Constant__BoolLiteralAssignment_3 : ( ( 'false' ) ) ;
    public final void rule__Constant__BoolLiteralAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8428:1: ( ( ( 'false' ) ) )
            // InternalPascal.g:8429:2: ( ( 'false' ) )
            {
            // InternalPascal.g:8429:2: ( ( 'false' ) )
            // InternalPascal.g:8430:3: ( 'false' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getBoolLiteralFalseKeyword_3_0()); 
            }
            // InternalPascal.g:8431:3: ( 'false' )
            // InternalPascal.g:8432:4: 'false'
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
    // InternalPascal.g:8443:1: rule__Constant_definition_part__ConstsAssignment_1_0 : ( ruleconstant_definition ) ;
    public final void rule__Constant_definition_part__ConstsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8447:1: ( ( ruleconstant_definition ) )
            // InternalPascal.g:8448:2: ( ruleconstant_definition )
            {
            // InternalPascal.g:8448:2: ( ruleconstant_definition )
            // InternalPascal.g:8449:3: ruleconstant_definition
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
    // InternalPascal.g:8458:1: rule__Constant_definition__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Constant_definition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8462:1: ( ( RULE_ID ) )
            // InternalPascal.g:8463:2: ( RULE_ID )
            {
            // InternalPascal.g:8463:2: ( RULE_ID )
            // InternalPascal.g:8464:3: RULE_ID
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
    // InternalPascal.g:8473:1: rule__Constant_definition__ConstAssignment_2 : ( ruleconstant ) ;
    public final void rule__Constant_definition__ConstAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8477:1: ( ( ruleconstant ) )
            // InternalPascal.g:8478:2: ( ruleconstant )
            {
            // InternalPascal.g:8478:2: ( ruleconstant )
            // InternalPascal.g:8479:3: ruleconstant
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
    // InternalPascal.g:8488:1: rule__Type_definition_part__TypesAssignment_1_0 : ( ruletype_definition ) ;
    public final void rule__Type_definition_part__TypesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8492:1: ( ( ruletype_definition ) )
            // InternalPascal.g:8493:2: ( ruletype_definition )
            {
            // InternalPascal.g:8493:2: ( ruletype_definition )
            // InternalPascal.g:8494:3: ruletype_definition
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
    // InternalPascal.g:8503:1: rule__Type_definition__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Type_definition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8507:1: ( ( RULE_ID ) )
            // InternalPascal.g:8508:2: ( RULE_ID )
            {
            // InternalPascal.g:8508:2: ( RULE_ID )
            // InternalPascal.g:8509:3: RULE_ID
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
    // InternalPascal.g:8518:1: rule__Type_definition__TypeAssignment_2 : ( ruletype ) ;
    public final void rule__Type_definition__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8522:1: ( ( ruletype ) )
            // InternalPascal.g:8523:2: ( ruletype )
            {
            // InternalPascal.g:8523:2: ( ruletype )
            // InternalPascal.g:8524:3: ruletype
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
    // InternalPascal.g:8533:1: rule__Type__SimpleAssignment_0 : ( rulesimple_type ) ;
    public final void rule__Type__SimpleAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8537:1: ( ( rulesimple_type ) )
            // InternalPascal.g:8538:2: ( rulesimple_type )
            {
            // InternalPascal.g:8538:2: ( rulesimple_type )
            // InternalPascal.g:8539:3: rulesimple_type
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
    // InternalPascal.g:8548:1: rule__Type__StructuredAssignment_1 : ( rulestructured_type ) ;
    public final void rule__Type__StructuredAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8552:1: ( ( rulestructured_type ) )
            // InternalPascal.g:8553:2: ( rulestructured_type )
            {
            // InternalPascal.g:8553:2: ( rulestructured_type )
            // InternalPascal.g:8554:3: rulestructured_type
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
    // InternalPascal.g:8563:1: rule__Type__PointerAssignment_2 : ( rulepointer_type ) ;
    public final void rule__Type__PointerAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8567:1: ( ( rulepointer_type ) )
            // InternalPascal.g:8568:2: ( rulepointer_type )
            {
            // InternalPascal.g:8568:2: ( rulepointer_type )
            // InternalPascal.g:8569:3: rulepointer_type
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
    // InternalPascal.g:8578:1: rule__Simple_type__SubrangeAssignment_0 : ( rulesubrange_type ) ;
    public final void rule__Simple_type__SubrangeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8582:1: ( ( rulesubrange_type ) )
            // InternalPascal.g:8583:2: ( rulesubrange_type )
            {
            // InternalPascal.g:8583:2: ( rulesubrange_type )
            // InternalPascal.g:8584:3: rulesubrange_type
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
    // InternalPascal.g:8593:1: rule__Simple_type__EnumeratedAssignment_1 : ( ruleenumerated_type ) ;
    public final void rule__Simple_type__EnumeratedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8597:1: ( ( ruleenumerated_type ) )
            // InternalPascal.g:8598:2: ( ruleenumerated_type )
            {
            // InternalPascal.g:8598:2: ( ruleenumerated_type )
            // InternalPascal.g:8599:3: ruleenumerated_type
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
    // InternalPascal.g:8608:1: rule__Simple_type__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Simple_type__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8612:1: ( ( RULE_ID ) )
            // InternalPascal.g:8613:2: ( RULE_ID )
            {
            // InternalPascal.g:8613:2: ( RULE_ID )
            // InternalPascal.g:8614:3: RULE_ID
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
    // InternalPascal.g:8623:1: rule__Subrange_type__InitialConstAssignment_0_0 : ( ruleconstant ) ;
    public final void rule__Subrange_type__InitialConstAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8627:1: ( ( ruleconstant ) )
            // InternalPascal.g:8628:2: ( ruleconstant )
            {
            // InternalPascal.g:8628:2: ( ruleconstant )
            // InternalPascal.g:8629:3: ruleconstant
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
    // InternalPascal.g:8638:1: rule__Subrange_type__FinalConstAssignment_0_2 : ( ruleconstant ) ;
    public final void rule__Subrange_type__FinalConstAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8642:1: ( ( ruleconstant ) )
            // InternalPascal.g:8643:2: ( ruleconstant )
            {
            // InternalPascal.g:8643:2: ( ruleconstant )
            // InternalPascal.g:8644:3: ruleconstant
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
    // InternalPascal.g:8653:1: rule__Subrange_type__SubrangeAssignment_1_0 : ( RULE_NUMERIC_SUBRANGE ) ;
    public final void rule__Subrange_type__SubrangeAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8657:1: ( ( RULE_NUMERIC_SUBRANGE ) )
            // InternalPascal.g:8658:2: ( RULE_NUMERIC_SUBRANGE )
            {
            // InternalPascal.g:8658:2: ( RULE_NUMERIC_SUBRANGE )
            // InternalPascal.g:8659:3: RULE_NUMERIC_SUBRANGE
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
    // InternalPascal.g:8668:1: rule__Subrange_type__ConstAssignment_1_1 : ( ruleconstant ) ;
    public final void rule__Subrange_type__ConstAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8672:1: ( ( ruleconstant ) )
            // InternalPascal.g:8673:2: ( ruleconstant )
            {
            // InternalPascal.g:8673:2: ( ruleconstant )
            // InternalPascal.g:8674:3: ruleconstant
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
    // InternalPascal.g:8683:1: rule__Enumerated_type__IdentifiersAssignment_1 : ( ruleidentifier_list ) ;
    public final void rule__Enumerated_type__IdentifiersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8687:1: ( ( ruleidentifier_list ) )
            // InternalPascal.g:8688:2: ( ruleidentifier_list )
            {
            // InternalPascal.g:8688:2: ( ruleidentifier_list )
            // InternalPascal.g:8689:3: ruleidentifier_list
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
    // InternalPascal.g:8698:1: rule__Structured_type__PackedAssignment_0 : ( ( 'packed' ) ) ;
    public final void rule__Structured_type__PackedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8702:1: ( ( ( 'packed' ) ) )
            // InternalPascal.g:8703:2: ( ( 'packed' ) )
            {
            // InternalPascal.g:8703:2: ( ( 'packed' ) )
            // InternalPascal.g:8704:3: ( 'packed' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStructured_typeAccess().getPackedPackedKeyword_0_0()); 
            }
            // InternalPascal.g:8705:3: ( 'packed' )
            // InternalPascal.g:8706:4: 'packed'
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
    // InternalPascal.g:8717:1: rule__Structured_type__TypeAssignment_1 : ( ruleunpacked_structured_type ) ;
    public final void rule__Structured_type__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8721:1: ( ( ruleunpacked_structured_type ) )
            // InternalPascal.g:8722:2: ( ruleunpacked_structured_type )
            {
            // InternalPascal.g:8722:2: ( ruleunpacked_structured_type )
            // InternalPascal.g:8723:3: ruleunpacked_structured_type
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
    // InternalPascal.g:8732:1: rule__Unpacked_structured_type__RecordAssignment : ( rulerecord_type ) ;
    public final void rule__Unpacked_structured_type__RecordAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8736:1: ( ( rulerecord_type ) )
            // InternalPascal.g:8737:2: ( rulerecord_type )
            {
            // InternalPascal.g:8737:2: ( rulerecord_type )
            // InternalPascal.g:8738:3: rulerecord_type
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
    // InternalPascal.g:8747:1: rule__Record_type__RecordKeywordAssignment_0 : ( ( 'record' ) ) ;
    public final void rule__Record_type__RecordKeywordAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8751:1: ( ( ( 'record' ) ) )
            // InternalPascal.g:8752:2: ( ( 'record' ) )
            {
            // InternalPascal.g:8752:2: ( ( 'record' ) )
            // InternalPascal.g:8753:3: ( 'record' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecord_typeAccess().getRecordKeywordRecordKeyword_0_0()); 
            }
            // InternalPascal.g:8754:3: ( 'record' )
            // InternalPascal.g:8755:4: 'record'
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
    // InternalPascal.g:8766:1: rule__Record_type__FieldsAssignment_1 : ( rulefield_list ) ;
    public final void rule__Record_type__FieldsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8770:1: ( ( rulefield_list ) )
            // InternalPascal.g:8771:2: ( rulefield_list )
            {
            // InternalPascal.g:8771:2: ( rulefield_list )
            // InternalPascal.g:8772:3: rulefield_list
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
    // InternalPascal.g:8781:1: rule__Record_type__EndKeywordAssignment_2 : ( ( 'end' ) ) ;
    public final void rule__Record_type__EndKeywordAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8785:1: ( ( ( 'end' ) ) )
            // InternalPascal.g:8786:2: ( ( 'end' ) )
            {
            // InternalPascal.g:8786:2: ( ( 'end' ) )
            // InternalPascal.g:8787:3: ( 'end' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecord_typeAccess().getEndKeywordEndKeyword_2_0()); 
            }
            // InternalPascal.g:8788:3: ( 'end' )
            // InternalPascal.g:8789:4: 'end'
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
    // InternalPascal.g:8800:1: rule__Field_list__FixedAssignment_0_0_0 : ( rulefixed_part ) ;
    public final void rule__Field_list__FixedAssignment_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8804:1: ( ( rulefixed_part ) )
            // InternalPascal.g:8805:2: ( rulefixed_part )
            {
            // InternalPascal.g:8805:2: ( rulefixed_part )
            // InternalPascal.g:8806:3: rulefixed_part
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
    // InternalPascal.g:8815:1: rule__Field_list__VariantsAssignment_0_0_1_1 : ( rulevariant_part ) ;
    public final void rule__Field_list__VariantsAssignment_0_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8819:1: ( ( rulevariant_part ) )
            // InternalPascal.g:8820:2: ( rulevariant_part )
            {
            // InternalPascal.g:8820:2: ( rulevariant_part )
            // InternalPascal.g:8821:3: rulevariant_part
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
    // InternalPascal.g:8830:1: rule__Field_list__VariantsAssignment_0_1 : ( rulevariant_part ) ;
    public final void rule__Field_list__VariantsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8834:1: ( ( rulevariant_part ) )
            // InternalPascal.g:8835:2: ( rulevariant_part )
            {
            // InternalPascal.g:8835:2: ( rulevariant_part )
            // InternalPascal.g:8836:3: rulevariant_part
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
    // InternalPascal.g:8845:1: rule__Fixed_part__SectionsAssignment_0 : ( rulerecord_section ) ;
    public final void rule__Fixed_part__SectionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8849:1: ( ( rulerecord_section ) )
            // InternalPascal.g:8850:2: ( rulerecord_section )
            {
            // InternalPascal.g:8850:2: ( rulerecord_section )
            // InternalPascal.g:8851:3: rulerecord_section
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
    // InternalPascal.g:8860:1: rule__Fixed_part__SectionsAssignment_1_1 : ( rulerecord_section ) ;
    public final void rule__Fixed_part__SectionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8864:1: ( ( rulerecord_section ) )
            // InternalPascal.g:8865:2: ( rulerecord_section )
            {
            // InternalPascal.g:8865:2: ( rulerecord_section )
            // InternalPascal.g:8866:3: rulerecord_section
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
    // InternalPascal.g:8875:1: rule__Record_section__IdentifiersAssignment_0 : ( ruleidentifier_list ) ;
    public final void rule__Record_section__IdentifiersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8879:1: ( ( ruleidentifier_list ) )
            // InternalPascal.g:8880:2: ( ruleidentifier_list )
            {
            // InternalPascal.g:8880:2: ( ruleidentifier_list )
            // InternalPascal.g:8881:3: ruleidentifier_list
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
    // InternalPascal.g:8890:1: rule__Record_section__TypeAssignment_2 : ( ruletype ) ;
    public final void rule__Record_section__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8894:1: ( ( ruletype ) )
            // InternalPascal.g:8895:2: ( ruletype )
            {
            // InternalPascal.g:8895:2: ( ruletype )
            // InternalPascal.g:8896:3: ruletype
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
    // InternalPascal.g:8905:1: rule__Variant_part__TagAssignment_1 : ( ruletag_field ) ;
    public final void rule__Variant_part__TagAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8909:1: ( ( ruletag_field ) )
            // InternalPascal.g:8910:2: ( ruletag_field )
            {
            // InternalPascal.g:8910:2: ( ruletag_field )
            // InternalPascal.g:8911:3: ruletag_field
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
    // InternalPascal.g:8920:1: rule__Variant_part__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Variant_part__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8924:1: ( ( RULE_ID ) )
            // InternalPascal.g:8925:2: ( RULE_ID )
            {
            // InternalPascal.g:8925:2: ( RULE_ID )
            // InternalPascal.g:8926:3: RULE_ID
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
    // InternalPascal.g:8935:1: rule__Variant_part__VariantsAssignment_4 : ( rulevariant ) ;
    public final void rule__Variant_part__VariantsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8939:1: ( ( rulevariant ) )
            // InternalPascal.g:8940:2: ( rulevariant )
            {
            // InternalPascal.g:8940:2: ( rulevariant )
            // InternalPascal.g:8941:3: rulevariant
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
    // InternalPascal.g:8950:1: rule__Variant_part__VariantsAssignment_5_1 : ( rulevariant ) ;
    public final void rule__Variant_part__VariantsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8954:1: ( ( rulevariant ) )
            // InternalPascal.g:8955:2: ( rulevariant )
            {
            // InternalPascal.g:8955:2: ( rulevariant )
            // InternalPascal.g:8956:3: rulevariant
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
    // InternalPascal.g:8965:1: rule__Tag_field__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Tag_field__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8969:1: ( ( RULE_ID ) )
            // InternalPascal.g:8970:2: ( RULE_ID )
            {
            // InternalPascal.g:8970:2: ( RULE_ID )
            // InternalPascal.g:8971:3: RULE_ID
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
    // InternalPascal.g:8980:1: rule__Variant__LabelsAssignment_0 : ( rulecase_label_list ) ;
    public final void rule__Variant__LabelsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8984:1: ( ( rulecase_label_list ) )
            // InternalPascal.g:8985:2: ( rulecase_label_list )
            {
            // InternalPascal.g:8985:2: ( rulecase_label_list )
            // InternalPascal.g:8986:3: rulecase_label_list
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
    // InternalPascal.g:8995:1: rule__Variant__FieldsAssignment_3 : ( rulefield_list ) ;
    public final void rule__Variant__FieldsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8999:1: ( ( rulefield_list ) )
            // InternalPascal.g:9000:2: ( rulefield_list )
            {
            // InternalPascal.g:9000:2: ( rulefield_list )
            // InternalPascal.g:9001:3: rulefield_list
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
    // InternalPascal.g:9010:1: rule__Case_label_list__ConstantsAssignment_0 : ( ruleconstant ) ;
    public final void rule__Case_label_list__ConstantsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9014:1: ( ( ruleconstant ) )
            // InternalPascal.g:9015:2: ( ruleconstant )
            {
            // InternalPascal.g:9015:2: ( ruleconstant )
            // InternalPascal.g:9016:3: ruleconstant
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
    // InternalPascal.g:9025:1: rule__Case_label_list__ConstantsAssignment_1_1 : ( ruleconstant ) ;
    public final void rule__Case_label_list__ConstantsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9029:1: ( ( ruleconstant ) )
            // InternalPascal.g:9030:2: ( ruleconstant )
            {
            // InternalPascal.g:9030:2: ( ruleconstant )
            // InternalPascal.g:9031:3: ruleconstant
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
    // InternalPascal.g:9040:1: rule__Pointer_type__TypeAssignment_1 : ( ruletype ) ;
    public final void rule__Pointer_type__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9044:1: ( ( ruletype ) )
            // InternalPascal.g:9045:2: ( ruletype )
            {
            // InternalPascal.g:9045:2: ( ruletype )
            // InternalPascal.g:9046:3: ruletype
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
    // InternalPascal.g:9055:1: rule__Signed_number__IntegerAssignment_0 : ( RULE_SIGNED_INTEGER_NUMBER ) ;
    public final void rule__Signed_number__IntegerAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9059:1: ( ( RULE_SIGNED_INTEGER_NUMBER ) )
            // InternalPascal.g:9060:2: ( RULE_SIGNED_INTEGER_NUMBER )
            {
            // InternalPascal.g:9060:2: ( RULE_SIGNED_INTEGER_NUMBER )
            // InternalPascal.g:9061:3: RULE_SIGNED_INTEGER_NUMBER
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
    // InternalPascal.g:9070:1: rule__Signed_number__RealAssignment_1 : ( RULE_SIGNED_REAL_NUMBER ) ;
    public final void rule__Signed_number__RealAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9074:1: ( ( RULE_SIGNED_REAL_NUMBER ) )
            // InternalPascal.g:9075:2: ( RULE_SIGNED_REAL_NUMBER )
            {
            // InternalPascal.g:9075:2: ( RULE_SIGNED_REAL_NUMBER )
            // InternalPascal.g:9076:3: RULE_SIGNED_REAL_NUMBER
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
    // InternalPascal.g:9085:1: rule__Unsigned_number__IntegerAssignment_0 : ( RULE_INTEGER_NUMBER ) ;
    public final void rule__Unsigned_number__IntegerAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9089:1: ( ( RULE_INTEGER_NUMBER ) )
            // InternalPascal.g:9090:2: ( RULE_INTEGER_NUMBER )
            {
            // InternalPascal.g:9090:2: ( RULE_INTEGER_NUMBER )
            // InternalPascal.g:9091:3: RULE_INTEGER_NUMBER
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
    // InternalPascal.g:9100:1: rule__Unsigned_number__RealAssignment_1 : ( RULE_REAL_NUMBER ) ;
    public final void rule__Unsigned_number__RealAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9104:1: ( ( RULE_REAL_NUMBER ) )
            // InternalPascal.g:9105:2: ( RULE_REAL_NUMBER )
            {
            // InternalPascal.g:9105:2: ( RULE_REAL_NUMBER )
            // InternalPascal.g:9106:3: RULE_REAL_NUMBER
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
    // InternalPascal.g:9115:1: rule__Variable_declaration_part__SectionsAssignment_1 : ( rulevariable_section ) ;
    public final void rule__Variable_declaration_part__SectionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9119:1: ( ( rulevariable_section ) )
            // InternalPascal.g:9120:2: ( rulevariable_section )
            {
            // InternalPascal.g:9120:2: ( rulevariable_section )
            // InternalPascal.g:9121:3: rulevariable_section
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
    // InternalPascal.g:9130:1: rule__Variable_declaration_part__SectionsAssignment_3_0 : ( rulevariable_section ) ;
    public final void rule__Variable_declaration_part__SectionsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9134:1: ( ( rulevariable_section ) )
            // InternalPascal.g:9135:2: ( rulevariable_section )
            {
            // InternalPascal.g:9135:2: ( rulevariable_section )
            // InternalPascal.g:9136:3: rulevariable_section
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
    // InternalPascal.g:9145:1: rule__Variable_section__IdentifiersAssignment_0 : ( rulevariable_identifier_list ) ;
    public final void rule__Variable_section__IdentifiersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9149:1: ( ( rulevariable_identifier_list ) )
            // InternalPascal.g:9150:2: ( rulevariable_identifier_list )
            {
            // InternalPascal.g:9150:2: ( rulevariable_identifier_list )
            // InternalPascal.g:9151:3: rulevariable_identifier_list
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
    // InternalPascal.g:9160:1: rule__Variable_section__TypeAssignment_2 : ( ruletype ) ;
    public final void rule__Variable_section__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9164:1: ( ( ruletype ) )
            // InternalPascal.g:9165:2: ( ruletype )
            {
            // InternalPascal.g:9165:2: ( ruletype )
            // InternalPascal.g:9166:3: ruletype
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
    // InternalPascal.g:9175:1: rule__Variable_identifier_list__NamesAssignment_0 : ( RULE_ID ) ;
    public final void rule__Variable_identifier_list__NamesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9179:1: ( ( RULE_ID ) )
            // InternalPascal.g:9180:2: ( RULE_ID )
            {
            // InternalPascal.g:9180:2: ( RULE_ID )
            // InternalPascal.g:9181:3: RULE_ID
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
    // InternalPascal.g:9190:1: rule__Variable_identifier_list__NamesAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Variable_identifier_list__NamesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9194:1: ( ( RULE_ID ) )
            // InternalPascal.g:9195:2: ( RULE_ID )
            {
            // InternalPascal.g:9195:2: ( RULE_ID )
            // InternalPascal.g:9196:3: RULE_ID
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


    protected DFA11 dfa11 = new DFA11(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\uffff\1\13\12\uffff";
    static final String dfa_3s = "\1\4\1\6\12\uffff";
    static final String dfa_4s = "\1\65\1\62\12\uffff";
    static final String dfa_5s = "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\11\1\12\1\10\1\1";
    static final String dfa_6s = "\14\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\2\2\3\uffff\1\3\1\uffff\2\2\17\uffff\1\4\3\uffff\1\10\1\uffff\1\11\17\uffff\1\5\1\6\1\7",
            "\4\13\3\uffff\1\13\10\uffff\1\13\1\uffff\1\13\1\uffff\1\13\2\uffff\4\13\1\12\1\13\6\uffff\1\13\4\uffff\5\13",
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
            return "1695:1: rule__Factor__Alternatives : ( ( ( rule__Factor__VariableAssignment_0 ) ) | ( ( rule__Factor__NumberAssignment_1 ) ) | ( ( rule__Factor__StringAssignment_2 ) ) | ( ( rule__Factor__SetAssignment_3 ) ) | ( ( rule__Factor__NilAssignment_4 ) ) | ( ( rule__Factor__BooleanAssignment_5 ) ) | ( ( rule__Factor__BooleanAssignment_6 ) ) | ( ( rule__Factor__FunctionAssignment_7 ) ) | ( ( rule__Factor__Group_8__0 ) ) | ( ( rule__Factor__Group_9__0 ) ) );";
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
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00F0000280003D70L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x00C0000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000100004000010L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000100000000010L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000100400000010L});

}