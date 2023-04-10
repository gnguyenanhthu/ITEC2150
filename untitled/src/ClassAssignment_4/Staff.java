package ClassAssignment_4;

public class Staff extends Faculty{
    public Staff(String name, String department, double salary) {
        super(name, department, salary);
    }
        @Override
        public String toString() {
            String str = String.format("Staff{name=%s, department=%s, salary=%.2f}", name,department, salary);
            return str;
        }
    }
