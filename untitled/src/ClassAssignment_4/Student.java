package ClassAssignment_4;

public class Student extends Grizzly{
    private String major;

    public Student(String name, String major) {
        super(name);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }


    @Override
    public String toString() {
        return "Student{" +
                "major='" + major + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

