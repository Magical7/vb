// $ANTLR 3.5 Calc.g 2013-05-16 12:31:10

package vb.week3.calc;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class CalcLexer extends Lexer {
	public static final int EOF=-1;
	public static final int BECOMES=4;
	public static final int COLON=5;
	public static final int COMMA=6;
	public static final int COMMENT=7;
	public static final int DIGIT=8;
	public static final int ELSE=9;
	public static final int EQUALS=10;
	public static final int GREATER=11;
	public static final int GREATEREQ=12;
	public static final int IDENTIFIER=13;
	public static final int IF=14;
	public static final int INTEGER=15;
	public static final int LETTER=16;
	public static final int LOWER=17;
	public static final int LPAREN=18;
	public static final int MINUS=19;
	public static final int NOTEQUALS=20;
	public static final int NUMBER=21;
	public static final int PLUS=22;
	public static final int PRINT=23;
	public static final int PROGRAM=24;
	public static final int QUOTIENT=25;
	public static final int RPAREN=26;
	public static final int SEMICOLON=27;
	public static final int SMALLER=28;
	public static final int SMALLEREQ=29;
	public static final int SWAP=30;
	public static final int THEN=31;
	public static final int TIMES=32;
	public static final int UPPER=33;
	public static final int VAR=34;
	public static final int WS=35;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public CalcLexer() {} 
	public CalcLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public CalcLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "Calc.g"; }

	// $ANTLR start "BECOMES"
	public final void mBECOMES() throws RecognitionException {
		try {
			int _type = BECOMES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Calc.g:11:9: ( ':=' )
			// Calc.g:11:11: ':='
			{
			match(":="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BECOMES"

	// $ANTLR start "COLON"
	public final void mCOLON() throws RecognitionException {
		try {
			int _type = COLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Calc.g:12:7: ( ':' )
			// Calc.g:12:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COLON"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Calc.g:13:7: ( ',' )
			// Calc.g:13:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Calc.g:14:6: ( 'else' )
			// Calc.g:14:8: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE"

	// $ANTLR start "EQUALS"
	public final void mEQUALS() throws RecognitionException {
		try {
			int _type = EQUALS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Calc.g:15:8: ( '==' )
			// Calc.g:15:10: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQUALS"

	// $ANTLR start "GREATER"
	public final void mGREATER() throws RecognitionException {
		try {
			int _type = GREATER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Calc.g:16:9: ( '>' )
			// Calc.g:16:11: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GREATER"

	// $ANTLR start "GREATEREQ"
	public final void mGREATEREQ() throws RecognitionException {
		try {
			int _type = GREATEREQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Calc.g:17:11: ( '>=' )
			// Calc.g:17:13: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GREATEREQ"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Calc.g:18:4: ( 'if' )
			// Calc.g:18:6: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "INTEGER"
	public final void mINTEGER() throws RecognitionException {
		try {
			int _type = INTEGER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Calc.g:19:9: ( 'integer' )
			// Calc.g:19:11: 'integer'
			{
			match("integer"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTEGER"

	// $ANTLR start "LPAREN"
	public final void mLPAREN() throws RecognitionException {
		try {
			int _type = LPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Calc.g:20:8: ( '(' )
			// Calc.g:20:10: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LPAREN"

	// $ANTLR start "MINUS"
	public final void mMINUS() throws RecognitionException {
		try {
			int _type = MINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Calc.g:21:7: ( '-' )
			// Calc.g:21:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MINUS"

	// $ANTLR start "NOTEQUALS"
	public final void mNOTEQUALS() throws RecognitionException {
		try {
			int _type = NOTEQUALS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Calc.g:22:11: ( '!=' )
			// Calc.g:22:13: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOTEQUALS"

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Calc.g:23:6: ( '+' )
			// Calc.g:23:8: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLUS"

	// $ANTLR start "PRINT"
	public final void mPRINT() throws RecognitionException {
		try {
			int _type = PRINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Calc.g:24:7: ( 'print' )
			// Calc.g:24:9: 'print'
			{
			match("print"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PRINT"

	// $ANTLR start "PROGRAM"
	public final void mPROGRAM() throws RecognitionException {
		try {
			int _type = PROGRAM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Calc.g:25:9: ( 'program' )
			// Calc.g:25:11: 'program'
			{
			match("program"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PROGRAM"

	// $ANTLR start "QUOTIENT"
	public final void mQUOTIENT() throws RecognitionException {
		try {
			int _type = QUOTIENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Calc.g:26:10: ( '%' )
			// Calc.g:26:12: '%'
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QUOTIENT"

	// $ANTLR start "RPAREN"
	public final void mRPAREN() throws RecognitionException {
		try {
			int _type = RPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Calc.g:27:8: ( ')' )
			// Calc.g:27:10: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RPAREN"

	// $ANTLR start "SEMICOLON"
	public final void mSEMICOLON() throws RecognitionException {
		try {
			int _type = SEMICOLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Calc.g:28:11: ( ';' )
			// Calc.g:28:13: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEMICOLON"

	// $ANTLR start "SMALLER"
	public final void mSMALLER() throws RecognitionException {
		try {
			int _type = SMALLER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Calc.g:29:9: ( '<' )
			// Calc.g:29:11: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SMALLER"

	// $ANTLR start "SMALLEREQ"
	public final void mSMALLEREQ() throws RecognitionException {
		try {
			int _type = SMALLEREQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Calc.g:30:11: ( '<=' )
			// Calc.g:30:13: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SMALLEREQ"

	// $ANTLR start "SWAP"
	public final void mSWAP() throws RecognitionException {
		try {
			int _type = SWAP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Calc.g:31:6: ( 'swap' )
			// Calc.g:31:8: 'swap'
			{
			match("swap"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SWAP"

	// $ANTLR start "THEN"
	public final void mTHEN() throws RecognitionException {
		try {
			int _type = THEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Calc.g:32:6: ( 'then' )
			// Calc.g:32:8: 'then'
			{
			match("then"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THEN"

	// $ANTLR start "TIMES"
	public final void mTIMES() throws RecognitionException {
		try {
			int _type = TIMES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Calc.g:33:7: ( '*' )
			// Calc.g:33:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TIMES"

	// $ANTLR start "VAR"
	public final void mVAR() throws RecognitionException {
		try {
			int _type = VAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Calc.g:34:5: ( 'var' )
			// Calc.g:34:7: 'var'
			{
			match("var"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAR"

	// $ANTLR start "IDENTIFIER"
	public final void mIDENTIFIER() throws RecognitionException {
		try {
			int _type = IDENTIFIER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Calc.g:117:5: ( LETTER ( LETTER | DIGIT )* )
			// Calc.g:117:9: LETTER ( LETTER | DIGIT )*
			{
			mLETTER(); 

			// Calc.g:117:16: ( LETTER | DIGIT )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// Calc.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IDENTIFIER"

	// $ANTLR start "NUMBER"
	public final void mNUMBER() throws RecognitionException {
		try {
			int _type = NUMBER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Calc.g:121:5: ( ( DIGIT )+ )
			// Calc.g:121:9: ( DIGIT )+
			{
			// Calc.g:121:9: ( DIGIT )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// Calc.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUMBER"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Calc.g:126:5: ( '//' ( . )* '\\n' )
			// Calc.g:126:9: '//' ( . )* '\\n'
			{
			match("//"); 

			// Calc.g:126:14: ( . )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0=='\n') ) {
					alt3=2;
				}
				else if ( ((LA3_0 >= '\u0000' && LA3_0 <= '\t')||(LA3_0 >= '\u000B' && LA3_0 <= '\uFFFF')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// Calc.g:126:14: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop3;
				}
			}

			match('\n'); 
			 _channel=HIDDEN; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Calc.g:131:5: ( ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+ )
			// Calc.g:131:9: ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+
			{
			// Calc.g:131:9: ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '\t' && LA4_0 <= '\n')||(LA4_0 >= '\f' && LA4_0 <= '\r')||LA4_0==' ') ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// Calc.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			 _channel=HIDDEN; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// Calc.g:135:17: ( ( '0' .. '9' ) )
			// Calc.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "LOWER"
	public final void mLOWER() throws RecognitionException {
		try {
			// Calc.g:136:17: ( ( 'a' .. 'z' ) )
			// Calc.g:
			{
			if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LOWER"

	// $ANTLR start "UPPER"
	public final void mUPPER() throws RecognitionException {
		try {
			// Calc.g:137:17: ( ( 'A' .. 'Z' ) )
			// Calc.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UPPER"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// Calc.g:138:17: ( LOWER | UPPER )
			// Calc.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	@Override
	public void mTokens() throws RecognitionException {
		// Calc.g:1:8: ( BECOMES | COLON | COMMA | ELSE | EQUALS | GREATER | GREATEREQ | IF | INTEGER | LPAREN | MINUS | NOTEQUALS | PLUS | PRINT | PROGRAM | QUOTIENT | RPAREN | SEMICOLON | SMALLER | SMALLEREQ | SWAP | THEN | TIMES | VAR | IDENTIFIER | NUMBER | COMMENT | WS )
		int alt5=28;
		alt5 = dfa5.predict(input);
		switch (alt5) {
			case 1 :
				// Calc.g:1:10: BECOMES
				{
				mBECOMES(); 

				}
				break;
			case 2 :
				// Calc.g:1:18: COLON
				{
				mCOLON(); 

				}
				break;
			case 3 :
				// Calc.g:1:24: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 4 :
				// Calc.g:1:30: ELSE
				{
				mELSE(); 

				}
				break;
			case 5 :
				// Calc.g:1:35: EQUALS
				{
				mEQUALS(); 

				}
				break;
			case 6 :
				// Calc.g:1:42: GREATER
				{
				mGREATER(); 

				}
				break;
			case 7 :
				// Calc.g:1:50: GREATEREQ
				{
				mGREATEREQ(); 

				}
				break;
			case 8 :
				// Calc.g:1:60: IF
				{
				mIF(); 

				}
				break;
			case 9 :
				// Calc.g:1:63: INTEGER
				{
				mINTEGER(); 

				}
				break;
			case 10 :
				// Calc.g:1:71: LPAREN
				{
				mLPAREN(); 

				}
				break;
			case 11 :
				// Calc.g:1:78: MINUS
				{
				mMINUS(); 

				}
				break;
			case 12 :
				// Calc.g:1:84: NOTEQUALS
				{
				mNOTEQUALS(); 

				}
				break;
			case 13 :
				// Calc.g:1:94: PLUS
				{
				mPLUS(); 

				}
				break;
			case 14 :
				// Calc.g:1:99: PRINT
				{
				mPRINT(); 

				}
				break;
			case 15 :
				// Calc.g:1:105: PROGRAM
				{
				mPROGRAM(); 

				}
				break;
			case 16 :
				// Calc.g:1:113: QUOTIENT
				{
				mQUOTIENT(); 

				}
				break;
			case 17 :
				// Calc.g:1:122: RPAREN
				{
				mRPAREN(); 

				}
				break;
			case 18 :
				// Calc.g:1:129: SEMICOLON
				{
				mSEMICOLON(); 

				}
				break;
			case 19 :
				// Calc.g:1:139: SMALLER
				{
				mSMALLER(); 

				}
				break;
			case 20 :
				// Calc.g:1:147: SMALLEREQ
				{
				mSMALLEREQ(); 

				}
				break;
			case 21 :
				// Calc.g:1:157: SWAP
				{
				mSWAP(); 

				}
				break;
			case 22 :
				// Calc.g:1:162: THEN
				{
				mTHEN(); 

				}
				break;
			case 23 :
				// Calc.g:1:167: TIMES
				{
				mTIMES(); 

				}
				break;
			case 24 :
				// Calc.g:1:173: VAR
				{
				mVAR(); 

				}
				break;
			case 25 :
				// Calc.g:1:177: IDENTIFIER
				{
				mIDENTIFIER(); 

				}
				break;
			case 26 :
				// Calc.g:1:188: NUMBER
				{
				mNUMBER(); 

				}
				break;
			case 27 :
				// Calc.g:1:195: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 28 :
				// Calc.g:1:203: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA5 dfa5 = new DFA5(this);
	static final String DFA5_eotS =
		"\1\uffff\1\31\1\uffff\1\24\1\uffff\1\34\1\24\4\uffff\1\24\3\uffff\1\41"+
		"\2\24\1\uffff\1\24\6\uffff\1\24\2\uffff\1\46\2\24\2\uffff\4\24\1\uffff"+
		"\5\24\1\63\1\64\3\24\1\70\1\71\2\uffff\1\24\1\73\1\24\2\uffff\1\24\1\uffff"+
		"\1\24\1\77\1\100\2\uffff";
	static final String DFA5_eofS =
		"\101\uffff";
	static final String DFA5_minS =
		"\1\11\1\75\1\uffff\1\154\1\uffff\1\75\1\146\4\uffff\1\162\3\uffff\1\75"+
		"\1\167\1\150\1\uffff\1\141\6\uffff\1\163\2\uffff\1\60\1\164\1\151\2\uffff"+
		"\1\141\1\145\1\162\1\145\1\uffff\1\145\1\156\1\147\1\160\1\156\2\60\1"+
		"\147\1\164\1\162\2\60\2\uffff\1\145\1\60\1\141\2\uffff\1\162\1\uffff\1"+
		"\155\2\60\2\uffff";
	static final String DFA5_maxS =
		"\1\172\1\75\1\uffff\1\154\1\uffff\1\75\1\156\4\uffff\1\162\3\uffff\1\75"+
		"\1\167\1\150\1\uffff\1\141\6\uffff\1\163\2\uffff\1\172\1\164\1\157\2\uffff"+
		"\1\141\1\145\1\162\1\145\1\uffff\1\145\1\156\1\147\1\160\1\156\2\172\1"+
		"\147\1\164\1\162\2\172\2\uffff\1\145\1\172\1\141\2\uffff\1\162\1\uffff"+
		"\1\155\2\172\2\uffff";
	static final String DFA5_acceptS =
		"\2\uffff\1\3\1\uffff\1\5\2\uffff\1\12\1\13\1\14\1\15\1\uffff\1\20\1\21"+
		"\1\22\3\uffff\1\27\1\uffff\1\31\1\32\1\33\1\34\1\1\1\2\1\uffff\1\7\1\6"+
		"\3\uffff\1\24\1\23\4\uffff\1\10\14\uffff\1\30\1\4\3\uffff\1\25\1\26\1"+
		"\uffff\1\16\3\uffff\1\11\1\17";
	static final String DFA5_specialS =
		"\101\uffff}>";
	static final String[] DFA5_transitionS = {
			"\2\27\1\uffff\2\27\22\uffff\1\27\1\11\3\uffff\1\14\2\uffff\1\7\1\15\1"+
			"\22\1\12\1\2\1\10\1\uffff\1\26\12\25\1\1\1\16\1\17\1\4\1\5\2\uffff\32"+
			"\24\6\uffff\4\24\1\3\3\24\1\6\6\24\1\13\2\24\1\20\1\21\1\24\1\23\4\24",
			"\1\30",
			"",
			"\1\32",
			"",
			"\1\33",
			"\1\35\7\uffff\1\36",
			"",
			"",
			"",
			"",
			"\1\37",
			"",
			"",
			"",
			"\1\40",
			"\1\42",
			"\1\43",
			"",
			"\1\44",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\45",
			"",
			"",
			"\12\24\7\uffff\32\24\6\uffff\32\24",
			"\1\47",
			"\1\50\5\uffff\1\51",
			"",
			"",
			"\1\52",
			"\1\53",
			"\1\54",
			"\1\55",
			"",
			"\1\56",
			"\1\57",
			"\1\60",
			"\1\61",
			"\1\62",
			"\12\24\7\uffff\32\24\6\uffff\32\24",
			"\12\24\7\uffff\32\24\6\uffff\32\24",
			"\1\65",
			"\1\66",
			"\1\67",
			"\12\24\7\uffff\32\24\6\uffff\32\24",
			"\12\24\7\uffff\32\24\6\uffff\32\24",
			"",
			"",
			"\1\72",
			"\12\24\7\uffff\32\24\6\uffff\32\24",
			"\1\74",
			"",
			"",
			"\1\75",
			"",
			"\1\76",
			"\12\24\7\uffff\32\24\6\uffff\32\24",
			"\12\24\7\uffff\32\24\6\uffff\32\24",
			"",
			""
	};

	static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
	static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
	static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
	static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
	static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
	static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
	static final short[][] DFA5_transition;

	static {
		int numStates = DFA5_transitionS.length;
		DFA5_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
		}
	}

	protected class DFA5 extends DFA {

		public DFA5(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 5;
			this.eot = DFA5_eot;
			this.eof = DFA5_eof;
			this.min = DFA5_min;
			this.max = DFA5_max;
			this.accept = DFA5_accept;
			this.special = DFA5_special;
			this.transition = DFA5_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( BECOMES | COLON | COMMA | ELSE | EQUALS | GREATER | GREATEREQ | IF | INTEGER | LPAREN | MINUS | NOTEQUALS | PLUS | PRINT | PROGRAM | QUOTIENT | RPAREN | SEMICOLON | SMALLER | SMALLEREQ | SWAP | THEN | TIMES | VAR | IDENTIFIER | NUMBER | COMMENT | WS );";
		}
	}

}
