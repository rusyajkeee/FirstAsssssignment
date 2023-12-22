import models.Point;
import models.Shape;

import java.util.Scanner;

public class MyApplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number of your points: ");
        int n = sc.nextInt();
        Point[] points = new Point[n];

        double x;
        double y;

        for(int i = 0; i < n; i++) {
            System.out.println("Input x and y of your point №" + (i + 1) + "(with whitespaces)");
            x = sc.nextDouble();
            y = sc.nextDouble();
            points[i] = new Point(x, y);
        }

        Shape shape = new Shape(points);
        System.out.print("Your shape consists of points: ");
        for (int i = 0; i < n; i++) {
            System.out.print(points[i].toString() + " ");
        }
        shape.getInfo();

    }
}