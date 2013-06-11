package testfiles;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;

import forrest.main.Forrest;

/**
 * Class used for running all tests
 *
 */
public class TestForrest {
	
	Forrest forrest;
	private static String fileLocation = "src/testfiles/";

	//TestFiles
	private HashMap<String,String[]> fileToOutputs = new HashMap<String,String[]>();
	
	
	public TestForrest(){
		
	}
	
	public void init(){
		this.fillFileToOutput();
		this.forrest = new Forrest();
	}
	
	public void runAllTests(){
		runParserTests();
//		runCheckerTests();
//		runEncoderTests();
	}
	
	/**
	 * Method to run all ParserTests
	 */
	private void runParserTests(){
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		for(String file : fileToOutputs.keySet()){
			this.forrest.runForrest(file, ps, true, false, false, false);
			String answer = fileToOutputs.get(file)[0];
			String shouldbe = baos.toString();
			System.out.println(shouldbe.length() + " " + answer.length());
			for(int i = 0; i< shouldbe.length(); i++){
				System.out.println(i + " " + shouldbe.charAt(i) + " " + answer.charAt(i));
			}
			
			
			if(!baos.toString().equals(answer)){
				System.out.println("Test Failed: "+ file + " : \n" + baos.toString() + "\n" + answer);
			}
			try {
				baos.flush();
			} catch (IOException e) {
				System.out.println("Error in the tester: "+ e.getMessage());
			}
		}
	}
	
	/**
	 * Method to make all tests
	 */
	private void fillFileToOutput(){
		fileToOutputs.put(fileLocation+"DeclaratieTest1.forrest", new String[]
				{"(PROGRAM (var lex bool) (var stijn char) (var RoNalD int) (= lex true))",
				"output2",
				"output3"
				});
//		fileToOutputs.put(fileLocation+"DeclaratieTest2a.forrest", new String[]
//				{"line 2:6 missing SEMICOLON at 'var'\nline 2:10 missing IDENTIFIER at 'char'\n(PROGRAM stijn (var <missing IDENTIFIER> char) (= lex true))",
//				"output2",
//				"output3"
//				});
//		fileToOutputs.put(fileLocation+"DeclaratieTest2b.forrest", new String[]
//				{"(PROGRAM (var lex bool) (var stijn char) (var RoNalD int) (= lex true))",
//				"output2",
//				"output3"
//				});
	}
	
	public static void main(String[] args){
		TestForrest tester = new TestForrest();
		tester.init();
		tester.runAllTests();
		
	}
}
