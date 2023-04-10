package Example1_GGCRoster;

/**
 * 
 * @author Dr. Wei Jin (wjin@ggc.edu)
 * 
 * Class: Faculty
 *
 */
public class Faculty extends Employee 
{
	private String dept;

	public Faculty(long id, String firstName, String lastName, String division, String dept) 
	{
		super(id, firstName, lastName, division);
		this.dept = dept;
	}

	public String getDept() 
	{
		return dept;
	}

	public void setDept(String dept) 
	{
		this.dept = dept;
	}

	@Override
	public String toString() 
	{
		return "Faculty [division=" + getDivision() + ", dept=" + dept + ", " + getFirstName() + " " + getLastName() + "]";
	}
}
