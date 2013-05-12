tree grammar CalcChecker;

options {
    tokenVocab=Calc;                    // import tokens from Calc.tokens
    ASTLabelType=CommonTree;            // AST nodes are of type CommonTree
}

@header {
package vb.week3.calc;
import java.util.Set;
import java.util.HashSet;
}

// Alter code generation so catch-clauses get replaced with this action. 
// This disables ANTLR error handling: CalcExceptions are propagated upwards.
@rulecatch { 
    catch (RecognitionException e) { 
        throw e; 
    } 
}

@members {
    // idset - a set of declared identifiers.
    private Set<String> idset = new HashSet<String>();   
    
    public boolean  isDeclared(String s)     { return idset.contains(s); }
    public void     declare(String s)        { idset.add(s);             }
}

program
    :   ^(PROGRAM (declaration | statement)+)
    ;
    
declaration
    :   ^(VAR id=IDENTIFIER type)
        {   if (isDeclared($id.text))
                throw new CalcException($id, "is already declared");
            else 
                declare($id.getText()); 
        }
    ;
 
statement 
    :   ^(BECOMES id=IDENTIFIER expr1)
        {   if (!isDeclared($id.text))
                throw new CalcException($id, "is not declared");
        }
    |   ^(PRINT expr1)
    |	^(SWAP id1=IDENTIFIER id2=IDENTIFIER)
    	{	if (!isDeclared($id1.text)) {
                throw new CalcException($id1, "is not declared");
            } else if(!isDeclared($id2.text)) {
                throw new CalcException($id2, "is not declared");
            }
        }
    ;
    
expr1 
    :   expr2
    |   ^(PLUS expr1 expr1)
    |   ^(MINUS expr1 expr1)
    ;
    
expr2
	:	operand
	|	^(TIMES expr2 expr2)
	|	^(QUOTIENT expr2 expr2)
	;
    
operand
    :   id=IDENTIFIER 
        {   if (!isDeclared($id.text))
                throw new CalcException($id, "is not declared");
        }
    |   n=NUMBER 
    ;
    
type
    :   INTEGER
    ;
