package ch5demo5_regularExpression;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * This example reads a set of numbers stored in a comma delimited file (.csv)
 * output from Excel using regular expressions- it sums the numbers and prints
 * the sum. To run properly need example file Book1.csv in default file location
 *
 */
public class ReadCustomerInfo
{

	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner console = new Scanner(System.in);

		System.out.println("Enter a file name that constains client data:");
		Scanner inputFile = null;
		//TODO 1:
		//Add a loop to process exception and print the following 
		//if file not found:
		//System.out.println("File not found. Re-enter file name:");
		while(true) {
			String fileName = console.nextLine();
			File theFile = new File(fileName);
			try {
				inputFile = new Scanner(theFile);
				break;
			} catch (FileNotFoundException e) {
				System.out.println("File not found. Re-enter file name:");
			}
		}


		ArrayList<Customer> list = new ArrayList<>();

		// TODO 2: Correct the regular exppression so that spaces before/after # are allowed
		String regex = "(\\s)*#(\\s)*|(\\s)*(\\n)";     
		inputFile.useDelimiter(regex);

		// TODO3: exit the program if the input file format is wrong. 
		// print error info on which line of the input file the error starts.
		int countLine = 0;
		while (inputFile.hasNext())
		{	
			++countLine;
			try {
				int id = Integer.parseInt(inputFile.next());
				String name = inputFile.next();
				String address = inputFile.next();
				Customer c = new Customer(id, name, address);
				list.add(c);
				
			} catch (NoSuchElementException e) {
				System.out.println("Line " + countLine + " has format error. Stop reading the file.");
				System.exit(1);
			}
		}

		for (Customer c: list) {
			System.out.println(c);
		}

		//TODO5: add code to write all customers' info to a csv file
		PrintWriter outputFile;
		System.out.println("Enter the name of the file to be created: ");
		while (true) {
			String fileName = console.nextLine();
			// variable to hold info about the File
			File theFile = new File(fileName);
			
			try {
				outputFile = new PrintWriter(theFile);
				break;
			} catch (FileNotFoundException e) {
				System.out.println("File not found. Re-enter file name:");
			}
		}
		for (Customer c: list) {
			outputFile.println(c);
		}
		inputFile.close();
		outputFile.close();
	}
}
