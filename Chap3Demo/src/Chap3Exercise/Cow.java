package Chap3Exercise;

public class Cow extends FarmAnimal {
	String sound;

	public Cow(String name, String gender, double weight, int age, String sound) {
		super(name, gender, weight, age);
		this.sound = sound;
	}

	@Override
	public String toString() {
		return "Cow " + sound + super.toString();
	}
	
	public String feedLoadingSchedule() {
		return super.feedLoadingSchedule() + "6am-4pm\n";
	}
}
