package ch6hw_petClinic_q2;

import java.util.ArrayList;
import java.util.Collections;


/**
 * 
 * @author <Your Name>
 * 
 * Class: PlayGroup
 *
 */
public class PlayGroup {
	private String name;
    private ArrayList<Pet> members = new ArrayList<>();
    
    public PlayGroup(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public boolean addMember(Pet pet)
    {
        if(members.contains(pet))
        {
            System.out.println(pet.getName() +  " is already in the pet list " + this.name);
            return false;
        }
        else if (!members.isEmpty() && !members.get(0).getClass().equals(pet.getClass())) {
        	System.out.println(pet.getName() +  " is not the same type of pet in " + this.name);
            return false;
        	
        }
        else {
        	members.add(pet);
            return true;
        }
    }
    
	public void printMembers()
	{
		for(Pet p: members)
		{
			System.out.print(p + "\n");
		}
		System.out.println();
	}
	
	public void sortMembersByName()
	{
	    Collections.sort(members);
	}
}
