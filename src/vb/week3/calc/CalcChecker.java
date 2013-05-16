// $ANTLR 3.5 CalcChecker.g 2013-05-16 15:28:00

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
	// CalcChecker.g:54:1: statement : ( assignment | ^( PRINT expr_if ) | ^( SWAP id1= IDENTIFIER id2= IDENTIFIER ) );
	public final void statement() throws RecognitionException {
		CommonTree id1=null;
		CommonTree id2=null;

		try {
			// CalcChecker.g:55:5: ( assignment | ^( PRINT expr_if ) | ^( SWAP id1= IDENTIFIER id2= IDENTIFIER ) )
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
					// CalcChecker.g:55:9: assignment
					{
					pushFollow(FOLLOW_assignment_in_statement173);
					assignment();
					state._fsp--;

					}
					break;
				case 2 :
					// CalcChecker.g:56:9: ^( PRINT expr_if )
					{
					match(input,PRINT,FOLLOW_PRINT_in_statement184); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_if_in_statement186);
					expr_if();
					state._fsp--;

					match(input, Token.UP, null); 


					    		setStat();
					    	
					}
					break;
				case 3 :
					// CalcChecker.g:60:7: ^( SWAP id1= IDENTIFIER id2= IDENTIFIER )
					{
					match(input,SWAP,FOLLOW_SWAP_in_statement203); 
					match(input, Token.DOWN, null); 
					id1=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement207); 
					id2=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement211); 
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



	// $ANTLR start "assignment"
	// CalcChecker.g:70:1: assignment : ^( BECOMES id= IDENTIFIER assignment_mul ) ;
	public final void assignment() throws RecognitionException {
		CommonTree id=null;

		try {
			// CalcChecker.g:71:2: ( ^( BECOMES id= IDENTIFIER assignment_mul ) )
			// CalcChecker.g:71:4: ^( BECOMES id= IDENTIFIER assignment_mul )
			{
			match(input,BECOMES,FOLLOW_BECOMES_in_assignment238); 
			match(input, Token.DOWN, null); 
			id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_assignment242); 
			pushFollow(FOLLOW_assignment_mul_in_assignment244);
			assignment_mul();
			state._fsp--;

			match(input, Token.UP, null); 

			   if (!isDeclared((id!=null?id.getText():null)))
			                throw new CalcException(id, "is not declared");
			            setStat();
			        
			}

		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    } 

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "assignment"



	// $ANTLR start "assignment_mul"
	// CalcChecker.g:78:1: assignment_mul : ( expr_if | ^( BECOMES id= IDENTIFIER assignment_mul ) );
	public final void assignment_mul() throws RecognitionException {
		CommonTree id=null;

		try {
			// CalcChecker.g:79:2: ( expr_if | ^( BECOMES id= IDENTIFIER assignment_mul ) )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( ((LA3_0 >= EQUALS && LA3_0 <= IF)||(LA3_0 >= MINUS && LA3_0 <= PLUS)||LA3_0==QUOTIENT||(LA3_0 >= SMALLER && LA3_0 <= SMALLEREQ)||LA3_0==TIMES) ) {
				alt3=1;
			}
			else if ( (LA3_0==BECOMES) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// CalcChecker.g:79:4: expr_if
					{
					pushFollow(FOLLOW_expr_if_in_assignment_mul269);
					expr_if();
					state._fsp--;

					}
					break;
				case 2 :
					// CalcChecker.g:80:4: ^( BECOMES id= IDENTIFIER assignment_mul )
					{
					match(input,BECOMES,FOLLOW_BECOMES_in_assignment_mul275); 
					match(input, Token.DOWN, null); 
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_assignment_mul279); 
					pushFollow(FOLLOW_assignment_mul_in_assignment_mul281);
					assignment_mul();
					state._fsp--;

					match(input, Token.UP, null); 

					   if (!isDeclared((id!=null?id.getText():null)))
					                throw new CalcException(id, "is not declared");
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
	// $ANTLR end "assignment_mul"



	// $ANTLR start "expr_if"
	// CalcChecker.g:87:1: expr_if : ( ^( IF expr_if expr_if expr_if ) | expr_rel );
	public final void expr_if() throws RecognitionException {
		try {
			// CalcChecker.g:88:2: ( ^( IF expr_if expr_if expr_if ) | expr_rel )
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
					// CalcChecker.g:88:4: ^( IF expr_if expr_if expr_if )
					{
					match(input,IF,FOLLOW_IF_in_expr_if311); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_if_in_expr_if313);
					expr_if();
					state._fsp--;

					pushFollow(FOLLOW_expr_if_in_expr_if315);
					expr_if();
					state._fsp--;

					pushFollow(FOLLOW_expr_if_in_expr_if317);
					expr_if();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 2 :
					// CalcChecker.g:89:4: expr_rel
					{
					pushFollow(FOLLOW_expr_rel_in_expr_if323);
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
	// CalcChecker.g:92:1: expr_rel : ( expr_plus | ^( GREATER expr_rel expr_rel ) | ^( SMALLER expr_rel expr_rel ) | ^( GREATEREQ expr_rel expr_rel ) | ^( SMALLEREQ expr_rel expr_rel ) | ^( EQUALS expr_rel expr_rel ) | ^( NOTEQUALS expr_rel expr_rel ) );
	public final void expr_rel() throws RecognitionException {
		try {
			// CalcChecker.g:93:5: ( expr_plus | ^( GREATER expr_rel expr_rel ) | ^( SMALLER expr_rel expr_rel ) | ^( GREATEREQ expr_rel expr_rel ) | ^( SMALLEREQ expr_rel expr_rel ) | ^( EQUALS expr_rel expr_rel ) | ^( NOTEQUALS expr_rel expr_rel ) )
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
					// CalcChecker.g:93:9: expr_plus
					{
					pushFollow(FOLLOW_expr_plus_in_expr_rel343);
					expr_plus();
					state._fsp--;

					}
					break;
				case 2 :
					// CalcChecker.g:94:9: ^( GREATER expr_rel expr_rel )
					{
					match(input,GREATER,FOLLOW_GREATER_in_expr_rel354); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_rel_in_expr_rel356);
					expr_rel();
					state._fsp--;

					pushFollow(FOLLOW_expr_rel_in_expr_rel358);
					expr_rel();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 3 :
					// CalcChecker.g:95:9: ^( SMALLER expr_rel expr_rel )
					{
					match(input,SMALLER,FOLLOW_SMALLER_in_expr_rel370); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_rel_in_expr_rel372);
					expr_rel();
					state._fsp--;

					pushFollow(FOLLOW_expr_rel_in_expr_rel374);
					expr_rel();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 4 :
					// CalcChecker.g:96:9: ^( GREATEREQ expr_rel expr_rel )
					{
					match(input,GREATEREQ,FOLLOW_GREATEREQ_in_expr_rel386); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_rel_in_expr_rel388);
					expr_rel();
					state._fsp--;

					pushFollow(FOLLOW_expr_rel_in_expr_rel390);
					expr_rel();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 5 :
					// CalcChecker.g:97:9: ^( SMALLEREQ expr_rel expr_rel )
					{
					match(input,SMALLEREQ,FOLLOW_SMALLEREQ_in_expr_rel402); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_rel_in_expr_rel404);
					expr_rel();
					state._fsp--;

					pushFollow(FOLLOW_expr_rel_in_expr_rel406);
					expr_rel();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 6 :
					// CalcChecker.g:98:9: ^( EQUALS expr_rel expr_rel )
					{
					match(input,EQUALS,FOLLOW_EQUALS_in_expr_rel418); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_rel_in_expr_rel420);
					expr_rel();
					state._fsp--;

					pushFollow(FOLLOW_expr_rel_in_expr_rel422);
					expr_rel();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 7 :
					// CalcChecker.g:99:9: ^( NOTEQUALS expr_rel expr_rel )
					{
					match(input,NOTEQUALS,FOLLOW_NOTEQUALS_in_expr_rel434); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_rel_in_expr_rel436);
					expr_rel();
					state._fsp--;

					pushFollow(FOLLOW_expr_rel_in_expr_rel438);
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
	// CalcChecker.g:102:1: expr_plus : ( expr_times | ^( PLUS expr_plus expr_plus ) | ^( MINUS expr_plus expr_plus ) );
	public final void expr_plus() throws RecognitionException {
		try {
			// CalcChecker.g:103:5: ( expr_times | ^( PLUS expr_plus expr_plus ) | ^( MINUS expr_plus expr_plus ) )
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
					// CalcChecker.g:103:9: expr_times
					{
					pushFollow(FOLLOW_expr_times_in_expr_plus462);
					expr_times();
					state._fsp--;

					}
					break;
				case 2 :
					// CalcChecker.g:104:9: ^( PLUS expr_plus expr_plus )
					{
					match(input,PLUS,FOLLOW_PLUS_in_expr_plus473); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_plus_in_expr_plus475);
					expr_plus();
					state._fsp--;

					pushFollow(FOLLOW_expr_plus_in_expr_plus477);
					expr_plus();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 3 :
					// CalcChecker.g:105:9: ^( MINUS expr_plus expr_plus )
					{
					match(input,MINUS,FOLLOW_MINUS_in_expr_plus489); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_plus_in_expr_plus491);
					expr_plus();
					state._fsp--;

					pushFollow(FOLLOW_expr_plus_in_expr_plus493);
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
	// CalcChecker.g:108:1: expr_times : ( operand | ^( TIMES expr_times expr_times ) | ^( QUOTIENT expr_times expr_times ) );
	public final void expr_times() throws RecognitionException {
		try {
			// CalcChecker.g:109:2: ( operand | ^( TIMES expr_times expr_times ) | ^( QUOTIENT expr_times expr_times ) )
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
					// CalcChecker.g:109:4: operand
					{
					pushFollow(FOLLOW_operand_in_expr_times512);
					operand();
					state._fsp--;

					}
					break;
				case 2 :
					// CalcChecker.g:110:4: ^( TIMES expr_times expr_times )
					{
					match(input,TIMES,FOLLOW_TIMES_in_expr_times518); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_times_in_expr_times520);
					expr_times();
					state._fsp--;

					pushFollow(FOLLOW_expr_times_in_expr_times522);
					expr_times();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 3 :
					// CalcChecker.g:111:4: ^( QUOTIENT expr_times expr_times )
					{
					match(input,QUOTIENT,FOLLOW_QUOTIENT_in_expr_times529); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_times_in_expr_times531);
					expr_times();
					state._fsp--;

					pushFollow(FOLLOW_expr_times_in_expr_times533);
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
	// CalcChecker.g:114:1: operand : (id= IDENTIFIER |n= NUMBER );
	public final void operand() throws RecognitionException {
		CommonTree id=null;
		CommonTree n=null;

		try {
			// CalcChecker.g:115:5: (id= IDENTIFIER |n= NUMBER )
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
					// CalcChecker.g:115:9: id= IDENTIFIER
					{
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand556); 
					   if (!isDeclared((id!=null?id.getText():null)))
					                throw new CalcException(id, "is not declared");
					        
					}
					break;
				case 2 :
					// CalcChecker.g:119:9: n= NUMBER
					{
					n=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_operand579); 
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
	// CalcChecker.g:122:1: type : INTEGER ;
	public final void type() throws RecognitionException {
		try {
			// CalcChecker.g:123:5: ( INTEGER )
			// CalcChecker.g:123:9: INTEGER
			{
			match(input,INTEGER,FOLLOW_INTEGER_in_type603); 
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
	public static final BitSet FOLLOW_assignment_in_statement173 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_statement184 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_if_in_statement186 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SWAP_in_statement203 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_statement207 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_statement211 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BECOMES_in_assignment238 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_assignment242 = new BitSet(new long[]{0x0000000132787C10L});
	public static final BitSet FOLLOW_assignment_mul_in_assignment244 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expr_if_in_assignment_mul269 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BECOMES_in_assignment_mul275 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_assignment_mul279 = new BitSet(new long[]{0x0000000132787C10L});
	public static final BitSet FOLLOW_assignment_mul_in_assignment_mul281 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IF_in_expr_if311 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_if_in_expr_if313 = new BitSet(new long[]{0x0000000132787C00L});
	public static final BitSet FOLLOW_expr_if_in_expr_if315 = new BitSet(new long[]{0x0000000132787C00L});
	public static final BitSet FOLLOW_expr_if_in_expr_if317 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expr_rel_in_expr_if323 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_plus_in_expr_rel343 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GREATER_in_expr_rel354 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_rel_in_expr_rel356 = new BitSet(new long[]{0x0000000132783C00L});
	public static final BitSet FOLLOW_expr_rel_in_expr_rel358 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SMALLER_in_expr_rel370 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_rel_in_expr_rel372 = new BitSet(new long[]{0x0000000132783C00L});
	public static final BitSet FOLLOW_expr_rel_in_expr_rel374 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GREATEREQ_in_expr_rel386 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_rel_in_expr_rel388 = new BitSet(new long[]{0x0000000132783C00L});
	public static final BitSet FOLLOW_expr_rel_in_expr_rel390 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SMALLEREQ_in_expr_rel402 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_rel_in_expr_rel404 = new BitSet(new long[]{0x0000000132783C00L});
	public static final BitSet FOLLOW_expr_rel_in_expr_rel406 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EQUALS_in_expr_rel418 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_rel_in_expr_rel420 = new BitSet(new long[]{0x0000000132783C00L});
	public static final BitSet FOLLOW_expr_rel_in_expr_rel422 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NOTEQUALS_in_expr_rel434 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_rel_in_expr_rel436 = new BitSet(new long[]{0x0000000132783C00L});
	public static final BitSet FOLLOW_expr_rel_in_expr_rel438 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expr_times_in_expr_plus462 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_expr_plus473 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_plus_in_expr_plus475 = new BitSet(new long[]{0x0000000102682000L});
	public static final BitSet FOLLOW_expr_plus_in_expr_plus477 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_in_expr_plus489 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_plus_in_expr_plus491 = new BitSet(new long[]{0x0000000102682000L});
	public static final BitSet FOLLOW_expr_plus_in_expr_plus493 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_operand_in_expr_times512 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIMES_in_expr_times518 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_times_in_expr_times520 = new BitSet(new long[]{0x0000000102202000L});
	public static final BitSet FOLLOW_expr_times_in_expr_times522 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_QUOTIENT_in_expr_times529 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_times_in_expr_times531 = new BitSet(new long[]{0x0000000102202000L});
	public static final BitSet FOLLOW_expr_times_in_expr_times533 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand556 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_operand579 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_type603 = new BitSet(new long[]{0x0000000000000002L});
}
