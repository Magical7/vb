// $ANTLR 3.5 Forrest.g 2013-06-26 09:25:38

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
	public static final int CHARACTER=7;
	public static final int COMMA=8;
	public static final int COMMENT=9;
	public static final int COMPOUND=10;
	public static final int CONSTANT=11;
	public static final int DIGIT=12;
	public static final int DIVIDE=13;
	public static final int ELSE=14;
	public static final int ENDIF=15;
	public static final int EQUALS=16;
	public static final int FALSE=17;
	public static final int GREATER=18;
	public static final int GREATEREQ=19;
	public static final int IDENTIFIER=20;
	public static final int IF=21;
	public static final int INT=22;
	public static final int LCURLY=23;
	public static final int LETTER=24;
	public static final int LOGAND=25;
	public static final int LOGOR=26;
	public static final int LOWER=27;
	public static final int LPAREN=28;
	public static final int MINUS=29;
	public static final int MODULO=30;
	public static final int NEGATIVE=31;
	public static final int NOT=32;
	public static final int NOTEQUALS=33;
	public static final int NUMBER=34;
	public static final int PLUS=35;
	public static final int POSITIVE=36;
	public static final int PRINT=37;
	public static final int PROGRAM=38;
	public static final int RCURLY=39;
	public static final int READ=40;
	public static final int RPAREN=41;
	public static final int SEMICOLON=42;
	public static final int SMALLER=43;
	public static final int SMALLEREQ=44;
	public static final int SQUOTE=45;
	public static final int THEN=46;
	public static final int TIMES=47;
	public static final int TRUE=48;
	public static final int UPPER=49;
	public static final int VAR=50;
	public static final int WS=51;

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
	@Override public String getGrammarFileName() { return "Forrest.g"; }

	// $ANTLR start "BECOMES"
	public final void mBECOMES() throws RecognitionException {
		try {
			int _type = BECOMES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Forrest.g:11:9: ( '=' )
			// Forrest.g:11:11: '='
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
			// Forrest.g:12:6: ( 'bool' )
			// Forrest.g:12:8: 'bool'
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
			// Forrest.g:13:6: ( 'char' )
			// Forrest.g:13:8: 'char'
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
			// Forrest.g:14:7: ( ',' )
			// Forrest.g:14:9: ','
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
			// Forrest.g:15:10: ( 'KCOMPOUND' )
			// Forrest.g:15:12: 'KCOMPOUND'
			{
			match("KCOMPOUND"); 

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
			// Forrest.g:16:10: ( 'const' )
			// Forrest.g:16:12: 'const'
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
			// Forrest.g:17:8: ( '/' )
			// Forrest.g:17:10: '/'
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
			// Forrest.g:18:6: ( 'else' )
			// Forrest.g:18:8: 'else'
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
			// Forrest.g:19:7: ( 'endif' )
			// Forrest.g:19:9: 'endif'
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
			// Forrest.g:20:8: ( '==' )
			// Forrest.g:20:10: '=='
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

	// $ANTLR start "FALSE"
	public final void mFALSE() throws RecognitionException {
		try {
			int _type = FALSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Forrest.g:21:7: ( 'false' )
			// Forrest.g:21:9: 'false'
			{
			match("false"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FALSE"

	// $ANTLR start "GREATER"
	public final void mGREATER() throws RecognitionException {
		try {
			int _type = GREATER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Forrest.g:22:9: ( '>' )
			// Forrest.g:22:11: '>'
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
			// Forrest.g:23:11: ( '>=' )
			// Forrest.g:23:13: '>='
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
			// Forrest.g:24:4: ( 'if' )
			// Forrest.g:24:6: 'if'
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
			// Forrest.g:25:5: ( 'int' )
			// Forrest.g:25:7: 'int'
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
			// Forrest.g:26:8: ( '{' )
			// Forrest.g:26:10: '{'
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
			// Forrest.g:27:8: ( '&&' )
			// Forrest.g:27:10: '&&'
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
			// Forrest.g:28:7: ( '||' )
			// Forrest.g:28:9: '||'
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
			// Forrest.g:29:8: ( '(' )
			// Forrest.g:29:10: '('
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
			// Forrest.g:30:7: ( '-' )
			// Forrest.g:30:9: '-'
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
			// Forrest.g:31:8: ( '%' )
			// Forrest.g:31:10: '%'
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

	// $ANTLR start "NEGATIVE"
	public final void mNEGATIVE() throws RecognitionException {
		try {
			int _type = NEGATIVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Forrest.g:32:10: ( 'KNEGATIVE' )
			// Forrest.g:32:12: 'KNEGATIVE'
			{
			match("KNEGATIVE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEGATIVE"

	// $ANTLR start "NOT"
	public final void mNOT() throws RecognitionException {
		try {
			int _type = NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Forrest.g:33:5: ( '!' )
			// Forrest.g:33:7: '!'
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
			// Forrest.g:34:11: ( '!=' )
			// Forrest.g:34:13: '!='
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
			// Forrest.g:35:6: ( '+' )
			// Forrest.g:35:8: '+'
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

	// $ANTLR start "POSITIVE"
	public final void mPOSITIVE() throws RecognitionException {
		try {
			int _type = POSITIVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Forrest.g:36:10: ( 'KPOSITIVE' )
			// Forrest.g:36:12: 'KPOSITIVE'
			{
			match("KPOSITIVE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "POSITIVE"

	// $ANTLR start "PRINT"
	public final void mPRINT() throws RecognitionException {
		try {
			int _type = PRINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Forrest.g:37:7: ( 'print' )
			// Forrest.g:37:9: 'print'
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
			// Forrest.g:38:9: ( 'KPROGRAM' )
			// Forrest.g:38:11: 'KPROGRAM'
			{
			match("KPROGRAM"); 

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
			// Forrest.g:39:8: ( '}' )
			// Forrest.g:39:10: '}'
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
			// Forrest.g:40:6: ( 'read' )
			// Forrest.g:40:8: 'read'
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
			// Forrest.g:41:8: ( ')' )
			// Forrest.g:41:10: ')'
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
			// Forrest.g:42:11: ( ';' )
			// Forrest.g:42:13: ';'
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
			// Forrest.g:43:9: ( '<' )
			// Forrest.g:43:11: '<'
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
			// Forrest.g:44:11: ( '<=' )
			// Forrest.g:44:13: '<='
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

	// $ANTLR start "SQUOTE"
	public final void mSQUOTE() throws RecognitionException {
		try {
			int _type = SQUOTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Forrest.g:45:8: ( '\\'' )
			// Forrest.g:45:10: '\\''
			{
			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQUOTE"

	// $ANTLR start "THEN"
	public final void mTHEN() throws RecognitionException {
		try {
			int _type = THEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Forrest.g:46:6: ( 'then' )
			// Forrest.g:46:8: 'then'
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
			// Forrest.g:47:7: ( '*' )
			// Forrest.g:47:9: '*'
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

	// $ANTLR start "TRUE"
	public final void mTRUE() throws RecognitionException {
		try {
			int _type = TRUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Forrest.g:48:6: ( 'true' )
			// Forrest.g:48:8: 'true'
			{
			match("true"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRUE"

	// $ANTLR start "VAR"
	public final void mVAR() throws RecognitionException {
		try {
			int _type = VAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Forrest.g:49:5: ( 'var' )
			// Forrest.g:49:7: 'var'
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
			// Forrest.g:148:5: ( LETTER ( LETTER | DIGIT )* )
			// Forrest.g:148:9: LETTER ( LETTER | DIGIT )*
			{
			mLETTER(); 

			// Forrest.g:148:16: ( LETTER | DIGIT )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// Forrest.g:
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
			// Forrest.g:152:5: ( ( DIGIT )+ )
			// Forrest.g:152:9: ( DIGIT )+
			{
			// Forrest.g:152:9: ( DIGIT )+
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
					// Forrest.g:
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

	// $ANTLR start "CHARACTER"
	public final void mCHARACTER() throws RecognitionException {
		try {
			int _type = CHARACTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Forrest.g:156:2: ( SQUOTE LETTER SQUOTE )
			// Forrest.g:156:4: SQUOTE LETTER SQUOTE
			{
			mSQUOTE(); 

			mLETTER(); 

			mSQUOTE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHARACTER"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Forrest.g:160:5: ( '//' ( . )* '\\n' )
			// Forrest.g:160:9: '//' ( . )* '\\n'
			{
			match("//"); 

			// Forrest.g:160:14: ( . )*
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
					// Forrest.g:160:14: .
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
			// Forrest.g:165:5: ( ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+ )
			// Forrest.g:165:9: ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+
			{
			// Forrest.g:165:9: ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+
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
					// Forrest.g:
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
			// Forrest.g:169:17: ( ( '0' .. '9' ) )
			// Forrest.g:
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
			// Forrest.g:170:17: ( ( 'a' .. 'z' ) )
			// Forrest.g:
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
			// Forrest.g:171:17: ( ( 'A' .. 'Z' ) )
			// Forrest.g:
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
			// Forrest.g:172:17: ( LOWER | UPPER )
			// Forrest.g:
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
		// Forrest.g:1:8: ( BECOMES | BOOL | CHAR | COMMA | COMPOUND | CONSTANT | DIVIDE | ELSE | ENDIF | EQUALS | FALSE | GREATER | GREATEREQ | IF | INT | LCURLY | LOGAND | LOGOR | LPAREN | MINUS | MODULO | NEGATIVE | NOT | NOTEQUALS | PLUS | POSITIVE | PRINT | PROGRAM | RCURLY | READ | RPAREN | SEMICOLON | SMALLER | SMALLEREQ | SQUOTE | THEN | TIMES | TRUE | VAR | IDENTIFIER | NUMBER | CHARACTER | COMMENT | WS )
		int alt5=44;
		alt5 = dfa5.predict(input);
		switch (alt5) {
			case 1 :
				// Forrest.g:1:10: BECOMES
				{
				mBECOMES(); 

				}
				break;
			case 2 :
				// Forrest.g:1:18: BOOL
				{
				mBOOL(); 

				}
				break;
			case 3 :
				// Forrest.g:1:23: CHAR
				{
				mCHAR(); 

				}
				break;
			case 4 :
				// Forrest.g:1:28: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 5 :
				// Forrest.g:1:34: COMPOUND
				{
				mCOMPOUND(); 

				}
				break;
			case 6 :
				// Forrest.g:1:43: CONSTANT
				{
				mCONSTANT(); 

				}
				break;
			case 7 :
				// Forrest.g:1:52: DIVIDE
				{
				mDIVIDE(); 

				}
				break;
			case 8 :
				// Forrest.g:1:59: ELSE
				{
				mELSE(); 

				}
				break;
			case 9 :
				// Forrest.g:1:64: ENDIF
				{
				mENDIF(); 

				}
				break;
			case 10 :
				// Forrest.g:1:70: EQUALS
				{
				mEQUALS(); 

				}
				break;
			case 11 :
				// Forrest.g:1:77: FALSE
				{
				mFALSE(); 

				}
				break;
			case 12 :
				// Forrest.g:1:83: GREATER
				{
				mGREATER(); 

				}
				break;
			case 13 :
				// Forrest.g:1:91: GREATEREQ
				{
				mGREATEREQ(); 

				}
				break;
			case 14 :
				// Forrest.g:1:101: IF
				{
				mIF(); 

				}
				break;
			case 15 :
				// Forrest.g:1:104: INT
				{
				mINT(); 

				}
				break;
			case 16 :
				// Forrest.g:1:108: LCURLY
				{
				mLCURLY(); 

				}
				break;
			case 17 :
				// Forrest.g:1:115: LOGAND
				{
				mLOGAND(); 

				}
				break;
			case 18 :
				// Forrest.g:1:122: LOGOR
				{
				mLOGOR(); 

				}
				break;
			case 19 :
				// Forrest.g:1:128: LPAREN
				{
				mLPAREN(); 

				}
				break;
			case 20 :
				// Forrest.g:1:135: MINUS
				{
				mMINUS(); 

				}
				break;
			case 21 :
				// Forrest.g:1:141: MODULO
				{
				mMODULO(); 

				}
				break;
			case 22 :
				// Forrest.g:1:148: NEGATIVE
				{
				mNEGATIVE(); 

				}
				break;
			case 23 :
				// Forrest.g:1:157: NOT
				{
				mNOT(); 

				}
				break;
			case 24 :
				// Forrest.g:1:161: NOTEQUALS
				{
				mNOTEQUALS(); 

				}
				break;
			case 25 :
				// Forrest.g:1:171: PLUS
				{
				mPLUS(); 

				}
				break;
			case 26 :
				// Forrest.g:1:176: POSITIVE
				{
				mPOSITIVE(); 

				}
				break;
			case 27 :
				// Forrest.g:1:185: PRINT
				{
				mPRINT(); 

				}
				break;
			case 28 :
				// Forrest.g:1:191: PROGRAM
				{
				mPROGRAM(); 

				}
				break;
			case 29 :
				// Forrest.g:1:199: RCURLY
				{
				mRCURLY(); 

				}
				break;
			case 30 :
				// Forrest.g:1:206: READ
				{
				mREAD(); 

				}
				break;
			case 31 :
				// Forrest.g:1:211: RPAREN
				{
				mRPAREN(); 

				}
				break;
			case 32 :
				// Forrest.g:1:218: SEMICOLON
				{
				mSEMICOLON(); 

				}
				break;
			case 33 :
				// Forrest.g:1:228: SMALLER
				{
				mSMALLER(); 

				}
				break;
			case 34 :
				// Forrest.g:1:236: SMALLEREQ
				{
				mSMALLEREQ(); 

				}
				break;
			case 35 :
				// Forrest.g:1:246: SQUOTE
				{
				mSQUOTE(); 

				}
				break;
			case 36 :
				// Forrest.g:1:253: THEN
				{
				mTHEN(); 

				}
				break;
			case 37 :
				// Forrest.g:1:258: TIMES
				{
				mTIMES(); 

				}
				break;
			case 38 :
				// Forrest.g:1:264: TRUE
				{
				mTRUE(); 

				}
				break;
			case 39 :
				// Forrest.g:1:269: VAR
				{
				mVAR(); 

				}
				break;
			case 40 :
				// Forrest.g:1:273: IDENTIFIER
				{
				mIDENTIFIER(); 

				}
				break;
			case 41 :
				// Forrest.g:1:284: NUMBER
				{
				mNUMBER(); 

				}
				break;
			case 42 :
				// Forrest.g:1:291: CHARACTER
				{
				mCHARACTER(); 

				}
				break;
			case 43 :
				// Forrest.g:1:301: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 44 :
				// Forrest.g:1:309: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA5 dfa5 = new DFA5(this);
	static final String DFA5_eotS =
		"\1\uffff\1\41\2\35\1\uffff\1\35\1\51\2\35\1\56\1\35\6\uffff\1\62\1\uffff"+
		"\1\35\1\uffff\1\35\2\uffff\1\66\1\67\1\35\1\uffff\1\35\5\uffff\6\35\2"+
		"\uffff\3\35\2\uffff\1\106\1\35\2\uffff\2\35\4\uffff\15\35\1\uffff\1\127"+
		"\4\35\1\134\1\135\1\136\5\35\1\144\2\35\1\uffff\1\35\1\150\1\151\1\152"+
		"\3\uffff\1\153\4\35\1\uffff\1\160\1\161\1\162\4\uffff\4\35\3\uffff\7\35"+
		"\1\176\1\177\1\u0080\1\u0081\4\uffff";
	static final String DFA5_eofS =
		"\u0082\uffff";
	static final String DFA5_minS =
		"\1\11\1\75\1\157\1\150\1\uffff\1\103\1\57\1\154\1\141\1\75\1\146\6\uffff"+
		"\1\75\1\uffff\1\162\1\uffff\1\145\2\uffff\1\75\1\101\1\150\1\uffff\1\141"+
		"\5\uffff\1\157\1\141\1\156\1\117\1\105\1\117\2\uffff\1\163\1\144\1\154"+
		"\2\uffff\1\60\1\164\2\uffff\1\151\1\141\4\uffff\1\145\1\165\1\162\1\154"+
		"\1\162\1\163\1\115\1\107\1\123\1\117\1\145\1\151\1\163\1\uffff\1\60\1"+
		"\156\1\144\1\156\1\145\3\60\1\164\1\120\1\101\1\111\1\107\1\60\1\146\1"+
		"\145\1\uffff\1\164\3\60\3\uffff\1\60\1\117\2\124\1\122\1\uffff\3\60\4"+
		"\uffff\1\125\2\111\1\101\3\uffff\1\116\2\126\1\115\1\104\2\105\4\60\4"+
		"\uffff";
	static final String DFA5_maxS =
		"\1\175\1\75\2\157\1\uffff\1\120\1\57\1\156\1\141\1\75\1\156\6\uffff\1"+
		"\75\1\uffff\1\162\1\uffff\1\145\2\uffff\1\75\1\172\1\162\1\uffff\1\141"+
		"\5\uffff\1\157\1\141\1\156\1\117\1\105\1\122\2\uffff\1\163\1\144\1\154"+
		"\2\uffff\1\172\1\164\2\uffff\1\151\1\141\4\uffff\1\145\1\165\1\162\1\154"+
		"\1\162\1\163\1\115\1\107\1\123\1\117\1\145\1\151\1\163\1\uffff\1\172\1"+
		"\156\1\144\1\156\1\145\3\172\1\164\1\120\1\101\1\111\1\107\1\172\1\146"+
		"\1\145\1\uffff\1\164\3\172\3\uffff\1\172\1\117\2\124\1\122\1\uffff\3\172"+
		"\4\uffff\1\125\2\111\1\101\3\uffff\1\116\2\126\1\115\1\104\2\105\4\172"+
		"\4\uffff";
	static final String DFA5_acceptS =
		"\4\uffff\1\4\6\uffff\1\20\1\21\1\22\1\23\1\24\1\25\1\uffff\1\31\1\uffff"+
		"\1\35\1\uffff\1\37\1\40\3\uffff\1\45\1\uffff\1\50\1\51\1\54\1\12\1\1\6"+
		"\uffff\1\53\1\7\3\uffff\1\15\1\14\2\uffff\1\30\1\27\2\uffff\1\42\1\41"+
		"\1\43\1\52\15\uffff\1\16\20\uffff\1\17\4\uffff\1\47\1\2\1\3\5\uffff\1"+
		"\10\3\uffff\1\36\1\44\1\46\1\6\4\uffff\1\11\1\13\1\33\13\uffff\1\34\1"+
		"\5\1\26\1\32";
	static final String DFA5_specialS =
		"\u0082\uffff}>";
	static final String[] DFA5_transitionS = {
			"\2\37\1\uffff\2\37\22\uffff\1\37\1\21\3\uffff\1\20\1\14\1\31\1\16\1\26"+
			"\1\33\1\22\1\4\1\17\1\uffff\1\6\12\36\1\uffff\1\27\1\30\1\1\1\11\2\uffff"+
			"\12\35\1\5\17\35\6\uffff\1\35\1\2\1\3\1\35\1\7\1\10\2\35\1\12\6\35\1"+
			"\23\1\35\1\25\1\35\1\32\1\35\1\34\4\35\1\13\1\15\1\24",
			"\1\40",
			"\1\42",
			"\1\43\6\uffff\1\44",
			"",
			"\1\45\12\uffff\1\46\1\uffff\1\47",
			"\1\50",
			"\1\52\1\uffff\1\53",
			"\1\54",
			"\1\55",
			"\1\57\7\uffff\1\60",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\61",
			"",
			"\1\63",
			"",
			"\1\64",
			"",
			"",
			"\1\65",
			"\32\70\6\uffff\32\70",
			"\1\71\11\uffff\1\72",
			"",
			"\1\73",
			"",
			"",
			"",
			"",
			"",
			"\1\74",
			"\1\75",
			"\1\76",
			"\1\77",
			"\1\100",
			"\1\101\2\uffff\1\102",
			"",
			"",
			"\1\103",
			"\1\104",
			"\1\105",
			"",
			"",
			"\12\35\7\uffff\32\35\6\uffff\32\35",
			"\1\107",
			"",
			"",
			"\1\110",
			"\1\111",
			"",
			"",
			"",
			"",
			"\1\112",
			"\1\113",
			"\1\114",
			"\1\115",
			"\1\116",
			"\1\117",
			"\1\120",
			"\1\121",
			"\1\122",
			"\1\123",
			"\1\124",
			"\1\125",
			"\1\126",
			"",
			"\12\35\7\uffff\32\35\6\uffff\32\35",
			"\1\130",
			"\1\131",
			"\1\132",
			"\1\133",
			"\12\35\7\uffff\32\35\6\uffff\32\35",
			"\12\35\7\uffff\32\35\6\uffff\32\35",
			"\12\35\7\uffff\32\35\6\uffff\32\35",
			"\1\137",
			"\1\140",
			"\1\141",
			"\1\142",
			"\1\143",
			"\12\35\7\uffff\32\35\6\uffff\32\35",
			"\1\145",
			"\1\146",
			"",
			"\1\147",
			"\12\35\7\uffff\32\35\6\uffff\32\35",
			"\12\35\7\uffff\32\35\6\uffff\32\35",
			"\12\35\7\uffff\32\35\6\uffff\32\35",
			"",
			"",
			"",
			"\12\35\7\uffff\32\35\6\uffff\32\35",
			"\1\154",
			"\1\155",
			"\1\156",
			"\1\157",
			"",
			"\12\35\7\uffff\32\35\6\uffff\32\35",
			"\12\35\7\uffff\32\35\6\uffff\32\35",
			"\12\35\7\uffff\32\35\6\uffff\32\35",
			"",
			"",
			"",
			"",
			"\1\163",
			"\1\164",
			"\1\165",
			"\1\166",
			"",
			"",
			"",
			"\1\167",
			"\1\170",
			"\1\171",
			"\1\172",
			"\1\173",
			"\1\174",
			"\1\175",
			"\12\35\7\uffff\32\35\6\uffff\32\35",
			"\12\35\7\uffff\32\35\6\uffff\32\35",
			"\12\35\7\uffff\32\35\6\uffff\32\35",
			"\12\35\7\uffff\32\35\6\uffff\32\35",
			"",
			"",
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
			return "1:1: Tokens : ( BECOMES | BOOL | CHAR | COMMA | COMPOUND | CONSTANT | DIVIDE | ELSE | ENDIF | EQUALS | FALSE | GREATER | GREATEREQ | IF | INT | LCURLY | LOGAND | LOGOR | LPAREN | MINUS | MODULO | NEGATIVE | NOT | NOTEQUALS | PLUS | POSITIVE | PRINT | PROGRAM | RCURLY | READ | RPAREN | SEMICOLON | SMALLER | SMALLEREQ | SQUOTE | THEN | TIMES | TRUE | VAR | IDENTIFIER | NUMBER | CHARACTER | COMMENT | WS );";
		}
	}

}
