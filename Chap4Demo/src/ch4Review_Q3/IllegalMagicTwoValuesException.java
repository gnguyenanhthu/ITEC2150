package ch4Review_Q3;
public class IllegalMagicTwoValuesException extends Exception{
	public IllegalMagicTwoValuesException(int num1, int num2)
	{
		super(num1 + " and " + num2 + " cannot make a MagicTwo object.");
	}
}
