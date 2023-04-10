package Chap3Q2HW;

public class History extends Course {
	private boolean eligible;
	private String type;
	public History(int crnNumber, String name, String category, boolean eligible, String type) {
		super(crnNumber, name, category);
		this.eligible = eligible;
		this.type = type;
	}
	public boolean isEligible() {
		return eligible;
	}
	public void setEligible(boolean eligible) {
		this.eligible = eligible;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return super.toString() + " History [eligible=" + eligible + ", type=" + type + "]";
	}
	
}

