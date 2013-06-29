package forrest.main;

public class StoreItem {
	
	// values to store the type, level and address of a variable and constant
	private Type type;
	private int address;
	private int level; //TODO: level is currently not used
	
	public StoreItem(Type type, int address, int scopeLevel){
		this.type = type;
		this.address = address;
		this.level = scopeLevel;
	}
	
	// Basic Getters and Setters
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
