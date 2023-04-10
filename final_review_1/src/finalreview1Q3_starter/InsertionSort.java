package finalreview1Q3_starter;

import java.util.ArrayList;

/**
 * Class: InsertionSort2
 */
public class InsertionSort
{
	public static void main(String[] args)
	{
		// create arrays of Integer, Double, Character, and String
		Integer[] integerArray = {3, 4, 2, 1};
		Double[] doubleArray = {2.1, 31.65, 10.5, 22.2};
		Character[] characterArray = {'G', 'E', 'N', 'E', 'R','I','C','S'};
		String[] stringArray =  {"Lawrenceville", "Duluth", "Chicago", "New York", "Atlanta"} ;
		Employee[] employees = {
				new Employee(5, "Bill"),  new Employee(5, "Kate"),  
				new Employee(3, "Allen"), new Employee(3, "Taylor"), 
				new Employee(1, "Anna"), new Employee(1, "Linda"), 
		};
		ArrayList<Integer> integerList = makeListFromArray(integerArray);
		ArrayList<Double> doubleList = makeListFromArray(doubleArray);
		ArrayList<Character> characterList = makeListFromArray(characterArray);
		ArrayList<String> stringList = makeListFromArray(stringArray);
		ArrayList<Employee> employeeList = makeListFromArray(employees);
		
		System.out.println("integerList contains:");
		print(integerList); // pass an Integer list
		insertionSort(integerList);	
		System.out.println("After soring: ");
		print(integerList);
		System.out.println();

		System.out.println("doubleList contains:");
		print(doubleList); // pass a Double list
		insertionSort(doubleList);	
		System.out.println("After soring: ");
		print(doubleList);
		System.out.println();

		System.out.println("characterrList contains:");
		print(characterList); // pass a Character list
		insertionSort(characterList);	
		System.out.println("After soring: ");
		print(characterList);
		System.out.println();

		System.out.println("stringList contains:");
		print(stringList); 
		insertionSort(stringList);	
		System.out.println("After soring: ");
		print(stringList);
		System.out.println();
		
		System.out.println("employeeList contains:");
		print(employeeList);
		insertionSort(employeeList);	
		System.out.println("After soring: ");
		print(employeeList);
		System.out.println();
	
	}

	public static <E> void print(ArrayList<E> list)
	{
		//TODO: Write a loop that prints each element of the list.
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
		//TODO: Given the method header and description, 
		//      implement the method body.
		ArrayList<E> list = new ArrayList<>(array.length);
		for (E e:array) {
			list.add(e);
		}
		return list;
	}

	/*
	 * Insertion sort. For each element of the array, find a place prior 
	 * to its index to insert so that the part of the array up to that index
	 * is sorted.
	 */
	public static <E extends Comparable<E>> void insertionSort(ArrayList<E> A) {
		//TODO: implement the method according to the algorithm description.s
		for (int i=1; i < A.size(); i++) {
			E curValue = A.get(i);
			int j = i-1;
			while (j>=0 && A.get(j).compareTo(curValue) > 0) {
				A.set(j+1, A.get(j));
			    j--;
			}
			A.set(j+1, curValue);
		}
	}
}
