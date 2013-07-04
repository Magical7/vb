package forrest;

import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.Token;

import util.Type;

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

	/**
	 * Method must be overriden, otherwise antlr will still use CommonTree
	 */
	@Override
	public ForrestTree dupNode(){
		return new ForrestTree(this);
	}
	
	/** Set the return type of this node */
	public void setReturnType(Type type){
		this.returnType = type;
	}
	
	/** @return the return type of this node */
	public Type getReturnType(){
		return this.returnType;
	}
	
	/**
	 * Override of toString
	 */
	@Override
	public String toString(){
		String s = super.toString();
		return s;
		//return s + " Type: " + ((returnType != null) ? returnType.toString() : "_");
	}
	
}
