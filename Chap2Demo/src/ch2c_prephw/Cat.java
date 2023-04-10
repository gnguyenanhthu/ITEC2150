package ch2c_prephw;

public class Cat extends Pet {
	private boolean longHair, clawed;

	public Cat(String name, String ownerName, int age, String hairColor, boolean longHair, boolean clawed) {
		super(name, ownerName, age, hairColor);
		this.longHair = longHair;
		this.clawed = clawed;
	}

	public boolean isLongHair() {
		return longHair;
	}

	public void setLongHair(boolean longHair) {
		this.longHair = longHair;
	}

	public boolean isClawed() {
		return clawed;
	}

	public void setClawed(boolean clawed) {
		this.clawed = clawed;
	}

	@Override
	public String toString() {
		return super.toString() + " Cat [longHair=" + longHair + ", clawed=" + clawed + "]";
	}
	
	
	
}
