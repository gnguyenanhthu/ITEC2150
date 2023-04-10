package ch4Review_Q1Example;
import java.util.Scanner;

public class GetAGoodInteger {
	public static void main(String[] args) {
		Scanner consoleInput = new Scanner(System.in);
		System.out.println("Enter an integer:");
		while (true) {
			String numberString = consoleInput.nextLine();
			try {			
				int num = Integer.parseInt(numberString);
				System.out.println("The integer is " + num);
				break;
			} catch (java.lang.NumberFormatException ex) {
				System.out.println("Not an integer. Re-enter:");
			}
		}
		consoleInput.close();
	}
}
