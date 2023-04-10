package ch2b_5b_ComissionEmployee_Inheritance;

public class BasePlusCommissionEmployee extends CommissionEmployee {
	private double baseSalary; //base salary per week

	public BasePlusCommissionEmployee(String firstName, String lastName, String SSN, double grossSales,
			double commissionRate, double baseSalary) {
		super(firstName, lastName, SSN, grossSales, commissionRate);
		this.baseSalary = baseSalary;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = (baseSalary > 0)? baseSalary:0;
	}
	
	public double earnings() {
		return super.earnings() + baseSalary;
	}

	@Override
	public String toString() {
		return super.toString() + String.format("baseSalary: %2f\n",baseSalary);
	}

	
}
