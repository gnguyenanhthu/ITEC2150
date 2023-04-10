package ch6demo1_beforeGeneric;

//Since JDK 1.5 - this example shows how the generic types can be used.
import java.util.ArrayList;
public class ArrayListNow
{
  public static void main(String[] args)
  {
      ArrayList<Integer> list = new ArrayList<>();  // <-- ArrayList with generic
      list.add(67);
      list.add(56);
      list.add("hello");
      
      int sum = 0;
      for(int i: list){
          sum += i;
      }
      System.out.println(sum);
  }
}