tree grammar ForrestEncoder;

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
	} catch (IOException e) {
		throw e;
	}
}

@members {
	// Keep track of identifiers
	private SymbolTable symtab = new SymbolTable();
	
	private ForrestWriter fw = new ForrestWriter();
	private void setFile(String fileLocation){
		fw.setFile(fileLocation);
	}
}

// Ruleset

forrest
@init {
fw.startProgram();
}
	:	^(PROGRAM program_lines)
		{
			fw.writeProgram();
		}
	;
	
program_lines
	:	((declaration)* expr)* 
	{
		fw.writeProgramLines();
	}
	;
	
declaration
@init {
ForrestTree t = (ForrestTree)input.LT(1);
}
	:	^(VAR IDENTIFIER (CHAR|BOOL|INT))
		{
			fw.writeDeclarationVar(t);
		}
	|	^(CONSTANT IDENTIFIER expr)
		{
			fw.writeDeclarationConstant(t);
		}
	;
	
expr
@init {
ForrestTree t = (ForrestTree)input.LT(1);
}
	: 	^(BECOMES id=IDENTIFIER expr)
		{
			fw.writeBecomes(t);
		}
	|	{boolean hasElse = false;}
		^(IF expr expr ({hasElse=true;}expr)? )
		{
			if (hasElse) {
				fw.writeIfElse();
			} else {
				fw.writeIf();
			}
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