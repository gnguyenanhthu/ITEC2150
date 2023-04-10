package ch4Review_Q3;

import java.util.InputMismatchException;
import java.util.Scanner;

import Chap4BEx4.IllegalTriangleSideException;
import Chap4BEx4.Triangle;

public class Main {
	public static void main(String[] args) {
		Scanner consoleInput = new Scanner(System.in);

		System.out.println("Make a MagicTwo object from two user entered integers.");
		System.out.println("Their sum is in [8, 10] and their product is in [10, 20].");

		while(true) {
			System.out.println("Enter number 1:");
			int num1 = getAnInteger(consoleInput);

			System.out.println("Enter number 2:");
			int num2 = getAnInteger(consoleInput);

			try {
				MagicTwo magicObject = new MagicTwo(num1, num2);
				System.out.println("The newly created MagicTwo object: " + magicObject);
				break;
			} catch (IllegalMagicTwoValuesException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		}
	}

	public static int getAnInteger(Scanner input) {
		while(true) {
			String numberString = input.nextLine();
			try {
				int number = Integer.parseInt(numberString);
				return number;
			} catch (java.lang.NumberFormatException ex) {
				System.out.println("Not an integer. Re-enter:");
			}
		}
	}
}
