public class Shape {
    Point[] points;

    public void setPoints(Point[] points) {
        this.points = points;
    }

    public Shape(Point[] setofpoints){
        setPoints(setofpoints);
    }

    public double calculatePerimeter() {
        double perimeter = 0;
        for (int i = 0; i < points.length - 1; i++) {
            perimeter += Math.abs(points[i].distanceTo(points[i], points[i + 1]));
        }
        perimeter += Math.abs(points[0].distanceTo(points[0], points[points.length - 1]));
        return perimeter;
    }

    public double getLongestSide() {
        double max = 0;
        for (int i = 0; i < points.length - 1; i++) {
             if( Math.abs(points[i].distanceTo(points[i], points[i + 1])) > max)
                 max = Math.abs(points[i].distanceTo(points[i], points[i + 1]));
        }
        return max;
    }

    public double getAverageSide() {
        return this.calculatePerimeter() / this.points.length;
    }
}
