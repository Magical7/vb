package forrest.main;

import java.util.List;

import fire.ForrestFireException;

/**
 * Class to check validity of expressions and sets the return types of their parents
 */
public class ExpressionChecker {
	
	/**
	 * Check whether the types of two expressions match and sets the return type
	 	of the parent node to that type if they do
	 * @param t - the parent tree node
	 * @param expr1 - one expression
	 * @param expr2 - the other expression
	 * @throws ForrestFireException if the expressions do not match
	 */
	public static void checkAssign(ForrestTree t, ForrestTree expr1, ForrestTree expr2) throws ForrestFireException {
		if (expr1.getReturnType() != expr2.getReturnType()) {
			throw new ForrestFireException(expr2, "does not match type of " + expr1.getReturnType());
		} else {
			t.setReturnType(expr1.getReturnType());
		}
	}
	
	/**
	 * Check whether an if-else-statement is correct
	 * @param t - the parent tree node
	 * @param expr1 - the condition
	 * @param expr2 - the then-statement
	 * @param expr3 - the else-statement
	 * @throws ForrestFireException if the expressions do not match
	 */
	public static void checkIfElse(ForrestTree t, ForrestTree expr1, ForrestTree expr2, ForrestTree expr3) throws ForrestFireException {
		if (expr1.getReturnType() != Type.BOOL) {
			throw new ForrestFireException(expr1, "is not of type boolean");
		} else {
			if (expr2.getReturnType() == expr3.getReturnType()) {
				t.setReturnType(expr2.getReturnType());
			} else {
				t.setReturnType(Type.VOID);
			}
		}
	}
	
	/**
	 * Check whether an if-statement is correct
	 * @param t - the parent tree node
	 * @param expr1 - the condition
	 * @param expr2 - the then-statement
	 * @throws ForrestFireException if the expressions do not match
	 */
	public static void checkIf(ForrestTree t, ForrestTree expr1, ForrestTree expr2) throws ForrestFireException {
		if (expr1.getReturnType() != Type.BOOL) {
			throw new ForrestFireException(expr1, "is not of type boolean");
		} else {
			t.setReturnType(Type.VOID);
		}
	}
	
	/**
	 * Check whether a binary boolean operation is correct
	 * @param t - the parent node
	 * @param expr1 - one expression
	 * @param expr2 - another expression
	 * @throws ForrestFireException if the operation is not correct
	 */
	public static void checkBinaryBoolean(ForrestTree t, ForrestTree expr1, ForrestTree expr2) throws ForrestFireException {
		if (expr1.getReturnType() != Type.BOOL){
			throw new ForrestFireException(expr1, "is not of type boolean");
		} else if (expr2.getReturnType() != Type.BOOL){
			throw new ForrestFireException(expr2, "is not of type boolean");
		} else {
			t.setReturnType(Type.BOOL);
		}
	}
	
	/**
	 * Check whether a comparison between integers is correct
	 * @param t - the parent node
	 * @param expr1 - one expression
	 * @param expr2 - another expression
	 * @throws ForrestFireException if the operation is not correct
	 */
	public static void checkComparison(ForrestTree t, ForrestTree expr1, ForrestTree expr2) throws ForrestFireException {
		if (expr1.getReturnType() != Type.INT){
			throw new ForrestFireException(expr1, "is not of type integer");
		} else if (expr2.getReturnType() != Type.INT){
			throw new ForrestFireException(expr2, "is not of type integer");
		} else {
			t.setReturnType(Type.BOOL);
		}
	}
	
	/**
	 * Check whether a comparison between two expressions is correct
	 * @param t - the parent node
	 * @param expr1 - one expression
	 * @param expr2 - another expression
	 * @throws ForrestFireException if the operation is not correct
	 */
	public static void checkEquals(ForrestTree t, ForrestTree expr1, ForrestTree expr2) throws ForrestFireException {
		if (expr1.getReturnType() != expr2.getReturnType()){
			throw new ForrestFireException(expr2, "does not match the type of " + expr1.getReturnType());
		} else {
			t.setReturnType(Type.BOOL);
		}
	}
	
	/**
	 * Check whether an operation with integers is correct
	 * @param t - the parent node
	 * @param expr1 - one expression
	 * @param expr2 - another expression
	 * @throws ForrestFireException if the operation is not correct
	 */
	public static void checkBinaryInteger(ForrestTree t, ForrestTree expr1, ForrestTree expr2) throws ForrestFireException {
		if (expr1.getReturnType() != Type.INT){
			throw new ForrestFireException(expr1, "is not of type integer");
		} else if (expr2.getReturnType() != Type.INT){
			throw new ForrestFireException(expr2, "is not of type integer");
		} else {
			t.setReturnType(Type.INT);
		}
	}
	
	/**
	 * Check whether an operation with an integer is correct
	 * @param t - the parent node
	 * @param expr1 - original expression
	 * @throws ForrestFireException if the operation is not correct
	 */
	public static void checkUnaryInteger(ForrestTree t, ForrestTree expr1) throws ForrestFireException {
		if (expr1.getReturnType() != Type.INT){
			throw new ForrestFireException(expr1, "is not of type integer");
		} else {
			t.setReturnType(Type.INT);
		}
	}
	
	/**
	 * Check whether an operation with a boolean is correct
	 * @param t - the parent node
	 * @param expr1 - original expression
	 * @throws ForrestFireException if the operation is not correct
	 */
	public static void checkUnaryBoolean(ForrestTree t, ForrestTree expr1) throws ForrestFireException {
		if (expr1.getReturnType() != Type.BOOL){
			throw new ForrestFireException(expr1, "is not of type boolean");
		} else {
			t.setReturnType(Type.BOOL);
		}
	}
	
	/**
	 * Check whether a read operation is correct
	 * @param t - the parent node
	 * @param ids - a list of identifier nodes
	 */
	public static void checkRead(ForrestTree t, List<ForrestTree> ids) {
		if (ids.size() == 1) {
			t.setReturnType(ids.get(0).getReturnType());
		} else {
			t.setReturnType(Type.VOID);
		}
	}
	
	/**
	 * Check whether a print operation is correct
	 * @param t - the parent node
	 * @param exprs - a list of expressions
	 * @throws ForrestFireException - if there is a problem in the arguments
	 */
	public static void checkPrint(ForrestTree t, List<ForrestTree> exprs) throws ForrestFireException {
		for(int i = 0; i < exprs.size(); i++) {
			if (exprs.get(i).getReturnType() == Type.VOID) {
				throw new ForrestFireException(exprs.get(i), "is of type void");
			}
		}
		if (exprs.size() == 1) {
			t.setReturnType(exprs.get(0).getReturnType());
		} else {
			t.setReturnType(Type.VOID);
		}
	}

}
