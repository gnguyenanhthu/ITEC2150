package finalReview2_Q2;

/*
 * class: IllegalLevelException. 
 * 
 * The message when such an exception happens is "Level can only be 1 or 2."
 *
 */
public class IllegalLevelException extends Exception{
	public IllegalLevelException() {
		super("Level can only be 1 or 2.\n");
	}
}

