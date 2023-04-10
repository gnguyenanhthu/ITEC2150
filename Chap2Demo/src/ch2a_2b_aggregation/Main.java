package ch2a_2b_aggregation;

public class Main {
	public static void main(String[] args) {
		Address address = new Address(123, "Main St.", "Lawrenceville", "GA", 30046);
		Employee employee = new Employee(1, "Jane Smith", address);
		System.out.println(employee);
	}
}
