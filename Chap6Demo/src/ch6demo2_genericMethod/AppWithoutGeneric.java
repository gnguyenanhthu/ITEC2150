package ch6demo2_genericMethod;

/**
 * Class: NonGenericMethodDemo
 */
public class AppWithoutGeneric
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

    /**
     * method print to print Integer array
     * @param arr
     */
    public static void print(Integer[] arr)
    {
        // display array elements
        for (Integer element : arr)
            System.out.print(element + " ");

        System.out.println();
    }

    /**
     * method print to print Double array
     * @param arr
     */
    public static void print(Double[] arr)
    {
        // display array elements
        for (Double element : arr)
            System.out.print(element + " ");

        System.out.println();
    }

    /**
     * method print to print Character array
     * @param arr
     */
    public static void print(Character[] arr)
    {
        // display array elements
        for (Character element : arr)
            System.out.print(element + " ");

        System.out.println();
    }

    /**
     * method print to print String array
     * @param arr
     */
    public static void print(String[] arr)
    {
        for(String element: arr){
            System.out.print(element + " ");
        }
    }
}