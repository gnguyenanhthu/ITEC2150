package ch4demo2_CustomExceptions1;

import java.util.Scanner;

/** 
 * @author Wei Jin wjin@ggc.edu
 *
 */
public class WhileLoopReview
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		/*
		 * The program should prompt user to enter a category 
		 * from three choices: English, Math and History. 
		 * If there is a typo or not one of the three, the 
		 * program should prompt the user until user enters 
		 * a valid category.
		 */
		System.out.println("Enter a category (English, Math, or History):");		
		String category = "";
		while (true) {
			category = input.nextLine();
			if (category.equals("English") || category.equals("History") || category.equals("Math"))
				break;
			else
				System.out.println("Categorya not English, Math, or History. Re-enter:");
		}
		System.out.println("Category: " + category);
	}
}
