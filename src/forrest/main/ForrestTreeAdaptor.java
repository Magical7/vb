package forrest.main;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTreeAdaptor;


public class ForrestTreeAdaptor extends CommonTreeAdaptor {
	
	public Object create(Token t){
		return new ForrestTree(t);
	}
}
