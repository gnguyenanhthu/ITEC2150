package ch2c_prephw;

public class Pet {
	private String name, ownerName, hairColor;
	private int age;
	
	public Pet(String name, String ownerName, int age, String hairColor) {
		this.name = name;
		this.ownerName = ownerName;
		this.age = age;
		this.hairColor = hairColor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getHairColor() {
		return hairColor;
	}

	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Pet [name=" + name + ", ownerName=" + ownerName + ", age=" + age + ", hairColor=" + hairColor + "]";
	}
	
}
