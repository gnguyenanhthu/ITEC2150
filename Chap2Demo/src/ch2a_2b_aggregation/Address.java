package ch2a_2b_aggregation;

public class Address {
	private int streetNumber;
	private String streetName;
	private String city;
	private String state;
	private int zipCode;
	public Address(int streetNumber, String streetName, String city, String state, int zipCode) {
		super();
		this.streetNumber = streetNumber;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}
	public int getStreetNumber() {
		return streetNumber;
	}
	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	@Override
	public String toString() {
		return streetNumber + " " + streetName + ", " + city + ", "
				+ state + " " + zipCode;
	}
	
	

	//TODO: define all necessary methods for Address
	
	
	
}
