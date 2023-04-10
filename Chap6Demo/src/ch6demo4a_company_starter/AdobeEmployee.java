package ch6demo4a_company_starter;

public class AdobeEmployee extends Employee
{
    public AdobeEmployee(String name)
    {
        super(name);
    }
    
    public String toString()
    {
    	return "Adobe employee " + this.getName();
    }
}
