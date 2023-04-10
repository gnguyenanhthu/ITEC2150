package Chap3Exercise;

public class Chicken extends FarmAnimal {
	String sound;

	public Chicken(String name, String gender, double weight, int age, String sound) {
		super(name, gender, weight, age);
		this.sound = sound;
	}
	
	@Override
	public String toString() {
		return "Chicken " + sound + super.toString();
	}
	
	public String feedLoadingSchedule() {
		return super.feedLoadingSchedule() + "8am-4pm\n";
	}
}
