import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter # of integers to put in an array: ");
      int numInts = input.nextInt();
      int[] nums = new int[numInts];
      System.out.print("Enter " + numInts + " intergers: ");
      for (int i=0; i<numInts; i++) 
      {
        nums[i] = input.nextInt();
      }
      
      reverseArray(nums, 0, nums.length-1);
      
      System.out.println("After reversing, the array: ");
      for (int i=0; i<numInts; i++) 
      {
        System.out.print(nums[i] + " ");
      }
      System.out.println();
    }
       
    public static void reverseArray(int[] list, int start, int end)
    {
        //TODO: Complete this method using recursion. Loop based implmentation will
        //not receive any credits.
        if (end <= start) {
        	return;
        }
        else {
        	int tmp = list[start];
        	list[start] = list[end];
        	list[end] = tmp;
        	reverseArray(list, start+1, end-1);
        }
        	
    }
}