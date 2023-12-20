public class Point {

    private int x;
    private int y;
//zxc zxc.setX(4) zxc.x = 4
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Point(int x, int y) {
        setX(x);
        setY(y);
    }


    public int getx() {
        return x;
    }
    public int gety() {
        return y;
    }
    public double distanceTo(Point a, Point b) {
        return Math.sqrt(Math.pow(b.getx() - a.getx(), 2) + Math.pow(b.gety() - a.gety(), 2));
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
