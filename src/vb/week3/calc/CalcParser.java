// $ANTLR 3.5 Calc.g 2013-05-16 11:30:27

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
		"DIGIT", "ELSE", "IDENTIFIER", "IF", "INTEGER", "LETTER", "LOWER", "LPAREN", 
		"MINUS", "NUMBER", "PLUS", "PRINT", "PROGRAM", "QUOTIENT", "RPAREN", "SEMICOLON", 
		"SWAP", "THEN", "TIMES", "UPPER", "VAR", "WS"
	};
	public static final int EOF=-1;
	public static final int BECOMES=4;
	public static final int COLON=5;
	public static final int COMMA=6;
	public static final int COMMENT=7;
	public static final int DIGIT=8;
	public static final int ELSE=9;
	public static final int IDENTIFIER=10;
	public static final int IF=11;
	public static final int INTEGER=12;
	public static final int LETTER=13;
	public static final int LOWER=14;
	public static final int LPAREN=15;
	public static final int MINUS=16;
	public static final int NUMBER=17;
	public static final int PLUS=18;
	public static final int PRINT=19;
	public static final int PROGRAM=20;
	public static final int QUOTIENT=21;
	public static final int RPAREN=22;
	public static final int SEMICOLON=23;
	public static final int SWAP=24;
	public static final int THEN=25;
	public static final int TIMES=26;
	public static final int UPPER=27;
	public static final int VAR=28;
	public static final int WS=29;

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
	// Calc.g:44:1: program : declarations statements EOF -> ^( PROGRAM ( declarations )? statements ) ;
	public final CalcParser.program_return program() throws RecognitionException {
		CalcParser.program_return retval = new CalcParser.program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EOF3=null;
		ParserRuleReturnScope declarations1 =null;
		ParserRuleReturnScope statements2 =null;

		Object EOF3_tree=null;
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleSubtreeStream stream_statements=new RewriteRuleSubtreeStream(adaptor,"rule statements");
		RewriteRuleSubtreeStream stream_declarations=new RewriteRuleSubtreeStream(adaptor,"rule declarations");

		try {
			// Calc.g:45:5: ( declarations statements EOF -> ^( PROGRAM ( declarations )? statements ) )
			// Calc.g:45:9: declarations statements EOF
			{
			pushFollow(FOLLOW_declarations_in_program512);
			declarations1=declarations();
			state._fsp--;

			stream_declarations.add(declarations1.getTree());
			pushFollow(FOLLOW_statements_in_program514);
			statements2=statements();
			state._fsp--;

			stream_statements.add(statements2.getTree());
			EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_program516);  
			stream_EOF.add(EOF3);

			// AST REWRITE
			// elements: declarations, statements
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 46:13: -> ^( PROGRAM ( declarations )? statements )
			{
				// Calc.g:46:17: ^( PROGRAM ( declarations )? statements )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROGRAM, "PROGRAM"), root_1);
				// Calc.g:46:27: ( declarations )?
				if ( stream_declarations.hasNext() ) {
					adaptor.addChild(root_1, stream_declarations.nextTree());
				}
				stream_declarations.reset();

				adaptor.addChild(root_1, stream_statements.nextTree());
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


	public static class declarations_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "declarations"
	// Calc.g:49:1: declarations : ( declaration SEMICOLON !)* ;
	public final CalcParser.declarations_return declarations() throws RecognitionException {
		CalcParser.declarations_return retval = new CalcParser.declarations_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SEMICOLON5=null;
		ParserRuleReturnScope declaration4 =null;

		Object SEMICOLON5_tree=null;

		try {
			// Calc.g:50:5: ( ( declaration SEMICOLON !)* )
			// Calc.g:50:9: ( declaration SEMICOLON !)*
			{
			root_0 = (Object)adaptor.nil();


			// Calc.g:50:9: ( declaration SEMICOLON !)*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==VAR) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// Calc.g:50:10: declaration SEMICOLON !
					{
					pushFollow(FOLLOW_declaration_in_declarations564);
					declaration4=declaration();
					state._fsp--;

					adaptor.addChild(root_0, declaration4.getTree());

					SEMICOLON5=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_declarations566); 
					}
					break;

				default :
					break loop1;
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
	// $ANTLR end "declarations"


	public static class statements_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "statements"
	// Calc.g:53:1: statements : ( statement SEMICOLON !)+ ;
	public final CalcParser.statements_return statements() throws RecognitionException {
		CalcParser.statements_return retval = new CalcParser.statements_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SEMICOLON7=null;
		ParserRuleReturnScope statement6 =null;

		Object SEMICOLON7_tree=null;

		try {
			// Calc.g:54:5: ( ( statement SEMICOLON !)+ )
			// Calc.g:54:9: ( statement SEMICOLON !)+
			{
			root_0 = (Object)adaptor.nil();


			// Calc.g:54:9: ( statement SEMICOLON !)+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==IDENTIFIER||LA2_0==PRINT||LA2_0==SWAP) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// Calc.g:54:10: statement SEMICOLON !
					{
					pushFollow(FOLLOW_statement_in_statements593);
					statement6=statement();
					state._fsp--;

					adaptor.addChild(root_0, statement6.getTree());

					SEMICOLON7=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_statements595); 
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
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
	// $ANTLR end "statements"


	public static class declaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "declaration"
	// Calc.g:57:1: declaration : VAR ^ IDENTIFIER COLON ! type ;
	public final CalcParser.declaration_return declaration() throws RecognitionException {
		CalcParser.declaration_return retval = new CalcParser.declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token VAR8=null;
		Token IDENTIFIER9=null;
		Token COLON10=null;
		ParserRuleReturnScope type11 =null;

		Object VAR8_tree=null;
		Object IDENTIFIER9_tree=null;
		Object COLON10_tree=null;

		try {
			// Calc.g:58:5: ( VAR ^ IDENTIFIER COLON ! type )
			// Calc.g:58:9: VAR ^ IDENTIFIER COLON ! type
			{
			root_0 = (Object)adaptor.nil();


			VAR8=(Token)match(input,VAR,FOLLOW_VAR_in_declaration617); 
			VAR8_tree = (Object)adaptor.create(VAR8);
			root_0 = (Object)adaptor.becomeRoot(VAR8_tree, root_0);

			IDENTIFIER9=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration620); 
			IDENTIFIER9_tree = (Object)adaptor.create(IDENTIFIER9);
			adaptor.addChild(root_0, IDENTIFIER9_tree);

			COLON10=(Token)match(input,COLON,FOLLOW_COLON_in_declaration622); 
			pushFollow(FOLLOW_type_in_declaration625);
			type11=type();
			state._fsp--;

			adaptor.addChild(root_0, type11.getTree());

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
	// Calc.g:61:1: statement : ( assignment | print_stat | swap_stat );
	public final CalcParser.statement_return statement() throws RecognitionException {
		CalcParser.statement_return retval = new CalcParser.statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope assignment12 =null;
		ParserRuleReturnScope print_stat13 =null;
		ParserRuleReturnScope swap_stat14 =null;


		try {
			// Calc.g:62:5: ( assignment | print_stat | swap_stat )
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
					// Calc.g:62:9: assignment
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_assignment_in_statement648);
					assignment12=assignment();
					state._fsp--;

					adaptor.addChild(root_0, assignment12.getTree());

					}
					break;
				case 2 :
					// Calc.g:63:9: print_stat
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_print_stat_in_statement658);
					print_stat13=print_stat();
					state._fsp--;

					adaptor.addChild(root_0, print_stat13.getTree());

					}
					break;
				case 3 :
					// Calc.g:64:7: swap_stat
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_swap_stat_in_statement666);
					swap_stat14=swap_stat();
					state._fsp--;

					adaptor.addChild(root_0, swap_stat14.getTree());

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
	// Calc.g:67:1: assignment : lvalue BECOMES ^ expr1 ;
	public final CalcParser.assignment_return assignment() throws RecognitionException {
		CalcParser.assignment_return retval = new CalcParser.assignment_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token BECOMES16=null;
		ParserRuleReturnScope lvalue15 =null;
		ParserRuleReturnScope expr117 =null;

		Object BECOMES16_tree=null;

		try {
			// Calc.g:68:5: ( lvalue BECOMES ^ expr1 )
			// Calc.g:68:9: lvalue BECOMES ^ expr1
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_lvalue_in_assignment685);
			lvalue15=lvalue();
			state._fsp--;

			adaptor.addChild(root_0, lvalue15.getTree());

			BECOMES16=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_assignment687); 
			BECOMES16_tree = (Object)adaptor.create(BECOMES16);
			root_0 = (Object)adaptor.becomeRoot(BECOMES16_tree, root_0);

			pushFollow(FOLLOW_expr1_in_assignment690);
			expr117=expr1();
			state._fsp--;

			adaptor.addChild(root_0, expr117.getTree());

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
	// Calc.g:71:1: print_stat : PRINT ^ LPAREN ! expr1 RPAREN !;
	public final CalcParser.print_stat_return print_stat() throws RecognitionException {
		CalcParser.print_stat_return retval = new CalcParser.print_stat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PRINT18=null;
		Token LPAREN19=null;
		Token RPAREN21=null;
		ParserRuleReturnScope expr120 =null;

		Object PRINT18_tree=null;
		Object LPAREN19_tree=null;
		Object RPAREN21_tree=null;

		try {
			// Calc.g:72:5: ( PRINT ^ LPAREN ! expr1 RPAREN !)
			// Calc.g:72:9: PRINT ^ LPAREN ! expr1 RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			PRINT18=(Token)match(input,PRINT,FOLLOW_PRINT_in_print_stat709); 
			PRINT18_tree = (Object)adaptor.create(PRINT18);
			root_0 = (Object)adaptor.becomeRoot(PRINT18_tree, root_0);

			LPAREN19=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_print_stat712); 
			pushFollow(FOLLOW_expr1_in_print_stat715);
			expr120=expr1();
			state._fsp--;

			adaptor.addChild(root_0, expr120.getTree());

			RPAREN21=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_print_stat717); 
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
	// Calc.g:75:1: swap_stat : SWAP ^ LPAREN ! IDENTIFIER COMMA ! IDENTIFIER RPAREN !;
	public final CalcParser.swap_stat_return swap_stat() throws RecognitionException {
		CalcParser.swap_stat_return retval = new CalcParser.swap_stat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SWAP22=null;
		Token LPAREN23=null;
		Token IDENTIFIER24=null;
		Token COMMA25=null;
		Token IDENTIFIER26=null;
		Token RPAREN27=null;

		Object SWAP22_tree=null;
		Object LPAREN23_tree=null;
		Object IDENTIFIER24_tree=null;
		Object COMMA25_tree=null;
		Object IDENTIFIER26_tree=null;
		Object RPAREN27_tree=null;

		try {
			// Calc.g:76:2: ( SWAP ^ LPAREN ! IDENTIFIER COMMA ! IDENTIFIER RPAREN !)
			// Calc.g:76:4: SWAP ^ LPAREN ! IDENTIFIER COMMA ! IDENTIFIER RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			SWAP22=(Token)match(input,SWAP,FOLLOW_SWAP_in_swap_stat736); 
			SWAP22_tree = (Object)adaptor.create(SWAP22);
			root_0 = (Object)adaptor.becomeRoot(SWAP22_tree, root_0);

			LPAREN23=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_swap_stat739); 
			IDENTIFIER24=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_swap_stat742); 
			IDENTIFIER24_tree = (Object)adaptor.create(IDENTIFIER24);
			adaptor.addChild(root_0, IDENTIFIER24_tree);

			COMMA25=(Token)match(input,COMMA,FOLLOW_COMMA_in_swap_stat744); 
			IDENTIFIER26=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_swap_stat747); 
			IDENTIFIER26_tree = (Object)adaptor.create(IDENTIFIER26);
			adaptor.addChild(root_0, IDENTIFIER26_tree);

			RPAREN27=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_swap_stat749); 
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
	// Calc.g:79:1: lvalue : IDENTIFIER ;
	public final CalcParser.lvalue_return lvalue() throws RecognitionException {
		CalcParser.lvalue_return retval = new CalcParser.lvalue_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER28=null;

		Object IDENTIFIER28_tree=null;

		try {
			// Calc.g:80:5: ( IDENTIFIER )
			// Calc.g:80:9: IDENTIFIER
			{
			root_0 = (Object)adaptor.nil();


			IDENTIFIER28=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_lvalue766); 
			IDENTIFIER28_tree = (Object)adaptor.create(IDENTIFIER28);
			adaptor.addChild(root_0, IDENTIFIER28_tree);

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


	public static class expr1_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr1"
	// Calc.g:83:1: expr1 : ( expr2 ( ( PLUS ^| MINUS ^) expr2 )* | if_expr );
	public final CalcParser.expr1_return expr1() throws RecognitionException {
		CalcParser.expr1_return retval = new CalcParser.expr1_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PLUS30=null;
		Token MINUS31=null;
		ParserRuleReturnScope expr229 =null;
		ParserRuleReturnScope expr232 =null;
		ParserRuleReturnScope if_expr33 =null;

		Object PLUS30_tree=null;
		Object MINUS31_tree=null;

		try {
			// Calc.g:84:5: ( expr2 ( ( PLUS ^| MINUS ^) expr2 )* | if_expr )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==IDENTIFIER||LA6_0==LPAREN||LA6_0==NUMBER) ) {
				alt6=1;
			}
			else if ( (LA6_0==IF) ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// Calc.g:84:9: expr2 ( ( PLUS ^| MINUS ^) expr2 )*
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expr2_in_expr1789);
					expr229=expr2();
					state._fsp--;

					adaptor.addChild(root_0, expr229.getTree());

					// Calc.g:84:15: ( ( PLUS ^| MINUS ^) expr2 )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( (LA5_0==MINUS||LA5_0==PLUS) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// Calc.g:84:16: ( PLUS ^| MINUS ^) expr2
							{
							// Calc.g:84:16: ( PLUS ^| MINUS ^)
							int alt4=2;
							int LA4_0 = input.LA(1);
							if ( (LA4_0==PLUS) ) {
								alt4=1;
							}
							else if ( (LA4_0==MINUS) ) {
								alt4=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 4, 0, input);
								throw nvae;
							}

							switch (alt4) {
								case 1 :
									// Calc.g:84:17: PLUS ^
									{
									PLUS30=(Token)match(input,PLUS,FOLLOW_PLUS_in_expr1793); 
									PLUS30_tree = (Object)adaptor.create(PLUS30);
									root_0 = (Object)adaptor.becomeRoot(PLUS30_tree, root_0);

									}
									break;
								case 2 :
									// Calc.g:84:25: MINUS ^
									{
									MINUS31=(Token)match(input,MINUS,FOLLOW_MINUS_in_expr1798); 
									MINUS31_tree = (Object)adaptor.create(MINUS31);
									root_0 = (Object)adaptor.becomeRoot(MINUS31_tree, root_0);

									}
									break;

							}

							pushFollow(FOLLOW_expr2_in_expr1802);
							expr232=expr2();
							state._fsp--;

							adaptor.addChild(root_0, expr232.getTree());

							}
							break;

						default :
							break loop5;
						}
					}

					}
					break;
				case 2 :
					// Calc.g:85:7: if_expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_if_expr_in_expr1813);
					if_expr33=if_expr();
					state._fsp--;

					adaptor.addChild(root_0, if_expr33.getTree());

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
	// $ANTLR end "expr1"


	public static class expr2_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr2"
	// Calc.g:88:1: expr2 : operand ( ( TIMES ^| QUOTIENT ^) operand )* ;
	public final CalcParser.expr2_return expr2() throws RecognitionException {
		CalcParser.expr2_return retval = new CalcParser.expr2_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TIMES35=null;
		Token QUOTIENT36=null;
		ParserRuleReturnScope operand34 =null;
		ParserRuleReturnScope operand37 =null;

		Object TIMES35_tree=null;
		Object QUOTIENT36_tree=null;

		try {
			// Calc.g:89:2: ( operand ( ( TIMES ^| QUOTIENT ^) operand )* )
			// Calc.g:89:4: operand ( ( TIMES ^| QUOTIENT ^) operand )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_operand_in_expr2831);
			operand34=operand();
			state._fsp--;

			adaptor.addChild(root_0, operand34.getTree());

			// Calc.g:89:12: ( ( TIMES ^| QUOTIENT ^) operand )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==QUOTIENT||LA8_0==TIMES) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// Calc.g:89:13: ( TIMES ^| QUOTIENT ^) operand
					{
					// Calc.g:89:13: ( TIMES ^| QUOTIENT ^)
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==TIMES) ) {
						alt7=1;
					}
					else if ( (LA7_0==QUOTIENT) ) {
						alt7=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 7, 0, input);
						throw nvae;
					}

					switch (alt7) {
						case 1 :
							// Calc.g:89:14: TIMES ^
							{
							TIMES35=(Token)match(input,TIMES,FOLLOW_TIMES_in_expr2835); 
							TIMES35_tree = (Object)adaptor.create(TIMES35);
							root_0 = (Object)adaptor.becomeRoot(TIMES35_tree, root_0);

							}
							break;
						case 2 :
							// Calc.g:89:23: QUOTIENT ^
							{
							QUOTIENT36=(Token)match(input,QUOTIENT,FOLLOW_QUOTIENT_in_expr2840); 
							QUOTIENT36_tree = (Object)adaptor.create(QUOTIENT36);
							root_0 = (Object)adaptor.becomeRoot(QUOTIENT36_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_operand_in_expr2844);
					operand37=operand();
					state._fsp--;

					adaptor.addChild(root_0, operand37.getTree());

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
	// $ANTLR end "expr2"


	public static class if_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "if_expr"
	// Calc.g:92:1: if_expr : IF ^ expr1 THEN ! expr1 ELSE ! expr1 ;
	public final CalcParser.if_expr_return if_expr() throws RecognitionException {
		CalcParser.if_expr_return retval = new CalcParser.if_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IF38=null;
		Token THEN40=null;
		Token ELSE42=null;
		ParserRuleReturnScope expr139 =null;
		ParserRuleReturnScope expr141 =null;
		ParserRuleReturnScope expr143 =null;

		Object IF38_tree=null;
		Object THEN40_tree=null;
		Object ELSE42_tree=null;

		try {
			// Calc.g:93:2: ( IF ^ expr1 THEN ! expr1 ELSE ! expr1 )
			// Calc.g:93:4: IF ^ expr1 THEN ! expr1 ELSE ! expr1
			{
			root_0 = (Object)adaptor.nil();


			IF38=(Token)match(input,IF,FOLLOW_IF_in_if_expr859); 
			IF38_tree = (Object)adaptor.create(IF38);
			root_0 = (Object)adaptor.becomeRoot(IF38_tree, root_0);

			pushFollow(FOLLOW_expr1_in_if_expr862);
			expr139=expr1();
			state._fsp--;

			adaptor.addChild(root_0, expr139.getTree());

			THEN40=(Token)match(input,THEN,FOLLOW_THEN_in_if_expr864); 
			pushFollow(FOLLOW_expr1_in_if_expr867);
			expr141=expr1();
			state._fsp--;

			adaptor.addChild(root_0, expr141.getTree());

			ELSE42=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_expr869); 
			pushFollow(FOLLOW_expr1_in_if_expr872);
			expr143=expr1();
			state._fsp--;

			adaptor.addChild(root_0, expr143.getTree());

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
	// $ANTLR end "if_expr"


	public static class operand_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "operand"
	// Calc.g:97:1: operand : ( IDENTIFIER | NUMBER | LPAREN ! expr1 RPAREN !);
	public final CalcParser.operand_return operand() throws RecognitionException {
		CalcParser.operand_return retval = new CalcParser.operand_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER44=null;
		Token NUMBER45=null;
		Token LPAREN46=null;
		Token RPAREN48=null;
		ParserRuleReturnScope expr147 =null;

		Object IDENTIFIER44_tree=null;
		Object NUMBER45_tree=null;
		Object LPAREN46_tree=null;
		Object RPAREN48_tree=null;

		try {
			// Calc.g:98:5: ( IDENTIFIER | NUMBER | LPAREN ! expr1 RPAREN !)
			int alt9=3;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
				{
				alt9=1;
				}
				break;
			case NUMBER:
				{
				alt9=2;
				}
				break;
			case LPAREN:
				{
				alt9=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// Calc.g:98:9: IDENTIFIER
					{
					root_0 = (Object)adaptor.nil();


					IDENTIFIER44=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand890); 
					IDENTIFIER44_tree = (Object)adaptor.create(IDENTIFIER44);
					adaptor.addChild(root_0, IDENTIFIER44_tree);

					}
					break;
				case 2 :
					// Calc.g:99:9: NUMBER
					{
					root_0 = (Object)adaptor.nil();


					NUMBER45=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_operand900); 
					NUMBER45_tree = (Object)adaptor.create(NUMBER45);
					adaptor.addChild(root_0, NUMBER45_tree);

					}
					break;
				case 3 :
					// Calc.g:100:9: LPAREN ! expr1 RPAREN !
					{
					root_0 = (Object)adaptor.nil();


					LPAREN46=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_operand910); 
					pushFollow(FOLLOW_expr1_in_operand913);
					expr147=expr1();
					state._fsp--;

					adaptor.addChild(root_0, expr147.getTree());

					RPAREN48=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_operand915); 
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
	// Calc.g:103:1: type : INTEGER ;
	public final CalcParser.type_return type() throws RecognitionException {
		CalcParser.type_return retval = new CalcParser.type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token INTEGER49=null;

		Object INTEGER49_tree=null;

		try {
			// Calc.g:104:5: ( INTEGER )
			// Calc.g:104:9: INTEGER
			{
			root_0 = (Object)adaptor.nil();


			INTEGER49=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_type935); 
			INTEGER49_tree = (Object)adaptor.create(INTEGER49);
			adaptor.addChild(root_0, INTEGER49_tree);

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



	public static final BitSet FOLLOW_declarations_in_program512 = new BitSet(new long[]{0x0000000001080400L});
	public static final BitSet FOLLOW_statements_in_program514 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_program516 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_declarations564 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_SEMICOLON_in_declarations566 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_statement_in_statements593 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_SEMICOLON_in_statements595 = new BitSet(new long[]{0x0000000001080402L});
	public static final BitSet FOLLOW_VAR_in_declaration617 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration620 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_COLON_in_declaration622 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_type_in_declaration625 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_in_statement648 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_stat_in_statement658 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_swap_stat_in_statement666 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lvalue_in_assignment685 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_BECOMES_in_assignment687 = new BitSet(new long[]{0x0000000000028C00L});
	public static final BitSet FOLLOW_expr1_in_assignment690 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_print_stat709 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_LPAREN_in_print_stat712 = new BitSet(new long[]{0x0000000000028C00L});
	public static final BitSet FOLLOW_expr1_in_print_stat715 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_RPAREN_in_print_stat717 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SWAP_in_swap_stat736 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_LPAREN_in_swap_stat739 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_IDENTIFIER_in_swap_stat742 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_COMMA_in_swap_stat744 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_IDENTIFIER_in_swap_stat747 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_RPAREN_in_swap_stat749 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_lvalue766 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr2_in_expr1789 = new BitSet(new long[]{0x0000000000050002L});
	public static final BitSet FOLLOW_PLUS_in_expr1793 = new BitSet(new long[]{0x0000000000028400L});
	public static final BitSet FOLLOW_MINUS_in_expr1798 = new BitSet(new long[]{0x0000000000028400L});
	public static final BitSet FOLLOW_expr2_in_expr1802 = new BitSet(new long[]{0x0000000000050002L});
	public static final BitSet FOLLOW_if_expr_in_expr1813 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_operand_in_expr2831 = new BitSet(new long[]{0x0000000004200002L});
	public static final BitSet FOLLOW_TIMES_in_expr2835 = new BitSet(new long[]{0x0000000000028400L});
	public static final BitSet FOLLOW_QUOTIENT_in_expr2840 = new BitSet(new long[]{0x0000000000028400L});
	public static final BitSet FOLLOW_operand_in_expr2844 = new BitSet(new long[]{0x0000000004200002L});
	public static final BitSet FOLLOW_IF_in_if_expr859 = new BitSet(new long[]{0x0000000000028C00L});
	public static final BitSet FOLLOW_expr1_in_if_expr862 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_THEN_in_if_expr864 = new BitSet(new long[]{0x0000000000028C00L});
	public static final BitSet FOLLOW_expr1_in_if_expr867 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ELSE_in_if_expr869 = new BitSet(new long[]{0x0000000000028C00L});
	public static final BitSet FOLLOW_expr1_in_if_expr872 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand890 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_operand900 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_operand910 = new BitSet(new long[]{0x0000000000028C00L});
	public static final BitSet FOLLOW_expr1_in_operand913 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_RPAREN_in_operand915 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_type935 = new BitSet(new long[]{0x0000000000000002L});
}
