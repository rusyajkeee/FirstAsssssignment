package models;

import java.util.ArrayList;

public class Shape {
    private final ArrayList<Point> pointsList = new ArrayList<>();
    public void addPoints(Point a) {
        this.pointsList.add(a);
    }

    public double calculatePerimeter(ArrayList<Point> pointsList) {
        double perimeter = 0;
        for (int i = 0; i < pointsList.size() - 1; i++) {
            perimeter += pointsList.get(i).distanceTo(pointsList.get(i + 1));
        }

        return perimeter + pointsList.getLast().distanceTo(pointsList.getFirst());
    }

    public double getLongestSide(ArrayList<Point> pointsList) {
        double max = 0;
        for (int i = 0; i < pointsList.size() - 1; i++) {
            if (pointsList.get(i).distanceTo(pointsList.get(i + 1)) > max)
                max = pointsList.get(i).distanceTo(pointsList.get(i + 1));
        }
        return max;
    }

    public double getAverageSide(ArrayList<Point> pointsList) {
        return this.calculatePerimeter(pointsList) / pointsList.size();
    }

    @Override
    public String toString() {
        return "Shape with points^ " + pointsList;
    }

    public void getInfo() {
        System.out.println(toString());
        System.out.println("\n its perimeter equals to " + calculatePerimeter(pointsList) +
                "\n its average side is " + getAverageSide(pointsList) +
                "\n its longest side is " + getLongestSide(pointsList));

    }

}