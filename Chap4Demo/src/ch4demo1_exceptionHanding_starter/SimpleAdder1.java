package ch4demo1_exceptionHanding_starter;

import java.util.Scanner;

public class SimpleAdder1
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{

		Scanner input = new Scanner(System.in);
		int number1 = 0, number2 = 0;
		
		while(true) {
			System.out.println("Please enter the first number to add");
			String numberString = input.nextLine();
			try {
				number1 = Integer.parseInt(numberString);
				break;
			}
			catch (java.lang.NumberFormatException ex){
				System.out.println("Sorry not an integer- try again");
			}
		}
		
		while(true) {
			System.out.println("Please enter the second number to add");
			String numberString = input.nextLine();
			try {
				number2 = Integer.parseInt(numberString);
				break;
			}
			catch (java.lang.NumberFormatException ex){
				System.out.println("Sorry not an integer- try again");
			}
		}

		int sum = number1 + number2;
		System.out.println("The sum is " + sum);

	}

}