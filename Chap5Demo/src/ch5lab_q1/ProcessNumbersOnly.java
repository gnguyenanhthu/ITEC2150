package ch5lab_q1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * Program reads a file that contains a sequence of numbers. 
 * Program should calculate the average of all the numbers.
 *
 */
public class ProcessNumbersOnly
{

	public static void main(String[] args)
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

		int numberCount = 0;
		double sum = 0;
		while (inputFile.hasNextDouble()) {
			double num = inputFile.nextDouble();
			numberCount++;
			sum = sum + num;
		}

		double average = sum / numberCount;
		System.out.println(numberCount + " numbers read.");
		System.out.printf("The average of the numbers from file " + fileName + " is %.2f.\n", average);
	}
}