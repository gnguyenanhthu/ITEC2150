package ca6.p2;

import ca5.p1.p2.Shape;

public class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        if (radius < 0) {
            String msg = String.format("Invalid input %.0f: radius cannot be negative", radius);
            throw new IllegalArgumentException(msg);
        }
        this.radius = radius;
    }

    public double getRAdius() {
        return radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
