// [file: CalcInterpreter.g, started: 22-Apr-2008]
//
// Calc - Simple calculator with memory variables.
// CalcInterpreter.g: interpreter
//
// @author   Theo Ruys
// @version  2008.04.22

tree grammar CalcInterpreter;

options {
    tokenVocab=Calc;                    // import tokens from Calc.tokens
    ASTLabelType=CommonTree;            // AST nodes are of type CommonTree
}

@header {
package vb.week3.calc;
import java.util.Map;
import java.util.HashMap;
}

@members { 
    private Map<String,Integer> store = new HashMap<String,Integer>();   
}

program
    :   ^(PROGRAM (declaration | statement)+)
    ;
    
declaration
    :   ^(VAR id=IDENTIFIER type)
            { store.put($id.text, 0); } 
    ;

statement 
    :   ^(BECOMES id=IDENTIFIER v=expr1)
            { store.put($id.text, v);       }
    |   ^(PRINT v=expr1)
            { System.out.println("" + v);   }
    |	^(SWAP id1=IDENTIFIER id2=IDENTIFIER)
    		{ 	int val = store.get($id1.text);
    			store.put($id1.text, store.get($id2.text));
    			store.put($id2.text, val);
    		}
    ;
    
expr1 returns [int val = 0;] 
    :   z=expr2               { val = z;      }
    |   ^(PLUS x=expr1 y=expr1)   { val = x + y;  }
    |   ^(MINUS x=expr1 y=expr1)  { val = x - y;  }
    ;
    
expr2 returns [int val = 0;]
	:	z=operand					{ val = z;		}
	|	^(TIMES x=expr2 y=expr2)	{ val = x * y; 	}
	|	^(QUOTIENT x=expr2 y=expr2) { if (y == 0) { 
			CalcException e = new CalcException("Divide by zero");
			e.input = input;
			throw e;
 			} else { val = x / y; }	}
	;
    
operand returns [int val = 0]
    :   id=IDENTIFIER   { val = store.get($id.text);       } 
    |   n=NUMBER        { val = Integer.parseInt($n.text); }
    ;
    
type
    :   INTEGER
    ;
