package ch2b_2_inheritanceAndOverriding;

/**
 * Class: Main
 */
public class Main {
    public static void main(String[] args) {
        ClassA a = new ClassA(5);
        System.out.println("a = " + a);
        ClassB b = new ClassB(10, 20);
        System.out.println("b = " + b);
    }
}
