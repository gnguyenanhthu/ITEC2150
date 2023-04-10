package finalreview1Q1_starter;

import java.util.ArrayList;

/**Class: ArrayListReversalQ3
 * @author Wei Jin
 * @version 1.0
 * Course : ITEC 2150 Fall 2020
 * Written: October 31, 2020
 *
 * This class reverse several array lists.
 * 
 * Purpose: Practice looping and array list methods.
 */
public class ArrayListReversal
{
	public static void main(String[] args)
	{
		// create arrays of Integer, Double, Character, and String
		Integer[] integerArray = {3, 4, 2, 1};
		Double[] doubleArray = {2.1, 31.65, 10.5, 22.2};
		Character[] characterArray = {'G', 'E', 'N', 'E', 'R','I','C','S'};
		String[] stringArray =  {"Lawrenceville", "Duluth", "Chicago", "New York", "Atlanta"} ;
		Employee[] employees = {
				new Employee(5, 35, "Bill"),  new Employee(5, 30, "Kate"), new Employee(5, 30, "Dave"), 
				new Employee(3, 29, "Lisa"), new Employee(3, 38, "Taylor"), new Employee(3, 29, "Allen"), 
				new Employee(1, 50, "Wendy"), new Employee(1, 39, "Linda"), new Employee(1, 50, "Anna"), 
		};
		Point[] points = {
				new Point(2, 2.5),  new Point(2.5, 2), new Point (1.2, 1), new Point (1.5, 1), 
				new Point(0, 1),  new Point(1, 0), new Point (1, 1.2), new Point (1, 1.5), 
		};
		ArrayList<Integer> integerList = makeListFromArray(integerArray);
		ArrayList<Double> doubleList = makeListFromArray(doubleArray);
		ArrayList<Character> characterList = makeListFromArray(characterArray);
		ArrayList<String> stringList = makeListFromArray(stringArray);
		ArrayList<Employee> employeeList = makeListFromArray(employees);
		ArrayList<Point> pointList = makeListFromArray(points);

		System.out.println("Array integerArray contains:");
		print(integerList); // pass an Integer array
		//TODO: invoke reverseArrayListInPlace and reverse integerList

		System.out.println("After reversing: ");
		reverseArrayListInPlace(integerList);
		print(integerList);
		System.out.println();

		System.out.println("Array doubleArray contains:");
		print(doubleList); // pass a Double array
		//TODO: invoke reverseArrayListInPlace and reverse doubleList

		System.out.println("After reversing: ");
		reverseArrayListInPlace(doubleList);
		print(doubleList);
		System.out.println();

		System.out.println("Array characterrArray contains:");
		print(characterList); // pass a Character array
		//TODO: invoke reverseArrayListInPlace and reverse characterList

		System.out.println("After reversing: ");
		reverseArrayListInPlace(characterList);
		print(characterList);
		System.out.println();

		System.out.println("Array stringArray contains:");
		print(stringList); 	
		//TODO: invoke reverseArrayListInPlace and reverse stringList

		System.out.println("After reversing: ");
		reverseArrayListInPlace(stringList);
		print(stringList);
		System.out.println();

		System.out.println("Array employees contains:");
		print(employeeList); 
		//TODO: invoke reverseArrayListInPlace and reverse employeeList

		System.out.println("After reversing: ");
		reverseArrayListInPlace(employeeList);
		print(employeeList);
		System.out.println();

		System.out.println("Array points contains:");
		print(pointList); 
		//TODO: invoke reverseArrayListInPlace and reverse pointList

		System.out.println("After reversing: ");
		reverseArrayListInPlace(pointList);
		print(pointList);
		System.out.println();
	}

	/** Method: print
	 * Given an array list of objects, print each object using its toString method.
	 * @param list the array list of objects
	 **/
	public static <E> void print(ArrayList<E> list)
	{
		//TODO: Given the method header and description, implement the method body.
		for (E e:list) {
			System.out.print(e + " ");
		}
		System.out.println();
	}

	/** Method: makeListFromArray
	 * Given an array of objects, return an array list of same objects in the same order
	 * @param array the array of objects
	 * @return the array list of the same object in the same order as in the array
	 **/
	public static <E> ArrayList<E> makeListFromArray(E[] array)
	{
		//TODO: Given the method header and description, implement the method body.
		ArrayList<E> list = new ArrayList<>(array.length);
		for (E e:array) {
			list.add(e);
		}
		return list;
	}

	/** Method: reverseArrayListInPlace
	 * 
	 * Reverse the order of the elements of a given array list in place, that is, 
	 * in the original list itself without using any auxiliary data structure. 
	 * 
	 * Hint: Since the input list is an array list, it is efficient to access its 
	 * elements by index. For this method, you are allowed to iterate over 
	 * the input list by index, and use the get and set methods of the list 
	 * to read and modify the element at any index.
	 * 
	 * @param list the array list of objects
	 **/	
	public static <E> void reverseArrayListInPlace(ArrayList<E> list)
	{	
		//TODO: Given the method header and description, implement the method body.
		for (int i=0, j=list.size()-1; i<j;i++, j--) {
			E v1 = list.get(i);
			E v2 = list.get(j);
			list.set(i, v2);
			list.set(j, v1);
		}

	}

}