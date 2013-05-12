// $ANTLR 3.5 Calc.g 2013-05-12 23:00:52

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
	public static final int IDENTIFIER=9;
	public static final int INTEGER=10;
	public static final int LETTER=11;
	public static final int LOWER=12;
	public static final int LPAREN=13;
	public static final int MINUS=14;
	public static final int NUMBER=15;
	public static final int PLUS=16;
	public static final int PRINT=17;
	public static final int PROGRAM=18;
	public static final int QUOTIENT=19;
	public static final int RPAREN=20;
	public static final int SEMICOLON=21;
	public static final int SWAP=22;
	public static final int TIMES=23;
	public static final int UPPER=24;
	public static final int VAR=25;
	public static final int WS=26;

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

	// $ANTLR start "INTEGER"
	public final void mINTEGER() throws RecognitionException {
		try {
			int _type = INTEGER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Calc.g:14:9: ( 'integer' )
			// Calc.g:14:11: 'integer'
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
			// Calc.g:15:8: ( '(' )
			// Calc.g:15:10: '('
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
			// Calc.g:16:7: ( '-' )
			// Calc.g:16:9: '-'
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

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Calc.g:17:6: ( '+' )
			// Calc.g:17:8: '+'
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
			// Calc.g:18:7: ( 'print' )
			// Calc.g:18:9: 'print'
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
			// Calc.g:19:9: ( 'program' )
			// Calc.g:19:11: 'program'
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
			// Calc.g:20:10: ( '%' )
			// Calc.g:20:12: '%'
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
			// Calc.g:21:8: ( ')' )
			// Calc.g:21:10: ')'
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
			// Calc.g:22:11: ( ';' )
			// Calc.g:22:13: ';'
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

	// $ANTLR start "SWAP"
	public final void mSWAP() throws RecognitionException {
		try {
			int _type = SWAP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Calc.g:23:6: ( 'swap' )
			// Calc.g:23:8: 'swap'
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

	// $ANTLR start "TIMES"
	public final void mTIMES() throws RecognitionException {
		try {
			int _type = TIMES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Calc.g:24:7: ( '*' )
			// Calc.g:24:9: '*'
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
			// Calc.g:25:5: ( 'var' )
			// Calc.g:25:7: 'var'
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
			// Calc.g:103:5: ( LETTER ( LETTER | DIGIT )* )
			// Calc.g:103:9: LETTER ( LETTER | DIGIT )*
			{
			mLETTER(); 

			// Calc.g:103:16: ( LETTER | DIGIT )*
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
			// Calc.g:107:5: ( ( DIGIT )+ )
			// Calc.g:107:9: ( DIGIT )+
			{
			// Calc.g:107:9: ( DIGIT )+
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
			// Calc.g:112:5: ( '//' ( . )* '\\n' )
			// Calc.g:112:9: '//' ( . )* '\\n'
			{
			match("//"); 

			// Calc.g:112:14: ( . )*
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
					// Calc.g:112:14: .
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
			// Calc.g:117:5: ( ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+ )
			// Calc.g:117:9: ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+
			{
			// Calc.g:117:9: ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+
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
			// Calc.g:121:17: ( ( '0' .. '9' ) )
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
			// Calc.g:122:17: ( ( 'a' .. 'z' ) )
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
			// Calc.g:123:17: ( ( 'A' .. 'Z' ) )
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
			// Calc.g:124:17: ( LOWER | UPPER )
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
		// Calc.g:1:8: ( BECOMES | COLON | COMMA | INTEGER | LPAREN | MINUS | PLUS | PRINT | PROGRAM | QUOTIENT | RPAREN | SEMICOLON | SWAP | TIMES | VAR | IDENTIFIER | NUMBER | COMMENT | WS )
		int alt5=19;
		switch ( input.LA(1) ) {
		case ':':
			{
			int LA5_1 = input.LA(2);
			if ( (LA5_1=='=') ) {
				alt5=1;
			}

			else {
				alt5=2;
			}

			}
			break;
		case ',':
			{
			alt5=3;
			}
			break;
		case 'i':
			{
			int LA5_3 = input.LA(2);
			if ( (LA5_3=='n') ) {
				int LA5_20 = input.LA(3);
				if ( (LA5_20=='t') ) {
					int LA5_24 = input.LA(4);
					if ( (LA5_24=='e') ) {
						int LA5_29 = input.LA(5);
						if ( (LA5_29=='g') ) {
							int LA5_34 = input.LA(6);
							if ( (LA5_34=='e') ) {
								int LA5_38 = input.LA(7);
								if ( (LA5_38=='r') ) {
									int LA5_41 = input.LA(8);
									if ( ((LA5_41 >= '0' && LA5_41 <= '9')||(LA5_41 >= 'A' && LA5_41 <= 'Z')||(LA5_41 >= 'a' && LA5_41 <= 'z')) ) {
										alt5=16;
									}

									else {
										alt5=4;
									}

								}

								else {
									alt5=16;
								}

							}

							else {
								alt5=16;
							}

						}

						else {
							alt5=16;
						}

					}

					else {
						alt5=16;
					}

				}

				else {
					alt5=16;
				}

			}

			else {
				alt5=16;
			}

			}
			break;
		case '(':
			{
			alt5=5;
			}
			break;
		case '-':
			{
			alt5=6;
			}
			break;
		case '+':
			{
			alt5=7;
			}
			break;
		case 'p':
			{
			int LA5_7 = input.LA(2);
			if ( (LA5_7=='r') ) {
				switch ( input.LA(3) ) {
				case 'i':
					{
					int LA5_25 = input.LA(4);
					if ( (LA5_25=='n') ) {
						int LA5_30 = input.LA(5);
						if ( (LA5_30=='t') ) {
							int LA5_35 = input.LA(6);
							if ( ((LA5_35 >= '0' && LA5_35 <= '9')||(LA5_35 >= 'A' && LA5_35 <= 'Z')||(LA5_35 >= 'a' && LA5_35 <= 'z')) ) {
								alt5=16;
							}

							else {
								alt5=8;
							}

						}

						else {
							alt5=16;
						}

					}

					else {
						alt5=16;
					}

					}
					break;
				case 'o':
					{
					int LA5_26 = input.LA(4);
					if ( (LA5_26=='g') ) {
						int LA5_31 = input.LA(5);
						if ( (LA5_31=='r') ) {
							int LA5_36 = input.LA(6);
							if ( (LA5_36=='a') ) {
								int LA5_40 = input.LA(7);
								if ( (LA5_40=='m') ) {
									int LA5_42 = input.LA(8);
									if ( ((LA5_42 >= '0' && LA5_42 <= '9')||(LA5_42 >= 'A' && LA5_42 <= 'Z')||(LA5_42 >= 'a' && LA5_42 <= 'z')) ) {
										alt5=16;
									}

									else {
										alt5=9;
									}

								}

								else {
									alt5=16;
								}

							}

							else {
								alt5=16;
							}

						}

						else {
							alt5=16;
						}

					}

					else {
						alt5=16;
					}

					}
					break;
				default:
					alt5=16;
				}
			}

			else {
				alt5=16;
			}

			}
			break;
		case '%':
			{
			alt5=10;
			}
			break;
		case ')':
			{
			alt5=11;
			}
			break;
		case ';':
			{
			alt5=12;
			}
			break;
		case 's':
			{
			int LA5_11 = input.LA(2);
			if ( (LA5_11=='w') ) {
				int LA5_22 = input.LA(3);
				if ( (LA5_22=='a') ) {
					int LA5_27 = input.LA(4);
					if ( (LA5_27=='p') ) {
						int LA5_32 = input.LA(5);
						if ( ((LA5_32 >= '0' && LA5_32 <= '9')||(LA5_32 >= 'A' && LA5_32 <= 'Z')||(LA5_32 >= 'a' && LA5_32 <= 'z')) ) {
							alt5=16;
						}

						else {
							alt5=13;
						}

					}

					else {
						alt5=16;
					}

				}

				else {
					alt5=16;
				}

			}

			else {
				alt5=16;
			}

			}
			break;
		case '*':
			{
			alt5=14;
			}
			break;
		case 'v':
			{
			int LA5_13 = input.LA(2);
			if ( (LA5_13=='a') ) {
				int LA5_23 = input.LA(3);
				if ( (LA5_23=='r') ) {
					int LA5_28 = input.LA(4);
					if ( ((LA5_28 >= '0' && LA5_28 <= '9')||(LA5_28 >= 'A' && LA5_28 <= 'Z')||(LA5_28 >= 'a' && LA5_28 <= 'z')) ) {
						alt5=16;
					}

					else {
						alt5=15;
					}

				}

				else {
					alt5=16;
				}

			}

			else {
				alt5=16;
			}

			}
			break;
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'E':
		case 'F':
		case 'G':
		case 'H':
		case 'I':
		case 'J':
		case 'K':
		case 'L':
		case 'M':
		case 'N':
		case 'O':
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
		case 'T':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
		case 'a':
		case 'b':
		case 'c':
		case 'd':
		case 'e':
		case 'f':
		case 'g':
		case 'h':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'n':
		case 'o':
		case 'q':
		case 'r':
		case 't':
		case 'u':
		case 'w':
		case 'x':
		case 'y':
		case 'z':
			{
			alt5=16;
			}
			break;
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			{
			alt5=17;
			}
			break;
		case '/':
			{
			alt5=18;
			}
			break;
		case '\t':
		case '\n':
		case '\f':
		case '\r':
		case ' ':
			{
			alt5=19;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 5, 0, input);
			throw nvae;
		}
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
				// Calc.g:1:30: INTEGER
				{
				mINTEGER(); 

				}
				break;
			case 5 :
				// Calc.g:1:38: LPAREN
				{
				mLPAREN(); 

				}
				break;
			case 6 :
				// Calc.g:1:45: MINUS
				{
				mMINUS(); 

				}
				break;
			case 7 :
				// Calc.g:1:51: PLUS
				{
				mPLUS(); 

				}
				break;
			case 8 :
				// Calc.g:1:56: PRINT
				{
				mPRINT(); 

				}
				break;
			case 9 :
				// Calc.g:1:62: PROGRAM
				{
				mPROGRAM(); 

				}
				break;
			case 10 :
				// Calc.g:1:70: QUOTIENT
				{
				mQUOTIENT(); 

				}
				break;
			case 11 :
				// Calc.g:1:79: RPAREN
				{
				mRPAREN(); 

				}
				break;
			case 12 :
				// Calc.g:1:86: SEMICOLON
				{
				mSEMICOLON(); 

				}
				break;
			case 13 :
				// Calc.g:1:96: SWAP
				{
				mSWAP(); 

				}
				break;
			case 14 :
				// Calc.g:1:101: TIMES
				{
				mTIMES(); 

				}
				break;
			case 15 :
				// Calc.g:1:107: VAR
				{
				mVAR(); 

				}
				break;
			case 16 :
				// Calc.g:1:111: IDENTIFIER
				{
				mIDENTIFIER(); 

				}
				break;
			case 17 :
				// Calc.g:1:122: NUMBER
				{
				mNUMBER(); 

				}
				break;
			case 18 :
				// Calc.g:1:129: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 19 :
				// Calc.g:1:137: WS
				{
				mWS(); 

				}
				break;

		}
	}



}
