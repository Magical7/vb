package util;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import fire.ForrestFireException;
import forrest.ForrestTree;

/**
 * Keeps track of all identifiers used in a Forrest application
 */
public class IdStore {
    // A set of currently declared identifiers.
    private Stack<HashMap<String, StoreItem>> liveIdSet = new Stack<HashMap<String, StoreItem>>();
    
    public IdStore() {
    }
    	
	/** Opens a new scope. */
    public void openScope()  {
        liveIdSet.push(new HashMap<String, StoreItem>());
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
    public Map<String, StoreItem> currentScope() {
        return liveIdSet.peek();
    }
    
    /**
     * Declares the identifier for the current scope
     * @param id - the identifier to declare
     * @param type - the type of the id
     * @param address - the absolute address of the id
     */
    public void declare(String id, Type type, int address) {
    	StoreItem entry = new StoreItem(type, address, currentLevel());
		this.currentScope().put(id, entry);
    }
    
    /**
     * Retrieve an item
     * @param id - id of the requested item 
     */
    public StoreItem getItem(String id)  {
    	StoreItem storeItem = null;
    	for (int i = currentLevel(); storeItem == null && i >= 0; i--) {
    		Map<String, StoreItem> scopeSet = liveIdSet.get(i);
    		if (scopeSet.containsKey(id)) {
    			storeItem = scopeSet.get(id);
    		}
    	}
    	return storeItem;
    }
    
    /**
     * @param id - id of the requested item
     * @return the absolute address of the given identifier
     */
    public int getAddress(String id)  {
    	return this.getItem(id).getAddress();
    }
    
    /**
     * @return the number of declared identifiers in the current scope
     */
	public int getCurrentScopeSize() {
		return currentScope().size();
	}
}
