package ch6demo4a_company_starter;

public class GoogleEmployee extends Employee
{
    public GoogleEmployee(String name) {//name is an employee name
        super(name);
    }
    
    public String toString()
    {
    	return "Google employee " + this.getName();
    }
}
