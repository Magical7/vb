package main;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;


import org.antlr.gunit.Interp;

import antlr.RecognitionException;

import fire.ForrestFireException;

/**
 * Class used for running all tests.
 *
 */
public class ForrestTester {
	
	/** Setting Debug to true will generate more information */
	private boolean debug = false;
	/** Class used to run the grammar Forrest */
	private Forrest forrest;
	/** String used for the location of the test files */
	private static String fileLocation = "../TestFiles/";

	//TestFiles
	/** Testfile and expected outputs for the parser */
	private HashMap<String,String> parserTests = new HashMap<String,String>();
	/** Testfile and expected outputs for the checker */
	private HashMap<String,String> checkerTests = new HashMap<String,String>();
	
	/**
	 * Constructor for this class
	 */
	public ForrestTester(){
		
	}
	
	/**
	 * Method for initializing the tests
	 */
	public void init(){
		this.forrest = new Forrest();
	}
	
	/**
	 * Method to run all tests and give the amount of wrong tests
	 */
	public void runAllTests(){
		System.out.println("------------------------------------------------------");
		System.out.println("------------------------------------------------------");
		System.out.println("Running all tests");
		System.out.println("------------------------------------------------------");
		int totalFailed = 0;
//		runGunitTests(); 
		totalFailed += runParserTests();
		totalFailed += runCheckerTests();
		System.out.println("------------------------------------------------------");
		System.out.println("All tests ended with " + totalFailed + " errors");
		System.out.println("------------------------------------------------------");
		System.out.println("------------------------------------------------------");
	}
	
	/**
	 * Method that runs the Gunit Tests as specified by the file forrestTest.gunit.
	 * Not used, somehow doesn't run the Interp.main and blocks. Can be run independently (See the Readme)
	 */
	private void runGunitTests(){
		try{
			Interp.main(new String[]{"-p", "src/forrest/main src/forrest/main/forrestTest.gunit"});
		}catch(org.antlr.runtime.RecognitionException e){
			System.out.println("Error in running Gunit test: " + e.getMessage());
		}catch(IOException e){
			System.out.println("Could not find the Gunit file; " + e.getMessage());
		}catch(ClassNotFoundException e){
			System.out.println("Error in running Gunit: " + e.getMessage());
		}
	}
	
	/**
	 * Method to run all ParserTests
	 * This method runs the parser on every file within parserTests and 
	 * compares the output given by the parser with the expected output.
	 */
	private int runParserTests(){
		System.out.println("------------------------------------------------------");
		System.out.println("Testing the Parser (Don\'t mind the red lines)");
		System.out.println("------------------------------------------------------");
		fillParserOutput();
		int failed = 0;
		//ByteArrayOutputStream used for getting the output of the parser
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		for(String file : parserTests.keySet()){
			String expected = parserTests.get(file);
			String returned = null;
			try{
				//Run the parser
				this.forrest.runForrest(file, ps, new ForrestOptions(true, false, false, false, false, false,true,file,"src/TAM/test.tams","src/TAM/test.tam"));
				returned = baos.toString();
			} catch(ForrestFireException e){
				returned = e.getMessage();
				
			} catch(RecognitionException e){
				returned = e.getMessage();
			
			} catch(Exception e){
				returned = e.getMessage();
			}
			//Compare the result with the expected value
			if(!expected.equals(returned)){
				System.out.println("Test Failed: "+ file + " : \n" + returned + "\n" + expected);
				failed++;
			} else {
				print("Test Succesful: " + file);
			}
			baos.reset();
		}
		ps.close();
		try {
			baos.close();
		} catch (IOException e) {
			System.out.println("Something wrong with closing ByteArrayOutputStream");
		}
		System.out.println("------------------------------------------------------");
		System.out.println("Finished Parser tests with " + failed + " errors");
		System.out.println("------------------------------------------------------");
		return failed;
	}
	
	/**
	 * Method to run all CheckerTests
	 * This method runs the parser and checker on every file within checkerTests and 
	 * compares the output given by the parser and checker with the expected output.
	 */
	private int runCheckerTests(){
		System.out.println("------------------------------------------------------");
		System.out.println("Testing the checker");
		System.out.println("------------------------------------------------------");
		fillCheckerOutput();
		int failed = 0;
		//ByteArrayOutputStream used for getting the output of the parser and checker
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		for(String file : checkerTests.keySet()){
			String expected = checkerTests.get(file);
			String returned = null;
			try{
				//Run the parser and checker
				this.forrest.runForrest(file, ps, new ForrestOptions(true, true, false, false, false, false,true,file,"src/TAM/test.tams","src/TAM/test.tam"));
				returned = baos.toString();
			} catch(ForrestFireException e){
				returned = e.getMessage();
				
			} catch(RecognitionException e){
				returned = e.getMessage();
			
			} catch(Exception e){
				returned = e.getMessage();
			}
			//Compare the result with the expected value
			if(!expected.equals(returned)){
				System.out.println("Test Failed: "+ file + " : \n" + returned + "\n" + expected);
				failed++;
			} else {
				print("Test Succesful: " + file);
			}
			baos.reset();
		}
		ps.close();
		try {
			baos.close();
		} catch (IOException e) {
			System.out.println("Something wrong with closing ByteArrayOutputStream");
		}
		System.out.println("------------------------------------------------------");
		System.out.println("Finished Checker tests with " + failed + " errors");
		System.out.println("------------------------------------------------------");
		return failed;
	}
	
	/**
	 * Method to print output to the System.out, will only print if debug is set to true
	 * @param tekst - String: the text to print
	 */
	private void print(String tekst){
		if(debug){
			System.out.println(tekst);
		}
	}
	
	/**
	 * Method to make all parser tests. The key is the file that should be parsed, the value is the expected result
	 */
	private void fillParserOutput(){
		parserTests.put(fileLocation+"DeclaratieTest1.forrest", 
				"(PROGRAM (var lex bool) (var stijn char) (var RoNalD int) (= lex true))\r\n");
		parserTests.put(fileLocation+"DeclaratieTest2a.forrest", 
				"org.antlr.runtime.tree.CommonErrorNode cannot be cast to forrest.ForrestTree");
		parserTests.put(fileLocation+"DeclaratieTest2b.forrest",
				"rule program_lines");
		parserTests.put(fileLocation+"DeclaratieTest3.forrest",
				"org.antlr.runtime.tree.CommonErrorNode cannot be cast to forrest.ForrestTree");
		parserTests.put(fileLocation+"BinaryOpTest1.forrest", 
				"(PROGRAM (var stijn char) (var lex bool) (= lex (== lex lex)) (= lex (!= lex lex)) (= lex (|| (&& lex lex) (== lex lex))) (= stijn 'c') (= lex (== stijn 'c')))\r\n");
		parserTests.put(fileLocation+"BinaryOpTest2.forrest", 
				"org.antlr.runtime.tree.CommonErrorNode cannot be cast to forrest.ForrestTree");
		parserTests.put(fileLocation+"BinaryOpTest3.forrest", 
				"org.antlr.runtime.tree.CommonErrorNode cannot be cast to forrest.ForrestTree");
		parserTests.put(fileLocation+"BinaryOpTest4.forrest", 
				"org.antlr.runtime.tree.CommonErrorNode cannot be cast to forrest.ForrestTree");
		parserTests.put(fileLocation+"CommentTest1.forrest", 
				"org.antlr.runtime.tree.CommonErrorNode cannot be cast to forrest.ForrestTree");
		parserTests.put(fileLocation+"CommentTest2.forrest", 
				"(PROGRAM (var stijn char) (= lex true))\r\n");
		parserTests.put(fileLocation+"Correct1.forrest", 
				"(PROGRAM (var b1 bool) (var i1 int) (var c1 char) (var b2 bool) (var b3 bool) (= b1 (= b2 true)) (= b3 (! b1)) (print (|| b1 (&& b2 b3))) (print (!= (== b1 b2) b3)))\r\n");
		parserTests.put(fileLocation+"UnaryOpTest1.forrest", 
				"org.antlr.runtime.tree.CommonErrorNode cannot be cast to forrest.ForrestTree");
		parserTests.put(fileLocation+"IdentifierTest1.forrest", 
				"org.antlr.runtime.tree.CommonErrorNode cannot be cast to forrest.ForrestTree");
		parserTests.put(fileLocation+"WhileTest1.forrest", 
				"(PROGRAM (EXPR_WHILE (while true) (do (var l int) (read l) (print l))))\r\n");
	}
	
	/**
	 * Method to make all Checker tests. The key is the file that should be parsed and checked, the value is the expected result
	 */
	private void fillCheckerOutput(){
		checkerTests.put(fileLocation+"CorrectTypingTests.forrest", 
				"(PROGRAM (var a bool) (var b int) (var c char) (= a true) (= b 2) (= c 'd') (= a (|| a false)) (= a (&& true a)) (= a (! a)) (= a (! true)) (= a (< b 3)) (= a (<= b b)) (= a (> 4 3)) (= a (>= 3 b)) (= a (> (* 3 4) 2)) (= b (NEGATIVE b)) (= b (POSITIVE b)) (= a (> (% 10 2) 3)) (= a (== c 'd')) (= a (!= 'd' 'a')) (= a (|| (|| (&& (&& (< b 3) (> 4 5)) (>= 4 b)) (!= 'c' 'd')) a)))\r\n");
		checkerTests.put(fileLocation+"NotDeclaredTest1.forrest",
				"d(4:0) has not been declared");
		checkerTests.put(fileLocation+"TypeNotCorrectlyDeclaredTest1.forrest",
				"1(6:4) does not match type of BOOL");
		checkerTests.put(fileLocation+"TypeNotCorrectlyDeclaredTest2.forrest", 
				"'b'(3:4) does not match type of INT");
		checkerTests.put(fileLocation+"TypeNotCorrectlyDeclaredTest3.forrest", 
				"true(3:4) does not match type of CHAR");
		checkerTests.put(fileLocation+"CorrectScopingTest.forrest", 
				"(PROGRAM (var a int) (var b bool) (var c char) (= a 5) (= b true) (= c 'd') (= b (COMPOUND (var d bool) (var b int) (= b a) (= d (== b a)) (|| d true))) (= b true) (EXPR_IF (if (var l int) (|| b (== l 1))) (then (= l 3)) (else (= l 4))))\r\n");
		checkerTests.put(fileLocation+"WrongScopingTest1.forrest", 
				"c(7:0) has not been declared");
		checkerTests.put(fileLocation+"WrongScopingTest2.forrest", 
				"'c'(8:4) does not match type of BOOL");
		checkerTests.put(fileLocation+"BinaryOpTypeFail1.forrest", 
				"a(5:9) does not match the type of CHAR");
		checkerTests.put(fileLocation+"BinaryOpTypeFail2.forrest", 
				"a(3:5) is not of type boolean");
		checkerTests.put(fileLocation+"BinaryOpTypeFail3.forrest", 
				"c(4:4) is not of type integer");
		checkerTests.put(fileLocation+"BinaryOpTypeFail4.forrest", 
				"+(4:6) does not match type of CHAR");
		checkerTests.put(fileLocation+"WhileScopingTest1.forrest", 
				"(PROGRAM (var a int) (EXPR_WHILE (while true) (do (var a bool) (= a true))) (= a 6))\r\n");
		checkerTests.put(fileLocation+"WhileTypingTest1.forrest", 
				"while(3:0) is not of type boolean");
	}
	
	/**
	 * Main. Runs the tester and all tests.
	 * @param args - not used
	 */
	public static void main(String[] args){
		ForrestTester tester = new ForrestTester();
		tester.init();
		tester.runAllTests();
		
	}
}
