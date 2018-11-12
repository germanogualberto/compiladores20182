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
    public static final int RULE_STRING=9;
    public static final int RULE_REAL_NUMBER=11;
    public static final int RULE_SL_COMMENT=15;
    public static final int T__19=19;
    public static final int RULE_DIGIT_SEQUENCE=12;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=16;
    public static final int RULE_MULTIPLICATION_OP=8;
    public static final int RULE_ANY_OTHER=17;
    public static final int RULE_SIGNED_INTEGER_NUMBER=5;
    public static final int RULE_SIGNED_REAL_NUMBER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=13;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=14;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_ADDITION_OP=7;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__42=42;
    public static final int RULE_INTEGER_NUMBER=6;
    public static final int T__21=21;

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

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
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
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
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
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
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
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
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
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
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
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
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
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
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
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:18:7: ( ',' )
            // InternalPascal.g:18:9: ','
            {
            match(','); 

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
            // InternalPascal.g:19:7: ( 'or' )
            // InternalPascal.g:19:9: 'or'
            {
            match("or"); 


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
            // InternalPascal.g:20:7: ( 'and' )
            // InternalPascal.g:20:9: 'and'
            {
            match("and"); 


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
            // InternalPascal.g:21:7: ( 'true' )
            // InternalPascal.g:21:9: 'true'
            {
            match("true"); 


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
            // InternalPascal.g:22:7: ( 'false' )
            // InternalPascal.g:22:9: 'false'
            {
            match("false"); 


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
            // InternalPascal.g:23:7: ( '(' )
            // InternalPascal.g:23:9: '('
            {
            match('('); 

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
            // InternalPascal.g:24:7: ( ')' )
            // InternalPascal.g:24:9: ')'
            {
            match(')'); 

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
            // InternalPascal.g:25:7: ( 'not' )
            // InternalPascal.g:25:9: 'not'
            {
            match("not"); 


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
            // InternalPascal.g:26:7: ( 'function' )
            // InternalPascal.g:26:9: 'function'
            {
            match("function"); 


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
            // InternalPascal.g:27:7: ( 'var' )
            // InternalPascal.g:27:9: 'var'
            {
            match("var"); 


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
            // InternalPascal.g:28:7: ( 'procedure' )
            // InternalPascal.g:28:9: 'procedure'
            {
            match("procedure"); 


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
            // InternalPascal.g:29:7: ( 'label' )
            // InternalPascal.g:29:9: 'label'
            {
            match("label"); 


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
            // InternalPascal.g:30:7: ( 'const' )
            // InternalPascal.g:30:9: 'const'
            {
            match("const"); 


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
            // InternalPascal.g:31:7: ( '=' )
            // InternalPascal.g:31:9: '='
            {
            match('='); 

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
            // InternalPascal.g:32:7: ( 'type' )
            // InternalPascal.g:32:9: 'type'
            {
            match("type"); 


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
            // InternalPascal.g:33:7: ( 'record' )
            // InternalPascal.g:33:9: 'record'
            {
            match("record"); 


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
            // InternalPascal.g:34:7: ( 'while' )
            // InternalPascal.g:34:9: 'while'
            {
            match("while"); 


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
            // InternalPascal.g:35:7: ( 'do' )
            // InternalPascal.g:35:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "RULE_ADDITION_OP"
    public final void mRULE_ADDITION_OP() throws RecognitionException {
        try {
            int _type = RULE_ADDITION_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:3346:18: ( ( '+' | '-' ) )
            // InternalPascal.g:3346:20: ( '+' | '-' )
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
            // InternalPascal.g:3348:24: ( ( '*' | '/' ) )
            // InternalPascal.g:3348:26: ( '*' | '/' )
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

    // $ANTLR start "RULE_DIGIT_SEQUENCE"
    public final void mRULE_DIGIT_SEQUENCE() throws RecognitionException {
        try {
            // InternalPascal.g:3350:30: ( ( RULE_ADDITION_OP )? RULE_INTEGER_NUMBER )
            // InternalPascal.g:3350:32: ( RULE_ADDITION_OP )? RULE_INTEGER_NUMBER
            {
            // InternalPascal.g:3350:32: ( RULE_ADDITION_OP )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='+'||LA1_0=='-') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalPascal.g:3350:32: RULE_ADDITION_OP
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
            // InternalPascal.g:3352:28: ( RULE_ADDITION_OP RULE_INTEGER_NUMBER )
            // InternalPascal.g:3352:30: RULE_ADDITION_OP RULE_INTEGER_NUMBER
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
            // InternalPascal.g:3354:21: ( RULE_INT )
            // InternalPascal.g:3354:23: RULE_INT
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
            // InternalPascal.g:3356:18: ( ( RULE_INTEGER_NUMBER '.' ( RULE_INTEGER_NUMBER )? ( ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )? | RULE_INTEGER_NUMBER ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE ) )
            // InternalPascal.g:3356:20: ( RULE_INTEGER_NUMBER '.' ( RULE_INTEGER_NUMBER )? ( ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )? | RULE_INTEGER_NUMBER ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )
            {
            // InternalPascal.g:3356:20: ( RULE_INTEGER_NUMBER '.' ( RULE_INTEGER_NUMBER )? ( ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )? | RULE_INTEGER_NUMBER ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalPascal.g:3356:21: RULE_INTEGER_NUMBER '.' ( RULE_INTEGER_NUMBER )? ( ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )?
                    {
                    mRULE_INTEGER_NUMBER(); 
                    match('.'); 
                    // InternalPascal.g:3356:45: ( RULE_INTEGER_NUMBER )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalPascal.g:3356:45: RULE_INTEGER_NUMBER
                            {
                            mRULE_INTEGER_NUMBER(); 

                            }
                            break;

                    }

                    // InternalPascal.g:3356:66: ( ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='E'||LA3_0=='e') ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalPascal.g:3356:67: ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE
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
                    // InternalPascal.g:3356:99: RULE_INTEGER_NUMBER ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE
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
            // InternalPascal.g:3358:25: ( RULE_ADDITION_OP RULE_REAL_NUMBER )
            // InternalPascal.g:3358:27: RULE_ADDITION_OP RULE_REAL_NUMBER
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
            // InternalPascal.g:3360:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalPascal.g:3360:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalPascal.g:3360:11: ( '^' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='^') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalPascal.g:3360:11: '^'
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

            // InternalPascal.g:3360:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
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
            	    break loop6;
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
            // InternalPascal.g:3362:19: ( ( '0' .. '9' )+ )
            // InternalPascal.g:3362:21: ( '0' .. '9' )+
            {
            // InternalPascal.g:3362:21: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalPascal.g:3362:22: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
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
            // InternalPascal.g:3364:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalPascal.g:3364:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalPascal.g:3364:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\"') ) {
                alt10=1;
            }
            else if ( (LA10_0=='\'') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalPascal.g:3364:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalPascal.g:3364:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalPascal.g:3364:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPascal.g:3364:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop8;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalPascal.g:3364:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalPascal.g:3364:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='&')||(LA9_0>='(' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalPascal.g:3364:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPascal.g:3364:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop9;
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
            // InternalPascal.g:3366:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalPascal.g:3366:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalPascal.g:3366:24: ( options {greedy=false; } : . )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='*') ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1=='/') ) {
                        alt11=2;
                    }
                    else if ( ((LA11_1>='\u0000' && LA11_1<='.')||(LA11_1>='0' && LA11_1<='\uFFFF')) ) {
                        alt11=1;
                    }


                }
                else if ( ((LA11_0>='\u0000' && LA11_0<=')')||(LA11_0>='+' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalPascal.g:3366:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop11;
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
            // InternalPascal.g:3368:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalPascal.g:3368:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalPascal.g:3368:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalPascal.g:3368:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop12;
                }
            } while (true);

            // InternalPascal.g:3368:40: ( ( '\\r' )? '\\n' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\n'||LA14_0=='\r') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalPascal.g:3368:41: ( '\\r' )? '\\n'
                    {
                    // InternalPascal.g:3368:41: ( '\\r' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='\r') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalPascal.g:3368:41: '\\r'
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
            // InternalPascal.g:3370:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalPascal.g:3370:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalPascal.g:3370:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {
                    alt15=1;
                }


                switch (alt15) {
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
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
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
            // InternalPascal.g:3372:16: ( . )
            // InternalPascal.g:3372:18: .
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
        // InternalPascal.g:1:8: ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | RULE_ADDITION_OP | RULE_MULTIPLICATION_OP | RULE_SIGNED_INTEGER_NUMBER | RULE_INTEGER_NUMBER | RULE_REAL_NUMBER | RULE_SIGNED_REAL_NUMBER | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt16=37;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // InternalPascal.g:1:10: T__18
                {
                mT__18(); 

                }
                break;
            case 2 :
                // InternalPascal.g:1:16: T__19
                {
                mT__19(); 

                }
                break;
            case 3 :
                // InternalPascal.g:1:22: T__20
                {
                mT__20(); 

                }
                break;
            case 4 :
                // InternalPascal.g:1:28: T__21
                {
                mT__21(); 

                }
                break;
            case 5 :
                // InternalPascal.g:1:34: T__22
                {
                mT__22(); 

                }
                break;
            case 6 :
                // InternalPascal.g:1:40: T__23
                {
                mT__23(); 

                }
                break;
            case 7 :
                // InternalPascal.g:1:46: T__24
                {
                mT__24(); 

                }
                break;
            case 8 :
                // InternalPascal.g:1:52: T__25
                {
                mT__25(); 

                }
                break;
            case 9 :
                // InternalPascal.g:1:58: T__26
                {
                mT__26(); 

                }
                break;
            case 10 :
                // InternalPascal.g:1:64: T__27
                {
                mT__27(); 

                }
                break;
            case 11 :
                // InternalPascal.g:1:70: T__28
                {
                mT__28(); 

                }
                break;
            case 12 :
                // InternalPascal.g:1:76: T__29
                {
                mT__29(); 

                }
                break;
            case 13 :
                // InternalPascal.g:1:82: T__30
                {
                mT__30(); 

                }
                break;
            case 14 :
                // InternalPascal.g:1:88: T__31
                {
                mT__31(); 

                }
                break;
            case 15 :
                // InternalPascal.g:1:94: T__32
                {
                mT__32(); 

                }
                break;
            case 16 :
                // InternalPascal.g:1:100: T__33
                {
                mT__33(); 

                }
                break;
            case 17 :
                // InternalPascal.g:1:106: T__34
                {
                mT__34(); 

                }
                break;
            case 18 :
                // InternalPascal.g:1:112: T__35
                {
                mT__35(); 

                }
                break;
            case 19 :
                // InternalPascal.g:1:118: T__36
                {
                mT__36(); 

                }
                break;
            case 20 :
                // InternalPascal.g:1:124: T__37
                {
                mT__37(); 

                }
                break;
            case 21 :
                // InternalPascal.g:1:130: T__38
                {
                mT__38(); 

                }
                break;
            case 22 :
                // InternalPascal.g:1:136: T__39
                {
                mT__39(); 

                }
                break;
            case 23 :
                // InternalPascal.g:1:142: T__40
                {
                mT__40(); 

                }
                break;
            case 24 :
                // InternalPascal.g:1:148: T__41
                {
                mT__41(); 

                }
                break;
            case 25 :
                // InternalPascal.g:1:154: T__42
                {
                mT__42(); 

                }
                break;
            case 26 :
                // InternalPascal.g:1:160: RULE_ADDITION_OP
                {
                mRULE_ADDITION_OP(); 

                }
                break;
            case 27 :
                // InternalPascal.g:1:177: RULE_MULTIPLICATION_OP
                {
                mRULE_MULTIPLICATION_OP(); 

                }
                break;
            case 28 :
                // InternalPascal.g:1:200: RULE_SIGNED_INTEGER_NUMBER
                {
                mRULE_SIGNED_INTEGER_NUMBER(); 

                }
                break;
            case 29 :
                // InternalPascal.g:1:227: RULE_INTEGER_NUMBER
                {
                mRULE_INTEGER_NUMBER(); 

                }
                break;
            case 30 :
                // InternalPascal.g:1:247: RULE_REAL_NUMBER
                {
                mRULE_REAL_NUMBER(); 

                }
                break;
            case 31 :
                // InternalPascal.g:1:264: RULE_SIGNED_REAL_NUMBER
                {
                mRULE_SIGNED_REAL_NUMBER(); 

                }
                break;
            case 32 :
                // InternalPascal.g:1:288: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 33 :
                // InternalPascal.g:1:296: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 34 :
                // InternalPascal.g:1:308: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 35 :
                // InternalPascal.g:1:324: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 36 :
                // InternalPascal.g:1:340: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 37 :
                // InternalPascal.g:1:348: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA4_eotS =
        "\4\uffff";
    static final String DFA4_eofS =
        "\4\uffff";
    static final String DFA4_minS =
        "\1\60\1\56\2\uffff";
    static final String DFA4_maxS =
        "\1\71\1\145\2\uffff";
    static final String DFA4_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA4_specialS =
        "\4\uffff}>";
    static final String[] DFA4_transitionS = {
            "\12\1",
            "\1\2\1\uffff\12\1\13\uffff\1\3\37\uffff\1\3",
            "",
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
            return "3356:20: ( RULE_INTEGER_NUMBER '.' ( RULE_INTEGER_NUMBER )? ( ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )? | RULE_INTEGER_NUMBER ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )";
        }
    }
    static final String DFA16_eotS =
        "\2\uffff\1\42\1\uffff\2\42\1\47\1\uffff\4\42\2\uffff\4\42\1\uffff\3\42\1\71\1\75\1\76\1\37\1\uffff\2\37\4\uffff\1\42\2\uffff\2\42\3\uffff\1\106\5\42\2\uffff\4\42\1\uffff\2\42\1\122\1\uffff\1\123\5\uffff\1\76\2\uffff\2\42\1\130\1\uffff\1\131\4\42\1\136\1\137\4\42\3\uffff\3\42\2\uffff\1\147\1\150\2\42\2\uffff\6\42\1\161\2\uffff\1\162\1\42\1\164\1\165\1\42\1\167\2\42\2\uffff\1\42\2\uffff\1\173\1\uffff\1\174\2\42\2\uffff\1\42\1\u0080\1\u0081\2\uffff";
    static final String DFA16_eofS =
        "\u0082\uffff";
    static final String DFA16_minS =
        "\1\0\1\uffff\1\162\1\uffff\1\145\1\156\1\75\1\uffff\1\162\1\156\1\162\1\141\2\uffff\1\157\2\141\1\157\1\uffff\1\145\1\150\1\157\1\60\1\52\1\56\1\101\1\uffff\2\0\4\uffff\1\157\2\uffff\1\147\1\144\3\uffff\1\60\1\144\1\165\1\160\1\154\1\156\2\uffff\1\164\1\162\1\142\1\156\1\uffff\1\143\1\151\1\60\1\uffff\1\56\5\uffff\1\56\2\uffff\1\143\1\151\1\60\1\uffff\1\60\2\145\1\163\1\143\2\60\1\145\1\163\1\157\1\154\3\uffff\1\162\1\145\1\156\2\uffff\2\60\1\145\1\164\2\uffff\1\154\1\164\1\162\1\145\1\141\1\144\1\60\2\uffff\1\60\1\151\2\60\1\144\1\60\1\155\1\165\2\uffff\1\157\2\uffff\1\60\1\uffff\1\60\1\162\1\156\2\uffff\1\145\2\60\2\uffff";
    static final String DFA16_maxS =
        "\1\uffff\1\uffff\1\162\1\uffff\1\145\1\156\1\75\1\uffff\1\162\1\156\1\171\1\165\2\uffff\1\157\2\141\1\157\1\uffff\1\145\1\150\1\157\1\71\1\57\1\145\1\172\1\uffff\2\uffff\4\uffff\1\157\2\uffff\1\147\1\144\3\uffff\1\172\1\144\1\165\1\160\1\154\1\156\2\uffff\1\164\1\162\1\142\1\156\1\uffff\1\143\1\151\1\172\1\uffff\1\145\5\uffff\1\145\2\uffff\1\147\1\151\1\172\1\uffff\1\172\2\145\1\163\1\143\2\172\1\145\1\163\1\157\1\154\3\uffff\1\162\1\145\1\156\2\uffff\2\172\1\145\1\164\2\uffff\1\154\1\164\1\162\1\145\1\141\1\144\1\172\2\uffff\1\172\1\151\2\172\1\144\1\172\1\155\1\165\2\uffff\1\157\2\uffff\1\172\1\uffff\1\172\1\162\1\156\2\uffff\1\145\2\172\2\uffff";
    static final String DFA16_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\3\uffff\1\10\4\uffff\1\15\1\16\4\uffff\1\25\7\uffff\1\40\2\uffff\1\33\1\44\1\45\1\1\1\uffff\1\40\1\3\2\uffff\1\7\1\6\1\10\6\uffff\1\15\1\16\4\uffff\1\25\3\uffff\1\32\1\uffff\1\42\1\43\1\33\1\35\1\36\1\uffff\1\41\1\44\3\uffff\1\11\13\uffff\1\31\1\34\1\37\3\uffff\1\5\1\12\4\uffff\1\17\1\21\7\uffff\1\13\1\26\10\uffff\1\4\1\14\1\uffff\1\23\1\24\1\uffff\1\30\3\uffff\1\27\1\2\3\uffff\1\20\1\22";
    static final String DFA16_specialS =
        "\1\1\32\uffff\1\2\1\0\145\uffff}>";
    static final String[] DFA16_transitionS = {
            "\11\37\2\36\2\37\1\36\22\37\1\36\1\37\1\33\4\37\1\34\1\14\1\15\1\35\1\26\1\7\1\26\1\1\1\27\12\30\1\6\1\3\1\37\1\22\3\37\32\32\3\37\1\31\1\32\1\37\1\11\1\4\1\21\1\25\1\5\1\13\5\32\1\20\1\32\1\16\1\10\1\2\1\32\1\23\1\32\1\12\1\32\1\17\1\24\3\32\uff85\37",
            "",
            "\1\41",
            "",
            "\1\44",
            "\1\45",
            "\1\46",
            "",
            "\1\51",
            "\1\52",
            "\1\53\6\uffff\1\54",
            "\1\55\23\uffff\1\56",
            "",
            "",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "",
            "\1\66",
            "\1\67",
            "\1\70",
            "\12\72",
            "\1\73\4\uffff\1\74",
            "\1\77\1\uffff\12\100\13\uffff\1\77\37\uffff\1\77",
            "\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\0\101",
            "\0\101",
            "",
            "",
            "",
            "",
            "\1\103",
            "",
            "",
            "\1\104",
            "\1\105",
            "",
            "",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "",
            "",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "",
            "\1\120",
            "\1\121",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\124\1\uffff\12\72\13\uffff\1\124\37\uffff\1\124",
            "",
            "",
            "",
            "",
            "",
            "\1\77\1\uffff\12\100\13\uffff\1\77\37\uffff\1\77",
            "",
            "",
            "\1\126\3\uffff\1\125",
            "\1\127",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "",
            "",
            "",
            "\1\144",
            "\1\145",
            "\1\146",
            "",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\151",
            "\1\152",
            "",
            "",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\163",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\166",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\170",
            "\1\171",
            "",
            "",
            "\1\172",
            "",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\175",
            "\1\176",
            "",
            "",
            "\1\177",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | RULE_ADDITION_OP | RULE_MULTIPLICATION_OP | RULE_SIGNED_INTEGER_NUMBER | RULE_INTEGER_NUMBER | RULE_REAL_NUMBER | RULE_SIGNED_REAL_NUMBER | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_28 = input.LA(1);

                        s = -1;
                        if ( ((LA16_28>='\u0000' && LA16_28<='\uFFFF')) ) {s = 65;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_0 = input.LA(1);

                        s = -1;
                        if ( (LA16_0=='.') ) {s = 1;}

                        else if ( (LA16_0=='p') ) {s = 2;}

                        else if ( (LA16_0==';') ) {s = 3;}

                        else if ( (LA16_0=='b') ) {s = 4;}

                        else if ( (LA16_0=='e') ) {s = 5;}

                        else if ( (LA16_0==':') ) {s = 6;}

                        else if ( (LA16_0==',') ) {s = 7;}

                        else if ( (LA16_0=='o') ) {s = 8;}

                        else if ( (LA16_0=='a') ) {s = 9;}

                        else if ( (LA16_0=='t') ) {s = 10;}

                        else if ( (LA16_0=='f') ) {s = 11;}

                        else if ( (LA16_0=='(') ) {s = 12;}

                        else if ( (LA16_0==')') ) {s = 13;}

                        else if ( (LA16_0=='n') ) {s = 14;}

                        else if ( (LA16_0=='v') ) {s = 15;}

                        else if ( (LA16_0=='l') ) {s = 16;}

                        else if ( (LA16_0=='c') ) {s = 17;}

                        else if ( (LA16_0=='=') ) {s = 18;}

                        else if ( (LA16_0=='r') ) {s = 19;}

                        else if ( (LA16_0=='w') ) {s = 20;}

                        else if ( (LA16_0=='d') ) {s = 21;}

                        else if ( (LA16_0=='+'||LA16_0=='-') ) {s = 22;}

                        else if ( (LA16_0=='/') ) {s = 23;}

                        else if ( ((LA16_0>='0' && LA16_0<='9')) ) {s = 24;}

                        else if ( (LA16_0=='^') ) {s = 25;}

                        else if ( ((LA16_0>='A' && LA16_0<='Z')||LA16_0=='_'||(LA16_0>='g' && LA16_0<='k')||LA16_0=='m'||LA16_0=='q'||LA16_0=='s'||LA16_0=='u'||(LA16_0>='x' && LA16_0<='z')) ) {s = 26;}

                        else if ( (LA16_0=='\"') ) {s = 27;}

                        else if ( (LA16_0=='\'') ) {s = 28;}

                        else if ( (LA16_0=='*') ) {s = 29;}

                        else if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {s = 30;}

                        else if ( ((LA16_0>='\u0000' && LA16_0<='\b')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\u001F')||LA16_0=='!'||(LA16_0>='#' && LA16_0<='&')||LA16_0=='<'||(LA16_0>='>' && LA16_0<='@')||(LA16_0>='[' && LA16_0<=']')||LA16_0=='`'||(LA16_0>='{' && LA16_0<='\uFFFF')) ) {s = 31;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_27 = input.LA(1);

                        s = -1;
                        if ( ((LA16_27>='\u0000' && LA16_27<='\uFFFF')) ) {s = 65;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}