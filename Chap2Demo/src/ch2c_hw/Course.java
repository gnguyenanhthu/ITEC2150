package ch2c_hw;

public class Course {
	private int crnNumber;
	private String name, category;
	public Course(int crnNumber, String name, String category) {
		this.crnNumber = crnNumber;
		this.name = name;
		this.category = category;
	}
	
	public int getCrnNumber() {
		return crnNumber;
	}
	public void setCrnNumber(int crnNumber) {
		this.crnNumber = crnNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Course [crn=" + crnNumber + ", name=" + name + ", category=" + category + "]";
	}
	
	
	
}
