// $ANTLR 3.5 src\\vb\\week3\\calc\\CalcInterpreter.g 2013-05-12 22:15:25

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
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "BECOMES", "COLON", "COMMENT", 
		"DIGIT", "IDENTIFIER", "INTEGER", "LETTER", "LOWER", "LPAREN", "MINUS", 
		"NUMBER", "PLUS", "PRINT", "PROGRAM", "RPAREN", "SEMICOLON", "UPPER", 
		"VAR", "WS", "QUOTIENT", "TIMES"
	};
	public static final int EOF=-1;
	public static final int BECOMES=4;
	public static final int COLON=5;
	public static final int COMMENT=6;
	public static final int DIGIT=7;
	public static final int IDENTIFIER=8;
	public static final int INTEGER=9;
	public static final int LETTER=10;
	public static final int LOWER=11;
	public static final int LPAREN=12;
	public static final int MINUS=13;
	public static final int NUMBER=14;
	public static final int PLUS=15;
	public static final int PRINT=16;
	public static final int PROGRAM=17;
	public static final int RPAREN=18;
	public static final int SEMICOLON=19;
	public static final int UPPER=20;
	public static final int VAR=21;
	public static final int WS=22;
	public static final int QUOTIENT=23;
	public static final int TIMES=24;

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
	@Override public String getGrammarFileName() { return "src\\vb\\week3\\calc\\CalcInterpreter.g"; }

	 
	    private Map<String,Integer> store = new HashMap<String,Integer>();   



	// $ANTLR start "program"
	// src\\vb\\week3\\calc\\CalcInterpreter.g:26:1: program : ^( PROGRAM ( declaration | statement )+ ) ;
	public final void program() throws RecognitionException {
		try {
			// src\\vb\\week3\\calc\\CalcInterpreter.g:27:5: ( ^( PROGRAM ( declaration | statement )+ ) )
			// src\\vb\\week3\\calc\\CalcInterpreter.g:27:9: ^( PROGRAM ( declaration | statement )+ )
			{
			match(input,PROGRAM,FOLLOW_PROGRAM_in_program94); 
			match(input, Token.DOWN, null); 
			// src\\vb\\week3\\calc\\CalcInterpreter.g:27:19: ( declaration | statement )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=3;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==VAR) ) {
					alt1=1;
				}
				else if ( (LA1_0==BECOMES||LA1_0==PRINT) ) {
					alt1=2;
				}

				switch (alt1) {
				case 1 :
					// src\\vb\\week3\\calc\\CalcInterpreter.g:27:20: declaration
					{
					pushFollow(FOLLOW_declaration_in_program97);
					declaration();
					state._fsp--;

					}
					break;
				case 2 :
					// src\\vb\\week3\\calc\\CalcInterpreter.g:27:34: statement
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
	// src\\vb\\week3\\calc\\CalcInterpreter.g:30:1: declaration : ^( VAR id= IDENTIFIER type ) ;
	public final void declaration() throws RecognitionException {
		CommonTree id=null;

		try {
			// src\\vb\\week3\\calc\\CalcInterpreter.g:31:5: ( ^( VAR id= IDENTIFIER type ) )
			// src\\vb\\week3\\calc\\CalcInterpreter.g:31:9: ^( VAR id= IDENTIFIER type )
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
	// src\\vb\\week3\\calc\\CalcInterpreter.g:35:1: statement : ( ^( BECOMES id= IDENTIFIER v= expr1 ) | ^( PRINT v= expr1 ) );
	public final void statement() throws RecognitionException {
		CommonTree id=null;
		int v =0;

		try {
			// src\\vb\\week3\\calc\\CalcInterpreter.g:36:5: ( ^( BECOMES id= IDENTIFIER v= expr1 ) | ^( PRINT v= expr1 ) )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==BECOMES) ) {
				alt2=1;
			}
			else if ( (LA2_0==PRINT) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// src\\vb\\week3\\calc\\CalcInterpreter.g:36:9: ^( BECOMES id= IDENTIFIER v= expr1 )
					{
					match(input,BECOMES,FOLLOW_BECOMES_in_statement171); 
					match(input, Token.DOWN, null); 
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement175); 
					pushFollow(FOLLOW_expr1_in_statement179);
					v=expr1();
					state._fsp--;

					match(input, Token.UP, null); 

					 store.put((id!=null?id.getText():null), v);       
					}
					break;
				case 2 :
					// src\\vb\\week3\\calc\\CalcInterpreter.g:38:9: ^( PRINT v= expr1 )
					{
					match(input,PRINT,FOLLOW_PRINT_in_statement205); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr1_in_statement209);
					v=expr1();
					state._fsp--;

					match(input, Token.UP, null); 

					 System.out.println("" + v);   
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



	// $ANTLR start "expr1"
	// src\\vb\\week3\\calc\\CalcInterpreter.g:42:1: expr1 returns [int val = 0;] : (z= expr2 | ^( PLUS x= expr1 y= expr1 ) | ^( MINUS x= expr1 y= expr1 ) );
	public final int expr1() throws RecognitionException {
		int val =  0;;


		int z =0;
		int x =0;
		int y =0;

		try {
			// src\\vb\\week3\\calc\\CalcInterpreter.g:43:5: (z= expr2 | ^( PLUS x= expr1 y= expr1 ) | ^( MINUS x= expr1 y= expr1 ) )
			int alt3=3;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
			case NUMBER:
			case QUOTIENT:
			case TIMES:
				{
				alt3=1;
				}
				break;
			case PLUS:
				{
				alt3=2;
				}
				break;
			case MINUS:
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
					// src\\vb\\week3\\calc\\CalcInterpreter.g:43:9: z= expr2
					{
					pushFollow(FOLLOW_expr2_in_expr1254);
					z=expr2();
					state._fsp--;

					 val = z;      
					}
					break;
				case 2 :
					// src\\vb\\week3\\calc\\CalcInterpreter.g:44:9: ^( PLUS x= expr1 y= expr1 )
					{
					match(input,PLUS,FOLLOW_PLUS_in_expr1281); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr1_in_expr1285);
					x=expr1();
					state._fsp--;

					pushFollow(FOLLOW_expr1_in_expr1289);
					y=expr1();
					state._fsp--;

					match(input, Token.UP, null); 

					 val = x + y;  
					}
					break;
				case 3 :
					// src\\vb\\week3\\calc\\CalcInterpreter.g:45:9: ^( MINUS x= expr1 y= expr1 )
					{
					match(input,MINUS,FOLLOW_MINUS_in_expr1305); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr1_in_expr1309);
					x=expr1();
					state._fsp--;

					pushFollow(FOLLOW_expr1_in_expr1313);
					y=expr1();
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
	// $ANTLR end "expr1"



	// $ANTLR start "expr2"
	// src\\vb\\week3\\calc\\CalcInterpreter.g:48:1: expr2 returns [int val = 0;] : (z= operand | ^( TIMES x= expr2 y= expr2 ) | ^( QUOTIENT x= expr2 y= expr2 ) );
	public final int expr2() throws RecognitionException {
		int val =  0;;


		int z =0;
		int x =0;
		int y =0;

		try {
			// src\\vb\\week3\\calc\\CalcInterpreter.g:49:2: (z= operand | ^( TIMES x= expr2 y= expr2 ) | ^( QUOTIENT x= expr2 y= expr2 ) )
			int alt4=3;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
			case NUMBER:
				{
				alt4=1;
				}
				break;
			case TIMES:
				{
				alt4=2;
				}
				break;
			case QUOTIENT:
				{
				alt4=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// src\\vb\\week3\\calc\\CalcInterpreter.g:49:4: z= operand
					{
					pushFollow(FOLLOW_operand_in_expr2341);
					z=operand();
					state._fsp--;

					 val = z;		
					}
					break;
				case 2 :
					// src\\vb\\week3\\calc\\CalcInterpreter.g:50:4: ^( TIMES x= expr2 y= expr2 )
					{
					match(input,TIMES,FOLLOW_TIMES_in_expr2353); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr2_in_expr2357);
					x=expr2();
					state._fsp--;

					pushFollow(FOLLOW_expr2_in_expr2361);
					y=expr2();
					state._fsp--;

					match(input, Token.UP, null); 

					 val = x * y; 	
					}
					break;
				case 3 :
					// src\\vb\\week3\\calc\\CalcInterpreter.g:51:4: ^( QUOTIENT x= expr2 y= expr2 )
					{
					match(input,QUOTIENT,FOLLOW_QUOTIENT_in_expr2370); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr2_in_expr2374);
					x=expr2();
					state._fsp--;

					pushFollow(FOLLOW_expr2_in_expr2378);
					y=expr2();
					state._fsp--;

					match(input, Token.UP, null); 

					 if (y == 0) { throw new CalcException("Divide by zero"); } else { val = x / y; }	
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
	// $ANTLR end "expr2"



	// $ANTLR start "operand"
	// src\\vb\\week3\\calc\\CalcInterpreter.g:54:1: operand returns [int val = 0] : (id= IDENTIFIER |n= NUMBER );
	public final int operand() throws RecognitionException {
		int val =  0;


		CommonTree id=null;
		CommonTree n=null;

		try {
			// src\\vb\\week3\\calc\\CalcInterpreter.g:55:5: (id= IDENTIFIER |n= NUMBER )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==IDENTIFIER) ) {
				alt5=1;
			}
			else if ( (LA5_0==NUMBER) ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// src\\vb\\week3\\calc\\CalcInterpreter.g:55:9: id= IDENTIFIER
					{
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand407); 
					 val = store.get((id!=null?id.getText():null));       
					}
					break;
				case 2 :
					// src\\vb\\week3\\calc\\CalcInterpreter.g:56:9: n= NUMBER
					{
					n=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_operand424); 
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
	// src\\vb\\week3\\calc\\CalcInterpreter.g:59:1: type : INTEGER ;
	public final void type() throws RecognitionException {
		try {
			// src\\vb\\week3\\calc\\CalcInterpreter.g:60:5: ( INTEGER )
			// src\\vb\\week3\\calc\\CalcInterpreter.g:60:9: INTEGER
			{
			match(input,INTEGER,FOLLOW_INTEGER_in_type456); 
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
	public static final BitSet FOLLOW_declaration_in_program97 = new BitSet(new long[]{0x0000000000210018L});
	public static final BitSet FOLLOW_statement_in_program101 = new BitSet(new long[]{0x0000000000210018L});
	public static final BitSet FOLLOW_VAR_in_declaration128 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration132 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_type_in_declaration134 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BECOMES_in_statement171 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_statement175 = new BitSet(new long[]{0x000000000180E100L});
	public static final BitSet FOLLOW_expr1_in_statement179 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PRINT_in_statement205 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr1_in_statement209 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expr2_in_expr1254 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_expr1281 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr1_in_expr1285 = new BitSet(new long[]{0x000000000180E100L});
	public static final BitSet FOLLOW_expr1_in_expr1289 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_in_expr1305 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr1_in_expr1309 = new BitSet(new long[]{0x000000000180E100L});
	public static final BitSet FOLLOW_expr1_in_expr1313 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_operand_in_expr2341 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIMES_in_expr2353 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr2_in_expr2357 = new BitSet(new long[]{0x0000000001804100L});
	public static final BitSet FOLLOW_expr2_in_expr2361 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_QUOTIENT_in_expr2370 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr2_in_expr2374 = new BitSet(new long[]{0x0000000001804100L});
	public static final BitSet FOLLOW_expr2_in_expr2378 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand407 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_operand424 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_type456 = new BitSet(new long[]{0x0000000000000002L});
}
