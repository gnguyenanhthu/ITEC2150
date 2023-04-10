package finalreview1Q4_starter;

import java.util.Arrays;

/**Class: ArraysSortQ1
 * @author Wei Jin
 * @version 1.0
 * Course : ITEC 2150 Fall 2020
 * Written: October 31, 2020
 *
 * This class sorts several arrays using Arrays.sort.
 * 
 * Purpose: Practice on how to use Java library sort method to sort arrays.
 */
public class ArraysSort
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

		
		
		System.out.println("Array integerArray contains:");
		print(integerArray); // pass an Integer array
		//TODO: sort integerArray using a Java library method
		System.out.println();
		
		System.out.println("After sorting: ");
		Arrays.sort(integerArray);
		print(integerArray);
		System.out.println();

		System.out.println("Array doubleArray contains:");
		print(doubleArray); // pass a Double array
		//TODO: sort doubleArray using a Java library method
			
		System.out.println("After sorting: ");
		Arrays.sort(doubleArray);
		print(doubleArray);
		System.out.println();

		System.out.println("Array characterrArray contains:");
		print(characterArray); // pass a Character array
		//TODO: sort characterArray using a Java library method
					
		System.out.println("After sorting: ");
		Arrays.sort(characterArray);
		print(characterArray);
		System.out.println();
		
		System.out.println("Array stringArray contains:");
		print(stringArray); 
		//TODO: sort stringArray using a Java library method
		
		System.out.println("After sorting: ");
		Arrays.sort(stringArray);
		print(stringArray);
		System.out.println();
		
		System.out.println("Array employees contains:");
		print(employees); 
		//TODO: sort employees using a Java library method
		
		System.out.println("After sorting: ");
		Arrays.sort(employees);
		print(employees);
		System.out.println();
		
		System.out.println("Array points contains:");
		print(points); 
		//TODO: sort points using a Java library method
		
		System.out.println("After sorting: ");
		Arrays.sort(points);
		print(points);
		System.out.println();
	}

	
	/** Method: print
	 * Given an array of objects, print each object using its toString method.
	 * @param arr the array of objects
	 **/
	
	public static <E> void print(E[] arr)
	{
		//TODO: Given the method header and description, implement the method body.
		for (E e:arr)
			System.out.print(e + " ");
	}

}