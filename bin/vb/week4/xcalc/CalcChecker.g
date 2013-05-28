tree grammar CalcChecker;

options {
    tokenVocab=Calc;                    // import tokens from Calc.tokens
    ASTLabelType=CommonTree;            // AST nodes are of type CommonTree
}

@header {
package vb.week4.xcalc;
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
    |	dowhileStatement
    |   ^(PRINT expr)
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
    
dowhileStatement
	:	^(DO statements WHILE expr_if)
	;
	
statements
	:	(statement)+
	;
    
assignment
	:	^(BECOMES id=IDENTIFIER expr)
        {   if (!isDeclared($id.text))
                throw new CalcException($id, "is not declared");
            setStat();
        }
    ;
    
expr
	:	expr_assign
	;

expr_assign
	:	^(BECOMES expr_if expr)
	|	expr_if
	;
    
expr_if
	:	^(IF expr expr expr)
	|	expr_rel
	;
    
expr_rel
    :   expr_plus
    |   ^(GREATER expr expr)
    |   ^(SMALLER expr expr)
    |   ^(GREATEREQ expr expr)
    |   ^(SMALLEREQ expr expr)
    |   ^(EQUALS expr expr)
    |   ^(NOTEQUALS expr expr)
    ;
    
expr_plus
    :   expr_times
    |   ^(PLUS expr expr)
    |   ^(MINUS expr expr)
    ;
    
expr_times
	:	operand
	|	^(TIMES expr expr)
	|	^(QUOTIENT expr expr)
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
