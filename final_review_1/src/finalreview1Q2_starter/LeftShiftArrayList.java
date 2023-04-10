package finalreview1Q2_starter;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**Class: LeftShiftArrayList
 * @author Wei Jin
 * @version 1.0
 * Course : ITEC 2150 Fall 2020
 * Written: October 31, 2020
 *
 * This class left shift several array lists.
 * 
 * Purpose: Practice looping and array list methods.
 */
public class LeftShiftArrayList
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a seed: ");
		int seed = input.nextInt();
		Random r = new Random(seed);
		
		System.out.print("Enter the size for arrays: ");
		int size = input.nextInt();
		
		ArrayList<Integer> integerList = generateRandomIntList(r, size);
		ArrayList<Double> doubleList = generateRandomDoubleList(r, size);
		ArrayList<Character> characterList = generateRandomLowercaseLetterList(r, size);
		

		System.out.println("Array integerArray contains:");
		print(integerList, 10); // pass an Integer array
		//TODO: invoke reverseArrayListInPlace and reverse integerList
		leftShiftArrayListInPlace(integerList);
		System.out.println("After left shift: ");
		print(integerList, 10);
		System.out.println();

		System.out.println("Array doubleArray contains:");
		print(doubleList, 10); // pass a Double array
		//TODO: invoke reverseArrayListInPlace and reverse doubleList
		leftShiftArrayListInPlace(doubleList);
		System.out.println("After left shift: ");
		print(doubleList, 10);
		System.out.println();

		System.out.println("Array characterrArray contains:");
		print(characterList, 10); // pass a Character array
		//TODO: invoke reverseArrayListInPlace and reverse characterList
		leftShiftArrayListInPlace(characterList);
		System.out.println("After left shift: ");
		print(characterList, 10);
		System.out.println();
	}


	/** Method: print
	 * Given an array list of objects and number of elements at the 
	 * front of the list to print, print each object using its toString method.
	 * 
	 * If the size of the array list is less than the parameter count, 
	 * print all the elements.
	 * 
	 * @param list the array list of objects
	 * @param count the maximum number of elements at the front of the list to print.
	 **/
	public static <E> void print(ArrayList<E> list, int count)
	{
		//TODO: Given the method header and description, implement the method body.
		for (int j=0; j < Math.min(count, list.size());j++) {
			System.out.print(list.get(j) + " ");
		}
		System.out.println();
	}

	/** Method: generateRandomIntList
	 * Generate a random integer array list
	 * @param r a random object
	 * @param size size of the list
	 * @return the array list of random integers
	 **/
	public static ArrayList<Integer> generateRandomIntList(Random r, int size)
	{
		ArrayList<Integer> list = new ArrayList<>(size);

		for (int i=0; i < size; i++) {
			list.add(r.nextInt());
		}
		return list;
	}
	

	/** Method: generateRandomLowercaseLetterList
	 * Generate a random lower-case letter array list
	 * @param r a random object
	 * @param size size of the list
	 * @return the array list of random lower case letters
	 **/
	public static ArrayList<Character> generateRandomLowercaseLetterList(Random r, int size)
	{
		ArrayList<Character> list = new ArrayList<>(size);

		for (int i=0; i < size; i++) {
			int randomInt = (int) (r.nextDouble() * 26) + 97;
			list.add((char)randomInt);
		}
		return list;
	}


	/** Method: generateRandomDoubleList
	 * Generate a random double array list
	 * @param r a random object
	 * @param size size of the list
	 * @return the array list of random double values
	 **/
	public static ArrayList<Double> generateRandomDoubleList(Random r, int size)
	{
		ArrayList<Double> list = new ArrayList<>(size);

		for (int i=0; i < size; i++) {
			list.add(r.nextDouble());
		}
		return list;
	}



	/** Method: leftShiftArrayListInPlace
	 * 
	 * Left shift an array list. Each element moves to its left. The list element moves
	 * to the end of the list.
	 * 
	 * Hint: Since the input list is an array list, it is efficient to access its 
	 * elements by index. For this method, you are allowed to iterate over 
	 * the input list by index, and use the get and set methods of the list 
	 * to read and modify the element at any index.
	 * 
	 * @param list the array list of objects
	 **/	
	public static <E> void leftShiftArrayListInPlace(ArrayList<E> list)
	{	
		//TODO: Given the method header and description, implement the method body.
		E tmp = list.get(0);
		
		for (int i=1; i<list.size(); i++) {
			//move element at i to i-1
			list.set(i-1, list.get(i));
		}
		list.set(list.size()-1, tmp);
//		list.remove(0);
//		list.add(tmp);

		
	}

}