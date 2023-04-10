package Example1_GGCRoster;

/**
 * 
 * @author Dr. Wei Jin (wjin@ggc.edu)
 * 
 * Class: GGCRosterLoop
 *
 */

public class GGCRosterLoop 
{
	public static void main(String[] args) 
	{
		GGCMember[] members = new GGCMember[3];
		
		members[0] = new Student(90011022L, "John", "Smith", "MATH");
		members[1] = new Staff(90003088L, "Rachel", "Morgan", "Academic Affairs", "SST");
		members[2] = new Faculty(90021028L, "Linda", "Davis", "Academic Affairs", "CHEM");
		
		for (GGCMember m: members) {
			System.out.println(m);
		}
	}
}
