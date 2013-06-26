package forrest.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class ForrestWriter {
	
	/** Output method */
	private FileWriter fileWriter;
	
	private ArrayList<String> instructions = new ArrayList<String>();
	
	//Store for storing the variables and address locations
	private IdStore store = new IdStore();
	
	private int nIf = 0;
	
	public ForrestWriter(){
	}
	
	/**
	 * Change the file location
	 * @param fileLocation
	 */
	public void setFile(String fileLocation){
		try {
			fileWriter = new FileWriter(new File(fileLocation));
		} catch (IOException e) {
			System.err.println("Error in creating file: " + fileLocation);
		}
	}
	
	public void putStore(String id, Type type){
		store.declare(id, type);
	}
	
	//Used to reserve room for the error code on the stack
	public void startProgram(){
		instructions.add("PUSH 1");
    	store.openScope();
    	store.declare("7ERROR", Type.INT);
	}

	/**
	 * Write the code after a program-rule
	 * @throws IOException
	 */
	public void writeProgram() throws IOException{
		instructions.add("POP(0) " + store.getCurrentScopeSize());
		instructions.add("HALT");
		instructions.add("ERROR: LOAD(1) " + this.calculateAddressString("7ERROR"));
		instructions.add("CALL putint");
		instructions.add("HALT");
	}
	
	public void writeProgramLines() throws IOException{
		instructions.remove(instructions.size()-1);
	}
	
	public void writeDeclarationVar(ForrestTree t) throws IOException{
		instructions.add("PUSH 1");
		String id = t.getChild(0).getText();
		Type type = Type.valueOf(t.getChild(1).getText().toUpperCase());
		putStore(id, type);
	}
	
	public void writeDeclarationConstant(ForrestTree t) throws IOException{
		instructions.add("PUSH 1");
		String id = t.getChild(0).getText();
		Type type = ((ForrestTree)t.getChild(1)).getReturnType();
		putStore(id, type);
	}
	
	public void writeBecomes(ForrestTree t){
		instructions.add("STORE(1) " + calculateAddressString(t.getChild(0).getText()));
		instructions.add("LOAD(1) " + calculateAddressString(t.getChild(0).getText()));
	}

	public void writeIfElse(){
//		instructions.add("LOAD(1) -3[ST]");
//		instructions.add("JUMPIF(0) LELSE" + nIf + "[CB]");
//		instructions.add("POP(0) 1");
//		instructions.add("POP(1) 1");
//		instructions.add("JUMP LTHEN" + nIf + "[CB]");
//		instructions.add("LELSE"+ nIf + ":  POP(1) 2");
//		instructions.add("LTHEN" + nIf + ": ");
//		nIf++;
	}
	
	public void writeIf(){
//		instructions.add("LOAD(1) -3[ST]");
//		instructions.add("JUMPIF(0) LELSE" + nIf + "[CB]");
//		instructions.add("POP(0) 1");
//		instructions.add("POP(1) 1");
//		instructions.add("JUMP LTHEN" + nIf + "[CB]");
//		instructions.add("LELSE"+ nIf + ":  POP(1) 2");
//		instructions.add("LTHEN" + nIf + ": ");
//		nIf++;
	}
	
	
	
	
	private String calculateAddressString(String id){
		StoreItem item = store.getItem(id);
		int currentScopeLevel = store.currentLevel();
		String result;
		
		if(item.getScopeLevel() == currentScopeLevel){
			result = item.getAddress() + "[LB]";
		} else {
			result = item.getAddress() + "[L" + (currentScopeLevel - item.getScopeLevel()) + "]";
		}
		return result;
	}
}
