package ch2b_5a_ComissionEmployee_NoInheritance;

public class BasePlusCommissionEmployee {
	private String firstName;
	private String lastName;
	private String SSN;
	private double grossSales; //gross weekly sales
	private double commissionRate; //commission percentage
	private double baseSalary; //base salary per week

	public BasePlusCommissionEmployee(String firstName, String lastName, String SSN, double grossSales, double commissionRate, double baseSalary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.SSN = SSN;
		setGrossSales(grossSales);
		setCommissionRate(commissionRate);
		setBaseSalary(baseSalary);
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSSN() {
		return SSN;
	}
	public void setSSN(String sSN) {
		SSN = sSN;
	}
	public double getGrossSales() {
		return grossSales;
	}
	public void setGrossSales(double grossSales) {
		if (grossSales < 0)
			this.grossSales = 0;
		else
			this.grossSales = grossSales;
		//Or
		//this.grossSales = (grossSales < 0)? 0: grossSales;
	}
	public double getCommissionRate() {
		return commissionRate;
	}
	public void setCommissionRate(double commissionRate) {
		this.commissionRate = (commissionRate > 0 && commissionRate < 1.0)? commissionRate:0;
	}
	public double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(double baseSalary) {
		this.baseSalary = (baseSalary < 0)? 0: baseSalary;
	}
	//calculate earnings
	public double earnings() {
		return baseSalary + commissionRate * grossSales;
	}
	
	@Override
	public String toString() {
		return String.format("-----------------------------------\nEmployee for %s %s:\nSSN: %s\nGross Sales: %.2f\nCommission rate: %.2f\nBase salary: %.2f\n", 
				firstName, lastName, SSN, grossSales, commissionRate, baseSalary);
	}

	
}
