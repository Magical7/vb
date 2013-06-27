// $ANTLR 3.5 ForrestEncoder.g 2013-06-27 12:19:39

	package forrest.main;
	import fire.ForrestFireException;


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
		"ELSE", "ENDIF", "EQUALS", "EXPR_IF", "FALSE", "GREATER", "GREATEREQ", 
		"IDENTIFIER", "IF", "INT", "LCURLY", "LETTER", "LOGAND", "LOGOR", "LOWER", 
		"LPAREN", "MINUS", "MODULO", "NEGATIVE", "NOT", "NOTEQUALS", "NUMBER", 
		"PLUS", "POSITIVE", "PRINT", "PROGRAM", "RCURLY", "READ", "RPAREN", "SEMICOLON", 
		"SMALLER", "SMALLEREQ", "SQUOTE", "THEN", "TIMES", "TRUE", "UPPER", "VAR", 
		"WS"
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
	public static final int ELSE=15;
	public static final int ENDIF=16;
	public static final int EQUALS=17;
	public static final int EXPR_IF=18;
	public static final int FALSE=19;
	public static final int GREATER=20;
	public static final int GREATEREQ=21;
	public static final int IDENTIFIER=22;
	public static final int IF=23;
	public static final int INT=24;
	public static final int LCURLY=25;
	public static final int LETTER=26;
	public static final int LOGAND=27;
	public static final int LOGOR=28;
	public static final int LOWER=29;
	public static final int LPAREN=30;
	public static final int MINUS=31;
	public static final int MODULO=32;
	public static final int NEGATIVE=33;
	public static final int NOT=34;
	public static final int NOTEQUALS=35;
	public static final int NUMBER=36;
	public static final int PLUS=37;
	public static final int POSITIVE=38;
	public static final int PRINT=39;
	public static final int PROGRAM=40;
	public static final int RCURLY=41;
	public static final int READ=42;
	public static final int RPAREN=43;
	public static final int SEMICOLON=44;
	public static final int SMALLER=45;
	public static final int SMALLEREQ=46;
	public static final int SQUOTE=47;
	public static final int THEN=48;
	public static final int TIMES=49;
	public static final int TRUE=50;
	public static final int UPPER=51;
	public static final int VAR=52;
	public static final int WS=53;

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
		private void setFile(String fileLocation){
			fw.setFile(fileLocation);
		}



	// $ANTLR start "forrest"
	// ForrestEncoder.g:31:1: forrest : ^( PROGRAM program_lines ) ;
	public final void forrest() throws RecognitionException {

		fw.startProgram();

		try {
			// ForrestEncoder.g:35:2: ( ^( PROGRAM program_lines ) )
			// ForrestEncoder.g:35:4: ^( PROGRAM program_lines )
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
	// ForrestEncoder.g:41:1: program_lines : ( ( declaration )* expr )* ;
	public final void program_lines() throws RecognitionException {

		fw.openScope();

		try {
			// ForrestEncoder.g:45:2: ( ( ( declaration )* expr )* )
			// ForrestEncoder.g:45:4: ( ( declaration )* expr )*
			{
			// ForrestEncoder.g:45:4: ( ( declaration )* expr )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==BECOMES||LA2_0==CHARACTER||(LA2_0 >= COMPOUND && LA2_0 <= CONSTANT)||LA2_0==DIVIDE||(LA2_0 >= EQUALS && LA2_0 <= IDENTIFIER)||(LA2_0 >= LOGAND && LA2_0 <= LOGOR)||(LA2_0 >= MINUS && LA2_0 <= PRINT)||LA2_0==READ||(LA2_0 >= SMALLER && LA2_0 <= SMALLEREQ)||(LA2_0 >= TIMES && LA2_0 <= TRUE)||LA2_0==VAR) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// ForrestEncoder.g:45:5: ( declaration )* expr
					{
					// ForrestEncoder.g:45:5: ( declaration )*
					loop1:
					while (true) {
						int alt1=2;
						int LA1_0 = input.LA(1);
						if ( (LA1_0==CONSTANT||LA1_0==VAR) ) {
							alt1=1;
						}

						switch (alt1) {
						case 1 :
							// ForrestEncoder.g:45:6: declaration
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

					fw.writeLine();
					}
					break;

				default :
					break loop2;
				}
			}


					fw.closeScope();
				
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
	// ForrestEncoder.g:51:1: declaration : ( ^( VAR IDENTIFIER ( CHAR | BOOL | INT ) ) | ^( CONSTANT IDENTIFIER expr ) );
	public final void declaration() throws RecognitionException {

		ForrestTree t = (ForrestTree)input.LT(1);

		try {
			// ForrestEncoder.g:55:2: ( ^( VAR IDENTIFIER ( CHAR | BOOL | INT ) ) | ^( CONSTANT IDENTIFIER expr ) )
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
					// ForrestEncoder.g:55:4: ^( VAR IDENTIFIER ( CHAR | BOOL | INT ) )
					{
					match(input,VAR,FOLLOW_VAR_in_declaration111); 
					match(input, Token.DOWN, null); 
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration113); 
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
					// ForrestEncoder.g:59:4: ^( CONSTANT IDENTIFIER expr )
					{
					match(input,CONSTANT,FOLLOW_CONSTANT_in_declaration132); 
					match(input, Token.DOWN, null); 
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration134); 
					pushFollow(FOLLOW_expr_in_declaration136);
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
	// ForrestEncoder.g:65:1: expr : ( ^( BECOMES id= IDENTIFIER expr ) | ^( EXPR_IF if_comp then_comp ( else_comp )? ) | ^( ( LOGOR | LOGAND | GREATER | SMALLER | GREATEREQ | SMALLEREQ | EQUALS | NOTEQUALS | PLUS | MINUS | TIMES | DIVIDE | MODULO ) expr expr ) | ^( ( POSITIVE | NEGATIVE | NOT ) expr ) | ^( COMPOUND program_lines ) | IDENTIFIER | NUMBER | ( TRUE | FALSE ) | CHARACTER | read | print );
	public final void expr() throws RecognitionException {
		ForrestTree id=null;


		ForrestTree t = (ForrestTree)input.LT(1);

		try {
			// ForrestEncoder.g:69:2: ( ^( BECOMES id= IDENTIFIER expr ) | ^( EXPR_IF if_comp then_comp ( else_comp )? ) | ^( ( LOGOR | LOGAND | GREATER | SMALLER | GREATEREQ | SMALLEREQ | EQUALS | NOTEQUALS | PLUS | MINUS | TIMES | DIVIDE | MODULO ) expr expr ) | ^( ( POSITIVE | NEGATIVE | NOT ) expr ) | ^( COMPOUND program_lines ) | IDENTIFIER | NUMBER | ( TRUE | FALSE ) | CHARACTER | read | print )
			int alt5=11;
			switch ( input.LA(1) ) {
			case BECOMES:
				{
				alt5=1;
				}
				break;
			case EXPR_IF:
				{
				alt5=2;
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
				alt5=3;
				}
				break;
			case NEGATIVE:
			case NOT:
			case POSITIVE:
				{
				alt5=4;
				}
				break;
			case COMPOUND:
				{
				alt5=5;
				}
				break;
			case IDENTIFIER:
				{
				alt5=6;
				}
				break;
			case NUMBER:
				{
				alt5=7;
				}
				break;
			case FALSE:
			case TRUE:
				{
				alt5=8;
				}
				break;
			case CHARACTER:
				{
				alt5=9;
				}
				break;
			case READ:
				{
				alt5=10;
				}
				break;
			case PRINT:
				{
				alt5=11;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// ForrestEncoder.g:69:5: ^( BECOMES id= IDENTIFIER expr )
					{
					match(input,BECOMES,FOLLOW_BECOMES_in_expr160); 
					match(input, Token.DOWN, null); 
					id=(ForrestTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expr164); 
					pushFollow(FOLLOW_expr_in_expr166);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 


								fw.writeBecomes(t);
							
					}
					break;
				case 2 :
					// ForrestEncoder.g:73:4: ^( EXPR_IF if_comp then_comp ( else_comp )? )
					{

								boolean hasElse = false;
								int lIf = fw.getFreeIf();
							
					match(input,EXPR_IF,FOLLOW_EXPR_IF_in_expr181); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_if_comp_in_expr183);
					if_comp();
					state._fsp--;

					fw.writeIf(lIf);
					pushFollow(FOLLOW_then_comp_in_expr193);
					then_comp();
					state._fsp--;

					// ForrestEncoder.g:79:13: ( else_comp )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==ELSE) ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// ForrestEncoder.g:80:3: else_comp
							{

										hasElse = true;
										fw.writeElse(lIf);
									
							pushFollow(FOLLOW_else_comp_in_expr204);
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
				case 3 :
					// ForrestEncoder.g:92:4: ^( ( LOGOR | LOGAND | GREATER | SMALLER | GREATEREQ | SMALLEREQ | EQUALS | NOTEQUALS | PLUS | MINUS | TIMES | DIVIDE | MODULO ) expr expr )
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
					pushFollow(FOLLOW_expr_in_expr273);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr275);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					fw.writeBinaryOp(t);
					}
					break;
				case 4 :
					// ForrestEncoder.g:95:4: ^( ( POSITIVE | NEGATIVE | NOT ) expr )
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
					pushFollow(FOLLOW_expr_in_expr298);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					fw.writeUnaryOp(t);
					}
					break;
				case 5 :
					// ForrestEncoder.g:97:6: ^( COMPOUND program_lines )
					{
					match(input,COMPOUND,FOLLOW_COMPOUND_in_expr311); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						pushFollow(FOLLOW_program_lines_in_expr313);
						program_lines();
						state._fsp--;

						match(input, Token.UP, null); 
					}

					}
					break;
				case 6 :
					// ForrestEncoder.g:98:4: IDENTIFIER
					{
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expr319); 

								fw.writeIdentifier(t);
							
					}
					break;
				case 7 :
					// ForrestEncoder.g:102:4: NUMBER
					{
					match(input,NUMBER,FOLLOW_NUMBER_in_expr328); 
					fw.writeNumber(t);
					}
					break;
				case 8 :
					// ForrestEncoder.g:103:4: ( TRUE | FALSE )
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
				case 9 :
					// ForrestEncoder.g:104:4: CHARACTER
					{
					match(input,CHARACTER,FOLLOW_CHARACTER_in_expr348); 
					fw.writeCharacter(t);
					}
					break;
				case 10 :
					// ForrestEncoder.g:105:4: read
					{
					pushFollow(FOLLOW_read_in_expr355);
					read();
					state._fsp--;

					}
					break;
				case 11 :
					// ForrestEncoder.g:106:4: print
					{
					pushFollow(FOLLOW_print_in_expr360);
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



	// $ANTLR start "if_comp"
	// ForrestEncoder.g:109:1: if_comp : ^( IF program_lines ) ;
	public final void if_comp() throws RecognitionException {
		try {
			// ForrestEncoder.g:110:2: ( ^( IF program_lines ) )
			// ForrestEncoder.g:110:4: ^( IF program_lines )
			{
			match(input,IF,FOLLOW_IF_in_if_comp372); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				pushFollow(FOLLOW_program_lines_in_if_comp374);
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
	// ForrestEncoder.g:113:1: then_comp : ^( THEN program_lines ) ;
	public final void then_comp() throws RecognitionException {
		try {
			// ForrestEncoder.g:114:2: ( ^( THEN program_lines ) )
			// ForrestEncoder.g:114:4: ^( THEN program_lines )
			{
			match(input,THEN,FOLLOW_THEN_in_then_comp387); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				pushFollow(FOLLOW_program_lines_in_then_comp389);
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
	// ForrestEncoder.g:117:1: else_comp : ^( ELSE program_lines ) ;
	public final void else_comp() throws RecognitionException {
		try {
			// ForrestEncoder.g:118:2: ( ^( ELSE program_lines ) )
			// ForrestEncoder.g:118:4: ^( ELSE program_lines )
			{
			match(input,ELSE,FOLLOW_ELSE_in_else_comp402); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				pushFollow(FOLLOW_program_lines_in_else_comp404);
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
	// ForrestEncoder.g:121:1: read : ^( READ (id= IDENTIFIER )+ ) ;
	public final void read() throws RecognitionException {
		ForrestTree id=null;


		ForrestTree t = (ForrestTree)input.LT(1);

		try {
			// ForrestEncoder.g:125:2: ( ^( READ (id= IDENTIFIER )+ ) )
			// ForrestEncoder.g:125:4: ^( READ (id= IDENTIFIER )+ )
			{
			match(input,READ,FOLLOW_READ_in_read423); 
			match(input, Token.DOWN, null); 
			// ForrestEncoder.g:125:11: (id= IDENTIFIER )+
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
					// ForrestEncoder.g:125:12: id= IDENTIFIER
					{
					id=(ForrestTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_read428); 
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
	// ForrestEncoder.g:129:1: print : ^( PRINT ( expr )+ ) ;
	public final void print() throws RecognitionException {

		ForrestTree t = (ForrestTree)input.LT(1);

		try {
			// ForrestEncoder.g:133:2: ( ^( PRINT ( expr )+ ) )
			// ForrestEncoder.g:133:4: ^( PRINT ( expr )+ )
			{
			match(input,PRINT,FOLLOW_PRINT_in_print454); 
			match(input, Token.DOWN, null); 
			// ForrestEncoder.g:133:12: ( expr )+
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
					// ForrestEncoder.g:133:13: expr
					{
					pushFollow(FOLLOW_expr_in_print457);
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
	public static final BitSet FOLLOW_declaration_in_program_lines81 = new BitSet(new long[]{0x001664FF987E5890L});
	public static final BitSet FOLLOW_expr_in_program_lines85 = new BitSet(new long[]{0x001664FF987E5892L});
	public static final BitSet FOLLOW_VAR_in_declaration111 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration113 = new BitSet(new long[]{0x0000000001000060L});
	public static final BitSet FOLLOW_set_in_declaration115 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CONSTANT_in_declaration132 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration134 = new BitSet(new long[]{0x000664FF987E4890L});
	public static final BitSet FOLLOW_expr_in_declaration136 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BECOMES_in_expr160 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_expr164 = new BitSet(new long[]{0x000664FF987E4890L});
	public static final BitSet FOLLOW_expr_in_expr166 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXPR_IF_in_expr181 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_if_comp_in_expr183 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_then_comp_in_expr193 = new BitSet(new long[]{0x0000000000008008L});
	public static final BitSet FOLLOW_else_comp_in_expr204 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_set_in_expr218 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr273 = new BitSet(new long[]{0x000664FF987E4890L});
	public static final BitSet FOLLOW_expr_in_expr275 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_set_in_expr286 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr298 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_COMPOUND_in_expr311 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_program_lines_in_expr313 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IDENTIFIER_in_expr319 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_expr328 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_expr335 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTER_in_expr348 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_in_expr355 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_in_expr360 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_if_comp372 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_program_lines_in_if_comp374 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_THEN_in_then_comp387 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_program_lines_in_then_comp389 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ELSE_in_else_comp402 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_program_lines_in_else_comp404 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_READ_in_read423 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_read428 = new BitSet(new long[]{0x0000000000400008L});
	public static final BitSet FOLLOW_PRINT_in_print454 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_print457 = new BitSet(new long[]{0x000664FF987E4898L});
}
