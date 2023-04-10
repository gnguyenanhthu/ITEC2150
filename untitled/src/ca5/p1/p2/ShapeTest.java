package ca5.p1.p2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class ShapeTest {

    public static void main(String[] args) {
        Circle circle = new Circle("red",10);
        System.out.println(circle);
        System.out.println("Area" + circle.area());
        System.out.println("Perimeter" + circle.perimeter());
        System.out.println();

        Rectangle rectangle = new Rectangle("green",20,10);
        System.out.println(rectangle);
        System.out.println("Area" + rectangle.area());
        System.out.println("Perimeter" + rectangle.perimeter());
        System.out.println();

        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(rectangle);

        Random rand = new Random( 2150);

        shapes.add(new Circle("red", rand.nextInt(20) + 1));
        shapes.add(new Circle("green", rand.nextInt(20) + 1));
        shapes.add(new Circle("blue", rand.nextInt(20) + 1));

        shapes.add(new Rectangle("red", rand.nextInt(60) +1, rand.nextInt(30) + 1));
        shapes.add(new Rectangle("green", rand.nextInt(60) +1, rand.nextInt(30) + 1));
        shapes.add(new Rectangle("blue", rand.nextInt(60) +1, rand.nextInt(30) + 1));

        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println("Area:" + shapes.get(0).area());
            System.out.println("Perimeter:" + shapes.get(0).perimeter());
            System.out.println();
        }

        Shape maxAreaShape2 = Shape.maxAreaShape2 (shapes);
        System.out.println(maxAreaShape2);
        System.out.println(maxAreaShape2.area());
        System.out.println();

        Collections.sort(shapes);
        System.out.println(shapes);


    }
}

