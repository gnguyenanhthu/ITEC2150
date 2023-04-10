import java.util.Scanner;

public class StringReversal {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    System.out.print("Enter a string: ");
	    String aString = input.nextLine();
	    String reverseString = reverseByLoop(aString);
	    System.out.println("By Loop: The reverse of " + aString + ": " + reverseString);
	    reverseString = reverse(aString);
	    System.out.println("By Recursion: The reverse of " + aString + ": " + reverseString);
	}

	public static String reverseByLoop(String str)
	{
		String res = "";
		for (int i = str.length()-1;  i >= 0; i--) {
			res += str.charAt(i);
		}
		return res;
	}
	
	//TODO: change the default implementation to a recusion-based solution
	public static String reverse(String str)
	{
		if (str.length() == 0 || str.length() == 1)
			return str;
		else {
			String head = str.substring(0,1);
			String tail = str.substring(1);
			String tailReverse = reverse(tail);
			return tailReverse + head;
		}
	}
}