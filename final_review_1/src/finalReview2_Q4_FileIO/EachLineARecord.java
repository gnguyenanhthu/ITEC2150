package finalReview2_Q4_FileIO;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import finalReview2_Q4_FileIO.Employee;


public class EachLineARecord
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
		 * (1) Create an empty Employee array list.
		 * (2) A sample input file is provided: employee1.csv. For each line, 
		 * the file uses the delimit "," as separator for each piece of information
		 * for an employee.
		 * Read a line from the inputFile. 
		 * Create an employee object and add it to the array list.
		 * (3) Repeat (2)  until the end of input file.
		 * (4) Close the inputFile.
		 */
		ArrayList<Employee> list = new ArrayList<>();
		inputFile.useDelimiter(",(\\s)*");
		while(inputFile.hasNextLine()) {
			String line = inputFile.nextLine();
			String[] arr = line.split(",");
			Employee e = new Employee(arr[0],Integer.parseInt(arr[1]),arr[2]);
			list.add(e);
		}
		inputFile.close();
		
		/* TODO 4: 
		 * (1) Use a for loop to go through all the employees 
		 * in the array list and print the info to the outputFile.
		 * For each employee, write the return value of the toString
		 * to the file.
		 * (2) Close outputFile.
		 */
		for (Employee e: list) {
			outputFile.println(e);
		}
		
		outputFile.close();
		// Display a message when all done.
		System.out.println("Information Summary done.");
	}
}
