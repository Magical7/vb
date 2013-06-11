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
	
	private boolean debug = false;
	private Forrest forrest;
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
		int totalFailed = 0;
		totalFailed += runParserTests();
//		totalFailed += runCheckerTests();
//		totalFailed += runEncoderTests();
		System.out.println("All tests ended with " + totalFailed + " errors");
	}
	
	/**
	 * Method to run all ParserTests
	 */
	private int runParserTests(){
		int failed = 0;
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		for(String file : fileToOutputs.keySet()){
			this.forrest.runForrest(file, ps, true, false, false, false);
			String expected = fileToOutputs.get(file)[0];
			String returned = baos.toString();
			
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
			System.out.println("Somehting wrong with closing ByteArrayOutputStream");
		}
		System.out.println("Finished tests with " + failed + " errors");
		return failed;
	}
	
	private void print(String tekst){
		if(debug){
			System.out.println(tekst);
		}
	}
	
	/**
	 * Method to make all tests
	 */
	private void fillFileToOutput(){
		fileToOutputs.put(fileLocation+"DeclaratieTest1.forrest", new String[]
				{"(PROGRAM (var lex bool) (var stijn char) (var RoNalD int) (= lex true))\r\n",
				"output2",
				"output3"
				});
		fileToOutputs.put(fileLocation+"DeclaratieTest2a.forrest", new String[]
				{"(PROGRAM stijn (var <missing IDENTIFIER> char) (= lex true))\r\n",
				"output2",
				"output3"
				});
		fileToOutputs.put(fileLocation+"DeclaratieTest2b.forrest", new String[]
				{"ERROR: uncaught exception thrown by compiler: rule program_lines\r\n",
				"output2",
				"output3"
				});
	}
	
	public static void main(String[] args){
		TestForrest tester = new TestForrest();
		tester.init();
		tester.runAllTests();
		
	}
}
