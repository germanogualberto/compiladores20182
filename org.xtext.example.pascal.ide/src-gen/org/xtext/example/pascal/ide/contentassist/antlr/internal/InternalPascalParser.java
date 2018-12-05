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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_SIGNED_INTEGER_NUMBER", "RULE_INTEGER_NUMBER", "RULE_RELATIONAL_OP", "RULE_ADDITION_OP", "RULE_MULTIPLICATION_OP", "RULE_STRING", "RULE_SIGNED_REAL_NUMBER", "RULE_REAL_NUMBER", "RULE_DIGIT_SEQUENCE", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'program'", "';'", "'begin'", "'end'", "':'", "':='", "','", "'('", "')'", "'not'", "'function'", "'procedure'", "'var'", "'label'", "'const'", "'='", "'type'", "'while'", "'do'", "'in'", "'or'", "'and'", "'true'", "'false'", "'nil'", "'record'"
    };
    public static final int RULE_REAL_NUMBER=12;
    public static final int T__19=19;
    public static final int RULE_ID=4;
    public static final int RULE_MULTIPLICATION_OP=9;
    public static final int RULE_SIGNED_REAL_NUMBER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=14;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=15;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_RELATIONAL_OP=7;
    public static final int T__20=20;
    public static final int RULE_INTEGER_NUMBER=6;
    public static final int T__21=21;
    public static final int RULE_STRING=10;
    public static final int RULE_SL_COMMENT=16;
    public static final int RULE_DIGIT_SEQUENCE=13;
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
    public static final int RULE_WS=17;
    public static final int RULE_ANY_OTHER=18;
    public static final int RULE_SIGNED_INTEGER_NUMBER=5;
    public static final int T__44=44;
    public static final int T__45=45;
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
    // InternalPascal.g:363:1: rulevariable : ( ( rule__Variable__NameAssignment ) ) ;
    public final void rulevariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:367:2: ( ( ( rule__Variable__NameAssignment ) ) )
            // InternalPascal.g:368:2: ( ( rule__Variable__NameAssignment ) )
            {
            // InternalPascal.g:368:2: ( ( rule__Variable__NameAssignment ) )
            // InternalPascal.g:369:3: ( rule__Variable__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getNameAssignment()); 
            }
            // InternalPascal.g:370:3: ( rule__Variable__NameAssignment )
            // InternalPascal.g:370:4: rule__Variable__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Variable__NameAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getNameAssignment()); 
            }

            }


            }

        }
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


    // $ANTLR start "entryRuleexpression_list"
    // InternalPascal.g:379:1: entryRuleexpression_list : ruleexpression_list EOF ;
    public final void entryRuleexpression_list() throws RecognitionException {
        try {
            // InternalPascal.g:380:1: ( ruleexpression_list EOF )
            // InternalPascal.g:381:1: ruleexpression_list EOF
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
    // InternalPascal.g:388:1: ruleexpression_list : ( ( rule__Expression_list__Group__0 ) ) ;
    public final void ruleexpression_list() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:392:2: ( ( ( rule__Expression_list__Group__0 ) ) )
            // InternalPascal.g:393:2: ( ( rule__Expression_list__Group__0 ) )
            {
            // InternalPascal.g:393:2: ( ( rule__Expression_list__Group__0 ) )
            // InternalPascal.g:394:3: ( rule__Expression_list__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression_listAccess().getGroup()); 
            }
            // InternalPascal.g:395:3: ( rule__Expression_list__Group__0 )
            // InternalPascal.g:395:4: rule__Expression_list__Group__0
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
    // InternalPascal.g:404:1: entryRuleexpression : ruleexpression EOF ;
    public final void entryRuleexpression() throws RecognitionException {
        try {
            // InternalPascal.g:405:1: ( ruleexpression EOF )
            // InternalPascal.g:406:1: ruleexpression EOF
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
    // InternalPascal.g:413:1: ruleexpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleexpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:417:2: ( ( ( rule__Expression__Group__0 ) ) )
            // InternalPascal.g:418:2: ( ( rule__Expression__Group__0 ) )
            {
            // InternalPascal.g:418:2: ( ( rule__Expression__Group__0 ) )
            // InternalPascal.g:419:3: ( rule__Expression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getGroup()); 
            }
            // InternalPascal.g:420:3: ( rule__Expression__Group__0 )
            // InternalPascal.g:420:4: rule__Expression__Group__0
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
    // InternalPascal.g:429:1: entryRulesimple_expression : rulesimple_expression EOF ;
    public final void entryRulesimple_expression() throws RecognitionException {
        try {
            // InternalPascal.g:430:1: ( rulesimple_expression EOF )
            // InternalPascal.g:431:1: rulesimple_expression EOF
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
    // InternalPascal.g:438:1: rulesimple_expression : ( ( rule__Simple_expression__Group__0 ) ) ;
    public final void rulesimple_expression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:442:2: ( ( ( rule__Simple_expression__Group__0 ) ) )
            // InternalPascal.g:443:2: ( ( rule__Simple_expression__Group__0 ) )
            {
            // InternalPascal.g:443:2: ( ( rule__Simple_expression__Group__0 ) )
            // InternalPascal.g:444:3: ( rule__Simple_expression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimple_expressionAccess().getGroup()); 
            }
            // InternalPascal.g:445:3: ( rule__Simple_expression__Group__0 )
            // InternalPascal.g:445:4: rule__Simple_expression__Group__0
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
    // InternalPascal.g:454:1: entryRuleterm : ruleterm EOF ;
    public final void entryRuleterm() throws RecognitionException {
        try {
            // InternalPascal.g:455:1: ( ruleterm EOF )
            // InternalPascal.g:456:1: ruleterm EOF
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
    // InternalPascal.g:463:1: ruleterm : ( ( rule__Term__Group__0 ) ) ;
    public final void ruleterm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:467:2: ( ( ( rule__Term__Group__0 ) ) )
            // InternalPascal.g:468:2: ( ( rule__Term__Group__0 ) )
            {
            // InternalPascal.g:468:2: ( ( rule__Term__Group__0 ) )
            // InternalPascal.g:469:3: ( rule__Term__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getGroup()); 
            }
            // InternalPascal.g:470:3: ( rule__Term__Group__0 )
            // InternalPascal.g:470:4: rule__Term__Group__0
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
    // InternalPascal.g:479:1: entryRulefactor : rulefactor EOF ;
    public final void entryRulefactor() throws RecognitionException {
        try {
            // InternalPascal.g:480:1: ( rulefactor EOF )
            // InternalPascal.g:481:1: rulefactor EOF
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
    // InternalPascal.g:488:1: rulefactor : ( ( rule__Factor__Alternatives ) ) ;
    public final void rulefactor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:492:2: ( ( ( rule__Factor__Alternatives ) ) )
            // InternalPascal.g:493:2: ( ( rule__Factor__Alternatives ) )
            {
            // InternalPascal.g:493:2: ( ( rule__Factor__Alternatives ) )
            // InternalPascal.g:494:3: ( rule__Factor__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getAlternatives()); 
            }
            // InternalPascal.g:495:3: ( rule__Factor__Alternatives )
            // InternalPascal.g:495:4: rule__Factor__Alternatives
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
    // InternalPascal.g:504:1: entryRulefunction_designator : rulefunction_designator EOF ;
    public final void entryRulefunction_designator() throws RecognitionException {
        try {
            // InternalPascal.g:505:1: ( rulefunction_designator EOF )
            // InternalPascal.g:506:1: rulefunction_designator EOF
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
    // InternalPascal.g:513:1: rulefunction_designator : ( ( rule__Function_designator__Group__0 ) ) ;
    public final void rulefunction_designator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:517:2: ( ( ( rule__Function_designator__Group__0 ) ) )
            // InternalPascal.g:518:2: ( ( rule__Function_designator__Group__0 ) )
            {
            // InternalPascal.g:518:2: ( ( rule__Function_designator__Group__0 ) )
            // InternalPascal.g:519:3: ( rule__Function_designator__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_designatorAccess().getGroup()); 
            }
            // InternalPascal.g:520:3: ( rule__Function_designator__Group__0 )
            // InternalPascal.g:520:4: rule__Function_designator__Group__0
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
    // InternalPascal.g:529:1: entryRulefunction_procedure_declaration : rulefunction_procedure_declaration EOF ;
    public final void entryRulefunction_procedure_declaration() throws RecognitionException {
        try {
            // InternalPascal.g:530:1: ( rulefunction_procedure_declaration EOF )
            // InternalPascal.g:531:1: rulefunction_procedure_declaration EOF
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
    // InternalPascal.g:538:1: rulefunction_procedure_declaration : ( ( ( rule__Function_procedure_declaration__Group__0 ) ) ( ( rule__Function_procedure_declaration__Group__0 )* ) ) ;
    public final void rulefunction_procedure_declaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:542:2: ( ( ( ( rule__Function_procedure_declaration__Group__0 ) ) ( ( rule__Function_procedure_declaration__Group__0 )* ) ) )
            // InternalPascal.g:543:2: ( ( ( rule__Function_procedure_declaration__Group__0 ) ) ( ( rule__Function_procedure_declaration__Group__0 )* ) )
            {
            // InternalPascal.g:543:2: ( ( ( rule__Function_procedure_declaration__Group__0 ) ) ( ( rule__Function_procedure_declaration__Group__0 )* ) )
            // InternalPascal.g:544:3: ( ( rule__Function_procedure_declaration__Group__0 ) ) ( ( rule__Function_procedure_declaration__Group__0 )* )
            {
            // InternalPascal.g:544:3: ( ( rule__Function_procedure_declaration__Group__0 ) )
            // InternalPascal.g:545:4: ( rule__Function_procedure_declaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_procedure_declarationAccess().getGroup()); 
            }
            // InternalPascal.g:546:4: ( rule__Function_procedure_declaration__Group__0 )
            // InternalPascal.g:546:5: rule__Function_procedure_declaration__Group__0
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

            // InternalPascal.g:549:3: ( ( rule__Function_procedure_declaration__Group__0 )* )
            // InternalPascal.g:550:4: ( rule__Function_procedure_declaration__Group__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_procedure_declarationAccess().getGroup()); 
            }
            // InternalPascal.g:551:4: ( rule__Function_procedure_declaration__Group__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=30 && LA2_0<=31)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPascal.g:551:5: rule__Function_procedure_declaration__Group__0
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Function_procedure_declaration__Group__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop2;
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
    // InternalPascal.g:561:1: entryRulefunction_heading : rulefunction_heading EOF ;
    public final void entryRulefunction_heading() throws RecognitionException {
        try {
            // InternalPascal.g:562:1: ( rulefunction_heading EOF )
            // InternalPascal.g:563:1: rulefunction_heading EOF
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
    // InternalPascal.g:570:1: rulefunction_heading : ( ( rule__Function_heading__Group__0 ) ) ;
    public final void rulefunction_heading() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:574:2: ( ( ( rule__Function_heading__Group__0 ) ) )
            // InternalPascal.g:575:2: ( ( rule__Function_heading__Group__0 ) )
            {
            // InternalPascal.g:575:2: ( ( rule__Function_heading__Group__0 ) )
            // InternalPascal.g:576:3: ( rule__Function_heading__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_headingAccess().getGroup()); 
            }
            // InternalPascal.g:577:3: ( rule__Function_heading__Group__0 )
            // InternalPascal.g:577:4: rule__Function_heading__Group__0
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
    // InternalPascal.g:586:1: entryRulefunction_declaration : rulefunction_declaration EOF ;
    public final void entryRulefunction_declaration() throws RecognitionException {
        try {
            // InternalPascal.g:587:1: ( rulefunction_declaration EOF )
            // InternalPascal.g:588:1: rulefunction_declaration EOF
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
    // InternalPascal.g:595:1: rulefunction_declaration : ( ( rule__Function_declaration__Group__0 ) ) ;
    public final void rulefunction_declaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:599:2: ( ( ( rule__Function_declaration__Group__0 ) ) )
            // InternalPascal.g:600:2: ( ( rule__Function_declaration__Group__0 ) )
            {
            // InternalPascal.g:600:2: ( ( rule__Function_declaration__Group__0 ) )
            // InternalPascal.g:601:3: ( rule__Function_declaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_declarationAccess().getGroup()); 
            }
            // InternalPascal.g:602:3: ( rule__Function_declaration__Group__0 )
            // InternalPascal.g:602:4: rule__Function_declaration__Group__0
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


    // $ANTLR start "entryRuleprocedure_declaration"
    // InternalPascal.g:611:1: entryRuleprocedure_declaration : ruleprocedure_declaration EOF ;
    public final void entryRuleprocedure_declaration() throws RecognitionException {
        try {
            // InternalPascal.g:612:1: ( ruleprocedure_declaration EOF )
            // InternalPascal.g:613:1: ruleprocedure_declaration EOF
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
    // InternalPascal.g:620:1: ruleprocedure_declaration : ( ( rule__Procedure_declaration__Group__0 ) ) ;
    public final void ruleprocedure_declaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:624:2: ( ( ( rule__Procedure_declaration__Group__0 ) ) )
            // InternalPascal.g:625:2: ( ( rule__Procedure_declaration__Group__0 ) )
            {
            // InternalPascal.g:625:2: ( ( rule__Procedure_declaration__Group__0 ) )
            // InternalPascal.g:626:3: ( rule__Procedure_declaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcedure_declarationAccess().getGroup()); 
            }
            // InternalPascal.g:627:3: ( rule__Procedure_declaration__Group__0 )
            // InternalPascal.g:627:4: rule__Procedure_declaration__Group__0
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
    // InternalPascal.g:636:1: entryRuleprocedure_heading : ruleprocedure_heading EOF ;
    public final void entryRuleprocedure_heading() throws RecognitionException {
        try {
            // InternalPascal.g:637:1: ( ruleprocedure_heading EOF )
            // InternalPascal.g:638:1: ruleprocedure_heading EOF
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
    // InternalPascal.g:645:1: ruleprocedure_heading : ( ( rule__Procedure_heading__Group__0 ) ) ;
    public final void ruleprocedure_heading() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:649:2: ( ( ( rule__Procedure_heading__Group__0 ) ) )
            // InternalPascal.g:650:2: ( ( rule__Procedure_heading__Group__0 ) )
            {
            // InternalPascal.g:650:2: ( ( rule__Procedure_heading__Group__0 ) )
            // InternalPascal.g:651:3: ( rule__Procedure_heading__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcedure_headingAccess().getGroup()); 
            }
            // InternalPascal.g:652:3: ( rule__Procedure_heading__Group__0 )
            // InternalPascal.g:652:4: rule__Procedure_heading__Group__0
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
    // InternalPascal.g:661:1: entryRuleformal_parameter_list : ruleformal_parameter_list EOF ;
    public final void entryRuleformal_parameter_list() throws RecognitionException {
        try {
            // InternalPascal.g:662:1: ( ruleformal_parameter_list EOF )
            // InternalPascal.g:663:1: ruleformal_parameter_list EOF
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
    // InternalPascal.g:670:1: ruleformal_parameter_list : ( ( rule__Formal_parameter_list__Group__0 ) ) ;
    public final void ruleformal_parameter_list() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:674:2: ( ( ( rule__Formal_parameter_list__Group__0 ) ) )
            // InternalPascal.g:675:2: ( ( rule__Formal_parameter_list__Group__0 ) )
            {
            // InternalPascal.g:675:2: ( ( rule__Formal_parameter_list__Group__0 ) )
            // InternalPascal.g:676:3: ( rule__Formal_parameter_list__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormal_parameter_listAccess().getGroup()); 
            }
            // InternalPascal.g:677:3: ( rule__Formal_parameter_list__Group__0 )
            // InternalPascal.g:677:4: rule__Formal_parameter_list__Group__0
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
    // InternalPascal.g:686:1: entryRuleformal_parameter_section : ruleformal_parameter_section EOF ;
    public final void entryRuleformal_parameter_section() throws RecognitionException {
        try {
            // InternalPascal.g:687:1: ( ruleformal_parameter_section EOF )
            // InternalPascal.g:688:1: ruleformal_parameter_section EOF
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
    // InternalPascal.g:695:1: ruleformal_parameter_section : ( ( rule__Formal_parameter_section__Alternatives ) ) ;
    public final void ruleformal_parameter_section() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:699:2: ( ( ( rule__Formal_parameter_section__Alternatives ) ) )
            // InternalPascal.g:700:2: ( ( rule__Formal_parameter_section__Alternatives ) )
            {
            // InternalPascal.g:700:2: ( ( rule__Formal_parameter_section__Alternatives ) )
            // InternalPascal.g:701:3: ( rule__Formal_parameter_section__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormal_parameter_sectionAccess().getAlternatives()); 
            }
            // InternalPascal.g:702:3: ( rule__Formal_parameter_section__Alternatives )
            // InternalPascal.g:702:4: rule__Formal_parameter_section__Alternatives
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
    // InternalPascal.g:711:1: entryRulevalue_parameter_section : rulevalue_parameter_section EOF ;
    public final void entryRulevalue_parameter_section() throws RecognitionException {
        try {
            // InternalPascal.g:712:1: ( rulevalue_parameter_section EOF )
            // InternalPascal.g:713:1: rulevalue_parameter_section EOF
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
    // InternalPascal.g:720:1: rulevalue_parameter_section : ( ( rule__Value_parameter_section__Group__0 ) ) ;
    public final void rulevalue_parameter_section() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:724:2: ( ( ( rule__Value_parameter_section__Group__0 ) ) )
            // InternalPascal.g:725:2: ( ( rule__Value_parameter_section__Group__0 ) )
            {
            // InternalPascal.g:725:2: ( ( rule__Value_parameter_section__Group__0 ) )
            // InternalPascal.g:726:3: ( rule__Value_parameter_section__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValue_parameter_sectionAccess().getGroup()); 
            }
            // InternalPascal.g:727:3: ( rule__Value_parameter_section__Group__0 )
            // InternalPascal.g:727:4: rule__Value_parameter_section__Group__0
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
    // InternalPascal.g:736:1: entryRuleidentifier_list : ruleidentifier_list EOF ;
    public final void entryRuleidentifier_list() throws RecognitionException {
        try {
            // InternalPascal.g:737:1: ( ruleidentifier_list EOF )
            // InternalPascal.g:738:1: ruleidentifier_list EOF
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
    // InternalPascal.g:745:1: ruleidentifier_list : ( ( rule__Identifier_list__Group__0 ) ) ;
    public final void ruleidentifier_list() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:749:2: ( ( ( rule__Identifier_list__Group__0 ) ) )
            // InternalPascal.g:750:2: ( ( rule__Identifier_list__Group__0 ) )
            {
            // InternalPascal.g:750:2: ( ( rule__Identifier_list__Group__0 ) )
            // InternalPascal.g:751:3: ( rule__Identifier_list__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifier_listAccess().getGroup()); 
            }
            // InternalPascal.g:752:3: ( rule__Identifier_list__Group__0 )
            // InternalPascal.g:752:4: rule__Identifier_list__Group__0
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
    // InternalPascal.g:761:1: entryRuleparameter_type : ruleparameter_type EOF ;
    public final void entryRuleparameter_type() throws RecognitionException {
        try {
            // InternalPascal.g:762:1: ( ruleparameter_type EOF )
            // InternalPascal.g:763:1: ruleparameter_type EOF
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
    // InternalPascal.g:770:1: ruleparameter_type : ( ( rule__Parameter_type__NameAssignment ) ) ;
    public final void ruleparameter_type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:774:2: ( ( ( rule__Parameter_type__NameAssignment ) ) )
            // InternalPascal.g:775:2: ( ( rule__Parameter_type__NameAssignment ) )
            {
            // InternalPascal.g:775:2: ( ( rule__Parameter_type__NameAssignment ) )
            // InternalPascal.g:776:3: ( rule__Parameter_type__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameter_typeAccess().getNameAssignment()); 
            }
            // InternalPascal.g:777:3: ( rule__Parameter_type__NameAssignment )
            // InternalPascal.g:777:4: rule__Parameter_type__NameAssignment
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
    // InternalPascal.g:786:1: entryRulevariable_parameter_section : rulevariable_parameter_section EOF ;
    public final void entryRulevariable_parameter_section() throws RecognitionException {
        try {
            // InternalPascal.g:787:1: ( rulevariable_parameter_section EOF )
            // InternalPascal.g:788:1: rulevariable_parameter_section EOF
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
    // InternalPascal.g:795:1: rulevariable_parameter_section : ( ( rule__Variable_parameter_section__Group__0 ) ) ;
    public final void rulevariable_parameter_section() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:799:2: ( ( ( rule__Variable_parameter_section__Group__0 ) ) )
            // InternalPascal.g:800:2: ( ( rule__Variable_parameter_section__Group__0 ) )
            {
            // InternalPascal.g:800:2: ( ( rule__Variable_parameter_section__Group__0 ) )
            // InternalPascal.g:801:3: ( rule__Variable_parameter_section__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_parameter_sectionAccess().getGroup()); 
            }
            // InternalPascal.g:802:3: ( rule__Variable_parameter_section__Group__0 )
            // InternalPascal.g:802:4: rule__Variable_parameter_section__Group__0
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
    // InternalPascal.g:1045:1: rulesimple_type : ( ( rule__Simple_type__NameAssignment ) ) ;
    public final void rulesimple_type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1049:2: ( ( ( rule__Simple_type__NameAssignment ) ) )
            // InternalPascal.g:1050:2: ( ( rule__Simple_type__NameAssignment ) )
            {
            // InternalPascal.g:1050:2: ( ( rule__Simple_type__NameAssignment ) )
            // InternalPascal.g:1051:3: ( rule__Simple_type__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimple_typeAccess().getNameAssignment()); 
            }
            // InternalPascal.g:1052:3: ( rule__Simple_type__NameAssignment )
            // InternalPascal.g:1052:4: rule__Simple_type__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Simple_type__NameAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimple_typeAccess().getNameAssignment()); 
            }

            }


            }

        }
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


    // $ANTLR start "entryRulestructured_type"
    // InternalPascal.g:1061:1: entryRulestructured_type : rulestructured_type EOF ;
    public final void entryRulestructured_type() throws RecognitionException {
        try {
            // InternalPascal.g:1062:1: ( rulestructured_type EOF )
            // InternalPascal.g:1063:1: rulestructured_type EOF
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
    // InternalPascal.g:1070:1: rulestructured_type : ( ( rule__Structured_type__TypeAssignment ) ) ;
    public final void rulestructured_type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1074:2: ( ( ( rule__Structured_type__TypeAssignment ) ) )
            // InternalPascal.g:1075:2: ( ( rule__Structured_type__TypeAssignment ) )
            {
            // InternalPascal.g:1075:2: ( ( rule__Structured_type__TypeAssignment ) )
            // InternalPascal.g:1076:3: ( rule__Structured_type__TypeAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStructured_typeAccess().getTypeAssignment()); 
            }
            // InternalPascal.g:1077:3: ( rule__Structured_type__TypeAssignment )
            // InternalPascal.g:1077:4: rule__Structured_type__TypeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Structured_type__TypeAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStructured_typeAccess().getTypeAssignment()); 
            }

            }


            }

        }
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
    // InternalPascal.g:1086:1: entryRuleunpacked_structured_type : ruleunpacked_structured_type EOF ;
    public final void entryRuleunpacked_structured_type() throws RecognitionException {
        try {
            // InternalPascal.g:1087:1: ( ruleunpacked_structured_type EOF )
            // InternalPascal.g:1088:1: ruleunpacked_structured_type EOF
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
    // InternalPascal.g:1095:1: ruleunpacked_structured_type : ( ( rule__Unpacked_structured_type__RecordAssignment ) ) ;
    public final void ruleunpacked_structured_type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1099:2: ( ( ( rule__Unpacked_structured_type__RecordAssignment ) ) )
            // InternalPascal.g:1100:2: ( ( rule__Unpacked_structured_type__RecordAssignment ) )
            {
            // InternalPascal.g:1100:2: ( ( rule__Unpacked_structured_type__RecordAssignment ) )
            // InternalPascal.g:1101:3: ( rule__Unpacked_structured_type__RecordAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnpacked_structured_typeAccess().getRecordAssignment()); 
            }
            // InternalPascal.g:1102:3: ( rule__Unpacked_structured_type__RecordAssignment )
            // InternalPascal.g:1102:4: rule__Unpacked_structured_type__RecordAssignment
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
    // InternalPascal.g:1111:1: entryRulerecord_type : rulerecord_type EOF ;
    public final void entryRulerecord_type() throws RecognitionException {
        try {
            // InternalPascal.g:1112:1: ( rulerecord_type EOF )
            // InternalPascal.g:1113:1: rulerecord_type EOF
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
    // InternalPascal.g:1120:1: rulerecord_type : ( ( rule__Record_type__Group__0 ) ) ;
    public final void rulerecord_type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1124:2: ( ( ( rule__Record_type__Group__0 ) ) )
            // InternalPascal.g:1125:2: ( ( rule__Record_type__Group__0 ) )
            {
            // InternalPascal.g:1125:2: ( ( rule__Record_type__Group__0 ) )
            // InternalPascal.g:1126:3: ( rule__Record_type__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecord_typeAccess().getGroup()); 
            }
            // InternalPascal.g:1127:3: ( rule__Record_type__Group__0 )
            // InternalPascal.g:1127:4: rule__Record_type__Group__0
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
    // InternalPascal.g:1136:1: entryRulefield_list : rulefield_list EOF ;
    public final void entryRulefield_list() throws RecognitionException {
        try {
            // InternalPascal.g:1137:1: ( rulefield_list EOF )
            // InternalPascal.g:1138:1: rulefield_list EOF
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
    // InternalPascal.g:1145:1: rulefield_list : ( ( rule__Field_list__Group__0 ) ) ;
    public final void rulefield_list() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1149:2: ( ( ( rule__Field_list__Group__0 ) ) )
            // InternalPascal.g:1150:2: ( ( rule__Field_list__Group__0 ) )
            {
            // InternalPascal.g:1150:2: ( ( rule__Field_list__Group__0 ) )
            // InternalPascal.g:1151:3: ( rule__Field_list__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_listAccess().getGroup()); 
            }
            // InternalPascal.g:1152:3: ( rule__Field_list__Group__0 )
            // InternalPascal.g:1152:4: rule__Field_list__Group__0
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


    // $ANTLR start "entryRulerecord_section"
    // InternalPascal.g:1161:1: entryRulerecord_section : rulerecord_section EOF ;
    public final void entryRulerecord_section() throws RecognitionException {
        try {
            // InternalPascal.g:1162:1: ( rulerecord_section EOF )
            // InternalPascal.g:1163:1: rulerecord_section EOF
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
    // InternalPascal.g:1170:1: rulerecord_section : ( ( rule__Record_section__Group__0 ) ) ;
    public final void rulerecord_section() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1174:2: ( ( ( rule__Record_section__Group__0 ) ) )
            // InternalPascal.g:1175:2: ( ( rule__Record_section__Group__0 ) )
            {
            // InternalPascal.g:1175:2: ( ( rule__Record_section__Group__0 ) )
            // InternalPascal.g:1176:3: ( rule__Record_section__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecord_sectionAccess().getGroup()); 
            }
            // InternalPascal.g:1177:3: ( rule__Record_section__Group__0 )
            // InternalPascal.g:1177:4: rule__Record_section__Group__0
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


    // $ANTLR start "entryRulesigned_number"
    // InternalPascal.g:1186:1: entryRulesigned_number : rulesigned_number EOF ;
    public final void entryRulesigned_number() throws RecognitionException {
        try {
            // InternalPascal.g:1187:1: ( rulesigned_number EOF )
            // InternalPascal.g:1188:1: rulesigned_number EOF
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
    // InternalPascal.g:1195:1: rulesigned_number : ( ( rule__Signed_number__Alternatives ) ) ;
    public final void rulesigned_number() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1199:2: ( ( ( rule__Signed_number__Alternatives ) ) )
            // InternalPascal.g:1200:2: ( ( rule__Signed_number__Alternatives ) )
            {
            // InternalPascal.g:1200:2: ( ( rule__Signed_number__Alternatives ) )
            // InternalPascal.g:1201:3: ( rule__Signed_number__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSigned_numberAccess().getAlternatives()); 
            }
            // InternalPascal.g:1202:3: ( rule__Signed_number__Alternatives )
            // InternalPascal.g:1202:4: rule__Signed_number__Alternatives
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
    // InternalPascal.g:1211:1: entryRuleunsigned_number : ruleunsigned_number EOF ;
    public final void entryRuleunsigned_number() throws RecognitionException {
        try {
            // InternalPascal.g:1212:1: ( ruleunsigned_number EOF )
            // InternalPascal.g:1213:1: ruleunsigned_number EOF
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
    // InternalPascal.g:1220:1: ruleunsigned_number : ( ( rule__Unsigned_number__Alternatives ) ) ;
    public final void ruleunsigned_number() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1224:2: ( ( ( rule__Unsigned_number__Alternatives ) ) )
            // InternalPascal.g:1225:2: ( ( rule__Unsigned_number__Alternatives ) )
            {
            // InternalPascal.g:1225:2: ( ( rule__Unsigned_number__Alternatives ) )
            // InternalPascal.g:1226:3: ( rule__Unsigned_number__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnsigned_numberAccess().getAlternatives()); 
            }
            // InternalPascal.g:1227:3: ( rule__Unsigned_number__Alternatives )
            // InternalPascal.g:1227:4: rule__Unsigned_number__Alternatives
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
    // InternalPascal.g:1236:1: entryRulevariable_declaration_part : rulevariable_declaration_part EOF ;
    public final void entryRulevariable_declaration_part() throws RecognitionException {
        try {
            // InternalPascal.g:1237:1: ( rulevariable_declaration_part EOF )
            // InternalPascal.g:1238:1: rulevariable_declaration_part EOF
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
    // InternalPascal.g:1245:1: rulevariable_declaration_part : ( ( rule__Variable_declaration_part__Group__0 ) ) ;
    public final void rulevariable_declaration_part() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1249:2: ( ( ( rule__Variable_declaration_part__Group__0 ) ) )
            // InternalPascal.g:1250:2: ( ( rule__Variable_declaration_part__Group__0 ) )
            {
            // InternalPascal.g:1250:2: ( ( rule__Variable_declaration_part__Group__0 ) )
            // InternalPascal.g:1251:3: ( rule__Variable_declaration_part__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declaration_partAccess().getGroup()); 
            }
            // InternalPascal.g:1252:3: ( rule__Variable_declaration_part__Group__0 )
            // InternalPascal.g:1252:4: rule__Variable_declaration_part__Group__0
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
    // InternalPascal.g:1261:1: entryRulevariable_section : rulevariable_section EOF ;
    public final void entryRulevariable_section() throws RecognitionException {
        try {
            // InternalPascal.g:1262:1: ( rulevariable_section EOF )
            // InternalPascal.g:1263:1: rulevariable_section EOF
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
    // InternalPascal.g:1270:1: rulevariable_section : ( ( rule__Variable_section__Group__0 ) ) ;
    public final void rulevariable_section() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1274:2: ( ( ( rule__Variable_section__Group__0 ) ) )
            // InternalPascal.g:1275:2: ( ( rule__Variable_section__Group__0 ) )
            {
            // InternalPascal.g:1275:2: ( ( rule__Variable_section__Group__0 ) )
            // InternalPascal.g:1276:3: ( rule__Variable_section__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_sectionAccess().getGroup()); 
            }
            // InternalPascal.g:1277:3: ( rule__Variable_section__Group__0 )
            // InternalPascal.g:1277:4: rule__Variable_section__Group__0
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
    // InternalPascal.g:1286:1: entryRulevariable_identifier_list : rulevariable_identifier_list EOF ;
    public final void entryRulevariable_identifier_list() throws RecognitionException {
        try {
            // InternalPascal.g:1287:1: ( rulevariable_identifier_list EOF )
            // InternalPascal.g:1288:1: rulevariable_identifier_list EOF
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
    // InternalPascal.g:1295:1: rulevariable_identifier_list : ( ( rule__Variable_identifier_list__Group__0 ) ) ;
    public final void rulevariable_identifier_list() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1299:2: ( ( ( rule__Variable_identifier_list__Group__0 ) ) )
            // InternalPascal.g:1300:2: ( ( rule__Variable_identifier_list__Group__0 ) )
            {
            // InternalPascal.g:1300:2: ( ( rule__Variable_identifier_list__Group__0 ) )
            // InternalPascal.g:1301:3: ( rule__Variable_identifier_list__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_identifier_listAccess().getGroup()); 
            }
            // InternalPascal.g:1302:3: ( rule__Variable_identifier_list__Group__0 )
            // InternalPascal.g:1302:4: rule__Variable_identifier_list__Group__0
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
    // InternalPascal.g:1311:1: entryRulewhile_statement : rulewhile_statement EOF ;
    public final void entryRulewhile_statement() throws RecognitionException {
        try {
            // InternalPascal.g:1312:1: ( rulewhile_statement EOF )
            // InternalPascal.g:1313:1: rulewhile_statement EOF
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
    // InternalPascal.g:1320:1: rulewhile_statement : ( ( rule__While_statement__Group__0 ) ) ;
    public final void rulewhile_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1324:2: ( ( ( rule__While_statement__Group__0 ) ) )
            // InternalPascal.g:1325:2: ( ( rule__While_statement__Group__0 ) )
            {
            // InternalPascal.g:1325:2: ( ( rule__While_statement__Group__0 ) )
            // InternalPascal.g:1326:3: ( rule__While_statement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhile_statementAccess().getGroup()); 
            }
            // InternalPascal.g:1327:3: ( rule__While_statement__Group__0 )
            // InternalPascal.g:1327:4: rule__While_statement__Group__0
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
    // InternalPascal.g:1335:1: rule__Statement__Alternatives_1 : ( ( ( rule__Statement__SimpleAssignment_1_0 ) ) | ( ( rule__Statement__StructuredAssignment_1_1 ) ) );
    public final void rule__Statement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1339:1: ( ( ( rule__Statement__SimpleAssignment_1_0 ) ) | ( ( rule__Statement__StructuredAssignment_1_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==EOF||LA3_0==RULE_ID||LA3_0==21||LA3_0==23) ) {
                alt3=1;
            }
            else if ( (LA3_0==22||LA3_0==37) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalPascal.g:1340:2: ( ( rule__Statement__SimpleAssignment_1_0 ) )
                    {
                    // InternalPascal.g:1340:2: ( ( rule__Statement__SimpleAssignment_1_0 ) )
                    // InternalPascal.g:1341:3: ( rule__Statement__SimpleAssignment_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getSimpleAssignment_1_0()); 
                    }
                    // InternalPascal.g:1342:3: ( rule__Statement__SimpleAssignment_1_0 )
                    // InternalPascal.g:1342:4: rule__Statement__SimpleAssignment_1_0
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
                    // InternalPascal.g:1346:2: ( ( rule__Statement__StructuredAssignment_1_1 ) )
                    {
                    // InternalPascal.g:1346:2: ( ( rule__Statement__StructuredAssignment_1_1 ) )
                    // InternalPascal.g:1347:3: ( rule__Statement__StructuredAssignment_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getStructuredAssignment_1_1()); 
                    }
                    // InternalPascal.g:1348:3: ( rule__Statement__StructuredAssignment_1_1 )
                    // InternalPascal.g:1348:4: rule__Statement__StructuredAssignment_1_1
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
    // InternalPascal.g:1356:1: rule__Simple_statement__Alternatives : ( ( ( rule__Simple_statement__AssignmentAssignment_0 ) ) | ( ( rule__Simple_statement__FunctionAssignment_1 ) ) | ( ( rule__Simple_statement__Function_noargsAssignment_2 ) ) );
    public final void rule__Simple_statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1360:1: ( ( ( rule__Simple_statement__AssignmentAssignment_0 ) ) | ( ( rule__Simple_statement__FunctionAssignment_1 ) ) | ( ( rule__Simple_statement__Function_noargsAssignment_2 ) ) )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 27:
                    {
                    alt4=2;
                    }
                    break;
                case EOF:
                case 21:
                case 23:
                    {
                    alt4=3;
                    }
                    break;
                case 25:
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
                    // InternalPascal.g:1361:2: ( ( rule__Simple_statement__AssignmentAssignment_0 ) )
                    {
                    // InternalPascal.g:1361:2: ( ( rule__Simple_statement__AssignmentAssignment_0 ) )
                    // InternalPascal.g:1362:3: ( rule__Simple_statement__AssignmentAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimple_statementAccess().getAssignmentAssignment_0()); 
                    }
                    // InternalPascal.g:1363:3: ( rule__Simple_statement__AssignmentAssignment_0 )
                    // InternalPascal.g:1363:4: rule__Simple_statement__AssignmentAssignment_0
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
                    // InternalPascal.g:1367:2: ( ( rule__Simple_statement__FunctionAssignment_1 ) )
                    {
                    // InternalPascal.g:1367:2: ( ( rule__Simple_statement__FunctionAssignment_1 ) )
                    // InternalPascal.g:1368:3: ( rule__Simple_statement__FunctionAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimple_statementAccess().getFunctionAssignment_1()); 
                    }
                    // InternalPascal.g:1369:3: ( rule__Simple_statement__FunctionAssignment_1 )
                    // InternalPascal.g:1369:4: rule__Simple_statement__FunctionAssignment_1
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
                    // InternalPascal.g:1373:2: ( ( rule__Simple_statement__Function_noargsAssignment_2 ) )
                    {
                    // InternalPascal.g:1373:2: ( ( rule__Simple_statement__Function_noargsAssignment_2 ) )
                    // InternalPascal.g:1374:3: ( rule__Simple_statement__Function_noargsAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimple_statementAccess().getFunction_noargsAssignment_2()); 
                    }
                    // InternalPascal.g:1375:3: ( rule__Simple_statement__Function_noargsAssignment_2 )
                    // InternalPascal.g:1375:4: rule__Simple_statement__Function_noargsAssignment_2
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
    // InternalPascal.g:1383:1: rule__Structured_statement__Alternatives : ( ( ( rule__Structured_statement__CompoundAssignment_0 ) ) | ( ( rule__Structured_statement__While_stmtAssignment_1 ) ) );
    public final void rule__Structured_statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1387:1: ( ( ( rule__Structured_statement__CompoundAssignment_0 ) ) | ( ( rule__Structured_statement__While_stmtAssignment_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            else if ( (LA5_0==37) ) {
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
                    // InternalPascal.g:1388:2: ( ( rule__Structured_statement__CompoundAssignment_0 ) )
                    {
                    // InternalPascal.g:1388:2: ( ( rule__Structured_statement__CompoundAssignment_0 ) )
                    // InternalPascal.g:1389:3: ( rule__Structured_statement__CompoundAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStructured_statementAccess().getCompoundAssignment_0()); 
                    }
                    // InternalPascal.g:1390:3: ( rule__Structured_statement__CompoundAssignment_0 )
                    // InternalPascal.g:1390:4: rule__Structured_statement__CompoundAssignment_0
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
                    // InternalPascal.g:1394:2: ( ( rule__Structured_statement__While_stmtAssignment_1 ) )
                    {
                    // InternalPascal.g:1394:2: ( ( rule__Structured_statement__While_stmtAssignment_1 ) )
                    // InternalPascal.g:1395:3: ( rule__Structured_statement__While_stmtAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStructured_statementAccess().getWhile_stmtAssignment_1()); 
                    }
                    // InternalPascal.g:1396:3: ( rule__Structured_statement__While_stmtAssignment_1 )
                    // InternalPascal.g:1396:4: rule__Structured_statement__While_stmtAssignment_1
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
    // InternalPascal.g:1404:1: rule__Label__Alternatives : ( ( ( rule__Label__NumberAssignment_0 ) ) | ( ( rule__Label__NumberAssignment_1 ) ) );
    public final void rule__Label__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1408:1: ( ( ( rule__Label__NumberAssignment_0 ) ) | ( ( rule__Label__NumberAssignment_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_SIGNED_INTEGER_NUMBER) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_INTEGER_NUMBER) ) {
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
                    // InternalPascal.g:1409:2: ( ( rule__Label__NumberAssignment_0 ) )
                    {
                    // InternalPascal.g:1409:2: ( ( rule__Label__NumberAssignment_0 ) )
                    // InternalPascal.g:1410:3: ( rule__Label__NumberAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLabelAccess().getNumberAssignment_0()); 
                    }
                    // InternalPascal.g:1411:3: ( rule__Label__NumberAssignment_0 )
                    // InternalPascal.g:1411:4: rule__Label__NumberAssignment_0
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
                    // InternalPascal.g:1415:2: ( ( rule__Label__NumberAssignment_1 ) )
                    {
                    // InternalPascal.g:1415:2: ( ( rule__Label__NumberAssignment_1 ) )
                    // InternalPascal.g:1416:3: ( rule__Label__NumberAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLabelAccess().getNumberAssignment_1()); 
                    }
                    // InternalPascal.g:1417:3: ( rule__Label__NumberAssignment_1 )
                    // InternalPascal.g:1417:4: rule__Label__NumberAssignment_1
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


    // $ANTLR start "rule__Expression__Alternatives_1_0"
    // InternalPascal.g:1425:1: rule__Expression__Alternatives_1_0 : ( ( ( rule__Expression__OperatorsAssignment_1_0_0 ) ) | ( ( rule__Expression__OperatorsAssignment_1_0_1 ) ) | ( ( rule__Expression__OperatorsAssignment_1_0_2 ) ) );
    public final void rule__Expression__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1429:1: ( ( ( rule__Expression__OperatorsAssignment_1_0_0 ) ) | ( ( rule__Expression__OperatorsAssignment_1_0_1 ) ) | ( ( rule__Expression__OperatorsAssignment_1_0_2 ) ) )
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
            case 35:
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
                    // InternalPascal.g:1430:2: ( ( rule__Expression__OperatorsAssignment_1_0_0 ) )
                    {
                    // InternalPascal.g:1430:2: ( ( rule__Expression__OperatorsAssignment_1_0_0 ) )
                    // InternalPascal.g:1431:3: ( rule__Expression__OperatorsAssignment_1_0_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getOperatorsAssignment_1_0_0()); 
                    }
                    // InternalPascal.g:1432:3: ( rule__Expression__OperatorsAssignment_1_0_0 )
                    // InternalPascal.g:1432:4: rule__Expression__OperatorsAssignment_1_0_0
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
                    // InternalPascal.g:1436:2: ( ( rule__Expression__OperatorsAssignment_1_0_1 ) )
                    {
                    // InternalPascal.g:1436:2: ( ( rule__Expression__OperatorsAssignment_1_0_1 ) )
                    // InternalPascal.g:1437:3: ( rule__Expression__OperatorsAssignment_1_0_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getOperatorsAssignment_1_0_1()); 
                    }
                    // InternalPascal.g:1438:3: ( rule__Expression__OperatorsAssignment_1_0_1 )
                    // InternalPascal.g:1438:4: rule__Expression__OperatorsAssignment_1_0_1
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
                    // InternalPascal.g:1442:2: ( ( rule__Expression__OperatorsAssignment_1_0_2 ) )
                    {
                    // InternalPascal.g:1442:2: ( ( rule__Expression__OperatorsAssignment_1_0_2 ) )
                    // InternalPascal.g:1443:3: ( rule__Expression__OperatorsAssignment_1_0_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getOperatorsAssignment_1_0_2()); 
                    }
                    // InternalPascal.g:1444:3: ( rule__Expression__OperatorsAssignment_1_0_2 )
                    // InternalPascal.g:1444:4: rule__Expression__OperatorsAssignment_1_0_2
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
    // InternalPascal.g:1452:1: rule__Simple_expression__Alternatives_2 : ( ( ( rule__Simple_expression__Group_2_0__0 ) ) | ( ( rule__Simple_expression__TermsAssignment_2_1 ) ) );
    public final void rule__Simple_expression__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1456:1: ( ( ( rule__Simple_expression__Group_2_0__0 ) ) | ( ( rule__Simple_expression__TermsAssignment_2_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ADDITION_OP||LA8_0==40) ) {
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
                    // InternalPascal.g:1457:2: ( ( rule__Simple_expression__Group_2_0__0 ) )
                    {
                    // InternalPascal.g:1457:2: ( ( rule__Simple_expression__Group_2_0__0 ) )
                    // InternalPascal.g:1458:3: ( rule__Simple_expression__Group_2_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimple_expressionAccess().getGroup_2_0()); 
                    }
                    // InternalPascal.g:1459:3: ( rule__Simple_expression__Group_2_0__0 )
                    // InternalPascal.g:1459:4: rule__Simple_expression__Group_2_0__0
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
                    // InternalPascal.g:1463:2: ( ( rule__Simple_expression__TermsAssignment_2_1 ) )
                    {
                    // InternalPascal.g:1463:2: ( ( rule__Simple_expression__TermsAssignment_2_1 ) )
                    // InternalPascal.g:1464:3: ( rule__Simple_expression__TermsAssignment_2_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimple_expressionAccess().getTermsAssignment_2_1()); 
                    }
                    // InternalPascal.g:1465:3: ( rule__Simple_expression__TermsAssignment_2_1 )
                    // InternalPascal.g:1465:4: rule__Simple_expression__TermsAssignment_2_1
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
    // InternalPascal.g:1473:1: rule__Simple_expression__Alternatives_2_0_0 : ( ( ( rule__Simple_expression__OperatorsAssignment_2_0_0_0 ) ) | ( ( rule__Simple_expression__OperatorsAssignment_2_0_0_1 ) ) );
    public final void rule__Simple_expression__Alternatives_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1477:1: ( ( ( rule__Simple_expression__OperatorsAssignment_2_0_0_0 ) ) | ( ( rule__Simple_expression__OperatorsAssignment_2_0_0_1 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ADDITION_OP) ) {
                alt9=1;
            }
            else if ( (LA9_0==40) ) {
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
                    // InternalPascal.g:1478:2: ( ( rule__Simple_expression__OperatorsAssignment_2_0_0_0 ) )
                    {
                    // InternalPascal.g:1478:2: ( ( rule__Simple_expression__OperatorsAssignment_2_0_0_0 ) )
                    // InternalPascal.g:1479:3: ( rule__Simple_expression__OperatorsAssignment_2_0_0_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimple_expressionAccess().getOperatorsAssignment_2_0_0_0()); 
                    }
                    // InternalPascal.g:1480:3: ( rule__Simple_expression__OperatorsAssignment_2_0_0_0 )
                    // InternalPascal.g:1480:4: rule__Simple_expression__OperatorsAssignment_2_0_0_0
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
                    // InternalPascal.g:1484:2: ( ( rule__Simple_expression__OperatorsAssignment_2_0_0_1 ) )
                    {
                    // InternalPascal.g:1484:2: ( ( rule__Simple_expression__OperatorsAssignment_2_0_0_1 ) )
                    // InternalPascal.g:1485:3: ( rule__Simple_expression__OperatorsAssignment_2_0_0_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimple_expressionAccess().getOperatorsAssignment_2_0_0_1()); 
                    }
                    // InternalPascal.g:1486:3: ( rule__Simple_expression__OperatorsAssignment_2_0_0_1 )
                    // InternalPascal.g:1486:4: rule__Simple_expression__OperatorsAssignment_2_0_0_1
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
    // InternalPascal.g:1494:1: rule__Term__Alternatives_1_0 : ( ( ( rule__Term__OperatorsAssignment_1_0_0 ) ) | ( ( rule__Term__OperatorsAssignment_1_0_1 ) ) );
    public final void rule__Term__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1498:1: ( ( ( rule__Term__OperatorsAssignment_1_0_0 ) ) | ( ( rule__Term__OperatorsAssignment_1_0_1 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_MULTIPLICATION_OP) ) {
                alt10=1;
            }
            else if ( (LA10_0==41) ) {
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
                    // InternalPascal.g:1499:2: ( ( rule__Term__OperatorsAssignment_1_0_0 ) )
                    {
                    // InternalPascal.g:1499:2: ( ( rule__Term__OperatorsAssignment_1_0_0 ) )
                    // InternalPascal.g:1500:3: ( rule__Term__OperatorsAssignment_1_0_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTermAccess().getOperatorsAssignment_1_0_0()); 
                    }
                    // InternalPascal.g:1501:3: ( rule__Term__OperatorsAssignment_1_0_0 )
                    // InternalPascal.g:1501:4: rule__Term__OperatorsAssignment_1_0_0
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
                    // InternalPascal.g:1505:2: ( ( rule__Term__OperatorsAssignment_1_0_1 ) )
                    {
                    // InternalPascal.g:1505:2: ( ( rule__Term__OperatorsAssignment_1_0_1 ) )
                    // InternalPascal.g:1506:3: ( rule__Term__OperatorsAssignment_1_0_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTermAccess().getOperatorsAssignment_1_0_1()); 
                    }
                    // InternalPascal.g:1507:3: ( rule__Term__OperatorsAssignment_1_0_1 )
                    // InternalPascal.g:1507:4: rule__Term__OperatorsAssignment_1_0_1
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

            }
        }
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
    // InternalPascal.g:1515:1: rule__Factor__Alternatives : ( ( ( rule__Factor__VariableAssignment_0 ) ) | ( ( rule__Factor__NumberAssignment_1 ) ) | ( ( rule__Factor__StringAssignment_2 ) ) | ( ( rule__Factor__BooleanAssignment_3 ) ) | ( ( rule__Factor__BooleanAssignment_4 ) ) | ( ( rule__Factor__FunctionAssignment_5 ) ) | ( ( rule__Factor__Group_6__0 ) ) | ( ( rule__Factor__Group_7__0 ) ) | ( ( rule__Factor__NilAssignment_8 ) ) );
    public final void rule__Factor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1519:1: ( ( ( rule__Factor__VariableAssignment_0 ) ) | ( ( rule__Factor__NumberAssignment_1 ) ) | ( ( rule__Factor__StringAssignment_2 ) ) | ( ( rule__Factor__BooleanAssignment_3 ) ) | ( ( rule__Factor__BooleanAssignment_4 ) ) | ( ( rule__Factor__FunctionAssignment_5 ) ) | ( ( rule__Factor__Group_6__0 ) ) | ( ( rule__Factor__Group_7__0 ) ) | ( ( rule__Factor__NilAssignment_8 ) ) )
            int alt11=9;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalPascal.g:1520:2: ( ( rule__Factor__VariableAssignment_0 ) )
                    {
                    // InternalPascal.g:1520:2: ( ( rule__Factor__VariableAssignment_0 ) )
                    // InternalPascal.g:1521:3: ( rule__Factor__VariableAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFactorAccess().getVariableAssignment_0()); 
                    }
                    // InternalPascal.g:1522:3: ( rule__Factor__VariableAssignment_0 )
                    // InternalPascal.g:1522:4: rule__Factor__VariableAssignment_0
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
                    // InternalPascal.g:1526:2: ( ( rule__Factor__NumberAssignment_1 ) )
                    {
                    // InternalPascal.g:1526:2: ( ( rule__Factor__NumberAssignment_1 ) )
                    // InternalPascal.g:1527:3: ( rule__Factor__NumberAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFactorAccess().getNumberAssignment_1()); 
                    }
                    // InternalPascal.g:1528:3: ( rule__Factor__NumberAssignment_1 )
                    // InternalPascal.g:1528:4: rule__Factor__NumberAssignment_1
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
                    // InternalPascal.g:1532:2: ( ( rule__Factor__StringAssignment_2 ) )
                    {
                    // InternalPascal.g:1532:2: ( ( rule__Factor__StringAssignment_2 ) )
                    // InternalPascal.g:1533:3: ( rule__Factor__StringAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFactorAccess().getStringAssignment_2()); 
                    }
                    // InternalPascal.g:1534:3: ( rule__Factor__StringAssignment_2 )
                    // InternalPascal.g:1534:4: rule__Factor__StringAssignment_2
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
                    // InternalPascal.g:1538:2: ( ( rule__Factor__BooleanAssignment_3 ) )
                    {
                    // InternalPascal.g:1538:2: ( ( rule__Factor__BooleanAssignment_3 ) )
                    // InternalPascal.g:1539:3: ( rule__Factor__BooleanAssignment_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFactorAccess().getBooleanAssignment_3()); 
                    }
                    // InternalPascal.g:1540:3: ( rule__Factor__BooleanAssignment_3 )
                    // InternalPascal.g:1540:4: rule__Factor__BooleanAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__BooleanAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFactorAccess().getBooleanAssignment_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalPascal.g:1544:2: ( ( rule__Factor__BooleanAssignment_4 ) )
                    {
                    // InternalPascal.g:1544:2: ( ( rule__Factor__BooleanAssignment_4 ) )
                    // InternalPascal.g:1545:3: ( rule__Factor__BooleanAssignment_4 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFactorAccess().getBooleanAssignment_4()); 
                    }
                    // InternalPascal.g:1546:3: ( rule__Factor__BooleanAssignment_4 )
                    // InternalPascal.g:1546:4: rule__Factor__BooleanAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__BooleanAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFactorAccess().getBooleanAssignment_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalPascal.g:1550:2: ( ( rule__Factor__FunctionAssignment_5 ) )
                    {
                    // InternalPascal.g:1550:2: ( ( rule__Factor__FunctionAssignment_5 ) )
                    // InternalPascal.g:1551:3: ( rule__Factor__FunctionAssignment_5 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFactorAccess().getFunctionAssignment_5()); 
                    }
                    // InternalPascal.g:1552:3: ( rule__Factor__FunctionAssignment_5 )
                    // InternalPascal.g:1552:4: rule__Factor__FunctionAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__FunctionAssignment_5();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFactorAccess().getFunctionAssignment_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalPascal.g:1556:2: ( ( rule__Factor__Group_6__0 ) )
                    {
                    // InternalPascal.g:1556:2: ( ( rule__Factor__Group_6__0 ) )
                    // InternalPascal.g:1557:3: ( rule__Factor__Group_6__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFactorAccess().getGroup_6()); 
                    }
                    // InternalPascal.g:1558:3: ( rule__Factor__Group_6__0 )
                    // InternalPascal.g:1558:4: rule__Factor__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFactorAccess().getGroup_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalPascal.g:1562:2: ( ( rule__Factor__Group_7__0 ) )
                    {
                    // InternalPascal.g:1562:2: ( ( rule__Factor__Group_7__0 ) )
                    // InternalPascal.g:1563:3: ( rule__Factor__Group_7__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFactorAccess().getGroup_7()); 
                    }
                    // InternalPascal.g:1564:3: ( rule__Factor__Group_7__0 )
                    // InternalPascal.g:1564:4: rule__Factor__Group_7__0
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
                    // InternalPascal.g:1568:2: ( ( rule__Factor__NilAssignment_8 ) )
                    {
                    // InternalPascal.g:1568:2: ( ( rule__Factor__NilAssignment_8 ) )
                    // InternalPascal.g:1569:3: ( rule__Factor__NilAssignment_8 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFactorAccess().getNilAssignment_8()); 
                    }
                    // InternalPascal.g:1570:3: ( rule__Factor__NilAssignment_8 )
                    // InternalPascal.g:1570:4: rule__Factor__NilAssignment_8
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__NilAssignment_8();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFactorAccess().getNilAssignment_8()); 
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
    // InternalPascal.g:1578:1: rule__Function_procedure_declaration__Alternatives_0 : ( ( ( rule__Function_procedure_declaration__FunctionsAssignment_0_0 ) ) | ( ( rule__Function_procedure_declaration__ProceduresAssignment_0_1 ) ) );
    public final void rule__Function_procedure_declaration__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1582:1: ( ( ( rule__Function_procedure_declaration__FunctionsAssignment_0_0 ) ) | ( ( rule__Function_procedure_declaration__ProceduresAssignment_0_1 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            else if ( (LA12_0==31) ) {
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
                    // InternalPascal.g:1583:2: ( ( rule__Function_procedure_declaration__FunctionsAssignment_0_0 ) )
                    {
                    // InternalPascal.g:1583:2: ( ( rule__Function_procedure_declaration__FunctionsAssignment_0_0 ) )
                    // InternalPascal.g:1584:3: ( rule__Function_procedure_declaration__FunctionsAssignment_0_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFunction_procedure_declarationAccess().getFunctionsAssignment_0_0()); 
                    }
                    // InternalPascal.g:1585:3: ( rule__Function_procedure_declaration__FunctionsAssignment_0_0 )
                    // InternalPascal.g:1585:4: rule__Function_procedure_declaration__FunctionsAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Function_procedure_declaration__FunctionsAssignment_0_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFunction_procedure_declarationAccess().getFunctionsAssignment_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1589:2: ( ( rule__Function_procedure_declaration__ProceduresAssignment_0_1 ) )
                    {
                    // InternalPascal.g:1589:2: ( ( rule__Function_procedure_declaration__ProceduresAssignment_0_1 ) )
                    // InternalPascal.g:1590:3: ( rule__Function_procedure_declaration__ProceduresAssignment_0_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFunction_procedure_declarationAccess().getProceduresAssignment_0_1()); 
                    }
                    // InternalPascal.g:1591:3: ( rule__Function_procedure_declaration__ProceduresAssignment_0_1 )
                    // InternalPascal.g:1591:4: rule__Function_procedure_declaration__ProceduresAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Function_procedure_declaration__ProceduresAssignment_0_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFunction_procedure_declarationAccess().getProceduresAssignment_0_1()); 
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
    // InternalPascal.g:1599:1: rule__Formal_parameter_section__Alternatives : ( ( ( rule__Formal_parameter_section__ValueAssignment_0 ) ) | ( ( rule__Formal_parameter_section__VariableAssignment_1 ) ) | ( ( rule__Formal_parameter_section__ProcedureAssignment_2 ) ) | ( ( rule__Formal_parameter_section__FunctionAssignment_3 ) ) );
    public final void rule__Formal_parameter_section__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1603:1: ( ( ( rule__Formal_parameter_section__ValueAssignment_0 ) ) | ( ( rule__Formal_parameter_section__VariableAssignment_1 ) ) | ( ( rule__Formal_parameter_section__ProcedureAssignment_2 ) ) | ( ( rule__Formal_parameter_section__FunctionAssignment_3 ) ) )
            int alt13=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt13=1;
                }
                break;
            case 32:
                {
                alt13=2;
                }
                break;
            case 31:
                {
                alt13=3;
                }
                break;
            case 30:
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
                    // InternalPascal.g:1604:2: ( ( rule__Formal_parameter_section__ValueAssignment_0 ) )
                    {
                    // InternalPascal.g:1604:2: ( ( rule__Formal_parameter_section__ValueAssignment_0 ) )
                    // InternalPascal.g:1605:3: ( rule__Formal_parameter_section__ValueAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFormal_parameter_sectionAccess().getValueAssignment_0()); 
                    }
                    // InternalPascal.g:1606:3: ( rule__Formal_parameter_section__ValueAssignment_0 )
                    // InternalPascal.g:1606:4: rule__Formal_parameter_section__ValueAssignment_0
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
                    // InternalPascal.g:1610:2: ( ( rule__Formal_parameter_section__VariableAssignment_1 ) )
                    {
                    // InternalPascal.g:1610:2: ( ( rule__Formal_parameter_section__VariableAssignment_1 ) )
                    // InternalPascal.g:1611:3: ( rule__Formal_parameter_section__VariableAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFormal_parameter_sectionAccess().getVariableAssignment_1()); 
                    }
                    // InternalPascal.g:1612:3: ( rule__Formal_parameter_section__VariableAssignment_1 )
                    // InternalPascal.g:1612:4: rule__Formal_parameter_section__VariableAssignment_1
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
                    // InternalPascal.g:1616:2: ( ( rule__Formal_parameter_section__ProcedureAssignment_2 ) )
                    {
                    // InternalPascal.g:1616:2: ( ( rule__Formal_parameter_section__ProcedureAssignment_2 ) )
                    // InternalPascal.g:1617:3: ( rule__Formal_parameter_section__ProcedureAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFormal_parameter_sectionAccess().getProcedureAssignment_2()); 
                    }
                    // InternalPascal.g:1618:3: ( rule__Formal_parameter_section__ProcedureAssignment_2 )
                    // InternalPascal.g:1618:4: rule__Formal_parameter_section__ProcedureAssignment_2
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
                    // InternalPascal.g:1622:2: ( ( rule__Formal_parameter_section__FunctionAssignment_3 ) )
                    {
                    // InternalPascal.g:1622:2: ( ( rule__Formal_parameter_section__FunctionAssignment_3 ) )
                    // InternalPascal.g:1623:3: ( rule__Formal_parameter_section__FunctionAssignment_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFormal_parameter_sectionAccess().getFunctionAssignment_3()); 
                    }
                    // InternalPascal.g:1624:3: ( rule__Formal_parameter_section__FunctionAssignment_3 )
                    // InternalPascal.g:1624:4: rule__Formal_parameter_section__FunctionAssignment_3
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
    // InternalPascal.g:1632:1: rule__Any_number__Alternatives : ( ( ruleunsigned_number ) | ( rulesigned_number ) );
    public final void rule__Any_number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1636:1: ( ( ruleunsigned_number ) | ( rulesigned_number ) )
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
                    // InternalPascal.g:1637:2: ( ruleunsigned_number )
                    {
                    // InternalPascal.g:1637:2: ( ruleunsigned_number )
                    // InternalPascal.g:1638:3: ruleunsigned_number
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
                    // InternalPascal.g:1643:2: ( rulesigned_number )
                    {
                    // InternalPascal.g:1643:2: ( rulesigned_number )
                    // InternalPascal.g:1644:3: rulesigned_number
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
    // InternalPascal.g:1653:1: rule__Constant__Alternatives : ( ( ( rule__Constant__Group_0__0 ) ) | ( ( rule__Constant__StringAssignment_1 ) ) | ( ( rule__Constant__BoolLiteralAssignment_2 ) ) | ( ( rule__Constant__BoolLiteralAssignment_3 ) ) | ( ( rule__Constant__NilAssignment_4 ) ) );
    public final void rule__Constant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1657:1: ( ( ( rule__Constant__Group_0__0 ) ) | ( ( rule__Constant__StringAssignment_1 ) ) | ( ( rule__Constant__BoolLiteralAssignment_2 ) ) | ( ( rule__Constant__BoolLiteralAssignment_3 ) ) | ( ( rule__Constant__NilAssignment_4 ) ) )
            int alt15=5;
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
            case 42:
                {
                alt15=3;
                }
                break;
            case 43:
                {
                alt15=4;
                }
                break;
            case 44:
                {
                alt15=5;
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
                    // InternalPascal.g:1658:2: ( ( rule__Constant__Group_0__0 ) )
                    {
                    // InternalPascal.g:1658:2: ( ( rule__Constant__Group_0__0 ) )
                    // InternalPascal.g:1659:3: ( rule__Constant__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConstantAccess().getGroup_0()); 
                    }
                    // InternalPascal.g:1660:3: ( rule__Constant__Group_0__0 )
                    // InternalPascal.g:1660:4: rule__Constant__Group_0__0
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
                    // InternalPascal.g:1664:2: ( ( rule__Constant__StringAssignment_1 ) )
                    {
                    // InternalPascal.g:1664:2: ( ( rule__Constant__StringAssignment_1 ) )
                    // InternalPascal.g:1665:3: ( rule__Constant__StringAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConstantAccess().getStringAssignment_1()); 
                    }
                    // InternalPascal.g:1666:3: ( rule__Constant__StringAssignment_1 )
                    // InternalPascal.g:1666:4: rule__Constant__StringAssignment_1
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
                    // InternalPascal.g:1670:2: ( ( rule__Constant__BoolLiteralAssignment_2 ) )
                    {
                    // InternalPascal.g:1670:2: ( ( rule__Constant__BoolLiteralAssignment_2 ) )
                    // InternalPascal.g:1671:3: ( rule__Constant__BoolLiteralAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConstantAccess().getBoolLiteralAssignment_2()); 
                    }
                    // InternalPascal.g:1672:3: ( rule__Constant__BoolLiteralAssignment_2 )
                    // InternalPascal.g:1672:4: rule__Constant__BoolLiteralAssignment_2
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
                    // InternalPascal.g:1676:2: ( ( rule__Constant__BoolLiteralAssignment_3 ) )
                    {
                    // InternalPascal.g:1676:2: ( ( rule__Constant__BoolLiteralAssignment_3 ) )
                    // InternalPascal.g:1677:3: ( rule__Constant__BoolLiteralAssignment_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConstantAccess().getBoolLiteralAssignment_3()); 
                    }
                    // InternalPascal.g:1678:3: ( rule__Constant__BoolLiteralAssignment_3 )
                    // InternalPascal.g:1678:4: rule__Constant__BoolLiteralAssignment_3
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
                case 5 :
                    // InternalPascal.g:1682:2: ( ( rule__Constant__NilAssignment_4 ) )
                    {
                    // InternalPascal.g:1682:2: ( ( rule__Constant__NilAssignment_4 ) )
                    // InternalPascal.g:1683:3: ( rule__Constant__NilAssignment_4 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConstantAccess().getNilAssignment_4()); 
                    }
                    // InternalPascal.g:1684:3: ( rule__Constant__NilAssignment_4 )
                    // InternalPascal.g:1684:4: rule__Constant__NilAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constant__NilAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConstantAccess().getNilAssignment_4()); 
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
    // InternalPascal.g:1692:1: rule__Constant__Alternatives_0_1 : ( ( ( rule__Constant__NameAssignment_0_1_0 ) ) | ( ( rule__Constant__NumberAssignment_0_1_1 ) ) );
    public final void rule__Constant__Alternatives_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1696:1: ( ( ( rule__Constant__NameAssignment_0_1_0 ) ) | ( ( rule__Constant__NumberAssignment_0_1_1 ) ) )
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
                    // InternalPascal.g:1697:2: ( ( rule__Constant__NameAssignment_0_1_0 ) )
                    {
                    // InternalPascal.g:1697:2: ( ( rule__Constant__NameAssignment_0_1_0 ) )
                    // InternalPascal.g:1698:3: ( rule__Constant__NameAssignment_0_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConstantAccess().getNameAssignment_0_1_0()); 
                    }
                    // InternalPascal.g:1699:3: ( rule__Constant__NameAssignment_0_1_0 )
                    // InternalPascal.g:1699:4: rule__Constant__NameAssignment_0_1_0
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
                    // InternalPascal.g:1703:2: ( ( rule__Constant__NumberAssignment_0_1_1 ) )
                    {
                    // InternalPascal.g:1703:2: ( ( rule__Constant__NumberAssignment_0_1_1 ) )
                    // InternalPascal.g:1704:3: ( rule__Constant__NumberAssignment_0_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConstantAccess().getNumberAssignment_0_1_1()); 
                    }
                    // InternalPascal.g:1705:3: ( rule__Constant__NumberAssignment_0_1_1 )
                    // InternalPascal.g:1705:4: rule__Constant__NumberAssignment_0_1_1
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
    // InternalPascal.g:1713:1: rule__Type__Alternatives : ( ( ( rule__Type__SimpleAssignment_0 ) ) | ( ( rule__Type__StructuredAssignment_1 ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1717:1: ( ( ( rule__Type__SimpleAssignment_0 ) ) | ( ( rule__Type__StructuredAssignment_1 ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            else if ( (LA17_0==45) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalPascal.g:1718:2: ( ( rule__Type__SimpleAssignment_0 ) )
                    {
                    // InternalPascal.g:1718:2: ( ( rule__Type__SimpleAssignment_0 ) )
                    // InternalPascal.g:1719:3: ( rule__Type__SimpleAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getSimpleAssignment_0()); 
                    }
                    // InternalPascal.g:1720:3: ( rule__Type__SimpleAssignment_0 )
                    // InternalPascal.g:1720:4: rule__Type__SimpleAssignment_0
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
                    // InternalPascal.g:1724:2: ( ( rule__Type__StructuredAssignment_1 ) )
                    {
                    // InternalPascal.g:1724:2: ( ( rule__Type__StructuredAssignment_1 ) )
                    // InternalPascal.g:1725:3: ( rule__Type__StructuredAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getStructuredAssignment_1()); 
                    }
                    // InternalPascal.g:1726:3: ( rule__Type__StructuredAssignment_1 )
                    // InternalPascal.g:1726:4: rule__Type__StructuredAssignment_1
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

            }
        }
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


    // $ANTLR start "rule__Signed_number__Alternatives"
    // InternalPascal.g:1734:1: rule__Signed_number__Alternatives : ( ( ( rule__Signed_number__IntegerAssignment_0 ) ) | ( ( rule__Signed_number__RealAssignment_1 ) ) );
    public final void rule__Signed_number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1738:1: ( ( ( rule__Signed_number__IntegerAssignment_0 ) ) | ( ( rule__Signed_number__RealAssignment_1 ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_SIGNED_INTEGER_NUMBER) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_SIGNED_REAL_NUMBER) ) {
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
                    // InternalPascal.g:1739:2: ( ( rule__Signed_number__IntegerAssignment_0 ) )
                    {
                    // InternalPascal.g:1739:2: ( ( rule__Signed_number__IntegerAssignment_0 ) )
                    // InternalPascal.g:1740:3: ( rule__Signed_number__IntegerAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSigned_numberAccess().getIntegerAssignment_0()); 
                    }
                    // InternalPascal.g:1741:3: ( rule__Signed_number__IntegerAssignment_0 )
                    // InternalPascal.g:1741:4: rule__Signed_number__IntegerAssignment_0
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
                    // InternalPascal.g:1745:2: ( ( rule__Signed_number__RealAssignment_1 ) )
                    {
                    // InternalPascal.g:1745:2: ( ( rule__Signed_number__RealAssignment_1 ) )
                    // InternalPascal.g:1746:3: ( rule__Signed_number__RealAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSigned_numberAccess().getRealAssignment_1()); 
                    }
                    // InternalPascal.g:1747:3: ( rule__Signed_number__RealAssignment_1 )
                    // InternalPascal.g:1747:4: rule__Signed_number__RealAssignment_1
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
    // InternalPascal.g:1755:1: rule__Unsigned_number__Alternatives : ( ( ( rule__Unsigned_number__IntegerAssignment_0 ) ) | ( ( rule__Unsigned_number__RealAssignment_1 ) ) );
    public final void rule__Unsigned_number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1759:1: ( ( ( rule__Unsigned_number__IntegerAssignment_0 ) ) | ( ( rule__Unsigned_number__RealAssignment_1 ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_INTEGER_NUMBER) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_REAL_NUMBER) ) {
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
                    // InternalPascal.g:1760:2: ( ( rule__Unsigned_number__IntegerAssignment_0 ) )
                    {
                    // InternalPascal.g:1760:2: ( ( rule__Unsigned_number__IntegerAssignment_0 ) )
                    // InternalPascal.g:1761:3: ( rule__Unsigned_number__IntegerAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnsigned_numberAccess().getIntegerAssignment_0()); 
                    }
                    // InternalPascal.g:1762:3: ( rule__Unsigned_number__IntegerAssignment_0 )
                    // InternalPascal.g:1762:4: rule__Unsigned_number__IntegerAssignment_0
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
                    // InternalPascal.g:1766:2: ( ( rule__Unsigned_number__RealAssignment_1 ) )
                    {
                    // InternalPascal.g:1766:2: ( ( rule__Unsigned_number__RealAssignment_1 ) )
                    // InternalPascal.g:1767:3: ( rule__Unsigned_number__RealAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnsigned_numberAccess().getRealAssignment_1()); 
                    }
                    // InternalPascal.g:1768:3: ( rule__Unsigned_number__RealAssignment_1 )
                    // InternalPascal.g:1768:4: rule__Unsigned_number__RealAssignment_1
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
    // InternalPascal.g:1776:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1780:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalPascal.g:1781:2: rule__Program__Group__0__Impl rule__Program__Group__1
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
    // InternalPascal.g:1788:1: rule__Program__Group__0__Impl : ( ( rule__Program__HeadingAssignment_0 ) ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1792:1: ( ( ( rule__Program__HeadingAssignment_0 ) ) )
            // InternalPascal.g:1793:1: ( ( rule__Program__HeadingAssignment_0 ) )
            {
            // InternalPascal.g:1793:1: ( ( rule__Program__HeadingAssignment_0 ) )
            // InternalPascal.g:1794:2: ( rule__Program__HeadingAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getHeadingAssignment_0()); 
            }
            // InternalPascal.g:1795:2: ( rule__Program__HeadingAssignment_0 )
            // InternalPascal.g:1795:3: rule__Program__HeadingAssignment_0
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
    // InternalPascal.g:1803:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1807:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // InternalPascal.g:1808:2: rule__Program__Group__1__Impl rule__Program__Group__2
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
    // InternalPascal.g:1815:1: rule__Program__Group__1__Impl : ( ( rule__Program__BlockAssignment_1 ) ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1819:1: ( ( ( rule__Program__BlockAssignment_1 ) ) )
            // InternalPascal.g:1820:1: ( ( rule__Program__BlockAssignment_1 ) )
            {
            // InternalPascal.g:1820:1: ( ( rule__Program__BlockAssignment_1 ) )
            // InternalPascal.g:1821:2: ( rule__Program__BlockAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getBlockAssignment_1()); 
            }
            // InternalPascal.g:1822:2: ( rule__Program__BlockAssignment_1 )
            // InternalPascal.g:1822:3: rule__Program__BlockAssignment_1
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
    // InternalPascal.g:1830:1: rule__Program__Group__2 : rule__Program__Group__2__Impl ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1834:1: ( rule__Program__Group__2__Impl )
            // InternalPascal.g:1835:2: rule__Program__Group__2__Impl
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
    // InternalPascal.g:1841:1: rule__Program__Group__2__Impl : ( '.' ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1845:1: ( ( '.' ) )
            // InternalPascal.g:1846:1: ( '.' )
            {
            // InternalPascal.g:1846:1: ( '.' )
            // InternalPascal.g:1847:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getFullStopKeyword_2()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:1857:1: rule__Program_heading_block__Group__0 : rule__Program_heading_block__Group__0__Impl rule__Program_heading_block__Group__1 ;
    public final void rule__Program_heading_block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1861:1: ( rule__Program_heading_block__Group__0__Impl rule__Program_heading_block__Group__1 )
            // InternalPascal.g:1862:2: rule__Program_heading_block__Group__0__Impl rule__Program_heading_block__Group__1
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
    // InternalPascal.g:1869:1: rule__Program_heading_block__Group__0__Impl : ( 'program' ) ;
    public final void rule__Program_heading_block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1873:1: ( ( 'program' ) )
            // InternalPascal.g:1874:1: ( 'program' )
            {
            // InternalPascal.g:1874:1: ( 'program' )
            // InternalPascal.g:1875:2: 'program'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgram_heading_blockAccess().getProgramKeyword_0()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:1884:1: rule__Program_heading_block__Group__1 : rule__Program_heading_block__Group__1__Impl rule__Program_heading_block__Group__2 ;
    public final void rule__Program_heading_block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1888:1: ( rule__Program_heading_block__Group__1__Impl rule__Program_heading_block__Group__2 )
            // InternalPascal.g:1889:2: rule__Program_heading_block__Group__1__Impl rule__Program_heading_block__Group__2
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
    // InternalPascal.g:1896:1: rule__Program_heading_block__Group__1__Impl : ( ( rule__Program_heading_block__NameAssignment_1 ) ) ;
    public final void rule__Program_heading_block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1900:1: ( ( ( rule__Program_heading_block__NameAssignment_1 ) ) )
            // InternalPascal.g:1901:1: ( ( rule__Program_heading_block__NameAssignment_1 ) )
            {
            // InternalPascal.g:1901:1: ( ( rule__Program_heading_block__NameAssignment_1 ) )
            // InternalPascal.g:1902:2: ( rule__Program_heading_block__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgram_heading_blockAccess().getNameAssignment_1()); 
            }
            // InternalPascal.g:1903:2: ( rule__Program_heading_block__NameAssignment_1 )
            // InternalPascal.g:1903:3: rule__Program_heading_block__NameAssignment_1
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
    // InternalPascal.g:1911:1: rule__Program_heading_block__Group__2 : rule__Program_heading_block__Group__2__Impl ;
    public final void rule__Program_heading_block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1915:1: ( rule__Program_heading_block__Group__2__Impl )
            // InternalPascal.g:1916:2: rule__Program_heading_block__Group__2__Impl
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
    // InternalPascal.g:1922:1: rule__Program_heading_block__Group__2__Impl : ( ';' ) ;
    public final void rule__Program_heading_block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1926:1: ( ( ';' ) )
            // InternalPascal.g:1927:1: ( ';' )
            {
            // InternalPascal.g:1927:1: ( ';' )
            // InternalPascal.g:1928:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgram_heading_blockAccess().getSemicolonKeyword_2()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:1938:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1942:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // InternalPascal.g:1943:2: rule__Block__Group__0__Impl rule__Block__Group__1
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
    // InternalPascal.g:1950:1: rule__Block__Group__0__Impl : ( ( rule__Block__LabelAssignment_0 )? ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1954:1: ( ( ( rule__Block__LabelAssignment_0 )? ) )
            // InternalPascal.g:1955:1: ( ( rule__Block__LabelAssignment_0 )? )
            {
            // InternalPascal.g:1955:1: ( ( rule__Block__LabelAssignment_0 )? )
            // InternalPascal.g:1956:2: ( rule__Block__LabelAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getLabelAssignment_0()); 
            }
            // InternalPascal.g:1957:2: ( rule__Block__LabelAssignment_0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==33) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalPascal.g:1957:3: rule__Block__LabelAssignment_0
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
    // InternalPascal.g:1965:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1969:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // InternalPascal.g:1970:2: rule__Block__Group__1__Impl rule__Block__Group__2
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
    // InternalPascal.g:1977:1: rule__Block__Group__1__Impl : ( ( rule__Block__TypeAssignment_1 )? ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1981:1: ( ( ( rule__Block__TypeAssignment_1 )? ) )
            // InternalPascal.g:1982:1: ( ( rule__Block__TypeAssignment_1 )? )
            {
            // InternalPascal.g:1982:1: ( ( rule__Block__TypeAssignment_1 )? )
            // InternalPascal.g:1983:2: ( rule__Block__TypeAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getTypeAssignment_1()); 
            }
            // InternalPascal.g:1984:2: ( rule__Block__TypeAssignment_1 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==36) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalPascal.g:1984:3: rule__Block__TypeAssignment_1
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
    // InternalPascal.g:1992:1: rule__Block__Group__2 : rule__Block__Group__2__Impl rule__Block__Group__3 ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1996:1: ( rule__Block__Group__2__Impl rule__Block__Group__3 )
            // InternalPascal.g:1997:2: rule__Block__Group__2__Impl rule__Block__Group__3
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
    // InternalPascal.g:2004:1: rule__Block__Group__2__Impl : ( ( rule__Block__VariableAssignment_2 )? ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2008:1: ( ( ( rule__Block__VariableAssignment_2 )? ) )
            // InternalPascal.g:2009:1: ( ( rule__Block__VariableAssignment_2 )? )
            {
            // InternalPascal.g:2009:1: ( ( rule__Block__VariableAssignment_2 )? )
            // InternalPascal.g:2010:2: ( rule__Block__VariableAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getVariableAssignment_2()); 
            }
            // InternalPascal.g:2011:2: ( rule__Block__VariableAssignment_2 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==32) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalPascal.g:2011:3: rule__Block__VariableAssignment_2
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
    // InternalPascal.g:2019:1: rule__Block__Group__3 : rule__Block__Group__3__Impl rule__Block__Group__4 ;
    public final void rule__Block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2023:1: ( rule__Block__Group__3__Impl rule__Block__Group__4 )
            // InternalPascal.g:2024:2: rule__Block__Group__3__Impl rule__Block__Group__4
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
    // InternalPascal.g:2031:1: rule__Block__Group__3__Impl : ( ( rule__Block__ConstantAssignment_3 )? ) ;
    public final void rule__Block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2035:1: ( ( ( rule__Block__ConstantAssignment_3 )? ) )
            // InternalPascal.g:2036:1: ( ( rule__Block__ConstantAssignment_3 )? )
            {
            // InternalPascal.g:2036:1: ( ( rule__Block__ConstantAssignment_3 )? )
            // InternalPascal.g:2037:2: ( rule__Block__ConstantAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getConstantAssignment_3()); 
            }
            // InternalPascal.g:2038:2: ( rule__Block__ConstantAssignment_3 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==34) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalPascal.g:2038:3: rule__Block__ConstantAssignment_3
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
    // InternalPascal.g:2046:1: rule__Block__Group__4 : rule__Block__Group__4__Impl rule__Block__Group__5 ;
    public final void rule__Block__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2050:1: ( rule__Block__Group__4__Impl rule__Block__Group__5 )
            // InternalPascal.g:2051:2: rule__Block__Group__4__Impl rule__Block__Group__5
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
    // InternalPascal.g:2058:1: rule__Block__Group__4__Impl : ( ( rule__Block__AbstractionAssignment_4 )? ) ;
    public final void rule__Block__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2062:1: ( ( ( rule__Block__AbstractionAssignment_4 )? ) )
            // InternalPascal.g:2063:1: ( ( rule__Block__AbstractionAssignment_4 )? )
            {
            // InternalPascal.g:2063:1: ( ( rule__Block__AbstractionAssignment_4 )? )
            // InternalPascal.g:2064:2: ( rule__Block__AbstractionAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getAbstractionAssignment_4()); 
            }
            // InternalPascal.g:2065:2: ( rule__Block__AbstractionAssignment_4 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=30 && LA24_0<=31)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalPascal.g:2065:3: rule__Block__AbstractionAssignment_4
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
    // InternalPascal.g:2073:1: rule__Block__Group__5 : rule__Block__Group__5__Impl ;
    public final void rule__Block__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2077:1: ( rule__Block__Group__5__Impl )
            // InternalPascal.g:2078:2: rule__Block__Group__5__Impl
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
    // InternalPascal.g:2084:1: rule__Block__Group__5__Impl : ( ( rule__Block__StatementAssignment_5 ) ) ;
    public final void rule__Block__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2088:1: ( ( ( rule__Block__StatementAssignment_5 ) ) )
            // InternalPascal.g:2089:1: ( ( rule__Block__StatementAssignment_5 ) )
            {
            // InternalPascal.g:2089:1: ( ( rule__Block__StatementAssignment_5 ) )
            // InternalPascal.g:2090:2: ( rule__Block__StatementAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getStatementAssignment_5()); 
            }
            // InternalPascal.g:2091:2: ( rule__Block__StatementAssignment_5 )
            // InternalPascal.g:2091:3: rule__Block__StatementAssignment_5
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
    // InternalPascal.g:2100:1: rule__Statement_part__Group__0 : rule__Statement_part__Group__0__Impl rule__Statement_part__Group__1 ;
    public final void rule__Statement_part__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2104:1: ( rule__Statement_part__Group__0__Impl rule__Statement_part__Group__1 )
            // InternalPascal.g:2105:2: rule__Statement_part__Group__0__Impl rule__Statement_part__Group__1
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
    // InternalPascal.g:2112:1: rule__Statement_part__Group__0__Impl : ( 'begin' ) ;
    public final void rule__Statement_part__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2116:1: ( ( 'begin' ) )
            // InternalPascal.g:2117:1: ( 'begin' )
            {
            // InternalPascal.g:2117:1: ( 'begin' )
            // InternalPascal.g:2118:2: 'begin'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatement_partAccess().getBeginKeyword_0()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:2127:1: rule__Statement_part__Group__1 : rule__Statement_part__Group__1__Impl rule__Statement_part__Group__2 ;
    public final void rule__Statement_part__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2131:1: ( rule__Statement_part__Group__1__Impl rule__Statement_part__Group__2 )
            // InternalPascal.g:2132:2: rule__Statement_part__Group__1__Impl rule__Statement_part__Group__2
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
    // InternalPascal.g:2139:1: rule__Statement_part__Group__1__Impl : ( ( rule__Statement_part__SequenceAssignment_1 ) ) ;
    public final void rule__Statement_part__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2143:1: ( ( ( rule__Statement_part__SequenceAssignment_1 ) ) )
            // InternalPascal.g:2144:1: ( ( rule__Statement_part__SequenceAssignment_1 ) )
            {
            // InternalPascal.g:2144:1: ( ( rule__Statement_part__SequenceAssignment_1 ) )
            // InternalPascal.g:2145:2: ( rule__Statement_part__SequenceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatement_partAccess().getSequenceAssignment_1()); 
            }
            // InternalPascal.g:2146:2: ( rule__Statement_part__SequenceAssignment_1 )
            // InternalPascal.g:2146:3: rule__Statement_part__SequenceAssignment_1
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
    // InternalPascal.g:2154:1: rule__Statement_part__Group__2 : rule__Statement_part__Group__2__Impl ;
    public final void rule__Statement_part__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2158:1: ( rule__Statement_part__Group__2__Impl )
            // InternalPascal.g:2159:2: rule__Statement_part__Group__2__Impl
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
    // InternalPascal.g:2165:1: rule__Statement_part__Group__2__Impl : ( 'end' ) ;
    public final void rule__Statement_part__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2169:1: ( ( 'end' ) )
            // InternalPascal.g:2170:1: ( 'end' )
            {
            // InternalPascal.g:2170:1: ( 'end' )
            // InternalPascal.g:2171:2: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatement_partAccess().getEndKeyword_2()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:2181:1: rule__Statement_sequence__Group__0 : rule__Statement_sequence__Group__0__Impl rule__Statement_sequence__Group__1 ;
    public final void rule__Statement_sequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2185:1: ( rule__Statement_sequence__Group__0__Impl rule__Statement_sequence__Group__1 )
            // InternalPascal.g:2186:2: rule__Statement_sequence__Group__0__Impl rule__Statement_sequence__Group__1
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
    // InternalPascal.g:2193:1: rule__Statement_sequence__Group__0__Impl : ( ( rule__Statement_sequence__StatementsAssignment_0 ) ) ;
    public final void rule__Statement_sequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2197:1: ( ( ( rule__Statement_sequence__StatementsAssignment_0 ) ) )
            // InternalPascal.g:2198:1: ( ( rule__Statement_sequence__StatementsAssignment_0 ) )
            {
            // InternalPascal.g:2198:1: ( ( rule__Statement_sequence__StatementsAssignment_0 ) )
            // InternalPascal.g:2199:2: ( rule__Statement_sequence__StatementsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatement_sequenceAccess().getStatementsAssignment_0()); 
            }
            // InternalPascal.g:2200:2: ( rule__Statement_sequence__StatementsAssignment_0 )
            // InternalPascal.g:2200:3: rule__Statement_sequence__StatementsAssignment_0
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
    // InternalPascal.g:2208:1: rule__Statement_sequence__Group__1 : rule__Statement_sequence__Group__1__Impl ;
    public final void rule__Statement_sequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2212:1: ( rule__Statement_sequence__Group__1__Impl )
            // InternalPascal.g:2213:2: rule__Statement_sequence__Group__1__Impl
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
    // InternalPascal.g:2219:1: rule__Statement_sequence__Group__1__Impl : ( ( rule__Statement_sequence__Group_1__0 )* ) ;
    public final void rule__Statement_sequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2223:1: ( ( ( rule__Statement_sequence__Group_1__0 )* ) )
            // InternalPascal.g:2224:1: ( ( rule__Statement_sequence__Group_1__0 )* )
            {
            // InternalPascal.g:2224:1: ( ( rule__Statement_sequence__Group_1__0 )* )
            // InternalPascal.g:2225:2: ( rule__Statement_sequence__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatement_sequenceAccess().getGroup_1()); 
            }
            // InternalPascal.g:2226:2: ( rule__Statement_sequence__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==21) ) {
                    int LA25_2 = input.LA(2);

                    if ( (synpred39_InternalPascal()) ) {
                        alt25=1;
                    }


                }


                switch (alt25) {
            	case 1 :
            	    // InternalPascal.g:2226:3: rule__Statement_sequence__Group_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Statement_sequence__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalPascal.g:2235:1: rule__Statement_sequence__Group_1__0 : rule__Statement_sequence__Group_1__0__Impl rule__Statement_sequence__Group_1__1 ;
    public final void rule__Statement_sequence__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2239:1: ( rule__Statement_sequence__Group_1__0__Impl rule__Statement_sequence__Group_1__1 )
            // InternalPascal.g:2240:2: rule__Statement_sequence__Group_1__0__Impl rule__Statement_sequence__Group_1__1
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
    // InternalPascal.g:2247:1: rule__Statement_sequence__Group_1__0__Impl : ( ';' ) ;
    public final void rule__Statement_sequence__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2251:1: ( ( ';' ) )
            // InternalPascal.g:2252:1: ( ';' )
            {
            // InternalPascal.g:2252:1: ( ';' )
            // InternalPascal.g:2253:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatement_sequenceAccess().getSemicolonKeyword_1_0()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:2262:1: rule__Statement_sequence__Group_1__1 : rule__Statement_sequence__Group_1__1__Impl ;
    public final void rule__Statement_sequence__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2266:1: ( rule__Statement_sequence__Group_1__1__Impl )
            // InternalPascal.g:2267:2: rule__Statement_sequence__Group_1__1__Impl
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
    // InternalPascal.g:2273:1: rule__Statement_sequence__Group_1__1__Impl : ( ( rule__Statement_sequence__StatementsAssignment_1_1 ) ) ;
    public final void rule__Statement_sequence__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2277:1: ( ( ( rule__Statement_sequence__StatementsAssignment_1_1 ) ) )
            // InternalPascal.g:2278:1: ( ( rule__Statement_sequence__StatementsAssignment_1_1 ) )
            {
            // InternalPascal.g:2278:1: ( ( rule__Statement_sequence__StatementsAssignment_1_1 ) )
            // InternalPascal.g:2279:2: ( rule__Statement_sequence__StatementsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatement_sequenceAccess().getStatementsAssignment_1_1()); 
            }
            // InternalPascal.g:2280:2: ( rule__Statement_sequence__StatementsAssignment_1_1 )
            // InternalPascal.g:2280:3: rule__Statement_sequence__StatementsAssignment_1_1
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
    // InternalPascal.g:2289:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2293:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // InternalPascal.g:2294:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
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
    // InternalPascal.g:2301:1: rule__Statement__Group__0__Impl : ( ( rule__Statement__Group_0__0 )? ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2305:1: ( ( ( rule__Statement__Group_0__0 )? ) )
            // InternalPascal.g:2306:1: ( ( rule__Statement__Group_0__0 )? )
            {
            // InternalPascal.g:2306:1: ( ( rule__Statement__Group_0__0 )? )
            // InternalPascal.g:2307:2: ( rule__Statement__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getGroup_0()); 
            }
            // InternalPascal.g:2308:2: ( rule__Statement__Group_0__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=RULE_SIGNED_INTEGER_NUMBER && LA26_0<=RULE_INTEGER_NUMBER)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalPascal.g:2308:3: rule__Statement__Group_0__0
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
    // InternalPascal.g:2316:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2320:1: ( rule__Statement__Group__1__Impl )
            // InternalPascal.g:2321:2: rule__Statement__Group__1__Impl
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
    // InternalPascal.g:2327:1: rule__Statement__Group__1__Impl : ( ( rule__Statement__Alternatives_1 ) ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2331:1: ( ( ( rule__Statement__Alternatives_1 ) ) )
            // InternalPascal.g:2332:1: ( ( rule__Statement__Alternatives_1 ) )
            {
            // InternalPascal.g:2332:1: ( ( rule__Statement__Alternatives_1 ) )
            // InternalPascal.g:2333:2: ( rule__Statement__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getAlternatives_1()); 
            }
            // InternalPascal.g:2334:2: ( rule__Statement__Alternatives_1 )
            // InternalPascal.g:2334:3: rule__Statement__Alternatives_1
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
    // InternalPascal.g:2343:1: rule__Statement__Group_0__0 : rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 ;
    public final void rule__Statement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2347:1: ( rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 )
            // InternalPascal.g:2348:2: rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1
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
    // InternalPascal.g:2355:1: rule__Statement__Group_0__0__Impl : ( ( rule__Statement__LabelAssignment_0_0 ) ) ;
    public final void rule__Statement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2359:1: ( ( ( rule__Statement__LabelAssignment_0_0 ) ) )
            // InternalPascal.g:2360:1: ( ( rule__Statement__LabelAssignment_0_0 ) )
            {
            // InternalPascal.g:2360:1: ( ( rule__Statement__LabelAssignment_0_0 ) )
            // InternalPascal.g:2361:2: ( rule__Statement__LabelAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getLabelAssignment_0_0()); 
            }
            // InternalPascal.g:2362:2: ( rule__Statement__LabelAssignment_0_0 )
            // InternalPascal.g:2362:3: rule__Statement__LabelAssignment_0_0
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
    // InternalPascal.g:2370:1: rule__Statement__Group_0__1 : rule__Statement__Group_0__1__Impl ;
    public final void rule__Statement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2374:1: ( rule__Statement__Group_0__1__Impl )
            // InternalPascal.g:2375:2: rule__Statement__Group_0__1__Impl
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
    // InternalPascal.g:2381:1: rule__Statement__Group_0__1__Impl : ( ':' ) ;
    public final void rule__Statement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2385:1: ( ( ':' ) )
            // InternalPascal.g:2386:1: ( ':' )
            {
            // InternalPascal.g:2386:1: ( ':' )
            // InternalPascal.g:2387:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getColonKeyword_0_1()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:2397:1: rule__Compound_statement__Group__0 : rule__Compound_statement__Group__0__Impl rule__Compound_statement__Group__1 ;
    public final void rule__Compound_statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2401:1: ( rule__Compound_statement__Group__0__Impl rule__Compound_statement__Group__1 )
            // InternalPascal.g:2402:2: rule__Compound_statement__Group__0__Impl rule__Compound_statement__Group__1
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
    // InternalPascal.g:2409:1: rule__Compound_statement__Group__0__Impl : ( 'begin' ) ;
    public final void rule__Compound_statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2413:1: ( ( 'begin' ) )
            // InternalPascal.g:2414:1: ( 'begin' )
            {
            // InternalPascal.g:2414:1: ( 'begin' )
            // InternalPascal.g:2415:2: 'begin'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompound_statementAccess().getBeginKeyword_0()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:2424:1: rule__Compound_statement__Group__1 : rule__Compound_statement__Group__1__Impl rule__Compound_statement__Group__2 ;
    public final void rule__Compound_statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2428:1: ( rule__Compound_statement__Group__1__Impl rule__Compound_statement__Group__2 )
            // InternalPascal.g:2429:2: rule__Compound_statement__Group__1__Impl rule__Compound_statement__Group__2
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
    // InternalPascal.g:2436:1: rule__Compound_statement__Group__1__Impl : ( ( rule__Compound_statement__SequenceAssignment_1 ) ) ;
    public final void rule__Compound_statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2440:1: ( ( ( rule__Compound_statement__SequenceAssignment_1 ) ) )
            // InternalPascal.g:2441:1: ( ( rule__Compound_statement__SequenceAssignment_1 ) )
            {
            // InternalPascal.g:2441:1: ( ( rule__Compound_statement__SequenceAssignment_1 ) )
            // InternalPascal.g:2442:2: ( rule__Compound_statement__SequenceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompound_statementAccess().getSequenceAssignment_1()); 
            }
            // InternalPascal.g:2443:2: ( rule__Compound_statement__SequenceAssignment_1 )
            // InternalPascal.g:2443:3: rule__Compound_statement__SequenceAssignment_1
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
    // InternalPascal.g:2451:1: rule__Compound_statement__Group__2 : rule__Compound_statement__Group__2__Impl ;
    public final void rule__Compound_statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2455:1: ( rule__Compound_statement__Group__2__Impl )
            // InternalPascal.g:2456:2: rule__Compound_statement__Group__2__Impl
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
    // InternalPascal.g:2462:1: rule__Compound_statement__Group__2__Impl : ( 'end' ) ;
    public final void rule__Compound_statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2466:1: ( ( 'end' ) )
            // InternalPascal.g:2467:1: ( 'end' )
            {
            // InternalPascal.g:2467:1: ( 'end' )
            // InternalPascal.g:2468:2: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompound_statementAccess().getEndKeyword_2()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:2478:1: rule__Assignment_statement__Group__0 : rule__Assignment_statement__Group__0__Impl rule__Assignment_statement__Group__1 ;
    public final void rule__Assignment_statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2482:1: ( rule__Assignment_statement__Group__0__Impl rule__Assignment_statement__Group__1 )
            // InternalPascal.g:2483:2: rule__Assignment_statement__Group__0__Impl rule__Assignment_statement__Group__1
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
    // InternalPascal.g:2490:1: rule__Assignment_statement__Group__0__Impl : ( ( rule__Assignment_statement__VariableAssignment_0 ) ) ;
    public final void rule__Assignment_statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2494:1: ( ( ( rule__Assignment_statement__VariableAssignment_0 ) ) )
            // InternalPascal.g:2495:1: ( ( rule__Assignment_statement__VariableAssignment_0 ) )
            {
            // InternalPascal.g:2495:1: ( ( rule__Assignment_statement__VariableAssignment_0 ) )
            // InternalPascal.g:2496:2: ( rule__Assignment_statement__VariableAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignment_statementAccess().getVariableAssignment_0()); 
            }
            // InternalPascal.g:2497:2: ( rule__Assignment_statement__VariableAssignment_0 )
            // InternalPascal.g:2497:3: rule__Assignment_statement__VariableAssignment_0
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
    // InternalPascal.g:2505:1: rule__Assignment_statement__Group__1 : rule__Assignment_statement__Group__1__Impl rule__Assignment_statement__Group__2 ;
    public final void rule__Assignment_statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2509:1: ( rule__Assignment_statement__Group__1__Impl rule__Assignment_statement__Group__2 )
            // InternalPascal.g:2510:2: rule__Assignment_statement__Group__1__Impl rule__Assignment_statement__Group__2
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
    // InternalPascal.g:2517:1: rule__Assignment_statement__Group__1__Impl : ( ':=' ) ;
    public final void rule__Assignment_statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2521:1: ( ( ':=' ) )
            // InternalPascal.g:2522:1: ( ':=' )
            {
            // InternalPascal.g:2522:1: ( ':=' )
            // InternalPascal.g:2523:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignment_statementAccess().getColonEqualsSignKeyword_1()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:2532:1: rule__Assignment_statement__Group__2 : rule__Assignment_statement__Group__2__Impl ;
    public final void rule__Assignment_statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2536:1: ( rule__Assignment_statement__Group__2__Impl )
            // InternalPascal.g:2537:2: rule__Assignment_statement__Group__2__Impl
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
    // InternalPascal.g:2543:1: rule__Assignment_statement__Group__2__Impl : ( ( rule__Assignment_statement__ExpressionAssignment_2 ) ) ;
    public final void rule__Assignment_statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2547:1: ( ( ( rule__Assignment_statement__ExpressionAssignment_2 ) ) )
            // InternalPascal.g:2548:1: ( ( rule__Assignment_statement__ExpressionAssignment_2 ) )
            {
            // InternalPascal.g:2548:1: ( ( rule__Assignment_statement__ExpressionAssignment_2 ) )
            // InternalPascal.g:2549:2: ( rule__Assignment_statement__ExpressionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignment_statementAccess().getExpressionAssignment_2()); 
            }
            // InternalPascal.g:2550:2: ( rule__Assignment_statement__ExpressionAssignment_2 )
            // InternalPascal.g:2550:3: rule__Assignment_statement__ExpressionAssignment_2
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


    // $ANTLR start "rule__Expression_list__Group__0"
    // InternalPascal.g:2559:1: rule__Expression_list__Group__0 : rule__Expression_list__Group__0__Impl rule__Expression_list__Group__1 ;
    public final void rule__Expression_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2563:1: ( rule__Expression_list__Group__0__Impl rule__Expression_list__Group__1 )
            // InternalPascal.g:2564:2: rule__Expression_list__Group__0__Impl rule__Expression_list__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalPascal.g:2571:1: rule__Expression_list__Group__0__Impl : ( ( rule__Expression_list__ExpressionsAssignment_0 ) ) ;
    public final void rule__Expression_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2575:1: ( ( ( rule__Expression_list__ExpressionsAssignment_0 ) ) )
            // InternalPascal.g:2576:1: ( ( rule__Expression_list__ExpressionsAssignment_0 ) )
            {
            // InternalPascal.g:2576:1: ( ( rule__Expression_list__ExpressionsAssignment_0 ) )
            // InternalPascal.g:2577:2: ( rule__Expression_list__ExpressionsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression_listAccess().getExpressionsAssignment_0()); 
            }
            // InternalPascal.g:2578:2: ( rule__Expression_list__ExpressionsAssignment_0 )
            // InternalPascal.g:2578:3: rule__Expression_list__ExpressionsAssignment_0
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
    // InternalPascal.g:2586:1: rule__Expression_list__Group__1 : rule__Expression_list__Group__1__Impl ;
    public final void rule__Expression_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2590:1: ( rule__Expression_list__Group__1__Impl )
            // InternalPascal.g:2591:2: rule__Expression_list__Group__1__Impl
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
    // InternalPascal.g:2597:1: rule__Expression_list__Group__1__Impl : ( ( rule__Expression_list__Group_1__0 )* ) ;
    public final void rule__Expression_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2601:1: ( ( ( rule__Expression_list__Group_1__0 )* ) )
            // InternalPascal.g:2602:1: ( ( rule__Expression_list__Group_1__0 )* )
            {
            // InternalPascal.g:2602:1: ( ( rule__Expression_list__Group_1__0 )* )
            // InternalPascal.g:2603:2: ( rule__Expression_list__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression_listAccess().getGroup_1()); 
            }
            // InternalPascal.g:2604:2: ( rule__Expression_list__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==26) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalPascal.g:2604:3: rule__Expression_list__Group_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Expression_list__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalPascal.g:2613:1: rule__Expression_list__Group_1__0 : rule__Expression_list__Group_1__0__Impl rule__Expression_list__Group_1__1 ;
    public final void rule__Expression_list__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2617:1: ( rule__Expression_list__Group_1__0__Impl rule__Expression_list__Group_1__1 )
            // InternalPascal.g:2618:2: rule__Expression_list__Group_1__0__Impl rule__Expression_list__Group_1__1
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
    // InternalPascal.g:2625:1: rule__Expression_list__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Expression_list__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2629:1: ( ( ',' ) )
            // InternalPascal.g:2630:1: ( ',' )
            {
            // InternalPascal.g:2630:1: ( ',' )
            // InternalPascal.g:2631:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression_listAccess().getCommaKeyword_1_0()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:2640:1: rule__Expression_list__Group_1__1 : rule__Expression_list__Group_1__1__Impl ;
    public final void rule__Expression_list__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2644:1: ( rule__Expression_list__Group_1__1__Impl )
            // InternalPascal.g:2645:2: rule__Expression_list__Group_1__1__Impl
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
    // InternalPascal.g:2651:1: rule__Expression_list__Group_1__1__Impl : ( ( rule__Expression_list__ExpressionsAssignment_1_1 ) ) ;
    public final void rule__Expression_list__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2655:1: ( ( ( rule__Expression_list__ExpressionsAssignment_1_1 ) ) )
            // InternalPascal.g:2656:1: ( ( rule__Expression_list__ExpressionsAssignment_1_1 ) )
            {
            // InternalPascal.g:2656:1: ( ( rule__Expression_list__ExpressionsAssignment_1_1 ) )
            // InternalPascal.g:2657:2: ( rule__Expression_list__ExpressionsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpression_listAccess().getExpressionsAssignment_1_1()); 
            }
            // InternalPascal.g:2658:2: ( rule__Expression_list__ExpressionsAssignment_1_1 )
            // InternalPascal.g:2658:3: rule__Expression_list__ExpressionsAssignment_1_1
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
    // InternalPascal.g:2667:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2671:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // InternalPascal.g:2672:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalPascal.g:2679:1: rule__Expression__Group__0__Impl : ( ( rule__Expression__ExpressionsAssignment_0 ) ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2683:1: ( ( ( rule__Expression__ExpressionsAssignment_0 ) ) )
            // InternalPascal.g:2684:1: ( ( rule__Expression__ExpressionsAssignment_0 ) )
            {
            // InternalPascal.g:2684:1: ( ( rule__Expression__ExpressionsAssignment_0 ) )
            // InternalPascal.g:2685:2: ( rule__Expression__ExpressionsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getExpressionsAssignment_0()); 
            }
            // InternalPascal.g:2686:2: ( rule__Expression__ExpressionsAssignment_0 )
            // InternalPascal.g:2686:3: rule__Expression__ExpressionsAssignment_0
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
    // InternalPascal.g:2694:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2698:1: ( rule__Expression__Group__1__Impl )
            // InternalPascal.g:2699:2: rule__Expression__Group__1__Impl
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
    // InternalPascal.g:2705:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )? ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2709:1: ( ( ( rule__Expression__Group_1__0 )? ) )
            // InternalPascal.g:2710:1: ( ( rule__Expression__Group_1__0 )? )
            {
            // InternalPascal.g:2710:1: ( ( rule__Expression__Group_1__0 )? )
            // InternalPascal.g:2711:2: ( rule__Expression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getGroup_1()); 
            }
            // InternalPascal.g:2712:2: ( rule__Expression__Group_1__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_RELATIONAL_OP||LA28_0==35||LA28_0==39) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalPascal.g:2712:3: rule__Expression__Group_1__0
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
    // InternalPascal.g:2721:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2725:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // InternalPascal.g:2726:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
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
    // InternalPascal.g:2733:1: rule__Expression__Group_1__0__Impl : ( ( rule__Expression__Alternatives_1_0 ) ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2737:1: ( ( ( rule__Expression__Alternatives_1_0 ) ) )
            // InternalPascal.g:2738:1: ( ( rule__Expression__Alternatives_1_0 ) )
            {
            // InternalPascal.g:2738:1: ( ( rule__Expression__Alternatives_1_0 ) )
            // InternalPascal.g:2739:2: ( rule__Expression__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getAlternatives_1_0()); 
            }
            // InternalPascal.g:2740:2: ( rule__Expression__Alternatives_1_0 )
            // InternalPascal.g:2740:3: rule__Expression__Alternatives_1_0
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
    // InternalPascal.g:2748:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2752:1: ( rule__Expression__Group_1__1__Impl )
            // InternalPascal.g:2753:2: rule__Expression__Group_1__1__Impl
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
    // InternalPascal.g:2759:1: rule__Expression__Group_1__1__Impl : ( ( rule__Expression__ExpressionsAssignment_1_1 ) ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2763:1: ( ( ( rule__Expression__ExpressionsAssignment_1_1 ) ) )
            // InternalPascal.g:2764:1: ( ( rule__Expression__ExpressionsAssignment_1_1 ) )
            {
            // InternalPascal.g:2764:1: ( ( rule__Expression__ExpressionsAssignment_1_1 ) )
            // InternalPascal.g:2765:2: ( rule__Expression__ExpressionsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getExpressionsAssignment_1_1()); 
            }
            // InternalPascal.g:2766:2: ( rule__Expression__ExpressionsAssignment_1_1 )
            // InternalPascal.g:2766:3: rule__Expression__ExpressionsAssignment_1_1
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
    // InternalPascal.g:2775:1: rule__Simple_expression__Group__0 : rule__Simple_expression__Group__0__Impl rule__Simple_expression__Group__1 ;
    public final void rule__Simple_expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2779:1: ( rule__Simple_expression__Group__0__Impl rule__Simple_expression__Group__1 )
            // InternalPascal.g:2780:2: rule__Simple_expression__Group__0__Impl rule__Simple_expression__Group__1
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
    // InternalPascal.g:2787:1: rule__Simple_expression__Group__0__Impl : ( ( rule__Simple_expression__PrefixOperatorAssignment_0 )? ) ;
    public final void rule__Simple_expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2791:1: ( ( ( rule__Simple_expression__PrefixOperatorAssignment_0 )? ) )
            // InternalPascal.g:2792:1: ( ( rule__Simple_expression__PrefixOperatorAssignment_0 )? )
            {
            // InternalPascal.g:2792:1: ( ( rule__Simple_expression__PrefixOperatorAssignment_0 )? )
            // InternalPascal.g:2793:2: ( rule__Simple_expression__PrefixOperatorAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimple_expressionAccess().getPrefixOperatorAssignment_0()); 
            }
            // InternalPascal.g:2794:2: ( rule__Simple_expression__PrefixOperatorAssignment_0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ADDITION_OP) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalPascal.g:2794:3: rule__Simple_expression__PrefixOperatorAssignment_0
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
    // InternalPascal.g:2802:1: rule__Simple_expression__Group__1 : rule__Simple_expression__Group__1__Impl rule__Simple_expression__Group__2 ;
    public final void rule__Simple_expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2806:1: ( rule__Simple_expression__Group__1__Impl rule__Simple_expression__Group__2 )
            // InternalPascal.g:2807:2: rule__Simple_expression__Group__1__Impl rule__Simple_expression__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalPascal.g:2814:1: rule__Simple_expression__Group__1__Impl : ( ( rule__Simple_expression__TermsAssignment_1 ) ) ;
    public final void rule__Simple_expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2818:1: ( ( ( rule__Simple_expression__TermsAssignment_1 ) ) )
            // InternalPascal.g:2819:1: ( ( rule__Simple_expression__TermsAssignment_1 ) )
            {
            // InternalPascal.g:2819:1: ( ( rule__Simple_expression__TermsAssignment_1 ) )
            // InternalPascal.g:2820:2: ( rule__Simple_expression__TermsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimple_expressionAccess().getTermsAssignment_1()); 
            }
            // InternalPascal.g:2821:2: ( rule__Simple_expression__TermsAssignment_1 )
            // InternalPascal.g:2821:3: rule__Simple_expression__TermsAssignment_1
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
    // InternalPascal.g:2829:1: rule__Simple_expression__Group__2 : rule__Simple_expression__Group__2__Impl ;
    public final void rule__Simple_expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2833:1: ( rule__Simple_expression__Group__2__Impl )
            // InternalPascal.g:2834:2: rule__Simple_expression__Group__2__Impl
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
    // InternalPascal.g:2840:1: rule__Simple_expression__Group__2__Impl : ( ( rule__Simple_expression__Alternatives_2 )* ) ;
    public final void rule__Simple_expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2844:1: ( ( ( rule__Simple_expression__Alternatives_2 )* ) )
            // InternalPascal.g:2845:1: ( ( rule__Simple_expression__Alternatives_2 )* )
            {
            // InternalPascal.g:2845:1: ( ( rule__Simple_expression__Alternatives_2 )* )
            // InternalPascal.g:2846:2: ( rule__Simple_expression__Alternatives_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimple_expressionAccess().getAlternatives_2()); 
            }
            // InternalPascal.g:2847:2: ( rule__Simple_expression__Alternatives_2 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_INTEGER_NUMBER||LA30_0==RULE_ADDITION_OP||LA30_0==RULE_REAL_NUMBER||LA30_0==40) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalPascal.g:2847:3: rule__Simple_expression__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Simple_expression__Alternatives_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalPascal.g:2856:1: rule__Simple_expression__Group_2_0__0 : rule__Simple_expression__Group_2_0__0__Impl rule__Simple_expression__Group_2_0__1 ;
    public final void rule__Simple_expression__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2860:1: ( rule__Simple_expression__Group_2_0__0__Impl rule__Simple_expression__Group_2_0__1 )
            // InternalPascal.g:2861:2: rule__Simple_expression__Group_2_0__0__Impl rule__Simple_expression__Group_2_0__1
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
    // InternalPascal.g:2868:1: rule__Simple_expression__Group_2_0__0__Impl : ( ( rule__Simple_expression__Alternatives_2_0_0 ) ) ;
    public final void rule__Simple_expression__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2872:1: ( ( ( rule__Simple_expression__Alternatives_2_0_0 ) ) )
            // InternalPascal.g:2873:1: ( ( rule__Simple_expression__Alternatives_2_0_0 ) )
            {
            // InternalPascal.g:2873:1: ( ( rule__Simple_expression__Alternatives_2_0_0 ) )
            // InternalPascal.g:2874:2: ( rule__Simple_expression__Alternatives_2_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimple_expressionAccess().getAlternatives_2_0_0()); 
            }
            // InternalPascal.g:2875:2: ( rule__Simple_expression__Alternatives_2_0_0 )
            // InternalPascal.g:2875:3: rule__Simple_expression__Alternatives_2_0_0
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
    // InternalPascal.g:2883:1: rule__Simple_expression__Group_2_0__1 : rule__Simple_expression__Group_2_0__1__Impl ;
    public final void rule__Simple_expression__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2887:1: ( rule__Simple_expression__Group_2_0__1__Impl )
            // InternalPascal.g:2888:2: rule__Simple_expression__Group_2_0__1__Impl
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
    // InternalPascal.g:2894:1: rule__Simple_expression__Group_2_0__1__Impl : ( ( rule__Simple_expression__TermsAssignment_2_0_1 ) ) ;
    public final void rule__Simple_expression__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2898:1: ( ( ( rule__Simple_expression__TermsAssignment_2_0_1 ) ) )
            // InternalPascal.g:2899:1: ( ( rule__Simple_expression__TermsAssignment_2_0_1 ) )
            {
            // InternalPascal.g:2899:1: ( ( rule__Simple_expression__TermsAssignment_2_0_1 ) )
            // InternalPascal.g:2900:2: ( rule__Simple_expression__TermsAssignment_2_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimple_expressionAccess().getTermsAssignment_2_0_1()); 
            }
            // InternalPascal.g:2901:2: ( rule__Simple_expression__TermsAssignment_2_0_1 )
            // InternalPascal.g:2901:3: rule__Simple_expression__TermsAssignment_2_0_1
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
    // InternalPascal.g:2910:1: rule__Term__Group__0 : rule__Term__Group__0__Impl rule__Term__Group__1 ;
    public final void rule__Term__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2914:1: ( rule__Term__Group__0__Impl rule__Term__Group__1 )
            // InternalPascal.g:2915:2: rule__Term__Group__0__Impl rule__Term__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalPascal.g:2922:1: rule__Term__Group__0__Impl : ( ( rule__Term__FactorsAssignment_0 ) ) ;
    public final void rule__Term__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2926:1: ( ( ( rule__Term__FactorsAssignment_0 ) ) )
            // InternalPascal.g:2927:1: ( ( rule__Term__FactorsAssignment_0 ) )
            {
            // InternalPascal.g:2927:1: ( ( rule__Term__FactorsAssignment_0 ) )
            // InternalPascal.g:2928:2: ( rule__Term__FactorsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getFactorsAssignment_0()); 
            }
            // InternalPascal.g:2929:2: ( rule__Term__FactorsAssignment_0 )
            // InternalPascal.g:2929:3: rule__Term__FactorsAssignment_0
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
    // InternalPascal.g:2937:1: rule__Term__Group__1 : rule__Term__Group__1__Impl ;
    public final void rule__Term__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2941:1: ( rule__Term__Group__1__Impl )
            // InternalPascal.g:2942:2: rule__Term__Group__1__Impl
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
    // InternalPascal.g:2948:1: rule__Term__Group__1__Impl : ( ( rule__Term__Group_1__0 )* ) ;
    public final void rule__Term__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2952:1: ( ( ( rule__Term__Group_1__0 )* ) )
            // InternalPascal.g:2953:1: ( ( rule__Term__Group_1__0 )* )
            {
            // InternalPascal.g:2953:1: ( ( rule__Term__Group_1__0 )* )
            // InternalPascal.g:2954:2: ( rule__Term__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getGroup_1()); 
            }
            // InternalPascal.g:2955:2: ( rule__Term__Group_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_MULTIPLICATION_OP||LA31_0==41) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalPascal.g:2955:3: rule__Term__Group_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Term__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalPascal.g:2964:1: rule__Term__Group_1__0 : rule__Term__Group_1__0__Impl rule__Term__Group_1__1 ;
    public final void rule__Term__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2968:1: ( rule__Term__Group_1__0__Impl rule__Term__Group_1__1 )
            // InternalPascal.g:2969:2: rule__Term__Group_1__0__Impl rule__Term__Group_1__1
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
    // InternalPascal.g:2976:1: rule__Term__Group_1__0__Impl : ( ( rule__Term__Alternatives_1_0 ) ) ;
    public final void rule__Term__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2980:1: ( ( ( rule__Term__Alternatives_1_0 ) ) )
            // InternalPascal.g:2981:1: ( ( rule__Term__Alternatives_1_0 ) )
            {
            // InternalPascal.g:2981:1: ( ( rule__Term__Alternatives_1_0 ) )
            // InternalPascal.g:2982:2: ( rule__Term__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getAlternatives_1_0()); 
            }
            // InternalPascal.g:2983:2: ( rule__Term__Alternatives_1_0 )
            // InternalPascal.g:2983:3: rule__Term__Alternatives_1_0
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
    // InternalPascal.g:2991:1: rule__Term__Group_1__1 : rule__Term__Group_1__1__Impl ;
    public final void rule__Term__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2995:1: ( rule__Term__Group_1__1__Impl )
            // InternalPascal.g:2996:2: rule__Term__Group_1__1__Impl
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
    // InternalPascal.g:3002:1: rule__Term__Group_1__1__Impl : ( ( rule__Term__FactorsAssignment_1_1 ) ) ;
    public final void rule__Term__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3006:1: ( ( ( rule__Term__FactorsAssignment_1_1 ) ) )
            // InternalPascal.g:3007:1: ( ( rule__Term__FactorsAssignment_1_1 ) )
            {
            // InternalPascal.g:3007:1: ( ( rule__Term__FactorsAssignment_1_1 ) )
            // InternalPascal.g:3008:2: ( rule__Term__FactorsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getFactorsAssignment_1_1()); 
            }
            // InternalPascal.g:3009:2: ( rule__Term__FactorsAssignment_1_1 )
            // InternalPascal.g:3009:3: rule__Term__FactorsAssignment_1_1
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


    // $ANTLR start "rule__Factor__Group_6__0"
    // InternalPascal.g:3018:1: rule__Factor__Group_6__0 : rule__Factor__Group_6__0__Impl rule__Factor__Group_6__1 ;
    public final void rule__Factor__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3022:1: ( rule__Factor__Group_6__0__Impl rule__Factor__Group_6__1 )
            // InternalPascal.g:3023:2: rule__Factor__Group_6__0__Impl rule__Factor__Group_6__1
            {
            pushFollow(FOLLOW_13);
            rule__Factor__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Factor__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_6__0"


    // $ANTLR start "rule__Factor__Group_6__0__Impl"
    // InternalPascal.g:3030:1: rule__Factor__Group_6__0__Impl : ( '(' ) ;
    public final void rule__Factor__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3034:1: ( ( '(' ) )
            // InternalPascal.g:3035:1: ( '(' )
            {
            // InternalPascal.g:3035:1: ( '(' )
            // InternalPascal.g:3036:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getLeftParenthesisKeyword_6_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorAccess().getLeftParenthesisKeyword_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_6__0__Impl"


    // $ANTLR start "rule__Factor__Group_6__1"
    // InternalPascal.g:3045:1: rule__Factor__Group_6__1 : rule__Factor__Group_6__1__Impl rule__Factor__Group_6__2 ;
    public final void rule__Factor__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3049:1: ( rule__Factor__Group_6__1__Impl rule__Factor__Group_6__2 )
            // InternalPascal.g:3050:2: rule__Factor__Group_6__1__Impl rule__Factor__Group_6__2
            {
            pushFollow(FOLLOW_21);
            rule__Factor__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Factor__Group_6__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_6__1"


    // $ANTLR start "rule__Factor__Group_6__1__Impl"
    // InternalPascal.g:3057:1: rule__Factor__Group_6__1__Impl : ( ( rule__Factor__ExpressionAssignment_6_1 ) ) ;
    public final void rule__Factor__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3061:1: ( ( ( rule__Factor__ExpressionAssignment_6_1 ) ) )
            // InternalPascal.g:3062:1: ( ( rule__Factor__ExpressionAssignment_6_1 ) )
            {
            // InternalPascal.g:3062:1: ( ( rule__Factor__ExpressionAssignment_6_1 ) )
            // InternalPascal.g:3063:2: ( rule__Factor__ExpressionAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getExpressionAssignment_6_1()); 
            }
            // InternalPascal.g:3064:2: ( rule__Factor__ExpressionAssignment_6_1 )
            // InternalPascal.g:3064:3: rule__Factor__ExpressionAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Factor__ExpressionAssignment_6_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorAccess().getExpressionAssignment_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_6__1__Impl"


    // $ANTLR start "rule__Factor__Group_6__2"
    // InternalPascal.g:3072:1: rule__Factor__Group_6__2 : rule__Factor__Group_6__2__Impl ;
    public final void rule__Factor__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3076:1: ( rule__Factor__Group_6__2__Impl )
            // InternalPascal.g:3077:2: rule__Factor__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Group_6__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_6__2"


    // $ANTLR start "rule__Factor__Group_6__2__Impl"
    // InternalPascal.g:3083:1: rule__Factor__Group_6__2__Impl : ( ')' ) ;
    public final void rule__Factor__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3087:1: ( ( ')' ) )
            // InternalPascal.g:3088:1: ( ')' )
            {
            // InternalPascal.g:3088:1: ( ')' )
            // InternalPascal.g:3089:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getRightParenthesisKeyword_6_2()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorAccess().getRightParenthesisKeyword_6_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_6__2__Impl"


    // $ANTLR start "rule__Factor__Group_7__0"
    // InternalPascal.g:3099:1: rule__Factor__Group_7__0 : rule__Factor__Group_7__0__Impl rule__Factor__Group_7__1 ;
    public final void rule__Factor__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3103:1: ( rule__Factor__Group_7__0__Impl rule__Factor__Group_7__1 )
            // InternalPascal.g:3104:2: rule__Factor__Group_7__0__Impl rule__Factor__Group_7__1
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
    // InternalPascal.g:3111:1: rule__Factor__Group_7__0__Impl : ( 'not' ) ;
    public final void rule__Factor__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3115:1: ( ( 'not' ) )
            // InternalPascal.g:3116:1: ( 'not' )
            {
            // InternalPascal.g:3116:1: ( 'not' )
            // InternalPascal.g:3117:2: 'not'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getNotKeyword_7_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorAccess().getNotKeyword_7_0()); 
            }

            }


            }

        }
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
    // InternalPascal.g:3126:1: rule__Factor__Group_7__1 : rule__Factor__Group_7__1__Impl ;
    public final void rule__Factor__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3130:1: ( rule__Factor__Group_7__1__Impl )
            // InternalPascal.g:3131:2: rule__Factor__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Group_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPascal.g:3137:1: rule__Factor__Group_7__1__Impl : ( ( rule__Factor__NotAssignment_7_1 ) ) ;
    public final void rule__Factor__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3141:1: ( ( ( rule__Factor__NotAssignment_7_1 ) ) )
            // InternalPascal.g:3142:1: ( ( rule__Factor__NotAssignment_7_1 ) )
            {
            // InternalPascal.g:3142:1: ( ( rule__Factor__NotAssignment_7_1 ) )
            // InternalPascal.g:3143:2: ( rule__Factor__NotAssignment_7_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getNotAssignment_7_1()); 
            }
            // InternalPascal.g:3144:2: ( rule__Factor__NotAssignment_7_1 )
            // InternalPascal.g:3144:3: rule__Factor__NotAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Factor__NotAssignment_7_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorAccess().getNotAssignment_7_1()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Function_designator__Group__0"
    // InternalPascal.g:3153:1: rule__Function_designator__Group__0 : rule__Function_designator__Group__0__Impl rule__Function_designator__Group__1 ;
    public final void rule__Function_designator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3157:1: ( rule__Function_designator__Group__0__Impl rule__Function_designator__Group__1 )
            // InternalPascal.g:3158:2: rule__Function_designator__Group__0__Impl rule__Function_designator__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalPascal.g:3165:1: rule__Function_designator__Group__0__Impl : ( ( rule__Function_designator__NameAssignment_0 ) ) ;
    public final void rule__Function_designator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3169:1: ( ( ( rule__Function_designator__NameAssignment_0 ) ) )
            // InternalPascal.g:3170:1: ( ( rule__Function_designator__NameAssignment_0 ) )
            {
            // InternalPascal.g:3170:1: ( ( rule__Function_designator__NameAssignment_0 ) )
            // InternalPascal.g:3171:2: ( rule__Function_designator__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_designatorAccess().getNameAssignment_0()); 
            }
            // InternalPascal.g:3172:2: ( rule__Function_designator__NameAssignment_0 )
            // InternalPascal.g:3172:3: rule__Function_designator__NameAssignment_0
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
    // InternalPascal.g:3180:1: rule__Function_designator__Group__1 : rule__Function_designator__Group__1__Impl rule__Function_designator__Group__2 ;
    public final void rule__Function_designator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3184:1: ( rule__Function_designator__Group__1__Impl rule__Function_designator__Group__2 )
            // InternalPascal.g:3185:2: rule__Function_designator__Group__1__Impl rule__Function_designator__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalPascal.g:3192:1: rule__Function_designator__Group__1__Impl : ( '(' ) ;
    public final void rule__Function_designator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3196:1: ( ( '(' ) )
            // InternalPascal.g:3197:1: ( '(' )
            {
            // InternalPascal.g:3197:1: ( '(' )
            // InternalPascal.g:3198:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_designatorAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:3207:1: rule__Function_designator__Group__2 : rule__Function_designator__Group__2__Impl rule__Function_designator__Group__3 ;
    public final void rule__Function_designator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3211:1: ( rule__Function_designator__Group__2__Impl rule__Function_designator__Group__3 )
            // InternalPascal.g:3212:2: rule__Function_designator__Group__2__Impl rule__Function_designator__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalPascal.g:3219:1: rule__Function_designator__Group__2__Impl : ( ( rule__Function_designator__ExpressionsAssignment_2 )? ) ;
    public final void rule__Function_designator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3223:1: ( ( ( rule__Function_designator__ExpressionsAssignment_2 )? ) )
            // InternalPascal.g:3224:1: ( ( rule__Function_designator__ExpressionsAssignment_2 )? )
            {
            // InternalPascal.g:3224:1: ( ( rule__Function_designator__ExpressionsAssignment_2 )? )
            // InternalPascal.g:3225:2: ( rule__Function_designator__ExpressionsAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_designatorAccess().getExpressionsAssignment_2()); 
            }
            // InternalPascal.g:3226:2: ( rule__Function_designator__ExpressionsAssignment_2 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=RULE_ID && LA32_0<=RULE_INTEGER_NUMBER)||LA32_0==RULE_ADDITION_OP||(LA32_0>=RULE_STRING && LA32_0<=RULE_REAL_NUMBER)||LA32_0==27||LA32_0==29||(LA32_0>=42 && LA32_0<=44)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalPascal.g:3226:3: rule__Function_designator__ExpressionsAssignment_2
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
    // InternalPascal.g:3234:1: rule__Function_designator__Group__3 : rule__Function_designator__Group__3__Impl ;
    public final void rule__Function_designator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3238:1: ( rule__Function_designator__Group__3__Impl )
            // InternalPascal.g:3239:2: rule__Function_designator__Group__3__Impl
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
    // InternalPascal.g:3245:1: rule__Function_designator__Group__3__Impl : ( ')' ) ;
    public final void rule__Function_designator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3249:1: ( ( ')' ) )
            // InternalPascal.g:3250:1: ( ')' )
            {
            // InternalPascal.g:3250:1: ( ')' )
            // InternalPascal.g:3251:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_designatorAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:3261:1: rule__Function_procedure_declaration__Group__0 : rule__Function_procedure_declaration__Group__0__Impl rule__Function_procedure_declaration__Group__1 ;
    public final void rule__Function_procedure_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3265:1: ( rule__Function_procedure_declaration__Group__0__Impl rule__Function_procedure_declaration__Group__1 )
            // InternalPascal.g:3266:2: rule__Function_procedure_declaration__Group__0__Impl rule__Function_procedure_declaration__Group__1
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
    // InternalPascal.g:3273:1: rule__Function_procedure_declaration__Group__0__Impl : ( ( rule__Function_procedure_declaration__Alternatives_0 ) ) ;
    public final void rule__Function_procedure_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3277:1: ( ( ( rule__Function_procedure_declaration__Alternatives_0 ) ) )
            // InternalPascal.g:3278:1: ( ( rule__Function_procedure_declaration__Alternatives_0 ) )
            {
            // InternalPascal.g:3278:1: ( ( rule__Function_procedure_declaration__Alternatives_0 ) )
            // InternalPascal.g:3279:2: ( rule__Function_procedure_declaration__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_procedure_declarationAccess().getAlternatives_0()); 
            }
            // InternalPascal.g:3280:2: ( rule__Function_procedure_declaration__Alternatives_0 )
            // InternalPascal.g:3280:3: rule__Function_procedure_declaration__Alternatives_0
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
    // InternalPascal.g:3288:1: rule__Function_procedure_declaration__Group__1 : rule__Function_procedure_declaration__Group__1__Impl ;
    public final void rule__Function_procedure_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3292:1: ( rule__Function_procedure_declaration__Group__1__Impl )
            // InternalPascal.g:3293:2: rule__Function_procedure_declaration__Group__1__Impl
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
    // InternalPascal.g:3299:1: rule__Function_procedure_declaration__Group__1__Impl : ( ';' ) ;
    public final void rule__Function_procedure_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3303:1: ( ( ';' ) )
            // InternalPascal.g:3304:1: ( ';' )
            {
            // InternalPascal.g:3304:1: ( ';' )
            // InternalPascal.g:3305:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_procedure_declarationAccess().getSemicolonKeyword_1()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:3315:1: rule__Function_heading__Group__0 : rule__Function_heading__Group__0__Impl rule__Function_heading__Group__1 ;
    public final void rule__Function_heading__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3319:1: ( rule__Function_heading__Group__0__Impl rule__Function_heading__Group__1 )
            // InternalPascal.g:3320:2: rule__Function_heading__Group__0__Impl rule__Function_heading__Group__1
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
    // InternalPascal.g:3327:1: rule__Function_heading__Group__0__Impl : ( 'function' ) ;
    public final void rule__Function_heading__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3331:1: ( ( 'function' ) )
            // InternalPascal.g:3332:1: ( 'function' )
            {
            // InternalPascal.g:3332:1: ( 'function' )
            // InternalPascal.g:3333:2: 'function'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_headingAccess().getFunctionKeyword_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:3342:1: rule__Function_heading__Group__1 : rule__Function_heading__Group__1__Impl rule__Function_heading__Group__2 ;
    public final void rule__Function_heading__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3346:1: ( rule__Function_heading__Group__1__Impl rule__Function_heading__Group__2 )
            // InternalPascal.g:3347:2: rule__Function_heading__Group__1__Impl rule__Function_heading__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalPascal.g:3354:1: rule__Function_heading__Group__1__Impl : ( ( rule__Function_heading__NameAssignment_1 ) ) ;
    public final void rule__Function_heading__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3358:1: ( ( ( rule__Function_heading__NameAssignment_1 ) ) )
            // InternalPascal.g:3359:1: ( ( rule__Function_heading__NameAssignment_1 ) )
            {
            // InternalPascal.g:3359:1: ( ( rule__Function_heading__NameAssignment_1 ) )
            // InternalPascal.g:3360:2: ( rule__Function_heading__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_headingAccess().getNameAssignment_1()); 
            }
            // InternalPascal.g:3361:2: ( rule__Function_heading__NameAssignment_1 )
            // InternalPascal.g:3361:3: rule__Function_heading__NameAssignment_1
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
    // InternalPascal.g:3369:1: rule__Function_heading__Group__2 : rule__Function_heading__Group__2__Impl rule__Function_heading__Group__3 ;
    public final void rule__Function_heading__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3373:1: ( rule__Function_heading__Group__2__Impl rule__Function_heading__Group__3 )
            // InternalPascal.g:3374:2: rule__Function_heading__Group__2__Impl rule__Function_heading__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalPascal.g:3381:1: rule__Function_heading__Group__2__Impl : ( ( rule__Function_heading__ParametersAssignment_2 )? ) ;
    public final void rule__Function_heading__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3385:1: ( ( ( rule__Function_heading__ParametersAssignment_2 )? ) )
            // InternalPascal.g:3386:1: ( ( rule__Function_heading__ParametersAssignment_2 )? )
            {
            // InternalPascal.g:3386:1: ( ( rule__Function_heading__ParametersAssignment_2 )? )
            // InternalPascal.g:3387:2: ( rule__Function_heading__ParametersAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_headingAccess().getParametersAssignment_2()); 
            }
            // InternalPascal.g:3388:2: ( rule__Function_heading__ParametersAssignment_2 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==27) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalPascal.g:3388:3: rule__Function_heading__ParametersAssignment_2
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
    // InternalPascal.g:3396:1: rule__Function_heading__Group__3 : rule__Function_heading__Group__3__Impl rule__Function_heading__Group__4 ;
    public final void rule__Function_heading__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3400:1: ( rule__Function_heading__Group__3__Impl rule__Function_heading__Group__4 )
            // InternalPascal.g:3401:2: rule__Function_heading__Group__3__Impl rule__Function_heading__Group__4
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
    // InternalPascal.g:3408:1: rule__Function_heading__Group__3__Impl : ( ':' ) ;
    public final void rule__Function_heading__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3412:1: ( ( ':' ) )
            // InternalPascal.g:3413:1: ( ':' )
            {
            // InternalPascal.g:3413:1: ( ':' )
            // InternalPascal.g:3414:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_headingAccess().getColonKeyword_3()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:3423:1: rule__Function_heading__Group__4 : rule__Function_heading__Group__4__Impl ;
    public final void rule__Function_heading__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3427:1: ( rule__Function_heading__Group__4__Impl )
            // InternalPascal.g:3428:2: rule__Function_heading__Group__4__Impl
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
    // InternalPascal.g:3434:1: rule__Function_heading__Group__4__Impl : ( ( rule__Function_heading__ReturnTypeAssignment_4 ) ) ;
    public final void rule__Function_heading__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3438:1: ( ( ( rule__Function_heading__ReturnTypeAssignment_4 ) ) )
            // InternalPascal.g:3439:1: ( ( rule__Function_heading__ReturnTypeAssignment_4 ) )
            {
            // InternalPascal.g:3439:1: ( ( rule__Function_heading__ReturnTypeAssignment_4 ) )
            // InternalPascal.g:3440:2: ( rule__Function_heading__ReturnTypeAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_headingAccess().getReturnTypeAssignment_4()); 
            }
            // InternalPascal.g:3441:2: ( rule__Function_heading__ReturnTypeAssignment_4 )
            // InternalPascal.g:3441:3: rule__Function_heading__ReturnTypeAssignment_4
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
    // InternalPascal.g:3450:1: rule__Function_declaration__Group__0 : rule__Function_declaration__Group__0__Impl rule__Function_declaration__Group__1 ;
    public final void rule__Function_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3454:1: ( rule__Function_declaration__Group__0__Impl rule__Function_declaration__Group__1 )
            // InternalPascal.g:3455:2: rule__Function_declaration__Group__0__Impl rule__Function_declaration__Group__1
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
    // InternalPascal.g:3462:1: rule__Function_declaration__Group__0__Impl : ( ( rule__Function_declaration__HeadingAssignment_0 ) ) ;
    public final void rule__Function_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3466:1: ( ( ( rule__Function_declaration__HeadingAssignment_0 ) ) )
            // InternalPascal.g:3467:1: ( ( rule__Function_declaration__HeadingAssignment_0 ) )
            {
            // InternalPascal.g:3467:1: ( ( rule__Function_declaration__HeadingAssignment_0 ) )
            // InternalPascal.g:3468:2: ( rule__Function_declaration__HeadingAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_declarationAccess().getHeadingAssignment_0()); 
            }
            // InternalPascal.g:3469:2: ( rule__Function_declaration__HeadingAssignment_0 )
            // InternalPascal.g:3469:3: rule__Function_declaration__HeadingAssignment_0
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
    // InternalPascal.g:3477:1: rule__Function_declaration__Group__1 : rule__Function_declaration__Group__1__Impl rule__Function_declaration__Group__2 ;
    public final void rule__Function_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3481:1: ( rule__Function_declaration__Group__1__Impl rule__Function_declaration__Group__2 )
            // InternalPascal.g:3482:2: rule__Function_declaration__Group__1__Impl rule__Function_declaration__Group__2
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
    // InternalPascal.g:3489:1: rule__Function_declaration__Group__1__Impl : ( ';' ) ;
    public final void rule__Function_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3493:1: ( ( ';' ) )
            // InternalPascal.g:3494:1: ( ';' )
            {
            // InternalPascal.g:3494:1: ( ';' )
            // InternalPascal.g:3495:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_declarationAccess().getSemicolonKeyword_1()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:3504:1: rule__Function_declaration__Group__2 : rule__Function_declaration__Group__2__Impl ;
    public final void rule__Function_declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3508:1: ( rule__Function_declaration__Group__2__Impl )
            // InternalPascal.g:3509:2: rule__Function_declaration__Group__2__Impl
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
    // InternalPascal.g:3515:1: rule__Function_declaration__Group__2__Impl : ( ( rule__Function_declaration__BlockAssignment_2 ) ) ;
    public final void rule__Function_declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3519:1: ( ( ( rule__Function_declaration__BlockAssignment_2 ) ) )
            // InternalPascal.g:3520:1: ( ( rule__Function_declaration__BlockAssignment_2 ) )
            {
            // InternalPascal.g:3520:1: ( ( rule__Function_declaration__BlockAssignment_2 ) )
            // InternalPascal.g:3521:2: ( rule__Function_declaration__BlockAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_declarationAccess().getBlockAssignment_2()); 
            }
            // InternalPascal.g:3522:2: ( rule__Function_declaration__BlockAssignment_2 )
            // InternalPascal.g:3522:3: rule__Function_declaration__BlockAssignment_2
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


    // $ANTLR start "rule__Procedure_declaration__Group__0"
    // InternalPascal.g:3531:1: rule__Procedure_declaration__Group__0 : rule__Procedure_declaration__Group__0__Impl rule__Procedure_declaration__Group__1 ;
    public final void rule__Procedure_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3535:1: ( rule__Procedure_declaration__Group__0__Impl rule__Procedure_declaration__Group__1 )
            // InternalPascal.g:3536:2: rule__Procedure_declaration__Group__0__Impl rule__Procedure_declaration__Group__1
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
    // InternalPascal.g:3543:1: rule__Procedure_declaration__Group__0__Impl : ( ( rule__Procedure_declaration__HeadingAssignment_0 ) ) ;
    public final void rule__Procedure_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3547:1: ( ( ( rule__Procedure_declaration__HeadingAssignment_0 ) ) )
            // InternalPascal.g:3548:1: ( ( rule__Procedure_declaration__HeadingAssignment_0 ) )
            {
            // InternalPascal.g:3548:1: ( ( rule__Procedure_declaration__HeadingAssignment_0 ) )
            // InternalPascal.g:3549:2: ( rule__Procedure_declaration__HeadingAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcedure_declarationAccess().getHeadingAssignment_0()); 
            }
            // InternalPascal.g:3550:2: ( rule__Procedure_declaration__HeadingAssignment_0 )
            // InternalPascal.g:3550:3: rule__Procedure_declaration__HeadingAssignment_0
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
    // InternalPascal.g:3558:1: rule__Procedure_declaration__Group__1 : rule__Procedure_declaration__Group__1__Impl rule__Procedure_declaration__Group__2 ;
    public final void rule__Procedure_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3562:1: ( rule__Procedure_declaration__Group__1__Impl rule__Procedure_declaration__Group__2 )
            // InternalPascal.g:3563:2: rule__Procedure_declaration__Group__1__Impl rule__Procedure_declaration__Group__2
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
    // InternalPascal.g:3570:1: rule__Procedure_declaration__Group__1__Impl : ( ';' ) ;
    public final void rule__Procedure_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3574:1: ( ( ';' ) )
            // InternalPascal.g:3575:1: ( ';' )
            {
            // InternalPascal.g:3575:1: ( ';' )
            // InternalPascal.g:3576:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcedure_declarationAccess().getSemicolonKeyword_1()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:3585:1: rule__Procedure_declaration__Group__2 : rule__Procedure_declaration__Group__2__Impl ;
    public final void rule__Procedure_declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3589:1: ( rule__Procedure_declaration__Group__2__Impl )
            // InternalPascal.g:3590:2: rule__Procedure_declaration__Group__2__Impl
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
    // InternalPascal.g:3596:1: rule__Procedure_declaration__Group__2__Impl : ( ( rule__Procedure_declaration__BlockAssignment_2 ) ) ;
    public final void rule__Procedure_declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3600:1: ( ( ( rule__Procedure_declaration__BlockAssignment_2 ) ) )
            // InternalPascal.g:3601:1: ( ( rule__Procedure_declaration__BlockAssignment_2 ) )
            {
            // InternalPascal.g:3601:1: ( ( rule__Procedure_declaration__BlockAssignment_2 ) )
            // InternalPascal.g:3602:2: ( rule__Procedure_declaration__BlockAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcedure_declarationAccess().getBlockAssignment_2()); 
            }
            // InternalPascal.g:3603:2: ( rule__Procedure_declaration__BlockAssignment_2 )
            // InternalPascal.g:3603:3: rule__Procedure_declaration__BlockAssignment_2
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
    // InternalPascal.g:3612:1: rule__Procedure_heading__Group__0 : rule__Procedure_heading__Group__0__Impl rule__Procedure_heading__Group__1 ;
    public final void rule__Procedure_heading__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3616:1: ( rule__Procedure_heading__Group__0__Impl rule__Procedure_heading__Group__1 )
            // InternalPascal.g:3617:2: rule__Procedure_heading__Group__0__Impl rule__Procedure_heading__Group__1
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
    // InternalPascal.g:3624:1: rule__Procedure_heading__Group__0__Impl : ( 'procedure' ) ;
    public final void rule__Procedure_heading__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3628:1: ( ( 'procedure' ) )
            // InternalPascal.g:3629:1: ( 'procedure' )
            {
            // InternalPascal.g:3629:1: ( 'procedure' )
            // InternalPascal.g:3630:2: 'procedure'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcedure_headingAccess().getProcedureKeyword_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:3639:1: rule__Procedure_heading__Group__1 : rule__Procedure_heading__Group__1__Impl rule__Procedure_heading__Group__2 ;
    public final void rule__Procedure_heading__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3643:1: ( rule__Procedure_heading__Group__1__Impl rule__Procedure_heading__Group__2 )
            // InternalPascal.g:3644:2: rule__Procedure_heading__Group__1__Impl rule__Procedure_heading__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalPascal.g:3651:1: rule__Procedure_heading__Group__1__Impl : ( ( rule__Procedure_heading__NameAssignment_1 ) ) ;
    public final void rule__Procedure_heading__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3655:1: ( ( ( rule__Procedure_heading__NameAssignment_1 ) ) )
            // InternalPascal.g:3656:1: ( ( rule__Procedure_heading__NameAssignment_1 ) )
            {
            // InternalPascal.g:3656:1: ( ( rule__Procedure_heading__NameAssignment_1 ) )
            // InternalPascal.g:3657:2: ( rule__Procedure_heading__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcedure_headingAccess().getNameAssignment_1()); 
            }
            // InternalPascal.g:3658:2: ( rule__Procedure_heading__NameAssignment_1 )
            // InternalPascal.g:3658:3: rule__Procedure_heading__NameAssignment_1
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
    // InternalPascal.g:3666:1: rule__Procedure_heading__Group__2 : rule__Procedure_heading__Group__2__Impl ;
    public final void rule__Procedure_heading__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3670:1: ( rule__Procedure_heading__Group__2__Impl )
            // InternalPascal.g:3671:2: rule__Procedure_heading__Group__2__Impl
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
    // InternalPascal.g:3677:1: rule__Procedure_heading__Group__2__Impl : ( ( rule__Procedure_heading__ParametersAssignment_2 )? ) ;
    public final void rule__Procedure_heading__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3681:1: ( ( ( rule__Procedure_heading__ParametersAssignment_2 )? ) )
            // InternalPascal.g:3682:1: ( ( rule__Procedure_heading__ParametersAssignment_2 )? )
            {
            // InternalPascal.g:3682:1: ( ( rule__Procedure_heading__ParametersAssignment_2 )? )
            // InternalPascal.g:3683:2: ( rule__Procedure_heading__ParametersAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcedure_headingAccess().getParametersAssignment_2()); 
            }
            // InternalPascal.g:3684:2: ( rule__Procedure_heading__ParametersAssignment_2 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==27) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalPascal.g:3684:3: rule__Procedure_heading__ParametersAssignment_2
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
    // InternalPascal.g:3693:1: rule__Formal_parameter_list__Group__0 : rule__Formal_parameter_list__Group__0__Impl rule__Formal_parameter_list__Group__1 ;
    public final void rule__Formal_parameter_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3697:1: ( rule__Formal_parameter_list__Group__0__Impl rule__Formal_parameter_list__Group__1 )
            // InternalPascal.g:3698:2: rule__Formal_parameter_list__Group__0__Impl rule__Formal_parameter_list__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalPascal.g:3705:1: rule__Formal_parameter_list__Group__0__Impl : ( '(' ) ;
    public final void rule__Formal_parameter_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3709:1: ( ( '(' ) )
            // InternalPascal.g:3710:1: ( '(' )
            {
            // InternalPascal.g:3710:1: ( '(' )
            // InternalPascal.g:3711:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormal_parameter_listAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:3720:1: rule__Formal_parameter_list__Group__1 : rule__Formal_parameter_list__Group__1__Impl rule__Formal_parameter_list__Group__2 ;
    public final void rule__Formal_parameter_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3724:1: ( rule__Formal_parameter_list__Group__1__Impl rule__Formal_parameter_list__Group__2 )
            // InternalPascal.g:3725:2: rule__Formal_parameter_list__Group__1__Impl rule__Formal_parameter_list__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalPascal.g:3732:1: rule__Formal_parameter_list__Group__1__Impl : ( ( rule__Formal_parameter_list__ParametersAssignment_1 ) ) ;
    public final void rule__Formal_parameter_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3736:1: ( ( ( rule__Formal_parameter_list__ParametersAssignment_1 ) ) )
            // InternalPascal.g:3737:1: ( ( rule__Formal_parameter_list__ParametersAssignment_1 ) )
            {
            // InternalPascal.g:3737:1: ( ( rule__Formal_parameter_list__ParametersAssignment_1 ) )
            // InternalPascal.g:3738:2: ( rule__Formal_parameter_list__ParametersAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormal_parameter_listAccess().getParametersAssignment_1()); 
            }
            // InternalPascal.g:3739:2: ( rule__Formal_parameter_list__ParametersAssignment_1 )
            // InternalPascal.g:3739:3: rule__Formal_parameter_list__ParametersAssignment_1
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
    // InternalPascal.g:3747:1: rule__Formal_parameter_list__Group__2 : rule__Formal_parameter_list__Group__2__Impl rule__Formal_parameter_list__Group__3 ;
    public final void rule__Formal_parameter_list__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3751:1: ( rule__Formal_parameter_list__Group__2__Impl rule__Formal_parameter_list__Group__3 )
            // InternalPascal.g:3752:2: rule__Formal_parameter_list__Group__2__Impl rule__Formal_parameter_list__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalPascal.g:3759:1: rule__Formal_parameter_list__Group__2__Impl : ( ( rule__Formal_parameter_list__Group_2__0 )* ) ;
    public final void rule__Formal_parameter_list__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3763:1: ( ( ( rule__Formal_parameter_list__Group_2__0 )* ) )
            // InternalPascal.g:3764:1: ( ( rule__Formal_parameter_list__Group_2__0 )* )
            {
            // InternalPascal.g:3764:1: ( ( rule__Formal_parameter_list__Group_2__0 )* )
            // InternalPascal.g:3765:2: ( rule__Formal_parameter_list__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormal_parameter_listAccess().getGroup_2()); 
            }
            // InternalPascal.g:3766:2: ( rule__Formal_parameter_list__Group_2__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==21) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalPascal.g:3766:3: rule__Formal_parameter_list__Group_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Formal_parameter_list__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
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
    // InternalPascal.g:3774:1: rule__Formal_parameter_list__Group__3 : rule__Formal_parameter_list__Group__3__Impl ;
    public final void rule__Formal_parameter_list__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3778:1: ( rule__Formal_parameter_list__Group__3__Impl )
            // InternalPascal.g:3779:2: rule__Formal_parameter_list__Group__3__Impl
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
    // InternalPascal.g:3785:1: rule__Formal_parameter_list__Group__3__Impl : ( ')' ) ;
    public final void rule__Formal_parameter_list__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3789:1: ( ( ')' ) )
            // InternalPascal.g:3790:1: ( ')' )
            {
            // InternalPascal.g:3790:1: ( ')' )
            // InternalPascal.g:3791:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormal_parameter_listAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:3801:1: rule__Formal_parameter_list__Group_2__0 : rule__Formal_parameter_list__Group_2__0__Impl rule__Formal_parameter_list__Group_2__1 ;
    public final void rule__Formal_parameter_list__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3805:1: ( rule__Formal_parameter_list__Group_2__0__Impl rule__Formal_parameter_list__Group_2__1 )
            // InternalPascal.g:3806:2: rule__Formal_parameter_list__Group_2__0__Impl rule__Formal_parameter_list__Group_2__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalPascal.g:3813:1: rule__Formal_parameter_list__Group_2__0__Impl : ( ';' ) ;
    public final void rule__Formal_parameter_list__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3817:1: ( ( ';' ) )
            // InternalPascal.g:3818:1: ( ';' )
            {
            // InternalPascal.g:3818:1: ( ';' )
            // InternalPascal.g:3819:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormal_parameter_listAccess().getSemicolonKeyword_2_0()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:3828:1: rule__Formal_parameter_list__Group_2__1 : rule__Formal_parameter_list__Group_2__1__Impl ;
    public final void rule__Formal_parameter_list__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3832:1: ( rule__Formal_parameter_list__Group_2__1__Impl )
            // InternalPascal.g:3833:2: rule__Formal_parameter_list__Group_2__1__Impl
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
    // InternalPascal.g:3839:1: rule__Formal_parameter_list__Group_2__1__Impl : ( ( rule__Formal_parameter_list__ParametersAssignment_2_1 ) ) ;
    public final void rule__Formal_parameter_list__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3843:1: ( ( ( rule__Formal_parameter_list__ParametersAssignment_2_1 ) ) )
            // InternalPascal.g:3844:1: ( ( rule__Formal_parameter_list__ParametersAssignment_2_1 ) )
            {
            // InternalPascal.g:3844:1: ( ( rule__Formal_parameter_list__ParametersAssignment_2_1 ) )
            // InternalPascal.g:3845:2: ( rule__Formal_parameter_list__ParametersAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormal_parameter_listAccess().getParametersAssignment_2_1()); 
            }
            // InternalPascal.g:3846:2: ( rule__Formal_parameter_list__ParametersAssignment_2_1 )
            // InternalPascal.g:3846:3: rule__Formal_parameter_list__ParametersAssignment_2_1
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
    // InternalPascal.g:3855:1: rule__Value_parameter_section__Group__0 : rule__Value_parameter_section__Group__0__Impl rule__Value_parameter_section__Group__1 ;
    public final void rule__Value_parameter_section__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3859:1: ( rule__Value_parameter_section__Group__0__Impl rule__Value_parameter_section__Group__1 )
            // InternalPascal.g:3860:2: rule__Value_parameter_section__Group__0__Impl rule__Value_parameter_section__Group__1
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
    // InternalPascal.g:3867:1: rule__Value_parameter_section__Group__0__Impl : ( ( rule__Value_parameter_section__IdentifiersAssignment_0 ) ) ;
    public final void rule__Value_parameter_section__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3871:1: ( ( ( rule__Value_parameter_section__IdentifiersAssignment_0 ) ) )
            // InternalPascal.g:3872:1: ( ( rule__Value_parameter_section__IdentifiersAssignment_0 ) )
            {
            // InternalPascal.g:3872:1: ( ( rule__Value_parameter_section__IdentifiersAssignment_0 ) )
            // InternalPascal.g:3873:2: ( rule__Value_parameter_section__IdentifiersAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValue_parameter_sectionAccess().getIdentifiersAssignment_0()); 
            }
            // InternalPascal.g:3874:2: ( rule__Value_parameter_section__IdentifiersAssignment_0 )
            // InternalPascal.g:3874:3: rule__Value_parameter_section__IdentifiersAssignment_0
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
    // InternalPascal.g:3882:1: rule__Value_parameter_section__Group__1 : rule__Value_parameter_section__Group__1__Impl rule__Value_parameter_section__Group__2 ;
    public final void rule__Value_parameter_section__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3886:1: ( rule__Value_parameter_section__Group__1__Impl rule__Value_parameter_section__Group__2 )
            // InternalPascal.g:3887:2: rule__Value_parameter_section__Group__1__Impl rule__Value_parameter_section__Group__2
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
    // InternalPascal.g:3894:1: rule__Value_parameter_section__Group__1__Impl : ( ':' ) ;
    public final void rule__Value_parameter_section__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3898:1: ( ( ':' ) )
            // InternalPascal.g:3899:1: ( ':' )
            {
            // InternalPascal.g:3899:1: ( ':' )
            // InternalPascal.g:3900:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValue_parameter_sectionAccess().getColonKeyword_1()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:3909:1: rule__Value_parameter_section__Group__2 : rule__Value_parameter_section__Group__2__Impl ;
    public final void rule__Value_parameter_section__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3913:1: ( rule__Value_parameter_section__Group__2__Impl )
            // InternalPascal.g:3914:2: rule__Value_parameter_section__Group__2__Impl
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
    // InternalPascal.g:3920:1: rule__Value_parameter_section__Group__2__Impl : ( ( rule__Value_parameter_section__TypeAssignment_2 ) ) ;
    public final void rule__Value_parameter_section__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3924:1: ( ( ( rule__Value_parameter_section__TypeAssignment_2 ) ) )
            // InternalPascal.g:3925:1: ( ( rule__Value_parameter_section__TypeAssignment_2 ) )
            {
            // InternalPascal.g:3925:1: ( ( rule__Value_parameter_section__TypeAssignment_2 ) )
            // InternalPascal.g:3926:2: ( rule__Value_parameter_section__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValue_parameter_sectionAccess().getTypeAssignment_2()); 
            }
            // InternalPascal.g:3927:2: ( rule__Value_parameter_section__TypeAssignment_2 )
            // InternalPascal.g:3927:3: rule__Value_parameter_section__TypeAssignment_2
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
    // InternalPascal.g:3936:1: rule__Identifier_list__Group__0 : rule__Identifier_list__Group__0__Impl rule__Identifier_list__Group__1 ;
    public final void rule__Identifier_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3940:1: ( rule__Identifier_list__Group__0__Impl rule__Identifier_list__Group__1 )
            // InternalPascal.g:3941:2: rule__Identifier_list__Group__0__Impl rule__Identifier_list__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalPascal.g:3948:1: rule__Identifier_list__Group__0__Impl : ( ( rule__Identifier_list__NamesAssignment_0 ) ) ;
    public final void rule__Identifier_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3952:1: ( ( ( rule__Identifier_list__NamesAssignment_0 ) ) )
            // InternalPascal.g:3953:1: ( ( rule__Identifier_list__NamesAssignment_0 ) )
            {
            // InternalPascal.g:3953:1: ( ( rule__Identifier_list__NamesAssignment_0 ) )
            // InternalPascal.g:3954:2: ( rule__Identifier_list__NamesAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifier_listAccess().getNamesAssignment_0()); 
            }
            // InternalPascal.g:3955:2: ( rule__Identifier_list__NamesAssignment_0 )
            // InternalPascal.g:3955:3: rule__Identifier_list__NamesAssignment_0
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
    // InternalPascal.g:3963:1: rule__Identifier_list__Group__1 : rule__Identifier_list__Group__1__Impl ;
    public final void rule__Identifier_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3967:1: ( rule__Identifier_list__Group__1__Impl )
            // InternalPascal.g:3968:2: rule__Identifier_list__Group__1__Impl
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
    // InternalPascal.g:3974:1: rule__Identifier_list__Group__1__Impl : ( ( rule__Identifier_list__Group_1__0 )* ) ;
    public final void rule__Identifier_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3978:1: ( ( ( rule__Identifier_list__Group_1__0 )* ) )
            // InternalPascal.g:3979:1: ( ( rule__Identifier_list__Group_1__0 )* )
            {
            // InternalPascal.g:3979:1: ( ( rule__Identifier_list__Group_1__0 )* )
            // InternalPascal.g:3980:2: ( rule__Identifier_list__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifier_listAccess().getGroup_1()); 
            }
            // InternalPascal.g:3981:2: ( rule__Identifier_list__Group_1__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==26) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalPascal.g:3981:3: rule__Identifier_list__Group_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Identifier_list__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
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
    // InternalPascal.g:3990:1: rule__Identifier_list__Group_1__0 : rule__Identifier_list__Group_1__0__Impl rule__Identifier_list__Group_1__1 ;
    public final void rule__Identifier_list__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3994:1: ( rule__Identifier_list__Group_1__0__Impl rule__Identifier_list__Group_1__1 )
            // InternalPascal.g:3995:2: rule__Identifier_list__Group_1__0__Impl rule__Identifier_list__Group_1__1
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
    // InternalPascal.g:4002:1: rule__Identifier_list__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Identifier_list__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4006:1: ( ( ',' ) )
            // InternalPascal.g:4007:1: ( ',' )
            {
            // InternalPascal.g:4007:1: ( ',' )
            // InternalPascal.g:4008:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifier_listAccess().getCommaKeyword_1_0()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:4017:1: rule__Identifier_list__Group_1__1 : rule__Identifier_list__Group_1__1__Impl ;
    public final void rule__Identifier_list__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4021:1: ( rule__Identifier_list__Group_1__1__Impl )
            // InternalPascal.g:4022:2: rule__Identifier_list__Group_1__1__Impl
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
    // InternalPascal.g:4028:1: rule__Identifier_list__Group_1__1__Impl : ( ( rule__Identifier_list__NamesAssignment_1_1 ) ) ;
    public final void rule__Identifier_list__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4032:1: ( ( ( rule__Identifier_list__NamesAssignment_1_1 ) ) )
            // InternalPascal.g:4033:1: ( ( rule__Identifier_list__NamesAssignment_1_1 ) )
            {
            // InternalPascal.g:4033:1: ( ( rule__Identifier_list__NamesAssignment_1_1 ) )
            // InternalPascal.g:4034:2: ( rule__Identifier_list__NamesAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifier_listAccess().getNamesAssignment_1_1()); 
            }
            // InternalPascal.g:4035:2: ( rule__Identifier_list__NamesAssignment_1_1 )
            // InternalPascal.g:4035:3: rule__Identifier_list__NamesAssignment_1_1
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
    // InternalPascal.g:4044:1: rule__Variable_parameter_section__Group__0 : rule__Variable_parameter_section__Group__0__Impl rule__Variable_parameter_section__Group__1 ;
    public final void rule__Variable_parameter_section__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4048:1: ( rule__Variable_parameter_section__Group__0__Impl rule__Variable_parameter_section__Group__1 )
            // InternalPascal.g:4049:2: rule__Variable_parameter_section__Group__0__Impl rule__Variable_parameter_section__Group__1
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
    // InternalPascal.g:4056:1: rule__Variable_parameter_section__Group__0__Impl : ( 'var' ) ;
    public final void rule__Variable_parameter_section__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4060:1: ( ( 'var' ) )
            // InternalPascal.g:4061:1: ( 'var' )
            {
            // InternalPascal.g:4061:1: ( 'var' )
            // InternalPascal.g:4062:2: 'var'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_parameter_sectionAccess().getVarKeyword_0()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:4071:1: rule__Variable_parameter_section__Group__1 : rule__Variable_parameter_section__Group__1__Impl rule__Variable_parameter_section__Group__2 ;
    public final void rule__Variable_parameter_section__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4075:1: ( rule__Variable_parameter_section__Group__1__Impl rule__Variable_parameter_section__Group__2 )
            // InternalPascal.g:4076:2: rule__Variable_parameter_section__Group__1__Impl rule__Variable_parameter_section__Group__2
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
    // InternalPascal.g:4083:1: rule__Variable_parameter_section__Group__1__Impl : ( ( rule__Variable_parameter_section__IndentifiersAssignment_1 ) ) ;
    public final void rule__Variable_parameter_section__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4087:1: ( ( ( rule__Variable_parameter_section__IndentifiersAssignment_1 ) ) )
            // InternalPascal.g:4088:1: ( ( rule__Variable_parameter_section__IndentifiersAssignment_1 ) )
            {
            // InternalPascal.g:4088:1: ( ( rule__Variable_parameter_section__IndentifiersAssignment_1 ) )
            // InternalPascal.g:4089:2: ( rule__Variable_parameter_section__IndentifiersAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_parameter_sectionAccess().getIndentifiersAssignment_1()); 
            }
            // InternalPascal.g:4090:2: ( rule__Variable_parameter_section__IndentifiersAssignment_1 )
            // InternalPascal.g:4090:3: rule__Variable_parameter_section__IndentifiersAssignment_1
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
    // InternalPascal.g:4098:1: rule__Variable_parameter_section__Group__2 : rule__Variable_parameter_section__Group__2__Impl rule__Variable_parameter_section__Group__3 ;
    public final void rule__Variable_parameter_section__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4102:1: ( rule__Variable_parameter_section__Group__2__Impl rule__Variable_parameter_section__Group__3 )
            // InternalPascal.g:4103:2: rule__Variable_parameter_section__Group__2__Impl rule__Variable_parameter_section__Group__3
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
    // InternalPascal.g:4110:1: rule__Variable_parameter_section__Group__2__Impl : ( ':' ) ;
    public final void rule__Variable_parameter_section__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4114:1: ( ( ':' ) )
            // InternalPascal.g:4115:1: ( ':' )
            {
            // InternalPascal.g:4115:1: ( ':' )
            // InternalPascal.g:4116:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_parameter_sectionAccess().getColonKeyword_2()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:4125:1: rule__Variable_parameter_section__Group__3 : rule__Variable_parameter_section__Group__3__Impl ;
    public final void rule__Variable_parameter_section__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4129:1: ( rule__Variable_parameter_section__Group__3__Impl )
            // InternalPascal.g:4130:2: rule__Variable_parameter_section__Group__3__Impl
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
    // InternalPascal.g:4136:1: rule__Variable_parameter_section__Group__3__Impl : ( ( rule__Variable_parameter_section__TypeAssignment_3 ) ) ;
    public final void rule__Variable_parameter_section__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4140:1: ( ( ( rule__Variable_parameter_section__TypeAssignment_3 ) ) )
            // InternalPascal.g:4141:1: ( ( rule__Variable_parameter_section__TypeAssignment_3 ) )
            {
            // InternalPascal.g:4141:1: ( ( rule__Variable_parameter_section__TypeAssignment_3 ) )
            // InternalPascal.g:4142:2: ( rule__Variable_parameter_section__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_parameter_sectionAccess().getTypeAssignment_3()); 
            }
            // InternalPascal.g:4143:2: ( rule__Variable_parameter_section__TypeAssignment_3 )
            // InternalPascal.g:4143:3: rule__Variable_parameter_section__TypeAssignment_3
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


    // $ANTLR start "rule__Label_declaration__Group__0"
    // InternalPascal.g:4152:1: rule__Label_declaration__Group__0 : rule__Label_declaration__Group__0__Impl rule__Label_declaration__Group__1 ;
    public final void rule__Label_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4156:1: ( rule__Label_declaration__Group__0__Impl rule__Label_declaration__Group__1 )
            // InternalPascal.g:4157:2: rule__Label_declaration__Group__0__Impl rule__Label_declaration__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalPascal.g:4164:1: rule__Label_declaration__Group__0__Impl : ( 'label' ) ;
    public final void rule__Label_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4168:1: ( ( 'label' ) )
            // InternalPascal.g:4169:1: ( 'label' )
            {
            // InternalPascal.g:4169:1: ( 'label' )
            // InternalPascal.g:4170:2: 'label'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabel_declarationAccess().getLabelKeyword_0()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:4179:1: rule__Label_declaration__Group__1 : rule__Label_declaration__Group__1__Impl rule__Label_declaration__Group__2 ;
    public final void rule__Label_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4183:1: ( rule__Label_declaration__Group__1__Impl rule__Label_declaration__Group__2 )
            // InternalPascal.g:4184:2: rule__Label_declaration__Group__1__Impl rule__Label_declaration__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalPascal.g:4191:1: rule__Label_declaration__Group__1__Impl : ( ( rule__Label_declaration__LabelsAssignment_1 ) ) ;
    public final void rule__Label_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4195:1: ( ( ( rule__Label_declaration__LabelsAssignment_1 ) ) )
            // InternalPascal.g:4196:1: ( ( rule__Label_declaration__LabelsAssignment_1 ) )
            {
            // InternalPascal.g:4196:1: ( ( rule__Label_declaration__LabelsAssignment_1 ) )
            // InternalPascal.g:4197:2: ( rule__Label_declaration__LabelsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabel_declarationAccess().getLabelsAssignment_1()); 
            }
            // InternalPascal.g:4198:2: ( rule__Label_declaration__LabelsAssignment_1 )
            // InternalPascal.g:4198:3: rule__Label_declaration__LabelsAssignment_1
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
    // InternalPascal.g:4206:1: rule__Label_declaration__Group__2 : rule__Label_declaration__Group__2__Impl rule__Label_declaration__Group__3 ;
    public final void rule__Label_declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4210:1: ( rule__Label_declaration__Group__2__Impl rule__Label_declaration__Group__3 )
            // InternalPascal.g:4211:2: rule__Label_declaration__Group__2__Impl rule__Label_declaration__Group__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalPascal.g:4218:1: rule__Label_declaration__Group__2__Impl : ( ( rule__Label_declaration__Group_2__0 )* ) ;
    public final void rule__Label_declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4222:1: ( ( ( rule__Label_declaration__Group_2__0 )* ) )
            // InternalPascal.g:4223:1: ( ( rule__Label_declaration__Group_2__0 )* )
            {
            // InternalPascal.g:4223:1: ( ( rule__Label_declaration__Group_2__0 )* )
            // InternalPascal.g:4224:2: ( rule__Label_declaration__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabel_declarationAccess().getGroup_2()); 
            }
            // InternalPascal.g:4225:2: ( rule__Label_declaration__Group_2__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==26) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalPascal.g:4225:3: rule__Label_declaration__Group_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Label_declaration__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop37;
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
    // InternalPascal.g:4233:1: rule__Label_declaration__Group__3 : rule__Label_declaration__Group__3__Impl ;
    public final void rule__Label_declaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4237:1: ( rule__Label_declaration__Group__3__Impl )
            // InternalPascal.g:4238:2: rule__Label_declaration__Group__3__Impl
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
    // InternalPascal.g:4244:1: rule__Label_declaration__Group__3__Impl : ( ';' ) ;
    public final void rule__Label_declaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4248:1: ( ( ';' ) )
            // InternalPascal.g:4249:1: ( ';' )
            {
            // InternalPascal.g:4249:1: ( ';' )
            // InternalPascal.g:4250:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabel_declarationAccess().getSemicolonKeyword_3()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:4260:1: rule__Label_declaration__Group_2__0 : rule__Label_declaration__Group_2__0__Impl rule__Label_declaration__Group_2__1 ;
    public final void rule__Label_declaration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4264:1: ( rule__Label_declaration__Group_2__0__Impl rule__Label_declaration__Group_2__1 )
            // InternalPascal.g:4265:2: rule__Label_declaration__Group_2__0__Impl rule__Label_declaration__Group_2__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalPascal.g:4272:1: rule__Label_declaration__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Label_declaration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4276:1: ( ( ',' ) )
            // InternalPascal.g:4277:1: ( ',' )
            {
            // InternalPascal.g:4277:1: ( ',' )
            // InternalPascal.g:4278:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabel_declarationAccess().getCommaKeyword_2_0()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:4287:1: rule__Label_declaration__Group_2__1 : rule__Label_declaration__Group_2__1__Impl ;
    public final void rule__Label_declaration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4291:1: ( rule__Label_declaration__Group_2__1__Impl )
            // InternalPascal.g:4292:2: rule__Label_declaration__Group_2__1__Impl
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
    // InternalPascal.g:4298:1: rule__Label_declaration__Group_2__1__Impl : ( ( rule__Label_declaration__LabelsAssignment_2_1 ) ) ;
    public final void rule__Label_declaration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4302:1: ( ( ( rule__Label_declaration__LabelsAssignment_2_1 ) ) )
            // InternalPascal.g:4303:1: ( ( rule__Label_declaration__LabelsAssignment_2_1 ) )
            {
            // InternalPascal.g:4303:1: ( ( rule__Label_declaration__LabelsAssignment_2_1 ) )
            // InternalPascal.g:4304:2: ( rule__Label_declaration__LabelsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabel_declarationAccess().getLabelsAssignment_2_1()); 
            }
            // InternalPascal.g:4305:2: ( rule__Label_declaration__LabelsAssignment_2_1 )
            // InternalPascal.g:4305:3: rule__Label_declaration__LabelsAssignment_2_1
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
    // InternalPascal.g:4314:1: rule__Constant__Group_0__0 : rule__Constant__Group_0__0__Impl rule__Constant__Group_0__1 ;
    public final void rule__Constant__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4318:1: ( rule__Constant__Group_0__0__Impl rule__Constant__Group_0__1 )
            // InternalPascal.g:4319:2: rule__Constant__Group_0__0__Impl rule__Constant__Group_0__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalPascal.g:4326:1: rule__Constant__Group_0__0__Impl : ( ( rule__Constant__OpteratorAssignment_0_0 )? ) ;
    public final void rule__Constant__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4330:1: ( ( ( rule__Constant__OpteratorAssignment_0_0 )? ) )
            // InternalPascal.g:4331:1: ( ( rule__Constant__OpteratorAssignment_0_0 )? )
            {
            // InternalPascal.g:4331:1: ( ( rule__Constant__OpteratorAssignment_0_0 )? )
            // InternalPascal.g:4332:2: ( rule__Constant__OpteratorAssignment_0_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getOpteratorAssignment_0_0()); 
            }
            // InternalPascal.g:4333:2: ( rule__Constant__OpteratorAssignment_0_0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_ADDITION_OP) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalPascal.g:4333:3: rule__Constant__OpteratorAssignment_0_0
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
    // InternalPascal.g:4341:1: rule__Constant__Group_0__1 : rule__Constant__Group_0__1__Impl ;
    public final void rule__Constant__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4345:1: ( rule__Constant__Group_0__1__Impl )
            // InternalPascal.g:4346:2: rule__Constant__Group_0__1__Impl
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
    // InternalPascal.g:4352:1: rule__Constant__Group_0__1__Impl : ( ( rule__Constant__Alternatives_0_1 ) ) ;
    public final void rule__Constant__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4356:1: ( ( ( rule__Constant__Alternatives_0_1 ) ) )
            // InternalPascal.g:4357:1: ( ( rule__Constant__Alternatives_0_1 ) )
            {
            // InternalPascal.g:4357:1: ( ( rule__Constant__Alternatives_0_1 ) )
            // InternalPascal.g:4358:2: ( rule__Constant__Alternatives_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getAlternatives_0_1()); 
            }
            // InternalPascal.g:4359:2: ( rule__Constant__Alternatives_0_1 )
            // InternalPascal.g:4359:3: rule__Constant__Alternatives_0_1
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
    // InternalPascal.g:4368:1: rule__Constant_definition_part__Group__0 : rule__Constant_definition_part__Group__0__Impl rule__Constant_definition_part__Group__1 ;
    public final void rule__Constant_definition_part__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4372:1: ( rule__Constant_definition_part__Group__0__Impl rule__Constant_definition_part__Group__1 )
            // InternalPascal.g:4373:2: rule__Constant_definition_part__Group__0__Impl rule__Constant_definition_part__Group__1
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
    // InternalPascal.g:4380:1: rule__Constant_definition_part__Group__0__Impl : ( 'const' ) ;
    public final void rule__Constant_definition_part__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4384:1: ( ( 'const' ) )
            // InternalPascal.g:4385:1: ( 'const' )
            {
            // InternalPascal.g:4385:1: ( 'const' )
            // InternalPascal.g:4386:2: 'const'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstant_definition_partAccess().getConstKeyword_0()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:4395:1: rule__Constant_definition_part__Group__1 : rule__Constant_definition_part__Group__1__Impl ;
    public final void rule__Constant_definition_part__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4399:1: ( rule__Constant_definition_part__Group__1__Impl )
            // InternalPascal.g:4400:2: rule__Constant_definition_part__Group__1__Impl
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
    // InternalPascal.g:4406:1: rule__Constant_definition_part__Group__1__Impl : ( ( ( rule__Constant_definition_part__Group_1__0 ) ) ( ( rule__Constant_definition_part__Group_1__0 )* ) ) ;
    public final void rule__Constant_definition_part__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4410:1: ( ( ( ( rule__Constant_definition_part__Group_1__0 ) ) ( ( rule__Constant_definition_part__Group_1__0 )* ) ) )
            // InternalPascal.g:4411:1: ( ( ( rule__Constant_definition_part__Group_1__0 ) ) ( ( rule__Constant_definition_part__Group_1__0 )* ) )
            {
            // InternalPascal.g:4411:1: ( ( ( rule__Constant_definition_part__Group_1__0 ) ) ( ( rule__Constant_definition_part__Group_1__0 )* ) )
            // InternalPascal.g:4412:2: ( ( rule__Constant_definition_part__Group_1__0 ) ) ( ( rule__Constant_definition_part__Group_1__0 )* )
            {
            // InternalPascal.g:4412:2: ( ( rule__Constant_definition_part__Group_1__0 ) )
            // InternalPascal.g:4413:3: ( rule__Constant_definition_part__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstant_definition_partAccess().getGroup_1()); 
            }
            // InternalPascal.g:4414:3: ( rule__Constant_definition_part__Group_1__0 )
            // InternalPascal.g:4414:4: rule__Constant_definition_part__Group_1__0
            {
            pushFollow(FOLLOW_30);
            rule__Constant_definition_part__Group_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstant_definition_partAccess().getGroup_1()); 
            }

            }

            // InternalPascal.g:4417:2: ( ( rule__Constant_definition_part__Group_1__0 )* )
            // InternalPascal.g:4418:3: ( rule__Constant_definition_part__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstant_definition_partAccess().getGroup_1()); 
            }
            // InternalPascal.g:4419:3: ( rule__Constant_definition_part__Group_1__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_ID) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalPascal.g:4419:4: rule__Constant_definition_part__Group_1__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__Constant_definition_part__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop39;
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
    // InternalPascal.g:4429:1: rule__Constant_definition_part__Group_1__0 : rule__Constant_definition_part__Group_1__0__Impl rule__Constant_definition_part__Group_1__1 ;
    public final void rule__Constant_definition_part__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4433:1: ( rule__Constant_definition_part__Group_1__0__Impl rule__Constant_definition_part__Group_1__1 )
            // InternalPascal.g:4434:2: rule__Constant_definition_part__Group_1__0__Impl rule__Constant_definition_part__Group_1__1
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
    // InternalPascal.g:4441:1: rule__Constant_definition_part__Group_1__0__Impl : ( ( rule__Constant_definition_part__ConstsAssignment_1_0 ) ) ;
    public final void rule__Constant_definition_part__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4445:1: ( ( ( rule__Constant_definition_part__ConstsAssignment_1_0 ) ) )
            // InternalPascal.g:4446:1: ( ( rule__Constant_definition_part__ConstsAssignment_1_0 ) )
            {
            // InternalPascal.g:4446:1: ( ( rule__Constant_definition_part__ConstsAssignment_1_0 ) )
            // InternalPascal.g:4447:2: ( rule__Constant_definition_part__ConstsAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstant_definition_partAccess().getConstsAssignment_1_0()); 
            }
            // InternalPascal.g:4448:2: ( rule__Constant_definition_part__ConstsAssignment_1_0 )
            // InternalPascal.g:4448:3: rule__Constant_definition_part__ConstsAssignment_1_0
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
    // InternalPascal.g:4456:1: rule__Constant_definition_part__Group_1__1 : rule__Constant_definition_part__Group_1__1__Impl ;
    public final void rule__Constant_definition_part__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4460:1: ( rule__Constant_definition_part__Group_1__1__Impl )
            // InternalPascal.g:4461:2: rule__Constant_definition_part__Group_1__1__Impl
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
    // InternalPascal.g:4467:1: rule__Constant_definition_part__Group_1__1__Impl : ( ';' ) ;
    public final void rule__Constant_definition_part__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4471:1: ( ( ';' ) )
            // InternalPascal.g:4472:1: ( ';' )
            {
            // InternalPascal.g:4472:1: ( ';' )
            // InternalPascal.g:4473:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstant_definition_partAccess().getSemicolonKeyword_1_1()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:4483:1: rule__Constant_definition__Group__0 : rule__Constant_definition__Group__0__Impl rule__Constant_definition__Group__1 ;
    public final void rule__Constant_definition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4487:1: ( rule__Constant_definition__Group__0__Impl rule__Constant_definition__Group__1 )
            // InternalPascal.g:4488:2: rule__Constant_definition__Group__0__Impl rule__Constant_definition__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalPascal.g:4495:1: rule__Constant_definition__Group__0__Impl : ( ( rule__Constant_definition__NameAssignment_0 ) ) ;
    public final void rule__Constant_definition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4499:1: ( ( ( rule__Constant_definition__NameAssignment_0 ) ) )
            // InternalPascal.g:4500:1: ( ( rule__Constant_definition__NameAssignment_0 ) )
            {
            // InternalPascal.g:4500:1: ( ( rule__Constant_definition__NameAssignment_0 ) )
            // InternalPascal.g:4501:2: ( rule__Constant_definition__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstant_definitionAccess().getNameAssignment_0()); 
            }
            // InternalPascal.g:4502:2: ( rule__Constant_definition__NameAssignment_0 )
            // InternalPascal.g:4502:3: rule__Constant_definition__NameAssignment_0
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
    // InternalPascal.g:4510:1: rule__Constant_definition__Group__1 : rule__Constant_definition__Group__1__Impl rule__Constant_definition__Group__2 ;
    public final void rule__Constant_definition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4514:1: ( rule__Constant_definition__Group__1__Impl rule__Constant_definition__Group__2 )
            // InternalPascal.g:4515:2: rule__Constant_definition__Group__1__Impl rule__Constant_definition__Group__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalPascal.g:4522:1: rule__Constant_definition__Group__1__Impl : ( '=' ) ;
    public final void rule__Constant_definition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4526:1: ( ( '=' ) )
            // InternalPascal.g:4527:1: ( '=' )
            {
            // InternalPascal.g:4527:1: ( '=' )
            // InternalPascal.g:4528:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstant_definitionAccess().getEqualsSignKeyword_1()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:4537:1: rule__Constant_definition__Group__2 : rule__Constant_definition__Group__2__Impl ;
    public final void rule__Constant_definition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4541:1: ( rule__Constant_definition__Group__2__Impl )
            // InternalPascal.g:4542:2: rule__Constant_definition__Group__2__Impl
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
    // InternalPascal.g:4548:1: rule__Constant_definition__Group__2__Impl : ( ( rule__Constant_definition__ConstAssignment_2 ) ) ;
    public final void rule__Constant_definition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4552:1: ( ( ( rule__Constant_definition__ConstAssignment_2 ) ) )
            // InternalPascal.g:4553:1: ( ( rule__Constant_definition__ConstAssignment_2 ) )
            {
            // InternalPascal.g:4553:1: ( ( rule__Constant_definition__ConstAssignment_2 ) )
            // InternalPascal.g:4554:2: ( rule__Constant_definition__ConstAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstant_definitionAccess().getConstAssignment_2()); 
            }
            // InternalPascal.g:4555:2: ( rule__Constant_definition__ConstAssignment_2 )
            // InternalPascal.g:4555:3: rule__Constant_definition__ConstAssignment_2
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
    // InternalPascal.g:4564:1: rule__Type_definition_part__Group__0 : rule__Type_definition_part__Group__0__Impl rule__Type_definition_part__Group__1 ;
    public final void rule__Type_definition_part__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4568:1: ( rule__Type_definition_part__Group__0__Impl rule__Type_definition_part__Group__1 )
            // InternalPascal.g:4569:2: rule__Type_definition_part__Group__0__Impl rule__Type_definition_part__Group__1
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
    // InternalPascal.g:4576:1: rule__Type_definition_part__Group__0__Impl : ( 'type' ) ;
    public final void rule__Type_definition_part__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4580:1: ( ( 'type' ) )
            // InternalPascal.g:4581:1: ( 'type' )
            {
            // InternalPascal.g:4581:1: ( 'type' )
            // InternalPascal.g:4582:2: 'type'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_definition_partAccess().getTypeKeyword_0()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:4591:1: rule__Type_definition_part__Group__1 : rule__Type_definition_part__Group__1__Impl ;
    public final void rule__Type_definition_part__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4595:1: ( rule__Type_definition_part__Group__1__Impl )
            // InternalPascal.g:4596:2: rule__Type_definition_part__Group__1__Impl
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
    // InternalPascal.g:4602:1: rule__Type_definition_part__Group__1__Impl : ( ( ( rule__Type_definition_part__Group_1__0 ) ) ( ( rule__Type_definition_part__Group_1__0 )* ) ) ;
    public final void rule__Type_definition_part__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4606:1: ( ( ( ( rule__Type_definition_part__Group_1__0 ) ) ( ( rule__Type_definition_part__Group_1__0 )* ) ) )
            // InternalPascal.g:4607:1: ( ( ( rule__Type_definition_part__Group_1__0 ) ) ( ( rule__Type_definition_part__Group_1__0 )* ) )
            {
            // InternalPascal.g:4607:1: ( ( ( rule__Type_definition_part__Group_1__0 ) ) ( ( rule__Type_definition_part__Group_1__0 )* ) )
            // InternalPascal.g:4608:2: ( ( rule__Type_definition_part__Group_1__0 ) ) ( ( rule__Type_definition_part__Group_1__0 )* )
            {
            // InternalPascal.g:4608:2: ( ( rule__Type_definition_part__Group_1__0 ) )
            // InternalPascal.g:4609:3: ( rule__Type_definition_part__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_definition_partAccess().getGroup_1()); 
            }
            // InternalPascal.g:4610:3: ( rule__Type_definition_part__Group_1__0 )
            // InternalPascal.g:4610:4: rule__Type_definition_part__Group_1__0
            {
            pushFollow(FOLLOW_30);
            rule__Type_definition_part__Group_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getType_definition_partAccess().getGroup_1()); 
            }

            }

            // InternalPascal.g:4613:2: ( ( rule__Type_definition_part__Group_1__0 )* )
            // InternalPascal.g:4614:3: ( rule__Type_definition_part__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_definition_partAccess().getGroup_1()); 
            }
            // InternalPascal.g:4615:3: ( rule__Type_definition_part__Group_1__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_ID) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalPascal.g:4615:4: rule__Type_definition_part__Group_1__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__Type_definition_part__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop40;
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
    // InternalPascal.g:4625:1: rule__Type_definition_part__Group_1__0 : rule__Type_definition_part__Group_1__0__Impl rule__Type_definition_part__Group_1__1 ;
    public final void rule__Type_definition_part__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4629:1: ( rule__Type_definition_part__Group_1__0__Impl rule__Type_definition_part__Group_1__1 )
            // InternalPascal.g:4630:2: rule__Type_definition_part__Group_1__0__Impl rule__Type_definition_part__Group_1__1
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
    // InternalPascal.g:4637:1: rule__Type_definition_part__Group_1__0__Impl : ( ( rule__Type_definition_part__TypesAssignment_1_0 ) ) ;
    public final void rule__Type_definition_part__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4641:1: ( ( ( rule__Type_definition_part__TypesAssignment_1_0 ) ) )
            // InternalPascal.g:4642:1: ( ( rule__Type_definition_part__TypesAssignment_1_0 ) )
            {
            // InternalPascal.g:4642:1: ( ( rule__Type_definition_part__TypesAssignment_1_0 ) )
            // InternalPascal.g:4643:2: ( rule__Type_definition_part__TypesAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_definition_partAccess().getTypesAssignment_1_0()); 
            }
            // InternalPascal.g:4644:2: ( rule__Type_definition_part__TypesAssignment_1_0 )
            // InternalPascal.g:4644:3: rule__Type_definition_part__TypesAssignment_1_0
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
    // InternalPascal.g:4652:1: rule__Type_definition_part__Group_1__1 : rule__Type_definition_part__Group_1__1__Impl ;
    public final void rule__Type_definition_part__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4656:1: ( rule__Type_definition_part__Group_1__1__Impl )
            // InternalPascal.g:4657:2: rule__Type_definition_part__Group_1__1__Impl
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
    // InternalPascal.g:4663:1: rule__Type_definition_part__Group_1__1__Impl : ( ';' ) ;
    public final void rule__Type_definition_part__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4667:1: ( ( ';' ) )
            // InternalPascal.g:4668:1: ( ';' )
            {
            // InternalPascal.g:4668:1: ( ';' )
            // InternalPascal.g:4669:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_definition_partAccess().getSemicolonKeyword_1_1()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:4679:1: rule__Type_definition__Group__0 : rule__Type_definition__Group__0__Impl rule__Type_definition__Group__1 ;
    public final void rule__Type_definition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4683:1: ( rule__Type_definition__Group__0__Impl rule__Type_definition__Group__1 )
            // InternalPascal.g:4684:2: rule__Type_definition__Group__0__Impl rule__Type_definition__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalPascal.g:4691:1: rule__Type_definition__Group__0__Impl : ( ( rule__Type_definition__NameAssignment_0 ) ) ;
    public final void rule__Type_definition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4695:1: ( ( ( rule__Type_definition__NameAssignment_0 ) ) )
            // InternalPascal.g:4696:1: ( ( rule__Type_definition__NameAssignment_0 ) )
            {
            // InternalPascal.g:4696:1: ( ( rule__Type_definition__NameAssignment_0 ) )
            // InternalPascal.g:4697:2: ( rule__Type_definition__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_definitionAccess().getNameAssignment_0()); 
            }
            // InternalPascal.g:4698:2: ( rule__Type_definition__NameAssignment_0 )
            // InternalPascal.g:4698:3: rule__Type_definition__NameAssignment_0
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
    // InternalPascal.g:4706:1: rule__Type_definition__Group__1 : rule__Type_definition__Group__1__Impl rule__Type_definition__Group__2 ;
    public final void rule__Type_definition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4710:1: ( rule__Type_definition__Group__1__Impl rule__Type_definition__Group__2 )
            // InternalPascal.g:4711:2: rule__Type_definition__Group__1__Impl rule__Type_definition__Group__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalPascal.g:4718:1: rule__Type_definition__Group__1__Impl : ( '=' ) ;
    public final void rule__Type_definition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4722:1: ( ( '=' ) )
            // InternalPascal.g:4723:1: ( '=' )
            {
            // InternalPascal.g:4723:1: ( '=' )
            // InternalPascal.g:4724:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_definitionAccess().getEqualsSignKeyword_1()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:4733:1: rule__Type_definition__Group__2 : rule__Type_definition__Group__2__Impl ;
    public final void rule__Type_definition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4737:1: ( rule__Type_definition__Group__2__Impl )
            // InternalPascal.g:4738:2: rule__Type_definition__Group__2__Impl
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
    // InternalPascal.g:4744:1: rule__Type_definition__Group__2__Impl : ( ( rule__Type_definition__TypeAssignment_2 ) ) ;
    public final void rule__Type_definition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4748:1: ( ( ( rule__Type_definition__TypeAssignment_2 ) ) )
            // InternalPascal.g:4749:1: ( ( rule__Type_definition__TypeAssignment_2 ) )
            {
            // InternalPascal.g:4749:1: ( ( rule__Type_definition__TypeAssignment_2 ) )
            // InternalPascal.g:4750:2: ( rule__Type_definition__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getType_definitionAccess().getTypeAssignment_2()); 
            }
            // InternalPascal.g:4751:2: ( rule__Type_definition__TypeAssignment_2 )
            // InternalPascal.g:4751:3: rule__Type_definition__TypeAssignment_2
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


    // $ANTLR start "rule__Record_type__Group__0"
    // InternalPascal.g:4760:1: rule__Record_type__Group__0 : rule__Record_type__Group__0__Impl rule__Record_type__Group__1 ;
    public final void rule__Record_type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4764:1: ( rule__Record_type__Group__0__Impl rule__Record_type__Group__1 )
            // InternalPascal.g:4765:2: rule__Record_type__Group__0__Impl rule__Record_type__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalPascal.g:4772:1: rule__Record_type__Group__0__Impl : ( ( rule__Record_type__RecordKeywordAssignment_0 ) ) ;
    public final void rule__Record_type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4776:1: ( ( ( rule__Record_type__RecordKeywordAssignment_0 ) ) )
            // InternalPascal.g:4777:1: ( ( rule__Record_type__RecordKeywordAssignment_0 ) )
            {
            // InternalPascal.g:4777:1: ( ( rule__Record_type__RecordKeywordAssignment_0 ) )
            // InternalPascal.g:4778:2: ( rule__Record_type__RecordKeywordAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecord_typeAccess().getRecordKeywordAssignment_0()); 
            }
            // InternalPascal.g:4779:2: ( rule__Record_type__RecordKeywordAssignment_0 )
            // InternalPascal.g:4779:3: rule__Record_type__RecordKeywordAssignment_0
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
    // InternalPascal.g:4787:1: rule__Record_type__Group__1 : rule__Record_type__Group__1__Impl rule__Record_type__Group__2 ;
    public final void rule__Record_type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4791:1: ( rule__Record_type__Group__1__Impl rule__Record_type__Group__2 )
            // InternalPascal.g:4792:2: rule__Record_type__Group__1__Impl rule__Record_type__Group__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalPascal.g:4799:1: rule__Record_type__Group__1__Impl : ( ( rule__Record_type__FieldsAssignment_1 )? ) ;
    public final void rule__Record_type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4803:1: ( ( ( rule__Record_type__FieldsAssignment_1 )? ) )
            // InternalPascal.g:4804:1: ( ( rule__Record_type__FieldsAssignment_1 )? )
            {
            // InternalPascal.g:4804:1: ( ( rule__Record_type__FieldsAssignment_1 )? )
            // InternalPascal.g:4805:2: ( rule__Record_type__FieldsAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecord_typeAccess().getFieldsAssignment_1()); 
            }
            // InternalPascal.g:4806:2: ( rule__Record_type__FieldsAssignment_1 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_ID) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalPascal.g:4806:3: rule__Record_type__FieldsAssignment_1
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
    // InternalPascal.g:4814:1: rule__Record_type__Group__2 : rule__Record_type__Group__2__Impl ;
    public final void rule__Record_type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4818:1: ( rule__Record_type__Group__2__Impl )
            // InternalPascal.g:4819:2: rule__Record_type__Group__2__Impl
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
    // InternalPascal.g:4825:1: rule__Record_type__Group__2__Impl : ( ( rule__Record_type__EndKeywordAssignment_2 ) ) ;
    public final void rule__Record_type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4829:1: ( ( ( rule__Record_type__EndKeywordAssignment_2 ) ) )
            // InternalPascal.g:4830:1: ( ( rule__Record_type__EndKeywordAssignment_2 ) )
            {
            // InternalPascal.g:4830:1: ( ( rule__Record_type__EndKeywordAssignment_2 ) )
            // InternalPascal.g:4831:2: ( rule__Record_type__EndKeywordAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecord_typeAccess().getEndKeywordAssignment_2()); 
            }
            // InternalPascal.g:4832:2: ( rule__Record_type__EndKeywordAssignment_2 )
            // InternalPascal.g:4832:3: rule__Record_type__EndKeywordAssignment_2
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
    // InternalPascal.g:4841:1: rule__Field_list__Group__0 : rule__Field_list__Group__0__Impl rule__Field_list__Group__1 ;
    public final void rule__Field_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4845:1: ( rule__Field_list__Group__0__Impl rule__Field_list__Group__1 )
            // InternalPascal.g:4846:2: rule__Field_list__Group__0__Impl rule__Field_list__Group__1
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
    // InternalPascal.g:4853:1: rule__Field_list__Group__0__Impl : ( ( rule__Field_list__SectionsAssignment_0 ) ) ;
    public final void rule__Field_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4857:1: ( ( ( rule__Field_list__SectionsAssignment_0 ) ) )
            // InternalPascal.g:4858:1: ( ( rule__Field_list__SectionsAssignment_0 ) )
            {
            // InternalPascal.g:4858:1: ( ( rule__Field_list__SectionsAssignment_0 ) )
            // InternalPascal.g:4859:2: ( rule__Field_list__SectionsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_listAccess().getSectionsAssignment_0()); 
            }
            // InternalPascal.g:4860:2: ( rule__Field_list__SectionsAssignment_0 )
            // InternalPascal.g:4860:3: rule__Field_list__SectionsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Field_list__SectionsAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getField_listAccess().getSectionsAssignment_0()); 
            }

            }


            }

        }
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
    // InternalPascal.g:4868:1: rule__Field_list__Group__1 : rule__Field_list__Group__1__Impl ;
    public final void rule__Field_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4872:1: ( rule__Field_list__Group__1__Impl )
            // InternalPascal.g:4873:2: rule__Field_list__Group__1__Impl
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
    // InternalPascal.g:4879:1: rule__Field_list__Group__1__Impl : ( ( rule__Field_list__Group_1__0 )* ) ;
    public final void rule__Field_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4883:1: ( ( ( rule__Field_list__Group_1__0 )* ) )
            // InternalPascal.g:4884:1: ( ( rule__Field_list__Group_1__0 )* )
            {
            // InternalPascal.g:4884:1: ( ( rule__Field_list__Group_1__0 )* )
            // InternalPascal.g:4885:2: ( rule__Field_list__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_listAccess().getGroup_1()); 
            }
            // InternalPascal.g:4886:2: ( rule__Field_list__Group_1__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==21) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalPascal.g:4886:3: rule__Field_list__Group_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Field_list__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getField_listAccess().getGroup_1()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Field_list__Group_1__0"
    // InternalPascal.g:4895:1: rule__Field_list__Group_1__0 : rule__Field_list__Group_1__0__Impl rule__Field_list__Group_1__1 ;
    public final void rule__Field_list__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4899:1: ( rule__Field_list__Group_1__0__Impl rule__Field_list__Group_1__1 )
            // InternalPascal.g:4900:2: rule__Field_list__Group_1__0__Impl rule__Field_list__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__Field_list__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Field_list__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field_list__Group_1__0"


    // $ANTLR start "rule__Field_list__Group_1__0__Impl"
    // InternalPascal.g:4907:1: rule__Field_list__Group_1__0__Impl : ( ';' ) ;
    public final void rule__Field_list__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4911:1: ( ( ';' ) )
            // InternalPascal.g:4912:1: ( ';' )
            {
            // InternalPascal.g:4912:1: ( ';' )
            // InternalPascal.g:4913:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_listAccess().getSemicolonKeyword_1_0()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getField_listAccess().getSemicolonKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field_list__Group_1__0__Impl"


    // $ANTLR start "rule__Field_list__Group_1__1"
    // InternalPascal.g:4922:1: rule__Field_list__Group_1__1 : rule__Field_list__Group_1__1__Impl ;
    public final void rule__Field_list__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4926:1: ( rule__Field_list__Group_1__1__Impl )
            // InternalPascal.g:4927:2: rule__Field_list__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Field_list__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field_list__Group_1__1"


    // $ANTLR start "rule__Field_list__Group_1__1__Impl"
    // InternalPascal.g:4933:1: rule__Field_list__Group_1__1__Impl : ( ( rule__Field_list__SectionsAssignment_1_1 ) ) ;
    public final void rule__Field_list__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4937:1: ( ( ( rule__Field_list__SectionsAssignment_1_1 ) ) )
            // InternalPascal.g:4938:1: ( ( rule__Field_list__SectionsAssignment_1_1 ) )
            {
            // InternalPascal.g:4938:1: ( ( rule__Field_list__SectionsAssignment_1_1 ) )
            // InternalPascal.g:4939:2: ( rule__Field_list__SectionsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_listAccess().getSectionsAssignment_1_1()); 
            }
            // InternalPascal.g:4940:2: ( rule__Field_list__SectionsAssignment_1_1 )
            // InternalPascal.g:4940:3: rule__Field_list__SectionsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Field_list__SectionsAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getField_listAccess().getSectionsAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field_list__Group_1__1__Impl"


    // $ANTLR start "rule__Record_section__Group__0"
    // InternalPascal.g:4949:1: rule__Record_section__Group__0 : rule__Record_section__Group__0__Impl rule__Record_section__Group__1 ;
    public final void rule__Record_section__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4953:1: ( rule__Record_section__Group__0__Impl rule__Record_section__Group__1 )
            // InternalPascal.g:4954:2: rule__Record_section__Group__0__Impl rule__Record_section__Group__1
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
    // InternalPascal.g:4961:1: rule__Record_section__Group__0__Impl : ( ( rule__Record_section__IdentifiersAssignment_0 ) ) ;
    public final void rule__Record_section__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4965:1: ( ( ( rule__Record_section__IdentifiersAssignment_0 ) ) )
            // InternalPascal.g:4966:1: ( ( rule__Record_section__IdentifiersAssignment_0 ) )
            {
            // InternalPascal.g:4966:1: ( ( rule__Record_section__IdentifiersAssignment_0 ) )
            // InternalPascal.g:4967:2: ( rule__Record_section__IdentifiersAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecord_sectionAccess().getIdentifiersAssignment_0()); 
            }
            // InternalPascal.g:4968:2: ( rule__Record_section__IdentifiersAssignment_0 )
            // InternalPascal.g:4968:3: rule__Record_section__IdentifiersAssignment_0
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
    // InternalPascal.g:4976:1: rule__Record_section__Group__1 : rule__Record_section__Group__1__Impl rule__Record_section__Group__2 ;
    public final void rule__Record_section__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4980:1: ( rule__Record_section__Group__1__Impl rule__Record_section__Group__2 )
            // InternalPascal.g:4981:2: rule__Record_section__Group__1__Impl rule__Record_section__Group__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalPascal.g:4988:1: rule__Record_section__Group__1__Impl : ( ':' ) ;
    public final void rule__Record_section__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4992:1: ( ( ':' ) )
            // InternalPascal.g:4993:1: ( ':' )
            {
            // InternalPascal.g:4993:1: ( ':' )
            // InternalPascal.g:4994:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecord_sectionAccess().getColonKeyword_1()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:5003:1: rule__Record_section__Group__2 : rule__Record_section__Group__2__Impl ;
    public final void rule__Record_section__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5007:1: ( rule__Record_section__Group__2__Impl )
            // InternalPascal.g:5008:2: rule__Record_section__Group__2__Impl
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
    // InternalPascal.g:5014:1: rule__Record_section__Group__2__Impl : ( ( rule__Record_section__TypeAssignment_2 ) ) ;
    public final void rule__Record_section__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5018:1: ( ( ( rule__Record_section__TypeAssignment_2 ) ) )
            // InternalPascal.g:5019:1: ( ( rule__Record_section__TypeAssignment_2 ) )
            {
            // InternalPascal.g:5019:1: ( ( rule__Record_section__TypeAssignment_2 ) )
            // InternalPascal.g:5020:2: ( rule__Record_section__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecord_sectionAccess().getTypeAssignment_2()); 
            }
            // InternalPascal.g:5021:2: ( rule__Record_section__TypeAssignment_2 )
            // InternalPascal.g:5021:3: rule__Record_section__TypeAssignment_2
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


    // $ANTLR start "rule__Variable_declaration_part__Group__0"
    // InternalPascal.g:5030:1: rule__Variable_declaration_part__Group__0 : rule__Variable_declaration_part__Group__0__Impl rule__Variable_declaration_part__Group__1 ;
    public final void rule__Variable_declaration_part__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5034:1: ( rule__Variable_declaration_part__Group__0__Impl rule__Variable_declaration_part__Group__1 )
            // InternalPascal.g:5035:2: rule__Variable_declaration_part__Group__0__Impl rule__Variable_declaration_part__Group__1
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
    // InternalPascal.g:5042:1: rule__Variable_declaration_part__Group__0__Impl : ( 'var' ) ;
    public final void rule__Variable_declaration_part__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5046:1: ( ( 'var' ) )
            // InternalPascal.g:5047:1: ( 'var' )
            {
            // InternalPascal.g:5047:1: ( 'var' )
            // InternalPascal.g:5048:2: 'var'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declaration_partAccess().getVarKeyword_0()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:5057:1: rule__Variable_declaration_part__Group__1 : rule__Variable_declaration_part__Group__1__Impl rule__Variable_declaration_part__Group__2 ;
    public final void rule__Variable_declaration_part__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5061:1: ( rule__Variable_declaration_part__Group__1__Impl rule__Variable_declaration_part__Group__2 )
            // InternalPascal.g:5062:2: rule__Variable_declaration_part__Group__1__Impl rule__Variable_declaration_part__Group__2
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
    // InternalPascal.g:5069:1: rule__Variable_declaration_part__Group__1__Impl : ( ( rule__Variable_declaration_part__SectionsAssignment_1 ) ) ;
    public final void rule__Variable_declaration_part__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5073:1: ( ( ( rule__Variable_declaration_part__SectionsAssignment_1 ) ) )
            // InternalPascal.g:5074:1: ( ( rule__Variable_declaration_part__SectionsAssignment_1 ) )
            {
            // InternalPascal.g:5074:1: ( ( rule__Variable_declaration_part__SectionsAssignment_1 ) )
            // InternalPascal.g:5075:2: ( rule__Variable_declaration_part__SectionsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declaration_partAccess().getSectionsAssignment_1()); 
            }
            // InternalPascal.g:5076:2: ( rule__Variable_declaration_part__SectionsAssignment_1 )
            // InternalPascal.g:5076:3: rule__Variable_declaration_part__SectionsAssignment_1
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
    // InternalPascal.g:5084:1: rule__Variable_declaration_part__Group__2 : rule__Variable_declaration_part__Group__2__Impl rule__Variable_declaration_part__Group__3 ;
    public final void rule__Variable_declaration_part__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5088:1: ( rule__Variable_declaration_part__Group__2__Impl rule__Variable_declaration_part__Group__3 )
            // InternalPascal.g:5089:2: rule__Variable_declaration_part__Group__2__Impl rule__Variable_declaration_part__Group__3
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
    // InternalPascal.g:5096:1: rule__Variable_declaration_part__Group__2__Impl : ( ';' ) ;
    public final void rule__Variable_declaration_part__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5100:1: ( ( ';' ) )
            // InternalPascal.g:5101:1: ( ';' )
            {
            // InternalPascal.g:5101:1: ( ';' )
            // InternalPascal.g:5102:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declaration_partAccess().getSemicolonKeyword_2()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:5111:1: rule__Variable_declaration_part__Group__3 : rule__Variable_declaration_part__Group__3__Impl ;
    public final void rule__Variable_declaration_part__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5115:1: ( rule__Variable_declaration_part__Group__3__Impl )
            // InternalPascal.g:5116:2: rule__Variable_declaration_part__Group__3__Impl
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
    // InternalPascal.g:5122:1: rule__Variable_declaration_part__Group__3__Impl : ( ( rule__Variable_declaration_part__Group_3__0 )* ) ;
    public final void rule__Variable_declaration_part__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5126:1: ( ( ( rule__Variable_declaration_part__Group_3__0 )* ) )
            // InternalPascal.g:5127:1: ( ( rule__Variable_declaration_part__Group_3__0 )* )
            {
            // InternalPascal.g:5127:1: ( ( rule__Variable_declaration_part__Group_3__0 )* )
            // InternalPascal.g:5128:2: ( rule__Variable_declaration_part__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declaration_partAccess().getGroup_3()); 
            }
            // InternalPascal.g:5129:2: ( rule__Variable_declaration_part__Group_3__0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_ID) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalPascal.g:5129:3: rule__Variable_declaration_part__Group_3__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__Variable_declaration_part__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop43;
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
    // InternalPascal.g:5138:1: rule__Variable_declaration_part__Group_3__0 : rule__Variable_declaration_part__Group_3__0__Impl rule__Variable_declaration_part__Group_3__1 ;
    public final void rule__Variable_declaration_part__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5142:1: ( rule__Variable_declaration_part__Group_3__0__Impl rule__Variable_declaration_part__Group_3__1 )
            // InternalPascal.g:5143:2: rule__Variable_declaration_part__Group_3__0__Impl rule__Variable_declaration_part__Group_3__1
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
    // InternalPascal.g:5150:1: rule__Variable_declaration_part__Group_3__0__Impl : ( ( rule__Variable_declaration_part__SectionsAssignment_3_0 ) ) ;
    public final void rule__Variable_declaration_part__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5154:1: ( ( ( rule__Variable_declaration_part__SectionsAssignment_3_0 ) ) )
            // InternalPascal.g:5155:1: ( ( rule__Variable_declaration_part__SectionsAssignment_3_0 ) )
            {
            // InternalPascal.g:5155:1: ( ( rule__Variable_declaration_part__SectionsAssignment_3_0 ) )
            // InternalPascal.g:5156:2: ( rule__Variable_declaration_part__SectionsAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declaration_partAccess().getSectionsAssignment_3_0()); 
            }
            // InternalPascal.g:5157:2: ( rule__Variable_declaration_part__SectionsAssignment_3_0 )
            // InternalPascal.g:5157:3: rule__Variable_declaration_part__SectionsAssignment_3_0
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
    // InternalPascal.g:5165:1: rule__Variable_declaration_part__Group_3__1 : rule__Variable_declaration_part__Group_3__1__Impl ;
    public final void rule__Variable_declaration_part__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5169:1: ( rule__Variable_declaration_part__Group_3__1__Impl )
            // InternalPascal.g:5170:2: rule__Variable_declaration_part__Group_3__1__Impl
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
    // InternalPascal.g:5176:1: rule__Variable_declaration_part__Group_3__1__Impl : ( ';' ) ;
    public final void rule__Variable_declaration_part__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5180:1: ( ( ';' ) )
            // InternalPascal.g:5181:1: ( ';' )
            {
            // InternalPascal.g:5181:1: ( ';' )
            // InternalPascal.g:5182:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_declaration_partAccess().getSemicolonKeyword_3_1()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:5192:1: rule__Variable_section__Group__0 : rule__Variable_section__Group__0__Impl rule__Variable_section__Group__1 ;
    public final void rule__Variable_section__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5196:1: ( rule__Variable_section__Group__0__Impl rule__Variable_section__Group__1 )
            // InternalPascal.g:5197:2: rule__Variable_section__Group__0__Impl rule__Variable_section__Group__1
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
    // InternalPascal.g:5204:1: rule__Variable_section__Group__0__Impl : ( ( rule__Variable_section__IdentifiersAssignment_0 ) ) ;
    public final void rule__Variable_section__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5208:1: ( ( ( rule__Variable_section__IdentifiersAssignment_0 ) ) )
            // InternalPascal.g:5209:1: ( ( rule__Variable_section__IdentifiersAssignment_0 ) )
            {
            // InternalPascal.g:5209:1: ( ( rule__Variable_section__IdentifiersAssignment_0 ) )
            // InternalPascal.g:5210:2: ( rule__Variable_section__IdentifiersAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_sectionAccess().getIdentifiersAssignment_0()); 
            }
            // InternalPascal.g:5211:2: ( rule__Variable_section__IdentifiersAssignment_0 )
            // InternalPascal.g:5211:3: rule__Variable_section__IdentifiersAssignment_0
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
    // InternalPascal.g:5219:1: rule__Variable_section__Group__1 : rule__Variable_section__Group__1__Impl rule__Variable_section__Group__2 ;
    public final void rule__Variable_section__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5223:1: ( rule__Variable_section__Group__1__Impl rule__Variable_section__Group__2 )
            // InternalPascal.g:5224:2: rule__Variable_section__Group__1__Impl rule__Variable_section__Group__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalPascal.g:5231:1: rule__Variable_section__Group__1__Impl : ( ':' ) ;
    public final void rule__Variable_section__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5235:1: ( ( ':' ) )
            // InternalPascal.g:5236:1: ( ':' )
            {
            // InternalPascal.g:5236:1: ( ':' )
            // InternalPascal.g:5237:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_sectionAccess().getColonKeyword_1()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:5246:1: rule__Variable_section__Group__2 : rule__Variable_section__Group__2__Impl ;
    public final void rule__Variable_section__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5250:1: ( rule__Variable_section__Group__2__Impl )
            // InternalPascal.g:5251:2: rule__Variable_section__Group__2__Impl
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
    // InternalPascal.g:5257:1: rule__Variable_section__Group__2__Impl : ( ( rule__Variable_section__TypeAssignment_2 ) ) ;
    public final void rule__Variable_section__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5261:1: ( ( ( rule__Variable_section__TypeAssignment_2 ) ) )
            // InternalPascal.g:5262:1: ( ( rule__Variable_section__TypeAssignment_2 ) )
            {
            // InternalPascal.g:5262:1: ( ( rule__Variable_section__TypeAssignment_2 ) )
            // InternalPascal.g:5263:2: ( rule__Variable_section__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_sectionAccess().getTypeAssignment_2()); 
            }
            // InternalPascal.g:5264:2: ( rule__Variable_section__TypeAssignment_2 )
            // InternalPascal.g:5264:3: rule__Variable_section__TypeAssignment_2
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
    // InternalPascal.g:5273:1: rule__Variable_identifier_list__Group__0 : rule__Variable_identifier_list__Group__0__Impl rule__Variable_identifier_list__Group__1 ;
    public final void rule__Variable_identifier_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5277:1: ( rule__Variable_identifier_list__Group__0__Impl rule__Variable_identifier_list__Group__1 )
            // InternalPascal.g:5278:2: rule__Variable_identifier_list__Group__0__Impl rule__Variable_identifier_list__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalPascal.g:5285:1: rule__Variable_identifier_list__Group__0__Impl : ( ( rule__Variable_identifier_list__NamesAssignment_0 ) ) ;
    public final void rule__Variable_identifier_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5289:1: ( ( ( rule__Variable_identifier_list__NamesAssignment_0 ) ) )
            // InternalPascal.g:5290:1: ( ( rule__Variable_identifier_list__NamesAssignment_0 ) )
            {
            // InternalPascal.g:5290:1: ( ( rule__Variable_identifier_list__NamesAssignment_0 ) )
            // InternalPascal.g:5291:2: ( rule__Variable_identifier_list__NamesAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_identifier_listAccess().getNamesAssignment_0()); 
            }
            // InternalPascal.g:5292:2: ( rule__Variable_identifier_list__NamesAssignment_0 )
            // InternalPascal.g:5292:3: rule__Variable_identifier_list__NamesAssignment_0
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
    // InternalPascal.g:5300:1: rule__Variable_identifier_list__Group__1 : rule__Variable_identifier_list__Group__1__Impl ;
    public final void rule__Variable_identifier_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5304:1: ( rule__Variable_identifier_list__Group__1__Impl )
            // InternalPascal.g:5305:2: rule__Variable_identifier_list__Group__1__Impl
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
    // InternalPascal.g:5311:1: rule__Variable_identifier_list__Group__1__Impl : ( ( rule__Variable_identifier_list__Group_1__0 )* ) ;
    public final void rule__Variable_identifier_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5315:1: ( ( ( rule__Variable_identifier_list__Group_1__0 )* ) )
            // InternalPascal.g:5316:1: ( ( rule__Variable_identifier_list__Group_1__0 )* )
            {
            // InternalPascal.g:5316:1: ( ( rule__Variable_identifier_list__Group_1__0 )* )
            // InternalPascal.g:5317:2: ( rule__Variable_identifier_list__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_identifier_listAccess().getGroup_1()); 
            }
            // InternalPascal.g:5318:2: ( rule__Variable_identifier_list__Group_1__0 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==26) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalPascal.g:5318:3: rule__Variable_identifier_list__Group_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Variable_identifier_list__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop44;
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
    // InternalPascal.g:5327:1: rule__Variable_identifier_list__Group_1__0 : rule__Variable_identifier_list__Group_1__0__Impl rule__Variable_identifier_list__Group_1__1 ;
    public final void rule__Variable_identifier_list__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5331:1: ( rule__Variable_identifier_list__Group_1__0__Impl rule__Variable_identifier_list__Group_1__1 )
            // InternalPascal.g:5332:2: rule__Variable_identifier_list__Group_1__0__Impl rule__Variable_identifier_list__Group_1__1
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
    // InternalPascal.g:5339:1: rule__Variable_identifier_list__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Variable_identifier_list__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5343:1: ( ( ',' ) )
            // InternalPascal.g:5344:1: ( ',' )
            {
            // InternalPascal.g:5344:1: ( ',' )
            // InternalPascal.g:5345:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_identifier_listAccess().getCommaKeyword_1_0()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:5354:1: rule__Variable_identifier_list__Group_1__1 : rule__Variable_identifier_list__Group_1__1__Impl ;
    public final void rule__Variable_identifier_list__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5358:1: ( rule__Variable_identifier_list__Group_1__1__Impl )
            // InternalPascal.g:5359:2: rule__Variable_identifier_list__Group_1__1__Impl
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
    // InternalPascal.g:5365:1: rule__Variable_identifier_list__Group_1__1__Impl : ( ( rule__Variable_identifier_list__NamesAssignment_1_1 ) ) ;
    public final void rule__Variable_identifier_list__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5369:1: ( ( ( rule__Variable_identifier_list__NamesAssignment_1_1 ) ) )
            // InternalPascal.g:5370:1: ( ( rule__Variable_identifier_list__NamesAssignment_1_1 ) )
            {
            // InternalPascal.g:5370:1: ( ( rule__Variable_identifier_list__NamesAssignment_1_1 ) )
            // InternalPascal.g:5371:2: ( rule__Variable_identifier_list__NamesAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariable_identifier_listAccess().getNamesAssignment_1_1()); 
            }
            // InternalPascal.g:5372:2: ( rule__Variable_identifier_list__NamesAssignment_1_1 )
            // InternalPascal.g:5372:3: rule__Variable_identifier_list__NamesAssignment_1_1
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
    // InternalPascal.g:5381:1: rule__While_statement__Group__0 : rule__While_statement__Group__0__Impl rule__While_statement__Group__1 ;
    public final void rule__While_statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5385:1: ( rule__While_statement__Group__0__Impl rule__While_statement__Group__1 )
            // InternalPascal.g:5386:2: rule__While_statement__Group__0__Impl rule__While_statement__Group__1
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
    // InternalPascal.g:5393:1: rule__While_statement__Group__0__Impl : ( 'while' ) ;
    public final void rule__While_statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5397:1: ( ( 'while' ) )
            // InternalPascal.g:5398:1: ( 'while' )
            {
            // InternalPascal.g:5398:1: ( 'while' )
            // InternalPascal.g:5399:2: 'while'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhile_statementAccess().getWhileKeyword_0()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:5408:1: rule__While_statement__Group__1 : rule__While_statement__Group__1__Impl rule__While_statement__Group__2 ;
    public final void rule__While_statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5412:1: ( rule__While_statement__Group__1__Impl rule__While_statement__Group__2 )
            // InternalPascal.g:5413:2: rule__While_statement__Group__1__Impl rule__While_statement__Group__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalPascal.g:5420:1: rule__While_statement__Group__1__Impl : ( ( rule__While_statement__ExpressionAssignment_1 ) ) ;
    public final void rule__While_statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5424:1: ( ( ( rule__While_statement__ExpressionAssignment_1 ) ) )
            // InternalPascal.g:5425:1: ( ( rule__While_statement__ExpressionAssignment_1 ) )
            {
            // InternalPascal.g:5425:1: ( ( rule__While_statement__ExpressionAssignment_1 ) )
            // InternalPascal.g:5426:2: ( rule__While_statement__ExpressionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhile_statementAccess().getExpressionAssignment_1()); 
            }
            // InternalPascal.g:5427:2: ( rule__While_statement__ExpressionAssignment_1 )
            // InternalPascal.g:5427:3: rule__While_statement__ExpressionAssignment_1
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
    // InternalPascal.g:5435:1: rule__While_statement__Group__2 : rule__While_statement__Group__2__Impl rule__While_statement__Group__3 ;
    public final void rule__While_statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5439:1: ( rule__While_statement__Group__2__Impl rule__While_statement__Group__3 )
            // InternalPascal.g:5440:2: rule__While_statement__Group__2__Impl rule__While_statement__Group__3
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
    // InternalPascal.g:5447:1: rule__While_statement__Group__2__Impl : ( 'do' ) ;
    public final void rule__While_statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5451:1: ( ( 'do' ) )
            // InternalPascal.g:5452:1: ( 'do' )
            {
            // InternalPascal.g:5452:1: ( 'do' )
            // InternalPascal.g:5453:2: 'do'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhile_statementAccess().getDoKeyword_2()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:5462:1: rule__While_statement__Group__3 : rule__While_statement__Group__3__Impl ;
    public final void rule__While_statement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5466:1: ( rule__While_statement__Group__3__Impl )
            // InternalPascal.g:5467:2: rule__While_statement__Group__3__Impl
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
    // InternalPascal.g:5473:1: rule__While_statement__Group__3__Impl : ( ( rule__While_statement__StatementAssignment_3 ) ) ;
    public final void rule__While_statement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5477:1: ( ( ( rule__While_statement__StatementAssignment_3 ) ) )
            // InternalPascal.g:5478:1: ( ( rule__While_statement__StatementAssignment_3 ) )
            {
            // InternalPascal.g:5478:1: ( ( rule__While_statement__StatementAssignment_3 ) )
            // InternalPascal.g:5479:2: ( rule__While_statement__StatementAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhile_statementAccess().getStatementAssignment_3()); 
            }
            // InternalPascal.g:5480:2: ( rule__While_statement__StatementAssignment_3 )
            // InternalPascal.g:5480:3: rule__While_statement__StatementAssignment_3
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
    // InternalPascal.g:5489:1: rule__Pascal__ProgramAssignment : ( ruleprogram ) ;
    public final void rule__Pascal__ProgramAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5493:1: ( ( ruleprogram ) )
            // InternalPascal.g:5494:2: ( ruleprogram )
            {
            // InternalPascal.g:5494:2: ( ruleprogram )
            // InternalPascal.g:5495:3: ruleprogram
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
    // InternalPascal.g:5504:1: rule__Program__HeadingAssignment_0 : ( ruleprogram_heading_block ) ;
    public final void rule__Program__HeadingAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5508:1: ( ( ruleprogram_heading_block ) )
            // InternalPascal.g:5509:2: ( ruleprogram_heading_block )
            {
            // InternalPascal.g:5509:2: ( ruleprogram_heading_block )
            // InternalPascal.g:5510:3: ruleprogram_heading_block
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
    // InternalPascal.g:5519:1: rule__Program__BlockAssignment_1 : ( ruleblock ) ;
    public final void rule__Program__BlockAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5523:1: ( ( ruleblock ) )
            // InternalPascal.g:5524:2: ( ruleblock )
            {
            // InternalPascal.g:5524:2: ( ruleblock )
            // InternalPascal.g:5525:3: ruleblock
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
    // InternalPascal.g:5534:1: rule__Program_heading_block__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Program_heading_block__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5538:1: ( ( RULE_ID ) )
            // InternalPascal.g:5539:2: ( RULE_ID )
            {
            // InternalPascal.g:5539:2: ( RULE_ID )
            // InternalPascal.g:5540:3: RULE_ID
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
    // InternalPascal.g:5549:1: rule__Block__LabelAssignment_0 : ( rulelabel_declaration ) ;
    public final void rule__Block__LabelAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5553:1: ( ( rulelabel_declaration ) )
            // InternalPascal.g:5554:2: ( rulelabel_declaration )
            {
            // InternalPascal.g:5554:2: ( rulelabel_declaration )
            // InternalPascal.g:5555:3: rulelabel_declaration
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
    // InternalPascal.g:5564:1: rule__Block__TypeAssignment_1 : ( ruletype_definition_part ) ;
    public final void rule__Block__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5568:1: ( ( ruletype_definition_part ) )
            // InternalPascal.g:5569:2: ( ruletype_definition_part )
            {
            // InternalPascal.g:5569:2: ( ruletype_definition_part )
            // InternalPascal.g:5570:3: ruletype_definition_part
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
    // InternalPascal.g:5579:1: rule__Block__VariableAssignment_2 : ( rulevariable_declaration_part ) ;
    public final void rule__Block__VariableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5583:1: ( ( rulevariable_declaration_part ) )
            // InternalPascal.g:5584:2: ( rulevariable_declaration_part )
            {
            // InternalPascal.g:5584:2: ( rulevariable_declaration_part )
            // InternalPascal.g:5585:3: rulevariable_declaration_part
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
    // InternalPascal.g:5594:1: rule__Block__ConstantAssignment_3 : ( ruleconstant_definition_part ) ;
    public final void rule__Block__ConstantAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5598:1: ( ( ruleconstant_definition_part ) )
            // InternalPascal.g:5599:2: ( ruleconstant_definition_part )
            {
            // InternalPascal.g:5599:2: ( ruleconstant_definition_part )
            // InternalPascal.g:5600:3: ruleconstant_definition_part
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
    // InternalPascal.g:5609:1: rule__Block__AbstractionAssignment_4 : ( rulefunction_procedure_declaration ) ;
    public final void rule__Block__AbstractionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5613:1: ( ( rulefunction_procedure_declaration ) )
            // InternalPascal.g:5614:2: ( rulefunction_procedure_declaration )
            {
            // InternalPascal.g:5614:2: ( rulefunction_procedure_declaration )
            // InternalPascal.g:5615:3: rulefunction_procedure_declaration
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
    // InternalPascal.g:5624:1: rule__Block__StatementAssignment_5 : ( rulestatement_part ) ;
    public final void rule__Block__StatementAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5628:1: ( ( rulestatement_part ) )
            // InternalPascal.g:5629:2: ( rulestatement_part )
            {
            // InternalPascal.g:5629:2: ( rulestatement_part )
            // InternalPascal.g:5630:3: rulestatement_part
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
    // InternalPascal.g:5639:1: rule__Statement_part__SequenceAssignment_1 : ( rulestatement_sequence ) ;
    public final void rule__Statement_part__SequenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5643:1: ( ( rulestatement_sequence ) )
            // InternalPascal.g:5644:2: ( rulestatement_sequence )
            {
            // InternalPascal.g:5644:2: ( rulestatement_sequence )
            // InternalPascal.g:5645:3: rulestatement_sequence
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
    // InternalPascal.g:5654:1: rule__Statement_sequence__StatementsAssignment_0 : ( rulestatement ) ;
    public final void rule__Statement_sequence__StatementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5658:1: ( ( rulestatement ) )
            // InternalPascal.g:5659:2: ( rulestatement )
            {
            // InternalPascal.g:5659:2: ( rulestatement )
            // InternalPascal.g:5660:3: rulestatement
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
    // InternalPascal.g:5669:1: rule__Statement_sequence__StatementsAssignment_1_1 : ( rulestatement ) ;
    public final void rule__Statement_sequence__StatementsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5673:1: ( ( rulestatement ) )
            // InternalPascal.g:5674:2: ( rulestatement )
            {
            // InternalPascal.g:5674:2: ( rulestatement )
            // InternalPascal.g:5675:3: rulestatement
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
    // InternalPascal.g:5684:1: rule__Statement__LabelAssignment_0_0 : ( rulelabel ) ;
    public final void rule__Statement__LabelAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5688:1: ( ( rulelabel ) )
            // InternalPascal.g:5689:2: ( rulelabel )
            {
            // InternalPascal.g:5689:2: ( rulelabel )
            // InternalPascal.g:5690:3: rulelabel
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
    // InternalPascal.g:5699:1: rule__Statement__SimpleAssignment_1_0 : ( rulesimple_statement ) ;
    public final void rule__Statement__SimpleAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5703:1: ( ( rulesimple_statement ) )
            // InternalPascal.g:5704:2: ( rulesimple_statement )
            {
            // InternalPascal.g:5704:2: ( rulesimple_statement )
            // InternalPascal.g:5705:3: rulesimple_statement
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
    // InternalPascal.g:5714:1: rule__Statement__StructuredAssignment_1_1 : ( rulestructured_statement ) ;
    public final void rule__Statement__StructuredAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5718:1: ( ( rulestructured_statement ) )
            // InternalPascal.g:5719:2: ( rulestructured_statement )
            {
            // InternalPascal.g:5719:2: ( rulestructured_statement )
            // InternalPascal.g:5720:3: rulestructured_statement
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
    // InternalPascal.g:5729:1: rule__Simple_statement__AssignmentAssignment_0 : ( ruleassignment_statement ) ;
    public final void rule__Simple_statement__AssignmentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5733:1: ( ( ruleassignment_statement ) )
            // InternalPascal.g:5734:2: ( ruleassignment_statement )
            {
            // InternalPascal.g:5734:2: ( ruleassignment_statement )
            // InternalPascal.g:5735:3: ruleassignment_statement
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
    // InternalPascal.g:5744:1: rule__Simple_statement__FunctionAssignment_1 : ( rulefunction_designator ) ;
    public final void rule__Simple_statement__FunctionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5748:1: ( ( rulefunction_designator ) )
            // InternalPascal.g:5749:2: ( rulefunction_designator )
            {
            // InternalPascal.g:5749:2: ( rulefunction_designator )
            // InternalPascal.g:5750:3: rulefunction_designator
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
    // InternalPascal.g:5759:1: rule__Simple_statement__Function_noargsAssignment_2 : ( RULE_ID ) ;
    public final void rule__Simple_statement__Function_noargsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5763:1: ( ( RULE_ID ) )
            // InternalPascal.g:5764:2: ( RULE_ID )
            {
            // InternalPascal.g:5764:2: ( RULE_ID )
            // InternalPascal.g:5765:3: RULE_ID
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
    // InternalPascal.g:5774:1: rule__Structured_statement__CompoundAssignment_0 : ( rulecompound_statement ) ;
    public final void rule__Structured_statement__CompoundAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5778:1: ( ( rulecompound_statement ) )
            // InternalPascal.g:5779:2: ( rulecompound_statement )
            {
            // InternalPascal.g:5779:2: ( rulecompound_statement )
            // InternalPascal.g:5780:3: rulecompound_statement
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
    // InternalPascal.g:5789:1: rule__Structured_statement__While_stmtAssignment_1 : ( rulewhile_statement ) ;
    public final void rule__Structured_statement__While_stmtAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5793:1: ( ( rulewhile_statement ) )
            // InternalPascal.g:5794:2: ( rulewhile_statement )
            {
            // InternalPascal.g:5794:2: ( rulewhile_statement )
            // InternalPascal.g:5795:3: rulewhile_statement
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
    // InternalPascal.g:5804:1: rule__Compound_statement__SequenceAssignment_1 : ( rulestatement_sequence ) ;
    public final void rule__Compound_statement__SequenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5808:1: ( ( rulestatement_sequence ) )
            // InternalPascal.g:5809:2: ( rulestatement_sequence )
            {
            // InternalPascal.g:5809:2: ( rulestatement_sequence )
            // InternalPascal.g:5810:3: rulestatement_sequence
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
    // InternalPascal.g:5819:1: rule__Assignment_statement__VariableAssignment_0 : ( rulevariable ) ;
    public final void rule__Assignment_statement__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5823:1: ( ( rulevariable ) )
            // InternalPascal.g:5824:2: ( rulevariable )
            {
            // InternalPascal.g:5824:2: ( rulevariable )
            // InternalPascal.g:5825:3: rulevariable
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
    // InternalPascal.g:5834:1: rule__Assignment_statement__ExpressionAssignment_2 : ( ruleexpression ) ;
    public final void rule__Assignment_statement__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5838:1: ( ( ruleexpression ) )
            // InternalPascal.g:5839:2: ( ruleexpression )
            {
            // InternalPascal.g:5839:2: ( ruleexpression )
            // InternalPascal.g:5840:3: ruleexpression
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
    // InternalPascal.g:5849:1: rule__Label__NumberAssignment_0 : ( RULE_SIGNED_INTEGER_NUMBER ) ;
    public final void rule__Label__NumberAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5853:1: ( ( RULE_SIGNED_INTEGER_NUMBER ) )
            // InternalPascal.g:5854:2: ( RULE_SIGNED_INTEGER_NUMBER )
            {
            // InternalPascal.g:5854:2: ( RULE_SIGNED_INTEGER_NUMBER )
            // InternalPascal.g:5855:3: RULE_SIGNED_INTEGER_NUMBER
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
    // InternalPascal.g:5864:1: rule__Label__NumberAssignment_1 : ( RULE_INTEGER_NUMBER ) ;
    public final void rule__Label__NumberAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5868:1: ( ( RULE_INTEGER_NUMBER ) )
            // InternalPascal.g:5869:2: ( RULE_INTEGER_NUMBER )
            {
            // InternalPascal.g:5869:2: ( RULE_INTEGER_NUMBER )
            // InternalPascal.g:5870:3: RULE_INTEGER_NUMBER
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


    // $ANTLR start "rule__Variable__NameAssignment"
    // InternalPascal.g:5879:1: rule__Variable__NameAssignment : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5883:1: ( ( RULE_ID ) )
            // InternalPascal.g:5884:2: ( RULE_ID )
            {
            // InternalPascal.g:5884:2: ( RULE_ID )
            // InternalPascal.g:5885:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__NameAssignment"


    // $ANTLR start "rule__Expression_list__ExpressionsAssignment_0"
    // InternalPascal.g:5894:1: rule__Expression_list__ExpressionsAssignment_0 : ( ruleexpression ) ;
    public final void rule__Expression_list__ExpressionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5898:1: ( ( ruleexpression ) )
            // InternalPascal.g:5899:2: ( ruleexpression )
            {
            // InternalPascal.g:5899:2: ( ruleexpression )
            // InternalPascal.g:5900:3: ruleexpression
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
    // InternalPascal.g:5909:1: rule__Expression_list__ExpressionsAssignment_1_1 : ( ruleexpression ) ;
    public final void rule__Expression_list__ExpressionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5913:1: ( ( ruleexpression ) )
            // InternalPascal.g:5914:2: ( ruleexpression )
            {
            // InternalPascal.g:5914:2: ( ruleexpression )
            // InternalPascal.g:5915:3: ruleexpression
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
    // InternalPascal.g:5924:1: rule__Expression__ExpressionsAssignment_0 : ( rulesimple_expression ) ;
    public final void rule__Expression__ExpressionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5928:1: ( ( rulesimple_expression ) )
            // InternalPascal.g:5929:2: ( rulesimple_expression )
            {
            // InternalPascal.g:5929:2: ( rulesimple_expression )
            // InternalPascal.g:5930:3: rulesimple_expression
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
    // InternalPascal.g:5939:1: rule__Expression__OperatorsAssignment_1_0_0 : ( RULE_RELATIONAL_OP ) ;
    public final void rule__Expression__OperatorsAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5943:1: ( ( RULE_RELATIONAL_OP ) )
            // InternalPascal.g:5944:2: ( RULE_RELATIONAL_OP )
            {
            // InternalPascal.g:5944:2: ( RULE_RELATIONAL_OP )
            // InternalPascal.g:5945:3: RULE_RELATIONAL_OP
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
    // InternalPascal.g:5954:1: rule__Expression__OperatorsAssignment_1_0_1 : ( ( 'in' ) ) ;
    public final void rule__Expression__OperatorsAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5958:1: ( ( ( 'in' ) ) )
            // InternalPascal.g:5959:2: ( ( 'in' ) )
            {
            // InternalPascal.g:5959:2: ( ( 'in' ) )
            // InternalPascal.g:5960:3: ( 'in' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getOperatorsInKeyword_1_0_1_0()); 
            }
            // InternalPascal.g:5961:3: ( 'in' )
            // InternalPascal.g:5962:4: 'in'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getOperatorsInKeyword_1_0_1_0()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:5973:1: rule__Expression__OperatorsAssignment_1_0_2 : ( ( '=' ) ) ;
    public final void rule__Expression__OperatorsAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5977:1: ( ( ( '=' ) ) )
            // InternalPascal.g:5978:2: ( ( '=' ) )
            {
            // InternalPascal.g:5978:2: ( ( '=' ) )
            // InternalPascal.g:5979:3: ( '=' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getOperatorsEqualsSignKeyword_1_0_2_0()); 
            }
            // InternalPascal.g:5980:3: ( '=' )
            // InternalPascal.g:5981:4: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getOperatorsEqualsSignKeyword_1_0_2_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:5992:1: rule__Expression__ExpressionsAssignment_1_1 : ( rulesimple_expression ) ;
    public final void rule__Expression__ExpressionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5996:1: ( ( rulesimple_expression ) )
            // InternalPascal.g:5997:2: ( rulesimple_expression )
            {
            // InternalPascal.g:5997:2: ( rulesimple_expression )
            // InternalPascal.g:5998:3: rulesimple_expression
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
    // InternalPascal.g:6007:1: rule__Simple_expression__PrefixOperatorAssignment_0 : ( RULE_ADDITION_OP ) ;
    public final void rule__Simple_expression__PrefixOperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6011:1: ( ( RULE_ADDITION_OP ) )
            // InternalPascal.g:6012:2: ( RULE_ADDITION_OP )
            {
            // InternalPascal.g:6012:2: ( RULE_ADDITION_OP )
            // InternalPascal.g:6013:3: RULE_ADDITION_OP
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
    // InternalPascal.g:6022:1: rule__Simple_expression__TermsAssignment_1 : ( ruleterm ) ;
    public final void rule__Simple_expression__TermsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6026:1: ( ( ruleterm ) )
            // InternalPascal.g:6027:2: ( ruleterm )
            {
            // InternalPascal.g:6027:2: ( ruleterm )
            // InternalPascal.g:6028:3: ruleterm
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
    // InternalPascal.g:6037:1: rule__Simple_expression__OperatorsAssignment_2_0_0_0 : ( RULE_ADDITION_OP ) ;
    public final void rule__Simple_expression__OperatorsAssignment_2_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6041:1: ( ( RULE_ADDITION_OP ) )
            // InternalPascal.g:6042:2: ( RULE_ADDITION_OP )
            {
            // InternalPascal.g:6042:2: ( RULE_ADDITION_OP )
            // InternalPascal.g:6043:3: RULE_ADDITION_OP
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
    // InternalPascal.g:6052:1: rule__Simple_expression__OperatorsAssignment_2_0_0_1 : ( ( 'or' ) ) ;
    public final void rule__Simple_expression__OperatorsAssignment_2_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6056:1: ( ( ( 'or' ) ) )
            // InternalPascal.g:6057:2: ( ( 'or' ) )
            {
            // InternalPascal.g:6057:2: ( ( 'or' ) )
            // InternalPascal.g:6058:3: ( 'or' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimple_expressionAccess().getOperatorsOrKeyword_2_0_0_1_0()); 
            }
            // InternalPascal.g:6059:3: ( 'or' )
            // InternalPascal.g:6060:4: 'or'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimple_expressionAccess().getOperatorsOrKeyword_2_0_0_1_0()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:6071:1: rule__Simple_expression__TermsAssignment_2_0_1 : ( ruleterm ) ;
    public final void rule__Simple_expression__TermsAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6075:1: ( ( ruleterm ) )
            // InternalPascal.g:6076:2: ( ruleterm )
            {
            // InternalPascal.g:6076:2: ( ruleterm )
            // InternalPascal.g:6077:3: ruleterm
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
    // InternalPascal.g:6086:1: rule__Simple_expression__TermsAssignment_2_1 : ( ruleunsigned_number ) ;
    public final void rule__Simple_expression__TermsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6090:1: ( ( ruleunsigned_number ) )
            // InternalPascal.g:6091:2: ( ruleunsigned_number )
            {
            // InternalPascal.g:6091:2: ( ruleunsigned_number )
            // InternalPascal.g:6092:3: ruleunsigned_number
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
    // InternalPascal.g:6101:1: rule__Term__FactorsAssignment_0 : ( rulefactor ) ;
    public final void rule__Term__FactorsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6105:1: ( ( rulefactor ) )
            // InternalPascal.g:6106:2: ( rulefactor )
            {
            // InternalPascal.g:6106:2: ( rulefactor )
            // InternalPascal.g:6107:3: rulefactor
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
    // InternalPascal.g:6116:1: rule__Term__OperatorsAssignment_1_0_0 : ( RULE_MULTIPLICATION_OP ) ;
    public final void rule__Term__OperatorsAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6120:1: ( ( RULE_MULTIPLICATION_OP ) )
            // InternalPascal.g:6121:2: ( RULE_MULTIPLICATION_OP )
            {
            // InternalPascal.g:6121:2: ( RULE_MULTIPLICATION_OP )
            // InternalPascal.g:6122:3: RULE_MULTIPLICATION_OP
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
    // InternalPascal.g:6131:1: rule__Term__OperatorsAssignment_1_0_1 : ( ( 'and' ) ) ;
    public final void rule__Term__OperatorsAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6135:1: ( ( ( 'and' ) ) )
            // InternalPascal.g:6136:2: ( ( 'and' ) )
            {
            // InternalPascal.g:6136:2: ( ( 'and' ) )
            // InternalPascal.g:6137:3: ( 'and' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getOperatorsAndKeyword_1_0_1_0()); 
            }
            // InternalPascal.g:6138:3: ( 'and' )
            // InternalPascal.g:6139:4: 'and'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getOperatorsAndKeyword_1_0_1_0()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getOperatorsAndKeyword_1_0_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getOperatorsAndKeyword_1_0_1_0()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Term__FactorsAssignment_1_1"
    // InternalPascal.g:6150:1: rule__Term__FactorsAssignment_1_1 : ( rulefactor ) ;
    public final void rule__Term__FactorsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6154:1: ( ( rulefactor ) )
            // InternalPascal.g:6155:2: ( rulefactor )
            {
            // InternalPascal.g:6155:2: ( rulefactor )
            // InternalPascal.g:6156:3: rulefactor
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
    // InternalPascal.g:6165:1: rule__Factor__VariableAssignment_0 : ( rulevariable ) ;
    public final void rule__Factor__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6169:1: ( ( rulevariable ) )
            // InternalPascal.g:6170:2: ( rulevariable )
            {
            // InternalPascal.g:6170:2: ( rulevariable )
            // InternalPascal.g:6171:3: rulevariable
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
    // InternalPascal.g:6180:1: rule__Factor__NumberAssignment_1 : ( rulenumber ) ;
    public final void rule__Factor__NumberAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6184:1: ( ( rulenumber ) )
            // InternalPascal.g:6185:2: ( rulenumber )
            {
            // InternalPascal.g:6185:2: ( rulenumber )
            // InternalPascal.g:6186:3: rulenumber
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
    // InternalPascal.g:6195:1: rule__Factor__StringAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Factor__StringAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6199:1: ( ( RULE_STRING ) )
            // InternalPascal.g:6200:2: ( RULE_STRING )
            {
            // InternalPascal.g:6200:2: ( RULE_STRING )
            // InternalPascal.g:6201:3: RULE_STRING
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


    // $ANTLR start "rule__Factor__BooleanAssignment_3"
    // InternalPascal.g:6210:1: rule__Factor__BooleanAssignment_3 : ( ( 'true' ) ) ;
    public final void rule__Factor__BooleanAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6214:1: ( ( ( 'true' ) ) )
            // InternalPascal.g:6215:2: ( ( 'true' ) )
            {
            // InternalPascal.g:6215:2: ( ( 'true' ) )
            // InternalPascal.g:6216:3: ( 'true' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getBooleanTrueKeyword_3_0()); 
            }
            // InternalPascal.g:6217:3: ( 'true' )
            // InternalPascal.g:6218:4: 'true'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getBooleanTrueKeyword_3_0()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorAccess().getBooleanTrueKeyword_3_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorAccess().getBooleanTrueKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__BooleanAssignment_3"


    // $ANTLR start "rule__Factor__BooleanAssignment_4"
    // InternalPascal.g:6229:1: rule__Factor__BooleanAssignment_4 : ( ( 'false' ) ) ;
    public final void rule__Factor__BooleanAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6233:1: ( ( ( 'false' ) ) )
            // InternalPascal.g:6234:2: ( ( 'false' ) )
            {
            // InternalPascal.g:6234:2: ( ( 'false' ) )
            // InternalPascal.g:6235:3: ( 'false' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getBooleanFalseKeyword_4_0()); 
            }
            // InternalPascal.g:6236:3: ( 'false' )
            // InternalPascal.g:6237:4: 'false'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getBooleanFalseKeyword_4_0()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorAccess().getBooleanFalseKeyword_4_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorAccess().getBooleanFalseKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__BooleanAssignment_4"


    // $ANTLR start "rule__Factor__FunctionAssignment_5"
    // InternalPascal.g:6248:1: rule__Factor__FunctionAssignment_5 : ( rulefunction_designator ) ;
    public final void rule__Factor__FunctionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6252:1: ( ( rulefunction_designator ) )
            // InternalPascal.g:6253:2: ( rulefunction_designator )
            {
            // InternalPascal.g:6253:2: ( rulefunction_designator )
            // InternalPascal.g:6254:3: rulefunction_designator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getFunctionFunction_designatorParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            rulefunction_designator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorAccess().getFunctionFunction_designatorParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__FunctionAssignment_5"


    // $ANTLR start "rule__Factor__ExpressionAssignment_6_1"
    // InternalPascal.g:6263:1: rule__Factor__ExpressionAssignment_6_1 : ( ruleexpression ) ;
    public final void rule__Factor__ExpressionAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6267:1: ( ( ruleexpression ) )
            // InternalPascal.g:6268:2: ( ruleexpression )
            {
            // InternalPascal.g:6268:2: ( ruleexpression )
            // InternalPascal.g:6269:3: ruleexpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getExpressionExpressionParserRuleCall_6_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleexpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorAccess().getExpressionExpressionParserRuleCall_6_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__ExpressionAssignment_6_1"


    // $ANTLR start "rule__Factor__NotAssignment_7_1"
    // InternalPascal.g:6278:1: rule__Factor__NotAssignment_7_1 : ( rulefactor ) ;
    public final void rule__Factor__NotAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6282:1: ( ( rulefactor ) )
            // InternalPascal.g:6283:2: ( rulefactor )
            {
            // InternalPascal.g:6283:2: ( rulefactor )
            // InternalPascal.g:6284:3: rulefactor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getNotFactorParserRuleCall_7_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulefactor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorAccess().getNotFactorParserRuleCall_7_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__NotAssignment_7_1"


    // $ANTLR start "rule__Factor__NilAssignment_8"
    // InternalPascal.g:6293:1: rule__Factor__NilAssignment_8 : ( ( 'nil' ) ) ;
    public final void rule__Factor__NilAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6297:1: ( ( ( 'nil' ) ) )
            // InternalPascal.g:6298:2: ( ( 'nil' ) )
            {
            // InternalPascal.g:6298:2: ( ( 'nil' ) )
            // InternalPascal.g:6299:3: ( 'nil' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getNilNilKeyword_8_0()); 
            }
            // InternalPascal.g:6300:3: ( 'nil' )
            // InternalPascal.g:6301:4: 'nil'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getNilNilKeyword_8_0()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorAccess().getNilNilKeyword_8_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorAccess().getNilNilKeyword_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__NilAssignment_8"


    // $ANTLR start "rule__Function_designator__NameAssignment_0"
    // InternalPascal.g:6312:1: rule__Function_designator__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Function_designator__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6316:1: ( ( RULE_ID ) )
            // InternalPascal.g:6317:2: ( RULE_ID )
            {
            // InternalPascal.g:6317:2: ( RULE_ID )
            // InternalPascal.g:6318:3: RULE_ID
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
    // InternalPascal.g:6327:1: rule__Function_designator__ExpressionsAssignment_2 : ( ruleexpression_list ) ;
    public final void rule__Function_designator__ExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6331:1: ( ( ruleexpression_list ) )
            // InternalPascal.g:6332:2: ( ruleexpression_list )
            {
            // InternalPascal.g:6332:2: ( ruleexpression_list )
            // InternalPascal.g:6333:3: ruleexpression_list
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


    // $ANTLR start "rule__Function_procedure_declaration__FunctionsAssignment_0_0"
    // InternalPascal.g:6342:1: rule__Function_procedure_declaration__FunctionsAssignment_0_0 : ( rulefunction_declaration ) ;
    public final void rule__Function_procedure_declaration__FunctionsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6346:1: ( ( rulefunction_declaration ) )
            // InternalPascal.g:6347:2: ( rulefunction_declaration )
            {
            // InternalPascal.g:6347:2: ( rulefunction_declaration )
            // InternalPascal.g:6348:3: rulefunction_declaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_procedure_declarationAccess().getFunctionsFunction_declarationParserRuleCall_0_0_0()); 
            }
            pushFollow(FOLLOW_2);
            rulefunction_declaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunction_procedure_declarationAccess().getFunctionsFunction_declarationParserRuleCall_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_procedure_declaration__FunctionsAssignment_0_0"


    // $ANTLR start "rule__Function_procedure_declaration__ProceduresAssignment_0_1"
    // InternalPascal.g:6357:1: rule__Function_procedure_declaration__ProceduresAssignment_0_1 : ( ruleprocedure_declaration ) ;
    public final void rule__Function_procedure_declaration__ProceduresAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6361:1: ( ( ruleprocedure_declaration ) )
            // InternalPascal.g:6362:2: ( ruleprocedure_declaration )
            {
            // InternalPascal.g:6362:2: ( ruleprocedure_declaration )
            // InternalPascal.g:6363:3: ruleprocedure_declaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunction_procedure_declarationAccess().getProceduresProcedure_declarationParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleprocedure_declaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunction_procedure_declarationAccess().getProceduresProcedure_declarationParserRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_procedure_declaration__ProceduresAssignment_0_1"


    // $ANTLR start "rule__Function_heading__NameAssignment_1"
    // InternalPascal.g:6372:1: rule__Function_heading__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Function_heading__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6376:1: ( ( RULE_ID ) )
            // InternalPascal.g:6377:2: ( RULE_ID )
            {
            // InternalPascal.g:6377:2: ( RULE_ID )
            // InternalPascal.g:6378:3: RULE_ID
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
    // InternalPascal.g:6387:1: rule__Function_heading__ParametersAssignment_2 : ( ruleformal_parameter_list ) ;
    public final void rule__Function_heading__ParametersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6391:1: ( ( ruleformal_parameter_list ) )
            // InternalPascal.g:6392:2: ( ruleformal_parameter_list )
            {
            // InternalPascal.g:6392:2: ( ruleformal_parameter_list )
            // InternalPascal.g:6393:3: ruleformal_parameter_list
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
    // InternalPascal.g:6402:1: rule__Function_heading__ReturnTypeAssignment_4 : ( RULE_ID ) ;
    public final void rule__Function_heading__ReturnTypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6406:1: ( ( RULE_ID ) )
            // InternalPascal.g:6407:2: ( RULE_ID )
            {
            // InternalPascal.g:6407:2: ( RULE_ID )
            // InternalPascal.g:6408:3: RULE_ID
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
    // InternalPascal.g:6417:1: rule__Function_declaration__HeadingAssignment_0 : ( rulefunction_heading ) ;
    public final void rule__Function_declaration__HeadingAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6421:1: ( ( rulefunction_heading ) )
            // InternalPascal.g:6422:2: ( rulefunction_heading )
            {
            // InternalPascal.g:6422:2: ( rulefunction_heading )
            // InternalPascal.g:6423:3: rulefunction_heading
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
    // InternalPascal.g:6432:1: rule__Function_declaration__BlockAssignment_2 : ( ruleblock ) ;
    public final void rule__Function_declaration__BlockAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6436:1: ( ( ruleblock ) )
            // InternalPascal.g:6437:2: ( ruleblock )
            {
            // InternalPascal.g:6437:2: ( ruleblock )
            // InternalPascal.g:6438:3: ruleblock
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


    // $ANTLR start "rule__Procedure_declaration__HeadingAssignment_0"
    // InternalPascal.g:6447:1: rule__Procedure_declaration__HeadingAssignment_0 : ( ruleprocedure_heading ) ;
    public final void rule__Procedure_declaration__HeadingAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6451:1: ( ( ruleprocedure_heading ) )
            // InternalPascal.g:6452:2: ( ruleprocedure_heading )
            {
            // InternalPascal.g:6452:2: ( ruleprocedure_heading )
            // InternalPascal.g:6453:3: ruleprocedure_heading
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
    // InternalPascal.g:6462:1: rule__Procedure_declaration__BlockAssignment_2 : ( ruleblock ) ;
    public final void rule__Procedure_declaration__BlockAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6466:1: ( ( ruleblock ) )
            // InternalPascal.g:6467:2: ( ruleblock )
            {
            // InternalPascal.g:6467:2: ( ruleblock )
            // InternalPascal.g:6468:3: ruleblock
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
    // InternalPascal.g:6477:1: rule__Procedure_heading__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Procedure_heading__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6481:1: ( ( RULE_ID ) )
            // InternalPascal.g:6482:2: ( RULE_ID )
            {
            // InternalPascal.g:6482:2: ( RULE_ID )
            // InternalPascal.g:6483:3: RULE_ID
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
    // InternalPascal.g:6492:1: rule__Procedure_heading__ParametersAssignment_2 : ( ruleformal_parameter_list ) ;
    public final void rule__Procedure_heading__ParametersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6496:1: ( ( ruleformal_parameter_list ) )
            // InternalPascal.g:6497:2: ( ruleformal_parameter_list )
            {
            // InternalPascal.g:6497:2: ( ruleformal_parameter_list )
            // InternalPascal.g:6498:3: ruleformal_parameter_list
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
    // InternalPascal.g:6507:1: rule__Formal_parameter_list__ParametersAssignment_1 : ( ruleformal_parameter_section ) ;
    public final void rule__Formal_parameter_list__ParametersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6511:1: ( ( ruleformal_parameter_section ) )
            // InternalPascal.g:6512:2: ( ruleformal_parameter_section )
            {
            // InternalPascal.g:6512:2: ( ruleformal_parameter_section )
            // InternalPascal.g:6513:3: ruleformal_parameter_section
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
    // InternalPascal.g:6522:1: rule__Formal_parameter_list__ParametersAssignment_2_1 : ( ruleformal_parameter_section ) ;
    public final void rule__Formal_parameter_list__ParametersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6526:1: ( ( ruleformal_parameter_section ) )
            // InternalPascal.g:6527:2: ( ruleformal_parameter_section )
            {
            // InternalPascal.g:6527:2: ( ruleformal_parameter_section )
            // InternalPascal.g:6528:3: ruleformal_parameter_section
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
    // InternalPascal.g:6537:1: rule__Formal_parameter_section__ValueAssignment_0 : ( rulevalue_parameter_section ) ;
    public final void rule__Formal_parameter_section__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6541:1: ( ( rulevalue_parameter_section ) )
            // InternalPascal.g:6542:2: ( rulevalue_parameter_section )
            {
            // InternalPascal.g:6542:2: ( rulevalue_parameter_section )
            // InternalPascal.g:6543:3: rulevalue_parameter_section
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
    // InternalPascal.g:6552:1: rule__Formal_parameter_section__VariableAssignment_1 : ( rulevariable_parameter_section ) ;
    public final void rule__Formal_parameter_section__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6556:1: ( ( rulevariable_parameter_section ) )
            // InternalPascal.g:6557:2: ( rulevariable_parameter_section )
            {
            // InternalPascal.g:6557:2: ( rulevariable_parameter_section )
            // InternalPascal.g:6558:3: rulevariable_parameter_section
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
    // InternalPascal.g:6567:1: rule__Formal_parameter_section__ProcedureAssignment_2 : ( ruleprocedure_heading ) ;
    public final void rule__Formal_parameter_section__ProcedureAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6571:1: ( ( ruleprocedure_heading ) )
            // InternalPascal.g:6572:2: ( ruleprocedure_heading )
            {
            // InternalPascal.g:6572:2: ( ruleprocedure_heading )
            // InternalPascal.g:6573:3: ruleprocedure_heading
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
    // InternalPascal.g:6582:1: rule__Formal_parameter_section__FunctionAssignment_3 : ( rulefunction_heading ) ;
    public final void rule__Formal_parameter_section__FunctionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6586:1: ( ( rulefunction_heading ) )
            // InternalPascal.g:6587:2: ( rulefunction_heading )
            {
            // InternalPascal.g:6587:2: ( rulefunction_heading )
            // InternalPascal.g:6588:3: rulefunction_heading
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
    // InternalPascal.g:6597:1: rule__Value_parameter_section__IdentifiersAssignment_0 : ( ruleidentifier_list ) ;
    public final void rule__Value_parameter_section__IdentifiersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6601:1: ( ( ruleidentifier_list ) )
            // InternalPascal.g:6602:2: ( ruleidentifier_list )
            {
            // InternalPascal.g:6602:2: ( ruleidentifier_list )
            // InternalPascal.g:6603:3: ruleidentifier_list
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
    // InternalPascal.g:6612:1: rule__Value_parameter_section__TypeAssignment_2 : ( ruleparameter_type ) ;
    public final void rule__Value_parameter_section__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6616:1: ( ( ruleparameter_type ) )
            // InternalPascal.g:6617:2: ( ruleparameter_type )
            {
            // InternalPascal.g:6617:2: ( ruleparameter_type )
            // InternalPascal.g:6618:3: ruleparameter_type
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
    // InternalPascal.g:6627:1: rule__Identifier_list__NamesAssignment_0 : ( RULE_ID ) ;
    public final void rule__Identifier_list__NamesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6631:1: ( ( RULE_ID ) )
            // InternalPascal.g:6632:2: ( RULE_ID )
            {
            // InternalPascal.g:6632:2: ( RULE_ID )
            // InternalPascal.g:6633:3: RULE_ID
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
    // InternalPascal.g:6642:1: rule__Identifier_list__NamesAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Identifier_list__NamesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6646:1: ( ( RULE_ID ) )
            // InternalPascal.g:6647:2: ( RULE_ID )
            {
            // InternalPascal.g:6647:2: ( RULE_ID )
            // InternalPascal.g:6648:3: RULE_ID
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
    // InternalPascal.g:6657:1: rule__Parameter_type__NameAssignment : ( RULE_ID ) ;
    public final void rule__Parameter_type__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6661:1: ( ( RULE_ID ) )
            // InternalPascal.g:6662:2: ( RULE_ID )
            {
            // InternalPascal.g:6662:2: ( RULE_ID )
            // InternalPascal.g:6663:3: RULE_ID
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
    // InternalPascal.g:6672:1: rule__Variable_parameter_section__IndentifiersAssignment_1 : ( ruleidentifier_list ) ;
    public final void rule__Variable_parameter_section__IndentifiersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6676:1: ( ( ruleidentifier_list ) )
            // InternalPascal.g:6677:2: ( ruleidentifier_list )
            {
            // InternalPascal.g:6677:2: ( ruleidentifier_list )
            // InternalPascal.g:6678:3: ruleidentifier_list
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
    // InternalPascal.g:6687:1: rule__Variable_parameter_section__TypeAssignment_3 : ( ruleparameter_type ) ;
    public final void rule__Variable_parameter_section__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6691:1: ( ( ruleparameter_type ) )
            // InternalPascal.g:6692:2: ( ruleparameter_type )
            {
            // InternalPascal.g:6692:2: ( ruleparameter_type )
            // InternalPascal.g:6693:3: ruleparameter_type
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


    // $ANTLR start "rule__Number__NumberAssignment"
    // InternalPascal.g:6702:1: rule__Number__NumberAssignment : ( ruleany_number ) ;
    public final void rule__Number__NumberAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6706:1: ( ( ruleany_number ) )
            // InternalPascal.g:6707:2: ( ruleany_number )
            {
            // InternalPascal.g:6707:2: ( ruleany_number )
            // InternalPascal.g:6708:3: ruleany_number
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
    // InternalPascal.g:6717:1: rule__Label_declaration__LabelsAssignment_1 : ( rulelabel ) ;
    public final void rule__Label_declaration__LabelsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6721:1: ( ( rulelabel ) )
            // InternalPascal.g:6722:2: ( rulelabel )
            {
            // InternalPascal.g:6722:2: ( rulelabel )
            // InternalPascal.g:6723:3: rulelabel
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
    // InternalPascal.g:6732:1: rule__Label_declaration__LabelsAssignment_2_1 : ( rulelabel ) ;
    public final void rule__Label_declaration__LabelsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6736:1: ( ( rulelabel ) )
            // InternalPascal.g:6737:2: ( rulelabel )
            {
            // InternalPascal.g:6737:2: ( rulelabel )
            // InternalPascal.g:6738:3: rulelabel
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
    // InternalPascal.g:6747:1: rule__Constant__OpteratorAssignment_0_0 : ( RULE_ADDITION_OP ) ;
    public final void rule__Constant__OpteratorAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6751:1: ( ( RULE_ADDITION_OP ) )
            // InternalPascal.g:6752:2: ( RULE_ADDITION_OP )
            {
            // InternalPascal.g:6752:2: ( RULE_ADDITION_OP )
            // InternalPascal.g:6753:3: RULE_ADDITION_OP
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
    // InternalPascal.g:6762:1: rule__Constant__NameAssignment_0_1_0 : ( RULE_ID ) ;
    public final void rule__Constant__NameAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6766:1: ( ( RULE_ID ) )
            // InternalPascal.g:6767:2: ( RULE_ID )
            {
            // InternalPascal.g:6767:2: ( RULE_ID )
            // InternalPascal.g:6768:3: RULE_ID
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
    // InternalPascal.g:6777:1: rule__Constant__NumberAssignment_0_1_1 : ( rulenumber ) ;
    public final void rule__Constant__NumberAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6781:1: ( ( rulenumber ) )
            // InternalPascal.g:6782:2: ( rulenumber )
            {
            // InternalPascal.g:6782:2: ( rulenumber )
            // InternalPascal.g:6783:3: rulenumber
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
    // InternalPascal.g:6792:1: rule__Constant__StringAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Constant__StringAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6796:1: ( ( RULE_STRING ) )
            // InternalPascal.g:6797:2: ( RULE_STRING )
            {
            // InternalPascal.g:6797:2: ( RULE_STRING )
            // InternalPascal.g:6798:3: RULE_STRING
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
    // InternalPascal.g:6807:1: rule__Constant__BoolLiteralAssignment_2 : ( ( 'true' ) ) ;
    public final void rule__Constant__BoolLiteralAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6811:1: ( ( ( 'true' ) ) )
            // InternalPascal.g:6812:2: ( ( 'true' ) )
            {
            // InternalPascal.g:6812:2: ( ( 'true' ) )
            // InternalPascal.g:6813:3: ( 'true' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getBoolLiteralTrueKeyword_2_0()); 
            }
            // InternalPascal.g:6814:3: ( 'true' )
            // InternalPascal.g:6815:4: 'true'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getBoolLiteralTrueKeyword_2_0()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:6826:1: rule__Constant__BoolLiteralAssignment_3 : ( ( 'false' ) ) ;
    public final void rule__Constant__BoolLiteralAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6830:1: ( ( ( 'false' ) ) )
            // InternalPascal.g:6831:2: ( ( 'false' ) )
            {
            // InternalPascal.g:6831:2: ( ( 'false' ) )
            // InternalPascal.g:6832:3: ( 'false' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getBoolLiteralFalseKeyword_3_0()); 
            }
            // InternalPascal.g:6833:3: ( 'false' )
            // InternalPascal.g:6834:4: 'false'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getBoolLiteralFalseKeyword_3_0()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__Constant__NilAssignment_4"
    // InternalPascal.g:6845:1: rule__Constant__NilAssignment_4 : ( ( 'nil' ) ) ;
    public final void rule__Constant__NilAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6849:1: ( ( ( 'nil' ) ) )
            // InternalPascal.g:6850:2: ( ( 'nil' ) )
            {
            // InternalPascal.g:6850:2: ( ( 'nil' ) )
            // InternalPascal.g:6851:3: ( 'nil' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getNilNilKeyword_4_0()); 
            }
            // InternalPascal.g:6852:3: ( 'nil' )
            // InternalPascal.g:6853:4: 'nil'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getNilNilKeyword_4_0()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getNilNilKeyword_4_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getNilNilKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__NilAssignment_4"


    // $ANTLR start "rule__Constant_definition_part__ConstsAssignment_1_0"
    // InternalPascal.g:6864:1: rule__Constant_definition_part__ConstsAssignment_1_0 : ( ruleconstant_definition ) ;
    public final void rule__Constant_definition_part__ConstsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6868:1: ( ( ruleconstant_definition ) )
            // InternalPascal.g:6869:2: ( ruleconstant_definition )
            {
            // InternalPascal.g:6869:2: ( ruleconstant_definition )
            // InternalPascal.g:6870:3: ruleconstant_definition
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
    // InternalPascal.g:6879:1: rule__Constant_definition__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Constant_definition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6883:1: ( ( RULE_ID ) )
            // InternalPascal.g:6884:2: ( RULE_ID )
            {
            // InternalPascal.g:6884:2: ( RULE_ID )
            // InternalPascal.g:6885:3: RULE_ID
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
    // InternalPascal.g:6894:1: rule__Constant_definition__ConstAssignment_2 : ( ruleconstant ) ;
    public final void rule__Constant_definition__ConstAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6898:1: ( ( ruleconstant ) )
            // InternalPascal.g:6899:2: ( ruleconstant )
            {
            // InternalPascal.g:6899:2: ( ruleconstant )
            // InternalPascal.g:6900:3: ruleconstant
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
    // InternalPascal.g:6909:1: rule__Type_definition_part__TypesAssignment_1_0 : ( ruletype_definition ) ;
    public final void rule__Type_definition_part__TypesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6913:1: ( ( ruletype_definition ) )
            // InternalPascal.g:6914:2: ( ruletype_definition )
            {
            // InternalPascal.g:6914:2: ( ruletype_definition )
            // InternalPascal.g:6915:3: ruletype_definition
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
    // InternalPascal.g:6924:1: rule__Type_definition__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Type_definition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6928:1: ( ( RULE_ID ) )
            // InternalPascal.g:6929:2: ( RULE_ID )
            {
            // InternalPascal.g:6929:2: ( RULE_ID )
            // InternalPascal.g:6930:3: RULE_ID
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
    // InternalPascal.g:6939:1: rule__Type_definition__TypeAssignment_2 : ( ruletype ) ;
    public final void rule__Type_definition__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6943:1: ( ( ruletype ) )
            // InternalPascal.g:6944:2: ( ruletype )
            {
            // InternalPascal.g:6944:2: ( ruletype )
            // InternalPascal.g:6945:3: ruletype
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
    // InternalPascal.g:6954:1: rule__Type__SimpleAssignment_0 : ( rulesimple_type ) ;
    public final void rule__Type__SimpleAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6958:1: ( ( rulesimple_type ) )
            // InternalPascal.g:6959:2: ( rulesimple_type )
            {
            // InternalPascal.g:6959:2: ( rulesimple_type )
            // InternalPascal.g:6960:3: rulesimple_type
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
    // InternalPascal.g:6969:1: rule__Type__StructuredAssignment_1 : ( rulestructured_type ) ;
    public final void rule__Type__StructuredAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6973:1: ( ( rulestructured_type ) )
            // InternalPascal.g:6974:2: ( rulestructured_type )
            {
            // InternalPascal.g:6974:2: ( rulestructured_type )
            // InternalPascal.g:6975:3: rulestructured_type
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


    // $ANTLR start "rule__Simple_type__NameAssignment"
    // InternalPascal.g:6984:1: rule__Simple_type__NameAssignment : ( RULE_ID ) ;
    public final void rule__Simple_type__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6988:1: ( ( RULE_ID ) )
            // InternalPascal.g:6989:2: ( RULE_ID )
            {
            // InternalPascal.g:6989:2: ( RULE_ID )
            // InternalPascal.g:6990:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimple_typeAccess().getNameIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimple_typeAccess().getNameIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_type__NameAssignment"


    // $ANTLR start "rule__Structured_type__TypeAssignment"
    // InternalPascal.g:6999:1: rule__Structured_type__TypeAssignment : ( ruleunpacked_structured_type ) ;
    public final void rule__Structured_type__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7003:1: ( ( ruleunpacked_structured_type ) )
            // InternalPascal.g:7004:2: ( ruleunpacked_structured_type )
            {
            // InternalPascal.g:7004:2: ( ruleunpacked_structured_type )
            // InternalPascal.g:7005:3: ruleunpacked_structured_type
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStructured_typeAccess().getTypeUnpacked_structured_typeParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleunpacked_structured_type();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStructured_typeAccess().getTypeUnpacked_structured_typeParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structured_type__TypeAssignment"


    // $ANTLR start "rule__Unpacked_structured_type__RecordAssignment"
    // InternalPascal.g:7014:1: rule__Unpacked_structured_type__RecordAssignment : ( rulerecord_type ) ;
    public final void rule__Unpacked_structured_type__RecordAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7018:1: ( ( rulerecord_type ) )
            // InternalPascal.g:7019:2: ( rulerecord_type )
            {
            // InternalPascal.g:7019:2: ( rulerecord_type )
            // InternalPascal.g:7020:3: rulerecord_type
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
    // InternalPascal.g:7029:1: rule__Record_type__RecordKeywordAssignment_0 : ( ( 'record' ) ) ;
    public final void rule__Record_type__RecordKeywordAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7033:1: ( ( ( 'record' ) ) )
            // InternalPascal.g:7034:2: ( ( 'record' ) )
            {
            // InternalPascal.g:7034:2: ( ( 'record' ) )
            // InternalPascal.g:7035:3: ( 'record' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecord_typeAccess().getRecordKeywordRecordKeyword_0_0()); 
            }
            // InternalPascal.g:7036:3: ( 'record' )
            // InternalPascal.g:7037:4: 'record'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecord_typeAccess().getRecordKeywordRecordKeyword_0_0()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
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
    // InternalPascal.g:7048:1: rule__Record_type__FieldsAssignment_1 : ( rulefield_list ) ;
    public final void rule__Record_type__FieldsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7052:1: ( ( rulefield_list ) )
            // InternalPascal.g:7053:2: ( rulefield_list )
            {
            // InternalPascal.g:7053:2: ( rulefield_list )
            // InternalPascal.g:7054:3: rulefield_list
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
    // InternalPascal.g:7063:1: rule__Record_type__EndKeywordAssignment_2 : ( ( 'end' ) ) ;
    public final void rule__Record_type__EndKeywordAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7067:1: ( ( ( 'end' ) ) )
            // InternalPascal.g:7068:2: ( ( 'end' ) )
            {
            // InternalPascal.g:7068:2: ( ( 'end' ) )
            // InternalPascal.g:7069:3: ( 'end' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecord_typeAccess().getEndKeywordEndKeyword_2_0()); 
            }
            // InternalPascal.g:7070:3: ( 'end' )
            // InternalPascal.g:7071:4: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecord_typeAccess().getEndKeywordEndKeyword_2_0()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__Field_list__SectionsAssignment_0"
    // InternalPascal.g:7082:1: rule__Field_list__SectionsAssignment_0 : ( rulerecord_section ) ;
    public final void rule__Field_list__SectionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7086:1: ( ( rulerecord_section ) )
            // InternalPascal.g:7087:2: ( rulerecord_section )
            {
            // InternalPascal.g:7087:2: ( rulerecord_section )
            // InternalPascal.g:7088:3: rulerecord_section
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_listAccess().getSectionsRecord_sectionParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            rulerecord_section();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getField_listAccess().getSectionsRecord_sectionParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field_list__SectionsAssignment_0"


    // $ANTLR start "rule__Field_list__SectionsAssignment_1_1"
    // InternalPascal.g:7097:1: rule__Field_list__SectionsAssignment_1_1 : ( rulerecord_section ) ;
    public final void rule__Field_list__SectionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7101:1: ( ( rulerecord_section ) )
            // InternalPascal.g:7102:2: ( rulerecord_section )
            {
            // InternalPascal.g:7102:2: ( rulerecord_section )
            // InternalPascal.g:7103:3: rulerecord_section
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getField_listAccess().getSectionsRecord_sectionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulerecord_section();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getField_listAccess().getSectionsRecord_sectionParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field_list__SectionsAssignment_1_1"


    // $ANTLR start "rule__Record_section__IdentifiersAssignment_0"
    // InternalPascal.g:7112:1: rule__Record_section__IdentifiersAssignment_0 : ( ruleidentifier_list ) ;
    public final void rule__Record_section__IdentifiersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7116:1: ( ( ruleidentifier_list ) )
            // InternalPascal.g:7117:2: ( ruleidentifier_list )
            {
            // InternalPascal.g:7117:2: ( ruleidentifier_list )
            // InternalPascal.g:7118:3: ruleidentifier_list
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
    // InternalPascal.g:7127:1: rule__Record_section__TypeAssignment_2 : ( ruletype ) ;
    public final void rule__Record_section__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7131:1: ( ( ruletype ) )
            // InternalPascal.g:7132:2: ( ruletype )
            {
            // InternalPascal.g:7132:2: ( ruletype )
            // InternalPascal.g:7133:3: ruletype
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


    // $ANTLR start "rule__Signed_number__IntegerAssignment_0"
    // InternalPascal.g:7142:1: rule__Signed_number__IntegerAssignment_0 : ( RULE_SIGNED_INTEGER_NUMBER ) ;
    public final void rule__Signed_number__IntegerAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7146:1: ( ( RULE_SIGNED_INTEGER_NUMBER ) )
            // InternalPascal.g:7147:2: ( RULE_SIGNED_INTEGER_NUMBER )
            {
            // InternalPascal.g:7147:2: ( RULE_SIGNED_INTEGER_NUMBER )
            // InternalPascal.g:7148:3: RULE_SIGNED_INTEGER_NUMBER
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
    // InternalPascal.g:7157:1: rule__Signed_number__RealAssignment_1 : ( RULE_SIGNED_REAL_NUMBER ) ;
    public final void rule__Signed_number__RealAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7161:1: ( ( RULE_SIGNED_REAL_NUMBER ) )
            // InternalPascal.g:7162:2: ( RULE_SIGNED_REAL_NUMBER )
            {
            // InternalPascal.g:7162:2: ( RULE_SIGNED_REAL_NUMBER )
            // InternalPascal.g:7163:3: RULE_SIGNED_REAL_NUMBER
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
    // InternalPascal.g:7172:1: rule__Unsigned_number__IntegerAssignment_0 : ( RULE_INTEGER_NUMBER ) ;
    public final void rule__Unsigned_number__IntegerAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7176:1: ( ( RULE_INTEGER_NUMBER ) )
            // InternalPascal.g:7177:2: ( RULE_INTEGER_NUMBER )
            {
            // InternalPascal.g:7177:2: ( RULE_INTEGER_NUMBER )
            // InternalPascal.g:7178:3: RULE_INTEGER_NUMBER
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
    // InternalPascal.g:7187:1: rule__Unsigned_number__RealAssignment_1 : ( RULE_REAL_NUMBER ) ;
    public final void rule__Unsigned_number__RealAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7191:1: ( ( RULE_REAL_NUMBER ) )
            // InternalPascal.g:7192:2: ( RULE_REAL_NUMBER )
            {
            // InternalPascal.g:7192:2: ( RULE_REAL_NUMBER )
            // InternalPascal.g:7193:3: RULE_REAL_NUMBER
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
    // InternalPascal.g:7202:1: rule__Variable_declaration_part__SectionsAssignment_1 : ( rulevariable_section ) ;
    public final void rule__Variable_declaration_part__SectionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7206:1: ( ( rulevariable_section ) )
            // InternalPascal.g:7207:2: ( rulevariable_section )
            {
            // InternalPascal.g:7207:2: ( rulevariable_section )
            // InternalPascal.g:7208:3: rulevariable_section
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
    // InternalPascal.g:7217:1: rule__Variable_declaration_part__SectionsAssignment_3_0 : ( rulevariable_section ) ;
    public final void rule__Variable_declaration_part__SectionsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7221:1: ( ( rulevariable_section ) )
            // InternalPascal.g:7222:2: ( rulevariable_section )
            {
            // InternalPascal.g:7222:2: ( rulevariable_section )
            // InternalPascal.g:7223:3: rulevariable_section
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
    // InternalPascal.g:7232:1: rule__Variable_section__IdentifiersAssignment_0 : ( rulevariable_identifier_list ) ;
    public final void rule__Variable_section__IdentifiersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7236:1: ( ( rulevariable_identifier_list ) )
            // InternalPascal.g:7237:2: ( rulevariable_identifier_list )
            {
            // InternalPascal.g:7237:2: ( rulevariable_identifier_list )
            // InternalPascal.g:7238:3: rulevariable_identifier_list
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
    // InternalPascal.g:7247:1: rule__Variable_section__TypeAssignment_2 : ( ruletype ) ;
    public final void rule__Variable_section__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7251:1: ( ( ruletype ) )
            // InternalPascal.g:7252:2: ( ruletype )
            {
            // InternalPascal.g:7252:2: ( ruletype )
            // InternalPascal.g:7253:3: ruletype
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
    // InternalPascal.g:7262:1: rule__Variable_identifier_list__NamesAssignment_0 : ( RULE_ID ) ;
    public final void rule__Variable_identifier_list__NamesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7266:1: ( ( RULE_ID ) )
            // InternalPascal.g:7267:2: ( RULE_ID )
            {
            // InternalPascal.g:7267:2: ( RULE_ID )
            // InternalPascal.g:7268:3: RULE_ID
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
    // InternalPascal.g:7277:1: rule__Variable_identifier_list__NamesAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Variable_identifier_list__NamesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7281:1: ( ( RULE_ID ) )
            // InternalPascal.g:7282:2: ( RULE_ID )
            {
            // InternalPascal.g:7282:2: ( RULE_ID )
            // InternalPascal.g:7283:3: RULE_ID
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
    // InternalPascal.g:7292:1: rule__While_statement__ExpressionAssignment_1 : ( ruleexpression ) ;
    public final void rule__While_statement__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7296:1: ( ( ruleexpression ) )
            // InternalPascal.g:7297:2: ( ruleexpression )
            {
            // InternalPascal.g:7297:2: ( ruleexpression )
            // InternalPascal.g:7298:3: ruleexpression
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
    // InternalPascal.g:7307:1: rule__While_statement__StatementAssignment_3 : ( rulestatement_sequence ) ;
    public final void rule__While_statement__StatementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7311:1: ( ( rulestatement_sequence ) )
            // InternalPascal.g:7312:2: ( rulestatement_sequence )
            {
            // InternalPascal.g:7312:2: ( rulestatement_sequence )
            // InternalPascal.g:7313:3: rulestatement_sequence
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

    // $ANTLR start synpred39_InternalPascal
    public final void synpred39_InternalPascal_fragment() throws RecognitionException {   
        // InternalPascal.g:2226:3: ( rule__Statement_sequence__Group_1__0 )
        // InternalPascal.g:2226:3: rule__Statement_sequence__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__Statement_sequence__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred39_InternalPascal

    // Delegated rules

    public final boolean synpred39_InternalPascal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_InternalPascal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\uffff\1\12\11\uffff";
    static final String dfa_3s = "\1\4\1\6\11\uffff";
    static final String dfa_4s = "\1\54\1\51\11\uffff";
    static final String dfa_5s = "\2\uffff\1\2\1\3\1\4\1\5\1\7\1\10\1\11\1\6\1\1";
    static final String dfa_6s = "\13\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\2\2\3\uffff\1\3\2\2\16\uffff\1\6\1\uffff\1\7\14\uffff\1\4\1\5\1\10",
            "\4\12\2\uffff\1\12\10\uffff\1\12\1\uffff\1\12\2\uffff\1\12\1\11\1\12\6\uffff\1\12\2\uffff\4\12",
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
            return "1515:1: rule__Factor__Alternatives : ( ( ( rule__Factor__VariableAssignment_0 ) ) | ( ( rule__Factor__NumberAssignment_1 ) ) | ( ( rule__Factor__StringAssignment_2 ) ) | ( ( rule__Factor__BooleanAssignment_3 ) ) | ( ( rule__Factor__BooleanAssignment_4 ) ) | ( ( rule__Factor__FunctionAssignment_5 ) ) | ( ( rule__Factor__Group_6__0 ) ) | ( ( rule__Factor__Group_7__0 ) ) | ( ( rule__Factor__NilAssignment_8 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000017C0400000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000002000400070L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00001C0028001D70L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000008800000080L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000010000001140L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000010000001142L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000020000000200L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000020000000202L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00001C0038001D70L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000009000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000001C0000010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010200000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000004200000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000001870L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00001C0000001D70L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000200000000010L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000004000000000L});

}