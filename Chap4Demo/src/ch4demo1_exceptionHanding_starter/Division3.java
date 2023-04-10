package ch4demo1_exceptionHanding_starter;

import java.util.Scanner;

public class Division3 {

	public static void main(String[] args) {
		Scanner consoleInput = new Scanner(System.in);
		/* TODO: Convert the program to do the following:
		   (1) The program will guarantee to get two double values 
		   (handle InputMismatchException)
		   (2) Handle divide-by-zero exception. Whenever an exception happens, 
		   the program will start over again from (1).
		   */		
		while(true) {
			System.out.println("This program calculates a/b.");
			try {
				System.out.println("Enter an integer for a: ");
				int a = consoleInput.nextInt();
				System.out.println("Enter an integer for b: ");
				int b = consoleInput.nextInt();

				int answer = a/b;
				System.out.println(a + "/" + b + " = " + answer);
				break;
			}
			catch(java.util.InputMismatchException ex) {
				System.out.println("Sorry- that wasn't an integer!");
				consoleInput.nextLine();
			}
			catch (java.lang.ArithmeticException ex) {
				System.out.println("Sorry- divide by zero because b is zero.");
			}
		}
	}

}
