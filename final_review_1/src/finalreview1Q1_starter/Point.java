package finalreview1Q1_starter;

/**Class: Point
 * @author Wei Jin
 * @version 1.0
 * Course : ITEC 2150 Fall 2020
 * Written: October 31, 2020
 *
 * This class models a point on an X-Y coordinate system.
 */
public class Point {
	private double x;
	private double y;
	
	public Point(double x, double y) 
	{
		this.x  = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
	
	private double distanceToOrigin() {
		return Math.sqrt(x*x + y*y); 
	}
	
	public String toString() {
		return String.format("Point[("+ x + "," + y + "), distance=%.2f]", distanceToOrigin());
	}
}

