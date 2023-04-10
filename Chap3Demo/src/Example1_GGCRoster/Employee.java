package Example1_GGCRoster;

/**
 * 
 * @author Dr. Wei Jin (wjin@ggc.edu)
 * 
 * Class: Employee
 *
 */
public class Employee extends GGCMember 
{
	private String division;

	public Employee(long id, String firstName, String lastName, String division) 
	{
		super(id, firstName, lastName);
		this.division = division;
	}

	public String getDivision() 
	{
		return division;
	}

	public void setDivision(String division) 
	{
		this.division = division;
	}

	@Override
	public String toString() 
	{
		return "Employee [ID=" + super.getID() + ", division=" + division + 
				", " + super.getFirstName() + " " + super.getLastName() + "]";
	}
}
