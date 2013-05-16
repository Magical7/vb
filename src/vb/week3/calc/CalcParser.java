// $ANTLR 3.5 Calc.g 2013-05-16 15:27:59

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
	// Calc.g:70:1: assignment : lvalue BECOMES ^ assignment_mul ;
	public final CalcParser.assignment_return assignment() throws RecognitionException {
		CalcParser.assignment_return retval = new CalcParser.assignment_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token BECOMES14=null;
		ParserRuleReturnScope lvalue13 =null;
		ParserRuleReturnScope assignment_mul15 =null;

		Object BECOMES14_tree=null;

		try {
			// Calc.g:71:5: ( lvalue BECOMES ^ assignment_mul )
			// Calc.g:71:9: lvalue BECOMES ^ assignment_mul
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_lvalue_in_assignment731);
			lvalue13=lvalue();
			state._fsp--;

			adaptor.addChild(root_0, lvalue13.getTree());

			BECOMES14=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_assignment733); 
			BECOMES14_tree = (Object)adaptor.create(BECOMES14);
			root_0 = (Object)adaptor.becomeRoot(BECOMES14_tree, root_0);

			pushFollow(FOLLOW_assignment_mul_in_assignment736);
			assignment_mul15=assignment_mul();
			state._fsp--;

			adaptor.addChild(root_0, assignment_mul15.getTree());

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


	public static class assignment_mul_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "assignment_mul"
	// Calc.g:74:1: assignment_mul : ( expr | lvalue BECOMES ^ assignment_mul );
	public final CalcParser.assignment_mul_return assignment_mul() throws RecognitionException {
		CalcParser.assignment_mul_return retval = new CalcParser.assignment_mul_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token BECOMES18=null;
		ParserRuleReturnScope expr16 =null;
		ParserRuleReturnScope lvalue17 =null;
		ParserRuleReturnScope assignment_mul19 =null;

		Object BECOMES18_tree=null;

		try {
			// Calc.g:75:2: ( expr | lvalue BECOMES ^ assignment_mul )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==IF||LA4_0==LPAREN||LA4_0==NUMBER) ) {
				alt4=1;
			}
			else if ( (LA4_0==IDENTIFIER) ) {
				int LA4_2 = input.LA(2);
				if ( ((LA4_2 >= EQUALS && LA4_2 <= GREATEREQ)||(LA4_2 >= MINUS && LA4_2 <= NOTEQUALS)||LA4_2==PLUS||LA4_2==QUOTIENT||(LA4_2 >= SEMICOLON && LA4_2 <= SMALLEREQ)||LA4_2==TIMES) ) {
					alt4=1;
				}
				else if ( (LA4_2==BECOMES) ) {
					alt4=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// Calc.g:75:4: expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expr_in_assignment_mul754);
					expr16=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr16.getTree());

					}
					break;
				case 2 :
					// Calc.g:76:4: lvalue BECOMES ^ assignment_mul
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_lvalue_in_assignment_mul759);
					lvalue17=lvalue();
					state._fsp--;

					adaptor.addChild(root_0, lvalue17.getTree());

					BECOMES18=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_assignment_mul761); 
					BECOMES18_tree = (Object)adaptor.create(BECOMES18);
					root_0 = (Object)adaptor.becomeRoot(BECOMES18_tree, root_0);

					pushFollow(FOLLOW_assignment_mul_in_assignment_mul764);
					assignment_mul19=assignment_mul();
					state._fsp--;

					adaptor.addChild(root_0, assignment_mul19.getTree());

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
	// $ANTLR end "assignment_mul"


	public static class print_stat_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "print_stat"
	// Calc.g:79:1: print_stat : PRINT ^ LPAREN ! expr RPAREN !;
	public final CalcParser.print_stat_return print_stat() throws RecognitionException {
		CalcParser.print_stat_return retval = new CalcParser.print_stat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PRINT20=null;
		Token LPAREN21=null;
		Token RPAREN23=null;
		ParserRuleReturnScope expr22 =null;

		Object PRINT20_tree=null;
		Object LPAREN21_tree=null;
		Object RPAREN23_tree=null;

		try {
			// Calc.g:80:5: ( PRINT ^ LPAREN ! expr RPAREN !)
			// Calc.g:80:9: PRINT ^ LPAREN ! expr RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			PRINT20=(Token)match(input,PRINT,FOLLOW_PRINT_in_print_stat783); 
			PRINT20_tree = (Object)adaptor.create(PRINT20);
			root_0 = (Object)adaptor.becomeRoot(PRINT20_tree, root_0);

			LPAREN21=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_print_stat786); 
			pushFollow(FOLLOW_expr_in_print_stat789);
			expr22=expr();
			state._fsp--;

			adaptor.addChild(root_0, expr22.getTree());

			RPAREN23=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_print_stat791); 
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
	// Calc.g:83:1: swap_stat : SWAP ^ LPAREN ! IDENTIFIER COMMA ! IDENTIFIER RPAREN !;
	public final CalcParser.swap_stat_return swap_stat() throws RecognitionException {
		CalcParser.swap_stat_return retval = new CalcParser.swap_stat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SWAP24=null;
		Token LPAREN25=null;
		Token IDENTIFIER26=null;
		Token COMMA27=null;
		Token IDENTIFIER28=null;
		Token RPAREN29=null;

		Object SWAP24_tree=null;
		Object LPAREN25_tree=null;
		Object IDENTIFIER26_tree=null;
		Object COMMA27_tree=null;
		Object IDENTIFIER28_tree=null;
		Object RPAREN29_tree=null;

		try {
			// Calc.g:84:2: ( SWAP ^ LPAREN ! IDENTIFIER COMMA ! IDENTIFIER RPAREN !)
			// Calc.g:84:4: SWAP ^ LPAREN ! IDENTIFIER COMMA ! IDENTIFIER RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			SWAP24=(Token)match(input,SWAP,FOLLOW_SWAP_in_swap_stat810); 
			SWAP24_tree = (Object)adaptor.create(SWAP24);
			root_0 = (Object)adaptor.becomeRoot(SWAP24_tree, root_0);

			LPAREN25=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_swap_stat813); 
			IDENTIFIER26=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_swap_stat816); 
			IDENTIFIER26_tree = (Object)adaptor.create(IDENTIFIER26);
			adaptor.addChild(root_0, IDENTIFIER26_tree);

			COMMA27=(Token)match(input,COMMA,FOLLOW_COMMA_in_swap_stat818); 
			IDENTIFIER28=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_swap_stat821); 
			IDENTIFIER28_tree = (Object)adaptor.create(IDENTIFIER28);
			adaptor.addChild(root_0, IDENTIFIER28_tree);

			RPAREN29=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_swap_stat823); 
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
	// Calc.g:87:1: lvalue : IDENTIFIER ;
	public final CalcParser.lvalue_return lvalue() throws RecognitionException {
		CalcParser.lvalue_return retval = new CalcParser.lvalue_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER30=null;

		Object IDENTIFIER30_tree=null;

		try {
			// Calc.g:88:5: ( IDENTIFIER )
			// Calc.g:88:9: IDENTIFIER
			{
			root_0 = (Object)adaptor.nil();


			IDENTIFIER30=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_lvalue840); 
			IDENTIFIER30_tree = (Object)adaptor.create(IDENTIFIER30);
			adaptor.addChild(root_0, IDENTIFIER30_tree);

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


	public static class expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr"
	// Calc.g:91:1: expr : expr_if ;
	public final CalcParser.expr_return expr() throws RecognitionException {
		CalcParser.expr_return retval = new CalcParser.expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expr_if31 =null;


		try {
			// Calc.g:92:2: ( expr_if )
			// Calc.g:92:4: expr_if
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr_if_in_expr858);
			expr_if31=expr_if();
			state._fsp--;

			adaptor.addChild(root_0, expr_if31.getTree());

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
	// $ANTLR end "expr"


	public static class expr_if_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr_if"
	// Calc.g:95:1: expr_if : ( IF ^ expr_if THEN ! expr_if ELSE ! expr_if | expr_rel );
	public final CalcParser.expr_if_return expr_if() throws RecognitionException {
		CalcParser.expr_if_return retval = new CalcParser.expr_if_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IF32=null;
		Token THEN34=null;
		Token ELSE36=null;
		ParserRuleReturnScope expr_if33 =null;
		ParserRuleReturnScope expr_if35 =null;
		ParserRuleReturnScope expr_if37 =null;
		ParserRuleReturnScope expr_rel38 =null;

		Object IF32_tree=null;
		Object THEN34_tree=null;
		Object ELSE36_tree=null;

		try {
			// Calc.g:96:2: ( IF ^ expr_if THEN ! expr_if ELSE ! expr_if | expr_rel )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==IF) ) {
				alt5=1;
			}
			else if ( (LA5_0==IDENTIFIER||LA5_0==LPAREN||LA5_0==NUMBER) ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// Calc.g:96:4: IF ^ expr_if THEN ! expr_if ELSE ! expr_if
					{
					root_0 = (Object)adaptor.nil();


					IF32=(Token)match(input,IF,FOLLOW_IF_in_expr_if873); 
					IF32_tree = (Object)adaptor.create(IF32);
					root_0 = (Object)adaptor.becomeRoot(IF32_tree, root_0);

					pushFollow(FOLLOW_expr_if_in_expr_if876);
					expr_if33=expr_if();
					state._fsp--;

					adaptor.addChild(root_0, expr_if33.getTree());

					THEN34=(Token)match(input,THEN,FOLLOW_THEN_in_expr_if878); 
					pushFollow(FOLLOW_expr_if_in_expr_if881);
					expr_if35=expr_if();
					state._fsp--;

					adaptor.addChild(root_0, expr_if35.getTree());

					ELSE36=(Token)match(input,ELSE,FOLLOW_ELSE_in_expr_if883); 
					pushFollow(FOLLOW_expr_if_in_expr_if886);
					expr_if37=expr_if();
					state._fsp--;

					adaptor.addChild(root_0, expr_if37.getTree());

					}
					break;
				case 2 :
					// Calc.g:97:4: expr_rel
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expr_rel_in_expr_if891);
					expr_rel38=expr_rel();
					state._fsp--;

					adaptor.addChild(root_0, expr_rel38.getTree());

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
	// Calc.g:100:1: expr_rel : expr_plus ( ( GREATER ^| SMALLER ^| GREATEREQ ^| SMALLEREQ ^| EQUALS ^| NOTEQUALS ^) expr_plus )* ;
	public final CalcParser.expr_rel_return expr_rel() throws RecognitionException {
		CalcParser.expr_rel_return retval = new CalcParser.expr_rel_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token GREATER40=null;
		Token SMALLER41=null;
		Token GREATEREQ42=null;
		Token SMALLEREQ43=null;
		Token EQUALS44=null;
		Token NOTEQUALS45=null;
		ParserRuleReturnScope expr_plus39 =null;
		ParserRuleReturnScope expr_plus46 =null;

		Object GREATER40_tree=null;
		Object SMALLER41_tree=null;
		Object GREATEREQ42_tree=null;
		Object SMALLEREQ43_tree=null;
		Object EQUALS44_tree=null;
		Object NOTEQUALS45_tree=null;

		try {
			// Calc.g:101:2: ( expr_plus ( ( GREATER ^| SMALLER ^| GREATEREQ ^| SMALLEREQ ^| EQUALS ^| NOTEQUALS ^) expr_plus )* )
			// Calc.g:101:4: expr_plus ( ( GREATER ^| SMALLER ^| GREATEREQ ^| SMALLEREQ ^| EQUALS ^| NOTEQUALS ^) expr_plus )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr_plus_in_expr_rel906);
			expr_plus39=expr_plus();
			state._fsp--;

			adaptor.addChild(root_0, expr_plus39.getTree());

			// Calc.g:101:14: ( ( GREATER ^| SMALLER ^| GREATEREQ ^| SMALLEREQ ^| EQUALS ^| NOTEQUALS ^) expr_plus )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= EQUALS && LA7_0 <= GREATEREQ)||LA7_0==NOTEQUALS||(LA7_0 >= SMALLER && LA7_0 <= SMALLEREQ)) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// Calc.g:101:15: ( GREATER ^| SMALLER ^| GREATEREQ ^| SMALLEREQ ^| EQUALS ^| NOTEQUALS ^) expr_plus
					{
					// Calc.g:101:15: ( GREATER ^| SMALLER ^| GREATEREQ ^| SMALLEREQ ^| EQUALS ^| NOTEQUALS ^)
					int alt6=6;
					switch ( input.LA(1) ) {
					case GREATER:
						{
						alt6=1;
						}
						break;
					case SMALLER:
						{
						alt6=2;
						}
						break;
					case GREATEREQ:
						{
						alt6=3;
						}
						break;
					case SMALLEREQ:
						{
						alt6=4;
						}
						break;
					case EQUALS:
						{
						alt6=5;
						}
						break;
					case NOTEQUALS:
						{
						alt6=6;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 6, 0, input);
						throw nvae;
					}
					switch (alt6) {
						case 1 :
							// Calc.g:101:16: GREATER ^
							{
							GREATER40=(Token)match(input,GREATER,FOLLOW_GREATER_in_expr_rel910); 
							GREATER40_tree = (Object)adaptor.create(GREATER40);
							root_0 = (Object)adaptor.becomeRoot(GREATER40_tree, root_0);

							}
							break;
						case 2 :
							// Calc.g:101:27: SMALLER ^
							{
							SMALLER41=(Token)match(input,SMALLER,FOLLOW_SMALLER_in_expr_rel915); 
							SMALLER41_tree = (Object)adaptor.create(SMALLER41);
							root_0 = (Object)adaptor.becomeRoot(SMALLER41_tree, root_0);

							}
							break;
						case 3 :
							// Calc.g:101:38: GREATEREQ ^
							{
							GREATEREQ42=(Token)match(input,GREATEREQ,FOLLOW_GREATEREQ_in_expr_rel920); 
							GREATEREQ42_tree = (Object)adaptor.create(GREATEREQ42);
							root_0 = (Object)adaptor.becomeRoot(GREATEREQ42_tree, root_0);

							}
							break;
						case 4 :
							// Calc.g:101:51: SMALLEREQ ^
							{
							SMALLEREQ43=(Token)match(input,SMALLEREQ,FOLLOW_SMALLEREQ_in_expr_rel925); 
							SMALLEREQ43_tree = (Object)adaptor.create(SMALLEREQ43);
							root_0 = (Object)adaptor.becomeRoot(SMALLEREQ43_tree, root_0);

							}
							break;
						case 5 :
							// Calc.g:101:64: EQUALS ^
							{
							EQUALS44=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_expr_rel930); 
							EQUALS44_tree = (Object)adaptor.create(EQUALS44);
							root_0 = (Object)adaptor.becomeRoot(EQUALS44_tree, root_0);

							}
							break;
						case 6 :
							// Calc.g:101:74: NOTEQUALS ^
							{
							NOTEQUALS45=(Token)match(input,NOTEQUALS,FOLLOW_NOTEQUALS_in_expr_rel935); 
							NOTEQUALS45_tree = (Object)adaptor.create(NOTEQUALS45);
							root_0 = (Object)adaptor.becomeRoot(NOTEQUALS45_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_expr_plus_in_expr_rel940);
					expr_plus46=expr_plus();
					state._fsp--;

					adaptor.addChild(root_0, expr_plus46.getTree());

					}
					break;

				default :
					break loop7;
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
	// Calc.g:104:1: expr_plus : expr_times ( ( PLUS ^| MINUS ^) expr_times )* ;
	public final CalcParser.expr_plus_return expr_plus() throws RecognitionException {
		CalcParser.expr_plus_return retval = new CalcParser.expr_plus_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PLUS48=null;
		Token MINUS49=null;
		ParserRuleReturnScope expr_times47 =null;
		ParserRuleReturnScope expr_times50 =null;

		Object PLUS48_tree=null;
		Object MINUS49_tree=null;

		try {
			// Calc.g:105:5: ( expr_times ( ( PLUS ^| MINUS ^) expr_times )* )
			// Calc.g:105:9: expr_times ( ( PLUS ^| MINUS ^) expr_times )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr_times_in_expr_plus962);
			expr_times47=expr_times();
			state._fsp--;

			adaptor.addChild(root_0, expr_times47.getTree());

			// Calc.g:105:20: ( ( PLUS ^| MINUS ^) expr_times )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==MINUS||LA9_0==PLUS) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// Calc.g:105:21: ( PLUS ^| MINUS ^) expr_times
					{
					// Calc.g:105:21: ( PLUS ^| MINUS ^)
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==PLUS) ) {
						alt8=1;
					}
					else if ( (LA8_0==MINUS) ) {
						alt8=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 8, 0, input);
						throw nvae;
					}

					switch (alt8) {
						case 1 :
							// Calc.g:105:22: PLUS ^
							{
							PLUS48=(Token)match(input,PLUS,FOLLOW_PLUS_in_expr_plus966); 
							PLUS48_tree = (Object)adaptor.create(PLUS48);
							root_0 = (Object)adaptor.becomeRoot(PLUS48_tree, root_0);

							}
							break;
						case 2 :
							// Calc.g:105:30: MINUS ^
							{
							MINUS49=(Token)match(input,MINUS,FOLLOW_MINUS_in_expr_plus971); 
							MINUS49_tree = (Object)adaptor.create(MINUS49);
							root_0 = (Object)adaptor.becomeRoot(MINUS49_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_expr_times_in_expr_plus975);
					expr_times50=expr_times();
					state._fsp--;

					adaptor.addChild(root_0, expr_times50.getTree());

					}
					break;

				default :
					break loop9;
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
	// Calc.g:108:1: expr_times : operand ( ( TIMES ^| QUOTIENT ^) operand )* ;
	public final CalcParser.expr_times_return expr_times() throws RecognitionException {
		CalcParser.expr_times_return retval = new CalcParser.expr_times_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TIMES52=null;
		Token QUOTIENT53=null;
		ParserRuleReturnScope operand51 =null;
		ParserRuleReturnScope operand54 =null;

		Object TIMES52_tree=null;
		Object QUOTIENT53_tree=null;

		try {
			// Calc.g:109:2: ( operand ( ( TIMES ^| QUOTIENT ^) operand )* )
			// Calc.g:109:4: operand ( ( TIMES ^| QUOTIENT ^) operand )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_operand_in_expr_times996);
			operand51=operand();
			state._fsp--;

			adaptor.addChild(root_0, operand51.getTree());

			// Calc.g:109:12: ( ( TIMES ^| QUOTIENT ^) operand )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==QUOTIENT||LA11_0==TIMES) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// Calc.g:109:13: ( TIMES ^| QUOTIENT ^) operand
					{
					// Calc.g:109:13: ( TIMES ^| QUOTIENT ^)
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==TIMES) ) {
						alt10=1;
					}
					else if ( (LA10_0==QUOTIENT) ) {
						alt10=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 10, 0, input);
						throw nvae;
					}

					switch (alt10) {
						case 1 :
							// Calc.g:109:14: TIMES ^
							{
							TIMES52=(Token)match(input,TIMES,FOLLOW_TIMES_in_expr_times1000); 
							TIMES52_tree = (Object)adaptor.create(TIMES52);
							root_0 = (Object)adaptor.becomeRoot(TIMES52_tree, root_0);

							}
							break;
						case 2 :
							// Calc.g:109:23: QUOTIENT ^
							{
							QUOTIENT53=(Token)match(input,QUOTIENT,FOLLOW_QUOTIENT_in_expr_times1005); 
							QUOTIENT53_tree = (Object)adaptor.create(QUOTIENT53);
							root_0 = (Object)adaptor.becomeRoot(QUOTIENT53_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_operand_in_expr_times1009);
					operand54=operand();
					state._fsp--;

					adaptor.addChild(root_0, operand54.getTree());

					}
					break;

				default :
					break loop11;
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
	// Calc.g:112:1: operand : ( IDENTIFIER | NUMBER | LPAREN ! expr RPAREN !);
	public final CalcParser.operand_return operand() throws RecognitionException {
		CalcParser.operand_return retval = new CalcParser.operand_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER55=null;
		Token NUMBER56=null;
		Token LPAREN57=null;
		Token RPAREN59=null;
		ParserRuleReturnScope expr58 =null;

		Object IDENTIFIER55_tree=null;
		Object NUMBER56_tree=null;
		Object LPAREN57_tree=null;
		Object RPAREN59_tree=null;

		try {
			// Calc.g:113:5: ( IDENTIFIER | NUMBER | LPAREN ! expr RPAREN !)
			int alt12=3;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
				{
				alt12=1;
				}
				break;
			case NUMBER:
				{
				alt12=2;
				}
				break;
			case LPAREN:
				{
				alt12=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// Calc.g:113:9: IDENTIFIER
					{
					root_0 = (Object)adaptor.nil();


					IDENTIFIER55=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand1028); 
					IDENTIFIER55_tree = (Object)adaptor.create(IDENTIFIER55);
					adaptor.addChild(root_0, IDENTIFIER55_tree);

					}
					break;
				case 2 :
					// Calc.g:114:9: NUMBER
					{
					root_0 = (Object)adaptor.nil();


					NUMBER56=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_operand1038); 
					NUMBER56_tree = (Object)adaptor.create(NUMBER56);
					adaptor.addChild(root_0, NUMBER56_tree);

					}
					break;
				case 3 :
					// Calc.g:115:9: LPAREN ! expr RPAREN !
					{
					root_0 = (Object)adaptor.nil();


					LPAREN57=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_operand1048); 
					pushFollow(FOLLOW_expr_in_operand1051);
					expr58=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr58.getTree());

					RPAREN59=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_operand1053); 
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
	// Calc.g:118:1: type : INTEGER ;
	public final CalcParser.type_return type() throws RecognitionException {
		CalcParser.type_return retval = new CalcParser.type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token INTEGER60=null;

		Object INTEGER60_tree=null;

		try {
			// Calc.g:119:5: ( INTEGER )
			// Calc.g:119:9: INTEGER
			{
			root_0 = (Object)adaptor.nil();


			INTEGER60=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_type1073); 
			INTEGER60_tree = (Object)adaptor.create(INTEGER60);
			adaptor.addChild(root_0, INTEGER60_tree);

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
	public static final BitSet FOLLOW_assignment_mul_in_assignment736 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_assignment_mul754 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lvalue_in_assignment_mul759 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_BECOMES_in_assignment_mul761 = new BitSet(new long[]{0x0000000000246000L});
	public static final BitSet FOLLOW_assignment_mul_in_assignment_mul764 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_print_stat783 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_LPAREN_in_print_stat786 = new BitSet(new long[]{0x0000000000246000L});
	public static final BitSet FOLLOW_expr_in_print_stat789 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_RPAREN_in_print_stat791 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SWAP_in_swap_stat810 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_LPAREN_in_swap_stat813 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_swap_stat816 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_COMMA_in_swap_stat818 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_swap_stat821 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_RPAREN_in_swap_stat823 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_lvalue840 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_if_in_expr858 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_expr_if873 = new BitSet(new long[]{0x0000000000246000L});
	public static final BitSet FOLLOW_expr_if_in_expr_if876 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_THEN_in_expr_if878 = new BitSet(new long[]{0x0000000000246000L});
	public static final BitSet FOLLOW_expr_if_in_expr_if881 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ELSE_in_expr_if883 = new BitSet(new long[]{0x0000000000246000L});
	public static final BitSet FOLLOW_expr_if_in_expr_if886 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_rel_in_expr_if891 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_plus_in_expr_rel906 = new BitSet(new long[]{0x0000000030101C02L});
	public static final BitSet FOLLOW_GREATER_in_expr_rel910 = new BitSet(new long[]{0x0000000000242000L});
	public static final BitSet FOLLOW_SMALLER_in_expr_rel915 = new BitSet(new long[]{0x0000000000242000L});
	public static final BitSet FOLLOW_GREATEREQ_in_expr_rel920 = new BitSet(new long[]{0x0000000000242000L});
	public static final BitSet FOLLOW_SMALLEREQ_in_expr_rel925 = new BitSet(new long[]{0x0000000000242000L});
	public static final BitSet FOLLOW_EQUALS_in_expr_rel930 = new BitSet(new long[]{0x0000000000242000L});
	public static final BitSet FOLLOW_NOTEQUALS_in_expr_rel935 = new BitSet(new long[]{0x0000000000242000L});
	public static final BitSet FOLLOW_expr_plus_in_expr_rel940 = new BitSet(new long[]{0x0000000030101C02L});
	public static final BitSet FOLLOW_expr_times_in_expr_plus962 = new BitSet(new long[]{0x0000000000480002L});
	public static final BitSet FOLLOW_PLUS_in_expr_plus966 = new BitSet(new long[]{0x0000000000242000L});
	public static final BitSet FOLLOW_MINUS_in_expr_plus971 = new BitSet(new long[]{0x0000000000242000L});
	public static final BitSet FOLLOW_expr_times_in_expr_plus975 = new BitSet(new long[]{0x0000000000480002L});
	public static final BitSet FOLLOW_operand_in_expr_times996 = new BitSet(new long[]{0x0000000102000002L});
	public static final BitSet FOLLOW_TIMES_in_expr_times1000 = new BitSet(new long[]{0x0000000000242000L});
	public static final BitSet FOLLOW_QUOTIENT_in_expr_times1005 = new BitSet(new long[]{0x0000000000242000L});
	public static final BitSet FOLLOW_operand_in_expr_times1009 = new BitSet(new long[]{0x0000000102000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand1028 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_operand1038 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_operand1048 = new BitSet(new long[]{0x0000000000246000L});
	public static final BitSet FOLLOW_expr_in_operand1051 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_RPAREN_in_operand1053 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_type1073 = new BitSet(new long[]{0x0000000000000002L});
}
