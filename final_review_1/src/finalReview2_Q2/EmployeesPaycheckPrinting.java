package finalReview2_Q2;

import java.util.ArrayList;
import java.util.Scanner;

import finalReview2_Q1.IllegalHoursException;
import finalReview2_Q1.IllegalLevelException;

/**
 * Main method for ch4 demo3
 * 
 * @author wjin@ggc.edu
 *
 */
public class EmployeesPaycheckPrinting
{
	public static void main(String[] args) 
	{
		ArrayList<Employee> employees = new ArrayList<>();
		Scanner in = new Scanner (System.in);

		for (int i=1; i<=3; i++) {
			/*TODO: 
			 * Use exceptions to handle invalid level or hours.
			 * Repeat until a valid set of employee info is entered.
			 */
			while(true) {
				System.out.printf("For employee %d, Enter name, level, hours, pay rate (one on each line):\n", i);
				String name = in.nextLine();
				int level = Integer.parseInt(in.nextLine());
				double hours = Double.parseDouble(in.nextLine());
				double rate = Double.parseDouble(in.nextLine());

				Employee employee;
				try {
					employee = new Employee(name, level, hours, rate);
					employees.add(employee);
					break;
				} catch (IllegalLevelException e) {
					// TODO Auto-generated catch block
					System.out.print(e.getMessage());
				} catch (IllegalHoursException e) {
					// TODO Auto-generated catch block
					System.out.print(e.getMessage());
				}

			}
		}


		//Print the employees' pay checks
		for (int i=0; i<employees.size(); i++)
		{	
			System.out.println(employees.get(i));
		}
	}
}
