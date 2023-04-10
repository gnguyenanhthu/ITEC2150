package Chapter1Demo;


public class SimpleIntArrayList {
	private int[] array;
	private int listSize;
	
	public SimpleIntArrayList() {
		array = new int[10];
		listSize = 0;
	}
	
	public SimpleIntArrayList(int capacity) {
		array = new int[capacity];
		listSize = 0;
	}
	
	public void add(int n) {
		if (listSize < array.length) {
  		  array[listSize] = n;
		  listSize++;
		}
	}
	public int get(int i) {
		if (i < listSize) {
			return array[i];
		}
		else {
			return Integer.MIN_VALUE;
		}
	}
	
	public int size() {
		return listSize;
	}
	
	public String toString() {
		String result = "[";
		for (int i=0; i<listSize; i++) {
			result += array[i] + " ";
		}
		result += "]";
		return result;
	}
}
