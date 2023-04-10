package ch2b_3_PointExample_Mimir;

/**
 * Class: Point
 */
public class Point {
    //objects represent lattice points in the cartesian plane
    //object are immutable

    private double x, y; // the point's coordinates

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public boolean equals(Point p) {
        return (x == p.x && y == p.y);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;

    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}


