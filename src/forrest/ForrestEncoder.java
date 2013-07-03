// $ANTLR 3.5 ForrestEncoder.g 2013-07-03 07:22:20

	package forrest;
	import fire.ForrestFireException;
	import util.*;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ForrestEncoder extends TreeParser {
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


	public ForrestEncoder(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public ForrestEncoder(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return ForrestEncoder.tokenNames; }
	@Override public String getGrammarFileName() { return "ForrestEncoder.g"; }


		// Keep track of identifiers
		private SymbolTable symtab = new SymbolTable();
		
		private ForrestWriter fw = new ForrestWriter();
		public void setFile(String fileLocation){
			fw.setFile(fileLocation);
		}



	// $ANTLR start "forrest"
	// ForrestEncoder.g:32:1: forrest : ^( PROGRAM program_lines ) ;
	public final void forrest() throws RecognitionException {

		fw.startProgram();

		try {
			// ForrestEncoder.g:36:2: ( ^( PROGRAM program_lines ) )
			// ForrestEncoder.g:36:4: ^( PROGRAM program_lines )
			{
			match(input,PROGRAM,FOLLOW_PROGRAM_in_forrest56); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				pushFollow(FOLLOW_program_lines_in_forrest58);
				program_lines();
				state._fsp--;

				match(input, Token.UP, null); 
			}


						fw.writeProgram();
						fw.print();
					
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
	// ForrestEncoder.g:43:1: program_lines : ( ( declaration )* expr )* ;
	public final void program_lines() throws RecognitionException {
		try {
			// ForrestEncoder.g:44:2: ( ( ( declaration )* expr )* )
			// ForrestEncoder.g:44:4: ( ( declaration )* expr )*
			{
			// ForrestEncoder.g:44:4: ( ( declaration )* expr )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==BECOMES||LA2_0==CHARACTER||(LA2_0 >= COMPOUND && LA2_0 <= CONSTANT)||LA2_0==DIVIDE||(LA2_0 >= EQUALS && LA2_0 <= IDENTIFIER)||(LA2_0 >= LOGAND && LA2_0 <= LOGOR)||(LA2_0 >= MINUS && LA2_0 <= PRINT)||LA2_0==READ||(LA2_0 >= SMALLER && LA2_0 <= SMALLEREQ)||(LA2_0 >= TIMES && LA2_0 <= TRUE)||LA2_0==VAR) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// ForrestEncoder.g:44:5: ( declaration )* expr
					{
					// ForrestEncoder.g:44:5: ( declaration )*
					loop1:
					while (true) {
						int alt1=2;
						int LA1_0 = input.LA(1);
						if ( (LA1_0==CONSTANT||LA1_0==VAR) ) {
							alt1=1;
						}

						switch (alt1) {
						case 1 :
							// ForrestEncoder.g:44:6: declaration
							{
							pushFollow(FOLLOW_declaration_in_program_lines76);
							declaration();
							state._fsp--;

							}
							break;

						default :
							break loop1;
						}
					}

					pushFollow(FOLLOW_expr_in_program_lines80);
					expr();
					state._fsp--;

					fw.writeLine();
					}
					break;

				default :
					break loop2;
				}
			}

			 fw.writeProgramLines(); 
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
	// ForrestEncoder.g:48:1: declaration : ( ^( VAR IDENTIFIER ( CHAR | BOOL | INT ) ) | ^( CONSTANT IDENTIFIER expr ) );
	public final void declaration() throws RecognitionException {

		ForrestTree t = (ForrestTree)input.LT(1);

		try {
			// ForrestEncoder.g:52:2: ( ^( VAR IDENTIFIER ( CHAR | BOOL | INT ) ) | ^( CONSTANT IDENTIFIER expr ) )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==VAR) ) {
				alt3=1;
			}
			else if ( (LA3_0==CONSTANT) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// ForrestEncoder.g:52:4: ^( VAR IDENTIFIER ( CHAR | BOOL | INT ) )
					{
					match(input,VAR,FOLLOW_VAR_in_declaration107); 
					match(input, Token.DOWN, null); 
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration109); 
					if ( (input.LA(1) >= BOOL && input.LA(1) <= CHAR)||input.LA(1)==INT ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					match(input, Token.UP, null); 


								fw.writeDeclarationVar(t);
							
					}
					break;
				case 2 :
					// ForrestEncoder.g:56:4: ^( CONSTANT IDENTIFIER expr )
					{
					match(input,CONSTANT,FOLLOW_CONSTANT_in_declaration128); 
					match(input, Token.DOWN, null); 
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration130); 
					pushFollow(FOLLOW_expr_in_declaration132);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 


								fw.writeDeclarationConstant(t);
							
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
	// ForrestEncoder.g:62:1: expr : ( ^( BECOMES id= IDENTIFIER expr ) | ^( EXPR_WHILE while_comp do_comp ) | ^( EXPR_IF if_comp then_comp ( else_comp )? ) | ^( ( LOGOR | LOGAND | GREATER | SMALLER | GREATEREQ | SMALLEREQ | EQUALS | NOTEQUALS | PLUS | MINUS | TIMES | DIVIDE | MODULO ) expr expr ) | ^( ( POSITIVE | NEGATIVE | NOT ) expr ) | ^( COMPOUND program_lines ) | IDENTIFIER | NUMBER | ( TRUE | FALSE ) | CHARACTER | read | print );
	public final void expr() throws RecognitionException {
		ForrestTree id=null;


		ForrestTree t = (ForrestTree)input.LT(1);

		try {
			// ForrestEncoder.g:66:2: ( ^( BECOMES id= IDENTIFIER expr ) | ^( EXPR_WHILE while_comp do_comp ) | ^( EXPR_IF if_comp then_comp ( else_comp )? ) | ^( ( LOGOR | LOGAND | GREATER | SMALLER | GREATEREQ | SMALLEREQ | EQUALS | NOTEQUALS | PLUS | MINUS | TIMES | DIVIDE | MODULO ) expr expr ) | ^( ( POSITIVE | NEGATIVE | NOT ) expr ) | ^( COMPOUND program_lines ) | IDENTIFIER | NUMBER | ( TRUE | FALSE ) | CHARACTER | read | print )
			int alt5=12;
			switch ( input.LA(1) ) {
			case BECOMES:
				{
				alt5=1;
				}
				break;
			case EXPR_WHILE:
				{
				alt5=2;
				}
				break;
			case EXPR_IF:
				{
				alt5=3;
				}
				break;
			case DIVIDE:
			case EQUALS:
			case GREATER:
			case GREATEREQ:
			case LOGAND:
			case LOGOR:
			case MINUS:
			case MODULO:
			case NOTEQUALS:
			case PLUS:
			case SMALLER:
			case SMALLEREQ:
			case TIMES:
				{
				alt5=4;
				}
				break;
			case NEGATIVE:
			case NOT:
			case POSITIVE:
				{
				alt5=5;
				}
				break;
			case COMPOUND:
				{
				alt5=6;
				}
				break;
			case IDENTIFIER:
				{
				alt5=7;
				}
				break;
			case NUMBER:
				{
				alt5=8;
				}
				break;
			case FALSE:
			case TRUE:
				{
				alt5=9;
				}
				break;
			case CHARACTER:
				{
				alt5=10;
				}
				break;
			case READ:
				{
				alt5=11;
				}
				break;
			case PRINT:
				{
				alt5=12;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// ForrestEncoder.g:66:5: ^( BECOMES id= IDENTIFIER expr )
					{
					match(input,BECOMES,FOLLOW_BECOMES_in_expr156); 
					match(input, Token.DOWN, null); 
					id=(ForrestTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expr160); 
					pushFollow(FOLLOW_expr_in_expr162);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 


								fw.writeBecomes(t);
							
					}
					break;
				case 2 :
					// ForrestEncoder.g:70:4: ^( EXPR_WHILE while_comp do_comp )
					{

								int lWhile = fw.getFreeWhile();
								fw.writeWhileStart(lWhile);
							
					match(input,EXPR_WHILE,FOLLOW_EXPR_WHILE_in_expr177); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_while_comp_in_expr179);
					while_comp();
					state._fsp--;


								fw.writeWhileCheck(lWhile);
							
					pushFollow(FOLLOW_do_comp_in_expr189);
					do_comp();
					state._fsp--;

					match(input, Token.UP, null); 


								fw.writeWhileFinally(lWhile);
							
					}
					break;
				case 3 :
					// ForrestEncoder.g:82:4: ^( EXPR_IF if_comp then_comp ( else_comp )? )
					{

								boolean hasElse = false;
								int lIf = fw.getFreeIf();
								fw.writeIfStart();
							
					match(input,EXPR_IF,FOLLOW_EXPR_IF_in_expr204); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_if_comp_in_expr206);
					if_comp();
					state._fsp--;


								fw.writeIfCheck(lIf);
							
					pushFollow(FOLLOW_then_comp_in_expr215);
					then_comp();
					state._fsp--;


								fw.writeIfAfterThen();
							
					// ForrestEncoder.g:95:3: ( else_comp )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==ELSE) ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// ForrestEncoder.g:96:3: else_comp
							{

										hasElse = true;
										fw.writeIfBeforeElse(lIf);
									
							pushFollow(FOLLOW_else_comp_in_expr233);
							else_comp();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 


								if (!hasElse) {
									fw.writeIfFalse(lIf);
								} else {
									fw.writeIfFinally(lIf);
								}
							
					}
					break;
				case 4 :
					// ForrestEncoder.g:108:4: ^( ( LOGOR | LOGAND | GREATER | SMALLER | GREATEREQ | SMALLEREQ | EQUALS | NOTEQUALS | PLUS | MINUS | TIMES | DIVIDE | MODULO ) expr expr )
					{
					if ( input.LA(1)==DIVIDE||input.LA(1)==EQUALS||(input.LA(1) >= GREATER && input.LA(1) <= GREATEREQ)||(input.LA(1) >= LOGAND && input.LA(1) <= LOGOR)||(input.LA(1) >= MINUS && input.LA(1) <= MODULO)||input.LA(1)==NOTEQUALS||input.LA(1)==PLUS||(input.LA(1) >= SMALLER && input.LA(1) <= SMALLEREQ)||input.LA(1)==TIMES ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr302);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr304);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					fw.writeBinaryOp(t);
					}
					break;
				case 5 :
					// ForrestEncoder.g:111:4: ^( ( POSITIVE | NEGATIVE | NOT ) expr )
					{
					if ( (input.LA(1) >= NEGATIVE && input.LA(1) <= NOT)||input.LA(1)==POSITIVE ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr327);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					fw.writeUnaryOp(t);
					}
					break;
				case 6 :
					// ForrestEncoder.g:113:6: ^( COMPOUND program_lines )
					{
					match(input,COMPOUND,FOLLOW_COMPOUND_in_expr340); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						pushFollow(FOLLOW_program_lines_in_expr342);
						program_lines();
						state._fsp--;

						match(input, Token.UP, null); 
					}

					}
					break;
				case 7 :
					// ForrestEncoder.g:114:4: IDENTIFIER
					{
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expr348); 

								fw.writeIdentifier(t);
							
					}
					break;
				case 8 :
					// ForrestEncoder.g:118:4: NUMBER
					{
					match(input,NUMBER,FOLLOW_NUMBER_in_expr357); 
					fw.writeNumber(t);
					}
					break;
				case 9 :
					// ForrestEncoder.g:119:4: ( TRUE | FALSE )
					{
					if ( input.LA(1)==FALSE||input.LA(1)==TRUE ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					fw.writeBoolean(t);
					}
					break;
				case 10 :
					// ForrestEncoder.g:120:4: CHARACTER
					{
					match(input,CHARACTER,FOLLOW_CHARACTER_in_expr377); 
					fw.writeCharacter(t);
					}
					break;
				case 11 :
					// ForrestEncoder.g:121:4: read
					{
					pushFollow(FOLLOW_read_in_expr384);
					read();
					state._fsp--;

					}
					break;
				case 12 :
					// ForrestEncoder.g:122:4: print
					{
					pushFollow(FOLLOW_print_in_expr389);
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
	// ForrestEncoder.g:125:1: while_comp : ^( WHILE program_lines ) ;
	public final void while_comp() throws RecognitionException {
		try {
			// ForrestEncoder.g:126:2: ( ^( WHILE program_lines ) )
			// ForrestEncoder.g:126:4: ^( WHILE program_lines )
			{
			match(input,WHILE,FOLLOW_WHILE_in_while_comp401); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				pushFollow(FOLLOW_program_lines_in_while_comp403);
				program_lines();
				state._fsp--;

				match(input, Token.UP, null); 
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
	// $ANTLR end "while_comp"



	// $ANTLR start "do_comp"
	// ForrestEncoder.g:129:1: do_comp : ^( DO program_lines ) ;
	public final void do_comp() throws RecognitionException {
		try {
			// ForrestEncoder.g:130:2: ( ^( DO program_lines ) )
			// ForrestEncoder.g:130:4: ^( DO program_lines )
			{
			match(input,DO,FOLLOW_DO_in_do_comp416); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				pushFollow(FOLLOW_program_lines_in_do_comp418);
				program_lines();
				state._fsp--;

				match(input, Token.UP, null); 
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
	// $ANTLR end "do_comp"



	// $ANTLR start "if_comp"
	// ForrestEncoder.g:133:1: if_comp : ^( IF program_lines ) ;
	public final void if_comp() throws RecognitionException {
		try {
			// ForrestEncoder.g:134:2: ( ^( IF program_lines ) )
			// ForrestEncoder.g:134:4: ^( IF program_lines )
			{
			match(input,IF,FOLLOW_IF_in_if_comp431); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				pushFollow(FOLLOW_program_lines_in_if_comp433);
				program_lines();
				state._fsp--;

				match(input, Token.UP, null); 
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
	// $ANTLR end "if_comp"



	// $ANTLR start "then_comp"
	// ForrestEncoder.g:137:1: then_comp : ^( THEN program_lines ) ;
	public final void then_comp() throws RecognitionException {
		try {
			// ForrestEncoder.g:138:2: ( ^( THEN program_lines ) )
			// ForrestEncoder.g:138:4: ^( THEN program_lines )
			{
			match(input,THEN,FOLLOW_THEN_in_then_comp446); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				pushFollow(FOLLOW_program_lines_in_then_comp448);
				program_lines();
				state._fsp--;

				match(input, Token.UP, null); 
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
	// $ANTLR end "then_comp"



	// $ANTLR start "else_comp"
	// ForrestEncoder.g:141:1: else_comp : ^( ELSE program_lines ) ;
	public final void else_comp() throws RecognitionException {
		try {
			// ForrestEncoder.g:142:2: ( ^( ELSE program_lines ) )
			// ForrestEncoder.g:142:4: ^( ELSE program_lines )
			{
			match(input,ELSE,FOLLOW_ELSE_in_else_comp461); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				pushFollow(FOLLOW_program_lines_in_else_comp463);
				program_lines();
				state._fsp--;

				match(input, Token.UP, null); 
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
	// $ANTLR end "else_comp"



	// $ANTLR start "read"
	// ForrestEncoder.g:145:1: read : ^( READ (id= IDENTIFIER )+ ) ;
	public final void read() throws RecognitionException {
		ForrestTree id=null;


		ForrestTree t = (ForrestTree)input.LT(1);

		try {
			// ForrestEncoder.g:149:2: ( ^( READ (id= IDENTIFIER )+ ) )
			// ForrestEncoder.g:149:4: ^( READ (id= IDENTIFIER )+ )
			{
			match(input,READ,FOLLOW_READ_in_read482); 
			match(input, Token.DOWN, null); 
			// ForrestEncoder.g:149:11: (id= IDENTIFIER )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==IDENTIFIER) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// ForrestEncoder.g:149:12: id= IDENTIFIER
					{
					id=(ForrestTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_read487); 
					}
					break;

				default :
					if ( cnt6 >= 1 ) break loop6;
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
			}

			match(input, Token.UP, null); 

			fw.writeRead(t);
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
	// ForrestEncoder.g:153:1: print : ^( PRINT ( expr )+ ) ;
	public final void print() throws RecognitionException {

		ForrestTree t = (ForrestTree)input.LT(1);

		try {
			// ForrestEncoder.g:157:2: ( ^( PRINT ( expr )+ ) )
			// ForrestEncoder.g:157:4: ^( PRINT ( expr )+ )
			{
			match(input,PRINT,FOLLOW_PRINT_in_print513); 
			match(input, Token.DOWN, null); 
			// ForrestEncoder.g:157:12: ( expr )+
			int cnt7=0;
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==BECOMES||LA7_0==CHARACTER||LA7_0==COMPOUND||LA7_0==DIVIDE||(LA7_0 >= EQUALS && LA7_0 <= IDENTIFIER)||(LA7_0 >= LOGAND && LA7_0 <= LOGOR)||(LA7_0 >= MINUS && LA7_0 <= PRINT)||LA7_0==READ||(LA7_0 >= SMALLER && LA7_0 <= SMALLEREQ)||(LA7_0 >= TIMES && LA7_0 <= TRUE)) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// ForrestEncoder.g:157:13: expr
					{
					pushFollow(FOLLOW_expr_in_print516);
					expr();
					state._fsp--;

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

			fw.writePrint(t);
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



	public static final BitSet FOLLOW_PROGRAM_in_forrest56 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_program_lines_in_forrest58 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_declaration_in_program_lines76 = new BitSet(new long[]{0x00B327FCC3F85890L});
	public static final BitSet FOLLOW_expr_in_program_lines80 = new BitSet(new long[]{0x00B327FCC3F85892L});
	public static final BitSet FOLLOW_VAR_in_declaration107 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration109 = new BitSet(new long[]{0x0000000008000060L});
	public static final BitSet FOLLOW_set_in_declaration111 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CONSTANT_in_declaration128 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration130 = new BitSet(new long[]{0x003327FCC3F84890L});
	public static final BitSet FOLLOW_expr_in_declaration132 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BECOMES_in_expr156 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_expr160 = new BitSet(new long[]{0x003327FCC3F84890L});
	public static final BitSet FOLLOW_expr_in_expr162 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXPR_WHILE_in_expr177 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_while_comp_in_expr179 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_do_comp_in_expr189 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXPR_IF_in_expr204 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_if_comp_in_expr206 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_then_comp_in_expr215 = new BitSet(new long[]{0x0000000000010008L});
	public static final BitSet FOLLOW_else_comp_in_expr233 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_set_in_expr247 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr302 = new BitSet(new long[]{0x003327FCC3F84890L});
	public static final BitSet FOLLOW_expr_in_expr304 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_set_in_expr315 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr327 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_COMPOUND_in_expr340 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_program_lines_in_expr342 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IDENTIFIER_in_expr348 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_expr357 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_expr364 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTER_in_expr377 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_in_expr384 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_in_expr389 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_while_comp401 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_program_lines_in_while_comp403 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DO_in_do_comp416 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_program_lines_in_do_comp418 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IF_in_if_comp431 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_program_lines_in_if_comp433 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_THEN_in_then_comp446 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_program_lines_in_then_comp448 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ELSE_in_else_comp461 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_program_lines_in_else_comp463 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_READ_in_read482 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_read487 = new BitSet(new long[]{0x0000000002000008L});
	public static final BitSet FOLLOW_PRINT_in_print513 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_print516 = new BitSet(new long[]{0x003327FCC3F84898L});
}
