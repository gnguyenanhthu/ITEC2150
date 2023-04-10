package hw1.p2;
import java.util.ArrayList;

public class Course{
    private String name;
    private int capacity;
    private ArrayList<Student> roster;

    public Course(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.roster = new ArrayList<Student>();
    }

    public String getName() {
        return name;
    }

    public boolean add(Student student) {
        if (roster.size() < capacity) {
            roster.add(student);
            return true;
        } else {
            System.out.println(name + "is full");
            return false;
        }
    }

    public void remove(Student student) {
        roster.remove(student);
    }


    @Override
    public String toString() {
        String str = "Course{" + "name: " + name + ", capacity:" + capacity + ", roster: []}";
        for (Student student : roster) {
            str += student.getName() + ",";
        }
        return str;
    }
}
