package finalReview2_ExceptionHanding_Step2_CustomException;
/**
 * Custom Exception for Chapter 4
 * @author wjin@ggc.edu
 */
public class IllegalUnitSizeException extends Exception
{
    public IllegalUnitSizeException()
    {
    	super("Unit size cannot be zero or 1.");
    }
}
