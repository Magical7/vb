package forrest.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

import fire.ForrestFireException;

public class Forrest {
	
	public Forrest(){
		
	}
	
	/**
	 * Method to run the ANTLR program on a forrest program
	 * @param inputFile - String: The forrest program to compile (null means the standard inputfile from ForrestOptions.inputFileLocation)
	 * @param outputFile - String: The targetFile (null means the stand System.out)
	 * @param useParser - boolean: Whether to use the parser
	 * @param useChecker - boolean: Whether to use the checker
	 * @param useInterpreter - boolean: Whether to use the interpreter
	 * @param useEncoder - boolean: Whether to use the encoder
	 */
	public void runForrest(String inputFile, PrintStream outputPS, boolean useParser, boolean useChecker, boolean useInterpreter, boolean useEncoder){
		InputStream in = null;
		PrintStream out = null;
		try{
			if(inputFile == null){
				in = new FileInputStream(ForrestOptions.inputFileLocation);
			} else {
				in = new FileInputStream(inputFile);
			}
			
			if(outputPS == null){
				out = new PrintStream(System.out);
			} else {
				out = outputPS;
			}
			
			//Parse the Forrest program
			ForrestLexer lexer = new ForrestLexer(new ANTLRInputStream(in));
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			ForrestParser parser = new ForrestParser(tokens);
			
			ForrestParser.forrest_return result = parser.forrest();
			CommonTree tree = (CommonTree) result.getTree();
			if(useParser){
				out.println(tree.toStringTree());
			}
			
			//Check the Forrest program
//			if(useChecker){
//				CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
//				ForrestChecker checker = new ForrestChecker(nodes);
//				checker.forrest();
//			}
			
			//Interpret the Forrest program
//			if(useInterpreter){
//				TreeNodeStream nodes = new BufferedTreeNodeStream(tree);
//				ForrestInterpreter interpreter = new ForrestInterpreter(nodes);
//				interpreter.forrest();
//			}
			
			//Generate code for the Forrest Program
			if(useEncoder){
				
			}
		} catch (ForrestFireException e){
			out.print("Fire!: ForrestException thrown by compiler ");
			out.println(e.getMessage());
		} catch (Exception e) {
	        out.print("ERROR: uncaught exception thrown by compiler: ");
	        out.println(e.getMessage());
	    }
	}
	
	
	public static void main(String[] args){
		Forrest runner = new Forrest();
		runner.runForrest(null, null, ForrestOptions.parser, ForrestOptions.checker, ForrestOptions.interpreter, ForrestOptions.encoder);
			
	}
}
