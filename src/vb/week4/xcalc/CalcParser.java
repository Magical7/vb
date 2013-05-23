// $ANTLR 3.5 Calc.g 2013-05-23 17:21:41

package vb.week4.xcalc;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class CalcParser extends Parser {
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
	// Calc.g:53:1: program : program_lines EOF -> ^( PROGRAM program_lines ) ;
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
			// Calc.g:54:5: ( program_lines EOF -> ^( PROGRAM program_lines ) )
			// Calc.g:54:9: program_lines EOF
			{
			pushFollow(FOLLOW_program_lines_in_program623);
			program_lines1=program_lines();
			state._fsp--;

			stream_program_lines.add(program_lines1.getTree());
			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_program625);  
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
			// 55:13: -> ^( PROGRAM program_lines )
			{
				// Calc.g:55:17: ^( PROGRAM program_lines )
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
	// Calc.g:58:1: program_lines : ( ( statement | declaration ) SEMICOLON !)* ;
	public final CalcParser.program_lines_return program_lines() throws RecognitionException {
		CalcParser.program_lines_return retval = new CalcParser.program_lines_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SEMICOLON5=null;
		ParserRuleReturnScope statement3 =null;
		ParserRuleReturnScope declaration4 =null;

		Object SEMICOLON5_tree=null;

		try {
			// Calc.g:59:2: ( ( ( statement | declaration ) SEMICOLON !)* )
			// Calc.g:59:4: ( ( statement | declaration ) SEMICOLON !)*
			{
			root_0 = (Object)adaptor.nil();


			// Calc.g:59:4: ( ( statement | declaration ) SEMICOLON !)*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==DO||LA2_0==IDENTIFIER||LA2_0==PRINT||LA2_0==SWAP||LA2_0==VAR) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// Calc.g:59:5: ( statement | declaration ) SEMICOLON !
					{
					// Calc.g:59:5: ( statement | declaration )
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==DO||LA1_0==IDENTIFIER||LA1_0==PRINT||LA1_0==SWAP) ) {
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
							// Calc.g:59:6: statement
							{
							pushFollow(FOLLOW_statement_in_program_lines666);
							statement3=statement();
							state._fsp--;

							adaptor.addChild(root_0, statement3.getTree());

							}
							break;
						case 2 :
							// Calc.g:59:18: declaration
							{
							pushFollow(FOLLOW_declaration_in_program_lines670);
							declaration4=declaration();
							state._fsp--;

							adaptor.addChild(root_0, declaration4.getTree());

							}
							break;

					}

					SEMICOLON5=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_program_lines673); 
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
	// Calc.g:62:1: declaration : VAR ^ IDENTIFIER COLON ! type ;
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
			// Calc.g:63:5: ( VAR ^ IDENTIFIER COLON ! type )
			// Calc.g:63:9: VAR ^ IDENTIFIER COLON ! type
			{
			root_0 = (Object)adaptor.nil();


			VAR6=(Token)match(input,VAR,FOLLOW_VAR_in_declaration692); 
			VAR6_tree = (Object)adaptor.create(VAR6);
			root_0 = (Object)adaptor.becomeRoot(VAR6_tree, root_0);

			IDENTIFIER7=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration695); 
			IDENTIFIER7_tree = (Object)adaptor.create(IDENTIFIER7);
			adaptor.addChild(root_0, IDENTIFIER7_tree);

			COLON8=(Token)match(input,COLON,FOLLOW_COLON_in_declaration697); 
			pushFollow(FOLLOW_type_in_declaration700);
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


	public static class dowhileStatement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "dowhileStatement"
	// Calc.g:66:1: dowhileStatement : DO ^ statements WHILE expr_if ;
	public final CalcParser.dowhileStatement_return dowhileStatement() throws RecognitionException {
		CalcParser.dowhileStatement_return retval = new CalcParser.dowhileStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token DO10=null;
		Token WHILE12=null;
		ParserRuleReturnScope statements11 =null;
		ParserRuleReturnScope expr_if13 =null;

		Object DO10_tree=null;
		Object WHILE12_tree=null;

		try {
			// Calc.g:66:18: ( DO ^ statements WHILE expr_if )
			// Calc.g:66:20: DO ^ statements WHILE expr_if
			{
			root_0 = (Object)adaptor.nil();


			DO10=(Token)match(input,DO,FOLLOW_DO_in_dowhileStatement717); 
			DO10_tree = (Object)adaptor.create(DO10);
			root_0 = (Object)adaptor.becomeRoot(DO10_tree, root_0);

			pushFollow(FOLLOW_statements_in_dowhileStatement720);
			statements11=statements();
			state._fsp--;

			adaptor.addChild(root_0, statements11.getTree());

			WHILE12=(Token)match(input,WHILE,FOLLOW_WHILE_in_dowhileStatement722); 
			WHILE12_tree = (Object)adaptor.create(WHILE12);
			adaptor.addChild(root_0, WHILE12_tree);

			pushFollow(FOLLOW_expr_if_in_dowhileStatement724);
			expr_if13=expr_if();
			state._fsp--;

			adaptor.addChild(root_0, expr_if13.getTree());

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
	// $ANTLR end "dowhileStatement"


	public static class statements_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "statements"
	// Calc.g:67:1: statements : ( statement SEMICOLON !)+ ;
	public final CalcParser.statements_return statements() throws RecognitionException {
		CalcParser.statements_return retval = new CalcParser.statements_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SEMICOLON15=null;
		ParserRuleReturnScope statement14 =null;

		Object SEMICOLON15_tree=null;

		try {
			// Calc.g:67:12: ( ( statement SEMICOLON !)+ )
			// Calc.g:67:14: ( statement SEMICOLON !)+
			{
			root_0 = (Object)adaptor.nil();


			// Calc.g:67:14: ( statement SEMICOLON !)+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==DO||LA3_0==IDENTIFIER||LA3_0==PRINT||LA3_0==SWAP) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// Calc.g:67:15: statement SEMICOLON !
					{
					pushFollow(FOLLOW_statement_in_statements733);
					statement14=statement();
					state._fsp--;

					adaptor.addChild(root_0, statement14.getTree());

					SEMICOLON15=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_statements735); 
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


	public static class statement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "statement"
	// Calc.g:69:1: statement : ( assignment | dowhileStatement | print_stat | swap_stat );
	public final CalcParser.statement_return statement() throws RecognitionException {
		CalcParser.statement_return retval = new CalcParser.statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope assignment16 =null;
		ParserRuleReturnScope dowhileStatement17 =null;
		ParserRuleReturnScope print_stat18 =null;
		ParserRuleReturnScope swap_stat19 =null;


		try {
			// Calc.g:70:5: ( assignment | dowhileStatement | print_stat | swap_stat )
			int alt4=4;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
				{
				alt4=1;
				}
				break;
			case DO:
				{
				alt4=2;
				}
				break;
			case PRINT:
				{
				alt4=3;
				}
				break;
			case SWAP:
				{
				alt4=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// Calc.g:70:9: assignment
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_assignment_in_statement757);
					assignment16=assignment();
					state._fsp--;

					adaptor.addChild(root_0, assignment16.getTree());

					}
					break;
				case 2 :
					// Calc.g:71:7: dowhileStatement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_dowhileStatement_in_statement765);
					dowhileStatement17=dowhileStatement();
					state._fsp--;

					adaptor.addChild(root_0, dowhileStatement17.getTree());

					}
					break;
				case 3 :
					// Calc.g:72:9: print_stat
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_print_stat_in_statement775);
					print_stat18=print_stat();
					state._fsp--;

					adaptor.addChild(root_0, print_stat18.getTree());

					}
					break;
				case 4 :
					// Calc.g:73:7: swap_stat
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_swap_stat_in_statement783);
					swap_stat19=swap_stat();
					state._fsp--;

					adaptor.addChild(root_0, swap_stat19.getTree());

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
	// Calc.g:76:1: assignment : lvalue BECOMES ^ expr ;
	public final CalcParser.assignment_return assignment() throws RecognitionException {
		CalcParser.assignment_return retval = new CalcParser.assignment_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token BECOMES21=null;
		ParserRuleReturnScope lvalue20 =null;
		ParserRuleReturnScope expr22 =null;

		Object BECOMES21_tree=null;

		try {
			// Calc.g:77:5: ( lvalue BECOMES ^ expr )
			// Calc.g:77:9: lvalue BECOMES ^ expr
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_lvalue_in_assignment802);
			lvalue20=lvalue();
			state._fsp--;

			adaptor.addChild(root_0, lvalue20.getTree());

			BECOMES21=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_assignment804); 
			BECOMES21_tree = (Object)adaptor.create(BECOMES21);
			root_0 = (Object)adaptor.becomeRoot(BECOMES21_tree, root_0);

			pushFollow(FOLLOW_expr_in_assignment807);
			expr22=expr();
			state._fsp--;

			adaptor.addChild(root_0, expr22.getTree());

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
	// Calc.g:80:1: print_stat : PRINT ^ LPAREN ! expr RPAREN !;
	public final CalcParser.print_stat_return print_stat() throws RecognitionException {
		CalcParser.print_stat_return retval = new CalcParser.print_stat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PRINT23=null;
		Token LPAREN24=null;
		Token RPAREN26=null;
		ParserRuleReturnScope expr25 =null;

		Object PRINT23_tree=null;
		Object LPAREN24_tree=null;
		Object RPAREN26_tree=null;

		try {
			// Calc.g:81:5: ( PRINT ^ LPAREN ! expr RPAREN !)
			// Calc.g:81:9: PRINT ^ LPAREN ! expr RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			PRINT23=(Token)match(input,PRINT,FOLLOW_PRINT_in_print_stat826); 
			PRINT23_tree = (Object)adaptor.create(PRINT23);
			root_0 = (Object)adaptor.becomeRoot(PRINT23_tree, root_0);

			LPAREN24=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_print_stat829); 
			pushFollow(FOLLOW_expr_in_print_stat832);
			expr25=expr();
			state._fsp--;

			adaptor.addChild(root_0, expr25.getTree());

			RPAREN26=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_print_stat834); 
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
	// Calc.g:84:1: swap_stat : SWAP ^ LPAREN ! IDENTIFIER COMMA ! IDENTIFIER RPAREN !;
	public final CalcParser.swap_stat_return swap_stat() throws RecognitionException {
		CalcParser.swap_stat_return retval = new CalcParser.swap_stat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SWAP27=null;
		Token LPAREN28=null;
		Token IDENTIFIER29=null;
		Token COMMA30=null;
		Token IDENTIFIER31=null;
		Token RPAREN32=null;

		Object SWAP27_tree=null;
		Object LPAREN28_tree=null;
		Object IDENTIFIER29_tree=null;
		Object COMMA30_tree=null;
		Object IDENTIFIER31_tree=null;
		Object RPAREN32_tree=null;

		try {
			// Calc.g:85:2: ( SWAP ^ LPAREN ! IDENTIFIER COMMA ! IDENTIFIER RPAREN !)
			// Calc.g:85:4: SWAP ^ LPAREN ! IDENTIFIER COMMA ! IDENTIFIER RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			SWAP27=(Token)match(input,SWAP,FOLLOW_SWAP_in_swap_stat853); 
			SWAP27_tree = (Object)adaptor.create(SWAP27);
			root_0 = (Object)adaptor.becomeRoot(SWAP27_tree, root_0);

			LPAREN28=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_swap_stat856); 
			IDENTIFIER29=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_swap_stat859); 
			IDENTIFIER29_tree = (Object)adaptor.create(IDENTIFIER29);
			adaptor.addChild(root_0, IDENTIFIER29_tree);

			COMMA30=(Token)match(input,COMMA,FOLLOW_COMMA_in_swap_stat861); 
			IDENTIFIER31=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_swap_stat864); 
			IDENTIFIER31_tree = (Object)adaptor.create(IDENTIFIER31);
			adaptor.addChild(root_0, IDENTIFIER31_tree);

			RPAREN32=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_swap_stat866); 
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
	// Calc.g:88:1: lvalue : IDENTIFIER ;
	public final CalcParser.lvalue_return lvalue() throws RecognitionException {
		CalcParser.lvalue_return retval = new CalcParser.lvalue_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER33=null;

		Object IDENTIFIER33_tree=null;

		try {
			// Calc.g:89:5: ( IDENTIFIER )
			// Calc.g:89:9: IDENTIFIER
			{
			root_0 = (Object)adaptor.nil();


			IDENTIFIER33=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_lvalue883); 
			IDENTIFIER33_tree = (Object)adaptor.create(IDENTIFIER33);
			adaptor.addChild(root_0, IDENTIFIER33_tree);

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
	// Calc.g:92:1: expr : expr_assign ;
	public final CalcParser.expr_return expr() throws RecognitionException {
		CalcParser.expr_return retval = new CalcParser.expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expr_assign34 =null;


		try {
			// Calc.g:93:2: ( expr_assign )
			// Calc.g:93:4: expr_assign
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr_assign_in_expr901);
			expr_assign34=expr_assign();
			state._fsp--;

			adaptor.addChild(root_0, expr_assign34.getTree());

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


	public static class expr_assign_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr_assign"
	// Calc.g:96:1: expr_assign : expr_if ( BECOMES ^ expr_assign )? ;
	public final CalcParser.expr_assign_return expr_assign() throws RecognitionException {
		CalcParser.expr_assign_return retval = new CalcParser.expr_assign_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token BECOMES36=null;
		ParserRuleReturnScope expr_if35 =null;
		ParserRuleReturnScope expr_assign37 =null;

		Object BECOMES36_tree=null;

		try {
			// Calc.g:97:2: ( expr_if ( BECOMES ^ expr_assign )? )
			// Calc.g:97:4: expr_if ( BECOMES ^ expr_assign )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr_if_in_expr_assign913);
			expr_if35=expr_if();
			state._fsp--;

			adaptor.addChild(root_0, expr_if35.getTree());

			// Calc.g:97:12: ( BECOMES ^ expr_assign )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==BECOMES) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// Calc.g:97:13: BECOMES ^ expr_assign
					{
					BECOMES36=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_expr_assign916); 
					BECOMES36_tree = (Object)adaptor.create(BECOMES36);
					root_0 = (Object)adaptor.becomeRoot(BECOMES36_tree, root_0);

					pushFollow(FOLLOW_expr_assign_in_expr_assign919);
					expr_assign37=expr_assign();
					state._fsp--;

					adaptor.addChild(root_0, expr_assign37.getTree());

					}
					break;

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
	// $ANTLR end "expr_assign"


	public static class expr_if_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr_if"
	// Calc.g:100:1: expr_if : ( IF ^ expr_if THEN ! expr_if ELSE ! expr_if | expr_rel );
	public final CalcParser.expr_if_return expr_if() throws RecognitionException {
		CalcParser.expr_if_return retval = new CalcParser.expr_if_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IF38=null;
		Token THEN40=null;
		Token ELSE42=null;
		ParserRuleReturnScope expr_if39 =null;
		ParserRuleReturnScope expr_if41 =null;
		ParserRuleReturnScope expr_if43 =null;
		ParserRuleReturnScope expr_rel44 =null;

		Object IF38_tree=null;
		Object THEN40_tree=null;
		Object ELSE42_tree=null;

		try {
			// Calc.g:101:2: ( IF ^ expr_if THEN ! expr_if ELSE ! expr_if | expr_rel )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==IF) ) {
				alt6=1;
			}
			else if ( (LA6_0==IDENTIFIER||LA6_0==LPAREN||LA6_0==NUMBER) ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// Calc.g:101:4: IF ^ expr_if THEN ! expr_if ELSE ! expr_if
					{
					root_0 = (Object)adaptor.nil();


					IF38=(Token)match(input,IF,FOLLOW_IF_in_expr_if936); 
					IF38_tree = (Object)adaptor.create(IF38);
					root_0 = (Object)adaptor.becomeRoot(IF38_tree, root_0);

					pushFollow(FOLLOW_expr_if_in_expr_if939);
					expr_if39=expr_if();
					state._fsp--;

					adaptor.addChild(root_0, expr_if39.getTree());

					THEN40=(Token)match(input,THEN,FOLLOW_THEN_in_expr_if941); 
					pushFollow(FOLLOW_expr_if_in_expr_if944);
					expr_if41=expr_if();
					state._fsp--;

					adaptor.addChild(root_0, expr_if41.getTree());

					ELSE42=(Token)match(input,ELSE,FOLLOW_ELSE_in_expr_if946); 
					pushFollow(FOLLOW_expr_if_in_expr_if949);
					expr_if43=expr_if();
					state._fsp--;

					adaptor.addChild(root_0, expr_if43.getTree());

					}
					break;
				case 2 :
					// Calc.g:102:4: expr_rel
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expr_rel_in_expr_if954);
					expr_rel44=expr_rel();
					state._fsp--;

					adaptor.addChild(root_0, expr_rel44.getTree());

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
	// Calc.g:105:1: expr_rel : expr_plus ( ( GREATER ^| SMALLER ^| GREATEREQ ^| SMALLEREQ ^| EQUALS ^| NOTEQUALS ^) expr_plus )* ;
	public final CalcParser.expr_rel_return expr_rel() throws RecognitionException {
		CalcParser.expr_rel_return retval = new CalcParser.expr_rel_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token GREATER46=null;
		Token SMALLER47=null;
		Token GREATEREQ48=null;
		Token SMALLEREQ49=null;
		Token EQUALS50=null;
		Token NOTEQUALS51=null;
		ParserRuleReturnScope expr_plus45 =null;
		ParserRuleReturnScope expr_plus52 =null;

		Object GREATER46_tree=null;
		Object SMALLER47_tree=null;
		Object GREATEREQ48_tree=null;
		Object SMALLEREQ49_tree=null;
		Object EQUALS50_tree=null;
		Object NOTEQUALS51_tree=null;

		try {
			// Calc.g:106:2: ( expr_plus ( ( GREATER ^| SMALLER ^| GREATEREQ ^| SMALLEREQ ^| EQUALS ^| NOTEQUALS ^) expr_plus )* )
			// Calc.g:106:4: expr_plus ( ( GREATER ^| SMALLER ^| GREATEREQ ^| SMALLEREQ ^| EQUALS ^| NOTEQUALS ^) expr_plus )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr_plus_in_expr_rel969);
			expr_plus45=expr_plus();
			state._fsp--;

			adaptor.addChild(root_0, expr_plus45.getTree());

			// Calc.g:106:14: ( ( GREATER ^| SMALLER ^| GREATEREQ ^| SMALLEREQ ^| EQUALS ^| NOTEQUALS ^) expr_plus )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( ((LA8_0 >= EQUALS && LA8_0 <= GREATEREQ)||LA8_0==NOTEQUALS||(LA8_0 >= SMALLER && LA8_0 <= SMALLEREQ)) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// Calc.g:106:15: ( GREATER ^| SMALLER ^| GREATEREQ ^| SMALLEREQ ^| EQUALS ^| NOTEQUALS ^) expr_plus
					{
					// Calc.g:106:15: ( GREATER ^| SMALLER ^| GREATEREQ ^| SMALLEREQ ^| EQUALS ^| NOTEQUALS ^)
					int alt7=6;
					switch ( input.LA(1) ) {
					case GREATER:
						{
						alt7=1;
						}
						break;
					case SMALLER:
						{
						alt7=2;
						}
						break;
					case GREATEREQ:
						{
						alt7=3;
						}
						break;
					case SMALLEREQ:
						{
						alt7=4;
						}
						break;
					case EQUALS:
						{
						alt7=5;
						}
						break;
					case NOTEQUALS:
						{
						alt7=6;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 7, 0, input);
						throw nvae;
					}
					switch (alt7) {
						case 1 :
							// Calc.g:106:16: GREATER ^
							{
							GREATER46=(Token)match(input,GREATER,FOLLOW_GREATER_in_expr_rel973); 
							GREATER46_tree = (Object)adaptor.create(GREATER46);
							root_0 = (Object)adaptor.becomeRoot(GREATER46_tree, root_0);

							}
							break;
						case 2 :
							// Calc.g:106:27: SMALLER ^
							{
							SMALLER47=(Token)match(input,SMALLER,FOLLOW_SMALLER_in_expr_rel978); 
							SMALLER47_tree = (Object)adaptor.create(SMALLER47);
							root_0 = (Object)adaptor.becomeRoot(SMALLER47_tree, root_0);

							}
							break;
						case 3 :
							// Calc.g:106:38: GREATEREQ ^
							{
							GREATEREQ48=(Token)match(input,GREATEREQ,FOLLOW_GREATEREQ_in_expr_rel983); 
							GREATEREQ48_tree = (Object)adaptor.create(GREATEREQ48);
							root_0 = (Object)adaptor.becomeRoot(GREATEREQ48_tree, root_0);

							}
							break;
						case 4 :
							// Calc.g:106:51: SMALLEREQ ^
							{
							SMALLEREQ49=(Token)match(input,SMALLEREQ,FOLLOW_SMALLEREQ_in_expr_rel988); 
							SMALLEREQ49_tree = (Object)adaptor.create(SMALLEREQ49);
							root_0 = (Object)adaptor.becomeRoot(SMALLEREQ49_tree, root_0);

							}
							break;
						case 5 :
							// Calc.g:106:64: EQUALS ^
							{
							EQUALS50=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_expr_rel993); 
							EQUALS50_tree = (Object)adaptor.create(EQUALS50);
							root_0 = (Object)adaptor.becomeRoot(EQUALS50_tree, root_0);

							}
							break;
						case 6 :
							// Calc.g:106:74: NOTEQUALS ^
							{
							NOTEQUALS51=(Token)match(input,NOTEQUALS,FOLLOW_NOTEQUALS_in_expr_rel998); 
							NOTEQUALS51_tree = (Object)adaptor.create(NOTEQUALS51);
							root_0 = (Object)adaptor.becomeRoot(NOTEQUALS51_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_expr_plus_in_expr_rel1003);
					expr_plus52=expr_plus();
					state._fsp--;

					adaptor.addChild(root_0, expr_plus52.getTree());

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
	// $ANTLR end "expr_rel"


	public static class expr_plus_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr_plus"
	// Calc.g:109:1: expr_plus : expr_times ( ( PLUS ^| MINUS ^) expr_times )* ;
	public final CalcParser.expr_plus_return expr_plus() throws RecognitionException {
		CalcParser.expr_plus_return retval = new CalcParser.expr_plus_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PLUS54=null;
		Token MINUS55=null;
		ParserRuleReturnScope expr_times53 =null;
		ParserRuleReturnScope expr_times56 =null;

		Object PLUS54_tree=null;
		Object MINUS55_tree=null;

		try {
			// Calc.g:110:5: ( expr_times ( ( PLUS ^| MINUS ^) expr_times )* )
			// Calc.g:110:9: expr_times ( ( PLUS ^| MINUS ^) expr_times )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr_times_in_expr_plus1025);
			expr_times53=expr_times();
			state._fsp--;

			adaptor.addChild(root_0, expr_times53.getTree());

			// Calc.g:110:20: ( ( PLUS ^| MINUS ^) expr_times )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==MINUS||LA10_0==PLUS) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// Calc.g:110:21: ( PLUS ^| MINUS ^) expr_times
					{
					// Calc.g:110:21: ( PLUS ^| MINUS ^)
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==PLUS) ) {
						alt9=1;
					}
					else if ( (LA9_0==MINUS) ) {
						alt9=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 9, 0, input);
						throw nvae;
					}

					switch (alt9) {
						case 1 :
							// Calc.g:110:22: PLUS ^
							{
							PLUS54=(Token)match(input,PLUS,FOLLOW_PLUS_in_expr_plus1029); 
							PLUS54_tree = (Object)adaptor.create(PLUS54);
							root_0 = (Object)adaptor.becomeRoot(PLUS54_tree, root_0);

							}
							break;
						case 2 :
							// Calc.g:110:30: MINUS ^
							{
							MINUS55=(Token)match(input,MINUS,FOLLOW_MINUS_in_expr_plus1034); 
							MINUS55_tree = (Object)adaptor.create(MINUS55);
							root_0 = (Object)adaptor.becomeRoot(MINUS55_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_expr_times_in_expr_plus1038);
					expr_times56=expr_times();
					state._fsp--;

					adaptor.addChild(root_0, expr_times56.getTree());

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
	// $ANTLR end "expr_plus"


	public static class expr_times_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr_times"
	// Calc.g:113:1: expr_times : operand ( ( TIMES ^| QUOTIENT ^) operand )* ;
	public final CalcParser.expr_times_return expr_times() throws RecognitionException {
		CalcParser.expr_times_return retval = new CalcParser.expr_times_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TIMES58=null;
		Token QUOTIENT59=null;
		ParserRuleReturnScope operand57 =null;
		ParserRuleReturnScope operand60 =null;

		Object TIMES58_tree=null;
		Object QUOTIENT59_tree=null;

		try {
			// Calc.g:114:2: ( operand ( ( TIMES ^| QUOTIENT ^) operand )* )
			// Calc.g:114:4: operand ( ( TIMES ^| QUOTIENT ^) operand )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_operand_in_expr_times1059);
			operand57=operand();
			state._fsp--;

			adaptor.addChild(root_0, operand57.getTree());

			// Calc.g:114:12: ( ( TIMES ^| QUOTIENT ^) operand )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==QUOTIENT||LA12_0==TIMES) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// Calc.g:114:13: ( TIMES ^| QUOTIENT ^) operand
					{
					// Calc.g:114:13: ( TIMES ^| QUOTIENT ^)
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==TIMES) ) {
						alt11=1;
					}
					else if ( (LA11_0==QUOTIENT) ) {
						alt11=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 11, 0, input);
						throw nvae;
					}

					switch (alt11) {
						case 1 :
							// Calc.g:114:14: TIMES ^
							{
							TIMES58=(Token)match(input,TIMES,FOLLOW_TIMES_in_expr_times1063); 
							TIMES58_tree = (Object)adaptor.create(TIMES58);
							root_0 = (Object)adaptor.becomeRoot(TIMES58_tree, root_0);

							}
							break;
						case 2 :
							// Calc.g:114:23: QUOTIENT ^
							{
							QUOTIENT59=(Token)match(input,QUOTIENT,FOLLOW_QUOTIENT_in_expr_times1068); 
							QUOTIENT59_tree = (Object)adaptor.create(QUOTIENT59);
							root_0 = (Object)adaptor.becomeRoot(QUOTIENT59_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_operand_in_expr_times1072);
					operand60=operand();
					state._fsp--;

					adaptor.addChild(root_0, operand60.getTree());

					}
					break;

				default :
					break loop12;
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
	// Calc.g:117:1: operand : ( IDENTIFIER | NUMBER | LPAREN ! expr RPAREN !);
	public final CalcParser.operand_return operand() throws RecognitionException {
		CalcParser.operand_return retval = new CalcParser.operand_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER61=null;
		Token NUMBER62=null;
		Token LPAREN63=null;
		Token RPAREN65=null;
		ParserRuleReturnScope expr64 =null;

		Object IDENTIFIER61_tree=null;
		Object NUMBER62_tree=null;
		Object LPAREN63_tree=null;
		Object RPAREN65_tree=null;

		try {
			// Calc.g:118:5: ( IDENTIFIER | NUMBER | LPAREN ! expr RPAREN !)
			int alt13=3;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
				{
				alt13=1;
				}
				break;
			case NUMBER:
				{
				alt13=2;
				}
				break;
			case LPAREN:
				{
				alt13=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}
			switch (alt13) {
				case 1 :
					// Calc.g:118:9: IDENTIFIER
					{
					root_0 = (Object)adaptor.nil();


					IDENTIFIER61=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand1091); 
					IDENTIFIER61_tree = (Object)adaptor.create(IDENTIFIER61);
					adaptor.addChild(root_0, IDENTIFIER61_tree);

					}
					break;
				case 2 :
					// Calc.g:119:9: NUMBER
					{
					root_0 = (Object)adaptor.nil();


					NUMBER62=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_operand1101); 
					NUMBER62_tree = (Object)adaptor.create(NUMBER62);
					adaptor.addChild(root_0, NUMBER62_tree);

					}
					break;
				case 3 :
					// Calc.g:120:9: LPAREN ! expr RPAREN !
					{
					root_0 = (Object)adaptor.nil();


					LPAREN63=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_operand1111); 
					pushFollow(FOLLOW_expr_in_operand1114);
					expr64=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr64.getTree());

					RPAREN65=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_operand1116); 
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
	// Calc.g:123:1: type : INTEGER ;
	public final CalcParser.type_return type() throws RecognitionException {
		CalcParser.type_return retval = new CalcParser.type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token INTEGER66=null;

		Object INTEGER66_tree=null;

		try {
			// Calc.g:124:5: ( INTEGER )
			// Calc.g:124:9: INTEGER
			{
			root_0 = (Object)adaptor.nil();


			INTEGER66=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_type1136); 
			INTEGER66_tree = (Object)adaptor.create(INTEGER66);
			adaptor.addChild(root_0, INTEGER66_tree);

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



	public static final BitSet FOLLOW_program_lines_in_program623 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_program625 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_program_lines666 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_declaration_in_program_lines670 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_program_lines673 = new BitSet(new long[]{0x0000000881004202L});
	public static final BitSet FOLLOW_VAR_in_declaration692 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration695 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_COLON_in_declaration697 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_type_in_declaration700 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DO_in_dowhileStatement717 = new BitSet(new long[]{0x0000000081004200L});
	public static final BitSet FOLLOW_statements_in_dowhileStatement720 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_WHILE_in_dowhileStatement722 = new BitSet(new long[]{0x000000000048C000L});
	public static final BitSet FOLLOW_expr_if_in_dowhileStatement724 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statements733 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_statements735 = new BitSet(new long[]{0x0000000081004202L});
	public static final BitSet FOLLOW_assignment_in_statement757 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dowhileStatement_in_statement765 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_stat_in_statement775 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_swap_stat_in_statement783 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lvalue_in_assignment802 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_BECOMES_in_assignment804 = new BitSet(new long[]{0x000000000048C000L});
	public static final BitSet FOLLOW_expr_in_assignment807 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_print_stat826 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_LPAREN_in_print_stat829 = new BitSet(new long[]{0x000000000048C000L});
	public static final BitSet FOLLOW_expr_in_print_stat832 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_print_stat834 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SWAP_in_swap_stat853 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_LPAREN_in_swap_stat856 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_swap_stat859 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_COMMA_in_swap_stat861 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_swap_stat864 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_swap_stat866 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_lvalue883 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_assign_in_expr901 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_if_in_expr_assign913 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_BECOMES_in_expr_assign916 = new BitSet(new long[]{0x000000000048C000L});
	public static final BitSet FOLLOW_expr_assign_in_expr_assign919 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_expr_if936 = new BitSet(new long[]{0x000000000048C000L});
	public static final BitSet FOLLOW_expr_if_in_expr_if939 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_THEN_in_expr_if941 = new BitSet(new long[]{0x000000000048C000L});
	public static final BitSet FOLLOW_expr_if_in_expr_if944 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ELSE_in_expr_if946 = new BitSet(new long[]{0x000000000048C000L});
	public static final BitSet FOLLOW_expr_if_in_expr_if949 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_rel_in_expr_if954 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_plus_in_expr_rel969 = new BitSet(new long[]{0x0000000060203802L});
	public static final BitSet FOLLOW_GREATER_in_expr_rel973 = new BitSet(new long[]{0x0000000000484000L});
	public static final BitSet FOLLOW_SMALLER_in_expr_rel978 = new BitSet(new long[]{0x0000000000484000L});
	public static final BitSet FOLLOW_GREATEREQ_in_expr_rel983 = new BitSet(new long[]{0x0000000000484000L});
	public static final BitSet FOLLOW_SMALLEREQ_in_expr_rel988 = new BitSet(new long[]{0x0000000000484000L});
	public static final BitSet FOLLOW_EQUALS_in_expr_rel993 = new BitSet(new long[]{0x0000000000484000L});
	public static final BitSet FOLLOW_NOTEQUALS_in_expr_rel998 = new BitSet(new long[]{0x0000000000484000L});
	public static final BitSet FOLLOW_expr_plus_in_expr_rel1003 = new BitSet(new long[]{0x0000000060203802L});
	public static final BitSet FOLLOW_expr_times_in_expr_plus1025 = new BitSet(new long[]{0x0000000000900002L});
	public static final BitSet FOLLOW_PLUS_in_expr_plus1029 = new BitSet(new long[]{0x0000000000484000L});
	public static final BitSet FOLLOW_MINUS_in_expr_plus1034 = new BitSet(new long[]{0x0000000000484000L});
	public static final BitSet FOLLOW_expr_times_in_expr_plus1038 = new BitSet(new long[]{0x0000000000900002L});
	public static final BitSet FOLLOW_operand_in_expr_times1059 = new BitSet(new long[]{0x0000000204000002L});
	public static final BitSet FOLLOW_TIMES_in_expr_times1063 = new BitSet(new long[]{0x0000000000484000L});
	public static final BitSet FOLLOW_QUOTIENT_in_expr_times1068 = new BitSet(new long[]{0x0000000000484000L});
	public static final BitSet FOLLOW_operand_in_expr_times1072 = new BitSet(new long[]{0x0000000204000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand1091 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_operand1101 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_operand1111 = new BitSet(new long[]{0x000000000048C000L});
	public static final BitSet FOLLOW_expr_in_operand1114 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_operand1116 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_type1136 = new BitSet(new long[]{0x0000000000000002L});
}
