package finalReview2_ExceptionHanding_Step1;
/**
 * @author wjin@ggc.edu
 *
 */
public class BaggingCalculator
{
	private int total;
	private int unit;

	public BaggingCalculator(int total, int unit)
	{
 		this.total = total;
		this.unit = unit;
	}
	
	public int getBags()
	{
		return total/unit;
	}

	public int getLeftover()
	{
		return total%unit;
	}
}
