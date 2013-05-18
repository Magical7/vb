// $ANTLR 3.5 Decluse.g 2013-05-18 13:50:26

package vb.week4.decluse;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class DecluseParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "DECLTOKEN", "ID", 
		"LETTER", "LOWER", "LPAREN", "RPAREN", "UPPER", "USETOKEN", "WS"
	};
	public static final int EOF=-1;
	public static final int COMMENT=4;
	public static final int DECLTOKEN=5;
	public static final int ID=6;
	public static final int LETTER=7;
	public static final int LOWER=8;
	public static final int LPAREN=9;
	public static final int RPAREN=10;
	public static final int UPPER=11;
	public static final int USETOKEN=12;
	public static final int WS=13;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public DecluseParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public DecluseParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return DecluseParser.tokenNames; }
	@Override public String getGrammarFileName() { return "Decluse.g"; }


	public static class decluse_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "decluse"
	// Decluse.g:27:1: decluse : LPAREN ! serie RPAREN ! EOF ;
	public final DecluseParser.decluse_return decluse() throws RecognitionException {
		DecluseParser.decluse_return retval = new DecluseParser.decluse_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LPAREN1=null;
		Token RPAREN3=null;
		Token EOF4=null;
		ParserRuleReturnScope serie2 =null;

		Object LPAREN1_tree=null;
		Object RPAREN3_tree=null;
		Object EOF4_tree=null;

		try {
			// Decluse.g:28:5: ( LPAREN ! serie RPAREN ! EOF )
			// Decluse.g:28:9: LPAREN ! serie RPAREN ! EOF
			{
			root_0 = (Object)adaptor.nil();


			LPAREN1=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_decluse192); 
			pushFollow(FOLLOW_serie_in_decluse195);
			serie2=serie();
			state._fsp--;

			adaptor.addChild(root_0, serie2.getTree());

			RPAREN3=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_decluse197); 
			EOF4=(Token)match(input,EOF,FOLLOW_EOF_in_decluse200); 
			EOF4_tree = (Object)adaptor.create(EOF4);
			adaptor.addChild(root_0, EOF4_tree);

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
	// $ANTLR end "decluse"


	public static class serie_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "serie"
	// Decluse.g:31:1: serie : ( unit )* ;
	public final DecluseParser.serie_return serie() throws RecognitionException {
		DecluseParser.serie_return retval = new DecluseParser.serie_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope unit5 =null;


		try {
			// Decluse.g:32:2: ( ( unit )* )
			// Decluse.g:32:4: ( unit )*
			{
			root_0 = (Object)adaptor.nil();


			// Decluse.g:32:4: ( unit )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==DECLTOKEN||LA1_0==LPAREN||LA1_0==USETOKEN) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// Decluse.g:32:4: unit
					{
					pushFollow(FOLLOW_unit_in_serie218);
					unit5=unit();
					state._fsp--;

					adaptor.addChild(root_0, unit5.getTree());

					}
					break;

				default :
					break loop1;
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
	// $ANTLR end "serie"


	public static class unit_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "unit"
	// Decluse.g:35:1: unit : ( decl | use | LPAREN ! serie RPAREN !);
	public final DecluseParser.unit_return unit() throws RecognitionException {
		DecluseParser.unit_return retval = new DecluseParser.unit_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LPAREN8=null;
		Token RPAREN10=null;
		ParserRuleReturnScope decl6 =null;
		ParserRuleReturnScope use7 =null;
		ParserRuleReturnScope serie9 =null;

		Object LPAREN8_tree=null;
		Object RPAREN10_tree=null;

		try {
			// Decluse.g:36:2: ( decl | use | LPAREN ! serie RPAREN !)
			int alt2=3;
			switch ( input.LA(1) ) {
			case DECLTOKEN:
				{
				alt2=1;
				}
				break;
			case USETOKEN:
				{
				alt2=2;
				}
				break;
			case LPAREN:
				{
				alt2=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// Decluse.g:36:4: decl
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_decl_in_unit231);
					decl6=decl();
					state._fsp--;

					adaptor.addChild(root_0, decl6.getTree());

					}
					break;
				case 2 :
					// Decluse.g:37:5: use
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_use_in_unit237);
					use7=use();
					state._fsp--;

					adaptor.addChild(root_0, use7.getTree());

					}
					break;
				case 3 :
					// Decluse.g:38:4: LPAREN ! serie RPAREN !
					{
					root_0 = (Object)adaptor.nil();


					LPAREN8=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_unit242); 
					pushFollow(FOLLOW_serie_in_unit245);
					serie9=serie();
					state._fsp--;

					adaptor.addChild(root_0, serie9.getTree());

					RPAREN10=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_unit247); 
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
	// $ANTLR end "unit"


	public static class decl_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "decl"
	// Decluse.g:41:1: decl : DECLTOKEN ^ ID ;
	public final DecluseParser.decl_return decl() throws RecognitionException {
		DecluseParser.decl_return retval = new DecluseParser.decl_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token DECLTOKEN11=null;
		Token ID12=null;

		Object DECLTOKEN11_tree=null;
		Object ID12_tree=null;

		try {
			// Decluse.g:42:2: ( DECLTOKEN ^ ID )
			// Decluse.g:42:4: DECLTOKEN ^ ID
			{
			root_0 = (Object)adaptor.nil();


			DECLTOKEN11=(Token)match(input,DECLTOKEN,FOLLOW_DECLTOKEN_in_decl260); 
			DECLTOKEN11_tree = (Object)adaptor.create(DECLTOKEN11);
			root_0 = (Object)adaptor.becomeRoot(DECLTOKEN11_tree, root_0);

			ID12=(Token)match(input,ID,FOLLOW_ID_in_decl263); 
			ID12_tree = (Object)adaptor.create(ID12);
			adaptor.addChild(root_0, ID12_tree);

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
	// $ANTLR end "decl"


	public static class use_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "use"
	// Decluse.g:45:1: use : USETOKEN ^ ID ;
	public final DecluseParser.use_return use() throws RecognitionException {
		DecluseParser.use_return retval = new DecluseParser.use_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token USETOKEN13=null;
		Token ID14=null;

		Object USETOKEN13_tree=null;
		Object ID14_tree=null;

		try {
			// Decluse.g:46:2: ( USETOKEN ^ ID )
			// Decluse.g:46:4: USETOKEN ^ ID
			{
			root_0 = (Object)adaptor.nil();


			USETOKEN13=(Token)match(input,USETOKEN,FOLLOW_USETOKEN_in_use275); 
			USETOKEN13_tree = (Object)adaptor.create(USETOKEN13);
			root_0 = (Object)adaptor.becomeRoot(USETOKEN13_tree, root_0);

			ID14=(Token)match(input,ID,FOLLOW_ID_in_use278); 
			ID14_tree = (Object)adaptor.create(ID14);
			adaptor.addChild(root_0, ID14_tree);

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
	// $ANTLR end "use"

	// Delegated rules



	public static final BitSet FOLLOW_LPAREN_in_decluse192 = new BitSet(new long[]{0x0000000000001620L});
	public static final BitSet FOLLOW_serie_in_decluse195 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_RPAREN_in_decluse197 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_decluse200 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unit_in_serie218 = new BitSet(new long[]{0x0000000000001222L});
	public static final BitSet FOLLOW_decl_in_unit231 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_use_in_unit237 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_unit242 = new BitSet(new long[]{0x0000000000001620L});
	public static final BitSet FOLLOW_serie_in_unit245 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_RPAREN_in_unit247 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DECLTOKEN_in_decl260 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_decl263 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_USETOKEN_in_use275 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_use278 = new BitSet(new long[]{0x0000000000000002L});
}
