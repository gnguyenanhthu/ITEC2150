package ch2b_4_Mimir;


/**
 * 
 * @author Dr. Wei Jin (wjin@ggc.edu)
 * 
 * Class: Employee
 *
 */
public class Employee 
{
	private long id;
	private String firstName;
	private String lastName;
	private String division;
	
	public Employee(long id, String firstName, String lastName, String division) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.division = division;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", division=" + division;
	}
	
	//TODO: implement one constructor, gettes and setters for all attributes, toString
	
}
