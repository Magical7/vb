// $ANTLR 3.5 Forrest.g 2013-06-27 12:13:14

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
		"ELSE", "ENDIF", "EQUALS", "EXPR_IF", "FALSE", "GREATER", "GREATEREQ", 
		"IDENTIFIER", "IF", "INT", "LCURLY", "LETTER", "LOGAND", "LOGOR", "LOWER", 
		"LPAREN", "MINUS", "MODULO", "NEGATIVE", "NOT", "NOTEQUALS", "NUMBER", 
		"PLUS", "POSITIVE", "PRINT", "PROGRAM", "RCURLY", "READ", "RPAREN", "SEMICOLON", 
		"SMALLER", "SMALLEREQ", "SQUOTE", "THEN", "TIMES", "TRUE", "UPPER", "VAR", 
		"WS"
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
	public static final int ELSE=15;
	public static final int ENDIF=16;
	public static final int EQUALS=17;
	public static final int EXPR_IF=18;
	public static final int FALSE=19;
	public static final int GREATER=20;
	public static final int GREATEREQ=21;
	public static final int IDENTIFIER=22;
	public static final int IF=23;
	public static final int INT=24;
	public static final int LCURLY=25;
	public static final int LETTER=26;
	public static final int LOGAND=27;
	public static final int LOGOR=28;
	public static final int LOWER=29;
	public static final int LPAREN=30;
	public static final int MINUS=31;
	public static final int MODULO=32;
	public static final int NEGATIVE=33;
	public static final int NOT=34;
	public static final int NOTEQUALS=35;
	public static final int NUMBER=36;
	public static final int PLUS=37;
	public static final int POSITIVE=38;
	public static final int PRINT=39;
	public static final int PROGRAM=40;
	public static final int RCURLY=41;
	public static final int READ=42;
	public static final int RPAREN=43;
	public static final int SEMICOLON=44;
	public static final int SMALLER=45;
	public static final int SMALLEREQ=46;
	public static final int SQUOTE=47;
	public static final int THEN=48;
	public static final int TIMES=49;
	public static final int TRUE=50;
	public static final int UPPER=51;
	public static final int VAR=52;
	public static final int WS=53;

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
	// Forrest.g:70:1: forrest : program_lines EOF -> ^( PROGRAM program_lines ) ;
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
			// Forrest.g:71:2: ( program_lines EOF -> ^( PROGRAM program_lines ) )
			// Forrest.g:71:6: program_lines EOF
			{
			pushFollow(FOLLOW_program_lines_in_forrest709);
			program_lines1=program_lines();
			state._fsp--;

			stream_program_lines.add(program_lines1.getTree());
			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_forrest711);  
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
			// 72:13: -> ^( PROGRAM program_lines )
			{
				// Forrest.g:72:17: ^( PROGRAM program_lines )
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
	// Forrest.g:75:1: program_lines : ( ( declaration SEMICOLON !)* ( expr SEMICOLON !) )* ;
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
			// Forrest.g:76:2: ( ( ( declaration SEMICOLON !)* ( expr SEMICOLON !) )* )
			// Forrest.g:76:4: ( ( declaration SEMICOLON !)* ( expr SEMICOLON !) )*
			{
			root_0 = (ForrestTree)adaptor.nil();


			// Forrest.g:76:4: ( ( declaration SEMICOLON !)* ( expr SEMICOLON !) )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==CHARACTER||LA2_0==CONSTANT||LA2_0==FALSE||(LA2_0 >= IDENTIFIER && LA2_0 <= IF)||LA2_0==LCURLY||(LA2_0 >= LPAREN && LA2_0 <= MINUS)||LA2_0==NOT||(LA2_0 >= NUMBER && LA2_0 <= PLUS)||LA2_0==PRINT||LA2_0==READ||LA2_0==TRUE||LA2_0==VAR) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// Forrest.g:76:5: ( declaration SEMICOLON !)* ( expr SEMICOLON !)
					{
					// Forrest.g:76:5: ( declaration SEMICOLON !)*
					loop1:
					while (true) {
						int alt1=2;
						int LA1_0 = input.LA(1);
						if ( (LA1_0==CONSTANT||LA1_0==VAR) ) {
							alt1=1;
						}

						switch (alt1) {
						case 1 :
							// Forrest.g:76:6: declaration SEMICOLON !
							{
							pushFollow(FOLLOW_declaration_in_program_lines752);
							declaration3=declaration();
							state._fsp--;

							adaptor.addChild(root_0, declaration3.getTree());

							SEMICOLON4=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_program_lines754); 
							}
							break;

						default :
							break loop1;
						}
					}

					// Forrest.g:76:31: ( expr SEMICOLON !)
					// Forrest.g:76:32: expr SEMICOLON !
					{
					pushFollow(FOLLOW_expr_in_program_lines760);
					expr5=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr5.getTree());

					SEMICOLON6=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_program_lines762); 
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
	// Forrest.g:79:1: declaration : ( VAR ^ IDENTIFIER ( CHAR | BOOL | INT ) | CONSTANT ^ IDENTIFIER BECOMES ! expr );
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
			// Forrest.g:80:2: ( VAR ^ IDENTIFIER ( CHAR | BOOL | INT ) | CONSTANT ^ IDENTIFIER BECOMES ! expr )
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
					// Forrest.g:80:4: VAR ^ IDENTIFIER ( CHAR | BOOL | INT )
					{
					root_0 = (ForrestTree)adaptor.nil();


					VAR7=(Token)match(input,VAR,FOLLOW_VAR_in_declaration778); 
					VAR7_tree = (ForrestTree)adaptor.create(VAR7);
					root_0 = (ForrestTree)adaptor.becomeRoot(VAR7_tree, root_0);

					IDENTIFIER8=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration781); 
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
					// Forrest.g:81:4: CONSTANT ^ IDENTIFIER BECOMES ! expr
					{
					root_0 = (ForrestTree)adaptor.nil();


					CONSTANT10=(Token)match(input,CONSTANT,FOLLOW_CONSTANT_in_declaration798); 
					CONSTANT10_tree = (ForrestTree)adaptor.create(CONSTANT10);
					root_0 = (ForrestTree)adaptor.becomeRoot(CONSTANT10_tree, root_0);

					IDENTIFIER11=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration801); 
					IDENTIFIER11_tree = (ForrestTree)adaptor.create(IDENTIFIER11);
					adaptor.addChild(root_0, IDENTIFIER11_tree);

					BECOMES12=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_declaration803); 
					pushFollow(FOLLOW_expr_in_declaration806);
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
	// Forrest.g:84:1: expr : expr_assign ;
	public final ForrestParser.expr_return expr() throws RecognitionException {
		ForrestParser.expr_return retval = new ForrestParser.expr_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		ParserRuleReturnScope expr_assign14 =null;


		try {
			// Forrest.g:85:2: ( expr_assign )
			// Forrest.g:85:5: expr_assign
			{
			root_0 = (ForrestTree)adaptor.nil();


			pushFollow(FOLLOW_expr_assign_in_expr818);
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
	// Forrest.g:88:1: expr_assign options {k=2; } : ( IDENTIFIER BECOMES ^ expr_assign | expr_if );
	public final ForrestParser.expr_assign_return expr_assign() throws RecognitionException {
		ForrestParser.expr_assign_return retval = new ForrestParser.expr_assign_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		Token IDENTIFIER15=null;
		Token BECOMES16=null;
		ParserRuleReturnScope expr_assign17 =null;
		ParserRuleReturnScope expr_if18 =null;

		ForrestTree IDENTIFIER15_tree=null;
		ForrestTree BECOMES16_tree=null;

		try {
			// Forrest.g:90:2: ( IDENTIFIER BECOMES ^ expr_assign | expr_if )
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
			else if ( (LA4_0==CHARACTER||LA4_0==FALSE||LA4_0==IF||LA4_0==LCURLY||(LA4_0 >= LPAREN && LA4_0 <= MINUS)||LA4_0==NOT||(LA4_0 >= NUMBER && LA4_0 <= PLUS)||LA4_0==PRINT||LA4_0==READ||LA4_0==TRUE) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// Forrest.g:90:4: IDENTIFIER BECOMES ^ expr_assign
					{
					root_0 = (ForrestTree)adaptor.nil();


					IDENTIFIER15=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expr_assign837); 
					IDENTIFIER15_tree = (ForrestTree)adaptor.create(IDENTIFIER15);
					adaptor.addChild(root_0, IDENTIFIER15_tree);

					BECOMES16=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_expr_assign839); 
					BECOMES16_tree = (ForrestTree)adaptor.create(BECOMES16);
					root_0 = (ForrestTree)adaptor.becomeRoot(BECOMES16_tree, root_0);

					pushFollow(FOLLOW_expr_assign_in_expr_assign842);
					expr_assign17=expr_assign();
					state._fsp--;

					adaptor.addChild(root_0, expr_assign17.getTree());

					}
					break;
				case 2 :
					// Forrest.g:91:4: expr_if
					{
					root_0 = (ForrestTree)adaptor.nil();


					pushFollow(FOLLOW_expr_if_in_expr_assign847);
					expr_if18=expr_if();
					state._fsp--;

					adaptor.addChild(root_0, expr_if18.getTree());

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


	public static class expr_if_return extends ParserRuleReturnScope {
		ForrestTree tree;
		@Override
		public ForrestTree getTree() { return tree; }
	};


	// $ANTLR start "expr_if"
	// Forrest.g:94:1: expr_if : ( if_comp then_comp ( else_comp )? ENDIF -> ^( EXPR_IF if_comp then_comp ( else_comp )? ) | expr_or );
	public final ForrestParser.expr_if_return expr_if() throws RecognitionException {
		ForrestParser.expr_if_return retval = new ForrestParser.expr_if_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		Token ENDIF22=null;
		ParserRuleReturnScope if_comp19 =null;
		ParserRuleReturnScope then_comp20 =null;
		ParserRuleReturnScope else_comp21 =null;
		ParserRuleReturnScope expr_or23 =null;

		ForrestTree ENDIF22_tree=null;
		RewriteRuleTokenStream stream_ENDIF=new RewriteRuleTokenStream(adaptor,"token ENDIF");
		RewriteRuleSubtreeStream stream_then_comp=new RewriteRuleSubtreeStream(adaptor,"rule then_comp");
		RewriteRuleSubtreeStream stream_else_comp=new RewriteRuleSubtreeStream(adaptor,"rule else_comp");
		RewriteRuleSubtreeStream stream_if_comp=new RewriteRuleSubtreeStream(adaptor,"rule if_comp");

		try {
			// Forrest.g:95:2: ( if_comp then_comp ( else_comp )? ENDIF -> ^( EXPR_IF if_comp then_comp ( else_comp )? ) | expr_or )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==IF) ) {
				alt6=1;
			}
			else if ( (LA6_0==CHARACTER||LA6_0==FALSE||LA6_0==IDENTIFIER||LA6_0==LCURLY||(LA6_0 >= LPAREN && LA6_0 <= MINUS)||LA6_0==NOT||(LA6_0 >= NUMBER && LA6_0 <= PLUS)||LA6_0==PRINT||LA6_0==READ||LA6_0==TRUE) ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// Forrest.g:95:4: if_comp then_comp ( else_comp )? ENDIF
					{
					pushFollow(FOLLOW_if_comp_in_expr_if859);
					if_comp19=if_comp();
					state._fsp--;

					stream_if_comp.add(if_comp19.getTree());
					pushFollow(FOLLOW_then_comp_in_expr_if861);
					then_comp20=then_comp();
					state._fsp--;

					stream_then_comp.add(then_comp20.getTree());
					// Forrest.g:95:22: ( else_comp )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==ELSE) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// Forrest.g:95:22: else_comp
							{
							pushFollow(FOLLOW_else_comp_in_expr_if863);
							else_comp21=else_comp();
							state._fsp--;

							stream_else_comp.add(else_comp21.getTree());
							}
							break;

					}

					ENDIF22=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_expr_if866);  
					stream_ENDIF.add(ENDIF22);

					// AST REWRITE
					// elements: else_comp, then_comp, if_comp
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ForrestTree)adaptor.nil();
					// 96:4: -> ^( EXPR_IF if_comp then_comp ( else_comp )? )
					{
						// Forrest.g:96:7: ^( EXPR_IF if_comp then_comp ( else_comp )? )
						{
						ForrestTree root_1 = (ForrestTree)adaptor.nil();
						root_1 = (ForrestTree)adaptor.becomeRoot((ForrestTree)adaptor.create(EXPR_IF, "EXPR_IF"), root_1);
						adaptor.addChild(root_1, stream_if_comp.nextTree());
						adaptor.addChild(root_1, stream_then_comp.nextTree());
						// Forrest.g:96:35: ( else_comp )?
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
					// Forrest.g:97:4: expr_or
					{
					root_0 = (ForrestTree)adaptor.nil();


					pushFollow(FOLLOW_expr_or_in_expr_if887);
					expr_or23=expr_or();
					state._fsp--;

					adaptor.addChild(root_0, expr_or23.getTree());

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
	// Forrest.g:100:1: if_comp : IF ^ COLON ! program_lines ;
	public final ForrestParser.if_comp_return if_comp() throws RecognitionException {
		ForrestParser.if_comp_return retval = new ForrestParser.if_comp_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		Token IF24=null;
		Token COLON25=null;
		ParserRuleReturnScope program_lines26 =null;

		ForrestTree IF24_tree=null;
		ForrestTree COLON25_tree=null;

		try {
			// Forrest.g:101:2: ( IF ^ COLON ! program_lines )
			// Forrest.g:101:4: IF ^ COLON ! program_lines
			{
			root_0 = (ForrestTree)adaptor.nil();


			IF24=(Token)match(input,IF,FOLLOW_IF_in_if_comp898); 
			IF24_tree = (ForrestTree)adaptor.create(IF24);
			root_0 = (ForrestTree)adaptor.becomeRoot(IF24_tree, root_0);

			COLON25=(Token)match(input,COLON,FOLLOW_COLON_in_if_comp901); 
			pushFollow(FOLLOW_program_lines_in_if_comp904);
			program_lines26=program_lines();
			state._fsp--;

			adaptor.addChild(root_0, program_lines26.getTree());

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
	// Forrest.g:104:1: then_comp : THEN ^ COLON ! program_lines ;
	public final ForrestParser.then_comp_return then_comp() throws RecognitionException {
		ForrestParser.then_comp_return retval = new ForrestParser.then_comp_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		Token THEN27=null;
		Token COLON28=null;
		ParserRuleReturnScope program_lines29 =null;

		ForrestTree THEN27_tree=null;
		ForrestTree COLON28_tree=null;

		try {
			// Forrest.g:105:2: ( THEN ^ COLON ! program_lines )
			// Forrest.g:105:4: THEN ^ COLON ! program_lines
			{
			root_0 = (ForrestTree)adaptor.nil();


			THEN27=(Token)match(input,THEN,FOLLOW_THEN_in_then_comp915); 
			THEN27_tree = (ForrestTree)adaptor.create(THEN27);
			root_0 = (ForrestTree)adaptor.becomeRoot(THEN27_tree, root_0);

			COLON28=(Token)match(input,COLON,FOLLOW_COLON_in_then_comp918); 
			pushFollow(FOLLOW_program_lines_in_then_comp921);
			program_lines29=program_lines();
			state._fsp--;

			adaptor.addChild(root_0, program_lines29.getTree());

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
	// Forrest.g:108:1: else_comp : ELSE ^ COLON ! program_lines ;
	public final ForrestParser.else_comp_return else_comp() throws RecognitionException {
		ForrestParser.else_comp_return retval = new ForrestParser.else_comp_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		Token ELSE30=null;
		Token COLON31=null;
		ParserRuleReturnScope program_lines32 =null;

		ForrestTree ELSE30_tree=null;
		ForrestTree COLON31_tree=null;

		try {
			// Forrest.g:109:2: ( ELSE ^ COLON ! program_lines )
			// Forrest.g:109:4: ELSE ^ COLON ! program_lines
			{
			root_0 = (ForrestTree)adaptor.nil();


			ELSE30=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_comp932); 
			ELSE30_tree = (ForrestTree)adaptor.create(ELSE30);
			root_0 = (ForrestTree)adaptor.becomeRoot(ELSE30_tree, root_0);

			COLON31=(Token)match(input,COLON,FOLLOW_COLON_in_else_comp935); 
			pushFollow(FOLLOW_program_lines_in_else_comp938);
			program_lines32=program_lines();
			state._fsp--;

			adaptor.addChild(root_0, program_lines32.getTree());

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
	// Forrest.g:112:1: expr_or : expr_and ( LOGOR ^ expr_and )* ;
	public final ForrestParser.expr_or_return expr_or() throws RecognitionException {
		ForrestParser.expr_or_return retval = new ForrestParser.expr_or_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		Token LOGOR34=null;
		ParserRuleReturnScope expr_and33 =null;
		ParserRuleReturnScope expr_and35 =null;

		ForrestTree LOGOR34_tree=null;

		try {
			// Forrest.g:113:2: ( expr_and ( LOGOR ^ expr_and )* )
			// Forrest.g:113:4: expr_and ( LOGOR ^ expr_and )*
			{
			root_0 = (ForrestTree)adaptor.nil();


			pushFollow(FOLLOW_expr_and_in_expr_or950);
			expr_and33=expr_and();
			state._fsp--;

			adaptor.addChild(root_0, expr_and33.getTree());

			// Forrest.g:113:13: ( LOGOR ^ expr_and )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==LOGOR) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// Forrest.g:113:14: LOGOR ^ expr_and
					{
					LOGOR34=(Token)match(input,LOGOR,FOLLOW_LOGOR_in_expr_or953); 
					LOGOR34_tree = (ForrestTree)adaptor.create(LOGOR34);
					root_0 = (ForrestTree)adaptor.becomeRoot(LOGOR34_tree, root_0);

					pushFollow(FOLLOW_expr_and_in_expr_or956);
					expr_and35=expr_and();
					state._fsp--;

					adaptor.addChild(root_0, expr_and35.getTree());

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
	// $ANTLR end "expr_or"


	public static class expr_and_return extends ParserRuleReturnScope {
		ForrestTree tree;
		@Override
		public ForrestTree getTree() { return tree; }
	};


	// $ANTLR start "expr_and"
	// Forrest.g:116:1: expr_and : expr_comp ( LOGAND ^ expr_comp )* ;
	public final ForrestParser.expr_and_return expr_and() throws RecognitionException {
		ForrestParser.expr_and_return retval = new ForrestParser.expr_and_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		Token LOGAND37=null;
		ParserRuleReturnScope expr_comp36 =null;
		ParserRuleReturnScope expr_comp38 =null;

		ForrestTree LOGAND37_tree=null;

		try {
			// Forrest.g:117:2: ( expr_comp ( LOGAND ^ expr_comp )* )
			// Forrest.g:117:4: expr_comp ( LOGAND ^ expr_comp )*
			{
			root_0 = (ForrestTree)adaptor.nil();


			pushFollow(FOLLOW_expr_comp_in_expr_and970);
			expr_comp36=expr_comp();
			state._fsp--;

			adaptor.addChild(root_0, expr_comp36.getTree());

			// Forrest.g:117:14: ( LOGAND ^ expr_comp )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==LOGAND) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// Forrest.g:117:15: LOGAND ^ expr_comp
					{
					LOGAND37=(Token)match(input,LOGAND,FOLLOW_LOGAND_in_expr_and973); 
					LOGAND37_tree = (ForrestTree)adaptor.create(LOGAND37);
					root_0 = (ForrestTree)adaptor.becomeRoot(LOGAND37_tree, root_0);

					pushFollow(FOLLOW_expr_comp_in_expr_and976);
					expr_comp38=expr_comp();
					state._fsp--;

					adaptor.addChild(root_0, expr_comp38.getTree());

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
	// $ANTLR end "expr_and"


	public static class expr_comp_return extends ParserRuleReturnScope {
		ForrestTree tree;
		@Override
		public ForrestTree getTree() { return tree; }
	};


	// $ANTLR start "expr_comp"
	// Forrest.g:120:1: expr_comp : expr_add ( ( GREATER ^| SMALLER ^| GREATEREQ ^| SMALLEREQ ^| EQUALS ^| NOTEQUALS ^) expr_add )* ;
	public final ForrestParser.expr_comp_return expr_comp() throws RecognitionException {
		ForrestParser.expr_comp_return retval = new ForrestParser.expr_comp_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		Token GREATER40=null;
		Token SMALLER41=null;
		Token GREATEREQ42=null;
		Token SMALLEREQ43=null;
		Token EQUALS44=null;
		Token NOTEQUALS45=null;
		ParserRuleReturnScope expr_add39 =null;
		ParserRuleReturnScope expr_add46 =null;

		ForrestTree GREATER40_tree=null;
		ForrestTree SMALLER41_tree=null;
		ForrestTree GREATEREQ42_tree=null;
		ForrestTree SMALLEREQ43_tree=null;
		ForrestTree EQUALS44_tree=null;
		ForrestTree NOTEQUALS45_tree=null;

		try {
			// Forrest.g:121:2: ( expr_add ( ( GREATER ^| SMALLER ^| GREATEREQ ^| SMALLEREQ ^| EQUALS ^| NOTEQUALS ^) expr_add )* )
			// Forrest.g:121:4: expr_add ( ( GREATER ^| SMALLER ^| GREATEREQ ^| SMALLEREQ ^| EQUALS ^| NOTEQUALS ^) expr_add )*
			{
			root_0 = (ForrestTree)adaptor.nil();


			pushFollow(FOLLOW_expr_add_in_expr_comp990);
			expr_add39=expr_add();
			state._fsp--;

			adaptor.addChild(root_0, expr_add39.getTree());

			// Forrest.g:121:13: ( ( GREATER ^| SMALLER ^| GREATEREQ ^| SMALLEREQ ^| EQUALS ^| NOTEQUALS ^) expr_add )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==EQUALS||(LA10_0 >= GREATER && LA10_0 <= GREATEREQ)||LA10_0==NOTEQUALS||(LA10_0 >= SMALLER && LA10_0 <= SMALLEREQ)) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// Forrest.g:121:14: ( GREATER ^| SMALLER ^| GREATEREQ ^| SMALLEREQ ^| EQUALS ^| NOTEQUALS ^) expr_add
					{
					// Forrest.g:121:14: ( GREATER ^| SMALLER ^| GREATEREQ ^| SMALLEREQ ^| EQUALS ^| NOTEQUALS ^)
					int alt9=6;
					switch ( input.LA(1) ) {
					case GREATER:
						{
						alt9=1;
						}
						break;
					case SMALLER:
						{
						alt9=2;
						}
						break;
					case GREATEREQ:
						{
						alt9=3;
						}
						break;
					case SMALLEREQ:
						{
						alt9=4;
						}
						break;
					case EQUALS:
						{
						alt9=5;
						}
						break;
					case NOTEQUALS:
						{
						alt9=6;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 9, 0, input);
						throw nvae;
					}
					switch (alt9) {
						case 1 :
							// Forrest.g:121:15: GREATER ^
							{
							GREATER40=(Token)match(input,GREATER,FOLLOW_GREATER_in_expr_comp994); 
							GREATER40_tree = (ForrestTree)adaptor.create(GREATER40);
							root_0 = (ForrestTree)adaptor.becomeRoot(GREATER40_tree, root_0);

							}
							break;
						case 2 :
							// Forrest.g:121:26: SMALLER ^
							{
							SMALLER41=(Token)match(input,SMALLER,FOLLOW_SMALLER_in_expr_comp999); 
							SMALLER41_tree = (ForrestTree)adaptor.create(SMALLER41);
							root_0 = (ForrestTree)adaptor.becomeRoot(SMALLER41_tree, root_0);

							}
							break;
						case 3 :
							// Forrest.g:121:37: GREATEREQ ^
							{
							GREATEREQ42=(Token)match(input,GREATEREQ,FOLLOW_GREATEREQ_in_expr_comp1004); 
							GREATEREQ42_tree = (ForrestTree)adaptor.create(GREATEREQ42);
							root_0 = (ForrestTree)adaptor.becomeRoot(GREATEREQ42_tree, root_0);

							}
							break;
						case 4 :
							// Forrest.g:121:50: SMALLEREQ ^
							{
							SMALLEREQ43=(Token)match(input,SMALLEREQ,FOLLOW_SMALLEREQ_in_expr_comp1009); 
							SMALLEREQ43_tree = (ForrestTree)adaptor.create(SMALLEREQ43);
							root_0 = (ForrestTree)adaptor.becomeRoot(SMALLEREQ43_tree, root_0);

							}
							break;
						case 5 :
							// Forrest.g:121:63: EQUALS ^
							{
							EQUALS44=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_expr_comp1014); 
							EQUALS44_tree = (ForrestTree)adaptor.create(EQUALS44);
							root_0 = (ForrestTree)adaptor.becomeRoot(EQUALS44_tree, root_0);

							}
							break;
						case 6 :
							// Forrest.g:121:73: NOTEQUALS ^
							{
							NOTEQUALS45=(Token)match(input,NOTEQUALS,FOLLOW_NOTEQUALS_in_expr_comp1019); 
							NOTEQUALS45_tree = (ForrestTree)adaptor.create(NOTEQUALS45);
							root_0 = (ForrestTree)adaptor.becomeRoot(NOTEQUALS45_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_expr_add_in_expr_comp1024);
					expr_add46=expr_add();
					state._fsp--;

					adaptor.addChild(root_0, expr_add46.getTree());

					}
					break;

				default :
					break loop10;
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
	// Forrest.g:124:1: expr_add : expr_mult ( ( PLUS ^| MINUS ^) expr_mult )* ;
	public final ForrestParser.expr_add_return expr_add() throws RecognitionException {
		ForrestParser.expr_add_return retval = new ForrestParser.expr_add_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		Token PLUS48=null;
		Token MINUS49=null;
		ParserRuleReturnScope expr_mult47 =null;
		ParserRuleReturnScope expr_mult50 =null;

		ForrestTree PLUS48_tree=null;
		ForrestTree MINUS49_tree=null;

		try {
			// Forrest.g:125:2: ( expr_mult ( ( PLUS ^| MINUS ^) expr_mult )* )
			// Forrest.g:125:4: expr_mult ( ( PLUS ^| MINUS ^) expr_mult )*
			{
			root_0 = (ForrestTree)adaptor.nil();


			pushFollow(FOLLOW_expr_mult_in_expr_add1038);
			expr_mult47=expr_mult();
			state._fsp--;

			adaptor.addChild(root_0, expr_mult47.getTree());

			// Forrest.g:125:14: ( ( PLUS ^| MINUS ^) expr_mult )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==MINUS||LA12_0==PLUS) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// Forrest.g:125:15: ( PLUS ^| MINUS ^) expr_mult
					{
					// Forrest.g:125:15: ( PLUS ^| MINUS ^)
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==PLUS) ) {
						alt11=1;
					}
					else if ( (LA11_0==MINUS) ) {
						alt11=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 11, 0, input);
						throw nvae;
					}

					switch (alt11) {
						case 1 :
							// Forrest.g:125:16: PLUS ^
							{
							PLUS48=(Token)match(input,PLUS,FOLLOW_PLUS_in_expr_add1042); 
							PLUS48_tree = (ForrestTree)adaptor.create(PLUS48);
							root_0 = (ForrestTree)adaptor.becomeRoot(PLUS48_tree, root_0);

							}
							break;
						case 2 :
							// Forrest.g:125:24: MINUS ^
							{
							MINUS49=(Token)match(input,MINUS,FOLLOW_MINUS_in_expr_add1047); 
							MINUS49_tree = (ForrestTree)adaptor.create(MINUS49);
							root_0 = (ForrestTree)adaptor.becomeRoot(MINUS49_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_expr_mult_in_expr_add1051);
					expr_mult50=expr_mult();
					state._fsp--;

					adaptor.addChild(root_0, expr_mult50.getTree());

					}
					break;

				default :
					break loop12;
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
	// Forrest.g:128:1: expr_mult : expr_unary ( ( TIMES ^| DIVIDE ^| MODULO ^) expr_unary )* ;
	public final ForrestParser.expr_mult_return expr_mult() throws RecognitionException {
		ForrestParser.expr_mult_return retval = new ForrestParser.expr_mult_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		Token TIMES52=null;
		Token DIVIDE53=null;
		Token MODULO54=null;
		ParserRuleReturnScope expr_unary51 =null;
		ParserRuleReturnScope expr_unary55 =null;

		ForrestTree TIMES52_tree=null;
		ForrestTree DIVIDE53_tree=null;
		ForrestTree MODULO54_tree=null;

		try {
			// Forrest.g:129:2: ( expr_unary ( ( TIMES ^| DIVIDE ^| MODULO ^) expr_unary )* )
			// Forrest.g:129:4: expr_unary ( ( TIMES ^| DIVIDE ^| MODULO ^) expr_unary )*
			{
			root_0 = (ForrestTree)adaptor.nil();


			pushFollow(FOLLOW_expr_unary_in_expr_mult1064);
			expr_unary51=expr_unary();
			state._fsp--;

			adaptor.addChild(root_0, expr_unary51.getTree());

			// Forrest.g:129:15: ( ( TIMES ^| DIVIDE ^| MODULO ^) expr_unary )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==DIVIDE||LA14_0==MODULO||LA14_0==TIMES) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// Forrest.g:129:16: ( TIMES ^| DIVIDE ^| MODULO ^) expr_unary
					{
					// Forrest.g:129:16: ( TIMES ^| DIVIDE ^| MODULO ^)
					int alt13=3;
					switch ( input.LA(1) ) {
					case TIMES:
						{
						alt13=1;
						}
						break;
					case DIVIDE:
						{
						alt13=2;
						}
						break;
					case MODULO:
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
							// Forrest.g:129:17: TIMES ^
							{
							TIMES52=(Token)match(input,TIMES,FOLLOW_TIMES_in_expr_mult1068); 
							TIMES52_tree = (ForrestTree)adaptor.create(TIMES52);
							root_0 = (ForrestTree)adaptor.becomeRoot(TIMES52_tree, root_0);

							}
							break;
						case 2 :
							// Forrest.g:129:26: DIVIDE ^
							{
							DIVIDE53=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_expr_mult1073); 
							DIVIDE53_tree = (ForrestTree)adaptor.create(DIVIDE53);
							root_0 = (ForrestTree)adaptor.becomeRoot(DIVIDE53_tree, root_0);

							}
							break;
						case 3 :
							// Forrest.g:129:36: MODULO ^
							{
							MODULO54=(Token)match(input,MODULO,FOLLOW_MODULO_in_expr_mult1078); 
							MODULO54_tree = (ForrestTree)adaptor.create(MODULO54);
							root_0 = (ForrestTree)adaptor.becomeRoot(MODULO54_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_expr_unary_in_expr_mult1082);
					expr_unary55=expr_unary();
					state._fsp--;

					adaptor.addChild(root_0, expr_unary55.getTree());

					}
					break;

				default :
					break loop14;
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
	// Forrest.g:132:1: expr_unary : ( ( NOT ^)? expr_compound | PLUS expr_compound -> ^( POSITIVE expr_compound ) | MINUS expr_compound -> ^( NEGATIVE expr_compound ) );
	public final ForrestParser.expr_unary_return expr_unary() throws RecognitionException {
		ForrestParser.expr_unary_return retval = new ForrestParser.expr_unary_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		Token NOT56=null;
		Token PLUS58=null;
		Token MINUS60=null;
		ParserRuleReturnScope expr_compound57 =null;
		ParserRuleReturnScope expr_compound59 =null;
		ParserRuleReturnScope expr_compound61 =null;

		ForrestTree NOT56_tree=null;
		ForrestTree PLUS58_tree=null;
		ForrestTree MINUS60_tree=null;
		RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
		RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
		RewriteRuleSubtreeStream stream_expr_compound=new RewriteRuleSubtreeStream(adaptor,"rule expr_compound");

		try {
			// Forrest.g:133:2: ( ( NOT ^)? expr_compound | PLUS expr_compound -> ^( POSITIVE expr_compound ) | MINUS expr_compound -> ^( NEGATIVE expr_compound ) )
			int alt16=3;
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
				alt16=1;
				}
				break;
			case PLUS:
				{
				alt16=2;
				}
				break;
			case MINUS:
				{
				alt16=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}
			switch (alt16) {
				case 1 :
					// Forrest.g:133:4: ( NOT ^)? expr_compound
					{
					root_0 = (ForrestTree)adaptor.nil();


					// Forrest.g:133:4: ( NOT ^)?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==NOT) ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// Forrest.g:133:5: NOT ^
							{
							NOT56=(Token)match(input,NOT,FOLLOW_NOT_in_expr_unary1097); 
							NOT56_tree = (ForrestTree)adaptor.create(NOT56);
							root_0 = (ForrestTree)adaptor.becomeRoot(NOT56_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_expr_compound_in_expr_unary1102);
					expr_compound57=expr_compound();
					state._fsp--;

					adaptor.addChild(root_0, expr_compound57.getTree());

					}
					break;
				case 2 :
					// Forrest.g:134:4: PLUS expr_compound
					{
					PLUS58=(Token)match(input,PLUS,FOLLOW_PLUS_in_expr_unary1107);  
					stream_PLUS.add(PLUS58);

					pushFollow(FOLLOW_expr_compound_in_expr_unary1109);
					expr_compound59=expr_compound();
					state._fsp--;

					stream_expr_compound.add(expr_compound59.getTree());
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
					// 135:4: -> ^( POSITIVE expr_compound )
					{
						// Forrest.g:135:7: ^( POSITIVE expr_compound )
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
					// Forrest.g:136:4: MINUS expr_compound
					{
					MINUS60=(Token)match(input,MINUS,FOLLOW_MINUS_in_expr_unary1125);  
					stream_MINUS.add(MINUS60);

					pushFollow(FOLLOW_expr_compound_in_expr_unary1127);
					expr_compound61=expr_compound();
					state._fsp--;

					stream_expr_compound.add(expr_compound61.getTree());
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
					// 137:4: -> ^( NEGATIVE expr_compound )
					{
						// Forrest.g:137:7: ^( NEGATIVE expr_compound )
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
	// Forrest.g:140:1: expr_compound : ( LCURLY program_lines RCURLY -> ^( COMPOUND program_lines ) | IDENTIFIER | NUMBER | TRUE | FALSE | CHARACTER | LPAREN ! expr RPAREN !| read | print );
	public final ForrestParser.expr_compound_return expr_compound() throws RecognitionException {
		ForrestParser.expr_compound_return retval = new ForrestParser.expr_compound_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		Token LCURLY62=null;
		Token RCURLY64=null;
		Token IDENTIFIER65=null;
		Token NUMBER66=null;
		Token TRUE67=null;
		Token FALSE68=null;
		Token CHARACTER69=null;
		Token LPAREN70=null;
		Token RPAREN72=null;
		ParserRuleReturnScope program_lines63 =null;
		ParserRuleReturnScope expr71 =null;
		ParserRuleReturnScope read73 =null;
		ParserRuleReturnScope print74 =null;

		ForrestTree LCURLY62_tree=null;
		ForrestTree RCURLY64_tree=null;
		ForrestTree IDENTIFIER65_tree=null;
		ForrestTree NUMBER66_tree=null;
		ForrestTree TRUE67_tree=null;
		ForrestTree FALSE68_tree=null;
		ForrestTree CHARACTER69_tree=null;
		ForrestTree LPAREN70_tree=null;
		ForrestTree RPAREN72_tree=null;
		RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
		RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
		RewriteRuleSubtreeStream stream_program_lines=new RewriteRuleSubtreeStream(adaptor,"rule program_lines");

		try {
			// Forrest.g:141:2: ( LCURLY program_lines RCURLY -> ^( COMPOUND program_lines ) | IDENTIFIER | NUMBER | TRUE | FALSE | CHARACTER | LPAREN ! expr RPAREN !| read | print )
			int alt17=9;
			switch ( input.LA(1) ) {
			case LCURLY:
				{
				alt17=1;
				}
				break;
			case IDENTIFIER:
				{
				alt17=2;
				}
				break;
			case NUMBER:
				{
				alt17=3;
				}
				break;
			case TRUE:
				{
				alt17=4;
				}
				break;
			case FALSE:
				{
				alt17=5;
				}
				break;
			case CHARACTER:
				{
				alt17=6;
				}
				break;
			case LPAREN:
				{
				alt17=7;
				}
				break;
			case READ:
				{
				alt17=8;
				}
				break;
			case PRINT:
				{
				alt17=9;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}
			switch (alt17) {
				case 1 :
					// Forrest.g:141:4: LCURLY program_lines RCURLY
					{
					LCURLY62=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_expr_compound1150);  
					stream_LCURLY.add(LCURLY62);

					pushFollow(FOLLOW_program_lines_in_expr_compound1152);
					program_lines63=program_lines();
					state._fsp--;

					stream_program_lines.add(program_lines63.getTree());
					RCURLY64=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_expr_compound1154);  
					stream_RCURLY.add(RCURLY64);

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
					// 142:4: -> ^( COMPOUND program_lines )
					{
						// Forrest.g:142:8: ^( COMPOUND program_lines )
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
					// Forrest.g:143:4: IDENTIFIER
					{
					root_0 = (ForrestTree)adaptor.nil();


					IDENTIFIER65=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expr_compound1172); 
					IDENTIFIER65_tree = (ForrestTree)adaptor.create(IDENTIFIER65);
					adaptor.addChild(root_0, IDENTIFIER65_tree);

					}
					break;
				case 3 :
					// Forrest.g:144:4: NUMBER
					{
					root_0 = (ForrestTree)adaptor.nil();


					NUMBER66=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_expr_compound1177); 
					NUMBER66_tree = (ForrestTree)adaptor.create(NUMBER66);
					adaptor.addChild(root_0, NUMBER66_tree);

					}
					break;
				case 4 :
					// Forrest.g:145:4: TRUE
					{
					root_0 = (ForrestTree)adaptor.nil();


					TRUE67=(Token)match(input,TRUE,FOLLOW_TRUE_in_expr_compound1182); 
					TRUE67_tree = (ForrestTree)adaptor.create(TRUE67);
					adaptor.addChild(root_0, TRUE67_tree);

					}
					break;
				case 5 :
					// Forrest.g:145:11: FALSE
					{
					root_0 = (ForrestTree)adaptor.nil();


					FALSE68=(Token)match(input,FALSE,FOLLOW_FALSE_in_expr_compound1186); 
					FALSE68_tree = (ForrestTree)adaptor.create(FALSE68);
					adaptor.addChild(root_0, FALSE68_tree);

					}
					break;
				case 6 :
					// Forrest.g:146:4: CHARACTER
					{
					root_0 = (ForrestTree)adaptor.nil();


					CHARACTER69=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_expr_compound1191); 
					CHARACTER69_tree = (ForrestTree)adaptor.create(CHARACTER69);
					adaptor.addChild(root_0, CHARACTER69_tree);

					}
					break;
				case 7 :
					// Forrest.g:147:4: LPAREN ! expr RPAREN !
					{
					root_0 = (ForrestTree)adaptor.nil();


					LPAREN70=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_expr_compound1196); 
					pushFollow(FOLLOW_expr_in_expr_compound1199);
					expr71=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr71.getTree());

					RPAREN72=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_expr_compound1201); 
					}
					break;
				case 8 :
					// Forrest.g:148:5: read
					{
					root_0 = (ForrestTree)adaptor.nil();


					pushFollow(FOLLOW_read_in_expr_compound1208);
					read73=read();
					state._fsp--;

					adaptor.addChild(root_0, read73.getTree());

					}
					break;
				case 9 :
					// Forrest.g:149:4: print
					{
					root_0 = (ForrestTree)adaptor.nil();


					pushFollow(FOLLOW_print_in_expr_compound1213);
					print74=print();
					state._fsp--;

					adaptor.addChild(root_0, print74.getTree());

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
	// Forrest.g:152:1: read : READ ^ LPAREN ! IDENTIFIER ( COMMA ! IDENTIFIER )* RPAREN !;
	public final ForrestParser.read_return read() throws RecognitionException {
		ForrestParser.read_return retval = new ForrestParser.read_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		Token READ75=null;
		Token LPAREN76=null;
		Token IDENTIFIER77=null;
		Token COMMA78=null;
		Token IDENTIFIER79=null;
		Token RPAREN80=null;

		ForrestTree READ75_tree=null;
		ForrestTree LPAREN76_tree=null;
		ForrestTree IDENTIFIER77_tree=null;
		ForrestTree COMMA78_tree=null;
		ForrestTree IDENTIFIER79_tree=null;
		ForrestTree RPAREN80_tree=null;

		try {
			// Forrest.g:153:2: ( READ ^ LPAREN ! IDENTIFIER ( COMMA ! IDENTIFIER )* RPAREN !)
			// Forrest.g:153:4: READ ^ LPAREN ! IDENTIFIER ( COMMA ! IDENTIFIER )* RPAREN !
			{
			root_0 = (ForrestTree)adaptor.nil();


			READ75=(Token)match(input,READ,FOLLOW_READ_in_read1225); 
			READ75_tree = (ForrestTree)adaptor.create(READ75);
			root_0 = (ForrestTree)adaptor.becomeRoot(READ75_tree, root_0);

			LPAREN76=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_read1228); 
			IDENTIFIER77=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_read1231); 
			IDENTIFIER77_tree = (ForrestTree)adaptor.create(IDENTIFIER77);
			adaptor.addChild(root_0, IDENTIFIER77_tree);

			// Forrest.g:153:29: ( COMMA ! IDENTIFIER )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==COMMA) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// Forrest.g:153:30: COMMA ! IDENTIFIER
					{
					COMMA78=(Token)match(input,COMMA,FOLLOW_COMMA_in_read1234); 
					IDENTIFIER79=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_read1237); 
					IDENTIFIER79_tree = (ForrestTree)adaptor.create(IDENTIFIER79);
					adaptor.addChild(root_0, IDENTIFIER79_tree);

					}
					break;

				default :
					break loop18;
				}
			}

			RPAREN80=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_read1241); 
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
	// Forrest.g:156:1: print : PRINT ^ LPAREN ! expr ( COMMA ! expr )* RPAREN !;
	public final ForrestParser.print_return print() throws RecognitionException {
		ForrestParser.print_return retval = new ForrestParser.print_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		Token PRINT81=null;
		Token LPAREN82=null;
		Token COMMA84=null;
		Token RPAREN86=null;
		ParserRuleReturnScope expr83 =null;
		ParserRuleReturnScope expr85 =null;

		ForrestTree PRINT81_tree=null;
		ForrestTree LPAREN82_tree=null;
		ForrestTree COMMA84_tree=null;
		ForrestTree RPAREN86_tree=null;

		try {
			// Forrest.g:157:2: ( PRINT ^ LPAREN ! expr ( COMMA ! expr )* RPAREN !)
			// Forrest.g:157:4: PRINT ^ LPAREN ! expr ( COMMA ! expr )* RPAREN !
			{
			root_0 = (ForrestTree)adaptor.nil();


			PRINT81=(Token)match(input,PRINT,FOLLOW_PRINT_in_print1253); 
			PRINT81_tree = (ForrestTree)adaptor.create(PRINT81);
			root_0 = (ForrestTree)adaptor.becomeRoot(PRINT81_tree, root_0);

			LPAREN82=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_print1256); 
			pushFollow(FOLLOW_expr_in_print1259);
			expr83=expr();
			state._fsp--;

			adaptor.addChild(root_0, expr83.getTree());

			// Forrest.g:157:24: ( COMMA ! expr )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==COMMA) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// Forrest.g:157:25: COMMA ! expr
					{
					COMMA84=(Token)match(input,COMMA,FOLLOW_COMMA_in_print1262); 
					pushFollow(FOLLOW_expr_in_print1265);
					expr85=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr85.getTree());

					}
					break;

				default :
					break loop19;
				}
			}

			RPAREN86=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_print1269); 
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



	public static final BitSet FOLLOW_program_lines_in_forrest709 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_forrest711 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_program_lines752 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_program_lines754 = new BitSet(new long[]{0x001404B4C2C81080L});
	public static final BitSet FOLLOW_expr_in_program_lines760 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_program_lines762 = new BitSet(new long[]{0x001404B4C2C81082L});
	public static final BitSet FOLLOW_VAR_in_declaration778 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration781 = new BitSet(new long[]{0x0000000001000060L});
	public static final BitSet FOLLOW_set_in_declaration783 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONSTANT_in_declaration798 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration801 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_BECOMES_in_declaration803 = new BitSet(new long[]{0x000404B4C2C80080L});
	public static final BitSet FOLLOW_expr_in_declaration806 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_assign_in_expr818 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_expr_assign837 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_BECOMES_in_expr_assign839 = new BitSet(new long[]{0x000404B4C2C80080L});
	public static final BitSet FOLLOW_expr_assign_in_expr_assign842 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_if_in_expr_assign847 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_comp_in_expr_if859 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_then_comp_in_expr_if861 = new BitSet(new long[]{0x0000000000018000L});
	public static final BitSet FOLLOW_else_comp_in_expr_if863 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_ENDIF_in_expr_if866 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_or_in_expr_if887 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_if_comp898 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_COLON_in_if_comp901 = new BitSet(new long[]{0x001404B4C2C81080L});
	public static final BitSet FOLLOW_program_lines_in_if_comp904 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_THEN_in_then_comp915 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_COLON_in_then_comp918 = new BitSet(new long[]{0x001404B4C2C81080L});
	public static final BitSet FOLLOW_program_lines_in_then_comp921 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSE_in_else_comp932 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_COLON_in_else_comp935 = new BitSet(new long[]{0x001404B4C2C81080L});
	public static final BitSet FOLLOW_program_lines_in_else_comp938 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_and_in_expr_or950 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_LOGOR_in_expr_or953 = new BitSet(new long[]{0x000404B4C2480080L});
	public static final BitSet FOLLOW_expr_and_in_expr_or956 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_expr_comp_in_expr_and970 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_LOGAND_in_expr_and973 = new BitSet(new long[]{0x000404B4C2480080L});
	public static final BitSet FOLLOW_expr_comp_in_expr_and976 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_expr_add_in_expr_comp990 = new BitSet(new long[]{0x0000600800320002L});
	public static final BitSet FOLLOW_GREATER_in_expr_comp994 = new BitSet(new long[]{0x000404B4C2480080L});
	public static final BitSet FOLLOW_SMALLER_in_expr_comp999 = new BitSet(new long[]{0x000404B4C2480080L});
	public static final BitSet FOLLOW_GREATEREQ_in_expr_comp1004 = new BitSet(new long[]{0x000404B4C2480080L});
	public static final BitSet FOLLOW_SMALLEREQ_in_expr_comp1009 = new BitSet(new long[]{0x000404B4C2480080L});
	public static final BitSet FOLLOW_EQUALS_in_expr_comp1014 = new BitSet(new long[]{0x000404B4C2480080L});
	public static final BitSet FOLLOW_NOTEQUALS_in_expr_comp1019 = new BitSet(new long[]{0x000404B4C2480080L});
	public static final BitSet FOLLOW_expr_add_in_expr_comp1024 = new BitSet(new long[]{0x0000600800320002L});
	public static final BitSet FOLLOW_expr_mult_in_expr_add1038 = new BitSet(new long[]{0x0000002080000002L});
	public static final BitSet FOLLOW_PLUS_in_expr_add1042 = new BitSet(new long[]{0x000404B4C2480080L});
	public static final BitSet FOLLOW_MINUS_in_expr_add1047 = new BitSet(new long[]{0x000404B4C2480080L});
	public static final BitSet FOLLOW_expr_mult_in_expr_add1051 = new BitSet(new long[]{0x0000002080000002L});
	public static final BitSet FOLLOW_expr_unary_in_expr_mult1064 = new BitSet(new long[]{0x0002000100004002L});
	public static final BitSet FOLLOW_TIMES_in_expr_mult1068 = new BitSet(new long[]{0x000404B4C2480080L});
	public static final BitSet FOLLOW_DIVIDE_in_expr_mult1073 = new BitSet(new long[]{0x000404B4C2480080L});
	public static final BitSet FOLLOW_MODULO_in_expr_mult1078 = new BitSet(new long[]{0x000404B4C2480080L});
	public static final BitSet FOLLOW_expr_unary_in_expr_mult1082 = new BitSet(new long[]{0x0002000100004002L});
	public static final BitSet FOLLOW_NOT_in_expr_unary1097 = new BitSet(new long[]{0x0004049042480080L});
	public static final BitSet FOLLOW_expr_compound_in_expr_unary1102 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_expr_unary1107 = new BitSet(new long[]{0x0004049042480080L});
	public static final BitSet FOLLOW_expr_compound_in_expr_unary1109 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_expr_unary1125 = new BitSet(new long[]{0x0004049042480080L});
	public static final BitSet FOLLOW_expr_compound_in_expr_unary1127 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCURLY_in_expr_compound1150 = new BitSet(new long[]{0x001406B4C2C81080L});
	public static final BitSet FOLLOW_program_lines_in_expr_compound1152 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_RCURLY_in_expr_compound1154 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_expr_compound1172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_expr_compound1177 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRUE_in_expr_compound1182 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_expr_compound1186 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTER_in_expr_compound1191 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_expr_compound1196 = new BitSet(new long[]{0x000404B4C2C80080L});
	public static final BitSet FOLLOW_expr_in_expr_compound1199 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_RPAREN_in_expr_compound1201 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_in_expr_compound1208 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_in_expr_compound1213 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_read1225 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_LPAREN_in_read1228 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_read1231 = new BitSet(new long[]{0x0000080000000200L});
	public static final BitSet FOLLOW_COMMA_in_read1234 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_read1237 = new BitSet(new long[]{0x0000080000000200L});
	public static final BitSet FOLLOW_RPAREN_in_read1241 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_print1253 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_LPAREN_in_print1256 = new BitSet(new long[]{0x000404B4C2C80080L});
	public static final BitSet FOLLOW_expr_in_print1259 = new BitSet(new long[]{0x0000080000000200L});
	public static final BitSet FOLLOW_COMMA_in_print1262 = new BitSet(new long[]{0x000404B4C2C80080L});
	public static final BitSet FOLLOW_expr_in_print1265 = new BitSet(new long[]{0x0000080000000200L});
	public static final BitSet FOLLOW_RPAREN_in_print1269 = new BitSet(new long[]{0x0000000000000002L});
}
