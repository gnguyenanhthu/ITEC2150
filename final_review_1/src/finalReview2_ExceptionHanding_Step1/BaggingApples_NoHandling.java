package finalReview2_ExceptionHanding_Step1;

import java.util.Scanner;

/**
 * Main method for ch4 demo3
 * 
 * @author wjin@ggc.edu
 *
 */
public class BaggingApples_NoHandling
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner (System.in);

		System.out.println("Enter total apples and # apples per bag: ");
		int total = in.nextInt();
		int applesPerBag = in.nextInt();

		BaggingCalculator calculator = new BaggingCalculator(total, applesPerBag);
		System.out.println("# bags: " + calculator.getBags());
		System.out.println("# leftover: " + calculator.getLeftover());
	}
}

