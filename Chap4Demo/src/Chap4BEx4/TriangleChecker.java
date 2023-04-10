package Chap4BEx4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TriangleChecker {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while(true) {
			System.out.println("Enter side 1:");
			double side1 = getAnInteger(input);
			System.out.println("Enter side 2:");
			double side2 = getAnInteger(input);
			System.out.println("Enter side 2:");
			double side3 = getAnInteger(input);

			Triangle triangle;
			try {
				triangle = new Triangle(side1, side2, side3);
				System.out.println(triangle);
				break;
			} catch (IllegalTriangleSideException e) {
				// TODO Auto-generated catch block
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
