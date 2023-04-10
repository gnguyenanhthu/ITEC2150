package ca5.p1.p2;
import java.util.ArrayList;

public abstract class Shape implements Comparable<Shape> {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public double getArea() {
        return 0.0;
    }
    public double getPerimeter() {
        return 0.0;
    }
    public String getColor() {
        return color;
    }

    public abstract double area();

    public abstract double perimeter();


    @Override
    public int compareTo(Shape o) {
        double diff = this.area() - o.area();
        if (diff < 0) {
            return -1;
        } else if (diff > 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static Shape maxAreaShape(ArrayList<Shape> shapes) {
        Shape maxAreaShape = null;
        double maxArea = 0;

        for (Shape shape : shapes) {
            double area = shape.area();
            if (area > maxArea) {
                maxArea = area;
                maxAreaShape = shape;
            }
        }
        return maxAreaShape;

    }


    public static Shape maxAreaShape2(ArrayList<Shape> shapes) {
        Shape maxAreaShape = new Circle("red", 0);
        for (Shape shape : shapes) {
            if (shape.compareTo(maxAreaShape) > 0) {
                maxAreaShape = shape;
            }
        }
        return maxAreaShape;

}}
