// $ANTLR 3.5 CalcChecker.g 2013-05-16 12:31:11

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


	public CalcChecker(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public CalcChecker(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return CalcChecker.tokenNames; }
	@Override public String getGrammarFileName() { return "CalcChecker.g"; }


	    // idset - a set of declared identifiers.
	    private Set<String> idset = new HashSet<String>();   
	    private boolean lastLineDecl = false;
	    
	    public boolean  isDeclared(String s)     { return idset.contains(s); }
	    public void     declare(String s)        { idset.add(s);             }
	    public void		setDecl()				{ lastLineDecl = true;				}
	    public void		setStat()				{ lastLineDecl = false;				}
	    public boolean	isLastLineDecl()				{ return lastLineDecl;				}
	    



	// $ANTLR start "program"
	// CalcChecker.g:35:1: program : ^( PROGRAM ( declaration | statement )+ ) ;
	public final void program() throws RecognitionException {
		try {
			// CalcChecker.g:36:5: ( ^( PROGRAM ( declaration | statement )+ ) )
			// CalcChecker.g:36:9: ^( PROGRAM ( declaration | statement )+ )
			{
			match(input,PROGRAM,FOLLOW_PROGRAM_in_program94); 
			match(input, Token.DOWN, null); 
			// CalcChecker.g:36:19: ( declaration | statement )+
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
					// CalcChecker.g:36:20: declaration
					{
					pushFollow(FOLLOW_declaration_in_program97);
					declaration();
					state._fsp--;

					}
					break;
				case 2 :
					// CalcChecker.g:36:34: statement
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


			    		if (isLastLineDecl()) {
			    			throw new CalcException("Program may not end in a declaration");
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
	// $ANTLR end "program"



	// $ANTLR start "declaration"
	// CalcChecker.g:44:1: declaration : ^( VAR id= IDENTIFIER type ) ;
	public final void declaration() throws RecognitionException {
		CommonTree id=null;

		try {
			// CalcChecker.g:45:5: ( ^( VAR id= IDENTIFIER type ) )
			// CalcChecker.g:45:9: ^( VAR id= IDENTIFIER type )
			{
			match(input,VAR,FOLLOW_VAR_in_declaration135); 
			match(input, Token.DOWN, null); 
			id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration139); 
			pushFollow(FOLLOW_type_in_declaration141);
			type();
			state._fsp--;

			match(input, Token.UP, null); 

			   if (isDeclared((id!=null?id.getText():null)))
			                throw new CalcException(id, "is already declared");
			            else 
			                declare(id.getText()); 
			            setDecl();
			        
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
	// CalcChecker.g:54:1: statement : ( ^( BECOMES id= IDENTIFIER expr_if ) | ^( PRINT expr_if ) | ^( SWAP id1= IDENTIFIER id2= IDENTIFIER ) );
	public final void statement() throws RecognitionException {
		CommonTree id=null;
		CommonTree id1=null;
		CommonTree id2=null;

		try {
			// CalcChecker.g:55:5: ( ^( BECOMES id= IDENTIFIER expr_if ) | ^( PRINT expr_if ) | ^( SWAP id1= IDENTIFIER id2= IDENTIFIER ) )
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
					// CalcChecker.g:55:9: ^( BECOMES id= IDENTIFIER expr_if )
					{
					match(input,BECOMES,FOLLOW_BECOMES_in_statement174); 
					match(input, Token.DOWN, null); 
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement178); 
					pushFollow(FOLLOW_expr_if_in_statement180);
					expr_if();
					state._fsp--;

					match(input, Token.UP, null); 

					   if (!isDeclared((id!=null?id.getText():null)))
					                throw new CalcException(id, "is not declared");
					            setStat();
					        
					}
					break;
				case 2 :
					// CalcChecker.g:60:9: ^( PRINT expr_if )
					{
					match(input,PRINT,FOLLOW_PRINT_in_statement202); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_if_in_statement204);
					expr_if();
					state._fsp--;

					match(input, Token.UP, null); 


					    		setStat();
					    	
					}
					break;
				case 3 :
					// CalcChecker.g:64:7: ^( SWAP id1= IDENTIFIER id2= IDENTIFIER )
					{
					match(input,SWAP,FOLLOW_SWAP_in_statement221); 
					match(input, Token.DOWN, null); 
					id1=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement225); 
					id2=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement229); 
					match(input, Token.UP, null); 

						if (!isDeclared((id1!=null?id1.getText():null))) {
					                throw new CalcException(id1, "is not declared");
					            } else if(!isDeclared((id2!=null?id2.getText():null))) {
					                throw new CalcException(id2, "is not declared");
					            }
					            setStat();
					        
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



	// $ANTLR start "expr_if"
	// CalcChecker.g:74:1: expr_if : ( ^( IF expr_if expr_if expr_if ) | expr_rel );
	public final void expr_if() throws RecognitionException {
		try {
			// CalcChecker.g:75:2: ( ^( IF expr_if expr_if expr_if ) | expr_rel )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==IF) ) {
				alt3=1;
			}
			else if ( ((LA3_0 >= EQUALS && LA3_0 <= IDENTIFIER)||(LA3_0 >= MINUS && LA3_0 <= PLUS)||LA3_0==QUOTIENT||(LA3_0 >= SMALLER && LA3_0 <= SMALLEREQ)||LA3_0==TIMES) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// CalcChecker.g:75:4: ^( IF expr_if expr_if expr_if )
					{
					match(input,IF,FOLLOW_IF_in_expr_if256); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_if_in_expr_if258);
					expr_if();
					state._fsp--;

					pushFollow(FOLLOW_expr_if_in_expr_if260);
					expr_if();
					state._fsp--;

					pushFollow(FOLLOW_expr_if_in_expr_if262);
					expr_if();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 2 :
					// CalcChecker.g:76:4: expr_rel
					{
					pushFollow(FOLLOW_expr_rel_in_expr_if268);
					expr_rel();
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
	// $ANTLR end "expr_if"



	// $ANTLR start "expr_rel"
	// CalcChecker.g:79:1: expr_rel : ( expr_plus | ^( GREATER expr_rel expr_rel ) | ^( SMALLER expr_rel expr_rel ) | ^( GREATEREQ expr_rel expr_rel ) | ^( SMALLEREQ expr_rel expr_rel ) | ^( EQUALS expr_rel expr_rel ) | ^( NOTEQUALS expr_rel expr_rel ) );
	public final void expr_rel() throws RecognitionException {
		try {
			// CalcChecker.g:80:5: ( expr_plus | ^( GREATER expr_rel expr_rel ) | ^( SMALLER expr_rel expr_rel ) | ^( GREATEREQ expr_rel expr_rel ) | ^( SMALLEREQ expr_rel expr_rel ) | ^( EQUALS expr_rel expr_rel ) | ^( NOTEQUALS expr_rel expr_rel ) )
			int alt4=7;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
			case MINUS:
			case NUMBER:
			case PLUS:
			case QUOTIENT:
			case TIMES:
				{
				alt4=1;
				}
				break;
			case GREATER:
				{
				alt4=2;
				}
				break;
			case SMALLER:
				{
				alt4=3;
				}
				break;
			case GREATEREQ:
				{
				alt4=4;
				}
				break;
			case SMALLEREQ:
				{
				alt4=5;
				}
				break;
			case EQUALS:
				{
				alt4=6;
				}
				break;
			case NOTEQUALS:
				{
				alt4=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// CalcChecker.g:80:9: expr_plus
					{
					pushFollow(FOLLOW_expr_plus_in_expr_rel288);
					expr_plus();
					state._fsp--;

					}
					break;
				case 2 :
					// CalcChecker.g:81:9: ^( GREATER expr_rel expr_rel )
					{
					match(input,GREATER,FOLLOW_GREATER_in_expr_rel299); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_rel_in_expr_rel301);
					expr_rel();
					state._fsp--;

					pushFollow(FOLLOW_expr_rel_in_expr_rel303);
					expr_rel();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 3 :
					// CalcChecker.g:82:9: ^( SMALLER expr_rel expr_rel )
					{
					match(input,SMALLER,FOLLOW_SMALLER_in_expr_rel315); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_rel_in_expr_rel317);
					expr_rel();
					state._fsp--;

					pushFollow(FOLLOW_expr_rel_in_expr_rel319);
					expr_rel();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 4 :
					// CalcChecker.g:83:9: ^( GREATEREQ expr_rel expr_rel )
					{
					match(input,GREATEREQ,FOLLOW_GREATEREQ_in_expr_rel331); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_rel_in_expr_rel333);
					expr_rel();
					state._fsp--;

					pushFollow(FOLLOW_expr_rel_in_expr_rel335);
					expr_rel();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 5 :
					// CalcChecker.g:84:9: ^( SMALLEREQ expr_rel expr_rel )
					{
					match(input,SMALLEREQ,FOLLOW_SMALLEREQ_in_expr_rel347); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_rel_in_expr_rel349);
					expr_rel();
					state._fsp--;

					pushFollow(FOLLOW_expr_rel_in_expr_rel351);
					expr_rel();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 6 :
					// CalcChecker.g:85:9: ^( EQUALS expr_rel expr_rel )
					{
					match(input,EQUALS,FOLLOW_EQUALS_in_expr_rel363); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_rel_in_expr_rel365);
					expr_rel();
					state._fsp--;

					pushFollow(FOLLOW_expr_rel_in_expr_rel367);
					expr_rel();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 7 :
					// CalcChecker.g:86:9: ^( NOTEQUALS expr_rel expr_rel )
					{
					match(input,NOTEQUALS,FOLLOW_NOTEQUALS_in_expr_rel379); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_rel_in_expr_rel381);
					expr_rel();
					state._fsp--;

					pushFollow(FOLLOW_expr_rel_in_expr_rel383);
					expr_rel();
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
	// $ANTLR end "expr_rel"



	// $ANTLR start "expr_plus"
	// CalcChecker.g:89:1: expr_plus : ( expr_times | ^( PLUS expr_plus expr_plus ) | ^( MINUS expr_plus expr_plus ) );
	public final void expr_plus() throws RecognitionException {
		try {
			// CalcChecker.g:90:5: ( expr_times | ^( PLUS expr_plus expr_plus ) | ^( MINUS expr_plus expr_plus ) )
			int alt5=3;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
			case NUMBER:
			case QUOTIENT:
			case TIMES:
				{
				alt5=1;
				}
				break;
			case PLUS:
				{
				alt5=2;
				}
				break;
			case MINUS:
				{
				alt5=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// CalcChecker.g:90:9: expr_times
					{
					pushFollow(FOLLOW_expr_times_in_expr_plus407);
					expr_times();
					state._fsp--;

					}
					break;
				case 2 :
					// CalcChecker.g:91:9: ^( PLUS expr_plus expr_plus )
					{
					match(input,PLUS,FOLLOW_PLUS_in_expr_plus418); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_plus_in_expr_plus420);
					expr_plus();
					state._fsp--;

					pushFollow(FOLLOW_expr_plus_in_expr_plus422);
					expr_plus();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 3 :
					// CalcChecker.g:92:9: ^( MINUS expr_plus expr_plus )
					{
					match(input,MINUS,FOLLOW_MINUS_in_expr_plus434); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_plus_in_expr_plus436);
					expr_plus();
					state._fsp--;

					pushFollow(FOLLOW_expr_plus_in_expr_plus438);
					expr_plus();
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
	// $ANTLR end "expr_plus"



	// $ANTLR start "expr_times"
	// CalcChecker.g:95:1: expr_times : ( operand | ^( TIMES expr_times expr_times ) | ^( QUOTIENT expr_times expr_times ) );
	public final void expr_times() throws RecognitionException {
		try {
			// CalcChecker.g:96:2: ( operand | ^( TIMES expr_times expr_times ) | ^( QUOTIENT expr_times expr_times ) )
			int alt6=3;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
			case NUMBER:
				{
				alt6=1;
				}
				break;
			case TIMES:
				{
				alt6=2;
				}
				break;
			case QUOTIENT:
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
					// CalcChecker.g:96:4: operand
					{
					pushFollow(FOLLOW_operand_in_expr_times457);
					operand();
					state._fsp--;

					}
					break;
				case 2 :
					// CalcChecker.g:97:4: ^( TIMES expr_times expr_times )
					{
					match(input,TIMES,FOLLOW_TIMES_in_expr_times463); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_times_in_expr_times465);
					expr_times();
					state._fsp--;

					pushFollow(FOLLOW_expr_times_in_expr_times467);
					expr_times();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 3 :
					// CalcChecker.g:98:4: ^( QUOTIENT expr_times expr_times )
					{
					match(input,QUOTIENT,FOLLOW_QUOTIENT_in_expr_times474); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_times_in_expr_times476);
					expr_times();
					state._fsp--;

					pushFollow(FOLLOW_expr_times_in_expr_times478);
					expr_times();
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
	// $ANTLR end "expr_times"



	// $ANTLR start "operand"
	// CalcChecker.g:101:1: operand : (id= IDENTIFIER |n= NUMBER );
	public final void operand() throws RecognitionException {
		CommonTree id=null;
		CommonTree n=null;

		try {
			// CalcChecker.g:102:5: (id= IDENTIFIER |n= NUMBER )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==IDENTIFIER) ) {
				alt7=1;
			}
			else if ( (LA7_0==NUMBER) ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// CalcChecker.g:102:9: id= IDENTIFIER
					{
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand501); 
					   if (!isDeclared((id!=null?id.getText():null)))
					                throw new CalcException(id, "is not declared");
					        
					}
					break;
				case 2 :
					// CalcChecker.g:106:9: n= NUMBER
					{
					n=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_operand524); 
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
	// CalcChecker.g:109:1: type : INTEGER ;
	public final void type() throws RecognitionException {
		try {
			// CalcChecker.g:110:5: ( INTEGER )
			// CalcChecker.g:110:9: INTEGER
			{
			match(input,INTEGER,FOLLOW_INTEGER_in_type548); 
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
	public static final BitSet FOLLOW_declaration_in_program97 = new BitSet(new long[]{0x0000000440800018L});
	public static final BitSet FOLLOW_statement_in_program101 = new BitSet(new long[]{0x0000000440800018L});
	public static final BitSet FOLLOW_VAR_in_declaration135 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration139 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_type_in_declaration141 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BECOMES_in_statement174 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_statement178 = new BitSet(new long[]{0x0000000132787C00L});
	public static final BitSet FOLLOW_expr_if_in_statement180 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PRINT_in_statement202 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_if_in_statement204 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SWAP_in_statement221 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_statement225 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_statement229 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IF_in_expr_if256 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_if_in_expr_if258 = new BitSet(new long[]{0x0000000132787C00L});
	public static final BitSet FOLLOW_expr_if_in_expr_if260 = new BitSet(new long[]{0x0000000132787C00L});
	public static final BitSet FOLLOW_expr_if_in_expr_if262 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expr_rel_in_expr_if268 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_plus_in_expr_rel288 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GREATER_in_expr_rel299 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_rel_in_expr_rel301 = new BitSet(new long[]{0x0000000132783C00L});
	public static final BitSet FOLLOW_expr_rel_in_expr_rel303 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SMALLER_in_expr_rel315 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_rel_in_expr_rel317 = new BitSet(new long[]{0x0000000132783C00L});
	public static final BitSet FOLLOW_expr_rel_in_expr_rel319 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GREATEREQ_in_expr_rel331 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_rel_in_expr_rel333 = new BitSet(new long[]{0x0000000132783C00L});
	public static final BitSet FOLLOW_expr_rel_in_expr_rel335 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SMALLEREQ_in_expr_rel347 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_rel_in_expr_rel349 = new BitSet(new long[]{0x0000000132783C00L});
	public static final BitSet FOLLOW_expr_rel_in_expr_rel351 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EQUALS_in_expr_rel363 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_rel_in_expr_rel365 = new BitSet(new long[]{0x0000000132783C00L});
	public static final BitSet FOLLOW_expr_rel_in_expr_rel367 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NOTEQUALS_in_expr_rel379 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_rel_in_expr_rel381 = new BitSet(new long[]{0x0000000132783C00L});
	public static final BitSet FOLLOW_expr_rel_in_expr_rel383 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expr_times_in_expr_plus407 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_expr_plus418 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_plus_in_expr_plus420 = new BitSet(new long[]{0x0000000102682000L});
	public static final BitSet FOLLOW_expr_plus_in_expr_plus422 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_in_expr_plus434 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_plus_in_expr_plus436 = new BitSet(new long[]{0x0000000102682000L});
	public static final BitSet FOLLOW_expr_plus_in_expr_plus438 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_operand_in_expr_times457 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIMES_in_expr_times463 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_times_in_expr_times465 = new BitSet(new long[]{0x0000000102202000L});
	public static final BitSet FOLLOW_expr_times_in_expr_times467 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_QUOTIENT_in_expr_times474 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_times_in_expr_times476 = new BitSet(new long[]{0x0000000102202000L});
	public static final BitSet FOLLOW_expr_times_in_expr_times478 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand501 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_operand524 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_type548 = new BitSet(new long[]{0x0000000000000002L});
}
