package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class CaseCommand extends Command {

	public CaseCommand (Expression eAST, Case caAST, Command coAST,
	        SourcePosition thePosition) {
	super (thePosition);
	E = eAST;
	CA = caAST;
	CO = coAST;
	}

	public Object visit(Visitor v, Object o) {
	return v.visitCaseCommand(this, o);
	}

	public Expression E;
	public Case CA;
	public Command CO;
	
}