package ch2a_2a_association_mimirMain;

import java.util.ArrayList;

public class Teacher {
	private String teacherName;
	private ArrayList<Course> coursesToTeach;

	public Teacher(String studentName) {
		this.teacherName = studentName;
		this.coursesToTeach = new ArrayList<Course>();
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String studentName) {
		this.teacherName = studentName;
	}

	public ArrayList<Course> getCoursesToTeach() {
		return this.coursesToTeach;
	}
	
	public void addCourse(Course c) {
		this.coursesToTeach.add(c);
	}

	@Override
	public String toString() {
		return "Teacher [teacherName=" + teacherName + ", # coursesToTeach=" + coursesToTeach.size() + "]";
	}
}
