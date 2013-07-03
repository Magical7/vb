package util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import forrest.ForrestTree;

import main.ForrestOptions;


public class ForrestWriter {
	
	/** Output method */
	private FileWriter fileWriter;
	
	/** List of instructions kept while running */
	private ArrayList<String> instructions = new ArrayList<String>();
	
	/** Store for storing the variables and address locations */
	private IdStore store = new IdStore();
	
	/** Amount of if-statements encountered */
	private int nIf = 0;
	/** Amount of while-statements encountered */
	private int nWhile = 0;
	/** Stack top */
	private int st = 0;
	
	/** Constructor. Sets the output file */
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
	
	/**
	 * Print the list of instructions to the file.
	 */
	public void print() {
		try {
			for(String s: instructions){
				fileWriter.write(s + "\n");
			}
			fileWriter.flush();
			fileWriter.close();
		} catch (IOException e) {
			System.err.println("Error while writing to file: " + e.getMessage());
		}
	}
	
	/**
	 * Place an identifier in the store
	 * @param id the id
	 * @param type the type of the variable/constant
	 * @param address the address relative to SB
	 */
	public void putStore(String id, Type type, int address){
		store.declare(id, type, address);
	}
	
	/** @return a previously unused number for the if labels */
	public int getFreeIf() {
		nIf++;
		return nIf;
	}
	
	/** @return a previously unused number for the while labels */
	public int getFreeWhile() {
		nWhile++;
		return nWhile;
	}
	
	/** Setup extra variables for program running. Reserves 1 place on the stack */
	public void startProgram(){
    	store.openScope();
	}

	/**
	 * Write the code after a program-rule
	 */
	public void writeProgram() {
		// Clean up the stack
		instructions.add("POP(0) " + store.getCurrentScopeSize());
		instructions.add("HALT");
		// Divide by zero error
		instructions.add("ERRORZERODIV:");
		this.printString("Divide by 0");
		instructions.add("HALT");
		// Unknown error
		instructions.add("ERROR:");
		this.printString("Unknown error");
		instructions.add("HALT");
	}
	
	/** Open a new scope */
	public void openScope() {
		store.openScope();
	}
	
	/** 
	 * Close the current scope and remove all identifiers associated with that 
	 * scope from the stack.
	 */
	public void closeScope() {
		instructions.add("POP(1) " + ((store.getCurrentScopeSize() - 1) > 0 ? (store.getCurrentScopeSize() - 1) : 0));
		st -= (store.getCurrentScopeSize() - 1);
		store.closeScope();
	}
	
	/** Write the end of a program line: leave the last value on the stack */
	public void writeProgramLines() {
		instructions.remove(instructions.size()-1);
		st += 1;
	}
	
	/** Upon a semi-colon, remove the last value from the stack */
	public void writeLine() {
		instructions.add("POP(0) 1"); 
		st -= 1;
	}
	
	/** Declare a variable */
	public void writeDeclarationVar(ForrestTree t) {
		instructions.add("PUSH 1");
		st += 1;
		String id = t.getChild(0).getText();
		Type type = Type.valueOf(t.getChild(1).getText().toUpperCase());
		putStore(id, type, st - 1);
	}
	
	/** Declare a constant */
	public void writeDeclarationConstant(ForrestTree t) {
		String id = t.getChild(0).getText();
		Type type = ((ForrestTree)t.getChild(1)).getReturnType();
		putStore(id, type, st - 1);
	}
	
	/** Assignment */
	public void writeBecomes(ForrestTree t){
		instructions.add("STORE(1) " + store.getAddress(t.getChild(0).getText()) + "[SB]");
		instructions.add("LOAD(1) " + store.getAddress(t.getChild(0).getText()) + "[SB]");
	}
	
	/** Opening to a while-loop */
	public void writeWhileStart(int label) {
		this.openScope();
		instructions.add("LWHILESTART" + label + ":");
	}
	
	/** Possible break from the while-loop */
	public void writeWhileCheck(int label) {
		instructions.add("JUMPIF(0) LWHILEFINALLY" + label + "[CB]");
		st -= 1;
		this.openScope();
	}
	
	/** End of while-loop */
	public void writeWhileFinally(int label) {
		this.closeScope();
		instructions.add("JUMP LWHILESTART" + label + "[CB]");
		instructions.add("LWHILEFINALLY" + label + ":");
		this.closeScope();
	}
	
	/** Opening of an if statement */
	public void writeIfStart() {
		this.openScope();
	}
	
	/** Check of if statement */
	public void writeIfCheck(int label){
		instructions.add("JUMPIF(0) LIFFALSE" + label + "[CB]");
		st -= 1;
		this.openScope();
	}
	
	/** Code after completing then part of the then statement */
	public void writeIfAfterThen() {
		this.closeScope();
	}
	
	/** Else part of if statement */
	public void writeIfBeforeElse(int label){
		instructions.add("JUMP LIFFINALLY" + label + "[CB]");
		instructions.add("LIFFALSE" + label + ":");
		this.openScope();
	}
	
	/** Extra code after the complete if statement */
	public void writeIfFinally(int label){
		instructions.add("LIFFINALLY" + label + ":");
		this.closeScope();
	}
	
	/** Code to jump to if the if-statement returns false and no else exists */
	public void writeIfFalse(int label){
		instructions.add("LIFFALSE" + label + ":");
		this.closeScope();
	}
	
	/** Code to execute a binary operation */
	public void writeBinaryOp(ForrestTree t) {
		String text = t.getText();
		String call = "";
		switch(text) {
		case "||":
			call = "or";
			break;
		case "&&":
			call = "and";
			break;
		case ">":
			call = "gt";
			break;
		case "<":
			call = "lt";
			break;
		case ">=":
			call = "ge";
			break;
		case "<=":
			call = "le";
			break;
		case "==":
			call = "eq";
			break;
		case "!=":
			call = "ne";
			break;
		case "+":
			call = "add";
			break;
		case "-":
			call = "sub";
			break;
		case "*":
			call = "mult";
			break;
		case "/":
			call = "div";
			break;
		case "%":
			call = "mod";
			break;
		}
		
		// Check divide by zero
		if (call.equals("div") || call.equals("mod")) {
			instructions.add("LOAD(1) -1[ST]");
			instructions.add("JUMPIF(0) ERRORZERODIV [CB]");
		}
		
		if (call.equals("ne") || call.equals("eq")) {
			instructions.add("LOADL 1");
		}
		
		instructions.add("CALL " + call);
		st -= 1;
	}
	
	/** Code to execute a unary operation */
	public void writeUnaryOp(ForrestTree t) {
		String text = t.getText();
		String call = "";
		switch(text) {
		case "!":
			call = "not";
			break;
		case "POSITIVE":
			call = "id";
			break;
		case "NEGATIVE":
			call = "neg";
			break;
		}
		
		instructions.add("CALL " + call);
	}
	
	/** Load a variable/constant */
	public void writeIdentifier(ForrestTree t){
		instructions.add("LOAD(1) " + store.getAddress(t.getText()) + "[SB]");
		st += 1;
	}
	
	/** Load a number */
	public void writeNumber(ForrestTree t){
		instructions.add("LOADL " + t.getText());
		st += 1;
	}
	
	/** Load a boolean */
	public void writeBoolean(ForrestTree t){
		String value = "1";
		if (t.getText().equals("false")) {
			value = "0";
		}
		
		instructions.add("LOADL " + value);
		st += 1;
	}
	
	/** Load a character */
	public void writeCharacter(ForrestTree t){
		instructions.add("LOADL " + Character.getNumericValue(t.getText().charAt(0)));
		st += 1;
	}
	
	/** Ask the user for input for a series of variables */
	public void writeRead(ForrestTree t) {
		for (Object child: t.getChildren()) {
			ForrestTree tree = (ForrestTree) child;
			StoreItem item = store.getItem(tree.getText());
			Type type = item.getType();
			int address = store.getAddress(tree.getText());
			instructions.add("LOADA " + address + "[SB]");
			switch(type) {
			case INT:
				printString("Input int: ");
				instructions.add("CALL getint");
				break;
			case CHAR:
				printString("Input char: ");
				instructions.add("CALL get");
				break;
			case BOOL:
				printString("Input bool (0/1): ");
				instructions.add("CALL getint");
				instructions.add("LOAD(1) " + address + "[SB]");
				this.printConformBool();
				instructions.add("STORE(1) " + address + "[SB]");
				break;
			default:
				break;
			}
		}
		instructions.add("LOAD(1) " + store.getAddress(t.getChild(0).getText()) + "[SB]");
		st += 1;
	}
	
	/** Print a series of expressions */
	public void writePrint(ForrestTree t) {
		for (int i = 0; i < t.getChildCount(); i ++) {
			ForrestTree tree = (ForrestTree) t.getChild(i);
			Type type = tree.getReturnType();
			instructions.add("LOAD(1) " + (i - t.getChildCount()) + "[ST]");
			switch(type) {
			case INT:
				instructions.add("CALL putint");
				break;
			case CHAR:
				instructions.add("CALL put");
				break;
			case BOOL:
				instructions.add("CALL putint");
				break;
			default:
				break;
			}
			instructions.add("POP(0) " + (t.getChildCount() - 1));
			st -=(t.getChildCount() - 1);
			instructions.add("CALL puteol");
		}
	}
	
	/** Print a string */
	public void printString(String output) {
		for (Character c: output.toCharArray()) {
			if (c == '\n') {
				instructions.add("CALL puteol");
			} else {
				instructions.add("LOADL " + (int) c);
				instructions.add("CALL put");
			}
		}
	}
	
	/** Set a boolean to true or false */
	public void printConformBool() {
		instructions.add("LOADL 0");
		instructions.add("LOADL 1");
		instructions.add("CALL ne");
	}
}
