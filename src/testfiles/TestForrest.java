package testfiles;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;

import org.antlr.gunit.Interp;

import antlr.RecognitionException;

import fire.ForrestFireException;
import forrest.main.Forrest;

/**
 * Class used for running all tests
 *
 */
public class TestForrest {
	
	//Setting Debug to true will generate more information
	private boolean debug = false;
	//Class used to run the grammar Forrest
	private Forrest forrest;
	//String used for the location of the test files
	private static String fileLocation = "src/testfiles/";

	//TestFiles	
	private HashMap<String,String> parserTests = new HashMap<String,String>();
	private HashMap<String,String> checkerTests = new HashMap<String,String>();
	private HashMap<String,String> encoderTests = new HashMap<String,String>();
	
	/**
	 * Constructor for this class
	 */
	public TestForrest(){
		
	}
	
	/**
	 * Method for initializing the tests
	 */
	public void init(){
		this.forrest = new Forrest();
	}
	
	/**
	 * Method to run all tests
	 */
	public void runAllTests(){
		int totalFailed = 0;
//		runGunitTests();
		totalFailed += runParserTests();
		totalFailed += runCheckerTests();
		totalFailed += runEncoderTests();
		System.out.println("All tests ended with " + totalFailed + " errors");
	}
	
	/**
	 * Method that runs the Gunit Tests as specified by the file forrestTest.gunit.
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
	 */
	private int runParserTests(){
		fillParserOutput();
		int failed = 0;
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		for(String file : parserTests.keySet()){
			String expected = parserTests.get(file);
			String returned = null;
			try{
				this.forrest.runForrest(file, ps, true, false, false, false, false, false);
				returned = baos.toString();
			} catch(ForrestFireException e){
				returned = e.getMessage();
				
			} catch(RecognitionException e){
				returned = e.getMessage();
			
			} catch(Exception e){
				returned = e.getMessage();
//				System.exit(0);
			}
			
			if(!returned.equals(expected)){
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
		System.out.println("Finished tests with " + failed + " errors");
		return failed;
	}
	
	/**
	 * Method to run all CheckerTests
	 */
	private int runCheckerTests(){
		fillCheckerOutput();
		int failed = 0;
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		for(String file : checkerTests.keySet()){
			String expected = checkerTests.get(file);
			String returned = null;
			try{
				this.forrest.runForrest(file, ps, true, true, false, false, false, false);
				returned = baos.toString();
			} catch(ForrestFireException e){
				returned = e.getMessage();
				
			} catch(RecognitionException e){
				returned = e.getMessage();
			
			} catch(Exception e){
				returned = e.getMessage();
//				System.exit(0);
			}
			
			if(!returned.equals(expected)){
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
		System.out.println("Finished tests with " + failed + " errors");
		return failed;
	}
	
	/**
	 * Method to run all EncoderTests
	 */
	private int runEncoderTests(){
		fillEncoderOutput();
		int failed = 0;
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		for(String file : encoderTests.keySet()){
			String expected = encoderTests.get(file);
			String returned = null;
			try{
				this.forrest.runForrest(file, ps, true, true, false, true, false, false);
				returned = baos.toString();
			} catch(ForrestFireException e){
				returned = e.getMessage();
				
			} catch(RecognitionException e){
				returned = e.getMessage();
			
			} catch(Exception e){
				returned = e.getMessage();
//				System.exit(0);
			}
			
			if(!returned.equals(expected)){
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
		System.out.println("Finished tests with " + failed + " errors");
		return failed;
	}
	
	/**
	 * Method to print output to the System.out, will only print if debug is set to true
	 * @param tekst - String: de tekt om uit te printen
	 */
	private void print(String tekst){
		if(debug){
			System.out.println(tekst);
		}
	}
	
	/**
	 * Method to make all parser tests
	 */
	private void fillParserOutput(){
		parserTests.put(fileLocation+"DeclaratieTest1.forrest", 
				"(PROGRAM (var lex bool) (var stijn char) (var RoNalD int) (= lex true))\r\n");
		parserTests.put(fileLocation+"DeclaratieTest2a.forrest", 
				"org.antlr.runtime.tree.CommonErrorNode cannot be cast to forrest.main.ForrestTree");
		parserTests.put(fileLocation+"DeclaratieTest2b.forrest",
				"rule program_lines");
		parserTests.put(fileLocation+"DeclaratieTest3.forrest",
				"org.antlr.runtime.tree.CommonErrorNode cannot be cast to forrest.main.ForrestTree");
		parserTests.put(fileLocation+"BinaryOpTest1.forrest", 
				"(PROGRAM (var stijn char) (var lex bool) (= lex (== lex lex)) (= lex (!= lex lex)) (= lex (|| (&& lex lex) (== lex lex))) (= stijn 'c') (= lex (== stijn 'c')))\r\n");
		parserTests.put(fileLocation+"BinaryOpTest2.forrest", 
				"org.antlr.runtime.tree.CommonErrorNode cannot be cast to forrest.main.ForrestTree");
		parserTests.put(fileLocation+"BinaryOpTest3.forrest", 
				"org.antlr.runtime.tree.CommonErrorNode cannot be cast to forrest.main.ForrestTree");
		parserTests.put(fileLocation+"BinaryOpTest4.forrest", 
				"org.antlr.runtime.tree.CommonErrorNode cannot be cast to forrest.main.ForrestTree");
		parserTests.put(fileLocation+"CommentTest1.forrest", 
				"org.antlr.runtime.tree.CommonErrorNode cannot be cast to forrest.main.ForrestTree");
		parserTests.put(fileLocation+"CommentTest2.forrest", 
				"(PROGRAM (var stijn char) (= lex true))\r\n");
		parserTests.put(fileLocation+"Correct1.forrest", 
				"(PROGRAM (var b1 bool) (var i1 int) (var c1 char) (var b2 bool) (var b3 bool) (= b1 (= b2 true)) (= b3 (! b1)) (print (|| b1 (&& b2 b3))) (print (!= (== b1 b2) b3)))\r\n");
		parserTests.put(fileLocation+"UnaryOpTest1.forrest", 
				"org.antlr.runtime.tree.CommonErrorNode cannot be cast to forrest.main.ForrestTree");
		parserTests.put(fileLocation+"IdentifierTest1.forrest", 
				"org.antlr.runtime.tree.CommonErrorNode cannot be cast to forrest.main.ForrestTree");
				
	}
	
	/**
	 * Method to make all Checker tests
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
	}
	
	/**
	 * Method to make all Checker tests
	 */
	private void fillEncoderOutput(){
//		encoderTests.put(fileLocation+"DeclarationEncoding.forrest", 
//				"PUSH 1\r\nPUSH 1\r\nLOAD(1) 1[SB]\r\nLOAD(1) -1[ST]\r\nCALL putint\r\nPOP(0) 0\r\nCALL puteol\r\nPOP(1) 0\r\nPOP(0) 1\r\nHALT\r\nERRORZERODIV: LOADL 1\r\nSTORE(1) 0[SB]\r\nJUMP ERROR\r\nERRORINPUT: LOADL 2\r\nSTORE(1) 0[SB]\r\nJUMP ERROR\r\nERROR: LOAD(1) 0[SB]\r\nCALL putint\r\nHALT");				
//		encoderTests.put(fileLocation+"NotDeclaredTest1.forrest",
//				"d(4:0) has not been declared");
//		encoderTests.put(fileLocation+"TypeNotCorrectlyDeclaredTest1.forrest",
//				"1(6:4) does not match type of BOOL");
//		encoderTests.put(fileLocation+"TypeNotCorrectlyDeclaredTest2.forrest", 
//				"'b'(3:4) does not match type of INT");
//		encoderTests.put(fileLocation+"TypeNotCorrectlyDeclaredTest3.forrest", 
//				"true(3:4) does not match type of CHAR");
//		encoderTests.put(fileLocation+"CorrectScopingTest.forrest", 
//				"(PROGRAM (var a int) (var b bool) (var c char) (= a 5) (= b true) (= c 'd') (= b (COMPOUND (var d bool) (var b int) (= b a) (= d (== b a)) (|| d true))) (= b true) (EXPR_IF (if (var l int) (|| b (== l 1))) (then (= l 3)) (else (= l 4))))\r\n");
//		encoderTests.put(fileLocation+"WrongScopingTest1.forrest", 
//				"c(7:0) has not been declared");
//		encoderTests.put(fileLocation+"WrongScopingTest2.forrest", 
//				"'c'(8:4) does not match type of BOOL");
//		encoderTests.put(fileLocation+"BinaryOpTypeFail1.forrest", 
//				"a(5:9) does not match the type of CHAR");
//		encoderTests.put(fileLocation+"BinaryOpTypeFail2.forrest", 
//				"a(3:5) is not of type boolean");
//		encoderTests.put(fileLocation+"BinaryOpTypeFail3.forrest", 
//				"c(4:4) is not of type integer");
//		encoderTests.put(fileLocation+"BinaryOpTypeFail4.forrest", 
//				"+(4:6) does not match type of CHAR");
	}
	
	/**
	 * Main. Runs the tester and all tests.
	 * @param args - not used
	 */
	public static void main(String[] args){
		TestForrest tester = new TestForrest();
		tester.init();
		tester.runAllTests();
		
	}
}
