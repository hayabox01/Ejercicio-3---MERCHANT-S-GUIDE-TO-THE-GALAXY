package main.com.app.start;

import main.com.app.logic.InputTextProcessor;
import main.com.app.logic.OutputTextProcessor;

public class Main {

	/**
	 * If no argument is provided then the input file present inside main.com.app.logic package is
	 * picked up as input file by default.
	 * @param args
	 */
	public static void main(String[] args) {
		String filePath = null;
		if (args.length != 0)
			filePath = args[0];
		try{
			InputTextProcessor.ProcessFile(filePath);
			InputTextProcessor.MapTokentoIntegerValue();
			OutputTextProcessor.processReplyForQuestion();
		}
		catch(Exception e){
			System.out.println("Oops !! File Not Found ");
		}
	}

}
