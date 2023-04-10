package Example1_GGCRoster;

/**
 * 
 * @author Dr. Wei Jin (wjin@ggc.edu)
 * 
 * Class: GGCRosterNoPolymorphism
 *
 */
public class GGCRosterNoPolymorphism 
{
	public static void main(String[] args) 
	{
		Student m1 = new Student(90011022L, "John", "Smith", "MATH");
		System.out.println(m1);
		
		Staff m2 = new Staff(90003088L, "Rachel", "Morgan", "Academic Affairs", "SST");
		System.out.println(m2);
		
		Faculty m3 = new Faculty(90021028L, "Linda", "Davis", "Academic Affairs", "CHEM");
		System.out.println(m3);
	}
}
