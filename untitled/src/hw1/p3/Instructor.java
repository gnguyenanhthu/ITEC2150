package hw1.p3;

import java.util.ArrayList;
public class Instructor extends Grizzly{
    private ArrayList<Course> courses;
    public Instructor(String name) {
        super(name);
        courses = new ArrayList<Course>();
    }
    public void teachCourse(Course course) {
        this.courses.add(course);
        course.setInstructor(this);
    }


    @Override
    public String toString() {
        String courseNames = "";
        for (Course course : courses) {
            courseNames += course.getName() + ",";
        }
        if (courseNames. length() > 0) {
            courseNames = courseNames.substring(0, courseNames.length()-1);
    }
        return "Intructor{id: " + super.getId() + ", name:" + super.getName() + ", courses: " + courseNames;
}

}
