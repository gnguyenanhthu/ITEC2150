package ch2a_2a_association_mimirMain;

import java.util.ArrayList;

public class Student {
	private String studentName;
	private ArrayList<Course> registeredCourse;

	public Student(String studentName) {
		this.studentName = studentName;
		this.registeredCourse = new ArrayList<Course>();
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public ArrayList<Course> getRegisteredCourse() {
		return this.registeredCourse;
	}
	
	public void addCourse(Course c) {
		this.registeredCourse.add(c);
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", # registeredCourse=" + registeredCourse.size() + "]";
	}
}