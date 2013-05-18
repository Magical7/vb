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
    :   assignment
    |	dowhileStatement
    |   ^(PRINT v=expr)
            { System.out.println("" + v);   }
    |	^(SWAP id1=IDENTIFIER id2=IDENTIFIER)
    		{ 	int val = store.get($id1.text);
    			store.put($id1.text, store.get($id2.text));
    			store.put($id2.text, val);
    		}
    ;
    
dowhileStatement
@init { int ix = input.index(); }
	:	^(DO statements WHILE v=expr_if)
		{
			if (v != 0) {
				input.rewind(ix);
				dowhileStatement();
			}
		}
	;
	
statements
	:	(statement)+
	;

assignment
	:	^(BECOMES id=IDENTIFIER v=expr)
            { store.put($id.text, v);       }
    ;
    
expr returns [int val = 0; ]
	:	v=expr_assign {val = v; }
	;
	
expr_assign returns [int val = 0; ]
	:	^(BECOMES id=IDENTIFIER ret=expr)	
		{ 
			store.put($id.text, ret);
			val = ret; 
		}
	|	ret=expr_if	{ val = ret; }
	;
    
expr_if returns [int val = 0;]
    :	^(IF x=expr y=expr z=expr)
    	{
    		if (x != 0) {
    			val = y;
    		} else {
    			val = z;
    		}
    	}
    |	x=expr_rel		{ val = x;	}
    ;
    
expr_rel returns [int val = 0;] 
    :   z=expr_plus               { val = z;      }
    |   ^(GREATER x=expr y=expr)  		{ val = x > y ? 1 : 0;  }
    |   ^(SMALLER x=expr y=expr)  		{ val = x < y ? 1 : 0;  }
    |   ^(GREATEREQ x=expr y=expr)  		{ val = x >= y ? 1 : 0;  }
    |   ^(SMALLEREQ x=expr y=expr)  		{ val = x <= y ? 1 : 0;  }
    |   ^(EQUALS x=expr y=expr)  		{ val = x == y ? 1 : 0;  }
    |   ^(NOTEQUALS x=expr y=expr)  		{ val = x != y ? 1 : 0;  }
    ;
    
expr_plus returns [int val = 0;] 
    :   z=expr_times               { val = z;      }
    |   ^(PLUS x=expr y=expr)  		{ val = x + y;  }
    |   ^(MINUS x=expr y=expr)  		{ val = x - y;  }
    ;
    
expr_times returns [int val = 0;]
	:	z=operand					{ val = z;		}
	|	^(TIMES x=expr y=expr)	{ val = x * y; 	}
	|	^(QUOTIENT x=expr y=expr) { if (y == 0) { 
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
