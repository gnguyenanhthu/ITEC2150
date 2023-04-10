package finalreview1Q4_starter;

/**Class: Point
 * @author Wei Jin
 * @version 1.0
 * Course : ITEC 2150 Fall 2020
 * Written: October 31, 2020
 *
 * This class models a point on an X-Y coordinate system.
 * 
 * Purpose: Point objects when sorted should be first by its distance to (0, 0),
 * 			then by x, and last by y.
 */
public class Point implements Comparable<Point>{
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

	/** Method: compareTo
	 * Compare this Point object with another Point object. If this point is considered "less than"
	 * the other point, the method should return a negative value. If this point is 
	 * considered "greater than" the other point, the method should return a positive
	 * value. If this point is the same as the other point, the method should return 0.
	 * 
	 * The comparison is first based on their distances to (0, 0). Smaller distance 
	 * means "less than". If the distances are the same, the comparison will be based on x values. 
	 * Smaller x value means "less than". If the x values are also the same, the comparison 
	 * will be based on the y values.
	 * 
	 * @param o another Point object
	 **/
	//TODO: Implement the compareTo method according to the description above.
	@Override
	public int compareTo(Point o) {
		// TODO Auto-generated method stub
		double distance1 = this.distanceToOrigin();
		double distance2 = o.distanceToOrigin();
		if (distance1 > distance2) //0.8 0.2 => 0
			return 1;
		else if (distance1 < distance2) //0.8 0.2 => 0
			return -1;
		else if (this.x > o.x)
			return 1;
		else if (this.x < o.x)
			return -1;
		else if (this.y > o.y)
			return 1;
		else if (this.y < o.y)
			return -1;
		else return 0;
	}
	
	public String toString() {
		return String.format("Point[("+ x + "," + y + "), distance=%.2f]", distanceToOrigin());
	}
}
