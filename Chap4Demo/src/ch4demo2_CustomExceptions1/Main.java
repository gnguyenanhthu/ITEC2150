package ch4demo2_CustomExceptions1;

import java.util.Scanner;
import java.util.*;

/**
 * Main method for ch4 demo3
 * 
 * @author wjin@ggc.edu
 *
 */
public class Main
{
	public static void main(String[] args) throws Exception
	{
		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.print("Enter the numerator: ");
			int numerator = getAnInteger(input);
			System.out.print("Enter the denominator: ");
			int denominator = getAnInteger(input);

			try {
				Fraction fraction = new Fraction(numerator, denominator);
				System.out.println(fraction);
				break;
			} catch (IllegalFractionException e) {
				System.out.println(e.getMessage());
			}
		}
		
	}

	public static int getAnInteger(Scanner input) {
		while(true) {
			try {
				int number = input.nextInt();
				return number;
			} catch (InputMismatchException ex) {
				System.out.print("Not an integer. Re-enter:");
				input.nextLine();
			}
		}
	}
}
