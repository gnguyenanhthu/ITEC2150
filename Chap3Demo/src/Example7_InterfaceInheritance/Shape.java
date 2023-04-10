package Example7_InterfaceInheritance;

/**
 * 
 * @author Dr. Wei Jin (wjin@ggc.edu)
 * 
 * Class: Shape
 *
 */
public abstract class Shape implements Comparable<Shape>, FullAnimation
{
    private String color;
    private boolean filled;
	
    public Shape(String color, boolean filled) 
    {
		super();
		this.color = color;
		this.filled = filled;
	}

	public String getColor() 
	{
		return color;
	}

	public void setColor(String color) 
	{
		this.color = color;
	}

	public boolean isFilled() 
	{
		return filled;
	}

	public void setFilled(boolean filled) 
	{
		this.filled = filled;
	}
    
	public abstract double area();

	@Override
	public String toString() 
	{
		return "[color=" + color + ", filled=" + filled + "]";
	}
	
	@Override
	public int compareTo(Shape o) 
	{
		if (this.area() > o.area())
			return 1;
		else if (this.area() < o.area())
			return -1;
		else
			return 0;
	}
	
	@Override
	public void talk() 
	{
		System.out.println("I am " + this.toString());
	}
}

