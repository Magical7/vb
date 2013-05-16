// $ANTLR 3.5 CalcInterpreter.g 2013-05-16 14:06:55

package vb.week3.calc;
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
		"DIGIT", "ELSE", "EQUALS", "GREATER", "GREATEREQ", "IDENTIFIER", "IF", 
		"INTEGER", "LETTER", "LOWER", "LPAREN", "MINUS", "NOTEQUALS", "NUMBER", 
		"PLUS", "PRINT", "PROGRAM", "QUOTIENT", "RPAREN", "SEMICOLON", "SMALLER", 
		"SMALLEREQ", "SWAP", "THEN", "TIMES", "UPPER", "VAR", "WS"
	};
	public static final int EOF=-1;
	public static final int BECOMES=4;
	public static final int COLON=5;
	public static final int COMMA=6;
	public static final int COMMENT=7;
	public static final int DIGIT=8;
	public static final int ELSE=9;
	public static final int EQUALS=10;
	public static final int GREATER=11;
	public static final int GREATEREQ=12;
	public static final int IDENTIFIER=13;
	public static final int IF=14;
	public static final int INTEGER=15;
	public static final int LETTER=16;
	public static final int LOWER=17;
	public static final int LPAREN=18;
	public static final int MINUS=19;
	public static final int NOTEQUALS=20;
	public static final int NUMBER=21;
	public static final int PLUS=22;
	public static final int PRINT=23;
	public static final int PROGRAM=24;
	public static final int QUOTIENT=25;
	public static final int RPAREN=26;
	public static final int SEMICOLON=27;
	public static final int SMALLER=28;
	public static final int SMALLEREQ=29;
	public static final int SWAP=30;
	public static final int THEN=31;
	public static final int TIMES=32;
	public static final int UPPER=33;
	public static final int VAR=34;
	public static final int WS=35;

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
				else if ( (LA1_0==BECOMES||LA1_0==PRINT||LA1_0==SWAP) ) {
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
	// CalcInterpreter.g:35:1: statement : ( assignment | ^( PRINT v= expr_if ) | ^( SWAP id1= IDENTIFIER id2= IDENTIFIER ) );
	public final void statement() throws RecognitionException {
		CommonTree id1=null;
		CommonTree id2=null;
		int v =0;

		try {
			// CalcInterpreter.g:36:5: ( assignment | ^( PRINT v= expr_if ) | ^( SWAP id1= IDENTIFIER id2= IDENTIFIER ) )
			int alt2=3;
			switch ( input.LA(1) ) {
			case BECOMES:
				{
				alt2=1;
				}
				break;
			case PRINT:
				{
				alt2=2;
				}
				break;
			case SWAP:
				{
				alt2=3;
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
					// CalcInterpreter.g:37:9: ^( PRINT v= expr_if )
					{
					match(input,PRINT,FOLLOW_PRINT_in_statement181); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_if_in_statement185);
					v=expr_if();
					state._fsp--;

					match(input, Token.UP, null); 

					 System.out.println("" + v);   
					}
					break;
				case 3 :
					// CalcInterpreter.g:39:7: ^( SWAP id1= IDENTIFIER id2= IDENTIFIER )
					{
					match(input,SWAP,FOLLOW_SWAP_in_statement209); 
					match(input, Token.DOWN, null); 
					id1=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement213); 
					id2=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement217); 
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



	// $ANTLR start "assignment"
	// CalcInterpreter.g:46:1: assignment : ^( BECOMES id= IDENTIFIER v= assignment_mul ) ;
	public final void assignment() throws RecognitionException {
		CommonTree id=null;
		int v =0;

		try {
			// CalcInterpreter.g:47:2: ( ^( BECOMES id= IDENTIFIER v= assignment_mul ) )
			// CalcInterpreter.g:47:4: ^( BECOMES id= IDENTIFIER v= assignment_mul )
			{
			match(input,BECOMES,FOLLOW_BECOMES_in_assignment241); 
			match(input, Token.DOWN, null); 
			id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_assignment245); 
			pushFollow(FOLLOW_assignment_mul_in_assignment249);
			v=assignment_mul();
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



	// $ANTLR start "assignment_mul"
	// CalcInterpreter.g:51:1: assignment_mul returns [int val = 0;] : ( ^( BECOMES id= IDENTIFIER ret= assignment_mul ) |ret= expr_if );
	public final int assignment_mul() throws RecognitionException {
		int val =  0;;


		CommonTree id=null;
		int ret =0;

		try {
			// CalcInterpreter.g:52:2: ( ^( BECOMES id= IDENTIFIER ret= assignment_mul ) |ret= expr_if )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==BECOMES) ) {
				alt3=1;
			}
			else if ( ((LA3_0 >= EQUALS && LA3_0 <= IF)||(LA3_0 >= MINUS && LA3_0 <= PLUS)||LA3_0==QUOTIENT||(LA3_0 >= SMALLER && LA3_0 <= SMALLEREQ)||LA3_0==TIMES) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// CalcInterpreter.g:52:4: ^( BECOMES id= IDENTIFIER ret= assignment_mul )
					{
					match(input,BECOMES,FOLLOW_BECOMES_in_assignment_mul295); 
					match(input, Token.DOWN, null); 
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_assignment_mul299); 
					pushFollow(FOLLOW_assignment_mul_in_assignment_mul303);
					ret=assignment_mul();
					state._fsp--;

					match(input, Token.UP, null); 

					 
								store.put((id!=null?id.getText():null), ret);
								val = ret; 
							
					}
					break;
				case 2 :
					// CalcInterpreter.g:57:4: ret= expr_if
					{
					pushFollow(FOLLOW_expr_if_in_assignment_mul316);
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
	// $ANTLR end "assignment_mul"



	// $ANTLR start "expr_if"
	// CalcInterpreter.g:60:1: expr_if returns [int val = 0;] : ( ^( IF x= expr_if y= expr_if z= expr_if ) |x= expr_rel );
	public final int expr_if() throws RecognitionException {
		int val =  0;;


		int x =0;
		int y =0;
		int z =0;

		try {
			// CalcInterpreter.g:61:5: ( ^( IF x= expr_if y= expr_if z= expr_if ) |x= expr_rel )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==IF) ) {
				alt4=1;
			}
			else if ( ((LA4_0 >= EQUALS && LA4_0 <= IDENTIFIER)||(LA4_0 >= MINUS && LA4_0 <= PLUS)||LA4_0==QUOTIENT||(LA4_0 >= SMALLER && LA4_0 <= SMALLEREQ)||LA4_0==TIMES) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// CalcInterpreter.g:61:7: ^( IF x= expr_if y= expr_if z= expr_if )
					{
					match(input,IF,FOLLOW_IF_in_expr_if343); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_if_in_expr_if347);
					x=expr_if();
					state._fsp--;

					pushFollow(FOLLOW_expr_if_in_expr_if351);
					y=expr_if();
					state._fsp--;

					pushFollow(FOLLOW_expr_if_in_expr_if355);
					z=expr_if();
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
					// CalcInterpreter.g:69:7: x= expr_rel
					{
					pushFollow(FOLLOW_expr_rel_in_expr_if373);
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
	// CalcInterpreter.g:72:1: expr_rel returns [int val = 0;] : (z= expr_plus | ^( GREATER x= expr_rel y= expr_rel ) | ^( SMALLER x= expr_rel y= expr_rel ) | ^( GREATEREQ x= expr_rel y= expr_rel ) | ^( SMALLEREQ x= expr_rel y= expr_rel ) | ^( EQUALS x= expr_rel y= expr_rel ) | ^( NOTEQUALS x= expr_rel y= expr_rel ) );
	public final int expr_rel() throws RecognitionException {
		int val =  0;;


		int z =0;
		int x =0;
		int y =0;

		try {
			// CalcInterpreter.g:73:5: (z= expr_plus | ^( GREATER x= expr_rel y= expr_rel ) | ^( SMALLER x= expr_rel y= expr_rel ) | ^( GREATEREQ x= expr_rel y= expr_rel ) | ^( SMALLEREQ x= expr_rel y= expr_rel ) | ^( EQUALS x= expr_rel y= expr_rel ) | ^( NOTEQUALS x= expr_rel y= expr_rel ) )
			int alt5=7;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
			case MINUS:
			case NUMBER:
			case PLUS:
			case QUOTIENT:
			case TIMES:
				{
				alt5=1;
				}
				break;
			case GREATER:
				{
				alt5=2;
				}
				break;
			case SMALLER:
				{
				alt5=3;
				}
				break;
			case GREATEREQ:
				{
				alt5=4;
				}
				break;
			case SMALLEREQ:
				{
				alt5=5;
				}
				break;
			case EQUALS:
				{
				alt5=6;
				}
				break;
			case NOTEQUALS:
				{
				alt5=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// CalcInterpreter.g:73:9: z= expr_plus
					{
					pushFollow(FOLLOW_expr_plus_in_expr_rel406);
					z=expr_plus();
					state._fsp--;

					 val = z;      
					}
					break;
				case 2 :
					// CalcInterpreter.g:74:9: ^( GREATER x= expr_rel y= expr_rel )
					{
					match(input,GREATER,FOLLOW_GREATER_in_expr_rel433); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_rel_in_expr_rel437);
					x=expr_rel();
					state._fsp--;

					pushFollow(FOLLOW_expr_rel_in_expr_rel441);
					y=expr_rel();
					state._fsp--;

					match(input, Token.UP, null); 

					 val = x > y ? 1 : 0;  
					}
					break;
				case 3 :
					// CalcInterpreter.g:75:9: ^( SMALLER x= expr_rel y= expr_rel )
					{
					match(input,SMALLER,FOLLOW_SMALLER_in_expr_rel458); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_rel_in_expr_rel462);
					x=expr_rel();
					state._fsp--;

					pushFollow(FOLLOW_expr_rel_in_expr_rel466);
					y=expr_rel();
					state._fsp--;

					match(input, Token.UP, null); 

					 val = x < y ? 1 : 0;  
					}
					break;
				case 4 :
					// CalcInterpreter.g:76:9: ^( GREATEREQ x= expr_rel y= expr_rel )
					{
					match(input,GREATEREQ,FOLLOW_GREATEREQ_in_expr_rel483); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_rel_in_expr_rel487);
					x=expr_rel();
					state._fsp--;

					pushFollow(FOLLOW_expr_rel_in_expr_rel491);
					y=expr_rel();
					state._fsp--;

					match(input, Token.UP, null); 

					 val = x >= y ? 1 : 0;  
					}
					break;
				case 5 :
					// CalcInterpreter.g:77:9: ^( SMALLEREQ x= expr_rel y= expr_rel )
					{
					match(input,SMALLEREQ,FOLLOW_SMALLEREQ_in_expr_rel508); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_rel_in_expr_rel512);
					x=expr_rel();
					state._fsp--;

					pushFollow(FOLLOW_expr_rel_in_expr_rel516);
					y=expr_rel();
					state._fsp--;

					match(input, Token.UP, null); 

					 val = x <= y ? 1 : 0;  
					}
					break;
				case 6 :
					// CalcInterpreter.g:78:9: ^( EQUALS x= expr_rel y= expr_rel )
					{
					match(input,EQUALS,FOLLOW_EQUALS_in_expr_rel533); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_rel_in_expr_rel537);
					x=expr_rel();
					state._fsp--;

					pushFollow(FOLLOW_expr_rel_in_expr_rel541);
					y=expr_rel();
					state._fsp--;

					match(input, Token.UP, null); 

					 val = x == y ? 1 : 0;  
					}
					break;
				case 7 :
					// CalcInterpreter.g:79:9: ^( NOTEQUALS x= expr_rel y= expr_rel )
					{
					match(input,NOTEQUALS,FOLLOW_NOTEQUALS_in_expr_rel558); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_rel_in_expr_rel562);
					x=expr_rel();
					state._fsp--;

					pushFollow(FOLLOW_expr_rel_in_expr_rel566);
					y=expr_rel();
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
	// CalcInterpreter.g:82:1: expr_plus returns [int val = 0;] : (z= expr_times | ^( PLUS x= expr_plus y= expr_plus ) | ^( MINUS x= expr_plus y= expr_plus ) );
	public final int expr_plus() throws RecognitionException {
		int val =  0;;


		int z =0;
		int x =0;
		int y =0;

		try {
			// CalcInterpreter.g:83:5: (z= expr_times | ^( PLUS x= expr_plus y= expr_plus ) | ^( MINUS x= expr_plus y= expr_plus ) )
			int alt6=3;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
			case NUMBER:
			case QUOTIENT:
			case TIMES:
				{
				alt6=1;
				}
				break;
			case PLUS:
				{
				alt6=2;
				}
				break;
			case MINUS:
				{
				alt6=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// CalcInterpreter.g:83:9: z= expr_times
					{
					pushFollow(FOLLOW_expr_times_in_expr_plus602);
					z=expr_times();
					state._fsp--;

					 val = z;      
					}
					break;
				case 2 :
					// CalcInterpreter.g:84:9: ^( PLUS x= expr_plus y= expr_plus )
					{
					match(input,PLUS,FOLLOW_PLUS_in_expr_plus629); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_plus_in_expr_plus633);
					x=expr_plus();
					state._fsp--;

					pushFollow(FOLLOW_expr_plus_in_expr_plus637);
					y=expr_plus();
					state._fsp--;

					match(input, Token.UP, null); 

					 val = x + y;  
					}
					break;
				case 3 :
					// CalcInterpreter.g:85:9: ^( MINUS x= expr_plus y= expr_plus )
					{
					match(input,MINUS,FOLLOW_MINUS_in_expr_plus654); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_plus_in_expr_plus658);
					x=expr_plus();
					state._fsp--;

					pushFollow(FOLLOW_expr_plus_in_expr_plus662);
					y=expr_plus();
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
	// CalcInterpreter.g:88:1: expr_times returns [int val = 0;] : (z= operand | ^( TIMES x= expr_times y= expr_times ) | ^( QUOTIENT x= expr_times y= expr_times ) );
	public final int expr_times() throws RecognitionException {
		int val =  0;;


		int z =0;
		int x =0;
		int y =0;

		try {
			// CalcInterpreter.g:89:2: (z= operand | ^( TIMES x= expr_times y= expr_times ) | ^( QUOTIENT x= expr_times y= expr_times ) )
			int alt7=3;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
			case NUMBER:
				{
				alt7=1;
				}
				break;
			case TIMES:
				{
				alt7=2;
				}
				break;
			case QUOTIENT:
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
					// CalcInterpreter.g:89:4: z= operand
					{
					pushFollow(FOLLOW_operand_in_expr_times692);
					z=operand();
					state._fsp--;

					 val = z;		
					}
					break;
				case 2 :
					// CalcInterpreter.g:90:4: ^( TIMES x= expr_times y= expr_times )
					{
					match(input,TIMES,FOLLOW_TIMES_in_expr_times704); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_times_in_expr_times708);
					x=expr_times();
					state._fsp--;

					pushFollow(FOLLOW_expr_times_in_expr_times712);
					y=expr_times();
					state._fsp--;

					match(input, Token.UP, null); 

					 val = x * y; 	
					}
					break;
				case 3 :
					// CalcInterpreter.g:91:4: ^( QUOTIENT x= expr_times y= expr_times )
					{
					match(input,QUOTIENT,FOLLOW_QUOTIENT_in_expr_times721); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_times_in_expr_times725);
					x=expr_times();
					state._fsp--;

					pushFollow(FOLLOW_expr_times_in_expr_times729);
					y=expr_times();
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
	// CalcInterpreter.g:98:1: operand returns [int val = 0] : (id= IDENTIFIER |n= NUMBER );
	public final int operand() throws RecognitionException {
		int val =  0;


		CommonTree id=null;
		CommonTree n=null;

		try {
			// CalcInterpreter.g:99:5: (id= IDENTIFIER |n= NUMBER )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==IDENTIFIER) ) {
				alt8=1;
			}
			else if ( (LA8_0==NUMBER) ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// CalcInterpreter.g:99:9: id= IDENTIFIER
					{
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand758); 
					 val = store.get((id!=null?id.getText():null));       
					}
					break;
				case 2 :
					// CalcInterpreter.g:100:9: n= NUMBER
					{
					n=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_operand775); 
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
	// CalcInterpreter.g:103:1: type : INTEGER ;
	public final void type() throws RecognitionException {
		try {
			// CalcInterpreter.g:104:5: ( INTEGER )
			// CalcInterpreter.g:104:9: INTEGER
			{
			match(input,INTEGER,FOLLOW_INTEGER_in_type807); 
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
	public static final BitSet FOLLOW_declaration_in_program97 = new BitSet(new long[]{0x0000000440800018L});
	public static final BitSet FOLLOW_statement_in_program101 = new BitSet(new long[]{0x0000000440800018L});
	public static final BitSet FOLLOW_VAR_in_declaration128 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration132 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_type_in_declaration134 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_assignment_in_statement170 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_statement181 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_if_in_statement185 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SWAP_in_statement209 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_statement213 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_statement217 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BECOMES_in_assignment241 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_assignment245 = new BitSet(new long[]{0x0000000132787C10L});
	public static final BitSet FOLLOW_assignment_mul_in_assignment249 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BECOMES_in_assignment_mul295 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_assignment_mul299 = new BitSet(new long[]{0x0000000132787C10L});
	public static final BitSet FOLLOW_assignment_mul_in_assignment_mul303 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expr_if_in_assignment_mul316 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_expr_if343 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_if_in_expr_if347 = new BitSet(new long[]{0x0000000132787C00L});
	public static final BitSet FOLLOW_expr_if_in_expr_if351 = new BitSet(new long[]{0x0000000132787C00L});
	public static final BitSet FOLLOW_expr_if_in_expr_if355 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expr_rel_in_expr_if373 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_plus_in_expr_rel406 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GREATER_in_expr_rel433 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_rel_in_expr_rel437 = new BitSet(new long[]{0x0000000132783C00L});
	public static final BitSet FOLLOW_expr_rel_in_expr_rel441 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SMALLER_in_expr_rel458 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_rel_in_expr_rel462 = new BitSet(new long[]{0x0000000132783C00L});
	public static final BitSet FOLLOW_expr_rel_in_expr_rel466 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GREATEREQ_in_expr_rel483 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_rel_in_expr_rel487 = new BitSet(new long[]{0x0000000132783C00L});
	public static final BitSet FOLLOW_expr_rel_in_expr_rel491 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SMALLEREQ_in_expr_rel508 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_rel_in_expr_rel512 = new BitSet(new long[]{0x0000000132783C00L});
	public static final BitSet FOLLOW_expr_rel_in_expr_rel516 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EQUALS_in_expr_rel533 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_rel_in_expr_rel537 = new BitSet(new long[]{0x0000000132783C00L});
	public static final BitSet FOLLOW_expr_rel_in_expr_rel541 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NOTEQUALS_in_expr_rel558 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_rel_in_expr_rel562 = new BitSet(new long[]{0x0000000132783C00L});
	public static final BitSet FOLLOW_expr_rel_in_expr_rel566 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expr_times_in_expr_plus602 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_expr_plus629 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_plus_in_expr_plus633 = new BitSet(new long[]{0x0000000102682000L});
	public static final BitSet FOLLOW_expr_plus_in_expr_plus637 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_in_expr_plus654 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_plus_in_expr_plus658 = new BitSet(new long[]{0x0000000102682000L});
	public static final BitSet FOLLOW_expr_plus_in_expr_plus662 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_operand_in_expr_times692 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIMES_in_expr_times704 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_times_in_expr_times708 = new BitSet(new long[]{0x0000000102202000L});
	public static final BitSet FOLLOW_expr_times_in_expr_times712 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_QUOTIENT_in_expr_times721 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_times_in_expr_times725 = new BitSet(new long[]{0x0000000102202000L});
	public static final BitSet FOLLOW_expr_times_in_expr_times729 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand758 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_operand775 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_type807 = new BitSet(new long[]{0x0000000000000002L});
}
