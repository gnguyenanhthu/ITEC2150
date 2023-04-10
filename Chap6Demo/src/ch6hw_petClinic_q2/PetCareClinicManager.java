package ch6hw_petClinic_q2;

/**
 * 
 * @author Dr. Wei Jin (wjin@ggc.edu)
 * 
 * Class: PetCareClinicManager
 *
 */
import java.util.Scanner;

public class PetCareClinicManager
{
    public static void main(String[] args)
    {
    	Scanner input = new Scanner(System.in);
    	
    	Cat[] cats = new Cat[2];
    	cats[0] = new Cat("Fluffy", "Jane", 2, "orange", true, false);
    	cats[1] = new Cat("Petey", "Nicholas", 5, "brown", false, false);
    	
    	Dog[] dogs = new Dog[3];
    	dogs[0] = new Dog("Coco", "Linda", 3, "brown", "Poodle");
    	dogs[1] = new Dog("Mongo", "William", 1, "white", "Bichon");
    	
    	System.out.println("Enter the new dog's name, owner name, age, color, and breed: ");
    	dogs[2] = new Dog(input.next(), input.next(), input.nextInt(), 
    			input.next(), input.next());
    	//dogs[2] = new Dog("Patch", "Marta", 12, "spotty", "Dalmatian");
    	
    	PlayGroup catGroup = new PlayGroup("Cat Group");
    	PlayGroup dogGroup = new PlayGroup("Dog Group");
    	
    	catGroup.addMember(cats[0]);
    	catGroup.addMember(cats[1]);
    	catGroup.addMember(dogs[0]);
    	catGroup.addMember(dogs[1]);
    	catGroup.sortMembersByName();
    	System.out.println("Members of play group Cat Group:");
    	catGroup.printMembers();

    	dogGroup.addMember(dogs[0]);
    	dogGroup.addMember(dogs[1]);
    	dogGroup.addMember(dogs[2]);
    	dogGroup.addMember(cats[0]);
    	dogGroup.sortMembersByName();
    	System.out.println("Members of play group Dog Group:");
    	dogGroup.printMembers();
    }
}
