package finalReview2_Q2;

import finalReview2_Q1.IllegalHoursException;
import finalReview2_Q1.IllegalLevelException;

/**
 * @author wjin@ggc.edu
 *
 */
public class Employee
{
	private String name;
	private int level;
	private double hours;
	private double payRate;

	/*
	 * TODO: In the constructor, check the validity of level and hours and 
	 * throw proper exceptions for invalid level or hours
	 */
	public Employee(String name, int level, double hours, double payRate) throws IllegalLevelException, IllegalHoursException 
	{
		if (level != 1 && level!= 2) {
			throw new IllegalLevelException();
		}
		else if (level == 1 && hours > 40) {
			throw new IllegalHoursException(level, 40);
		}
		else if (level == 2 && hours > 60) {
			throw new IllegalHoursException(level, 60);
		}
		this.name = name;
		this.level = level;
		this.hours = hours;
		this.payRate = payRate;
	}

	public double getPay()
	{
		double pay = hours * payRate;

		if (hours > 40) {
			pay += (hours - 40) * payRate / 2;
		}

		return pay;
	}

	public String toString()
	{
		return String.format("Employee[%s, pay: $%.2f]", name, getPay());
	}
}
