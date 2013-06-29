package forrest.main;

public class ForrestOptions {
	
	/**
	 * Constructor used for delivering the options to the Forrest program
	 * @param parser - whether to use the parser
	 * @param checker - whether to use the checker
	 * @param interpreter - whether to use the interpreter - not available
	 * @param encoder - whether to use the encoder
	 * @param useTam - whether to use the TAM assembler
	 * @param runProgram - whether to run the TAM program
	 * @param inputFileLocation - location of the inputFile
	 * @param tasmFileLocation - location of the tasmFile
	 * @param tamFileLocation - location of the tamFile
	 */
	public ForrestOptions(boolean parser, boolean checker, 
			boolean interpreter, boolean encoder, boolean useTam, 
			boolean runProgram, boolean showAst,
			String inputFileLocation, String tasmFileLocation, String tamFileLocation){
		this.parser = parser;
		this.checker = checker;
		this.interpreter = interpreter;
		this.encoder = encoder;
		this.useTam = useTam;
		this.runProgram = runProgram;
		this.showAst = showAst;
		this.inputFileLocation = "src/programs/" + inputFileLocation + ".forrest";
		this.tasmFileLocation = "src/programs/" + tasmFileLocation + ".tasm";
		this.tamFileLocation = "src/programs/" + tamFileLocation + ".tam";
		this.assemblerArguments[0] = this.tasmFileLocation;
		this.assemblerArguments[1] = this.tamFileLocation;
		this.interpreterArguments[0] = this.tasmFileLocation;
	}
	
	/**
	 * Constructor used for delivering the options to the Forrest program
	 * @param parser - whether to use the parser
	 * @param checker - whether to use the checker
	 * @param interpreter - whether to use the interpreter - not available
	 * @param encoder - whether to use the encoder
	 * @param useTam - whether to use the TAM assembler
	 * @param runProgram - whether to run the TAM program
	 */
	public ForrestOptions(boolean parser, boolean checker, 
			boolean interpreter, boolean encoder, boolean useTam, 
			boolean runProgram, boolean showAst){
		this.parser = parser;
		this.checker = checker;
		this.interpreter = interpreter;
		this.encoder = encoder;
		this.useTam = useTam;
		this.runProgram = runProgram;
		this.showAst = showAst;
	}
	
	/**
	 * Default constructor
	 */
	public ForrestOptions(){
		
	}
	
	//What should the program do?
	/** Run the parser */
	protected boolean parser = true;
	/** Run the checker */
	protected boolean checker = true;
	/** Run the interpreter - unused */
	protected boolean interpreter = false;
	/** Run the encoder */
	protected boolean encoder = true;
	/** Use TAM to convert the output to assembly */
	protected boolean useTam = true;
	/** Use the TAM interpreter to run the program */
	protected boolean runProgram = true;
	
	/** Show the output of the parser */
	protected boolean showAst = false;
	
	/** Forrest file to read from */
	protected String inputFileLocation = "src/testfiles/BlackBoxTest4.forrest";
	/** TAM file to output to and read from */
	protected String tasmFileLocation = "src/TAM/program.tasm";
	/** TAM assembler file to output to and read from */
	protected String tamFileLocation = "src/TAM/program.tam";
	
	/** Arguments to the TAM assembler */
	protected String[] assemblerArguments = {tasmFileLocation, tamFileLocation};
	/** Arguments tot the TAM interpreter */
	protected String[] interpreterArguments = {tamFileLocation};
	
	
	
	
	
}
