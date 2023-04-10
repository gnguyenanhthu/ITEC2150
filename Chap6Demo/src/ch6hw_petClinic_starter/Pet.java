package ch6hw_petClinic_starter;

/**
 * 
 * @author Dr. Wei Jin (wjin@ggc.edu)
 * 
 * Class: Pet
 *
 */
public class Pet implements Comparable<Pet>
{
    private String name;
    private String ownerName;
    private int age;
    private String hairColor;
    
    public Pet(String name, String ownerName, int age, String hairColor)
    {
        this.name = name;
        this.ownerName = ownerName;
        this.age = age;
        this.hairColor = hairColor;
    }
    
    public String getName() 
    {
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getOwnerName() 
	{
		return ownerName;
	}

	public void setOwnerName(String ownerName) 
	{
		this.ownerName = ownerName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) 
	{
		this.age = age;
	}

	public String getHairColor() 
	{
		return hairColor;
	}

	public void setHairColor(String hairColor) 
	{
		this.hairColor = hairColor;
	}

	@Override
    public String toString()
    {
        return "Pet[name=" + name + ", ownerName=" + ownerName + 
        		", age=" + age + ", hairColor=" + hairColor + "]";
    }
	
    @Override
    public int compareTo(Pet o) {
        if (this.name.compareTo(o.name) < 0)
        	return -1;
        else if(this.name.compareTo(o.name) > 0)
        	return 1;
        else
        	return 0;
    }
}
