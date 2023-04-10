package ch4demo2_CustomExceptions1;
/**
 * @author wjin@ggc.edu
 *
 */
public class Fraction
{
	private double numerator;
	private double denominator;

	public Fraction(int numerator, int denominator) throws IllegalFractionException 
	{
		if (denominator == 0) {
			throw new IllegalFractionException(numerator,denominator);
		}
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public double getNumerator() {
		return numerator;
	}

	public void setNumerator(double numerator) {
		this.numerator = numerator;
	}

	public double getDenominator() {
		return denominator;
	}

	public void setDenominator(double denominator) {
		this.denominator = denominator;
	}
	
	public double getRealValue() {
		return 1.0 * numerator / denominator;
	}
	
	public String toString() {
		return numerator + "/" + denominator + " = " + getRealValue();
	}
}
