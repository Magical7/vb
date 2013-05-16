// $ANTLR 3.5 src\\vb\\week3\\calc\\CalcChecker.g 2013-05-12 22:14:03

package vb.week3.calc;
import java.util.Set;
import java.util.HashSet;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class CalcChecker extends TreeParser {
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


	public CalcChecker(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public CalcChecker(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return CalcChecker.tokenNames; }
	@Override public String getGrammarFileName() { return "src\\vb\\week3\\calc\\CalcChecker.g"; }


	    // idset - a set of declared identifiers.
	    private Set<String> idset = new HashSet<String>();   
	    
	    public boolean  isDeclared(String s)     { return idset.contains(s); }
	    public void     declare(String s)        { idset.add(s);             }



	// $ANTLR start "program"
	// src\\vb\\week3\\calc\\CalcChecker.g:30:1: program : ^( PROGRAM ( declaration | statement )+ ) ;
	public final void program() throws RecognitionException {
		try {
			// src\\vb\\week3\\calc\\CalcChecker.g:31:5: ( ^( PROGRAM ( declaration | statement )+ ) )
			// src\\vb\\week3\\calc\\CalcChecker.g:31:9: ^( PROGRAM ( declaration | statement )+ )
			{
			match(input,PROGRAM,FOLLOW_PROGRAM_in_program94); 
			match(input, Token.DOWN, null); 
			// src\\vb\\week3\\calc\\CalcChecker.g:31:19: ( declaration | statement )+
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
					// src\\vb\\week3\\calc\\CalcChecker.g:31:20: declaration
					{
					pushFollow(FOLLOW_declaration_in_program97);
					declaration();
					state._fsp--;

					}
					break;
				case 2 :
					// src\\vb\\week3\\calc\\CalcChecker.g:31:34: statement
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
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    } 

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "program"



	// $ANTLR start "declaration"
	// src\\vb\\week3\\calc\\CalcChecker.g:34:1: declaration : ^( VAR id= IDENTIFIER type ) ;
	public final void declaration() throws RecognitionException {
		CommonTree id=null;

		try {
			// src\\vb\\week3\\calc\\CalcChecker.g:35:5: ( ^( VAR id= IDENTIFIER type ) )
			// src\\vb\\week3\\calc\\CalcChecker.g:35:9: ^( VAR id= IDENTIFIER type )
			{
			match(input,VAR,FOLLOW_VAR_in_declaration128); 
			match(input, Token.DOWN, null); 
			id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration132); 
			pushFollow(FOLLOW_type_in_declaration134);
			type();
			state._fsp--;

			match(input, Token.UP, null); 

			   if (isDeclared((id!=null?id.getText():null)))
			                throw new CalcException(id, "is already declared");
			            else 
			                declare(id.getText()); 
			        
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



	// $ANTLR start "statement"
	// src\\vb\\week3\\calc\\CalcChecker.g:43:1: statement : ( ^( BECOMES id= IDENTIFIER expr1 ) | ^( PRINT expr1 ) );
	public final void statement() throws RecognitionException {
		CommonTree id=null;

		try {
			// src\\vb\\week3\\calc\\CalcChecker.g:44:5: ( ^( BECOMES id= IDENTIFIER expr1 ) | ^( PRINT expr1 ) )
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
					// src\\vb\\week3\\calc\\CalcChecker.g:44:9: ^( BECOMES id= IDENTIFIER expr1 )
					{
					match(input,BECOMES,FOLLOW_BECOMES_in_statement167); 
					match(input, Token.DOWN, null); 
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement171); 
					pushFollow(FOLLOW_expr1_in_statement173);
					expr1();
					state._fsp--;

					match(input, Token.UP, null); 

					   if (!isDeclared((id!=null?id.getText():null)))
					                throw new CalcException(id, "is not declared");
					        
					}
					break;
				case 2 :
					// src\\vb\\week3\\calc\\CalcChecker.g:48:9: ^( PRINT expr1 )
					{
					match(input,PRINT,FOLLOW_PRINT_in_statement195); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr1_in_statement197);
					expr1();
					state._fsp--;

					match(input, Token.UP, null); 

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
	// $ANTLR end "statement"



	// $ANTLR start "expr1"
	// src\\vb\\week3\\calc\\CalcChecker.g:51:1: expr1 : ( expr2 | ^( PLUS expr1 expr1 ) | ^( MINUS expr1 expr1 ) );
	public final void expr1() throws RecognitionException {
		try {
			// src\\vb\\week3\\calc\\CalcChecker.g:52:5: ( expr2 | ^( PLUS expr1 expr1 ) | ^( MINUS expr1 expr1 ) )
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
					// src\\vb\\week3\\calc\\CalcChecker.g:52:9: expr2
					{
					pushFollow(FOLLOW_expr2_in_expr1222);
					expr2();
					state._fsp--;

					}
					break;
				case 2 :
					// src\\vb\\week3\\calc\\CalcChecker.g:53:9: ^( PLUS expr1 expr1 )
					{
					match(input,PLUS,FOLLOW_PLUS_in_expr1233); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr1_in_expr1235);
					expr1();
					state._fsp--;

					pushFollow(FOLLOW_expr1_in_expr1237);
					expr1();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 3 :
					// src\\vb\\week3\\calc\\CalcChecker.g:54:9: ^( MINUS expr1 expr1 )
					{
					match(input,MINUS,FOLLOW_MINUS_in_expr1249); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr1_in_expr1251);
					expr1();
					state._fsp--;

					pushFollow(FOLLOW_expr1_in_expr1253);
					expr1();
					state._fsp--;

					match(input, Token.UP, null); 

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
	// $ANTLR end "expr1"



	// $ANTLR start "expr2"
	// src\\vb\\week3\\calc\\CalcChecker.g:57:1: expr2 : ( operand | ^( TIMES expr2 expr2 ) | ^( QUOTIENT expr2 expr2 ) );
	public final void expr2() throws RecognitionException {
		try {
			// src\\vb\\week3\\calc\\CalcChecker.g:58:2: ( operand | ^( TIMES expr2 expr2 ) | ^( QUOTIENT expr2 expr2 ) )
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
					// src\\vb\\week3\\calc\\CalcChecker.g:58:4: operand
					{
					pushFollow(FOLLOW_operand_in_expr2272);
					operand();
					state._fsp--;

					}
					break;
				case 2 :
					// src\\vb\\week3\\calc\\CalcChecker.g:59:4: ^( TIMES expr2 expr2 )
					{
					match(input,TIMES,FOLLOW_TIMES_in_expr2278); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr2_in_expr2280);
					expr2();
					state._fsp--;

					pushFollow(FOLLOW_expr2_in_expr2282);
					expr2();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 3 :
					// src\\vb\\week3\\calc\\CalcChecker.g:60:4: ^( QUOTIENT expr2 expr2 )
					{
					match(input,QUOTIENT,FOLLOW_QUOTIENT_in_expr2289); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr2_in_expr2291);
					expr2();
					state._fsp--;

					pushFollow(FOLLOW_expr2_in_expr2293);
					expr2();
					state._fsp--;

					match(input, Token.UP, null); 

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
	// $ANTLR end "expr2"



	// $ANTLR start "operand"
	// src\\vb\\week3\\calc\\CalcChecker.g:63:1: operand : (id= IDENTIFIER |n= NUMBER );
	public final void operand() throws RecognitionException {
		CommonTree id=null;
		CommonTree n=null;

		try {
			// src\\vb\\week3\\calc\\CalcChecker.g:64:5: (id= IDENTIFIER |n= NUMBER )
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
					// src\\vb\\week3\\calc\\CalcChecker.g:64:9: id= IDENTIFIER
					{
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand316); 
					   if (!isDeclared((id!=null?id.getText():null)))
					                throw new CalcException(id, "is not declared");
					        
					}
					break;
				case 2 :
					// src\\vb\\week3\\calc\\CalcChecker.g:68:9: n= NUMBER
					{
					n=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_operand339); 
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
	// $ANTLR end "operand"



	// $ANTLR start "type"
	// src\\vb\\week3\\calc\\CalcChecker.g:71:1: type : INTEGER ;
	public final void type() throws RecognitionException {
		try {
			// src\\vb\\week3\\calc\\CalcChecker.g:72:5: ( INTEGER )
			// src\\vb\\week3\\calc\\CalcChecker.g:72:9: INTEGER
			{
			match(input,INTEGER,FOLLOW_INTEGER_in_type363); 
			}

		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
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
	public static final BitSet FOLLOW_BECOMES_in_statement167 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_statement171 = new BitSet(new long[]{0x000000000180E100L});
	public static final BitSet FOLLOW_expr1_in_statement173 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PRINT_in_statement195 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr1_in_statement197 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expr2_in_expr1222 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_expr1233 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr1_in_expr1235 = new BitSet(new long[]{0x000000000180E100L});
	public static final BitSet FOLLOW_expr1_in_expr1237 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_in_expr1249 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr1_in_expr1251 = new BitSet(new long[]{0x000000000180E100L});
	public static final BitSet FOLLOW_expr1_in_expr1253 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_operand_in_expr2272 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIMES_in_expr2278 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr2_in_expr2280 = new BitSet(new long[]{0x0000000001804100L});
	public static final BitSet FOLLOW_expr2_in_expr2282 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_QUOTIENT_in_expr2289 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr2_in_expr2291 = new BitSet(new long[]{0x0000000001804100L});
	public static final BitSet FOLLOW_expr2_in_expr2293 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand316 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_operand339 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_type363 = new BitSet(new long[]{0x0000000000000002L});
}
