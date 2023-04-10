package Example1_GGCRoster;

/**
 * 
 * @author Dr. Wei Jin (wjin@ggc.edu)
 * 
 * Class: GGCRoster
 *
 */

public class GGCRoster 
{
	public static void main(String[] args) 
	{
		GGCMember m;
		
		m = new Student(90011022L, "John", "Smith", "MATH"); //m is bound to a Student object
		System.out.println(m); //toString method for the Student object will be invoked
		
		m = new Staff(90003088L, "Rachel", "Morgan", "Academic Affairs", "SST"); //m is bound to a Staff object
		System.out.println(m); //toString method for the Staff object will be invoked

		m = new Faculty(90021028L, "Linda", "Davis", "Academic Affairs", "CHEM"); //m is bound to a Faculty object
		System.out.println(m); //toString method for the Faculty object will be invoked
	}
}
