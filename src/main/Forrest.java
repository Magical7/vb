package main;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;


import TAM.Assembler;
import TAM.Interpreter;

import fire.ForrestFireException;
import forrest.ForrestChecker;
import forrest.ForrestEncoder;
import forrest.ForrestLexer;
import forrest.ForrestParser;
import forrest.ForrestTreeAdaptor;
import forrest.ForrestParser;

public class Forrest {
	
	//Streams used for input and output
	private InputStream in;
	private PrintStream out;
	
	private ForrestOptions options;
	
	public Forrest(){
		
	}
	
	/**
	 * Method to run the ANTLR program on a forrest program
	 * @param inputFile - String: The forrest program to compile (null means the standard inputfile from forrestOptions.inputFileLocation)
	 * @param outputPS - PrintStream: The targetFile (null means the standard System.out)
	 * @param options - ForrestOptions: The options for running this Forrest
	 */
	public void runForrest(String inputFile, PrintStream outputPS, 
		ForrestOptions options) throws Exception{
			this.options = options;
			if(inputFile == null){
				this.in = new FileInputStream(options.inputFileLocation);
			} else {
				this.in = new FileInputStream(inputFile);
			}
			
			if(outputPS == null){
				this.out = new PrintStream(System.out);
			} else {
				this.out = outputPS;
			}
			
			//Parse the Forrest program
			ForrestLexer lexer = new ForrestLexer(new ANTLRInputStream(in));
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			ForrestParser parser = new ForrestParser(tokens);
			parser.setTreeAdaptor(new ForrestTreeAdaptor());
			
			ForrestParser.forrest_return result = parser.forrest();
			CommonTree tree = (CommonTree) result.getTree();
			if(options.parser && options.showAst){
				out.println(tree.toStringTree());
			}
			
			//Check the Forrest program
			if(options.checker){
				CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
				ForrestChecker checker = new ForrestChecker(nodes);
				checker.forrest();
			}
			
			//Interpret the Forrest program
//			if(useInterpreter){
//				TreeNodeStream nodes = new BufferedTreeNodeStream(tree);
//				ForrestInterpreter interpreter = new ForrestInterpreter(nodes);
//				interpreter.forrest();
//			}
			
			//Generate code for the Forrest Program
			if(options.encoder){
				CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
				ForrestEncoder encoder = new ForrestEncoder(nodes);
				encoder.setFile(options.tasmFileLocation);
				encoder.forrest();
			}
			
			//Use the Tam assembler if needed
			if(options.useTam){
				Assembler.main(options.assemblerArguments);
			}
			
			//Run the program if needed
			if(options.runProgram){
				Interpreter.main(options.interpreterArguments);
			}
	}
	
	/**
	 * Method for processing the arguments from the main, and run Forrest accordingly. 
	 * @param args - String[] : The arguments from the main. Can be seen by running the main without arguments
	 * @return boolean: Whether the arguments are valid
	 */
	private static boolean procesArgs(String[] args){
		Forrest runner = new Forrest();
		try{
			if(args.length == 0){
				return false;
			} else if(args.length == 1) {
				String arg = args[0];
				if(arg.equals("-a") || arg.equals("-all")){
					runner.runForrest(null, null, new ForrestOptions(true, true, false, true, true, true, false));
				} else if(arg.equals("-t") || arg.equals("-tester")){
					ForrestTester.main(null);
				} else if(arg.equals("-d") || arg.equals("-default")){
					runner.runForrest(null, null, new ForrestOptions());
				} else {
					return false;
				}
				return true;
			} else if (args.length == 4) {
				if(args[0].equals("-i") && args[2].equals("-o")){
					runner.runForrest(null, null, new ForrestOptions(true, true, false, true, true, true, false, args[1], args[3], args[3]));
				} else {
					return false;
				}
			} else {
				return false;
			}
			return true;
			
		} catch (ForrestFireException e){
			System.out.print("Fire!: ForrestException thrown by compiler ");
			System.out.println(e.getMessage());
		} catch (IOException e){
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.print("ERROR: uncaught exception thrown by compiler: ");
			System.out.println(e.getMessage());
			e.printStackTrace();
	    }
		return false;
	}
	
	/**
	 * Run the program
	 * @param args - String[] : The parameters for running the program:
			System.out.println("-a for all functions(Parser,checker,encoder,assembler and run the program");
			System.out.println("-d for default usage (as defined in the file ForrestOptions.java)");
			System.out.println("-i <inputFileName> -o <outputFileName> for all functions on specified file");
			System.out.println("-t for running the Tester");
	 */
	public static void main(String[] args){
		if(!procesArgs(args)){
			System.out.println("Arguments not valid. Please use the following:");
			System.out.println("-a for all functions(Parser,checker,encoder,assembler and run the program");
			System.out.println("-d for default usage (as defined in the file ForrestOptions.java)");
			System.out.println("-i <inputFileName> -o <outputFileName> for all functions on specified file, ");
			System.out.println("         the file <inputFileName>.forrest must be located in the program folder");
			System.out.println("-t for running the Tester");
		}
	}
}
