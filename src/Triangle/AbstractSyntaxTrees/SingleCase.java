package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class SingleCase extends Case {
	
	public SingleCase (IntegerLiteral ilAST, Command cAST, SourcePosition thePosition) {
	    super (thePosition);
	    IL = ilAST;
	    C = cAST;
	  }

	  public Object visit(Visitor v, Object o) {
	    return v.visitSingleCase(this, o);
	  }

	  public IntegerLiteral IL;
	  public Command C;

}
