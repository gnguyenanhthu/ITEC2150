package Example7_InterfaceInheritance;

/**
 * 
 * @author Dr. Wei Jin (wjin@ggc.edu)
 * 
 * Class: Rectangle
 *
 */
public class Rectangle extends Shape
{
    private int x, y;
    private int width, height;
    
	public Rectangle(String color, boolean filled, int x, int y, int width, int height) 
	{
		super(color, filled);
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
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

	public int getWidth() 
	{
		return width;
	}

	public void setWidth(int width) 
	{
		this.width = width;
	}

	public int getHeight() 
	{
		return height;
	}

	public void setHeight(int height) 
	{
		this.height = height;
	}

	@Override
	public String toString() 
	{
		return "Rectangle [@ (" + x + ", " + y + "), w: " + width + ", h: " + height + "] " + super.toString();
	}

	@Override
	public double area() 
	{
		return width*height;
	}

	@Override
	public void flipRight() 
	{
		x = x + width;
	}
	
	@Override
	public void flipLeft() 
	{
		x = x - width;
	}
	
	@Override
	public void flipUp() 
	{
		y = y - height;
	}
	
	@Override
	public void flipDown() 
	{
		y = y + height;
	}
}
