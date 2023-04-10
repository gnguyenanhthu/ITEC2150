package finalreview1Q4_starter;

/**Class: Employee
 * @author Wei Jin
 * @version 1.0
 * Course : ITEC 2150 Fall 2020
 * Written: October 31, 2020
 *
 * This class models an employee of a company.
 * 
 * Purpose: Employee objects when sorted should be first by deptId, then by age, 
 *          and then by name.
 */
public class Employee implements Comparable<Employee>
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

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		if (this.deptId != o.deptId)
			return this.deptId - o.deptId;
		else if (this.age!=o.age)
			return this.age - o.age;
		else
			return this.name.compareTo(o.name);
	}

	/** Method: compareTo
	 * Compare this Employee object with another Employee object. If this employee is considered "less than"
	 * the other employee, the method should return a negative value. If this employee is 
	 * considered "greater than" the other employee, the method should return a positive
	 * value. If this employee is the same as the other employee, the method should return 0.
	 * 
	 * The comparison is first based on deptIds. Smaller deptId means "less than".
	 * If the deptIds are the same, the comparison will be based on ages. 
	 * Smaller age means "less than". If the ages are also the same, the comparison 
	 * will be based on the alphabetic order of names.
	 * 
	 * @param o another Employee object
	 **/

	//TODO: Implement the compareTo method according to the description above.
	
}