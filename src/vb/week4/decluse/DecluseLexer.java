// $ANTLR 3.5 Decluse.g 2013-05-18 14:23:06

package vb.week4.decluse;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class DecluseLexer extends Lexer {
	public static final int EOF=-1;
	public static final int COMMENT=4;
	public static final int DECLTOKEN=5;
	public static final int ID=6;
	public static final int LETTER=7;
	public static final int LOWER=8;
	public static final int LPAREN=9;
	public static final int RPAREN=10;
	public static final int SERIE=11;
	public static final int UPPER=12;
	public static final int USETOKEN=13;
	public static final int WS=14;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public DecluseLexer() {} 
	public DecluseLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public DecluseLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "Decluse.g"; }

	// $ANTLR start "DECLTOKEN"
	public final void mDECLTOKEN() throws RecognitionException {
		try {
			int _type = DECLTOKEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Decluse.g:11:11: ( 'D:' )
			// Decluse.g:11:13: 'D:'
			{
			match("D:"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DECLTOKEN"

	// $ANTLR start "LPAREN"
	public final void mLPAREN() throws RecognitionException {
		try {
			int _type = LPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Decluse.g:12:8: ( '(' )
			// Decluse.g:12:10: '('
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

	// $ANTLR start "RPAREN"
	public final void mRPAREN() throws RecognitionException {
		try {
			int _type = RPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Decluse.g:13:8: ( ')' )
			// Decluse.g:13:10: ')'
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

	// $ANTLR start "SERIE"
	public final void mSERIE() throws RecognitionException {
		try {
			int _type = SERIE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Decluse.g:14:7: ( 'serie' )
			// Decluse.g:14:9: 'serie'
			{
			match("serie"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SERIE"

	// $ANTLR start "USETOKEN"
	public final void mUSETOKEN() throws RecognitionException {
		try {
			int _type = USETOKEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Decluse.g:15:10: ( 'U:' )
			// Decluse.g:15:12: 'U:'
			{
			match("U:"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "USETOKEN"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Decluse.g:55:5: ( ( LETTER )+ )
			// Decluse.g:55:9: ( LETTER )+
			{
			// Decluse.g:55:9: ( LETTER )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// Decluse.g:
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
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Decluse.g:61:5: ( '//' ( . )* '\\n' )
			// Decluse.g:61:9: '//' ( . )* '\\n'
			{
			match("//"); 

			// Decluse.g:61:14: ( . )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0=='\n') ) {
					alt2=2;
				}
				else if ( ((LA2_0 >= '\u0000' && LA2_0 <= '\t')||(LA2_0 >= '\u000B' && LA2_0 <= '\uFFFF')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// Decluse.g:61:14: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop2;
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
			// Decluse.g:66:5: ( ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+ )
			// Decluse.g:66:9: ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+
			{
			// Decluse.g:66:9: ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '\t' && LA3_0 <= '\n')||(LA3_0 >= '\f' && LA3_0 <= '\r')||LA3_0==' ') ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// Decluse.g:
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
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
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

	// $ANTLR start "LOWER"
	public final void mLOWER() throws RecognitionException {
		try {
			// Decluse.g:70:17: ( ( 'a' .. 'z' ) )
			// Decluse.g:
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
			// Decluse.g:71:17: ( ( 'A' .. 'Z' ) )
			// Decluse.g:
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
			// Decluse.g:72:17: ( LOWER | UPPER )
			// Decluse.g:
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
		// Decluse.g:1:8: ( DECLTOKEN | LPAREN | RPAREN | SERIE | USETOKEN | ID | COMMENT | WS )
		int alt4=8;
		switch ( input.LA(1) ) {
		case 'D':
			{
			int LA4_1 = input.LA(2);
			if ( (LA4_1==':') ) {
				alt4=1;
			}

			else {
				alt4=6;
			}

			}
			break;
		case '(':
			{
			alt4=2;
			}
			break;
		case ')':
			{
			alt4=3;
			}
			break;
		case 's':
			{
			int LA4_4 = input.LA(2);
			if ( (LA4_4=='e') ) {
				int LA4_10 = input.LA(3);
				if ( (LA4_10=='r') ) {
					int LA4_12 = input.LA(4);
					if ( (LA4_12=='i') ) {
						int LA4_13 = input.LA(5);
						if ( (LA4_13=='e') ) {
							int LA4_14 = input.LA(6);
							if ( ((LA4_14 >= 'A' && LA4_14 <= 'Z')||(LA4_14 >= 'a' && LA4_14 <= 'z')) ) {
								alt4=6;
							}

							else {
								alt4=4;
							}

						}

						else {
							alt4=6;
						}

					}

					else {
						alt4=6;
					}

				}

				else {
					alt4=6;
				}

			}

			else {
				alt4=6;
			}

			}
			break;
		case 'U':
			{
			int LA4_5 = input.LA(2);
			if ( (LA4_5==':') ) {
				alt4=5;
			}

			else {
				alt4=6;
			}

			}
			break;
		case 'A':
		case 'B':
		case 'C':
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
		case 'i':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'n':
		case 'o':
		case 'p':
		case 'q':
		case 'r':
		case 't':
		case 'u':
		case 'v':
		case 'w':
		case 'x':
		case 'y':
		case 'z':
			{
			alt4=6;
			}
			break;
		case '/':
			{
			alt4=7;
			}
			break;
		case '\t':
		case '\n':
		case '\f':
		case '\r':
		case ' ':
			{
			alt4=8;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 4, 0, input);
			throw nvae;
		}
		switch (alt4) {
			case 1 :
				// Decluse.g:1:10: DECLTOKEN
				{
				mDECLTOKEN(); 

				}
				break;
			case 2 :
				// Decluse.g:1:20: LPAREN
				{
				mLPAREN(); 

				}
				break;
			case 3 :
				// Decluse.g:1:27: RPAREN
				{
				mRPAREN(); 

				}
				break;
			case 4 :
				// Decluse.g:1:34: SERIE
				{
				mSERIE(); 

				}
				break;
			case 5 :
				// Decluse.g:1:40: USETOKEN
				{
				mUSETOKEN(); 

				}
				break;
			case 6 :
				// Decluse.g:1:49: ID
				{
				mID(); 

				}
				break;
			case 7 :
				// Decluse.g:1:52: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 8 :
				// Decluse.g:1:60: WS
				{
				mWS(); 

				}
				break;

		}
	}



}
