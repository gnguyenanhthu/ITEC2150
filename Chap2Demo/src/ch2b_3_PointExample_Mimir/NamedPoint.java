package ch2b_3_PointExample_Mimir;

/**
 * Class: NamedPoint
 * this class to hold named location's information for data point (coordinates of x and y).
 */
public class NamedPoint extends Point {
    final private String name;

    public NamedPoint(double x, double y, String name) {
        super(x, y);
        //super keyword is to invoke superclass' constructor. 
        // This statement super(x,y) invokes the Point class constructor
        //that matches the arguments and it must be the first statement 
        //of the subclass' constructor as you see here.
        //this is the way to explicitly invoke a superclass constructor.
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //override the toString method
	@Override
	public String toString() {
		return name + super.toString();
	}

    
}