package finalReview2_ExceptionHanding_Step2_CustomException;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Main method for ch4 demo3
 * 
 * @author wjin@ggc.edu
 *
 */
public class BaggingApplesPipeline
{
	public static void main(String[] args) 
	{
		ArrayList<BaggingCalculator> calculators = new ArrayList<>();
		Scanner in = new Scanner (System.in);

		for (int i=1; i<=3; i++) {
			boolean correct = false;
			while (!correct) {
				// check out two different fraction
				try {
					System.out.printf("Enter total apples and # apples per bag for robot %d :\n", i);
					int total = in.nextInt();
					int applesPerBag = in.nextInt();

					BaggingCalculator calculator = new BaggingCalculator(total, applesPerBag);
					calculators.add(calculator);

					correct = true;
				}
				catch (IllegalUnitSizeException ex) {
					System.out.println(ex.getMessage());
				}
			}
		}


		for (int i=0; i<calculators.size(); i++)
		{	
			System.out.printf("For robot %d, # bags: %d, # leftover: %d\n", i+1, 
					calculators.get(i).getBags(), calculators.get(i).getLeftover());
		}
	}
}
