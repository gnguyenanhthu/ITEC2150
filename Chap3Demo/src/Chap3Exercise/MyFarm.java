package Chap3Exercise;

public class MyFarm {
	public static void main(String[] args) {
		FarmAnimal[] myFarm = new FarmAnimal[6];
		FarmAnimal animal1 = new Duck("Donald", "male", 3.2, 5, "Quack Quack");
		FarmAnimal animal2 = new Duck("Cheese", "female", 3.6, 5, "Quack Quack");
		FarmAnimal animal3 = new Cow("Molly", "female", 1600.0, 3, "Moo Moo");
		FarmAnimal animal4 = new Chicken("Albert", "male", 1.6, 2, "Cock-a-Doodle-doo");
		FarmAnimal animal5 = new Chicken("Amelia", "female", 1.8, 4, "Cluck Cluck");
		FarmAnimal animal6 = new Chicken("Dixie", "female", 1.7, 4, "Cluck Cluck");
		
		myFarm[0] = animal1;
		myFarm[1] = animal2;
		myFarm[2] = animal3;
		myFarm[3] = animal4;
		myFarm[4] = animal5;
		myFarm[5] = animal6;
		
		for (int i = 0; i < myFarm.length; i++) {
			System.out.print(myFarm[i]);
		}
		
		for (int i = 0; i < myFarm.length; i++) {
			System.out.print(myFarm[i].feedLoadingSchedule());
		}
	}
}
