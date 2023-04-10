package FinalReview3_Q1_GenericClass_Solution;

/**
 * 
 * @author Dr. Wei Jin (wjin@ggc.edu)
 * 
 * Class: Main
 *
 */
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
    	Scanner input = new Scanner(System.in);
    	
    	Book[] books = new Book[4];
    	books[0] = new Book("Pride and Prejudice", 1813, "Jane Austen");
    	books[1] = new Book("The Old Man and the Sea", 1952, "Ernest Hemingway");
    	books[2] = new Book("Maid: Hard Work, Low Pay, and a Mother's Will to Survive", 2019, "Stephanie Land");
    	System.out.println("Enter the info for your favorite book by a female author.");
    	System.out.println("Enter title of the book, year of publication, and author name:");
    	books[3] = new Book(input.nextLine(), Integer.parseInt(input.nextLine()), input.nextLine());
    	
    	ConferenceProceeding[] proceedings = new ConferenceProceeding[3];
    	proceedings[0] = new ConferenceProceeding("SIGCSE 2021", 2021, "ACM");
    	proceedings[1] = new ConferenceProceeding("IEEE ICC 2019", 2019, "IEEE");
    	proceedings[2] = new ConferenceProceeding("SIGITE 2021", 2021, "ACM");
    	
    	Collection<Book> collection1 = new Collection<>("Female author");
    	Collection<ConferenceProceeding> collection2 = new Collection<>("ACM");
    	
    	collection1.add(books[0]);
    	collection1.add(books[2]);
    	collection1.add(books[3]);
    	//collection1.add(proceedings[0]); //TODO: You should see a compile error this line. Comment it out.
    	collection1.print();
    	
    	//collection2.add(books[1]); //TODO: You should see a compile error this line. Comment it out.
    	collection2.add(proceedings[0]);
    	collection2.add(proceedings[2]);
    	collection2.print();
    }
}
