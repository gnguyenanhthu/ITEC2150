package hw1.p1;
import java.util.ArrayList;
public class Course {
    private String name;
    private int capacity;
    private ArrayList<String> roster;

    public Course(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.roster = new ArrayList<String>();
    }
    public String getName() {
        return name;
    }

    public boolean add(String student) {
        if (roster.size() < capacity) {
            roster.add(student);
            return true;
        } else {
            System.out.println(name + "is full");
            return false;
        }
    }

    public void remove(String student) {
        roster.remove(student);
    }


    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", roster=" + roster +
                '}';
    }
}
