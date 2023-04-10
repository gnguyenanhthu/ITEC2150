package ch6demo3_GenericClass;
/**
 * Class: ContainerWithoutGenerics
 */

import java.util.ArrayList;
import java.util.List;

public class Ex1NoGeneric
{
    public static void main(String[] args)
    {
        Ex1Container obj = new Ex1Container();
        obj.setObj(23); //store an int which is autoboxed to an Integer object
        obj.setObj("Java");//then store a string
        obj.setObj(45.98);//then store an double which is autoboxed to a Double object - current value

        Double doubleValue = obj.getObj(); 
        System.out.println("doubleValue: " + doubleValue);
    }
}