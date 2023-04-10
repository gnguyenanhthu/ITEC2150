package ch2c_prephw;

public class Dog extends Pet{
	private String breed;

	public Dog(String name, String ownerName, int age, String hairColor, String breed) {
		super(name, ownerName, age, hairColor);
		this.breed = breed;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	@Override
	public String toString() {
		return super.toString() + " Dog [breed=" + breed + "]";
	}
	
}
