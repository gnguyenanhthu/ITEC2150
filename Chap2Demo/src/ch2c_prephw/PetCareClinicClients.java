package ch2c_prephw;

public class PetCareClinicClients {
	public static void main(String[] args) {
		Cat[] catArray = new Cat[2];
		Cat cat1 = new Cat("Fluffy", "Jane", 2, "orange", true, false);
		Cat cat2 = new Cat("Petey", "Nicholas", 5, "brown", false, false);
		catArray[0] = cat1; catArray[1] = cat2;
		
		for (int i = 0; i < catArray.length; i++)
			System.out.println(catArray[i]);
		
		Dog[] dogArray = new Dog[3];
		Dog dog1 = new Dog("Coco", "Linda", 3, "brown", "Poodle");
		Dog dog2 = new Dog("Mongo", "William", 1, "white", "Bichon");
		Dog dog3 = new Dog("Patch", "Marta", 12, "spotty", "Dalmatian");
		dogArray[0] = dog1; dogArray[1] = dog2; dogArray[2] = dog3;
		for (int i = 0; i < dogArray.length; i++)
			System.out.println(dogArray[i]);
	}
}
