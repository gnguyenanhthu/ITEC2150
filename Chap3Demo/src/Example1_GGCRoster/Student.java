package Example1_GGCRoster;

/**
 * 
 * @author Dr. Wei Jin (wjin@ggc.edu)
 * 
 * Class: Student
 *
 */
public class Student extends GGCMember 
{
	private String major;

	public Student(long id, String firstName, String lastName, String major) 
	{
		super(id, firstName, lastName);
		this.major = major;
	}

	public String getMajor() 
	{
		return major;
	}

	public void setMajor(String major) 
	{
		this.major = major;
	}

	@Override
	public String toString() 
	{
		return "Student [ID=" + getID() + ", major=" + major + 
				", " + getFirstName() + " " + getLastName() + "]";
	}
}
