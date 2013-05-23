// $ANTLR 3.5 CalcChecker.g 2013-05-23 17:21:42

package vb.week4.xcalc;
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
				else if ( (LA1_0==BECOMES||LA1_0==DO||LA1_0==PRINT||LA1_0==SWAP) ) {
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
	// CalcChecker.g:54:1: statement : ( assignment | dowhileStatement | ^( PRINT expr ) | ^( SWAP id1= IDENTIFIER id2= IDENTIFIER ) );
	public final void statement() throws RecognitionException {
		CommonTree id1=null;
		CommonTree id2=null;

		try {
			// CalcChecker.g:55:5: ( assignment | dowhileStatement | ^( PRINT expr ) | ^( SWAP id1= IDENTIFIER id2= IDENTIFIER ) )
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
					// CalcChecker.g:55:9: assignment
					{
					pushFollow(FOLLOW_assignment_in_statement173);
					assignment();
					state._fsp--;

					}
					break;
				case 2 :
					// CalcChecker.g:56:7: dowhileStatement
					{
					pushFollow(FOLLOW_dowhileStatement_in_statement181);
					dowhileStatement();
					state._fsp--;

					}
					break;
				case 3 :
					// CalcChecker.g:57:9: ^( PRINT expr )
					{
					match(input,PRINT,FOLLOW_PRINT_in_statement192); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_statement194);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 


					    		setStat();
					    	
					}
					break;
				case 4 :
					// CalcChecker.g:61:7: ^( SWAP id1= IDENTIFIER id2= IDENTIFIER )
					{
					match(input,SWAP,FOLLOW_SWAP_in_statement211); 
					match(input, Token.DOWN, null); 
					id1=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement215); 
					id2=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement219); 
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



	// $ANTLR start "dowhileStatement"
	// CalcChecker.g:71:1: dowhileStatement : ^( DO statements WHILE expr_if ) ;
	public final void dowhileStatement() throws RecognitionException {
		try {
			// CalcChecker.g:72:2: ( ^( DO statements WHILE expr_if ) )
			// CalcChecker.g:72:4: ^( DO statements WHILE expr_if )
			{
			match(input,DO,FOLLOW_DO_in_dowhileStatement246); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_statements_in_dowhileStatement248);
			statements();
			state._fsp--;

			match(input,WHILE,FOLLOW_WHILE_in_dowhileStatement250); 
			pushFollow(FOLLOW_expr_if_in_dowhileStatement252);
			expr_if();
			state._fsp--;

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
	// $ANTLR end "dowhileStatement"



	// $ANTLR start "statements"
	// CalcChecker.g:75:1: statements : ( statement )+ ;
	public final void statements() throws RecognitionException {
		try {
			// CalcChecker.g:76:2: ( ( statement )+ )
			// CalcChecker.g:76:4: ( statement )+
			{
			// CalcChecker.g:76:4: ( statement )+
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
					// CalcChecker.g:76:5: statement
					{
					pushFollow(FOLLOW_statement_in_statements266);
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
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    } 

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "statements"



	// $ANTLR start "assignment"
	// CalcChecker.g:79:1: assignment : ^( BECOMES id= IDENTIFIER expr ) ;
	public final void assignment() throws RecognitionException {
		CommonTree id=null;

		try {
			// CalcChecker.g:80:2: ( ^( BECOMES id= IDENTIFIER expr ) )
			// CalcChecker.g:80:4: ^( BECOMES id= IDENTIFIER expr )
			{
			match(input,BECOMES,FOLLOW_BECOMES_in_assignment284); 
			match(input, Token.DOWN, null); 
			id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_assignment288); 
			pushFollow(FOLLOW_expr_in_assignment290);
			expr();
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



	// $ANTLR start "expr"
	// CalcChecker.g:87:1: expr : expr_assign ;
	public final void expr() throws RecognitionException {
		try {
			// CalcChecker.g:88:2: ( expr_assign )
			// CalcChecker.g:88:4: expr_assign
			{
			pushFollow(FOLLOW_expr_assign_in_expr319);
			expr_assign();
			state._fsp--;

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



	// $ANTLR start "expr_assign"
	// CalcChecker.g:91:1: expr_assign : ( ^( BECOMES expr_if expr ) | expr_if );
	public final void expr_assign() throws RecognitionException {
		try {
			// CalcChecker.g:92:2: ( ^( BECOMES expr_if expr ) | expr_if )
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
					// CalcChecker.g:92:4: ^( BECOMES expr_if expr )
					{
					match(input,BECOMES,FOLLOW_BECOMES_in_expr_assign331); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_if_in_expr_assign333);
					expr_if();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_assign335);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 2 :
					// CalcChecker.g:93:4: expr_if
					{
					pushFollow(FOLLOW_expr_if_in_expr_assign341);
					expr_if();
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
	// $ANTLR end "expr_assign"



	// $ANTLR start "expr_if"
	// CalcChecker.g:96:1: expr_if : ( ^( IF expr expr expr ) | expr_rel );
	public final void expr_if() throws RecognitionException {
		try {
			// CalcChecker.g:97:2: ( ^( IF expr expr expr ) | expr_rel )
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
					// CalcChecker.g:97:4: ^( IF expr expr expr )
					{
					match(input,IF,FOLLOW_IF_in_expr_if357); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr_if359);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_if361);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_if363);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 2 :
					// CalcChecker.g:98:4: expr_rel
					{
					pushFollow(FOLLOW_expr_rel_in_expr_if369);
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
	// CalcChecker.g:101:1: expr_rel : ( expr_plus | ^( GREATER expr expr ) | ^( SMALLER expr expr ) | ^( GREATEREQ expr expr ) | ^( SMALLEREQ expr expr ) | ^( EQUALS expr expr ) | ^( NOTEQUALS expr expr ) );
	public final void expr_rel() throws RecognitionException {
		try {
			// CalcChecker.g:102:5: ( expr_plus | ^( GREATER expr expr ) | ^( SMALLER expr expr ) | ^( GREATEREQ expr expr ) | ^( SMALLEREQ expr expr ) | ^( EQUALS expr expr ) | ^( NOTEQUALS expr expr ) )
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
					// CalcChecker.g:102:9: expr_plus
					{
					pushFollow(FOLLOW_expr_plus_in_expr_rel389);
					expr_plus();
					state._fsp--;

					}
					break;
				case 2 :
					// CalcChecker.g:103:9: ^( GREATER expr expr )
					{
					match(input,GREATER,FOLLOW_GREATER_in_expr_rel400); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr_rel402);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_rel404);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 3 :
					// CalcChecker.g:104:9: ^( SMALLER expr expr )
					{
					match(input,SMALLER,FOLLOW_SMALLER_in_expr_rel416); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr_rel418);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_rel420);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 4 :
					// CalcChecker.g:105:9: ^( GREATEREQ expr expr )
					{
					match(input,GREATEREQ,FOLLOW_GREATEREQ_in_expr_rel432); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr_rel434);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_rel436);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 5 :
					// CalcChecker.g:106:9: ^( SMALLEREQ expr expr )
					{
					match(input,SMALLEREQ,FOLLOW_SMALLEREQ_in_expr_rel448); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr_rel450);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_rel452);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 6 :
					// CalcChecker.g:107:9: ^( EQUALS expr expr )
					{
					match(input,EQUALS,FOLLOW_EQUALS_in_expr_rel464); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr_rel466);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_rel468);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 7 :
					// CalcChecker.g:108:9: ^( NOTEQUALS expr expr )
					{
					match(input,NOTEQUALS,FOLLOW_NOTEQUALS_in_expr_rel480); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr_rel482);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_rel484);
					expr();
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
	// CalcChecker.g:111:1: expr_plus : ( expr_times | ^( PLUS expr expr ) | ^( MINUS expr expr ) );
	public final void expr_plus() throws RecognitionException {
		try {
			// CalcChecker.g:112:5: ( expr_times | ^( PLUS expr expr ) | ^( MINUS expr expr ) )
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
					// CalcChecker.g:112:9: expr_times
					{
					pushFollow(FOLLOW_expr_times_in_expr_plus508);
					expr_times();
					state._fsp--;

					}
					break;
				case 2 :
					// CalcChecker.g:113:9: ^( PLUS expr expr )
					{
					match(input,PLUS,FOLLOW_PLUS_in_expr_plus519); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr_plus521);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_plus523);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 3 :
					// CalcChecker.g:114:9: ^( MINUS expr expr )
					{
					match(input,MINUS,FOLLOW_MINUS_in_expr_plus535); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr_plus537);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_plus539);
					expr();
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
	// CalcChecker.g:117:1: expr_times : ( operand | ^( TIMES expr expr ) | ^( QUOTIENT expr expr ) );
	public final void expr_times() throws RecognitionException {
		try {
			// CalcChecker.g:118:2: ( operand | ^( TIMES expr expr ) | ^( QUOTIENT expr expr ) )
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
					// CalcChecker.g:118:4: operand
					{
					pushFollow(FOLLOW_operand_in_expr_times558);
					operand();
					state._fsp--;

					}
					break;
				case 2 :
					// CalcChecker.g:119:4: ^( TIMES expr expr )
					{
					match(input,TIMES,FOLLOW_TIMES_in_expr_times564); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr_times566);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_times568);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 3 :
					// CalcChecker.g:120:4: ^( QUOTIENT expr expr )
					{
					match(input,QUOTIENT,FOLLOW_QUOTIENT_in_expr_times575); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr_times577);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr_times579);
					expr();
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
	// CalcChecker.g:123:1: operand : (id= IDENTIFIER |n= NUMBER );
	public final void operand() throws RecognitionException {
		CommonTree id=null;
		CommonTree n=null;

		try {
			// CalcChecker.g:124:5: (id= IDENTIFIER |n= NUMBER )
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
					// CalcChecker.g:124:9: id= IDENTIFIER
					{
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand602); 
					   if (!isDeclared((id!=null?id.getText():null)))
					                throw new CalcException(id, "is not declared");
					        
					}
					break;
				case 2 :
					// CalcChecker.g:128:9: n= NUMBER
					{
					n=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_operand625); 
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
	// CalcChecker.g:131:1: type : INTEGER ;
	public final void type() throws RecognitionException {
		try {
			// CalcChecker.g:132:5: ( INTEGER )
			// CalcChecker.g:132:9: INTEGER
			{
			match(input,INTEGER,FOLLOW_INTEGER_in_type648); 
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
	public static final BitSet FOLLOW_declaration_in_program97 = new BitSet(new long[]{0x0000000881000218L});
	public static final BitSet FOLLOW_statement_in_program101 = new BitSet(new long[]{0x0000000881000218L});
	public static final BitSet FOLLOW_VAR_in_declaration135 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration139 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_type_in_declaration141 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_assignment_in_statement173 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dowhileStatement_in_statement181 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_statement192 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_statement194 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SWAP_in_statement211 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_statement215 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_statement219 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DO_in_dowhileStatement246 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statements_in_dowhileStatement248 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_WHILE_in_dowhileStatement250 = new BitSet(new long[]{0x0000000264F0F800L});
	public static final BitSet FOLLOW_expr_if_in_dowhileStatement252 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_statement_in_statements266 = new BitSet(new long[]{0x0000000081000212L});
	public static final BitSet FOLLOW_BECOMES_in_assignment284 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_assignment288 = new BitSet(new long[]{0x0000000264F0F810L});
	public static final BitSet FOLLOW_expr_in_assignment290 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expr_assign_in_expr319 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BECOMES_in_expr_assign331 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_if_in_expr_assign333 = new BitSet(new long[]{0x0000000264F0F810L});
	public static final BitSet FOLLOW_expr_in_expr_assign335 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expr_if_in_expr_assign341 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_expr_if357 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_if359 = new BitSet(new long[]{0x0000000264F0F810L});
	public static final BitSet FOLLOW_expr_in_expr_if361 = new BitSet(new long[]{0x0000000264F0F810L});
	public static final BitSet FOLLOW_expr_in_expr_if363 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expr_rel_in_expr_if369 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_plus_in_expr_rel389 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GREATER_in_expr_rel400 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_rel402 = new BitSet(new long[]{0x0000000264F0F810L});
	public static final BitSet FOLLOW_expr_in_expr_rel404 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SMALLER_in_expr_rel416 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_rel418 = new BitSet(new long[]{0x0000000264F0F810L});
	public static final BitSet FOLLOW_expr_in_expr_rel420 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GREATEREQ_in_expr_rel432 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_rel434 = new BitSet(new long[]{0x0000000264F0F810L});
	public static final BitSet FOLLOW_expr_in_expr_rel436 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SMALLEREQ_in_expr_rel448 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_rel450 = new BitSet(new long[]{0x0000000264F0F810L});
	public static final BitSet FOLLOW_expr_in_expr_rel452 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EQUALS_in_expr_rel464 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_rel466 = new BitSet(new long[]{0x0000000264F0F810L});
	public static final BitSet FOLLOW_expr_in_expr_rel468 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NOTEQUALS_in_expr_rel480 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_rel482 = new BitSet(new long[]{0x0000000264F0F810L});
	public static final BitSet FOLLOW_expr_in_expr_rel484 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expr_times_in_expr_plus508 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_expr_plus519 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_plus521 = new BitSet(new long[]{0x0000000264F0F810L});
	public static final BitSet FOLLOW_expr_in_expr_plus523 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_in_expr_plus535 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_plus537 = new BitSet(new long[]{0x0000000264F0F810L});
	public static final BitSet FOLLOW_expr_in_expr_plus539 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_operand_in_expr_times558 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIMES_in_expr_times564 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_times566 = new BitSet(new long[]{0x0000000264F0F810L});
	public static final BitSet FOLLOW_expr_in_expr_times568 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_QUOTIENT_in_expr_times575 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr_times577 = new BitSet(new long[]{0x0000000264F0F810L});
	public static final BitSet FOLLOW_expr_in_expr_times579 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand602 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_operand625 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_type648 = new BitSet(new long[]{0x0000000000000002L});
}
