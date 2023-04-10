package ch6demo5a_sorting_starter;

/**
 * Class: GenericMethodDemo3
 */
public class SortingDifferentTypesOfArray
{
	public static void main(String[] args)
	{
		// create arrays of Integer, Double, Character, and String
		Integer[] integerArray = {3, 4, 2, 1};
		Double[] doubleArray = {2.1, 31.65, 10.5, 22.2};
		Character[] characterArray = {'G', 'E', 'N', 'E', 'R','I','C','S'};
		String[] stringArray =  {"Lawrenceville", "Duluth", "Chicago", "New York", "Atlanta"} ;
		
		System.out.println("Array integerArray contains:");
		print(integerArray); // pass an Integer array
		System.out.println("After soring: ");
		selectionSort(integerArray);	
		print(integerArray);
		System.out.println();

		System.out.println("Array doubleArray contains:");
		print(doubleArray); // pass a Double array
		System.out.println("After soring: ");
		selectionSort(doubleArray);	
		print(doubleArray);
		System.out.println();

		System.out.println("Array characterrArray contains:");
		print(characterArray); // pass a Character array
		System.out.println("After soring: ");
		selectionSort(characterArray);	
		print(characterArray);
		System.out.println();

		System.out.println("Array stringArray contains:");
		print(stringArray); // pass a Character array
		System.out.println("After soring: ");
		selectionSort(stringArray);	
		print(stringArray);
		System.out.println();
	}

	public static <E> void print(E[] arr)
	{
		//  System.out.println(Arrays.toString(list));
		for(E element: arr)
		{
			System.out.print(element + " ");
		}
		System.out.println();
	}

	public static <E> void swap(E[] arr, int i, int j)
	{
		E tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

	
	public static <E extends Comparable<E>> int findIndexOfMin(E[] arr, int startIndex) 
	{
		int indexOfSmallest = startIndex;
		for (int i = startIndex+1; i < arr.length; i++) 
		{
			if (arr[i].compareTo(arr[indexOfSmallest]) < 0)
			{
				indexOfSmallest = i;
			}
		}
		return indexOfSmallest;
	}
	
	public static <E extends Comparable<E>> void selectionSort(E[] arr)
	{
		for (int i=0; i<arr.length; i++) 
		{
			int minIndex = findIndexOfMin(arr, i);
			swap(arr, i, minIndex);
		}
	}
}