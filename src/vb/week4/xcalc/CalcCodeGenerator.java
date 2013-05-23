// $ANTLR 3.5 CalcCodeGenerator.g 2013-05-23 17:21:42

package vb.week4.xcalc;
import java.util.Map;
import java.util.HashMap;
import TAM.*;
import Triangle.CodeGenerator.*;
import java.io.PrintStream;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class CalcCodeGenerator extends TreeParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "BECOMES", "COLON", "COMMA", "COMMENT", 
		"DIGIT", "DO", "ELSE", "EQUALS", "GREATER", "GREATEREQ", "IDENTIFIER", 
		"IF", "INTEGER", "LETTER", "LOWER", "LPAREN", "MINUS", "NOTEQUALS", "NUMBER", 
		"PLUS", "PRINT", "PROGRAM", "QUOTIENT", "RPAREN", "SEMICOLON", "SMALLER", 
		"SMALLEREQ", "SWAP", "THEN", "TIMES", "UPPER", "VAR", "WHILE", "WS"
	};
	public static final int EOF=-1;
	public static final int BECOMES=4;
	public static final int COLON=5;
	public static final int COMMA=6;
	public static final int COMMENT=7;
	public static final int DIGIT=8;
	public static final int DO=9;
	public static final int ELSE=10;
	public static final int EQUALS=11;
	public static final int GREATER=12;
	public static final int GREATEREQ=13;
	public static final int IDENTIFIER=14;
	public static final int IF=15;
	public static final int INTEGER=16;
	public static final int LETTER=17;
	public static final int LOWER=18;
	public static final int LPAREN=19;
	public static final int MINUS=20;
	public static final int NOTEQUALS=21;
	public static final int NUMBER=22;
	public static final int PLUS=23;
	public static final int PRINT=24;
	public static final int PROGRAM=25;
	public static final int QUOTIENT=26;
	public static final int RPAREN=27;
	public static final int SEMICOLON=28;
	public static final int SMALLER=29;
	public static final int SMALLEREQ=30;
	public static final int SWAP=31;
	public static final int THEN=32;
	public static final int TIMES=33;
	public static final int UPPER=34;
	public static final int VAR=35;
	public static final int WHILE=36;
	public static final int WS=37;

	// delegates
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators


	public CalcCodeGenerator(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public CalcCodeGenerator(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return CalcCodeGenerator.tokenNames; }
	@Override public String getGrammarFileName() { return "CalcCodeGenerator.g"; }

	 
	    private Map<String,Integer> store = new HashMap<String,Integer>();
	    private int sp = 0;
	    private int nWhile = 1;
	    private int nIf = 1;
	    private PrintStream out = System.out;  
	    
	    public void setOut(PrintStream out){
	    	this.out = out;
	    }
	    



	// $ANTLR start "program"
	// CalcCodeGenerator.g:44:1: program : ^( PROGRAM ( declaration | statement )+ ) ;
	public final void program() throws RecognitionException {
		try {
			// CalcCodeGenerator.g:45:5: ( ^( PROGRAM ( declaration | statement )+ ) )
			// CalcCodeGenerator.g:45:9: ^( PROGRAM ( declaration | statement )+ )
			{
			match(input,PROGRAM,FOLLOW_PROGRAM_in_program100); 
			match(input, Token.DOWN, null); 
			// CalcCodeGenerator.g:45:19: ( declaration | statement )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=3;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==VAR) ) {
					alt1=1;
				}
				else if ( (LA1_0==BECOMES||LA1_0==DO||LA1_0==PRINT||LA1_0==SWAP) ) {
					alt1=2;
				}

				switch (alt1) {
				case 1 :
					// CalcCodeGenerator.g:45:20: declaration
					{
					pushFollow(FOLLOW_declaration_in_program103);
					declaration();
					state._fsp--;

					}
					break;
				case 2 :
					// CalcCodeGenerator.g:45:34: statement
					{
					pushFollow(FOLLOW_statement_in_program107);
					statement();
					state._fsp--;

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			match(input, Token.UP, null); 


			    		out.println("POP(0) " + sp);
			    		out.println("ERROR: HALT");
			    	
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "program"



	// $ANTLR start "declaration"
	// CalcCodeGenerator.g:52:1: declaration : ^( VAR id= IDENTIFIER type ) ;
	public final void declaration() throws RecognitionException {
		CommonTree id=null;

		 out.println("PUSH 1"); 
		try {
			// CalcCodeGenerator.g:54:5: ( ^( VAR id= IDENTIFIER type ) )
			// CalcCodeGenerator.g:54:9: ^( VAR id= IDENTIFIER type )
			{
			match(input,VAR,FOLLOW_VAR_in_declaration147); 
			match(input, Token.DOWN, null); 
			id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration151); 
			pushFollow(FOLLOW_type_in_declaration153);
			type();
			state._fsp--;

			match(input, Token.UP, null); 

			 
				            store.put((id!=null?id.getText():null), sp);
				            sp++;
			            
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "declaration"



	// $ANTLR start "statement"
	// CalcCodeGenerator.g:61:1: statement : ( assignment | dowhileStatement | ^( PRINT v= expr ) | ^( SWAP id1= IDENTIFIER id2= IDENTIFIER ) );
	public final void statement() throws RecognitionException {
		CommonTree id1=null;
		CommonTree id2=null;

		try {
			// CalcCodeGenerator.g:62:5: ( assignment | dowhileStatement | ^( PRINT v= expr ) | ^( SWAP id1= IDENTIFIER id2= IDENTIFIER ) )
			int alt2=4;
			switch ( input.LA(1) ) {
			case BECOMES:
				{
				alt2=1;
				}
				break;
			case DO:
				{
				alt2=2;
				}
				break;
			case PRINT:
				{
				alt2=3;
				}
				break;
			case SWAP:
				{
				alt2=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// CalcCodeGenerator.g:62:9: assignment
					{
					pushFollow(FOLLOW_assignment_in_statement189);
					assignment();
					state._fsp--;

					}
					break;
				case 2 :
					// CalcCodeGenerator.g:63:7: dowhileStatement
					{
					pushFollow(FOLLOW_dowhileStatement_in_statement197);
					dowhileStatement();
					state._fsp--;

					}
					break;
				case 3 :
					// CalcCodeGenerator.g:64:9: ^( PRINT v= expr )
					{
					match(input,PRINT,FOLLOW_PRINT_in_statement208); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_statement212);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					 
					            	out.println("CALL putint");
					            	out.println("CALL puteol");
					            
					}
					break;
				case 4 :
					// CalcCodeGenerator.g:69:7: ^( SWAP id1= IDENTIFIER id2= IDENTIFIER )
					{
					match(input,SWAP,FOLLOW_SWAP_in_statement236); 
					match(input, Token.DOWN, null); 
					id1=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement240); 
					id2=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement244); 
					match(input, Token.UP, null); 

					 	int val = store.get((id1!=null?id1.getText():null));
					    			store.put((id1!=null?id1.getText():null), store.get((id2!=null?id2.getText():null)));
					    			store.put((id2!=null?id2.getText():null), val);
					    		
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "statement"



	// $ANTLR start "dowhileStatement"
	// CalcCodeGenerator.g:76:1: dowhileStatement : ^( DO statements WHILE v= expr_if ) ;
	public final void dowhileStatement() throws RecognitionException {
		 int lWhile = nWhile; out.print("LWHILE" + lWhile + ": "); nWhile++; 
		try {
			// CalcCodeGenerator.g:78:2: ( ^( DO statements WHILE v= expr_if ) )
			// CalcCodeGenerator.g:78:4: ^( DO statements WHILE v= expr_if )
			{
			match(input,DO,FOLLOW_DO_in_dowhileStatement277); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_statements_in_dowhileStatement279);
			statements();
			state._fsp--;

			match(input,WHILE,FOLLOW_WHILE_in_dowhileStatement281); 
			pushFollow(FOLLOW_expr_if_in_dowhileStatement285);
			expr_if();
			state._fsp--;

			match(input, Token.UP, null); 


						out.println("LOADL 0");
						out.println("LOADL 1");
						out.println("CALL eq");
						out.println("JUMPIF(0) LWHILE" + lWhile + "[CB]"); 
					
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "dowhileStatement"



	// $ANTLR start "statements"
	// CalcCodeGenerator.g:87:1: statements : ( statement )+ ;
	public final void statements() throws RecognitionException {
		try {
			// CalcCodeGenerator.g:88:2: ( ( statement )+ )
			// CalcCodeGenerator.g:88:4: ( statement )+
			{
			// CalcCodeGenerator.g:88:4: ( statement )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==BECOMES||LA3_0==DO||LA3_0==PRINT||LA3_0==SWAP) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// CalcCodeGenerator.g:88:5: statement
					{
					pushFollow(FOLLOW_statement_in_statements303);
					statement();
					state._fsp--;

					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "statements"



	// $ANTLR start "assignment"
	// CalcCodeGenerator.g:91:1: assignment : ^( BECOMES id= IDENTIFIER v= expr ) ;
	public final void assignment() throws RecognitionException {
		CommonTree id=null;

		try {
			// CalcCodeGenerator.g:92:2: ( ^( BECOMES id= IDENTIFIER v= expr ) )
			// CalcCodeGenerator.g:92:4: ^( BECOMES id= IDENTIFIER v= expr )
			{
			match(input,BECOMES,FOLLOW_BECOMES_in_assignment317); 
			match(input, Token.DOWN, null); 
			id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_assignment321); 
			pushFollow(FOLLOW_expr_in_assignment325);
			expr();
			state._fsp--;

			match(input, Token.UP, null); 


			            	out.println("STORE(1) " + store.get((id!=null?id.getText():null)) + "[SB]");
			            
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "assignment"



	// $ANTLR start "expr"
	// CalcCodeGenerator.g:98:1: expr : expr_assign ;
	public final void expr() throws RecognitionException {
		try {
			// CalcCodeGenerator.g:99:2: ( expr_assign )
			// CalcCodeGenerator.g:99:4: expr_assign
			{
			pushFollow(FOLLOW_expr_assign_in_expr358);
			expr_assign();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "expr"



	// $ANTLR start "expr_assign"
	// CalcCodeGenerator.g:102:1: expr_assign : ( ^( BECOMES id= IDENTIFIER ret= expr ) | expr_if );
	public final void expr_assign() throws RecognitionException {
		CommonTree id=null;

		try {
			// CalcCodeGenerator.g:103:2: ( ^( BECOMES id= IDENTIFIER ret= expr ) | expr_if )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==BECOMES) ) {
				alt4=1;
			}
			else if ( ((LA4_0 >= EQUALS && LA4_0 <= IF)||(LA4_0 >= MINUS && LA4_0 <= PLUS)||LA4_0==QUOTIENT||(LA4_0 >= SMALLER && LA4_0 <= SMALLEREQ)||LA4_0==TIMES) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// CalcCodeGenerator.g:103:4: ^( BECOMES id= IDENTIFIER ret= expr )
					{
					match(input,BECOMES,FOLLOW_BECOMES_in_expr_assign371); 
					match(input, Token.DOWN, null); 
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expr_assign375); 
					pushFollow(FOLLOW_expr_in_expr_assign379);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					 
								out.println("STORE(1) " + store.get((id!=null?id.getText():null)) + "[SB]");
								out.println("LOAD(1) " + store.get((id!=null?id.getText():null)) + "[SB]");
							
					}
					break;
				case 2 :
					// CalcCodeGenerator.g:108:4: expr_if
					{
					pushFollow(FOLLOW_expr_if_in_expr_assign390);
					expr_if();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "expr_assign"



	// $ANTLR start "expr_if"
	// CalcCodeGenerator.g:111:1: expr_if : ( ^( IF x= expr y= expr z= expr ) | expr_rel );
	public final void expr_if() throws RecognitionException {
		 int lIf = nIf; nIf++; 
		try {
			// CalcCodeGenerator.g:113:5: ( ^( IF x= expr y= expr z= expr ) | expr_rel )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==IF) ) {
				alt5=1;
			}
			else if ( ((LA5_0 >= EQUALS && LA5_0 <= IDENTIFIER)||(LA5_0 >= MINUS && LA5_0 <= PLUS)||LA5_0==QUOTIENT||(LA5_0 >= SMALLER && LA5_0 <= SMALLEREQ)||LA5_0==TIMES) ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// CalcCodeGenerator.g:113:7: ^( IF x= expr y= expr z= expr )
					{
					match(input,IF,FOLLOW_IF_in_expr_if414); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr_if418);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_if422);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_if426);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 


					    		out.println("LOAD(1) -3[ST]");
					    		out.println("JUMPIF(0) LELSE" + lIf + "[CB]");
					    		out.println("POP(0) 1");
					    		out.println("POP(1) 1");
					    		out.println("JUMP LTHEN" + lIf + "[CB]");
					    		out.println("LELSE"+ lIf + ":  POP(1) 2");
					    		out.print("LTHEN" + lIf + ": ");
					    	
					}
					break;
				case 2 :
					// CalcCodeGenerator.g:123:7: expr_rel
					{
					pushFollow(FOLLOW_expr_rel_in_expr_if442);
					expr_rel();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "expr_if"



	// $ANTLR start "expr_rel"
	// CalcCodeGenerator.g:126:1: expr_rel : ( expr_plus | ^( GREATER x= expr y= expr ) | ^( SMALLER x= expr y= expr ) | ^( GREATEREQ x= expr y= expr ) | ^( SMALLEREQ x= expr y= expr ) | ^( EQUALS x= expr y= expr ) | ^( NOTEQUALS x= expr y= expr ) );
	public final void expr_rel() throws RecognitionException {
		try {
			// CalcCodeGenerator.g:127:5: ( expr_plus | ^( GREATER x= expr y= expr ) | ^( SMALLER x= expr y= expr ) | ^( GREATEREQ x= expr y= expr ) | ^( SMALLEREQ x= expr y= expr ) | ^( EQUALS x= expr y= expr ) | ^( NOTEQUALS x= expr y= expr ) )
			int alt6=7;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
			case MINUS:
			case NUMBER:
			case PLUS:
			case QUOTIENT:
			case TIMES:
				{
				alt6=1;
				}
				break;
			case GREATER:
				{
				alt6=2;
				}
				break;
			case SMALLER:
				{
				alt6=3;
				}
				break;
			case GREATEREQ:
				{
				alt6=4;
				}
				break;
			case SMALLEREQ:
				{
				alt6=5;
				}
				break;
			case EQUALS:
				{
				alt6=6;
				}
				break;
			case NOTEQUALS:
				{
				alt6=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// CalcCodeGenerator.g:127:9: expr_plus
					{
					pushFollow(FOLLOW_expr_plus_in_expr_rel465);
					expr_plus();
					state._fsp--;

					}
					break;
				case 2 :
					// CalcCodeGenerator.g:128:9: ^( GREATER x= expr y= expr )
					{
					match(input,GREATER,FOLLOW_GREATER_in_expr_rel476); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr_rel480);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_rel484);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					 out.println("CALL gt");
					}
					break;
				case 3 :
					// CalcCodeGenerator.g:129:9: ^( SMALLER x= expr y= expr )
					{
					match(input,SMALLER,FOLLOW_SMALLER_in_expr_rel501); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr_rel505);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_rel509);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					 out.println("CALL lt");
					}
					break;
				case 4 :
					// CalcCodeGenerator.g:130:9: ^( GREATEREQ x= expr y= expr )
					{
					match(input,GREATEREQ,FOLLOW_GREATEREQ_in_expr_rel526); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr_rel530);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_rel534);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					 out.println("CALL ge");
					}
					break;
				case 5 :
					// CalcCodeGenerator.g:131:9: ^( SMALLEREQ x= expr y= expr )
					{
					match(input,SMALLEREQ,FOLLOW_SMALLEREQ_in_expr_rel550); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr_rel554);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_rel558);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					 out.println("CALL le");
					}
					break;
				case 6 :
					// CalcCodeGenerator.g:132:9: ^( EQUALS x= expr y= expr )
					{
					match(input,EQUALS,FOLLOW_EQUALS_in_expr_rel574); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr_rel578);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_rel582);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					 out.println("LOADL 1"); out.println("CALL eq");
					}
					break;
				case 7 :
					// CalcCodeGenerator.g:133:9: ^( NOTEQUALS x= expr y= expr )
					{
					match(input,NOTEQUALS,FOLLOW_NOTEQUALS_in_expr_rel599); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr_rel603);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_rel607);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					 out.println("LOADL 1"); out.println("CALL ne");
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "expr_rel"



	// $ANTLR start "expr_plus"
	// CalcCodeGenerator.g:136:1: expr_plus : ( expr_times | ^( PLUS x= expr y= expr ) | ^( MINUS x= expr y= expr ) );
	public final void expr_plus() throws RecognitionException {
		try {
			// CalcCodeGenerator.g:137:5: ( expr_times | ^( PLUS x= expr y= expr ) | ^( MINUS x= expr y= expr ) )
			int alt7=3;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
			case NUMBER:
			case QUOTIENT:
			case TIMES:
				{
				alt7=1;
				}
				break;
			case PLUS:
				{
				alt7=2;
				}
				break;
			case MINUS:
				{
				alt7=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// CalcCodeGenerator.g:137:9: expr_times
					{
					pushFollow(FOLLOW_expr_times_in_expr_plus635);
					expr_times();
					state._fsp--;

					}
					break;
				case 2 :
					// CalcCodeGenerator.g:138:9: ^( PLUS x= expr y= expr )
					{
					match(input,PLUS,FOLLOW_PLUS_in_expr_plus646); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr_plus650);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_plus654);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					 out.println("CALL add");
					}
					break;
				case 3 :
					// CalcCodeGenerator.g:139:9: ^( MINUS x= expr y= expr )
					{
					match(input,MINUS,FOLLOW_MINUS_in_expr_plus671); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr_plus675);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_plus679);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					 out.println("CALL sub");
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "expr_plus"



	// $ANTLR start "expr_times"
	// CalcCodeGenerator.g:142:1: expr_times : ( operand | ^( TIMES x= expr y= expr ) | ^( QUOTIENT x= expr y= expr ) );
	public final void expr_times() throws RecognitionException {
		try {
			// CalcCodeGenerator.g:143:2: ( operand | ^( TIMES x= expr y= expr ) | ^( QUOTIENT x= expr y= expr ) )
			int alt8=3;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
			case NUMBER:
				{
				alt8=1;
				}
				break;
			case TIMES:
				{
				alt8=2;
				}
				break;
			case QUOTIENT:
				{
				alt8=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// CalcCodeGenerator.g:143:4: operand
					{
					pushFollow(FOLLOW_operand_in_expr_times702);
					operand();
					state._fsp--;

					}
					break;
				case 2 :
					// CalcCodeGenerator.g:144:4: ^( TIMES x= expr y= expr )
					{
					match(input,TIMES,FOLLOW_TIMES_in_expr_times708); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr_times712);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_times716);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					 out.println("CALL mult");
					}
					break;
				case 3 :
					// CalcCodeGenerator.g:145:4: ^( QUOTIENT x= expr y= expr )
					{
					match(input,QUOTIENT,FOLLOW_QUOTIENT_in_expr_times725); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr_times729);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_times733);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 


						 		out.println("LOAD(1) -1[ST]");
						 		out.println("JUMPIF(0) ERROR[CB]");
						 		out.println("CALL div");
						 	
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "expr_times"



	// $ANTLR start "operand"
	// CalcCodeGenerator.g:153:1: operand : (id= IDENTIFIER |n= NUMBER );
	public final void operand() throws RecognitionException {
		CommonTree id=null;
		CommonTree n=null;

		try {
			// CalcCodeGenerator.g:154:5: (id= IDENTIFIER |n= NUMBER )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==IDENTIFIER) ) {
				alt9=1;
			}
			else if ( (LA9_0==NUMBER) ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// CalcCodeGenerator.g:154:9: id= IDENTIFIER
					{
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand761); 
					 out.println("LOAD(1) "+ store.get((id!=null?id.getText():null))+"[SB]");       
					}
					break;
				case 2 :
					// CalcCodeGenerator.g:155:9: n= NUMBER
					{
					n=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_operand778); 
					 out.println("LOADL " + (n!=null?n.getText():null));
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "operand"



	// $ANTLR start "type"
	// CalcCodeGenerator.g:158:1: type : INTEGER ;
	public final void type() throws RecognitionException {
		try {
			// CalcCodeGenerator.g:159:5: ( INTEGER )
			// CalcCodeGenerator.g:159:9: INTEGER
			{
			match(input,INTEGER,FOLLOW_INTEGER_in_type810); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "type"

	// Delegated rules



	public static final BitSet FOLLOW_PROGRAM_in_program100 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_declaration_in_program103 = new BitSet(new long[]{0x0000000881000218L});
	public static final BitSet FOLLOW_statement_in_program107 = new BitSet(new long[]{0x0000000881000218L});
	public static final BitSet FOLLOW_VAR_in_declaration147 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration151 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_type_in_declaration153 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_assignment_in_statement189 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dowhileStatement_in_statement197 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_statement208 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_statement212 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SWAP_in_statement236 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_statement240 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_statement244 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DO_in_dowhileStatement277 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statements_in_dowhileStatement279 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_WHILE_in_dowhileStatement281 = new BitSet(new long[]{0x0000000264F0F800L});
	public static final BitSet FOLLOW_expr_if_in_dowhileStatement285 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_statement_in_statements303 = new BitSet(new long[]{0x0000000081000212L});
	public static final BitSet FOLLOW_BECOMES_in_assignment317 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_assignment321 = new BitSet(new long[]{0x0000000264F0F810L});
	public static final BitSet FOLLOW_expr_in_assignment325 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expr_assign_in_expr358 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BECOMES_in_expr_assign371 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_expr_assign375 = new BitSet(new long[]{0x0000000264F0F810L});
	public static final BitSet FOLLOW_expr_in_expr_assign379 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expr_if_in_expr_assign390 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_expr_if414 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_if418 = new BitSet(new long[]{0x0000000264F0F810L});
	public static final BitSet FOLLOW_expr_in_expr_if422 = new BitSet(new long[]{0x0000000264F0F810L});
	public static final BitSet FOLLOW_expr_in_expr_if426 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expr_rel_in_expr_if442 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_plus_in_expr_rel465 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GREATER_in_expr_rel476 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_rel480 = new BitSet(new long[]{0x0000000264F0F810L});
	public static final BitSet FOLLOW_expr_in_expr_rel484 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SMALLER_in_expr_rel501 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_rel505 = new BitSet(new long[]{0x0000000264F0F810L});
	public static final BitSet FOLLOW_expr_in_expr_rel509 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GREATEREQ_in_expr_rel526 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_rel530 = new BitSet(new long[]{0x0000000264F0F810L});
	public static final BitSet FOLLOW_expr_in_expr_rel534 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SMALLEREQ_in_expr_rel550 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_rel554 = new BitSet(new long[]{0x0000000264F0F810L});
	public static final BitSet FOLLOW_expr_in_expr_rel558 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EQUALS_in_expr_rel574 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_rel578 = new BitSet(new long[]{0x0000000264F0F810L});
	public static final BitSet FOLLOW_expr_in_expr_rel582 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NOTEQUALS_in_expr_rel599 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_rel603 = new BitSet(new long[]{0x0000000264F0F810L});
	public static final BitSet FOLLOW_expr_in_expr_rel607 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expr_times_in_expr_plus635 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_expr_plus646 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_plus650 = new BitSet(new long[]{0x0000000264F0F810L});
	public static final BitSet FOLLOW_expr_in_expr_plus654 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_in_expr_plus671 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_plus675 = new BitSet(new long[]{0x0000000264F0F810L});
	public static final BitSet FOLLOW_expr_in_expr_plus679 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_operand_in_expr_times702 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIMES_in_expr_times708 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_times712 = new BitSet(new long[]{0x0000000264F0F810L});
	public static final BitSet FOLLOW_expr_in_expr_times716 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_QUOTIENT_in_expr_times725 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_times729 = new BitSet(new long[]{0x0000000264F0F810L});
	public static final BitSet FOLLOW_expr_in_expr_times733 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand761 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_operand778 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_type810 = new BitSet(new long[]{0x0000000000000002L});
}
