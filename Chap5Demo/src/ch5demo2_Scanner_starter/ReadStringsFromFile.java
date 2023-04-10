package ch5demo2_Scanner_starter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 
 * This example shows how to open a text file for reading and read each line as
 * a String and print to console
 *
 */
public class ReadStringsFromFile
{

	public static void main(String[] args)
	{
		// declare variables before using in try/catch loop to avoid scope issues
		// open a Scanner for user input
		Scanner consoleInput = new Scanner(System.in);
		Scanner inputFile = null;


		// ask user for a file name
		System.out.println("Please enter name of file to be read:");
		while(true) {
			String fileName = consoleInput.nextLine();
			File theFile = new File(fileName);
			try {
				inputFile = new Scanner(theFile);
				break;
			} catch (FileNotFoundException e) {
				System.out.println("File not found. Reenter file name:");
			}
		}

		// continue to read while file contains info
		while (inputFile.hasNextLine())
		{
			// read the line
			String line = inputFile.nextLine();
			// output it to console
			System.out.println(line);
		}

	}
}
