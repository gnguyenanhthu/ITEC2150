package Chap1Hw;

public class Course {
	private String name, department;
	private int codeCourse, section, creditHours;
	
	public Course() {
		this.name = "Programming Fundamentals";
		this.department = "ITEC";
		this.codeCourse = 2140;
		this.section = 1;
		this.creditHours = 4;
	}

	public Course(String name, String department, int codeCourse, int section, int creditHours) {
		super();
		this.name = name;
		this.department = department;
		this.codeCourse = codeCourse;
		this.section = section;
		this.creditHours = creditHours;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getCodeCourse() {
		return codeCourse;
	}

	public void setCodeCourse(int codeCourse) {
		this.codeCourse = codeCourse;
	}

	public int getSection() {
		return section;
	}

	public void setSection(int section) {
		this.section = section;
	}

	public int getCreditHours() {
		return creditHours;
	}

	public void setCreditHours(int creditHours) {
		this.creditHours = creditHours;
	}

	@Override
	public String toString() {
		return "Course [dept=" + department + ", code=" + codeCourse + ", name=" + name +  ", section="
				+ section + ", credits=" + creditHours + "]";
	}

	
}
