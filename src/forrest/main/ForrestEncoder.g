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
@init {
fw.openScope();
}
	:	((declaration)* expr {fw.writeLine();})* 
	{
		fw.closeScope();
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
	|	{
			boolean hasElse = false;
			int lIf = fw.getFreeIf();
		}
		^(EXPR_IF if_comp 
		{fw.writeIf(lIf);} 
		then_comp (
		{
			hasElse = true;
			fw.writeElse(lIf);
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