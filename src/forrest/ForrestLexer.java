// $ANTLR 3.5 Forrest.g 2013-07-03 07:22:09

package forrest;


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
	public static final int COLON=8;
	public static final int COMMA=9;
	public static final int COMMENT=10;
	public static final int COMPOUND=11;
	public static final int CONSTANT=12;
	public static final int DIGIT=13;
	public static final int DIVIDE=14;
	public static final int DO=15;
	public static final int ELSE=16;
	public static final int ENDIF=17;
	public static final int ENDWHILE=18;
	public static final int EQUALS=19;
	public static final int EXPR_IF=20;
	public static final int EXPR_WHILE=21;
	public static final int FALSE=22;
	public static final int GREATER=23;
	public static final int GREATEREQ=24;
	public static final int IDENTIFIER=25;
	public static final int IF=26;
	public static final int INT=27;
	public static final int LCURLY=28;
	public static final int LETTER=29;
	public static final int LOGAND=30;
	public static final int LOGOR=31;
	public static final int LOWER=32;
	public static final int LPAREN=33;
	public static final int MINUS=34;
	public static final int MODULO=35;
	public static final int NEGATIVE=36;
	public static final int NOT=37;
	public static final int NOTEQUALS=38;
	public static final int NUMBER=39;
	public static final int PLUS=40;
	public static final int POSITIVE=41;
	public static final int PRINT=42;
	public static final int PROGRAM=43;
	public static final int RCURLY=44;
	public static final int READ=45;
	public static final int RPAREN=46;
	public static final int SEMICOLON=47;
	public static final int SMALLER=48;
	public static final int SMALLEREQ=49;
	public static final int SQUOTE=50;
	public static final int THEN=51;
	public static final int TIMES=52;
	public static final int TRUE=53;
	public static final int UPPER=54;
	public static final int VAR=55;
	public static final int WHILE=56;
	public static final int WS=57;

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

	// $ANTLR start "COLON"
	public final void mCOLON() throws RecognitionException {
		try {
			int _type = COLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Forrest.g:14:7: ( ':' )
			// Forrest.g:14:9: ':'
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
			// Forrest.g:15:7: ( ',' )
			// Forrest.g:15:9: ','
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
			// Forrest.g:16:10: ( '7COMPOUND' )
			// Forrest.g:16:12: '7COMPOUND'
			{
			match("7COMPOUND"); 

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
			// Forrest.g:17:10: ( 'const' )
			// Forrest.g:17:12: 'const'
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
			// Forrest.g:18:8: ( '/' )
			// Forrest.g:18:10: '/'
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

	// $ANTLR start "DO"
	public final void mDO() throws RecognitionException {
		try {
			int _type = DO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Forrest.g:19:4: ( 'do' )
			// Forrest.g:19:6: 'do'
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DO"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Forrest.g:20:6: ( 'else' )
			// Forrest.g:20:8: 'else'
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
			// Forrest.g:21:7: ( 'endif' )
			// Forrest.g:21:9: 'endif'
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

	// $ANTLR start "ENDWHILE"
	public final void mENDWHILE() throws RecognitionException {
		try {
			int _type = ENDWHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Forrest.g:22:10: ( 'endwhile' )
			// Forrest.g:22:12: 'endwhile'
			{
			match("endwhile"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ENDWHILE"

	// $ANTLR start "EQUALS"
	public final void mEQUALS() throws RecognitionException {
		try {
			int _type = EQUALS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Forrest.g:23:8: ( '==' )
			// Forrest.g:23:10: '=='
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

	// $ANTLR start "EXPR_IF"
	public final void mEXPR_IF() throws RecognitionException {
		try {
			int _type = EXPR_IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Forrest.g:24:9: ( '7EXPRIF' )
			// Forrest.g:24:11: '7EXPRIF'
			{
			match("7EXPRIF"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXPR_IF"

	// $ANTLR start "EXPR_WHILE"
	public final void mEXPR_WHILE() throws RecognitionException {
		try {
			int _type = EXPR_WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Forrest.g:25:12: ( '7EXPRWHILE' )
			// Forrest.g:25:14: '7EXPRWHILE'
			{
			match("7EXPRWHILE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXPR_WHILE"

	// $ANTLR start "FALSE"
	public final void mFALSE() throws RecognitionException {
		try {
			int _type = FALSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Forrest.g:26:7: ( 'false' )
			// Forrest.g:26:9: 'false'
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
			// Forrest.g:27:9: ( '>' )
			// Forrest.g:27:11: '>'
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
			// Forrest.g:28:11: ( '>=' )
			// Forrest.g:28:13: '>='
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
			// Forrest.g:29:4: ( 'if' )
			// Forrest.g:29:6: 'if'
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
			// Forrest.g:30:5: ( 'int' )
			// Forrest.g:30:7: 'int'
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
			// Forrest.g:31:8: ( '{' )
			// Forrest.g:31:10: '{'
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
			// Forrest.g:32:8: ( '&&' )
			// Forrest.g:32:10: '&&'
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
			// Forrest.g:33:7: ( '||' )
			// Forrest.g:33:9: '||'
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
			// Forrest.g:34:8: ( '(' )
			// Forrest.g:34:10: '('
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
			// Forrest.g:35:7: ( '-' )
			// Forrest.g:35:9: '-'
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
			// Forrest.g:36:8: ( '%' )
			// Forrest.g:36:10: '%'
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
			// Forrest.g:37:10: ( '7NEGATIVE' )
			// Forrest.g:37:12: '7NEGATIVE'
			{
			match("7NEGATIVE"); 

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
			// Forrest.g:38:5: ( '!' )
			// Forrest.g:38:7: '!'
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
			// Forrest.g:39:11: ( '!=' )
			// Forrest.g:39:13: '!='
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
			// Forrest.g:40:6: ( '+' )
			// Forrest.g:40:8: '+'
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
			// Forrest.g:41:10: ( '7POSITIVE' )
			// Forrest.g:41:12: '7POSITIVE'
			{
			match("7POSITIVE"); 

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
			// Forrest.g:42:7: ( 'print' )
			// Forrest.g:42:9: 'print'
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
			// Forrest.g:43:9: ( '7PROGRAM' )
			// Forrest.g:43:11: '7PROGRAM'
			{
			match("7PROGRAM"); 

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
			// Forrest.g:44:8: ( '}' )
			// Forrest.g:44:10: '}'
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
			// Forrest.g:45:6: ( 'read' )
			// Forrest.g:45:8: 'read'
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
			// Forrest.g:46:8: ( ')' )
			// Forrest.g:46:10: ')'
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
			// Forrest.g:47:11: ( ';' )
			// Forrest.g:47:13: ';'
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
			// Forrest.g:48:9: ( '<' )
			// Forrest.g:48:11: '<'
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
			// Forrest.g:49:11: ( '<=' )
			// Forrest.g:49:13: '<='
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
			// Forrest.g:50:8: ( '\\'' )
			// Forrest.g:50:10: '\\''
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
			// Forrest.g:51:6: ( 'then' )
			// Forrest.g:51:8: 'then'
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
			// Forrest.g:52:7: ( '*' )
			// Forrest.g:52:9: '*'
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
			// Forrest.g:53:6: ( 'true' )
			// Forrest.g:53:8: 'true'
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
			// Forrest.g:54:5: ( 'var' )
			// Forrest.g:54:7: 'var'
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

	// $ANTLR start "WHILE"
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Forrest.g:55:7: ( 'while' )
			// Forrest.g:55:9: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHILE"

	// $ANTLR start "IDENTIFIER"
	public final void mIDENTIFIER() throws RecognitionException {
		try {
			int _type = IDENTIFIER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Forrest.g:181:5: ( LETTER ( LETTER | DIGIT )* )
			// Forrest.g:181:9: LETTER ( LETTER | DIGIT )*
			{
			mLETTER(); 

			// Forrest.g:181:16: ( LETTER | DIGIT )*
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
			// Forrest.g:185:5: ( ( DIGIT )+ )
			// Forrest.g:185:9: ( DIGIT )+
			{
			// Forrest.g:185:9: ( DIGIT )+
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
			// Forrest.g:189:2: ( SQUOTE LETTER SQUOTE )
			// Forrest.g:189:4: SQUOTE LETTER SQUOTE
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
			// Forrest.g:193:5: ( '//' ( . )* '\\n' )
			// Forrest.g:193:9: '//' ( . )* '\\n'
			{
			match("//"); 

			// Forrest.g:193:14: ( . )*
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
					// Forrest.g:193:14: .
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
			// Forrest.g:198:5: ( ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+ )
			// Forrest.g:198:9: ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+
			{
			// Forrest.g:198:9: ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+
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
			// Forrest.g:202:17: ( ( '0' .. '9' ) )
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
			// Forrest.g:203:17: ( ( 'a' .. 'z' ) )
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
			// Forrest.g:204:17: ( ( 'A' .. 'Z' ) )
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
			// Forrest.g:205:17: ( LOWER | UPPER )
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
		// Forrest.g:1:8: ( BECOMES | BOOL | CHAR | COLON | COMMA | COMPOUND | CONSTANT | DIVIDE | DO | ELSE | ENDIF | ENDWHILE | EQUALS | EXPR_IF | EXPR_WHILE | FALSE | GREATER | GREATEREQ | IF | INT | LCURLY | LOGAND | LOGOR | LPAREN | MINUS | MODULO | NEGATIVE | NOT | NOTEQUALS | PLUS | POSITIVE | PRINT | PROGRAM | RCURLY | READ | RPAREN | SEMICOLON | SMALLER | SMALLEREQ | SQUOTE | THEN | TIMES | TRUE | VAR | WHILE | IDENTIFIER | NUMBER | CHARACTER | COMMENT | WS )
		int alt5=50;
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
				// Forrest.g:1:28: COLON
				{
				mCOLON(); 

				}
				break;
			case 5 :
				// Forrest.g:1:34: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 6 :
				// Forrest.g:1:40: COMPOUND
				{
				mCOMPOUND(); 

				}
				break;
			case 7 :
				// Forrest.g:1:49: CONSTANT
				{
				mCONSTANT(); 

				}
				break;
			case 8 :
				// Forrest.g:1:58: DIVIDE
				{
				mDIVIDE(); 

				}
				break;
			case 9 :
				// Forrest.g:1:65: DO
				{
				mDO(); 

				}
				break;
			case 10 :
				// Forrest.g:1:68: ELSE
				{
				mELSE(); 

				}
				break;
			case 11 :
				// Forrest.g:1:73: ENDIF
				{
				mENDIF(); 

				}
				break;
			case 12 :
				// Forrest.g:1:79: ENDWHILE
				{
				mENDWHILE(); 

				}
				break;
			case 13 :
				// Forrest.g:1:88: EQUALS
				{
				mEQUALS(); 

				}
				break;
			case 14 :
				// Forrest.g:1:95: EXPR_IF
				{
				mEXPR_IF(); 

				}
				break;
			case 15 :
				// Forrest.g:1:103: EXPR_WHILE
				{
				mEXPR_WHILE(); 

				}
				break;
			case 16 :
				// Forrest.g:1:114: FALSE
				{
				mFALSE(); 

				}
				break;
			case 17 :
				// Forrest.g:1:120: GREATER
				{
				mGREATER(); 

				}
				break;
			case 18 :
				// Forrest.g:1:128: GREATEREQ
				{
				mGREATEREQ(); 

				}
				break;
			case 19 :
				// Forrest.g:1:138: IF
				{
				mIF(); 

				}
				break;
			case 20 :
				// Forrest.g:1:141: INT
				{
				mINT(); 

				}
				break;
			case 21 :
				// Forrest.g:1:145: LCURLY
				{
				mLCURLY(); 

				}
				break;
			case 22 :
				// Forrest.g:1:152: LOGAND
				{
				mLOGAND(); 

				}
				break;
			case 23 :
				// Forrest.g:1:159: LOGOR
				{
				mLOGOR(); 

				}
				break;
			case 24 :
				// Forrest.g:1:165: LPAREN
				{
				mLPAREN(); 

				}
				break;
			case 25 :
				// Forrest.g:1:172: MINUS
				{
				mMINUS(); 

				}
				break;
			case 26 :
				// Forrest.g:1:178: MODULO
				{
				mMODULO(); 

				}
				break;
			case 27 :
				// Forrest.g:1:185: NEGATIVE
				{
				mNEGATIVE(); 

				}
				break;
			case 28 :
				// Forrest.g:1:194: NOT
				{
				mNOT(); 

				}
				break;
			case 29 :
				// Forrest.g:1:198: NOTEQUALS
				{
				mNOTEQUALS(); 

				}
				break;
			case 30 :
				// Forrest.g:1:208: PLUS
				{
				mPLUS(); 

				}
				break;
			case 31 :
				// Forrest.g:1:213: POSITIVE
				{
				mPOSITIVE(); 

				}
				break;
			case 32 :
				// Forrest.g:1:222: PRINT
				{
				mPRINT(); 

				}
				break;
			case 33 :
				// Forrest.g:1:228: PROGRAM
				{
				mPROGRAM(); 

				}
				break;
			case 34 :
				// Forrest.g:1:236: RCURLY
				{
				mRCURLY(); 

				}
				break;
			case 35 :
				// Forrest.g:1:243: READ
				{
				mREAD(); 

				}
				break;
			case 36 :
				// Forrest.g:1:248: RPAREN
				{
				mRPAREN(); 

				}
				break;
			case 37 :
				// Forrest.g:1:255: SEMICOLON
				{
				mSEMICOLON(); 

				}
				break;
			case 38 :
				// Forrest.g:1:265: SMALLER
				{
				mSMALLER(); 

				}
				break;
			case 39 :
				// Forrest.g:1:273: SMALLEREQ
				{
				mSMALLEREQ(); 

				}
				break;
			case 40 :
				// Forrest.g:1:283: SQUOTE
				{
				mSQUOTE(); 

				}
				break;
			case 41 :
				// Forrest.g:1:290: THEN
				{
				mTHEN(); 

				}
				break;
			case 42 :
				// Forrest.g:1:295: TIMES
				{
				mTIMES(); 

				}
				break;
			case 43 :
				// Forrest.g:1:301: TRUE
				{
				mTRUE(); 

				}
				break;
			case 44 :
				// Forrest.g:1:306: VAR
				{
				mVAR(); 

				}
				break;
			case 45 :
				// Forrest.g:1:310: WHILE
				{
				mWHILE(); 

				}
				break;
			case 46 :
				// Forrest.g:1:316: IDENTIFIER
				{
				mIDENTIFIER(); 

				}
				break;
			case 47 :
				// Forrest.g:1:327: NUMBER
				{
				mNUMBER(); 

				}
				break;
			case 48 :
				// Forrest.g:1:334: CHARACTER
				{
				mCHARACTER(); 

				}
				break;
			case 49 :
				// Forrest.g:1:344: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 50 :
				// Forrest.g:1:352: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA5 dfa5 = new DFA5(this);
	static final String DFA5_eotS =
		"\1\uffff\1\44\2\40\2\uffff\1\41\1\55\3\40\1\63\1\40\6\uffff\1\67\1\uffff"+
		"\1\40\1\uffff\1\40\2\uffff\1\73\1\74\1\40\1\uffff\2\40\5\uffff\3\40\6"+
		"\uffff\1\110\3\40\2\uffff\1\114\1\40\2\uffff\2\40\4\uffff\7\40\4\uffff"+
		"\3\40\1\uffff\1\134\4\40\1\141\1\40\1\143\1\144\1\40\1\uffff\1\147\3\40"+
		"\1\uffff\1\40\1\154\1\155\1\156\1\uffff\1\40\2\uffff\1\160\2\uffff\1\163"+
		"\1\40\1\165\1\166\3\uffff\1\167\4\uffff\1\40\3\uffff\1\40\1\172\1\uffff";
	static final String DFA5_eofS =
		"\173\uffff";
	static final String DFA5_minS =
		"\1\11\1\75\1\157\1\150\2\uffff\1\103\1\57\1\157\1\154\1\141\1\75\1\146"+
		"\6\uffff\1\75\1\uffff\1\162\1\uffff\1\145\2\uffff\1\75\1\101\1\150\1\uffff"+
		"\1\141\1\150\5\uffff\1\157\1\141\1\156\1\uffff\1\130\1\uffff\1\117\2\uffff"+
		"\1\60\1\163\1\144\1\154\2\uffff\1\60\1\164\2\uffff\1\151\1\141\4\uffff"+
		"\1\145\1\165\1\162\1\151\1\154\1\162\1\163\1\120\3\uffff\1\145\1\151\1"+
		"\163\1\uffff\1\60\1\156\1\144\1\156\1\145\1\60\1\154\2\60\1\164\1\122"+
		"\1\60\1\146\1\150\1\145\1\uffff\1\164\3\60\1\uffff\1\145\2\uffff\1\60"+
		"\1\111\1\uffff\1\60\1\151\2\60\3\uffff\1\60\4\uffff\1\154\3\uffff\1\145"+
		"\1\60\1\uffff";
	static final String DFA5_maxS =
		"\1\175\1\75\2\157\2\uffff\1\120\1\57\1\157\1\156\1\141\1\75\1\156\6\uffff"+
		"\1\75\1\uffff\1\162\1\uffff\1\145\2\uffff\1\75\1\172\1\162\1\uffff\1\141"+
		"\1\150\5\uffff\1\157\1\141\1\156\1\uffff\1\130\1\uffff\1\122\2\uffff\1"+
		"\172\1\163\1\144\1\154\2\uffff\1\172\1\164\2\uffff\1\151\1\141\4\uffff"+
		"\1\145\1\165\1\162\1\151\1\154\1\162\1\163\1\120\3\uffff\1\145\1\167\1"+
		"\163\1\uffff\1\172\1\156\1\144\1\156\1\145\1\172\1\154\2\172\1\164\1\122"+
		"\1\172\1\146\1\150\1\145\1\uffff\1\164\3\172\1\uffff\1\145\2\uffff\1\172"+
		"\1\127\1\uffff\1\172\1\151\2\172\3\uffff\1\172\4\uffff\1\154\3\uffff\1"+
		"\145\1\172\1\uffff";
	static final String DFA5_acceptS =
		"\4\uffff\1\4\1\5\7\uffff\1\25\1\26\1\27\1\30\1\31\1\32\1\uffff\1\36\1"+
		"\uffff\1\42\1\uffff\1\44\1\45\3\uffff\1\52\2\uffff\1\56\1\57\1\62\1\15"+
		"\1\1\3\uffff\1\6\1\uffff\1\33\1\uffff\1\61\1\10\4\uffff\1\22\1\21\2\uffff"+
		"\1\35\1\34\2\uffff\1\47\1\46\1\50\1\60\10\uffff\1\37\1\41\1\11\3\uffff"+
		"\1\23\17\uffff\1\24\4\uffff\1\54\1\uffff\1\2\1\3\2\uffff\1\12\4\uffff"+
		"\1\43\1\51\1\53\1\uffff\1\7\1\16\1\17\1\13\1\uffff\1\20\1\40\1\55\2\uffff"+
		"\1\14";
	static final String DFA5_specialS =
		"\173\uffff}>";
	static final String[] DFA5_transitionS = {
			"\2\42\1\uffff\2\42\22\uffff\1\42\1\23\3\uffff\1\22\1\16\1\33\1\20\1\30"+
			"\1\35\1\24\1\5\1\21\1\uffff\1\7\7\41\1\6\2\41\1\4\1\31\1\32\1\1\1\13"+
			"\2\uffff\32\40\6\uffff\1\40\1\2\1\3\1\10\1\11\1\12\2\40\1\14\6\40\1\25"+
			"\1\40\1\27\1\40\1\34\1\40\1\36\1\37\3\40\1\15\1\17\1\26",
			"\1\43",
			"\1\45",
			"\1\46\6\uffff\1\47",
			"",
			"",
			"\1\50\1\uffff\1\51\10\uffff\1\52\1\uffff\1\53",
			"\1\54",
			"\1\56",
			"\1\57\1\uffff\1\60",
			"\1\61",
			"\1\62",
			"\1\64\7\uffff\1\65",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\66",
			"",
			"\1\70",
			"",
			"\1\71",
			"",
			"",
			"\1\72",
			"\32\75\6\uffff\32\75",
			"\1\76\11\uffff\1\77",
			"",
			"\1\100",
			"\1\101",
			"",
			"",
			"",
			"",
			"",
			"\1\102",
			"\1\103",
			"\1\104",
			"",
			"\1\105",
			"",
			"\1\106\2\uffff\1\107",
			"",
			"",
			"\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\111",
			"\1\112",
			"\1\113",
			"",
			"",
			"\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\115",
			"",
			"",
			"\1\116",
			"\1\117",
			"",
			"",
			"",
			"",
			"\1\120",
			"\1\121",
			"\1\122",
			"\1\123",
			"\1\124",
			"\1\125",
			"\1\126",
			"\1\127",
			"",
			"",
			"",
			"\1\130",
			"\1\131\15\uffff\1\132",
			"\1\133",
			"",
			"\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\135",
			"\1\136",
			"\1\137",
			"\1\140",
			"\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\142",
			"\12\40\7\uffff\32\40\6\uffff\32\40",
			"\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\145",
			"\1\146",
			"\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\150",
			"\1\151",
			"\1\152",
			"",
			"\1\153",
			"\12\40\7\uffff\32\40\6\uffff\32\40",
			"\12\40\7\uffff\32\40\6\uffff\32\40",
			"\12\40\7\uffff\32\40\6\uffff\32\40",
			"",
			"\1\157",
			"",
			"",
			"\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\161\15\uffff\1\162",
			"",
			"\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\164",
			"\12\40\7\uffff\32\40\6\uffff\32\40",
			"\12\40\7\uffff\32\40\6\uffff\32\40",
			"",
			"",
			"",
			"\12\40\7\uffff\32\40\6\uffff\32\40",
			"",
			"",
			"",
			"",
			"\1\170",
			"",
			"",
			"",
			"\1\171",
			"\12\40\7\uffff\32\40\6\uffff\32\40",
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
			return "1:1: Tokens : ( BECOMES | BOOL | CHAR | COLON | COMMA | COMPOUND | CONSTANT | DIVIDE | DO | ELSE | ENDIF | ENDWHILE | EQUALS | EXPR_IF | EXPR_WHILE | FALSE | GREATER | GREATEREQ | IF | INT | LCURLY | LOGAND | LOGOR | LPAREN | MINUS | MODULO | NEGATIVE | NOT | NOTEQUALS | PLUS | POSITIVE | PRINT | PROGRAM | RCURLY | READ | RPAREN | SEMICOLON | SMALLER | SMALLEREQ | SQUOTE | THEN | TIMES | TRUE | VAR | WHILE | IDENTIFIER | NUMBER | CHARACTER | COMMENT | WS );";
		}
	}

}
