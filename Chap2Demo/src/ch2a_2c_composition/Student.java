package ch2a_2c_composition;

/**
 * Class: Person
 */
public class Student
{
	private String name;
	
	//Composition: has-a relationship. Student has a schedule.
	//Since a schedule cannot exist without a student, the 
	//relationship is composition.
	private Schedule schedule;

	public Student(String name) {
		super();
		this.name = name;
		this.schedule = new Schedule();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addClassTime(String classTime) {
		this.schedule.addClassTime(classTime);
	}
	
	public String getSchedule(){
		return name + "'s schedule:\n" + schedule;
	}
    //TODO: Define all necessary methods for Student
	
	
}