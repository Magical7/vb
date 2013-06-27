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
@init {
ForrestTree t = (ForrestTree)input.LT(1);
}
	:	^(VAR id=IDENTIFIER (type=CHAR | type=BOOL | type=INT))
		{symtab.declareId(t);}
	|	^(CONSTANT id=IDENTIFIER expr)
		{symtab.declareConst(t);}
	;


expr
@init {
ForrestTree t = (ForrestTree)input.LT(1);
}
	: 	^(BECOMES id=IDENTIFIER expr)
		{
			symtab.setType($id);
			ExpressionChecker.checkAssign(t);
		}
	|	{boolean hasElse = false;}
		^(EXPR_IF 
		{symtab.openScope();} if_comp
		{symtab.openScope();} then_comp {symtab.closeScope();}
		 ({symtab.openScope(); hasElse=true;} else_comp {symtab.closeScope();})? )
		{
			if (hasElse) {
				ExpressionChecker.checkIfElse(t);
			} else {
				ExpressionChecker.checkIf(t);
			}
			symtab.closeScope();
		}
	|	^((LOGOR|LOGAND) expr expr)
		{ExpressionChecker.checkBinaryBoolean(t);}
	|	^((GREATER | SMALLER | GREATEREQ | SMALLEREQ) expr expr)
		{ExpressionChecker.checkComparison(t);}
	|	^((EQUALS | NOTEQUALS) expr expr)
		{ExpressionChecker.checkEquals(t);}
	|	^((PLUS | MINUS | TIMES | DIVIDE | MODULO) expr expr)
		{ExpressionChecker.checkBinaryInteger(t);}
	|	^((POSITIVE | NEGATIVE) expr)
		{ExpressionChecker.checkUnaryInteger(t);}
	|	^((NOT) expr)
		{ExpressionChecker.checkUnaryBoolean(t);}
	|   ^(COMPOUND {symtab.openScope();} program_lines)
		{
			symtab.closeScope();
			ExpressionChecker.setCompound(t);
		}
	|	IDENTIFIER {symtab.setType(t);}
	|	NUMBER {ExpressionChecker.setNumber(t);}
	|	(TRUE | FALSE) {ExpressionChecker.setBoolean(t);}
	|	CHARACTER {ExpressionChecker.setCharacter(t);}
	|	read
	|	print
	;

if_comp
@init {
ForrestTree t = (ForrestTree)input.LT(1);
}
	:	^(IF program_lines)
		{ExpressionChecker.setCompound(t);}
	;

then_comp
@init {
ForrestTree t = (ForrestTree)input.LT(1);
}
	:	^(THEN program_lines)
		{ExpressionChecker.setCompound(t);}
	;

else_comp
@init {
ForrestTree t = (ForrestTree)input.LT(1);
}
	:	^(ELSE program_lines)
		{ExpressionChecker.setCompound(t);}
	;

read
@init {
ForrestTree t = (ForrestTree)input.LT(1);
}
	:	^(READ (id=IDENTIFIER)+) 
		{ExpressionChecker.checkRead(t);}
	;
	
print
@init {
ForrestTree t = (ForrestTree)input.LT(1);
}
	:	^(PRINT (expr)+) 
		{ExpressionChecker.checkPrint(t);}
	;
	
//	EOF