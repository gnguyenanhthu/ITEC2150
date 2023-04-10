package ca7;
import java.util.ArrayList;
import java.util.Random;

public class Ca7Test {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        Random rand = new Random(2150);
        for (int i = 0; i < 10; i++){
            intList.add(rand.nextInt(10));
        }
        System.out.println("intList: " + intList);
        int intTarget = 8;
        System.out.println("target: " + intTarget);
        System.out.println("indices: " + MyGenerics.findIndices(intList, intTarget));
        System.out.println("first index: " + MyGenerics.firstIndex(intList, intTarget));
        System.out.println("last index: " + MyGenerics.lastIndex(intList, intTarget));
        System.out.println("contains: " + MyGenerics.lastIndex(intList, intTarget));


        int intTarget2 = 0;
        System.out.println("target: " + intTarget2);
        System.out.println("indices: " + MyGenerics.findIndices(intList, intTarget2));
        System.out.println("first index: " + MyGenerics.firstIndex(intList, intTarget2));
        System.out.println("last index: " + MyGenerics.lastIndex(intList, intTarget2));
        System.out.println("contains: " + MyGenerics.lastIndex(intList, intTarget2));


        System.out.println();

        ArrayList<Circle> circles = new ArrayList<>();
        String [] colors = new String[] {"red", "green", "blue"};
        for (int i = 0; i < 10; i++) {
            String color = colors[rand.nextInt(3)];
            double radius = rand.nextInt(10) + 1;
            circles.add(new Circle(color, radius));
        }
        System.out.println("circles: " + circles);
        Circle circleTarget = new Circle("red", 10);
        System.out.println("target: " + circleTarget);
        System.out.println("indices: " + MyGenerics.findIndices(circles, circleTarget));
        System.out.println("first index: " + MyGenerics.firstIndex(circles, circleTarget));
        System.out.println("last index: " + MyGenerics.firstIndex(circles, circleTarget));
        System.out.println("contains: " + MyGenerics.lastIndex(circles, circleTarget));

    }
}
