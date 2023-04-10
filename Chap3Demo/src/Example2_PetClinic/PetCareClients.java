package Example2_PetClinic;

/**
 * 
 * @author Dr. Wei Jin (wjin@ggc.edu)
 * 
 * Class: PetCareClients
 *
 */
public class PetCareClients
{
    public static void main(String[] args)
    {
    	Pet[] pets = new Pet[5];
    	
    	pets[0] = new Cat("Fluffy", "Jane", 2, "orange", true, false);
    	pets[1] = new Dog("Coco", "Linda", 3, "brown", "Poodle");
    	pets[2] = new Dog("Mongo", "William", 1, "white", "Bichon");
    	pets[3] = new Dog("Patch", "Marta", 12, "spotty", "Dalmatian");
    	pets[4] = new Cat("Petey", "Nicholas", 5, "brown", false, false);
    	
    	for (Pet p: pets) 
    	{
    		System.out.println(p);
    	}
    }
}
