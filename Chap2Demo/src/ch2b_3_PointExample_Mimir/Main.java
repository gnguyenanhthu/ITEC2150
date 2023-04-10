package ch2b_3_PointExample_Mimir;

/**
 * Class: Main
 */
public class Main {
    public static void main(String[] args) {
        NamedPoint p = new NamedPoint(1,2, "Orig");
        System.out.println("p: " + p);

        System.out.printf("%s's x:%.2f\n", p.getName(), p.getX()); //getX() method is inherited from the Point superclass.

        NamedPoint q = new NamedPoint(3,10, "Dest");
        System.out.println("q: " + q);

        System.out.println("q.equals(p): " + q.equals(p));
        //q is able to invoke the equals() method that it inherited from the superclass.
    }
}