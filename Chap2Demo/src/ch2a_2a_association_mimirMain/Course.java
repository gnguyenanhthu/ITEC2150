package ch2a_2a_association_mimirMain;

import java.util.ArrayList;

public class Course
{
	private String courseName;
	private Teacher teacher;
	private ArrayList<Student> enrollmentList;

	public Course(String courseName, Teacher teacher) {
		this.courseName = courseName;
		this.teacher = teacher;
		this.enrollmentList = new ArrayList<Student>();
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}	
	
	public ArrayList<Student> getEnrollmentList() {
		return enrollmentList;
	}

	public void addStudent(Student s) {
		this.enrollmentList.add(s);
	}

	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", teacher=" + teacher + ", enrollmentList=" + enrollmentList + "]";
	}
}