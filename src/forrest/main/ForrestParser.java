// $ANTLR 3.5 ../forrest/main/Forrest.g 2013-06-06 16:28:24

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
		"LETTER", "LOGAND", "LOGOR", "LOWER", "LPAREN", "MINUS", "MODULO", "NOT", 
		"NOTEQUALS", "NUMBER", "PLUS", "PRINT", "PROGRAM", "RCURLY", "READ", "RPAREN", 
		"SEMICOLON", "SMALLER", "SMALLEREQ", "THEN", "TIMES", "UPPER", "VAR", 
		"WS"
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
	public static final int NOT=29;
	public static final int NOTEQUALS=30;
	public static final int NUMBER=31;
	public static final int PLUS=32;
	public static final int PRINT=33;
	public static final int PROGRAM=34;
	public static final int RCURLY=35;
	public static final int READ=36;
	public static final int RPAREN=37;
	public static final int SEMICOLON=38;
	public static final int SMALLER=39;
	public static final int SMALLEREQ=40;
	public static final int THEN=41;
	public static final int TIMES=42;
	public static final int UPPER=43;
	public static final int VAR=44;
	public static final int WS=45;

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
	@Override public String getGrammarFileName() { return "../forrest/main/Forrest.g"; }


	public static class forrest_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "forrest"
	// ../forrest/main/Forrest.g:62:1: forrest : program_lines EOF -> ^( PROGRAM program_lines ) ;
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
			// ../forrest/main/Forrest.g:63:2: ( program_lines EOF -> ^( PROGRAM program_lines ) )
			// ../forrest/main/Forrest.g:63:6: program_lines EOF
			{
			pushFollow(FOLLOW_program_lines_in_forrest610);
			program_lines1=program_lines();
			state._fsp--;

			stream_program_lines.add(program_lines1.getTree());
			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_forrest612);  
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
			// 64:13: -> ^( PROGRAM program_lines )
			{
				// ../forrest/main/Forrest.g:64:17: ^( PROGRAM program_lines )
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
	// ../forrest/main/Forrest.g:67:1: program_lines : ( ( declaration SEMICOLON !)* ( expr SEMICOLON !) )* ;
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
			// ../forrest/main/Forrest.g:68:2: ( ( ( declaration SEMICOLON !)* ( expr SEMICOLON !) )* )
			// ../forrest/main/Forrest.g:68:4: ( ( declaration SEMICOLON !)* ( expr SEMICOLON !) )*
			{
			root_0 = (Object)adaptor.nil();


			// ../forrest/main/Forrest.g:68:4: ( ( declaration SEMICOLON !)* ( expr SEMICOLON !) )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==CONSTANT||(LA2_0 >= IDENTIFIER && LA2_0 <= IF)||LA2_0==LCURLY||(LA2_0 >= LPAREN && LA2_0 <= MINUS)||LA2_0==NOT||(LA2_0 >= NUMBER && LA2_0 <= PRINT)||LA2_0==READ||LA2_0==VAR) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// ../forrest/main/Forrest.g:68:5: ( declaration SEMICOLON !)* ( expr SEMICOLON !)
					{
					// ../forrest/main/Forrest.g:68:5: ( declaration SEMICOLON !)*
					loop1:
					while (true) {
						int alt1=2;
						int LA1_0 = input.LA(1);
						if ( (LA1_0==CONSTANT||LA1_0==VAR) ) {
							alt1=1;
						}

						switch (alt1) {
						case 1 :
							// ../forrest/main/Forrest.g:68:6: declaration SEMICOLON !
							{
							pushFollow(FOLLOW_declaration_in_program_lines653);
							declaration3=declaration();
							state._fsp--;

							adaptor.addChild(root_0, declaration3.getTree());

							SEMICOLON4=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_program_lines655); 
							}
							break;

						default :
							break loop1;
						}
					}

					// ../forrest/main/Forrest.g:68:31: ( expr SEMICOLON !)
					// ../forrest/main/Forrest.g:68:32: expr SEMICOLON !
					{
					pushFollow(FOLLOW_expr_in_program_lines661);
					expr5=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr5.getTree());

					SEMICOLON6=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_program_lines663); 
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
	// ../forrest/main/Forrest.g:71:1: declaration : ( VAR ^ IDENTIFIER ( CHAR | BOOL | INT ) | CONSTANT ^ IDENTIFIER BECOMES ! expr );
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
			// ../forrest/main/Forrest.g:72:2: ( VAR ^ IDENTIFIER ( CHAR | BOOL | INT ) | CONSTANT ^ IDENTIFIER BECOMES ! expr )
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
					// ../forrest/main/Forrest.g:72:4: VAR ^ IDENTIFIER ( CHAR | BOOL | INT )
					{
					root_0 = (Object)adaptor.nil();


					VAR7=(Token)match(input,VAR,FOLLOW_VAR_in_declaration679); 
					VAR7_tree = (Object)adaptor.create(VAR7);
					root_0 = (Object)adaptor.becomeRoot(VAR7_tree, root_0);

					IDENTIFIER8=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration682); 
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
					// ../forrest/main/Forrest.g:73:4: CONSTANT ^ IDENTIFIER BECOMES ! expr
					{
					root_0 = (Object)adaptor.nil();


					CONSTANT10=(Token)match(input,CONSTANT,FOLLOW_CONSTANT_in_declaration699); 
					CONSTANT10_tree = (Object)adaptor.create(CONSTANT10);
					root_0 = (Object)adaptor.becomeRoot(CONSTANT10_tree, root_0);

					IDENTIFIER11=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration702); 
					IDENTIFIER11_tree = (Object)adaptor.create(IDENTIFIER11);
					adaptor.addChild(root_0, IDENTIFIER11_tree);

					BECOMES12=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_declaration704); 
					pushFollow(FOLLOW_expr_in_declaration707);
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
	// ../forrest/main/Forrest.g:76:1: expr : expr_assign ;
	public final ForrestParser.expr_return expr() throws RecognitionException {
		ForrestParser.expr_return retval = new ForrestParser.expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expr_assign14 =null;


		try {
			// ../forrest/main/Forrest.g:77:2: ( expr_assign )
			// ../forrest/main/Forrest.g:77:5: expr_assign
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr_assign_in_expr719);
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
	// ../forrest/main/Forrest.g:80:1: expr_assign : expr_if ( BECOMES ^ expr_if )* ;
	public final ForrestParser.expr_assign_return expr_assign() throws RecognitionException {
		ForrestParser.expr_assign_return retval = new ForrestParser.expr_assign_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token BECOMES16=null;
		ParserRuleReturnScope expr_if15 =null;
		ParserRuleReturnScope expr_if17 =null;

		Object BECOMES16_tree=null;

		try {
			// ../forrest/main/Forrest.g:81:2: ( expr_if ( BECOMES ^ expr_if )* )
			// ../forrest/main/Forrest.g:81:4: expr_if ( BECOMES ^ expr_if )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr_if_in_expr_assign731);
			expr_if15=expr_if();
			state._fsp--;

			adaptor.addChild(root_0, expr_if15.getTree());

			// ../forrest/main/Forrest.g:81:12: ( BECOMES ^ expr_if )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==BECOMES) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// ../forrest/main/Forrest.g:81:13: BECOMES ^ expr_if
					{
					BECOMES16=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_expr_assign734); 
					BECOMES16_tree = (Object)adaptor.create(BECOMES16);
					root_0 = (Object)adaptor.becomeRoot(BECOMES16_tree, root_0);

					pushFollow(FOLLOW_expr_if_in_expr_assign737);
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
	// ../forrest/main/Forrest.g:84:1: expr_if : ( IF ^ expr_if THEN ! expr_if ( ELSE ! expr_if )? ENDIF | expr_or );
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
			// ../forrest/main/Forrest.g:85:2: ( IF ^ expr_if THEN ! expr_if ( ELSE ! expr_if )? ENDIF | expr_or )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==IF) ) {
				alt6=1;
			}
			else if ( (LA6_0==IDENTIFIER||LA6_0==LCURLY||(LA6_0 >= LPAREN && LA6_0 <= MINUS)||LA6_0==NOT||(LA6_0 >= NUMBER && LA6_0 <= PRINT)||LA6_0==READ) ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// ../forrest/main/Forrest.g:85:4: IF ^ expr_if THEN ! expr_if ( ELSE ! expr_if )? ENDIF
					{
					root_0 = (Object)adaptor.nil();


					IF18=(Token)match(input,IF,FOLLOW_IF_in_expr_if751); 
					IF18_tree = (Object)adaptor.create(IF18);
					root_0 = (Object)adaptor.becomeRoot(IF18_tree, root_0);

					pushFollow(FOLLOW_expr_if_in_expr_if754);
					expr_if19=expr_if();
					state._fsp--;

					adaptor.addChild(root_0, expr_if19.getTree());

					THEN20=(Token)match(input,THEN,FOLLOW_THEN_in_expr_if756); 
					pushFollow(FOLLOW_expr_if_in_expr_if759);
					expr_if21=expr_if();
					state._fsp--;

					adaptor.addChild(root_0, expr_if21.getTree());

					// ../forrest/main/Forrest.g:85:30: ( ELSE ! expr_if )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==ELSE) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// ../forrest/main/Forrest.g:85:31: ELSE ! expr_if
							{
							ELSE22=(Token)match(input,ELSE,FOLLOW_ELSE_in_expr_if762); 
							pushFollow(FOLLOW_expr_if_in_expr_if765);
							expr_if23=expr_if();
							state._fsp--;

							adaptor.addChild(root_0, expr_if23.getTree());

							}
							break;

					}

					ENDIF24=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_expr_if769); 
					ENDIF24_tree = (Object)adaptor.create(ENDIF24);
					adaptor.addChild(root_0, ENDIF24_tree);

					}
					break;
				case 2 :
					// ../forrest/main/Forrest.g:86:4: expr_or
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expr_or_in_expr_if774);
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
	// ../forrest/main/Forrest.g:89:1: expr_or : expr_and ( LOGOR ^ expr_and )* ;
	public final ForrestParser.expr_or_return expr_or() throws RecognitionException {
		ForrestParser.expr_or_return retval = new ForrestParser.expr_or_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LOGOR27=null;
		ParserRuleReturnScope expr_and26 =null;
		ParserRuleReturnScope expr_and28 =null;

		Object LOGOR27_tree=null;

		try {
			// ../forrest/main/Forrest.g:90:2: ( expr_and ( LOGOR ^ expr_and )* )
			// ../forrest/main/Forrest.g:90:4: expr_and ( LOGOR ^ expr_and )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr_and_in_expr_or786);
			expr_and26=expr_and();
			state._fsp--;

			adaptor.addChild(root_0, expr_and26.getTree());

			// ../forrest/main/Forrest.g:90:13: ( LOGOR ^ expr_and )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==LOGOR) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// ../forrest/main/Forrest.g:90:14: LOGOR ^ expr_and
					{
					LOGOR27=(Token)match(input,LOGOR,FOLLOW_LOGOR_in_expr_or789); 
					LOGOR27_tree = (Object)adaptor.create(LOGOR27);
					root_0 = (Object)adaptor.becomeRoot(LOGOR27_tree, root_0);

					pushFollow(FOLLOW_expr_and_in_expr_or792);
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
	// ../forrest/main/Forrest.g:93:1: expr_and : expr_comp ( LOGAND ^ expr_comp )* ;
	public final ForrestParser.expr_and_return expr_and() throws RecognitionException {
		ForrestParser.expr_and_return retval = new ForrestParser.expr_and_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LOGAND30=null;
		ParserRuleReturnScope expr_comp29 =null;
		ParserRuleReturnScope expr_comp31 =null;

		Object LOGAND30_tree=null;

		try {
			// ../forrest/main/Forrest.g:94:2: ( expr_comp ( LOGAND ^ expr_comp )* )
			// ../forrest/main/Forrest.g:94:4: expr_comp ( LOGAND ^ expr_comp )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr_comp_in_expr_and806);
			expr_comp29=expr_comp();
			state._fsp--;

			adaptor.addChild(root_0, expr_comp29.getTree());

			// ../forrest/main/Forrest.g:94:14: ( LOGAND ^ expr_comp )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==LOGAND) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// ../forrest/main/Forrest.g:94:15: LOGAND ^ expr_comp
					{
					LOGAND30=(Token)match(input,LOGAND,FOLLOW_LOGAND_in_expr_and809); 
					LOGAND30_tree = (Object)adaptor.create(LOGAND30);
					root_0 = (Object)adaptor.becomeRoot(LOGAND30_tree, root_0);

					pushFollow(FOLLOW_expr_comp_in_expr_and812);
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
	// ../forrest/main/Forrest.g:97:1: expr_comp : expr_add ( ( GREATER ^| SMALLER ^| GREATEREQ ^| SMALLEREQ ^| EQUALS ^| NOTEQUALS ^) expr_add )* ;
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
			// ../forrest/main/Forrest.g:98:2: ( expr_add ( ( GREATER ^| SMALLER ^| GREATEREQ ^| SMALLEREQ ^| EQUALS ^| NOTEQUALS ^) expr_add )* )
			// ../forrest/main/Forrest.g:98:4: expr_add ( ( GREATER ^| SMALLER ^| GREATEREQ ^| SMALLEREQ ^| EQUALS ^| NOTEQUALS ^) expr_add )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr_add_in_expr_comp826);
			expr_add32=expr_add();
			state._fsp--;

			adaptor.addChild(root_0, expr_add32.getTree());

			// ../forrest/main/Forrest.g:98:13: ( ( GREATER ^| SMALLER ^| GREATEREQ ^| SMALLEREQ ^| EQUALS ^| NOTEQUALS ^) expr_add )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( ((LA10_0 >= EQUALS && LA10_0 <= GREATEREQ)||LA10_0==NOTEQUALS||(LA10_0 >= SMALLER && LA10_0 <= SMALLEREQ)) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// ../forrest/main/Forrest.g:98:14: ( GREATER ^| SMALLER ^| GREATEREQ ^| SMALLEREQ ^| EQUALS ^| NOTEQUALS ^) expr_add
					{
					// ../forrest/main/Forrest.g:98:14: ( GREATER ^| SMALLER ^| GREATEREQ ^| SMALLEREQ ^| EQUALS ^| NOTEQUALS ^)
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
							// ../forrest/main/Forrest.g:98:15: GREATER ^
							{
							GREATER33=(Token)match(input,GREATER,FOLLOW_GREATER_in_expr_comp830); 
							GREATER33_tree = (Object)adaptor.create(GREATER33);
							root_0 = (Object)adaptor.becomeRoot(GREATER33_tree, root_0);

							}
							break;
						case 2 :
							// ../forrest/main/Forrest.g:98:26: SMALLER ^
							{
							SMALLER34=(Token)match(input,SMALLER,FOLLOW_SMALLER_in_expr_comp835); 
							SMALLER34_tree = (Object)adaptor.create(SMALLER34);
							root_0 = (Object)adaptor.becomeRoot(SMALLER34_tree, root_0);

							}
							break;
						case 3 :
							// ../forrest/main/Forrest.g:98:37: GREATEREQ ^
							{
							GREATEREQ35=(Token)match(input,GREATEREQ,FOLLOW_GREATEREQ_in_expr_comp840); 
							GREATEREQ35_tree = (Object)adaptor.create(GREATEREQ35);
							root_0 = (Object)adaptor.becomeRoot(GREATEREQ35_tree, root_0);

							}
							break;
						case 4 :
							// ../forrest/main/Forrest.g:98:50: SMALLEREQ ^
							{
							SMALLEREQ36=(Token)match(input,SMALLEREQ,FOLLOW_SMALLEREQ_in_expr_comp845); 
							SMALLEREQ36_tree = (Object)adaptor.create(SMALLEREQ36);
							root_0 = (Object)adaptor.becomeRoot(SMALLEREQ36_tree, root_0);

							}
							break;
						case 5 :
							// ../forrest/main/Forrest.g:98:63: EQUALS ^
							{
							EQUALS37=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_expr_comp850); 
							EQUALS37_tree = (Object)adaptor.create(EQUALS37);
							root_0 = (Object)adaptor.becomeRoot(EQUALS37_tree, root_0);

							}
							break;
						case 6 :
							// ../forrest/main/Forrest.g:98:73: NOTEQUALS ^
							{
							NOTEQUALS38=(Token)match(input,NOTEQUALS,FOLLOW_NOTEQUALS_in_expr_comp855); 
							NOTEQUALS38_tree = (Object)adaptor.create(NOTEQUALS38);
							root_0 = (Object)adaptor.becomeRoot(NOTEQUALS38_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_expr_add_in_expr_comp860);
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
	// ../forrest/main/Forrest.g:101:1: expr_add : expr_mult ( ( PLUS ^| MINUS ^) expr_mult )* ;
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
			// ../forrest/main/Forrest.g:102:2: ( expr_mult ( ( PLUS ^| MINUS ^) expr_mult )* )
			// ../forrest/main/Forrest.g:102:4: expr_mult ( ( PLUS ^| MINUS ^) expr_mult )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr_mult_in_expr_add874);
			expr_mult40=expr_mult();
			state._fsp--;

			adaptor.addChild(root_0, expr_mult40.getTree());

			// ../forrest/main/Forrest.g:102:14: ( ( PLUS ^| MINUS ^) expr_mult )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==MINUS||LA12_0==PLUS) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// ../forrest/main/Forrest.g:102:15: ( PLUS ^| MINUS ^) expr_mult
					{
					// ../forrest/main/Forrest.g:102:15: ( PLUS ^| MINUS ^)
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
							// ../forrest/main/Forrest.g:102:16: PLUS ^
							{
							PLUS41=(Token)match(input,PLUS,FOLLOW_PLUS_in_expr_add878); 
							PLUS41_tree = (Object)adaptor.create(PLUS41);
							root_0 = (Object)adaptor.becomeRoot(PLUS41_tree, root_0);

							}
							break;
						case 2 :
							// ../forrest/main/Forrest.g:102:24: MINUS ^
							{
							MINUS42=(Token)match(input,MINUS,FOLLOW_MINUS_in_expr_add883); 
							MINUS42_tree = (Object)adaptor.create(MINUS42);
							root_0 = (Object)adaptor.becomeRoot(MINUS42_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_expr_mult_in_expr_add887);
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
	// ../forrest/main/Forrest.g:105:1: expr_mult : expr_unary ( ( TIMES ^| DIVIDE ^| MODULO ^) expr_unary )* ;
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
			// ../forrest/main/Forrest.g:106:2: ( expr_unary ( ( TIMES ^| DIVIDE ^| MODULO ^) expr_unary )* )
			// ../forrest/main/Forrest.g:106:4: expr_unary ( ( TIMES ^| DIVIDE ^| MODULO ^) expr_unary )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr_unary_in_expr_mult900);
			expr_unary44=expr_unary();
			state._fsp--;

			adaptor.addChild(root_0, expr_unary44.getTree());

			// ../forrest/main/Forrest.g:106:15: ( ( TIMES ^| DIVIDE ^| MODULO ^) expr_unary )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==DIVIDE||LA14_0==MODULO||LA14_0==TIMES) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// ../forrest/main/Forrest.g:106:16: ( TIMES ^| DIVIDE ^| MODULO ^) expr_unary
					{
					// ../forrest/main/Forrest.g:106:16: ( TIMES ^| DIVIDE ^| MODULO ^)
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
							// ../forrest/main/Forrest.g:106:17: TIMES ^
							{
							TIMES45=(Token)match(input,TIMES,FOLLOW_TIMES_in_expr_mult904); 
							TIMES45_tree = (Object)adaptor.create(TIMES45);
							root_0 = (Object)adaptor.becomeRoot(TIMES45_tree, root_0);

							}
							break;
						case 2 :
							// ../forrest/main/Forrest.g:106:26: DIVIDE ^
							{
							DIVIDE46=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_expr_mult909); 
							DIVIDE46_tree = (Object)adaptor.create(DIVIDE46);
							root_0 = (Object)adaptor.becomeRoot(DIVIDE46_tree, root_0);

							}
							break;
						case 3 :
							// ../forrest/main/Forrest.g:106:36: MODULO ^
							{
							MODULO47=(Token)match(input,MODULO,FOLLOW_MODULO_in_expr_mult914); 
							MODULO47_tree = (Object)adaptor.create(MODULO47);
							root_0 = (Object)adaptor.becomeRoot(MODULO47_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_expr_unary_in_expr_mult918);
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
	// ../forrest/main/Forrest.g:109:1: expr_unary : ( MINUS ^| PLUS ^| NOT ^)? expr_compound ;
	public final ForrestParser.expr_unary_return expr_unary() throws RecognitionException {
		ForrestParser.expr_unary_return retval = new ForrestParser.expr_unary_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token MINUS49=null;
		Token PLUS50=null;
		Token NOT51=null;
		ParserRuleReturnScope expr_compound52 =null;

		Object MINUS49_tree=null;
		Object PLUS50_tree=null;
		Object NOT51_tree=null;

		try {
			// ../forrest/main/Forrest.g:110:2: ( ( MINUS ^| PLUS ^| NOT ^)? expr_compound )
			// ../forrest/main/Forrest.g:110:4: ( MINUS ^| PLUS ^| NOT ^)? expr_compound
			{
			root_0 = (Object)adaptor.nil();


			// ../forrest/main/Forrest.g:110:4: ( MINUS ^| PLUS ^| NOT ^)?
			int alt15=4;
			switch ( input.LA(1) ) {
				case MINUS:
					{
					alt15=1;
					}
					break;
				case PLUS:
					{
					alt15=2;
					}
					break;
				case NOT:
					{
					alt15=3;
					}
					break;
			}
			switch (alt15) {
				case 1 :
					// ../forrest/main/Forrest.g:110:5: MINUS ^
					{
					MINUS49=(Token)match(input,MINUS,FOLLOW_MINUS_in_expr_unary933); 
					MINUS49_tree = (Object)adaptor.create(MINUS49);
					root_0 = (Object)adaptor.becomeRoot(MINUS49_tree, root_0);

					}
					break;
				case 2 :
					// ../forrest/main/Forrest.g:110:14: PLUS ^
					{
					PLUS50=(Token)match(input,PLUS,FOLLOW_PLUS_in_expr_unary938); 
					PLUS50_tree = (Object)adaptor.create(PLUS50);
					root_0 = (Object)adaptor.becomeRoot(PLUS50_tree, root_0);

					}
					break;
				case 3 :
					// ../forrest/main/Forrest.g:110:22: NOT ^
					{
					NOT51=(Token)match(input,NOT,FOLLOW_NOT_in_expr_unary943); 
					NOT51_tree = (Object)adaptor.create(NOT51);
					root_0 = (Object)adaptor.becomeRoot(NOT51_tree, root_0);

					}
					break;

			}

			pushFollow(FOLLOW_expr_compound_in_expr_unary948);
			expr_compound52=expr_compound();
			state._fsp--;

			adaptor.addChild(root_0, expr_compound52.getTree());

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
	// ../forrest/main/Forrest.g:113:1: expr_compound : ( LCURLY program_lines RCURLY -> ^( COMPOUND program_lines ) | IDENTIFIER | NUMBER | LPAREN ! expr RPAREN !| READ ^ LPAREN ! IDENTIFIER ( COMMA ! IDENTIFIER )* RPAREN !| PRINT ^ LPAREN ! expr ( COMMA ! expr )* RPAREN !);
	public final ForrestParser.expr_compound_return expr_compound() throws RecognitionException {
		ForrestParser.expr_compound_return retval = new ForrestParser.expr_compound_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LCURLY53=null;
		Token RCURLY55=null;
		Token IDENTIFIER56=null;
		Token NUMBER57=null;
		Token LPAREN58=null;
		Token RPAREN60=null;
		Token READ61=null;
		Token LPAREN62=null;
		Token IDENTIFIER63=null;
		Token COMMA64=null;
		Token IDENTIFIER65=null;
		Token RPAREN66=null;
		Token PRINT67=null;
		Token LPAREN68=null;
		Token COMMA70=null;
		Token RPAREN72=null;
		ParserRuleReturnScope program_lines54 =null;
		ParserRuleReturnScope expr59 =null;
		ParserRuleReturnScope expr69 =null;
		ParserRuleReturnScope expr71 =null;

		Object LCURLY53_tree=null;
		Object RCURLY55_tree=null;
		Object IDENTIFIER56_tree=null;
		Object NUMBER57_tree=null;
		Object LPAREN58_tree=null;
		Object RPAREN60_tree=null;
		Object READ61_tree=null;
		Object LPAREN62_tree=null;
		Object IDENTIFIER63_tree=null;
		Object COMMA64_tree=null;
		Object IDENTIFIER65_tree=null;
		Object RPAREN66_tree=null;
		Object PRINT67_tree=null;
		Object LPAREN68_tree=null;
		Object COMMA70_tree=null;
		Object RPAREN72_tree=null;
		RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
		RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
		RewriteRuleSubtreeStream stream_program_lines=new RewriteRuleSubtreeStream(adaptor,"rule program_lines");

		try {
			// ../forrest/main/Forrest.g:114:2: ( LCURLY program_lines RCURLY -> ^( COMPOUND program_lines ) | IDENTIFIER | NUMBER | LPAREN ! expr RPAREN !| READ ^ LPAREN ! IDENTIFIER ( COMMA ! IDENTIFIER )* RPAREN !| PRINT ^ LPAREN ! expr ( COMMA ! expr )* RPAREN !)
			int alt18=6;
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
			case LPAREN:
				{
				alt18=4;
				}
				break;
			case READ:
				{
				alt18=5;
				}
				break;
			case PRINT:
				{
				alt18=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}
			switch (alt18) {
				case 1 :
					// ../forrest/main/Forrest.g:114:4: LCURLY program_lines RCURLY
					{
					LCURLY53=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_expr_compound960);  
					stream_LCURLY.add(LCURLY53);

					pushFollow(FOLLOW_program_lines_in_expr_compound962);
					program_lines54=program_lines();
					state._fsp--;

					stream_program_lines.add(program_lines54.getTree());
					RCURLY55=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_expr_compound964);  
					stream_RCURLY.add(RCURLY55);

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
					// 115:4: -> ^( COMPOUND program_lines )
					{
						// ../forrest/main/Forrest.g:115:8: ^( COMPOUND program_lines )
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
					// ../forrest/main/Forrest.g:116:4: IDENTIFIER
					{
					root_0 = (Object)adaptor.nil();


					IDENTIFIER56=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expr_compound982); 
					IDENTIFIER56_tree = (Object)adaptor.create(IDENTIFIER56);
					adaptor.addChild(root_0, IDENTIFIER56_tree);

					}
					break;
				case 3 :
					// ../forrest/main/Forrest.g:117:4: NUMBER
					{
					root_0 = (Object)adaptor.nil();


					NUMBER57=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_expr_compound987); 
					NUMBER57_tree = (Object)adaptor.create(NUMBER57);
					adaptor.addChild(root_0, NUMBER57_tree);

					}
					break;
				case 4 :
					// ../forrest/main/Forrest.g:118:4: LPAREN ! expr RPAREN !
					{
					root_0 = (Object)adaptor.nil();


					LPAREN58=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_expr_compound992); 
					pushFollow(FOLLOW_expr_in_expr_compound995);
					expr59=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr59.getTree());

					RPAREN60=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_expr_compound997); 
					}
					break;
				case 5 :
					// ../forrest/main/Forrest.g:119:5: READ ^ LPAREN ! IDENTIFIER ( COMMA ! IDENTIFIER )* RPAREN !
					{
					root_0 = (Object)adaptor.nil();


					READ61=(Token)match(input,READ,FOLLOW_READ_in_expr_compound1004); 
					READ61_tree = (Object)adaptor.create(READ61);
					root_0 = (Object)adaptor.becomeRoot(READ61_tree, root_0);

					LPAREN62=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_expr_compound1007); 
					IDENTIFIER63=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expr_compound1010); 
					IDENTIFIER63_tree = (Object)adaptor.create(IDENTIFIER63);
					adaptor.addChild(root_0, IDENTIFIER63_tree);

					// ../forrest/main/Forrest.g:119:30: ( COMMA ! IDENTIFIER )*
					loop16:
					while (true) {
						int alt16=2;
						int LA16_0 = input.LA(1);
						if ( (LA16_0==COMMA) ) {
							alt16=1;
						}

						switch (alt16) {
						case 1 :
							// ../forrest/main/Forrest.g:119:31: COMMA ! IDENTIFIER
							{
							COMMA64=(Token)match(input,COMMA,FOLLOW_COMMA_in_expr_compound1013); 
							IDENTIFIER65=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expr_compound1016); 
							IDENTIFIER65_tree = (Object)adaptor.create(IDENTIFIER65);
							adaptor.addChild(root_0, IDENTIFIER65_tree);

							}
							break;

						default :
							break loop16;
						}
					}

					RPAREN66=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_expr_compound1020); 
					}
					break;
				case 6 :
					// ../forrest/main/Forrest.g:120:4: PRINT ^ LPAREN ! expr ( COMMA ! expr )* RPAREN !
					{
					root_0 = (Object)adaptor.nil();


					PRINT67=(Token)match(input,PRINT,FOLLOW_PRINT_in_expr_compound1026); 
					PRINT67_tree = (Object)adaptor.create(PRINT67);
					root_0 = (Object)adaptor.becomeRoot(PRINT67_tree, root_0);

					LPAREN68=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_expr_compound1029); 
					pushFollow(FOLLOW_expr_in_expr_compound1032);
					expr69=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr69.getTree());

					// ../forrest/main/Forrest.g:120:24: ( COMMA ! expr )*
					loop17:
					while (true) {
						int alt17=2;
						int LA17_0 = input.LA(1);
						if ( (LA17_0==COMMA) ) {
							alt17=1;
						}

						switch (alt17) {
						case 1 :
							// ../forrest/main/Forrest.g:120:25: COMMA ! expr
							{
							COMMA70=(Token)match(input,COMMA,FOLLOW_COMMA_in_expr_compound1035); 
							pushFollow(FOLLOW_expr_in_expr_compound1038);
							expr71=expr();
							state._fsp--;

							adaptor.addChild(root_0, expr71.getTree());

							}
							break;

						default :
							break loop17;
						}
					}

					RPAREN72=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_expr_compound1042); 
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

	// Delegated rules



	public static final BitSet FOLLOW_program_lines_in_forrest610 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_forrest612 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_program_lines653 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_program_lines655 = new BitSet(new long[]{0x00001013AC2C0400L});
	public static final BitSet FOLLOW_expr_in_program_lines661 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_program_lines663 = new BitSet(new long[]{0x00001013AC2C0402L});
	public static final BitSet FOLLOW_VAR_in_declaration679 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration682 = new BitSet(new long[]{0x0000000000100060L});
	public static final BitSet FOLLOW_set_in_declaration684 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONSTANT_in_declaration699 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration702 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_BECOMES_in_declaration704 = new BitSet(new long[]{0x00000013AC2C0000L});
	public static final BitSet FOLLOW_expr_in_declaration707 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_assign_in_expr719 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_if_in_expr_assign731 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_BECOMES_in_expr_assign734 = new BitSet(new long[]{0x00000013AC2C0000L});
	public static final BitSet FOLLOW_expr_if_in_expr_assign737 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_IF_in_expr_if751 = new BitSet(new long[]{0x00000013AC2C0000L});
	public static final BitSet FOLLOW_expr_if_in_expr_if754 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_THEN_in_expr_if756 = new BitSet(new long[]{0x00000013AC2C0000L});
	public static final BitSet FOLLOW_expr_if_in_expr_if759 = new BitSet(new long[]{0x0000000000006000L});
	public static final BitSet FOLLOW_ELSE_in_expr_if762 = new BitSet(new long[]{0x00000013AC2C0000L});
	public static final BitSet FOLLOW_expr_if_in_expr_if765 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_ENDIF_in_expr_if769 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_or_in_expr_if774 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_and_in_expr_or786 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_LOGOR_in_expr_or789 = new BitSet(new long[]{0x00000013AC240000L});
	public static final BitSet FOLLOW_expr_and_in_expr_or792 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_expr_comp_in_expr_and806 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_LOGAND_in_expr_and809 = new BitSet(new long[]{0x00000013AC240000L});
	public static final BitSet FOLLOW_expr_comp_in_expr_and812 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_expr_add_in_expr_comp826 = new BitSet(new long[]{0x0000018040038002L});
	public static final BitSet FOLLOW_GREATER_in_expr_comp830 = new BitSet(new long[]{0x00000013AC240000L});
	public static final BitSet FOLLOW_SMALLER_in_expr_comp835 = new BitSet(new long[]{0x00000013AC240000L});
	public static final BitSet FOLLOW_GREATEREQ_in_expr_comp840 = new BitSet(new long[]{0x00000013AC240000L});
	public static final BitSet FOLLOW_SMALLEREQ_in_expr_comp845 = new BitSet(new long[]{0x00000013AC240000L});
	public static final BitSet FOLLOW_EQUALS_in_expr_comp850 = new BitSet(new long[]{0x00000013AC240000L});
	public static final BitSet FOLLOW_NOTEQUALS_in_expr_comp855 = new BitSet(new long[]{0x00000013AC240000L});
	public static final BitSet FOLLOW_expr_add_in_expr_comp860 = new BitSet(new long[]{0x0000018040038002L});
	public static final BitSet FOLLOW_expr_mult_in_expr_add874 = new BitSet(new long[]{0x0000000108000002L});
	public static final BitSet FOLLOW_PLUS_in_expr_add878 = new BitSet(new long[]{0x00000013AC240000L});
	public static final BitSet FOLLOW_MINUS_in_expr_add883 = new BitSet(new long[]{0x00000013AC240000L});
	public static final BitSet FOLLOW_expr_mult_in_expr_add887 = new BitSet(new long[]{0x0000000108000002L});
	public static final BitSet FOLLOW_expr_unary_in_expr_mult900 = new BitSet(new long[]{0x0000040010001002L});
	public static final BitSet FOLLOW_TIMES_in_expr_mult904 = new BitSet(new long[]{0x00000013AC240000L});
	public static final BitSet FOLLOW_DIVIDE_in_expr_mult909 = new BitSet(new long[]{0x00000013AC240000L});
	public static final BitSet FOLLOW_MODULO_in_expr_mult914 = new BitSet(new long[]{0x00000013AC240000L});
	public static final BitSet FOLLOW_expr_unary_in_expr_mult918 = new BitSet(new long[]{0x0000040010001002L});
	public static final BitSet FOLLOW_MINUS_in_expr_unary933 = new BitSet(new long[]{0x0000001284240000L});
	public static final BitSet FOLLOW_PLUS_in_expr_unary938 = new BitSet(new long[]{0x0000001284240000L});
	public static final BitSet FOLLOW_NOT_in_expr_unary943 = new BitSet(new long[]{0x0000001284240000L});
	public static final BitSet FOLLOW_expr_compound_in_expr_unary948 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCURLY_in_expr_compound960 = new BitSet(new long[]{0x0000101BAC2C0400L});
	public static final BitSet FOLLOW_program_lines_in_expr_compound962 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_RCURLY_in_expr_compound964 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_expr_compound982 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_expr_compound987 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_expr_compound992 = new BitSet(new long[]{0x00000013AC2C0000L});
	public static final BitSet FOLLOW_expr_in_expr_compound995 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RPAREN_in_expr_compound997 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_expr_compound1004 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_expr_compound1007 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_expr_compound1010 = new BitSet(new long[]{0x0000002000000080L});
	public static final BitSet FOLLOW_COMMA_in_expr_compound1013 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_expr_compound1016 = new BitSet(new long[]{0x0000002000000080L});
	public static final BitSet FOLLOW_RPAREN_in_expr_compound1020 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_expr_compound1026 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_expr_compound1029 = new BitSet(new long[]{0x00000013AC2C0000L});
	public static final BitSet FOLLOW_expr_in_expr_compound1032 = new BitSet(new long[]{0x0000002000000080L});
	public static final BitSet FOLLOW_COMMA_in_expr_compound1035 = new BitSet(new long[]{0x00000013AC2C0000L});
	public static final BitSet FOLLOW_expr_in_expr_compound1038 = new BitSet(new long[]{0x0000002000000080L});
	public static final BitSet FOLLOW_RPAREN_in_expr_compound1042 = new BitSet(new long[]{0x0000000000000002L});
}
