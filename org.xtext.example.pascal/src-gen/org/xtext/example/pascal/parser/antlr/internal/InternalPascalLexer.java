package org.xtext.example.pascal.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPascalLexer extends Lexer {
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

    public InternalPascalLexer() {;} 
    public InternalPascalLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalPascalLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalPascal.g"; }

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:11:7: ( 'program' )
            // InternalPascal.g:11:9: 'program'
            {
            match("program"); 


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
            // InternalPascal.g:12:7: ( ';' )
            // InternalPascal.g:12:9: ';'
            {
            match(';'); 

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
            // InternalPascal.g:13:7: ( '[' )
            // InternalPascal.g:13:9: '['
            {
            match('['); 

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
            // InternalPascal.g:14:7: ( ']' )
            // InternalPascal.g:14:9: ']'
            {
            match(']'); 

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
            // InternalPascal.g:15:7: ( '.' )
            // InternalPascal.g:15:9: '.'
            {
            match('.'); 

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
            // InternalPascal.g:16:7: ( '^' )
            // InternalPascal.g:16:9: '^'
            {
            match('^'); 

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
            // InternalPascal.g:17:7: ( ',' )
            // InternalPascal.g:17:9: ','
            {
            match(','); 

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
            // InternalPascal.g:18:7: ( 'in' )
            // InternalPascal.g:18:9: 'in'
            {
            match("in"); 


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
            // InternalPascal.g:19:7: ( '=' )
            // InternalPascal.g:19:9: '='
            {
            match('='); 

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
            // InternalPascal.g:20:7: ( 'or' )
            // InternalPascal.g:20:9: 'or'
            {
            match("or"); 


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
            // InternalPascal.g:21:7: ( 'div' )
            // InternalPascal.g:21:9: 'div'
            {
            match("div"); 


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
            // InternalPascal.g:22:7: ( 'mod' )
            // InternalPascal.g:22:9: 'mod'
            {
            match("mod"); 


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
            // InternalPascal.g:23:7: ( 'and' )
            // InternalPascal.g:23:9: 'and'
            {
            match("and"); 


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
            // InternalPascal.g:24:7: ( 'nil' )
            // InternalPascal.g:24:9: 'nil'
            {
            match("nil"); 


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
            // InternalPascal.g:25:7: ( 'true' )
            // InternalPascal.g:25:9: 'true'
            {
            match("true"); 


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
            // InternalPascal.g:26:7: ( 'false' )
            // InternalPascal.g:26:9: 'false'
            {
            match("false"); 


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
            // InternalPascal.g:27:7: ( '(' )
            // InternalPascal.g:27:9: '('
            {
            match('('); 

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
            // InternalPascal.g:28:7: ( ')' )
            // InternalPascal.g:28:9: ')'
            {
            match(')'); 

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
            // InternalPascal.g:29:7: ( 'not' )
            // InternalPascal.g:29:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "RULE_ADDITION_OP"
    public final void mRULE_ADDITION_OP() throws RecognitionException {
        try {
            int _type = RULE_ADDITION_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:1273:18: ( ( '+' | '-' ) )
            // InternalPascal.g:1273:20: ( '+' | '-' )
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
            // InternalPascal.g:1275:24: ( ( '*' | '/' ) )
            // InternalPascal.g:1275:26: ( '*' | '/' )
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
            // InternalPascal.g:1277:20: ( ( '=' | '<>' | '<' | '<=' | '>' | '>=' ) )
            // InternalPascal.g:1277:22: ( '=' | '<>' | '<' | '<=' | '>' | '>=' )
            {
            // InternalPascal.g:1277:22: ( '=' | '<>' | '<' | '<=' | '>' | '>=' )
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
                    // InternalPascal.g:1277:23: '='
                    {
                    match('='); 

                    }
                    break;
                case 2 :
                    // InternalPascal.g:1277:27: '<>'
                    {
                    match("<>"); 


                    }
                    break;
                case 3 :
                    // InternalPascal.g:1277:32: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 4 :
                    // InternalPascal.g:1277:36: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 5 :
                    // InternalPascal.g:1277:41: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 6 :
                    // InternalPascal.g:1277:45: '>='
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

    // $ANTLR start "RULE_PARENTHESES_COMMENT"
    public final void mRULE_PARENTHESES_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_PARENTHESES_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:1279:26: ( '(*' ( options {greedy=false; } : . )* '*)' )
            // InternalPascal.g:1279:28: '(*' ( options {greedy=false; } : . )* '*)'
            {
            match("(*"); 

            // InternalPascal.g:1279:33: ( options {greedy=false; } : . )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='*') ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1==')') ) {
                        alt2=2;
                    }
                    else if ( ((LA2_1>='\u0000' && LA2_1<='(')||(LA2_1>='*' && LA2_1<='\uFFFF')) ) {
                        alt2=1;
                    }


                }
                else if ( ((LA2_0>='\u0000' && LA2_0<=')')||(LA2_0>='+' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPascal.g:1279:61: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match("*)"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PARENTHESES_COMMENT"

    // $ANTLR start "RULE_CURLY_BRACKETS_COMMENT"
    public final void mRULE_CURLY_BRACKETS_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_CURLY_BRACKETS_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:1281:29: ( '{' ( options {greedy=false; } : . )* '}' )
            // InternalPascal.g:1281:31: '{' ( options {greedy=false; } : . )* '}'
            {
            match('{'); 
            // InternalPascal.g:1281:35: ( options {greedy=false; } : . )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='}') ) {
                    alt3=2;
                }
                else if ( ((LA3_0>='\u0000' && LA3_0<='|')||(LA3_0>='~' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPascal.g:1281:63: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CURLY_BRACKETS_COMMENT"

    // $ANTLR start "RULE_NUMERIC_SUBRANGE"
    public final void mRULE_NUMERIC_SUBRANGE() throws RecognitionException {
        try {
            int _type = RULE_NUMERIC_SUBRANGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:1283:23: ( ( RULE_INTEGER_NUMBER | RULE_REAL_NUMBER | RULE_SIGNED_INTEGER_NUMBER | RULE_SIGNED_REAL_NUMBER ) '..' )
            // InternalPascal.g:1283:25: ( RULE_INTEGER_NUMBER | RULE_REAL_NUMBER | RULE_SIGNED_INTEGER_NUMBER | RULE_SIGNED_REAL_NUMBER ) '..'
            {
            // InternalPascal.g:1283:25: ( RULE_INTEGER_NUMBER | RULE_REAL_NUMBER | RULE_SIGNED_INTEGER_NUMBER | RULE_SIGNED_REAL_NUMBER )
            int alt4=4;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalPascal.g:1283:26: RULE_INTEGER_NUMBER
                    {
                    mRULE_INTEGER_NUMBER(); 

                    }
                    break;
                case 2 :
                    // InternalPascal.g:1283:46: RULE_REAL_NUMBER
                    {
                    mRULE_REAL_NUMBER(); 

                    }
                    break;
                case 3 :
                    // InternalPascal.g:1283:63: RULE_SIGNED_INTEGER_NUMBER
                    {
                    mRULE_SIGNED_INTEGER_NUMBER(); 

                    }
                    break;
                case 4 :
                    // InternalPascal.g:1283:90: RULE_SIGNED_REAL_NUMBER
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
            // InternalPascal.g:1285:30: ( ( RULE_ADDITION_OP )? RULE_INTEGER_NUMBER )
            // InternalPascal.g:1285:32: ( RULE_ADDITION_OP )? RULE_INTEGER_NUMBER
            {
            // InternalPascal.g:1285:32: ( RULE_ADDITION_OP )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='+'||LA5_0=='-') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalPascal.g:1285:32: RULE_ADDITION_OP
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
            // InternalPascal.g:1287:28: ( RULE_ADDITION_OP RULE_INTEGER_NUMBER )
            // InternalPascal.g:1287:30: RULE_ADDITION_OP RULE_INTEGER_NUMBER
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
            // InternalPascal.g:1289:21: ( RULE_INT )
            // InternalPascal.g:1289:23: RULE_INT
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
            // InternalPascal.g:1291:18: ( ( RULE_INTEGER_NUMBER '.' ( RULE_INTEGER_NUMBER )? ( ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )? | RULE_INTEGER_NUMBER ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE ) )
            // InternalPascal.g:1291:20: ( RULE_INTEGER_NUMBER '.' ( RULE_INTEGER_NUMBER )? ( ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )? | RULE_INTEGER_NUMBER ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )
            {
            // InternalPascal.g:1291:20: ( RULE_INTEGER_NUMBER '.' ( RULE_INTEGER_NUMBER )? ( ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )? | RULE_INTEGER_NUMBER ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalPascal.g:1291:21: RULE_INTEGER_NUMBER '.' ( RULE_INTEGER_NUMBER )? ( ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )?
                    {
                    mRULE_INTEGER_NUMBER(); 
                    match('.'); 
                    // InternalPascal.g:1291:45: ( RULE_INTEGER_NUMBER )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalPascal.g:1291:45: RULE_INTEGER_NUMBER
                            {
                            mRULE_INTEGER_NUMBER(); 

                            }
                            break;

                    }

                    // InternalPascal.g:1291:66: ( ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='E'||LA7_0=='e') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalPascal.g:1291:67: ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE
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
                    // InternalPascal.g:1291:99: RULE_INTEGER_NUMBER ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE
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
            // InternalPascal.g:1293:25: ( RULE_ADDITION_OP RULE_REAL_NUMBER )
            // InternalPascal.g:1293:27: RULE_ADDITION_OP RULE_REAL_NUMBER
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
            // InternalPascal.g:1295:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalPascal.g:1295:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalPascal.g:1295:11: ( '^' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='^') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalPascal.g:1295:11: '^'
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

            // InternalPascal.g:1295:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')||(LA10_0>='A' && LA10_0<='Z')||LA10_0=='_'||(LA10_0>='a' && LA10_0<='z')) ) {
                    alt10=1;
                }


                switch (alt10) {
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
            	    break loop10;
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
            // InternalPascal.g:1297:19: ( ( '0' .. '9' )+ )
            // InternalPascal.g:1297:21: ( '0' .. '9' )+
            {
            // InternalPascal.g:1297:21: ( '0' .. '9' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalPascal.g:1297:22: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
            // InternalPascal.g:1299:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalPascal.g:1299:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalPascal.g:1299:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\"') ) {
                alt14=1;
            }
            else if ( (LA14_0=='\'') ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalPascal.g:1299:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalPascal.g:1299:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop12:
                    do {
                        int alt12=3;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0=='\\') ) {
                            alt12=1;
                        }
                        else if ( ((LA12_0>='\u0000' && LA12_0<='!')||(LA12_0>='#' && LA12_0<='[')||(LA12_0>=']' && LA12_0<='\uFFFF')) ) {
                            alt12=2;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalPascal.g:1299:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPascal.g:1299:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop12;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalPascal.g:1299:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalPascal.g:1299:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop13:
                    do {
                        int alt13=3;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0=='\\') ) {
                            alt13=1;
                        }
                        else if ( ((LA13_0>='\u0000' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='[')||(LA13_0>=']' && LA13_0<='\uFFFF')) ) {
                            alt13=2;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalPascal.g:1299:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPascal.g:1299:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop13;
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
            // InternalPascal.g:1301:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalPascal.g:1301:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalPascal.g:1301:24: ( options {greedy=false; } : . )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0=='*') ) {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1=='/') ) {
                        alt15=2;
                    }
                    else if ( ((LA15_1>='\u0000' && LA15_1<='.')||(LA15_1>='0' && LA15_1<='\uFFFF')) ) {
                        alt15=1;
                    }


                }
                else if ( ((LA15_0>='\u0000' && LA15_0<=')')||(LA15_0>='+' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalPascal.g:1301:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop15;
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
            // InternalPascal.g:1303:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalPascal.g:1303:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalPascal.g:1303:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\u0000' && LA16_0<='\t')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\uFFFF')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalPascal.g:1303:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop16;
                }
            } while (true);

            // InternalPascal.g:1303:40: ( ( '\\r' )? '\\n' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='\n'||LA18_0=='\r') ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalPascal.g:1303:41: ( '\\r' )? '\\n'
                    {
                    // InternalPascal.g:1303:41: ( '\\r' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0=='\r') ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalPascal.g:1303:41: '\\r'
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
            // InternalPascal.g:1305:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalPascal.g:1305:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalPascal.g:1305:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='\t' && LA19_0<='\n')||LA19_0=='\r'||LA19_0==' ') ) {
                    alt19=1;
                }


                switch (alt19) {
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
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
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
            // InternalPascal.g:1307:16: ( . )
            // InternalPascal.g:1307:18: .
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
        // InternalPascal.g:1:8: ( T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | RULE_ADDITION_OP | RULE_MULTIPLICATION_OP | RULE_RELATIONAL_OP | RULE_PARENTHESES_COMMENT | RULE_CURLY_BRACKETS_COMMENT | RULE_NUMERIC_SUBRANGE | RULE_SIGNED_INTEGER_NUMBER | RULE_INTEGER_NUMBER | RULE_REAL_NUMBER | RULE_SIGNED_REAL_NUMBER | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt20=35;
        alt20 = dfa20.predict(input);
        switch (alt20) {
            case 1 :
                // InternalPascal.g:1:10: T__22
                {
                mT__22(); 

                }
                break;
            case 2 :
                // InternalPascal.g:1:16: T__23
                {
                mT__23(); 

                }
                break;
            case 3 :
                // InternalPascal.g:1:22: T__24
                {
                mT__24(); 

                }
                break;
            case 4 :
                // InternalPascal.g:1:28: T__25
                {
                mT__25(); 

                }
                break;
            case 5 :
                // InternalPascal.g:1:34: T__26
                {
                mT__26(); 

                }
                break;
            case 6 :
                // InternalPascal.g:1:40: T__27
                {
                mT__27(); 

                }
                break;
            case 7 :
                // InternalPascal.g:1:46: T__28
                {
                mT__28(); 

                }
                break;
            case 8 :
                // InternalPascal.g:1:52: T__29
                {
                mT__29(); 

                }
                break;
            case 9 :
                // InternalPascal.g:1:58: T__30
                {
                mT__30(); 

                }
                break;
            case 10 :
                // InternalPascal.g:1:64: T__31
                {
                mT__31(); 

                }
                break;
            case 11 :
                // InternalPascal.g:1:70: T__32
                {
                mT__32(); 

                }
                break;
            case 12 :
                // InternalPascal.g:1:76: T__33
                {
                mT__33(); 

                }
                break;
            case 13 :
                // InternalPascal.g:1:82: T__34
                {
                mT__34(); 

                }
                break;
            case 14 :
                // InternalPascal.g:1:88: T__35
                {
                mT__35(); 

                }
                break;
            case 15 :
                // InternalPascal.g:1:94: T__36
                {
                mT__36(); 

                }
                break;
            case 16 :
                // InternalPascal.g:1:100: T__37
                {
                mT__37(); 

                }
                break;
            case 17 :
                // InternalPascal.g:1:106: T__38
                {
                mT__38(); 

                }
                break;
            case 18 :
                // InternalPascal.g:1:112: T__39
                {
                mT__39(); 

                }
                break;
            case 19 :
                // InternalPascal.g:1:118: T__40
                {
                mT__40(); 

                }
                break;
            case 20 :
                // InternalPascal.g:1:124: RULE_ADDITION_OP
                {
                mRULE_ADDITION_OP(); 

                }
                break;
            case 21 :
                // InternalPascal.g:1:141: RULE_MULTIPLICATION_OP
                {
                mRULE_MULTIPLICATION_OP(); 

                }
                break;
            case 22 :
                // InternalPascal.g:1:164: RULE_RELATIONAL_OP
                {
                mRULE_RELATIONAL_OP(); 

                }
                break;
            case 23 :
                // InternalPascal.g:1:183: RULE_PARENTHESES_COMMENT
                {
                mRULE_PARENTHESES_COMMENT(); 

                }
                break;
            case 24 :
                // InternalPascal.g:1:208: RULE_CURLY_BRACKETS_COMMENT
                {
                mRULE_CURLY_BRACKETS_COMMENT(); 

                }
                break;
            case 25 :
                // InternalPascal.g:1:236: RULE_NUMERIC_SUBRANGE
                {
                mRULE_NUMERIC_SUBRANGE(); 

                }
                break;
            case 26 :
                // InternalPascal.g:1:258: RULE_SIGNED_INTEGER_NUMBER
                {
                mRULE_SIGNED_INTEGER_NUMBER(); 

                }
                break;
            case 27 :
                // InternalPascal.g:1:285: RULE_INTEGER_NUMBER
                {
                mRULE_INTEGER_NUMBER(); 

                }
                break;
            case 28 :
                // InternalPascal.g:1:305: RULE_REAL_NUMBER
                {
                mRULE_REAL_NUMBER(); 

                }
                break;
            case 29 :
                // InternalPascal.g:1:322: RULE_SIGNED_REAL_NUMBER
                {
                mRULE_SIGNED_REAL_NUMBER(); 

                }
                break;
            case 30 :
                // InternalPascal.g:1:346: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 31 :
                // InternalPascal.g:1:354: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 32 :
                // InternalPascal.g:1:366: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 33 :
                // InternalPascal.g:1:382: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 34 :
                // InternalPascal.g:1:398: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 35 :
                // InternalPascal.g:1:406: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA20 dfa20 = new DFA20(this);
    static final String DFA4_eotS =
        "\6\uffff\1\11\3\uffff\1\13\1\uffff";
    static final String DFA4_eofS =
        "\14\uffff";
    static final String DFA4_minS =
        "\1\53\1\56\1\60\1\56\1\uffff\3\56\2\uffff\1\56\1\uffff";
    static final String DFA4_maxS =
        "\1\71\1\145\1\71\1\145\1\uffff\1\145\1\56\1\145\2\uffff\1\56\1\uffff";
    static final String DFA4_acceptS =
        "\4\uffff\1\2\3\uffff\1\4\1\1\1\uffff\1\3";
    static final String DFA4_specialS =
        "\14\uffff}>";
    static final String[] DFA4_transitionS = {
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

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "1283:25: ( RULE_INTEGER_NUMBER | RULE_REAL_NUMBER | RULE_SIGNED_INTEGER_NUMBER | RULE_SIGNED_REAL_NUMBER )";
        }
    }
    static final String DFA8_eotS =
        "\4\uffff";
    static final String DFA8_eofS =
        "\4\uffff";
    static final String DFA8_minS =
        "\1\60\1\56\2\uffff";
    static final String DFA8_maxS =
        "\1\71\1\145\2\uffff";
    static final String DFA8_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA8_specialS =
        "\4\uffff}>";
    static final String[] DFA8_transitionS = {
            "\12\1",
            "\1\2\1\uffff\12\1\13\uffff\1\3\37\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "1291:20: ( RULE_INTEGER_NUMBER '.' ( RULE_INTEGER_NUMBER )? ( ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )? | RULE_INTEGER_NUMBER ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )";
        }
    }
    static final String DFA20_eotS =
        "\1\uffff\1\40\4\uffff\1\45\1\uffff\1\40\1\uffff\7\40\1\62\1\uffff\1\64\1\70\2\uffff\1\36\1\73\1\uffff\2\36\3\uffff\1\40\7\uffff\1\102\1\uffff\1\103\7\40\4\uffff\1\113\6\uffff\1\121\1\73\3\uffff\1\40\2\uffff\1\125\1\126\1\127\1\130\1\131\2\40\1\uffff\1\136\2\uffff\1\121\3\uffff\1\121\1\40\5\uffff\1\144\1\40\1\136\3\uffff\1\136\1\uffff\1\121\1\40\1\uffff\1\151\1\uffff\1\136\1\40\1\uffff\1\153\1\uffff";
    static final String DFA20_eofS =
        "\154\uffff";
    static final String DFA20_minS =
        "\1\0\1\162\4\uffff\1\101\1\uffff\1\156\1\uffff\1\162\1\151\1\157\1\156\1\151\1\162\1\141\1\52\1\uffff\1\60\1\52\2\uffff\1\0\1\56\1\uffff\2\0\3\uffff\1\157\7\uffff\1\60\1\uffff\1\60\1\166\2\144\1\154\1\164\1\165\1\154\4\uffff\1\56\6\uffff\2\56\1\53\2\uffff\1\147\2\uffff\5\60\1\145\1\163\1\uffff\1\56\1\53\1\uffff\1\56\1\53\1\uffff\1\60\1\56\1\162\5\uffff\1\60\1\145\1\56\1\53\1\uffff\1\60\1\56\1\60\1\56\1\141\1\uffff\2\60\1\56\1\155\1\uffff\1\60\1\uffff";
    static final String DFA20_maxS =
        "\1\uffff\1\162\4\uffff\1\172\1\uffff\1\156\1\uffff\1\162\1\151\1\157\1\156\1\157\1\162\1\141\1\52\1\uffff\1\71\1\57\2\uffff\1\uffff\1\145\1\uffff\2\uffff\3\uffff\1\157\7\uffff\1\172\1\uffff\1\172\1\166\2\144\1\154\1\164\1\165\1\154\4\uffff\1\145\6\uffff\2\145\1\71\2\uffff\1\147\2\uffff\5\172\1\145\1\163\1\uffff\1\145\1\71\1\uffff\1\145\1\71\1\uffff\2\71\1\162\5\uffff\1\172\2\145\1\71\1\uffff\4\71\1\141\1\uffff\1\172\2\71\1\155\1\uffff\1\172\1\uffff";
    static final String DFA20_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\1\uffff\1\7\1\uffff\1\11\10\uffff\1\22\2\uffff\2\26\2\uffff\1\36\2\uffff\1\25\1\42\1\43\1\uffff\1\36\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\11\10\uffff\1\27\1\21\1\22\1\24\1\uffff\1\40\1\41\1\25\1\26\1\30\1\33\3\uffff\1\37\1\42\1\uffff\1\10\1\12\7\uffff\1\32\2\uffff\1\31\2\uffff\1\34\3\uffff\1\13\1\14\1\15\1\16\1\23\4\uffff\1\35\5\uffff\1\17\4\uffff\1\20\1\uffff\1\1";
    static final String DFA20_specialS =
        "\1\0\26\uffff\1\2\2\uffff\1\3\1\1\120\uffff}>";
    static final String[] DFA20_transitionS = {
            "\11\36\2\35\2\36\1\35\22\36\1\35\1\36\1\32\4\36\1\33\1\21\1\22\1\34\1\23\1\7\1\23\1\5\1\24\12\30\1\36\1\2\1\25\1\11\1\26\2\36\32\31\1\3\1\36\1\4\1\6\1\31\1\36\1\15\2\31\1\13\1\31\1\20\2\31\1\10\3\31\1\14\1\16\1\12\1\1\3\31\1\17\6\31\1\27\uff84\36",
            "\1\37",
            "",
            "",
            "",
            "",
            "\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\1\47",
            "",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55\5\uffff\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "",
            "\12\65",
            "\1\66\4\uffff\1\67",
            "",
            "",
            "\0\72",
            "\1\74\1\uffff\12\75\13\uffff\1\76\37\uffff\1\76",
            "",
            "\0\77",
            "\0\77",
            "",
            "",
            "",
            "\1\101",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "",
            "",
            "",
            "",
            "\1\114\1\uffff\12\65\13\uffff\1\115\37\uffff\1\115",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\116\1\uffff\12\117\13\uffff\1\120\37\uffff\1\120",
            "\1\74\1\uffff\12\75\13\uffff\1\76\37\uffff\1\76",
            "\1\122\1\uffff\1\122\2\uffff\12\123",
            "",
            "",
            "\1\124",
            "",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\132",
            "\1\133",
            "",
            "\1\116\1\uffff\12\134\13\uffff\1\135\37\uffff\1\135",
            "\1\137\1\uffff\1\137\2\uffff\12\140",
            "",
            "\1\116\1\uffff\12\117\13\uffff\1\120\37\uffff\1\120",
            "\1\141\1\uffff\1\141\2\uffff\12\142",
            "",
            "\12\123",
            "\1\116\1\uffff\12\123",
            "\1\143",
            "",
            "",
            "",
            "",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\145",
            "\1\116\1\uffff\12\134\13\uffff\1\135\37\uffff\1\135",
            "\1\146\1\uffff\1\146\2\uffff\12\147",
            "",
            "\12\140",
            "\1\116\1\uffff\12\140",
            "\12\142",
            "\1\116\1\uffff\12\142",
            "\1\150",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\147",
            "\1\116\1\uffff\12\147",
            "\1\152",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            ""
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | RULE_ADDITION_OP | RULE_MULTIPLICATION_OP | RULE_RELATIONAL_OP | RULE_PARENTHESES_COMMENT | RULE_CURLY_BRACKETS_COMMENT | RULE_NUMERIC_SUBRANGE | RULE_SIGNED_INTEGER_NUMBER | RULE_INTEGER_NUMBER | RULE_REAL_NUMBER | RULE_SIGNED_REAL_NUMBER | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_0 = input.LA(1);

                        s = -1;
                        if ( (LA20_0=='p') ) {s = 1;}

                        else if ( (LA20_0==';') ) {s = 2;}

                        else if ( (LA20_0=='[') ) {s = 3;}

                        else if ( (LA20_0==']') ) {s = 4;}

                        else if ( (LA20_0=='.') ) {s = 5;}

                        else if ( (LA20_0=='^') ) {s = 6;}

                        else if ( (LA20_0==',') ) {s = 7;}

                        else if ( (LA20_0=='i') ) {s = 8;}

                        else if ( (LA20_0=='=') ) {s = 9;}

                        else if ( (LA20_0=='o') ) {s = 10;}

                        else if ( (LA20_0=='d') ) {s = 11;}

                        else if ( (LA20_0=='m') ) {s = 12;}

                        else if ( (LA20_0=='a') ) {s = 13;}

                        else if ( (LA20_0=='n') ) {s = 14;}

                        else if ( (LA20_0=='t') ) {s = 15;}

                        else if ( (LA20_0=='f') ) {s = 16;}

                        else if ( (LA20_0=='(') ) {s = 17;}

                        else if ( (LA20_0==')') ) {s = 18;}

                        else if ( (LA20_0=='+'||LA20_0=='-') ) {s = 19;}

                        else if ( (LA20_0=='/') ) {s = 20;}

                        else if ( (LA20_0=='<') ) {s = 21;}

                        else if ( (LA20_0=='>') ) {s = 22;}

                        else if ( (LA20_0=='{') ) {s = 23;}

                        else if ( ((LA20_0>='0' && LA20_0<='9')) ) {s = 24;}

                        else if ( ((LA20_0>='A' && LA20_0<='Z')||LA20_0=='_'||(LA20_0>='b' && LA20_0<='c')||LA20_0=='e'||(LA20_0>='g' && LA20_0<='h')||(LA20_0>='j' && LA20_0<='l')||(LA20_0>='q' && LA20_0<='s')||(LA20_0>='u' && LA20_0<='z')) ) {s = 25;}

                        else if ( (LA20_0=='\"') ) {s = 26;}

                        else if ( (LA20_0=='\'') ) {s = 27;}

                        else if ( (LA20_0=='*') ) {s = 28;}

                        else if ( ((LA20_0>='\t' && LA20_0<='\n')||LA20_0=='\r'||LA20_0==' ') ) {s = 29;}

                        else if ( ((LA20_0>='\u0000' && LA20_0<='\b')||(LA20_0>='\u000B' && LA20_0<='\f')||(LA20_0>='\u000E' && LA20_0<='\u001F')||LA20_0=='!'||(LA20_0>='#' && LA20_0<='&')||LA20_0==':'||(LA20_0>='?' && LA20_0<='@')||LA20_0=='\\'||LA20_0=='`'||(LA20_0>='|' && LA20_0<='\uFFFF')) ) {s = 30;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA20_27 = input.LA(1);

                        s = -1;
                        if ( ((LA20_27>='\u0000' && LA20_27<='\uFFFF')) ) {s = 63;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA20_23 = input.LA(1);

                        s = -1;
                        if ( ((LA20_23>='\u0000' && LA20_23<='\uFFFF')) ) {s = 58;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA20_26 = input.LA(1);

                        s = -1;
                        if ( ((LA20_26>='\u0000' && LA20_26<='\uFFFF')) ) {s = 63;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 20, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}