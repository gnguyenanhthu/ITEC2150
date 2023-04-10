package ch4demo2_CustomExceptions1;

public class IllegalFractionException extends Exception{
	public IllegalFractionException(double numerator, double denominator)
	{
		super(numerator + "/" + denominator + " is not a valid fraction. Denominator cannot be zero.");
	}
}
