package FinalReview3_Q2_Recursion;
import java.util.Scanner;

/*
 * @author Wei Jin
 * Class: ArrayRightshift
 * 
 * Using recursion to right shift an array
 */

public class ArrayRightshift {
	public static void main(String[] args) {
		Integer[] intArr = {10, 20, 30, 40, 50, 60, 70, 80};
		System.out.println("Orig Integer Array:");
		printArr(intArr);
		rightShift(intArr);
		System.out.println("After right shift:");
		printArr(intArr);
		
		System.out.println();
		
		String[] strArr = {"abc", "defg", "hijk", "lmnop", "qrs", "tuv", "wxyz"};
		System.out.println("Orig String Array:");
		printArr(strArr);
		rightShift(strArr);
		System.out.println("After right shift:");
		printArr(strArr);
		
	}
	
	public static <E> void printArr(E[] arr)
	{
		//TODO 1: print the elements of the array separated by a space. Print a new line afterwards.
		for (E e: arr) {
			System.out.print(e + " ");
		}
		System.out.println();
	}

	public static <E> void rightShift(E[] arr)
	{
		rightShiftHelper(arr, arr.length-1, arr[arr.length-1]);
	}
	
	public static <E> void rightShiftHelper(E[] arr, int end, E tmp)
	{
		//TODO 2: Implement this recursive method
		if (end == 0)
			arr[0] = tmp;
		else {
			arr[end] = arr[end-1];
			rightShiftHelper(arr, end-1,tmp);
		}
	}
}