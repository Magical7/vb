// $ANTLR 3.5 ForrestChecker.g 2013-06-29 13:26:53

	package forrest.main;
	import fire.ForrestFireException;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ForrestChecker extends TreeParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "BECOMES", "BOOL", "CHAR", "CHARACTER", 
		"COLON", "COMMA", "COMMENT", "COMPOUND", "CONSTANT", "DIGIT", "DIVIDE", 
		"DO", "ELSE", "ENDIF", "ENDWHILE", "EQUALS", "EXPR_IF", "EXPR_WHILE", 
		"FALSE", "GREATER", "GREATEREQ", "IDENTIFIER", "IF", "INT", "LCURLY", 
		"LETTER", "LOGAND", "LOGOR", "LOWER", "LPAREN", "MINUS", "MODULO", "NEGATIVE", 
		"NOT", "NOTEQUALS", "NUMBER", "PLUS", "POSITIVE", "PRINT", "PROGRAM", 
		"RCURLY", "READ", "RPAREN", "SEMICOLON", "SMALLER", "SMALLEREQ", "SQUOTE", 
		"THEN", "TIMES", "TRUE", "UPPER", "VAR", "WHILE", "WS"
	};
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
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators


	public ForrestChecker(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public ForrestChecker(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return ForrestChecker.tokenNames; }
	@Override public String getGrammarFileName() { return "ForrestChecker.g"; }


		// Keep track of identifiers
		private SymbolTable symtab = new SymbolTable();



	// $ANTLR start "forrest"
	// ForrestChecker.g:27:1: forrest : ^( PROGRAM program_lines ) ;
	public final void forrest() throws RecognitionException {
		try {
			// ForrestChecker.g:28:2: ( ^( PROGRAM program_lines ) )
			// ForrestChecker.g:28:6: ^( PROGRAM program_lines )
			{
			match(input,PROGRAM,FOLLOW_PROGRAM_in_forrest54); 
			symtab.openScope();
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				pushFollow(FOLLOW_program_lines_in_forrest58);
				program_lines();
				state._fsp--;

				match(input, Token.UP, null); 
			}

			symtab.closeScope();
			}

		}

			catch (RecognitionException e) {
				throw e;
			}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "forrest"



	// $ANTLR start "program_lines"
	// ForrestChecker.g:31:1: program_lines : ( ( declaration )* expr )* ;
	public final void program_lines() throws RecognitionException {
		try {
			// ForrestChecker.g:32:2: ( ( ( declaration )* expr )* )
			// ForrestChecker.g:32:4: ( ( declaration )* expr )*
			{
			// ForrestChecker.g:32:4: ( ( declaration )* expr )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==BECOMES||LA2_0==CHARACTER||(LA2_0 >= COMPOUND && LA2_0 <= CONSTANT)||LA2_0==DIVIDE||(LA2_0 >= EQUALS && LA2_0 <= IDENTIFIER)||(LA2_0 >= LOGAND && LA2_0 <= LOGOR)||(LA2_0 >= MINUS && LA2_0 <= PRINT)||LA2_0==READ||(LA2_0 >= SMALLER && LA2_0 <= SMALLEREQ)||(LA2_0 >= TIMES && LA2_0 <= TRUE)||LA2_0==VAR) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// ForrestChecker.g:32:5: ( declaration )* expr
					{
					// ForrestChecker.g:32:5: ( declaration )*
					loop1:
					while (true) {
						int alt1=2;
						int LA1_0 = input.LA(1);
						if ( (LA1_0==CONSTANT||LA1_0==VAR) ) {
							alt1=1;
						}

						switch (alt1) {
						case 1 :
							// ForrestChecker.g:32:6: declaration
							{
							pushFollow(FOLLOW_declaration_in_program_lines81);
							declaration();
							state._fsp--;

							}
							break;

						default :
							break loop1;
						}
					}

					pushFollow(FOLLOW_expr_in_program_lines85);
					expr();
					state._fsp--;

					}
					break;

				default :
					break loop2;
				}
			}

			}

		}

			catch (RecognitionException e) {
				throw e;
			}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "program_lines"



	// $ANTLR start "declaration"
	// ForrestChecker.g:35:1: declaration : ( ^( VAR id= IDENTIFIER (type= CHAR |type= BOOL |type= INT ) ) | ^( CONSTANT id= IDENTIFIER expr ) );
	public final void declaration() throws RecognitionException {
		ForrestTree id=null;
		ForrestTree type=null;


		ForrestTree t = (ForrestTree)input.LT(1);

		try {
			// ForrestChecker.g:39:2: ( ^( VAR id= IDENTIFIER (type= CHAR |type= BOOL |type= INT ) ) | ^( CONSTANT id= IDENTIFIER expr ) )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==VAR) ) {
				alt4=1;
			}
			else if ( (LA4_0==CONSTANT) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// ForrestChecker.g:39:4: ^( VAR id= IDENTIFIER (type= CHAR |type= BOOL |type= INT ) )
					{
					match(input,VAR,FOLLOW_VAR_in_declaration104); 
					match(input, Token.DOWN, null); 
					id=(ForrestTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration108); 
					// ForrestChecker.g:39:24: (type= CHAR |type= BOOL |type= INT )
					int alt3=3;
					switch ( input.LA(1) ) {
					case CHAR:
						{
						alt3=1;
						}
						break;
					case BOOL:
						{
						alt3=2;
						}
						break;
					case INT:
						{
						alt3=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 3, 0, input);
						throw nvae;
					}
					switch (alt3) {
						case 1 :
							// ForrestChecker.g:39:25: type= CHAR
							{
							type=(ForrestTree)match(input,CHAR,FOLLOW_CHAR_in_declaration113); 
							}
							break;
						case 2 :
							// ForrestChecker.g:39:37: type= BOOL
							{
							type=(ForrestTree)match(input,BOOL,FOLLOW_BOOL_in_declaration119); 
							}
							break;
						case 3 :
							// ForrestChecker.g:39:49: type= INT
							{
							type=(ForrestTree)match(input,INT,FOLLOW_INT_in_declaration125); 
							}
							break;

					}

					match(input, Token.UP, null); 

					symtab.declareId(t);
					}
					break;
				case 2 :
					// ForrestChecker.g:41:4: ^( CONSTANT id= IDENTIFIER expr )
					{
					match(input,CONSTANT,FOLLOW_CONSTANT_in_declaration137); 
					match(input, Token.DOWN, null); 
					id=(ForrestTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration141); 
					pushFollow(FOLLOW_expr_in_declaration143);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					symtab.declareConst(t);
					}
					break;

			}
		}

			catch (RecognitionException e) {
				throw e;
			}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "declaration"



	// $ANTLR start "expr"
	// ForrestChecker.g:46:1: expr : ( ^( BECOMES id= IDENTIFIER expr ) | ^( EXPR_WHILE while_comp do_comp ) | ^( EXPR_IF if_comp then_comp ( else_comp )? ) | ^( ( LOGOR | LOGAND ) expr expr ) | ^( ( GREATER | SMALLER | GREATEREQ | SMALLEREQ ) expr expr ) | ^( ( EQUALS | NOTEQUALS ) expr expr ) | ^( ( PLUS | MINUS | TIMES | DIVIDE | MODULO ) expr expr ) | ^( ( POSITIVE | NEGATIVE ) expr ) | ^( ( NOT ) expr ) | ^( COMPOUND program_lines ) | IDENTIFIER | NUMBER | ( TRUE | FALSE ) | CHARACTER | read | print );
	public final void expr() throws RecognitionException {
		ForrestTree id=null;


		ForrestTree t = (ForrestTree)input.LT(1);

		try {
			// ForrestChecker.g:50:2: ( ^( BECOMES id= IDENTIFIER expr ) | ^( EXPR_WHILE while_comp do_comp ) | ^( EXPR_IF if_comp then_comp ( else_comp )? ) | ^( ( LOGOR | LOGAND ) expr expr ) | ^( ( GREATER | SMALLER | GREATEREQ | SMALLEREQ ) expr expr ) | ^( ( EQUALS | NOTEQUALS ) expr expr ) | ^( ( PLUS | MINUS | TIMES | DIVIDE | MODULO ) expr expr ) | ^( ( POSITIVE | NEGATIVE ) expr ) | ^( ( NOT ) expr ) | ^( COMPOUND program_lines ) | IDENTIFIER | NUMBER | ( TRUE | FALSE ) | CHARACTER | read | print )
			int alt6=16;
			switch ( input.LA(1) ) {
			case BECOMES:
				{
				alt6=1;
				}
				break;
			case EXPR_WHILE:
				{
				alt6=2;
				}
				break;
			case EXPR_IF:
				{
				alt6=3;
				}
				break;
			case LOGAND:
			case LOGOR:
				{
				alt6=4;
				}
				break;
			case GREATER:
			case GREATEREQ:
			case SMALLER:
			case SMALLEREQ:
				{
				alt6=5;
				}
				break;
			case EQUALS:
			case NOTEQUALS:
				{
				alt6=6;
				}
				break;
			case DIVIDE:
			case MINUS:
			case MODULO:
			case PLUS:
			case TIMES:
				{
				alt6=7;
				}
				break;
			case NEGATIVE:
			case POSITIVE:
				{
				alt6=8;
				}
				break;
			case NOT:
				{
				alt6=9;
				}
				break;
			case COMPOUND:
				{
				alt6=10;
				}
				break;
			case IDENTIFIER:
				{
				alt6=11;
				}
				break;
			case NUMBER:
				{
				alt6=12;
				}
				break;
			case FALSE:
			case TRUE:
				{
				alt6=13;
				}
				break;
			case CHARACTER:
				{
				alt6=14;
				}
				break;
			case READ:
				{
				alt6=15;
				}
				break;
			case PRINT:
				{
				alt6=16;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// ForrestChecker.g:50:5: ^( BECOMES id= IDENTIFIER expr )
					{
					match(input,BECOMES,FOLLOW_BECOMES_in_expr167); 
					match(input, Token.DOWN, null); 
					id=(ForrestTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expr171); 
					pushFollow(FOLLOW_expr_in_expr173);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 


								symtab.setType(id);
								ExpressionChecker.checkAssign(t);
							
					}
					break;
				case 2 :
					// ForrestChecker.g:55:4: ^( EXPR_WHILE while_comp do_comp )
					{
					match(input,EXPR_WHILE,FOLLOW_EXPR_WHILE_in_expr184); 
					symtab.openScope();
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_while_comp_in_expr191);
					while_comp();
					state._fsp--;

					symtab.openScope();
					pushFollow(FOLLOW_do_comp_in_expr197);
					do_comp();
					state._fsp--;

					symtab.closeScope();
					match(input, Token.UP, null); 


								ExpressionChecker.checkWhile(t);
								symtab.closeScope();
							
					}
					break;
				case 3 :
					// ForrestChecker.g:62:4: ^( EXPR_IF if_comp then_comp ( else_comp )? )
					{
					boolean hasElse = false;
					match(input,EXPR_IF,FOLLOW_EXPR_IF_in_expr214); 
					symtab.openScope();
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_if_comp_in_expr221);
					if_comp();
					state._fsp--;

					symtab.openScope();
					pushFollow(FOLLOW_then_comp_in_expr227);
					then_comp();
					state._fsp--;

					symtab.closeScope();
					// ForrestChecker.g:66:4: ( else_comp )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==ELSE) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// ForrestChecker.g:66:5: else_comp
							{
							symtab.openScope(); hasElse=true;
							pushFollow(FOLLOW_else_comp_in_expr237);
							else_comp();
							state._fsp--;

							symtab.closeScope();
							}
							break;

					}

					match(input, Token.UP, null); 


								if (hasElse) {
									ExpressionChecker.checkIfElse(t);
								} else {
									ExpressionChecker.checkIf(t);
								}
								symtab.closeScope();
							
					}
					break;
				case 4 :
					// ForrestChecker.g:75:4: ^( ( LOGOR | LOGAND ) expr expr )
					{
					if ( (input.LA(1) >= LOGAND && input.LA(1) <= LOGOR) ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr259);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr261);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					ExpressionChecker.checkBinaryBoolean(t);
					}
					break;
				case 5 :
					// ForrestChecker.g:77:4: ^( ( GREATER | SMALLER | GREATEREQ | SMALLEREQ ) expr expr )
					{
					if ( (input.LA(1) >= GREATER && input.LA(1) <= GREATEREQ)||(input.LA(1) >= SMALLER && input.LA(1) <= SMALLEREQ) ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr288);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr290);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					ExpressionChecker.checkComparison(t);
					}
					break;
				case 6 :
					// ForrestChecker.g:79:4: ^( ( EQUALS | NOTEQUALS ) expr expr )
					{
					if ( input.LA(1)==EQUALS||input.LA(1)==NOTEQUALS ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr309);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr311);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					ExpressionChecker.checkEquals(t);
					}
					break;
				case 7 :
					// ForrestChecker.g:81:4: ^( ( PLUS | MINUS | TIMES | DIVIDE | MODULO ) expr expr )
					{
					if ( input.LA(1)==DIVIDE||(input.LA(1) >= MINUS && input.LA(1) <= MODULO)||input.LA(1)==PLUS||input.LA(1)==TIMES ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr342);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr344);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					ExpressionChecker.checkBinaryInteger(t);
					}
					break;
				case 8 :
					// ForrestChecker.g:83:4: ^( ( POSITIVE | NEGATIVE ) expr )
					{
					if ( input.LA(1)==NEGATIVE||input.LA(1)==POSITIVE ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr363);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					ExpressionChecker.checkUnaryInteger(t);
					}
					break;
				case 9 :
					// ForrestChecker.g:85:4: ^( ( NOT ) expr )
					{
					// ForrestChecker.g:85:6: ( NOT )
					// ForrestChecker.g:85:7: NOT
					{
					match(input,NOT,FOLLOW_NOT_in_expr375); 
					}

					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr378);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					ExpressionChecker.checkUnaryBoolean(t);
					}
					break;
				case 10 :
					// ForrestChecker.g:87:6: ^( COMPOUND program_lines )
					{
					match(input,COMPOUND,FOLLOW_COMPOUND_in_expr391); 
					symtab.openScope();
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						pushFollow(FOLLOW_program_lines_in_expr395);
						program_lines();
						state._fsp--;

						match(input, Token.UP, null); 
					}


								symtab.closeScope();
								ExpressionChecker.setCompound(t);
							
					}
					break;
				case 11 :
					// ForrestChecker.g:92:4: IDENTIFIER
					{
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expr405); 
					symtab.setType(t);
					}
					break;
				case 12 :
					// ForrestChecker.g:93:4: NUMBER
					{
					match(input,NUMBER,FOLLOW_NUMBER_in_expr412); 
					ExpressionChecker.setNumber(t);
					}
					break;
				case 13 :
					// ForrestChecker.g:94:4: ( TRUE | FALSE )
					{
					if ( input.LA(1)==FALSE||input.LA(1)==TRUE ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					ExpressionChecker.setBoolean(t);
					}
					break;
				case 14 :
					// ForrestChecker.g:95:4: CHARACTER
					{
					match(input,CHARACTER,FOLLOW_CHARACTER_in_expr432); 
					ExpressionChecker.setCharacter(t);
					}
					break;
				case 15 :
					// ForrestChecker.g:96:4: read
					{
					pushFollow(FOLLOW_read_in_expr439);
					read();
					state._fsp--;

					}
					break;
				case 16 :
					// ForrestChecker.g:97:4: print
					{
					pushFollow(FOLLOW_print_in_expr444);
					print();
					state._fsp--;

					}
					break;

			}
		}

			catch (RecognitionException e) {
				throw e;
			}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "expr"



	// $ANTLR start "while_comp"
	// ForrestChecker.g:100:1: while_comp : ^( WHILE program_lines ) ;
	public final void while_comp() throws RecognitionException {

		ForrestTree t = (ForrestTree)input.LT(1);

		try {
			// ForrestChecker.g:104:2: ( ^( WHILE program_lines ) )
			// ForrestChecker.g:104:4: ^( WHILE program_lines )
			{
			match(input,WHILE,FOLLOW_WHILE_in_while_comp461); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				pushFollow(FOLLOW_program_lines_in_while_comp463);
				program_lines();
				state._fsp--;

				match(input, Token.UP, null); 
			}

			ExpressionChecker.setCompound(t);
			}

		}

			catch (RecognitionException e) {
				throw e;
			}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "while_comp"



	// $ANTLR start "do_comp"
	// ForrestChecker.g:108:1: do_comp : ^( DO program_lines ) ;
	public final void do_comp() throws RecognitionException {

		ForrestTree t = (ForrestTree)input.LT(1);

		try {
			// ForrestChecker.g:112:2: ( ^( DO program_lines ) )
			// ForrestChecker.g:112:4: ^( DO program_lines )
			{
			match(input,DO,FOLLOW_DO_in_do_comp485); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				pushFollow(FOLLOW_program_lines_in_do_comp487);
				program_lines();
				state._fsp--;

				match(input, Token.UP, null); 
			}

			ExpressionChecker.setCompound(t);
			}

		}

			catch (RecognitionException e) {
				throw e;
			}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "do_comp"



	// $ANTLR start "if_comp"
	// ForrestChecker.g:116:1: if_comp : ^( IF program_lines ) ;
	public final void if_comp() throws RecognitionException {

		ForrestTree t = (ForrestTree)input.LT(1);

		try {
			// ForrestChecker.g:120:2: ( ^( IF program_lines ) )
			// ForrestChecker.g:120:4: ^( IF program_lines )
			{
			match(input,IF,FOLLOW_IF_in_if_comp509); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				pushFollow(FOLLOW_program_lines_in_if_comp511);
				program_lines();
				state._fsp--;

				match(input, Token.UP, null); 
			}

			ExpressionChecker.setCompound(t);
			}

		}

			catch (RecognitionException e) {
				throw e;
			}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "if_comp"



	// $ANTLR start "then_comp"
	// ForrestChecker.g:124:1: then_comp : ^( THEN program_lines ) ;
	public final void then_comp() throws RecognitionException {

		ForrestTree t = (ForrestTree)input.LT(1);

		try {
			// ForrestChecker.g:128:2: ( ^( THEN program_lines ) )
			// ForrestChecker.g:128:4: ^( THEN program_lines )
			{
			match(input,THEN,FOLLOW_THEN_in_then_comp533); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				pushFollow(FOLLOW_program_lines_in_then_comp535);
				program_lines();
				state._fsp--;

				match(input, Token.UP, null); 
			}

			ExpressionChecker.setCompound(t);
			}

		}

			catch (RecognitionException e) {
				throw e;
			}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "then_comp"



	// $ANTLR start "else_comp"
	// ForrestChecker.g:132:1: else_comp : ^( ELSE program_lines ) ;
	public final void else_comp() throws RecognitionException {

		ForrestTree t = (ForrestTree)input.LT(1);

		try {
			// ForrestChecker.g:136:2: ( ^( ELSE program_lines ) )
			// ForrestChecker.g:136:4: ^( ELSE program_lines )
			{
			match(input,ELSE,FOLLOW_ELSE_in_else_comp557); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				pushFollow(FOLLOW_program_lines_in_else_comp559);
				program_lines();
				state._fsp--;

				match(input, Token.UP, null); 
			}

			ExpressionChecker.setCompound(t);
			}

		}

			catch (RecognitionException e) {
				throw e;
			}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "else_comp"



	// $ANTLR start "read"
	// ForrestChecker.g:140:1: read : ^( READ (id= IDENTIFIER )+ ) ;
	public final void read() throws RecognitionException {
		ForrestTree id=null;


		ForrestTree t = (ForrestTree)input.LT(1);

		try {
			// ForrestChecker.g:144:2: ( ^( READ (id= IDENTIFIER )+ ) )
			// ForrestChecker.g:144:4: ^( READ (id= IDENTIFIER )+ )
			{
			match(input,READ,FOLLOW_READ_in_read581); 
			match(input, Token.DOWN, null); 
			// ForrestChecker.g:144:11: (id= IDENTIFIER )+
			int cnt7=0;
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==IDENTIFIER) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// ForrestChecker.g:144:12: id= IDENTIFIER
					{
					id=(ForrestTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_read586); 
					}
					break;

				default :
					if ( cnt7 >= 1 ) break loop7;
					EarlyExitException eee = new EarlyExitException(7, input);
					throw eee;
				}
				cnt7++;
			}

			match(input, Token.UP, null); 

			ExpressionChecker.checkRead(t);
			}

		}

			catch (RecognitionException e) {
				throw e;
			}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "read"



	// $ANTLR start "print"
	// ForrestChecker.g:148:1: print : ^( PRINT ( expr )+ ) ;
	public final void print() throws RecognitionException {

		ForrestTree t = (ForrestTree)input.LT(1);

		try {
			// ForrestChecker.g:152:2: ( ^( PRINT ( expr )+ ) )
			// ForrestChecker.g:152:4: ^( PRINT ( expr )+ )
			{
			match(input,PRINT,FOLLOW_PRINT_in_print612); 
			match(input, Token.DOWN, null); 
			// ForrestChecker.g:152:12: ( expr )+
			int cnt8=0;
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==BECOMES||LA8_0==CHARACTER||LA8_0==COMPOUND||LA8_0==DIVIDE||(LA8_0 >= EQUALS && LA8_0 <= IDENTIFIER)||(LA8_0 >= LOGAND && LA8_0 <= LOGOR)||(LA8_0 >= MINUS && LA8_0 <= PRINT)||LA8_0==READ||(LA8_0 >= SMALLER && LA8_0 <= SMALLEREQ)||(LA8_0 >= TIMES && LA8_0 <= TRUE)) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// ForrestChecker.g:152:13: expr
					{
					pushFollow(FOLLOW_expr_in_print615);
					expr();
					state._fsp--;

					}
					break;

				default :
					if ( cnt8 >= 1 ) break loop8;
					EarlyExitException eee = new EarlyExitException(8, input);
					throw eee;
				}
				cnt8++;
			}

			match(input, Token.UP, null); 

			ExpressionChecker.checkPrint(t);
			}

		}

			catch (RecognitionException e) {
				throw e;
			}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "print"

	// Delegated rules



	public static final BitSet FOLLOW_PROGRAM_in_forrest54 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_program_lines_in_forrest58 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_declaration_in_program_lines81 = new BitSet(new long[]{0x00B327FCC3F85890L});
	public static final BitSet FOLLOW_expr_in_program_lines85 = new BitSet(new long[]{0x00B327FCC3F85892L});
	public static final BitSet FOLLOW_VAR_in_declaration104 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration108 = new BitSet(new long[]{0x0000000008000060L});
	public static final BitSet FOLLOW_CHAR_in_declaration113 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BOOL_in_declaration119 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INT_in_declaration125 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CONSTANT_in_declaration137 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration141 = new BitSet(new long[]{0x003327FCC3F84890L});
	public static final BitSet FOLLOW_expr_in_declaration143 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BECOMES_in_expr167 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_expr171 = new BitSet(new long[]{0x003327FCC3F84890L});
	public static final BitSet FOLLOW_expr_in_expr173 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXPR_WHILE_in_expr184 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_while_comp_in_expr191 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_do_comp_in_expr197 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXPR_IF_in_expr214 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_if_comp_in_expr221 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_then_comp_in_expr227 = new BitSet(new long[]{0x0000000000010008L});
	public static final BitSet FOLLOW_else_comp_in_expr237 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_set_in_expr253 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr259 = new BitSet(new long[]{0x003327FCC3F84890L});
	public static final BitSet FOLLOW_expr_in_expr261 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_set_in_expr272 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr288 = new BitSet(new long[]{0x003327FCC3F84890L});
	public static final BitSet FOLLOW_expr_in_expr290 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_set_in_expr301 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr309 = new BitSet(new long[]{0x003327FCC3F84890L});
	public static final BitSet FOLLOW_expr_in_expr311 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_set_in_expr322 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr342 = new BitSet(new long[]{0x003327FCC3F84890L});
	public static final BitSet FOLLOW_expr_in_expr344 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_set_in_expr355 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr363 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NOT_in_expr375 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr378 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_COMPOUND_in_expr391 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_program_lines_in_expr395 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IDENTIFIER_in_expr405 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_expr412 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_expr419 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTER_in_expr432 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_in_expr439 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_in_expr444 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_while_comp461 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_program_lines_in_while_comp463 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DO_in_do_comp485 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_program_lines_in_do_comp487 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IF_in_if_comp509 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_program_lines_in_if_comp511 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_THEN_in_then_comp533 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_program_lines_in_then_comp535 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ELSE_in_else_comp557 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_program_lines_in_else_comp559 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_READ_in_read581 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_read586 = new BitSet(new long[]{0x0000000002000008L});
	public static final BitSet FOLLOW_PRINT_in_print612 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_print615 = new BitSet(new long[]{0x003327FCC3F84898L});
}
