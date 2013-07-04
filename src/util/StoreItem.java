package util;

public class StoreItem {
	
	// values to store the type, level and address of a variable and constant
	/** The type of this StoreItem (currently: INT/BOOL/CHAR/VOID) */
	private Type type;
	/** The address of this StoreItem */
	private int address;
	/** The scopelevel of this StoreItem */
	private int level;
	
	/**
	 * Constructor 
	 * @param type - Type: The type of this StoreItem (currently: INT/BOOL/CHAR/VOID)
	 * @param address - int: The address of this StoreItem
	 * @param scopeLevel - int: The scopelevel of this StoreItem
	 */
	public StoreItem(Type type, int address, int scopeLevel){
		this.type = type;
		this.address = address;
		this.level = scopeLevel;
	}
	
	/** Basic Getters and Setters */
	public void setType(Type type){
		this.type = type;
	}
	
	public Type getType(){
		return this.type;
	}
	
	public void setAddress(int address){
		this.address = address;
	}

	public int getAddress(){
		return this.address;
	}
	
	public void setScopeLevel(int level){
		this.level = level;
	}
	
	public int getScopeLevel(){
		return this.level;
	}
}
