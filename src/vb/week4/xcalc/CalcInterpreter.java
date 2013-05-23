// $ANTLR 3.5 CalcInterpreter.g 2013-05-23 17:21:42

package vb.week4.xcalc;
import java.util.Map;
import java.util.HashMap;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class CalcInterpreter extends TreeParser {
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


	public CalcInterpreter(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public CalcInterpreter(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return CalcInterpreter.tokenNames; }
	@Override public String getGrammarFileName() { return "CalcInterpreter.g"; }

	 
	    private Map<String,Integer> store = new HashMap<String,Integer>();   



	// $ANTLR start "program"
	// CalcInterpreter.g:26:1: program : ^( PROGRAM ( declaration | statement )+ ) ;
	public final void program() throws RecognitionException {
		try {
			// CalcInterpreter.g:27:5: ( ^( PROGRAM ( declaration | statement )+ ) )
			// CalcInterpreter.g:27:9: ^( PROGRAM ( declaration | statement )+ )
			{
			match(input,PROGRAM,FOLLOW_PROGRAM_in_program94); 
			match(input, Token.DOWN, null); 
			// CalcInterpreter.g:27:19: ( declaration | statement )+
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
					// CalcInterpreter.g:27:20: declaration
					{
					pushFollow(FOLLOW_declaration_in_program97);
					declaration();
					state._fsp--;

					}
					break;
				case 2 :
					// CalcInterpreter.g:27:34: statement
					{
					pushFollow(FOLLOW_statement_in_program101);
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
	// CalcInterpreter.g:30:1: declaration : ^( VAR id= IDENTIFIER type ) ;
	public final void declaration() throws RecognitionException {
		CommonTree id=null;

		try {
			// CalcInterpreter.g:31:5: ( ^( VAR id= IDENTIFIER type ) )
			// CalcInterpreter.g:31:9: ^( VAR id= IDENTIFIER type )
			{
			match(input,VAR,FOLLOW_VAR_in_declaration128); 
			match(input, Token.DOWN, null); 
			id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration132); 
			pushFollow(FOLLOW_type_in_declaration134);
			type();
			state._fsp--;

			match(input, Token.UP, null); 

			 store.put((id!=null?id.getText():null), 0); 
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
	// CalcInterpreter.g:35:1: statement : ( assignment | dowhileStatement | ^( PRINT v= expr ) | ^( SWAP id1= IDENTIFIER id2= IDENTIFIER ) );
	public final void statement() throws RecognitionException {
		CommonTree id1=null;
		CommonTree id2=null;
		int v =0;

		try {
			// CalcInterpreter.g:36:5: ( assignment | dowhileStatement | ^( PRINT v= expr ) | ^( SWAP id1= IDENTIFIER id2= IDENTIFIER ) )
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
					// CalcInterpreter.g:36:9: assignment
					{
					pushFollow(FOLLOW_assignment_in_statement170);
					assignment();
					state._fsp--;

					}
					break;
				case 2 :
					// CalcInterpreter.g:37:7: dowhileStatement
					{
					pushFollow(FOLLOW_dowhileStatement_in_statement178);
					dowhileStatement();
					state._fsp--;

					}
					break;
				case 3 :
					// CalcInterpreter.g:38:9: ^( PRINT v= expr )
					{
					match(input,PRINT,FOLLOW_PRINT_in_statement189); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_statement193);
					v=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					 System.out.println("" + v);   
					}
					break;
				case 4 :
					// CalcInterpreter.g:40:7: ^( SWAP id1= IDENTIFIER id2= IDENTIFIER )
					{
					match(input,SWAP,FOLLOW_SWAP_in_statement217); 
					match(input, Token.DOWN, null); 
					id1=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement221); 
					id2=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement225); 
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
	// CalcInterpreter.g:47:1: dowhileStatement : ^( DO statements WHILE v= expr_if ) ;
	public final void dowhileStatement() throws RecognitionException {
		int v =0;

		 int ix = input.index(); 
		try {
			// CalcInterpreter.g:49:2: ( ^( DO statements WHILE v= expr_if ) )
			// CalcInterpreter.g:49:4: ^( DO statements WHILE v= expr_if )
			{
			match(input,DO,FOLLOW_DO_in_dowhileStatement258); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_statements_in_dowhileStatement260);
			statements();
			state._fsp--;

			match(input,WHILE,FOLLOW_WHILE_in_dowhileStatement262); 
			pushFollow(FOLLOW_expr_if_in_dowhileStatement266);
			v=expr_if();
			state._fsp--;

			match(input, Token.UP, null); 


						if (v != 0) {
							input.rewind(ix);
							dowhileStatement();
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
	// $ANTLR end "dowhileStatement"



	// $ANTLR start "statements"
	// CalcInterpreter.g:58:1: statements : ( statement )+ ;
	public final void statements() throws RecognitionException {
		try {
			// CalcInterpreter.g:59:2: ( ( statement )+ )
			// CalcInterpreter.g:59:4: ( statement )+
			{
			// CalcInterpreter.g:59:4: ( statement )+
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
					// CalcInterpreter.g:59:5: statement
					{
					pushFollow(FOLLOW_statement_in_statements284);
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
	// CalcInterpreter.g:62:1: assignment : ^( BECOMES id= IDENTIFIER v= expr ) ;
	public final void assignment() throws RecognitionException {
		CommonTree id=null;
		int v =0;

		try {
			// CalcInterpreter.g:63:2: ( ^( BECOMES id= IDENTIFIER v= expr ) )
			// CalcInterpreter.g:63:4: ^( BECOMES id= IDENTIFIER v= expr )
			{
			match(input,BECOMES,FOLLOW_BECOMES_in_assignment298); 
			match(input, Token.DOWN, null); 
			id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_assignment302); 
			pushFollow(FOLLOW_expr_in_assignment306);
			v=expr();
			state._fsp--;

			match(input, Token.UP, null); 

			 store.put((id!=null?id.getText():null), v);       
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
	// CalcInterpreter.g:67:1: expr returns [int val = 0; ] : v= expr_assign ;
	public final int expr() throws RecognitionException {
		int val =  0;;


		int v =0;

		try {
			// CalcInterpreter.g:68:2: (v= expr_assign )
			// CalcInterpreter.g:68:4: v= expr_assign
			{
			pushFollow(FOLLOW_expr_assign_in_expr345);
			v=expr_assign();
			state._fsp--;

			val = v; 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return val;
	}
	// $ANTLR end "expr"



	// $ANTLR start "expr_assign"
	// CalcInterpreter.g:71:1: expr_assign returns [int val = 0; ] : ( ^( BECOMES id= IDENTIFIER ret= expr ) |ret= expr_if );
	public final int expr_assign() throws RecognitionException {
		int val =  0;;


		CommonTree id=null;
		int ret =0;

		try {
			// CalcInterpreter.g:72:2: ( ^( BECOMES id= IDENTIFIER ret= expr ) |ret= expr_if )
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
					// CalcInterpreter.g:72:4: ^( BECOMES id= IDENTIFIER ret= expr )
					{
					match(input,BECOMES,FOLLOW_BECOMES_in_expr_assign364); 
					match(input, Token.DOWN, null); 
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expr_assign368); 
					pushFollow(FOLLOW_expr_in_expr_assign372);
					ret=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					 
								store.put((id!=null?id.getText():null), ret);
								val = ret; 
							
					}
					break;
				case 2 :
					// CalcInterpreter.g:77:4: ret= expr_if
					{
					pushFollow(FOLLOW_expr_if_in_expr_assign385);
					ret=expr_if();
					state._fsp--;

					 val = ret; 
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
		return val;
	}
	// $ANTLR end "expr_assign"



	// $ANTLR start "expr_if"
	// CalcInterpreter.g:80:1: expr_if returns [int val = 0;] : ( ^( IF x= expr y= expr z= expr ) |x= expr_rel );
	public final int expr_if() throws RecognitionException {
		int val =  0;;


		int x =0;
		int y =0;
		int z =0;

		try {
			// CalcInterpreter.g:81:5: ( ^( IF x= expr y= expr z= expr ) |x= expr_rel )
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
					// CalcInterpreter.g:81:7: ^( IF x= expr y= expr z= expr )
					{
					match(input,IF,FOLLOW_IF_in_expr_if410); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr_if414);
					x=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_if418);
					y=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_if422);
					z=expr();
					state._fsp--;

					match(input, Token.UP, null); 


					    		if (x != 0) {
					    			val = y;
					    		} else {
					    			val = z;
					    		}
					    	
					}
					break;
				case 2 :
					// CalcInterpreter.g:89:7: x= expr_rel
					{
					pushFollow(FOLLOW_expr_rel_in_expr_if440);
					x=expr_rel();
					state._fsp--;

					 val = x;	
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
		return val;
	}
	// $ANTLR end "expr_if"



	// $ANTLR start "expr_rel"
	// CalcInterpreter.g:92:1: expr_rel returns [int val = 0;] : (z= expr_plus | ^( GREATER x= expr y= expr ) | ^( SMALLER x= expr y= expr ) | ^( GREATEREQ x= expr y= expr ) | ^( SMALLEREQ x= expr y= expr ) | ^( EQUALS x= expr y= expr ) | ^( NOTEQUALS x= expr y= expr ) );
	public final int expr_rel() throws RecognitionException {
		int val =  0;;


		int z =0;
		int x =0;
		int y =0;

		try {
			// CalcInterpreter.g:93:5: (z= expr_plus | ^( GREATER x= expr y= expr ) | ^( SMALLER x= expr y= expr ) | ^( GREATEREQ x= expr y= expr ) | ^( SMALLEREQ x= expr y= expr ) | ^( EQUALS x= expr y= expr ) | ^( NOTEQUALS x= expr y= expr ) )
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
					// CalcInterpreter.g:93:9: z= expr_plus
					{
					pushFollow(FOLLOW_expr_plus_in_expr_rel473);
					z=expr_plus();
					state._fsp--;

					 val = z;      
					}
					break;
				case 2 :
					// CalcInterpreter.g:94:9: ^( GREATER x= expr y= expr )
					{
					match(input,GREATER,FOLLOW_GREATER_in_expr_rel500); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr_rel504);
					x=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_rel508);
					y=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					 val = x > y ? 1 : 0;  
					}
					break;
				case 3 :
					// CalcInterpreter.g:95:9: ^( SMALLER x= expr y= expr )
					{
					match(input,SMALLER,FOLLOW_SMALLER_in_expr_rel525); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr_rel529);
					x=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_rel533);
					y=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					 val = x < y ? 1 : 0;  
					}
					break;
				case 4 :
					// CalcInterpreter.g:96:9: ^( GREATEREQ x= expr y= expr )
					{
					match(input,GREATEREQ,FOLLOW_GREATEREQ_in_expr_rel550); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr_rel554);
					x=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_rel558);
					y=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					 val = x >= y ? 1 : 0;  
					}
					break;
				case 5 :
					// CalcInterpreter.g:97:9: ^( SMALLEREQ x= expr y= expr )
					{
					match(input,SMALLEREQ,FOLLOW_SMALLEREQ_in_expr_rel575); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr_rel579);
					x=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_rel583);
					y=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					 val = x <= y ? 1 : 0;  
					}
					break;
				case 6 :
					// CalcInterpreter.g:98:9: ^( EQUALS x= expr y= expr )
					{
					match(input,EQUALS,FOLLOW_EQUALS_in_expr_rel600); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr_rel604);
					x=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_rel608);
					y=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					 val = x == y ? 1 : 0;  
					}
					break;
				case 7 :
					// CalcInterpreter.g:99:9: ^( NOTEQUALS x= expr y= expr )
					{
					match(input,NOTEQUALS,FOLLOW_NOTEQUALS_in_expr_rel625); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr_rel629);
					x=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_rel633);
					y=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					 val = x != y ? 1 : 0;  
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
		return val;
	}
	// $ANTLR end "expr_rel"



	// $ANTLR start "expr_plus"
	// CalcInterpreter.g:102:1: expr_plus returns [int val = 0;] : (z= expr_times | ^( PLUS x= expr y= expr ) | ^( MINUS x= expr y= expr ) );
	public final int expr_plus() throws RecognitionException {
		int val =  0;;


		int z =0;
		int x =0;
		int y =0;

		try {
			// CalcInterpreter.g:103:5: (z= expr_times | ^( PLUS x= expr y= expr ) | ^( MINUS x= expr y= expr ) )
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
					// CalcInterpreter.g:103:9: z= expr_times
					{
					pushFollow(FOLLOW_expr_times_in_expr_plus669);
					z=expr_times();
					state._fsp--;

					 val = z;      
					}
					break;
				case 2 :
					// CalcInterpreter.g:104:9: ^( PLUS x= expr y= expr )
					{
					match(input,PLUS,FOLLOW_PLUS_in_expr_plus696); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr_plus700);
					x=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_plus704);
					y=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					 val = x + y;  
					}
					break;
				case 3 :
					// CalcInterpreter.g:105:9: ^( MINUS x= expr y= expr )
					{
					match(input,MINUS,FOLLOW_MINUS_in_expr_plus721); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr_plus725);
					x=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_plus729);
					y=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					 val = x - y;  
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
		return val;
	}
	// $ANTLR end "expr_plus"



	// $ANTLR start "expr_times"
	// CalcInterpreter.g:108:1: expr_times returns [int val = 0;] : (z= operand | ^( TIMES x= expr y= expr ) | ^( QUOTIENT x= expr y= expr ) );
	public final int expr_times() throws RecognitionException {
		int val =  0;;


		int z =0;
		int x =0;
		int y =0;

		try {
			// CalcInterpreter.g:109:2: (z= operand | ^( TIMES x= expr y= expr ) | ^( QUOTIENT x= expr y= expr ) )
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
					// CalcInterpreter.g:109:4: z= operand
					{
					pushFollow(FOLLOW_operand_in_expr_times759);
					z=operand();
					state._fsp--;

					 val = z;		
					}
					break;
				case 2 :
					// CalcInterpreter.g:110:4: ^( TIMES x= expr y= expr )
					{
					match(input,TIMES,FOLLOW_TIMES_in_expr_times771); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr_times775);
					x=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_times779);
					y=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					 val = x * y; 	
					}
					break;
				case 3 :
					// CalcInterpreter.g:111:4: ^( QUOTIENT x= expr y= expr )
					{
					match(input,QUOTIENT,FOLLOW_QUOTIENT_in_expr_times788); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr_times792);
					x=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_times796);
					y=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					 if (y == 0) { 
								CalcException e = new CalcException("Divide by zero");
								e.input = input;
								throw e;
					 			} else { val = x / y; }	
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
		return val;
	}
	// $ANTLR end "expr_times"



	// $ANTLR start "operand"
	// CalcInterpreter.g:118:1: operand returns [int val = 0] : (id= IDENTIFIER |n= NUMBER );
	public final int operand() throws RecognitionException {
		int val =  0;


		CommonTree id=null;
		CommonTree n=null;

		try {
			// CalcInterpreter.g:119:5: (id= IDENTIFIER |n= NUMBER )
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
					// CalcInterpreter.g:119:9: id= IDENTIFIER
					{
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand825); 
					 val = store.get((id!=null?id.getText():null));       
					}
					break;
				case 2 :
					// CalcInterpreter.g:120:9: n= NUMBER
					{
					n=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_operand842); 
					 val = Integer.parseInt((n!=null?n.getText():null)); 
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
		return val;
	}
	// $ANTLR end "operand"



	// $ANTLR start "type"
	// CalcInterpreter.g:123:1: type : INTEGER ;
	public final void type() throws RecognitionException {
		try {
			// CalcInterpreter.g:124:5: ( INTEGER )
			// CalcInterpreter.g:124:9: INTEGER
			{
			match(input,INTEGER,FOLLOW_INTEGER_in_type874); 
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



	public static final BitSet FOLLOW_PROGRAM_in_program94 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_declaration_in_program97 = new BitSet(new long[]{0x0000000881000218L});
	public static final BitSet FOLLOW_statement_in_program101 = new BitSet(new long[]{0x0000000881000218L});
	public static final BitSet FOLLOW_VAR_in_declaration128 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration132 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_type_in_declaration134 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_assignment_in_statement170 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dowhileStatement_in_statement178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_statement189 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_statement193 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SWAP_in_statement217 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_statement221 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_statement225 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DO_in_dowhileStatement258 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statements_in_dowhileStatement260 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_WHILE_in_dowhileStatement262 = new BitSet(new long[]{0x0000000264F0F800L});
	public static final BitSet FOLLOW_expr_if_in_dowhileStatement266 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_statement_in_statements284 = new BitSet(new long[]{0x0000000081000212L});
	public static final BitSet FOLLOW_BECOMES_in_assignment298 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_assignment302 = new BitSet(new long[]{0x0000000264F0F810L});
	public static final BitSet FOLLOW_expr_in_assignment306 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expr_assign_in_expr345 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BECOMES_in_expr_assign364 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_expr_assign368 = new BitSet(new long[]{0x0000000264F0F810L});
	public static final BitSet FOLLOW_expr_in_expr_assign372 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expr_if_in_expr_assign385 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_expr_if410 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_if414 = new BitSet(new long[]{0x0000000264F0F810L});
	public static final BitSet FOLLOW_expr_in_expr_if418 = new BitSet(new long[]{0x0000000264F0F810L});
	public static final BitSet FOLLOW_expr_in_expr_if422 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expr_rel_in_expr_if440 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_plus_in_expr_rel473 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GREATER_in_expr_rel500 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_rel504 = new BitSet(new long[]{0x0000000264F0F810L});
	public static final BitSet FOLLOW_expr_in_expr_rel508 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SMALLER_in_expr_rel525 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_rel529 = new BitSet(new long[]{0x0000000264F0F810L});
	public static final BitSet FOLLOW_expr_in_expr_rel533 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GREATEREQ_in_expr_rel550 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_rel554 = new BitSet(new long[]{0x0000000264F0F810L});
	public static final BitSet FOLLOW_expr_in_expr_rel558 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SMALLEREQ_in_expr_rel575 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_rel579 = new BitSet(new long[]{0x0000000264F0F810L});
	public static final BitSet FOLLOW_expr_in_expr_rel583 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EQUALS_in_expr_rel600 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_rel604 = new BitSet(new long[]{0x0000000264F0F810L});
	public static final BitSet FOLLOW_expr_in_expr_rel608 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NOTEQUALS_in_expr_rel625 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_rel629 = new BitSet(new long[]{0x0000000264F0F810L});
	public static final BitSet FOLLOW_expr_in_expr_rel633 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expr_times_in_expr_plus669 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_expr_plus696 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_plus700 = new BitSet(new long[]{0x0000000264F0F810L});
	public static final BitSet FOLLOW_expr_in_expr_plus704 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_in_expr_plus721 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_plus725 = new BitSet(new long[]{0x0000000264F0F810L});
	public static final BitSet FOLLOW_expr_in_expr_plus729 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_operand_in_expr_times759 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIMES_in_expr_times771 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_times775 = new BitSet(new long[]{0x0000000264F0F810L});
	public static final BitSet FOLLOW_expr_in_expr_times779 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_QUOTIENT_in_expr_times788 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_times792 = new BitSet(new long[]{0x0000000264F0F810L});
	public static final BitSet FOLLOW_expr_in_expr_times796 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand825 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_operand842 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_type874 = new BitSet(new long[]{0x0000000000000002L});
}
