package Chapter1Demo;

public class SimpleIntArrayListTester{
	public static void main(String[] args){
		SimpleIntArrayList list = new SimpleIntArrayList(3);
		list.add(5);
		list.add(10);
		System.out.println(list);
		
		int size = list.size();
		int sum = 0;
		for (int i=0; i<size; i++) {
			int n = list.get(i);
			sum += n;
		}
		System.out.println("total area: " + sum);
		
	}
}