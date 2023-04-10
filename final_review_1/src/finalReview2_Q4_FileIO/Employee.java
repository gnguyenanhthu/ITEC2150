package finalReview2_Q4_FileIO;

public class Employee {
	private String fullName;
	private int age;
	private String title;
	
	public Employee(String fullName, int age, String title) {
		super();
		this.fullName = fullName;
		this.age = age;
		this.title = title;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return fullName + ": age " + age + ", " + title;
	}
}
