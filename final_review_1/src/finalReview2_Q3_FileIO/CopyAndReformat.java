package finalReview2_Q3_FileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CopyAndReformat
{

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);  //Scanner for user input

		/*TODO 1: open a file to read. Please use variable name inputFile 
		          to store the reference of the Scanner object for the file.
		          The program should prompt user to enter a file name. If 
		          the file cannot be opened for read, loop until user enters
		          a file name that can be opened for read.
		 */	
		Scanner inputFile;
		System.out.println("Enter the source file name:");
		while(true) {
			String fileName = keyboard.nextLine();
			File file = new File(fileName);	
			try {
				inputFile = new Scanner(file);
				break;
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("File not found. Reenter file name:");
			}
		}

		/*TODO 2: open a file to write to. Please use variable name outputFile 
        		  to store the reference of the PrintWriter object for the file.
        		  The program should prompt user to enter a file name. If 
        		  the file cannot be opened for write, loop until user enters
        		  a file name that can be opened for write.
		 */	
		PrintWriter outputFile;
		System.out.println("Enter the target file name:");
		while(true) {
			String fileName2 = keyboard.nextLine();
			File file2 = new File(fileName2);
			try {
				outputFile = new PrintWriter(file2);
				break;
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("File path incorrect. Reenter file name:");
			}
		}
		
		/* TODO 3:
		 * Read a word from the inputFile using the delimit ",(\\s)*" 
		 * (comma followed by zero or more spaces/tabs/newlines) and 
		 * write the word and a space to the file.
		 */
		inputFile.useDelimiter(",(\\s)*");
		while(inputFile.hasNext()) {
			String word = inputFile.next();
			outputFile.print(word + " ");
		}
		
		
		
		//close the scanner and printwriter. 
		inputFile.close();
		outputFile.close();
		System.out.println("Copying and reformatting complete.");
	}
}
