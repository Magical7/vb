// $ANTLR 3.5 Forrest.g 2013-07-03 07:22:08

package forrest;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class ForrestParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "BECOMES", "BOOL", "CHAR", "CHARACTER", 
		"COLON", "COMMA", "COMMENT", "COMPOUND", "CONSTANT", "DIGIT", "DIVIDE", 
		"DO", "ELSE", "ENDIF", "ENDWHILE", "EQUALS", "EXPR_IF", "EXPR_WHILE", 
		"FALSE", "GREATER", "GREATEREQ", "IDENTIFIER", "IF", "INT", "LCURLY", 
		"LETTER", "LOGAND", "LOGOR", "LOWER", "LPAREN", "MINUS", "MODULO", "NEGATIVE", 
		"NOT", "NOTEQUALS", "NUMBER", "PLUS", "POSITIVE", "PRINT", "PROGRAM", 
		"RCURLY", "READ", "RPAREN", "SEMICOLON", "SMALLER", "SMALLEREQ", "SQUOTE", 
		"THEN", "TIMES", "TRUE", "UPPER", "VAR", "WHILE", "WS"
	};
	public static final int EOF=-1;
	public static final int BECOMES=4;
	public static final int BOOL=5;
	public static final int CHAR=6;
	public static final int CHARACTER=7;
	public static final int COLON=8;
	public static final int COMMA=9;
	public static final int COMMENT=10;
	public static final int COMPOUND=11;
	public static final int CONSTANT=12;
	public static final int DIGIT=13;
	public static final int DIVIDE=14;
	public static final int DO=15;
	public static final int ELSE=16;
	public static final int ENDIF=17;
	public static final int ENDWHILE=18;
	public static final int EQUALS=19;
	public static final int EXPR_IF=20;
	public static final int EXPR_WHILE=21;
	public static final int FALSE=22;
	public static final int GREATER=23;
	public static final int GREATEREQ=24;
	public static final int IDENTIFIER=25;
	public static final int IF=26;
	public static final int INT=27;
	public static final int LCURLY=28;
	public static final int LETTER=29;
	public static final int LOGAND=30;
	public static final int LOGOR=31;
	public static final int LOWER=32;
	public static final int LPAREN=33;
	public static final int MINUS=34;
	public static final int MODULO=35;
	public static final int NEGATIVE=36;
	public static final int NOT=37;
	public static final int NOTEQUALS=38;
	public static final int NUMBER=39;
	public static final int PLUS=40;
	public static final int POSITIVE=41;
	public static final int PRINT=42;
	public static final int PROGRAM=43;
	public static final int RCURLY=44;
	public static final int READ=45;
	public static final int RPAREN=46;
	public static final int SEMICOLON=47;
	public static final int SMALLER=48;
	public static final int SMALLEREQ=49;
	public static final int SQUOTE=50;
	public static final int THEN=51;
	public static final int TIMES=52;
	public static final int TRUE=53;
	public static final int UPPER=54;
	public static final int VAR=55;
	public static final int WHILE=56;
	public static final int WS=57;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public ForrestParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public ForrestParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return ForrestParser.tokenNames; }
	@Override public String getGrammarFileName() { return "Forrest.g"; }


	public static class forrest_return extends ParserRuleReturnScope {
		ForrestTree tree;
		@Override
		public ForrestTree getTree() { return tree; }
	};


	// $ANTLR start "forrest"
	// Forrest.g:74:1: forrest : program_lines EOF -> ^( PROGRAM program_lines ) ;
	public final ForrestParser.forrest_return forrest() throws RecognitionException {
		ForrestParser.forrest_return retval = new ForrestParser.forrest_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		Token EOF2=null;
		ParserRuleReturnScope program_lines1 =null;

		ForrestTree EOF2_tree=null;
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleSubtreeStream stream_program_lines=new RewriteRuleSubtreeStream(adaptor,"rule program_lines");

		try {
			// Forrest.g:75:2: ( program_lines EOF -> ^( PROGRAM program_lines ) )
			// Forrest.g:75:6: program_lines EOF
			{
			pushFollow(FOLLOW_program_lines_in_forrest761);
			program_lines1=program_lines();
			state._fsp--;

			stream_program_lines.add(program_lines1.getTree());
			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_forrest763);  
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

			root_0 = (ForrestTree)adaptor.nil();
			// 76:13: -> ^( PROGRAM program_lines )
			{
				// Forrest.g:76:17: ^( PROGRAM program_lines )
				{
				ForrestTree root_1 = (ForrestTree)adaptor.nil();
				root_1 = (ForrestTree)adaptor.becomeRoot((ForrestTree)adaptor.create(PROGRAM, "PROGRAM"), root_1);
				adaptor.addChild(root_1, stream_program_lines.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (ForrestTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (ForrestTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "forrest"


	public static class program_lines_return extends ParserRuleReturnScope {
		ForrestTree tree;
		@Override
		public ForrestTree getTree() { return tree; }
	};


	// $ANTLR start "program_lines"
	// Forrest.g:79:1: program_lines : ( ( declaration SEMICOLON !)* ( expr SEMICOLON !) )* ;
	public final ForrestParser.program_lines_return program_lines() throws RecognitionException {
		ForrestParser.program_lines_return retval = new ForrestParser.program_lines_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		Token SEMICOLON4=null;
		Token SEMICOLON6=null;
		ParserRuleReturnScope declaration3 =null;
		ParserRuleReturnScope expr5 =null;

		ForrestTree SEMICOLON4_tree=null;
		ForrestTree SEMICOLON6_tree=null;

		try {
			// Forrest.g:80:2: ( ( ( declaration SEMICOLON !)* ( expr SEMICOLON !) )* )
			// Forrest.g:80:4: ( ( declaration SEMICOLON !)* ( expr SEMICOLON !) )*
			{
			root_0 = (ForrestTree)adaptor.nil();


			// Forrest.g:80:4: ( ( declaration SEMICOLON !)* ( expr SEMICOLON !) )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==CHARACTER||LA2_0==CONSTANT||LA2_0==FALSE||(LA2_0 >= IDENTIFIER && LA2_0 <= IF)||LA2_0==LCURLY||(LA2_0 >= LPAREN && LA2_0 <= MINUS)||LA2_0==NOT||(LA2_0 >= NUMBER && LA2_0 <= PLUS)||LA2_0==PRINT||LA2_0==READ||LA2_0==TRUE||(LA2_0 >= VAR && LA2_0 <= WHILE)) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// Forrest.g:80:5: ( declaration SEMICOLON !)* ( expr SEMICOLON !)
					{
					// Forrest.g:80:5: ( declaration SEMICOLON !)*
					loop1:
					while (true) {
						int alt1=2;
						int LA1_0 = input.LA(1);
						if ( (LA1_0==CONSTANT||LA1_0==VAR) ) {
							alt1=1;
						}

						switch (alt1) {
						case 1 :
							// Forrest.g:80:6: declaration SEMICOLON !
							{
							pushFollow(FOLLOW_declaration_in_program_lines804);
							declaration3=declaration();
							state._fsp--;

							adaptor.addChild(root_0, declaration3.getTree());

							SEMICOLON4=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_program_lines806); 
							}
							break;

						default :
							break loop1;
						}
					}

					// Forrest.g:80:31: ( expr SEMICOLON !)
					// Forrest.g:80:32: expr SEMICOLON !
					{
					pushFollow(FOLLOW_expr_in_program_lines812);
					expr5=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr5.getTree());

					SEMICOLON6=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_program_lines814); 
					}

					}
					break;

				default :
					break loop2;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (ForrestTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (ForrestTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "program_lines"


	public static class declaration_return extends ParserRuleReturnScope {
		ForrestTree tree;
		@Override
		public ForrestTree getTree() { return tree; }
	};


	// $ANTLR start "declaration"
	// Forrest.g:83:1: declaration : ( VAR ^ IDENTIFIER ( CHAR | BOOL | INT ) | CONSTANT ^ IDENTIFIER BECOMES ! expr );
	public final ForrestParser.declaration_return declaration() throws RecognitionException {
		ForrestParser.declaration_return retval = new ForrestParser.declaration_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		Token VAR7=null;
		Token IDENTIFIER8=null;
		Token set9=null;
		Token CONSTANT10=null;
		Token IDENTIFIER11=null;
		Token BECOMES12=null;
		ParserRuleReturnScope expr13 =null;

		ForrestTree VAR7_tree=null;
		ForrestTree IDENTIFIER8_tree=null;
		ForrestTree set9_tree=null;
		ForrestTree CONSTANT10_tree=null;
		ForrestTree IDENTIFIER11_tree=null;
		ForrestTree BECOMES12_tree=null;

		try {
			// Forrest.g:84:2: ( VAR ^ IDENTIFIER ( CHAR | BOOL | INT ) | CONSTANT ^ IDENTIFIER BECOMES ! expr )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==VAR) ) {
				alt3=1;
			}
			else if ( (LA3_0==CONSTANT) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// Forrest.g:84:4: VAR ^ IDENTIFIER ( CHAR | BOOL | INT )
					{
					root_0 = (ForrestTree)adaptor.nil();


					VAR7=(Token)match(input,VAR,FOLLOW_VAR_in_declaration830); 
					VAR7_tree = (ForrestTree)adaptor.create(VAR7);
					root_0 = (ForrestTree)adaptor.becomeRoot(VAR7_tree, root_0);

					IDENTIFIER8=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration833); 
					IDENTIFIER8_tree = (ForrestTree)adaptor.create(IDENTIFIER8);
					adaptor.addChild(root_0, IDENTIFIER8_tree);

					set9=input.LT(1);
					if ( (input.LA(1) >= BOOL && input.LA(1) <= CHAR)||input.LA(1)==INT ) {
						input.consume();
						adaptor.addChild(root_0, (ForrestTree)adaptor.create(set9));
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;
				case 2 :
					// Forrest.g:85:4: CONSTANT ^ IDENTIFIER BECOMES ! expr
					{
					root_0 = (ForrestTree)adaptor.nil();


					CONSTANT10=(Token)match(input,CONSTANT,FOLLOW_CONSTANT_in_declaration850); 
					CONSTANT10_tree = (ForrestTree)adaptor.create(CONSTANT10);
					root_0 = (ForrestTree)adaptor.becomeRoot(CONSTANT10_tree, root_0);

					IDENTIFIER11=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration853); 
					IDENTIFIER11_tree = (ForrestTree)adaptor.create(IDENTIFIER11);
					adaptor.addChild(root_0, IDENTIFIER11_tree);

					BECOMES12=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_declaration855); 
					pushFollow(FOLLOW_expr_in_declaration858);
					expr13=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr13.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (ForrestTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (ForrestTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declaration"


	public static class expr_return extends ParserRuleReturnScope {
		ForrestTree tree;
		@Override
		public ForrestTree getTree() { return tree; }
	};


	// $ANTLR start "expr"
	// Forrest.g:88:1: expr : expr_assign ;
	public final ForrestParser.expr_return expr() throws RecognitionException {
		ForrestParser.expr_return retval = new ForrestParser.expr_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		ParserRuleReturnScope expr_assign14 =null;


		try {
			// Forrest.g:89:2: ( expr_assign )
			// Forrest.g:89:5: expr_assign
			{
			root_0 = (ForrestTree)adaptor.nil();


			pushFollow(FOLLOW_expr_assign_in_expr870);
			expr_assign14=expr_assign();
			state._fsp--;

			adaptor.addChild(root_0, expr_assign14.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (ForrestTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (ForrestTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr"


	public static class expr_assign_return extends ParserRuleReturnScope {
		ForrestTree tree;
		@Override
		public ForrestTree getTree() { return tree; }
	};


	// $ANTLR start "expr_assign"
	// Forrest.g:92:1: expr_assign options {k=2; } : ( IDENTIFIER BECOMES ^ expr_assign | expr_or );
	public final ForrestParser.expr_assign_return expr_assign() throws RecognitionException {
		ForrestParser.expr_assign_return retval = new ForrestParser.expr_assign_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		Token IDENTIFIER15=null;
		Token BECOMES16=null;
		ParserRuleReturnScope expr_assign17 =null;
		ParserRuleReturnScope expr_or18 =null;

		ForrestTree IDENTIFIER15_tree=null;
		ForrestTree BECOMES16_tree=null;

		try {
			// Forrest.g:94:2: ( IDENTIFIER BECOMES ^ expr_assign | expr_or )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==IDENTIFIER) ) {
				int LA4_1 = input.LA(2);
				if ( (LA4_1==BECOMES) ) {
					alt4=1;
				}
				else if ( (LA4_1==COMMA||LA4_1==DIVIDE||LA4_1==EQUALS||(LA4_1 >= GREATER && LA4_1 <= GREATEREQ)||(LA4_1 >= LOGAND && LA4_1 <= LOGOR)||(LA4_1 >= MINUS && LA4_1 <= MODULO)||LA4_1==NOTEQUALS||LA4_1==PLUS||(LA4_1 >= RPAREN && LA4_1 <= SMALLEREQ)||LA4_1==TIMES) ) {
					alt4=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA4_0==CHARACTER||LA4_0==FALSE||LA4_0==IF||LA4_0==LCURLY||(LA4_0 >= LPAREN && LA4_0 <= MINUS)||LA4_0==NOT||(LA4_0 >= NUMBER && LA4_0 <= PLUS)||LA4_0==PRINT||LA4_0==READ||LA4_0==TRUE||LA4_0==WHILE) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// Forrest.g:94:4: IDENTIFIER BECOMES ^ expr_assign
					{
					root_0 = (ForrestTree)adaptor.nil();


					IDENTIFIER15=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expr_assign889); 
					IDENTIFIER15_tree = (ForrestTree)adaptor.create(IDENTIFIER15);
					adaptor.addChild(root_0, IDENTIFIER15_tree);

					BECOMES16=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_expr_assign891); 
					BECOMES16_tree = (ForrestTree)adaptor.create(BECOMES16);
					root_0 = (ForrestTree)adaptor.becomeRoot(BECOMES16_tree, root_0);

					pushFollow(FOLLOW_expr_assign_in_expr_assign894);
					expr_assign17=expr_assign();
					state._fsp--;

					adaptor.addChild(root_0, expr_assign17.getTree());

					}
					break;
				case 2 :
					// Forrest.g:95:4: expr_or
					{
					root_0 = (ForrestTree)adaptor.nil();


					pushFollow(FOLLOW_expr_or_in_expr_assign899);
					expr_or18=expr_or();
					state._fsp--;

					adaptor.addChild(root_0, expr_or18.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (ForrestTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (ForrestTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr_assign"


	public static class expr_while_return extends ParserRuleReturnScope {
		ForrestTree tree;
		@Override
		public ForrestTree getTree() { return tree; }
	};


	// $ANTLR start "expr_while"
	// Forrest.g:98:1: expr_while : while_comp do_comp ENDWHILE -> ^( EXPR_WHILE while_comp do_comp ) ;
	public final ForrestParser.expr_while_return expr_while() throws RecognitionException {
		ForrestParser.expr_while_return retval = new ForrestParser.expr_while_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		Token ENDWHILE21=null;
		ParserRuleReturnScope while_comp19 =null;
		ParserRuleReturnScope do_comp20 =null;

		ForrestTree ENDWHILE21_tree=null;
		RewriteRuleTokenStream stream_ENDWHILE=new RewriteRuleTokenStream(adaptor,"token ENDWHILE");
		RewriteRuleSubtreeStream stream_do_comp=new RewriteRuleSubtreeStream(adaptor,"rule do_comp");
		RewriteRuleSubtreeStream stream_while_comp=new RewriteRuleSubtreeStream(adaptor,"rule while_comp");

		try {
			// Forrest.g:99:2: ( while_comp do_comp ENDWHILE -> ^( EXPR_WHILE while_comp do_comp ) )
			// Forrest.g:99:4: while_comp do_comp ENDWHILE
			{
			pushFollow(FOLLOW_while_comp_in_expr_while911);
			while_comp19=while_comp();
			state._fsp--;

			stream_while_comp.add(while_comp19.getTree());
			pushFollow(FOLLOW_do_comp_in_expr_while913);
			do_comp20=do_comp();
			state._fsp--;

			stream_do_comp.add(do_comp20.getTree());
			ENDWHILE21=(Token)match(input,ENDWHILE,FOLLOW_ENDWHILE_in_expr_while915);  
			stream_ENDWHILE.add(ENDWHILE21);

			// AST REWRITE
			// elements: while_comp, do_comp
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ForrestTree)adaptor.nil();
			// 100:4: -> ^( EXPR_WHILE while_comp do_comp )
			{
				// Forrest.g:100:7: ^( EXPR_WHILE while_comp do_comp )
				{
				ForrestTree root_1 = (ForrestTree)adaptor.nil();
				root_1 = (ForrestTree)adaptor.becomeRoot((ForrestTree)adaptor.create(EXPR_WHILE, "EXPR_WHILE"), root_1);
				adaptor.addChild(root_1, stream_while_comp.nextTree());
				adaptor.addChild(root_1, stream_do_comp.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (ForrestTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (ForrestTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr_while"


	public static class while_comp_return extends ParserRuleReturnScope {
		ForrestTree tree;
		@Override
		public ForrestTree getTree() { return tree; }
	};


	// $ANTLR start "while_comp"
	// Forrest.g:103:1: while_comp : WHILE ^ COLON ! program_lines ;
	public final ForrestParser.while_comp_return while_comp() throws RecognitionException {
		ForrestParser.while_comp_return retval = new ForrestParser.while_comp_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		Token WHILE22=null;
		Token COLON23=null;
		ParserRuleReturnScope program_lines24 =null;

		ForrestTree WHILE22_tree=null;
		ForrestTree COLON23_tree=null;

		try {
			// Forrest.g:104:2: ( WHILE ^ COLON ! program_lines )
			// Forrest.g:104:4: WHILE ^ COLON ! program_lines
			{
			root_0 = (ForrestTree)adaptor.nil();


			WHILE22=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_comp940); 
			WHILE22_tree = (ForrestTree)adaptor.create(WHILE22);
			root_0 = (ForrestTree)adaptor.becomeRoot(WHILE22_tree, root_0);

			COLON23=(Token)match(input,COLON,FOLLOW_COLON_in_while_comp943); 
			pushFollow(FOLLOW_program_lines_in_while_comp946);
			program_lines24=program_lines();
			state._fsp--;

			adaptor.addChild(root_0, program_lines24.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (ForrestTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (ForrestTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "while_comp"


	public static class do_comp_return extends ParserRuleReturnScope {
		ForrestTree tree;
		@Override
		public ForrestTree getTree() { return tree; }
	};


	// $ANTLR start "do_comp"
	// Forrest.g:107:1: do_comp : DO ^ COLON ! program_lines ;
	public final ForrestParser.do_comp_return do_comp() throws RecognitionException {
		ForrestParser.do_comp_return retval = new ForrestParser.do_comp_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		Token DO25=null;
		Token COLON26=null;
		ParserRuleReturnScope program_lines27 =null;

		ForrestTree DO25_tree=null;
		ForrestTree COLON26_tree=null;

		try {
			// Forrest.g:108:2: ( DO ^ COLON ! program_lines )
			// Forrest.g:108:4: DO ^ COLON ! program_lines
			{
			root_0 = (ForrestTree)adaptor.nil();


			DO25=(Token)match(input,DO,FOLLOW_DO_in_do_comp957); 
			DO25_tree = (ForrestTree)adaptor.create(DO25);
			root_0 = (ForrestTree)adaptor.becomeRoot(DO25_tree, root_0);

			COLON26=(Token)match(input,COLON,FOLLOW_COLON_in_do_comp960); 
			pushFollow(FOLLOW_program_lines_in_do_comp963);
			program_lines27=program_lines();
			state._fsp--;

			adaptor.addChild(root_0, program_lines27.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (ForrestTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (ForrestTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "do_comp"


	public static class expr_if_return extends ParserRuleReturnScope {
		ForrestTree tree;
		@Override
		public ForrestTree getTree() { return tree; }
	};


	// $ANTLR start "expr_if"
	// Forrest.g:111:1: expr_if : if_comp then_comp ( else_comp )? ENDIF -> ^( EXPR_IF if_comp then_comp ( else_comp )? ) ;
	public final ForrestParser.expr_if_return expr_if() throws RecognitionException {
		ForrestParser.expr_if_return retval = new ForrestParser.expr_if_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		Token ENDIF31=null;
		ParserRuleReturnScope if_comp28 =null;
		ParserRuleReturnScope then_comp29 =null;
		ParserRuleReturnScope else_comp30 =null;

		ForrestTree ENDIF31_tree=null;
		RewriteRuleTokenStream stream_ENDIF=new RewriteRuleTokenStream(adaptor,"token ENDIF");
		RewriteRuleSubtreeStream stream_then_comp=new RewriteRuleSubtreeStream(adaptor,"rule then_comp");
		RewriteRuleSubtreeStream stream_else_comp=new RewriteRuleSubtreeStream(adaptor,"rule else_comp");
		RewriteRuleSubtreeStream stream_if_comp=new RewriteRuleSubtreeStream(adaptor,"rule if_comp");

		try {
			// Forrest.g:112:2: ( if_comp then_comp ( else_comp )? ENDIF -> ^( EXPR_IF if_comp then_comp ( else_comp )? ) )
			// Forrest.g:112:4: if_comp then_comp ( else_comp )? ENDIF
			{
			pushFollow(FOLLOW_if_comp_in_expr_if975);
			if_comp28=if_comp();
			state._fsp--;

			stream_if_comp.add(if_comp28.getTree());
			pushFollow(FOLLOW_then_comp_in_expr_if977);
			then_comp29=then_comp();
			state._fsp--;

			stream_then_comp.add(then_comp29.getTree());
			// Forrest.g:112:22: ( else_comp )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==ELSE) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// Forrest.g:112:22: else_comp
					{
					pushFollow(FOLLOW_else_comp_in_expr_if979);
					else_comp30=else_comp();
					state._fsp--;

					stream_else_comp.add(else_comp30.getTree());
					}
					break;

			}

			ENDIF31=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_expr_if982);  
			stream_ENDIF.add(ENDIF31);

			// AST REWRITE
			// elements: if_comp, else_comp, then_comp
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ForrestTree)adaptor.nil();
			// 113:4: -> ^( EXPR_IF if_comp then_comp ( else_comp )? )
			{
				// Forrest.g:113:7: ^( EXPR_IF if_comp then_comp ( else_comp )? )
				{
				ForrestTree root_1 = (ForrestTree)adaptor.nil();
				root_1 = (ForrestTree)adaptor.becomeRoot((ForrestTree)adaptor.create(EXPR_IF, "EXPR_IF"), root_1);
				adaptor.addChild(root_1, stream_if_comp.nextTree());
				adaptor.addChild(root_1, stream_then_comp.nextTree());
				// Forrest.g:113:35: ( else_comp )?
				if ( stream_else_comp.hasNext() ) {
					adaptor.addChild(root_1, stream_else_comp.nextTree());
				}
				stream_else_comp.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (ForrestTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (ForrestTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr_if"


	public static class if_comp_return extends ParserRuleReturnScope {
		ForrestTree tree;
		@Override
		public ForrestTree getTree() { return tree; }
	};


	// $ANTLR start "if_comp"
	// Forrest.g:116:1: if_comp : IF ^ COLON ! program_lines ;
	public final ForrestParser.if_comp_return if_comp() throws RecognitionException {
		ForrestParser.if_comp_return retval = new ForrestParser.if_comp_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		Token IF32=null;
		Token COLON33=null;
		ParserRuleReturnScope program_lines34 =null;

		ForrestTree IF32_tree=null;
		ForrestTree COLON33_tree=null;

		try {
			// Forrest.g:117:2: ( IF ^ COLON ! program_lines )
			// Forrest.g:117:4: IF ^ COLON ! program_lines
			{
			root_0 = (ForrestTree)adaptor.nil();


			IF32=(Token)match(input,IF,FOLLOW_IF_in_if_comp1009); 
			IF32_tree = (ForrestTree)adaptor.create(IF32);
			root_0 = (ForrestTree)adaptor.becomeRoot(IF32_tree, root_0);

			COLON33=(Token)match(input,COLON,FOLLOW_COLON_in_if_comp1012); 
			pushFollow(FOLLOW_program_lines_in_if_comp1015);
			program_lines34=program_lines();
			state._fsp--;

			adaptor.addChild(root_0, program_lines34.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (ForrestTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (ForrestTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "if_comp"


	public static class then_comp_return extends ParserRuleReturnScope {
		ForrestTree tree;
		@Override
		public ForrestTree getTree() { return tree; }
	};


	// $ANTLR start "then_comp"
	// Forrest.g:120:1: then_comp : THEN ^ COLON ! program_lines ;
	public final ForrestParser.then_comp_return then_comp() throws RecognitionException {
		ForrestParser.then_comp_return retval = new ForrestParser.then_comp_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		Token THEN35=null;
		Token COLON36=null;
		ParserRuleReturnScope program_lines37 =null;

		ForrestTree THEN35_tree=null;
		ForrestTree COLON36_tree=null;

		try {
			// Forrest.g:121:2: ( THEN ^ COLON ! program_lines )
			// Forrest.g:121:4: THEN ^ COLON ! program_lines
			{
			root_0 = (ForrestTree)adaptor.nil();


			THEN35=(Token)match(input,THEN,FOLLOW_THEN_in_then_comp1026); 
			THEN35_tree = (ForrestTree)adaptor.create(THEN35);
			root_0 = (ForrestTree)adaptor.becomeRoot(THEN35_tree, root_0);

			COLON36=(Token)match(input,COLON,FOLLOW_COLON_in_then_comp1029); 
			pushFollow(FOLLOW_program_lines_in_then_comp1032);
			program_lines37=program_lines();
			state._fsp--;

			adaptor.addChild(root_0, program_lines37.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (ForrestTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (ForrestTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "then_comp"


	public static class else_comp_return extends ParserRuleReturnScope {
		ForrestTree tree;
		@Override
		public ForrestTree getTree() { return tree; }
	};


	// $ANTLR start "else_comp"
	// Forrest.g:124:1: else_comp : ELSE ^ COLON ! program_lines ;
	public final ForrestParser.else_comp_return else_comp() throws RecognitionException {
		ForrestParser.else_comp_return retval = new ForrestParser.else_comp_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		Token ELSE38=null;
		Token COLON39=null;
		ParserRuleReturnScope program_lines40 =null;

		ForrestTree ELSE38_tree=null;
		ForrestTree COLON39_tree=null;

		try {
			// Forrest.g:125:2: ( ELSE ^ COLON ! program_lines )
			// Forrest.g:125:4: ELSE ^ COLON ! program_lines
			{
			root_0 = (ForrestTree)adaptor.nil();


			ELSE38=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_comp1043); 
			ELSE38_tree = (ForrestTree)adaptor.create(ELSE38);
			root_0 = (ForrestTree)adaptor.becomeRoot(ELSE38_tree, root_0);

			COLON39=(Token)match(input,COLON,FOLLOW_COLON_in_else_comp1046); 
			pushFollow(FOLLOW_program_lines_in_else_comp1049);
			program_lines40=program_lines();
			state._fsp--;

			adaptor.addChild(root_0, program_lines40.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (ForrestTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (ForrestTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "else_comp"


	public static class expr_or_return extends ParserRuleReturnScope {
		ForrestTree tree;
		@Override
		public ForrestTree getTree() { return tree; }
	};


	// $ANTLR start "expr_or"
	// Forrest.g:128:1: expr_or : expr_and ( LOGOR ^ expr_and )* ;
	public final ForrestParser.expr_or_return expr_or() throws RecognitionException {
		ForrestParser.expr_or_return retval = new ForrestParser.expr_or_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		Token LOGOR42=null;
		ParserRuleReturnScope expr_and41 =null;
		ParserRuleReturnScope expr_and43 =null;

		ForrestTree LOGOR42_tree=null;

		try {
			// Forrest.g:129:2: ( expr_and ( LOGOR ^ expr_and )* )
			// Forrest.g:129:4: expr_and ( LOGOR ^ expr_and )*
			{
			root_0 = (ForrestTree)adaptor.nil();


			pushFollow(FOLLOW_expr_and_in_expr_or1061);
			expr_and41=expr_and();
			state._fsp--;

			adaptor.addChild(root_0, expr_and41.getTree());

			// Forrest.g:129:13: ( LOGOR ^ expr_and )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==LOGOR) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// Forrest.g:129:14: LOGOR ^ expr_and
					{
					LOGOR42=(Token)match(input,LOGOR,FOLLOW_LOGOR_in_expr_or1064); 
					LOGOR42_tree = (ForrestTree)adaptor.create(LOGOR42);
					root_0 = (ForrestTree)adaptor.becomeRoot(LOGOR42_tree, root_0);

					pushFollow(FOLLOW_expr_and_in_expr_or1067);
					expr_and43=expr_and();
					state._fsp--;

					adaptor.addChild(root_0, expr_and43.getTree());

					}
					break;

				default :
					break loop6;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (ForrestTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (ForrestTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr_or"


	public static class expr_and_return extends ParserRuleReturnScope {
		ForrestTree tree;
		@Override
		public ForrestTree getTree() { return tree; }
	};


	// $ANTLR start "expr_and"
	// Forrest.g:132:1: expr_and : expr_comp ( LOGAND ^ expr_comp )* ;
	public final ForrestParser.expr_and_return expr_and() throws RecognitionException {
		ForrestParser.expr_and_return retval = new ForrestParser.expr_and_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		Token LOGAND45=null;
		ParserRuleReturnScope expr_comp44 =null;
		ParserRuleReturnScope expr_comp46 =null;

		ForrestTree LOGAND45_tree=null;

		try {
			// Forrest.g:133:2: ( expr_comp ( LOGAND ^ expr_comp )* )
			// Forrest.g:133:4: expr_comp ( LOGAND ^ expr_comp )*
			{
			root_0 = (ForrestTree)adaptor.nil();


			pushFollow(FOLLOW_expr_comp_in_expr_and1081);
			expr_comp44=expr_comp();
			state._fsp--;

			adaptor.addChild(root_0, expr_comp44.getTree());

			// Forrest.g:133:14: ( LOGAND ^ expr_comp )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==LOGAND) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// Forrest.g:133:15: LOGAND ^ expr_comp
					{
					LOGAND45=(Token)match(input,LOGAND,FOLLOW_LOGAND_in_expr_and1084); 
					LOGAND45_tree = (ForrestTree)adaptor.create(LOGAND45);
					root_0 = (ForrestTree)adaptor.becomeRoot(LOGAND45_tree, root_0);

					pushFollow(FOLLOW_expr_comp_in_expr_and1087);
					expr_comp46=expr_comp();
					state._fsp--;

					adaptor.addChild(root_0, expr_comp46.getTree());

					}
					break;

				default :
					break loop7;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (ForrestTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (ForrestTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr_and"


	public static class expr_comp_return extends ParserRuleReturnScope {
		ForrestTree tree;
		@Override
		public ForrestTree getTree() { return tree; }
	};


	// $ANTLR start "expr_comp"
	// Forrest.g:136:1: expr_comp : expr_add ( ( GREATER ^| SMALLER ^| GREATEREQ ^| SMALLEREQ ^| EQUALS ^| NOTEQUALS ^) expr_add )* ;
	public final ForrestParser.expr_comp_return expr_comp() throws RecognitionException {
		ForrestParser.expr_comp_return retval = new ForrestParser.expr_comp_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		Token GREATER48=null;
		Token SMALLER49=null;
		Token GREATEREQ50=null;
		Token SMALLEREQ51=null;
		Token EQUALS52=null;
		Token NOTEQUALS53=null;
		ParserRuleReturnScope expr_add47 =null;
		ParserRuleReturnScope expr_add54 =null;

		ForrestTree GREATER48_tree=null;
		ForrestTree SMALLER49_tree=null;
		ForrestTree GREATEREQ50_tree=null;
		ForrestTree SMALLEREQ51_tree=null;
		ForrestTree EQUALS52_tree=null;
		ForrestTree NOTEQUALS53_tree=null;

		try {
			// Forrest.g:137:2: ( expr_add ( ( GREATER ^| SMALLER ^| GREATEREQ ^| SMALLEREQ ^| EQUALS ^| NOTEQUALS ^) expr_add )* )
			// Forrest.g:137:4: expr_add ( ( GREATER ^| SMALLER ^| GREATEREQ ^| SMALLEREQ ^| EQUALS ^| NOTEQUALS ^) expr_add )*
			{
			root_0 = (ForrestTree)adaptor.nil();


			pushFollow(FOLLOW_expr_add_in_expr_comp1101);
			expr_add47=expr_add();
			state._fsp--;

			adaptor.addChild(root_0, expr_add47.getTree());

			// Forrest.g:137:13: ( ( GREATER ^| SMALLER ^| GREATEREQ ^| SMALLEREQ ^| EQUALS ^| NOTEQUALS ^) expr_add )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==EQUALS||(LA9_0 >= GREATER && LA9_0 <= GREATEREQ)||LA9_0==NOTEQUALS||(LA9_0 >= SMALLER && LA9_0 <= SMALLEREQ)) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// Forrest.g:137:14: ( GREATER ^| SMALLER ^| GREATEREQ ^| SMALLEREQ ^| EQUALS ^| NOTEQUALS ^) expr_add
					{
					// Forrest.g:137:14: ( GREATER ^| SMALLER ^| GREATEREQ ^| SMALLEREQ ^| EQUALS ^| NOTEQUALS ^)
					int alt8=6;
					switch ( input.LA(1) ) {
					case GREATER:
						{
						alt8=1;
						}
						break;
					case SMALLER:
						{
						alt8=2;
						}
						break;
					case GREATEREQ:
						{
						alt8=3;
						}
						break;
					case SMALLEREQ:
						{
						alt8=4;
						}
						break;
					case EQUALS:
						{
						alt8=5;
						}
						break;
					case NOTEQUALS:
						{
						alt8=6;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 8, 0, input);
						throw nvae;
					}
					switch (alt8) {
						case 1 :
							// Forrest.g:137:15: GREATER ^
							{
							GREATER48=(Token)match(input,GREATER,FOLLOW_GREATER_in_expr_comp1105); 
							GREATER48_tree = (ForrestTree)adaptor.create(GREATER48);
							root_0 = (ForrestTree)adaptor.becomeRoot(GREATER48_tree, root_0);

							}
							break;
						case 2 :
							// Forrest.g:137:26: SMALLER ^
							{
							SMALLER49=(Token)match(input,SMALLER,FOLLOW_SMALLER_in_expr_comp1110); 
							SMALLER49_tree = (ForrestTree)adaptor.create(SMALLER49);
							root_0 = (ForrestTree)adaptor.becomeRoot(SMALLER49_tree, root_0);

							}
							break;
						case 3 :
							// Forrest.g:137:37: GREATEREQ ^
							{
							GREATEREQ50=(Token)match(input,GREATEREQ,FOLLOW_GREATEREQ_in_expr_comp1115); 
							GREATEREQ50_tree = (ForrestTree)adaptor.create(GREATEREQ50);
							root_0 = (ForrestTree)adaptor.becomeRoot(GREATEREQ50_tree, root_0);

							}
							break;
						case 4 :
							// Forrest.g:137:50: SMALLEREQ ^
							{
							SMALLEREQ51=(Token)match(input,SMALLEREQ,FOLLOW_SMALLEREQ_in_expr_comp1120); 
							SMALLEREQ51_tree = (ForrestTree)adaptor.create(SMALLEREQ51);
							root_0 = (ForrestTree)adaptor.becomeRoot(SMALLEREQ51_tree, root_0);

							}
							break;
						case 5 :
							// Forrest.g:137:63: EQUALS ^
							{
							EQUALS52=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_expr_comp1125); 
							EQUALS52_tree = (ForrestTree)adaptor.create(EQUALS52);
							root_0 = (ForrestTree)adaptor.becomeRoot(EQUALS52_tree, root_0);

							}
							break;
						case 6 :
							// Forrest.g:137:73: NOTEQUALS ^
							{
							NOTEQUALS53=(Token)match(input,NOTEQUALS,FOLLOW_NOTEQUALS_in_expr_comp1130); 
							NOTEQUALS53_tree = (ForrestTree)adaptor.create(NOTEQUALS53);
							root_0 = (ForrestTree)adaptor.becomeRoot(NOTEQUALS53_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_expr_add_in_expr_comp1135);
					expr_add54=expr_add();
					state._fsp--;

					adaptor.addChild(root_0, expr_add54.getTree());

					}
					break;

				default :
					break loop9;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (ForrestTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (ForrestTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr_comp"


	public static class expr_add_return extends ParserRuleReturnScope {
		ForrestTree tree;
		@Override
		public ForrestTree getTree() { return tree; }
	};


	// $ANTLR start "expr_add"
	// Forrest.g:140:1: expr_add : expr_mult ( ( PLUS ^| MINUS ^) expr_mult )* ;
	public final ForrestParser.expr_add_return expr_add() throws RecognitionException {
		ForrestParser.expr_add_return retval = new ForrestParser.expr_add_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		Token PLUS56=null;
		Token MINUS57=null;
		ParserRuleReturnScope expr_mult55 =null;
		ParserRuleReturnScope expr_mult58 =null;

		ForrestTree PLUS56_tree=null;
		ForrestTree MINUS57_tree=null;

		try {
			// Forrest.g:141:2: ( expr_mult ( ( PLUS ^| MINUS ^) expr_mult )* )
			// Forrest.g:141:4: expr_mult ( ( PLUS ^| MINUS ^) expr_mult )*
			{
			root_0 = (ForrestTree)adaptor.nil();


			pushFollow(FOLLOW_expr_mult_in_expr_add1149);
			expr_mult55=expr_mult();
			state._fsp--;

			adaptor.addChild(root_0, expr_mult55.getTree());

			// Forrest.g:141:14: ( ( PLUS ^| MINUS ^) expr_mult )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==MINUS||LA11_0==PLUS) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// Forrest.g:141:15: ( PLUS ^| MINUS ^) expr_mult
					{
					// Forrest.g:141:15: ( PLUS ^| MINUS ^)
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==PLUS) ) {
						alt10=1;
					}
					else if ( (LA10_0==MINUS) ) {
						alt10=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 10, 0, input);
						throw nvae;
					}

					switch (alt10) {
						case 1 :
							// Forrest.g:141:16: PLUS ^
							{
							PLUS56=(Token)match(input,PLUS,FOLLOW_PLUS_in_expr_add1153); 
							PLUS56_tree = (ForrestTree)adaptor.create(PLUS56);
							root_0 = (ForrestTree)adaptor.becomeRoot(PLUS56_tree, root_0);

							}
							break;
						case 2 :
							// Forrest.g:141:24: MINUS ^
							{
							MINUS57=(Token)match(input,MINUS,FOLLOW_MINUS_in_expr_add1158); 
							MINUS57_tree = (ForrestTree)adaptor.create(MINUS57);
							root_0 = (ForrestTree)adaptor.becomeRoot(MINUS57_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_expr_mult_in_expr_add1162);
					expr_mult58=expr_mult();
					state._fsp--;

					adaptor.addChild(root_0, expr_mult58.getTree());

					}
					break;

				default :
					break loop11;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (ForrestTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (ForrestTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr_add"


	public static class expr_mult_return extends ParserRuleReturnScope {
		ForrestTree tree;
		@Override
		public ForrestTree getTree() { return tree; }
	};


	// $ANTLR start "expr_mult"
	// Forrest.g:144:1: expr_mult : expr_unary ( ( TIMES ^| DIVIDE ^| MODULO ^) expr_unary )* ;
	public final ForrestParser.expr_mult_return expr_mult() throws RecognitionException {
		ForrestParser.expr_mult_return retval = new ForrestParser.expr_mult_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		Token TIMES60=null;
		Token DIVIDE61=null;
		Token MODULO62=null;
		ParserRuleReturnScope expr_unary59 =null;
		ParserRuleReturnScope expr_unary63 =null;

		ForrestTree TIMES60_tree=null;
		ForrestTree DIVIDE61_tree=null;
		ForrestTree MODULO62_tree=null;

		try {
			// Forrest.g:145:2: ( expr_unary ( ( TIMES ^| DIVIDE ^| MODULO ^) expr_unary )* )
			// Forrest.g:145:4: expr_unary ( ( TIMES ^| DIVIDE ^| MODULO ^) expr_unary )*
			{
			root_0 = (ForrestTree)adaptor.nil();


			pushFollow(FOLLOW_expr_unary_in_expr_mult1175);
			expr_unary59=expr_unary();
			state._fsp--;

			adaptor.addChild(root_0, expr_unary59.getTree());

			// Forrest.g:145:15: ( ( TIMES ^| DIVIDE ^| MODULO ^) expr_unary )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==DIVIDE||LA13_0==MODULO||LA13_0==TIMES) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// Forrest.g:145:16: ( TIMES ^| DIVIDE ^| MODULO ^) expr_unary
					{
					// Forrest.g:145:16: ( TIMES ^| DIVIDE ^| MODULO ^)
					int alt12=3;
					switch ( input.LA(1) ) {
					case TIMES:
						{
						alt12=1;
						}
						break;
					case DIVIDE:
						{
						alt12=2;
						}
						break;
					case MODULO:
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
							// Forrest.g:145:17: TIMES ^
							{
							TIMES60=(Token)match(input,TIMES,FOLLOW_TIMES_in_expr_mult1179); 
							TIMES60_tree = (ForrestTree)adaptor.create(TIMES60);
							root_0 = (ForrestTree)adaptor.becomeRoot(TIMES60_tree, root_0);

							}
							break;
						case 2 :
							// Forrest.g:145:26: DIVIDE ^
							{
							DIVIDE61=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_expr_mult1184); 
							DIVIDE61_tree = (ForrestTree)adaptor.create(DIVIDE61);
							root_0 = (ForrestTree)adaptor.becomeRoot(DIVIDE61_tree, root_0);

							}
							break;
						case 3 :
							// Forrest.g:145:36: MODULO ^
							{
							MODULO62=(Token)match(input,MODULO,FOLLOW_MODULO_in_expr_mult1189); 
							MODULO62_tree = (ForrestTree)adaptor.create(MODULO62);
							root_0 = (ForrestTree)adaptor.becomeRoot(MODULO62_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_expr_unary_in_expr_mult1193);
					expr_unary63=expr_unary();
					state._fsp--;

					adaptor.addChild(root_0, expr_unary63.getTree());

					}
					break;

				default :
					break loop13;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (ForrestTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (ForrestTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr_mult"


	public static class expr_unary_return extends ParserRuleReturnScope {
		ForrestTree tree;
		@Override
		public ForrestTree getTree() { return tree; }
	};


	// $ANTLR start "expr_unary"
	// Forrest.g:148:1: expr_unary : ( ( NOT ^)? expr_compound | PLUS expr_compound -> ^( POSITIVE expr_compound ) | MINUS expr_compound -> ^( NEGATIVE expr_compound ) );
	public final ForrestParser.expr_unary_return expr_unary() throws RecognitionException {
		ForrestParser.expr_unary_return retval = new ForrestParser.expr_unary_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		Token NOT64=null;
		Token PLUS66=null;
		Token MINUS68=null;
		ParserRuleReturnScope expr_compound65 =null;
		ParserRuleReturnScope expr_compound67 =null;
		ParserRuleReturnScope expr_compound69 =null;

		ForrestTree NOT64_tree=null;
		ForrestTree PLUS66_tree=null;
		ForrestTree MINUS68_tree=null;
		RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
		RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
		RewriteRuleSubtreeStream stream_expr_compound=new RewriteRuleSubtreeStream(adaptor,"rule expr_compound");

		try {
			// Forrest.g:149:2: ( ( NOT ^)? expr_compound | PLUS expr_compound -> ^( POSITIVE expr_compound ) | MINUS expr_compound -> ^( NEGATIVE expr_compound ) )
			int alt15=3;
			switch ( input.LA(1) ) {
			case CHARACTER:
			case FALSE:
			case IDENTIFIER:
			case IF:
			case LCURLY:
			case LPAREN:
			case NOT:
			case NUMBER:
			case PRINT:
			case READ:
			case TRUE:
			case WHILE:
				{
				alt15=1;
				}
				break;
			case PLUS:
				{
				alt15=2;
				}
				break;
			case MINUS:
				{
				alt15=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}
			switch (alt15) {
				case 1 :
					// Forrest.g:149:4: ( NOT ^)? expr_compound
					{
					root_0 = (ForrestTree)adaptor.nil();


					// Forrest.g:149:4: ( NOT ^)?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==NOT) ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// Forrest.g:149:5: NOT ^
							{
							NOT64=(Token)match(input,NOT,FOLLOW_NOT_in_expr_unary1208); 
							NOT64_tree = (ForrestTree)adaptor.create(NOT64);
							root_0 = (ForrestTree)adaptor.becomeRoot(NOT64_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_expr_compound_in_expr_unary1213);
					expr_compound65=expr_compound();
					state._fsp--;

					adaptor.addChild(root_0, expr_compound65.getTree());

					}
					break;
				case 2 :
					// Forrest.g:150:4: PLUS expr_compound
					{
					PLUS66=(Token)match(input,PLUS,FOLLOW_PLUS_in_expr_unary1218);  
					stream_PLUS.add(PLUS66);

					pushFollow(FOLLOW_expr_compound_in_expr_unary1220);
					expr_compound67=expr_compound();
					state._fsp--;

					stream_expr_compound.add(expr_compound67.getTree());
					// AST REWRITE
					// elements: expr_compound
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ForrestTree)adaptor.nil();
					// 151:4: -> ^( POSITIVE expr_compound )
					{
						// Forrest.g:151:7: ^( POSITIVE expr_compound )
						{
						ForrestTree root_1 = (ForrestTree)adaptor.nil();
						root_1 = (ForrestTree)adaptor.becomeRoot((ForrestTree)adaptor.create(POSITIVE, "POSITIVE"), root_1);
						adaptor.addChild(root_1, stream_expr_compound.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// Forrest.g:152:4: MINUS expr_compound
					{
					MINUS68=(Token)match(input,MINUS,FOLLOW_MINUS_in_expr_unary1236);  
					stream_MINUS.add(MINUS68);

					pushFollow(FOLLOW_expr_compound_in_expr_unary1238);
					expr_compound69=expr_compound();
					state._fsp--;

					stream_expr_compound.add(expr_compound69.getTree());
					// AST REWRITE
					// elements: expr_compound
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ForrestTree)adaptor.nil();
					// 153:4: -> ^( NEGATIVE expr_compound )
					{
						// Forrest.g:153:7: ^( NEGATIVE expr_compound )
						{
						ForrestTree root_1 = (ForrestTree)adaptor.nil();
						root_1 = (ForrestTree)adaptor.becomeRoot((ForrestTree)adaptor.create(NEGATIVE, "NEGATIVE"), root_1);
						adaptor.addChild(root_1, stream_expr_compound.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (ForrestTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (ForrestTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr_unary"


	public static class expr_compound_return extends ParserRuleReturnScope {
		ForrestTree tree;
		@Override
		public ForrestTree getTree() { return tree; }
	};


	// $ANTLR start "expr_compound"
	// Forrest.g:156:1: expr_compound : ( LCURLY program_lines RCURLY -> ^( COMPOUND program_lines ) | IDENTIFIER | NUMBER | TRUE | FALSE | CHARACTER | LPAREN ! expr RPAREN !| read | print | expr_if | expr_while );
	public final ForrestParser.expr_compound_return expr_compound() throws RecognitionException {
		ForrestParser.expr_compound_return retval = new ForrestParser.expr_compound_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		Token LCURLY70=null;
		Token RCURLY72=null;
		Token IDENTIFIER73=null;
		Token NUMBER74=null;
		Token TRUE75=null;
		Token FALSE76=null;
		Token CHARACTER77=null;
		Token LPAREN78=null;
		Token RPAREN80=null;
		ParserRuleReturnScope program_lines71 =null;
		ParserRuleReturnScope expr79 =null;
		ParserRuleReturnScope read81 =null;
		ParserRuleReturnScope print82 =null;
		ParserRuleReturnScope expr_if83 =null;
		ParserRuleReturnScope expr_while84 =null;

		ForrestTree LCURLY70_tree=null;
		ForrestTree RCURLY72_tree=null;
		ForrestTree IDENTIFIER73_tree=null;
		ForrestTree NUMBER74_tree=null;
		ForrestTree TRUE75_tree=null;
		ForrestTree FALSE76_tree=null;
		ForrestTree CHARACTER77_tree=null;
		ForrestTree LPAREN78_tree=null;
		ForrestTree RPAREN80_tree=null;
		RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
		RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
		RewriteRuleSubtreeStream stream_program_lines=new RewriteRuleSubtreeStream(adaptor,"rule program_lines");

		try {
			// Forrest.g:157:2: ( LCURLY program_lines RCURLY -> ^( COMPOUND program_lines ) | IDENTIFIER | NUMBER | TRUE | FALSE | CHARACTER | LPAREN ! expr RPAREN !| read | print | expr_if | expr_while )
			int alt16=11;
			switch ( input.LA(1) ) {
			case LCURLY:
				{
				alt16=1;
				}
				break;
			case IDENTIFIER:
				{
				alt16=2;
				}
				break;
			case NUMBER:
				{
				alt16=3;
				}
				break;
			case TRUE:
				{
				alt16=4;
				}
				break;
			case FALSE:
				{
				alt16=5;
				}
				break;
			case CHARACTER:
				{
				alt16=6;
				}
				break;
			case LPAREN:
				{
				alt16=7;
				}
				break;
			case READ:
				{
				alt16=8;
				}
				break;
			case PRINT:
				{
				alt16=9;
				}
				break;
			case IF:
				{
				alt16=10;
				}
				break;
			case WHILE:
				{
				alt16=11;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}
			switch (alt16) {
				case 1 :
					// Forrest.g:157:4: LCURLY program_lines RCURLY
					{
					LCURLY70=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_expr_compound1261);  
					stream_LCURLY.add(LCURLY70);

					pushFollow(FOLLOW_program_lines_in_expr_compound1263);
					program_lines71=program_lines();
					state._fsp--;

					stream_program_lines.add(program_lines71.getTree());
					RCURLY72=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_expr_compound1265);  
					stream_RCURLY.add(RCURLY72);

					// AST REWRITE
					// elements: program_lines
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ForrestTree)adaptor.nil();
					// 158:4: -> ^( COMPOUND program_lines )
					{
						// Forrest.g:158:8: ^( COMPOUND program_lines )
						{
						ForrestTree root_1 = (ForrestTree)adaptor.nil();
						root_1 = (ForrestTree)adaptor.becomeRoot((ForrestTree)adaptor.create(COMPOUND, "COMPOUND"), root_1);
						adaptor.addChild(root_1, stream_program_lines.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// Forrest.g:159:4: IDENTIFIER
					{
					root_0 = (ForrestTree)adaptor.nil();


					IDENTIFIER73=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expr_compound1283); 
					IDENTIFIER73_tree = (ForrestTree)adaptor.create(IDENTIFIER73);
					adaptor.addChild(root_0, IDENTIFIER73_tree);

					}
					break;
				case 3 :
					// Forrest.g:160:4: NUMBER
					{
					root_0 = (ForrestTree)adaptor.nil();


					NUMBER74=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_expr_compound1288); 
					NUMBER74_tree = (ForrestTree)adaptor.create(NUMBER74);
					adaptor.addChild(root_0, NUMBER74_tree);

					}
					break;
				case 4 :
					// Forrest.g:161:4: TRUE
					{
					root_0 = (ForrestTree)adaptor.nil();


					TRUE75=(Token)match(input,TRUE,FOLLOW_TRUE_in_expr_compound1293); 
					TRUE75_tree = (ForrestTree)adaptor.create(TRUE75);
					adaptor.addChild(root_0, TRUE75_tree);

					}
					break;
				case 5 :
					// Forrest.g:161:11: FALSE
					{
					root_0 = (ForrestTree)adaptor.nil();


					FALSE76=(Token)match(input,FALSE,FOLLOW_FALSE_in_expr_compound1297); 
					FALSE76_tree = (ForrestTree)adaptor.create(FALSE76);
					adaptor.addChild(root_0, FALSE76_tree);

					}
					break;
				case 6 :
					// Forrest.g:162:4: CHARACTER
					{
					root_0 = (ForrestTree)adaptor.nil();


					CHARACTER77=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_expr_compound1302); 
					CHARACTER77_tree = (ForrestTree)adaptor.create(CHARACTER77);
					adaptor.addChild(root_0, CHARACTER77_tree);

					}
					break;
				case 7 :
					// Forrest.g:163:4: LPAREN ! expr RPAREN !
					{
					root_0 = (ForrestTree)adaptor.nil();


					LPAREN78=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_expr_compound1307); 
					pushFollow(FOLLOW_expr_in_expr_compound1310);
					expr79=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr79.getTree());

					RPAREN80=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_expr_compound1312); 
					}
					break;
				case 8 :
					// Forrest.g:164:5: read
					{
					root_0 = (ForrestTree)adaptor.nil();


					pushFollow(FOLLOW_read_in_expr_compound1319);
					read81=read();
					state._fsp--;

					adaptor.addChild(root_0, read81.getTree());

					}
					break;
				case 9 :
					// Forrest.g:165:4: print
					{
					root_0 = (ForrestTree)adaptor.nil();


					pushFollow(FOLLOW_print_in_expr_compound1324);
					print82=print();
					state._fsp--;

					adaptor.addChild(root_0, print82.getTree());

					}
					break;
				case 10 :
					// Forrest.g:166:4: expr_if
					{
					root_0 = (ForrestTree)adaptor.nil();


					pushFollow(FOLLOW_expr_if_in_expr_compound1329);
					expr_if83=expr_if();
					state._fsp--;

					adaptor.addChild(root_0, expr_if83.getTree());

					}
					break;
				case 11 :
					// Forrest.g:167:4: expr_while
					{
					root_0 = (ForrestTree)adaptor.nil();


					pushFollow(FOLLOW_expr_while_in_expr_compound1334);
					expr_while84=expr_while();
					state._fsp--;

					adaptor.addChild(root_0, expr_while84.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (ForrestTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (ForrestTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr_compound"


	public static class read_return extends ParserRuleReturnScope {
		ForrestTree tree;
		@Override
		public ForrestTree getTree() { return tree; }
	};


	// $ANTLR start "read"
	// Forrest.g:170:1: read : READ ^ LPAREN ! IDENTIFIER ( COMMA ! IDENTIFIER )* RPAREN !;
	public final ForrestParser.read_return read() throws RecognitionException {
		ForrestParser.read_return retval = new ForrestParser.read_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		Token READ85=null;
		Token LPAREN86=null;
		Token IDENTIFIER87=null;
		Token COMMA88=null;
		Token IDENTIFIER89=null;
		Token RPAREN90=null;

		ForrestTree READ85_tree=null;
		ForrestTree LPAREN86_tree=null;
		ForrestTree IDENTIFIER87_tree=null;
		ForrestTree COMMA88_tree=null;
		ForrestTree IDENTIFIER89_tree=null;
		ForrestTree RPAREN90_tree=null;

		try {
			// Forrest.g:171:2: ( READ ^ LPAREN ! IDENTIFIER ( COMMA ! IDENTIFIER )* RPAREN !)
			// Forrest.g:171:4: READ ^ LPAREN ! IDENTIFIER ( COMMA ! IDENTIFIER )* RPAREN !
			{
			root_0 = (ForrestTree)adaptor.nil();


			READ85=(Token)match(input,READ,FOLLOW_READ_in_read1346); 
			READ85_tree = (ForrestTree)adaptor.create(READ85);
			root_0 = (ForrestTree)adaptor.becomeRoot(READ85_tree, root_0);

			LPAREN86=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_read1349); 
			IDENTIFIER87=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_read1352); 
			IDENTIFIER87_tree = (ForrestTree)adaptor.create(IDENTIFIER87);
			adaptor.addChild(root_0, IDENTIFIER87_tree);

			// Forrest.g:171:29: ( COMMA ! IDENTIFIER )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==COMMA) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// Forrest.g:171:30: COMMA ! IDENTIFIER
					{
					COMMA88=(Token)match(input,COMMA,FOLLOW_COMMA_in_read1355); 
					IDENTIFIER89=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_read1358); 
					IDENTIFIER89_tree = (ForrestTree)adaptor.create(IDENTIFIER89);
					adaptor.addChild(root_0, IDENTIFIER89_tree);

					}
					break;

				default :
					break loop17;
				}
			}

			RPAREN90=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_read1362); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (ForrestTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (ForrestTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "read"


	public static class print_return extends ParserRuleReturnScope {
		ForrestTree tree;
		@Override
		public ForrestTree getTree() { return tree; }
	};


	// $ANTLR start "print"
	// Forrest.g:174:1: print : PRINT ^ LPAREN ! expr ( COMMA ! expr )* RPAREN !;
	public final ForrestParser.print_return print() throws RecognitionException {
		ForrestParser.print_return retval = new ForrestParser.print_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		Token PRINT91=null;
		Token LPAREN92=null;
		Token COMMA94=null;
		Token RPAREN96=null;
		ParserRuleReturnScope expr93 =null;
		ParserRuleReturnScope expr95 =null;

		ForrestTree PRINT91_tree=null;
		ForrestTree LPAREN92_tree=null;
		ForrestTree COMMA94_tree=null;
		ForrestTree RPAREN96_tree=null;

		try {
			// Forrest.g:175:2: ( PRINT ^ LPAREN ! expr ( COMMA ! expr )* RPAREN !)
			// Forrest.g:175:4: PRINT ^ LPAREN ! expr ( COMMA ! expr )* RPAREN !
			{
			root_0 = (ForrestTree)adaptor.nil();


			PRINT91=(Token)match(input,PRINT,FOLLOW_PRINT_in_print1374); 
			PRINT91_tree = (ForrestTree)adaptor.create(PRINT91);
			root_0 = (ForrestTree)adaptor.becomeRoot(PRINT91_tree, root_0);

			LPAREN92=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_print1377); 
			pushFollow(FOLLOW_expr_in_print1380);
			expr93=expr();
			state._fsp--;

			adaptor.addChild(root_0, expr93.getTree());

			// Forrest.g:175:24: ( COMMA ! expr )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==COMMA) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// Forrest.g:175:25: COMMA ! expr
					{
					COMMA94=(Token)match(input,COMMA,FOLLOW_COMMA_in_print1383); 
					pushFollow(FOLLOW_expr_in_print1386);
					expr95=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr95.getTree());

					}
					break;

				default :
					break loop18;
				}
			}

			RPAREN96=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_print1390); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (ForrestTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (ForrestTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "print"

	// Delegated rules



	public static final BitSet FOLLOW_program_lines_in_forrest761 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_forrest763 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_program_lines804 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_program_lines806 = new BitSet(new long[]{0x01A025A616401080L});
	public static final BitSet FOLLOW_expr_in_program_lines812 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_program_lines814 = new BitSet(new long[]{0x01A025A616401082L});
	public static final BitSet FOLLOW_VAR_in_declaration830 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration833 = new BitSet(new long[]{0x0000000008000060L});
	public static final BitSet FOLLOW_set_in_declaration835 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONSTANT_in_declaration850 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration853 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_BECOMES_in_declaration855 = new BitSet(new long[]{0x012025A616400080L});
	public static final BitSet FOLLOW_expr_in_declaration858 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_assign_in_expr870 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_expr_assign889 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_BECOMES_in_expr_assign891 = new BitSet(new long[]{0x012025A616400080L});
	public static final BitSet FOLLOW_expr_assign_in_expr_assign894 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_or_in_expr_assign899 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_while_comp_in_expr_while911 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_do_comp_in_expr_while913 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_ENDWHILE_in_expr_while915 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_while_comp940 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_COLON_in_while_comp943 = new BitSet(new long[]{0x01A025A616401080L});
	public static final BitSet FOLLOW_program_lines_in_while_comp946 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DO_in_do_comp957 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_COLON_in_do_comp960 = new BitSet(new long[]{0x01A025A616401080L});
	public static final BitSet FOLLOW_program_lines_in_do_comp963 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_comp_in_expr_if975 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_then_comp_in_expr_if977 = new BitSet(new long[]{0x0000000000030000L});
	public static final BitSet FOLLOW_else_comp_in_expr_if979 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_ENDIF_in_expr_if982 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_if_comp1009 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_COLON_in_if_comp1012 = new BitSet(new long[]{0x01A025A616401080L});
	public static final BitSet FOLLOW_program_lines_in_if_comp1015 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_THEN_in_then_comp1026 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_COLON_in_then_comp1029 = new BitSet(new long[]{0x01A025A616401080L});
	public static final BitSet FOLLOW_program_lines_in_then_comp1032 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSE_in_else_comp1043 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_COLON_in_else_comp1046 = new BitSet(new long[]{0x01A025A616401080L});
	public static final BitSet FOLLOW_program_lines_in_else_comp1049 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_and_in_expr_or1061 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_LOGOR_in_expr_or1064 = new BitSet(new long[]{0x012025A616400080L});
	public static final BitSet FOLLOW_expr_and_in_expr_or1067 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_expr_comp_in_expr_and1081 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_LOGAND_in_expr_and1084 = new BitSet(new long[]{0x012025A616400080L});
	public static final BitSet FOLLOW_expr_comp_in_expr_and1087 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_expr_add_in_expr_comp1101 = new BitSet(new long[]{0x0003004001880002L});
	public static final BitSet FOLLOW_GREATER_in_expr_comp1105 = new BitSet(new long[]{0x012025A616400080L});
	public static final BitSet FOLLOW_SMALLER_in_expr_comp1110 = new BitSet(new long[]{0x012025A616400080L});
	public static final BitSet FOLLOW_GREATEREQ_in_expr_comp1115 = new BitSet(new long[]{0x012025A616400080L});
	public static final BitSet FOLLOW_SMALLEREQ_in_expr_comp1120 = new BitSet(new long[]{0x012025A616400080L});
	public static final BitSet FOLLOW_EQUALS_in_expr_comp1125 = new BitSet(new long[]{0x012025A616400080L});
	public static final BitSet FOLLOW_NOTEQUALS_in_expr_comp1130 = new BitSet(new long[]{0x012025A616400080L});
	public static final BitSet FOLLOW_expr_add_in_expr_comp1135 = new BitSet(new long[]{0x0003004001880002L});
	public static final BitSet FOLLOW_expr_mult_in_expr_add1149 = new BitSet(new long[]{0x0000010400000002L});
	public static final BitSet FOLLOW_PLUS_in_expr_add1153 = new BitSet(new long[]{0x012025A616400080L});
	public static final BitSet FOLLOW_MINUS_in_expr_add1158 = new BitSet(new long[]{0x012025A616400080L});
	public static final BitSet FOLLOW_expr_mult_in_expr_add1162 = new BitSet(new long[]{0x0000010400000002L});
	public static final BitSet FOLLOW_expr_unary_in_expr_mult1175 = new BitSet(new long[]{0x0010000800004002L});
	public static final BitSet FOLLOW_TIMES_in_expr_mult1179 = new BitSet(new long[]{0x012025A616400080L});
	public static final BitSet FOLLOW_DIVIDE_in_expr_mult1184 = new BitSet(new long[]{0x012025A616400080L});
	public static final BitSet FOLLOW_MODULO_in_expr_mult1189 = new BitSet(new long[]{0x012025A616400080L});
	public static final BitSet FOLLOW_expr_unary_in_expr_mult1193 = new BitSet(new long[]{0x0010000800004002L});
	public static final BitSet FOLLOW_NOT_in_expr_unary1208 = new BitSet(new long[]{0x0120248216400080L});
	public static final BitSet FOLLOW_expr_compound_in_expr_unary1213 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_expr_unary1218 = new BitSet(new long[]{0x0120248216400080L});
	public static final BitSet FOLLOW_expr_compound_in_expr_unary1220 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_expr_unary1236 = new BitSet(new long[]{0x0120248216400080L});
	public static final BitSet FOLLOW_expr_compound_in_expr_unary1238 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCURLY_in_expr_compound1261 = new BitSet(new long[]{0x01A035A616401080L});
	public static final BitSet FOLLOW_program_lines_in_expr_compound1263 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_RCURLY_in_expr_compound1265 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_expr_compound1283 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_expr_compound1288 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRUE_in_expr_compound1293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_expr_compound1297 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTER_in_expr_compound1302 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_expr_compound1307 = new BitSet(new long[]{0x012025A616400080L});
	public static final BitSet FOLLOW_expr_in_expr_compound1310 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_RPAREN_in_expr_compound1312 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_in_expr_compound1319 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_in_expr_compound1324 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_if_in_expr_compound1329 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_while_in_expr_compound1334 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_read1346 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_LPAREN_in_read1349 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_read1352 = new BitSet(new long[]{0x0000400000000200L});
	public static final BitSet FOLLOW_COMMA_in_read1355 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_read1358 = new BitSet(new long[]{0x0000400000000200L});
	public static final BitSet FOLLOW_RPAREN_in_read1362 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_print1374 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_LPAREN_in_print1377 = new BitSet(new long[]{0x012025A616400080L});
	public static final BitSet FOLLOW_expr_in_print1380 = new BitSet(new long[]{0x0000400000000200L});
	public static final BitSet FOLLOW_COMMA_in_print1383 = new BitSet(new long[]{0x012025A616400080L});
	public static final BitSet FOLLOW_expr_in_print1386 = new BitSet(new long[]{0x0000400000000200L});
	public static final BitSet FOLLOW_RPAREN_in_print1390 = new BitSet(new long[]{0x0000000000000002L});
}
