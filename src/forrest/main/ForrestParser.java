// $ANTLR 3.5 Forrest.g 2013-06-20 14:22:53

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
		"COMMA", "COMMENT", "COMPOUND", "CONSTANT", "DIGIT", "DIVIDE", "ELSE", 
		"ENDIF", "EQUALS", "FALSE", "GREATER", "GREATEREQ", "IDENTIFIER", "IF", 
		"INT", "LCURLY", "LETTER", "LOGAND", "LOGOR", "LOWER", "LPAREN", "MINUS", 
		"MODULO", "NEGATIVE", "NOT", "NOTEQUALS", "NUMBER", "PLUS", "POSITIVE", 
		"PRINT", "PROGRAM", "RCURLY", "READ", "RPAREN", "SEMICOLON", "SMALLER", 
		"SMALLEREQ", "SQUOTE", "THEN", "TIMES", "TRUE", "UPPER", "VAR", "WS"
	};
	public static final int EOF=-1;
	public static final int BECOMES=4;
	public static final int BOOL=5;
	public static final int CHAR=6;
	public static final int CHARACTER=7;
	public static final int COMMA=8;
	public static final int COMMENT=9;
	public static final int COMPOUND=10;
	public static final int CONSTANT=11;
	public static final int DIGIT=12;
	public static final int DIVIDE=13;
	public static final int ELSE=14;
	public static final int ENDIF=15;
	public static final int EQUALS=16;
	public static final int FALSE=17;
	public static final int GREATER=18;
	public static final int GREATEREQ=19;
	public static final int IDENTIFIER=20;
	public static final int IF=21;
	public static final int INT=22;
	public static final int LCURLY=23;
	public static final int LETTER=24;
	public static final int LOGAND=25;
	public static final int LOGOR=26;
	public static final int LOWER=27;
	public static final int LPAREN=28;
	public static final int MINUS=29;
	public static final int MODULO=30;
	public static final int NEGATIVE=31;
	public static final int NOT=32;
	public static final int NOTEQUALS=33;
	public static final int NUMBER=34;
	public static final int PLUS=35;
	public static final int POSITIVE=36;
	public static final int PRINT=37;
	public static final int PROGRAM=38;
	public static final int RCURLY=39;
	public static final int READ=40;
	public static final int RPAREN=41;
	public static final int SEMICOLON=42;
	public static final int SMALLER=43;
	public static final int SMALLEREQ=44;
	public static final int SQUOTE=45;
	public static final int THEN=46;
	public static final int TIMES=47;
	public static final int TRUE=48;
	public static final int UPPER=49;
	public static final int VAR=50;
	public static final int WS=51;

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
	// Forrest.g:68:1: forrest : program_lines EOF -> ^( PROGRAM program_lines ) ;
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
			// Forrest.g:69:2: ( program_lines EOF -> ^( PROGRAM program_lines ) )
			// Forrest.g:69:6: program_lines EOF
			{
			pushFollow(FOLLOW_program_lines_in_forrest682);
			program_lines1=program_lines();
			state._fsp--;

			stream_program_lines.add(program_lines1.getTree());
			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_forrest684);  
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
			// 70:13: -> ^( PROGRAM program_lines )
			{
				// Forrest.g:70:17: ^( PROGRAM program_lines )
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
	// Forrest.g:73:1: program_lines : ( ( declaration SEMICOLON !)* ( expr SEMICOLON !) )* ;
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
			// Forrest.g:74:2: ( ( ( declaration SEMICOLON !)* ( expr SEMICOLON !) )* )
			// Forrest.g:74:4: ( ( declaration SEMICOLON !)* ( expr SEMICOLON !) )*
			{
			root_0 = (ForrestTree)adaptor.nil();


			// Forrest.g:74:4: ( ( declaration SEMICOLON !)* ( expr SEMICOLON !) )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==CONSTANT||LA2_0==FALSE||(LA2_0 >= IDENTIFIER && LA2_0 <= IF)||LA2_0==LCURLY||(LA2_0 >= LPAREN && LA2_0 <= MINUS)||LA2_0==NOT||(LA2_0 >= NUMBER && LA2_0 <= PLUS)||LA2_0==PRINT||LA2_0==READ||LA2_0==SQUOTE||LA2_0==TRUE||LA2_0==VAR) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// Forrest.g:74:5: ( declaration SEMICOLON !)* ( expr SEMICOLON !)
					{
					// Forrest.g:74:5: ( declaration SEMICOLON !)*
					loop1:
					while (true) {
						int alt1=2;
						int LA1_0 = input.LA(1);
						if ( (LA1_0==CONSTANT||LA1_0==VAR) ) {
							alt1=1;
						}

						switch (alt1) {
						case 1 :
							// Forrest.g:74:6: declaration SEMICOLON !
							{
							pushFollow(FOLLOW_declaration_in_program_lines725);
							declaration3=declaration();
							state._fsp--;

							adaptor.addChild(root_0, declaration3.getTree());

							SEMICOLON4=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_program_lines727); 
							}
							break;

						default :
							break loop1;
						}
					}

					// Forrest.g:74:31: ( expr SEMICOLON !)
					// Forrest.g:74:32: expr SEMICOLON !
					{
					pushFollow(FOLLOW_expr_in_program_lines733);
					expr5=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr5.getTree());

					SEMICOLON6=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_program_lines735); 
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
	// Forrest.g:77:1: declaration : ( VAR ^ IDENTIFIER ( CHAR | BOOL | INT ) | CONSTANT ^ IDENTIFIER BECOMES ! expr );
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
			// Forrest.g:78:2: ( VAR ^ IDENTIFIER ( CHAR | BOOL | INT ) | CONSTANT ^ IDENTIFIER BECOMES ! expr )
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
					// Forrest.g:78:4: VAR ^ IDENTIFIER ( CHAR | BOOL | INT )
					{
					root_0 = (ForrestTree)adaptor.nil();


					VAR7=(Token)match(input,VAR,FOLLOW_VAR_in_declaration751); 
					VAR7_tree = (ForrestTree)adaptor.create(VAR7);
					root_0 = (ForrestTree)adaptor.becomeRoot(VAR7_tree, root_0);

					IDENTIFIER8=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration754); 
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
					// Forrest.g:79:4: CONSTANT ^ IDENTIFIER BECOMES ! expr
					{
					root_0 = (ForrestTree)adaptor.nil();


					CONSTANT10=(Token)match(input,CONSTANT,FOLLOW_CONSTANT_in_declaration771); 
					CONSTANT10_tree = (ForrestTree)adaptor.create(CONSTANT10);
					root_0 = (ForrestTree)adaptor.becomeRoot(CONSTANT10_tree, root_0);

					IDENTIFIER11=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration774); 
					IDENTIFIER11_tree = (ForrestTree)adaptor.create(IDENTIFIER11);
					adaptor.addChild(root_0, IDENTIFIER11_tree);

					BECOMES12=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_declaration776); 
					pushFollow(FOLLOW_expr_in_declaration779);
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
	// Forrest.g:82:1: expr : expr_assign ;
	public final ForrestParser.expr_return expr() throws RecognitionException {
		ForrestParser.expr_return retval = new ForrestParser.expr_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		ParserRuleReturnScope expr_assign14 =null;


		try {
			// Forrest.g:83:2: ( expr_assign )
			// Forrest.g:83:5: expr_assign
			{
			root_0 = (ForrestTree)adaptor.nil();


			pushFollow(FOLLOW_expr_assign_in_expr791);
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
	// Forrest.g:86:1: expr_assign options {k=2; } : ( IDENTIFIER BECOMES ^ expr_assign | expr_if );
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
			// Forrest.g:88:2: ( IDENTIFIER BECOMES ^ expr_assign | expr_if )
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
			else if ( (LA4_0==FALSE||LA4_0==IF||LA4_0==LCURLY||(LA4_0 >= LPAREN && LA4_0 <= MINUS)||LA4_0==NOT||(LA4_0 >= NUMBER && LA4_0 <= PLUS)||LA4_0==PRINT||LA4_0==READ||LA4_0==SQUOTE||LA4_0==TRUE) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// Forrest.g:88:4: IDENTIFIER BECOMES ^ expr_assign
					{
					root_0 = (ForrestTree)adaptor.nil();


					IDENTIFIER15=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expr_assign810); 
					IDENTIFIER15_tree = (ForrestTree)adaptor.create(IDENTIFIER15);
					adaptor.addChild(root_0, IDENTIFIER15_tree);

					BECOMES16=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_expr_assign812); 
					BECOMES16_tree = (ForrestTree)adaptor.create(BECOMES16);
					root_0 = (ForrestTree)adaptor.becomeRoot(BECOMES16_tree, root_0);

					pushFollow(FOLLOW_expr_assign_in_expr_assign815);
					expr_assign17=expr_assign();
					state._fsp--;

					adaptor.addChild(root_0, expr_assign17.getTree());

					}
					break;
				case 2 :
					// Forrest.g:89:4: expr_if
					{
					root_0 = (ForrestTree)adaptor.nil();


					pushFollow(FOLLOW_expr_if_in_expr_assign820);
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
	// Forrest.g:92:1: expr_if : ( IF ^ expr_if THEN ! expr_if ( ELSE ! expr_if )? ENDIF | expr_or );
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
			// Forrest.g:93:2: ( IF ^ expr_if THEN ! expr_if ( ELSE ! expr_if )? ENDIF | expr_or )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==IF) ) {
				alt6=1;
			}
			else if ( (LA6_0==FALSE||LA6_0==IDENTIFIER||LA6_0==LCURLY||(LA6_0 >= LPAREN && LA6_0 <= MINUS)||LA6_0==NOT||(LA6_0 >= NUMBER && LA6_0 <= PLUS)||LA6_0==PRINT||LA6_0==READ||LA6_0==SQUOTE||LA6_0==TRUE) ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// Forrest.g:93:4: IF ^ expr_if THEN ! expr_if ( ELSE ! expr_if )? ENDIF
					{
					root_0 = (ForrestTree)adaptor.nil();


					IF19=(Token)match(input,IF,FOLLOW_IF_in_expr_if832); 
					IF19_tree = (ForrestTree)adaptor.create(IF19);
					root_0 = (ForrestTree)adaptor.becomeRoot(IF19_tree, root_0);

					pushFollow(FOLLOW_expr_if_in_expr_if835);
					expr_if20=expr_if();
					state._fsp--;

					adaptor.addChild(root_0, expr_if20.getTree());

					THEN21=(Token)match(input,THEN,FOLLOW_THEN_in_expr_if837); 
					pushFollow(FOLLOW_expr_if_in_expr_if840);
					expr_if22=expr_if();
					state._fsp--;

					adaptor.addChild(root_0, expr_if22.getTree());

					// Forrest.g:93:30: ( ELSE ! expr_if )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==ELSE) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// Forrest.g:93:31: ELSE ! expr_if
							{
							ELSE23=(Token)match(input,ELSE,FOLLOW_ELSE_in_expr_if843); 
							pushFollow(FOLLOW_expr_if_in_expr_if846);
							expr_if24=expr_if();
							state._fsp--;

							adaptor.addChild(root_0, expr_if24.getTree());

							}
							break;

					}

					ENDIF25=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_expr_if850); 
					ENDIF25_tree = (ForrestTree)adaptor.create(ENDIF25);
					adaptor.addChild(root_0, ENDIF25_tree);

					}
					break;
				case 2 :
					// Forrest.g:94:4: expr_or
					{
					root_0 = (ForrestTree)adaptor.nil();


					pushFollow(FOLLOW_expr_or_in_expr_if855);
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
	// Forrest.g:97:1: expr_or : expr_and ( LOGOR ^ expr_and )* ;
	public final ForrestParser.expr_or_return expr_or() throws RecognitionException {
		ForrestParser.expr_or_return retval = new ForrestParser.expr_or_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		Token LOGOR28=null;
		ParserRuleReturnScope expr_and27 =null;
		ParserRuleReturnScope expr_and29 =null;

		ForrestTree LOGOR28_tree=null;

		try {
			// Forrest.g:98:2: ( expr_and ( LOGOR ^ expr_and )* )
			// Forrest.g:98:4: expr_and ( LOGOR ^ expr_and )*
			{
			root_0 = (ForrestTree)adaptor.nil();


			pushFollow(FOLLOW_expr_and_in_expr_or867);
			expr_and27=expr_and();
			state._fsp--;

			adaptor.addChild(root_0, expr_and27.getTree());

			// Forrest.g:98:13: ( LOGOR ^ expr_and )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==LOGOR) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// Forrest.g:98:14: LOGOR ^ expr_and
					{
					LOGOR28=(Token)match(input,LOGOR,FOLLOW_LOGOR_in_expr_or870); 
					LOGOR28_tree = (ForrestTree)adaptor.create(LOGOR28);
					root_0 = (ForrestTree)adaptor.becomeRoot(LOGOR28_tree, root_0);

					pushFollow(FOLLOW_expr_and_in_expr_or873);
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
	// Forrest.g:101:1: expr_and : expr_comp ( LOGAND ^ expr_comp )* ;
	public final ForrestParser.expr_and_return expr_and() throws RecognitionException {
		ForrestParser.expr_and_return retval = new ForrestParser.expr_and_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		Token LOGAND31=null;
		ParserRuleReturnScope expr_comp30 =null;
		ParserRuleReturnScope expr_comp32 =null;

		ForrestTree LOGAND31_tree=null;

		try {
			// Forrest.g:102:2: ( expr_comp ( LOGAND ^ expr_comp )* )
			// Forrest.g:102:4: expr_comp ( LOGAND ^ expr_comp )*
			{
			root_0 = (ForrestTree)adaptor.nil();


			pushFollow(FOLLOW_expr_comp_in_expr_and887);
			expr_comp30=expr_comp();
			state._fsp--;

			adaptor.addChild(root_0, expr_comp30.getTree());

			// Forrest.g:102:14: ( LOGAND ^ expr_comp )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==LOGAND) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// Forrest.g:102:15: LOGAND ^ expr_comp
					{
					LOGAND31=(Token)match(input,LOGAND,FOLLOW_LOGAND_in_expr_and890); 
					LOGAND31_tree = (ForrestTree)adaptor.create(LOGAND31);
					root_0 = (ForrestTree)adaptor.becomeRoot(LOGAND31_tree, root_0);

					pushFollow(FOLLOW_expr_comp_in_expr_and893);
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
	// Forrest.g:105:1: expr_comp : expr_add ( ( GREATER ^| SMALLER ^| GREATEREQ ^| SMALLEREQ ^| EQUALS ^| NOTEQUALS ^) expr_add )* ;
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
			// Forrest.g:106:2: ( expr_add ( ( GREATER ^| SMALLER ^| GREATEREQ ^| SMALLEREQ ^| EQUALS ^| NOTEQUALS ^) expr_add )* )
			// Forrest.g:106:4: expr_add ( ( GREATER ^| SMALLER ^| GREATEREQ ^| SMALLEREQ ^| EQUALS ^| NOTEQUALS ^) expr_add )*
			{
			root_0 = (ForrestTree)adaptor.nil();


			pushFollow(FOLLOW_expr_add_in_expr_comp907);
			expr_add33=expr_add();
			state._fsp--;

			adaptor.addChild(root_0, expr_add33.getTree());

			// Forrest.g:106:13: ( ( GREATER ^| SMALLER ^| GREATEREQ ^| SMALLEREQ ^| EQUALS ^| NOTEQUALS ^) expr_add )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==EQUALS||(LA10_0 >= GREATER && LA10_0 <= GREATEREQ)||LA10_0==NOTEQUALS||(LA10_0 >= SMALLER && LA10_0 <= SMALLEREQ)) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// Forrest.g:106:14: ( GREATER ^| SMALLER ^| GREATEREQ ^| SMALLEREQ ^| EQUALS ^| NOTEQUALS ^) expr_add
					{
					// Forrest.g:106:14: ( GREATER ^| SMALLER ^| GREATEREQ ^| SMALLEREQ ^| EQUALS ^| NOTEQUALS ^)
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
							// Forrest.g:106:15: GREATER ^
							{
							GREATER34=(Token)match(input,GREATER,FOLLOW_GREATER_in_expr_comp911); 
							GREATER34_tree = (ForrestTree)adaptor.create(GREATER34);
							root_0 = (ForrestTree)adaptor.becomeRoot(GREATER34_tree, root_0);

							}
							break;
						case 2 :
							// Forrest.g:106:26: SMALLER ^
							{
							SMALLER35=(Token)match(input,SMALLER,FOLLOW_SMALLER_in_expr_comp916); 
							SMALLER35_tree = (ForrestTree)adaptor.create(SMALLER35);
							root_0 = (ForrestTree)adaptor.becomeRoot(SMALLER35_tree, root_0);

							}
							break;
						case 3 :
							// Forrest.g:106:37: GREATEREQ ^
							{
							GREATEREQ36=(Token)match(input,GREATEREQ,FOLLOW_GREATEREQ_in_expr_comp921); 
							GREATEREQ36_tree = (ForrestTree)adaptor.create(GREATEREQ36);
							root_0 = (ForrestTree)adaptor.becomeRoot(GREATEREQ36_tree, root_0);

							}
							break;
						case 4 :
							// Forrest.g:106:50: SMALLEREQ ^
							{
							SMALLEREQ37=(Token)match(input,SMALLEREQ,FOLLOW_SMALLEREQ_in_expr_comp926); 
							SMALLEREQ37_tree = (ForrestTree)adaptor.create(SMALLEREQ37);
							root_0 = (ForrestTree)adaptor.becomeRoot(SMALLEREQ37_tree, root_0);

							}
							break;
						case 5 :
							// Forrest.g:106:63: EQUALS ^
							{
							EQUALS38=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_expr_comp931); 
							EQUALS38_tree = (ForrestTree)adaptor.create(EQUALS38);
							root_0 = (ForrestTree)adaptor.becomeRoot(EQUALS38_tree, root_0);

							}
							break;
						case 6 :
							// Forrest.g:106:73: NOTEQUALS ^
							{
							NOTEQUALS39=(Token)match(input,NOTEQUALS,FOLLOW_NOTEQUALS_in_expr_comp936); 
							NOTEQUALS39_tree = (ForrestTree)adaptor.create(NOTEQUALS39);
							root_0 = (ForrestTree)adaptor.becomeRoot(NOTEQUALS39_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_expr_add_in_expr_comp941);
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
	// Forrest.g:109:1: expr_add : expr_mult ( ( PLUS ^| MINUS ^) expr_mult )* ;
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
			// Forrest.g:110:2: ( expr_mult ( ( PLUS ^| MINUS ^) expr_mult )* )
			// Forrest.g:110:4: expr_mult ( ( PLUS ^| MINUS ^) expr_mult )*
			{
			root_0 = (ForrestTree)adaptor.nil();


			pushFollow(FOLLOW_expr_mult_in_expr_add955);
			expr_mult41=expr_mult();
			state._fsp--;

			adaptor.addChild(root_0, expr_mult41.getTree());

			// Forrest.g:110:14: ( ( PLUS ^| MINUS ^) expr_mult )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==MINUS||LA12_0==PLUS) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// Forrest.g:110:15: ( PLUS ^| MINUS ^) expr_mult
					{
					// Forrest.g:110:15: ( PLUS ^| MINUS ^)
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
							// Forrest.g:110:16: PLUS ^
							{
							PLUS42=(Token)match(input,PLUS,FOLLOW_PLUS_in_expr_add959); 
							PLUS42_tree = (ForrestTree)adaptor.create(PLUS42);
							root_0 = (ForrestTree)adaptor.becomeRoot(PLUS42_tree, root_0);

							}
							break;
						case 2 :
							// Forrest.g:110:24: MINUS ^
							{
							MINUS43=(Token)match(input,MINUS,FOLLOW_MINUS_in_expr_add964); 
							MINUS43_tree = (ForrestTree)adaptor.create(MINUS43);
							root_0 = (ForrestTree)adaptor.becomeRoot(MINUS43_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_expr_mult_in_expr_add968);
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
	// Forrest.g:113:1: expr_mult : expr_unary ( ( TIMES ^| DIVIDE ^| MODULO ^) expr_unary )* ;
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
			// Forrest.g:114:2: ( expr_unary ( ( TIMES ^| DIVIDE ^| MODULO ^) expr_unary )* )
			// Forrest.g:114:4: expr_unary ( ( TIMES ^| DIVIDE ^| MODULO ^) expr_unary )*
			{
			root_0 = (ForrestTree)adaptor.nil();


			pushFollow(FOLLOW_expr_unary_in_expr_mult981);
			expr_unary45=expr_unary();
			state._fsp--;

			adaptor.addChild(root_0, expr_unary45.getTree());

			// Forrest.g:114:15: ( ( TIMES ^| DIVIDE ^| MODULO ^) expr_unary )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==DIVIDE||LA14_0==MODULO||LA14_0==TIMES) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// Forrest.g:114:16: ( TIMES ^| DIVIDE ^| MODULO ^) expr_unary
					{
					// Forrest.g:114:16: ( TIMES ^| DIVIDE ^| MODULO ^)
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
							// Forrest.g:114:17: TIMES ^
							{
							TIMES46=(Token)match(input,TIMES,FOLLOW_TIMES_in_expr_mult985); 
							TIMES46_tree = (ForrestTree)adaptor.create(TIMES46);
							root_0 = (ForrestTree)adaptor.becomeRoot(TIMES46_tree, root_0);

							}
							break;
						case 2 :
							// Forrest.g:114:26: DIVIDE ^
							{
							DIVIDE47=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_expr_mult990); 
							DIVIDE47_tree = (ForrestTree)adaptor.create(DIVIDE47);
							root_0 = (ForrestTree)adaptor.becomeRoot(DIVIDE47_tree, root_0);

							}
							break;
						case 3 :
							// Forrest.g:114:36: MODULO ^
							{
							MODULO48=(Token)match(input,MODULO,FOLLOW_MODULO_in_expr_mult995); 
							MODULO48_tree = (ForrestTree)adaptor.create(MODULO48);
							root_0 = (ForrestTree)adaptor.becomeRoot(MODULO48_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_expr_unary_in_expr_mult999);
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
	// Forrest.g:117:1: expr_unary : ( ( NOT ^)? expr_compound | PLUS expr_compound -> ^( POSITIVE expr_compound ) | MINUS expr_compound -> ^( NEGATIVE expr_compound ) );
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
			// Forrest.g:118:2: ( ( NOT ^)? expr_compound | PLUS expr_compound -> ^( POSITIVE expr_compound ) | MINUS expr_compound -> ^( NEGATIVE expr_compound ) )
			int alt16=3;
			switch ( input.LA(1) ) {
			case FALSE:
			case IDENTIFIER:
			case LCURLY:
			case LPAREN:
			case NOT:
			case NUMBER:
			case PRINT:
			case READ:
			case SQUOTE:
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
					// Forrest.g:118:4: ( NOT ^)? expr_compound
					{
					root_0 = (ForrestTree)adaptor.nil();


					// Forrest.g:118:4: ( NOT ^)?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==NOT) ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// Forrest.g:118:5: NOT ^
							{
							NOT50=(Token)match(input,NOT,FOLLOW_NOT_in_expr_unary1014); 
							NOT50_tree = (ForrestTree)adaptor.create(NOT50);
							root_0 = (ForrestTree)adaptor.becomeRoot(NOT50_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_expr_compound_in_expr_unary1019);
					expr_compound51=expr_compound();
					state._fsp--;

					adaptor.addChild(root_0, expr_compound51.getTree());

					}
					break;
				case 2 :
					// Forrest.g:119:4: PLUS expr_compound
					{
					PLUS52=(Token)match(input,PLUS,FOLLOW_PLUS_in_expr_unary1024);  
					stream_PLUS.add(PLUS52);

					pushFollow(FOLLOW_expr_compound_in_expr_unary1026);
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
					// 120:4: -> ^( POSITIVE expr_compound )
					{
						// Forrest.g:120:7: ^( POSITIVE expr_compound )
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
					// Forrest.g:121:4: MINUS expr_compound
					{
					MINUS54=(Token)match(input,MINUS,FOLLOW_MINUS_in_expr_unary1042);  
					stream_MINUS.add(MINUS54);

					pushFollow(FOLLOW_expr_compound_in_expr_unary1044);
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
					// 122:4: -> ^( NEGATIVE expr_compound )
					{
						// Forrest.g:122:7: ^( NEGATIVE expr_compound )
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
	// Forrest.g:125:1: expr_compound : ( LCURLY program_lines RCURLY -> ^( COMPOUND program_lines ) | IDENTIFIER | NUMBER | TRUE | FALSE | SQUOTE ! CHARACTER SQUOTE !| LPAREN ! expr RPAREN !| read | print );
	public final ForrestParser.expr_compound_return expr_compound() throws RecognitionException {
		ForrestParser.expr_compound_return retval = new ForrestParser.expr_compound_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		Token LCURLY56=null;
		Token RCURLY58=null;
		Token IDENTIFIER59=null;
		Token NUMBER60=null;
		Token TRUE61=null;
		Token FALSE62=null;
		Token SQUOTE63=null;
		Token CHARACTER64=null;
		Token SQUOTE65=null;
		Token LPAREN66=null;
		Token RPAREN68=null;
		ParserRuleReturnScope program_lines57 =null;
		ParserRuleReturnScope expr67 =null;
		ParserRuleReturnScope read69 =null;
		ParserRuleReturnScope print70 =null;

		ForrestTree LCURLY56_tree=null;
		ForrestTree RCURLY58_tree=null;
		ForrestTree IDENTIFIER59_tree=null;
		ForrestTree NUMBER60_tree=null;
		ForrestTree TRUE61_tree=null;
		ForrestTree FALSE62_tree=null;
		ForrestTree SQUOTE63_tree=null;
		ForrestTree CHARACTER64_tree=null;
		ForrestTree SQUOTE65_tree=null;
		ForrestTree LPAREN66_tree=null;
		ForrestTree RPAREN68_tree=null;
		RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
		RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
		RewriteRuleSubtreeStream stream_program_lines=new RewriteRuleSubtreeStream(adaptor,"rule program_lines");

		try {
			// Forrest.g:126:2: ( LCURLY program_lines RCURLY -> ^( COMPOUND program_lines ) | IDENTIFIER | NUMBER | TRUE | FALSE | SQUOTE ! CHARACTER SQUOTE !| LPAREN ! expr RPAREN !| read | print )
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
			case SQUOTE:
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
					// Forrest.g:126:4: LCURLY program_lines RCURLY
					{
					LCURLY56=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_expr_compound1067);  
					stream_LCURLY.add(LCURLY56);

					pushFollow(FOLLOW_program_lines_in_expr_compound1069);
					program_lines57=program_lines();
					state._fsp--;

					stream_program_lines.add(program_lines57.getTree());
					RCURLY58=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_expr_compound1071);  
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
					// 127:4: -> ^( COMPOUND program_lines )
					{
						// Forrest.g:127:8: ^( COMPOUND program_lines )
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
					// Forrest.g:128:4: IDENTIFIER
					{
					root_0 = (ForrestTree)adaptor.nil();


					IDENTIFIER59=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expr_compound1089); 
					IDENTIFIER59_tree = (ForrestTree)adaptor.create(IDENTIFIER59);
					adaptor.addChild(root_0, IDENTIFIER59_tree);

					}
					break;
				case 3 :
					// Forrest.g:129:4: NUMBER
					{
					root_0 = (ForrestTree)adaptor.nil();


					NUMBER60=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_expr_compound1094); 
					NUMBER60_tree = (ForrestTree)adaptor.create(NUMBER60);
					adaptor.addChild(root_0, NUMBER60_tree);

					}
					break;
				case 4 :
					// Forrest.g:130:4: TRUE
					{
					root_0 = (ForrestTree)adaptor.nil();


					TRUE61=(Token)match(input,TRUE,FOLLOW_TRUE_in_expr_compound1099); 
					TRUE61_tree = (ForrestTree)adaptor.create(TRUE61);
					adaptor.addChild(root_0, TRUE61_tree);

					}
					break;
				case 5 :
					// Forrest.g:130:11: FALSE
					{
					root_0 = (ForrestTree)adaptor.nil();


					FALSE62=(Token)match(input,FALSE,FOLLOW_FALSE_in_expr_compound1103); 
					FALSE62_tree = (ForrestTree)adaptor.create(FALSE62);
					adaptor.addChild(root_0, FALSE62_tree);

					}
					break;
				case 6 :
					// Forrest.g:131:4: SQUOTE ! CHARACTER SQUOTE !
					{
					root_0 = (ForrestTree)adaptor.nil();


					SQUOTE63=(Token)match(input,SQUOTE,FOLLOW_SQUOTE_in_expr_compound1108); 
					CHARACTER64=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_expr_compound1111); 
					CHARACTER64_tree = (ForrestTree)adaptor.create(CHARACTER64);
					adaptor.addChild(root_0, CHARACTER64_tree);

					SQUOTE65=(Token)match(input,SQUOTE,FOLLOW_SQUOTE_in_expr_compound1113); 
					}
					break;
				case 7 :
					// Forrest.g:132:4: LPAREN ! expr RPAREN !
					{
					root_0 = (ForrestTree)adaptor.nil();


					LPAREN66=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_expr_compound1119); 
					pushFollow(FOLLOW_expr_in_expr_compound1122);
					expr67=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr67.getTree());

					RPAREN68=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_expr_compound1124); 
					}
					break;
				case 8 :
					// Forrest.g:133:5: read
					{
					root_0 = (ForrestTree)adaptor.nil();


					pushFollow(FOLLOW_read_in_expr_compound1131);
					read69=read();
					state._fsp--;

					adaptor.addChild(root_0, read69.getTree());

					}
					break;
				case 9 :
					// Forrest.g:134:4: print
					{
					root_0 = (ForrestTree)adaptor.nil();


					pushFollow(FOLLOW_print_in_expr_compound1136);
					print70=print();
					state._fsp--;

					adaptor.addChild(root_0, print70.getTree());

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
	// Forrest.g:137:1: read : READ ^ LPAREN ! IDENTIFIER ( COMMA ! IDENTIFIER )* RPAREN !;
	public final ForrestParser.read_return read() throws RecognitionException {
		ForrestParser.read_return retval = new ForrestParser.read_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		Token READ71=null;
		Token LPAREN72=null;
		Token IDENTIFIER73=null;
		Token COMMA74=null;
		Token IDENTIFIER75=null;
		Token RPAREN76=null;

		ForrestTree READ71_tree=null;
		ForrestTree LPAREN72_tree=null;
		ForrestTree IDENTIFIER73_tree=null;
		ForrestTree COMMA74_tree=null;
		ForrestTree IDENTIFIER75_tree=null;
		ForrestTree RPAREN76_tree=null;

		try {
			// Forrest.g:138:2: ( READ ^ LPAREN ! IDENTIFIER ( COMMA ! IDENTIFIER )* RPAREN !)
			// Forrest.g:138:4: READ ^ LPAREN ! IDENTIFIER ( COMMA ! IDENTIFIER )* RPAREN !
			{
			root_0 = (ForrestTree)adaptor.nil();


			READ71=(Token)match(input,READ,FOLLOW_READ_in_read1148); 
			READ71_tree = (ForrestTree)adaptor.create(READ71);
			root_0 = (ForrestTree)adaptor.becomeRoot(READ71_tree, root_0);

			LPAREN72=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_read1151); 
			IDENTIFIER73=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_read1154); 
			IDENTIFIER73_tree = (ForrestTree)adaptor.create(IDENTIFIER73);
			adaptor.addChild(root_0, IDENTIFIER73_tree);

			// Forrest.g:138:29: ( COMMA ! IDENTIFIER )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==COMMA) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// Forrest.g:138:30: COMMA ! IDENTIFIER
					{
					COMMA74=(Token)match(input,COMMA,FOLLOW_COMMA_in_read1157); 
					IDENTIFIER75=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_read1160); 
					IDENTIFIER75_tree = (ForrestTree)adaptor.create(IDENTIFIER75);
					adaptor.addChild(root_0, IDENTIFIER75_tree);

					}
					break;

				default :
					break loop18;
				}
			}

			RPAREN76=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_read1164); 
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
	// Forrest.g:141:1: print : PRINT ^ LPAREN ! expr ( COMMA ! expr )* RPAREN !;
	public final ForrestParser.print_return print() throws RecognitionException {
		ForrestParser.print_return retval = new ForrestParser.print_return();
		retval.start = input.LT(1);

		ForrestTree root_0 = null;

		Token PRINT77=null;
		Token LPAREN78=null;
		Token COMMA80=null;
		Token RPAREN82=null;
		ParserRuleReturnScope expr79 =null;
		ParserRuleReturnScope expr81 =null;

		ForrestTree PRINT77_tree=null;
		ForrestTree LPAREN78_tree=null;
		ForrestTree COMMA80_tree=null;
		ForrestTree RPAREN82_tree=null;

		try {
			// Forrest.g:142:2: ( PRINT ^ LPAREN ! expr ( COMMA ! expr )* RPAREN !)
			// Forrest.g:142:4: PRINT ^ LPAREN ! expr ( COMMA ! expr )* RPAREN !
			{
			root_0 = (ForrestTree)adaptor.nil();


			PRINT77=(Token)match(input,PRINT,FOLLOW_PRINT_in_print1176); 
			PRINT77_tree = (ForrestTree)adaptor.create(PRINT77);
			root_0 = (ForrestTree)adaptor.becomeRoot(PRINT77_tree, root_0);

			LPAREN78=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_print1179); 
			pushFollow(FOLLOW_expr_in_print1182);
			expr79=expr();
			state._fsp--;

			adaptor.addChild(root_0, expr79.getTree());

			// Forrest.g:142:24: ( COMMA ! expr )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==COMMA) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// Forrest.g:142:25: COMMA ! expr
					{
					COMMA80=(Token)match(input,COMMA,FOLLOW_COMMA_in_print1185); 
					pushFollow(FOLLOW_expr_in_print1188);
					expr81=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr81.getTree());

					}
					break;

				default :
					break loop19;
				}
			}

			RPAREN82=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_print1192); 
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



	public static final BitSet FOLLOW_program_lines_in_forrest682 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_forrest684 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_program_lines725 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_program_lines727 = new BitSet(new long[]{0x0005212D30B20800L});
	public static final BitSet FOLLOW_expr_in_program_lines733 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_program_lines735 = new BitSet(new long[]{0x0005212D30B20802L});
	public static final BitSet FOLLOW_VAR_in_declaration751 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration754 = new BitSet(new long[]{0x0000000000400060L});
	public static final BitSet FOLLOW_set_in_declaration756 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONSTANT_in_declaration771 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration774 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_BECOMES_in_declaration776 = new BitSet(new long[]{0x0001212D30B20000L});
	public static final BitSet FOLLOW_expr_in_declaration779 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_assign_in_expr791 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_expr_assign810 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_BECOMES_in_expr_assign812 = new BitSet(new long[]{0x0001212D30B20000L});
	public static final BitSet FOLLOW_expr_assign_in_expr_assign815 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_if_in_expr_assign820 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_expr_if832 = new BitSet(new long[]{0x0001212D30B20000L});
	public static final BitSet FOLLOW_expr_if_in_expr_if835 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_THEN_in_expr_if837 = new BitSet(new long[]{0x0001212D30B20000L});
	public static final BitSet FOLLOW_expr_if_in_expr_if840 = new BitSet(new long[]{0x000000000000C000L});
	public static final BitSet FOLLOW_ELSE_in_expr_if843 = new BitSet(new long[]{0x0001212D30B20000L});
	public static final BitSet FOLLOW_expr_if_in_expr_if846 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ENDIF_in_expr_if850 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_or_in_expr_if855 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_and_in_expr_or867 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_LOGOR_in_expr_or870 = new BitSet(new long[]{0x0001212D30920000L});
	public static final BitSet FOLLOW_expr_and_in_expr_or873 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_expr_comp_in_expr_and887 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_LOGAND_in_expr_and890 = new BitSet(new long[]{0x0001212D30920000L});
	public static final BitSet FOLLOW_expr_comp_in_expr_and893 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_expr_add_in_expr_comp907 = new BitSet(new long[]{0x00001802000D0002L});
	public static final BitSet FOLLOW_GREATER_in_expr_comp911 = new BitSet(new long[]{0x0001212D30920000L});
	public static final BitSet FOLLOW_SMALLER_in_expr_comp916 = new BitSet(new long[]{0x0001212D30920000L});
	public static final BitSet FOLLOW_GREATEREQ_in_expr_comp921 = new BitSet(new long[]{0x0001212D30920000L});
	public static final BitSet FOLLOW_SMALLEREQ_in_expr_comp926 = new BitSet(new long[]{0x0001212D30920000L});
	public static final BitSet FOLLOW_EQUALS_in_expr_comp931 = new BitSet(new long[]{0x0001212D30920000L});
	public static final BitSet FOLLOW_NOTEQUALS_in_expr_comp936 = new BitSet(new long[]{0x0001212D30920000L});
	public static final BitSet FOLLOW_expr_add_in_expr_comp941 = new BitSet(new long[]{0x00001802000D0002L});
	public static final BitSet FOLLOW_expr_mult_in_expr_add955 = new BitSet(new long[]{0x0000000820000002L});
	public static final BitSet FOLLOW_PLUS_in_expr_add959 = new BitSet(new long[]{0x0001212D30920000L});
	public static final BitSet FOLLOW_MINUS_in_expr_add964 = new BitSet(new long[]{0x0001212D30920000L});
	public static final BitSet FOLLOW_expr_mult_in_expr_add968 = new BitSet(new long[]{0x0000000820000002L});
	public static final BitSet FOLLOW_expr_unary_in_expr_mult981 = new BitSet(new long[]{0x0000800040002002L});
	public static final BitSet FOLLOW_TIMES_in_expr_mult985 = new BitSet(new long[]{0x0001212D30920000L});
	public static final BitSet FOLLOW_DIVIDE_in_expr_mult990 = new BitSet(new long[]{0x0001212D30920000L});
	public static final BitSet FOLLOW_MODULO_in_expr_mult995 = new BitSet(new long[]{0x0001212D30920000L});
	public static final BitSet FOLLOW_expr_unary_in_expr_mult999 = new BitSet(new long[]{0x0000800040002002L});
	public static final BitSet FOLLOW_NOT_in_expr_unary1014 = new BitSet(new long[]{0x0001212410920000L});
	public static final BitSet FOLLOW_expr_compound_in_expr_unary1019 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_expr_unary1024 = new BitSet(new long[]{0x0001212410920000L});
	public static final BitSet FOLLOW_expr_compound_in_expr_unary1026 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_expr_unary1042 = new BitSet(new long[]{0x0001212410920000L});
	public static final BitSet FOLLOW_expr_compound_in_expr_unary1044 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCURLY_in_expr_compound1067 = new BitSet(new long[]{0x000521AD30B20800L});
	public static final BitSet FOLLOW_program_lines_in_expr_compound1069 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_RCURLY_in_expr_compound1071 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_expr_compound1089 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_expr_compound1094 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRUE_in_expr_compound1099 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_expr_compound1103 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SQUOTE_in_expr_compound1108 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHARACTER_in_expr_compound1111 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_SQUOTE_in_expr_compound1113 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_expr_compound1119 = new BitSet(new long[]{0x0001212D30B20000L});
	public static final BitSet FOLLOW_expr_in_expr_compound1122 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_RPAREN_in_expr_compound1124 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_in_expr_compound1131 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_in_expr_compound1136 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_read1148 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_read1151 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_read1154 = new BitSet(new long[]{0x0000020000000100L});
	public static final BitSet FOLLOW_COMMA_in_read1157 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_read1160 = new BitSet(new long[]{0x0000020000000100L});
	public static final BitSet FOLLOW_RPAREN_in_read1164 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_print1176 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_print1179 = new BitSet(new long[]{0x0001212D30B20000L});
	public static final BitSet FOLLOW_expr_in_print1182 = new BitSet(new long[]{0x0000020000000100L});
	public static final BitSet FOLLOW_COMMA_in_print1185 = new BitSet(new long[]{0x0001212D30B20000L});
	public static final BitSet FOLLOW_expr_in_print1188 = new BitSet(new long[]{0x0000020000000100L});
	public static final BitSet FOLLOW_RPAREN_in_print1192 = new BitSet(new long[]{0x0000000000000002L});
}
