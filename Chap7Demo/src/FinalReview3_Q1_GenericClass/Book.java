package FinalReview3_Q1_GenericClass;

/**
 * 
 * @author Dr. Wei Jin (wjin@ggc.edu)
 * 
 * Class: Book
 *
 */
public class Book extends Publication
{
    private String author;

    public Book(String title, int year, String author)
    {
        super(title, year);
        this.author = author;
    }

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [author=" + author + "] " + super.toString();
	}
}
