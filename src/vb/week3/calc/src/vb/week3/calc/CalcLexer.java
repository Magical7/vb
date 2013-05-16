// $ANTLR 3.5 src\\vb\\week3\\calc\\Calc.g 2013-05-12 22:13:54

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
	public static final int COMMENT=6;
	public static final int DIGIT=7;
	public static final int IDENTIFIER=8;
	public static final int INTEGER=9;
	public static final int LETTER=10;
	public static final int LOWER=11;
	public static final int LPAREN=12;
	public static final int MINUS=13;
	public static final int NUMBER=14;
	public static final int PLUS=15;
	public static final int PRINT=16;
	public static final int PROGRAM=17;
	public static final int QUOTIENT=18;
	public static final int RPAREN=19;
	public static final int SEMICOLON=20;
	public static final int TIMES=21;
	public static final int UPPER=22;
	public static final int VAR=23;
	public static final int WS=24;

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
	@Override public String getGrammarFileName() { return "src\\vb\\week3\\calc\\Calc.g"; }

	// $ANTLR start "BECOMES"
	public final void mBECOMES() throws RecognitionException {
		try {
			int _type = BECOMES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\vb\\week3\\calc\\Calc.g:11:9: ( ':=' )
			// src\\vb\\week3\\calc\\Calc.g:11:11: ':='
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
			// src\\vb\\week3\\calc\\Calc.g:12:7: ( ':' )
			// src\\vb\\week3\\calc\\Calc.g:12:9: ':'
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

	// $ANTLR start "INTEGER"
	public final void mINTEGER() throws RecognitionException {
		try {
			int _type = INTEGER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\vb\\week3\\calc\\Calc.g:13:9: ( 'integer' )
			// src\\vb\\week3\\calc\\Calc.g:13:11: 'integer'
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
			// src\\vb\\week3\\calc\\Calc.g:14:8: ( '(' )
			// src\\vb\\week3\\calc\\Calc.g:14:10: '('
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
			// src\\vb\\week3\\calc\\Calc.g:15:7: ( '-' )
			// src\\vb\\week3\\calc\\Calc.g:15:9: '-'
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
			// src\\vb\\week3\\calc\\Calc.g:16:6: ( '+' )
			// src\\vb\\week3\\calc\\Calc.g:16:8: '+'
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
			// src\\vb\\week3\\calc\\Calc.g:17:7: ( 'print' )
			// src\\vb\\week3\\calc\\Calc.g:17:9: 'print'
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
			// src\\vb\\week3\\calc\\Calc.g:18:9: ( 'program' )
			// src\\vb\\week3\\calc\\Calc.g:18:11: 'program'
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
			// src\\vb\\week3\\calc\\Calc.g:19:10: ( '%' )
			// src\\vb\\week3\\calc\\Calc.g:19:12: '%'
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
			// src\\vb\\week3\\calc\\Calc.g:20:8: ( ')' )
			// src\\vb\\week3\\calc\\Calc.g:20:10: ')'
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
			// src\\vb\\week3\\calc\\Calc.g:21:11: ( ';' )
			// src\\vb\\week3\\calc\\Calc.g:21:13: ';'
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

	// $ANTLR start "TIMES"
	public final void mTIMES() throws RecognitionException {
		try {
			int _type = TIMES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\vb\\week3\\calc\\Calc.g:22:7: ( '*' )
			// src\\vb\\week3\\calc\\Calc.g:22:9: '*'
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
			// src\\vb\\week3\\calc\\Calc.g:23:5: ( 'var' )
			// src\\vb\\week3\\calc\\Calc.g:23:7: 'var'
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
			// src\\vb\\week3\\calc\\Calc.g:96:5: ( LETTER ( LETTER | DIGIT )* )
			// src\\vb\\week3\\calc\\Calc.g:96:9: LETTER ( LETTER | DIGIT )*
			{
			mLETTER(); 

			// src\\vb\\week3\\calc\\Calc.g:96:16: ( LETTER | DIGIT )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// src\\vb\\week3\\calc\\Calc.g:
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
			// src\\vb\\week3\\calc\\Calc.g:100:5: ( ( DIGIT )+ )
			// src\\vb\\week3\\calc\\Calc.g:100:9: ( DIGIT )+
			{
			// src\\vb\\week3\\calc\\Calc.g:100:9: ( DIGIT )+
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
					// src\\vb\\week3\\calc\\Calc.g:
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
			// src\\vb\\week3\\calc\\Calc.g:105:5: ( '//' ( . )* '\\n' )
			// src\\vb\\week3\\calc\\Calc.g:105:9: '//' ( . )* '\\n'
			{
			match("//"); 

			// src\\vb\\week3\\calc\\Calc.g:105:14: ( . )*
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
					// src\\vb\\week3\\calc\\Calc.g:105:14: .
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
			// src\\vb\\week3\\calc\\Calc.g:110:5: ( ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+ )
			// src\\vb\\week3\\calc\\Calc.g:110:9: ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+
			{
			// src\\vb\\week3\\calc\\Calc.g:110:9: ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+
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
					// src\\vb\\week3\\calc\\Calc.g:
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
			// src\\vb\\week3\\calc\\Calc.g:114:17: ( ( '0' .. '9' ) )
			// src\\vb\\week3\\calc\\Calc.g:
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
			// src\\vb\\week3\\calc\\Calc.g:115:17: ( ( 'a' .. 'z' ) )
			// src\\vb\\week3\\calc\\Calc.g:
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
			// src\\vb\\week3\\calc\\Calc.g:116:17: ( ( 'A' .. 'Z' ) )
			// src\\vb\\week3\\calc\\Calc.g:
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
			// src\\vb\\week3\\calc\\Calc.g:117:17: ( LOWER | UPPER )
			// src\\vb\\week3\\calc\\Calc.g:
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
		// src\\vb\\week3\\calc\\Calc.g:1:8: ( BECOMES | COLON | INTEGER | LPAREN | MINUS | PLUS | PRINT | PROGRAM | QUOTIENT | RPAREN | SEMICOLON | TIMES | VAR | IDENTIFIER | NUMBER | COMMENT | WS )
		int alt5=17;
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
		case 'i':
			{
			int LA5_2 = input.LA(2);
			if ( (LA5_2=='n') ) {
				int LA5_18 = input.LA(3);
				if ( (LA5_18=='t') ) {
					int LA5_21 = input.LA(4);
					if ( (LA5_21=='e') ) {
						int LA5_25 = input.LA(5);
						if ( (LA5_25=='g') ) {
							int LA5_29 = input.LA(6);
							if ( (LA5_29=='e') ) {
								int LA5_32 = input.LA(7);
								if ( (LA5_32=='r') ) {
									int LA5_35 = input.LA(8);
									if ( ((LA5_35 >= '0' && LA5_35 <= '9')||(LA5_35 >= 'A' && LA5_35 <= 'Z')||(LA5_35 >= 'a' && LA5_35 <= 'z')) ) {
										alt5=14;
									}

									else {
										alt5=3;
									}

								}

								else {
									alt5=14;
								}

							}

							else {
								alt5=14;
							}

						}

						else {
							alt5=14;
						}

					}

					else {
						alt5=14;
					}

				}

				else {
					alt5=14;
				}

			}

			else {
				alt5=14;
			}

			}
			break;
		case '(':
			{
			alt5=4;
			}
			break;
		case '-':
			{
			alt5=5;
			}
			break;
		case '+':
			{
			alt5=6;
			}
			break;
		case 'p':
			{
			int LA5_6 = input.LA(2);
			if ( (LA5_6=='r') ) {
				switch ( input.LA(3) ) {
				case 'i':
					{
					int LA5_22 = input.LA(4);
					if ( (LA5_22=='n') ) {
						int LA5_26 = input.LA(5);
						if ( (LA5_26=='t') ) {
							int LA5_30 = input.LA(6);
							if ( ((LA5_30 >= '0' && LA5_30 <= '9')||(LA5_30 >= 'A' && LA5_30 <= 'Z')||(LA5_30 >= 'a' && LA5_30 <= 'z')) ) {
								alt5=14;
							}

							else {
								alt5=7;
							}

						}

						else {
							alt5=14;
						}

					}

					else {
						alt5=14;
					}

					}
					break;
				case 'o':
					{
					int LA5_23 = input.LA(4);
					if ( (LA5_23=='g') ) {
						int LA5_27 = input.LA(5);
						if ( (LA5_27=='r') ) {
							int LA5_31 = input.LA(6);
							if ( (LA5_31=='a') ) {
								int LA5_34 = input.LA(7);
								if ( (LA5_34=='m') ) {
									int LA5_36 = input.LA(8);
									if ( ((LA5_36 >= '0' && LA5_36 <= '9')||(LA5_36 >= 'A' && LA5_36 <= 'Z')||(LA5_36 >= 'a' && LA5_36 <= 'z')) ) {
										alt5=14;
									}

									else {
										alt5=8;
									}

								}

								else {
									alt5=14;
								}

							}

							else {
								alt5=14;
							}

						}

						else {
							alt5=14;
						}

					}

					else {
						alt5=14;
					}

					}
					break;
				default:
					alt5=14;
				}
			}

			else {
				alt5=14;
			}

			}
			break;
		case '%':
			{
			alt5=9;
			}
			break;
		case ')':
			{
			alt5=10;
			}
			break;
		case ';':
			{
			alt5=11;
			}
			break;
		case '*':
			{
			alt5=12;
			}
			break;
		case 'v':
			{
			int LA5_11 = input.LA(2);
			if ( (LA5_11=='a') ) {
				int LA5_20 = input.LA(3);
				if ( (LA5_20=='r') ) {
					int LA5_24 = input.LA(4);
					if ( ((LA5_24 >= '0' && LA5_24 <= '9')||(LA5_24 >= 'A' && LA5_24 <= 'Z')||(LA5_24 >= 'a' && LA5_24 <= 'z')) ) {
						alt5=14;
					}

					else {
						alt5=13;
					}

				}

				else {
					alt5=14;
				}

			}

			else {
				alt5=14;
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
		case 's':
		case 't':
		case 'u':
		case 'w':
		case 'x':
		case 'y':
		case 'z':
			{
			alt5=14;
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
			alt5=15;
			}
			break;
		case '/':
			{
			alt5=16;
			}
			break;
		case '\t':
		case '\n':
		case '\f':
		case '\r':
		case ' ':
			{
			alt5=17;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 5, 0, input);
			throw nvae;
		}
		switch (alt5) {
			case 1 :
				// src\\vb\\week3\\calc\\Calc.g:1:10: BECOMES
				{
				mBECOMES(); 

				}
				break;
			case 2 :
				// src\\vb\\week3\\calc\\Calc.g:1:18: COLON
				{
				mCOLON(); 

				}
				break;
			case 3 :
				// src\\vb\\week3\\calc\\Calc.g:1:24: INTEGER
				{
				mINTEGER(); 

				}
				break;
			case 4 :
				// src\\vb\\week3\\calc\\Calc.g:1:32: LPAREN
				{
				mLPAREN(); 

				}
				break;
			case 5 :
				// src\\vb\\week3\\calc\\Calc.g:1:39: MINUS
				{
				mMINUS(); 

				}
				break;
			case 6 :
				// src\\vb\\week3\\calc\\Calc.g:1:45: PLUS
				{
				mPLUS(); 

				}
				break;
			case 7 :
				// src\\vb\\week3\\calc\\Calc.g:1:50: PRINT
				{
				mPRINT(); 

				}
				break;
			case 8 :
				// src\\vb\\week3\\calc\\Calc.g:1:56: PROGRAM
				{
				mPROGRAM(); 

				}
				break;
			case 9 :
				// src\\vb\\week3\\calc\\Calc.g:1:64: QUOTIENT
				{
				mQUOTIENT(); 

				}
				break;
			case 10 :
				// src\\vb\\week3\\calc\\Calc.g:1:73: RPAREN
				{
				mRPAREN(); 

				}
				break;
			case 11 :
				// src\\vb\\week3\\calc\\Calc.g:1:80: SEMICOLON
				{
				mSEMICOLON(); 

				}
				break;
			case 12 :
				// src\\vb\\week3\\calc\\Calc.g:1:90: TIMES
				{
				mTIMES(); 

				}
				break;
			case 13 :
				// src\\vb\\week3\\calc\\Calc.g:1:96: VAR
				{
				mVAR(); 

				}
				break;
			case 14 :
				// src\\vb\\week3\\calc\\Calc.g:1:100: IDENTIFIER
				{
				mIDENTIFIER(); 

				}
				break;
			case 15 :
				// src\\vb\\week3\\calc\\Calc.g:1:111: NUMBER
				{
				mNUMBER(); 

				}
				break;
			case 16 :
				// src\\vb\\week3\\calc\\Calc.g:1:118: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 17 :
				// src\\vb\\week3\\calc\\Calc.g:1:126: WS
				{
				mWS(); 

				}
				break;

		}
	}



}
