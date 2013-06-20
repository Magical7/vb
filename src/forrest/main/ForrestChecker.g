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
	// Maximum amount of arguments to an expression
	private static final int MAXARGS = 3;
	
	/** @return the arguments to an expression */
	private List<ForrestTree> getArguments() {
		int i = 2;
		int level = 0;
		boolean getNext = true;
		List<ForrestTree> result = new ArrayList<ForrestTree>();
		CommonTree next = (CommonTree) input.LT(i);
		while (result.size() < MAXARGS && next != null) {
			if (next instanceof ForrestTree && (level == 0 || getNext)) {
				/* next is a ForrestTree on the same level as the parent or is
				 * the first ForrestTree one level down */
				result.add((ForrestTree) next);
				// Only say getNext if the current level is 0 again
				getNext = level == 0;
			} else if (next.getType() == Token.DOWN) {
				level++;
			} else if (next.getType() == Token.UP) {
				level--;
				// Reset getNext if parent level is reached
				getNext = level == 0;
			}
			
			i++;
			next = (CommonTree) input.LT(i);
		}
		return result;
	}
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
List<ForrestTree> args = this.getArguments();
ForrestTree ex1 = args.get(0);
ForrestTree ex2 = args.get(1);
ForrestTree ex3 = args.get(2);
}
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