import java.util.Scanner;

public class MyApplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number of your points: ");
        int n = sc.nextInt();
        Point[] points = new Point[n];

        int x;
        int y;
        for(int i = 0; i < n; i++) {
            System.out.println("Input x of your point №" + (i + 1));
            x = sc.nextInt();
            System.out.println("Input y of your point №" + (i + 1));
            y = sc.nextInt();
            points[i] = new Point(x, y);
        }

        Shape xd = new Shape(points);
        System.out.println("Perimeter of your shape is: " + xd.perimeter());
        System.out.println("Average side of your shape is: " + xd.averageside());
        System.out.println("Longest side of your shape is: " + xd.longestside());
    }
}