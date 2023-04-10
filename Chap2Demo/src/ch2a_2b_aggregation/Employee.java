package ch2a_2b_aggregation;

public class Employee {
	int id;
	String name;
	//Aggregation: has-a relationship. Employee has an address.
	//Since an address can exist independently (e.g. it could be used 
	//for a GIS application), the relationship is aggregation. 
	
	Address address;//Address is a class
	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	//Employee [id=1, name=Jane Smith, address=123 Main St., Lawrenceville, GA 30046]
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	//Another good example is that a company has a list of departments.
	//Department objects can exist independently of Company objects.
	
    //Define all necessary methods for Employee
	
	
}
