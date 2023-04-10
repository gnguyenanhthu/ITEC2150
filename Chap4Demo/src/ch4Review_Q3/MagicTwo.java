package ch4Review_Q3;

/*
 * The two values' sum
 * between 8 and 10 and their product should be between 10 and 20 
 */
public class MagicTwo {
	private int num1;
	private int num2;

	public MagicTwo(int num1, int num2) throws IllegalMagicTwoValuesException{
		this.num1 = num1;
		this.num2 = num2;
		checkMagicTwo(this.num1, this.num2);
	}
	
	public void checkMagicTwo(int num1, int num2) throws IllegalMagicTwoValuesException{
		if (((num1 + num2) < 8 || (num1 + num2) > 10) || ((num1 * num2) < 10 || (num1 * num2) > 20))
			throw new IllegalMagicTwoValuesException(this.num1, this.num2);
	}

	@Override
	public String toString() {
		return "MagicTwo [num1=" + num1 + ", num2=" + num2 + "]";
	}
}
