package ca6.p1;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Division {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the dividend and divisor: ");

        boolean readInput = true;

        do {
            try {
                int x = input.nextInt();
                System.out.println("x = " + x);
                int y = input.nextInt();
                System.out.println("y = " + y);
                int z = divide(x,y);
                System.out.printf("%d / %d = %d\n\n", x, y, z);
                readInput = false;
            }
            catch (ArithmeticException ex) {
                System.out.println(ex.getMessage());
                System.out.print("Please enter the dividend and divisor again:");
            }
            catch (InputMismatchException ex) {
                System.out.println("Input must be integers");
                // input.nextLine();
                System.out.print("Please enter the dividend and divisor again: ");
            }
        } while (readInput);



        System.out.println("Execution continues...");
    }

    public static int divide (int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Invalid input: divisor cannot be zero");
        }

        return dividend / divisor;
    }
}
