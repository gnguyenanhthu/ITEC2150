package ch6demo4a_company_starter;

public class MicrosoftEmployee extends Employee
{
    public MicrosoftEmployee(String name){//name is an employee name
        super(name);
    }
    
    public String toString()
    {
    	return "Microsoft employee " + this.getName();
    }
}
