package Example7_InterfaceInheritance;

/**
 * 
 * @author Dr. Wei Jin (wjin@ggc.edu)
 * 
 * Class: Circle
 *
 */
public class Circle extends Shape
{
    private int x, y;
    private int radius;

	public Circle(String color, boolean filled, int x, int y, int radius) 
	{
		super(color, filled);
		this.x = x; 		this.y = y;		this.radius = radius;
	}

	public int getX() 
	{
		return x;
	}


	public void setX(int x) 
	{
		this.x = x;
	}

	public int getY() 
	{
		return y;
	}

	public void setY(int y) 
	{
		this.y = y;
	}

	public double getRadius() 
	{
		return radius;
	}

	public void setRadius(int radius) 
	{
		this.radius = radius;
	}

	@Override
	public String toString() 
	{
		return "Circle [@(" + x + ", " + y + "), r: " + radius + "] " + super.toString();
	}

	@Override
	public double area() 
	{
		return Math.PI * radius * radius;
	}

	@Override
	public void flipRight() 
	{
		x = x + 2 * radius;
	}
	
	@Override
	public void flipLeft() 
	{
		x = x - 2 * radius;
	}
	
	@Override
	public void flipUp() 
	{
		y = y - 2 * radius;
	}
	
	@Override
	public void flipDown() 
	{
		y = y + 2 * radius;
	}
}