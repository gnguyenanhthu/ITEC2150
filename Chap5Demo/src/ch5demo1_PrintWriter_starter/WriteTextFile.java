package ch5demo1_PrintWriter_starter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 
 * Example of opening a text file for writing and writing various information to
 * it.
 *
 */
public class WriteTextFile
{

	public static void main(String[] args)
	{
		// scanner to allow user input values
		Scanner consoleInput = new Scanner(System.in);

		// variable to hold info about the File
		//File theFile = new File("D:\\GGC\\Intermediate Programming\\test.txt");

		// PrintWriter object to open for writing to file
		PrintWriter outputFile; //dont need null cuz we made user to input right file name
		System.out.println("Enter the name of the file to be created: ");
		while (true) {
			String fileName = consoleInput.nextLine();
			// variable to hold info about the File
			File theFile = new File(fileName);
			
			try {
				outputFile = new PrintWriter(theFile);
				break;
			} catch (FileNotFoundException e) {
				System.out.println("File not found. Reenter file name:");
			}
		}


		// file opened for writing - let's put something in there
		outputFile.println("This is how to write a string literal to a file");
		double x = 55.6789;
		outputFile.println("This is how to print a double value: " + x);
		outputFile.printf("This is how to print a double value: %.2f\n", x);
		int y = 10;
		String s = "This is a string variable";
		outputFile.println(s + " this is an integer " + y);

		outputFile.close();

	}
}
