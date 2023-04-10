package ch4Review_Q2;
import java.util.Scanner;

public class AverageOfThreeIntegers {
	public static void main(String[] args) {
		Scanner consoleInput = new Scanner(System.in);
		
		int[] list = new int[3];
		
		for (int i = 0; i < 3; i++) {
			while(true) {
				try {
					System.out.println("Enter number " + (i+1) + ":");
					list[i] = consoleInput.nextInt();
					break;
				} catch (java.util.InputMismatchException ex) {
					System.out.println("Not an integer. Re-enter:");
					consoleInput.nextLine();
				}
			}
		}
		
		int sum = 0;
		System.out.println("The numbers are:");
		for (int n: list) {
			System.out.print(n + " ");
			sum+=n;
		}
		double average = (double) sum/3;	
		System.out.printf("The average is %.2f", average);
		consoleInput.close();
	}
}
