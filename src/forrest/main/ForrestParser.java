// $ANTLR 3.5 Forrest.g 2013-06-27 09:35:40

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
		"ELSE", "ENDIF", "EQUALS", "FALSE", "GREATER", "GREATEREQ", "IDENTIFIER", 
		"IF", "INT", "LCURLY", "LETTER", "LOGAND", "LOGOR", "LOWER", "LPAREN", 
		"MINUS", "MODULO", "NEGATIVE", "NOT", "NOTEQUALS", "NUMBER", "PLUS", "POSITIVE", 
		"PRINT", "PROGRAM", "RCURLY", "READ", "RPAREN", "SEMICOLON", "SMALLER", 
		"SMALLEREQ", "SQUOTE", "THEN", "TIMES", "TRUE", "UPPER", "VAR", "WS"
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
	public static final int FALSE=18;
	public static final int GREATER=19;
	public static final int GREATEREQ=20;
	public static final int IDENTIFIER=21;
	public static final int IF=22;
	public static final int INT=23;
	public static final int LCURLY=24;
	public static final int LETTER=25;
	public static final int LOGAND=26;
	public static final int LOGOR=27;
	public static final int LOWER=28;
	public static final int LPAREN=29;
	public static final int MINUS=30;
	public static final int MODULO=31;
	public static final int NEGATIVE=32;
	public static final int NOT=33;
	public static final int NOTEQUALS=34;
	public static final int NUMBER=35;
	public static final int PLUS=36;
	public static final int POSITIVE=37;
	public static final int PRINT=38;
	public static final int PROGRAM=39;
	public static final int RCURLY=40;
	public static final int READ=41;
	public static final int RPAREN=42;
	public static final int SEMICOLON=43;
	public static final int SMALLER=44;
	public static final int SMALLEREQ=45;
	public static final int SQUOTE=46;
	public static final int THEN=47;
	public static final int TIMES=48;
	public static final int TRUE=49;
	public static final int UPPER=50;
	public static final int VAR=51;
	public static final int WS=52;

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
	// Forrest.g:69:1: forrest : program_lines EOF -> ^( PROGRAM program_lines ) ;
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
			// Forrest.g:70:2: ( program_lines EOF -> ^( PROGRAM program_lines ) )
			// Forrest.g:70:6: program_lines EOF
			{
			pushFollow(FOLLOW_program_lines_in_forrest696);
			program_lines1=program_lines();
			state._fsp--;

			stream_program_lines.add(program_lines1.getTree());
			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_forrest698);  
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
			// 71:13: -> ^( PROGRAM program_lines )
			{
				// Forrest.g:71:17: ^( PROGRAM program_lines )
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
	// Forrest.g:74:1: program_lines : ( ( declaration SEMICOLON !)* ( expr SEMICOLON !) )* ;
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
			// Forrest.g:75:2: ( ( ( declaration SEMICOLON !)* ( expr SEMICOLON !) )* )
			// Forrest.g:75:4: ( ( declaration SEMICOLON !)* ( expr SEMICOLON !) )*
			{
			root_0 = (ForrestTree)adaptor.nil();


			// Forrest.g:75:4: ( ( declaration SEMICOLON !)* ( expr SEMICOLON !) )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==CHARACTER||LA2_0==CONSTANT||LA2_0==FALSE||(LA2_0 >= IDENTIFIER && LA2_0 <= IF)||LA2_0==LCURLY||(LA2_0 >= LPAREN && LA2_0 <= MINUS)||LA2_0==NOT||(LA2_0 >= NUMBER && LA2_0 <= PLUS)||LA2_0==PRINT||LA2_0==READ||LA2_0==TRUE||LA2_0==VAR) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// Forrest.g:75:5: ( declaration SEMICOLON !)* ( expr SEMICOLON !)
					{
					// Forrest.g:75:5: ( declaration SEMICOLON !)*
					loop1:
					while (true) {
						int alt1=2;
						int LA1_0 = input.LA(1);
						if ( (LA1_0==CONSTANT||LA1_0==VAR) ) {
							alt1=1;
						}

						switch (alt1) {
						case 1 :
							// Forrest.g:75:6: declaration SEMICOLON !
							{
							pushFollow(FOLLOW_declaration_in_program_lines739);
							declaration3=declaration();
							state._fsp--;

							adaptor.addChild(root_0, declaration3.getTree());

							SEMICOLON4=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_program_lines741); 
							}
							break;

						default :
							break loop1;
						}
					}

					// Forrest.g:75:31: ( expr SEMICOLON !)
					// Forrest.g:75:32: expr SEMICOLON !
					{
					pushFollow(FOLLOW_expr_in_program_lines747);
					expr5=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr5.getTree());

					SEMICOLON6=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_program_lines749); 
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
	// Forrest.g:78:1: declaration : ( VAR ^ IDENTIFIER ( CHAR | BOOL | INT ) | CONSTANT ^ IDENTIFIER BECOMES ! expr );
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
			// Forrest.g:79:2: ( VAR ^ IDENTIFIER ( CHAR | BOOL | INT ) | CONSTANT ^ IDENTIFIER BECOMES ! expr )
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
					// Forrest.g:79:4: VAR ^ IDENTIFIER ( CHAR | BOOL | INT )
					{
					root_0 = (ForrestTree)adaptor.nil();


					VAR7=(Token)match(input,VAR,FOLLOW_VAR_in_declaration765); 
					VAR7_tree = (ForrestTree)adaptor.create(VAR7);
					root_0 = (ForrestTree)adaptor.becomeRoot(VAR7_tree, root_0);

					IDENTIFIER8=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration768); 
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
					// Forrest.g:80:4: CONSTANT ^ IDENTIFIER BECOMES ! expr
					{
					root_0 = (ForrestTree)adaptor.nil();


					CONSTANT10=(Token)match(input,CONSTANT,FOLLOW_CONSTANT_in_declaration785); 
					CONSTANT10_tree = (ForrestTree)adaptor.create(CONSTANT10);
					root_0 = (ForrestTree)adaptor.becomeRoot(CONSTANT10_tree, root_0);

					IDENTIFIER11=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration788); 
					IDENTIFIER11_tree = (ForrestTree)adaptor.create(IDENTIFIER11);
					adaptor.addChild(root_0, IDENTIFIER11_tree);

					BECOMES12=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_declaration790); 
					pushFollow(FOLLOW_expr_in_declaration793);
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
	// Forrest.g:83:1: expr : expr_assign ;
	public final ForrestParser.expr_return expr() throws RecognitionException {
		ForrestParser.expr_return retval = new ForrestParser.expr_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		ParserRuleReturnScope expr_assign14 =null;


		try {
			// Forrest.g:84:2: ( expr_assign )
			// Forrest.g:84:5: expr_assign
			{
			root_0 = (ForrestTree)adaptor.nil();


			pushFollow(FOLLOW_expr_assign_in_expr805);
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
	// Forrest.g:87:1: expr_assign options {k=2; } : ( IDENTIFIER BECOMES ^ expr_assign | expr_if );
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
			// Forrest.g:89:2: ( IDENTIFIER BECOMES ^ expr_assign | expr_if )
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
					// Forrest.g:89:4: IDENTIFIER BECOMES ^ expr_assign
					{
					root_0 = (ForrestTree)adaptor.nil();


					IDENTIFIER15=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expr_assign824); 
					IDENTIFIER15_tree = (ForrestTree)adaptor.create(IDENTIFIER15);
					adaptor.addChild(root_0, IDENTIFIER15_tree);

					BECOMES16=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_expr_assign826); 
					BECOMES16_tree = (ForrestTree)adaptor.create(BECOMES16);
					root_0 = (ForrestTree)adaptor.becomeRoot(BECOMES16_tree, root_0);

					pushFollow(FOLLOW_expr_assign_in_expr_assign829);
					expr_assign17=expr_assign();
					state._fsp--;

					adaptor.addChild(root_0, expr_assign17.getTree());

					}
					break;
				case 2 :
					// Forrest.g:90:4: expr_if
					{
					root_0 = (ForrestTree)adaptor.nil();


					pushFollow(FOLLOW_expr_if_in_expr_assign834);
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
	// Forrest.g:93:1: expr_if : ( IF ^ COLON ! program_lines THEN ! COLON ! program_lines ( ELSE ! COLON ! program_lines )? ENDIF | expr_or );
	public final ForrestParser.expr_if_return expr_if() throws RecognitionException {
		ForrestParser.expr_if_return retval = new ForrestParser.expr_if_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		Token IF19=null;
		Token COLON20=null;
		Token THEN22=null;
		Token COLON23=null;
		Token ELSE25=null;
		Token COLON26=null;
		Token ENDIF28=null;
		ParserRuleReturnScope program_lines21 =null;
		ParserRuleReturnScope program_lines24 =null;
		ParserRuleReturnScope program_lines27 =null;
		ParserRuleReturnScope expr_or29 =null;

		ForrestTree IF19_tree=null;
		ForrestTree COLON20_tree=null;
		ForrestTree THEN22_tree=null;
		ForrestTree COLON23_tree=null;
		ForrestTree ELSE25_tree=null;
		ForrestTree COLON26_tree=null;
		ForrestTree ENDIF28_tree=null;

		try {
			// Forrest.g:94:2: ( IF ^ COLON ! program_lines THEN ! COLON ! program_lines ( ELSE ! COLON ! program_lines )? ENDIF | expr_or )
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
					// Forrest.g:94:4: IF ^ COLON ! program_lines THEN ! COLON ! program_lines ( ELSE ! COLON ! program_lines )? ENDIF
					{
					root_0 = (ForrestTree)adaptor.nil();


					IF19=(Token)match(input,IF,FOLLOW_IF_in_expr_if846); 
					IF19_tree = (ForrestTree)adaptor.create(IF19);
					root_0 = (ForrestTree)adaptor.becomeRoot(IF19_tree, root_0);

					COLON20=(Token)match(input,COLON,FOLLOW_COLON_in_expr_if849); 
					pushFollow(FOLLOW_program_lines_in_expr_if852);
					program_lines21=program_lines();
					state._fsp--;

					adaptor.addChild(root_0, program_lines21.getTree());

					THEN22=(Token)match(input,THEN,FOLLOW_THEN_in_expr_if854); 
					COLON23=(Token)match(input,COLON,FOLLOW_COLON_in_expr_if857); 
					pushFollow(FOLLOW_program_lines_in_expr_if860);
					program_lines24=program_lines();
					state._fsp--;

					adaptor.addChild(root_0, program_lines24.getTree());

					// Forrest.g:94:56: ( ELSE ! COLON ! program_lines )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==ELSE) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// Forrest.g:94:57: ELSE ! COLON ! program_lines
							{
							ELSE25=(Token)match(input,ELSE,FOLLOW_ELSE_in_expr_if863); 
							COLON26=(Token)match(input,COLON,FOLLOW_COLON_in_expr_if866); 
							pushFollow(FOLLOW_program_lines_in_expr_if869);
							program_lines27=program_lines();
							state._fsp--;

							adaptor.addChild(root_0, program_lines27.getTree());

							}
							break;

					}

					ENDIF28=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_expr_if873); 
					ENDIF28_tree = (ForrestTree)adaptor.create(ENDIF28);
					adaptor.addChild(root_0, ENDIF28_tree);

					}
					break;
				case 2 :
					// Forrest.g:95:4: expr_or
					{
					root_0 = (ForrestTree)adaptor.nil();


					pushFollow(FOLLOW_expr_or_in_expr_if878);
					expr_or29=expr_or();
					state._fsp--;

					adaptor.addChild(root_0, expr_or29.getTree());

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


	public static class expr_or_return extends ParserRuleReturnScope {
		ForrestTree tree;
		@Override
		public ForrestTree getTree() { return tree; }
	};


	// $ANTLR start "expr_or"
	// Forrest.g:98:1: expr_or : expr_and ( LOGOR ^ expr_and )* ;
	public final ForrestParser.expr_or_return expr_or() throws RecognitionException {
		ForrestParser.expr_or_return retval = new ForrestParser.expr_or_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		Token LOGOR31=null;
		ParserRuleReturnScope expr_and30 =null;
		ParserRuleReturnScope expr_and32 =null;

		ForrestTree LOGOR31_tree=null;

		try {
			// Forrest.g:99:2: ( expr_and ( LOGOR ^ expr_and )* )
			// Forrest.g:99:4: expr_and ( LOGOR ^ expr_and )*
			{
			root_0 = (ForrestTree)adaptor.nil();


			pushFollow(FOLLOW_expr_and_in_expr_or890);
			expr_and30=expr_and();
			state._fsp--;

			adaptor.addChild(root_0, expr_and30.getTree());

			// Forrest.g:99:13: ( LOGOR ^ expr_and )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==LOGOR) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// Forrest.g:99:14: LOGOR ^ expr_and
					{
					LOGOR31=(Token)match(input,LOGOR,FOLLOW_LOGOR_in_expr_or893); 
					LOGOR31_tree = (ForrestTree)adaptor.create(LOGOR31);
					root_0 = (ForrestTree)adaptor.becomeRoot(LOGOR31_tree, root_0);

					pushFollow(FOLLOW_expr_and_in_expr_or896);
					expr_and32=expr_and();
					state._fsp--;

					adaptor.addChild(root_0, expr_and32.getTree());

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
	// Forrest.g:102:1: expr_and : expr_comp ( LOGAND ^ expr_comp )* ;
	public final ForrestParser.expr_and_return expr_and() throws RecognitionException {
		ForrestParser.expr_and_return retval = new ForrestParser.expr_and_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		Token LOGAND34=null;
		ParserRuleReturnScope expr_comp33 =null;
		ParserRuleReturnScope expr_comp35 =null;

		ForrestTree LOGAND34_tree=null;

		try {
			// Forrest.g:103:2: ( expr_comp ( LOGAND ^ expr_comp )* )
			// Forrest.g:103:4: expr_comp ( LOGAND ^ expr_comp )*
			{
			root_0 = (ForrestTree)adaptor.nil();


			pushFollow(FOLLOW_expr_comp_in_expr_and910);
			expr_comp33=expr_comp();
			state._fsp--;

			adaptor.addChild(root_0, expr_comp33.getTree());

			// Forrest.g:103:14: ( LOGAND ^ expr_comp )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==LOGAND) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// Forrest.g:103:15: LOGAND ^ expr_comp
					{
					LOGAND34=(Token)match(input,LOGAND,FOLLOW_LOGAND_in_expr_and913); 
					LOGAND34_tree = (ForrestTree)adaptor.create(LOGAND34);
					root_0 = (ForrestTree)adaptor.becomeRoot(LOGAND34_tree, root_0);

					pushFollow(FOLLOW_expr_comp_in_expr_and916);
					expr_comp35=expr_comp();
					state._fsp--;

					adaptor.addChild(root_0, expr_comp35.getTree());

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
	// Forrest.g:106:1: expr_comp : expr_add ( ( GREATER ^| SMALLER ^| GREATEREQ ^| SMALLEREQ ^| EQUALS ^| NOTEQUALS ^) expr_add )* ;
	public final ForrestParser.expr_comp_return expr_comp() throws RecognitionException {
		ForrestParser.expr_comp_return retval = new ForrestParser.expr_comp_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		Token GREATER37=null;
		Token SMALLER38=null;
		Token GREATEREQ39=null;
		Token SMALLEREQ40=null;
		Token EQUALS41=null;
		Token NOTEQUALS42=null;
		ParserRuleReturnScope expr_add36 =null;
		ParserRuleReturnScope expr_add43 =null;

		ForrestTree GREATER37_tree=null;
		ForrestTree SMALLER38_tree=null;
		ForrestTree GREATEREQ39_tree=null;
		ForrestTree SMALLEREQ40_tree=null;
		ForrestTree EQUALS41_tree=null;
		ForrestTree NOTEQUALS42_tree=null;

		try {
			// Forrest.g:107:2: ( expr_add ( ( GREATER ^| SMALLER ^| GREATEREQ ^| SMALLEREQ ^| EQUALS ^| NOTEQUALS ^) expr_add )* )
			// Forrest.g:107:4: expr_add ( ( GREATER ^| SMALLER ^| GREATEREQ ^| SMALLEREQ ^| EQUALS ^| NOTEQUALS ^) expr_add )*
			{
			root_0 = (ForrestTree)adaptor.nil();


			pushFollow(FOLLOW_expr_add_in_expr_comp930);
			expr_add36=expr_add();
			state._fsp--;

			adaptor.addChild(root_0, expr_add36.getTree());

			// Forrest.g:107:13: ( ( GREATER ^| SMALLER ^| GREATEREQ ^| SMALLEREQ ^| EQUALS ^| NOTEQUALS ^) expr_add )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==EQUALS||(LA10_0 >= GREATER && LA10_0 <= GREATEREQ)||LA10_0==NOTEQUALS||(LA10_0 >= SMALLER && LA10_0 <= SMALLEREQ)) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// Forrest.g:107:14: ( GREATER ^| SMALLER ^| GREATEREQ ^| SMALLEREQ ^| EQUALS ^| NOTEQUALS ^) expr_add
					{
					// Forrest.g:107:14: ( GREATER ^| SMALLER ^| GREATEREQ ^| SMALLEREQ ^| EQUALS ^| NOTEQUALS ^)
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
							// Forrest.g:107:15: GREATER ^
							{
							GREATER37=(Token)match(input,GREATER,FOLLOW_GREATER_in_expr_comp934); 
							GREATER37_tree = (ForrestTree)adaptor.create(GREATER37);
							root_0 = (ForrestTree)adaptor.becomeRoot(GREATER37_tree, root_0);

							}
							break;
						case 2 :
							// Forrest.g:107:26: SMALLER ^
							{
							SMALLER38=(Token)match(input,SMALLER,FOLLOW_SMALLER_in_expr_comp939); 
							SMALLER38_tree = (ForrestTree)adaptor.create(SMALLER38);
							root_0 = (ForrestTree)adaptor.becomeRoot(SMALLER38_tree, root_0);

							}
							break;
						case 3 :
							// Forrest.g:107:37: GREATEREQ ^
							{
							GREATEREQ39=(Token)match(input,GREATEREQ,FOLLOW_GREATEREQ_in_expr_comp944); 
							GREATEREQ39_tree = (ForrestTree)adaptor.create(GREATEREQ39);
							root_0 = (ForrestTree)adaptor.becomeRoot(GREATEREQ39_tree, root_0);

							}
							break;
						case 4 :
							// Forrest.g:107:50: SMALLEREQ ^
							{
							SMALLEREQ40=(Token)match(input,SMALLEREQ,FOLLOW_SMALLEREQ_in_expr_comp949); 
							SMALLEREQ40_tree = (ForrestTree)adaptor.create(SMALLEREQ40);
							root_0 = (ForrestTree)adaptor.becomeRoot(SMALLEREQ40_tree, root_0);

							}
							break;
						case 5 :
							// Forrest.g:107:63: EQUALS ^
							{
							EQUALS41=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_expr_comp954); 
							EQUALS41_tree = (ForrestTree)adaptor.create(EQUALS41);
							root_0 = (ForrestTree)adaptor.becomeRoot(EQUALS41_tree, root_0);

							}
							break;
						case 6 :
							// Forrest.g:107:73: NOTEQUALS ^
							{
							NOTEQUALS42=(Token)match(input,NOTEQUALS,FOLLOW_NOTEQUALS_in_expr_comp959); 
							NOTEQUALS42_tree = (ForrestTree)adaptor.create(NOTEQUALS42);
							root_0 = (ForrestTree)adaptor.becomeRoot(NOTEQUALS42_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_expr_add_in_expr_comp964);
					expr_add43=expr_add();
					state._fsp--;

					adaptor.addChild(root_0, expr_add43.getTree());

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
	// Forrest.g:110:1: expr_add : expr_mult ( ( PLUS ^| MINUS ^) expr_mult )* ;
	public final ForrestParser.expr_add_return expr_add() throws RecognitionException {
		ForrestParser.expr_add_return retval = new ForrestParser.expr_add_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		Token PLUS45=null;
		Token MINUS46=null;
		ParserRuleReturnScope expr_mult44 =null;
		ParserRuleReturnScope expr_mult47 =null;

		ForrestTree PLUS45_tree=null;
		ForrestTree MINUS46_tree=null;

		try {
			// Forrest.g:111:2: ( expr_mult ( ( PLUS ^| MINUS ^) expr_mult )* )
			// Forrest.g:111:4: expr_mult ( ( PLUS ^| MINUS ^) expr_mult )*
			{
			root_0 = (ForrestTree)adaptor.nil();


			pushFollow(FOLLOW_expr_mult_in_expr_add978);
			expr_mult44=expr_mult();
			state._fsp--;

			adaptor.addChild(root_0, expr_mult44.getTree());

			// Forrest.g:111:14: ( ( PLUS ^| MINUS ^) expr_mult )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==MINUS||LA12_0==PLUS) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// Forrest.g:111:15: ( PLUS ^| MINUS ^) expr_mult
					{
					// Forrest.g:111:15: ( PLUS ^| MINUS ^)
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
							// Forrest.g:111:16: PLUS ^
							{
							PLUS45=(Token)match(input,PLUS,FOLLOW_PLUS_in_expr_add982); 
							PLUS45_tree = (ForrestTree)adaptor.create(PLUS45);
							root_0 = (ForrestTree)adaptor.becomeRoot(PLUS45_tree, root_0);

							}
							break;
						case 2 :
							// Forrest.g:111:24: MINUS ^
							{
							MINUS46=(Token)match(input,MINUS,FOLLOW_MINUS_in_expr_add987); 
							MINUS46_tree = (ForrestTree)adaptor.create(MINUS46);
							root_0 = (ForrestTree)adaptor.becomeRoot(MINUS46_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_expr_mult_in_expr_add991);
					expr_mult47=expr_mult();
					state._fsp--;

					adaptor.addChild(root_0, expr_mult47.getTree());

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
	// Forrest.g:114:1: expr_mult : expr_unary ( ( TIMES ^| DIVIDE ^| MODULO ^) expr_unary )* ;
	public final ForrestParser.expr_mult_return expr_mult() throws RecognitionException {
		ForrestParser.expr_mult_return retval = new ForrestParser.expr_mult_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		Token TIMES49=null;
		Token DIVIDE50=null;
		Token MODULO51=null;
		ParserRuleReturnScope expr_unary48 =null;
		ParserRuleReturnScope expr_unary52 =null;

		ForrestTree TIMES49_tree=null;
		ForrestTree DIVIDE50_tree=null;
		ForrestTree MODULO51_tree=null;

		try {
			// Forrest.g:115:2: ( expr_unary ( ( TIMES ^| DIVIDE ^| MODULO ^) expr_unary )* )
			// Forrest.g:115:4: expr_unary ( ( TIMES ^| DIVIDE ^| MODULO ^) expr_unary )*
			{
			root_0 = (ForrestTree)adaptor.nil();


			pushFollow(FOLLOW_expr_unary_in_expr_mult1004);
			expr_unary48=expr_unary();
			state._fsp--;

			adaptor.addChild(root_0, expr_unary48.getTree());

			// Forrest.g:115:15: ( ( TIMES ^| DIVIDE ^| MODULO ^) expr_unary )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==DIVIDE||LA14_0==MODULO||LA14_0==TIMES) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// Forrest.g:115:16: ( TIMES ^| DIVIDE ^| MODULO ^) expr_unary
					{
					// Forrest.g:115:16: ( TIMES ^| DIVIDE ^| MODULO ^)
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
							// Forrest.g:115:17: TIMES ^
							{
							TIMES49=(Token)match(input,TIMES,FOLLOW_TIMES_in_expr_mult1008); 
							TIMES49_tree = (ForrestTree)adaptor.create(TIMES49);
							root_0 = (ForrestTree)adaptor.becomeRoot(TIMES49_tree, root_0);

							}
							break;
						case 2 :
							// Forrest.g:115:26: DIVIDE ^
							{
							DIVIDE50=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_expr_mult1013); 
							DIVIDE50_tree = (ForrestTree)adaptor.create(DIVIDE50);
							root_0 = (ForrestTree)adaptor.becomeRoot(DIVIDE50_tree, root_0);

							}
							break;
						case 3 :
							// Forrest.g:115:36: MODULO ^
							{
							MODULO51=(Token)match(input,MODULO,FOLLOW_MODULO_in_expr_mult1018); 
							MODULO51_tree = (ForrestTree)adaptor.create(MODULO51);
							root_0 = (ForrestTree)adaptor.becomeRoot(MODULO51_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_expr_unary_in_expr_mult1022);
					expr_unary52=expr_unary();
					state._fsp--;

					adaptor.addChild(root_0, expr_unary52.getTree());

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
	// Forrest.g:118:1: expr_unary : ( ( NOT ^)? expr_compound | PLUS expr_compound -> ^( POSITIVE expr_compound ) | MINUS expr_compound -> ^( NEGATIVE expr_compound ) );
	public final ForrestParser.expr_unary_return expr_unary() throws RecognitionException {
		ForrestParser.expr_unary_return retval = new ForrestParser.expr_unary_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		Token NOT53=null;
		Token PLUS55=null;
		Token MINUS57=null;
		ParserRuleReturnScope expr_compound54 =null;
		ParserRuleReturnScope expr_compound56 =null;
		ParserRuleReturnScope expr_compound58 =null;

		ForrestTree NOT53_tree=null;
		ForrestTree PLUS55_tree=null;
		ForrestTree MINUS57_tree=null;
		RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
		RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
		RewriteRuleSubtreeStream stream_expr_compound=new RewriteRuleSubtreeStream(adaptor,"rule expr_compound");

		try {
			// Forrest.g:119:2: ( ( NOT ^)? expr_compound | PLUS expr_compound -> ^( POSITIVE expr_compound ) | MINUS expr_compound -> ^( NEGATIVE expr_compound ) )
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
					// Forrest.g:119:4: ( NOT ^)? expr_compound
					{
					root_0 = (ForrestTree)adaptor.nil();


					// Forrest.g:119:4: ( NOT ^)?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==NOT) ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// Forrest.g:119:5: NOT ^
							{
							NOT53=(Token)match(input,NOT,FOLLOW_NOT_in_expr_unary1037); 
							NOT53_tree = (ForrestTree)adaptor.create(NOT53);
							root_0 = (ForrestTree)adaptor.becomeRoot(NOT53_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_expr_compound_in_expr_unary1042);
					expr_compound54=expr_compound();
					state._fsp--;

					adaptor.addChild(root_0, expr_compound54.getTree());

					}
					break;
				case 2 :
					// Forrest.g:120:4: PLUS expr_compound
					{
					PLUS55=(Token)match(input,PLUS,FOLLOW_PLUS_in_expr_unary1047);  
					stream_PLUS.add(PLUS55);

					pushFollow(FOLLOW_expr_compound_in_expr_unary1049);
					expr_compound56=expr_compound();
					state._fsp--;

					stream_expr_compound.add(expr_compound56.getTree());
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
					// 121:4: -> ^( POSITIVE expr_compound )
					{
						// Forrest.g:121:7: ^( POSITIVE expr_compound )
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
					// Forrest.g:122:4: MINUS expr_compound
					{
					MINUS57=(Token)match(input,MINUS,FOLLOW_MINUS_in_expr_unary1065);  
					stream_MINUS.add(MINUS57);

					pushFollow(FOLLOW_expr_compound_in_expr_unary1067);
					expr_compound58=expr_compound();
					state._fsp--;

					stream_expr_compound.add(expr_compound58.getTree());
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
					// 123:4: -> ^( NEGATIVE expr_compound )
					{
						// Forrest.g:123:7: ^( NEGATIVE expr_compound )
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
	// Forrest.g:126:1: expr_compound : ( LCURLY program_lines RCURLY -> ^( COMPOUND program_lines ) | IDENTIFIER | NUMBER | TRUE | FALSE | CHARACTER | LPAREN ! expr RPAREN !| read | print );
	public final ForrestParser.expr_compound_return expr_compound() throws RecognitionException {
		ForrestParser.expr_compound_return retval = new ForrestParser.expr_compound_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		Token LCURLY59=null;
		Token RCURLY61=null;
		Token IDENTIFIER62=null;
		Token NUMBER63=null;
		Token TRUE64=null;
		Token FALSE65=null;
		Token CHARACTER66=null;
		Token LPAREN67=null;
		Token RPAREN69=null;
		ParserRuleReturnScope program_lines60 =null;
		ParserRuleReturnScope expr68 =null;
		ParserRuleReturnScope read70 =null;
		ParserRuleReturnScope print71 =null;

		ForrestTree LCURLY59_tree=null;
		ForrestTree RCURLY61_tree=null;
		ForrestTree IDENTIFIER62_tree=null;
		ForrestTree NUMBER63_tree=null;
		ForrestTree TRUE64_tree=null;
		ForrestTree FALSE65_tree=null;
		ForrestTree CHARACTER66_tree=null;
		ForrestTree LPAREN67_tree=null;
		ForrestTree RPAREN69_tree=null;
		RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
		RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
		RewriteRuleSubtreeStream stream_program_lines=new RewriteRuleSubtreeStream(adaptor,"rule program_lines");

		try {
			// Forrest.g:127:2: ( LCURLY program_lines RCURLY -> ^( COMPOUND program_lines ) | IDENTIFIER | NUMBER | TRUE | FALSE | CHARACTER | LPAREN ! expr RPAREN !| read | print )
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
					// Forrest.g:127:4: LCURLY program_lines RCURLY
					{
					LCURLY59=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_expr_compound1090);  
					stream_LCURLY.add(LCURLY59);

					pushFollow(FOLLOW_program_lines_in_expr_compound1092);
					program_lines60=program_lines();
					state._fsp--;

					stream_program_lines.add(program_lines60.getTree());
					RCURLY61=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_expr_compound1094);  
					stream_RCURLY.add(RCURLY61);

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
					// 128:4: -> ^( COMPOUND program_lines )
					{
						// Forrest.g:128:8: ^( COMPOUND program_lines )
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
					// Forrest.g:129:4: IDENTIFIER
					{
					root_0 = (ForrestTree)adaptor.nil();


					IDENTIFIER62=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expr_compound1112); 
					IDENTIFIER62_tree = (ForrestTree)adaptor.create(IDENTIFIER62);
					adaptor.addChild(root_0, IDENTIFIER62_tree);

					}
					break;
				case 3 :
					// Forrest.g:130:4: NUMBER
					{
					root_0 = (ForrestTree)adaptor.nil();


					NUMBER63=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_expr_compound1117); 
					NUMBER63_tree = (ForrestTree)adaptor.create(NUMBER63);
					adaptor.addChild(root_0, NUMBER63_tree);

					}
					break;
				case 4 :
					// Forrest.g:131:4: TRUE
					{
					root_0 = (ForrestTree)adaptor.nil();


					TRUE64=(Token)match(input,TRUE,FOLLOW_TRUE_in_expr_compound1122); 
					TRUE64_tree = (ForrestTree)adaptor.create(TRUE64);
					adaptor.addChild(root_0, TRUE64_tree);

					}
					break;
				case 5 :
					// Forrest.g:131:11: FALSE
					{
					root_0 = (ForrestTree)adaptor.nil();


					FALSE65=(Token)match(input,FALSE,FOLLOW_FALSE_in_expr_compound1126); 
					FALSE65_tree = (ForrestTree)adaptor.create(FALSE65);
					adaptor.addChild(root_0, FALSE65_tree);

					}
					break;
				case 6 :
					// Forrest.g:132:4: CHARACTER
					{
					root_0 = (ForrestTree)adaptor.nil();


					CHARACTER66=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_expr_compound1131); 
					CHARACTER66_tree = (ForrestTree)adaptor.create(CHARACTER66);
					adaptor.addChild(root_0, CHARACTER66_tree);

					}
					break;
				case 7 :
					// Forrest.g:133:4: LPAREN ! expr RPAREN !
					{
					root_0 = (ForrestTree)adaptor.nil();


					LPAREN67=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_expr_compound1136); 
					pushFollow(FOLLOW_expr_in_expr_compound1139);
					expr68=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr68.getTree());

					RPAREN69=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_expr_compound1141); 
					}
					break;
				case 8 :
					// Forrest.g:134:5: read
					{
					root_0 = (ForrestTree)adaptor.nil();


					pushFollow(FOLLOW_read_in_expr_compound1148);
					read70=read();
					state._fsp--;

					adaptor.addChild(root_0, read70.getTree());

					}
					break;
				case 9 :
					// Forrest.g:135:4: print
					{
					root_0 = (ForrestTree)adaptor.nil();


					pushFollow(FOLLOW_print_in_expr_compound1153);
					print71=print();
					state._fsp--;

					adaptor.addChild(root_0, print71.getTree());

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
	// Forrest.g:138:1: read : READ ^ LPAREN ! IDENTIFIER ( COMMA ! IDENTIFIER )* RPAREN !;
	public final ForrestParser.read_return read() throws RecognitionException {
		ForrestParser.read_return retval = new ForrestParser.read_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		Token READ72=null;
		Token LPAREN73=null;
		Token IDENTIFIER74=null;
		Token COMMA75=null;
		Token IDENTIFIER76=null;
		Token RPAREN77=null;

		ForrestTree READ72_tree=null;
		ForrestTree LPAREN73_tree=null;
		ForrestTree IDENTIFIER74_tree=null;
		ForrestTree COMMA75_tree=null;
		ForrestTree IDENTIFIER76_tree=null;
		ForrestTree RPAREN77_tree=null;

		try {
			// Forrest.g:139:2: ( READ ^ LPAREN ! IDENTIFIER ( COMMA ! IDENTIFIER )* RPAREN !)
			// Forrest.g:139:4: READ ^ LPAREN ! IDENTIFIER ( COMMA ! IDENTIFIER )* RPAREN !
			{
			root_0 = (ForrestTree)adaptor.nil();


			READ72=(Token)match(input,READ,FOLLOW_READ_in_read1165); 
			READ72_tree = (ForrestTree)adaptor.create(READ72);
			root_0 = (ForrestTree)adaptor.becomeRoot(READ72_tree, root_0);

			LPAREN73=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_read1168); 
			IDENTIFIER74=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_read1171); 
			IDENTIFIER74_tree = (ForrestTree)adaptor.create(IDENTIFIER74);
			adaptor.addChild(root_0, IDENTIFIER74_tree);

			// Forrest.g:139:29: ( COMMA ! IDENTIFIER )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==COMMA) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// Forrest.g:139:30: COMMA ! IDENTIFIER
					{
					COMMA75=(Token)match(input,COMMA,FOLLOW_COMMA_in_read1174); 
					IDENTIFIER76=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_read1177); 
					IDENTIFIER76_tree = (ForrestTree)adaptor.create(IDENTIFIER76);
					adaptor.addChild(root_0, IDENTIFIER76_tree);

					}
					break;

				default :
					break loop18;
				}
			}

			RPAREN77=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_read1181); 
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
	// Forrest.g:142:1: print : PRINT ^ LPAREN ! expr ( COMMA ! expr )* RPAREN !;
	public final ForrestParser.print_return print() throws RecognitionException {
		ForrestParser.print_return retval = new ForrestParser.print_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		Token PRINT78=null;
		Token LPAREN79=null;
		Token COMMA81=null;
		Token RPAREN83=null;
		ParserRuleReturnScope expr80 =null;
		ParserRuleReturnScope expr82 =null;

		ForrestTree PRINT78_tree=null;
		ForrestTree LPAREN79_tree=null;
		ForrestTree COMMA81_tree=null;
		ForrestTree RPAREN83_tree=null;

		try {
			// Forrest.g:143:2: ( PRINT ^ LPAREN ! expr ( COMMA ! expr )* RPAREN !)
			// Forrest.g:143:4: PRINT ^ LPAREN ! expr ( COMMA ! expr )* RPAREN !
			{
			root_0 = (ForrestTree)adaptor.nil();


			PRINT78=(Token)match(input,PRINT,FOLLOW_PRINT_in_print1193); 
			PRINT78_tree = (ForrestTree)adaptor.create(PRINT78);
			root_0 = (ForrestTree)adaptor.becomeRoot(PRINT78_tree, root_0);

			LPAREN79=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_print1196); 
			pushFollow(FOLLOW_expr_in_print1199);
			expr80=expr();
			state._fsp--;

			adaptor.addChild(root_0, expr80.getTree());

			// Forrest.g:143:24: ( COMMA ! expr )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==COMMA) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// Forrest.g:143:25: COMMA ! expr
					{
					COMMA81=(Token)match(input,COMMA,FOLLOW_COMMA_in_print1202); 
					pushFollow(FOLLOW_expr_in_print1205);
					expr82=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr82.getTree());

					}
					break;

				default :
					break loop19;
				}
			}

			RPAREN83=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_print1209); 
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



	public static final BitSet FOLLOW_program_lines_in_forrest696 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_forrest698 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_program_lines739 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_program_lines741 = new BitSet(new long[]{0x000A025A61641080L});
	public static final BitSet FOLLOW_expr_in_program_lines747 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_program_lines749 = new BitSet(new long[]{0x000A025A61641082L});
	public static final BitSet FOLLOW_VAR_in_declaration765 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration768 = new BitSet(new long[]{0x0000000000800060L});
	public static final BitSet FOLLOW_set_in_declaration770 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONSTANT_in_declaration785 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration788 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_BECOMES_in_declaration790 = new BitSet(new long[]{0x0002025A61640080L});
	public static final BitSet FOLLOW_expr_in_declaration793 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_assign_in_expr805 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_expr_assign824 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_BECOMES_in_expr_assign826 = new BitSet(new long[]{0x0002025A61640080L});
	public static final BitSet FOLLOW_expr_assign_in_expr_assign829 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_if_in_expr_assign834 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_expr_if846 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_COLON_in_expr_if849 = new BitSet(new long[]{0x000A825A61641080L});
	public static final BitSet FOLLOW_program_lines_in_expr_if852 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_THEN_in_expr_if854 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_COLON_in_expr_if857 = new BitSet(new long[]{0x000A025A61659080L});
	public static final BitSet FOLLOW_program_lines_in_expr_if860 = new BitSet(new long[]{0x0000000000018000L});
	public static final BitSet FOLLOW_ELSE_in_expr_if863 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_COLON_in_expr_if866 = new BitSet(new long[]{0x000A025A61651080L});
	public static final BitSet FOLLOW_program_lines_in_expr_if869 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_ENDIF_in_expr_if873 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_or_in_expr_if878 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_and_in_expr_or890 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_LOGOR_in_expr_or893 = new BitSet(new long[]{0x0002025A61240080L});
	public static final BitSet FOLLOW_expr_and_in_expr_or896 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_expr_comp_in_expr_and910 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_LOGAND_in_expr_and913 = new BitSet(new long[]{0x0002025A61240080L});
	public static final BitSet FOLLOW_expr_comp_in_expr_and916 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_expr_add_in_expr_comp930 = new BitSet(new long[]{0x00003004001A0002L});
	public static final BitSet FOLLOW_GREATER_in_expr_comp934 = new BitSet(new long[]{0x0002025A61240080L});
	public static final BitSet FOLLOW_SMALLER_in_expr_comp939 = new BitSet(new long[]{0x0002025A61240080L});
	public static final BitSet FOLLOW_GREATEREQ_in_expr_comp944 = new BitSet(new long[]{0x0002025A61240080L});
	public static final BitSet FOLLOW_SMALLEREQ_in_expr_comp949 = new BitSet(new long[]{0x0002025A61240080L});
	public static final BitSet FOLLOW_EQUALS_in_expr_comp954 = new BitSet(new long[]{0x0002025A61240080L});
	public static final BitSet FOLLOW_NOTEQUALS_in_expr_comp959 = new BitSet(new long[]{0x0002025A61240080L});
	public static final BitSet FOLLOW_expr_add_in_expr_comp964 = new BitSet(new long[]{0x00003004001A0002L});
	public static final BitSet FOLLOW_expr_mult_in_expr_add978 = new BitSet(new long[]{0x0000001040000002L});
	public static final BitSet FOLLOW_PLUS_in_expr_add982 = new BitSet(new long[]{0x0002025A61240080L});
	public static final BitSet FOLLOW_MINUS_in_expr_add987 = new BitSet(new long[]{0x0002025A61240080L});
	public static final BitSet FOLLOW_expr_mult_in_expr_add991 = new BitSet(new long[]{0x0000001040000002L});
	public static final BitSet FOLLOW_expr_unary_in_expr_mult1004 = new BitSet(new long[]{0x0001000080004002L});
	public static final BitSet FOLLOW_TIMES_in_expr_mult1008 = new BitSet(new long[]{0x0002025A61240080L});
	public static final BitSet FOLLOW_DIVIDE_in_expr_mult1013 = new BitSet(new long[]{0x0002025A61240080L});
	public static final BitSet FOLLOW_MODULO_in_expr_mult1018 = new BitSet(new long[]{0x0002025A61240080L});
	public static final BitSet FOLLOW_expr_unary_in_expr_mult1022 = new BitSet(new long[]{0x0001000080004002L});
	public static final BitSet FOLLOW_NOT_in_expr_unary1037 = new BitSet(new long[]{0x0002024821240080L});
	public static final BitSet FOLLOW_expr_compound_in_expr_unary1042 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_expr_unary1047 = new BitSet(new long[]{0x0002024821240080L});
	public static final BitSet FOLLOW_expr_compound_in_expr_unary1049 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_expr_unary1065 = new BitSet(new long[]{0x0002024821240080L});
	public static final BitSet FOLLOW_expr_compound_in_expr_unary1067 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCURLY_in_expr_compound1090 = new BitSet(new long[]{0x000A035A61641080L});
	public static final BitSet FOLLOW_program_lines_in_expr_compound1092 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_RCURLY_in_expr_compound1094 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_expr_compound1112 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_expr_compound1117 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRUE_in_expr_compound1122 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_expr_compound1126 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTER_in_expr_compound1131 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_expr_compound1136 = new BitSet(new long[]{0x0002025A61640080L});
	public static final BitSet FOLLOW_expr_in_expr_compound1139 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_RPAREN_in_expr_compound1141 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_in_expr_compound1148 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_in_expr_compound1153 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_read1165 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_LPAREN_in_read1168 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_read1171 = new BitSet(new long[]{0x0000040000000200L});
	public static final BitSet FOLLOW_COMMA_in_read1174 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_read1177 = new BitSet(new long[]{0x0000040000000200L});
	public static final BitSet FOLLOW_RPAREN_in_read1181 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_print1193 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_LPAREN_in_print1196 = new BitSet(new long[]{0x0002025A61640080L});
	public static final BitSet FOLLOW_expr_in_print1199 = new BitSet(new long[]{0x0000040000000200L});
	public static final BitSet FOLLOW_COMMA_in_print1202 = new BitSet(new long[]{0x0002025A61640080L});
	public static final BitSet FOLLOW_expr_in_print1205 = new BitSet(new long[]{0x0000040000000200L});
	public static final BitSet FOLLOW_RPAREN_in_print1209 = new BitSet(new long[]{0x0000000000000002L});
}
