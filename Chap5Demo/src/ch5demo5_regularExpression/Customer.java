package ch5demo5_regularExpression;

/**
 * This class contains information about a client/customer that is maintained in
 * a business's data store. The class follows good object oriented principles
 * for data encapsulation and hiding.
 *
 */
public class Customer
{
	// attributes of the client
	private int id;
	private String name;
	private String address;

	// constructor- no default constructor provided so number, name and address info
	// must be provided
	// at construction time. No set methods are provided to enforce this.
	public Customer(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	// getter methods to allow information to be viewed outside the class
	/**
	 * @return the clientNumber
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Customer [Id:" + id + ", name:" + name + ", address:" + address + "]";
	}

}
