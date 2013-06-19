tree grammar ForrestChecker;

options {
	tokenVocab=Forrest;
	ASTLabelType=ForrestTree;
}

@header {
	package forrest.main;
	import fire.ForrestFireException;
}

@rulecatch {
	catch (RecognitionException e) {
		throw e;
	}
}

@members {
	// Keep track of identifiers
	private SymbolTable symtab = new SymbolTable();
}

// Ruleset


forrest
	:   ^(PROGRAM {symtab.openScope();} program_lines) {symtab.closeScope();}
    ;
    
program_lines
	:	((declaration)* expr)*
	;

declaration
	:	^(VAR id=IDENTIFIER (type=CHAR | type=BOOL | type=INT))
		{symtab.declareId($id, type);}
	|	^(CONSTANT id=IDENTIFIER
		{ForrestTree ex=(ForrestTree)input.LT(1);} expr)
		{symtab.declareConst($id, ex);}
	;


expr
@init {
ForrestTree t = (ForrestTree)input.LT(1);
ForrestTree ex1 = (ForrestTree)input.LT(2);
ForrestTree ex2 = (ForrestTree)input.LT(3);
ForrestTree ex3 = (ForrestTree)input.LT(4);}
	: 	^(BECOMES id=IDENTIFIER expr) 
		{
			symtab.setType($id);
			ExpressionChecker.checkAssign(t, $id, ex2);
		}
	|	{boolean hasElse = false;}
		^(IF expr expr (expr)? )
		{
			if (hasElse) {
				ExpressionChecker.checkIfElse(t, ex1, ex2, ex3);
			} else {
				ExpressionChecker.checkIf(t, ex1, ex2);
			}
		}
	|	^((LOGOR|LOGAND) expr expr)
		{ExpressionChecker.checkBinaryBoolean(t, ex1, ex2);}
	|	^((GREATER | SMALLER | GREATEREQ | SMALLEREQ) expr expr)
		{ExpressionChecker.checkComparison(t, ex1, ex2);}
	|	^((EQUALS | NOTEQUALS) expr expr)
		{ExpressionChecker.checkEquals(t, ex1, ex2);}
	|	^((PLUS | MINUS | TIMES | DIVIDE | MODULO) expr expr)
		{ExpressionChecker.checkBinaryInteger(t, ex1, ex2);}
	|	^((POSITIVE | NEGATIVE) expr)
		{ExpressionChecker.checkUnaryInteger(t, ex1);}
	|	^((NOT) expr)
		{ExpressionChecker.checkUnaryBoolean(t, ex1);}
	|   ^(COMPOUND {symtab.openScope();} program_lines) {symtab.closeScope();}
	|	IDENTIFIER {symtab.setType(t);}
	|	NUMBER
	|	read
	|	print
	;
	
read
@init {
ForrestTree t = (ForrestTree)input.LT(1);
List<ForrestTree> ids = new ArrayList<ForrestTree>();
}
	:	^(READ (id=IDENTIFIER {
			symtab.setType($id);
			ids.add($id);
			}
		)+) {ExpressionChecker.checkRead(t, ids);}
	;
	
print
@init {
ForrestTree t = (ForrestTree)input.LT(1);
List<ForrestTree> exprs = new ArrayList<ForrestTree>();
}
	:	^(PRINT (
			{
				ForrestTree expression = (ForrestTree)input.LT(1);
				symtab.setType(expression);
				exprs.add(expression);
			}
			expr
		)+) {ExpressionChecker.checkPrint(t, exprs);}
	;
	
//	EOF