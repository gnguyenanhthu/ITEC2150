package Chapter1Demo;

public class SquareTester{
	public static void main(String[] args){
		Square square1 = new Square(1);
		Square square2 = new Square(2);
		square1 = square2;
		printSquare(square1);
		square2 = getFactorSquare(square1, 2.5);
		printSquare(square2);
	}
	
	public static void printSquare(Square s) {
		System.out.println(s);
	}
	
	public static Square getFactorSquare(Square s, double factor) {
		double length = s.getLength();
		Square newSquare = new Square(factor*length);
		return newSquare;
	}
}