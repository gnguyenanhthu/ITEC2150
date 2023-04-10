package finalReview2_ExceptionHanding_Step2_CustomException;
/**
 * @author wjin@ggc.edu
 *
 */
public class BaggingCalculator
{
	private int total;
	private int unitSize;

	public BaggingCalculator(int total, int unitSize) throws IllegalUnitSizeException
	{
		if (unitSize == 0  || unitSize == 1) {
			throw new IllegalUnitSizeException();
		}
		
		this.total = total;
		this.unitSize = unitSize;
		 
	}
	
	public int getBags()  
	{
		return total / unitSize;
	}

	public int getLeftover() 
	{	
		return total % unitSize;
	}
}
