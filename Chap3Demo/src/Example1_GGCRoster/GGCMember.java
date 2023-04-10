package Example1_GGCRoster;

/**
 * 
 * @author Dr. Wei Jin (wjin@ggc.edu)
 * 
 * Class: GGCMember
 *
 */

public class GGCMember 
{
	private long id;
	private String firstName;
	private String lastName;
	
	public GGCMember(long id, String firstName, String lastName) 
	{
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public long getID() 
	{
		return id;
	}

	public void setID(long id) 
	{
		this.id = id;
	}

	public String getFirstName() 
	{
		return firstName;
	}

	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}

	public String getLastName() 
	{
		return lastName;
	}

	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}

	@Override
	public String toString() 
	{
		return "GGCMember [ID=" + id + ", " + firstName + " " + lastName + "]";
	}
}
