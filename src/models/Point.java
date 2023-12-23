package models;

public class Point {

    private double x;
    private double y;

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    //setters
    public Point(double x, double y) {
        setX(x);
        setY(y);
    } //constructor for every point.
    // no need to make other constructors, because there is no point without x or y.
    // we are not in 3dim plane, so just ignoring z coordinate


    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    //getters
    public double distanceTo(Point b) {
        return Math.sqrt(Math.pow(b.getX() - this.getX(), 2) + Math.pow(b.getY() - this.getY(), 2));
    } //counts distance from Point a to Point b: sqrt((bx - ax)^2 + (by - ay)^2))

    @Override
    public String toString() {
        return "(" +
                "x=" + x +
                ", y=" + y +
                ')';
    } //just prints info about a point
}
