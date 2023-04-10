package ch6demo1_beforeGeneric;
/**
 * Class: Main
 */
//before JDK 1.5
import java.util.ArrayList;

public class ArrayListBeforeJDK1_5
{
    public static void main(String[] args)
    {
        ArrayList list = new ArrayList(); //<--  ArrayList without generic called raw type
        // ArrayList (java.util.ArrayList) has the Object as the type for each data item
        list.add(67);  //67 is converted to Integer(67) before adding to the array list
        list.add(56);
        list.add(4);
        list.add("Straweberry");
        list.add(52);
        printSum(list);
    }

    private static void printSum(ArrayList n)
    {
        Integer sum = 0;
        for(Object i: n)
        {  
            sum += i; //You need to type cast these to each particular data type everytime
            //"Strawberry" is incur a run-time exception at the type cast.
        }
        System.out.println(sum);
    }
}