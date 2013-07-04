package forrest;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTreeAdaptor;

/**
 * Class used by the ANTLR library to make sure ForrestTrees are used instead of CommonTrees
 *
 */
public class ForrestTreeAdaptor extends CommonTreeAdaptor {
	
	/**
	 * Overriden method used by antlr to generate ForrestNodes when building the tree
	 */
	@Override
	public Object create(Token t){
		return new ForrestTree(t);
	}
}
