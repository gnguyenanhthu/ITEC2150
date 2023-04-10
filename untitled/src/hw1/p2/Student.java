package hw1.p2;
import java.util.ArrayList;
public class Student extends Grizzly {
    private ArrayList<Course> courses;

    public Student(String name) {
        super(name);
        courses = new ArrayList<Course>();
}

    // getter for course
    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void addCourse(Course course) {
        if (courses.contains(course)) {
            System.out.println("Student is already enrolled in this course ");
        } else {
            courses.add(course);
            // course.addStudent(this);
        }
    }
    public void dropCourse(Course course){
        if (courses.contains(course)) {
            courses.remove(course);
           // course.dropStudent(this);
        } else {
            System.out.println("Student is not enrolled in this course");
        }
    }

    @Override
    public String toString() {
        String str = "Student{" + "id: " + id + ", name: " + name + ",courses: []}";
                for (Course course : courses){
                    str += course.getName() + ",";
                }
                return str;
    }
}
