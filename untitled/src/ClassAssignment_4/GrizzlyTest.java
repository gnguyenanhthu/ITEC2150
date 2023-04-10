package ClassAssignment_4;
import java.util.ArrayList;
public class GrizzlyTest {

    public static void main(String[] args) {
        Faculty alice = new Faculty ("Alice", "ITEC", 100000);
        Staff bob = new Staff("Bob", "Registar", 70000);
        Grizzly grizzly;
        grizzly = alice;
        System.out.println(grizzly);
        grizzly = bob;
        System.out.println(grizzly);

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(alice);
        employees.add(bob);
        employees.add(new Staff("Carol", "Financial Services", 80000));
        employees.add(new Faculty("Daniel", "Business", 110000));
        System.out.println(employees);

        ArrayList<Grizzly> grizzlies = new ArrayList<>();
        grizzlies.addAll(employees);
        Student emily = new Student("Emily","ITEC");
        Student fred = new Student("Fred","Math");
        Student greg = new Student("Greg","ITEC");
        grizzlies.add(emily);
        grizzlies.add(fred);
        grizzlies.add(greg);
        System.out.println(grizzlies);

        Employee.raiseAll(employees, 0.1);
        System.out.println(employees);

        System.out.println(Grizzly.itecGrizzlies(grizzlies));
        System.out.println(Grizzly.numItecGrizzlies(grizzlies));

    }
}
