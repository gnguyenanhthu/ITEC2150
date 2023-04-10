package FinalReview3_Q1_GenericClass;

import java.util.ArrayList;

//TODO: implement this class
//(1) Each Collection ojbect contains a name and an ArrayList of publications
//that are the same type (a subclass of Publication)
//(2) Please add a constructor that takes the name as the parameter. In the constructor
//please create an empty ArrayList.
//(2) Define the add method that add one publication to the collection.
//(3) Define the print method that print all each publication in the collection one by one.
public class Collection<E extends Publication>{
	private String name;
	private ArrayList<E> list;
	
	public Collection(String name) {
		this.name = name;
		this.list = new ArrayList<E>();
	}
	
	public void add(E e) {
		this.list.add(e);
	}
	
	public void print() {
		System.out.println("The collection " + this.name + " contains:");
		for (E e: this.list) {
			System.out.print(e);
		}
		System.out.println();
	}
}