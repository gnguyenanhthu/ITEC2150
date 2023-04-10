package finalreview1Q1_starter;

/**Class: Employee
 * @author Wei Jin
 * @version 1.0
 * Course : ITEC 2150 Fall 2020
 * Written: October 31, 2020
 *
 * This class models an employee of a company.
 */
public class Employee
{
	private int deptId;
	private int age;
	private String name;

	public Employee(int deptId, int age, String name)
	{
		this.deptId = deptId;
		this.age = age;
		this.name = name;
	}
	
	public int getDeptId() 
	{
		return deptId;
	}

	public int getAge() 
	{
		return age;
	}

	public String getName()
	{
		return name;
	}
	

	public String toString()
	{
		return "Employee[dept:"+ deptId + " age:"+ age +" name:"+ name + "]";
	}
}