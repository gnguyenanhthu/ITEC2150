package finalReview2_Q1;

/**
 * Custom Exception: IllegalHoursException
 * 
 * The message when such an exception happens is the custom message passed into the constructor.
 * 
 * @author wjin@ggc.edu
 */
public class IllegalHoursException extends Exception {
	public IllegalHoursException(int level, int maxHours) {
		super("A level-" + level + " employee can only work a maximum of " + maxHours + " hours");
	}
}

