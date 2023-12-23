package models;

import java.util.ArrayList;

public class Shape {
    private ArrayList<Point> pointsList;
    public Shape(){
        pointsList = new ArrayList<>();
    } //shape consists of points, we do not need anything else
    public void addPoints(Point a) {
        this.pointsList.add(a);
    }//adding points, which shape consists of

    public double calculatePerimeter() {
        double perimeter = 0;
        for (int i = 0; i < pointsList.size() - 1; i++) {
            perimeter += pointsList.get(i).distanceTo(pointsList.get(i + 1));
        }

        return perimeter + pointsList.getLast().distanceTo(pointsList.getFirst());
    } //counts distances(if your shape is defined by 3 points, then 1st to 2nd point, 2nd to 3rd, 3rd to 1st )

    public double getLongestSide() {
        double max = 0;
        for (int i = 0; i < pointsList.size() - 1; i++) {
            if (pointsList.get(i).distanceTo(pointsList.get(i + 1)) > max)
                max = pointsList.get(i).distanceTo(pointsList.get(i + 1));
        }
        if(max < pointsList.getLast().distanceTo(pointsList.getFirst()))
            max = pointsList.getLast().distanceTo(pointsList.getFirst());
        return max;
    } //compares every side with each other

    public double getAverageSide() {
        return this.calculatePerimeter() / pointsList.size();
    } // gets avg side (P / n, where n is number of points)

    @Override
    public String toString() {
        return "Shape with points: " + pointsList;
    } // info about every point in shape

    public void getInfo() {
        System.out.println("\n its perimeter equals to " + calculatePerimeter() +
                "\n its average side is " + getAverageSide() +
                "\n its longest side is " + getLongestSide());

    } //just prints perimeter, avg and longest sides

}