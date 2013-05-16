// $ANTLR 3.5 Calc.g 2013-05-16 12:31:10

package vb.week3.calc;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class CalcParser extends Parser {
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public CalcParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public CalcParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return CalcParser.tokenNames; }
	@Override public String getGrammarFileName() { return "Calc.g"; }


	public static class program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program"
	// Calc.g:51:1: program : program_lines EOF -> ^( PROGRAM program_lines ) ;
	public final CalcParser.program_return program() throws RecognitionException {
		CalcParser.program_return retval = new CalcParser.program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EOF2=null;
		ParserRuleReturnScope program_lines1 =null;

		Object EOF2_tree=null;
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleSubtreeStream stream_program_lines=new RewriteRuleSubtreeStream(adaptor,"rule program_lines");

		try {
			// Calc.g:52:5: ( program_lines EOF -> ^( PROGRAM program_lines ) )
			// Calc.g:52:9: program_lines EOF
			{
			pushFollow(FOLLOW_program_lines_in_program594);
			program_lines1=program_lines();
			state._fsp--;

			stream_program_lines.add(program_lines1.getTree());
			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_program596);  
			stream_EOF.add(EOF2);

			// AST REWRITE
			// elements: program_lines
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 53:13: -> ^( PROGRAM program_lines )
			{
				// Calc.g:53:17: ^( PROGRAM program_lines )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROGRAM, "PROGRAM"), root_1);
				adaptor.addChild(root_1, stream_program_lines.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "program"


	public static class program_lines_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program_lines"
	// Calc.g:56:1: program_lines : ( ( statement | declaration ) SEMICOLON !)* ;
	public final CalcParser.program_lines_return program_lines() throws RecognitionException {
		CalcParser.program_lines_return retval = new CalcParser.program_lines_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SEMICOLON5=null;
		ParserRuleReturnScope statement3 =null;
		ParserRuleReturnScope declaration4 =null;

		Object SEMICOLON5_tree=null;

		try {
			// Calc.g:57:2: ( ( ( statement | declaration ) SEMICOLON !)* )
			// Calc.g:57:4: ( ( statement | declaration ) SEMICOLON !)*
			{
			root_0 = (Object)adaptor.nil();


			// Calc.g:57:4: ( ( statement | declaration ) SEMICOLON !)*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==IDENTIFIER||LA2_0==PRINT||LA2_0==SWAP||LA2_0==VAR) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// Calc.g:57:5: ( statement | declaration ) SEMICOLON !
					{
					// Calc.g:57:5: ( statement | declaration )
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==IDENTIFIER||LA1_0==PRINT||LA1_0==SWAP) ) {
						alt1=1;
					}
					else if ( (LA1_0==VAR) ) {
						alt1=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 1, 0, input);
						throw nvae;
					}

					switch (alt1) {
						case 1 :
							// Calc.g:57:6: statement
							{
							pushFollow(FOLLOW_statement_in_program_lines637);
							statement3=statement();
							state._fsp--;

							adaptor.addChild(root_0, statement3.getTree());

							}
							break;
						case 2 :
							// Calc.g:57:18: declaration
							{
							pushFollow(FOLLOW_declaration_in_program_lines641);
							declaration4=declaration();
							state._fsp--;

							adaptor.addChild(root_0, declaration4.getTree());

							}
							break;

					}

					SEMICOLON5=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_program_lines644); 
					}
					break;

				default :
					break loop2;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "program_lines"


	public static class declaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "declaration"
	// Calc.g:60:1: declaration : VAR ^ IDENTIFIER COLON ! type ;
	public final CalcParser.declaration_return declaration() throws RecognitionException {
		CalcParser.declaration_return retval = new CalcParser.declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token VAR6=null;
		Token IDENTIFIER7=null;
		Token COLON8=null;
		ParserRuleReturnScope type9 =null;

		Object VAR6_tree=null;
		Object IDENTIFIER7_tree=null;
		Object COLON8_tree=null;

		try {
			// Calc.g:61:5: ( VAR ^ IDENTIFIER COLON ! type )
			// Calc.g:61:9: VAR ^ IDENTIFIER COLON ! type
			{
			root_0 = (Object)adaptor.nil();


			VAR6=(Token)match(input,VAR,FOLLOW_VAR_in_declaration663); 
			VAR6_tree = (Object)adaptor.create(VAR6);
			root_0 = (Object)adaptor.becomeRoot(VAR6_tree, root_0);

			IDENTIFIER7=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration666); 
			IDENTIFIER7_tree = (Object)adaptor.create(IDENTIFIER7);
			adaptor.addChild(root_0, IDENTIFIER7_tree);

			COLON8=(Token)match(input,COLON,FOLLOW_COLON_in_declaration668); 
			pushFollow(FOLLOW_type_in_declaration671);
			type9=type();
			state._fsp--;

			adaptor.addChild(root_0, type9.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declaration"


	public static class statement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "statement"
	// Calc.g:64:1: statement : ( assignment | print_stat | swap_stat );
	public final CalcParser.statement_return statement() throws RecognitionException {
		CalcParser.statement_return retval = new CalcParser.statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope assignment10 =null;
		ParserRuleReturnScope print_stat11 =null;
		ParserRuleReturnScope swap_stat12 =null;


		try {
			// Calc.g:65:5: ( assignment | print_stat | swap_stat )
			int alt3=3;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
				{
				alt3=1;
				}
				break;
			case PRINT:
				{
				alt3=2;
				}
				break;
			case SWAP:
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
					// Calc.g:65:9: assignment
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_assignment_in_statement694);
					assignment10=assignment();
					state._fsp--;

					adaptor.addChild(root_0, assignment10.getTree());

					}
					break;
				case 2 :
					// Calc.g:66:9: print_stat
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_print_stat_in_statement704);
					print_stat11=print_stat();
					state._fsp--;

					adaptor.addChild(root_0, print_stat11.getTree());

					}
					break;
				case 3 :
					// Calc.g:67:7: swap_stat
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_swap_stat_in_statement712);
					swap_stat12=swap_stat();
					state._fsp--;

					adaptor.addChild(root_0, swap_stat12.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statement"


	public static class assignment_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "assignment"
	// Calc.g:70:1: assignment : lvalue BECOMES ^ expr_if ;
	public final CalcParser.assignment_return assignment() throws RecognitionException {
		CalcParser.assignment_return retval = new CalcParser.assignment_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token BECOMES14=null;
		ParserRuleReturnScope lvalue13 =null;
		ParserRuleReturnScope expr_if15 =null;

		Object BECOMES14_tree=null;

		try {
			// Calc.g:71:5: ( lvalue BECOMES ^ expr_if )
			// Calc.g:71:9: lvalue BECOMES ^ expr_if
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_lvalue_in_assignment731);
			lvalue13=lvalue();
			state._fsp--;

			adaptor.addChild(root_0, lvalue13.getTree());

			BECOMES14=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_assignment733); 
			BECOMES14_tree = (Object)adaptor.create(BECOMES14);
			root_0 = (Object)adaptor.becomeRoot(BECOMES14_tree, root_0);

			pushFollow(FOLLOW_expr_if_in_assignment736);
			expr_if15=expr_if();
			state._fsp--;

			adaptor.addChild(root_0, expr_if15.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assignment"


	public static class print_stat_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "print_stat"
	// Calc.g:74:1: print_stat : PRINT ^ LPAREN ! expr_if RPAREN !;
	public final CalcParser.print_stat_return print_stat() throws RecognitionException {
		CalcParser.print_stat_return retval = new CalcParser.print_stat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PRINT16=null;
		Token LPAREN17=null;
		Token RPAREN19=null;
		ParserRuleReturnScope expr_if18 =null;

		Object PRINT16_tree=null;
		Object LPAREN17_tree=null;
		Object RPAREN19_tree=null;

		try {
			// Calc.g:75:5: ( PRINT ^ LPAREN ! expr_if RPAREN !)
			// Calc.g:75:9: PRINT ^ LPAREN ! expr_if RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			PRINT16=(Token)match(input,PRINT,FOLLOW_PRINT_in_print_stat755); 
			PRINT16_tree = (Object)adaptor.create(PRINT16);
			root_0 = (Object)adaptor.becomeRoot(PRINT16_tree, root_0);

			LPAREN17=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_print_stat758); 
			pushFollow(FOLLOW_expr_if_in_print_stat761);
			expr_if18=expr_if();
			state._fsp--;

			adaptor.addChild(root_0, expr_if18.getTree());

			RPAREN19=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_print_stat763); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "print_stat"


	public static class swap_stat_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "swap_stat"
	// Calc.g:78:1: swap_stat : SWAP ^ LPAREN ! IDENTIFIER COMMA ! IDENTIFIER RPAREN !;
	public final CalcParser.swap_stat_return swap_stat() throws RecognitionException {
		CalcParser.swap_stat_return retval = new CalcParser.swap_stat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SWAP20=null;
		Token LPAREN21=null;
		Token IDENTIFIER22=null;
		Token COMMA23=null;
		Token IDENTIFIER24=null;
		Token RPAREN25=null;

		Object SWAP20_tree=null;
		Object LPAREN21_tree=null;
		Object IDENTIFIER22_tree=null;
		Object COMMA23_tree=null;
		Object IDENTIFIER24_tree=null;
		Object RPAREN25_tree=null;

		try {
			// Calc.g:79:2: ( SWAP ^ LPAREN ! IDENTIFIER COMMA ! IDENTIFIER RPAREN !)
			// Calc.g:79:4: SWAP ^ LPAREN ! IDENTIFIER COMMA ! IDENTIFIER RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			SWAP20=(Token)match(input,SWAP,FOLLOW_SWAP_in_swap_stat782); 
			SWAP20_tree = (Object)adaptor.create(SWAP20);
			root_0 = (Object)adaptor.becomeRoot(SWAP20_tree, root_0);

			LPAREN21=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_swap_stat785); 
			IDENTIFIER22=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_swap_stat788); 
			IDENTIFIER22_tree = (Object)adaptor.create(IDENTIFIER22);
			adaptor.addChild(root_0, IDENTIFIER22_tree);

			COMMA23=(Token)match(input,COMMA,FOLLOW_COMMA_in_swap_stat790); 
			IDENTIFIER24=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_swap_stat793); 
			IDENTIFIER24_tree = (Object)adaptor.create(IDENTIFIER24);
			adaptor.addChild(root_0, IDENTIFIER24_tree);

			RPAREN25=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_swap_stat795); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "swap_stat"


	public static class lvalue_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "lvalue"
	// Calc.g:82:1: lvalue : IDENTIFIER ;
	public final CalcParser.lvalue_return lvalue() throws RecognitionException {
		CalcParser.lvalue_return retval = new CalcParser.lvalue_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER26=null;

		Object IDENTIFIER26_tree=null;

		try {
			// Calc.g:83:5: ( IDENTIFIER )
			// Calc.g:83:9: IDENTIFIER
			{
			root_0 = (Object)adaptor.nil();


			IDENTIFIER26=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_lvalue812); 
			IDENTIFIER26_tree = (Object)adaptor.create(IDENTIFIER26);
			adaptor.addChild(root_0, IDENTIFIER26_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "lvalue"


	public static class expr_if_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr_if"
	// Calc.g:86:1: expr_if : ( IF ^ expr_if THEN ! expr_if ELSE ! expr_if | expr_rel );
	public final CalcParser.expr_if_return expr_if() throws RecognitionException {
		CalcParser.expr_if_return retval = new CalcParser.expr_if_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IF27=null;
		Token THEN29=null;
		Token ELSE31=null;
		ParserRuleReturnScope expr_if28 =null;
		ParserRuleReturnScope expr_if30 =null;
		ParserRuleReturnScope expr_if32 =null;
		ParserRuleReturnScope expr_rel33 =null;

		Object IF27_tree=null;
		Object THEN29_tree=null;
		Object ELSE31_tree=null;

		try {
			// Calc.g:87:2: ( IF ^ expr_if THEN ! expr_if ELSE ! expr_if | expr_rel )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==IF) ) {
				alt4=1;
			}
			else if ( (LA4_0==IDENTIFIER||LA4_0==LPAREN||LA4_0==NUMBER) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// Calc.g:87:4: IF ^ expr_if THEN ! expr_if ELSE ! expr_if
					{
					root_0 = (Object)adaptor.nil();


					IF27=(Token)match(input,IF,FOLLOW_IF_in_expr_if830); 
					IF27_tree = (Object)adaptor.create(IF27);
					root_0 = (Object)adaptor.becomeRoot(IF27_tree, root_0);

					pushFollow(FOLLOW_expr_if_in_expr_if833);
					expr_if28=expr_if();
					state._fsp--;

					adaptor.addChild(root_0, expr_if28.getTree());

					THEN29=(Token)match(input,THEN,FOLLOW_THEN_in_expr_if835); 
					pushFollow(FOLLOW_expr_if_in_expr_if838);
					expr_if30=expr_if();
					state._fsp--;

					adaptor.addChild(root_0, expr_if30.getTree());

					ELSE31=(Token)match(input,ELSE,FOLLOW_ELSE_in_expr_if840); 
					pushFollow(FOLLOW_expr_if_in_expr_if843);
					expr_if32=expr_if();
					state._fsp--;

					adaptor.addChild(root_0, expr_if32.getTree());

					}
					break;
				case 2 :
					// Calc.g:88:4: expr_rel
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expr_rel_in_expr_if848);
					expr_rel33=expr_rel();
					state._fsp--;

					adaptor.addChild(root_0, expr_rel33.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr_if"


	public static class expr_rel_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr_rel"
	// Calc.g:91:1: expr_rel : expr_plus ( ( GREATER ^| SMALLER ^| GREATEREQ ^| SMALLEREQ ^| EQUALS ^| NOTEQUALS ^) expr_plus )* ;
	public final CalcParser.expr_rel_return expr_rel() throws RecognitionException {
		CalcParser.expr_rel_return retval = new CalcParser.expr_rel_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token GREATER35=null;
		Token SMALLER36=null;
		Token GREATEREQ37=null;
		Token SMALLEREQ38=null;
		Token EQUALS39=null;
		Token NOTEQUALS40=null;
		ParserRuleReturnScope expr_plus34 =null;
		ParserRuleReturnScope expr_plus41 =null;

		Object GREATER35_tree=null;
		Object SMALLER36_tree=null;
		Object GREATEREQ37_tree=null;
		Object SMALLEREQ38_tree=null;
		Object EQUALS39_tree=null;
		Object NOTEQUALS40_tree=null;

		try {
			// Calc.g:92:2: ( expr_plus ( ( GREATER ^| SMALLER ^| GREATEREQ ^| SMALLEREQ ^| EQUALS ^| NOTEQUALS ^) expr_plus )* )
			// Calc.g:92:4: expr_plus ( ( GREATER ^| SMALLER ^| GREATEREQ ^| SMALLEREQ ^| EQUALS ^| NOTEQUALS ^) expr_plus )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr_plus_in_expr_rel863);
			expr_plus34=expr_plus();
			state._fsp--;

			adaptor.addChild(root_0, expr_plus34.getTree());

			// Calc.g:92:14: ( ( GREATER ^| SMALLER ^| GREATEREQ ^| SMALLEREQ ^| EQUALS ^| NOTEQUALS ^) expr_plus )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= EQUALS && LA6_0 <= GREATEREQ)||LA6_0==NOTEQUALS||(LA6_0 >= SMALLER && LA6_0 <= SMALLEREQ)) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// Calc.g:92:15: ( GREATER ^| SMALLER ^| GREATEREQ ^| SMALLEREQ ^| EQUALS ^| NOTEQUALS ^) expr_plus
					{
					// Calc.g:92:15: ( GREATER ^| SMALLER ^| GREATEREQ ^| SMALLEREQ ^| EQUALS ^| NOTEQUALS ^)
					int alt5=6;
					switch ( input.LA(1) ) {
					case GREATER:
						{
						alt5=1;
						}
						break;
					case SMALLER:
						{
						alt5=2;
						}
						break;
					case GREATEREQ:
						{
						alt5=3;
						}
						break;
					case SMALLEREQ:
						{
						alt5=4;
						}
						break;
					case EQUALS:
						{
						alt5=5;
						}
						break;
					case NOTEQUALS:
						{
						alt5=6;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 5, 0, input);
						throw nvae;
					}
					switch (alt5) {
						case 1 :
							// Calc.g:92:16: GREATER ^
							{
							GREATER35=(Token)match(input,GREATER,FOLLOW_GREATER_in_expr_rel867); 
							GREATER35_tree = (Object)adaptor.create(GREATER35);
							root_0 = (Object)adaptor.becomeRoot(GREATER35_tree, root_0);

							}
							break;
						case 2 :
							// Calc.g:92:27: SMALLER ^
							{
							SMALLER36=(Token)match(input,SMALLER,FOLLOW_SMALLER_in_expr_rel872); 
							SMALLER36_tree = (Object)adaptor.create(SMALLER36);
							root_0 = (Object)adaptor.becomeRoot(SMALLER36_tree, root_0);

							}
							break;
						case 3 :
							// Calc.g:92:38: GREATEREQ ^
							{
							GREATEREQ37=(Token)match(input,GREATEREQ,FOLLOW_GREATEREQ_in_expr_rel877); 
							GREATEREQ37_tree = (Object)adaptor.create(GREATEREQ37);
							root_0 = (Object)adaptor.becomeRoot(GREATEREQ37_tree, root_0);

							}
							break;
						case 4 :
							// Calc.g:92:51: SMALLEREQ ^
							{
							SMALLEREQ38=(Token)match(input,SMALLEREQ,FOLLOW_SMALLEREQ_in_expr_rel882); 
							SMALLEREQ38_tree = (Object)adaptor.create(SMALLEREQ38);
							root_0 = (Object)adaptor.becomeRoot(SMALLEREQ38_tree, root_0);

							}
							break;
						case 5 :
							// Calc.g:92:64: EQUALS ^
							{
							EQUALS39=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_expr_rel887); 
							EQUALS39_tree = (Object)adaptor.create(EQUALS39);
							root_0 = (Object)adaptor.becomeRoot(EQUALS39_tree, root_0);

							}
							break;
						case 6 :
							// Calc.g:92:74: NOTEQUALS ^
							{
							NOTEQUALS40=(Token)match(input,NOTEQUALS,FOLLOW_NOTEQUALS_in_expr_rel892); 
							NOTEQUALS40_tree = (Object)adaptor.create(NOTEQUALS40);
							root_0 = (Object)adaptor.becomeRoot(NOTEQUALS40_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_expr_plus_in_expr_rel897);
					expr_plus41=expr_plus();
					state._fsp--;

					adaptor.addChild(root_0, expr_plus41.getTree());

					}
					break;

				default :
					break loop6;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr_rel"


	public static class expr_plus_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr_plus"
	// Calc.g:95:1: expr_plus : expr_times ( ( PLUS ^| MINUS ^) expr_times )* ;
	public final CalcParser.expr_plus_return expr_plus() throws RecognitionException {
		CalcParser.expr_plus_return retval = new CalcParser.expr_plus_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PLUS43=null;
		Token MINUS44=null;
		ParserRuleReturnScope expr_times42 =null;
		ParserRuleReturnScope expr_times45 =null;

		Object PLUS43_tree=null;
		Object MINUS44_tree=null;

		try {
			// Calc.g:96:5: ( expr_times ( ( PLUS ^| MINUS ^) expr_times )* )
			// Calc.g:96:9: expr_times ( ( PLUS ^| MINUS ^) expr_times )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr_times_in_expr_plus919);
			expr_times42=expr_times();
			state._fsp--;

			adaptor.addChild(root_0, expr_times42.getTree());

			// Calc.g:96:20: ( ( PLUS ^| MINUS ^) expr_times )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==MINUS||LA8_0==PLUS) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// Calc.g:96:21: ( PLUS ^| MINUS ^) expr_times
					{
					// Calc.g:96:21: ( PLUS ^| MINUS ^)
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==PLUS) ) {
						alt7=1;
					}
					else if ( (LA7_0==MINUS) ) {
						alt7=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 7, 0, input);
						throw nvae;
					}

					switch (alt7) {
						case 1 :
							// Calc.g:96:22: PLUS ^
							{
							PLUS43=(Token)match(input,PLUS,FOLLOW_PLUS_in_expr_plus923); 
							PLUS43_tree = (Object)adaptor.create(PLUS43);
							root_0 = (Object)adaptor.becomeRoot(PLUS43_tree, root_0);

							}
							break;
						case 2 :
							// Calc.g:96:30: MINUS ^
							{
							MINUS44=(Token)match(input,MINUS,FOLLOW_MINUS_in_expr_plus928); 
							MINUS44_tree = (Object)adaptor.create(MINUS44);
							root_0 = (Object)adaptor.becomeRoot(MINUS44_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_expr_times_in_expr_plus932);
					expr_times45=expr_times();
					state._fsp--;

					adaptor.addChild(root_0, expr_times45.getTree());

					}
					break;

				default :
					break loop8;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr_plus"


	public static class expr_times_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr_times"
	// Calc.g:99:1: expr_times : operand ( ( TIMES ^| QUOTIENT ^) operand )* ;
	public final CalcParser.expr_times_return expr_times() throws RecognitionException {
		CalcParser.expr_times_return retval = new CalcParser.expr_times_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TIMES47=null;
		Token QUOTIENT48=null;
		ParserRuleReturnScope operand46 =null;
		ParserRuleReturnScope operand49 =null;

		Object TIMES47_tree=null;
		Object QUOTIENT48_tree=null;

		try {
			// Calc.g:100:2: ( operand ( ( TIMES ^| QUOTIENT ^) operand )* )
			// Calc.g:100:4: operand ( ( TIMES ^| QUOTIENT ^) operand )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_operand_in_expr_times953);
			operand46=operand();
			state._fsp--;

			adaptor.addChild(root_0, operand46.getTree());

			// Calc.g:100:12: ( ( TIMES ^| QUOTIENT ^) operand )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==QUOTIENT||LA10_0==TIMES) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// Calc.g:100:13: ( TIMES ^| QUOTIENT ^) operand
					{
					// Calc.g:100:13: ( TIMES ^| QUOTIENT ^)
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==TIMES) ) {
						alt9=1;
					}
					else if ( (LA9_0==QUOTIENT) ) {
						alt9=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 9, 0, input);
						throw nvae;
					}

					switch (alt9) {
						case 1 :
							// Calc.g:100:14: TIMES ^
							{
							TIMES47=(Token)match(input,TIMES,FOLLOW_TIMES_in_expr_times957); 
							TIMES47_tree = (Object)adaptor.create(TIMES47);
							root_0 = (Object)adaptor.becomeRoot(TIMES47_tree, root_0);

							}
							break;
						case 2 :
							// Calc.g:100:23: QUOTIENT ^
							{
							QUOTIENT48=(Token)match(input,QUOTIENT,FOLLOW_QUOTIENT_in_expr_times962); 
							QUOTIENT48_tree = (Object)adaptor.create(QUOTIENT48);
							root_0 = (Object)adaptor.becomeRoot(QUOTIENT48_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_operand_in_expr_times966);
					operand49=operand();
					state._fsp--;

					adaptor.addChild(root_0, operand49.getTree());

					}
					break;

				default :
					break loop10;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr_times"


	public static class operand_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "operand"
	// Calc.g:103:1: operand : ( IDENTIFIER | NUMBER | LPAREN ! expr_plus RPAREN !);
	public final CalcParser.operand_return operand() throws RecognitionException {
		CalcParser.operand_return retval = new CalcParser.operand_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER50=null;
		Token NUMBER51=null;
		Token LPAREN52=null;
		Token RPAREN54=null;
		ParserRuleReturnScope expr_plus53 =null;

		Object IDENTIFIER50_tree=null;
		Object NUMBER51_tree=null;
		Object LPAREN52_tree=null;
		Object RPAREN54_tree=null;

		try {
			// Calc.g:104:5: ( IDENTIFIER | NUMBER | LPAREN ! expr_plus RPAREN !)
			int alt11=3;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
				{
				alt11=1;
				}
				break;
			case NUMBER:
				{
				alt11=2;
				}
				break;
			case LPAREN:
				{
				alt11=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// Calc.g:104:9: IDENTIFIER
					{
					root_0 = (Object)adaptor.nil();


					IDENTIFIER50=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand985); 
					IDENTIFIER50_tree = (Object)adaptor.create(IDENTIFIER50);
					adaptor.addChild(root_0, IDENTIFIER50_tree);

					}
					break;
				case 2 :
					// Calc.g:105:9: NUMBER
					{
					root_0 = (Object)adaptor.nil();


					NUMBER51=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_operand995); 
					NUMBER51_tree = (Object)adaptor.create(NUMBER51);
					adaptor.addChild(root_0, NUMBER51_tree);

					}
					break;
				case 3 :
					// Calc.g:106:9: LPAREN ! expr_plus RPAREN !
					{
					root_0 = (Object)adaptor.nil();


					LPAREN52=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_operand1005); 
					pushFollow(FOLLOW_expr_plus_in_operand1008);
					expr_plus53=expr_plus();
					state._fsp--;

					adaptor.addChild(root_0, expr_plus53.getTree());

					RPAREN54=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_operand1010); 
					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "operand"


	public static class type_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "type"
	// Calc.g:109:1: type : INTEGER ;
	public final CalcParser.type_return type() throws RecognitionException {
		CalcParser.type_return retval = new CalcParser.type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token INTEGER55=null;

		Object INTEGER55_tree=null;

		try {
			// Calc.g:110:5: ( INTEGER )
			// Calc.g:110:9: INTEGER
			{
			root_0 = (Object)adaptor.nil();


			INTEGER55=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_type1030); 
			INTEGER55_tree = (Object)adaptor.create(INTEGER55);
			adaptor.addChild(root_0, INTEGER55_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type"

	// Delegated rules



	public static final BitSet FOLLOW_program_lines_in_program594 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_program596 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_program_lines637 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_declaration_in_program_lines641 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_program_lines644 = new BitSet(new long[]{0x0000000440802002L});
	public static final BitSet FOLLOW_VAR_in_declaration663 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration666 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_COLON_in_declaration668 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_type_in_declaration671 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_in_statement694 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_stat_in_statement704 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_swap_stat_in_statement712 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lvalue_in_assignment731 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_BECOMES_in_assignment733 = new BitSet(new long[]{0x0000000000246000L});
	public static final BitSet FOLLOW_expr_if_in_assignment736 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_print_stat755 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_LPAREN_in_print_stat758 = new BitSet(new long[]{0x0000000000246000L});
	public static final BitSet FOLLOW_expr_if_in_print_stat761 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_RPAREN_in_print_stat763 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SWAP_in_swap_stat782 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_LPAREN_in_swap_stat785 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_swap_stat788 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_COMMA_in_swap_stat790 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_swap_stat793 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_RPAREN_in_swap_stat795 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_lvalue812 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_expr_if830 = new BitSet(new long[]{0x0000000000246000L});
	public static final BitSet FOLLOW_expr_if_in_expr_if833 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_THEN_in_expr_if835 = new BitSet(new long[]{0x0000000000246000L});
	public static final BitSet FOLLOW_expr_if_in_expr_if838 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ELSE_in_expr_if840 = new BitSet(new long[]{0x0000000000246000L});
	public static final BitSet FOLLOW_expr_if_in_expr_if843 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_rel_in_expr_if848 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_plus_in_expr_rel863 = new BitSet(new long[]{0x0000000030101C02L});
	public static final BitSet FOLLOW_GREATER_in_expr_rel867 = new BitSet(new long[]{0x0000000000242000L});
	public static final BitSet FOLLOW_SMALLER_in_expr_rel872 = new BitSet(new long[]{0x0000000000242000L});
	public static final BitSet FOLLOW_GREATEREQ_in_expr_rel877 = new BitSet(new long[]{0x0000000000242000L});
	public static final BitSet FOLLOW_SMALLEREQ_in_expr_rel882 = new BitSet(new long[]{0x0000000000242000L});
	public static final BitSet FOLLOW_EQUALS_in_expr_rel887 = new BitSet(new long[]{0x0000000000242000L});
	public static final BitSet FOLLOW_NOTEQUALS_in_expr_rel892 = new BitSet(new long[]{0x0000000000242000L});
	public static final BitSet FOLLOW_expr_plus_in_expr_rel897 = new BitSet(new long[]{0x0000000030101C02L});
	public static final BitSet FOLLOW_expr_times_in_expr_plus919 = new BitSet(new long[]{0x0000000000480002L});
	public static final BitSet FOLLOW_PLUS_in_expr_plus923 = new BitSet(new long[]{0x0000000000242000L});
	public static final BitSet FOLLOW_MINUS_in_expr_plus928 = new BitSet(new long[]{0x0000000000242000L});
	public static final BitSet FOLLOW_expr_times_in_expr_plus932 = new BitSet(new long[]{0x0000000000480002L});
	public static final BitSet FOLLOW_operand_in_expr_times953 = new BitSet(new long[]{0x0000000102000002L});
	public static final BitSet FOLLOW_TIMES_in_expr_times957 = new BitSet(new long[]{0x0000000000242000L});
	public static final BitSet FOLLOW_QUOTIENT_in_expr_times962 = new BitSet(new long[]{0x0000000000242000L});
	public static final BitSet FOLLOW_operand_in_expr_times966 = new BitSet(new long[]{0x0000000102000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand985 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_operand995 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_operand1005 = new BitSet(new long[]{0x0000000000242000L});
	public static final BitSet FOLLOW_expr_plus_in_operand1008 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_RPAREN_in_operand1010 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_type1030 = new BitSet(new long[]{0x0000000000000002L});
}
