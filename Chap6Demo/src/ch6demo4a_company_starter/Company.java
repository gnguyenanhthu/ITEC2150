package ch6demo4a_company_starter;

import java.util.ArrayList;

public class Company<T extends Employee>
{
    private String name;
    private ArrayList<T> eList = new ArrayList<>();
    
    public Company(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public boolean addEmployee(T employee)
    {
        if(eList.contains(employee))
        {
            System.out.println(employee.getName() +  " is already confirmed as an employee of " + this.name);
            return false;
        }
        else {
            eList.add(employee);
            return true;
        }
    }
    
    public String toString() {
    	String res = "";
    	for (T e: eList) {
    		res += e.toString() + "\n";
    	}
    	res += "\n";
    	return res;
    }
}
