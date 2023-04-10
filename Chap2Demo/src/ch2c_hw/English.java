package ch2c_hw;

public class English extends Course {
	private String level, type;

	public English(int crnNumber, String name, String category, String level, String type) {
		super(crnNumber, name, category);
		this.level = level;
		this.type = type;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "English [level=" + level + ", type=" + type + "]";
	}
	
}
