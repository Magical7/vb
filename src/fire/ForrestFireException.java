package fire;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.Tree;

/**
 * Exception used by the Forrest.java file to give errors when running
 *
 */
public class ForrestFireException extends RecognitionException {

	private String message;
	public static final long serialVersionUID = 24162462L; // for Serializable

	public ForrestFireException(String message){
		super();
		this.message = message;
	}
	
	public ForrestFireException(Tree tree, String message) {
		super();
		this.message = tree.getText() + 
				"(" + tree.getLine() + 
				":" + tree.getCharPositionInLine() + 
				")" + message;
	}
	
	@Override
	public String getMessage(){
		return message;
	}
	
}
