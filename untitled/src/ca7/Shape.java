package ca7;
import java.util.ArrayList;

public abstract class Shape {
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

    }}



