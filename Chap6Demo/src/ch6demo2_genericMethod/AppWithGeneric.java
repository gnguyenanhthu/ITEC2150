package ch6demo2_genericMethod;

/**
 * Class: GenericMethodDemo
 */
public class AppWithGeneric
{
    public static void main(String[] args)
    {
        // create arrays of Integer, Double, Character, and String
        Integer[] integerArray = {1, 2, 3, 4};
        Double[] doubleArray = {2.1, 22.2, 31.65, 10.5};
        Character[] characterArray = {'G', 'E', 'N', 'E', 'R','I','C','S'};
        String[] stringArray =  {"Lawrenceville", "Duluth", "Chicago", "New York", "Atlanta"} ;

        System.out.println("Array integerArray contains:");
        print(integerArray); // pass an Integer array
        System.out.println("Array doubleArray contains:");
        print(doubleArray); // pass a Double array
        System.out.println("Array characterrArray contains:");
        print(characterArray); // pass a Character array
        System.out.println("Array stringArray contains:");
        print(stringArray); // pass a Character array
    }

    public static <E> void print(E[] arr)
    {
        //  System.out.println(Arrays.toString(list));
        for(E element: arr)
        {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}