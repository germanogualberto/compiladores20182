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
    public static final int RULE_PARENTHESES_COMMENT=8;
    public static final int RULE_STRING=16;
    public static final int RULE_REAL_NUMBER=11;
    public static final int RULE_SL_COMMENT=18;
    public static final int RULE_DIGIT_SEQUENCE=15;
    public static final int RULE_NUMERIC_SUBRANGE=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=19;
    public static final int RULE_MULTIPLICATION_OP=6;
    public static final int RULE_ANY_OTHER=20;
    public static final int RULE_SIGNED_INTEGER_NUMBER=12;
    public static final int RULE_SIGNED_REAL_NUMBER=13;
    public static final int RULE_INT=10;
    public static final int T__22=22;
    public static final int RULE_CURLY_BRACKETS_COMMENT=9;
    public static final int RULE_ML_COMMENT=17;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_ADDITION_OP=5;
    public static final int RULE_RELATIONAL_OP=7;
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

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
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
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
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
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:13:7: ( '(' )
            // InternalPascal.g:13:9: '('
            {
            match('('); 

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
            // InternalPascal.g:14:7: ( ')' )
            // InternalPascal.g:14:9: ')'
            {
            match(')'); 

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
            // InternalPascal.g:15:7: ( ',' )
            // InternalPascal.g:15:9: ','
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

    // $ANTLR start "RULE_ADDITION_OP"
    public final void mRULE_ADDITION_OP() throws RecognitionException {
        try {
            // InternalPascal.g:459:27: ( ( '+' | '-' ) )
            // InternalPascal.g:459:29: ( '+' | '-' )
            {
            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

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
            // InternalPascal.g:461:24: ( ( '*' | '/' ) )
            // InternalPascal.g:461:26: ( '*' | '/' )
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
            // InternalPascal.g:463:20: ( ( '=' | '<>' | '<' | '<=' | '>' | '>=' ) )
            // InternalPascal.g:463:22: ( '=' | '<>' | '<' | '<=' | '>' | '>=' )
            {
            // InternalPascal.g:463:22: ( '=' | '<>' | '<' | '<=' | '>' | '>=' )
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
                    // InternalPascal.g:463:23: '='
                    {
                    match('='); 

                    }
                    break;
                case 2 :
                    // InternalPascal.g:463:27: '<>'
                    {
                    match("<>"); 


                    }
                    break;
                case 3 :
                    // InternalPascal.g:463:32: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 4 :
                    // InternalPascal.g:463:36: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 5 :
                    // InternalPascal.g:463:41: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 6 :
                    // InternalPascal.g:463:45: '>='
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
            // InternalPascal.g:465:26: ( '(*' ( options {greedy=false; } : . )* '*)' )
            // InternalPascal.g:465:28: '(*' ( options {greedy=false; } : . )* '*)'
            {
            match("(*"); 

            // InternalPascal.g:465:33: ( options {greedy=false; } : . )*
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
            	    // InternalPascal.g:465:61: .
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
            // InternalPascal.g:467:29: ( '{' ( options {greedy=false; } : . )* '}' )
            // InternalPascal.g:467:31: '{' ( options {greedy=false; } : . )* '}'
            {
            match('{'); 
            // InternalPascal.g:467:35: ( options {greedy=false; } : . )*
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
            	    // InternalPascal.g:467:63: .
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
            // InternalPascal.g:469:23: ( ( RULE_INT | RULE_REAL_NUMBER | RULE_SIGNED_INTEGER_NUMBER | RULE_SIGNED_REAL_NUMBER ) '..' )
            // InternalPascal.g:469:25: ( RULE_INT | RULE_REAL_NUMBER | RULE_SIGNED_INTEGER_NUMBER | RULE_SIGNED_REAL_NUMBER ) '..'
            {
            // InternalPascal.g:469:25: ( RULE_INT | RULE_REAL_NUMBER | RULE_SIGNED_INTEGER_NUMBER | RULE_SIGNED_REAL_NUMBER )
            int alt4=4;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalPascal.g:469:26: RULE_INT
                    {
                    mRULE_INT(); 

                    }
                    break;
                case 2 :
                    // InternalPascal.g:469:35: RULE_REAL_NUMBER
                    {
                    mRULE_REAL_NUMBER(); 

                    }
                    break;
                case 3 :
                    // InternalPascal.g:469:52: RULE_SIGNED_INTEGER_NUMBER
                    {
                    mRULE_SIGNED_INTEGER_NUMBER(); 

                    }
                    break;
                case 4 :
                    // InternalPascal.g:469:79: RULE_SIGNED_REAL_NUMBER
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
            // InternalPascal.g:471:30: ( ( RULE_ADDITION_OP )? RULE_INT )
            // InternalPascal.g:471:32: ( RULE_ADDITION_OP )? RULE_INT
            {
            // InternalPascal.g:471:32: ( RULE_ADDITION_OP )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='+'||LA5_0=='-') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalPascal.g:471:32: RULE_ADDITION_OP
                    {
                    mRULE_ADDITION_OP(); 

                    }
                    break;

            }

            mRULE_INT(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT_SEQUENCE"

    // $ANTLR start "RULE_SIGNED_INTEGER_NUMBER"
    public final void mRULE_SIGNED_INTEGER_NUMBER() throws RecognitionException {
        try {
            // InternalPascal.g:473:37: ( RULE_ADDITION_OP RULE_INT )
            // InternalPascal.g:473:39: RULE_ADDITION_OP RULE_INT
            {
            mRULE_ADDITION_OP(); 
            mRULE_INT(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_SIGNED_INTEGER_NUMBER"

    // $ANTLR start "RULE_REAL_NUMBER"
    public final void mRULE_REAL_NUMBER() throws RecognitionException {
        try {
            // InternalPascal.g:475:27: ( ( RULE_INT '.' ( RULE_INT )? ( ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )? | RULE_INT ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE ) )
            // InternalPascal.g:475:29: ( RULE_INT '.' ( RULE_INT )? ( ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )? | RULE_INT ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )
            {
            // InternalPascal.g:475:29: ( RULE_INT '.' ( RULE_INT )? ( ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )? | RULE_INT ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalPascal.g:475:30: RULE_INT '.' ( RULE_INT )? ( ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )?
                    {
                    mRULE_INT(); 
                    match('.'); 
                    // InternalPascal.g:475:43: ( RULE_INT )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalPascal.g:475:43: RULE_INT
                            {
                            mRULE_INT(); 

                            }
                            break;

                    }

                    // InternalPascal.g:475:53: ( ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='E'||LA7_0=='e') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalPascal.g:475:54: ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE
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
                    // InternalPascal.g:475:86: RULE_INT ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE
                    {
                    mRULE_INT(); 
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

        }
        finally {
        }
    }
    // $ANTLR end "RULE_REAL_NUMBER"

    // $ANTLR start "RULE_SIGNED_REAL_NUMBER"
    public final void mRULE_SIGNED_REAL_NUMBER() throws RecognitionException {
        try {
            // InternalPascal.g:477:34: ( RULE_ADDITION_OP RULE_REAL_NUMBER )
            // InternalPascal.g:477:36: RULE_ADDITION_OP RULE_REAL_NUMBER
            {
            mRULE_ADDITION_OP(); 
            mRULE_REAL_NUMBER(); 

            }

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
            // InternalPascal.g:479:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalPascal.g:479:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalPascal.g:479:11: ( '^' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='^') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalPascal.g:479:11: '^'
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

            // InternalPascal.g:479:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // InternalPascal.g:481:19: ( ( '0' .. '9' )+ )
            // InternalPascal.g:481:21: ( '0' .. '9' )+
            {
            // InternalPascal.g:481:21: ( '0' .. '9' )+
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
            	    // InternalPascal.g:481:22: '0' .. '9'
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
            // InternalPascal.g:483:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalPascal.g:483:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalPascal.g:483:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalPascal.g:483:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalPascal.g:483:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalPascal.g:483:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPascal.g:483:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalPascal.g:483:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalPascal.g:483:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalPascal.g:483:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPascal.g:483:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalPascal.g:485:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalPascal.g:485:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalPascal.g:485:24: ( options {greedy=false; } : . )*
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
            	    // InternalPascal.g:485:52: .
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
            // InternalPascal.g:487:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalPascal.g:487:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalPascal.g:487:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\u0000' && LA16_0<='\t')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\uFFFF')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalPascal.g:487:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalPascal.g:487:40: ( ( '\\r' )? '\\n' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='\n'||LA18_0=='\r') ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalPascal.g:487:41: ( '\\r' )? '\\n'
                    {
                    // InternalPascal.g:487:41: ( '\\r' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0=='\r') ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalPascal.g:487:41: '\\r'
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
            // InternalPascal.g:489:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalPascal.g:489:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalPascal.g:489:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalPascal.g:491:16: ( . )
            // InternalPascal.g:491:18: .
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
        // InternalPascal.g:1:8: ( T__21 | T__22 | T__23 | T__24 | T__25 | RULE_MULTIPLICATION_OP | RULE_RELATIONAL_OP | RULE_PARENTHESES_COMMENT | RULE_CURLY_BRACKETS_COMMENT | RULE_NUMERIC_SUBRANGE | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt20=16;
        alt20 = dfa20.predict(input);
        switch (alt20) {
            case 1 :
                // InternalPascal.g:1:10: T__21
                {
                mT__21(); 

                }
                break;
            case 2 :
                // InternalPascal.g:1:16: T__22
                {
                mT__22(); 

                }
                break;
            case 3 :
                // InternalPascal.g:1:22: T__23
                {
                mT__23(); 

                }
                break;
            case 4 :
                // InternalPascal.g:1:28: T__24
                {
                mT__24(); 

                }
                break;
            case 5 :
                // InternalPascal.g:1:34: T__25
                {
                mT__25(); 

                }
                break;
            case 6 :
                // InternalPascal.g:1:40: RULE_MULTIPLICATION_OP
                {
                mRULE_MULTIPLICATION_OP(); 

                }
                break;
            case 7 :
                // InternalPascal.g:1:63: RULE_RELATIONAL_OP
                {
                mRULE_RELATIONAL_OP(); 

                }
                break;
            case 8 :
                // InternalPascal.g:1:82: RULE_PARENTHESES_COMMENT
                {
                mRULE_PARENTHESES_COMMENT(); 

                }
                break;
            case 9 :
                // InternalPascal.g:1:107: RULE_CURLY_BRACKETS_COMMENT
                {
                mRULE_CURLY_BRACKETS_COMMENT(); 

                }
                break;
            case 10 :
                // InternalPascal.g:1:135: RULE_NUMERIC_SUBRANGE
                {
                mRULE_NUMERIC_SUBRANGE(); 

                }
                break;
            case 11 :
                // InternalPascal.g:1:157: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 12 :
                // InternalPascal.g:1:165: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 13 :
                // InternalPascal.g:1:177: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 14 :
                // InternalPascal.g:1:193: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 15 :
                // InternalPascal.g:1:209: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 16 :
                // InternalPascal.g:1:217: RULE_ANY_OTHER
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
            return "469:25: ( RULE_INT | RULE_REAL_NUMBER | RULE_SIGNED_INTEGER_NUMBER | RULE_SIGNED_REAL_NUMBER )";
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
            return "475:29: ( RULE_INT '.' ( RULE_INT )? ( ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )? | RULE_INT ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )";
        }
    }
    static final String DFA20_eotS =
        "\1\uffff\1\25\1\uffff\1\30\2\uffff\1\35\3\uffff\4\23\1\uffff\2\23\3\uffff\1\25\16\uffff\4\25\1\50\1\uffff";
    static final String DFA20_eofS =
        "\51\uffff";
    static final String DFA20_minS =
        "\1\0\1\162\1\uffff\1\52\2\uffff\1\52\3\uffff\1\0\1\56\1\60\1\101\1\uffff\2\0\3\uffff\1\157\16\uffff\1\147\1\162\1\141\1\155\1\60\1\uffff";
    static final String DFA20_maxS =
        "\1\uffff\1\162\1\uffff\1\52\2\uffff\1\57\3\uffff\1\uffff\1\145\1\71\1\172\1\uffff\2\uffff\3\uffff\1\157\16\uffff\1\147\1\162\1\141\1\155\1\172\1\uffff";
    static final String DFA20_acceptS =
        "\2\uffff\1\2\1\uffff\1\4\1\5\1\uffff\3\7\4\uffff\1\13\2\uffff\1\6\1\17\1\20\1\uffff\1\13\1\2\1\10\1\3\1\4\1\5\1\15\1\16\1\6\1\7\1\11\1\12\1\14\1\17\5\uffff\1\1";
    static final String DFA20_specialS =
        "\1\1\11\uffff\1\2\4\uffff\1\0\1\3\30\uffff}>";
    static final String[] DFA20_transitionS = {
            "\11\23\2\22\2\23\1\22\22\23\1\22\1\23\1\17\4\23\1\20\1\3\1\4\1\21\1\14\1\5\1\14\1\23\1\6\12\13\1\23\1\2\1\10\1\7\1\11\2\23\32\16\3\23\1\15\1\16\1\23\17\16\1\1\12\16\1\12\uff84\23",
            "\1\24",
            "",
            "\1\27",
            "",
            "",
            "\1\33\4\uffff\1\34",
            "",
            "",
            "",
            "\0\37",
            "\1\40\1\uffff\12\40\13\uffff\1\40\37\uffff\1\40",
            "\12\40",
            "\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\0\41",
            "\0\41",
            "",
            "",
            "",
            "\1\43",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
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
            return "1:1: Tokens : ( T__21 | T__22 | T__23 | T__24 | T__25 | RULE_MULTIPLICATION_OP | RULE_RELATIONAL_OP | RULE_PARENTHESES_COMMENT | RULE_CURLY_BRACKETS_COMMENT | RULE_NUMERIC_SUBRANGE | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_15 = input.LA(1);

                        s = -1;
                        if ( ((LA20_15>='\u0000' && LA20_15<='\uFFFF')) ) {s = 33;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA20_0 = input.LA(1);

                        s = -1;
                        if ( (LA20_0=='p') ) {s = 1;}

                        else if ( (LA20_0==';') ) {s = 2;}

                        else if ( (LA20_0=='(') ) {s = 3;}

                        else if ( (LA20_0==')') ) {s = 4;}

                        else if ( (LA20_0==',') ) {s = 5;}

                        else if ( (LA20_0=='/') ) {s = 6;}

                        else if ( (LA20_0=='=') ) {s = 7;}

                        else if ( (LA20_0=='<') ) {s = 8;}

                        else if ( (LA20_0=='>') ) {s = 9;}

                        else if ( (LA20_0=='{') ) {s = 10;}

                        else if ( ((LA20_0>='0' && LA20_0<='9')) ) {s = 11;}

                        else if ( (LA20_0=='+'||LA20_0=='-') ) {s = 12;}

                        else if ( (LA20_0=='^') ) {s = 13;}

                        else if ( ((LA20_0>='A' && LA20_0<='Z')||LA20_0=='_'||(LA20_0>='a' && LA20_0<='o')||(LA20_0>='q' && LA20_0<='z')) ) {s = 14;}

                        else if ( (LA20_0=='\"') ) {s = 15;}

                        else if ( (LA20_0=='\'') ) {s = 16;}

                        else if ( (LA20_0=='*') ) {s = 17;}

                        else if ( ((LA20_0>='\t' && LA20_0<='\n')||LA20_0=='\r'||LA20_0==' ') ) {s = 18;}

                        else if ( ((LA20_0>='\u0000' && LA20_0<='\b')||(LA20_0>='\u000B' && LA20_0<='\f')||(LA20_0>='\u000E' && LA20_0<='\u001F')||LA20_0=='!'||(LA20_0>='#' && LA20_0<='&')||LA20_0=='.'||LA20_0==':'||(LA20_0>='?' && LA20_0<='@')||(LA20_0>='[' && LA20_0<=']')||LA20_0=='`'||(LA20_0>='|' && LA20_0<='\uFFFF')) ) {s = 19;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA20_10 = input.LA(1);

                        s = -1;
                        if ( ((LA20_10>='\u0000' && LA20_10<='\uFFFF')) ) {s = 31;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA20_16 = input.LA(1);

                        s = -1;
                        if ( ((LA20_16>='\u0000' && LA20_16<='\uFFFF')) ) {s = 33;}

                        else s = 19;

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