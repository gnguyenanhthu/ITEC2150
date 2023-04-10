package ca6.p2;
import java.util.ArrayList;
import java.util.Random;
public class CircleTest {
    public static void main(String[] args) {
        ArrayList<Integer> radii = new ArrayList<>();
        ArrayList<Circle> circles = new ArrayList<>();
        Random rand = new Random (2150);
        for (int i = 0; i < 10; i++) {
            int radius = rand.nextInt(20) - 10;
            radii.add(radius);
        }
        System.out.println(radii);
        for (int radius : radii) {
            try {
                Circle circle = new Circle ("green",radius);
            }
            catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        }

        System.out.println(circles);
        System.out.println(circles.size());
    }
}
