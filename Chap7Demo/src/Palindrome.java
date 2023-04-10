import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String aString = input.nextLine();
		System.out.println(aString + " is symmetric? " + isSymmetric(aString));
	}
	public static boolean isSymmetric(String str)
	{
		if (str.length() == 0 || str.length() == 1)
		{
			return true;  
		}
		else 
		{
			char head = str.charAt(0);
			char tail = str.charAt(str.length() - 1);
			//TODO 2: Complete the branch to determine whether str is synmmetric.
			if (head != tail) 
			{
				return false;
			}
			else
			{
				String middle = str.substring(1, str.length() - 1);
				return isSymmetric(middle);
			}
		}
	}
}
