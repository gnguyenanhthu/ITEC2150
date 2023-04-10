package ch4demo1_exceptionHanding_starter;

import java.util.Scanner;

public class GetAnInt0_UsingException
{
	public static void main(String[] args)
	{

		Scanner input = new Scanner(System.in);
		int number = 0;
		System.out.println("Please enter the first number to add");
		boolean badInput = true;
		while (badInput)
		{
			String numberString = input.nextLine();
			try
			{
				number = Integer.parseInt(numberString);
				badInput = false;
			} 
			catch (NumberFormatException ex)
			{
				System.out.println("Sorry not an integer-try again");
			}
		}
		
		System.out.println("number is " + number);

	}

}