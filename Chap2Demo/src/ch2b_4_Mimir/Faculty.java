package ch2b_4_Mimir;


/**
 * 
 * @author Dr. Wei Jin (wjin@ggc.edu)
 * 
 * Class: Faculty
 *
 */
//TODO 1: make sure Faculty is a subclass of Employee
public class Faculty extends Employee
{
	private String dept;

	public Faculty(long id, String firstName, String lastName, String division, String dept) {
		super(id, firstName, lastName, division);
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Faculty " + super.toString() + ", dept=" + dept + "]";
	}
	
	//TODO 2: implements one constructor, getter and setter for dept, toString
	
}
