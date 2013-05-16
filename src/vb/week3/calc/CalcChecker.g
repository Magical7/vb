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
    private boolean lastLineDecl = false;
    
    public boolean  isDeclared(String s)     { return idset.contains(s); }
    public void     declare(String s)        { idset.add(s);             }
    public void		setDecl()				{ lastLineDecl = true;				}
    public void		setStat()				{ lastLineDecl = false;				}
    public boolean	isLastLineDecl()				{ return lastLineDecl;				}
    
}

program
    :   ^(PROGRAM (declaration | statement)+)
    	{
    		if (isLastLineDecl()) {
    			throw new CalcException("Program may not end in a declaration");
    		}
    	}
    ;
    
declaration
    :   ^(VAR id=IDENTIFIER type)
        {   if (isDeclared($id.text))
                throw new CalcException($id, "is already declared");
            else 
                declare($id.getText()); 
            setDecl();
        }
    ;
 
statement 
    :   assignment
    |   ^(PRINT expr_if)
    	{
    		setStat();
    	}
    |	^(SWAP id1=IDENTIFIER id2=IDENTIFIER)
    	{	if (!isDeclared($id1.text)) {
                throw new CalcException($id1, "is not declared");
            } else if(!isDeclared($id2.text)) {
                throw new CalcException($id2, "is not declared");
            }
            setStat();
        }
    ;
    
assignment
	:	^(BECOMES id=IDENTIFIER assignment_mul)
        {   if (!isDeclared($id.text))
                throw new CalcException($id, "is not declared");
            setStat();
        }
    ;

assignment_mul
	:	expr_if
	|	^(BECOMES id=IDENTIFIER assignment_mul)
        {   if (!isDeclared($id.text))
                throw new CalcException($id, "is not declared");
            setStat();
        }
    ;
    
expr_if
	:	^(IF expr_if expr_if expr_if)
	|	expr_rel
	;
    
expr_rel
    :   expr_plus
    |   ^(GREATER expr_rel expr_rel)
    |   ^(SMALLER expr_rel expr_rel)
    |   ^(GREATEREQ expr_rel expr_rel)
    |   ^(SMALLEREQ expr_rel expr_rel)
    |   ^(EQUALS expr_rel expr_rel)
    |   ^(NOTEQUALS expr_rel expr_rel)
    ;
    
expr_plus
    :   expr_times
    |   ^(PLUS expr_plus expr_plus)
    |   ^(MINUS expr_plus expr_plus)
    ;
    
expr_times
	:	operand
	|	^(TIMES expr_times expr_times)
	|	^(QUOTIENT expr_times expr_times)
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
