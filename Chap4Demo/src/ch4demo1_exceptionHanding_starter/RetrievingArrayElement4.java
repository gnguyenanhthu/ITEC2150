package ch4demo1_exceptionHanding_starter;

import java.util.Random;
import java.util.Scanner;

public class RetrievingArrayElement4 {

	public static void main(String[] args)
	{
		Random random = new Random(888);

		int[] list = new int[50];
		for (int i=0; i < list.length; i++) 
		{
			list[i] = random.nextInt(100);
		}


		System.out.println("The array:");
		for (int n: list) 
		{
			System.out.print(n + " ");
		}
		System.out.println();

		Scanner input = new Scanner(System.in);
        
		/*TODO: Use exception handling to prevent the program from terminating 
          if the index user enters is either not an integer format or it is an 
          out-of-range index (The exception thrown will be ArrayIndexOutOfBounds).
        */
		while(true) {
			try {
				System.out.println("Please enter the index of the array element:");
				int index = input.nextInt();
				System.out.println("The array element at index " + index + " is " + list[index]);
				break;
			}
			catch(java.util.InputMismatchException ex) {
				System.out.println("Sorry index not an integer- try again");
				input.nextLine();
			}
			catch(java.lang.ArrayIndexOutOfBoundsException ex) {
				System.out.println("Sorry index out of bounds- try again");
			}
		}
	}
}
