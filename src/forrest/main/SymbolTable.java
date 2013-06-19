package forrest.main;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import fire.ForrestFireException;

/**
 * Keeps track of all identifiers used in a Forrest application
 */
public class SymbolTable<Entry extends IdEntry> {
    // A set of currently declared identifiers.
    private Stack<HashMap<String, IdEntry>> liveIdSet = new Stack<HashMap<String, IdEntry>>();
    // All identifiers that have been used thus far.
    private Set<String> pastIdSet = new HashSet<String>();
    // All constants up to this point
    private Set<String> constantSet = new HashSet<String>();
    	
	/** Opens a new scope. */
    public void openScope()  {
        liveIdSet.push(new HashMap<String, IdEntry>());
    }

    /** Closes the current scope. */
    public void closeScope() {
        liveIdSet.pop();
    }

    /** Returns the current scope level. */
    public int currentLevel() {
        return liveIdSet.size() - 1;
    }

    /** Returns the current scope level. */
    public Map<String, IdEntry> currentScope() {
        return liveIdSet.peek();
    }
    
    /** 
     * Declare an identifier
     * @param id - the identifier tree node 
     * @param type - the type associated with the id
     * @throws ForrestFireException if the identifier has been used for any 
     *	constant or if the identifier already exists in the current scope.
     */
    protected void declareId(ForrestTree id, ForrestTree type) throws ForrestFireException {
    	if (isDeclaredConstant(id.getText())) {
    		throw new ForrestFireException(id, "is a declared constant.");
    	} else if (isDeclaredVariable(id.getText())) {
    		throw new ForrestFireException(id, "is already declared on the current scope.");
    	} else {
    		declare(id.getText(), Type.valueOf(type.getText()));
    	}
    }
    
    /**
     * @param id - the identifier to look for
     * @return true if the identifier has been used as a constant, false otherwise
     */
    protected boolean isDeclaredConstant(String id) {
    	return constantSet.contains(id);
    }
    
    /**
     * @param id - the identifier to look for
     * @return true if the identifier is declared on the current scope, false otherwise
     */
    protected boolean isDeclaredVariable(String id) {
    	return this.currentScope().containsKey(id);
    }
    
    /**
     * Declares the identifier for the current scope
     * @param id - the identifier to declare
     */
    protected void declare(String id, Type type) {
    	IdEntry entry = new IdEntry(type);
		this.currentScope().put(id, entry);
		this.addToPast(id);
    }
    
    /**
     * Add an id to the list of all used id's
     * @param id - the id
     */
    protected void addToPast(String id) {
    	if (!pastIdSet.contains(id)) {
    		pastIdSet.add(id);
    	}
    }
    
    /**
     * Declare a constant
     * @param id - the id of the constant
     * @param expr - the value of the constant as an expression
     * @throws ForrestFireException if the identifier has been used already or
     	if the constant is declared inside a nested scope
     */
    protected void declareConst(ForrestTree id, ForrestTree expr) throws ForrestFireException {
    	if (this.currentLevel() != 0) {
    		throw new ForrestFireException(id, "can not be declared inside a nested scope");
    	} else if (this.hasBeenUsed(id.getText())) {
    		throw new ForrestFireException(id, "has been used at one point in the code");
    	} else if (expr.getReturnType() == Type.VOID) {
    		throw new ForrestFireException(expr, "may not be of type void");
    	} else {
    		declare(id.getText(), expr.getReturnType());
    		constantSet.add(id.getText());
    	}
    }
    
    /**
     * @param id - the id to check for
     * @return true if the id has been used anywhere in the code up until now,
     	false otherwise.
     */
    protected boolean hasBeenUsed(String id) {
    	return pastIdSet.contains(id);
    }
    
    /**
     * Set the type for a ForrestTree node that is an identifier
     * @param id - ForrestTree that needs its type set 
     * @throws ForrestFireException if the id has not been declared yet
     */
    public void setType(ForrestTree id) throws ForrestFireException {
    	Type type = null;
    	for (int i = 0; type == null && i >= 0; i--) {
    		Map<String, IdEntry> scopeSet = liveIdSet.get(i);
    		if (scopeSet.containsKey(id.getText())) {
    			type = scopeSet.get(id.getText()).getType();
    		}
    	}
    	if (type == null) {
    		throw new ForrestFireException(id, "has not been declared");
    	} else {
    		id.setReturnType(type);
    	}
    }
}
