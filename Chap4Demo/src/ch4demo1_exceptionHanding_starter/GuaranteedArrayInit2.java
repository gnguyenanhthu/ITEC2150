package ch4demo1_exceptionHanding_starter;

/**
 * This class prompts the user for four numbers and then 
 * computes the average and prints it.
 *
 */
import java.util.Scanner;

public class GuaranteedArrayInit2
{

	public static void main(String[] args)
	{

		// declare variables
		Scanner consoleInput = new Scanner(System.in);

		double[] list = new double[4];

		// input numbers
		for (int i = 0; i < 4; i++) {
			//TODO: Use exception handling to guarantee that the array will be initialized
			//      that is, wrong input will not terminate the program.	
			while(true) {
				System.out.println("Enter number " + (i + 1) + ":");
				try {
					list[i] = consoleInput.nextDouble();
					break;
				}
				catch(java.util.InputMismatchException ex) {
					System.out.println("Sorry- that wasn't a number. list[" + i + "] is still 0.0");
					consoleInput.nextLine();
				}
			}
		}
		
		System.out.println("The list:");
		for (double n: list) {
			System.out.print(n + " ");;
		}
		System.out.println();		
	}
}
