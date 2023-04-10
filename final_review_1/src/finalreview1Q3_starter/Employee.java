package finalreview1Q3_starter;

//TODO: Make necessary changes so that employees can be sorted 
//first by deptId, then by name.
public class Employee implements Comparable<Employee>
{
	private int deptId;
	private String name;

	public Employee(int deptId, String name)
	{
		this.deptId = deptId;
		this.name = name;
	}
	
	public int getDeptId() 
	{
		return deptId;
	}

	public String getName()
	{
		return name;
	}

	public String toString()
	{
		return "Employee[dept:"+ deptId + " name:"+ name + "]";
	}

	//e1.compareTo(e2) < 0 means e1 < e2
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		if (this.deptId != o.deptId)
			return this.deptId - o.deptId;
		else
			return this.name.compareTo(o.name);
	}
}