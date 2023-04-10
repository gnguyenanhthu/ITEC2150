package ch5lab_q3;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Program reads a file that contains a sequence of numbers. 
 * Program should calculate the average of all the numbers.
 *
 */
public class ProcessNumbersOnly
{

	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner consoleInput = new Scanner(System.in);
		System.out.println("Enter name of the file that contains numbers:");
		Scanner inputFile = null;
		String fileName = null;
		while (true) {
			fileName = consoleInput.nextLine();
			try {
				inputFile = new Scanner(new File(fileName));
				break;
			} catch (FileNotFoundException e) {
				System.out.println("File " + fileName + " does not exist. Re-enter file name:");
			}
		}

		String regex = "(\\s)*,(\\s)*|(\\s)*(\\n)";
		inputFile.useDelimiter(regex);

		int numberCount = 0;
		double sum = 0;
		while (inputFile.hasNext())
		{
			try {
				double num = inputFile.nextDouble();
				numberCount++;
				sum = sum + num;
				System.out.println(num);
			} catch (InputMismatchException e) {
				System.out.println("skipped a non-number");
				inputFile.nextLine();
			}		
		}
		
		double average = sum / numberCount;
		System.out.println(numberCount + " numbers read.");
		System.out.printf("The average of the numbers from file " + fileName + " is %.2f.\n", average);
		
		System.out.println("Enter name of the file that will store the statistics for " + fileName + ":");
		PrintWriter outputFile;
		while (true) {
			String outFileName = consoleInput.nextLine();
			File theFile = new File(outFileName);	
			try {
				outputFile = new PrintWriter(theFile);
				outputFile.println(numberCount + " numbers read.");
				outputFile.printf("The average of the numbers from file " + fileName + " is %.2f.\n", average);
				break;
			} catch (FileNotFoundException e) {
				System.out.println("File " + outFileName + " does not exist. Re-enter file name:");
			}
		}
		
		outputFile.close();
	}
}