package Chap4BEx3;

public class IllegalTriangleSideException extends Exception{
	public IllegalTriangleSideException(double side1, double side2, double side3) {
		super("Sides " + side1 + "," + side2 + ", and " + side3 + " cannot make a legal triangle.");
	}

}
