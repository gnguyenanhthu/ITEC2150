package Example1_GGCRoster;

/**
 * 
 * @author Dr. Wei Jin (wjin@ggc.edu)
 * 
 * Class: Staff
 *
 */
public class Staff extends Employee 
{
	private String office;

	public Staff(long id, String firstName, String lastName, String division, String office) 
	{
		super(id, firstName, lastName, division);
		this.office = office;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	@Override
	public String toString() 
	{
		return "Staff [division=" + getDivision() + ", office=" + office + ", " + getFirstName() + " " + getLastName() + "]";
	}
}
