package ca6.p1;
import java.sql.SQLOutput;
public class ExceptionDemo1 {

    public static void main(String[] args) {
        int x = 3;
        int y = 0;

        try {
            int z = x / y;
            System.out.printf("%d / %d = %d\n\n", x, y, z);
        }
        catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }


        System.out.println("Execution continues...");
    }
}
