import models.Point;
import models.Shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\xd\\IdeaProjects\\AssssignmentOne\\src\\source.txt");

        Scanner sc = new Scanner(file);

        Shape shape = new Shape();


                while (sc.hasNext()) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            Point point = new Point(x, y);
            shape.addPoints(point);
        }
        System.out.println(shape.toString());
        shape.getInfo();

    }
}