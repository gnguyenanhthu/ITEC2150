package ClassAssignment_4;

public class Faculty extends Employee{
    public Faculty(String name, String department, double salary) {
        super(name, department, salary);
    }

    @Override
    public String toString() {
        String str = String.format("Faculty{name=%s, department=%s, salary=%.2f}", name,department, salary);
        return str;

    }
}
