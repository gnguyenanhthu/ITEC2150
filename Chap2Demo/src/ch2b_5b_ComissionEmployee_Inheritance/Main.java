package ch2b_5b_ComissionEmployee_Inheritance;


/**
 * 
 * @author Dr. Wei Jin (wjin@ggc.edu)
 * 
 * Class: Main
 *
 */
public class Main 
{
	public static void main(String[] args) 
	{
		CommissionEmployee e1 = new CommissionEmployee("Sue", "Jones", "222-22-2222", 10000, .06);
		System.out.println(e1);
		
		e1.setGrossSales(5000);
		e1.setCommissionRate(1.2);
		System.out.println("Updated information:\n" + e1);
		System.out.printf("Earning this week: %.2f\n\n", e1.earnings());
		
		BasePlusCommissionEmployee e2 = new BasePlusCommissionEmployee("Bob", "Lewis", "333-33-3333", 5000, .04, 300);
		System.out.println(e2);
		
		e2.setBaseSalary(1000);
		System.out.println("Updated information:\n" + e2);
		System.out.printf("Earning this week: %.2f\n\n", e2.earnings());
	}
}
