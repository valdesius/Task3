package valdes.inc.com.company;

import java.util.Scanner;

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

    public static double readDouble(String name) {
        Scanner in = new Scanner(System.in);
        System.out.printf("input %s = ", name);
        return in.nextDouble();
    }


    public static final Line L1 = new Line(-5, 0, 2);
    public static final Parabola P1 = new Parabola(-6, -5, -1.0 / 4);
    public static final Parabola P2 = new Parabola(-2, 1, 1);
    public static final HorizontalParabola HP1 = new HorizontalParabola(3, -1, 1.0 / 8);

    public static SimpleColor getColor(double x, double y) {

        return SimpleColor.WHITE;
    }


}

