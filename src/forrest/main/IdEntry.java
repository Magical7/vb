package forrest.main;

/**
 * Class representing an identifier
 */
public class IdEntry {
	private Type type;
	
	/**
	 * Make a new entry
	 * @param type - the type of the entry
	 */
	public IdEntry(Type type) {
		this.type = type;
	} 
	
	/**
	 * @return the type of this entry
	 */
	public Type getType() {
		return this.type;
	}
}
