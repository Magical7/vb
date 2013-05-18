// $ANTLR 3.5 DecluseChecker.g 2013-05-18 14:23:06

package vb.week4.decluse;
import java.util.Set;
import java.util.HashSet;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class DecluseChecker extends TreeParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "DECLTOKEN", "ID", 
		"LETTER", "LOWER", "LPAREN", "RPAREN", "SERIE", "UPPER", "USETOKEN", "WS"
	};
	public static final int EOF=-1;
	public static final int COMMENT=4;
	public static final int DECLTOKEN=5;
	public static final int ID=6;
	public static final int LETTER=7;
	public static final int LOWER=8;
	public static final int LPAREN=9;
	public static final int RPAREN=10;
	public static final int SERIE=11;
	public static final int UPPER=12;
	public static final int USETOKEN=13;
	public static final int WS=14;

	// delegates
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators


	public DecluseChecker(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public DecluseChecker(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return DecluseChecker.tokenNames; }
	@Override public String getGrammarFileName() { return "DecluseChecker.g"; }


	    // idset - a set of declared identifiers.
	    private SymbolTable symtab = new SymbolTable();



	// $ANTLR start "decluse"
	// DecluseChecker.g:28:1: decluse : serie ;
	public final void decluse() throws RecognitionException {
		try {
			// DecluseChecker.g:29:2: ( serie )
			// DecluseChecker.g:29:4: serie
			{
			pushFollow(FOLLOW_serie_in_decluse89);
			serie();
			state._fsp--;

			}

		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    } 

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "decluse"



	// $ANTLR start "serie"
	// DecluseChecker.g:32:1: serie : ^( SERIE ( unit )* ) ;
	public final void serie() throws RecognitionException {
		 symtab.openScope(); 
		try {
			// DecluseChecker.g:34:2: ( ^( SERIE ( unit )* ) )
			// DecluseChecker.g:34:4: ^( SERIE ( unit )* )
			{
			match(input,SERIE,FOLLOW_SERIE_in_serie106); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// DecluseChecker.g:34:12: ( unit )*
				loop1:
				while (true) {
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==DECLTOKEN||LA1_0==SERIE||LA1_0==USETOKEN) ) {
						alt1=1;
					}

					switch (alt1) {
					case 1 :
						// DecluseChecker.g:34:12: unit
						{
						pushFollow(FOLLOW_unit_in_serie108);
						unit();
						state._fsp--;

						}
						break;

					default :
						break loop1;
					}
				}

				match(input, Token.UP, null); 
			}


						symtab.closeScope();
					
			}

		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    } 

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "serie"



	// $ANTLR start "unit"
	// DecluseChecker.g:40:1: unit : ( decl | use | serie );
	public final void unit() throws RecognitionException {
		try {
			// DecluseChecker.g:41:2: ( decl | use | serie )
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
			case SERIE:
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
					// DecluseChecker.g:41:4: decl
					{
					pushFollow(FOLLOW_decl_in_unit125);
					decl();
					state._fsp--;

					}
					break;
				case 2 :
					// DecluseChecker.g:42:4: use
					{
					pushFollow(FOLLOW_use_in_unit130);
					use();
					state._fsp--;

					}
					break;
				case 3 :
					// DecluseChecker.g:43:4: serie
					{
					pushFollow(FOLLOW_serie_in_unit135);
					serie();
					state._fsp--;

					}
					break;

			}
		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    } 

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "unit"



	// $ANTLR start "decl"
	// DecluseChecker.g:46:1: decl : ^( DECLTOKEN id= ID ) ;
	public final void decl() throws RecognitionException {
		CommonTree id=null;

		try {
			// DecluseChecker.g:47:2: ( ^( DECLTOKEN id= ID ) )
			// DecluseChecker.g:47:4: ^( DECLTOKEN id= ID )
			{
			match(input,DECLTOKEN,FOLLOW_DECLTOKEN_in_decl148); 
			match(input, Token.DOWN, null); 
			id=(CommonTree)match(input,ID,FOLLOW_ID_in_decl152); 
			match(input, Token.UP, null); 


						IdEntry entry = new IdEntry();
						entry.setLevel(symtab.currentLevel());
						try {
							symtab.enter(id.getText(), entry);
						} catch (SymbolTableException e) {
							throw new DeclException(id, "is already declared on this scope");
						}
					
			}

		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    } 

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "decl"



	// $ANTLR start "use"
	// DecluseChecker.g:59:1: use : ^( USETOKEN id= ID ) ;
	public final void use() throws RecognitionException {
		CommonTree id=null;

		try {
			// DecluseChecker.g:60:2: ( ^( USETOKEN id= ID ) )
			// DecluseChecker.g:60:4: ^( USETOKEN id= ID )
			{
			match(input,USETOKEN,FOLLOW_USETOKEN_in_use170); 
			match(input, Token.DOWN, null); 
			id=(CommonTree)match(input,ID,FOLLOW_ID_in_use174); 
			match(input, Token.UP, null); 


						IdEntry entry = symtab.retrieve(id.getText());
						if (entry == null) {
							throw new DeclException(id, "is not declared on the current scope");
						}
					
			}

		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    } 

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "use"

	// Delegated rules



	public static final BitSet FOLLOW_serie_in_decluse89 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SERIE_in_serie106 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_unit_in_serie108 = new BitSet(new long[]{0x0000000000002828L});
	public static final BitSet FOLLOW_decl_in_unit125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_use_in_unit130 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_serie_in_unit135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DECLTOKEN_in_decl148 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_decl152 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_USETOKEN_in_use170 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_use174 = new BitSet(new long[]{0x0000000000000008L});
}
