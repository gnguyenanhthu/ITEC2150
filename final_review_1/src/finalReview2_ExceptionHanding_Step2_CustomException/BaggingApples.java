package finalReview2_ExceptionHanding_Step2_CustomException;

import java.util.Scanner;

/**
 * Main method for ch4 demo3
 * 
 * @author wjin@ggc.edu
 *
 */
public class BaggingApples
{
	public static void main(String[] args) 
	{
		BaggingCalculator calculator = null;
		boolean correct = false;
		Scanner in = new Scanner (System.in);

		while (!correct) {
			// check out two different fraction
			try {
				System.out.println("Enter total apples and # apples per bag: ");
				int total = in.nextInt();
				int applesPerBag = in.nextInt();

				calculator = new BaggingCalculator(total, applesPerBag);
				
				correct = true;
			}
			catch (IllegalUnitSizeException ex) {
				System.out.println(ex.getMessage());
			}
		}
		
		System.out.println("# bags: " + calculator.getBags());
		System.out.println("# leftover: " + calculator.getLeftover());
	}
}
