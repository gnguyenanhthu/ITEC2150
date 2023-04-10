package ch6demo3_GenericClass;

public class Ex2UsingGeneric
{
    public static void main(String[] args)
    {
        Ex2Container<Double> obj = new Ex2Container<>();
        //obj.setObj((Double)23); //store an int which is autoboxed to an Integer object
        //obj.setObj("Java");//then store a string
        obj.setObj(45.98);//then store an double which is autoboxed to a Double object - current value

        Double doubleValue = obj.getObj(); 
        System.out.println("doubleValue: " + doubleValue);
    }
}