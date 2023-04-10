package Chap3Exercise;

public class Duck extends FarmAnimal {
	String sound;

	public Duck(String name, String gender, double weight, int age, String sound) {
		super(name, gender, weight, age);
		this.sound = sound;
	}
	
	@Override
	public String toString() {
		return "Duck " + sound + super.toString();
	}
	
	public String feedLoadingSchedule() {
		return super.feedLoadingSchedule() + "8am-12pm-6pm\n";
	}
}
