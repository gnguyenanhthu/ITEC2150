package ch2c_hw;

public class Math extends Course {
	private boolean stem;
	private String type;
	public Math(int crnNumber, String name, String category, boolean stem, String type) {
		super(crnNumber, name, category);
		this.stem = stem;
		this.type = type;
	}
	public boolean isStem() {
		return stem;
	}
	public void setStem(boolean stem) {
		this.stem = stem;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Math [stem=" + stem + ", type=" + type + "]";
	}
	
}
