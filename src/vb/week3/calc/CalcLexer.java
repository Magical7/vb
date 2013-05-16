// $ANTLR 3.5 Calc.g 2013-05-16 11:22:02

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
	public static final int IDENTIFIER=10;
	public static final int IF=11;
	public static final int INTEGER=12;
	public static final int LETTER=13;
	public static final int LOWER=14;
	public static final int LPAREN=15;
	public static final int MINUS=16;
	public static final int NUMBER=17;
	public static final int PLUS=18;
	public static final int PRINT=19;
	public static final int PROGRAM=20;
	public static final int QUOTIENT=21;
	public static final int RPAREN=22;
	public static final int SEMICOLON=23;
	public static final int SWAP=24;
	public static final int THEN=25;
	public static final int TIMES=26;
	public static final int UPPER=27;
	public static final int VAR=28;
	public static final int WS=29;

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

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Calc.g:15:4: ( 'if' )
			// Calc.g:15:6: 'if'
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
			// Calc.g:16:9: ( 'integer' )
			// Calc.g:16:11: 'integer'
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
			// Calc.g:17:8: ( '(' )
			// Calc.g:17:10: '('
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
			// Calc.g:18:7: ( '-' )
			// Calc.g:18:9: '-'
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
			// Calc.g:19:6: ( '+' )
			// Calc.g:19:8: '+'
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
			// Calc.g:20:7: ( 'print' )
			// Calc.g:20:9: 'print'
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
			// Calc.g:21:9: ( 'program' )
			// Calc.g:21:11: 'program'
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
			// Calc.g:22:10: ( '%' )
			// Calc.g:22:12: '%'
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
			// Calc.g:23:8: ( ')' )
			// Calc.g:23:10: ')'
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
			// Calc.g:24:11: ( ';' )
			// Calc.g:24:13: ';'
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
			// Calc.g:25:6: ( 'swap' )
			// Calc.g:25:8: 'swap'
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
			// Calc.g:26:6: ( 'then' )
			// Calc.g:26:8: 'then'
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
			// Calc.g:27:7: ( '*' )
			// Calc.g:27:9: '*'
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
			// Calc.g:28:5: ( 'var' )
			// Calc.g:28:7: 'var'
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
			// Calc.g:111:5: ( LETTER ( LETTER | DIGIT )* )
			// Calc.g:111:9: LETTER ( LETTER | DIGIT )*
			{
			mLETTER(); 

			// Calc.g:111:16: ( LETTER | DIGIT )*
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
			// Calc.g:115:5: ( ( DIGIT )+ )
			// Calc.g:115:9: ( DIGIT )+
			{
			// Calc.g:115:9: ( DIGIT )+
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
			// Calc.g:120:5: ( '//' ( . )* '\\n' )
			// Calc.g:120:9: '//' ( . )* '\\n'
			{
			match("//"); 

			// Calc.g:120:14: ( . )*
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
					// Calc.g:120:14: .
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
			// Calc.g:125:5: ( ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+ )
			// Calc.g:125:9: ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+
			{
			// Calc.g:125:9: ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+
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
			// Calc.g:129:17: ( ( '0' .. '9' ) )
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
			// Calc.g:130:17: ( ( 'a' .. 'z' ) )
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
			// Calc.g:131:17: ( ( 'A' .. 'Z' ) )
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
			// Calc.g:132:17: ( LOWER | UPPER )
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
		// Calc.g:1:8: ( BECOMES | COLON | COMMA | ELSE | IF | INTEGER | LPAREN | MINUS | PLUS | PRINT | PROGRAM | QUOTIENT | RPAREN | SEMICOLON | SWAP | THEN | TIMES | VAR | IDENTIFIER | NUMBER | COMMENT | WS )
		int alt5=22;
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
		case 'e':
			{
			int LA5_3 = input.LA(2);
			if ( (LA5_3=='l') ) {
				int LA5_22 = input.LA(3);
				if ( (LA5_22=='s') ) {
					int LA5_29 = input.LA(4);
					if ( (LA5_29=='e') ) {
						int LA5_37 = input.LA(5);
						if ( ((LA5_37 >= '0' && LA5_37 <= '9')||(LA5_37 >= 'A' && LA5_37 <= 'Z')||(LA5_37 >= 'a' && LA5_37 <= 'z')) ) {
							alt5=19;
						}

						else {
							alt5=4;
						}

					}

					else {
						alt5=19;
					}

				}

				else {
					alt5=19;
				}

			}

			else {
				alt5=19;
			}

			}
			break;
		case 'i':
			{
			switch ( input.LA(2) ) {
			case 'f':
				{
				int LA5_23 = input.LA(3);
				if ( ((LA5_23 >= '0' && LA5_23 <= '9')||(LA5_23 >= 'A' && LA5_23 <= 'Z')||(LA5_23 >= 'a' && LA5_23 <= 'z')) ) {
					alt5=19;
				}

				else {
					alt5=5;
				}

				}
				break;
			case 'n':
				{
				int LA5_24 = input.LA(3);
				if ( (LA5_24=='t') ) {
					int LA5_31 = input.LA(4);
					if ( (LA5_31=='e') ) {
						int LA5_38 = input.LA(5);
						if ( (LA5_38=='g') ) {
							int LA5_45 = input.LA(6);
							if ( (LA5_45=='e') ) {
								int LA5_50 = input.LA(7);
								if ( (LA5_50=='r') ) {
									int LA5_53 = input.LA(8);
									if ( ((LA5_53 >= '0' && LA5_53 <= '9')||(LA5_53 >= 'A' && LA5_53 <= 'Z')||(LA5_53 >= 'a' && LA5_53 <= 'z')) ) {
										alt5=19;
									}

									else {
										alt5=6;
									}

								}

								else {
									alt5=19;
								}

							}

							else {
								alt5=19;
							}

						}

						else {
							alt5=19;
						}

					}

					else {
						alt5=19;
					}

				}

				else {
					alt5=19;
				}

				}
				break;
			default:
				alt5=19;
			}
			}
			break;
		case '(':
			{
			alt5=7;
			}
			break;
		case '-':
			{
			alt5=8;
			}
			break;
		case '+':
			{
			alt5=9;
			}
			break;
		case 'p':
			{
			int LA5_8 = input.LA(2);
			if ( (LA5_8=='r') ) {
				switch ( input.LA(3) ) {
				case 'i':
					{
					int LA5_32 = input.LA(4);
					if ( (LA5_32=='n') ) {
						int LA5_39 = input.LA(5);
						if ( (LA5_39=='t') ) {
							int LA5_46 = input.LA(6);
							if ( ((LA5_46 >= '0' && LA5_46 <= '9')||(LA5_46 >= 'A' && LA5_46 <= 'Z')||(LA5_46 >= 'a' && LA5_46 <= 'z')) ) {
								alt5=19;
							}

							else {
								alt5=10;
							}

						}

						else {
							alt5=19;
						}

					}

					else {
						alt5=19;
					}

					}
					break;
				case 'o':
					{
					int LA5_33 = input.LA(4);
					if ( (LA5_33=='g') ) {
						int LA5_40 = input.LA(5);
						if ( (LA5_40=='r') ) {
							int LA5_47 = input.LA(6);
							if ( (LA5_47=='a') ) {
								int LA5_52 = input.LA(7);
								if ( (LA5_52=='m') ) {
									int LA5_54 = input.LA(8);
									if ( ((LA5_54 >= '0' && LA5_54 <= '9')||(LA5_54 >= 'A' && LA5_54 <= 'Z')||(LA5_54 >= 'a' && LA5_54 <= 'z')) ) {
										alt5=19;
									}

									else {
										alt5=11;
									}

								}

								else {
									alt5=19;
								}

							}

							else {
								alt5=19;
							}

						}

						else {
							alt5=19;
						}

					}

					else {
						alt5=19;
					}

					}
					break;
				default:
					alt5=19;
				}
			}

			else {
				alt5=19;
			}

			}
			break;
		case '%':
			{
			alt5=12;
			}
			break;
		case ')':
			{
			alt5=13;
			}
			break;
		case ';':
			{
			alt5=14;
			}
			break;
		case 's':
			{
			int LA5_12 = input.LA(2);
			if ( (LA5_12=='w') ) {
				int LA5_26 = input.LA(3);
				if ( (LA5_26=='a') ) {
					int LA5_34 = input.LA(4);
					if ( (LA5_34=='p') ) {
						int LA5_41 = input.LA(5);
						if ( ((LA5_41 >= '0' && LA5_41 <= '9')||(LA5_41 >= 'A' && LA5_41 <= 'Z')||(LA5_41 >= 'a' && LA5_41 <= 'z')) ) {
							alt5=19;
						}

						else {
							alt5=15;
						}

					}

					else {
						alt5=19;
					}

				}

				else {
					alt5=19;
				}

			}

			else {
				alt5=19;
			}

			}
			break;
		case 't':
			{
			int LA5_13 = input.LA(2);
			if ( (LA5_13=='h') ) {
				int LA5_27 = input.LA(3);
				if ( (LA5_27=='e') ) {
					int LA5_35 = input.LA(4);
					if ( (LA5_35=='n') ) {
						int LA5_42 = input.LA(5);
						if ( ((LA5_42 >= '0' && LA5_42 <= '9')||(LA5_42 >= 'A' && LA5_42 <= 'Z')||(LA5_42 >= 'a' && LA5_42 <= 'z')) ) {
							alt5=19;
						}

						else {
							alt5=16;
						}

					}

					else {
						alt5=19;
					}

				}

				else {
					alt5=19;
				}

			}

			else {
				alt5=19;
			}

			}
			break;
		case '*':
			{
			alt5=17;
			}
			break;
		case 'v':
			{
			int LA5_15 = input.LA(2);
			if ( (LA5_15=='a') ) {
				int LA5_28 = input.LA(3);
				if ( (LA5_28=='r') ) {
					int LA5_36 = input.LA(4);
					if ( ((LA5_36 >= '0' && LA5_36 <= '9')||(LA5_36 >= 'A' && LA5_36 <= 'Z')||(LA5_36 >= 'a' && LA5_36 <= 'z')) ) {
						alt5=19;
					}

					else {
						alt5=18;
					}

				}

				else {
					alt5=19;
				}

			}

			else {
				alt5=19;
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
		case 'u':
		case 'w':
		case 'x':
		case 'y':
		case 'z':
			{
			alt5=19;
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
			alt5=20;
			}
			break;
		case '/':
			{
			alt5=21;
			}
			break;
		case '\t':
		case '\n':
		case '\f':
		case '\r':
		case ' ':
			{
			alt5=22;
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
				// Calc.g:1:30: ELSE
				{
				mELSE(); 

				}
				break;
			case 5 :
				// Calc.g:1:35: IF
				{
				mIF(); 

				}
				break;
			case 6 :
				// Calc.g:1:38: INTEGER
				{
				mINTEGER(); 

				}
				break;
			case 7 :
				// Calc.g:1:46: LPAREN
				{
				mLPAREN(); 

				}
				break;
			case 8 :
				// Calc.g:1:53: MINUS
				{
				mMINUS(); 

				}
				break;
			case 9 :
				// Calc.g:1:59: PLUS
				{
				mPLUS(); 

				}
				break;
			case 10 :
				// Calc.g:1:64: PRINT
				{
				mPRINT(); 

				}
				break;
			case 11 :
				// Calc.g:1:70: PROGRAM
				{
				mPROGRAM(); 

				}
				break;
			case 12 :
				// Calc.g:1:78: QUOTIENT
				{
				mQUOTIENT(); 

				}
				break;
			case 13 :
				// Calc.g:1:87: RPAREN
				{
				mRPAREN(); 

				}
				break;
			case 14 :
				// Calc.g:1:94: SEMICOLON
				{
				mSEMICOLON(); 

				}
				break;
			case 15 :
				// Calc.g:1:104: SWAP
				{
				mSWAP(); 

				}
				break;
			case 16 :
				// Calc.g:1:109: THEN
				{
				mTHEN(); 

				}
				break;
			case 17 :
				// Calc.g:1:114: TIMES
				{
				mTIMES(); 

				}
				break;
			case 18 :
				// Calc.g:1:120: VAR
				{
				mVAR(); 

				}
				break;
			case 19 :
				// Calc.g:1:124: IDENTIFIER
				{
				mIDENTIFIER(); 

				}
				break;
			case 20 :
				// Calc.g:1:135: NUMBER
				{
				mNUMBER(); 

				}
				break;
			case 21 :
				// Calc.g:1:142: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 22 :
				// Calc.g:1:150: WS
				{
				mWS(); 

				}
				break;

		}
	}



}
