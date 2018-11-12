package org.xtext.example.pascal.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPascalLexer extends Lexer {
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

    public InternalPascalLexer() {;} 
    public InternalPascalLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalPascalLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalPascal.g"; }

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:11:7: ( '.' )
            // InternalPascal.g:11:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:12:7: ( 'program' )
            // InternalPascal.g:12:9: 'program'
            {
            match("program"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:13:7: ( ';' )
            // InternalPascal.g:13:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:14:7: ( 'begin' )
            // InternalPascal.g:14:9: 'begin'
            {
            match("begin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:15:7: ( 'end' )
            // InternalPascal.g:15:9: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:16:7: ( ':' )
            // InternalPascal.g:16:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:17:7: ( ':=' )
            // InternalPascal.g:17:9: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:18:7: ( '[' )
            // InternalPascal.g:18:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:19:7: ( ']' )
            // InternalPascal.g:19:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:20:7: ( '^' )
            // InternalPascal.g:20:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:21:7: ( ',' )
            // InternalPascal.g:21:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:22:7: ( '(' )
            // InternalPascal.g:22:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:23:7: ( ')' )
            // InternalPascal.g:23:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:24:7: ( 'not' )
            // InternalPascal.g:24:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:25:7: ( 'function' )
            // InternalPascal.g:25:9: 'function'
            {
            match("function"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:26:7: ( 'var' )
            // InternalPascal.g:26:9: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:27:7: ( 'procedure' )
            // InternalPascal.g:27:9: 'procedure'
            {
            match("procedure"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:28:7: ( 'label' )
            // InternalPascal.g:28:9: 'label'
            {
            match("label"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:29:7: ( 'const' )
            // InternalPascal.g:29:9: 'const'
            {
            match("const"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:30:7: ( '=' )
            // InternalPascal.g:30:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:31:7: ( 'type' )
            // InternalPascal.g:31:9: 'type'
            {
            match("type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:32:7: ( '..' )
            // InternalPascal.g:32:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:33:7: ( 'case' )
            // InternalPascal.g:33:9: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:34:7: ( 'of' )
            // InternalPascal.g:34:9: 'of'
            {
            match("of"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:35:7: ( 'while' )
            // InternalPascal.g:35:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:36:7: ( 'do' )
            // InternalPascal.g:36:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:37:7: ( 'in' )
            // InternalPascal.g:37:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:38:7: ( 'or' )
            // InternalPascal.g:38:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:39:7: ( 'div' )
            // InternalPascal.g:39:9: 'div'
            {
            match("div"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:40:7: ( 'mod' )
            // InternalPascal.g:40:9: 'mod'
            {
            match("mod"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:41:7: ( 'and' )
            // InternalPascal.g:41:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:42:7: ( 'nil' )
            // InternalPascal.g:42:9: 'nil'
            {
            match("nil"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:43:7: ( 'true' )
            // InternalPascal.g:43:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:44:7: ( 'false' )
            // InternalPascal.g:44:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:45:7: ( 'packed' )
            // InternalPascal.g:45:9: 'packed'
            {
            match("packed"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:46:7: ( 'record' )
            // InternalPascal.g:46:9: 'record'
            {
            match("record"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "RULE_ADDITION_OP"
    public final void mRULE_ADDITION_OP() throws RecognitionException {
        try {
            int _type = RULE_ADDITION_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:9601:18: ( ( '+' | '-' ) )
            // InternalPascal.g:9601:20: ( '+' | '-' )
            {
            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ADDITION_OP"

    // $ANTLR start "RULE_MULTIPLICATION_OP"
    public final void mRULE_MULTIPLICATION_OP() throws RecognitionException {
        try {
            int _type = RULE_MULTIPLICATION_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:9603:24: ( ( '*' | '/' ) )
            // InternalPascal.g:9603:26: ( '*' | '/' )
            {
            if ( input.LA(1)=='*'||input.LA(1)=='/' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MULTIPLICATION_OP"

    // $ANTLR start "RULE_RELATIONAL_OP"
    public final void mRULE_RELATIONAL_OP() throws RecognitionException {
        try {
            int _type = RULE_RELATIONAL_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:9605:20: ( ( '=' | '<>' | '<' | '<=' | '>' | '>=' ) )
            // InternalPascal.g:9605:22: ( '=' | '<>' | '<' | '<=' | '>' | '>=' )
            {
            // InternalPascal.g:9605:22: ( '=' | '<>' | '<' | '<=' | '>' | '>=' )
            int alt1=6;
            switch ( input.LA(1) ) {
            case '=':
                {
                alt1=1;
                }
                break;
            case '<':
                {
                switch ( input.LA(2) ) {
                case '>':
                    {
                    alt1=2;
                    }
                    break;
                case '=':
                    {
                    alt1=4;
                    }
                    break;
                default:
                    alt1=3;}

                }
                break;
            case '>':
                {
                int LA1_3 = input.LA(2);

                if ( (LA1_3=='=') ) {
                    alt1=6;
                }
                else {
                    alt1=5;}
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalPascal.g:9605:23: '='
                    {
                    match('='); 

                    }
                    break;
                case 2 :
                    // InternalPascal.g:9605:27: '<>'
                    {
                    match("<>"); 


                    }
                    break;
                case 3 :
                    // InternalPascal.g:9605:32: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 4 :
                    // InternalPascal.g:9605:36: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 5 :
                    // InternalPascal.g:9605:41: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 6 :
                    // InternalPascal.g:9605:45: '>='
                    {
                    match(">="); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RELATIONAL_OP"

    // $ANTLR start "RULE_NUMERIC_SUBRANGE"
    public final void mRULE_NUMERIC_SUBRANGE() throws RecognitionException {
        try {
            int _type = RULE_NUMERIC_SUBRANGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:9607:23: ( ( RULE_INTEGER_NUMBER | RULE_REAL_NUMBER | RULE_SIGNED_INTEGER_NUMBER | RULE_SIGNED_REAL_NUMBER ) '..' )
            // InternalPascal.g:9607:25: ( RULE_INTEGER_NUMBER | RULE_REAL_NUMBER | RULE_SIGNED_INTEGER_NUMBER | RULE_SIGNED_REAL_NUMBER ) '..'
            {
            // InternalPascal.g:9607:25: ( RULE_INTEGER_NUMBER | RULE_REAL_NUMBER | RULE_SIGNED_INTEGER_NUMBER | RULE_SIGNED_REAL_NUMBER )
            int alt2=4;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalPascal.g:9607:26: RULE_INTEGER_NUMBER
                    {
                    mRULE_INTEGER_NUMBER(); 

                    }
                    break;
                case 2 :
                    // InternalPascal.g:9607:46: RULE_REAL_NUMBER
                    {
                    mRULE_REAL_NUMBER(); 

                    }
                    break;
                case 3 :
                    // InternalPascal.g:9607:63: RULE_SIGNED_INTEGER_NUMBER
                    {
                    mRULE_SIGNED_INTEGER_NUMBER(); 

                    }
                    break;
                case 4 :
                    // InternalPascal.g:9607:90: RULE_SIGNED_REAL_NUMBER
                    {
                    mRULE_SIGNED_REAL_NUMBER(); 

                    }
                    break;

            }

            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NUMERIC_SUBRANGE"

    // $ANTLR start "RULE_DIGIT_SEQUENCE"
    public final void mRULE_DIGIT_SEQUENCE() throws RecognitionException {
        try {
            // InternalPascal.g:9609:30: ( ( RULE_ADDITION_OP )? RULE_INTEGER_NUMBER )
            // InternalPascal.g:9609:32: ( RULE_ADDITION_OP )? RULE_INTEGER_NUMBER
            {
            // InternalPascal.g:9609:32: ( RULE_ADDITION_OP )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='+'||LA3_0=='-') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalPascal.g:9609:32: RULE_ADDITION_OP
                    {
                    mRULE_ADDITION_OP(); 

                    }
                    break;

            }

            mRULE_INTEGER_NUMBER(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT_SEQUENCE"

    // $ANTLR start "RULE_SIGNED_INTEGER_NUMBER"
    public final void mRULE_SIGNED_INTEGER_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_SIGNED_INTEGER_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:9611:28: ( RULE_ADDITION_OP RULE_INTEGER_NUMBER )
            // InternalPascal.g:9611:30: RULE_ADDITION_OP RULE_INTEGER_NUMBER
            {
            mRULE_ADDITION_OP(); 
            mRULE_INTEGER_NUMBER(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SIGNED_INTEGER_NUMBER"

    // $ANTLR start "RULE_INTEGER_NUMBER"
    public final void mRULE_INTEGER_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_INTEGER_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:9613:21: ( RULE_INT )
            // InternalPascal.g:9613:23: RULE_INT
            {
            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INTEGER_NUMBER"

    // $ANTLR start "RULE_REAL_NUMBER"
    public final void mRULE_REAL_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_REAL_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:9615:18: ( ( RULE_INTEGER_NUMBER '.' ( RULE_INTEGER_NUMBER )? ( ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )? | RULE_INTEGER_NUMBER ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE ) )
            // InternalPascal.g:9615:20: ( RULE_INTEGER_NUMBER '.' ( RULE_INTEGER_NUMBER )? ( ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )? | RULE_INTEGER_NUMBER ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )
            {
            // InternalPascal.g:9615:20: ( RULE_INTEGER_NUMBER '.' ( RULE_INTEGER_NUMBER )? ( ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )? | RULE_INTEGER_NUMBER ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalPascal.g:9615:21: RULE_INTEGER_NUMBER '.' ( RULE_INTEGER_NUMBER )? ( ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )?
                    {
                    mRULE_INTEGER_NUMBER(); 
                    match('.'); 
                    // InternalPascal.g:9615:45: ( RULE_INTEGER_NUMBER )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalPascal.g:9615:45: RULE_INTEGER_NUMBER
                            {
                            mRULE_INTEGER_NUMBER(); 

                            }
                            break;

                    }

                    // InternalPascal.g:9615:66: ( ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='E'||LA5_0=='e') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalPascal.g:9615:67: ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE
                            {
                            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            mRULE_DIGIT_SEQUENCE(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:9615:99: RULE_INTEGER_NUMBER ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE
                    {
                    mRULE_INTEGER_NUMBER(); 
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    mRULE_DIGIT_SEQUENCE(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_REAL_NUMBER"

    // $ANTLR start "RULE_SIGNED_REAL_NUMBER"
    public final void mRULE_SIGNED_REAL_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_SIGNED_REAL_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:9617:25: ( RULE_ADDITION_OP RULE_REAL_NUMBER )
            // InternalPascal.g:9617:27: RULE_ADDITION_OP RULE_REAL_NUMBER
            {
            mRULE_ADDITION_OP(); 
            mRULE_REAL_NUMBER(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SIGNED_REAL_NUMBER"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:9619:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalPascal.g:9619:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalPascal.g:9619:11: ( '^' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='^') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalPascal.g:9619:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalPascal.g:9619:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')||(LA8_0>='A' && LA8_0<='Z')||LA8_0=='_'||(LA8_0>='a' && LA8_0<='z')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalPascal.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            // InternalPascal.g:9621:19: ( ( '0' .. '9' )+ )
            // InternalPascal.g:9621:21: ( '0' .. '9' )+
            {
            // InternalPascal.g:9621:21: ( '0' .. '9' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalPascal.g:9621:22: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:9623:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalPascal.g:9623:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalPascal.g:9623:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\"') ) {
                alt12=1;
            }
            else if ( (LA12_0=='\'') ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalPascal.g:9623:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalPascal.g:9623:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='!')||(LA10_0>='#' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalPascal.g:9623:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPascal.g:9623:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalPascal.g:9623:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalPascal.g:9623:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop11:
                    do {
                        int alt11=3;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\\') ) {
                            alt11=1;
                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<='&')||(LA11_0>='(' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFF')) ) {
                            alt11=2;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalPascal.g:9623:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPascal.g:9623:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:9625:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalPascal.g:9625:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalPascal.g:9625:24: ( options {greedy=false; } : . )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='*') ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1=='/') ) {
                        alt13=2;
                    }
                    else if ( ((LA13_1>='\u0000' && LA13_1<='.')||(LA13_1>='0' && LA13_1<='\uFFFF')) ) {
                        alt13=1;
                    }


                }
                else if ( ((LA13_0>='\u0000' && LA13_0<=')')||(LA13_0>='+' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalPascal.g:9625:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:9627:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalPascal.g:9627:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalPascal.g:9627:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\u0000' && LA14_0<='\t')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalPascal.g:9627:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // InternalPascal.g:9627:40: ( ( '\\r' )? '\\n' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\n'||LA16_0=='\r') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalPascal.g:9627:41: ( '\\r' )? '\\n'
                    {
                    // InternalPascal.g:9627:41: ( '\\r' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='\r') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalPascal.g:9627:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:9629:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalPascal.g:9629:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalPascal.g:9629:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalPascal.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:9631:16: ( . )
            // InternalPascal.g:9631:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalPascal.g:1:8: ( T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | RULE_ADDITION_OP | RULE_MULTIPLICATION_OP | RULE_RELATIONAL_OP | RULE_NUMERIC_SUBRANGE | RULE_SIGNED_INTEGER_NUMBER | RULE_INTEGER_NUMBER | RULE_REAL_NUMBER | RULE_SIGNED_REAL_NUMBER | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt18=50;
        alt18 = dfa18.predict(input);
        switch (alt18) {
            case 1 :
                // InternalPascal.g:1:10: T__20
                {
                mT__20(); 

                }
                break;
            case 2 :
                // InternalPascal.g:1:16: T__21
                {
                mT__21(); 

                }
                break;
            case 3 :
                // InternalPascal.g:1:22: T__22
                {
                mT__22(); 

                }
                break;
            case 4 :
                // InternalPascal.g:1:28: T__23
                {
                mT__23(); 

                }
                break;
            case 5 :
                // InternalPascal.g:1:34: T__24
                {
                mT__24(); 

                }
                break;
            case 6 :
                // InternalPascal.g:1:40: T__25
                {
                mT__25(); 

                }
                break;
            case 7 :
                // InternalPascal.g:1:46: T__26
                {
                mT__26(); 

                }
                break;
            case 8 :
                // InternalPascal.g:1:52: T__27
                {
                mT__27(); 

                }
                break;
            case 9 :
                // InternalPascal.g:1:58: T__28
                {
                mT__28(); 

                }
                break;
            case 10 :
                // InternalPascal.g:1:64: T__29
                {
                mT__29(); 

                }
                break;
            case 11 :
                // InternalPascal.g:1:70: T__30
                {
                mT__30(); 

                }
                break;
            case 12 :
                // InternalPascal.g:1:76: T__31
                {
                mT__31(); 

                }
                break;
            case 13 :
                // InternalPascal.g:1:82: T__32
                {
                mT__32(); 

                }
                break;
            case 14 :
                // InternalPascal.g:1:88: T__33
                {
                mT__33(); 

                }
                break;
            case 15 :
                // InternalPascal.g:1:94: T__34
                {
                mT__34(); 

                }
                break;
            case 16 :
                // InternalPascal.g:1:100: T__35
                {
                mT__35(); 

                }
                break;
            case 17 :
                // InternalPascal.g:1:106: T__36
                {
                mT__36(); 

                }
                break;
            case 18 :
                // InternalPascal.g:1:112: T__37
                {
                mT__37(); 

                }
                break;
            case 19 :
                // InternalPascal.g:1:118: T__38
                {
                mT__38(); 

                }
                break;
            case 20 :
                // InternalPascal.g:1:124: T__39
                {
                mT__39(); 

                }
                break;
            case 21 :
                // InternalPascal.g:1:130: T__40
                {
                mT__40(); 

                }
                break;
            case 22 :
                // InternalPascal.g:1:136: T__41
                {
                mT__41(); 

                }
                break;
            case 23 :
                // InternalPascal.g:1:142: T__42
                {
                mT__42(); 

                }
                break;
            case 24 :
                // InternalPascal.g:1:148: T__43
                {
                mT__43(); 

                }
                break;
            case 25 :
                // InternalPascal.g:1:154: T__44
                {
                mT__44(); 

                }
                break;
            case 26 :
                // InternalPascal.g:1:160: T__45
                {
                mT__45(); 

                }
                break;
            case 27 :
                // InternalPascal.g:1:166: T__46
                {
                mT__46(); 

                }
                break;
            case 28 :
                // InternalPascal.g:1:172: T__47
                {
                mT__47(); 

                }
                break;
            case 29 :
                // InternalPascal.g:1:178: T__48
                {
                mT__48(); 

                }
                break;
            case 30 :
                // InternalPascal.g:1:184: T__49
                {
                mT__49(); 

                }
                break;
            case 31 :
                // InternalPascal.g:1:190: T__50
                {
                mT__50(); 

                }
                break;
            case 32 :
                // InternalPascal.g:1:196: T__51
                {
                mT__51(); 

                }
                break;
            case 33 :
                // InternalPascal.g:1:202: T__52
                {
                mT__52(); 

                }
                break;
            case 34 :
                // InternalPascal.g:1:208: T__53
                {
                mT__53(); 

                }
                break;
            case 35 :
                // InternalPascal.g:1:214: T__54
                {
                mT__54(); 

                }
                break;
            case 36 :
                // InternalPascal.g:1:220: T__55
                {
                mT__55(); 

                }
                break;
            case 37 :
                // InternalPascal.g:1:226: RULE_ADDITION_OP
                {
                mRULE_ADDITION_OP(); 

                }
                break;
            case 38 :
                // InternalPascal.g:1:243: RULE_MULTIPLICATION_OP
                {
                mRULE_MULTIPLICATION_OP(); 

                }
                break;
            case 39 :
                // InternalPascal.g:1:266: RULE_RELATIONAL_OP
                {
                mRULE_RELATIONAL_OP(); 

                }
                break;
            case 40 :
                // InternalPascal.g:1:285: RULE_NUMERIC_SUBRANGE
                {
                mRULE_NUMERIC_SUBRANGE(); 

                }
                break;
            case 41 :
                // InternalPascal.g:1:307: RULE_SIGNED_INTEGER_NUMBER
                {
                mRULE_SIGNED_INTEGER_NUMBER(); 

                }
                break;
            case 42 :
                // InternalPascal.g:1:334: RULE_INTEGER_NUMBER
                {
                mRULE_INTEGER_NUMBER(); 

                }
                break;
            case 43 :
                // InternalPascal.g:1:354: RULE_REAL_NUMBER
                {
                mRULE_REAL_NUMBER(); 

                }
                break;
            case 44 :
                // InternalPascal.g:1:371: RULE_SIGNED_REAL_NUMBER
                {
                mRULE_SIGNED_REAL_NUMBER(); 

                }
                break;
            case 45 :
                // InternalPascal.g:1:395: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 46 :
                // InternalPascal.g:1:403: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 47 :
                // InternalPascal.g:1:415: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 48 :
                // InternalPascal.g:1:431: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 49 :
                // InternalPascal.g:1:447: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 50 :
                // InternalPascal.g:1:455: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA2_eotS =
        "\6\uffff\1\11\3\uffff\1\13\1\uffff";
    static final String DFA2_eofS =
        "\14\uffff";
    static final String DFA2_minS =
        "\1\53\1\56\1\60\1\56\1\uffff\3\56\2\uffff\1\56\1\uffff";
    static final String DFA2_maxS =
        "\1\71\1\145\1\71\1\145\1\uffff\1\145\1\56\1\145\2\uffff\1\56\1\uffff";
    static final String DFA2_acceptS =
        "\4\uffff\1\2\3\uffff\1\4\1\1\1\uffff\1\3";
    static final String DFA2_specialS =
        "\14\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\2\1\uffff\1\2\2\uffff\12\1",
            "\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
            "\12\5",
            "\1\6\1\uffff\12\4\13\uffff\1\4\37\uffff\1\4",
            "",
            "\1\7\1\uffff\12\5\13\uffff\1\10\37\uffff\1\10",
            "\1\4",
            "\1\12\1\uffff\12\10\13\uffff\1\10\37\uffff\1\10",
            "",
            "",
            "\1\10",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "9607:25: ( RULE_INTEGER_NUMBER | RULE_REAL_NUMBER | RULE_SIGNED_INTEGER_NUMBER | RULE_SIGNED_REAL_NUMBER )";
        }
    }
    static final String DFA6_eotS =
        "\4\uffff";
    static final String DFA6_eofS =
        "\4\uffff";
    static final String DFA6_minS =
        "\1\60\1\56\2\uffff";
    static final String DFA6_maxS =
        "\1\71\1\145\2\uffff";
    static final String DFA6_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA6_specialS =
        "\4\uffff}>";
    static final String[] DFA6_transitionS = {
            "\12\1",
            "\1\2\1\uffff\12\1\13\uffff\1\3\37\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "9615:20: ( RULE_INTEGER_NUMBER '.' ( RULE_INTEGER_NUMBER )? ( ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )? | RULE_INTEGER_NUMBER ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )";
        }
    }
    static final String DFA18_eotS =
        "\1\uffff\1\47\1\52\1\uffff\2\52\1\57\2\uffff\1\62\3\uffff\5\52\1\uffff\10\52\1\112\1\116\2\uffff\1\120\1\uffff\2\45\5\uffff\2\52\2\uffff\2\52\10\uffff\10\52\1\uffff\2\52\1\144\1\145\1\52\1\147\1\52\1\151\3\52\1\uffff\1\155\5\uffff\1\120\1\163\3\uffff\3\52\1\172\1\173\1\174\2\52\1\177\5\52\2\uffff\1\52\1\uffff\1\u0086\1\uffff\1\u0087\1\u0088\1\52\1\uffff\1\u008c\2\uffff\1\163\3\uffff\1\163\4\52\3\uffff\2\52\1\uffff\2\52\1\u0099\1\u009a\1\u009b\1\52\3\uffff\1\52\1\u008c\3\uffff\1\u008c\1\uffff\1\163\3\52\1\u00a3\1\52\1\u00a5\1\u00a6\1\u00a7\3\uffff\1\u00a8\1\52\1\uffff\1\u008c\2\52\1\u00ac\1\uffff\1\52\4\uffff\1\u00ae\1\u00af\1\52\1\uffff\1\52\2\uffff\1\52\1\u00b3\1\u00b4\2\uffff";
    static final String DFA18_eofS =
        "\u00b5\uffff";
    static final String DFA18_minS =
        "\1\0\1\56\1\141\1\uffff\1\145\1\156\1\75\2\uffff\1\101\3\uffff\1\151\4\141\1\uffff\1\162\1\146\1\150\1\151\1\156\1\157\1\156\1\145\1\60\1\52\2\uffff\1\56\1\uffff\2\0\5\uffff\1\157\1\143\2\uffff\1\147\1\144\10\uffff\1\164\1\154\1\156\1\154\1\162\1\142\1\156\1\163\1\uffff\1\160\1\165\2\60\1\151\1\60\1\166\1\60\2\144\1\143\1\uffff\1\56\5\uffff\2\56\1\53\2\uffff\1\143\1\153\1\151\3\60\1\143\1\163\1\60\1\145\1\163\3\145\2\uffff\1\154\1\uffff\1\60\1\uffff\2\60\1\157\1\uffff\1\56\1\53\1\uffff\1\56\1\53\1\uffff\1\60\1\56\1\162\2\145\1\156\3\uffff\1\164\1\145\1\uffff\1\154\1\164\3\60\1\145\3\uffff\1\162\1\56\1\53\1\uffff\1\60\1\56\1\60\1\56\1\141\2\144\1\60\1\151\3\60\3\uffff\1\60\1\144\1\60\1\56\1\155\1\165\1\60\1\uffff\1\157\4\uffff\2\60\1\162\1\uffff\1\156\2\uffff\1\145\2\60\2\uffff";
    static final String DFA18_maxS =
        "\1\uffff\1\56\1\162\1\uffff\1\145\1\156\1\75\2\uffff\1\172\3\uffff\1\157\1\165\2\141\1\157\1\uffff\1\171\1\162\1\150\1\157\1\156\1\157\1\156\1\145\1\71\1\57\2\uffff\1\145\1\uffff\2\uffff\5\uffff\1\157\1\143\2\uffff\1\147\1\144\10\uffff\1\164\1\154\1\156\1\154\1\162\1\142\1\156\1\163\1\uffff\1\160\1\165\2\172\1\151\1\172\1\166\1\172\2\144\1\143\1\uffff\1\145\5\uffff\2\145\1\71\2\uffff\1\147\1\153\1\151\3\172\1\143\1\163\1\172\1\145\1\163\3\145\2\uffff\1\154\1\uffff\1\172\1\uffff\2\172\1\157\1\uffff\1\145\1\71\1\uffff\1\145\1\71\1\uffff\2\71\1\162\2\145\1\156\3\uffff\1\164\1\145\1\uffff\1\154\1\164\3\172\1\145\3\uffff\1\162\1\145\1\71\1\uffff\4\71\1\141\2\144\1\172\1\151\3\172\3\uffff\1\172\1\144\2\71\1\155\1\165\1\172\1\uffff\1\157\4\uffff\2\172\1\162\1\uffff\1\156\2\uffff\1\145\2\172\2\uffff";
    static final String DFA18_acceptS =
        "\3\uffff\1\3\3\uffff\1\10\1\11\1\uffff\1\13\1\14\1\15\5\uffff\1\24\12\uffff\2\47\1\uffff\1\55\2\uffff\1\46\1\61\1\62\1\26\1\1\2\uffff\1\55\1\3\2\uffff\1\7\1\6\1\10\1\11\1\12\1\13\1\14\1\15\10\uffff\1\24\13\uffff\1\45\1\uffff\1\57\1\60\1\46\1\47\1\52\3\uffff\1\56\1\61\16\uffff\1\30\1\34\1\uffff\1\32\1\uffff\1\33\3\uffff\1\51\2\uffff\1\50\2\uffff\1\53\6\uffff\1\5\1\16\1\40\2\uffff\1\20\6\uffff\1\35\1\36\1\37\3\uffff\1\54\14\uffff\1\27\1\25\1\41\7\uffff\1\4\1\uffff\1\42\1\22\1\23\1\31\3\uffff\1\43\1\uffff\1\44\1\2\3\uffff\1\17\1\21";
    static final String DFA18_specialS =
        "\1\0\40\uffff\1\2\1\1\u0092\uffff}>";
    static final String[] DFA18_transitionS = {
            "\11\45\2\44\2\45\1\44\22\45\1\44\1\45\1\41\4\45\1\42\1\13\1\14\1\43\1\33\1\12\1\33\1\1\1\34\12\37\1\6\1\3\1\35\1\22\1\36\2\45\32\40\1\7\1\45\1\10\1\11\1\40\1\45\1\31\1\4\1\21\1\26\1\5\1\16\2\40\1\27\2\40\1\20\1\30\1\15\1\24\1\2\1\40\1\32\1\40\1\23\1\40\1\17\1\25\3\40\uff85\45",
            "\1\46",
            "\1\51\20\uffff\1\50",
            "",
            "\1\54",
            "\1\55",
            "\1\56",
            "",
            "",
            "\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "",
            "\1\67\5\uffff\1\66",
            "\1\71\23\uffff\1\70",
            "\1\72",
            "\1\73",
            "\1\75\15\uffff\1\74",
            "",
            "\1\100\6\uffff\1\77",
            "\1\101\13\uffff\1\102",
            "\1\103",
            "\1\105\5\uffff\1\104",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\12\113",
            "\1\114\4\uffff\1\115",
            "",
            "",
            "\1\122\1\uffff\12\121\13\uffff\1\123\37\uffff\1\123",
            "",
            "\0\124",
            "\0\124",
            "",
            "",
            "",
            "",
            "",
            "\1\126",
            "\1\127",
            "",
            "",
            "\1\130",
            "\1\131",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "",
            "\1\142",
            "\1\143",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\146",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\150",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\152",
            "\1\153",
            "\1\154",
            "",
            "\1\156\1\uffff\12\113\13\uffff\1\157\37\uffff\1\157",
            "",
            "",
            "",
            "",
            "",
            "\1\122\1\uffff\12\121\13\uffff\1\123\37\uffff\1\123",
            "\1\160\1\uffff\12\161\13\uffff\1\162\37\uffff\1\162",
            "\1\164\1\uffff\1\164\2\uffff\12\165",
            "",
            "",
            "\1\167\3\uffff\1\166",
            "\1\170",
            "\1\171",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\175",
            "\1\176",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "",
            "",
            "\1\u0085",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0089",
            "",
            "\1\160\1\uffff\12\u008a\13\uffff\1\u008b\37\uffff\1\u008b",
            "\1\u008d\1\uffff\1\u008d\2\uffff\12\u008e",
            "",
            "\1\160\1\uffff\12\161\13\uffff\1\162\37\uffff\1\162",
            "\1\u008f\1\uffff\1\u008f\2\uffff\12\u0090",
            "",
            "\12\165",
            "\1\160\1\uffff\12\165",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "",
            "",
            "",
            "\1\u0095",
            "\1\u0096",
            "",
            "\1\u0097",
            "\1\u0098",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u009c",
            "",
            "",
            "",
            "\1\u009d",
            "\1\160\1\uffff\12\u008a\13\uffff\1\u008b\37\uffff\1\u008b",
            "\1\u009e\1\uffff\1\u009e\2\uffff\12\u009f",
            "",
            "\12\u008e",
            "\1\160\1\uffff\12\u008e",
            "\12\u0090",
            "\1\160\1\uffff\12\u0090",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00a4",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00a9",
            "\12\u009f",
            "\1\160\1\uffff\12\u009f",
            "\1\u00aa",
            "\1\u00ab",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u00ad",
            "",
            "",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00b0",
            "",
            "\1\u00b1",
            "",
            "",
            "\1\u00b2",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | RULE_ADDITION_OP | RULE_MULTIPLICATION_OP | RULE_RELATIONAL_OP | RULE_NUMERIC_SUBRANGE | RULE_SIGNED_INTEGER_NUMBER | RULE_INTEGER_NUMBER | RULE_REAL_NUMBER | RULE_SIGNED_REAL_NUMBER | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_0 = input.LA(1);

                        s = -1;
                        if ( (LA18_0=='.') ) {s = 1;}

                        else if ( (LA18_0=='p') ) {s = 2;}

                        else if ( (LA18_0==';') ) {s = 3;}

                        else if ( (LA18_0=='b') ) {s = 4;}

                        else if ( (LA18_0=='e') ) {s = 5;}

                        else if ( (LA18_0==':') ) {s = 6;}

                        else if ( (LA18_0=='[') ) {s = 7;}

                        else if ( (LA18_0==']') ) {s = 8;}

                        else if ( (LA18_0=='^') ) {s = 9;}

                        else if ( (LA18_0==',') ) {s = 10;}

                        else if ( (LA18_0=='(') ) {s = 11;}

                        else if ( (LA18_0==')') ) {s = 12;}

                        else if ( (LA18_0=='n') ) {s = 13;}

                        else if ( (LA18_0=='f') ) {s = 14;}

                        else if ( (LA18_0=='v') ) {s = 15;}

                        else if ( (LA18_0=='l') ) {s = 16;}

                        else if ( (LA18_0=='c') ) {s = 17;}

                        else if ( (LA18_0=='=') ) {s = 18;}

                        else if ( (LA18_0=='t') ) {s = 19;}

                        else if ( (LA18_0=='o') ) {s = 20;}

                        else if ( (LA18_0=='w') ) {s = 21;}

                        else if ( (LA18_0=='d') ) {s = 22;}

                        else if ( (LA18_0=='i') ) {s = 23;}

                        else if ( (LA18_0=='m') ) {s = 24;}

                        else if ( (LA18_0=='a') ) {s = 25;}

                        else if ( (LA18_0=='r') ) {s = 26;}

                        else if ( (LA18_0=='+'||LA18_0=='-') ) {s = 27;}

                        else if ( (LA18_0=='/') ) {s = 28;}

                        else if ( (LA18_0=='<') ) {s = 29;}

                        else if ( (LA18_0=='>') ) {s = 30;}

                        else if ( ((LA18_0>='0' && LA18_0<='9')) ) {s = 31;}

                        else if ( ((LA18_0>='A' && LA18_0<='Z')||LA18_0=='_'||(LA18_0>='g' && LA18_0<='h')||(LA18_0>='j' && LA18_0<='k')||LA18_0=='q'||LA18_0=='s'||LA18_0=='u'||(LA18_0>='x' && LA18_0<='z')) ) {s = 32;}

                        else if ( (LA18_0=='\"') ) {s = 33;}

                        else if ( (LA18_0=='\'') ) {s = 34;}

                        else if ( (LA18_0=='*') ) {s = 35;}

                        else if ( ((LA18_0>='\t' && LA18_0<='\n')||LA18_0=='\r'||LA18_0==' ') ) {s = 36;}

                        else if ( ((LA18_0>='\u0000' && LA18_0<='\b')||(LA18_0>='\u000B' && LA18_0<='\f')||(LA18_0>='\u000E' && LA18_0<='\u001F')||LA18_0=='!'||(LA18_0>='#' && LA18_0<='&')||(LA18_0>='?' && LA18_0<='@')||LA18_0=='\\'||LA18_0=='`'||(LA18_0>='{' && LA18_0<='\uFFFF')) ) {s = 37;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_34 = input.LA(1);

                        s = -1;
                        if ( ((LA18_34>='\u0000' && LA18_34<='\uFFFF')) ) {s = 84;}

                        else s = 37;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA18_33 = input.LA(1);

                        s = -1;
                        if ( ((LA18_33>='\u0000' && LA18_33<='\uFFFF')) ) {s = 84;}

                        else s = 37;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}