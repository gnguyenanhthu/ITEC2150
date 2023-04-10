public class ArraySum 
{
    public static void main(String[] args) 
    {
      int[] nums = {10, 20, 30};
      System.out.println("sum: " + getArraySum(nums, 0));
    }
       
    //TODO: use recursion to get the sum of all array elements from index start
    public static int getArraySum(int[] list, int start)
    {
        if (start == list.length - 1)
        	return list[start];
        else {
        	return list[start] + getArraySum(list,start+1);
        }
    }
}