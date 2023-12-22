package models;

public class Point {

    private double x;
    private double y;
//zxc zxc.setX(4) zxc.x = 4
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Point(double x, double y) {
        setX(x);
        setY(y);
    }


    public double getx() {
        return x;
    }
    public double gety() {
        return y;
    }
    public double distanceTo(Point a, Point b) {
        return Math.sqrt(Math.pow(b.getx() - a.getx(), 2) + Math.pow(b.gety() - a.gety(), 2));
    }

    @Override
    public String toString() {
        return "{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
