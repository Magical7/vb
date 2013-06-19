package forrest.main;

import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.Token;

/**
 * User-defined class for keeping track of the return type of a node
 *
 */
public class ForrestTree extends CommonTree {

	/* The return type */ 
	protected Type returnType;
	
	/**
	 * The constructors
	 */
	public ForrestTree(){
		super();
	}
	
	public ForrestTree(ForrestTree forrestTree) {
		super(forrestTree);
	}

	public ForrestTree(Token t) {
		super(t);
	}

	@Override
	public ForrestTree dupNode(){
		return new ForrestTree(this);
	}
	
	/** Getters and setters */
	public void setReturnType(Type type){
		this.returnType = type;
	}
	
	public Type getReturnType(){
		return this.returnType;
	}
	
	/**
	 * Override of toString
	 */
	@Override
	public String toString(){
		String s = super.toString();
		return s + "Type: " + returnType.toString();
	}
	
}
