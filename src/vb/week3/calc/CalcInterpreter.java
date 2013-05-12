// $ANTLR 3.5 CalcInterpreter.g 2013-05-12 23:00:52

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
		"DIGIT", "IDENTIFIER", "INTEGER", "LETTER", "LOWER", "LPAREN", "MINUS", 
		"NUMBER", "PLUS", "PRINT", "PROGRAM", "QUOTIENT", "RPAREN", "SEMICOLON", 
		"SWAP", "TIMES", "UPPER", "VAR", "WS"
	};
	public static final int EOF=-1;
	public static final int BECOMES=4;
	public static final int COLON=5;
	public static final int COMMA=6;
	public static final int COMMENT=7;
	public static final int DIGIT=8;
	public static final int IDENTIFIER=9;
	public static final int INTEGER=10;
	public static final int LETTER=11;
	public static final int LOWER=12;
	public static final int LPAREN=13;
	public static final int MINUS=14;
	public static final int NUMBER=15;
	public static final int PLUS=16;
	public static final int PRINT=17;
	public static final int PROGRAM=18;
	public static final int QUOTIENT=19;
	public static final int RPAREN=20;
	public static final int SEMICOLON=21;
	public static final int SWAP=22;
	public static final int TIMES=23;
	public static final int UPPER=24;
	public static final int VAR=25;
	public static final int WS=26;

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
	// CalcInterpreter.g:35:1: statement : ( ^( BECOMES id= IDENTIFIER v= expr1 ) | ^( PRINT v= expr1 ) | ^( SWAP id1= IDENTIFIER id2= IDENTIFIER ) );
	public final void statement() throws RecognitionException {
		CommonTree id=null;
		CommonTree id1=null;
		CommonTree id2=null;
		int v =0;

		try {
			// CalcInterpreter.g:36:5: ( ^( BECOMES id= IDENTIFIER v= expr1 ) | ^( PRINT v= expr1 ) | ^( SWAP id1= IDENTIFIER id2= IDENTIFIER ) )
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
					// CalcInterpreter.g:36:9: ^( BECOMES id= IDENTIFIER v= expr1 )
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
					// CalcInterpreter.g:38:9: ^( PRINT v= expr1 )
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
				case 3 :
					// CalcInterpreter.g:40:7: ^( SWAP id1= IDENTIFIER id2= IDENTIFIER )
					{
					match(input,SWAP,FOLLOW_SWAP_in_statement233); 
					match(input, Token.DOWN, null); 
					id1=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement237); 
					id2=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement241); 
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



	// $ANTLR start "expr1"
	// CalcInterpreter.g:47:1: expr1 returns [int val = 0;] : (z= expr2 | ^( PLUS x= expr1 y= expr1 ) | ^( MINUS x= expr1 y= expr1 ) );
	public final int expr1() throws RecognitionException {
		int val =  0;;


		int z =0;
		int x =0;
		int y =0;

		try {
			// CalcInterpreter.g:48:5: (z= expr2 | ^( PLUS x= expr1 y= expr1 ) | ^( MINUS x= expr1 y= expr1 ) )
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
					// CalcInterpreter.g:48:9: z= expr2
					{
					pushFollow(FOLLOW_expr2_in_expr1280);
					z=expr2();
					state._fsp--;

					 val = z;      
					}
					break;
				case 2 :
					// CalcInterpreter.g:49:9: ^( PLUS x= expr1 y= expr1 )
					{
					match(input,PLUS,FOLLOW_PLUS_in_expr1307); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr1_in_expr1311);
					x=expr1();
					state._fsp--;

					pushFollow(FOLLOW_expr1_in_expr1315);
					y=expr1();
					state._fsp--;

					match(input, Token.UP, null); 

					 val = x + y;  
					}
					break;
				case 3 :
					// CalcInterpreter.g:50:9: ^( MINUS x= expr1 y= expr1 )
					{
					match(input,MINUS,FOLLOW_MINUS_in_expr1331); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr1_in_expr1335);
					x=expr1();
					state._fsp--;

					pushFollow(FOLLOW_expr1_in_expr1339);
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
	// CalcInterpreter.g:53:1: expr2 returns [int val = 0;] : (z= operand | ^( TIMES x= expr2 y= expr2 ) | ^( QUOTIENT x= expr2 y= expr2 ) );
	public final int expr2() throws RecognitionException {
		int val =  0;;


		int z =0;
		int x =0;
		int y =0;

		try {
			// CalcInterpreter.g:54:2: (z= operand | ^( TIMES x= expr2 y= expr2 ) | ^( QUOTIENT x= expr2 y= expr2 ) )
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
					// CalcInterpreter.g:54:4: z= operand
					{
					pushFollow(FOLLOW_operand_in_expr2367);
					z=operand();
					state._fsp--;

					 val = z;		
					}
					break;
				case 2 :
					// CalcInterpreter.g:55:4: ^( TIMES x= expr2 y= expr2 )
					{
					match(input,TIMES,FOLLOW_TIMES_in_expr2379); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr2_in_expr2383);
					x=expr2();
					state._fsp--;

					pushFollow(FOLLOW_expr2_in_expr2387);
					y=expr2();
					state._fsp--;

					match(input, Token.UP, null); 

					 val = x * y; 	
					}
					break;
				case 3 :
					// CalcInterpreter.g:56:4: ^( QUOTIENT x= expr2 y= expr2 )
					{
					match(input,QUOTIENT,FOLLOW_QUOTIENT_in_expr2396); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr2_in_expr2400);
					x=expr2();
					state._fsp--;

					pushFollow(FOLLOW_expr2_in_expr2404);
					y=expr2();
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
	// $ANTLR end "expr2"



	// $ANTLR start "operand"
	// CalcInterpreter.g:63:1: operand returns [int val = 0] : (id= IDENTIFIER |n= NUMBER );
	public final int operand() throws RecognitionException {
		int val =  0;


		CommonTree id=null;
		CommonTree n=null;

		try {
			// CalcInterpreter.g:64:5: (id= IDENTIFIER |n= NUMBER )
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
					// CalcInterpreter.g:64:9: id= IDENTIFIER
					{
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand433); 
					 val = store.get((id!=null?id.getText():null));       
					}
					break;
				case 2 :
					// CalcInterpreter.g:65:9: n= NUMBER
					{
					n=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_operand450); 
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
	// CalcInterpreter.g:68:1: type : INTEGER ;
	public final void type() throws RecognitionException {
		try {
			// CalcInterpreter.g:69:5: ( INTEGER )
			// CalcInterpreter.g:69:9: INTEGER
			{
			match(input,INTEGER,FOLLOW_INTEGER_in_type482); 
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
	public static final BitSet FOLLOW_declaration_in_program97 = new BitSet(new long[]{0x0000000002420018L});
	public static final BitSet FOLLOW_statement_in_program101 = new BitSet(new long[]{0x0000000002420018L});
	public static final BitSet FOLLOW_VAR_in_declaration128 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration132 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_type_in_declaration134 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BECOMES_in_statement171 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_statement175 = new BitSet(new long[]{0x000000000089C200L});
	public static final BitSet FOLLOW_expr1_in_statement179 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PRINT_in_statement205 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr1_in_statement209 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SWAP_in_statement233 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_statement237 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_IDENTIFIER_in_statement241 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expr2_in_expr1280 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_expr1307 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr1_in_expr1311 = new BitSet(new long[]{0x000000000089C200L});
	public static final BitSet FOLLOW_expr1_in_expr1315 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_in_expr1331 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr1_in_expr1335 = new BitSet(new long[]{0x000000000089C200L});
	public static final BitSet FOLLOW_expr1_in_expr1339 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_operand_in_expr2367 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIMES_in_expr2379 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr2_in_expr2383 = new BitSet(new long[]{0x0000000000888200L});
	public static final BitSet FOLLOW_expr2_in_expr2387 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_QUOTIENT_in_expr2396 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr2_in_expr2400 = new BitSet(new long[]{0x0000000000888200L});
	public static final BitSet FOLLOW_expr2_in_expr2404 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand433 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_operand450 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_type482 = new BitSet(new long[]{0x0000000000000002L});
}
