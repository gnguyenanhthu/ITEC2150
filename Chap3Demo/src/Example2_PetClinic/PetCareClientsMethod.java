package Example2_PetClinic;

import java.util.Date;

/**
 * 
 * @author Dr. Wei Jin (wjin@ggc.edu)
 * 
 * Class: PetCareClientsMethod
 *
 */
public class PetCareClientsMethod
{
    public static void main(String[] args)
    {
    	Pet[] pets = new Pet[5];
    	
    	pets[0] = new Cat("Fluffy", "Jane", 2, "orange", true, false);
    	pets[1] = new Dog("Coco", "Linda", 3, "brown", "Poodle");
    	pets[2] = new Dog("Mongo", "William", 1, "white", "Bichon");
    	pets[3] = new Dog("Patch", "Marta", 12, "spotty", "Dalmatian");
    	pets[4] = new Cat("Petey", "Nicholas", 5, "brown", false, false);
    	
    	Date date = new Date(); //The date (time as well) when this line is executed.
    	long time = date.getTime(); //Total milliseconds from midnight 1/1/1970
    	time += 24*60*60*1000;  //24 hours from now
    	for (Pet p: pets) 
    	{
    		appointmentReminder(p, time);
    		time += 30*60*1000;  // add 30 mins to the time (30*60*1000 milliseconds)
    	}
    }
    
    public static void appointmentReminder(Pet pet, long time) 
    {
    	Date date = new Date(time);
    	System.out.println("Dear " + pet.getOwnerName() + ",");
    	System.out.println("  A kind reminder that " + pet.getName() + "'s appointment is at " + date);
    	System.out.println("See you soon!");
    }
}
