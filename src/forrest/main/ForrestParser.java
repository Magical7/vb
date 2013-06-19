// $ANTLR 3.5 Forrest.g 2013-06-19 13:02:08

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
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "forrest"
	// Forrest.g:64:1: forrest : program_lines EOF -> ^( PROGRAM program_lines ) ;
	public final ForrestParser.forrest_return forrest() throws RecognitionException {
		ForrestParser.forrest_return retval = new ForrestParser.forrest_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EOF2=null;
		ParserRuleReturnScope program_lines1 =null;

		Object EOF2_tree=null;
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleSubtreeStream stream_program_lines=new RewriteRuleSubtreeStream(adaptor,"rule program_lines");

		try {
			// Forrest.g:65:2: ( program_lines EOF -> ^( PROGRAM program_lines ) )
			// Forrest.g:65:6: program_lines EOF
			{
			pushFollow(FOLLOW_program_lines_in_forrest634);
			program_lines1=program_lines();
			state._fsp--;

			stream_program_lines.add(program_lines1.getTree());
			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_forrest636);  
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
			// 66:13: -> ^( PROGRAM program_lines )
			{
				// Forrest.g:66:17: ^( PROGRAM program_lines )
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
	// $ANTLR end "forrest"


	public static class program_lines_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program_lines"
	// Forrest.g:69:1: program_lines : ( ( declaration SEMICOLON !)* ( expr SEMICOLON !) )* ;
	public final ForrestParser.program_lines_return program_lines() throws RecognitionException {
		ForrestParser.program_lines_return retval = new ForrestParser.program_lines_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SEMICOLON4=null;
		Token SEMICOLON6=null;
		ParserRuleReturnScope declaration3 =null;
		ParserRuleReturnScope expr5 =null;

		Object SEMICOLON4_tree=null;
		Object SEMICOLON6_tree=null;

		try {
			// Forrest.g:70:2: ( ( ( declaration SEMICOLON !)* ( expr SEMICOLON !) )* )
			// Forrest.g:70:4: ( ( declaration SEMICOLON !)* ( expr SEMICOLON !) )*
			{
			root_0 = (Object)adaptor.nil();


			// Forrest.g:70:4: ( ( declaration SEMICOLON !)* ( expr SEMICOLON !) )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==CONSTANT||(LA2_0 >= IDENTIFIER && LA2_0 <= IF)||LA2_0==LCURLY||(LA2_0 >= LPAREN && LA2_0 <= MINUS)||LA2_0==NOT||(LA2_0 >= NUMBER && LA2_0 <= PLUS)||LA2_0==PRINT||LA2_0==READ||LA2_0==VAR) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// Forrest.g:70:5: ( declaration SEMICOLON !)* ( expr SEMICOLON !)
					{
					// Forrest.g:70:5: ( declaration SEMICOLON !)*
					loop1:
					while (true) {
						int alt1=2;
						int LA1_0 = input.LA(1);
						if ( (LA1_0==CONSTANT||LA1_0==VAR) ) {
							alt1=1;
						}

						switch (alt1) {
						case 1 :
							// Forrest.g:70:6: declaration SEMICOLON !
							{
							pushFollow(FOLLOW_declaration_in_program_lines677);
							declaration3=declaration();
							state._fsp--;

							adaptor.addChild(root_0, declaration3.getTree());

							SEMICOLON4=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_program_lines679); 
							}
							break;

						default :
							break loop1;
						}
					}

					// Forrest.g:70:31: ( expr SEMICOLON !)
					// Forrest.g:70:32: expr SEMICOLON !
					{
					pushFollow(FOLLOW_expr_in_program_lines685);
					expr5=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr5.getTree());

					SEMICOLON6=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_program_lines687); 
					}

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
	// Forrest.g:73:1: declaration : ( VAR ^ IDENTIFIER ( CHAR | BOOL | INT ) | CONSTANT ^ IDENTIFIER BECOMES ! expr );
	public final ForrestParser.declaration_return declaration() throws RecognitionException {
		ForrestParser.declaration_return retval = new ForrestParser.declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token VAR7=null;
		Token IDENTIFIER8=null;
		Token set9=null;
		Token CONSTANT10=null;
		Token IDENTIFIER11=null;
		Token BECOMES12=null;
		ParserRuleReturnScope expr13 =null;

		Object VAR7_tree=null;
		Object IDENTIFIER8_tree=null;
		Object set9_tree=null;
		Object CONSTANT10_tree=null;
		Object IDENTIFIER11_tree=null;
		Object BECOMES12_tree=null;

		try {
			// Forrest.g:74:2: ( VAR ^ IDENTIFIER ( CHAR | BOOL | INT ) | CONSTANT ^ IDENTIFIER BECOMES ! expr )
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
					// Forrest.g:74:4: VAR ^ IDENTIFIER ( CHAR | BOOL | INT )
					{
					root_0 = (Object)adaptor.nil();


					VAR7=(Token)match(input,VAR,FOLLOW_VAR_in_declaration703); 
					VAR7_tree = (Object)adaptor.create(VAR7);
					root_0 = (Object)adaptor.becomeRoot(VAR7_tree, root_0);

					IDENTIFIER8=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration706); 
					IDENTIFIER8_tree = (Object)adaptor.create(IDENTIFIER8);
					adaptor.addChild(root_0, IDENTIFIER8_tree);

					set9=input.LT(1);
					if ( (input.LA(1) >= BOOL && input.LA(1) <= CHAR)||input.LA(1)==INT ) {
						input.consume();
						adaptor.addChild(root_0, (Object)adaptor.create(set9));
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;
				case 2 :
					// Forrest.g:75:4: CONSTANT ^ IDENTIFIER BECOMES ! expr
					{
					root_0 = (Object)adaptor.nil();


					CONSTANT10=(Token)match(input,CONSTANT,FOLLOW_CONSTANT_in_declaration723); 
					CONSTANT10_tree = (Object)adaptor.create(CONSTANT10);
					root_0 = (Object)adaptor.becomeRoot(CONSTANT10_tree, root_0);

					IDENTIFIER11=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration726); 
					IDENTIFIER11_tree = (Object)adaptor.create(IDENTIFIER11);
					adaptor.addChild(root_0, IDENTIFIER11_tree);

					BECOMES12=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_declaration728); 
					pushFollow(FOLLOW_expr_in_declaration731);
					expr13=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr13.getTree());

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
	// $ANTLR end "declaration"


	public static class expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr"
	// Forrest.g:78:1: expr : expr_assign ;
	public final ForrestParser.expr_return expr() throws RecognitionException {
		ForrestParser.expr_return retval = new ForrestParser.expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expr_assign14 =null;


		try {
			// Forrest.g:79:2: ( expr_assign )
			// Forrest.g:79:5: expr_assign
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr_assign_in_expr743);
			expr_assign14=expr_assign();
			state._fsp--;

			adaptor.addChild(root_0, expr_assign14.getTree());

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
	// Forrest.g:82:1: expr_assign : expr_if ( BECOMES ^ expr_if )* ;
	public final ForrestParser.expr_assign_return expr_assign() throws RecognitionException {
		ForrestParser.expr_assign_return retval = new ForrestParser.expr_assign_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token BECOMES16=null;
		ParserRuleReturnScope expr_if15 =null;
		ParserRuleReturnScope expr_if17 =null;

		Object BECOMES16_tree=null;

		try {
			// Forrest.g:83:2: ( expr_if ( BECOMES ^ expr_if )* )
			// Forrest.g:83:4: expr_if ( BECOMES ^ expr_if )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr_if_in_expr_assign755);
			expr_if15=expr_if();
			state._fsp--;

			adaptor.addChild(root_0, expr_if15.getTree());

			// Forrest.g:83:12: ( BECOMES ^ expr_if )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==BECOMES) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// Forrest.g:83:13: BECOMES ^ expr_if
					{
					BECOMES16=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_expr_assign758); 
					BECOMES16_tree = (Object)adaptor.create(BECOMES16);
					root_0 = (Object)adaptor.becomeRoot(BECOMES16_tree, root_0);

					pushFollow(FOLLOW_expr_if_in_expr_assign761);
					expr_if17=expr_if();
					state._fsp--;

					adaptor.addChild(root_0, expr_if17.getTree());

					}
					break;

				default :
					break loop4;
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
	// $ANTLR end "expr_assign"


	public static class expr_if_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr_if"
	// Forrest.g:86:1: expr_if : ( IF ^ expr_if THEN ! expr_if ( ELSE ! expr_if )? ENDIF | expr_or );
	public final ForrestParser.expr_if_return expr_if() throws RecognitionException {
		ForrestParser.expr_if_return retval = new ForrestParser.expr_if_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IF18=null;
		Token THEN20=null;
		Token ELSE22=null;
		Token ENDIF24=null;
		ParserRuleReturnScope expr_if19 =null;
		ParserRuleReturnScope expr_if21 =null;
		ParserRuleReturnScope expr_if23 =null;
		ParserRuleReturnScope expr_or25 =null;

		Object IF18_tree=null;
		Object THEN20_tree=null;
		Object ELSE22_tree=null;
		Object ENDIF24_tree=null;

		try {
			// Forrest.g:87:2: ( IF ^ expr_if THEN ! expr_if ( ELSE ! expr_if )? ENDIF | expr_or )
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
					// Forrest.g:87:4: IF ^ expr_if THEN ! expr_if ( ELSE ! expr_if )? ENDIF
					{
					root_0 = (Object)adaptor.nil();


					IF18=(Token)match(input,IF,FOLLOW_IF_in_expr_if775); 
					IF18_tree = (Object)adaptor.create(IF18);
					root_0 = (Object)adaptor.becomeRoot(IF18_tree, root_0);

					pushFollow(FOLLOW_expr_if_in_expr_if778);
					expr_if19=expr_if();
					state._fsp--;

					adaptor.addChild(root_0, expr_if19.getTree());

					THEN20=(Token)match(input,THEN,FOLLOW_THEN_in_expr_if780); 
					pushFollow(FOLLOW_expr_if_in_expr_if783);
					expr_if21=expr_if();
					state._fsp--;

					adaptor.addChild(root_0, expr_if21.getTree());

					// Forrest.g:87:30: ( ELSE ! expr_if )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==ELSE) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// Forrest.g:87:31: ELSE ! expr_if
							{
							ELSE22=(Token)match(input,ELSE,FOLLOW_ELSE_in_expr_if786); 
							pushFollow(FOLLOW_expr_if_in_expr_if789);
							expr_if23=expr_if();
							state._fsp--;

							adaptor.addChild(root_0, expr_if23.getTree());

							}
							break;

					}

					ENDIF24=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_expr_if793); 
					ENDIF24_tree = (Object)adaptor.create(ENDIF24);
					adaptor.addChild(root_0, ENDIF24_tree);

					}
					break;
				case 2 :
					// Forrest.g:88:4: expr_or
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expr_or_in_expr_if798);
					expr_or25=expr_or();
					state._fsp--;

					adaptor.addChild(root_0, expr_or25.getTree());

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


	public static class expr_or_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr_or"
	// Forrest.g:91:1: expr_or : expr_and ( LOGOR ^ expr_and )* ;
	public final ForrestParser.expr_or_return expr_or() throws RecognitionException {
		ForrestParser.expr_or_return retval = new ForrestParser.expr_or_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LOGOR27=null;
		ParserRuleReturnScope expr_and26 =null;
		ParserRuleReturnScope expr_and28 =null;

		Object LOGOR27_tree=null;

		try {
			// Forrest.g:92:2: ( expr_and ( LOGOR ^ expr_and )* )
			// Forrest.g:92:4: expr_and ( LOGOR ^ expr_and )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr_and_in_expr_or810);
			expr_and26=expr_and();
			state._fsp--;

			adaptor.addChild(root_0, expr_and26.getTree());

			// Forrest.g:92:13: ( LOGOR ^ expr_and )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==LOGOR) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// Forrest.g:92:14: LOGOR ^ expr_and
					{
					LOGOR27=(Token)match(input,LOGOR,FOLLOW_LOGOR_in_expr_or813); 
					LOGOR27_tree = (Object)adaptor.create(LOGOR27);
					root_0 = (Object)adaptor.becomeRoot(LOGOR27_tree, root_0);

					pushFollow(FOLLOW_expr_and_in_expr_or816);
					expr_and28=expr_and();
					state._fsp--;

					adaptor.addChild(root_0, expr_and28.getTree());

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
	// $ANTLR end "expr_or"


	public static class expr_and_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr_and"
	// Forrest.g:95:1: expr_and : expr_comp ( LOGAND ^ expr_comp )* ;
	public final ForrestParser.expr_and_return expr_and() throws RecognitionException {
		ForrestParser.expr_and_return retval = new ForrestParser.expr_and_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LOGAND30=null;
		ParserRuleReturnScope expr_comp29 =null;
		ParserRuleReturnScope expr_comp31 =null;

		Object LOGAND30_tree=null;

		try {
			// Forrest.g:96:2: ( expr_comp ( LOGAND ^ expr_comp )* )
			// Forrest.g:96:4: expr_comp ( LOGAND ^ expr_comp )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr_comp_in_expr_and830);
			expr_comp29=expr_comp();
			state._fsp--;

			adaptor.addChild(root_0, expr_comp29.getTree());

			// Forrest.g:96:14: ( LOGAND ^ expr_comp )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==LOGAND) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// Forrest.g:96:15: LOGAND ^ expr_comp
					{
					LOGAND30=(Token)match(input,LOGAND,FOLLOW_LOGAND_in_expr_and833); 
					LOGAND30_tree = (Object)adaptor.create(LOGAND30);
					root_0 = (Object)adaptor.becomeRoot(LOGAND30_tree, root_0);

					pushFollow(FOLLOW_expr_comp_in_expr_and836);
					expr_comp31=expr_comp();
					state._fsp--;

					adaptor.addChild(root_0, expr_comp31.getTree());

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
	// $ANTLR end "expr_and"


	public static class expr_comp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr_comp"
	// Forrest.g:99:1: expr_comp : expr_add ( ( GREATER ^| SMALLER ^| GREATEREQ ^| SMALLEREQ ^| EQUALS ^| NOTEQUALS ^) expr_add )* ;
	public final ForrestParser.expr_comp_return expr_comp() throws RecognitionException {
		ForrestParser.expr_comp_return retval = new ForrestParser.expr_comp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token GREATER33=null;
		Token SMALLER34=null;
		Token GREATEREQ35=null;
		Token SMALLEREQ36=null;
		Token EQUALS37=null;
		Token NOTEQUALS38=null;
		ParserRuleReturnScope expr_add32 =null;
		ParserRuleReturnScope expr_add39 =null;

		Object GREATER33_tree=null;
		Object SMALLER34_tree=null;
		Object GREATEREQ35_tree=null;
		Object SMALLEREQ36_tree=null;
		Object EQUALS37_tree=null;
		Object NOTEQUALS38_tree=null;

		try {
			// Forrest.g:100:2: ( expr_add ( ( GREATER ^| SMALLER ^| GREATEREQ ^| SMALLEREQ ^| EQUALS ^| NOTEQUALS ^) expr_add )* )
			// Forrest.g:100:4: expr_add ( ( GREATER ^| SMALLER ^| GREATEREQ ^| SMALLEREQ ^| EQUALS ^| NOTEQUALS ^) expr_add )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr_add_in_expr_comp850);
			expr_add32=expr_add();
			state._fsp--;

			adaptor.addChild(root_0, expr_add32.getTree());

			// Forrest.g:100:13: ( ( GREATER ^| SMALLER ^| GREATEREQ ^| SMALLEREQ ^| EQUALS ^| NOTEQUALS ^) expr_add )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( ((LA10_0 >= EQUALS && LA10_0 <= GREATEREQ)||LA10_0==NOTEQUALS||(LA10_0 >= SMALLER && LA10_0 <= SMALLEREQ)) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// Forrest.g:100:14: ( GREATER ^| SMALLER ^| GREATEREQ ^| SMALLEREQ ^| EQUALS ^| NOTEQUALS ^) expr_add
					{
					// Forrest.g:100:14: ( GREATER ^| SMALLER ^| GREATEREQ ^| SMALLEREQ ^| EQUALS ^| NOTEQUALS ^)
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
							// Forrest.g:100:15: GREATER ^
							{
							GREATER33=(Token)match(input,GREATER,FOLLOW_GREATER_in_expr_comp854); 
							GREATER33_tree = (Object)adaptor.create(GREATER33);
							root_0 = (Object)adaptor.becomeRoot(GREATER33_tree, root_0);

							}
							break;
						case 2 :
							// Forrest.g:100:26: SMALLER ^
							{
							SMALLER34=(Token)match(input,SMALLER,FOLLOW_SMALLER_in_expr_comp859); 
							SMALLER34_tree = (Object)adaptor.create(SMALLER34);
							root_0 = (Object)adaptor.becomeRoot(SMALLER34_tree, root_0);

							}
							break;
						case 3 :
							// Forrest.g:100:37: GREATEREQ ^
							{
							GREATEREQ35=(Token)match(input,GREATEREQ,FOLLOW_GREATEREQ_in_expr_comp864); 
							GREATEREQ35_tree = (Object)adaptor.create(GREATEREQ35);
							root_0 = (Object)adaptor.becomeRoot(GREATEREQ35_tree, root_0);

							}
							break;
						case 4 :
							// Forrest.g:100:50: SMALLEREQ ^
							{
							SMALLEREQ36=(Token)match(input,SMALLEREQ,FOLLOW_SMALLEREQ_in_expr_comp869); 
							SMALLEREQ36_tree = (Object)adaptor.create(SMALLEREQ36);
							root_0 = (Object)adaptor.becomeRoot(SMALLEREQ36_tree, root_0);

							}
							break;
						case 5 :
							// Forrest.g:100:63: EQUALS ^
							{
							EQUALS37=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_expr_comp874); 
							EQUALS37_tree = (Object)adaptor.create(EQUALS37);
							root_0 = (Object)adaptor.becomeRoot(EQUALS37_tree, root_0);

							}
							break;
						case 6 :
							// Forrest.g:100:73: NOTEQUALS ^
							{
							NOTEQUALS38=(Token)match(input,NOTEQUALS,FOLLOW_NOTEQUALS_in_expr_comp879); 
							NOTEQUALS38_tree = (Object)adaptor.create(NOTEQUALS38);
							root_0 = (Object)adaptor.becomeRoot(NOTEQUALS38_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_expr_add_in_expr_comp884);
					expr_add39=expr_add();
					state._fsp--;

					adaptor.addChild(root_0, expr_add39.getTree());

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
	// $ANTLR end "expr_comp"


	public static class expr_add_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr_add"
	// Forrest.g:103:1: expr_add : expr_mult ( ( PLUS ^| MINUS ^) expr_mult )* ;
	public final ForrestParser.expr_add_return expr_add() throws RecognitionException {
		ForrestParser.expr_add_return retval = new ForrestParser.expr_add_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PLUS41=null;
		Token MINUS42=null;
		ParserRuleReturnScope expr_mult40 =null;
		ParserRuleReturnScope expr_mult43 =null;

		Object PLUS41_tree=null;
		Object MINUS42_tree=null;

		try {
			// Forrest.g:104:2: ( expr_mult ( ( PLUS ^| MINUS ^) expr_mult )* )
			// Forrest.g:104:4: expr_mult ( ( PLUS ^| MINUS ^) expr_mult )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr_mult_in_expr_add898);
			expr_mult40=expr_mult();
			state._fsp--;

			adaptor.addChild(root_0, expr_mult40.getTree());

			// Forrest.g:104:14: ( ( PLUS ^| MINUS ^) expr_mult )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==MINUS||LA12_0==PLUS) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// Forrest.g:104:15: ( PLUS ^| MINUS ^) expr_mult
					{
					// Forrest.g:104:15: ( PLUS ^| MINUS ^)
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
							// Forrest.g:104:16: PLUS ^
							{
							PLUS41=(Token)match(input,PLUS,FOLLOW_PLUS_in_expr_add902); 
							PLUS41_tree = (Object)adaptor.create(PLUS41);
							root_0 = (Object)adaptor.becomeRoot(PLUS41_tree, root_0);

							}
							break;
						case 2 :
							// Forrest.g:104:24: MINUS ^
							{
							MINUS42=(Token)match(input,MINUS,FOLLOW_MINUS_in_expr_add907); 
							MINUS42_tree = (Object)adaptor.create(MINUS42);
							root_0 = (Object)adaptor.becomeRoot(MINUS42_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_expr_mult_in_expr_add911);
					expr_mult43=expr_mult();
					state._fsp--;

					adaptor.addChild(root_0, expr_mult43.getTree());

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
	// $ANTLR end "expr_add"


	public static class expr_mult_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr_mult"
	// Forrest.g:107:1: expr_mult : expr_unary ( ( TIMES ^| DIVIDE ^| MODULO ^) expr_unary )* ;
	public final ForrestParser.expr_mult_return expr_mult() throws RecognitionException {
		ForrestParser.expr_mult_return retval = new ForrestParser.expr_mult_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TIMES45=null;
		Token DIVIDE46=null;
		Token MODULO47=null;
		ParserRuleReturnScope expr_unary44 =null;
		ParserRuleReturnScope expr_unary48 =null;

		Object TIMES45_tree=null;
		Object DIVIDE46_tree=null;
		Object MODULO47_tree=null;

		try {
			// Forrest.g:108:2: ( expr_unary ( ( TIMES ^| DIVIDE ^| MODULO ^) expr_unary )* )
			// Forrest.g:108:4: expr_unary ( ( TIMES ^| DIVIDE ^| MODULO ^) expr_unary )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr_unary_in_expr_mult924);
			expr_unary44=expr_unary();
			state._fsp--;

			adaptor.addChild(root_0, expr_unary44.getTree());

			// Forrest.g:108:15: ( ( TIMES ^| DIVIDE ^| MODULO ^) expr_unary )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==DIVIDE||LA14_0==MODULO||LA14_0==TIMES) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// Forrest.g:108:16: ( TIMES ^| DIVIDE ^| MODULO ^) expr_unary
					{
					// Forrest.g:108:16: ( TIMES ^| DIVIDE ^| MODULO ^)
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
							// Forrest.g:108:17: TIMES ^
							{
							TIMES45=(Token)match(input,TIMES,FOLLOW_TIMES_in_expr_mult928); 
							TIMES45_tree = (Object)adaptor.create(TIMES45);
							root_0 = (Object)adaptor.becomeRoot(TIMES45_tree, root_0);

							}
							break;
						case 2 :
							// Forrest.g:108:26: DIVIDE ^
							{
							DIVIDE46=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_expr_mult933); 
							DIVIDE46_tree = (Object)adaptor.create(DIVIDE46);
							root_0 = (Object)adaptor.becomeRoot(DIVIDE46_tree, root_0);

							}
							break;
						case 3 :
							// Forrest.g:108:36: MODULO ^
							{
							MODULO47=(Token)match(input,MODULO,FOLLOW_MODULO_in_expr_mult938); 
							MODULO47_tree = (Object)adaptor.create(MODULO47);
							root_0 = (Object)adaptor.becomeRoot(MODULO47_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_expr_unary_in_expr_mult942);
					expr_unary48=expr_unary();
					state._fsp--;

					adaptor.addChild(root_0, expr_unary48.getTree());

					}
					break;

				default :
					break loop14;
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
	// $ANTLR end "expr_mult"


	public static class expr_unary_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr_unary"
	// Forrest.g:111:1: expr_unary : ( ( NOT ^)? expr_compound | PLUS expr_compound -> ^( POSITIVE expr_compound ) | MINUS expr_compound -> ^( NEGATIVE expr_compound ) );
	public final ForrestParser.expr_unary_return expr_unary() throws RecognitionException {
		ForrestParser.expr_unary_return retval = new ForrestParser.expr_unary_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NOT49=null;
		Token PLUS51=null;
		Token MINUS53=null;
		ParserRuleReturnScope expr_compound50 =null;
		ParserRuleReturnScope expr_compound52 =null;
		ParserRuleReturnScope expr_compound54 =null;

		Object NOT49_tree=null;
		Object PLUS51_tree=null;
		Object MINUS53_tree=null;
		RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
		RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
		RewriteRuleSubtreeStream stream_expr_compound=new RewriteRuleSubtreeStream(adaptor,"rule expr_compound");

		try {
			// Forrest.g:112:2: ( ( NOT ^)? expr_compound | PLUS expr_compound -> ^( POSITIVE expr_compound ) | MINUS expr_compound -> ^( NEGATIVE expr_compound ) )
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
					// Forrest.g:112:4: ( NOT ^)? expr_compound
					{
					root_0 = (Object)adaptor.nil();


					// Forrest.g:112:4: ( NOT ^)?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==NOT) ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// Forrest.g:112:5: NOT ^
							{
							NOT49=(Token)match(input,NOT,FOLLOW_NOT_in_expr_unary957); 
							NOT49_tree = (Object)adaptor.create(NOT49);
							root_0 = (Object)adaptor.becomeRoot(NOT49_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_expr_compound_in_expr_unary962);
					expr_compound50=expr_compound();
					state._fsp--;

					adaptor.addChild(root_0, expr_compound50.getTree());

					}
					break;
				case 2 :
					// Forrest.g:113:4: PLUS expr_compound
					{
					PLUS51=(Token)match(input,PLUS,FOLLOW_PLUS_in_expr_unary967);  
					stream_PLUS.add(PLUS51);

					pushFollow(FOLLOW_expr_compound_in_expr_unary969);
					expr_compound52=expr_compound();
					state._fsp--;

					stream_expr_compound.add(expr_compound52.getTree());
					// AST REWRITE
					// elements: expr_compound
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 114:4: -> ^( POSITIVE expr_compound )
					{
						// Forrest.g:114:7: ^( POSITIVE expr_compound )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(POSITIVE, "POSITIVE"), root_1);
						adaptor.addChild(root_1, stream_expr_compound.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// Forrest.g:115:4: MINUS expr_compound
					{
					MINUS53=(Token)match(input,MINUS,FOLLOW_MINUS_in_expr_unary985);  
					stream_MINUS.add(MINUS53);

					pushFollow(FOLLOW_expr_compound_in_expr_unary987);
					expr_compound54=expr_compound();
					state._fsp--;

					stream_expr_compound.add(expr_compound54.getTree());
					// AST REWRITE
					// elements: expr_compound
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 116:4: -> ^( NEGATIVE expr_compound )
					{
						// Forrest.g:116:7: ^( NEGATIVE expr_compound )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NEGATIVE, "NEGATIVE"), root_1);
						adaptor.addChild(root_1, stream_expr_compound.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

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
	// $ANTLR end "expr_unary"


	public static class expr_compound_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr_compound"
	// Forrest.g:119:1: expr_compound : ( LCURLY program_lines RCURLY -> ^( COMPOUND program_lines ) | IDENTIFIER | NUMBER | LPAREN ! expr RPAREN !| read | print );
	public final ForrestParser.expr_compound_return expr_compound() throws RecognitionException {
		ForrestParser.expr_compound_return retval = new ForrestParser.expr_compound_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LCURLY55=null;
		Token RCURLY57=null;
		Token IDENTIFIER58=null;
		Token NUMBER59=null;
		Token LPAREN60=null;
		Token RPAREN62=null;
		ParserRuleReturnScope program_lines56 =null;
		ParserRuleReturnScope expr61 =null;
		ParserRuleReturnScope read63 =null;
		ParserRuleReturnScope print64 =null;

		Object LCURLY55_tree=null;
		Object RCURLY57_tree=null;
		Object IDENTIFIER58_tree=null;
		Object NUMBER59_tree=null;
		Object LPAREN60_tree=null;
		Object RPAREN62_tree=null;
		RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
		RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
		RewriteRuleSubtreeStream stream_program_lines=new RewriteRuleSubtreeStream(adaptor,"rule program_lines");

		try {
			// Forrest.g:120:2: ( LCURLY program_lines RCURLY -> ^( COMPOUND program_lines ) | IDENTIFIER | NUMBER | LPAREN ! expr RPAREN !| read | print )
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
					// Forrest.g:120:4: LCURLY program_lines RCURLY
					{
					LCURLY55=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_expr_compound1010);  
					stream_LCURLY.add(LCURLY55);

					pushFollow(FOLLOW_program_lines_in_expr_compound1012);
					program_lines56=program_lines();
					state._fsp--;

					stream_program_lines.add(program_lines56.getTree());
					RCURLY57=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_expr_compound1014);  
					stream_RCURLY.add(RCURLY57);

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
					// 121:4: -> ^( COMPOUND program_lines )
					{
						// Forrest.g:121:8: ^( COMPOUND program_lines )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMPOUND, "COMPOUND"), root_1);
						adaptor.addChild(root_1, stream_program_lines.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// Forrest.g:122:4: IDENTIFIER
					{
					root_0 = (Object)adaptor.nil();


					IDENTIFIER58=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expr_compound1032); 
					IDENTIFIER58_tree = (Object)adaptor.create(IDENTIFIER58);
					adaptor.addChild(root_0, IDENTIFIER58_tree);

					}
					break;
				case 3 :
					// Forrest.g:123:4: NUMBER
					{
					root_0 = (Object)adaptor.nil();


					NUMBER59=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_expr_compound1037); 
					NUMBER59_tree = (Object)adaptor.create(NUMBER59);
					adaptor.addChild(root_0, NUMBER59_tree);

					}
					break;
				case 4 :
					// Forrest.g:124:4: LPAREN ! expr RPAREN !
					{
					root_0 = (Object)adaptor.nil();


					LPAREN60=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_expr_compound1042); 
					pushFollow(FOLLOW_expr_in_expr_compound1045);
					expr61=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr61.getTree());

					RPAREN62=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_expr_compound1047); 
					}
					break;
				case 5 :
					// Forrest.g:125:5: read
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_read_in_expr_compound1054);
					read63=read();
					state._fsp--;

					adaptor.addChild(root_0, read63.getTree());

					}
					break;
				case 6 :
					// Forrest.g:126:4: print
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_print_in_expr_compound1059);
					print64=print();
					state._fsp--;

					adaptor.addChild(root_0, print64.getTree());

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
	// $ANTLR end "expr_compound"


	public static class read_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "read"
	// Forrest.g:129:1: read : READ ^ LPAREN ! IDENTIFIER ( COMMA ! IDENTIFIER )* RPAREN !;
	public final ForrestParser.read_return read() throws RecognitionException {
		ForrestParser.read_return retval = new ForrestParser.read_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token READ65=null;
		Token LPAREN66=null;
		Token IDENTIFIER67=null;
		Token COMMA68=null;
		Token IDENTIFIER69=null;
		Token RPAREN70=null;

		Object READ65_tree=null;
		Object LPAREN66_tree=null;
		Object IDENTIFIER67_tree=null;
		Object COMMA68_tree=null;
		Object IDENTIFIER69_tree=null;
		Object RPAREN70_tree=null;

		try {
			// Forrest.g:130:2: ( READ ^ LPAREN ! IDENTIFIER ( COMMA ! IDENTIFIER )* RPAREN !)
			// Forrest.g:130:4: READ ^ LPAREN ! IDENTIFIER ( COMMA ! IDENTIFIER )* RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			READ65=(Token)match(input,READ,FOLLOW_READ_in_read1071); 
			READ65_tree = (Object)adaptor.create(READ65);
			root_0 = (Object)adaptor.becomeRoot(READ65_tree, root_0);

			LPAREN66=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_read1074); 
			IDENTIFIER67=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_read1077); 
			IDENTIFIER67_tree = (Object)adaptor.create(IDENTIFIER67);
			adaptor.addChild(root_0, IDENTIFIER67_tree);

			// Forrest.g:130:29: ( COMMA ! IDENTIFIER )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==COMMA) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// Forrest.g:130:30: COMMA ! IDENTIFIER
					{
					COMMA68=(Token)match(input,COMMA,FOLLOW_COMMA_in_read1080); 
					IDENTIFIER69=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_read1083); 
					IDENTIFIER69_tree = (Object)adaptor.create(IDENTIFIER69);
					adaptor.addChild(root_0, IDENTIFIER69_tree);

					}
					break;

				default :
					break loop18;
				}
			}

			RPAREN70=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_read1087); 
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
	// $ANTLR end "read"


	public static class print_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "print"
	// Forrest.g:133:1: print : PRINT ^ LPAREN ! expr ( COMMA ! expr )* RPAREN !;
	public final ForrestParser.print_return print() throws RecognitionException {
		ForrestParser.print_return retval = new ForrestParser.print_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PRINT71=null;
		Token LPAREN72=null;
		Token COMMA74=null;
		Token RPAREN76=null;
		ParserRuleReturnScope expr73 =null;
		ParserRuleReturnScope expr75 =null;

		Object PRINT71_tree=null;
		Object LPAREN72_tree=null;
		Object COMMA74_tree=null;
		Object RPAREN76_tree=null;

		try {
			// Forrest.g:134:2: ( PRINT ^ LPAREN ! expr ( COMMA ! expr )* RPAREN !)
			// Forrest.g:134:4: PRINT ^ LPAREN ! expr ( COMMA ! expr )* RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			PRINT71=(Token)match(input,PRINT,FOLLOW_PRINT_in_print1099); 
			PRINT71_tree = (Object)adaptor.create(PRINT71);
			root_0 = (Object)adaptor.becomeRoot(PRINT71_tree, root_0);

			LPAREN72=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_print1102); 
			pushFollow(FOLLOW_expr_in_print1105);
			expr73=expr();
			state._fsp--;

			adaptor.addChild(root_0, expr73.getTree());

			// Forrest.g:134:24: ( COMMA ! expr )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==COMMA) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// Forrest.g:134:25: COMMA ! expr
					{
					COMMA74=(Token)match(input,COMMA,FOLLOW_COMMA_in_print1108); 
					pushFollow(FOLLOW_expr_in_print1111);
					expr75=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr75.getTree());

					}
					break;

				default :
					break loop19;
				}
			}

			RPAREN76=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_print1115); 
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
	// $ANTLR end "print"

	// Delegated rules



	public static final BitSet FOLLOW_program_lines_in_forrest634 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_forrest636 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_program_lines677 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_program_lines679 = new BitSet(new long[]{0x0000404B4C2C0400L});
	public static final BitSet FOLLOW_expr_in_program_lines685 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_program_lines687 = new BitSet(new long[]{0x0000404B4C2C0402L});
	public static final BitSet FOLLOW_VAR_in_declaration703 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration706 = new BitSet(new long[]{0x0000000000100060L});
	public static final BitSet FOLLOW_set_in_declaration708 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONSTANT_in_declaration723 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration726 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_BECOMES_in_declaration728 = new BitSet(new long[]{0x0000004B4C2C0000L});
	public static final BitSet FOLLOW_expr_in_declaration731 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_assign_in_expr743 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_if_in_expr_assign755 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_BECOMES_in_expr_assign758 = new BitSet(new long[]{0x0000004B4C2C0000L});
	public static final BitSet FOLLOW_expr_if_in_expr_assign761 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_IF_in_expr_if775 = new BitSet(new long[]{0x0000004B4C2C0000L});
	public static final BitSet FOLLOW_expr_if_in_expr_if778 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_THEN_in_expr_if780 = new BitSet(new long[]{0x0000004B4C2C0000L});
	public static final BitSet FOLLOW_expr_if_in_expr_if783 = new BitSet(new long[]{0x0000000000006000L});
	public static final BitSet FOLLOW_ELSE_in_expr_if786 = new BitSet(new long[]{0x0000004B4C2C0000L});
	public static final BitSet FOLLOW_expr_if_in_expr_if789 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_ENDIF_in_expr_if793 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_or_in_expr_if798 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_and_in_expr_or810 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_LOGOR_in_expr_or813 = new BitSet(new long[]{0x0000004B4C240000L});
	public static final BitSet FOLLOW_expr_and_in_expr_or816 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_expr_comp_in_expr_and830 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_LOGAND_in_expr_and833 = new BitSet(new long[]{0x0000004B4C240000L});
	public static final BitSet FOLLOW_expr_comp_in_expr_and836 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_expr_add_in_expr_comp850 = new BitSet(new long[]{0x0000060080038002L});
	public static final BitSet FOLLOW_GREATER_in_expr_comp854 = new BitSet(new long[]{0x0000004B4C240000L});
	public static final BitSet FOLLOW_SMALLER_in_expr_comp859 = new BitSet(new long[]{0x0000004B4C240000L});
	public static final BitSet FOLLOW_GREATEREQ_in_expr_comp864 = new BitSet(new long[]{0x0000004B4C240000L});
	public static final BitSet FOLLOW_SMALLEREQ_in_expr_comp869 = new BitSet(new long[]{0x0000004B4C240000L});
	public static final BitSet FOLLOW_EQUALS_in_expr_comp874 = new BitSet(new long[]{0x0000004B4C240000L});
	public static final BitSet FOLLOW_NOTEQUALS_in_expr_comp879 = new BitSet(new long[]{0x0000004B4C240000L});
	public static final BitSet FOLLOW_expr_add_in_expr_comp884 = new BitSet(new long[]{0x0000060080038002L});
	public static final BitSet FOLLOW_expr_mult_in_expr_add898 = new BitSet(new long[]{0x0000000208000002L});
	public static final BitSet FOLLOW_PLUS_in_expr_add902 = new BitSet(new long[]{0x0000004B4C240000L});
	public static final BitSet FOLLOW_MINUS_in_expr_add907 = new BitSet(new long[]{0x0000004B4C240000L});
	public static final BitSet FOLLOW_expr_mult_in_expr_add911 = new BitSet(new long[]{0x0000000208000002L});
	public static final BitSet FOLLOW_expr_unary_in_expr_mult924 = new BitSet(new long[]{0x0000100010001002L});
	public static final BitSet FOLLOW_TIMES_in_expr_mult928 = new BitSet(new long[]{0x0000004B4C240000L});
	public static final BitSet FOLLOW_DIVIDE_in_expr_mult933 = new BitSet(new long[]{0x0000004B4C240000L});
	public static final BitSet FOLLOW_MODULO_in_expr_mult938 = new BitSet(new long[]{0x0000004B4C240000L});
	public static final BitSet FOLLOW_expr_unary_in_expr_mult942 = new BitSet(new long[]{0x0000100010001002L});
	public static final BitSet FOLLOW_NOT_in_expr_unary957 = new BitSet(new long[]{0x0000004904240000L});
	public static final BitSet FOLLOW_expr_compound_in_expr_unary962 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_expr_unary967 = new BitSet(new long[]{0x0000004904240000L});
	public static final BitSet FOLLOW_expr_compound_in_expr_unary969 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_expr_unary985 = new BitSet(new long[]{0x0000004904240000L});
	public static final BitSet FOLLOW_expr_compound_in_expr_unary987 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCURLY_in_expr_compound1010 = new BitSet(new long[]{0x0000406B4C2C0400L});
	public static final BitSet FOLLOW_program_lines_in_expr_compound1012 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RCURLY_in_expr_compound1014 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_expr_compound1032 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_expr_compound1037 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_expr_compound1042 = new BitSet(new long[]{0x0000004B4C2C0000L});
	public static final BitSet FOLLOW_expr_in_expr_compound1045 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_RPAREN_in_expr_compound1047 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_in_expr_compound1054 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_in_expr_compound1059 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_read1071 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_read1074 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_read1077 = new BitSet(new long[]{0x0000008000000080L});
	public static final BitSet FOLLOW_COMMA_in_read1080 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_read1083 = new BitSet(new long[]{0x0000008000000080L});
	public static final BitSet FOLLOW_RPAREN_in_read1087 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_print1099 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_print1102 = new BitSet(new long[]{0x0000004B4C2C0000L});
	public static final BitSet FOLLOW_expr_in_print1105 = new BitSet(new long[]{0x0000008000000080L});
	public static final BitSet FOLLOW_COMMA_in_print1108 = new BitSet(new long[]{0x0000004B4C2C0000L});
	public static final BitSet FOLLOW_expr_in_print1111 = new BitSet(new long[]{0x0000008000000080L});
	public static final BitSet FOLLOW_RPAREN_in_print1115 = new BitSet(new long[]{0x0000000000000002L});
}
