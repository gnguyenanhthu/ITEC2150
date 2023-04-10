package ch2b_5b_ComissionEmployee_Inheritance;

public class CommissionEmployee {
	private String firstName;
	private String lastName;
	private String SSN;
	protected double grossSales; //gross weekly sales
	protected double commissionRate; //commission percentage

	public CommissionEmployee(String firstName, String lastName, String SSN, double grossSales, double commissionRate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.SSN = SSN;
		setGrossSales(grossSales);
		setCommissionRate(commissionRate);
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
	
	//calculate earnings
	public double earnings() {
		return commissionRate * grossSales;
	}
	
	@Override
	public String toString() {
		return String.format("-----------------------------------\nEmployee for %s %s:\nSSN: %s\nGross Sales: %.2f\nCommission rate: %.2f\n", 
				firstName, lastName, SSN, grossSales, commissionRate);
	}

	
}
