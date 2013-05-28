// [file: CalcInterpreter.g, started: 22-Apr-2008]
//
// Calc - Simple calculator with memory variables.
// CalcInterpreter.g: interpreter
//
// @author   Theo Ruys
// @version  2008.04.22

tree grammar CalcCodeGenerator;

options {
    tokenVocab=Calc;                    // import tokens from Calc.tokens
    ASTLabelType=CommonTree;            // AST nodes are of type CommonTree
}

@header {
package vb.week4.xcalc;
import java.util.Map;
import java.util.HashMap;
import TAM.*;
import Triangle.CodeGenerator.*;
import java.io.PrintStream;
}

// private void emit(String label, String op, int n, int d, String r){
//		
//		out.println(label + "\t\t"+ op +"\t(" + n + ")\t" + d + "[" + r + "]");
//    }

@members { 
    private Map<String,Integer> store = new HashMap<String,Integer>();
    private int sp = 0;
    private int nWhile = 1;
    private int nIf = 1;
    private PrintStream out = System.out;  
    
    public void setOut(PrintStream out){
    	this.out = out;
    }
    
}


program
    :   ^(PROGRAM (declaration | statement)+) 
    	{
    		out.println("POP(0) " + sp);
    		out.println("ERROR: HALT");
    	}
    ;
    
declaration
@init { out.println("PUSH 1"); }
    :   ^(VAR id=IDENTIFIER type)
            { 
	            store.put($id.text, sp);
	            sp++;
            } 
    ;

statement 
    :   assignment
    |	dowhileStatement
    |   ^(PRINT v=expr)
            { 
            	out.println("CALL putint");
            	out.println("CALL puteol");
            }
    |	^(SWAP id1=IDENTIFIER id2=IDENTIFIER)
    		{ 	int val = store.get($id1.text);
    			store.put($id1.text, store.get($id2.text));
    			store.put($id2.text, val);
    		}
    ;
    
dowhileStatement
@init { int lWhile = nWhile; out.print("LWHILE" + lWhile + ": "); nWhile++; }
	:	^(DO statements WHILE v=expr_if)
		{
			out.println("LOADL 0");
			out.println("LOADL 1");
			out.println("CALL eq");
			out.println("JUMPIF(0) LWHILE" + lWhile + "[CB]"); 
		}
	;
	
statements
	:	(statement)+
	;

assignment
	:	^(BECOMES id=IDENTIFIER v=expr)
            {
            	out.println("STORE(1) " + store.get($id.text) + "[SB]");
            }
    ;
    
expr
	:	expr_assign
	;
	
expr_assign
	:	^(BECOMES id=IDENTIFIER ret=expr)	
		{ 
			out.println("STORE(1) " + store.get($id.text) + "[SB]");
			out.println("LOAD(1) " + store.get($id.text) + "[SB]");
		}
	|	expr_if
	;
    
expr_if
@init { int lIf = nIf; nIf++; }
    :	^(IF x=expr y=expr z=expr)
    	{
    		out.println("LOAD(1) -3[ST]");
    		out.println("JUMPIF(0) LELSE" + lIf + "[CB]");
    		out.println("POP(0) 1");
    		out.println("POP(1) 1");
    		out.println("JUMP LTHEN" + lIf + "[CB]");
    		out.println("LELSE"+ lIf + ":  POP(1) 2");
    		out.print("LTHEN" + lIf + ": ");
    	}
    |	expr_rel
    ;
    
expr_rel
    :   expr_plus
    |   ^(GREATER x=expr y=expr)  		{ out.println("CALL gt");}
    |   ^(SMALLER x=expr y=expr)  		{ out.println("CALL lt");}
    |   ^(GREATEREQ x=expr y=expr)  	{ out.println("CALL ge");}
    |   ^(SMALLEREQ x=expr y=expr)  	{ out.println("CALL le");}
    |   ^(EQUALS x=expr y=expr)  		{ out.println("LOADL 1"); out.println("CALL eq");}
    |   ^(NOTEQUALS x=expr y=expr)  	{ out.println("LOADL 1"); out.println("CALL ne");}
    ;
    
expr_plus
    :   expr_times
    |   ^(PLUS x=expr y=expr)  		{ out.println("CALL add");}
    |   ^(MINUS x=expr y=expr)  	{ out.println("CALL sub");}
    ;
    
expr_times
	:	operand
	|	^(TIMES x=expr y=expr)	{ out.println("CALL mult");}
	|	^(QUOTIENT x=expr y=expr) 
		{
	 		out.println("LOAD(1) -1[ST]");
	 		out.println("JUMPIF(0) ERROR[CB]");
	 		out.println("CALL div");
	 	}
	;
    
operand
    :   id=IDENTIFIER   { out.println("LOAD(1) "+ store.get($id.text)+"[SB]");       } 
    |   n=NUMBER        { out.println("LOADL " + $n.text);}
    ;
    
type
    :   INTEGER
    ;
