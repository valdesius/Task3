package valdes.inc.com.company;

import java.util.Scanner;

import static valdes.inc.com.company.Picture.getColor;

public class Main {

    public static void main(String[] args) {

        Point p1 = new Point(-6, -6);
        System.out.println("(" + p1.x + ", " + p1.y + ") -->" + getColor(p1.x, p1.y));

        Point p2 = new Point(-6, 0);
        System.out.println("(" + p2.x + ", " + p2.y + ") -->" + getColor(p2.x, p2.y));

        Point p3 = new Point(0, 0);
        System.out.println("(" + p3.x + ", " + p3.y + ") -->" + getColor(p3.x, p3.y));

        Point p4 = new Point(0, 8);
        System.out.println("(" + p4.x + ", " + p4.y + ") -->" + getColor(p4.x, p4.y));

        Point p5 = new Point(-1, 4);
        System.out.println("(" + p5.x + ", " + p5.y + ") -->" + getColor(p5.x, p5.y));

        Point p6 = new Point(4, 0);
        System.out.println("(" + p6.x + ", " + p6.y + ") -->" + getColor(p6.x, p6.y));

        Point p7 = new Point(readDouble("x"), readDouble("y"));
        System.out.println("(" + p7.x + ", " + p7.y + ") -->" + getColor(p7.x, p7.y));

    }
    public static void printColorForPoint(double x, double y) {
        System.out.printf("(%.2f, %.2f) -> ", x, y);
        System.out.println(getColor(x, y));
    }

    public static double readDouble(String name) {
        Scanner in = new Scanner(System.in);
        System.out.printf("input %s = ", name);
        return in.nextDouble();
    }

}