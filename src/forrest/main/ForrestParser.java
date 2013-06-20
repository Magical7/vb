// $ANTLR 3.5 Forrest.g 2013-06-20 13:53:09

package forrest.main;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class ForrestParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "BECOMES", "BOOL", "CHAR", "COMMA", 
		"COMMENT", "COMPOUND", "CONSTANT", "DIGIT", "DIVIDE", "ELSE", "ENDIF", 
		"EQUALS", "GREATER", "GREATEREQ", "IDENTIFIER", "IF", "INT", "LCURLY", 
		"LETTER", "LOGAND", "LOGOR", "LOWER", "LPAREN", "MINUS", "MODULO", "NEGATIVE", 
		"NOT", "NOTEQUALS", "NUMBER", "PLUS", "POSITIVE", "PRINT", "PROGRAM", 
		"RCURLY", "READ", "RPAREN", "SEMICOLON", "SMALLER", "SMALLEREQ", "THEN", 
		"TIMES", "UPPER", "VAR", "WS"
	};
	public static final int EOF=-1;
	public static final int BECOMES=4;
	public static final int BOOL=5;
	public static final int CHAR=6;
	public static final int COMMA=7;
	public static final int COMMENT=8;
	public static final int COMPOUND=9;
	public static final int CONSTANT=10;
	public static final int DIGIT=11;
	public static final int DIVIDE=12;
	public static final int ELSE=13;
	public static final int ENDIF=14;
	public static final int EQUALS=15;
	public static final int GREATER=16;
	public static final int GREATEREQ=17;
	public static final int IDENTIFIER=18;
	public static final int IF=19;
	public static final int INT=20;
	public static final int LCURLY=21;
	public static final int LETTER=22;
	public static final int LOGAND=23;
	public static final int LOGOR=24;
	public static final int LOWER=25;
	public static final int LPAREN=26;
	public static final int MINUS=27;
	public static final int MODULO=28;
	public static final int NEGATIVE=29;
	public static final int NOT=30;
	public static final int NOTEQUALS=31;
	public static final int NUMBER=32;
	public static final int PLUS=33;
	public static final int POSITIVE=34;
	public static final int PRINT=35;
	public static final int PROGRAM=36;
	public static final int RCURLY=37;
	public static final int READ=38;
	public static final int RPAREN=39;
	public static final int SEMICOLON=40;
	public static final int SMALLER=41;
	public static final int SMALLEREQ=42;
	public static final int THEN=43;
	public static final int TIMES=44;
	public static final int UPPER=45;
	public static final int VAR=46;
	public static final int WS=47;

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
	// Forrest.g:65:1: forrest : program_lines EOF -> ^( PROGRAM program_lines ) ;
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
			// Forrest.g:66:2: ( program_lines EOF -> ^( PROGRAM program_lines ) )
			// Forrest.g:66:6: program_lines EOF
			{
			pushFollow(FOLLOW_program_lines_in_forrest640);
			program_lines1=program_lines();
			state._fsp--;

			stream_program_lines.add(program_lines1.getTree());
			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_forrest642);  
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
			// 67:13: -> ^( PROGRAM program_lines )
			{
				// Forrest.g:67:17: ^( PROGRAM program_lines )
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
	// Forrest.g:70:1: program_lines : ( ( declaration SEMICOLON !)* ( expr SEMICOLON !) )* ;
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
			// Forrest.g:71:2: ( ( ( declaration SEMICOLON !)* ( expr SEMICOLON !) )* )
			// Forrest.g:71:4: ( ( declaration SEMICOLON !)* ( expr SEMICOLON !) )*
			{
			root_0 = (ForrestTree)adaptor.nil();


			// Forrest.g:71:4: ( ( declaration SEMICOLON !)* ( expr SEMICOLON !) )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==CONSTANT||(LA2_0 >= IDENTIFIER && LA2_0 <= IF)||LA2_0==LCURLY||(LA2_0 >= LPAREN && LA2_0 <= MINUS)||LA2_0==NOT||(LA2_0 >= NUMBER && LA2_0 <= PLUS)||LA2_0==PRINT||LA2_0==READ||LA2_0==VAR) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// Forrest.g:71:5: ( declaration SEMICOLON !)* ( expr SEMICOLON !)
					{
					// Forrest.g:71:5: ( declaration SEMICOLON !)*
					loop1:
					while (true) {
						int alt1=2;
						int LA1_0 = input.LA(1);
						if ( (LA1_0==CONSTANT||LA1_0==VAR) ) {
							alt1=1;
						}

						switch (alt1) {
						case 1 :
							// Forrest.g:71:6: declaration SEMICOLON !
							{
							pushFollow(FOLLOW_declaration_in_program_lines683);
							declaration3=declaration();
							state._fsp--;

							adaptor.addChild(root_0, declaration3.getTree());

							SEMICOLON4=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_program_lines685); 
							}
							break;

						default :
							break loop1;
						}
					}

					// Forrest.g:71:31: ( expr SEMICOLON !)
					// Forrest.g:71:32: expr SEMICOLON !
					{
					pushFollow(FOLLOW_expr_in_program_lines691);
					expr5=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr5.getTree());

					SEMICOLON6=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_program_lines693); 
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
	// Forrest.g:74:1: declaration : ( VAR ^ IDENTIFIER ( CHAR | BOOL | INT ) | CONSTANT ^ IDENTIFIER BECOMES ! expr );
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
			// Forrest.g:75:2: ( VAR ^ IDENTIFIER ( CHAR | BOOL | INT ) | CONSTANT ^ IDENTIFIER BECOMES ! expr )
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
					// Forrest.g:75:4: VAR ^ IDENTIFIER ( CHAR | BOOL | INT )
					{
					root_0 = (ForrestTree)adaptor.nil();


					VAR7=(Token)match(input,VAR,FOLLOW_VAR_in_declaration709); 
					VAR7_tree = (ForrestTree)adaptor.create(VAR7);
					root_0 = (ForrestTree)adaptor.becomeRoot(VAR7_tree, root_0);

					IDENTIFIER8=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration712); 
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
					// Forrest.g:76:4: CONSTANT ^ IDENTIFIER BECOMES ! expr
					{
					root_0 = (ForrestTree)adaptor.nil();


					CONSTANT10=(Token)match(input,CONSTANT,FOLLOW_CONSTANT_in_declaration729); 
					CONSTANT10_tree = (ForrestTree)adaptor.create(CONSTANT10);
					root_0 = (ForrestTree)adaptor.becomeRoot(CONSTANT10_tree, root_0);

					IDENTIFIER11=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration732); 
					IDENTIFIER11_tree = (ForrestTree)adaptor.create(IDENTIFIER11);
					adaptor.addChild(root_0, IDENTIFIER11_tree);

					BECOMES12=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_declaration734); 
					pushFollow(FOLLOW_expr_in_declaration737);
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
	// Forrest.g:79:1: expr : expr_assign ;
	public final ForrestParser.expr_return expr() throws RecognitionException {
		ForrestParser.expr_return retval = new ForrestParser.expr_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		ParserRuleReturnScope expr_assign14 =null;


		try {
			// Forrest.g:80:2: ( expr_assign )
			// Forrest.g:80:5: expr_assign
			{
			root_0 = (ForrestTree)adaptor.nil();


			pushFollow(FOLLOW_expr_assign_in_expr749);
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
	// Forrest.g:83:1: expr_assign options {k=2; } : ( IDENTIFIER BECOMES ^ expr_assign | expr_if );
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
			// Forrest.g:85:2: ( IDENTIFIER BECOMES ^ expr_assign | expr_if )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==IDENTIFIER) ) {
				int LA4_1 = input.LA(2);
				if ( (LA4_1==BECOMES) ) {
					alt4=1;
				}
				else if ( (LA4_1==COMMA||LA4_1==DIVIDE||(LA4_1 >= EQUALS && LA4_1 <= GREATEREQ)||(LA4_1 >= LOGAND && LA4_1 <= LOGOR)||(LA4_1 >= MINUS && LA4_1 <= MODULO)||LA4_1==NOTEQUALS||LA4_1==PLUS||(LA4_1 >= RPAREN && LA4_1 <= SMALLEREQ)||LA4_1==TIMES) ) {
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
			else if ( (LA4_0==IF||LA4_0==LCURLY||(LA4_0 >= LPAREN && LA4_0 <= MINUS)||LA4_0==NOT||(LA4_0 >= NUMBER && LA4_0 <= PLUS)||LA4_0==PRINT||LA4_0==READ) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// Forrest.g:85:4: IDENTIFIER BECOMES ^ expr_assign
					{
					root_0 = (ForrestTree)adaptor.nil();


					IDENTIFIER15=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expr_assign768); 
					IDENTIFIER15_tree = (ForrestTree)adaptor.create(IDENTIFIER15);
					adaptor.addChild(root_0, IDENTIFIER15_tree);

					BECOMES16=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_expr_assign770); 
					BECOMES16_tree = (ForrestTree)adaptor.create(BECOMES16);
					root_0 = (ForrestTree)adaptor.becomeRoot(BECOMES16_tree, root_0);

					pushFollow(FOLLOW_expr_assign_in_expr_assign773);
					expr_assign17=expr_assign();
					state._fsp--;

					adaptor.addChild(root_0, expr_assign17.getTree());

					}
					break;
				case 2 :
					// Forrest.g:86:4: expr_if
					{
					root_0 = (ForrestTree)adaptor.nil();


					pushFollow(FOLLOW_expr_if_in_expr_assign778);
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
	// Forrest.g:89:1: expr_if : ( IF ^ expr_if THEN ! expr_if ( ELSE ! expr_if )? ENDIF | expr_or );
	public final ForrestParser.expr_if_return expr_if() throws RecognitionException {
		ForrestParser.expr_if_return retval = new ForrestParser.expr_if_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		Token IF19=null;
		Token THEN21=null;
		Token ELSE23=null;
		Token ENDIF25=null;
		ParserRuleReturnScope expr_if20 =null;
		ParserRuleReturnScope expr_if22 =null;
		ParserRuleReturnScope expr_if24 =null;
		ParserRuleReturnScope expr_or26 =null;

		ForrestTree IF19_tree=null;
		ForrestTree THEN21_tree=null;
		ForrestTree ELSE23_tree=null;
		ForrestTree ENDIF25_tree=null;

		try {
			// Forrest.g:90:2: ( IF ^ expr_if THEN ! expr_if ( ELSE ! expr_if )? ENDIF | expr_or )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==IF) ) {
				alt6=1;
			}
			else if ( (LA6_0==IDENTIFIER||LA6_0==LCURLY||(LA6_0 >= LPAREN && LA6_0 <= MINUS)||LA6_0==NOT||(LA6_0 >= NUMBER && LA6_0 <= PLUS)||LA6_0==PRINT||LA6_0==READ) ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// Forrest.g:90:4: IF ^ expr_if THEN ! expr_if ( ELSE ! expr_if )? ENDIF
					{
					root_0 = (ForrestTree)adaptor.nil();


					IF19=(Token)match(input,IF,FOLLOW_IF_in_expr_if790); 
					IF19_tree = (ForrestTree)adaptor.create(IF19);
					root_0 = (ForrestTree)adaptor.becomeRoot(IF19_tree, root_0);

					pushFollow(FOLLOW_expr_if_in_expr_if793);
					expr_if20=expr_if();
					state._fsp--;

					adaptor.addChild(root_0, expr_if20.getTree());

					THEN21=(Token)match(input,THEN,FOLLOW_THEN_in_expr_if795); 
					pushFollow(FOLLOW_expr_if_in_expr_if798);
					expr_if22=expr_if();
					state._fsp--;

					adaptor.addChild(root_0, expr_if22.getTree());

					// Forrest.g:90:30: ( ELSE ! expr_if )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==ELSE) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// Forrest.g:90:31: ELSE ! expr_if
							{
							ELSE23=(Token)match(input,ELSE,FOLLOW_ELSE_in_expr_if801); 
							pushFollow(FOLLOW_expr_if_in_expr_if804);
							expr_if24=expr_if();
							state._fsp--;

							adaptor.addChild(root_0, expr_if24.getTree());

							}
							break;

					}

					ENDIF25=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_expr_if808); 
					ENDIF25_tree = (ForrestTree)adaptor.create(ENDIF25);
					adaptor.addChild(root_0, ENDIF25_tree);

					}
					break;
				case 2 :
					// Forrest.g:91:4: expr_or
					{
					root_0 = (ForrestTree)adaptor.nil();


					pushFollow(FOLLOW_expr_or_in_expr_if813);
					expr_or26=expr_or();
					state._fsp--;

					adaptor.addChild(root_0, expr_or26.getTree());

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
	// Forrest.g:94:1: expr_or : expr_and ( LOGOR ^ expr_and )* ;
	public final ForrestParser.expr_or_return expr_or() throws RecognitionException {
		ForrestParser.expr_or_return retval = new ForrestParser.expr_or_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		Token LOGOR28=null;
		ParserRuleReturnScope expr_and27 =null;
		ParserRuleReturnScope expr_and29 =null;

		ForrestTree LOGOR28_tree=null;

		try {
			// Forrest.g:95:2: ( expr_and ( LOGOR ^ expr_and )* )
			// Forrest.g:95:4: expr_and ( LOGOR ^ expr_and )*
			{
			root_0 = (ForrestTree)adaptor.nil();


			pushFollow(FOLLOW_expr_and_in_expr_or825);
			expr_and27=expr_and();
			state._fsp--;

			adaptor.addChild(root_0, expr_and27.getTree());

			// Forrest.g:95:13: ( LOGOR ^ expr_and )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==LOGOR) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// Forrest.g:95:14: LOGOR ^ expr_and
					{
					LOGOR28=(Token)match(input,LOGOR,FOLLOW_LOGOR_in_expr_or828); 
					LOGOR28_tree = (ForrestTree)adaptor.create(LOGOR28);
					root_0 = (ForrestTree)adaptor.becomeRoot(LOGOR28_tree, root_0);

					pushFollow(FOLLOW_expr_and_in_expr_or831);
					expr_and29=expr_and();
					state._fsp--;

					adaptor.addChild(root_0, expr_and29.getTree());

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
	// Forrest.g:98:1: expr_and : expr_comp ( LOGAND ^ expr_comp )* ;
	public final ForrestParser.expr_and_return expr_and() throws RecognitionException {
		ForrestParser.expr_and_return retval = new ForrestParser.expr_and_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		Token LOGAND31=null;
		ParserRuleReturnScope expr_comp30 =null;
		ParserRuleReturnScope expr_comp32 =null;

		ForrestTree LOGAND31_tree=null;

		try {
			// Forrest.g:99:2: ( expr_comp ( LOGAND ^ expr_comp )* )
			// Forrest.g:99:4: expr_comp ( LOGAND ^ expr_comp )*
			{
			root_0 = (ForrestTree)adaptor.nil();


			pushFollow(FOLLOW_expr_comp_in_expr_and845);
			expr_comp30=expr_comp();
			state._fsp--;

			adaptor.addChild(root_0, expr_comp30.getTree());

			// Forrest.g:99:14: ( LOGAND ^ expr_comp )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==LOGAND) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// Forrest.g:99:15: LOGAND ^ expr_comp
					{
					LOGAND31=(Token)match(input,LOGAND,FOLLOW_LOGAND_in_expr_and848); 
					LOGAND31_tree = (ForrestTree)adaptor.create(LOGAND31);
					root_0 = (ForrestTree)adaptor.becomeRoot(LOGAND31_tree, root_0);

					pushFollow(FOLLOW_expr_comp_in_expr_and851);
					expr_comp32=expr_comp();
					state._fsp--;

					adaptor.addChild(root_0, expr_comp32.getTree());

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
	// Forrest.g:102:1: expr_comp : expr_add ( ( GREATER ^| SMALLER ^| GREATEREQ ^| SMALLEREQ ^| EQUALS ^| NOTEQUALS ^) expr_add )* ;
	public final ForrestParser.expr_comp_return expr_comp() throws RecognitionException {
		ForrestParser.expr_comp_return retval = new ForrestParser.expr_comp_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		Token GREATER34=null;
		Token SMALLER35=null;
		Token GREATEREQ36=null;
		Token SMALLEREQ37=null;
		Token EQUALS38=null;
		Token NOTEQUALS39=null;
		ParserRuleReturnScope expr_add33 =null;
		ParserRuleReturnScope expr_add40 =null;

		ForrestTree GREATER34_tree=null;
		ForrestTree SMALLER35_tree=null;
		ForrestTree GREATEREQ36_tree=null;
		ForrestTree SMALLEREQ37_tree=null;
		ForrestTree EQUALS38_tree=null;
		ForrestTree NOTEQUALS39_tree=null;

		try {
			// Forrest.g:103:2: ( expr_add ( ( GREATER ^| SMALLER ^| GREATEREQ ^| SMALLEREQ ^| EQUALS ^| NOTEQUALS ^) expr_add )* )
			// Forrest.g:103:4: expr_add ( ( GREATER ^| SMALLER ^| GREATEREQ ^| SMALLEREQ ^| EQUALS ^| NOTEQUALS ^) expr_add )*
			{
			root_0 = (ForrestTree)adaptor.nil();


			pushFollow(FOLLOW_expr_add_in_expr_comp865);
			expr_add33=expr_add();
			state._fsp--;

			adaptor.addChild(root_0, expr_add33.getTree());

			// Forrest.g:103:13: ( ( GREATER ^| SMALLER ^| GREATEREQ ^| SMALLEREQ ^| EQUALS ^| NOTEQUALS ^) expr_add )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( ((LA10_0 >= EQUALS && LA10_0 <= GREATEREQ)||LA10_0==NOTEQUALS||(LA10_0 >= SMALLER && LA10_0 <= SMALLEREQ)) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// Forrest.g:103:14: ( GREATER ^| SMALLER ^| GREATEREQ ^| SMALLEREQ ^| EQUALS ^| NOTEQUALS ^) expr_add
					{
					// Forrest.g:103:14: ( GREATER ^| SMALLER ^| GREATEREQ ^| SMALLEREQ ^| EQUALS ^| NOTEQUALS ^)
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
							// Forrest.g:103:15: GREATER ^
							{
							GREATER34=(Token)match(input,GREATER,FOLLOW_GREATER_in_expr_comp869); 
							GREATER34_tree = (ForrestTree)adaptor.create(GREATER34);
							root_0 = (ForrestTree)adaptor.becomeRoot(GREATER34_tree, root_0);

							}
							break;
						case 2 :
							// Forrest.g:103:26: SMALLER ^
							{
							SMALLER35=(Token)match(input,SMALLER,FOLLOW_SMALLER_in_expr_comp874); 
							SMALLER35_tree = (ForrestTree)adaptor.create(SMALLER35);
							root_0 = (ForrestTree)adaptor.becomeRoot(SMALLER35_tree, root_0);

							}
							break;
						case 3 :
							// Forrest.g:103:37: GREATEREQ ^
							{
							GREATEREQ36=(Token)match(input,GREATEREQ,FOLLOW_GREATEREQ_in_expr_comp879); 
							GREATEREQ36_tree = (ForrestTree)adaptor.create(GREATEREQ36);
							root_0 = (ForrestTree)adaptor.becomeRoot(GREATEREQ36_tree, root_0);

							}
							break;
						case 4 :
							// Forrest.g:103:50: SMALLEREQ ^
							{
							SMALLEREQ37=(Token)match(input,SMALLEREQ,FOLLOW_SMALLEREQ_in_expr_comp884); 
							SMALLEREQ37_tree = (ForrestTree)adaptor.create(SMALLEREQ37);
							root_0 = (ForrestTree)adaptor.becomeRoot(SMALLEREQ37_tree, root_0);

							}
							break;
						case 5 :
							// Forrest.g:103:63: EQUALS ^
							{
							EQUALS38=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_expr_comp889); 
							EQUALS38_tree = (ForrestTree)adaptor.create(EQUALS38);
							root_0 = (ForrestTree)adaptor.becomeRoot(EQUALS38_tree, root_0);

							}
							break;
						case 6 :
							// Forrest.g:103:73: NOTEQUALS ^
							{
							NOTEQUALS39=(Token)match(input,NOTEQUALS,FOLLOW_NOTEQUALS_in_expr_comp894); 
							NOTEQUALS39_tree = (ForrestTree)adaptor.create(NOTEQUALS39);
							root_0 = (ForrestTree)adaptor.becomeRoot(NOTEQUALS39_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_expr_add_in_expr_comp899);
					expr_add40=expr_add();
					state._fsp--;

					adaptor.addChild(root_0, expr_add40.getTree());

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
	// Forrest.g:106:1: expr_add : expr_mult ( ( PLUS ^| MINUS ^) expr_mult )* ;
	public final ForrestParser.expr_add_return expr_add() throws RecognitionException {
		ForrestParser.expr_add_return retval = new ForrestParser.expr_add_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		Token PLUS42=null;
		Token MINUS43=null;
		ParserRuleReturnScope expr_mult41 =null;
		ParserRuleReturnScope expr_mult44 =null;

		ForrestTree PLUS42_tree=null;
		ForrestTree MINUS43_tree=null;

		try {
			// Forrest.g:107:2: ( expr_mult ( ( PLUS ^| MINUS ^) expr_mult )* )
			// Forrest.g:107:4: expr_mult ( ( PLUS ^| MINUS ^) expr_mult )*
			{
			root_0 = (ForrestTree)adaptor.nil();


			pushFollow(FOLLOW_expr_mult_in_expr_add913);
			expr_mult41=expr_mult();
			state._fsp--;

			adaptor.addChild(root_0, expr_mult41.getTree());

			// Forrest.g:107:14: ( ( PLUS ^| MINUS ^) expr_mult )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==MINUS||LA12_0==PLUS) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// Forrest.g:107:15: ( PLUS ^| MINUS ^) expr_mult
					{
					// Forrest.g:107:15: ( PLUS ^| MINUS ^)
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
							// Forrest.g:107:16: PLUS ^
							{
							PLUS42=(Token)match(input,PLUS,FOLLOW_PLUS_in_expr_add917); 
							PLUS42_tree = (ForrestTree)adaptor.create(PLUS42);
							root_0 = (ForrestTree)adaptor.becomeRoot(PLUS42_tree, root_0);

							}
							break;
						case 2 :
							// Forrest.g:107:24: MINUS ^
							{
							MINUS43=(Token)match(input,MINUS,FOLLOW_MINUS_in_expr_add922); 
							MINUS43_tree = (ForrestTree)adaptor.create(MINUS43);
							root_0 = (ForrestTree)adaptor.becomeRoot(MINUS43_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_expr_mult_in_expr_add926);
					expr_mult44=expr_mult();
					state._fsp--;

					adaptor.addChild(root_0, expr_mult44.getTree());

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
	// Forrest.g:110:1: expr_mult : expr_unary ( ( TIMES ^| DIVIDE ^| MODULO ^) expr_unary )* ;
	public final ForrestParser.expr_mult_return expr_mult() throws RecognitionException {
		ForrestParser.expr_mult_return retval = new ForrestParser.expr_mult_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		Token TIMES46=null;
		Token DIVIDE47=null;
		Token MODULO48=null;
		ParserRuleReturnScope expr_unary45 =null;
		ParserRuleReturnScope expr_unary49 =null;

		ForrestTree TIMES46_tree=null;
		ForrestTree DIVIDE47_tree=null;
		ForrestTree MODULO48_tree=null;

		try {
			// Forrest.g:111:2: ( expr_unary ( ( TIMES ^| DIVIDE ^| MODULO ^) expr_unary )* )
			// Forrest.g:111:4: expr_unary ( ( TIMES ^| DIVIDE ^| MODULO ^) expr_unary )*
			{
			root_0 = (ForrestTree)adaptor.nil();


			pushFollow(FOLLOW_expr_unary_in_expr_mult939);
			expr_unary45=expr_unary();
			state._fsp--;

			adaptor.addChild(root_0, expr_unary45.getTree());

			// Forrest.g:111:15: ( ( TIMES ^| DIVIDE ^| MODULO ^) expr_unary )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==DIVIDE||LA14_0==MODULO||LA14_0==TIMES) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// Forrest.g:111:16: ( TIMES ^| DIVIDE ^| MODULO ^) expr_unary
					{
					// Forrest.g:111:16: ( TIMES ^| DIVIDE ^| MODULO ^)
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
							// Forrest.g:111:17: TIMES ^
							{
							TIMES46=(Token)match(input,TIMES,FOLLOW_TIMES_in_expr_mult943); 
							TIMES46_tree = (ForrestTree)adaptor.create(TIMES46);
							root_0 = (ForrestTree)adaptor.becomeRoot(TIMES46_tree, root_0);

							}
							break;
						case 2 :
							// Forrest.g:111:26: DIVIDE ^
							{
							DIVIDE47=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_expr_mult948); 
							DIVIDE47_tree = (ForrestTree)adaptor.create(DIVIDE47);
							root_0 = (ForrestTree)adaptor.becomeRoot(DIVIDE47_tree, root_0);

							}
							break;
						case 3 :
							// Forrest.g:111:36: MODULO ^
							{
							MODULO48=(Token)match(input,MODULO,FOLLOW_MODULO_in_expr_mult953); 
							MODULO48_tree = (ForrestTree)adaptor.create(MODULO48);
							root_0 = (ForrestTree)adaptor.becomeRoot(MODULO48_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_expr_unary_in_expr_mult957);
					expr_unary49=expr_unary();
					state._fsp--;

					adaptor.addChild(root_0, expr_unary49.getTree());

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
	// Forrest.g:114:1: expr_unary : ( ( NOT ^)? expr_compound | PLUS expr_compound -> ^( POSITIVE expr_compound ) | MINUS expr_compound -> ^( NEGATIVE expr_compound ) );
	public final ForrestParser.expr_unary_return expr_unary() throws RecognitionException {
		ForrestParser.expr_unary_return retval = new ForrestParser.expr_unary_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		Token NOT50=null;
		Token PLUS52=null;
		Token MINUS54=null;
		ParserRuleReturnScope expr_compound51 =null;
		ParserRuleReturnScope expr_compound53 =null;
		ParserRuleReturnScope expr_compound55 =null;

		ForrestTree NOT50_tree=null;
		ForrestTree PLUS52_tree=null;
		ForrestTree MINUS54_tree=null;
		RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
		RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
		RewriteRuleSubtreeStream stream_expr_compound=new RewriteRuleSubtreeStream(adaptor,"rule expr_compound");

		try {
			// Forrest.g:115:2: ( ( NOT ^)? expr_compound | PLUS expr_compound -> ^( POSITIVE expr_compound ) | MINUS expr_compound -> ^( NEGATIVE expr_compound ) )
			int alt16=3;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
			case LCURLY:
			case LPAREN:
			case NOT:
			case NUMBER:
			case PRINT:
			case READ:
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
					// Forrest.g:115:4: ( NOT ^)? expr_compound
					{
					root_0 = (ForrestTree)adaptor.nil();


					// Forrest.g:115:4: ( NOT ^)?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==NOT) ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// Forrest.g:115:5: NOT ^
							{
							NOT50=(Token)match(input,NOT,FOLLOW_NOT_in_expr_unary972); 
							NOT50_tree = (ForrestTree)adaptor.create(NOT50);
							root_0 = (ForrestTree)adaptor.becomeRoot(NOT50_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_expr_compound_in_expr_unary977);
					expr_compound51=expr_compound();
					state._fsp--;

					adaptor.addChild(root_0, expr_compound51.getTree());

					}
					break;
				case 2 :
					// Forrest.g:116:4: PLUS expr_compound
					{
					PLUS52=(Token)match(input,PLUS,FOLLOW_PLUS_in_expr_unary982);  
					stream_PLUS.add(PLUS52);

					pushFollow(FOLLOW_expr_compound_in_expr_unary984);
					expr_compound53=expr_compound();
					state._fsp--;

					stream_expr_compound.add(expr_compound53.getTree());
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
					// 117:4: -> ^( POSITIVE expr_compound )
					{
						// Forrest.g:117:7: ^( POSITIVE expr_compound )
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
					// Forrest.g:118:4: MINUS expr_compound
					{
					MINUS54=(Token)match(input,MINUS,FOLLOW_MINUS_in_expr_unary1000);  
					stream_MINUS.add(MINUS54);

					pushFollow(FOLLOW_expr_compound_in_expr_unary1002);
					expr_compound55=expr_compound();
					state._fsp--;

					stream_expr_compound.add(expr_compound55.getTree());
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
					// 119:4: -> ^( NEGATIVE expr_compound )
					{
						// Forrest.g:119:7: ^( NEGATIVE expr_compound )
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
	// Forrest.g:122:1: expr_compound : ( LCURLY program_lines RCURLY -> ^( COMPOUND program_lines ) | IDENTIFIER | NUMBER | LPAREN ! expr RPAREN !| read | print );
	public final ForrestParser.expr_compound_return expr_compound() throws RecognitionException {
		ForrestParser.expr_compound_return retval = new ForrestParser.expr_compound_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		Token LCURLY56=null;
		Token RCURLY58=null;
		Token IDENTIFIER59=null;
		Token NUMBER60=null;
		Token LPAREN61=null;
		Token RPAREN63=null;
		ParserRuleReturnScope program_lines57 =null;
		ParserRuleReturnScope expr62 =null;
		ParserRuleReturnScope read64 =null;
		ParserRuleReturnScope print65 =null;

		ForrestTree LCURLY56_tree=null;
		ForrestTree RCURLY58_tree=null;
		ForrestTree IDENTIFIER59_tree=null;
		ForrestTree NUMBER60_tree=null;
		ForrestTree LPAREN61_tree=null;
		ForrestTree RPAREN63_tree=null;
		RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
		RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
		RewriteRuleSubtreeStream stream_program_lines=new RewriteRuleSubtreeStream(adaptor,"rule program_lines");

		try {
			// Forrest.g:123:2: ( LCURLY program_lines RCURLY -> ^( COMPOUND program_lines ) | IDENTIFIER | NUMBER | LPAREN ! expr RPAREN !| read | print )
			int alt17=6;
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
			case LPAREN:
				{
				alt17=4;
				}
				break;
			case READ:
				{
				alt17=5;
				}
				break;
			case PRINT:
				{
				alt17=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}
			switch (alt17) {
				case 1 :
					// Forrest.g:123:4: LCURLY program_lines RCURLY
					{
					LCURLY56=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_expr_compound1025);  
					stream_LCURLY.add(LCURLY56);

					pushFollow(FOLLOW_program_lines_in_expr_compound1027);
					program_lines57=program_lines();
					state._fsp--;

					stream_program_lines.add(program_lines57.getTree());
					RCURLY58=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_expr_compound1029);  
					stream_RCURLY.add(RCURLY58);

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
					// 124:4: -> ^( COMPOUND program_lines )
					{
						// Forrest.g:124:8: ^( COMPOUND program_lines )
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
					// Forrest.g:125:4: IDENTIFIER
					{
					root_0 = (ForrestTree)adaptor.nil();


					IDENTIFIER59=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expr_compound1047); 
					IDENTIFIER59_tree = (ForrestTree)adaptor.create(IDENTIFIER59);
					adaptor.addChild(root_0, IDENTIFIER59_tree);

					}
					break;
				case 3 :
					// Forrest.g:126:4: NUMBER
					{
					root_0 = (ForrestTree)adaptor.nil();


					NUMBER60=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_expr_compound1052); 
					NUMBER60_tree = (ForrestTree)adaptor.create(NUMBER60);
					adaptor.addChild(root_0, NUMBER60_tree);

					}
					break;
				case 4 :
					// Forrest.g:127:4: LPAREN ! expr RPAREN !
					{
					root_0 = (ForrestTree)adaptor.nil();


					LPAREN61=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_expr_compound1057); 
					pushFollow(FOLLOW_expr_in_expr_compound1060);
					expr62=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr62.getTree());

					RPAREN63=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_expr_compound1062); 
					}
					break;
				case 5 :
					// Forrest.g:128:5: read
					{
					root_0 = (ForrestTree)adaptor.nil();


					pushFollow(FOLLOW_read_in_expr_compound1069);
					read64=read();
					state._fsp--;

					adaptor.addChild(root_0, read64.getTree());

					}
					break;
				case 6 :
					// Forrest.g:129:4: print
					{
					root_0 = (ForrestTree)adaptor.nil();


					pushFollow(FOLLOW_print_in_expr_compound1074);
					print65=print();
					state._fsp--;

					adaptor.addChild(root_0, print65.getTree());

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
	// Forrest.g:132:1: read : READ ^ LPAREN ! IDENTIFIER ( COMMA ! IDENTIFIER )* RPAREN !;
	public final ForrestParser.read_return read() throws RecognitionException {
		ForrestParser.read_return retval = new ForrestParser.read_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		Token READ66=null;
		Token LPAREN67=null;
		Token IDENTIFIER68=null;
		Token COMMA69=null;
		Token IDENTIFIER70=null;
		Token RPAREN71=null;

		ForrestTree READ66_tree=null;
		ForrestTree LPAREN67_tree=null;
		ForrestTree IDENTIFIER68_tree=null;
		ForrestTree COMMA69_tree=null;
		ForrestTree IDENTIFIER70_tree=null;
		ForrestTree RPAREN71_tree=null;

		try {
			// Forrest.g:133:2: ( READ ^ LPAREN ! IDENTIFIER ( COMMA ! IDENTIFIER )* RPAREN !)
			// Forrest.g:133:4: READ ^ LPAREN ! IDENTIFIER ( COMMA ! IDENTIFIER )* RPAREN !
			{
			root_0 = (ForrestTree)adaptor.nil();


			READ66=(Token)match(input,READ,FOLLOW_READ_in_read1086); 
			READ66_tree = (ForrestTree)adaptor.create(READ66);
			root_0 = (ForrestTree)adaptor.becomeRoot(READ66_tree, root_0);

			LPAREN67=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_read1089); 
			IDENTIFIER68=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_read1092); 
			IDENTIFIER68_tree = (ForrestTree)adaptor.create(IDENTIFIER68);
			adaptor.addChild(root_0, IDENTIFIER68_tree);

			// Forrest.g:133:29: ( COMMA ! IDENTIFIER )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==COMMA) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// Forrest.g:133:30: COMMA ! IDENTIFIER
					{
					COMMA69=(Token)match(input,COMMA,FOLLOW_COMMA_in_read1095); 
					IDENTIFIER70=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_read1098); 
					IDENTIFIER70_tree = (ForrestTree)adaptor.create(IDENTIFIER70);
					adaptor.addChild(root_0, IDENTIFIER70_tree);

					}
					break;

				default :
					break loop18;
				}
			}

			RPAREN71=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_read1102); 
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
	// Forrest.g:136:1: print : PRINT ^ LPAREN ! expr ( COMMA ! expr )* RPAREN !;
	public final ForrestParser.print_return print() throws RecognitionException {
		ForrestParser.print_return retval = new ForrestParser.print_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		Token PRINT72=null;
		Token LPAREN73=null;
		Token COMMA75=null;
		Token RPAREN77=null;
		ParserRuleReturnScope expr74 =null;
		ParserRuleReturnScope expr76 =null;

		ForrestTree PRINT72_tree=null;
		ForrestTree LPAREN73_tree=null;
		ForrestTree COMMA75_tree=null;
		ForrestTree RPAREN77_tree=null;

		try {
			// Forrest.g:137:2: ( PRINT ^ LPAREN ! expr ( COMMA ! expr )* RPAREN !)
			// Forrest.g:137:4: PRINT ^ LPAREN ! expr ( COMMA ! expr )* RPAREN !
			{
			root_0 = (ForrestTree)adaptor.nil();


			PRINT72=(Token)match(input,PRINT,FOLLOW_PRINT_in_print1114); 
			PRINT72_tree = (ForrestTree)adaptor.create(PRINT72);
			root_0 = (ForrestTree)adaptor.becomeRoot(PRINT72_tree, root_0);

			LPAREN73=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_print1117); 
			pushFollow(FOLLOW_expr_in_print1120);
			expr74=expr();
			state._fsp--;

			adaptor.addChild(root_0, expr74.getTree());

			// Forrest.g:137:24: ( COMMA ! expr )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==COMMA) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// Forrest.g:137:25: COMMA ! expr
					{
					COMMA75=(Token)match(input,COMMA,FOLLOW_COMMA_in_print1123); 
					pushFollow(FOLLOW_expr_in_print1126);
					expr76=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr76.getTree());

					}
					break;

				default :
					break loop19;
				}
			}

			RPAREN77=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_print1130); 
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



	public static final BitSet FOLLOW_program_lines_in_forrest640 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_forrest642 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_program_lines683 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_program_lines685 = new BitSet(new long[]{0x0000404B4C2C0400L});
	public static final BitSet FOLLOW_expr_in_program_lines691 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_program_lines693 = new BitSet(new long[]{0x0000404B4C2C0402L});
	public static final BitSet FOLLOW_VAR_in_declaration709 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration712 = new BitSet(new long[]{0x0000000000100060L});
	public static final BitSet FOLLOW_set_in_declaration714 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONSTANT_in_declaration729 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration732 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_BECOMES_in_declaration734 = new BitSet(new long[]{0x0000004B4C2C0000L});
	public static final BitSet FOLLOW_expr_in_declaration737 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_assign_in_expr749 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_expr_assign768 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_BECOMES_in_expr_assign770 = new BitSet(new long[]{0x0000004B4C2C0000L});
	public static final BitSet FOLLOW_expr_assign_in_expr_assign773 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_if_in_expr_assign778 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_expr_if790 = new BitSet(new long[]{0x0000004B4C2C0000L});
	public static final BitSet FOLLOW_expr_if_in_expr_if793 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_THEN_in_expr_if795 = new BitSet(new long[]{0x0000004B4C2C0000L});
	public static final BitSet FOLLOW_expr_if_in_expr_if798 = new BitSet(new long[]{0x0000000000006000L});
	public static final BitSet FOLLOW_ELSE_in_expr_if801 = new BitSet(new long[]{0x0000004B4C2C0000L});
	public static final BitSet FOLLOW_expr_if_in_expr_if804 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_ENDIF_in_expr_if808 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_or_in_expr_if813 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_and_in_expr_or825 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_LOGOR_in_expr_or828 = new BitSet(new long[]{0x0000004B4C240000L});
	public static final BitSet FOLLOW_expr_and_in_expr_or831 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_expr_comp_in_expr_and845 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_LOGAND_in_expr_and848 = new BitSet(new long[]{0x0000004B4C240000L});
	public static final BitSet FOLLOW_expr_comp_in_expr_and851 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_expr_add_in_expr_comp865 = new BitSet(new long[]{0x0000060080038002L});
	public static final BitSet FOLLOW_GREATER_in_expr_comp869 = new BitSet(new long[]{0x0000004B4C240000L});
	public static final BitSet FOLLOW_SMALLER_in_expr_comp874 = new BitSet(new long[]{0x0000004B4C240000L});
	public static final BitSet FOLLOW_GREATEREQ_in_expr_comp879 = new BitSet(new long[]{0x0000004B4C240000L});
	public static final BitSet FOLLOW_SMALLEREQ_in_expr_comp884 = new BitSet(new long[]{0x0000004B4C240000L});
	public static final BitSet FOLLOW_EQUALS_in_expr_comp889 = new BitSet(new long[]{0x0000004B4C240000L});
	public static final BitSet FOLLOW_NOTEQUALS_in_expr_comp894 = new BitSet(new long[]{0x0000004B4C240000L});
	public static final BitSet FOLLOW_expr_add_in_expr_comp899 = new BitSet(new long[]{0x0000060080038002L});
	public static final BitSet FOLLOW_expr_mult_in_expr_add913 = new BitSet(new long[]{0x0000000208000002L});
	public static final BitSet FOLLOW_PLUS_in_expr_add917 = new BitSet(new long[]{0x0000004B4C240000L});
	public static final BitSet FOLLOW_MINUS_in_expr_add922 = new BitSet(new long[]{0x0000004B4C240000L});
	public static final BitSet FOLLOW_expr_mult_in_expr_add926 = new BitSet(new long[]{0x0000000208000002L});
	public static final BitSet FOLLOW_expr_unary_in_expr_mult939 = new BitSet(new long[]{0x0000100010001002L});
	public static final BitSet FOLLOW_TIMES_in_expr_mult943 = new BitSet(new long[]{0x0000004B4C240000L});
	public static final BitSet FOLLOW_DIVIDE_in_expr_mult948 = new BitSet(new long[]{0x0000004B4C240000L});
	public static final BitSet FOLLOW_MODULO_in_expr_mult953 = new BitSet(new long[]{0x0000004B4C240000L});
	public static final BitSet FOLLOW_expr_unary_in_expr_mult957 = new BitSet(new long[]{0x0000100010001002L});
	public static final BitSet FOLLOW_NOT_in_expr_unary972 = new BitSet(new long[]{0x0000004904240000L});
	public static final BitSet FOLLOW_expr_compound_in_expr_unary977 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_expr_unary982 = new BitSet(new long[]{0x0000004904240000L});
	public static final BitSet FOLLOW_expr_compound_in_expr_unary984 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_expr_unary1000 = new BitSet(new long[]{0x0000004904240000L});
	public static final BitSet FOLLOW_expr_compound_in_expr_unary1002 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCURLY_in_expr_compound1025 = new BitSet(new long[]{0x0000406B4C2C0400L});
	public static final BitSet FOLLOW_program_lines_in_expr_compound1027 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RCURLY_in_expr_compound1029 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_expr_compound1047 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_expr_compound1052 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_expr_compound1057 = new BitSet(new long[]{0x0000004B4C2C0000L});
	public static final BitSet FOLLOW_expr_in_expr_compound1060 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_RPAREN_in_expr_compound1062 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_in_expr_compound1069 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_in_expr_compound1074 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_read1086 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_read1089 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_read1092 = new BitSet(new long[]{0x0000008000000080L});
	public static final BitSet FOLLOW_COMMA_in_read1095 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_read1098 = new BitSet(new long[]{0x0000008000000080L});
	public static final BitSet FOLLOW_RPAREN_in_read1102 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_print1114 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_print1117 = new BitSet(new long[]{0x0000004B4C2C0000L});
	public static final BitSet FOLLOW_expr_in_print1120 = new BitSet(new long[]{0x0000008000000080L});
	public static final BitSet FOLLOW_COMMA_in_print1123 = new BitSet(new long[]{0x0000004B4C2C0000L});
	public static final BitSet FOLLOW_expr_in_print1126 = new BitSet(new long[]{0x0000008000000080L});
	public static final BitSet FOLLOW_RPAREN_in_print1130 = new BitSet(new long[]{0x0000000000000002L});
}
