package finalReview2_Q1;

import java.util.Scanner;

/**
 * Main method for ch4 review
 * 
 * @author wjin@ggc.edu
 *
 */
public class EmployeePaymentApp
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner (System.in);
		/*TODO: 
		 * Use exceptions to handle invalid level or hours.
		 * Repeat until a valid set of employee info is entered.
		 */
		Employee employee = null;
		
		while(true) {
			System.out.println("Enter name, level, hours, pay rate(one on each line):");
			String name = in.nextLine();
			int level = Integer.parseInt(in.nextLine());
			double hours = Double.parseDouble(in.nextLine());
			double rate = Double.parseDouble(in.nextLine());
			try {
				employee = new Employee(name, level, hours, rate);
				break;
			} catch (IllegalLevelException e) {
				// TODO Auto-generated catch block
				System.out.print(e.getMessage());
			} catch (IllegalHoursException e) {
				// TODO Auto-generated catch block
				System.out.print(e.getMessage());
			}
		}
		//End of segment to be changed

		//Print the employee pay check. Nothing
		System.out.println(employee);
	}
}
