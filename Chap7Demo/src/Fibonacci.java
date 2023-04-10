import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer:");
		long number = input.nextInt();
		System.out.printf("Using loop: The %dth number of the Fiboncci sequence is %d.\n",
				number, getFibLoop(number));
		System.out.printf("Using recursion: The %dth number of the Fiboncci sequence is %d.\n",
				number, getFibRecursion(number));
	}
	
	public static long getFibLoop(long num)
	{
		if (num < 0) {
			return -1;
		}
		else if (num == 0 || num == 1) {
			return num;
		}

		long prev1 = 0;
		long prev2 = 1;
		long curr = 0;
		for (int i=2; i <= num; i++) {
			curr = prev1 + prev2;
			prev1 = prev2;
			prev2 = curr;
		}
		return curr;		
	}

	public static long getFibRecursion(long num)
	{
		if(num == 0 || num == 1)
		{
			return num;
		}
		else
		{
			return getFibRecursion(num - 1) + getFibRecursion(num - 2);
		}
	}
}