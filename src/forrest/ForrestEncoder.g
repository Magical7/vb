tree grammar ForrestEncoder;

options {
	tokenVocab=Forrest;
	ASTLabelType=ForrestTree;
}

@header {
	package forrest;
	import fire.ForrestFireException;
	import util.*;
}

@rulecatch {
	catch (RecognitionException e) {
		throw e;
	}
}

@members {
	private ForrestWriter fw = new ForrestWriter();
	public void setFile(String fileLocation){
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
			fw.print();
		}
	;

program_lines
	:	((declaration)* expr {fw.writeLine();})* 
		{ fw.writeProgramLines(); }
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
	|	{
			int lWhile = fw.getFreeWhile();
			fw.writeWhileStart(lWhile);
		}
		^(EXPR_WHILE while_comp 
		{
			fw.writeWhileCheck(lWhile);
		} 
		do_comp)
		{
			fw.writeWhileFinally(lWhile);
		}
	|	{
			boolean hasElse = false;
			int lIf = fw.getFreeIf();
			fw.writeIfStart();
		}
		^(EXPR_IF if_comp 
		{
			fw.writeIfCheck(lIf);
		}
		then_comp 
		{
			fw.writeIfAfterThen();
		}
		(
		{
			hasElse = true;
			fw.writeIfBeforeElse(lIf);
		} 
		else_comp)? )
		{
			if (!hasElse) {
				fw.writeIfFalse(lIf);
			} else {
				fw.writeIfFinally(lIf);
			}
		}
	|	^((LOGOR | LOGAND | GREATER | SMALLER | GREATEREQ | SMALLEREQ | EQUALS
			| NOTEQUALS | PLUS | MINUS | TIMES | DIVIDE | MODULO) expr expr)
		{fw.writeBinaryOp(t);}
	|	^((POSITIVE | NEGATIVE | NOT) expr)
		{fw.writeUnaryOp(t);}
	|   ^(COMPOUND program_lines)
	|	IDENTIFIER
		{
			fw.writeIdentifier(t);
		}
	|	NUMBER {fw.writeNumber(t);}
	|	(TRUE | FALSE) {fw.writeBoolean(t);}
	|	CHARACTER {fw.writeCharacter(t);}
	|	read
	|	print
	;

while_comp
	:	^(WHILE program_lines)
	;

do_comp
	:	^(DO program_lines)
	;

if_comp
	:	^(IF program_lines)
	;

then_comp
	:	^(THEN program_lines)
	;

else_comp
	:	^(ELSE program_lines)
	;
	
read
@init {
ForrestTree t = (ForrestTree)input.LT(1);
}
	:	^(READ (id=IDENTIFIER)+) 
		{fw.writeRead(t);}
	;
	
print
@init {
ForrestTree t = (ForrestTree)input.LT(1);
}
	:	^(PRINT (expr)+) 
		{fw.writePrint(t);}
	;
	
//	EOF	