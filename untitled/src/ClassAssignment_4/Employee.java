package ClassAssignment_4;
import java.util.ArrayList;

public class Employee extends Grizzly{
    protected String department;
    protected double salary;

    public Employee(String name, String department, double salary) {
        super(name);
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public static void raise(Employee employees, double rate) {
        employees.salary += employees.salary * rate;
        // employee.salary *= ( 1 + rate);
    }


    public static void raiseAll(ArrayList<Employee> employees, double rate){
        for (Employee employee : employees) {
            raise(employee, rate);
    }
}
}
