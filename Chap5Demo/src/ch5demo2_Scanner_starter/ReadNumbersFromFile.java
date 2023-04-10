package ch5demo2_Scanner_starter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * Use with numbers.txt in default file directory Program reads the numbers.txt
 * file and averages all the numbers
 *
 */
public class ReadNumbersFromFile {

	public static void main(String[] args) {
		Scanner consoleInput = new Scanner(System.in);
		// declare variables outside try/catch block to avoid scope issues
		Scanner inputFile = null;
		// keep a running total of numbers read
		double sum = 0;
		// keep count of numbers read
		int numberCount = 0;
		System.out.println("Enter file name: ");

		while(true) {
			String fileName = consoleInput.nextLine();
			try {
				inputFile = new Scanner(new File(fileName));
				break;
			} catch (FileNotFoundException e) {
				System.out.println("File not found. Reenter file name: ");
			}
		}

		while (inputFile.hasNextDouble()) {
			double num = inputFile.nextDouble();
			numberCount++;
			sum = sum + num;
		}

		// computer and print average of the numbers
		double average = sum / numberCount;
		System.out.println(numberCount + " numbers read.");
		System.out.println("The average of the numbers read is: " + average);
	}
}
