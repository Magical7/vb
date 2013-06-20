// $ANTLR 3.5 ForrestChecker.g 2013-06-20 10:54:54

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
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "BECOMES", "BOOL", "CHAR", "COMMA", 
		"COMMENT", "COMPOUND", "CONSTANT", "DIGIT", "DIVIDE", "ELSE", "ENDIF", 
		"EQUALS", "GREATER", "GREATEREQ", "IDENTIFIER", "IF", "INT", "LCURLY", 
		"LETTER", "LOGAND", "LOGOR", "LOWER", "LPAREN", "MINUS", "MODULO", "NEGATIVE", 
		"NOT", "NOTEQUALS", "NUMBER", "PLUS", "POSITIVE", "PRINT", "PROGRAM", 
		"RCURLY", "READ", "RPAREN", "SEMICOLON", "SMALLER", "SMALLEREQ", "THEN", 
		"TIMES", "UPPER", "VAR", "WS"
	};
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
	public static final int NEGATIVE=29;
	public static final int NOT=30;
	public static final int NOTEQUALS=31;
	public static final int NUMBER=32;
	public static final int PLUS=33;
	public static final int POSITIVE=34;
	public static final int PRINT=35;
	public static final int PROGRAM=36;
	public static final int RCURLY=37;
	public static final int READ=38;
	public static final int RPAREN=39;
	public static final int SEMICOLON=40;
	public static final int SMALLER=41;
	public static final int SMALLEREQ=42;
	public static final int THEN=43;
	public static final int TIMES=44;
	public static final int UPPER=45;
	public static final int VAR=46;
	public static final int WS=47;

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
				if ( (LA2_0==BECOMES||(LA2_0 >= COMPOUND && LA2_0 <= CONSTANT)||LA2_0==DIVIDE||(LA2_0 >= EQUALS && LA2_0 <= IF)||(LA2_0 >= LOGAND && LA2_0 <= LOGOR)||(LA2_0 >= MINUS && LA2_0 <= PRINT)||LA2_0==READ||(LA2_0 >= SMALLER && LA2_0 <= SMALLEREQ)||LA2_0==TIMES||LA2_0==VAR) ) {
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

		try {
			// ForrestChecker.g:36:2: ( ^( VAR id= IDENTIFIER (type= CHAR |type= BOOL |type= INT ) ) | ^( CONSTANT id= IDENTIFIER expr ) )
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
					// ForrestChecker.g:36:4: ^( VAR id= IDENTIFIER (type= CHAR |type= BOOL |type= INT ) )
					{
					match(input,VAR,FOLLOW_VAR_in_declaration99); 
					match(input, Token.DOWN, null); 
					id=(ForrestTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration103); 
					// ForrestChecker.g:36:24: (type= CHAR |type= BOOL |type= INT )
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
							// ForrestChecker.g:36:25: type= CHAR
							{
							type=(ForrestTree)match(input,CHAR,FOLLOW_CHAR_in_declaration108); 
							}
							break;
						case 2 :
							// ForrestChecker.g:36:37: type= BOOL
							{
							type=(ForrestTree)match(input,BOOL,FOLLOW_BOOL_in_declaration114); 
							}
							break;
						case 3 :
							// ForrestChecker.g:36:49: type= INT
							{
							type=(ForrestTree)match(input,INT,FOLLOW_INT_in_declaration120); 
							}
							break;

					}

					match(input, Token.UP, null); 

					symtab.declareId(id, type);
					}
					break;
				case 2 :
					// ForrestChecker.g:38:4: ^( CONSTANT id= IDENTIFIER expr )
					{
					match(input,CONSTANT,FOLLOW_CONSTANT_in_declaration132); 
					match(input, Token.DOWN, null); 
					id=(ForrestTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration136); 
					ForrestTree ex=(ForrestTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_declaration142);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					symtab.declareConst(id, ex);
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
	// ForrestChecker.g:44:1: expr : ( ^( BECOMES id= IDENTIFIER expr ) | ^( IF expr expr ( expr )? ) | ^( ( LOGOR | LOGAND ) expr expr ) | ^( ( GREATER | SMALLER | GREATEREQ | SMALLEREQ ) expr expr ) | ^( ( EQUALS | NOTEQUALS ) expr expr ) | ^( ( PLUS | MINUS | TIMES | DIVIDE | MODULO ) expr expr ) | ^( ( POSITIVE | NEGATIVE ) expr ) | ^( ( NOT ) expr ) | ^( COMPOUND program_lines ) | IDENTIFIER | NUMBER | read | print );
	public final void expr() throws RecognitionException {
		ForrestTree id=null;

		ForrestTree t = (ForrestTree)input.LT(1);
		ForrestTree ex1 = (ForrestTree)input.LT(2);
		ForrestTree ex2 = (ForrestTree)input.LT(3);
		ForrestTree ex3 = (ForrestTree)input.LT(4);
		try {
			// ForrestChecker.g:50:2: ( ^( BECOMES id= IDENTIFIER expr ) | ^( IF expr expr ( expr )? ) | ^( ( LOGOR | LOGAND ) expr expr ) | ^( ( GREATER | SMALLER | GREATEREQ | SMALLEREQ ) expr expr ) | ^( ( EQUALS | NOTEQUALS ) expr expr ) | ^( ( PLUS | MINUS | TIMES | DIVIDE | MODULO ) expr expr ) | ^( ( POSITIVE | NEGATIVE ) expr ) | ^( ( NOT ) expr ) | ^( COMPOUND program_lines ) | IDENTIFIER | NUMBER | read | print )
			int alt6=13;
			switch ( input.LA(1) ) {
			case BECOMES:
				{
				alt6=1;
				}
				break;
			case IF:
				{
				alt6=2;
				}
				break;
			case LOGAND:
			case LOGOR:
				{
				alt6=3;
				}
				break;
			case GREATER:
			case GREATEREQ:
			case SMALLER:
			case SMALLEREQ:
				{
				alt6=4;
				}
				break;
			case EQUALS:
			case NOTEQUALS:
				{
				alt6=5;
				}
				break;
			case DIVIDE:
			case MINUS:
			case MODULO:
			case PLUS:
			case TIMES:
				{
				alt6=6;
				}
				break;
			case NEGATIVE:
			case POSITIVE:
				{
				alt6=7;
				}
				break;
			case NOT:
				{
				alt6=8;
				}
				break;
			case COMPOUND:
				{
				alt6=9;
				}
				break;
			case IDENTIFIER:
				{
				alt6=10;
				}
				break;
			case NUMBER:
				{
				alt6=11;
				}
				break;
			case READ:
				{
				alt6=12;
				}
				break;
			case PRINT:
				{
				alt6=13;
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
					match(input,BECOMES,FOLLOW_BECOMES_in_expr166); 
					match(input, Token.DOWN, null); 
					id=(ForrestTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expr170); 
					pushFollow(FOLLOW_expr_in_expr172);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 


								symtab.setType(id);
								ExpressionChecker.checkAssign(t, id, ex2);
							
					}
					break;
				case 2 :
					// ForrestChecker.g:55:4: ^( IF expr expr ( expr )? )
					{
					boolean hasElse = false;
					match(input,IF,FOLLOW_IF_in_expr188); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr190);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr192);
					expr();
					state._fsp--;

					// ForrestChecker.g:56:18: ( expr )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==BECOMES||LA5_0==COMPOUND||LA5_0==DIVIDE||(LA5_0 >= EQUALS && LA5_0 <= IF)||(LA5_0 >= LOGAND && LA5_0 <= LOGOR)||(LA5_0 >= MINUS && LA5_0 <= PRINT)||LA5_0==READ||(LA5_0 >= SMALLER && LA5_0 <= SMALLEREQ)||LA5_0==TIMES) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// ForrestChecker.g:56:19: expr
							{
							pushFollow(FOLLOW_expr_in_expr195);
							expr();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 


								if (hasElse) {
									ExpressionChecker.checkIfElse(t, ex1, ex2, ex3);
								} else {
									ExpressionChecker.checkIf(t, ex1, ex2);
								}
							
					}
					break;
				case 3 :
					// ForrestChecker.g:64:4: ^( ( LOGOR | LOGAND ) expr expr )
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
					pushFollow(FOLLOW_expr_in_expr215);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr217);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					ExpressionChecker.checkBinaryBoolean(t, ex1, ex2);
					}
					break;
				case 4 :
					// ForrestChecker.g:66:4: ^( ( GREATER | SMALLER | GREATEREQ | SMALLEREQ ) expr expr )
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
					pushFollow(FOLLOW_expr_in_expr244);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr246);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					ExpressionChecker.checkComparison(t, ex1, ex2);
					}
					break;
				case 5 :
					// ForrestChecker.g:68:4: ^( ( EQUALS | NOTEQUALS ) expr expr )
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
					pushFollow(FOLLOW_expr_in_expr265);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr267);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					ExpressionChecker.checkEquals(t, ex1, ex2);
					}
					break;
				case 6 :
					// ForrestChecker.g:70:4: ^( ( PLUS | MINUS | TIMES | DIVIDE | MODULO ) expr expr )
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
					pushFollow(FOLLOW_expr_in_expr298);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr300);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					ExpressionChecker.checkBinaryInteger(t, ex1, ex2);
					}
					break;
				case 7 :
					// ForrestChecker.g:72:4: ^( ( POSITIVE | NEGATIVE ) expr )
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
					pushFollow(FOLLOW_expr_in_expr319);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					ExpressionChecker.checkUnaryInteger(t, ex1);
					}
					break;
				case 8 :
					// ForrestChecker.g:74:4: ^( ( NOT ) expr )
					{
					// ForrestChecker.g:74:6: ( NOT )
					// ForrestChecker.g:74:7: NOT
					{
					match(input,NOT,FOLLOW_NOT_in_expr331); 
					}

					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr334);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					ExpressionChecker.checkUnaryBoolean(t, ex1);
					}
					break;
				case 9 :
					// ForrestChecker.g:76:6: ^( COMPOUND program_lines )
					{
					match(input,COMPOUND,FOLLOW_COMPOUND_in_expr347); 
					symtab.openScope();
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						pushFollow(FOLLOW_program_lines_in_expr351);
						program_lines();
						state._fsp--;

						match(input, Token.UP, null); 
					}

					symtab.closeScope();
					}
					break;
				case 10 :
					// ForrestChecker.g:77:4: IDENTIFIER
					{
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expr359); 
					symtab.setType(t);
					}
					break;
				case 11 :
					// ForrestChecker.g:78:4: NUMBER
					{
					match(input,NUMBER,FOLLOW_NUMBER_in_expr366); 
					}
					break;
				case 12 :
					// ForrestChecker.g:79:4: read
					{
					pushFollow(FOLLOW_read_in_expr371);
					read();
					state._fsp--;

					}
					break;
				case 13 :
					// ForrestChecker.g:80:4: print
					{
					pushFollow(FOLLOW_print_in_expr376);
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



	// $ANTLR start "read"
	// ForrestChecker.g:83:1: read : ^( READ (id= IDENTIFIER )+ ) ;
	public final void read() throws RecognitionException {
		ForrestTree id=null;


		ForrestTree t = (ForrestTree)input.LT(1);
		List<ForrestTree> ids = new ArrayList<ForrestTree>();

		try {
			// ForrestChecker.g:88:2: ( ^( READ (id= IDENTIFIER )+ ) )
			// ForrestChecker.g:88:4: ^( READ (id= IDENTIFIER )+ )
			{
			match(input,READ,FOLLOW_READ_in_read394); 
			match(input, Token.DOWN, null); 
			// ForrestChecker.g:88:11: (id= IDENTIFIER )+
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
					// ForrestChecker.g:88:12: id= IDENTIFIER
					{
					id=(ForrestTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_read399); 

								symtab.setType(id);
								ids.add(id);
								
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

			ExpressionChecker.checkRead(t, ids);
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
	// ForrestChecker.g:95:1: print : ^( PRINT ( expr )+ ) ;
	public final void print() throws RecognitionException {

		ForrestTree t = (ForrestTree)input.LT(1);
		List<ForrestTree> exprs = new ArrayList<ForrestTree>();

		try {
			// ForrestChecker.g:100:2: ( ^( PRINT ( expr )+ ) )
			// ForrestChecker.g:100:4: ^( PRINT ( expr )+ )
			{
			match(input,PRINT,FOLLOW_PRINT_in_print427); 
			match(input, Token.DOWN, null); 
			// ForrestChecker.g:100:12: ( expr )+
			int cnt8=0;
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==BECOMES||LA8_0==COMPOUND||LA8_0==DIVIDE||(LA8_0 >= EQUALS && LA8_0 <= IF)||(LA8_0 >= LOGAND && LA8_0 <= LOGOR)||(LA8_0 >= MINUS && LA8_0 <= PRINT)||LA8_0==READ||(LA8_0 >= SMALLER && LA8_0 <= SMALLEREQ)||LA8_0==TIMES) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// ForrestChecker.g:101:4: expr
					{

									ForrestTree expression = (ForrestTree)input.LT(1);
									symtab.setType(expression);
									exprs.add(expression);
								
					pushFollow(FOLLOW_expr_in_print439);
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

			ExpressionChecker.checkPrint(t, exprs);
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
	public static final BitSet FOLLOW_declaration_in_program_lines81 = new BitSet(new long[]{0x0000564FF98F9610L});
	public static final BitSet FOLLOW_expr_in_program_lines85 = new BitSet(new long[]{0x0000564FF98F9612L});
	public static final BitSet FOLLOW_VAR_in_declaration99 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration103 = new BitSet(new long[]{0x0000000000100060L});
	public static final BitSet FOLLOW_CHAR_in_declaration108 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BOOL_in_declaration114 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INT_in_declaration120 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CONSTANT_in_declaration132 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration136 = new BitSet(new long[]{0x0000164FF98F9210L});
	public static final BitSet FOLLOW_expr_in_declaration142 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BECOMES_in_expr166 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_expr170 = new BitSet(new long[]{0x0000164FF98F9210L});
	public static final BitSet FOLLOW_expr_in_expr172 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IF_in_expr188 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr190 = new BitSet(new long[]{0x0000164FF98F9210L});
	public static final BitSet FOLLOW_expr_in_expr192 = new BitSet(new long[]{0x0000164FF98F9218L});
	public static final BitSet FOLLOW_expr_in_expr195 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_set_in_expr209 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr215 = new BitSet(new long[]{0x0000164FF98F9210L});
	public static final BitSet FOLLOW_expr_in_expr217 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_set_in_expr228 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr244 = new BitSet(new long[]{0x0000164FF98F9210L});
	public static final BitSet FOLLOW_expr_in_expr246 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_set_in_expr257 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr265 = new BitSet(new long[]{0x0000164FF98F9210L});
	public static final BitSet FOLLOW_expr_in_expr267 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_set_in_expr278 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr298 = new BitSet(new long[]{0x0000164FF98F9210L});
	public static final BitSet FOLLOW_expr_in_expr300 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_set_in_expr311 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr319 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NOT_in_expr331 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr334 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_COMPOUND_in_expr347 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_program_lines_in_expr351 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IDENTIFIER_in_expr359 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_expr366 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_in_expr371 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_in_expr376 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_read394 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_read399 = new BitSet(new long[]{0x0000000000040008L});
	public static final BitSet FOLLOW_PRINT_in_print427 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_print439 = new BitSet(new long[]{0x0000164FF98F9218L});
}
