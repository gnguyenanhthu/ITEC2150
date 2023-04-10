package ch4demo1_exceptionHanding_starter;

import java.util.Scanner;

public class GetAnInt0
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter the first number to add");
		
		int number = 0;
		while(true) {
			String numberString = input.nextLine();
			try {
				number = Integer.parseInt(numberString);
				break;
			}
			catch (java.lang.NumberFormatException ex){
				System.out.println("Sorry not an integer- try again");
			}
		}

		System.out.println("number is " + number);
	}
}