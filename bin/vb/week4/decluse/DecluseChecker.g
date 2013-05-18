tree grammar DecluseChecker;

options {
    tokenVocab=Decluse;                    // import tokens from Calc.tokens
    ASTLabelType=CommonTree;            // AST nodes are of type CommonTree
}

@header {
package vb.week4.decluse;
import java.util.Set;
import java.util.HashSet;
}

// Alter code generation so catch-clauses get replaced with this action. 
// This disables ANTLR error handling: Exceptions are propagated upwards.
@rulecatch { 
    catch (RecognitionException e) { 
        throw e; 
    } 
}

@members {
    // idset - a set of declared identifiers.
    private SymbolTable symtab = new SymbolTable();
}


decluse
	:	serie
	;

serie
@init { symtab.openScope(); }
	:	^(SERIE unit*)
		{
			symtab.closeScope();
		}
	;

unit
	:	decl
	|	use
	|	serie
	;
	
decl
	:	^(DECLTOKEN id=ID)
		{
			IdEntry entry = new IdEntry();
			entry.setLevel(symtab.currentLevel());
			try {
				symtab.enter($id.getText(), entry);
			} catch (SymbolTableException e) {
				throw new DeclException($id, "is already declared on this scope");
			}
		}
	;
	
use
	:	^(USETOKEN id=ID)
		{
			IdEntry entry = symtab.retrieve($id.getText());
			if (entry == null) {
				throw new DeclException($id, "is not declared on the current scope");
			}
		}
	;
