// $ANTLR 3.5 Forrest.g 2013-06-29 13:26:48

package forrest.main;


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
	// Forrest.g:92:1: expr_assign options {k=2; } : ( IDENTIFIER BECOMES ^ expr_assign | expr_while );
	public final ForrestParser.expr_assign_return expr_assign() throws RecognitionException {
		ForrestParser.expr_assign_return retval = new ForrestParser.expr_assign_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		Token IDENTIFIER15=null;
		Token BECOMES16=null;
		ParserRuleReturnScope expr_assign17 =null;
		ParserRuleReturnScope expr_while18 =null;

		ForrestTree IDENTIFIER15_tree=null;
		ForrestTree BECOMES16_tree=null;

		try {
			// Forrest.g:94:2: ( IDENTIFIER BECOMES ^ expr_assign | expr_while )
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
					// Forrest.g:95:4: expr_while
					{
					root_0 = (ForrestTree)adaptor.nil();


					pushFollow(FOLLOW_expr_while_in_expr_assign899);
					expr_while18=expr_while();
					state._fsp--;

					adaptor.addChild(root_0, expr_while18.getTree());

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
	// Forrest.g:98:1: expr_while : ( while_comp do_comp ENDWHILE -> ^( EXPR_WHILE while_comp do_comp ) | expr_if );
	public final ForrestParser.expr_while_return expr_while() throws RecognitionException {
		ForrestParser.expr_while_return retval = new ForrestParser.expr_while_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		Token ENDWHILE21=null;
		ParserRuleReturnScope while_comp19 =null;
		ParserRuleReturnScope do_comp20 =null;
		ParserRuleReturnScope expr_if22 =null;

		ForrestTree ENDWHILE21_tree=null;
		RewriteRuleTokenStream stream_ENDWHILE=new RewriteRuleTokenStream(adaptor,"token ENDWHILE");
		RewriteRuleSubtreeStream stream_do_comp=new RewriteRuleSubtreeStream(adaptor,"rule do_comp");
		RewriteRuleSubtreeStream stream_while_comp=new RewriteRuleSubtreeStream(adaptor,"rule while_comp");

		try {
			// Forrest.g:99:2: ( while_comp do_comp ENDWHILE -> ^( EXPR_WHILE while_comp do_comp ) | expr_if )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==WHILE) ) {
				alt5=1;
			}
			else if ( (LA5_0==CHARACTER||LA5_0==FALSE||(LA5_0 >= IDENTIFIER && LA5_0 <= IF)||LA5_0==LCURLY||(LA5_0 >= LPAREN && LA5_0 <= MINUS)||LA5_0==NOT||(LA5_0 >= NUMBER && LA5_0 <= PLUS)||LA5_0==PRINT||LA5_0==READ||LA5_0==TRUE) ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
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
					// elements: do_comp, while_comp
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
					break;
				case 2 :
					// Forrest.g:101:4: expr_if
					{
					root_0 = (ForrestTree)adaptor.nil();


					pushFollow(FOLLOW_expr_if_in_expr_while933);
					expr_if22=expr_if();
					state._fsp--;

					adaptor.addChild(root_0, expr_if22.getTree());

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
	// $ANTLR end "expr_while"


	public static class while_comp_return extends ParserRuleReturnScope {
		ForrestTree tree;
		@Override
		public ForrestTree getTree() { return tree; }
	};


	// $ANTLR start "while_comp"
	// Forrest.g:104:1: while_comp : WHILE ^ COLON ! program_lines ;
	public final ForrestParser.while_comp_return while_comp() throws RecognitionException {
		ForrestParser.while_comp_return retval = new ForrestParser.while_comp_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		Token WHILE23=null;
		Token COLON24=null;
		ParserRuleReturnScope program_lines25 =null;

		ForrestTree WHILE23_tree=null;
		ForrestTree COLON24_tree=null;

		try {
			// Forrest.g:105:2: ( WHILE ^ COLON ! program_lines )
			// Forrest.g:105:4: WHILE ^ COLON ! program_lines
			{
			root_0 = (ForrestTree)adaptor.nil();


			WHILE23=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_comp945); 
			WHILE23_tree = (ForrestTree)adaptor.create(WHILE23);
			root_0 = (ForrestTree)adaptor.becomeRoot(WHILE23_tree, root_0);

			COLON24=(Token)match(input,COLON,FOLLOW_COLON_in_while_comp948); 
			pushFollow(FOLLOW_program_lines_in_while_comp951);
			program_lines25=program_lines();
			state._fsp--;

			adaptor.addChild(root_0, program_lines25.getTree());

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
	// Forrest.g:108:1: do_comp : DO ^ COLON ! program_lines ;
	public final ForrestParser.do_comp_return do_comp() throws RecognitionException {
		ForrestParser.do_comp_return retval = new ForrestParser.do_comp_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		Token DO26=null;
		Token COLON27=null;
		ParserRuleReturnScope program_lines28 =null;

		ForrestTree DO26_tree=null;
		ForrestTree COLON27_tree=null;

		try {
			// Forrest.g:109:2: ( DO ^ COLON ! program_lines )
			// Forrest.g:109:4: DO ^ COLON ! program_lines
			{
			root_0 = (ForrestTree)adaptor.nil();


			DO26=(Token)match(input,DO,FOLLOW_DO_in_do_comp962); 
			DO26_tree = (ForrestTree)adaptor.create(DO26);
			root_0 = (ForrestTree)adaptor.becomeRoot(DO26_tree, root_0);

			COLON27=(Token)match(input,COLON,FOLLOW_COLON_in_do_comp965); 
			pushFollow(FOLLOW_program_lines_in_do_comp968);
			program_lines28=program_lines();
			state._fsp--;

			adaptor.addChild(root_0, program_lines28.getTree());

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
	// Forrest.g:112:1: expr_if : ( if_comp then_comp ( else_comp )? ENDIF -> ^( EXPR_IF if_comp then_comp ( else_comp )? ) | expr_or );
	public final ForrestParser.expr_if_return expr_if() throws RecognitionException {
		ForrestParser.expr_if_return retval = new ForrestParser.expr_if_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		Token ENDIF32=null;
		ParserRuleReturnScope if_comp29 =null;
		ParserRuleReturnScope then_comp30 =null;
		ParserRuleReturnScope else_comp31 =null;
		ParserRuleReturnScope expr_or33 =null;

		ForrestTree ENDIF32_tree=null;
		RewriteRuleTokenStream stream_ENDIF=new RewriteRuleTokenStream(adaptor,"token ENDIF");
		RewriteRuleSubtreeStream stream_then_comp=new RewriteRuleSubtreeStream(adaptor,"rule then_comp");
		RewriteRuleSubtreeStream stream_else_comp=new RewriteRuleSubtreeStream(adaptor,"rule else_comp");
		RewriteRuleSubtreeStream stream_if_comp=new RewriteRuleSubtreeStream(adaptor,"rule if_comp");

		try {
			// Forrest.g:113:2: ( if_comp then_comp ( else_comp )? ENDIF -> ^( EXPR_IF if_comp then_comp ( else_comp )? ) | expr_or )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==IF) ) {
				alt7=1;
			}
			else if ( (LA7_0==CHARACTER||LA7_0==FALSE||LA7_0==IDENTIFIER||LA7_0==LCURLY||(LA7_0 >= LPAREN && LA7_0 <= MINUS)||LA7_0==NOT||(LA7_0 >= NUMBER && LA7_0 <= PLUS)||LA7_0==PRINT||LA7_0==READ||LA7_0==TRUE) ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// Forrest.g:113:4: if_comp then_comp ( else_comp )? ENDIF
					{
					pushFollow(FOLLOW_if_comp_in_expr_if980);
					if_comp29=if_comp();
					state._fsp--;

					stream_if_comp.add(if_comp29.getTree());
					pushFollow(FOLLOW_then_comp_in_expr_if982);
					then_comp30=then_comp();
					state._fsp--;

					stream_then_comp.add(then_comp30.getTree());
					// Forrest.g:113:22: ( else_comp )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==ELSE) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// Forrest.g:113:22: else_comp
							{
							pushFollow(FOLLOW_else_comp_in_expr_if984);
							else_comp31=else_comp();
							state._fsp--;

							stream_else_comp.add(else_comp31.getTree());
							}
							break;

					}

					ENDIF32=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_expr_if987);  
					stream_ENDIF.add(ENDIF32);

					// AST REWRITE
					// elements: else_comp, if_comp, then_comp
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ForrestTree)adaptor.nil();
					// 114:4: -> ^( EXPR_IF if_comp then_comp ( else_comp )? )
					{
						// Forrest.g:114:7: ^( EXPR_IF if_comp then_comp ( else_comp )? )
						{
						ForrestTree root_1 = (ForrestTree)adaptor.nil();
						root_1 = (ForrestTree)adaptor.becomeRoot((ForrestTree)adaptor.create(EXPR_IF, "EXPR_IF"), root_1);
						adaptor.addChild(root_1, stream_if_comp.nextTree());
						adaptor.addChild(root_1, stream_then_comp.nextTree());
						// Forrest.g:114:35: ( else_comp )?
						if ( stream_else_comp.hasNext() ) {
							adaptor.addChild(root_1, stream_else_comp.nextTree());
						}
						stream_else_comp.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// Forrest.g:115:4: expr_or
					{
					root_0 = (ForrestTree)adaptor.nil();


					pushFollow(FOLLOW_expr_or_in_expr_if1008);
					expr_or33=expr_or();
					state._fsp--;

					adaptor.addChild(root_0, expr_or33.getTree());

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
	// $ANTLR end "expr_if"


	public static class if_comp_return extends ParserRuleReturnScope {
		ForrestTree tree;
		@Override
		public ForrestTree getTree() { return tree; }
	};


	// $ANTLR start "if_comp"
	// Forrest.g:118:1: if_comp : IF ^ COLON ! program_lines ;
	public final ForrestParser.if_comp_return if_comp() throws RecognitionException {
		ForrestParser.if_comp_return retval = new ForrestParser.if_comp_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		Token IF34=null;
		Token COLON35=null;
		ParserRuleReturnScope program_lines36 =null;

		ForrestTree IF34_tree=null;
		ForrestTree COLON35_tree=null;

		try {
			// Forrest.g:119:2: ( IF ^ COLON ! program_lines )
			// Forrest.g:119:4: IF ^ COLON ! program_lines
			{
			root_0 = (ForrestTree)adaptor.nil();


			IF34=(Token)match(input,IF,FOLLOW_IF_in_if_comp1019); 
			IF34_tree = (ForrestTree)adaptor.create(IF34);
			root_0 = (ForrestTree)adaptor.becomeRoot(IF34_tree, root_0);

			COLON35=(Token)match(input,COLON,FOLLOW_COLON_in_if_comp1022); 
			pushFollow(FOLLOW_program_lines_in_if_comp1025);
			program_lines36=program_lines();
			state._fsp--;

			adaptor.addChild(root_0, program_lines36.getTree());

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
	// Forrest.g:122:1: then_comp : THEN ^ COLON ! program_lines ;
	public final ForrestParser.then_comp_return then_comp() throws RecognitionException {
		ForrestParser.then_comp_return retval = new ForrestParser.then_comp_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		Token THEN37=null;
		Token COLON38=null;
		ParserRuleReturnScope program_lines39 =null;

		ForrestTree THEN37_tree=null;
		ForrestTree COLON38_tree=null;

		try {
			// Forrest.g:123:2: ( THEN ^ COLON ! program_lines )
			// Forrest.g:123:4: THEN ^ COLON ! program_lines
			{
			root_0 = (ForrestTree)adaptor.nil();


			THEN37=(Token)match(input,THEN,FOLLOW_THEN_in_then_comp1036); 
			THEN37_tree = (ForrestTree)adaptor.create(THEN37);
			root_0 = (ForrestTree)adaptor.becomeRoot(THEN37_tree, root_0);

			COLON38=(Token)match(input,COLON,FOLLOW_COLON_in_then_comp1039); 
			pushFollow(FOLLOW_program_lines_in_then_comp1042);
			program_lines39=program_lines();
			state._fsp--;

			adaptor.addChild(root_0, program_lines39.getTree());

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
	// Forrest.g:126:1: else_comp : ELSE ^ COLON ! program_lines ;
	public final ForrestParser.else_comp_return else_comp() throws RecognitionException {
		ForrestParser.else_comp_return retval = new ForrestParser.else_comp_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		Token ELSE40=null;
		Token COLON41=null;
		ParserRuleReturnScope program_lines42 =null;

		ForrestTree ELSE40_tree=null;
		ForrestTree COLON41_tree=null;

		try {
			// Forrest.g:127:2: ( ELSE ^ COLON ! program_lines )
			// Forrest.g:127:4: ELSE ^ COLON ! program_lines
			{
			root_0 = (ForrestTree)adaptor.nil();


			ELSE40=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_comp1053); 
			ELSE40_tree = (ForrestTree)adaptor.create(ELSE40);
			root_0 = (ForrestTree)adaptor.becomeRoot(ELSE40_tree, root_0);

			COLON41=(Token)match(input,COLON,FOLLOW_COLON_in_else_comp1056); 
			pushFollow(FOLLOW_program_lines_in_else_comp1059);
			program_lines42=program_lines();
			state._fsp--;

			adaptor.addChild(root_0, program_lines42.getTree());

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
	// Forrest.g:130:1: expr_or : expr_and ( LOGOR ^ expr_and )* ;
	public final ForrestParser.expr_or_return expr_or() throws RecognitionException {
		ForrestParser.expr_or_return retval = new ForrestParser.expr_or_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		Token LOGOR44=null;
		ParserRuleReturnScope expr_and43 =null;
		ParserRuleReturnScope expr_and45 =null;

		ForrestTree LOGOR44_tree=null;

		try {
			// Forrest.g:131:2: ( expr_and ( LOGOR ^ expr_and )* )
			// Forrest.g:131:4: expr_and ( LOGOR ^ expr_and )*
			{
			root_0 = (ForrestTree)adaptor.nil();


			pushFollow(FOLLOW_expr_and_in_expr_or1071);
			expr_and43=expr_and();
			state._fsp--;

			adaptor.addChild(root_0, expr_and43.getTree());

			// Forrest.g:131:13: ( LOGOR ^ expr_and )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==LOGOR) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// Forrest.g:131:14: LOGOR ^ expr_and
					{
					LOGOR44=(Token)match(input,LOGOR,FOLLOW_LOGOR_in_expr_or1074); 
					LOGOR44_tree = (ForrestTree)adaptor.create(LOGOR44);
					root_0 = (ForrestTree)adaptor.becomeRoot(LOGOR44_tree, root_0);

					pushFollow(FOLLOW_expr_and_in_expr_or1077);
					expr_and45=expr_and();
					state._fsp--;

					adaptor.addChild(root_0, expr_and45.getTree());

					}
					break;

				default :
					break loop8;
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
	// Forrest.g:134:1: expr_and : expr_comp ( LOGAND ^ expr_comp )* ;
	public final ForrestParser.expr_and_return expr_and() throws RecognitionException {
		ForrestParser.expr_and_return retval = new ForrestParser.expr_and_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		Token LOGAND47=null;
		ParserRuleReturnScope expr_comp46 =null;
		ParserRuleReturnScope expr_comp48 =null;

		ForrestTree LOGAND47_tree=null;

		try {
			// Forrest.g:135:2: ( expr_comp ( LOGAND ^ expr_comp )* )
			// Forrest.g:135:4: expr_comp ( LOGAND ^ expr_comp )*
			{
			root_0 = (ForrestTree)adaptor.nil();


			pushFollow(FOLLOW_expr_comp_in_expr_and1091);
			expr_comp46=expr_comp();
			state._fsp--;

			adaptor.addChild(root_0, expr_comp46.getTree());

			// Forrest.g:135:14: ( LOGAND ^ expr_comp )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==LOGAND) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// Forrest.g:135:15: LOGAND ^ expr_comp
					{
					LOGAND47=(Token)match(input,LOGAND,FOLLOW_LOGAND_in_expr_and1094); 
					LOGAND47_tree = (ForrestTree)adaptor.create(LOGAND47);
					root_0 = (ForrestTree)adaptor.becomeRoot(LOGAND47_tree, root_0);

					pushFollow(FOLLOW_expr_comp_in_expr_and1097);
					expr_comp48=expr_comp();
					state._fsp--;

					adaptor.addChild(root_0, expr_comp48.getTree());

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
	// $ANTLR end "expr_and"


	public static class expr_comp_return extends ParserRuleReturnScope {
		ForrestTree tree;
		@Override
		public ForrestTree getTree() { return tree; }
	};


	// $ANTLR start "expr_comp"
	// Forrest.g:138:1: expr_comp : expr_add ( ( GREATER ^| SMALLER ^| GREATEREQ ^| SMALLEREQ ^| EQUALS ^| NOTEQUALS ^) expr_add )* ;
	public final ForrestParser.expr_comp_return expr_comp() throws RecognitionException {
		ForrestParser.expr_comp_return retval = new ForrestParser.expr_comp_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		Token GREATER50=null;
		Token SMALLER51=null;
		Token GREATEREQ52=null;
		Token SMALLEREQ53=null;
		Token EQUALS54=null;
		Token NOTEQUALS55=null;
		ParserRuleReturnScope expr_add49 =null;
		ParserRuleReturnScope expr_add56 =null;

		ForrestTree GREATER50_tree=null;
		ForrestTree SMALLER51_tree=null;
		ForrestTree GREATEREQ52_tree=null;
		ForrestTree SMALLEREQ53_tree=null;
		ForrestTree EQUALS54_tree=null;
		ForrestTree NOTEQUALS55_tree=null;

		try {
			// Forrest.g:139:2: ( expr_add ( ( GREATER ^| SMALLER ^| GREATEREQ ^| SMALLEREQ ^| EQUALS ^| NOTEQUALS ^) expr_add )* )
			// Forrest.g:139:4: expr_add ( ( GREATER ^| SMALLER ^| GREATEREQ ^| SMALLEREQ ^| EQUALS ^| NOTEQUALS ^) expr_add )*
			{
			root_0 = (ForrestTree)adaptor.nil();


			pushFollow(FOLLOW_expr_add_in_expr_comp1111);
			expr_add49=expr_add();
			state._fsp--;

			adaptor.addChild(root_0, expr_add49.getTree());

			// Forrest.g:139:13: ( ( GREATER ^| SMALLER ^| GREATEREQ ^| SMALLEREQ ^| EQUALS ^| NOTEQUALS ^) expr_add )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==EQUALS||(LA11_0 >= GREATER && LA11_0 <= GREATEREQ)||LA11_0==NOTEQUALS||(LA11_0 >= SMALLER && LA11_0 <= SMALLEREQ)) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// Forrest.g:139:14: ( GREATER ^| SMALLER ^| GREATEREQ ^| SMALLEREQ ^| EQUALS ^| NOTEQUALS ^) expr_add
					{
					// Forrest.g:139:14: ( GREATER ^| SMALLER ^| GREATEREQ ^| SMALLEREQ ^| EQUALS ^| NOTEQUALS ^)
					int alt10=6;
					switch ( input.LA(1) ) {
					case GREATER:
						{
						alt10=1;
						}
						break;
					case SMALLER:
						{
						alt10=2;
						}
						break;
					case GREATEREQ:
						{
						alt10=3;
						}
						break;
					case SMALLEREQ:
						{
						alt10=4;
						}
						break;
					case EQUALS:
						{
						alt10=5;
						}
						break;
					case NOTEQUALS:
						{
						alt10=6;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 10, 0, input);
						throw nvae;
					}
					switch (alt10) {
						case 1 :
							// Forrest.g:139:15: GREATER ^
							{
							GREATER50=(Token)match(input,GREATER,FOLLOW_GREATER_in_expr_comp1115); 
							GREATER50_tree = (ForrestTree)adaptor.create(GREATER50);
							root_0 = (ForrestTree)adaptor.becomeRoot(GREATER50_tree, root_0);

							}
							break;
						case 2 :
							// Forrest.g:139:26: SMALLER ^
							{
							SMALLER51=(Token)match(input,SMALLER,FOLLOW_SMALLER_in_expr_comp1120); 
							SMALLER51_tree = (ForrestTree)adaptor.create(SMALLER51);
							root_0 = (ForrestTree)adaptor.becomeRoot(SMALLER51_tree, root_0);

							}
							break;
						case 3 :
							// Forrest.g:139:37: GREATEREQ ^
							{
							GREATEREQ52=(Token)match(input,GREATEREQ,FOLLOW_GREATEREQ_in_expr_comp1125); 
							GREATEREQ52_tree = (ForrestTree)adaptor.create(GREATEREQ52);
							root_0 = (ForrestTree)adaptor.becomeRoot(GREATEREQ52_tree, root_0);

							}
							break;
						case 4 :
							// Forrest.g:139:50: SMALLEREQ ^
							{
							SMALLEREQ53=(Token)match(input,SMALLEREQ,FOLLOW_SMALLEREQ_in_expr_comp1130); 
							SMALLEREQ53_tree = (ForrestTree)adaptor.create(SMALLEREQ53);
							root_0 = (ForrestTree)adaptor.becomeRoot(SMALLEREQ53_tree, root_0);

							}
							break;
						case 5 :
							// Forrest.g:139:63: EQUALS ^
							{
							EQUALS54=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_expr_comp1135); 
							EQUALS54_tree = (ForrestTree)adaptor.create(EQUALS54);
							root_0 = (ForrestTree)adaptor.becomeRoot(EQUALS54_tree, root_0);

							}
							break;
						case 6 :
							// Forrest.g:139:73: NOTEQUALS ^
							{
							NOTEQUALS55=(Token)match(input,NOTEQUALS,FOLLOW_NOTEQUALS_in_expr_comp1140); 
							NOTEQUALS55_tree = (ForrestTree)adaptor.create(NOTEQUALS55);
							root_0 = (ForrestTree)adaptor.becomeRoot(NOTEQUALS55_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_expr_add_in_expr_comp1145);
					expr_add56=expr_add();
					state._fsp--;

					adaptor.addChild(root_0, expr_add56.getTree());

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
	// $ANTLR end "expr_comp"


	public static class expr_add_return extends ParserRuleReturnScope {
		ForrestTree tree;
		@Override
		public ForrestTree getTree() { return tree; }
	};


	// $ANTLR start "expr_add"
	// Forrest.g:142:1: expr_add : expr_mult ( ( PLUS ^| MINUS ^) expr_mult )* ;
	public final ForrestParser.expr_add_return expr_add() throws RecognitionException {
		ForrestParser.expr_add_return retval = new ForrestParser.expr_add_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		Token PLUS58=null;
		Token MINUS59=null;
		ParserRuleReturnScope expr_mult57 =null;
		ParserRuleReturnScope expr_mult60 =null;

		ForrestTree PLUS58_tree=null;
		ForrestTree MINUS59_tree=null;

		try {
			// Forrest.g:143:2: ( expr_mult ( ( PLUS ^| MINUS ^) expr_mult )* )
			// Forrest.g:143:4: expr_mult ( ( PLUS ^| MINUS ^) expr_mult )*
			{
			root_0 = (ForrestTree)adaptor.nil();


			pushFollow(FOLLOW_expr_mult_in_expr_add1159);
			expr_mult57=expr_mult();
			state._fsp--;

			adaptor.addChild(root_0, expr_mult57.getTree());

			// Forrest.g:143:14: ( ( PLUS ^| MINUS ^) expr_mult )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==MINUS||LA13_0==PLUS) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// Forrest.g:143:15: ( PLUS ^| MINUS ^) expr_mult
					{
					// Forrest.g:143:15: ( PLUS ^| MINUS ^)
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==PLUS) ) {
						alt12=1;
					}
					else if ( (LA12_0==MINUS) ) {
						alt12=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 12, 0, input);
						throw nvae;
					}

					switch (alt12) {
						case 1 :
							// Forrest.g:143:16: PLUS ^
							{
							PLUS58=(Token)match(input,PLUS,FOLLOW_PLUS_in_expr_add1163); 
							PLUS58_tree = (ForrestTree)adaptor.create(PLUS58);
							root_0 = (ForrestTree)adaptor.becomeRoot(PLUS58_tree, root_0);

							}
							break;
						case 2 :
							// Forrest.g:143:24: MINUS ^
							{
							MINUS59=(Token)match(input,MINUS,FOLLOW_MINUS_in_expr_add1168); 
							MINUS59_tree = (ForrestTree)adaptor.create(MINUS59);
							root_0 = (ForrestTree)adaptor.becomeRoot(MINUS59_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_expr_mult_in_expr_add1172);
					expr_mult60=expr_mult();
					state._fsp--;

					adaptor.addChild(root_0, expr_mult60.getTree());

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
	// $ANTLR end "expr_add"


	public static class expr_mult_return extends ParserRuleReturnScope {
		ForrestTree tree;
		@Override
		public ForrestTree getTree() { return tree; }
	};


	// $ANTLR start "expr_mult"
	// Forrest.g:146:1: expr_mult : expr_unary ( ( TIMES ^| DIVIDE ^| MODULO ^) expr_unary )* ;
	public final ForrestParser.expr_mult_return expr_mult() throws RecognitionException {
		ForrestParser.expr_mult_return retval = new ForrestParser.expr_mult_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		Token TIMES62=null;
		Token DIVIDE63=null;
		Token MODULO64=null;
		ParserRuleReturnScope expr_unary61 =null;
		ParserRuleReturnScope expr_unary65 =null;

		ForrestTree TIMES62_tree=null;
		ForrestTree DIVIDE63_tree=null;
		ForrestTree MODULO64_tree=null;

		try {
			// Forrest.g:147:2: ( expr_unary ( ( TIMES ^| DIVIDE ^| MODULO ^) expr_unary )* )
			// Forrest.g:147:4: expr_unary ( ( TIMES ^| DIVIDE ^| MODULO ^) expr_unary )*
			{
			root_0 = (ForrestTree)adaptor.nil();


			pushFollow(FOLLOW_expr_unary_in_expr_mult1185);
			expr_unary61=expr_unary();
			state._fsp--;

			adaptor.addChild(root_0, expr_unary61.getTree());

			// Forrest.g:147:15: ( ( TIMES ^| DIVIDE ^| MODULO ^) expr_unary )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==DIVIDE||LA15_0==MODULO||LA15_0==TIMES) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// Forrest.g:147:16: ( TIMES ^| DIVIDE ^| MODULO ^) expr_unary
					{
					// Forrest.g:147:16: ( TIMES ^| DIVIDE ^| MODULO ^)
					int alt14=3;
					switch ( input.LA(1) ) {
					case TIMES:
						{
						alt14=1;
						}
						break;
					case DIVIDE:
						{
						alt14=2;
						}
						break;
					case MODULO:
						{
						alt14=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 14, 0, input);
						throw nvae;
					}
					switch (alt14) {
						case 1 :
							// Forrest.g:147:17: TIMES ^
							{
							TIMES62=(Token)match(input,TIMES,FOLLOW_TIMES_in_expr_mult1189); 
							TIMES62_tree = (ForrestTree)adaptor.create(TIMES62);
							root_0 = (ForrestTree)adaptor.becomeRoot(TIMES62_tree, root_0);

							}
							break;
						case 2 :
							// Forrest.g:147:26: DIVIDE ^
							{
							DIVIDE63=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_expr_mult1194); 
							DIVIDE63_tree = (ForrestTree)adaptor.create(DIVIDE63);
							root_0 = (ForrestTree)adaptor.becomeRoot(DIVIDE63_tree, root_0);

							}
							break;
						case 3 :
							// Forrest.g:147:36: MODULO ^
							{
							MODULO64=(Token)match(input,MODULO,FOLLOW_MODULO_in_expr_mult1199); 
							MODULO64_tree = (ForrestTree)adaptor.create(MODULO64);
							root_0 = (ForrestTree)adaptor.becomeRoot(MODULO64_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_expr_unary_in_expr_mult1203);
					expr_unary65=expr_unary();
					state._fsp--;

					adaptor.addChild(root_0, expr_unary65.getTree());

					}
					break;

				default :
					break loop15;
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
	// Forrest.g:150:1: expr_unary : ( ( NOT ^)? expr_compound | PLUS expr_compound -> ^( POSITIVE expr_compound ) | MINUS expr_compound -> ^( NEGATIVE expr_compound ) );
	public final ForrestParser.expr_unary_return expr_unary() throws RecognitionException {
		ForrestParser.expr_unary_return retval = new ForrestParser.expr_unary_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		Token NOT66=null;
		Token PLUS68=null;
		Token MINUS70=null;
		ParserRuleReturnScope expr_compound67 =null;
		ParserRuleReturnScope expr_compound69 =null;
		ParserRuleReturnScope expr_compound71 =null;

		ForrestTree NOT66_tree=null;
		ForrestTree PLUS68_tree=null;
		ForrestTree MINUS70_tree=null;
		RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
		RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
		RewriteRuleSubtreeStream stream_expr_compound=new RewriteRuleSubtreeStream(adaptor,"rule expr_compound");

		try {
			// Forrest.g:151:2: ( ( NOT ^)? expr_compound | PLUS expr_compound -> ^( POSITIVE expr_compound ) | MINUS expr_compound -> ^( NEGATIVE expr_compound ) )
			int alt17=3;
			switch ( input.LA(1) ) {
			case CHARACTER:
			case FALSE:
			case IDENTIFIER:
			case LCURLY:
			case LPAREN:
			case NOT:
			case NUMBER:
			case PRINT:
			case READ:
			case TRUE:
				{
				alt17=1;
				}
				break;
			case PLUS:
				{
				alt17=2;
				}
				break;
			case MINUS:
				{
				alt17=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}
			switch (alt17) {
				case 1 :
					// Forrest.g:151:4: ( NOT ^)? expr_compound
					{
					root_0 = (ForrestTree)adaptor.nil();


					// Forrest.g:151:4: ( NOT ^)?
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0==NOT) ) {
						alt16=1;
					}
					switch (alt16) {
						case 1 :
							// Forrest.g:151:5: NOT ^
							{
							NOT66=(Token)match(input,NOT,FOLLOW_NOT_in_expr_unary1218); 
							NOT66_tree = (ForrestTree)adaptor.create(NOT66);
							root_0 = (ForrestTree)adaptor.becomeRoot(NOT66_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_expr_compound_in_expr_unary1223);
					expr_compound67=expr_compound();
					state._fsp--;

					adaptor.addChild(root_0, expr_compound67.getTree());

					}
					break;
				case 2 :
					// Forrest.g:152:4: PLUS expr_compound
					{
					PLUS68=(Token)match(input,PLUS,FOLLOW_PLUS_in_expr_unary1228);  
					stream_PLUS.add(PLUS68);

					pushFollow(FOLLOW_expr_compound_in_expr_unary1230);
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
					// 153:4: -> ^( POSITIVE expr_compound )
					{
						// Forrest.g:153:7: ^( POSITIVE expr_compound )
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
					// Forrest.g:154:4: MINUS expr_compound
					{
					MINUS70=(Token)match(input,MINUS,FOLLOW_MINUS_in_expr_unary1246);  
					stream_MINUS.add(MINUS70);

					pushFollow(FOLLOW_expr_compound_in_expr_unary1248);
					expr_compound71=expr_compound();
					state._fsp--;

					stream_expr_compound.add(expr_compound71.getTree());
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
					// 155:4: -> ^( NEGATIVE expr_compound )
					{
						// Forrest.g:155:7: ^( NEGATIVE expr_compound )
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
	// Forrest.g:158:1: expr_compound : ( LCURLY program_lines RCURLY -> ^( COMPOUND program_lines ) | IDENTIFIER | NUMBER | TRUE | FALSE | CHARACTER | LPAREN ! expr RPAREN !| read | print );
	public final ForrestParser.expr_compound_return expr_compound() throws RecognitionException {
		ForrestParser.expr_compound_return retval = new ForrestParser.expr_compound_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		Token LCURLY72=null;
		Token RCURLY74=null;
		Token IDENTIFIER75=null;
		Token NUMBER76=null;
		Token TRUE77=null;
		Token FALSE78=null;
		Token CHARACTER79=null;
		Token LPAREN80=null;
		Token RPAREN82=null;
		ParserRuleReturnScope program_lines73 =null;
		ParserRuleReturnScope expr81 =null;
		ParserRuleReturnScope read83 =null;
		ParserRuleReturnScope print84 =null;

		ForrestTree LCURLY72_tree=null;
		ForrestTree RCURLY74_tree=null;
		ForrestTree IDENTIFIER75_tree=null;
		ForrestTree NUMBER76_tree=null;
		ForrestTree TRUE77_tree=null;
		ForrestTree FALSE78_tree=null;
		ForrestTree CHARACTER79_tree=null;
		ForrestTree LPAREN80_tree=null;
		ForrestTree RPAREN82_tree=null;
		RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
		RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
		RewriteRuleSubtreeStream stream_program_lines=new RewriteRuleSubtreeStream(adaptor,"rule program_lines");

		try {
			// Forrest.g:159:2: ( LCURLY program_lines RCURLY -> ^( COMPOUND program_lines ) | IDENTIFIER | NUMBER | TRUE | FALSE | CHARACTER | LPAREN ! expr RPAREN !| read | print )
			int alt18=9;
			switch ( input.LA(1) ) {
			case LCURLY:
				{
				alt18=1;
				}
				break;
			case IDENTIFIER:
				{
				alt18=2;
				}
				break;
			case NUMBER:
				{
				alt18=3;
				}
				break;
			case TRUE:
				{
				alt18=4;
				}
				break;
			case FALSE:
				{
				alt18=5;
				}
				break;
			case CHARACTER:
				{
				alt18=6;
				}
				break;
			case LPAREN:
				{
				alt18=7;
				}
				break;
			case READ:
				{
				alt18=8;
				}
				break;
			case PRINT:
				{
				alt18=9;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}
			switch (alt18) {
				case 1 :
					// Forrest.g:159:4: LCURLY program_lines RCURLY
					{
					LCURLY72=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_expr_compound1271);  
					stream_LCURLY.add(LCURLY72);

					pushFollow(FOLLOW_program_lines_in_expr_compound1273);
					program_lines73=program_lines();
					state._fsp--;

					stream_program_lines.add(program_lines73.getTree());
					RCURLY74=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_expr_compound1275);  
					stream_RCURLY.add(RCURLY74);

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
					// 160:4: -> ^( COMPOUND program_lines )
					{
						// Forrest.g:160:8: ^( COMPOUND program_lines )
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
					// Forrest.g:161:4: IDENTIFIER
					{
					root_0 = (ForrestTree)adaptor.nil();


					IDENTIFIER75=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expr_compound1293); 
					IDENTIFIER75_tree = (ForrestTree)adaptor.create(IDENTIFIER75);
					adaptor.addChild(root_0, IDENTIFIER75_tree);

					}
					break;
				case 3 :
					// Forrest.g:162:4: NUMBER
					{
					root_0 = (ForrestTree)adaptor.nil();


					NUMBER76=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_expr_compound1298); 
					NUMBER76_tree = (ForrestTree)adaptor.create(NUMBER76);
					adaptor.addChild(root_0, NUMBER76_tree);

					}
					break;
				case 4 :
					// Forrest.g:163:4: TRUE
					{
					root_0 = (ForrestTree)adaptor.nil();


					TRUE77=(Token)match(input,TRUE,FOLLOW_TRUE_in_expr_compound1303); 
					TRUE77_tree = (ForrestTree)adaptor.create(TRUE77);
					adaptor.addChild(root_0, TRUE77_tree);

					}
					break;
				case 5 :
					// Forrest.g:163:11: FALSE
					{
					root_0 = (ForrestTree)adaptor.nil();


					FALSE78=(Token)match(input,FALSE,FOLLOW_FALSE_in_expr_compound1307); 
					FALSE78_tree = (ForrestTree)adaptor.create(FALSE78);
					adaptor.addChild(root_0, FALSE78_tree);

					}
					break;
				case 6 :
					// Forrest.g:164:4: CHARACTER
					{
					root_0 = (ForrestTree)adaptor.nil();


					CHARACTER79=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_expr_compound1312); 
					CHARACTER79_tree = (ForrestTree)adaptor.create(CHARACTER79);
					adaptor.addChild(root_0, CHARACTER79_tree);

					}
					break;
				case 7 :
					// Forrest.g:165:4: LPAREN ! expr RPAREN !
					{
					root_0 = (ForrestTree)adaptor.nil();


					LPAREN80=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_expr_compound1317); 
					pushFollow(FOLLOW_expr_in_expr_compound1320);
					expr81=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr81.getTree());

					RPAREN82=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_expr_compound1322); 
					}
					break;
				case 8 :
					// Forrest.g:166:5: read
					{
					root_0 = (ForrestTree)adaptor.nil();


					pushFollow(FOLLOW_read_in_expr_compound1329);
					read83=read();
					state._fsp--;

					adaptor.addChild(root_0, read83.getTree());

					}
					break;
				case 9 :
					// Forrest.g:167:4: print
					{
					root_0 = (ForrestTree)adaptor.nil();


					pushFollow(FOLLOW_print_in_expr_compound1334);
					print84=print();
					state._fsp--;

					adaptor.addChild(root_0, print84.getTree());

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
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==COMMA) ) {
					alt19=1;
				}

				switch (alt19) {
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
					break loop19;
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
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==COMMA) ) {
					alt20=1;
				}

				switch (alt20) {
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
					break loop20;
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
	public static final BitSet FOLLOW_expr_while_in_expr_assign899 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_while_comp_in_expr_while911 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_do_comp_in_expr_while913 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_ENDWHILE_in_expr_while915 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_if_in_expr_while933 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_while_comp945 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_COLON_in_while_comp948 = new BitSet(new long[]{0x01A025A616401080L});
	public static final BitSet FOLLOW_program_lines_in_while_comp951 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DO_in_do_comp962 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_COLON_in_do_comp965 = new BitSet(new long[]{0x01A025A616401080L});
	public static final BitSet FOLLOW_program_lines_in_do_comp968 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_comp_in_expr_if980 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_then_comp_in_expr_if982 = new BitSet(new long[]{0x0000000000030000L});
	public static final BitSet FOLLOW_else_comp_in_expr_if984 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_ENDIF_in_expr_if987 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_or_in_expr_if1008 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_if_comp1019 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_COLON_in_if_comp1022 = new BitSet(new long[]{0x01A025A616401080L});
	public static final BitSet FOLLOW_program_lines_in_if_comp1025 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_THEN_in_then_comp1036 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_COLON_in_then_comp1039 = new BitSet(new long[]{0x01A025A616401080L});
	public static final BitSet FOLLOW_program_lines_in_then_comp1042 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSE_in_else_comp1053 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_COLON_in_else_comp1056 = new BitSet(new long[]{0x01A025A616401080L});
	public static final BitSet FOLLOW_program_lines_in_else_comp1059 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_and_in_expr_or1071 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_LOGOR_in_expr_or1074 = new BitSet(new long[]{0x002025A612400080L});
	public static final BitSet FOLLOW_expr_and_in_expr_or1077 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_expr_comp_in_expr_and1091 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_LOGAND_in_expr_and1094 = new BitSet(new long[]{0x002025A612400080L});
	public static final BitSet FOLLOW_expr_comp_in_expr_and1097 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_expr_add_in_expr_comp1111 = new BitSet(new long[]{0x0003004001880002L});
	public static final BitSet FOLLOW_GREATER_in_expr_comp1115 = new BitSet(new long[]{0x002025A612400080L});
	public static final BitSet FOLLOW_SMALLER_in_expr_comp1120 = new BitSet(new long[]{0x002025A612400080L});
	public static final BitSet FOLLOW_GREATEREQ_in_expr_comp1125 = new BitSet(new long[]{0x002025A612400080L});
	public static final BitSet FOLLOW_SMALLEREQ_in_expr_comp1130 = new BitSet(new long[]{0x002025A612400080L});
	public static final BitSet FOLLOW_EQUALS_in_expr_comp1135 = new BitSet(new long[]{0x002025A612400080L});
	public static final BitSet FOLLOW_NOTEQUALS_in_expr_comp1140 = new BitSet(new long[]{0x002025A612400080L});
	public static final BitSet FOLLOW_expr_add_in_expr_comp1145 = new BitSet(new long[]{0x0003004001880002L});
	public static final BitSet FOLLOW_expr_mult_in_expr_add1159 = new BitSet(new long[]{0x0000010400000002L});
	public static final BitSet FOLLOW_PLUS_in_expr_add1163 = new BitSet(new long[]{0x002025A612400080L});
	public static final BitSet FOLLOW_MINUS_in_expr_add1168 = new BitSet(new long[]{0x002025A612400080L});
	public static final BitSet FOLLOW_expr_mult_in_expr_add1172 = new BitSet(new long[]{0x0000010400000002L});
	public static final BitSet FOLLOW_expr_unary_in_expr_mult1185 = new BitSet(new long[]{0x0010000800004002L});
	public static final BitSet FOLLOW_TIMES_in_expr_mult1189 = new BitSet(new long[]{0x002025A612400080L});
	public static final BitSet FOLLOW_DIVIDE_in_expr_mult1194 = new BitSet(new long[]{0x002025A612400080L});
	public static final BitSet FOLLOW_MODULO_in_expr_mult1199 = new BitSet(new long[]{0x002025A612400080L});
	public static final BitSet FOLLOW_expr_unary_in_expr_mult1203 = new BitSet(new long[]{0x0010000800004002L});
	public static final BitSet FOLLOW_NOT_in_expr_unary1218 = new BitSet(new long[]{0x0020248212400080L});
	public static final BitSet FOLLOW_expr_compound_in_expr_unary1223 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_expr_unary1228 = new BitSet(new long[]{0x0020248212400080L});
	public static final BitSet FOLLOW_expr_compound_in_expr_unary1230 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_expr_unary1246 = new BitSet(new long[]{0x0020248212400080L});
	public static final BitSet FOLLOW_expr_compound_in_expr_unary1248 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCURLY_in_expr_compound1271 = new BitSet(new long[]{0x01A035A616401080L});
	public static final BitSet FOLLOW_program_lines_in_expr_compound1273 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_RCURLY_in_expr_compound1275 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_expr_compound1293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_expr_compound1298 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRUE_in_expr_compound1303 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_expr_compound1307 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTER_in_expr_compound1312 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_expr_compound1317 = new BitSet(new long[]{0x012025A616400080L});
	public static final BitSet FOLLOW_expr_in_expr_compound1320 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_RPAREN_in_expr_compound1322 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_in_expr_compound1329 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_in_expr_compound1334 = new BitSet(new long[]{0x0000000000000002L});
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
