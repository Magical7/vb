// $ANTLR 3.5 ../forrest/main/Forrest.g 2013-06-06 16:28:24

package forrest.main;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ForrestLexer extends Lexer {
	public static final int EOF=-1;
	public static final int BECOMES=4;
	public static final int BOOL=5;
	public static final int CHAR=6;
	public static final int COMMA=7;
	public static final int COMMENT=8;
	public static final int COMPOUND=9;
	public static final int CONSTANT=10;
	public static final int DIGIT=11;
	public static final int DIVIDE=12;
	public static final int ELSE=13;
	public static final int ENDIF=14;
	public static final int EQUALS=15;
	public static final int GREATER=16;
	public static final int GREATEREQ=17;
	public static final int IDENTIFIER=18;
	public static final int IF=19;
	public static final int INT=20;
	public static final int LCURLY=21;
	public static final int LETTER=22;
	public static final int LOGAND=23;
	public static final int LOGOR=24;
	public static final int LOWER=25;
	public static final int LPAREN=26;
	public static final int MINUS=27;
	public static final int MODULO=28;
	public static final int NOT=29;
	public static final int NOTEQUALS=30;
	public static final int NUMBER=31;
	public static final int PLUS=32;
	public static final int PRINT=33;
	public static final int PROGRAM=34;
	public static final int RCURLY=35;
	public static final int READ=36;
	public static final int RPAREN=37;
	public static final int SEMICOLON=38;
	public static final int SMALLER=39;
	public static final int SMALLEREQ=40;
	public static final int THEN=41;
	public static final int TIMES=42;
	public static final int UPPER=43;
	public static final int VAR=44;
	public static final int WS=45;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public ForrestLexer() {} 
	public ForrestLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public ForrestLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "../forrest/main/Forrest.g"; }

	// $ANTLR start "BECOMES"
	public final void mBECOMES() throws RecognitionException {
		try {
			int _type = BECOMES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../forrest/main/Forrest.g:11:9: ( '=' )
			// ../forrest/main/Forrest.g:11:11: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BECOMES"

	// $ANTLR start "BOOL"
	public final void mBOOL() throws RecognitionException {
		try {
			int _type = BOOL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../forrest/main/Forrest.g:12:6: ( 'bool' )
			// ../forrest/main/Forrest.g:12:8: 'bool'
			{
			match("bool"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BOOL"

	// $ANTLR start "CHAR"
	public final void mCHAR() throws RecognitionException {
		try {
			int _type = CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../forrest/main/Forrest.g:13:6: ( 'char' )
			// ../forrest/main/Forrest.g:13:8: 'char'
			{
			match("char"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../forrest/main/Forrest.g:14:7: ( ',' )
			// ../forrest/main/Forrest.g:14:9: ','
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

	// $ANTLR start "COMPOUND"
	public final void mCOMPOUND() throws RecognitionException {
		try {
			int _type = COMPOUND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../forrest/main/Forrest.g:15:10: ( 'compound' )
			// ../forrest/main/Forrest.g:15:12: 'compound'
			{
			match("compound"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMPOUND"

	// $ANTLR start "CONSTANT"
	public final void mCONSTANT() throws RecognitionException {
		try {
			int _type = CONSTANT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../forrest/main/Forrest.g:16:10: ( 'const' )
			// ../forrest/main/Forrest.g:16:12: 'const'
			{
			match("const"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONSTANT"

	// $ANTLR start "DIVIDE"
	public final void mDIVIDE() throws RecognitionException {
		try {
			int _type = DIVIDE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../forrest/main/Forrest.g:17:8: ( '/' )
			// ../forrest/main/Forrest.g:17:10: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIVIDE"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../forrest/main/Forrest.g:18:6: ( 'else' )
			// ../forrest/main/Forrest.g:18:8: 'else'
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

	// $ANTLR start "ENDIF"
	public final void mENDIF() throws RecognitionException {
		try {
			int _type = ENDIF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../forrest/main/Forrest.g:19:7: ( 'endif' )
			// ../forrest/main/Forrest.g:19:9: 'endif'
			{
			match("endif"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ENDIF"

	// $ANTLR start "EQUALS"
	public final void mEQUALS() throws RecognitionException {
		try {
			int _type = EQUALS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../forrest/main/Forrest.g:20:8: ( '==' )
			// ../forrest/main/Forrest.g:20:10: '=='
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
			// ../forrest/main/Forrest.g:21:9: ( '>' )
			// ../forrest/main/Forrest.g:21:11: '>'
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
			// ../forrest/main/Forrest.g:22:11: ( '>=' )
			// ../forrest/main/Forrest.g:22:13: '>='
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
			// ../forrest/main/Forrest.g:23:4: ( 'if' )
			// ../forrest/main/Forrest.g:23:6: 'if'
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

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../forrest/main/Forrest.g:24:5: ( 'int' )
			// ../forrest/main/Forrest.g:24:7: 'int'
			{
			match("int"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "LCURLY"
	public final void mLCURLY() throws RecognitionException {
		try {
			int _type = LCURLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../forrest/main/Forrest.g:25:8: ( '{' )
			// ../forrest/main/Forrest.g:25:10: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LCURLY"

	// $ANTLR start "LOGAND"
	public final void mLOGAND() throws RecognitionException {
		try {
			int _type = LOGAND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../forrest/main/Forrest.g:26:8: ( '&&' )
			// ../forrest/main/Forrest.g:26:10: '&&'
			{
			match("&&"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LOGAND"

	// $ANTLR start "LOGOR"
	public final void mLOGOR() throws RecognitionException {
		try {
			int _type = LOGOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../forrest/main/Forrest.g:27:7: ( '||' )
			// ../forrest/main/Forrest.g:27:9: '||'
			{
			match("||"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LOGOR"

	// $ANTLR start "LPAREN"
	public final void mLPAREN() throws RecognitionException {
		try {
			int _type = LPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../forrest/main/Forrest.g:28:8: ( '(' )
			// ../forrest/main/Forrest.g:28:10: '('
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
			// ../forrest/main/Forrest.g:29:7: ( '-' )
			// ../forrest/main/Forrest.g:29:9: '-'
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

	// $ANTLR start "MODULO"
	public final void mMODULO() throws RecognitionException {
		try {
			int _type = MODULO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../forrest/main/Forrest.g:30:8: ( '%' )
			// ../forrest/main/Forrest.g:30:10: '%'
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
	// $ANTLR end "MODULO"

	// $ANTLR start "NOT"
	public final void mNOT() throws RecognitionException {
		try {
			int _type = NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../forrest/main/Forrest.g:31:5: ( '!' )
			// ../forrest/main/Forrest.g:31:7: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT"

	// $ANTLR start "NOTEQUALS"
	public final void mNOTEQUALS() throws RecognitionException {
		try {
			int _type = NOTEQUALS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../forrest/main/Forrest.g:32:11: ( '!=' )
			// ../forrest/main/Forrest.g:32:13: '!='
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
			// ../forrest/main/Forrest.g:33:6: ( '+' )
			// ../forrest/main/Forrest.g:33:8: '+'
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
			// ../forrest/main/Forrest.g:34:7: ( 'print' )
			// ../forrest/main/Forrest.g:34:9: 'print'
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
			// ../forrest/main/Forrest.g:35:9: ( 'program' )
			// ../forrest/main/Forrest.g:35:11: 'program'
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

	// $ANTLR start "RCURLY"
	public final void mRCURLY() throws RecognitionException {
		try {
			int _type = RCURLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../forrest/main/Forrest.g:36:8: ( '}' )
			// ../forrest/main/Forrest.g:36:10: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RCURLY"

	// $ANTLR start "READ"
	public final void mREAD() throws RecognitionException {
		try {
			int _type = READ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../forrest/main/Forrest.g:37:6: ( 'read' )
			// ../forrest/main/Forrest.g:37:8: 'read'
			{
			match("read"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "READ"

	// $ANTLR start "RPAREN"
	public final void mRPAREN() throws RecognitionException {
		try {
			int _type = RPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../forrest/main/Forrest.g:38:8: ( ')' )
			// ../forrest/main/Forrest.g:38:10: ')'
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
			// ../forrest/main/Forrest.g:39:11: ( ';' )
			// ../forrest/main/Forrest.g:39:13: ';'
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
			// ../forrest/main/Forrest.g:40:9: ( '<' )
			// ../forrest/main/Forrest.g:40:11: '<'
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
			// ../forrest/main/Forrest.g:41:11: ( '<=' )
			// ../forrest/main/Forrest.g:41:13: '<='
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

	// $ANTLR start "THEN"
	public final void mTHEN() throws RecognitionException {
		try {
			int _type = THEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../forrest/main/Forrest.g:42:6: ( 'then' )
			// ../forrest/main/Forrest.g:42:8: 'then'
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
			// ../forrest/main/Forrest.g:43:7: ( '*' )
			// ../forrest/main/Forrest.g:43:9: '*'
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
			// ../forrest/main/Forrest.g:44:5: ( 'var' )
			// ../forrest/main/Forrest.g:44:7: 'var'
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
			// ../forrest/main/Forrest.g:126:5: ( LETTER ( LETTER | DIGIT )* )
			// ../forrest/main/Forrest.g:126:9: LETTER ( LETTER | DIGIT )*
			{
			mLETTER(); 

			// ../forrest/main/Forrest.g:126:16: ( LETTER | DIGIT )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// ../forrest/main/Forrest.g:
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
			// ../forrest/main/Forrest.g:130:5: ( ( DIGIT )+ )
			// ../forrest/main/Forrest.g:130:9: ( DIGIT )+
			{
			// ../forrest/main/Forrest.g:130:9: ( DIGIT )+
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
					// ../forrest/main/Forrest.g:
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
			// ../forrest/main/Forrest.g:135:5: ( '//' ( . )* '\\n' )
			// ../forrest/main/Forrest.g:135:9: '//' ( . )* '\\n'
			{
			match("//"); 

			// ../forrest/main/Forrest.g:135:14: ( . )*
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
					// ../forrest/main/Forrest.g:135:14: .
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
			// ../forrest/main/Forrest.g:140:5: ( ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+ )
			// ../forrest/main/Forrest.g:140:9: ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+
			{
			// ../forrest/main/Forrest.g:140:9: ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+
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
					// ../forrest/main/Forrest.g:
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
			// ../forrest/main/Forrest.g:144:17: ( ( '0' .. '9' ) )
			// ../forrest/main/Forrest.g:
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
			// ../forrest/main/Forrest.g:145:17: ( ( 'a' .. 'z' ) )
			// ../forrest/main/Forrest.g:
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
			// ../forrest/main/Forrest.g:146:17: ( ( 'A' .. 'Z' ) )
			// ../forrest/main/Forrest.g:
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
			// ../forrest/main/Forrest.g:147:17: ( LOWER | UPPER )
			// ../forrest/main/Forrest.g:
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
		// ../forrest/main/Forrest.g:1:8: ( BECOMES | BOOL | CHAR | COMMA | COMPOUND | CONSTANT | DIVIDE | ELSE | ENDIF | EQUALS | GREATER | GREATEREQ | IF | INT | LCURLY | LOGAND | LOGOR | LPAREN | MINUS | MODULO | NOT | NOTEQUALS | PLUS | PRINT | PROGRAM | RCURLY | READ | RPAREN | SEMICOLON | SMALLER | SMALLEREQ | THEN | TIMES | VAR | IDENTIFIER | NUMBER | COMMENT | WS )
		int alt5=38;
		alt5 = dfa5.predict(input);
		switch (alt5) {
			case 1 :
				// ../forrest/main/Forrest.g:1:10: BECOMES
				{
				mBECOMES(); 

				}
				break;
			case 2 :
				// ../forrest/main/Forrest.g:1:18: BOOL
				{
				mBOOL(); 

				}
				break;
			case 3 :
				// ../forrest/main/Forrest.g:1:23: CHAR
				{
				mCHAR(); 

				}
				break;
			case 4 :
				// ../forrest/main/Forrest.g:1:28: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 5 :
				// ../forrest/main/Forrest.g:1:34: COMPOUND
				{
				mCOMPOUND(); 

				}
				break;
			case 6 :
				// ../forrest/main/Forrest.g:1:43: CONSTANT
				{
				mCONSTANT(); 

				}
				break;
			case 7 :
				// ../forrest/main/Forrest.g:1:52: DIVIDE
				{
				mDIVIDE(); 

				}
				break;
			case 8 :
				// ../forrest/main/Forrest.g:1:59: ELSE
				{
				mELSE(); 

				}
				break;
			case 9 :
				// ../forrest/main/Forrest.g:1:64: ENDIF
				{
				mENDIF(); 

				}
				break;
			case 10 :
				// ../forrest/main/Forrest.g:1:70: EQUALS
				{
				mEQUALS(); 

				}
				break;
			case 11 :
				// ../forrest/main/Forrest.g:1:77: GREATER
				{
				mGREATER(); 

				}
				break;
			case 12 :
				// ../forrest/main/Forrest.g:1:85: GREATEREQ
				{
				mGREATEREQ(); 

				}
				break;
			case 13 :
				// ../forrest/main/Forrest.g:1:95: IF
				{
				mIF(); 

				}
				break;
			case 14 :
				// ../forrest/main/Forrest.g:1:98: INT
				{
				mINT(); 

				}
				break;
			case 15 :
				// ../forrest/main/Forrest.g:1:102: LCURLY
				{
				mLCURLY(); 

				}
				break;
			case 16 :
				// ../forrest/main/Forrest.g:1:109: LOGAND
				{
				mLOGAND(); 

				}
				break;
			case 17 :
				// ../forrest/main/Forrest.g:1:116: LOGOR
				{
				mLOGOR(); 

				}
				break;
			case 18 :
				// ../forrest/main/Forrest.g:1:122: LPAREN
				{
				mLPAREN(); 

				}
				break;
			case 19 :
				// ../forrest/main/Forrest.g:1:129: MINUS
				{
				mMINUS(); 

				}
				break;
			case 20 :
				// ../forrest/main/Forrest.g:1:135: MODULO
				{
				mMODULO(); 

				}
				break;
			case 21 :
				// ../forrest/main/Forrest.g:1:142: NOT
				{
				mNOT(); 

				}
				break;
			case 22 :
				// ../forrest/main/Forrest.g:1:146: NOTEQUALS
				{
				mNOTEQUALS(); 

				}
				break;
			case 23 :
				// ../forrest/main/Forrest.g:1:156: PLUS
				{
				mPLUS(); 

				}
				break;
			case 24 :
				// ../forrest/main/Forrest.g:1:161: PRINT
				{
				mPRINT(); 

				}
				break;
			case 25 :
				// ../forrest/main/Forrest.g:1:167: PROGRAM
				{
				mPROGRAM(); 

				}
				break;
			case 26 :
				// ../forrest/main/Forrest.g:1:175: RCURLY
				{
				mRCURLY(); 

				}
				break;
			case 27 :
				// ../forrest/main/Forrest.g:1:182: READ
				{
				mREAD(); 

				}
				break;
			case 28 :
				// ../forrest/main/Forrest.g:1:187: RPAREN
				{
				mRPAREN(); 

				}
				break;
			case 29 :
				// ../forrest/main/Forrest.g:1:194: SEMICOLON
				{
				mSEMICOLON(); 

				}
				break;
			case 30 :
				// ../forrest/main/Forrest.g:1:204: SMALLER
				{
				mSMALLER(); 

				}
				break;
			case 31 :
				// ../forrest/main/Forrest.g:1:212: SMALLEREQ
				{
				mSMALLEREQ(); 

				}
				break;
			case 32 :
				// ../forrest/main/Forrest.g:1:222: THEN
				{
				mTHEN(); 

				}
				break;
			case 33 :
				// ../forrest/main/Forrest.g:1:227: TIMES
				{
				mTIMES(); 

				}
				break;
			case 34 :
				// ../forrest/main/Forrest.g:1:233: VAR
				{
				mVAR(); 

				}
				break;
			case 35 :
				// ../forrest/main/Forrest.g:1:237: IDENTIFIER
				{
				mIDENTIFIER(); 

				}
				break;
			case 36 :
				// ../forrest/main/Forrest.g:1:248: NUMBER
				{
				mNUMBER(); 

				}
				break;
			case 37 :
				// ../forrest/main/Forrest.g:1:255: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 38 :
				// ../forrest/main/Forrest.g:1:263: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA5 dfa5 = new DFA5(this);
	static final String DFA5_eotS =
		"\1\uffff\1\36\2\32\1\uffff\1\43\1\32\1\47\1\32\6\uffff\1\53\1\uffff\1"+
		"\32\1\uffff\1\32\2\uffff\1\57\1\32\1\uffff\1\32\5\uffff\3\32\2\uffff\2"+
		"\32\2\uffff\1\70\1\32\2\uffff\2\32\2\uffff\10\32\1\uffff\1\105\4\32\1"+
		"\112\1\113\1\114\2\32\1\117\1\32\1\uffff\2\32\1\123\1\124\3\uffff\1\32"+
		"\1\126\1\uffff\1\127\1\130\1\32\2\uffff\1\32\3\uffff\2\32\1\135\1\136"+
		"\2\uffff";
	static final String DFA5_eofS =
		"\137\uffff";
	static final String DFA5_minS =
		"\1\11\1\75\1\157\1\150\1\uffff\1\57\1\154\1\75\1\146\6\uffff\1\75\1\uffff"+
		"\1\162\1\uffff\1\145\2\uffff\1\75\1\150\1\uffff\1\141\5\uffff\1\157\1"+
		"\141\1\155\2\uffff\1\163\1\144\2\uffff\1\60\1\164\2\uffff\1\151\1\141"+
		"\2\uffff\1\145\1\162\1\154\1\162\1\160\1\163\1\145\1\151\1\uffff\1\60"+
		"\1\156\1\147\1\144\1\156\3\60\1\157\1\164\1\60\1\146\1\uffff\1\164\1\162"+
		"\2\60\3\uffff\1\165\1\60\1\uffff\2\60\1\141\2\uffff\1\156\3\uffff\1\155"+
		"\1\144\2\60\2\uffff";
	static final String DFA5_maxS =
		"\1\175\1\75\2\157\1\uffff\1\57\1\156\1\75\1\156\6\uffff\1\75\1\uffff\1"+
		"\162\1\uffff\1\145\2\uffff\1\75\1\150\1\uffff\1\141\5\uffff\1\157\1\141"+
		"\1\156\2\uffff\1\163\1\144\2\uffff\1\172\1\164\2\uffff\1\157\1\141\2\uffff"+
		"\1\145\1\162\1\154\1\162\1\160\1\163\1\145\1\151\1\uffff\1\172\1\156\1"+
		"\147\1\144\1\156\3\172\1\157\1\164\1\172\1\146\1\uffff\1\164\1\162\2\172"+
		"\3\uffff\1\165\1\172\1\uffff\2\172\1\141\2\uffff\1\156\3\uffff\1\155\1"+
		"\144\2\172\2\uffff";
	static final String DFA5_acceptS =
		"\4\uffff\1\4\4\uffff\1\17\1\20\1\21\1\22\1\23\1\24\1\uffff\1\27\1\uffff"+
		"\1\32\1\uffff\1\34\1\35\2\uffff\1\41\1\uffff\1\43\1\44\1\46\1\12\1\1\3"+
		"\uffff\1\45\1\7\2\uffff\1\14\1\13\2\uffff\1\26\1\25\2\uffff\1\37\1\36"+
		"\10\uffff\1\15\14\uffff\1\16\4\uffff\1\42\1\2\1\3\2\uffff\1\10\3\uffff"+
		"\1\33\1\40\1\uffff\1\6\1\11\1\30\4\uffff\1\31\1\5";
	static final String DFA5_specialS =
		"\137\uffff}>";
	static final String[] DFA5_transitionS = {
			"\2\34\1\uffff\2\34\22\uffff\1\34\1\17\3\uffff\1\16\1\12\1\uffff\1\14"+
			"\1\24\1\30\1\20\1\4\1\15\1\uffff\1\5\12\33\1\uffff\1\25\1\26\1\1\1\7"+
			"\2\uffff\32\32\6\uffff\1\32\1\2\1\3\1\32\1\6\3\32\1\10\6\32\1\21\1\32"+
			"\1\23\1\32\1\27\1\32\1\31\4\32\1\11\1\13\1\22",
			"\1\35",
			"\1\37",
			"\1\40\6\uffff\1\41",
			"",
			"\1\42",
			"\1\44\1\uffff\1\45",
			"\1\46",
			"\1\50\7\uffff\1\51",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\52",
			"",
			"\1\54",
			"",
			"\1\55",
			"",
			"",
			"\1\56",
			"\1\60",
			"",
			"\1\61",
			"",
			"",
			"",
			"",
			"",
			"\1\62",
			"\1\63",
			"\1\64\1\65",
			"",
			"",
			"\1\66",
			"\1\67",
			"",
			"",
			"\12\32\7\uffff\32\32\6\uffff\32\32",
			"\1\71",
			"",
			"",
			"\1\72\5\uffff\1\73",
			"\1\74",
			"",
			"",
			"\1\75",
			"\1\76",
			"\1\77",
			"\1\100",
			"\1\101",
			"\1\102",
			"\1\103",
			"\1\104",
			"",
			"\12\32\7\uffff\32\32\6\uffff\32\32",
			"\1\106",
			"\1\107",
			"\1\110",
			"\1\111",
			"\12\32\7\uffff\32\32\6\uffff\32\32",
			"\12\32\7\uffff\32\32\6\uffff\32\32",
			"\12\32\7\uffff\32\32\6\uffff\32\32",
			"\1\115",
			"\1\116",
			"\12\32\7\uffff\32\32\6\uffff\32\32",
			"\1\120",
			"",
			"\1\121",
			"\1\122",
			"\12\32\7\uffff\32\32\6\uffff\32\32",
			"\12\32\7\uffff\32\32\6\uffff\32\32",
			"",
			"",
			"",
			"\1\125",
			"\12\32\7\uffff\32\32\6\uffff\32\32",
			"",
			"\12\32\7\uffff\32\32\6\uffff\32\32",
			"\12\32\7\uffff\32\32\6\uffff\32\32",
			"\1\131",
			"",
			"",
			"\1\132",
			"",
			"",
			"",
			"\1\133",
			"\1\134",
			"\12\32\7\uffff\32\32\6\uffff\32\32",
			"\12\32\7\uffff\32\32\6\uffff\32\32",
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
			return "1:1: Tokens : ( BECOMES | BOOL | CHAR | COMMA | COMPOUND | CONSTANT | DIVIDE | ELSE | ENDIF | EQUALS | GREATER | GREATEREQ | IF | INT | LCURLY | LOGAND | LOGOR | LPAREN | MINUS | MODULO | NOT | NOTEQUALS | PLUS | PRINT | PROGRAM | RCURLY | READ | RPAREN | SEMICOLON | SMALLER | SMALLEREQ | THEN | TIMES | VAR | IDENTIFIER | NUMBER | COMMENT | WS );";
		}
	}

}
