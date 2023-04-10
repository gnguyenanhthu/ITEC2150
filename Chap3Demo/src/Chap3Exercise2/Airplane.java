package Chap3Exercise2;

public class Airplane extends Flight {
	String model;
	int year;
	public Airplane(String model, int year) {
		this.model = model;
		this.year = year;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public void fly() {
		System.out.println("I'm an airplane that relies on an engine to fly.");
	}
	
	@Override
	public String toString() {
		return "Airplane [model=" + model + ", year=" + year + "]: ";
	}
}
